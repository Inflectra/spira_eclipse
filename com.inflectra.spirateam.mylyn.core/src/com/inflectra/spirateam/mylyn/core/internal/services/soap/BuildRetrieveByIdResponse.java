
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
 *         &lt;element name="Build_RetrieveByIdResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}RemoteBuild" minOccurs="0"/>
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
    "buildRetrieveByIdResult"
})
@XmlRootElement(name = "Build_RetrieveByIdResponse")
public class BuildRetrieveByIdResponse {

    @XmlElementRef(name = "Build_RetrieveByIdResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<RemoteBuild> buildRetrieveByIdResult;

    /**
     * Gets the value of the buildRetrieveByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteBuild }{@code >}
     *     
     */
    public JAXBElement<RemoteBuild> getBuildRetrieveByIdResult() {
        return buildRetrieveByIdResult;
    }

    /**
     * Sets the value of the buildRetrieveByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteBuild }{@code >}
     *     
     */
    public void setBuildRetrieveByIdResult(JAXBElement<RemoteBuild> value) {
        this.buildRetrieveByIdResult = ((JAXBElement<RemoteBuild> ) value);
    }

}
