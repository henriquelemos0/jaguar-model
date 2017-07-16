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
    public void testSetAndGet(){
        LineRequirement line = new LineRequirement();
        line.setSuspiciousValue(new BigDecimal(100));
        line.setLocation("package.Class:11");
        line.setPosition(11);
        line.setCef(1);
        line.setCep(2);
        line.setCnf(3);
        line.setCnp(4);

        Assert.assertEquals(Requirement.Type.LINE, line.getType());
        Assert.assertEquals(new BigDecimal(100), line.getSuspiciousValue());
        Assert.assertEquals("package.Class:11", line.getLocation());
        Assert.assertEquals(new Integer(11), line.getPosition());
        Assert.assertEquals(new Integer(1), line.getCef());
        Assert.assertEquals(new Integer(2), line.getCep());
        Assert.assertEquals(new Integer(3), line.getCnf());
        Assert.assertEquals(new Integer(4), line.getCnp());
        Assert.assertEquals(Collections.EMPTY_LIST, line.getChildren());
        Assert.assertEquals("LineRequirement{Type='LINE', location='package.Class:11', position=11, suspiciousValue=100, cef=1, cep=2, cnf=3, cnp=4}", line.toString());

    }

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
