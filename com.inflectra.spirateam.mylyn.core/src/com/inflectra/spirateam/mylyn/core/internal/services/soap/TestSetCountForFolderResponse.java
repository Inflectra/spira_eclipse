
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="TestSet_CountForFolderResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "testSetCountForFolderResult"
})
@XmlRootElement(name = "TestSet_CountForFolderResponse")
public class TestSetCountForFolderResponse {

    @XmlElement(name = "TestSet_CountForFolderResult")
    protected Long testSetCountForFolderResult;

    /**
     * Gets the value of the testSetCountForFolderResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestSetCountForFolderResult() {
        return testSetCountForFolderResult;
    }

    /**
     * Sets the value of the testSetCountForFolderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestSetCountForFolderResult(Long value) {
        this.testSetCountForFolderResult = value;
    }

}
