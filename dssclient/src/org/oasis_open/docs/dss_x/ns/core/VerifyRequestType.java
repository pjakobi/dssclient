//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.base.RequestBaseType;


/**
 * <p>Classe Java pour VerifyRequestType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerifyRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/base}RequestBaseType">
 *       &lt;sequence>
 *         &lt;element name="InputDocuments" type="{http://docs.oasis-open.org/dss-x/ns/core}InputDocumentsType" minOccurs="0"/>
 *         &lt;element name="OptionalInputs" type="{http://docs.oasis-open.org/dss-x/ns/core}OptionalInputsVerifyType" minOccurs="0"/>
 *         &lt;element name="SignatureObject" type="{http://docs.oasis-open.org/dss-x/ns/core}SignatureObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyRequestType", propOrder = {
    "inputDocuments",
    "optionalInputs",
    "signatureObject"
})
@XmlRootElement
public class VerifyRequestType
    extends RequestBaseType
{

    @XmlElement(name = "InputDocuments")
    protected InputDocumentsType inputDocuments;
    @XmlElement(name = "OptionalInputs")
    protected OptionalInputsVerifyType optionalInputs;
    @XmlElement(name = "SignatureObject")
    protected List<SignatureObjectType> signatureObject;

    /**
     * Obtient la valeur de la propriété inputDocuments.
     * 
     * @return
     *     possible object is
     *     {@link InputDocumentsType }
     *     
     */
    public InputDocumentsType getInputDocuments() {
        return inputDocuments;
    }

    /**
     * Définit la valeur de la propriété inputDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link InputDocumentsType }
     *     
     */
    public void setInputDocuments(InputDocumentsType value) {
        this.inputDocuments = value;
    }

    /**
     * Obtient la valeur de la propriété optionalInputs.
     * 
     * @return
     *     possible object is
     *     {@link OptionalInputsVerifyType }
     *     
     */
    public OptionalInputsVerifyType getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Définit la valeur de la propriété optionalInputs.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalInputsVerifyType }
     *     
     */
    public void setOptionalInputs(OptionalInputsVerifyType value) {
        this.optionalInputs = value;
    }

    /**
     * Gets the value of the signatureObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureObjectType }
     * 
     * 
     */
    public List<SignatureObjectType> getSignatureObject() {
        if (signatureObject == null) {
            signatureObject = new ArrayList<SignatureObjectType>();
        }
        return this.signatureObject;
    }

}
