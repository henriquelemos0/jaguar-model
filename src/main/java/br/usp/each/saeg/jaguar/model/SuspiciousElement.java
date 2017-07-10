package br.usp.each.saeg.jaguar.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by henrique on 7/9/17.
 */
public abstract class SuspiciousElement {

    protected String location;

    protected Integer position = 0;
    protected BigDecimal suspiciousValue = BigDecimal.ZERO;

    /**
     *  Fields to calculate suspicioiuness
     */
    protected int cef = 0;
    protected int cep = 0;
    protected int cnf = 0;
    protected int cnp = 0;

    /**
     * Return its children (e.g. packages should return classes). If it has no
     * children (e.g. Requirements) return null.
     */
    public abstract Collection<? extends SuspiciousElement> getChildren();

    /**
     * Return the position of the element regarding the suspicious rank
     */
    @XmlAttribute
    public Integer getPosition() {
        return position;
    }

    /**
     * Set the position of the element regarding the suspicious rank
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Return the location of the element (package.class.method.linenumber)
     */
    //@XmlAttribute
    public String getLocation() {
        return location;
    }

    /**
     * Set the location of the element (package.class.method.linenumber)
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Return how many times the element was executed on failing tests.
     *
     * @return how many times the element was executed on failing tests.
     */
    @XmlAttribute
    public Integer getCef() {
        return cef;
    }

    public void setCef(Integer cef) {
        this.cef = cef;
    }

    /**
     * Return how many times the element was executed on passing tests.
     *
     * @return how many times the element was executed on passing tests.
     */
    @XmlAttribute
    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    /**
     * Return how many times the element was NOT executed on failing tests.
     *
     * @return how many times the element was NOT executed on failing tests.
     */
    @XmlAttribute
    public Integer getCnf() {
        return cnf;
    }

    public void setCnf(Integer cnf) {
        this.cnf = cnf;
    }

    /**
     * Return how many times the element was NOT executed on passing tests.
     *
     * @return how many times the element was NOT executed on passing tests.
     */
    @XmlAttribute
    public Integer getCnp() {
        return cnp;
    }

    public void setCnp(Integer cnp) {
        this.cnp = cnp;
    }

    /**
     * Return the suspicious value of the element. For package, class or method
     * represent its children's maximum suspicious value.
     */
    @XmlAttribute(name = "suspicious-value")
    public BigDecimal getSuspiciousValue() {
        return suspiciousValue;
    }

    /**
     * Set the suspicious value of the element. For package, class or method
     * represent its children's maximum suspicious value.
     */
    public void setSuspiciousValue(BigDecimal suspiciousValue) {
        this.suspiciousValue = suspiciousValue;
    }

    @Override
    public int hashCode() {
        return (location == null) ? 0 : location.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SuspiciousElement other = (SuspiciousElement) obj;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SuspiciousElement{" +
                "location='" + location + '\'' +
                ", position=" + position +
                ", suspiciousValue=" + suspiciousValue +
                ", cef=" + cef +
                ", cep=" + cep +
                ", cnf=" + cnf +
                ", cnp=" + cnp +
                '}';
    }

    public int compareTo(SuspiciousElement other) {
        return this.suspiciousValue.compareTo(other.getSuspiciousValue());
    }

}
