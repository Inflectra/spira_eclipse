
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
 *         &lt;element name="Task_RetrieveWorkflowTransitionsResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteWorkflowTransition" minOccurs="0"/>
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
    "taskRetrieveWorkflowTransitionsResult"
})
@XmlRootElement(name = "Task_RetrieveWorkflowTransitionsResponse")
public class TaskRetrieveWorkflowTransitionsResponse {

    @XmlElementRef(name = "Task_RetrieveWorkflowTransitionsResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteWorkflowTransition> taskRetrieveWorkflowTransitionsResult;

    /**
     * Gets the value of the taskRetrieveWorkflowTransitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteWorkflowTransition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteWorkflowTransition> getTaskRetrieveWorkflowTransitionsResult() {
        return taskRetrieveWorkflowTransitionsResult;
    }

    /**
     * Sets the value of the taskRetrieveWorkflowTransitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteWorkflowTransition }{@code >}
     *     
     */
    public void setTaskRetrieveWorkflowTransitionsResult(JAXBElement<ArrayOfRemoteWorkflowTransition> value) {
        this.taskRetrieveWorkflowTransitionsResult = value;
    }

}
