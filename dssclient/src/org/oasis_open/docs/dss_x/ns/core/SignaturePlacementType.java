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
import org.oasis_open.docs.dss_x.ns.nslist.NsPrefixMappingType;


/**
 * <p>Classe Java pour SignaturePlacementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignaturePlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="XPathAfter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="XPathFirstChildOf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="NsPrefixMapping" type="{http://docs.oasis-open.org/dss-x/ns/nsList}NsPrefixMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichData" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="CreateEnvelopedSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePlacementType", propOrder = {
    "xPathAfter",
    "xPathFirstChildOf",
    "nsPrefixMapping"
})
public class SignaturePlacementType {

    @XmlElement(name = "XPathAfter")
    protected String xPathAfter;
    @XmlElement(name = "XPathFirstChildOf")
    protected String xPathFirstChildOf;
    @XmlElement(name = "NsPrefixMapping")
    protected List<NsPrefixMappingType> nsPrefixMapping;
    @XmlAttribute(name = "WhichData")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichData;
    @XmlAttribute(name = "CreateEnvelopedSignature")
    protected Boolean createEnvelopedSignature;

    /**
     * Obtient la valeur de la propriété xPathAfter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathAfter() {
        return xPathAfter;
    }

    /**
     * Définit la valeur de la propriété xPathAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathAfter(String value) {
        this.xPathAfter = value;
    }

    /**
     * Obtient la valeur de la propriété xPathFirstChildOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathFirstChildOf() {
        return xPathFirstChildOf;
    }

    /**
     * Définit la valeur de la propriété xPathFirstChildOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathFirstChildOf(String value) {
        this.xPathFirstChildOf = value;
    }

    /**
     * Gets the value of the nsPrefixMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsPrefixMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsPrefixMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsPrefixMappingType }
     * 
     * 
     */
    public List<NsPrefixMappingType> getNsPrefixMapping() {
        if (nsPrefixMapping == null) {
            nsPrefixMapping = new ArrayList<NsPrefixMappingType>();
        }
        return this.nsPrefixMapping;
    }

    /**
     * Obtient la valeur de la propriété whichData.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWhichData() {
        return whichData;
    }

    /**
     * Définit la valeur de la propriété whichData.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWhichData(Object value) {
        this.whichData = value;
    }

    /**
     * Obtient la valeur de la propriété createEnvelopedSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreateEnvelopedSignature() {
        if (createEnvelopedSignature == null) {
            return true;
        } else {
            return createEnvelopedSignature;
        }
    }

    /**
     * Définit la valeur de la propriété createEnvelopedSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateEnvelopedSignature(Boolean value) {
        this.createEnvelopedSignature = value;
    }

}
