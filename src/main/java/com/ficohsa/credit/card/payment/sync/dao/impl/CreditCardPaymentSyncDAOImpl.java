/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.dao.impl;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.ficohsa.credit.card.payment.sync.dao.CreditCardPaymentSyncDAO;
import com.ficohsa.credit.card.payment.sync.dao.mapper.CreditCardPaymentMapper;
import com.ficohsa.credit.card.payment.sync.entity.CreditCardPayment;
import com.ficohsa.credit.card.payment.sync.entity.OnlinePaymentResponse;
import java.text.MessageFormat;

/**
 *
 * @author jospina
 */
@Repository
public class CreditCardPaymentSyncDAOImpl implements CreditCardPaymentSyncDAO {

    private static final int MAX_VARCHAR = 4000;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${SQL.queryCreditCardPayment}")
    private String SQLQUERY_CREDIT_CARD_PAYMENT_LIST;

    @Value("${SQL.procedureUpdatePayment}")
    private String PLSQL_UPDATE_PAYMENT;

    @Value("${SQL.procedureSetControlNumber}")
    private String PLSQL_SET_CONTROL_NUMBER;

    @Value("${task.max.attemp}")
    private int MAX_ATTEMP;

    @Value("${task.max.records}")
    private int MAX_RECORDS;

    private static final Logger logger = Logger.getLogger(CreditCardPaymentSyncDAOImpl.class);

    @Override
    public List<CreditCardPayment> getPendingPaymentList(String sourceCountry, String controlNumber) {
        try {

            return jdbcTemplate.query(
                    MessageFormat.format(SQLQUERY_CREDIT_CARD_PAYMENT_LIST, sourceCountry),
                    new CreditCardPaymentMapper(),
                    controlNumber
            );

        } catch (DataAccessException ex) {
            throw ex;
        }
    }

    /**
     *
     * @param paymentResponse
     * @return
     */
    @Override
    @Transactional
    public Map<String, Object> updateTransaction(OnlinePaymentResponse paymentResponse) {
        try {
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName(PLSQL_UPDATE_PAYMENT)
                    .declareParameters(new SqlOutParameter("Pv_ErrorCode", Types.VARCHAR),
                            new SqlOutParameter("Pv_ErrorMessage", Types.VARCHAR));
            SqlParameterSource params = new MapSqlParameterSource()
                    .addValue("Pn_IdRegistro", paymentResponse.getCreditCardPayment().getRecordId(), Types.BIGINT)
                    .addValue("Pv_NumeroAutorizacion", paymentResponse.getAuthorizationCode(), Types.VARCHAR)
                    .addValue("Pd_FechaEnvio", paymentResponse.getCreditCardPayment().getSendDate(), Types.DATE)
                    .addValue("Pd_FechaAutorizacion", paymentResponse.getCreditCardPayment().getAuthorizationDate(), Types.DATE)
                    .addValue("Pv_ResponseCode", paymentResponse.getvPrespCode(), Types.VARCHAR)
                    .addValue("Pn_Intentos", paymentResponse.getCreditCardPayment().getAttemptNumber(), Types.INTEGER)
                    .addValue("Pv_AplicarEnLinea", paymentResponse.getCreditCardPayment().getApplyOnLine(), Types.VARCHAR)
                    .addValue("Pv_Aplicado", paymentResponse.getCreditCardPayment().getApplied(), Types.VARCHAR)
                    .addValue("Pv_DescripcionResultado",
                            paymentResponse.getDescripcionResultado().length() > MAX_VARCHAR
                            ? paymentResponse.getDescripcionResultado().substring(0, MAX_VARCHAR - 1)
                            : paymentResponse.getDescripcionResultado(),
                            Types.VARCHAR)
                    .addValue("Pv_CodigoResultado", paymentResponse.getReasonActionCode(), Types.INTEGER)
                    .addValue("Pv_BancoOrigen", paymentResponse.getCreditCardPayment().getSourceCountry(), Types.VARCHAR)
                    .addValue("Pv_BancoDestino", paymentResponse.getCreditCardPayment().getTargetCountry(), Types.VARCHAR);

            logger.debug("Registro Actualizado: " + paymentResponse.getCreditCardPayment().getRecordId());
            return jdbcCall.execute(params);

        } catch (Exception ex) {
            logger.error(
                    "Ocurrio una excepcion al intentar ejecutar la actualziacion de los campos de la tabla TRC_PAGOS_PA: "
                    + ex.getMessage(),
                    ex);
            throw ex;
        }
    }

    /**
     *
     * @param sourceCountry
     * @return
     */
    @Override
    @Transactional
    public String setControlNumber(String sourceCountry) {
        try {
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                    .withProcedureName(PLSQL_SET_CONTROL_NUMBER)
                    .declareParameters(new SqlOutParameter("Pv_Numero_Control", Types.VARCHAR));
            SqlParameterSource params = new MapSqlParameterSource()
                    .addValue("Pv_Origen", sourceCountry, Types.VARCHAR)
                    .addValue("Pn_Intentos", MAX_ATTEMP, Types.INTEGER)
                    .addValue("Pn_Limite", MAX_RECORDS, Types.INTEGER);
            Map<String, Object> result = jdbcCall.execute(params);
            return (String) result.get("Pv_Numero_Control");
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
    }
}
