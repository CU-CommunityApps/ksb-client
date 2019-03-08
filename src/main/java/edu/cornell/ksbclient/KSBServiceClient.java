package edu.cornell.ksbclient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.jaxws.client.proxy.JAXWSProxyHandler;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
import org.apache.rampart.handler.WSSHandlerConstants;
import org.kuali.rice.core.v2_0.ComponentService;
import org.kuali.rice.core.v2_0.NamespaceService;
import org.kuali.rice.core.v2_0.ParameterService;
import org.kuali.rice.ken.v2_0.SendNotificationService;
import org.kuali.rice.kew.v2_0.ActionInvocationQueue;
import org.kuali.rice.kew.v2_0.ActionListCustomizationHandlerService;
import org.kuali.rice.kew.v2_0.ActionListService;
import org.kuali.rice.kew.v2_0.DocumentAttributeIndexingQueue;
import org.kuali.rice.kew.v2_0.DocumentOrchestrationQueue;
import org.kuali.rice.kew.v2_0.DocumentProcessingQueue;
import org.kuali.rice.kew.v2_0.DocumentRefreshQueue;
import org.kuali.rice.kew.v2_0.DocumentTypeService;
import org.kuali.rice.kew.v2_0.NoteService;
import org.kuali.rice.kew.v2_0.PeopleFlowService;
import org.kuali.rice.kew.v2_0.PermissionTypeService;
import org.kuali.rice.kew.v2_0.WorkflowDocumentActionsService;
import org.kuali.rice.kew.v2_0.WorkflowDocumentService;
import org.kuali.rice.kim.v2_0.GroupService;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.PermissionService;
import org.kuali.rice.kim.v2_0.RoleService;
import org.kuali.rice.location.v2_0.CountryService;
import org.kuali.rice.location.v2_0.PostalCodeService;
import org.kuali.rice.location.v2_0.StateService;

public class KSBServiceClient {
  
	private static Properties properties = new Properties();
	private static AtomicReference<String> signatureUser = new AtomicReference<>();
	
	private String baseURL = "";
	private String signUser = "";
	private String signPropsFile = "";
  
    public KSBServiceClient(String signPropsFile, String signUser, String baseURL) {
        this.baseURL = baseURL;
        this.signUser = signUser;
        this.signPropsFile = signPropsFile;
        
        signatureUser.set(signUser);
        loadCryptoProperties();
    }

  public KSBServiceClient() {
    this(KSBClientProperties.DEFAULT_SIGNATURE_PROPERTIES_FILE, KSBClientProperties.DEFAULT_SIGNATURE_USER, KSBClientProperties.DEFAULT_BASE_URL);
  }
	
  public ParameterService getParameterService () {
	  return getService(KSBClientProperties.PARAMETER_WSDL_LOCATION, KSBClientProperties.QNAME_PARM_SERVICE,
		  		KSBClientProperties.QNAME_PARM_SERVICE_PORT, ParameterService.class);
  }
  
  public RoleService getRoleService() {
	  return getService(KSBClientProperties.ROLE_WSDL_LOCATION, KSBClientProperties.QNAME_ROLE_SERVICE,
				  		KSBClientProperties.QNAME_ROLE_SERVICE_PORT, RoleService.class);
  }

  public IdentityService getIdentityService() {
	  return getService(KSBClientProperties.IDENTITY_WSDL_LOCATION, KSBClientProperties.QNAME_IDENTITY_SERVICE,
		  		KSBClientProperties.QNAME_IDENTITY_SERVICE_PORT, IdentityService.class);
  }
  
  public GroupService getGroupService() {
	  return getService(KSBClientProperties.GROUP_WSDL_LOCATION, KSBClientProperties.QNAME_GROUP_SERVICE,
		  		KSBClientProperties.QNAME_GROUP_SERVICE_PORT, GroupService.class);
  }
  
