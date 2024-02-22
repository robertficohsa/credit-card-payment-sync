/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.task;

import com.ficohsa.credit.card.payment.sync.model.CreditCardPaymentSyncModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 * @author jospina
 */
@Component("syncTaskHN")
public class CreditCardPaymentSyncTaskHN {
    
    static final Logger logger = Logger.getLogger(CreditCardPaymentSyncTaskHN.class);

    @Autowired
    private CreditCardPaymentSyncModel creditCardPaymentSyncModel;
    
    @Async
    public void runHN() {
        logger.info("Inicio Tarea HN");
        creditCardPaymentSyncModel.creditCardPaymentSync("HN");
        logger.info("Fin Tarea HN");
    }
}