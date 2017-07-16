package br.usp.each.saeg.jaguar.model;

import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Element that should be extended by all the requirements.
 *
 * Created by henrique on 7/9/17.
 */
public abstract class Requirement extends SuspiciousElement {

    public enum Type {
        LINE, DUA
    }

    @XmlAttribute
    public abstract Type getType();

    @Override
    public String toString() {
        return "Requirement{" +
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
