/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.dao;

import java.util.List;
import java.util.Map;

import com.ficohsa.credit.card.payment.sync.entity.CreditCardPayment;
import com.ficohsa.credit.card.payment.sync.entity.OnlinePaymentResponse;

/**
 *
 * @author jospina
 */
public interface CreditCardPaymentSyncDAO {

    /**
     * Consulta registro de la tabla de transacciones a procesar
     *
     * @param controlNumber
     * @return
     * @param sourceCountry
     */
    public List<CreditCardPayment> getPendingPaymentList(String sourceCountry, String controlNumber);

    /**
     * Actualiza intentos e informacion recibida por V+ para determinado
     * registro de transaccion
     *
     * @param paymentResponse
     * @return
     */
    public Map<String, Object> updateTransaction(OnlinePaymentResponse paymentResponse);

    /**
     * 
     * @param sourceCountry
     * @return 
     */
    public String setControlNumber(String sourceCountry);
}
