package br.usp.each.saeg.jaguar.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents the Dua Requirement.
 *
 * Created by henrique on 7/9/17.
 */
@XmlRootElement(name = "duaRequirement")
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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getUse() {
        return use;
    }

    public void setUse(Integer use) {
        this.use = use;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

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
//    @Override
//    public String toString() {
//        return "DuaRequirement{" +
//                "Type='" + getType() + '\'' +
//                ", location='" + location + '\'' +
//                ", position=" + position +
//                ", suspiciousValue=" + suspiciousValue +
//                ", cef=" + cef +
//                ", cep=" + cep +
//                ", cnf=" + cnf +
//                ", cnp=" + cnp +
//                '}';
//    }
}