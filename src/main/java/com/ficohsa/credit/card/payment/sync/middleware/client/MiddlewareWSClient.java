/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.middleware.client;

import java.util.Date;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.ficohsa.credit.card.payment.sync.entity.CreditCardPayment;
import com.ficohsa.credit.card.payment.sync.middleware.client.entity.OnlinePaymentV4Request;
import com.ficohsa.credit.card.payment.sync.middleware.client.entity.TOnlinePaymentV4Response;
import com.ficohsa.credit.card.payment.sync.ssl.TrustAnyTrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

/**
 *
 * @author jospina
 */
@Component
public class MiddlewareWSClient {

    @Autowired
    private WebServiceTemplate webServiceTemplate;
    @Value("${middleware.visionplus.ws.timeout}")
    private int timeout;
    
    public MiddlewareWSClient() {
        try {
            SSLContext ctx = SSLContext.getInstance("TLSv1.2");
            ctx.init(null, null, new java.security.SecureRandom());
            SSLSocketFactory socketFactory = ctx.getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        } catch (KeyManagementException | NoSuchAlgorithmException ex) {

        }
    }

    public TOnlinePaymentV4Response sendOnlinePayment(CreditCardPayment payment) throws Exception {
        SSLContext sslContext = SSLContexts.createDefault();
        sslContext.init(null, new TrustManager[]{new TrustAnyTrustManager()}, new java.security.SecureRandom());
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                sslContext,
                new String[]{"TLSv1.2"},
                null,
                new NoopHostnameVerifier()
        );
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(timeout).setSocketTimeout(timeout).build();
        HttpClient httpclient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .setDefaultRequestConfig(requestConfig)
                .build();
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender(httpclient);
        webServiceTemplate.setMessageSender(messageSender);
        OnlinePaymentV4Request request = new OnlinePaymentV4Request();
        request.setPOSUserData("ATX");
        request.setRRN37(payment.getRecoveryReference());
        request.setVPrespCode("");
        request.setPaymentTypeIndicator("");
        request.setMCCType("0000");
        request.setRequestType(payment.getOperationType());
        request.setCardNumber(payment.getCardNumber());
        request.setOrgId(payment.getOrg());

        if (payment.getMerchantNumber() != null && !payment.getMerchantNumber().trim().isEmpty()) {
            request.setMerchantNumber(Integer.parseInt(payment.getMerchantNumber()));
        }

        request.setCardExpirationDate(0);
        request.setTotalSalesAmount(
                payment.getCashAmount() != null ? payment.getCashAmount() : payment.getCheckAmount());

        request.setTrack2Length(0);
        request.setTrack2Data("");
        request.setCardValidationValue(0);
        payment.setSendDate(new Date());

        JAXBElement<TOnlinePaymentV4Response> response = (JAXBElement<TOnlinePaymentV4Response>) webServiceTemplate
                .marshalSendAndReceive(request);

        return response.getValue();

    }
}
