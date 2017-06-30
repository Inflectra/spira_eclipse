
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRemoteSourceCodeFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRemoteSourceCodeFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteSourceCodeFile" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}RemoteSourceCodeFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRemoteSourceCodeFile", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects", propOrder = {
    "remoteSourceCodeFile"
})
public class ArrayOfRemoteSourceCodeFile {

    @XmlElement(name = "RemoteSourceCodeFile", nillable = true)
    protected List<RemoteSourceCodeFile> remoteSourceCodeFile;

    /**
     * Gets the value of the remoteSourceCodeFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteSourceCodeFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteSourceCodeFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteSourceCodeFile }
     * 
     * 
     */
    public List<RemoteSourceCodeFile> getRemoteSourceCodeFile() {
        if (remoteSourceCodeFile == null) {
            remoteSourceCodeFile = new ArrayList<RemoteSourceCodeFile>();
        }
        return this.remoteSourceCodeFile;
    }

}
