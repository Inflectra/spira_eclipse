
package com.inflectra.spirateam.mylyn.core.internal.services.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServiceFaultMessage", targetNamespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v5_0")
public class ISoapServiceTaskCreateCommentServiceFaultMessageFaultFaultMessage
    extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4443049537717698221L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceFaultMessage faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ISoapServiceTaskCreateCommentServiceFaultMessageFaultFaultMessage(String message, ServiceFaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ISoapServiceTaskCreateCommentServiceFaultMessageFaultFaultMessage(String message, ServiceFaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.inflectra.spirateam.mylyn.core.internal.services.soap.ServiceFaultMessage
     */
    public ServiceFaultMessage getFaultInfo() {
        return faultInfo;
    }

}
