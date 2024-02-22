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
 * <p>Clase Java para t_OnlinePaymentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlinePaymentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POSUserData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "t_OnlinePaymentResponse", propOrder = {
    "posUserData",
    "systemAction",
    "reasonActionCode",
    "actionDescription",
    "cardValidationResult",
    "authorizationCode"
})
public class TOnlinePaymentResponse {

    @XmlElement(name = "POSUserData", required = true)
    protected String posUserData;
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
