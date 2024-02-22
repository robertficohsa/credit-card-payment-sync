//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.13 a las 05:03:35 PM COT 
//


package com.ficohsa.credit.card.payment.sync.middleware.client.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para t_OnlineUpdateCardRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlineUpdateCardRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="B"/&gt;
 *               &lt;enumeration value="M"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MerchantNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UpdateValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_OnlineUpdateCardRequest", propOrder = {
    "requestType",
    "cardNumber",
    "orgId",
    "merchantNumber",
    "updateValue"
})
public class TOnlineUpdateCardRequest {

    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "OrgId")
    protected int orgId;
    @XmlElement(name = "MerchantNumber")
    protected int merchantNumber;
    @XmlElement(name = "UpdateValue", required = true)
    protected String updateValue;

    /**
     * Obtiene el valor de la propiedad requestType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Define el valor de la propiedad requestType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define el valor de la propiedad cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     */
    public int getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     */
    public void setOrgId(int value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantNumber.
     * 
     */
    public int getMerchantNumber() {
        return merchantNumber;
    }

    /**
     * Define el valor de la propiedad merchantNumber.
     * 
     */
    public void setMerchantNumber(int value) {
        this.merchantNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad updateValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateValue() {
        return updateValue;
    }

    /**
     * Define el valor de la propiedad updateValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateValue(String value) {
        this.updateValue = value;
    }

}
