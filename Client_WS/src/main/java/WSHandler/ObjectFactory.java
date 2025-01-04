
package WSHandler;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WSHandler package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Converter_QNAME = new QName("http://WS/", "Converter");
    private static final QName _ConverterResponse_QNAME = new QName("http://WS/", "ConverterResponse");
    private static final QName _GetAccountWS_QNAME = new QName("http://WS/", "GetAccountWS");
    private static final QName _GetAccountWSResponse_QNAME = new QName("http://WS/", "GetAccountWSResponse");
    private static final QName _GetAccountsList_QNAME = new QName("http://WS/", "GetAccountsList");
    private static final QName _GetAccountsListResponse_QNAME = new QName("http://WS/", "GetAccountsListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WSHandler
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Converter }
     * 
     * @return
     *     the new instance of {@link Converter }
     */
    public Converter createConverter() {
        return new Converter();
    }

    /**
     * Create an instance of {@link ConverterResponse }
     * 
     * @return
     *     the new instance of {@link ConverterResponse }
     */
    public ConverterResponse createConverterResponse() {
        return new ConverterResponse();
    }

    /**
     * Create an instance of {@link GetAccountWS }
     * 
     * @return
     *     the new instance of {@link GetAccountWS }
     */
    public GetAccountWS createGetAccountWS() {
        return new GetAccountWS();
    }

    /**
     * Create an instance of {@link GetAccountWSResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountWSResponse }
     */
    public GetAccountWSResponse createGetAccountWSResponse() {
        return new GetAccountWSResponse();
    }

    /**
     * Create an instance of {@link GetAccountsList }
     * 
     * @return
     *     the new instance of {@link GetAccountsList }
     */
    public GetAccountsList createGetAccountsList() {
        return new GetAccountsList();
    }

    /**
     * Create an instance of {@link GetAccountsListResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsListResponse }
     */
    public GetAccountsListResponse createGetAccountsListResponse() {
        return new GetAccountsListResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Converter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Converter }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "Converter")
    public JAXBElement<Converter> createConverter(Converter value) {
        return new JAXBElement<>(_Converter_QNAME, Converter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConverterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConverterResponse")
    public JAXBElement<ConverterResponse> createConverterResponse(ConverterResponse value) {
        return new JAXBElement<>(_ConverterResponse_QNAME, ConverterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "GetAccountWS")
    public JAXBElement<GetAccountWS> createGetAccountWS(GetAccountWS value) {
        return new JAXBElement<>(_GetAccountWS_QNAME, GetAccountWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountWSResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountWSResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "GetAccountWSResponse")
    public JAXBElement<GetAccountWSResponse> createGetAccountWSResponse(GetAccountWSResponse value) {
        return new JAXBElement<>(_GetAccountWSResponse_QNAME, GetAccountWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsList }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "GetAccountsList")
    public JAXBElement<GetAccountsList> createGetAccountsList(GetAccountsList value) {
        return new JAXBElement<>(_GetAccountsList_QNAME, GetAccountsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "GetAccountsListResponse")
    public JAXBElement<GetAccountsListResponse> createGetAccountsListResponse(GetAccountsListResponse value) {
        return new JAXBElement<>(_GetAccountsListResponse_QNAME, GetAccountsListResponse.class, null, value);
    }

}
