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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour IncludeObjectType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IncludeObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="WhichData" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="HasObjectTagsAndAttributesSet" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ObjId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createReference" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeObjectType")
public class IncludeObjectType {

    @XmlAttribute(name = "WhichData")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichData;
    @XmlAttribute(name = "HasObjectTagsAndAttributesSet")
    protected Boolean hasObjectTagsAndAttributesSet;
    @XmlAttribute(name = "ObjId")
    protected String objId;
    @XmlAttribute(name = "createReference")
    protected Boolean createReference;

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
     * Obtient la valeur de la propriété hasObjectTagsAndAttributesSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasObjectTagsAndAttributesSet() {
        if (hasObjectTagsAndAttributesSet == null) {
            return false;
        } else {
            return hasObjectTagsAndAttributesSet;
        }
    }

    /**
     * Définit la valeur de la propriété hasObjectTagsAndAttributesSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasObjectTagsAndAttributesSet(Boolean value) {
        this.hasObjectTagsAndAttributesSet = value;
    }

    /**
     * Obtient la valeur de la propriété objId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjId() {
        return objId;
    }

    /**
     * Définit la valeur de la propriété objId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjId(String value) {
        this.objId = value;
    }

    /**
     * Obtient la valeur de la propriété createReference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreateReference() {
        if (createReference == null) {
            return true;
        } else {
            return createReference;
        }
    }

    /**
     * Définit la valeur de la propriété createReference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateReference(Boolean value) {
        this.createReference = value;
    }

}
