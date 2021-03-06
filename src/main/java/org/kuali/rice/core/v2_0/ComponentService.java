
package org.kuali.rice.core.v2_0;

import java.util.List;
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
@WebService(name = "componentService", targetNamespace = "http://rice.kuali.org/core/v2_0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ComponentService {


    /**
     * 
     * @param componentSetId
     * @param components
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @RequestWrapper(localName = "publishDerivedComponents", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.PublishDerivedComponents")
    @ResponseWrapper(localName = "publishDerivedComponentsResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.PublishDerivedComponentsResponse")
    public void publishDerivedComponents(
        @WebParam(name = "componentSetId", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String componentSetId,
        @WebParam(name = "components", targetNamespace = "http://rice.kuali.org/core/v2_0")
        List<ComponentType> components)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param namespaceCode
     * @return
     *     returns org.kuali.rice.core.v2_0.GetAllComponentsByNamespaceCodeResponse.Components
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "components", targetNamespace = "http://rice.kuali.org/core/v2_0")
    @RequestWrapper(localName = "getAllComponentsByNamespaceCode", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetAllComponentsByNamespaceCode")
    @ResponseWrapper(localName = "getAllComponentsByNamespaceCodeResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetAllComponentsByNamespaceCodeResponse")
    public org.kuali.rice.core.v2_0.GetAllComponentsByNamespaceCodeResponse.Components getAllComponentsByNamespaceCode(
        @WebParam(name = "namespaceCode", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String namespaceCode)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param namespaceCode
     * @param componentCode
     * @return
     *     returns org.kuali.rice.core.v2_0.ComponentType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "component", targetNamespace = "http://rice.kuali.org/core/v2_0")
    @RequestWrapper(localName = "getComponentByCode", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetComponentByCode")
    @ResponseWrapper(localName = "getComponentByCodeResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetComponentByCodeResponse")
    public ComponentType getComponentByCode(
        @WebParam(name = "namespaceCode", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String namespaceCode,
        @WebParam(name = "componentCode", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String componentCode)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param namespaceCode
     * @return
     *     returns org.kuali.rice.core.v2_0.GetActiveComponentsByNamespaceCodeResponse.Components
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "components", targetNamespace = "http://rice.kuali.org/core/v2_0")
    @RequestWrapper(localName = "getActiveComponentsByNamespaceCode", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetActiveComponentsByNamespaceCode")
    @ResponseWrapper(localName = "getActiveComponentsByNamespaceCodeResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetActiveComponentsByNamespaceCodeResponse")
    public org.kuali.rice.core.v2_0.GetActiveComponentsByNamespaceCodeResponse.Components getActiveComponentsByNamespaceCode(
        @WebParam(name = "namespaceCode", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String namespaceCode)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param componentSetId
     * @return
     *     returns org.kuali.rice.core.v2_0.GetDerivedComponentSetResponse.Components
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "components", targetNamespace = "http://rice.kuali.org/core/v2_0")
    @RequestWrapper(localName = "getDerivedComponentSet", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetDerivedComponentSet")
    @ResponseWrapper(localName = "getDerivedComponentSetResponse", targetNamespace = "http://rice.kuali.org/core/v2_0", className = "org.kuali.rice.core.v2_0.GetDerivedComponentSetResponse")
    public org.kuali.rice.core.v2_0.GetDerivedComponentSetResponse.Components getDerivedComponentSet(
        @WebParam(name = "componentSetId", targetNamespace = "http://rice.kuali.org/core/v2_0")
        String componentSetId)
        throws RiceIllegalArgumentException
    ;

}
