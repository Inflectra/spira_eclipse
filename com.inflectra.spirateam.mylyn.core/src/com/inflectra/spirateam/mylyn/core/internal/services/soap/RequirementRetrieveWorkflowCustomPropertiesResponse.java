
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
 *         &lt;element name="Requirement_RetrieveWorkflowCustomPropertiesResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteWorkflowCustomProperty" minOccurs="0"/>
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
    "requirementRetrieveWorkflowCustomPropertiesResult"
})
@XmlRootElement(name = "Requirement_RetrieveWorkflowCustomPropertiesResponse")
public class RequirementRetrieveWorkflowCustomPropertiesResponse {

    @XmlElementRef(name = "Requirement_RetrieveWorkflowCustomPropertiesResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteWorkflowCustomProperty> requirementRetrieveWorkflowCustomPropertiesResult;

    /**
     * Gets the value of the requirementRetrieveWorkflowCustomPropertiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteWorkflowCustomProperty }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteWorkflowCustomProperty> getRequirementRetrieveWorkflowCustomPropertiesResult() {
        return requirementRetrieveWorkflowCustomPropertiesResult;
    }

    /**
     * Sets the value of the requirementRetrieveWorkflowCustomPropertiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteWorkflowCustomProperty }{@code >}
     *     
     */
    public void setRequirementRetrieveWorkflowCustomPropertiesResult(JAXBElement<ArrayOfRemoteWorkflowCustomProperty> value) {
        this.requirementRetrieveWorkflowCustomPropertiesResult = value;
    }

}
