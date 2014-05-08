
package org.kuali.rice.kew.v2_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "workflowDocumentService", targetNamespace = "http://rice.kuali.org/kew/v2_0")
@XmlSeeAlso({
    org.kuali.rice.kew.v2_0.ObjectFactory.class,
    org.kuali.rice.core.v2_0.ObjectFactory.class
})
public interface WorkflowDocumentService {


    /**
     * 
     * @param documentLinkId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentLinkType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentLink", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "deleteDocumentLink", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DeleteDocumentLink")
    @ResponseWrapper(localName = "deleteDocumentLinkResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DeleteDocumentLinkResponse")
    public DocumentLinkType deleteDocumentLink(
        @WebParam(name = "documentLinkId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentLinkId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param key
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "searchableAttributeStringValues", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getSearchableAttributeStringValuesByKey", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeStringValuesByKey")
    @ResponseWrapper(localName = "getSearchableAttributeStringValuesByKeyResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeStringValuesByKeyResponse")
    public org.kuali.rice.kew.v2_0.GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues getSearchableAttributeStringValuesByKey(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "key", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String key)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetPendingActionRequestsResponse.PendingActionRequests
     */
    @WebMethod
    @WebResult(name = "pendingActionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getPendingActionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetPendingActionRequests")
    @ResponseWrapper(localName = "getPendingActionRequestsResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetPendingActionRequestsResponse")
    public org.kuali.rice.kew.v2_0.GetPendingActionRequestsResponse.PendingActionRequests getPendingActionRequests(
        @WebParam(name = "arg0", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String arg0);

    /**
     * 
     * @param documentId
     * @return
     *     returns java.lang.String
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentTypeName", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentTypeName", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentTypeName")
    @ResponseWrapper(localName = "getDocumentTypeNameResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentTypeNameResponse")
    public String getDocumentTypeName(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns boolean
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "document", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "doesDocumentExist", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DoesDocumentExist")
    @ResponseWrapper(localName = "doesDocumentExistResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DoesDocumentExistResponse")
    public boolean doesDocumentExist(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentLink
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @RequestWrapper(localName = "addDocumentLink", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.AddDocumentLink")
    @ResponseWrapper(localName = "addDocumentLinkResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.AddDocumentLinkResponse")
    public void addDocumentLink(
        @WebParam(name = "documentLink", targetNamespace = "http://rice.kuali.org/kew/v2_0", mode = WebParam.Mode.INOUT)
        Holder<DocumentLinkType> documentLink)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "previousRouteNodeNames", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getPreviousRouteNodeNames", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetPreviousRouteNodeNames")
    @ResponseWrapper(localName = "getPreviousRouteNodeNamesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetPreviousRouteNodeNamesResponse")
    public org.kuali.rice.kew.v2_0.GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames getPreviousRouteNodeNames(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentLinkId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentLinkType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentLinks", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentLink", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentLink")
    @ResponseWrapper(localName = "getDocumentLinkResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentLinkResponse")
    public DocumentLinkType getDocumentLink(
        @WebParam(name = "documentLinkId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentLinkId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param criteria
     * @param principalId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentSearchResultsType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentSearchResults", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "documentSearch", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DocumentSearch")
    @ResponseWrapper(localName = "documentSearchResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DocumentSearchResponse")
    public DocumentSearchResultsType documentSearch(
        @WebParam(name = "principalId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String principalId,
        @WebParam(name = "criteria", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        DocumentSearchCriteriaType criteria)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetCurrentRouteNodeNamesResponse.Nodes
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "nodes", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getCurrentRouteNodeNames", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetCurrentRouteNodeNames")
    @ResponseWrapper(localName = "getCurrentRouteNodeNamesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetCurrentRouteNodeNamesResponse")
    public org.kuali.rice.kew.v2_0.GetCurrentRouteNodeNamesResponse.Nodes getCurrentRouteNodeNames(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param key
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "searchableAttributeDateTimeValues", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getSearchableAttributeDateTimeValuesByKey", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeDateTimeValuesByKey")
    @ResponseWrapper(localName = "getSearchableAttributeDateTimeValuesByKeyResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeDateTimeValuesByKeyResponse")
    public org.kuali.rice.kew.v2_0.GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues getSearchableAttributeDateTimeValuesByKey(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "key", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String key)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param key
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "searchableAttributeBigDecimalValues", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getSearchableAttributeFloatValuesByKey", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeFloatValuesByKey")
    @ResponseWrapper(localName = "getSearchableAttributeFloatValuesByKeyResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeFloatValuesByKeyResponse")
    public org.kuali.rice.kew.v2_0.GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues getSearchableAttributeFloatValuesByKey(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "key", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String key)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetActiveRouteNodeNamesResponse.Nodes
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "nodes", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getActiveRouteNodeNames", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActiveRouteNodeNames")
    @ResponseWrapper(localName = "getActiveRouteNodeNamesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActiveRouteNodeNamesResponse")
    public org.kuali.rice.kew.v2_0.GetActiveRouteNodeNamesResponse.Nodes getActiveRouteNodeNames(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param originatingDocumentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetIncomingDocumentLinksResponse.DocumentLinks
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentLinks", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getIncomingDocumentLinks", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetIncomingDocumentLinks")
    @ResponseWrapper(localName = "getIncomingDocumentLinksResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetIncomingDocumentLinksResponse")
    public org.kuali.rice.kew.v2_0.GetIncomingDocumentLinksResponse.DocumentLinks getIncomingDocumentLinks(
        @WebParam(name = "originatingDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String originatingDocumentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns java.lang.String
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "applicationDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getApplicationDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetApplicationDocumentId")
    @ResponseWrapper(localName = "getApplicationDocumentIdResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetApplicationDocumentIdResponse")
    public String getApplicationDocumentId(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetCurrentRouteNodeInstancesResponse.RouteNodeInstances
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "routeNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getCurrentRouteNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetCurrentRouteNodeInstances")
    @ResponseWrapper(localName = "getCurrentRouteNodeInstancesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetCurrentRouteNodeInstancesResponse")
    public org.kuali.rice.kew.v2_0.GetCurrentRouteNodeInstancesResponse.RouteNodeInstances getCurrentRouteNodeInstances(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param routeNodeInstanceId
     * @return
     *     returns org.kuali.rice.kew.v2_0.RouteNodeInstanceType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "routeNodeInstance", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getRouteNodeInstance", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRouteNodeInstance")
    @ResponseWrapper(localName = "getRouteNodeInstanceResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRouteNodeInstanceResponse")
    public RouteNodeInstanceType getRouteNodeInstance(
        @WebParam(name = "routeNodeInstanceId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String routeNodeInstanceId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param actionRequestedCd
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetPrincipalIdsWithPendingActionRequestByActionRequestedAndDocIdResponse.PrincipalIds
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "principalIds", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getPrincipalIdsWithPendingActionRequestByActionRequestedAndDocId", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetPrincipalIdsWithPendingActionRequestByActionRequestedAndDocId")
    @ResponseWrapper(localName = "getPrincipalIdsWithPendingActionRequestByActionRequestedAndDocIdResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetPrincipalIdsWithPendingActionRequestByActionRequestedAndDocIdResponse")
    public org.kuali.rice.kew.v2_0.GetPrincipalIdsWithPendingActionRequestByActionRequestedAndDocIdResponse.PrincipalIds getPrincipalIdsWithPendingActionRequestByActionRequestedAndDocId(
        @WebParam(name = "actionRequestedCd", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String actionRequestedCd,
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentContentType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentContent", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentContent", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentContent")
    @ResponseWrapper(localName = "getDocumentContentResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentContentResponse")
    public DocumentContentType getDocumentContent(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetActionsTakenResponse.ActionsTaken
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "actionsTaken", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getActionsTaken", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActionsTaken")
    @ResponseWrapper(localName = "getActionsTakenResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActionsTakenResponse")
    public org.kuali.rice.kew.v2_0.GetActionsTakenResponse.ActionsTaken getActionsTaken(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentStatusType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentStatus", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentStatus", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentStatus")
    @ResponseWrapper(localName = "getDocumentStatusResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentStatusResponse")
    public DocumentStatusType getDocumentStatus(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetActionRequestsResponse.ActionsTaken
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "actionsTaken", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getActionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActionRequests")
    @ResponseWrapper(localName = "getActionRequestsResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActionRequestsResponse")
    public org.kuali.rice.kew.v2_0.GetActionRequestsResponse.ActionsTaken getActionRequests(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentDetailType
     */
    @WebMethod
    @WebResult(name = "documentDetail", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentDetail", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentDetail")
    @ResponseWrapper(localName = "getDocumentDetailResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentDetailResponse")
    public DocumentDetailType getDocumentDetail(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId);

    /**
     * 
     * @param appId
     * @param documentTypeName
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentDetailType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentDetail", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentDetailByAppId", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentDetailByAppId")
    @ResponseWrapper(localName = "getDocumentDetailByAppIdResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentDetailByAppIdResponse")
    public DocumentDetailType getDocumentDetailByAppId(
        @WebParam(name = "documentTypeName", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentTypeName,
        @WebParam(name = "appId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String appId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetAllActionRequestsResponse.ActionsTaken
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "actionsTaken", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getAllActionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetAllActionRequests")
    @ResponseWrapper(localName = "getAllActionRequestsResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetAllActionRequestsResponse")
    public org.kuali.rice.kew.v2_0.GetAllActionRequestsResponse.ActionsTaken getAllActionRequests(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetRouteNodeInstancesResponse.RouteNodeInstances
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "routeNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getRouteNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRouteNodeInstances")
    @ResponseWrapper(localName = "getRouteNodeInstancesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRouteNodeInstancesResponse")
    public org.kuali.rice.kew.v2_0.GetRouteNodeInstancesResponse.RouteNodeInstances getRouteNodeInstances(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DocumentType
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "document", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocument", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocument")
    @ResponseWrapper(localName = "getDocumentResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentResponse")
    public DocumentType getDocument(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param originatingDocumentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.DeleteDocumentLinksByDocumentIdResponse.DocumentLinks
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentLinks", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "deleteDocumentLinksByDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DeleteDocumentLinksByDocumentId")
    @ResponseWrapper(localName = "deleteDocumentLinksByDocumentIdResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.DeleteDocumentLinksByDocumentIdResponse")
    public org.kuali.rice.kew.v2_0.DeleteDocumentLinksByDocumentIdResponse.DocumentLinks deleteDocumentLinksByDocumentId(
        @WebParam(name = "originatingDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String originatingDocumentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param principalId
     * @param nodeName
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetActionRequestsForPrincipalAtNodeResponse.ActionRequests
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "actionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getActionRequestsForPrincipalAtNode", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActionRequestsForPrincipalAtNode")
    @ResponseWrapper(localName = "getActionRequestsForPrincipalAtNodeResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActionRequestsForPrincipalAtNodeResponse")
    public org.kuali.rice.kew.v2_0.GetActionRequestsForPrincipalAtNodeResponse.ActionRequests getActionRequestsForPrincipalAtNode(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "nodeName", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String nodeName,
        @WebParam(name = "principalId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String principalId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns java.lang.String
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "applicationDocumentStatus", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getApplicationDocumentStatus", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetApplicationDocumentStatus")
    @ResponseWrapper(localName = "getApplicationDocumentStatusResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetApplicationDocumentStatusResponse")
    public String getApplicationDocumentStatus(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentStatusTransitions", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentStatusTransitionHistory", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentStatusTransitionHistory")
    @ResponseWrapper(localName = "getDocumentStatusTransitionHistoryResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentStatusTransitionHistoryResponse")
    public org.kuali.rice.kew.v2_0.GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions getDocumentStatusTransitionHistory(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetTerminalRouteNodeInstancesResponse.RouteNodeInstances
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "routeNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getTerminalRouteNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetTerminalRouteNodeInstances")
    @ResponseWrapper(localName = "getTerminalRouteNodeInstancesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetTerminalRouteNodeInstancesResponse")
    public org.kuali.rice.kew.v2_0.GetTerminalRouteNodeInstancesResponse.RouteNodeInstances getTerminalRouteNodeInstances(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetRootActionRequestsResponse.RootActionRequests
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "rootActionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getRootActionRequests", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRootActionRequests")
    @ResponseWrapper(localName = "getRootActionRequestsResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRootActionRequestsResponse")
    public org.kuali.rice.kew.v2_0.GetRootActionRequestsResponse.RootActionRequests getRootActionRequests(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetActiveRouteNodeInstancesResponse.RouteNodeInstances
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "routeNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getActiveRouteNodeInstances", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActiveRouteNodeInstances")
    @ResponseWrapper(localName = "getActiveRouteNodeInstancesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetActiveRouteNodeInstancesResponse")
    public org.kuali.rice.kew.v2_0.GetActiveRouteNodeInstancesResponse.RouteNodeInstances getActiveRouteNodeInstances(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param originatingDocumentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetOutgoingDocumentLinksResponse.DocumentLinks
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "documentLinks", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getOutgoingDocumentLinks", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetOutgoingDocumentLinks")
    @ResponseWrapper(localName = "getOutgoingDocumentLinksResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetOutgoingDocumentLinksResponse")
    public org.kuali.rice.kew.v2_0.GetOutgoingDocumentLinksResponse.DocumentLinks getOutgoingDocumentLinks(
        @WebParam(name = "originatingDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String originatingDocumentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns java.lang.String
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "principalId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getRoutedByPrincipalIdByDocumentId", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRoutedByPrincipalIdByDocumentId")
    @ResponseWrapper(localName = "getRoutedByPrincipalIdByDocumentIdResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetRoutedByPrincipalIdByDocumentIdResponse")
    public String getRoutedByPrincipalIdByDocumentId(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns java.lang.String
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "principalId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getDocumentInitiatorPrincipalId", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentInitiatorPrincipalId")
    @ResponseWrapper(localName = "getDocumentInitiatorPrincipalIdResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetDocumentInitiatorPrincipalIdResponse")
    public String getDocumentInitiatorPrincipalId(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetTerminalRouteNodeNamesResponse.Nodes
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "nodes", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getTerminalRouteNodeNames", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetTerminalRouteNodeNames")
    @ResponseWrapper(localName = "getTerminalRouteNodeNamesResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetTerminalRouteNodeNamesResponse")
    public org.kuali.rice.kew.v2_0.GetTerminalRouteNodeNamesResponse.Nodes getTerminalRouteNodeNames(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId)
        throws RiceIllegalArgumentException
    ;

    /**
     * 
     * @param key
     * @param documentId
     * @return
     *     returns org.kuali.rice.kew.v2_0.GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues
     * @throws RiceIllegalArgumentException
     */
    @WebMethod
    @WebResult(name = "searchableAttributeLongValues", targetNamespace = "http://rice.kuali.org/kew/v2_0")
    @RequestWrapper(localName = "getSearchableAttributeLongValuesByKey", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeLongValuesByKey")
    @ResponseWrapper(localName = "getSearchableAttributeLongValuesByKeyResponse", targetNamespace = "http://rice.kuali.org/kew/v2_0", className = "org.kuali.rice.kew.v2_0.GetSearchableAttributeLongValuesByKeyResponse")
    public org.kuali.rice.kew.v2_0.GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues getSearchableAttributeLongValuesByKey(
        @WebParam(name = "documentId", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String documentId,
        @WebParam(name = "key", targetNamespace = "http://rice.kuali.org/kew/v2_0")
        String key)
        throws RiceIllegalArgumentException
    ;

}
