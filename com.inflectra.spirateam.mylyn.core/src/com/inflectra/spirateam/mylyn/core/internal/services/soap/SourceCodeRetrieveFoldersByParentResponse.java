
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
 *         &lt;element name="SourceCode_RetrieveFoldersByParentResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteSourceCodeFolder" minOccurs="0"/>
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
    "sourceCodeRetrieveFoldersByParentResult"
})
@XmlRootElement(name = "SourceCode_RetrieveFoldersByParentResponse")
public class SourceCodeRetrieveFoldersByParentResponse {

    @XmlElementRef(name = "SourceCode_RetrieveFoldersByParentResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteSourceCodeFolder> sourceCodeRetrieveFoldersByParentResult;

    /**
     * Gets the value of the sourceCodeRetrieveFoldersByParentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteSourceCodeFolder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteSourceCodeFolder> getSourceCodeRetrieveFoldersByParentResult() {
        return sourceCodeRetrieveFoldersByParentResult;
    }

    /**
     * Sets the value of the sourceCodeRetrieveFoldersByParentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteSourceCodeFolder }{@code >}
     *     
     */
    public void setSourceCodeRetrieveFoldersByParentResult(JAXBElement<ArrayOfRemoteSourceCodeFolder> value) {
        this.sourceCodeRetrieveFoldersByParentResult = value;
    }

}
