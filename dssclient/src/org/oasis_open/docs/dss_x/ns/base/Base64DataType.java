//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.oasis_open.docs.dss_x.ns.xmldsig.rewritten.TransformsType;


/**
 * <p>Classe Java pour Base64DataType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Base64DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="AttRef" type="{http://docs.oasis-open.org/dss-x/ns/base}AttachmentReferenceType"/>
 *         &lt;/choice>
 *         &lt;element name="Transforms" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}TransformsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="IDREF" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Base64DataType", propOrder = {
    "value",
    "attRef",
    "transforms"
})
@XmlSeeAlso({
    AnyType.class
})
public class Base64DataType {

    @XmlElement(name = "Value")
    protected byte[] value;
    @XmlElement(name = "AttRef")
    protected AttachmentReferenceType attRef;
    @XmlElement(name = "Transforms")
    protected TransformsType transforms;
    @XmlAttribute(name = "MimeType")
    protected String mimeType;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "IDREF")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object idref;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété attRef.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentReferenceType }
     *     
     */
    public AttachmentReferenceType getAttRef() {
        return attRef;
    }

    /**
     * Définit la valeur de la propriété attRef.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentReferenceType }
     *     
     */
    public void setAttRef(AttachmentReferenceType value) {
        this.attRef = value;
    }

    /**
     * Obtient la valeur de la propriété transforms.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Définit la valeur de la propriété transforms.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Obtient la valeur de la propriété mimeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Définit la valeur de la propriété mimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété idref.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIDREF() {
        return idref;
    }

    /**
     * Définit la valeur de la propriété idref.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIDREF(Object value) {
        this.idref = value;
    }

}
