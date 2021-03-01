
package net.client.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.client.tracking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDataFromTracking_QNAME = new QName("http://webservices.mailorder.net/", "getDataFromTracking");
    private final static QName _GetDataFromTrackingResponse_QNAME = new QName("http://webservices.mailorder.net/", "getDataFromTrackingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.client.tracking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataFromTrackingResponse }
     * 
     */
    public GetDataFromTrackingResponse createGetDataFromTrackingResponse() {
        return new GetDataFromTrackingResponse();
    }

    /**
     * Create an instance of {@link GetDataFromTracking }
     * 
     */
    public GetDataFromTracking createGetDataFromTracking() {
        return new GetDataFromTracking();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataFromTracking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mailorder.net/", name = "getDataFromTracking")
    public JAXBElement<GetDataFromTracking> createGetDataFromTracking(GetDataFromTracking value) {
        return new JAXBElement<GetDataFromTracking>(_GetDataFromTracking_QNAME, GetDataFromTracking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataFromTrackingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mailorder.net/", name = "getDataFromTrackingResponse")
    public JAXBElement<GetDataFromTrackingResponse> createGetDataFromTrackingResponse(GetDataFromTrackingResponse value) {
        return new JAXBElement<GetDataFromTrackingResponse>(_GetDataFromTrackingResponse_QNAME, GetDataFromTrackingResponse.class, null, value);
    }

}
