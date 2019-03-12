package edu.cornell.ksbclient;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Custom JAX-WS service implementation that forcibly initializes the service
 * with a null WSDL location. This allows for Axis2 to properly create the service proxy
 * if the annotated services and DTOs were generated from a WSDL that has changed
 * since that initial generation time. Without this workaround, Axis2 may throw an exception
 * if the DTO/service code does not line up properly with the new WSDL.
 * 
 * Note that as a result of this workaround, the calling code is responsible
 * for setting the actual endpoint URL on the request context.
 */
public class GenericServiceImpl extends Service {

	public GenericServiceImpl(QName serviceName) {
		super(null, serviceName);
	}

}
