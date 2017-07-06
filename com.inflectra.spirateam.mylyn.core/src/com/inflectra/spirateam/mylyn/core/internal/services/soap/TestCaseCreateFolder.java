
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
 *         &lt;element name="remoteTestCaseFolder" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}RemoteTestCaseFolder" minOccurs="0"/>
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
    "remoteTestCaseFolder"
})
@XmlRootElement(name = "TestCase_CreateFolder")
public class TestCaseCreateFolder {

    @XmlElementRef(name = "remoteTestCaseFolder", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<RemoteTestCaseFolder> remoteTestCaseFolder;

    /**
     * Gets the value of the remoteTestCaseFolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteTestCaseFolder }{@code >}
     *     
     */
    public JAXBElement<RemoteTestCaseFolder> getRemoteTestCaseFolder() {
        return remoteTestCaseFolder;
    }

    /**
     * Sets the value of the remoteTestCaseFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteTestCaseFolder }{@code >}
     *     
     */
    public void setRemoteTestCaseFolder(JAXBElement<RemoteTestCaseFolder> value) {
        this.remoteTestCaseFolder = value;
    }

}
