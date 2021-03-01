
package net.client.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.client.order package. 
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

    private final static QName _SaveOrderDataResponse_QNAME = new QName("http://webservices.mailorder.net/", "saveOrderDataResponse");
    private final static QName _GenerateTrackingNumber_QNAME = new QName("http://webservices.mailorder.net/", "generateTrackingNumber");
    private final static QName _GenerateTrackingNumberResponse_QNAME = new QName("http://webservices.mailorder.net/", "generateTrackingNumberResponse");
    private final static QName _SaveOrderData_QNAME = new QName("http://webservices.mailorder.net/", "saveOrderData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.client.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveOrderDataResponse }
     * 
     */
    public SaveOrderDataResponse createSaveOrderDataResponse() {
        return new SaveOrderDataResponse();
    }

    /**
     * Create an instance of {@link GenerateTrackingNumberResponse }
     * 
     */
    public GenerateTrackingNumberResponse createGenerateTrackingNumberResponse() {
        return new GenerateTrackingNumberResponse();
    }

    /**
     * Create an instance of {@link SaveOrderData }
     * 
     */
    public SaveOrderData createSaveOrderData() {
        return new SaveOrderData();
    }

    /**
     * Create an instance of {@link GenerateTrackingNumber }
     * 
     */
    public GenerateTrackingNumber createGenerateTrackingNumber() {
        return new GenerateTrackingNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mailorder.net/", name = "saveOrderDataResponse")
    public JAXBElement<SaveOrderDataResponse> createSaveOrderDataResponse(SaveOrderDataResponse value) {
        return new JAXBElement<SaveOrderDataResponse>(_SaveOrderDataResponse_QNAME, SaveOrderDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTrackingNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mailorder.net/", name = "generateTrackingNumber")
    public JAXBElement<GenerateTrackingNumber> createGenerateTrackingNumber(GenerateTrackingNumber value) {
        return new JAXBElement<GenerateTrackingNumber>(_GenerateTrackingNumber_QNAME, GenerateTrackingNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTrackingNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mailorder.net/", name = "generateTrackingNumberResponse")
    public JAXBElement<GenerateTrackingNumberResponse> createGenerateTrackingNumberResponse(GenerateTrackingNumberResponse value) {
        return new JAXBElement<GenerateTrackingNumberResponse>(_GenerateTrackingNumberResponse_QNAME, GenerateTrackingNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mailorder.net/", name = "saveOrderData")
    public JAXBElement<SaveOrderData> createSaveOrderData(SaveOrderData value) {
        return new JAXBElement<SaveOrderData>(_SaveOrderData_QNAME, SaveOrderData.class, null, value);
    }

}
