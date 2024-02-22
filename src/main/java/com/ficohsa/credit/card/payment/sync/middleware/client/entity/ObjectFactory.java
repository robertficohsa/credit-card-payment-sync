//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.13 a las 05:03:35 PM COT 
//


package com.ficohsa.credit.card.payment.sync.middleware.client.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ficohsa.credit.card.payment.sync.middleware.client.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OnlinePaymentRequest_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlinePaymentRequest");
    private final static QName _OnlinePaymentResponse_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlinePaymentResponse");
    private final static QName _OnlineInformationRequest_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlineInformationRequest");
    private final static QName _OnlineInformationResponse_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlineInformationResponse");
    private final static QName _OnlineUpdateCardRequest_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlineUpdateCardRequest");
    private final static QName _OnlineUpdateCardResponse_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlineUpdateCardResponse");
    private final static QName _OnlineInstallmentsRequest_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlineInstallmentsRequest");
    private final static QName _OnlineInstallmentsResponse_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlineInstallmentsResponse");
    private final static QName _OnlinePaymentV4Request_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlinePaymentV4Request");
    private final static QName _OnlinePaymentV4Response_QNAME = new QName("http://www.procesa.com/fdcs/ot", "OnlinePaymentV4Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ficohsa.credit.card.payment.sync.middleware.client.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TOnlinePaymentRequest }
     * 
     */
    public TOnlinePaymentRequest createTOnlinePaymentRequest() {
        return new TOnlinePaymentRequest();
    }

    /**
     * Create an instance of {@link TOnlinePaymentResponse }
     * 
     */
    public TOnlinePaymentResponse createTOnlinePaymentResponse() {
        return new TOnlinePaymentResponse();
    }

    /**
     * Create an instance of {@link TOnlineInformationRequest }
     * 
     */
    public TOnlineInformationRequest createTOnlineInformationRequest() {
        return new TOnlineInformationRequest();
    }

    /**
     * Create an instance of {@link TOnlineInformationResponse }
     * 
     */
    public TOnlineInformationResponse createTOnlineInformationResponse() {
        return new TOnlineInformationResponse();
    }

    /**
     * Create an instance of {@link TOnlineUpdateCardRequest }
     * 
     */
    public TOnlineUpdateCardRequest createTOnlineUpdateCardRequest() {
        return new TOnlineUpdateCardRequest();
    }

    /**
     * Create an instance of {@link TOnlineUpdateCardResponse }
     * 
     */
    public TOnlineUpdateCardResponse createTOnlineUpdateCardResponse() {
        return new TOnlineUpdateCardResponse();
    }

    /**
     * Create an instance of {@link TOnlineInstallmentsRequest }
     * 
     */
    public TOnlineInstallmentsRequest createTOnlineInstallmentsRequest() {
        return new TOnlineInstallmentsRequest();
    }

    /**
     * Create an instance of {@link TOnlineInstallmentsResponse }
     * 
     */
    public TOnlineInstallmentsResponse createTOnlineInstallmentsResponse() {
        return new TOnlineInstallmentsResponse();
    }

    /**
     * Create an instance of {@link TOnlinePaymentV4Request }
     * 
     */
    public OnlinePaymentV4Request createTOnlinePaymentV4Request() {
        return new OnlinePaymentV4Request();
    }

    /**
     * Create an instance of {@link TOnlinePaymentV4Response }
     * 
     */
    public TOnlinePaymentV4Response createTOnlinePaymentV4Response() {
        return new TOnlinePaymentV4Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlinePaymentRequest")
    public JAXBElement<TOnlinePaymentRequest> createOnlinePaymentRequest(TOnlinePaymentRequest value) {
        return new JAXBElement<TOnlinePaymentRequest>(_OnlinePaymentRequest_QNAME, TOnlinePaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlinePaymentResponse")
    public JAXBElement<TOnlinePaymentResponse> createOnlinePaymentResponse(TOnlinePaymentResponse value) {
        return new JAXBElement<TOnlinePaymentResponse>(_OnlinePaymentResponse_QNAME, TOnlinePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlineInformationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlineInformationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlineInformationRequest")
    public JAXBElement<TOnlineInformationRequest> createOnlineInformationRequest(TOnlineInformationRequest value) {
        return new JAXBElement<TOnlineInformationRequest>(_OnlineInformationRequest_QNAME, TOnlineInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlineInformationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlineInformationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlineInformationResponse")
    public JAXBElement<TOnlineInformationResponse> createOnlineInformationResponse(TOnlineInformationResponse value) {
        return new JAXBElement<TOnlineInformationResponse>(_OnlineInformationResponse_QNAME, TOnlineInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlineUpdateCardRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlineUpdateCardRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlineUpdateCardRequest")
    public JAXBElement<TOnlineUpdateCardRequest> createOnlineUpdateCardRequest(TOnlineUpdateCardRequest value) {
        return new JAXBElement<TOnlineUpdateCardRequest>(_OnlineUpdateCardRequest_QNAME, TOnlineUpdateCardRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlineUpdateCardResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlineUpdateCardResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlineUpdateCardResponse")
    public JAXBElement<TOnlineUpdateCardResponse> createOnlineUpdateCardResponse(TOnlineUpdateCardResponse value) {
        return new JAXBElement<TOnlineUpdateCardResponse>(_OnlineUpdateCardResponse_QNAME, TOnlineUpdateCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlineInstallmentsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlineInstallmentsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlineInstallmentsRequest")
    public JAXBElement<TOnlineInstallmentsRequest> createOnlineInstallmentsRequest(TOnlineInstallmentsRequest value) {
        return new JAXBElement<TOnlineInstallmentsRequest>(_OnlineInstallmentsRequest_QNAME, TOnlineInstallmentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlineInstallmentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlineInstallmentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlineInstallmentsResponse")
    public JAXBElement<TOnlineInstallmentsResponse> createOnlineInstallmentsResponse(TOnlineInstallmentsResponse value) {
        return new JAXBElement<TOnlineInstallmentsResponse>(_OnlineInstallmentsResponse_QNAME, TOnlineInstallmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentV4Request }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentV4Request }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlinePaymentV4Request")
    public JAXBElement<OnlinePaymentV4Request> createOnlinePaymentV4Request(OnlinePaymentV4Request value) {
        return new JAXBElement<OnlinePaymentV4Request>(_OnlinePaymentV4Request_QNAME, OnlinePaymentV4Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentV4Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOnlinePaymentV4Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.procesa.com/fdcs/ot", name = "OnlinePaymentV4Response")
    public JAXBElement<TOnlinePaymentV4Response> createOnlinePaymentV4Response(TOnlinePaymentV4Response value) {
        return new JAXBElement<TOnlinePaymentV4Response>(_OnlinePaymentV4Response_QNAME, TOnlinePaymentV4Response.class, null, value);
    }

}
