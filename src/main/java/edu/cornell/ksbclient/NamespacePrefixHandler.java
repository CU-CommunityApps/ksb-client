package edu.cornell.ksbclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.llom.OMSourcedElementImpl;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.axis2.jaxws.message.databinding.JAXBBlock;

/**
 * Custom Axis2 Handler implementation that properly sets the namespace prefix
 * on the main child element within the SOAP body of outgoing requests.
 * 
 * Axis2 appears to have an issue where it always assumes that the SOAP body's
 * main child element has an empty namespace prefix. This can cause problems
 * if the JAXB marshaller needs to write multiple xmlns attributes but
 * auto-picks a non-empty prefix for the main element's namespace, or if JAXB
 * uses the namespace prefixes defined in the relevant package annotations.
 * 
 * This Handler works around the problem by extracting the prefix defined
 * in the package annotations for the DTO being processed, and then overwriting
 * the main child element's namespace metadata to use the extracted prefix.
 * 
 * It is assumed that the SOAP body's main child element is being sourced
 * from a JAXB-annotated DTO class, and that the package for that class
 * has the proper annotations configured for defining the prefix to use.
 */
public class NamespacePrefixHandler extends AbstractHandler {

    @Override
    public InvocationResponse invoke(MessageContext msgContext) throws AxisFault {
        SOAPEnvelope soapEnvelope = msgContext.getEnvelope();
        SOAPBody soapBody = soapEnvelope.getBody();
        OMFactory factory = soapBody.getOMFactory();
        OMSourcedElementImpl bodyContentElement = (OMSourcedElementImpl) soapBody.getFirstElement();
        Class<?> dtoClass = getDTOClass(bodyContentElement);
        String namespacePrefix = getNamespacePrefixFromPackageOfDTOClass(dtoClass);
        
        OMNamespace oldNamespace = bodyContentElement.getNamespace();
        OMNamespace newNamespace = factory.createOMNamespace(oldNamespace.getNamespaceURI(), namespacePrefix);
        bodyContentElement.definedNamespace = newNamespace;
        
        return InvocationResponse.CONTINUE;
    }

    private Class<?> getDTOClass(OMSourcedElementImpl xmlElement) {
        JAXBBlock jaxbBlock = (JAXBBlock) xmlElement.getDataSource();
        JAXBElement<?> jaxbElement;
        try {
            jaxbElement = (JAXBElement<?>) jaxbBlock.getBusinessObject(false);
        } catch (XMLStreamException e) {
            throw new RuntimeException("Could not get underlying business object for request", e);
        }
        return jaxbElement.getDeclaredType();
    }

    private String getNamespacePrefixFromPackageOfDTOClass(Class<?> dtoClass) {
        Package dtoPackage = dtoClass.getPackage();
        if (dtoPackage == null) {
            throw new IllegalStateException("Could not find package for DTO " + dtoClass);
        }
        XmlSchema schemaAnnotation = dtoPackage.getDeclaredAnnotation(XmlSchema.class);
        if (schemaAnnotation == null) {
            throw new IllegalStateException("No schema metadata found for package " + dtoPackage);
        }
        XmlNs[] namespaceAnnotations = schemaAnnotation.xmlns();
        if (namespaceAnnotations == null || namespaceAnnotations.length != 1) {
            throw new IllegalStateException("Could not find exactly 1 xmlns metadata item for package " + dtoPackage);
        }
        XmlNs namespaceAnnotation = namespaceAnnotations[0];
        return namespaceAnnotation.prefix();
    }

}
