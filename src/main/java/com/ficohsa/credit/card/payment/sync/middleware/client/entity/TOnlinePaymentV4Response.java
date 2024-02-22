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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para t_OnlinePaymentV4Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlinePaymentV4Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POSUserData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RRN37" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VPrespCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SystemAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReasonActionCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ActionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardValidationResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_OnlinePaymentV4Response", propOrder = {
    "posUserData",
    "rrn37",
    "vPrespCode",
    "systemAction",
    "reasonActionCode",
    "actionDescription",
    "cardValidationResult",
    "authorizationCode"
})
@XmlRootElement
public class TOnlinePaymentV4Response {

    @XmlElement(name = "POSUserData", required = true)
    protected String posUserData;
    @XmlElement(name = "RRN37", required = true)
    protected String rrn37;
    @XmlElement(name = "VPrespCode", required = true)
    protected String vPrespCode;
    @XmlElement(name = "SystemAction", required = true)
    protected String systemAction;
    @XmlElement(name = "ReasonActionCode")
    protected int reasonActionCode;
    @XmlElement(name = "ActionDescription", required = true)
    protected String actionDescription;
    @XmlElement(name = "CardValidationResult", required = true)
    protected String cardValidationResult;
    @XmlElement(name = "AuthorizationCode", required = true)
    protected String authorizationCode;

    /**
     * Obtiene el valor de la propiedad posUserData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSUserData() {
        return posUserData;
    }

    /**
     * Define el valor de la propiedad posUserData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSUserData(String value) {
        this.posUserData = value;
    }

    /**
     * Obtiene el valor de la propiedad rrn37.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRN37() {
        return rrn37;
    }

    /**
     * Define el valor de la propiedad rrn37.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRN37(String value) {
        this.rrn37 = value;
    }

    /**
     * Obtiene el valor de la propiedad vPrespCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPrespCode() {
        return vPrespCode;
    }

    /**
     * Define el valor de la propiedad vPrespCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPrespCode(String value) {
        this.vPrespCode = value;
    }

    /**
     * Obtiene el valor de la propiedad systemAction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemAction() {
        return systemAction;
    }

    /**
     * Define el valor de la propiedad systemAction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemAction(String value) {
        this.systemAction = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonActionCode.
     * 
     */
    public int getReasonActionCode() {
        return reasonActionCode;
    }

    /**
     * Define el valor de la propiedad reasonActionCode.
     * 
     */
    public void setReasonActionCode(int value) {
        this.reasonActionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad actionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDescription() {
        return actionDescription;
    }

    /**
     * Define el valor de la propiedad actionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDescription(String value) {
        this.actionDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad cardValidationResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardValidationResult() {
        return cardValidationResult;
    }

    /**
     * Define el valor de la propiedad cardValidationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardValidationResult(String value) {
        this.cardValidationResult = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Define el valor de la propiedad authorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

}
