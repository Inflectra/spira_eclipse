
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dataSyncSystemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastRunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "dataSyncSystemId",
    "lastRunDate"
})
@XmlRootElement(name = "DataSyncSystem_SaveRunSuccess")
public class DataSyncSystemSaveRunSuccess {

    protected Integer dataSyncSystemId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRunDate;

    /**
     * Gets the value of the dataSyncSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSyncSystemId() {
        return dataSyncSystemId;
    }

    /**
     * Sets the value of the dataSyncSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSyncSystemId(Integer value) {
        this.dataSyncSystemId = value;
    }

    /**
     * Gets the value of the lastRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRunDate() {
        return lastRunDate;
    }

    /**
     * Sets the value of the lastRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRunDate(XMLGregorianCalendar value) {
        this.lastRunDate = value;
    }

}