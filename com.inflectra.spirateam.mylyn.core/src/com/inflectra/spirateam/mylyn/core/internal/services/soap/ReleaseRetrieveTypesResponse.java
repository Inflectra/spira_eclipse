
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
 *         &lt;element name="Release_RetrieveTypesResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteReleaseType" minOccurs="0"/>
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
    "releaseRetrieveTypesResult"
})
@XmlRootElement(name = "Release_RetrieveTypesResponse")
public class ReleaseRetrieveTypesResponse {

    @XmlElementRef(name = "Release_RetrieveTypesResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteReleaseType> releaseRetrieveTypesResult;

    /**
     * Gets the value of the releaseRetrieveTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteReleaseType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteReleaseType> getReleaseRetrieveTypesResult() {
        return releaseRetrieveTypesResult;
    }

    /**
     * Sets the value of the releaseRetrieveTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteReleaseType }{@code >}
     *     
     */
    public void setReleaseRetrieveTypesResult(JAXBElement<ArrayOfRemoteReleaseType> value) {
        this.releaseRetrieveTypesResult = value;
    }

}
