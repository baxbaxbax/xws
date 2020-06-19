//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.19 at 12:09:16 PM CEST 
//


package xws.team16.carservice.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdDTO_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdDTO_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cdwAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pickUpPlace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="allowedKilometrage" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="priceListId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element ref="{https://ftn.uns.ac.rs/ad}CarDTO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdDTO_type", propOrder = {
    "id",
    "cdwAvailable",
    "pickUpPlace",
    "fromDate",
    "toDate",
    "allowedKilometrage",
    "priceListId",
    "carDTO"
})
public class AdDTOType {

    protected long id;
    protected boolean cdwAvailable;
    @XmlElement(required = true)
    protected String pickUpPlace;
    protected long fromDate;
    protected long toDate;
    protected double allowedKilometrage;
    protected long priceListId;
    @XmlElement(name = "CarDTO", required = true)
    protected CarDTOType carDTO;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the cdwAvailable property.
     * 
     */
    public boolean isCdwAvailable() {
        return cdwAvailable;
    }

    /**
     * Sets the value of the cdwAvailable property.
     * 
     */
    public void setCdwAvailable(boolean value) {
        this.cdwAvailable = value;
    }

    /**
     * Gets the value of the pickUpPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpPlace() {
        return pickUpPlace;
    }

    /**
     * Sets the value of the pickUpPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpPlace(String value) {
        this.pickUpPlace = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     */
    public long getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     */
    public void setFromDate(long value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     */
    public long getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     */
    public void setToDate(long value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the allowedKilometrage property.
     * 
     */
    public double getAllowedKilometrage() {
        return allowedKilometrage;
    }

    /**
     * Sets the value of the allowedKilometrage property.
     * 
     */
    public void setAllowedKilometrage(double value) {
        this.allowedKilometrage = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     */
    public long getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     */
    public void setPriceListId(long value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the carDTO property.
     * 
     * @return
     *     possible object is
     *     {@link CarDTOType }
     *     
     */
    public CarDTOType getCarDTO() {
        return carDTO;
    }

    /**
     * Sets the value of the carDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarDTOType }
     *     
     */
    public void setCarDTO(CarDTOType value) {
        this.carDTO = value;
    }

}
