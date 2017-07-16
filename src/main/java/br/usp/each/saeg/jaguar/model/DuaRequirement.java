package br.usp.each.saeg.jaguar.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents the Dua Requirement.
 *
 * Created by henrique on 7/9/17.
 */
@XmlRootElement
public class DuaRequirement extends Requirement {

    @Override
    public Type getType() {
        return Type.DUA;
    }

    private Integer index;
    private Integer def;
    private Integer use;
    private Integer target;
    private String var;

    @XmlAttribute
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @XmlAttribute
    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    @XmlAttribute
    public Integer getUse() {
        return use;
    }

    public void setUse(Integer use) {
        this.use = use;
    }

    @XmlAttribute
    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    @XmlAttribute
    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "DuaRequirement{" +
                "location='" + location + '\'' +
                ", position=" + position +
                ", suspiciousValue=" + suspiciousValue +
                ", def=" + def +
                ", use=" + use +
                ", target=" + target +
                ", var='" + var + '\'' +
                ", index=" + index +
                ", cef=" + cef +
                ", cep=" + cep +
                ", cnf=" + cnf +
                ", cnp=" + cnp +
                '}';
    }
}