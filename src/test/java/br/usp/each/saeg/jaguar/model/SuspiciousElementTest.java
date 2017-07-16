package br.usp.each.saeg.jaguar.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;

/**
 * To test the basic model.
 * LineRequirement, Requirement, Suspicious Element
 *
 * Created by henrique on 7/9/17.
 */
public class SuspiciousElementTest {

    @Test
    public void compareEqual(){
        LineRequirement line = new LineRequirement();
        line.setSuspiciousValue(new BigDecimal(100));

        LineRequirement line2 = new LineRequirement();
        line2.setSuspiciousValue(new BigDecimal(100));

        Assert.assertEquals(0, line.compareTo(line2));
    }

    @Test
    public void compareBigger(){
        LineRequirement line = new LineRequirement();
        line.setSuspiciousValue(new BigDecimal(100));

        LineRequirement line2 = new LineRequirement();
        line2.setSuspiciousValue(new BigDecimal(200));

        Assert.assertEquals(-1, line.compareTo(line2));
    }

    @Test
    public void compareSmaller(){
        LineRequirement line = new LineRequirement();
        line.setSuspiciousValue(new BigDecimal(400));

        LineRequirement line2 = new LineRequirement();
        line2.setSuspiciousValue(new BigDecimal(200));

        Assert.assertEquals(1, line.compareTo(line2));
    }

    @Test
    public void equalToEqual(){
        LineRequirement line = new LineRequirement();
        line.setLocation("package.Class.Method:12");

        LineRequirement line2 = new LineRequirement();
        line2.setLocation("package.Class.Method:12");

        Assert.assertTrue(line.equals(line2));
    }

    @Test
    public void equalToNotEqual(){
        LineRequirement line = new LineRequirement();
        line.setLocation("package.Class.Method:12");

        LineRequirement line2 = new LineRequirement();
        line2.setLocation("package.Class.Method:0123");

        Assert.assertFalse(line.equals(line2));
    }

    @Test
    public void hashEqual(){
        LineRequirement line = new LineRequirement();
        line.setLocation("package.Class.Method:12");

        LineRequirement line2 = new LineRequirement();
        line2.setLocation("package.Class.Method:12");

        Assert.assertTrue(line.equals(line2));
    }

    @Test
    public void hashNotEqual() {
        LineRequirement line = new LineRequirement();
        line.setLocation("package.Class.Method:12");

        LineRequirement line2 = new LineRequirement();
        line2.setLocation("package.Class.Method:0123");

        Assert.assertFalse(line.equals(line2));
    }
}
