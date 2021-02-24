//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.xmldsig.rewritten;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.dss_x.ns.xmldsig.rewritten package. 
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

    private final static QName _DSAKeyValue_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "DSAKeyValue");
    private final static QName _RetrievalMethod_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "RetrievalMethod");
    private final static QName _PGPData_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "PGPData");
    private final static QName _SignatureMethod_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SignatureMethod");
    private final static QName _Object_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Object");
    private final static QName _RSAKeyValue_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "RSAKeyValue");
    private final static QName _SignatureProperty_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SignatureProperty");
    private final static QName _KeyInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "KeyInfo");
    private final static QName _Manifest_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Manifest");
    private final static QName _SignedInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SignedInfo");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "CanonicalizationMethod");
    private final static QName _DigestValue_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "DigestValue");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Reference");
    private final static QName _Transform_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Transform");
    private final static QName _SignatureProperties_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SignatureProperties");
    private final static QName _MgmtData_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "MgmtData");
    private final static QName _Signature_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Signature");
    private final static QName _KeyName_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "KeyName");
    private final static QName _X509Data_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "X509Data");
    private final static QName _DigestMethod_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "DigestMethod");
    private final static QName _Transforms_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Transforms");
    private final static QName _KeyValue_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "KeyValue");
    private final static QName _SignatureValue_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SignatureValue");
    private final static QName _SPKIData_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SPKIData");
    private final static QName _SignaturePropertyTypeBase64Content_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "Base64Content");
    private final static QName _PGPDataTypePGPKeyID_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "PGPKeyID");
    private final static QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "PGPKeyPacket");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", "SPKISexp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.dss_x.ns.xmldsig.rewritten
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<SignaturePropertiesType>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<DigestMethodType>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<SignatureValueType>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Base64Content", scope = SignaturePropertyType.class)
    public JAXBElement<byte[]> createSignaturePropertyTypeBase64Content(byte[] value) {
        return new JAXBElement<byte[]>(_SignaturePropertyTypeBase64Content_QNAME, byte[].class, SignaturePropertyType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "DSAKeyValue", scope = KeyValueType.class)
    public JAXBElement<DSAKeyValueType> createKeyValueTypeDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, KeyValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "RSAKeyValue", scope = KeyValueType.class)
    public JAXBElement<RSAKeyValueType> createKeyValueTypeRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, KeyValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Base64Content", scope = KeyValueType.class)
    public JAXBElement<byte[]> createKeyValueTypeBase64Content(byte[] value) {
        return new JAXBElement<byte[]>(_SignaturePropertyTypeBase64Content_QNAME, byte[].class, KeyValueType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Base64Content", scope = ObjectType.class)
    public JAXBElement<byte[]> createObjectTypeBase64Content(byte[] value) {
        return new JAXBElement<byte[]>(_SignaturePropertyTypeBase64Content_QNAME, byte[].class, ObjectType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "PGPKeyID", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyID(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "PGPKeyPacket", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "X509Data", scope = KeyInfoType.class)
    public JAXBElement<X509DataType> createKeyInfoTypeX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "MgmtData", scope = KeyInfoType.class)
    public JAXBElement<String> createKeyInfoTypeMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "RetrievalMethod", scope = KeyInfoType.class)
    public JAXBElement<RetrievalMethodType> createKeyInfoTypeRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "PGPData", scope = KeyInfoType.class)
    public JAXBElement<PGPDataType> createKeyInfoTypePGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SPKIData", scope = KeyInfoType.class)
    public JAXBElement<SPKIDataType> createKeyInfoTypeSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "KeyName", scope = KeyInfoType.class)
    public JAXBElement<String> createKeyInfoTypeKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "KeyValue", scope = KeyInfoType.class)
    public JAXBElement<KeyValueType> createKeyInfoTypeKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Base64Content", scope = KeyInfoType.class)
    public JAXBElement<byte[]> createKeyInfoTypeBase64Content(byte[] value) {
        return new JAXBElement<byte[]>(_SignaturePropertyTypeBase64Content_QNAME, byte[].class, KeyInfoType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", name = "Base64Content", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeBase64Content(byte[] value) {
        return new JAXBElement<byte[]>(_SignaturePropertyTypeBase64Content_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

}
