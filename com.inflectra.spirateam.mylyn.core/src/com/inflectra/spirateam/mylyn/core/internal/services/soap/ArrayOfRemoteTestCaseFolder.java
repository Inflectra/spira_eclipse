
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRemoteTestCaseFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRemoteTestCaseFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteTestCaseFolder" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}RemoteTestCaseFolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRemoteTestCaseFolder", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects", propOrder = {
    "remoteTestCaseFolder"
})
public class ArrayOfRemoteTestCaseFolder {

    @XmlElement(name = "RemoteTestCaseFolder", nillable = true)
    protected List<RemoteTestCaseFolder> remoteTestCaseFolder;

    /**
     * Gets the value of the remoteTestCaseFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteTestCaseFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteTestCaseFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteTestCaseFolder }
     * 
     * 
     */
    public List<RemoteTestCaseFolder> getRemoteTestCaseFolder() {
        if (remoteTestCaseFolder == null) {
            remoteTestCaseFolder = new ArrayList<RemoteTestCaseFolder>();
        }
        return this.remoteTestCaseFolder;
    }

}