  public WorkflowDocumentActionsService getWorkflowDocumentActionsService() {
	  return getService(KSBClientProperties.WORKFLOW_ACTION_WSDL_LOCATION, KSBClientProperties.QNAME_WORKFLOW_ACTION_SERVICE,
		  		KSBClientProperties.QNAME_WORKFLOW_ACTION_SERVICE_PORT, WorkflowDocumentActionsService.class);
  }
  
  public WorkflowDocumentService getWorkflowDocumentService() {
	  return getService(KSBClientProperties.WORKFLOW_DOCUMENT_WSDL_LOCATION, KSBClientProperties.QNAME_WORKFLOW_DOCUMENT_SERVICE,
		  		KSBClientProperties.QNAME_WORKFLOW_DOCUMENT_SERVICE_PORT, WorkflowDocumentService.class);
  }
  
  public CountryService getCountryService() {
	  return getService(KSBClientProperties.COUNTRY_WSDL_LOCATION, KSBClientProperties.QNAME_COUNTRY_SERVICE,
		  		KSBClientProperties.QNAME_COUNTRY_SERVICE_PORT, CountryService.class);
  }
  
  public PostalCodeService getPostalCodeService() {
	  return getService(KSBClientProperties.POSTAL_WSDL_LOCATION, KSBClientProperties.QNAME_POSTAL_SERVICE,
		  		KSBClientProperties.QNAME_POSTAL_SERVICE_PORT, PostalCodeService.class);
  }
  
  public StateService getStateService() {
	  return getService(KSBClientProperties.STATE_WSDL_LOCATION, KSBClientProperties.QNAME_STATE_SERVICE,
		  		KSBClientProperties.QNAME_STATE_SERVICE_PORT, StateService.class);
  }
  
  
  public ComponentService getComponentService() {
    return getService(KSBClientProperties.COMPONENT_WSDL_LOCATION, KSBClientProperties.QNAME_COMPONENT_SERVICE,
          KSBClientProperties.QNAME_COMPONENT_SERVICE_PORT, ComponentService.class);
  }
  
  public NamespaceService getNamespaceService() {
    return getService(KSBClientProperties.NAMESPACE_WSDL_LOCATION, KSBClientProperties.QNAME_NAMESPACE_SERVICE,
          KSBClientProperties.QNAME_NAMESPACE_SERVICE_PORT, NamespaceService.class);
  }
  
  public SendNotificationService getSendNotificationService() {
    return getService(KSBClientProperties.SEND_NOTIFICATION_WSDL_LOCATION, KSBClientProperties.QNAME_SEND_NOTIFICATION_SERVICE,
          KSBClientProperties.QNAME_SEND_NOTIFICATION_SERVICE_PORT, SendNotificationService.class);
  }
  
  public ActionInvocationQueue getActionInvocationQueue() {
    return getService(KSBClientProperties.ACTION_QUEUE_WSDL_LOCATION, KSBClientProperties.QNAME_ACTION_QUEUE_SERVICE,
          KSBClientProperties.QNAME_ACTION_QUEUE_SERVICE_PORT, ActionInvocationQueue.class);
  }
  
  public ActionListCustomizationHandlerService getActionListCustomizationHandlerService() {
    return getService(KSBClientProperties.ACTION_LIST_CUSTOM_WSDL_LOCATION, KSBClientProperties.QNAME_ACTION_LIST_CUSTOM_SERVICE,
          KSBClientProperties.QNAME_ACTION_LIST_CUSTOM_SERVICE_PORT, ActionListCustomizationHandlerService.class);
  }
  
  public ActionListService getActionListService() {
    return getService(KSBClientProperties.ACTION_LIST_WSDL_LOCATION, KSBClientProperties.QNAME_ACTION_LIST_SERVICE,
          KSBClientProperties.QNAME_ACTION_LIST_SERVICE_PORT, ActionListService.class);
  }
  
  public PermissionTypeService getBackdoorRestrictionPermissionTypeService() {
    return getService(KSBClientProperties.BACKDOOR_PERMISSION_TYPE_WSDL_LOCATION, KSBClientProperties.QNAME_BACKDOOR_PERMISSION_TYPE_SERVICE,
          KSBClientProperties.QNAME_BACKDOOR_PERMISSION_TYPE_SERVICE_PORT, PermissionTypeService.class);
  }
  
