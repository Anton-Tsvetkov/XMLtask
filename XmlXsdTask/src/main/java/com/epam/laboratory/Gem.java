package com.epam.laboratory;//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.05.12 at 09:49:47 AM MSK
//



/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gem_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preciousness">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="semi_preciousness"/>
 *               &lt;enumeration value="preciousness"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visual_params" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transparency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="number_of_faces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

public class Gem {

    protected String name;
    protected String preciousness;
    protected String origin;
    protected String visualParams;
    protected String color;
    protected int transparency;
    protected int numberOfFaces;
    protected double value;

    /**
     * Gets the value of the gemName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the gemName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the preciousness property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreciousness() {
        return preciousness;
    }

    /**
     * Sets the value of the preciousness property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreciousness(String value) {
        this.preciousness = value;
    }

    /**
     * Gets the value of the origin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the visualParams property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVisualParams() {
        return visualParams;
    }

    /**
     * Sets the value of the visualParams property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVisualParams(String value) {
        this.visualParams = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the transparency property.
     *
     */
    public int getTransparency() {
        return transparency;
    }

    /**
     * Sets the value of the transparency property.
     *
     */
    public void setTransparency(int value) {
        this.transparency = value;
    }

    /**
     * Gets the value of the numberOfFaces property.
     *
     */
    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    /**
     * Sets the value of the numberOfFaces property.
     *
     */
    public void setNumberOfFaces(int value) {
        this.numberOfFaces = value;
    }

    /**
     * Gets the value of the value property.
     *
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     */
    public void setValue(double value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Gem{" +
                "gemName='" + name + '\'' +
                ", preciousness='" + preciousness + '\'' +
                ", origin='" + origin + '\'' +
                ", visualParams='" + visualParams + '\'' +
                ", color='" + color + '\'' +
                ", transparensy=" + transparency +
                ", numberOfFaces=" + numberOfFaces +
                ", value=" + value +
                '}';
    }
}
