//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.13 a las 05:03:35 PM COT 
//


package com.ficohsa.credit.card.payment.sync.middleware.client.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para t_OnlineInformationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlineInformationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonActionCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ActionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AvailableCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AmountMemoCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AccountCurrentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AmountMemoDebit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_OnlineInformationResponse", propOrder = {
    "reasonActionCode",
    "actionDescription",
    "availableCredit",
    "amountMemoCredit",
    "accountCurrentBalance",
    "amountMemoDebit"
})
public class TOnlineInformationResponse {

    @XmlElement(name = "ReasonActionCode")
    protected int reasonActionCode;
    @XmlElement(name = "ActionDescription", required = true)
    protected String actionDescription;
    @XmlElement(name = "AvailableCredit", required = true, defaultValue = "0")
    protected BigDecimal availableCredit;
    @XmlElement(name = "AmountMemoCredit", required = true)
    protected BigDecimal amountMemoCredit;
    @XmlElement(name = "AccountCurrentBalance", required = true)
    protected BigDecimal accountCurrentBalance;
    @XmlElement(name = "AmountMemoDebit", required = true)
    protected BigDecimal amountMemoDebit;

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
     * Obtiene el valor de la propiedad availableCredit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Define el valor de la propiedad availableCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableCredit(BigDecimal value) {
        this.availableCredit = value;
    }

    /**
     * Obtiene el valor de la propiedad amountMemoCredit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMemoCredit() {
        return amountMemoCredit;
    }

    /**
     * Define el valor de la propiedad amountMemoCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMemoCredit(BigDecimal value) {
        this.amountMemoCredit = value;
    }

    /**
     * Obtiene el valor de la propiedad accountCurrentBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountCurrentBalance() {
        return accountCurrentBalance;
    }

    /**
     * Define el valor de la propiedad accountCurrentBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountCurrentBalance(BigDecimal value) {
        this.accountCurrentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad amountMemoDebit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMemoDebit() {
        return amountMemoDebit;
    }

    /**
     * Define el valor de la propiedad amountMemoDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMemoDebit(BigDecimal value) {
        this.amountMemoDebit = value;
    }

}
