
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
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remoteSort" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}RemoteSort" minOccurs="0"/>
 *         &lt;element name="remoteFilters" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0.DataObjects}ArrayOfRemoteFilter" minOccurs="0"/>
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
    "branchId",
    "startRow",
    "numberRows",
    "remoteSort",
    "remoteFilters"
})
@XmlRootElement(name = "SourceCode_RetrieveRevisions")
public class SourceCodeRetrieveRevisions {

    @XmlElementRef(name = "branchId", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchId;
    protected Integer startRow;
    protected Integer numberRows;
    @XmlElementRef(name = "remoteSort", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<RemoteSort> remoteSort;
    @XmlElementRef(name = "remoteFilters", namespace = "http://www.inflectra.com/SpiraTest/Services/v5.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemoteFilter> remoteFilters;

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchId(JAXBElement<String> value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartRow(Integer value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the numberRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberRows() {
        return numberRows;
    }

    /**
     * Sets the value of the numberRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberRows(Integer value) {
        this.numberRows = value;
    }

    /**
     * Gets the value of the remoteSort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteSort }{@code >}
     *     
     */
    public JAXBElement<RemoteSort> getRemoteSort() {
        return remoteSort;
    }

    /**
     * Sets the value of the remoteSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteSort }{@code >}
     *     
     */
    public void setRemoteSort(JAXBElement<RemoteSort> value) {
        this.remoteSort = value;
    }

    /**
     * Gets the value of the remoteFilters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteFilter> getRemoteFilters() {
        return remoteFilters;
    }

    /**
     * Sets the value of the remoteFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}
     *     
     */
    public void setRemoteFilters(JAXBElement<ArrayOfRemoteFilter> value) {
        this.remoteFilters = value;
    }

}
