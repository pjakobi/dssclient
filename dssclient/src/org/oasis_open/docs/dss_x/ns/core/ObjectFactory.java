//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.oasis_open.docs.dss_x.ns.base.ResponseBaseType;
import org.oasis_open.docs.dss_x.ns.saml2.rewritten.NameIDType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.dss_x.ns.core package. 
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

    private final static QName _SignedReferences_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignedReferences");
    private final static QName _VerifyRequest_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "VerifyRequest");
    private final static QName _Response_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "Response");
    private final static QName _IncludeObject_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "IncludeObject");
    private final static QName _InputDocuments_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "InputDocuments");
    private final static QName _SignRequest_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignRequest");
    private final static QName _ReturnProcessingDetails_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ReturnProcessingDetails");
    private final static QName _ReturnVerificationTimeInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ReturnVerificationTimeInfo");
    private final static QName _DocumentWithSignature_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "DocumentWithSignature");
    private final static QName _ReturnSignerIdentity_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ReturnSignerIdentity");
    private final static QName _Property_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "Property");
    private final static QName _ProcessingDetails_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ProcessingDetails");
    private final static QName _Language_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "Language");
    private final static QName _TimestampedSignature_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "TimestampedSignature");
    private final static QName _SignResponse_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignResponse");
    private final static QName _AddTimestamp_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "AddTimestamp");
    private final static QName _ReturnSigningTimeInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ReturnSigningTimeInfo");
    private final static QName _ClaimedIdentity_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ClaimedIdentity");
    private final static QName _ReturnTimestampedSignature_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ReturnTimestampedSignature");
    private final static QName _UseVerificationTime_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "UseVerificationTime");
    private final static QName _SignedReference_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignedReference");
    private final static QName _SignerIdentity_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignerIdentity");
    private final static QName _VerifyResponse_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "VerifyResponse");
    private final static QName _ReturnTransformedDocument_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ReturnTransformedDocument");
    private final static QName _TransformedDocument_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "TransformedDocument");
    private final static QName _ServicePolicy_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ServicePolicy");
    private final static QName _VerifyManifestResults_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "VerifyManifestResults");
    private final static QName _SignatureObject_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignatureObject");
    private final static QName _SignatureType_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignatureType");
    private final static QName _Schemas_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "Schemas");
    private final static QName _SigningTimeInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SigningTimeInfo");
    private final static QName _AugmentSignature_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "AugmentSignature");
    private final static QName _ManifestResult_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "ManifestResult");
    private final static QName _PropertiesHolder_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "PropertiesHolder");
    private final static QName _AdditionalKeyInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "AdditionalKeyInfo");
    private final static QName _VerificationTimeInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "VerificationTimeInfo");
    private final static QName _IntendedAudience_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "IntendedAudience");
    private final static QName _AdditionalTimeInfo_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "AdditionalTimeInfo");
    private final static QName _DocumentHash_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "DocumentHash");
    private final static QName _AdditionalProfile_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "AdditionalProfile");
    private final static QName _Document_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "Document");
    private final static QName _KeySelector_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "KeySelector");
    private final static QName _Schema_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "Schema");
    private final static QName _SignaturePlacement_QNAME = new QName("http://docs.oasis-open.org/dss-x/ns/core", "SignaturePlacement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.dss_x.ns.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClaimedIdentityType }
     * 
     */
    public ClaimedIdentityType createClaimedIdentityType() {
        return new ClaimedIdentityType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link SignaturePlacementType }
     * 
     */
    public SignaturePlacementType createSignaturePlacementType() {
        return new SignaturePlacementType();
    }

    /**
     * Create an instance of {@link KeySelectorType }
     * 
     */
    public KeySelectorType createKeySelectorType() {
        return new KeySelectorType();
    }

    /**
     * Create an instance of {@link ProcessingDetailsType }
     * 
     */
    public ProcessingDetailsType createProcessingDetailsType() {
        return new ProcessingDetailsType();
    }

    /**
     * Create an instance of {@link AugmentedSignatureType }
     * 
     */
    public AugmentedSignatureType createAugmentedSignatureType() {
        return new AugmentedSignatureType();
    }

    /**
     * Create an instance of {@link SignResponseType }
     * 
     */
    public SignResponseType createSignResponseType() {
        return new SignResponseType();
    }

    /**
     * Create an instance of {@link DocumentWithSignatureType }
     * 
     */
    public DocumentWithSignatureType createDocumentWithSignatureType() {
        return new DocumentWithSignatureType();
    }

    /**
     * Create an instance of {@link IntendedAudienceType }
     * 
     */
    public IntendedAudienceType createIntendedAudienceType() {
        return new IntendedAudienceType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link AdditionalTimeInfoType }
     * 
     */
    public AdditionalTimeInfoType createAdditionalTimeInfoType() {
        return new AdditionalTimeInfoType();
    }

    /**
     * Create an instance of {@link DocumentHashType }
     * 
     */
    public DocumentHashType createDocumentHashType() {
        return new DocumentHashType();
    }

    /**
     * Create an instance of {@link ManifestResultType }
     * 
     */
    public ManifestResultType createManifestResultType() {
        return new ManifestResultType();
    }

    /**
     * Create an instance of {@link PropertiesHolderType }
     * 
     */
    public PropertiesHolderType createPropertiesHolderType() {
        return new PropertiesHolderType();
    }

    /**
     * Create an instance of {@link SignRequestType }
     * 
     */
    public SignRequestType createSignRequestType() {
        return new SignRequestType();
    }

    /**
     * Create an instance of {@link AdditionalKeyInfoType }
     * 
     */
    public AdditionalKeyInfoType createAdditionalKeyInfoType() {
        return new AdditionalKeyInfoType();
    }

    /**
     * Create an instance of {@link VerificationTimeInfoType }
     * 
     */
    public VerificationTimeInfoType createVerificationTimeInfoType() {
        return new VerificationTimeInfoType();
    }

    /**
     * Create an instance of {@link VerifyManifestResultsType }
     * 
     */
    public VerifyManifestResultsType createVerifyManifestResultsType() {
        return new VerifyManifestResultsType();
    }

    /**
     * Create an instance of {@link SignatureObjectType }
     * 
     */
    public SignatureObjectType createSignatureObjectType() {
        return new SignatureObjectType();
    }

    /**
     * Create an instance of {@link SchemasType }
     * 
     */
    public SchemasType createSchemasType() {
        return new SchemasType();
    }

    /**
     * Create an instance of {@link InputDocumentsType }
     * 
     */
    public InputDocumentsType createInputDocumentsType() {
        return new InputDocumentsType();
    }

    /**
     * Create an instance of {@link SigningTimeInfoType }
     * 
     */
    public SigningTimeInfoType createSigningTimeInfoType() {
        return new SigningTimeInfoType();
    }

    /**
     * Create an instance of {@link SignedReferenceType }
     * 
     */
    public SignedReferenceType createSignedReferenceType() {
        return new SignedReferenceType();
    }

    /**
     * Create an instance of {@link IncludeObjectType }
     * 
     */
    public IncludeObjectType createIncludeObjectType() {
        return new IncludeObjectType();
    }

    /**
     * Create an instance of {@link VerifyResponseType }
     * 
     */
    public VerifyResponseType createVerifyResponseType() {
        return new VerifyResponseType();
    }

    /**
     * Create an instance of {@link ReturnTransformedDocumentType }
     * 
     */
    public ReturnTransformedDocumentType createReturnTransformedDocumentType() {
        return new ReturnTransformedDocumentType();
    }

    /**
     * Create an instance of {@link TransformedDocumentType }
     * 
     */
    public TransformedDocumentType createTransformedDocumentType() {
        return new TransformedDocumentType();
    }

    /**
     * Create an instance of {@link SignedReferencesType }
     * 
     */
    public SignedReferencesType createSignedReferencesType() {
        return new SignedReferencesType();
    }

    /**
     * Create an instance of {@link VerifyRequestType }
     * 
     */
    public VerifyRequestType createVerifyRequestType() {
        return new VerifyRequestType();
    }

    /**
     * Create an instance of {@link UseVerificationTimeType }
     * 
     */
    public UseVerificationTimeType createUseVerificationTimeType() {
        return new UseVerificationTimeType();
    }

    /**
     * Create an instance of {@link PendingRequestType }
     * 
     */
    public PendingRequestType createPendingRequestType() {
        return new PendingRequestType();
    }

    /**
     * Create an instance of {@link X509DigestType }
     * 
     */
    public X509DigestType createX509DigestType() {
        return new X509DigestType();
    }

    /**
     * Create an instance of {@link DetailType }
     * 
     */
    public DetailType createDetailType() {
        return new DetailType();
    }

    /**
     * Create an instance of {@link SigningTimeBoundariesType }
     * 
     */
    public SigningTimeBoundariesType createSigningTimeBoundariesType() {
        return new SigningTimeBoundariesType();
    }

    /**
     * Create an instance of {@link PropertiesType }
     * 
     */
    public PropertiesType createPropertiesType() {
        return new PropertiesType();
    }

    /**
     * Create an instance of {@link TransformedDataType }
     * 
     */
    public TransformedDataType createTransformedDataType() {
        return new TransformedDataType();
    }

    /**
     * Create an instance of {@link OptionalOutputsVerifyType }
     * 
     */
    public OptionalOutputsVerifyType createOptionalOutputsVerifyType() {
        return new OptionalOutputsVerifyType();
    }

    /**
     * Create an instance of {@link OptionalInputsVerifyType }
     * 
     */
    public OptionalInputsVerifyType createOptionalInputsVerifyType() {
        return new OptionalInputsVerifyType();
    }

    /**
     * Create an instance of {@link OptionalInputsSignType }
     * 
     */
    public OptionalInputsSignType createOptionalInputsSignType() {
        return new OptionalInputsSignType();
    }

    /**
     * Create an instance of {@link OptionalOutputsSignType }
     * 
     */
    public OptionalOutputsSignType createOptionalOutputsSignType() {
        return new OptionalOutputsSignType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedReferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignedReferences")
    public JAXBElement<SignedReferencesType> createSignedReferences(SignedReferencesType value) {
        return new JAXBElement<SignedReferencesType>(_SignedReferences_QNAME, SignedReferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "VerifyRequest")
    public JAXBElement<VerifyRequestType> createVerifyRequest(VerifyRequestType value) {
        return new JAXBElement<VerifyRequestType>(_VerifyRequest_QNAME, VerifyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "Response")
    public JAXBElement<ResponseBaseType> createResponse(ResponseBaseType value) {
        return new JAXBElement<ResponseBaseType>(_Response_QNAME, ResponseBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "IncludeObject")
    public JAXBElement<IncludeObjectType> createIncludeObject(IncludeObjectType value) {
        return new JAXBElement<IncludeObjectType>(_IncludeObject_QNAME, IncludeObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputDocumentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "InputDocuments")
    public JAXBElement<InputDocumentsType> createInputDocuments(InputDocumentsType value) {
        return new JAXBElement<InputDocumentsType>(_InputDocuments_QNAME, InputDocumentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignRequestType }{@code >}}
     * 
     */

    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignRequest")
    public JAXBElement<SignRequestType> createSignRequest(SignRequestType value) {
        return new JAXBElement<SignRequestType>(_SignRequest_QNAME, SignRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ReturnProcessingDetails", defaultValue = "false")
    public JAXBElement<Boolean> createReturnProcessingDetails(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnProcessingDetails_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ReturnVerificationTimeInfo", defaultValue = "false")
    public JAXBElement<Boolean> createReturnVerificationTimeInfo(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnVerificationTimeInfo_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentWithSignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "DocumentWithSignature")
    public JAXBElement<DocumentWithSignatureType> createDocumentWithSignature(DocumentWithSignatureType value) {
        return new JAXBElement<DocumentWithSignatureType>(_DocumentWithSignature_QNAME, DocumentWithSignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ReturnSignerIdentity", defaultValue = "false")
    public JAXBElement<Boolean> createReturnSignerIdentity(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnSignerIdentity_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ProcessingDetails")
    public JAXBElement<ProcessingDetailsType> createProcessingDetails(ProcessingDetailsType value) {
        return new JAXBElement<ProcessingDetailsType>(_ProcessingDetails_QNAME, ProcessingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AugmentedSignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "TimestampedSignature")
    public JAXBElement<AugmentedSignatureType> createTimestampedSignature(AugmentedSignatureType value) {
        return new JAXBElement<AugmentedSignatureType>(_TimestampedSignature_QNAME, AugmentedSignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignResponse")
    public JAXBElement<SignResponseType> createSignResponse(SignResponseType value) {
        return new JAXBElement<SignResponseType>(_SignResponse_QNAME, SignResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "AddTimestamp")
    public JAXBElement<String> createAddTimestamp(String value) {
        return new JAXBElement<String>(_AddTimestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ReturnSigningTimeInfo", defaultValue = "false")
    public JAXBElement<Boolean> createReturnSigningTimeInfo(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnSigningTimeInfo_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimedIdentityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ClaimedIdentity")
    public JAXBElement<ClaimedIdentityType> createClaimedIdentity(ClaimedIdentityType value) {
        return new JAXBElement<ClaimedIdentityType>(_ClaimedIdentity_QNAME, ClaimedIdentityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ReturnTimestampedSignature", defaultValue = "false")
    public JAXBElement<Boolean> createReturnTimestampedSignature(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnTimestampedSignature_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseVerificationTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "UseVerificationTime")
    public JAXBElement<UseVerificationTimeType> createUseVerificationTime(UseVerificationTimeType value) {
        return new JAXBElement<UseVerificationTimeType>(_UseVerificationTime_QNAME, UseVerificationTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignedReference")
    public JAXBElement<SignedReferenceType> createSignedReference(SignedReferenceType value) {
        return new JAXBElement<SignedReferenceType>(_SignedReference_QNAME, SignedReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignerIdentity")
    public JAXBElement<NameIDType> createSignerIdentity(NameIDType value) {
        return new JAXBElement<NameIDType>(_SignerIdentity_QNAME, NameIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "VerifyResponse")
    public JAXBElement<VerifyResponseType> createVerifyResponse(VerifyResponseType value) {
        return new JAXBElement<VerifyResponseType>(_VerifyResponse_QNAME, VerifyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTransformedDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ReturnTransformedDocument")
    public JAXBElement<ReturnTransformedDocumentType> createReturnTransformedDocument(ReturnTransformedDocumentType value) {
        return new JAXBElement<ReturnTransformedDocumentType>(_ReturnTransformedDocument_QNAME, ReturnTransformedDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformedDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "TransformedDocument")
    public JAXBElement<TransformedDocumentType> createTransformedDocument(TransformedDocumentType value) {
        return new JAXBElement<TransformedDocumentType>(_TransformedDocument_QNAME, TransformedDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ServicePolicy")
    public JAXBElement<String> createServicePolicy(String value) {
        return new JAXBElement<String>(_ServicePolicy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyManifestResultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "VerifyManifestResults")
    public JAXBElement<VerifyManifestResultsType> createVerifyManifestResults(VerifyManifestResultsType value) {
        return new JAXBElement<VerifyManifestResultsType>(_VerifyManifestResults_QNAME, VerifyManifestResultsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignatureObject")
    public JAXBElement<SignatureObjectType> createSignatureObject(SignatureObjectType value) {
        return new JAXBElement<SignatureObjectType>(_SignatureObject_QNAME, SignatureObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignatureType")
    public JAXBElement<String> createSignatureType(String value) {
        return new JAXBElement<String>(_SignatureType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchemasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "Schemas")
    public JAXBElement<SchemasType> createSchemas(SchemasType value) {
        return new JAXBElement<SchemasType>(_Schemas_QNAME, SchemasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SigningTimeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SigningTimeInfo")
    public JAXBElement<SigningTimeInfoType> createSigningTimeInfo(SigningTimeInfoType value) {
        return new JAXBElement<SigningTimeInfoType>(_SigningTimeInfo_QNAME, SigningTimeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AugmentedSignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "AugmentSignature")
    public JAXBElement<AugmentedSignatureType> createAugmentSignature(AugmentedSignatureType value) {
        return new JAXBElement<AugmentedSignatureType>(_AugmentSignature_QNAME, AugmentedSignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "ManifestResult")
    public JAXBElement<ManifestResultType> createManifestResult(ManifestResultType value) {
        return new JAXBElement<ManifestResultType>(_ManifestResult_QNAME, ManifestResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertiesHolderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "PropertiesHolder")
    public JAXBElement<PropertiesHolderType> createPropertiesHolder(PropertiesHolderType value) {
        return new JAXBElement<PropertiesHolderType>(_PropertiesHolder_QNAME, PropertiesHolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalKeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "AdditionalKeyInfo")
    public JAXBElement<AdditionalKeyInfoType> createAdditionalKeyInfo(AdditionalKeyInfoType value) {
        return new JAXBElement<AdditionalKeyInfoType>(_AdditionalKeyInfo_QNAME, AdditionalKeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationTimeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "VerificationTimeInfo")
    public JAXBElement<VerificationTimeInfoType> createVerificationTimeInfo(VerificationTimeInfoType value) {
        return new JAXBElement<VerificationTimeInfoType>(_VerificationTimeInfo_QNAME, VerificationTimeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntendedAudienceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "IntendedAudience")
    public JAXBElement<IntendedAudienceType> createIntendedAudience(IntendedAudienceType value) {
        return new JAXBElement<IntendedAudienceType>(_IntendedAudience_QNAME, IntendedAudienceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalTimeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "AdditionalTimeInfo")
    public JAXBElement<AdditionalTimeInfoType> createAdditionalTimeInfo(AdditionalTimeInfoType value) {
        return new JAXBElement<AdditionalTimeInfoType>(_AdditionalTimeInfo_QNAME, AdditionalTimeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentHashType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "DocumentHash")
    public JAXBElement<DocumentHashType> createDocumentHash(DocumentHashType value) {
        return new JAXBElement<DocumentHashType>(_DocumentHash_QNAME, DocumentHashType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "AdditionalProfile")
    public JAXBElement<String> createAdditionalProfile(String value) {
        return new JAXBElement<String>(_AdditionalProfile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "Document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeySelectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "KeySelector")
    public JAXBElement<KeySelectorType> createKeySelector(KeySelectorType value) {
        return new JAXBElement<KeySelectorType>(_KeySelector_QNAME, KeySelectorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "Schema")
    public JAXBElement<DocumentType> createSchema(DocumentType value) {
        return new JAXBElement<DocumentType>(_Schema_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePlacementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/dss-x/ns/core", name = "SignaturePlacement")
    public JAXBElement<SignaturePlacementType> createSignaturePlacement(SignaturePlacementType value) {
        return new JAXBElement<SignaturePlacementType>(_SignaturePlacement_QNAME, SignaturePlacementType.class, null, value);
    }

}
