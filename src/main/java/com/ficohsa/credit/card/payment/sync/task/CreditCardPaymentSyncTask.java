/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.task;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ficohsa.credit.card.payment.sync.model.CreditCardPaymentSyncModel;
import org.springframework.scheduling.annotation.Async;

/**
 *
 * @author jospina
 */
@Component("syncTask")
public class CreditCardPaymentSyncTask {

    static final Logger logger = Logger.getLogger(CreditCardPaymentSyncTask.class);

    @Autowired
    private CreditCardPaymentSyncModel creditCardPaymentSyncModel;

    @Async
    public void runPA() {
        logger.info("Inicio Tarea PA");
        creditCardPaymentSyncModel.creditCardPaymentSync("PA");
        logger.info("Fin Tarea PA");
    }

    @Async
    public void runGT() {
        logger.info("Inicio Tarea GT");
        creditCardPaymentSyncModel.creditCardPaymentSync("GT");
        logger.info("Fin Tarea GT");
    }  
}
