
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
 *         &lt;element name="Subscription_RetrieveForArtifactResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteArtifactSubscription" minOccurs="0"/>
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
    "subscriptionRetrieveForArtifactResult"
})
@XmlRootElement(name = "Subscription_RetrieveForArtifactResponse")
public class SubscriptionRetrieveForArtifactResponse {

    @XmlElementRef(name = "Subscription_RetrieveForArtifactResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteArtifactSubscription> subscriptionRetrieveForArtifactResult;

    /**
     * Gets the value of the subscriptionRetrieveForArtifactResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteArtifactSubscription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteArtifactSubscription> getSubscriptionRetrieveForArtifactResult() {
        return subscriptionRetrieveForArtifactResult;
    }

    /**
     * Sets the value of the subscriptionRetrieveForArtifactResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteArtifactSubscription }{@code >}
     *     
     */
    public void setSubscriptionRetrieveForArtifactResult(JAXBElement<ArrayOfRemoteArtifactSubscription> value) {
        this.subscriptionRetrieveForArtifactResult = value;
    }

}
