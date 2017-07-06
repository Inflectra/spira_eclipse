
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
 *         &lt;element name="TestRun_RetrieveByTestCaseIdResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteTestRun" minOccurs="0"/>
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
    "testRunRetrieveByTestCaseIdResult"
})
@XmlRootElement(name = "TestRun_RetrieveByTestCaseIdResponse")
public class TestRunRetrieveByTestCaseIdResponse {

    @XmlElementRef(name = "TestRun_RetrieveByTestCaseIdResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteTestRun> testRunRetrieveByTestCaseIdResult;

    /**
     * Gets the value of the testRunRetrieveByTestCaseIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestRun }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteTestRun> getTestRunRetrieveByTestCaseIdResult() {
        return testRunRetrieveByTestCaseIdResult;
    }

    /**
     * Sets the value of the testRunRetrieveByTestCaseIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestRun }{@code >}
     *     
     */
    public void setTestRunRetrieveByTestCaseIdResult(JAXBElement<ArrayOfRemoteTestRun> value) {
        this.testRunRetrieveByTestCaseIdResult = value;
    }

}
