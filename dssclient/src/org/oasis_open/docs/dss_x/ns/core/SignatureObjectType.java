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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.base.Base64DataType;
import org.oasis_open.docs.dss_x.ns.base.SignaturePtrType;


/**
 * <p>Classe Java pour SignatureObjectType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Base64Signature" type="{http://docs.oasis-open.org/dss-x/ns/base}Base64DataType"/>
 *         &lt;element name="SignaturePtr" type="{http://docs.oasis-open.org/dss-x/ns/base}SignaturePtrType"/>
 *       &lt;/choice>
 *       &lt;attribute name="SchemaRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="WhichDoc" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureObjectType", propOrder = {
    "base64Signature",
    "signaturePtr"
})
public class SignatureObjectType {

    @XmlElement(name = "Base64Signature")
    protected Base64DataType base64Signature;
    @XmlElement(name = "SignaturePtr")
    protected SignaturePtrType signaturePtr;
    @XmlAttribute(name = "SchemaRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> schemaRefs;
    @XmlAttribute(name = "WhichDoc")
    @XmlSchemaType(name = "anyURI")
    protected String whichDoc;

    /**
     * Obtient la valeur de la propriété base64Signature.
     * 
     * @return
     *     possible object is
     *     {@link Base64DataType }
     *     
     */
    public Base64DataType getBase64Signature() {
        return base64Signature;
    }

    /**
     * Définit la valeur de la propriété base64Signature.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64DataType }
     *     
     */
    public void setBase64Signature(Base64DataType value) {
        this.base64Signature = value;
    }

    /**
     * Obtient la valeur de la propriété signaturePtr.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePtrType }
     *     
     */
    public SignaturePtrType getSignaturePtr() {
        return signaturePtr;
    }

    /**
     * Définit la valeur de la propriété signaturePtr.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePtrType }
     *     
     */
    public void setSignaturePtr(SignaturePtrType value) {
        this.signaturePtr = value;
    }

    /**
     * Gets the value of the schemaRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemaRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemaRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSchemaRefs() {
        if (schemaRefs == null) {
            schemaRefs = new ArrayList<Object>();
        }
        return this.schemaRefs;
    }

    /**
     * Obtient la valeur de la propriété whichDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhichDoc() {
        return whichDoc;
    }

    /**
     * Définit la valeur de la propriété whichDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhichDoc(String value) {
        this.whichDoc = value;
    }

}
