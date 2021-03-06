
package org.kuali.rice.core.v2_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
@WebService(name = "namespaceService", targetNamespace = "http://rice.kuali.org/core/v2_0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NamespaceService {


    /**
     * 
     * @return
     *     returns org.kuali.rice.core.v2_0.FindAllNamespacesResponse.Namespaces
     */
    @WebMethod
    @WebResult(name = "namespaces", targetNamespace = "http://rice.kuali.org/core/v2_0")
    @RequestWrapper(localName = "findAllNamespaces", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.FindAllNamespaces")
    @ResponseWrapper(localName = "findAllNamespacesResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.FindAllNamespacesResponse")
    public org.kuali.rice.core.v2_0.FindAllNamespacesResponse.Namespaces findAllNamespaces();

    /**
     * 
     * @param code
     * @return
     *     returns org.kuali.rice.core.v2_0.NamespaceType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "namespace", targetNamespace = "http://rice.kuali.org/core/v2_0")
    @RequestWrapper(localName = "getNamespace", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetNamespace")
    @ResponseWrapper(localName = "getNamespaceResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetNamespaceResponse")
    public NamespaceType getNamespace(
        @WebParam(name = "code", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String code)
        throws RiceIllegalArgumentException
    ;

}
