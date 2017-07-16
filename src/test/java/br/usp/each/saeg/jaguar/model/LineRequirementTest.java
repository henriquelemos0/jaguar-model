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
public class LineRequirementTest {

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
        Assert.assertEquals("LineRequirement{location='package.Class:11', position=11, suspiciousValue=100, cef=1, cep=2, cnf=3, cnp=4}", line.toString());

    }

}
