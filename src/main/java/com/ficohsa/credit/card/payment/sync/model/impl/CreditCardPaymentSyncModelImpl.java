/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.model.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ficohsa.credit.card.payment.sync.dao.CreditCardPaymentSyncDAO;
import com.ficohsa.credit.card.payment.sync.entity.CreditCardPayment;
import com.ficohsa.credit.card.payment.sync.entity.OnlinePaymentResponse;
import com.ficohsa.credit.card.payment.sync.middleware.client.MiddlewareWSClient;
import com.ficohsa.credit.card.payment.sync.middleware.client.entity.TOnlinePaymentV4Response;
import com.ficohsa.credit.card.payment.sync.model.CreditCardPaymentSyncModel;

/**
 *
 * @author jospina
 */
@Service
public class CreditCardPaymentSyncModelImpl implements CreditCardPaymentSyncModel {

	private static final String DB_SUCCESS = "SUCCESS";

	private static Logger logger = Logger.getLogger(CreditCardPaymentSyncModelImpl.class);

	@Autowired
	private CreditCardPaymentSyncDAO dao;

	@Autowired
	private MiddlewareWSClient middlewareWSClient;

	@Value("${task.max.attemp}")
	private int MAX_ATTEMP;

	@Override
	public void creditCardPaymentSync(String sourceCountry) {
		try {
                        String controlNumber = dao.setControlNumber(sourceCountry);
			List<CreditCardPayment> paymentList = dao.getPendingPaymentList(sourceCountry, controlNumber);

			logger.info("Procesando registros " + sourceCountry +" encontrados: " + paymentList.size());

			if (paymentList != null && !paymentList.isEmpty()) {

				for (CreditCardPayment payment : paymentList) {

					OnlinePaymentResponse wsResponse = new OnlinePaymentResponse();
					wsResponse.setCreditCardPayment(payment);

					try {
                                                logger.info("Enviando pago de " + sourceCountry + " a Vision+ " + payment.getRecordId());
						TOnlinePaymentV4Response onlinePaymentV4Response = middlewareWSClient
								.sendOnlinePayment(payment);
                                                logger.info("Pago de " + sourceCountry + " aplicado en Vision+ " + payment.getRecordId());
						wsResponse.getCreditCardPayment().setAuthorizationDate(new Date());
						wsResponse.setPosUserData(onlinePaymentV4Response.getPOSUserData());
						wsResponse.setRrn37(onlinePaymentV4Response.getRRN37());
						wsResponse.setvPrespCode(onlinePaymentV4Response.getVPrespCode());
						wsResponse.setSystemAction(onlinePaymentV4Response.getSystemAction());
						wsResponse.setReasonActionCode(onlinePaymentV4Response.getReasonActionCode());
						wsResponse.setActionDescription(onlinePaymentV4Response.getActionDescription().trim());
						wsResponse.setCardValidationResult(onlinePaymentV4Response.getCardValidationResult());
						wsResponse.setAuthorizationCode(onlinePaymentV4Response.getAuthorizationCode());

					} catch (Exception ex) {
						String errorMessage = "Id de registro: "
								+ wsResponse.getCreditCardPayment().getRecordId() + " Error invocando V+: "
								+ ex.getMessage();
						wsResponse.setDescripcionResultado(errorMessage);
						logger.error(errorMessage, ex);
						logger.error(wsResponse);
					}

					wsResponse.getCreditCardPayment()
							.setAttemptNumber(wsResponse.getCreditCardPayment().getAttemptNumber() + 1);

					if (wsResponse.getCreditCardPayment().getAttemptNumber() >= MAX_ATTEMP) {
						wsResponse.getCreditCardPayment().setApplyOnLine("N");
					}

					if("000".equals(wsResponse.getvPrespCode())) {
						wsResponse.getCreditCardPayment().setApplied("S");
					} else {
						wsResponse.getCreditCardPayment().setApplied("N");
						logger.error("Transaccion no aplicada: " + wsResponse);
					}
					
					try {
						Map<String, Object> updateResult = dao.updateTransaction(wsResponse);
						String errorCode = (String) updateResult.get("Pv_ErrorCode");
						
						if (!DB_SUCCESS.equalsIgnoreCase(errorCode)) {
							String errorMessage = "Id de registro: "
									+ wsResponse.getCreditCardPayment().getRecordId()
									+ "Error Actualizando registro en BD: " + (String) updateResult.get("Pv_ErrorMessage");
							logger.error(errorMessage);
							logger.error(wsResponse);
						}
						
					} catch (Exception ex) {
						String errorMessage = "Id de registro: "
								+ wsResponse.getCreditCardPayment().getRecordId()
								+ "Error Actualizando registro en BD: " + ex.getMessage();
						logger.error(errorMessage, ex);
						logger.error(wsResponse);
					}

				}
			}
		} catch (Exception ex) {
			logger.error("Error procesando registros");
			logger.error(ex.getMessage(), ex);
		}
	}
}