  public DocumentAttributeIndexingQueue getDocumentAttributeIndexingQueue() {
    return getService(KSBClientProperties.DOCUMENT_ATTRIBUTE_INDEX_WSDL_LOCATION, KSBClientProperties.QNAME_DOCUMENT_ATTRIBUTE_INDEX_SERVICE,
          KSBClientProperties.QNAME_DOCUMENT_ATTRIBUTE_INDEX_SERVICE_PORT, DocumentAttributeIndexingQueue.class);
  }
  
  public DocumentOrchestrationQueue getDocumentOrchestrationQueue() {
    return getService(KSBClientProperties.DOCUMENT_ORCHESTRATION_QUEUE_WSDL_LOCATION, KSBClientProperties.QNAME_DOCUMENT_ORCHESTRATION_QUEUE_SERVICE,
          KSBClientProperties.QNAME_DOCUMENT_ORCHESTRATION_QUEUE_SERVICE_PORT, DocumentOrchestrationQueue.class);
  }
  
  public DocumentProcessingQueue getDocumentProcessingQueue() {
    return getService(KSBClientProperties.DOCUMENT_PROCESSING_QUEUE_WSDL_LOCATION, KSBClientProperties.QNAME_DOCUMENT_PROCESSING_QUEUE_SERVICE,
          KSBClientProperties.QNAME_DOCUMENT_PROCESSING_QUEUE_SERVICE_PORT, DocumentProcessingQueue.class);
  }
  
  public DocumentRefreshQueue getDocumentRefreshQueue() {
    return getService(KSBClientProperties.DOCUMENT_REFRESH_QUEUE_WSDL_LOCATION, KSBClientProperties.QNAME_DOCUMENT_REFRESH_QUEUE_SERVICE,
          KSBClientProperties.QNAME_DOCUMENT_REFRESH_QUEUE_SERVICE_PORT, DocumentRefreshQueue.class);
  }
  
  public NoteService getNoteService() {
    return getService(KSBClientProperties.NOTE_SERVICE_WSDL_LOCATION, KSBClientProperties.QNAME_NOTE_SERVICE,
          KSBClientProperties.QNAME_NOTE_SERVICE_PORT, NoteService.class);
}
  
  public DocumentTypeService getDocumentTypeService() {
    return getService(KSBClientProperties.DOCUMENT_TYPE_WSDL_LOCATION, KSBClientProperties.QNAME_DOCUMENT_TYPE_SERVICE,
          KSBClientProperties.QNAME_DOCUMENT_TYPE_SERVICE_PORT, DocumentTypeService.class);
  }
  
  public PermissionService getPermissionService() {
    return getService(KSBClientProperties.PERMISSION_SERVICE_WSDL_LOCATION, KSBClientProperties.QNAME_PERMISSION_SERVICE,
          KSBClientProperties.QNAME_PERMISSION_SERVICE_PORT, PermissionService.class);
  }
  
  public PeopleFlowService getPeopleFlowService() {
    return getService(KSBClientProperties.PEOPLE_FLOW__WSDL_LOCATION, KSBClientProperties.QNAME_PEOPLE_FLOW_SERVICE,
          KSBClientProperties.QNAME_PEOPLE_FLOW_SERVICE_PORT, PeopleFlowService.class);
  }
  
