
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
 *         &lt;element name="Task_RetrieveFoldersResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteTaskFolder" minOccurs="0"/>
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
    "taskRetrieveFoldersResult"
})
@XmlRootElement(name = "Task_RetrieveFoldersResponse")
public class TaskRetrieveFoldersResponse {

    @XmlElementRef(name = "Task_RetrieveFoldersResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteTaskFolder> taskRetrieveFoldersResult;

    /**
     * Gets the value of the taskRetrieveFoldersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTaskFolder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteTaskFolder> getTaskRetrieveFoldersResult() {
        return taskRetrieveFoldersResult;
    }

    /**
     * Sets the value of the taskRetrieveFoldersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTaskFolder }{@code >}
     *     
     */
    public void setTaskRetrieveFoldersResult(JAXBElement<ArrayOfRemoteTaskFolder> value) {
        this.taskRetrieveFoldersResult = value;
    }

}
