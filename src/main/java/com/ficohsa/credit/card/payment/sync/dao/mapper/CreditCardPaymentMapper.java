/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ficohsa.credit.card.payment.sync.entity.CreditCardPayment;

/**
 *
 * @author jospina
 */
public class CreditCardPaymentMapper implements RowMapper<CreditCardPayment> {

	@Override
	public CreditCardPayment mapRow(ResultSet rs, int i) throws SQLException {
		CreditCardPayment payment = new CreditCardPayment();
		payment.setSourceAgency(rs.getLong("AGENCIA_ORIGEN"));
		payment.setMerchantNumber(rs.getString("MERCHANT_NUMBER"));
		payment.setCardNumber(rs.getString("NUMERO_TARJETA"));
		payment.setOperationType(rs.getString("TIPO_OPERACION"));
		payment.setCurrencyType(rs.getInt("TIPO_MONEDA"));
		payment.setOrg(rs.getInt("ORG"));
		payment.setTransactionCurrency(rs.getString("MONEDA_TRANSACCION"));
		payment.setExchangeRate(rs.getBigDecimal("TASA_CAMBIO"));
		payment.setTransactionType(rs.getInt("TIPO_TRANSACCION"));
		payment.setUserCode(rs.getString("CODIGO_USUARIO"));
		payment.setSourceSequence(rs.getString("SECUENCIA_ORIGEN"));
		payment.setCashAmount(rs.getBigDecimal("VALOR_EFECTIVO"));
		payment.setCheckAmount(rs.getBigDecimal("VALOR_CHEQUES"));
		payment.setDocumentNumber(rs.getLong("NUMERO_DOCUMENTO"));
		payment.setAuthorizationNumber(rs.getString("NUMERO_AUTORIZACION"));
		payment.setRecoveryReference(rs.getString("REFERENCIA_RECUPERACION"));
		payment.setApplied(rs.getString("APLICADO"));
		payment.setApplyOnLine(rs.getString("APLICAR_EN_LINEA"));
		payment.setAdditionDate(rs.getDate("FECHA_ADICION"));
		payment.setValidDate(rs.getDate("FECHA_VALIDA"));
		payment.setSendDate(rs.getDate("FECHA_ENVIO"));
		payment.setFileDate(rs.getDate("FECHA_ARCHIVO"));
		payment.setAuthorizationDate(rs.getDate("FECHA_AUTORIZACION"));
		payment.setFileName(rs.getString("NOMBRE_ARCHIVO"));
		payment.setResponseCode(rs.getString("RESPONSE_CODE"));
		payment.setAttemptNumber(rs.getInt("INTENTOS"));
		payment.setCheckType(rs.getInt("TIPO_CHEQUE"));
		payment.setSourceCountry(rs.getString("PAIS_ORIGEN"));
		payment.setTargetCountry(rs.getString("PAIS_DESTINO"));
		payment.setRecordId(rs.getBigDecimal("ID_REGISTRO"));
		return payment;
	}

}