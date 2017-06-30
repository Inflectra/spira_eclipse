
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
 *         &lt;element name="DataMapping_SearchArtifactMappingsResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteProjectArtifact" minOccurs="0"/>
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
    "dataMappingSearchArtifactMappingsResult"
})
@XmlRootElement(name = "DataMapping_SearchArtifactMappingsResponse")
public class DataMappingSearchArtifactMappingsResponse {

    @XmlElementRef(name = "DataMapping_SearchArtifactMappingsResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteProjectArtifact> dataMappingSearchArtifactMappingsResult;

    /**
     * Gets the value of the dataMappingSearchArtifactMappingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteProjectArtifact }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteProjectArtifact> getDataMappingSearchArtifactMappingsResult() {
        return dataMappingSearchArtifactMappingsResult;
    }

    /**
     * Sets the value of the dataMappingSearchArtifactMappingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteProjectArtifact }{@code >}
     *     
     */
    public void setDataMappingSearchArtifactMappingsResult(JAXBElement<ArrayOfRemoteProjectArtifact> value) {
        this.dataMappingSearchArtifactMappingsResult = value;
    }

}
