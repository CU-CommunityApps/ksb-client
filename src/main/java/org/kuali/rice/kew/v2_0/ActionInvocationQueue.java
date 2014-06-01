
package org.kuali.rice.kew.v2_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "actionInvocationQueue", targetNamespace = "http://rice.kuali.org/kew/v2_0")
@XmlSeeAlso({
    org.kuali.rice.core.v2_0.ObjectFactory.class,
    org.kuali.rice.kew.v2_0.ObjectFactory.class
})
public interface ActionInvocationQueue {


    /**
     * 
     * @param actionInvocation
     * @param principalId
     * @param documentId
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @RequestWrapper(localName = "invokeAction", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.InvokeAction")
    @ResponseWrapper(localName = "invokeActionResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.InvokeActionResponse")
    public void invokeAction(
        @WebParam(name = "principalId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String principalId,
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "actionInvocation", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        ActionInvocationType actionInvocation)
        throws RiceIllegalArgumentException
    ;

}