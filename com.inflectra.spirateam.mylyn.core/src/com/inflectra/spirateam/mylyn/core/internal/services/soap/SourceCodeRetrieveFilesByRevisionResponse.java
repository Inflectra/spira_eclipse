
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
 *         &lt;element name="SourceCode_RetrieveFilesByRevisionResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteSourceCodeFile" minOccurs="0"/>
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
    "sourceCodeRetrieveFilesByRevisionResult"
})
@XmlRootElement(name = "SourceCode_RetrieveFilesByRevisionResponse")
public class SourceCodeRetrieveFilesByRevisionResponse {

    @XmlElementRef(name = "SourceCode_RetrieveFilesByRevisionResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteSourceCodeFile> sourceCodeRetrieveFilesByRevisionResult;

    /**
     * Gets the value of the sourceCodeRetrieveFilesByRevisionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteSourceCodeFile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteSourceCodeFile> getSourceCodeRetrieveFilesByRevisionResult() {
        return sourceCodeRetrieveFilesByRevisionResult;
    }

    /**
     * Sets the value of the sourceCodeRetrieveFilesByRevisionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteSourceCodeFile }{@code >}
     *     
     */
    public void setSourceCodeRetrieveFilesByRevisionResult(JAXBElement<ArrayOfRemoteSourceCodeFile> value) {
        this.sourceCodeRetrieveFilesByRevisionResult = value;
    }

}
