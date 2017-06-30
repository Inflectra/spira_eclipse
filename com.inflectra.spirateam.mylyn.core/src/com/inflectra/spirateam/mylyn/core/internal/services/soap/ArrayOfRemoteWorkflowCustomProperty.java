
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRemoteWorkflowCustomProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRemoteWorkflowCustomProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteWorkflowCustomProperty" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}RemoteWorkflowCustomProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRemoteWorkflowCustomProperty", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects", propOrder = {
    "remoteWorkflowCustomProperty"
})
public class ArrayOfRemoteWorkflowCustomProperty {

    @XmlElement(name = "RemoteWorkflowCustomProperty", nillable = true)
    protected List<RemoteWorkflowCustomProperty> remoteWorkflowCustomProperty;

    /**
     * Gets the value of the remoteWorkflowCustomProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteWorkflowCustomProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteWorkflowCustomProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteWorkflowCustomProperty }
     * 
     * 
     */
    public List<RemoteWorkflowCustomProperty> getRemoteWorkflowCustomProperty() {
        if (remoteWorkflowCustomProperty == null) {
            remoteWorkflowCustomProperty = new ArrayList<RemoteWorkflowCustomProperty>();
        }
        return this.remoteWorkflowCustomProperty;
    }

}
