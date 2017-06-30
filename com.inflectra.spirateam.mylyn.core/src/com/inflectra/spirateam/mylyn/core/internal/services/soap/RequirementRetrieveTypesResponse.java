
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requirement_RetrieveTypesResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteRequirementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requirementRetrieveTypesResult"
})
@XmlRootElement(name = "Requirement_RetrieveTypesResponse")
public class RequirementRetrieveTypesResponse {

    @XmlElementRef(name = "Requirement_RetrieveTypesResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteRequirementType> requirementRetrieveTypesResult;

    /**
     * Gets the value of the requirementRetrieveTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteRequirementType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteRequirementType> getRequirementRetrieveTypesResult() {
        return requirementRetrieveTypesResult;
    }

    /**
     * Sets the value of the requirementRetrieveTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteRequirementType }{@code >}
     *     
     */
    public void setRequirementRetrieveTypesResult(JAXBElement<ArrayOfRemoteRequirementType> value) {
        this.requirementRetrieveTypesResult = value;
    }

}