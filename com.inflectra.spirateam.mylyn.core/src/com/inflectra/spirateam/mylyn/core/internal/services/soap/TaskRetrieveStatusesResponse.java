
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
 *         &lt;element name="Task_RetrieveStatusesResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteTaskStatus" minOccurs="0"/>
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
    "taskRetrieveStatusesResult"
})
@XmlRootElement(name = "Task_RetrieveStatusesResponse")
public class TaskRetrieveStatusesResponse {

    @XmlElementRef(name = "Task_RetrieveStatusesResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteTaskStatus> taskRetrieveStatusesResult;

    /**
     * Gets the value of the taskRetrieveStatusesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTaskStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteTaskStatus> getTaskRetrieveStatusesResult() {
        return taskRetrieveStatusesResult;
    }

    /**
     * Sets the value of the taskRetrieveStatusesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteTaskStatus }{@code >}
     *     
     */
    public void setTaskRetrieveStatusesResult(JAXBElement<ArrayOfRemoteTaskStatus> value) {
        this.taskRetrieveStatusesResult = value;
    }

}
