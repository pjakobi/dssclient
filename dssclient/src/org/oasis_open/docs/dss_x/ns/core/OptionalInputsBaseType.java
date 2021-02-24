//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.base.OptionalInputsType;


/**
 * <p>Classe Java pour OptionalInputsBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalInputsBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/base}OptionalInputsType">
 *       &lt;sequence>
 *         &lt;element name="ClaimedIdentity" type="{http://docs.oasis-open.org/dss-x/ns/core}ClaimedIdentityType" minOccurs="0"/>
 *         &lt;element name="Schemas" type="{http://docs.oasis-open.org/dss-x/ns/core}SchemasType" minOccurs="0"/>
 *         &lt;element name="AddTimestamp" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EnforceAsynchronousProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Nonce" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalInputsBaseType", propOrder = {
    "claimedIdentity",
    "schemas",
    "addTimestamp",
    "enforceAsynchronousProcessing",
    "nonce"
})
@XmlSeeAlso({
    OptionalInputsVerifyType.class,
    OptionalInputsSignType.class
})
public abstract class OptionalInputsBaseType
    extends OptionalInputsType
{

    @XmlElement(name = "ClaimedIdentity")
    protected ClaimedIdentityType claimedIdentity;
    @XmlElement(name = "Schemas")
    protected SchemasType schemas;
    @XmlElement(name = "AddTimestamp")
    @XmlSchemaType(name = "anyURI")
    protected List<String> addTimestamp;
    @XmlElement(name = "EnforceAsynchronousProcessing", defaultValue = "false")
    protected Boolean enforceAsynchronousProcessing;
    @XmlElement(name = "Nonce")
    protected BigInteger nonce;

    /**
     * Obtient la valeur de la propriété claimedIdentity.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedIdentityType }
     *     
     */
    public ClaimedIdentityType getClaimedIdentity() {
        return claimedIdentity;
    }

    /**
     * Définit la valeur de la propriété claimedIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedIdentityType }
     *     
     */
    public void setClaimedIdentity(ClaimedIdentityType value) {
        this.claimedIdentity = value;
    }

    /**
     * Obtient la valeur de la propriété schemas.
     * 
     * @return
     *     possible object is
     *     {@link SchemasType }
     *     
     */
    public SchemasType getSchemas() {
        return schemas;
    }

    /**
     * Définit la valeur de la propriété schemas.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemasType }
     *     
     */
    public void setSchemas(SchemasType value) {
        this.schemas = value;
    }

    /**
     * Gets the value of the addTimestamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addTimestamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddTimestamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddTimestamp() {
        if (addTimestamp == null) {
            addTimestamp = new ArrayList<String>();
        }
        return this.addTimestamp;
    }

    /**
     * Obtient la valeur de la propriété enforceAsynchronousProcessing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceAsynchronousProcessing() {
        return enforceAsynchronousProcessing;
    }

    /**
     * Définit la valeur de la propriété enforceAsynchronousProcessing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceAsynchronousProcessing(Boolean value) {
        this.enforceAsynchronousProcessing = value;
    }

    /**
     * Obtient la valeur de la propriété nonce.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonce() {
        return nonce;
    }

    /**
     * Définit la valeur de la propriété nonce.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonce(BigInteger value) {
        this.nonce = value;
    }

}
