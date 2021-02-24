//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.xmldsig.rewritten.TransformsType;


/**
 * <p>Classe Java pour SignedReferenceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignedReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transforms" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}TransformsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="RefURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="RefId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedReferenceType", propOrder = {
    "transforms"
})
public class SignedReferenceType {

    @XmlElement(name = "Transforms")
    protected TransformsType transforms;
    @XmlAttribute(name = "WhichDocument", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichDocument;
    @XmlAttribute(name = "RefURI")
    @XmlSchemaType(name = "anyURI")
    protected String refURI;
    @XmlAttribute(name = "RefId")
    protected String refId;

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
     * Obtient la valeur de la propriété whichDocument.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWhichDocument() {
        return whichDocument;
    }

    /**
     * Définit la valeur de la propriété whichDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWhichDocument(Object value) {
        this.whichDocument = value;
    }

    /**
     * Obtient la valeur de la propriété refURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefURI() {
        return refURI;
    }

    /**
     * Définit la valeur de la propriété refURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefURI(String value) {
        this.refURI = value;
    }

    /**
     * Obtient la valeur de la propriété refId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Définit la valeur de la propriété refId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
