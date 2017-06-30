
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
 *         &lt;element name="Message_PostNewResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "messagePostNewResult"
})
@XmlRootElement(name = "Message_PostNewResponse")
public class MessagePostNewResponse {

    @XmlElement(name = "Message_PostNewResult")
    protected Long messagePostNewResult;

    /**
     * Gets the value of the messagePostNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessagePostNewResult() {
        return messagePostNewResult;
    }

    /**
     * Sets the value of the messagePostNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessagePostNewResult(Long value) {
        this.messagePostNewResult = value;
    }

}
