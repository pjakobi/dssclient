//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.xmldsig.rewritten;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour KeyInfoType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="KeyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="KeyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KeyValue" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}KeyValueType"/>
 *         &lt;element name="RetrievalMethod" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}RetrievalMethodType"/>
 *         &lt;element name="X509Data" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}X509DataType"/>
 *         &lt;element name="PGPData" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}PGPDataType"/>
 *         &lt;element name="SPKIData" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}SPKIDataType"/>
 *         &lt;element name="MgmtData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Base64Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyInfoType", propOrder = {
    "content"
})
public class KeyInfoType {

    @XmlElementRefs({
        @XmlElementRef(name = "PGPData", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Base64Content", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MgmtData", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "KeyName", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509Data", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SPKIData", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "KeyValue", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RetrievalMethod", namespace = "http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link X509DataType }{@code >}
     * {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

}
