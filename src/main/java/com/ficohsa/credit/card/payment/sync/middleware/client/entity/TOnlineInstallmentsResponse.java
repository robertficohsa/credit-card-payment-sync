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
 * <p>Clase Java para t_OnlineInstallmentsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlineInstallmentsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonActionCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ActionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetailAvailableCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CashAvailableCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_OnlineInstallmentsResponse", propOrder = {
    "reasonActionCode",
    "actionDescription",
    "retailAvailableCredit",
    "cashAvailableCredit"
})
public class TOnlineInstallmentsResponse {

    @XmlElement(name = "ReasonActionCode")
    protected int reasonActionCode;
    @XmlElement(name = "ActionDescription")
    protected String actionDescription;
    @XmlElement(name = "RetailAvailableCredit", defaultValue = "0")
    protected BigDecimal retailAvailableCredit;
    @XmlElement(name = "CashAvailableCredit", defaultValue = "0")
    protected BigDecimal cashAvailableCredit;

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
     * Obtiene el valor de la propiedad retailAvailableCredit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetailAvailableCredit() {
        return retailAvailableCredit;
    }

    /**
     * Define el valor de la propiedad retailAvailableCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetailAvailableCredit(BigDecimal value) {
        this.retailAvailableCredit = value;
    }

    /**
     * Obtiene el valor de la propiedad cashAvailableCredit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashAvailableCredit() {
        return cashAvailableCredit;
    }

    /**
     * Define el valor de la propiedad cashAvailableCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashAvailableCredit(BigDecimal value) {
        this.cashAvailableCredit = value;
    }

}
