
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comments xmlns:msc="http://schemas.microsoft.com/ws/2005/12/wsdl/contract" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects" xmlns:wsa="http://schemas.xmlsoap.org/ws/2004/08/addressing" xmlns:wsa10="http://www.w3.org/2005/08/addressing" xmlns:wsam="http://www.w3.org/2007/05/addressing/metadata" xmlns:wsap="http://schemas.xmlsoap.org/ws/2004/08/addressing/policy" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns:wsx="http://schemas.xmlsoap.org/ws/2004/09/mex" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;summary&gt;
 * Represents an artifact custom property that can be controlled by the workflow
 * &lt;/summary&gt;&lt;/comments&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RemoteWorkflowCustomProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteWorkflowCustomProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomPropertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FieldCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldStateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteWorkflowCustomProperty", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects", propOrder = {
    "customPropertyId",
    "fieldCaption",
    "fieldName",
    "fieldStateId"
})
public class RemoteWorkflowCustomProperty {

    @XmlElement(name = "CustomPropertyId")
    protected Integer customPropertyId;
    @XmlElementRef(name = "FieldCaption", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldCaption;
    @XmlElementRef(name = "FieldName", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldName;
    @XmlElement(name = "FieldStateId")
    protected Integer fieldStateId;

    /**
     * Gets the value of the customPropertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomPropertyId() {
        return customPropertyId;
    }

    /**
     * Sets the value of the customPropertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomPropertyId(Integer value) {
        this.customPropertyId = value;
    }

    /**
     * Gets the value of the fieldCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldCaption() {
        return fieldCaption;
    }

    /**
     * Sets the value of the fieldCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldCaption(JAXBElement<String> value) {
        this.fieldCaption = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldName(JAXBElement<String> value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldStateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldStateId() {
        return fieldStateId;
    }

    /**
     * Sets the value of the fieldStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldStateId(Integer value) {
        this.fieldStateId = value;
    }

}
