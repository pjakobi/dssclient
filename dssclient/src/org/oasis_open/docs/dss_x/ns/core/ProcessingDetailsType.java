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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProcessingDetailsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidDetail" type="{http://docs.oasis-open.org/dss-x/ns/core}DetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndeterminateDetail" type="{http://docs.oasis-open.org/dss-x/ns/core}DetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvalidDetail" type="{http://docs.oasis-open.org/dss-x/ns/core}DetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingDetailsType", propOrder = {
    "validDetail",
    "indeterminateDetail",
    "invalidDetail"
})
public class ProcessingDetailsType {

    @XmlElement(name = "ValidDetail")
    protected List<DetailType> validDetail;
    @XmlElement(name = "IndeterminateDetail")
    protected List<DetailType> indeterminateDetail;
    @XmlElement(name = "InvalidDetail")
    protected List<DetailType> invalidDetail;

    /**
     * Gets the value of the validDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getValidDetail() {
        if (validDetail == null) {
            validDetail = new ArrayList<DetailType>();
        }
        return this.validDetail;
    }

    /**
     * Gets the value of the indeterminateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indeterminateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndeterminateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getIndeterminateDetail() {
        if (indeterminateDetail == null) {
            indeterminateDetail = new ArrayList<DetailType>();
        }
        return this.indeterminateDetail;
    }

    /**
     * Gets the value of the invalidDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invalidDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvalidDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getInvalidDetail() {
        if (invalidDetail == null) {
            invalidDetail = new ArrayList<DetailType>();
        }
        return this.invalidDetail;
    }

}
