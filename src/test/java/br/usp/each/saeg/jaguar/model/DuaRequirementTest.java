package br.usp.each.saeg.jaguar.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;

/**
 * To test the Dua Requirement
 *
 * Created by henrique on 7/9/17.
 */
public class DuaRequirementTest {

    @Test
    public void testSetAndGet(){
        DuaRequirement dua = new DuaRequirement();
        dua.setSuspiciousValue(new BigDecimal(100));
        dua.setLocation("package.Class:11");
        dua.setPosition(11);
        dua.setCef(1);
        dua.setCep(2);
        dua.setCnf(3);
        dua.setCnp(4);

        dua.setDef(5);
        dua.setUse(6);
        dua.setTarget(7);
        dua.setIndex(8);
        dua.setVar("i");

        Assert.assertEquals(Requirement.Type.DUA, dua.getType());
        Assert.assertEquals(new BigDecimal(100), dua.getSuspiciousValue());
        Assert.assertEquals("package.Class:11", dua.getLocation());
        Assert.assertEquals(new Integer(11), dua.getPosition());
        Assert.assertEquals(new Integer(1), dua.getCef());
        Assert.assertEquals(new Integer(2), dua.getCep());
        Assert.assertEquals(new Integer(3), dua.getCnf());
        Assert.assertEquals(new Integer(4), dua.getCnp());
        Assert.assertEquals(new Integer(5), dua.getDef());
        Assert.assertEquals(new Integer(6), dua.getUse());
        Assert.assertEquals(new Integer(7), dua.getTarget());
        Assert.assertEquals(new Integer(8), dua.getIndex());
        Assert.assertEquals("i", dua.getVar());
        Assert.assertEquals("DuaRequirement{location='package.Class:11', position=11, suspiciousValue=100, def=5, use=6, target=7, var='i', index=8, cef=1, cep=2, cnf=3, cnp=4}", dua.toString());

    }
}
