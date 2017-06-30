
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
 *         &lt;element name="remoteRequirementStep" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}RemoteRequirementStep" minOccurs="0"/>
 *         &lt;element name="existingRequirementStepId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "remoteRequirementStep",
    "existingRequirementStepId",
    "creatorId"
})
@XmlRootElement(name = "Requirement_AddStep")
public class RequirementAddStep {

    @XmlElementRef(name = "remoteRequirementStep", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<RemoteRequirementStep> remoteRequirementStep;
    @XmlElementRef(name = "existingRequirementStepId", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> existingRequirementStepId;
    @XmlElementRef(name = "creatorId", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> creatorId;

    /**
     * Gets the value of the remoteRequirementStep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteRequirementStep }{@code >}
     *     
     */
    public JAXBElement<RemoteRequirementStep> getRemoteRequirementStep() {
        return remoteRequirementStep;
    }

    /**
     * Sets the value of the remoteRequirementStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteRequirementStep }{@code >}
     *     
     */
    public void setRemoteRequirementStep(JAXBElement<RemoteRequirementStep> value) {
        this.remoteRequirementStep = value;
    }

    /**
     * Gets the value of the existingRequirementStepId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExistingRequirementStepId() {
        return existingRequirementStepId;
    }

    /**
     * Sets the value of the existingRequirementStepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExistingRequirementStepId(JAXBElement<Integer> value) {
        this.existingRequirementStepId = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCreatorId(JAXBElement<Integer> value) {
        this.creatorId = value;
    }

}