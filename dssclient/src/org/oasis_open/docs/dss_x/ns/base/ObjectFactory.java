//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.dss_x.ns.base package. 
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

    private final static QName _ServicePolicy_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/base", "ServicePolicy");
    private final static QName _Result_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/base", "Result");
    private final static QName _OptionalOutputs_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/base", "OptionalOutputs");
    private final static QName _OptionalInputs_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/base", "OptionalInputs");
    private final static QName _ServiceDescription_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/base", "ServiceDescription");
    private final static QName _Base64Data_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/base", "Base64Data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.dss_x.ns.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Base64DataType }
     * 
     */
    public Base64DataType createBase64DataType() {
        return new Base64DataType();
    }

    /**
     * Create an instance of {@link OptionalOutputsType }
     * 
     */
    public OptionalOutputsType createOptionalOutputsType() {
        return new OptionalOutputsType();
    }

    /**
     * Create an instance of {@link OptionalInputsType }
     * 
     */
    public OptionalInputsType createOptionalInputsType() {
        return new OptionalInputsType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link SignaturePtrType }
     * 
     */
    public SignaturePtrType createSignaturePtrType() {
        return new SignaturePtrType();
    }

    /**
     * Create an instance of {@link DigestInfoType }
     * 
     */
    public DigestInfoType createDigestInfoType() {
        return new DigestInfoType();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link InternationalStringType }
     * 
     */
    public InternationalStringType createInternationalStringType() {
        return new InternationalStringType();
    }

    /**
     * Create an instance of {@link AttachmentReferenceType }
     * 
     */
    public AttachmentReferenceType createAttachmentReferenceType() {
        return new AttachmentReferenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/base", name = "ServicePolicy")
    public JAXBElement<String> createServicePolicy(String value) {
        return new JAXBElement<String>(_ServicePolicy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/base", name = "Result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionalOutputsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/base", name = "OptionalOutputs")
    public JAXBElement<OptionalOutputsType> createOptionalOutputs(OptionalOutputsType value) {
        return new JAXBElement<OptionalOutputsType>(_OptionalOutputs_QNAME, OptionalOutputsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionalInputsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/base", name = "OptionalInputs")
    public JAXBElement<OptionalInputsType> createOptionalInputs(OptionalInputsType value) {
        return new JAXBElement<OptionalInputsType>(_OptionalInputs_QNAME, OptionalInputsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/base", name = "ServiceDescription")
    public JAXBElement<String> createServiceDescription(String value) {
        return new JAXBElement<String>(_ServiceDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/base", name = "Base64Data")
    public JAXBElement<Base64DataType> createBase64Data(Base64DataType value) {
        return new JAXBElement<Base64DataType>(_Base64Data_QNAME, Base64DataType.class, null, value);
    }

}
