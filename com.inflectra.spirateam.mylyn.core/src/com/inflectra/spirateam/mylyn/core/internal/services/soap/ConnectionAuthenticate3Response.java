
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
 *         &lt;element name="Connection_Authenticate3Result" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "connectionAuthenticate3Result"
})
@XmlRootElement(name = "Connection_Authenticate3Response")
public class ConnectionAuthenticate3Response {

    @XmlElement(name = "Connection_Authenticate3Result")
    protected Boolean connectionAuthenticate3Result;

    /**
     * Gets the value of the connectionAuthenticate3Result property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionAuthenticate3Result() {
        return connectionAuthenticate3Result;
    }

    /**
     * Sets the value of the connectionAuthenticate3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionAuthenticate3Result(Boolean value) {
        this.connectionAuthenticate3Result = value;
    }

}
