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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para t_OnlinePaymentV4Request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlinePaymentV4Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POSUserData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RRN37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VPrespCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfInstallments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCCType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="R"/&gt;
 *               &lt;enumeration value="P"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MerchantNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalSalesAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Track2Length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Track2Data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardValidationValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlinePaymentV4Request", propOrder = {
    "posUserData",
    "rrn37",
    "vPrespCode",
    "numberOfInstallments",
    "paymentTypeIndicator",
    "mccType",
    "requestType",
    "cardNumber",
    "orgId",
    "merchantNumber",
    "cardExpirationDate",
    "totalSalesAmount",
    "track2Length",
    "track2Data",
    "cardValidationValue"
})
@XmlRootElement(name = "OnlinePaymentV4Request")
public class OnlinePaymentV4Request {

    @XmlElement(name = "POSUserData", required = true)
    protected String posUserData;
    @XmlElement(name = "RRN37", defaultValue = " ")
    protected String rrn37;
    @XmlElement(name = "VPrespCode", defaultValue = " ")
    protected String vPrespCode;
    @XmlElement(name = "NumberOfInstallments", defaultValue = "0")
    protected Integer numberOfInstallments;
    @XmlElement(name = "PaymentTypeIndicator", defaultValue = " ")
    protected String paymentTypeIndicator;
    @XmlElement(name = "MCCType", defaultValue = " ")
    protected String mccType;
    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "OrgId")
    protected int orgId;
    @XmlElement(name = "MerchantNumber")
    protected int merchantNumber;
    @XmlElement(name = "CardExpirationDate")
    protected int cardExpirationDate;
    @XmlElement(name = "TotalSalesAmount", required = true)
    protected BigDecimal totalSalesAmount;
    @XmlElement(name = "Track2Length")
    protected int track2Length;
    @XmlElement(name = "Track2Data", required = true)
    protected String track2Data;
    @XmlElement(name = "CardValidationValue")
    protected int cardValidationValue;

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
     * Obtiene el valor de la propiedad numberOfInstallments.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    /**
     * Define el valor de la propiedad numberOfInstallments.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfInstallments(Integer value) {
        this.numberOfInstallments = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTypeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeIndicator() {
        return paymentTypeIndicator;
    }

    /**
     * Define el valor de la propiedad paymentTypeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeIndicator(String value) {
        this.paymentTypeIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad mccType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCCType() {
        return mccType;
    }

    /**
     * Define el valor de la propiedad mccType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCCType(String value) {
        this.mccType = value;
    }

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
     * Obtiene el valor de la propiedad cardExpirationDate.
     * 
     */
    public int getCardExpirationDate() {
        return cardExpirationDate;
    }

    /**
     * Define el valor de la propiedad cardExpirationDate.
     * 
     */
    public void setCardExpirationDate(int value) {
        this.cardExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSalesAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSalesAmount() {
        return totalSalesAmount;
    }

    /**
     * Define el valor de la propiedad totalSalesAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSalesAmount(BigDecimal value) {
        this.totalSalesAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad track2Length.
     * 
     */
    public int getTrack2Length() {
        return track2Length;
    }

    /**
     * Define el valor de la propiedad track2Length.
     * 
     */
    public void setTrack2Length(int value) {
        this.track2Length = value;
    }

    /**
     * Obtiene el valor de la propiedad track2Data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2Data() {
        return track2Data;
    }

    /**
     * Define el valor de la propiedad track2Data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2Data(String value) {
        this.track2Data = value;
    }

    /**
     * Obtiene el valor de la propiedad cardValidationValue.
     * 
     */
    public int getCardValidationValue() {
        return cardValidationValue;
    }

    /**
     * Define el valor de la propiedad cardValidationValue.
     * 
     */
    public void setCardValidationValue(int value) {
        this.cardValidationValue = value;
    }

}
