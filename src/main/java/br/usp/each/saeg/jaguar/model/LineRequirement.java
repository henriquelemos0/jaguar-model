package br.usp.each.saeg.jaguar.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by henrique on 7/9/17.
 */
@XmlRootElement(name = "lineRequirement")
public class LineRequirement extends Requirement {

    @Override
    public Type getType() {
        return Type.LINE;
    }

    @Override
    public String toString() {
        return "LineRequirement{" +
                "Type='" + getType() + '\'' +
                "location='" + location + '\'' +
                ", position=" + position +
                ", suspiciousValue=" + suspiciousValue +
                ", cef=" + cef +
                ", cep=" + cep +
                ", cnf=" + cnf +
                ", cnp=" + cnp +
                '}';
    }
}