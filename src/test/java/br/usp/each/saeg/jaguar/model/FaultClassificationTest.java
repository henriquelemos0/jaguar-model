package br.usp.each.saeg.jaguar.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * To test the fault classification behavior
 *
 * Created by henrique on 7/16/17.
 */
public class FaultClassificationTest {

    public void equals(){
        FaultClassification fc1 = new FaultClassification();
        FaultClassification fc2 = fc1;
        Assert.assertTrue(fc1.equals(fc2));
        Assert.assertEquals(fc1.hashCode(),fc2.hashCode());

        fc1 = new FaultClassification();
        fc2 = new FaultClassification();
        Assert.assertTrue(fc1.equals(fc2));
        Assert.assertEquals(fc1.hashCode(),fc2.hashCode());

        fc1.setProject("project");
        fc2.setProject("project");
        Assert.assertTrue(fc1.equals(fc2));
        Assert.assertEquals(fc1.hashCode(),fc2.hashCode());

        fc1.setHeuristic("heuristicType");
        fc2.setHeuristic("heuristicType");
        Assert.assertTrue(fc1.equals(fc2));
        Assert.assertEquals(fc1.hashCode(),fc2.hashCode());

        fc1.setRequirementType(Requirement.Type.LINE);
        fc2.setRequirementType(Requirement.Type.LINE);
        Assert.assertTrue(fc1.equals(fc2));
        Assert.assertEquals(fc1.hashCode(),fc2.hashCode());
    }

    @Test
    public void notEquals(){
        FaultClassification fc1 = new FaultClassification();
        FaultClassification fc2 = new FaultClassification();

        fc1.setProject("project");
        Assert.assertFalse(fc1.equals(fc2));
        Assert.assertNotEquals(fc1.hashCode(),fc2.hashCode());

        fc2.setProject("project");
        fc1.setHeuristic("heuristicType");
        Assert.assertFalse(fc1.equals(fc2));
        Assert.assertNotEquals(fc1.hashCode(),fc2.hashCode());

        fc2.setHeuristic("heuristicType");
        fc1.setRequirementType(Requirement.Type.LINE);
        Assert.assertFalse(fc1.equals(fc2));
        Assert.assertNotEquals(fc1.hashCode(),fc2.hashCode());

        fc2.setRequirementType(Requirement.Type.DUA);
        Assert.assertFalse(fc1.equals(fc2));
        Assert.assertNotEquals(fc1.hashCode(),fc2.hashCode());
    }
}
