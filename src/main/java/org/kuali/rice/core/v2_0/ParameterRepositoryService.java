
package org.kuali.rice.core.v2_0;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "parameterRepositoryService", targetNamespace = "http://rice.kuali.org/core/v2_0", wsdlLocation = "http://demo.rice.kuali.org/remoting/soap/core/v2_0/parameterRepositoryService?wsdl")
public class ParameterRepositoryService
    extends Service
{

    private final static URL PARAMETERREPOSITORYSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.kuali.rice.core.v2_0.ParameterRepositoryService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.kuali.rice.core.v2_0.ParameterRepositoryService.class.getResource(".");
            url = new URL(baseUrl, "http://demo.rice.kuali.org/remoting/soap/core/v2_0/parameterRepositoryService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://demo.rice.kuali.org/remoting/soap/core/v2_0/parameterRepositoryService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PARAMETERREPOSITORYSERVICE_WSDL_LOCATION = url;
    }

    public ParameterRepositoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParameterRepositoryService() {
        super(PARAMETERREPOSITORYSERVICE_WSDL_LOCATION, new QName("http://rice.kuali.org/core/v2_0", "parameterRepositoryService"));
    }

    /**
     * 
     * @return
     *     returns ParameterService
     */
    @WebEndpoint(name = "parameterServicePort")
    public ParameterService getParameterServicePort() {
        return super.getPort(new QName("http://rice.kuali.org/core/v2_0", "parameterServicePort"), ParameterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParameterService
     */
    @WebEndpoint(name = "parameterServicePort")
    public ParameterService getParameterServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rice.kuali.org/core/v2_0", "parameterServicePort"), ParameterService.class, features);
    }

}
