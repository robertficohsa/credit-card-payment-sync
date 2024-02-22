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
 * <p>Clase Java para t_OnlineInformationRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlineInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MerchantNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_OnlineInformationRequest", propOrder = {
    "cardNumber",
    "orgId",
    "merchantNumber"
})
public class TOnlineInformationRequest {

    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "OrgId")
    protected int orgId;
    @XmlElement(name = "MerchantNumber")
    protected int merchantNumber;

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

}
