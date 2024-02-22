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
 * <p>Clase Java para t_OnlineUpdateCardResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="t_OnlineUpdateCardResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdateResponseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UpdateResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_OnlineUpdateCardResponse", propOrder = {
    "updateResponseCode",
    "updateResponseDescription"
})
public class TOnlineUpdateCardResponse {

    @XmlElement(name = "UpdateResponseCode")
    protected int updateResponseCode;
    @XmlElement(name = "UpdateResponseDescription", required = true)
    protected String updateResponseDescription;

    /**
     * Obtiene el valor de la propiedad updateResponseCode.
     * 
     */
    public int getUpdateResponseCode() {
        return updateResponseCode;
    }

    /**
     * Define el valor de la propiedad updateResponseCode.
     * 
     */
    public void setUpdateResponseCode(int value) {
        this.updateResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad updateResponseDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateResponseDescription() {
        return updateResponseDescription;
    }

    /**
     * Define el valor de la propiedad updateResponseDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateResponseDescription(String value) {
        this.updateResponseDescription = value;
    }

}
