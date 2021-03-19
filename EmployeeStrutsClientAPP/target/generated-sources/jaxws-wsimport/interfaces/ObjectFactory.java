
package interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the interfaces package. 
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

    private final static QName _GetEmployeeDetailsResponse_QNAME = new QName("http://Interfaces/", "GetEmployeeDetailsResponse");
    private final static QName _GetEmployeeDetails_QNAME = new QName("http://Interfaces/", "GetEmployeeDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeDetailsResponse }
     * 
     */
    public GetEmployeeDetailsResponse createGetEmployeeDetailsResponse() {
        return new GetEmployeeDetailsResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeDetails }
     * 
     */
    public GetEmployeeDetails createGetEmployeeDetails() {
        return new GetEmployeeDetails();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Interfaces/", name = "GetEmployeeDetailsResponse")
    public JAXBElement<GetEmployeeDetailsResponse> createGetEmployeeDetailsResponse(GetEmployeeDetailsResponse value) {
        return new JAXBElement<GetEmployeeDetailsResponse>(_GetEmployeeDetailsResponse_QNAME, GetEmployeeDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Interfaces/", name = "GetEmployeeDetails")
    public JAXBElement<GetEmployeeDetails> createGetEmployeeDetails(GetEmployeeDetails value) {
        return new JAXBElement<GetEmployeeDetails>(_GetEmployeeDetails_QNAME, GetEmployeeDetails.class, null, value);
    }

}
