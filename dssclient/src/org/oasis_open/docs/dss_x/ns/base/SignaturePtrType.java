//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.base;

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
 * <p>Classe Java pour SignaturePtrType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignaturePtrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NsPrefixMapping" type="{http://docs.oasis-open.org/dss-x/ns/nsList}NsPrefixMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichData" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="XPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XPathQualifier" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.w3.org/TR/2010/REC-xpath20-20101214/" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePtrType", propOrder = {
    "nsPrefixMapping"
})
public class SignaturePtrType {

    @XmlElement(name = "NsPrefixMapping")
    protected List<NsPrefixMappingType> nsPrefixMapping;
    @XmlAttribute(name = "WhichData", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichData;
    @XmlAttribute(name = "XPath")
    protected String xPath;
    @XmlAttribute(name = "XPathQualifier")
    @XmlSchemaType(name = "anyURI")
    protected String xPathQualifier;

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
     * Obtient la valeur de la propriété xPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Définit la valeur de la propriété xPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Obtient la valeur de la propriété xPathQualifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathQualifier() {
        if (xPathQualifier == null) {
            return "http://www.w3.org/TR/2010/REC-xpath20-20101214/";
        } else {
            return xPathQualifier;
        }
    }

    /**
     * Définit la valeur de la propriété xPathQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathQualifier(String value) {
        this.xPathQualifier = value;
    }

}
