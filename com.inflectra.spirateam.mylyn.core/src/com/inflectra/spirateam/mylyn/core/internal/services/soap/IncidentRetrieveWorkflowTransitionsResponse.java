
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
 *         &lt;element name="Incident_RetrieveWorkflowTransitionsResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteWorkflowTransition" minOccurs="0"/>
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
    "incidentRetrieveWorkflowTransitionsResult"
})
@XmlRootElement(name = "Incident_RetrieveWorkflowTransitionsResponse")
public class IncidentRetrieveWorkflowTransitionsResponse {

    @XmlElementRef(name = "Incident_RetrieveWorkflowTransitionsResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteWorkflowTransition> incidentRetrieveWorkflowTransitionsResult;

    /**
     * Gets the value of the incidentRetrieveWorkflowTransitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteWorkflowTransition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteWorkflowTransition> getIncidentRetrieveWorkflowTransitionsResult() {
        return incidentRetrieveWorkflowTransitionsResult;
    }

    /**
     * Sets the value of the incidentRetrieveWorkflowTransitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteWorkflowTransition }{@code >}
     *     
     */
    public void setIncidentRetrieveWorkflowTransitionsResult(JAXBElement<ArrayOfRemoteWorkflowTransition> value) {
        this.incidentRetrieveWorkflowTransitionsResult = value;
    }

}
