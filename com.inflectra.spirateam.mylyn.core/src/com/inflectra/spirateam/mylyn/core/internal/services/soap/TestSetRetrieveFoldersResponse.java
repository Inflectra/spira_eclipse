
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
 *         &lt;element name="TestSet_RetrieveFoldersResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteTestSetFolder" minOccurs="0"/>
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
    "testSetRetrieveFoldersResult"
})
@XmlRootElement(name = "TestSet_RetrieveFoldersResponse")
public class TestSetRetrieveFoldersResponse {

    @XmlElementRef(name = "TestSet_RetrieveFoldersResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteTestSetFolder> testSetRetrieveFoldersResult;

    /**
     * Gets the value of the testSetRetrieveFoldersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestSetFolder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteTestSetFolder> getTestSetRetrieveFoldersResult() {
        return testSetRetrieveFoldersResult;
    }

    /**
     * Sets the value of the testSetRetrieveFoldersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestSetFolder }{@code >}
     *     
     */
    public void setTestSetRetrieveFoldersResult(JAXBElement<ArrayOfRemoteTestSetFolder> value) {
        this.testSetRetrieveFoldersResult = value;
    }

}
