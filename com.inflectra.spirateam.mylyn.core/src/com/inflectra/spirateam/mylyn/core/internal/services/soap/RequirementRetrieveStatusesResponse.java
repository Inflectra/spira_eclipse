
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
 *         &lt;element name="Requirement_RetrieveStatusesResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteRequirementStatus" minOccurs="0"/>
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
    "requirementRetrieveStatusesResult"
})
@XmlRootElement(name = "Requirement_RetrieveStatusesResponse")
public class RequirementRetrieveStatusesResponse {

    @XmlElementRef(name = "Requirement_RetrieveStatusesResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteRequirementStatus> requirementRetrieveStatusesResult;

    /**
     * Gets the value of the requirementRetrieveStatusesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteRequirementStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteRequirementStatus> getRequirementRetrieveStatusesResult() {
        return requirementRetrieveStatusesResult;
    }

    /**
     * Sets the value of the requirementRetrieveStatusesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteRequirementStatus }{@code >}
     *     
     */
    public void setRequirementRetrieveStatusesResult(JAXBElement<ArrayOfRemoteRequirementStatus> value) {
        this.requirementRetrieveStatusesResult = value;
    }

}