  private <T> T getService(String wsdlocation, QName tService, QName tServicePort, Class<T> serviceEndpointInterface) {
	  GenericServiceImpl svc;
	  try {
		  //svc = new GenericServiceImpl(new URL(baseURL + wsdlocation), tService);
		  //URL wsdlUrl = new URL(baseURL + wsdlocation);
	      svc = new GenericServiceImpl(null, tService);
		  //svc.addPort(tServicePort, SOAPBinding.SOAP11HTTP_BINDING, baseURL + wsdlocation.substring(0, wsdlocation.lastIndexOf("?wsdl")));
		  //svc.createDispatch(tServicePort, SOAPMessage.class, Mode.PAYLOAD);
		  //configureServiceToGeneratePortProxiesFromAnnotatedInterfacesOnly(svc);
		  T service =  (T) svc.getPort(tServicePort, serviceEndpointInterface);
		  String endpointUrl = getEndpointUrl(wsdlocation);
		  enableWebSecurityAndSetEndpointOnService(service, tServicePort, endpointUrl);
		  return service; 
	  } catch (MalformedURLException e) {
	      System.err.println("Invalid URL: " + baseURL);
	      return null;
	}

  }
  
  private String getEndpointUrl(String wsdlLocation) throws MalformedURLException {
      String relativeEndpointLocation = wsdlLocation.substring(0, wsdlLocation.lastIndexOf("?wsdl"));
      URL endpointUrl = new URL(baseURL + relativeEndpointLocation);
      return endpointUrl.toString();
  }
  
  public static String getProperty(String key) {
    return properties.getProperty(key);
  }
  
  public static Properties getProperties() {
      return new Properties(properties);
  }
  
  public static String getSignatureUser() {
      return signatureUser.get();
  }
  
  public String getBaseURL() {
    return baseURL;
  }

  public void setBaseURL(String baseURL) {
    this.baseURL = baseURL;
  }

  public String getSignUser() {
    return signUser;
  }

  public void setSignUser(String signUser) {
    this.signUser = signUser;
    signatureUser.set(signUser);
  }

  public String getSignPropsFile() {
    return signPropsFile;
  }

  public void setSignPropsFile(String signPropsFile) {
    this.signPropsFile = signPropsFile;
    loadCryptoProperties();
  }
  
  private void loadCryptoProperties() {
    //Since we are using a properties file that is out of the class path
    //we need to load it then stuff the ref into our WSS4J outbound
    //properties
    try (InputStream propertiesStream = getInputStreamForCryptoPropertiesFile()) {
      properties.load(propertiesStream);
    } catch (FileNotFoundException e) {
      System.err.println("Unable to find signature properties file: " + signPropsFile);
    } catch (IOException e) {
      System.err.println("Unable to read signature properties file: " + signPropsFile);
    } 
  }

    private InputStream getInputStreamForCryptoPropertiesFile() throws IOException {
        if (KSBClientProperties.DEFAULT_SIGNATURE_PROPERTIES_FILE.equals(signPropsFile)) {
            return getClasspathResourceAsStream(signPropsFile);
        } else {
            return new FileInputStream(signPropsFile);
        }
    }

    private void enableWebSecurityAndSetEndpointOnService(Object service, QName portQName, String endpointUrl) {
        JAXWSProxyHandler proxyHandler = (JAXWSProxyHandler) Proxy.getInvocationHandler(service);
        proxyHandler.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
        
        ServiceClient client = proxyHandler.getServiceDelegate().getServiceClient(portQName);
        enableWebSecurityOnClient(client);
        
        AxisService axisService = client.getAxisService();
        Policy signaturePolicy = getSignaturePolicyFromXml();
        axisService.getPolicySubject().attachPolicy(signaturePolicy);
    }

    private void enableWebSecurityOnClient(ServiceClient client) {
        try {
            client.engageModule(WSSHandlerConstants.SECURITY_MODULE_NAME);
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

    private Policy getSignaturePolicyFromXml() {
        try (InputStream policyFileStream = getClasspathResourceAsStream(KSBClientProperties.DEFAULT_POLICY_FILE)) {
            return PolicyEngine.getPolicy(policyFileStream);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private InputStream getClasspathResourceAsStream(String resourceName) throws IOException {
        InputStream resourceStream = ClassLoader.getSystemClassLoader().getResourceAsStream(resourceName);
        if (resourceStream == null) {
            throw new IOException("Could not find classpath resource: " + resourceName);
        }
        return resourceStream;
    }

}
