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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DocumentWithSignatureType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentWithSignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://docs.oasis-open.org/dss-x/ns/core}DocumentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichDoc" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentWithSignatureType", propOrder = {
    "document"
})
public class DocumentWithSignatureType {

    @XmlElement(name = "Document", required = true)
    protected DocumentType document;
    @XmlAttribute(name = "WhichDoc")
    @XmlSchemaType(name = "anyURI")
    protected String whichDoc;

    /**
     * Obtient la valeur de la propriété document.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Définit la valeur de la propriété document.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
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
