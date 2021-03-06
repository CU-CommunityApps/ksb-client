
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
@WebService(name = "documentProcessingQueue", targetNamespace = "http://rice.kuali.org/kew/v2_0")
@XmlSeeAlso({
    org.kuali.rice.core.v2_0.ObjectFactory.class,
    org.kuali.rice.kew.v2_0.ObjectFactory.class
})
public interface DocumentProcessingQueue {


    /**
     * 
     * @param documentId
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @RequestWrapper(localName = "process", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.Process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.ProcessResponse")
    public void process(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @param options
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @RequestWrapper(localName = "processWithOptions", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.ProcessWithOptions")
    @ResponseWrapper(localName = "processWithOptionsResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.ProcessWithOptionsResponse")
    public void processWithOptions(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "options", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        DocumentProcessingOptionsType options)
        throws RiceIllegalArgumentException
    ;

}
