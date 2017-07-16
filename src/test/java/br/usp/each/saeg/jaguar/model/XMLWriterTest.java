package br.usp.each.saeg.jaguar.model;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by henrique on 7/16/17.
 */

public class XMLWriterTest {

    private static final String LINE_XML_FILE = "src/test/resources/faultclassification_line.xml";
    private static final String DUA_XML_FILE = "src/test/resources/faultclassification_dua.xml";

    @Test
    public void readAndWriteLineXMLtest() {
        final FaultClassification lineFaultClassification = createLineFaultClassificationObject();

        JaguarSerializer.writeFaultClassification(lineFaultClassification, LINE_XML_FILE);
        final FaultClassification faultClassificationSaved = JaguarSerializer.readFaultCassification(LINE_XML_FILE);

        Assert.assertEquals(lineFaultClassification, faultClassificationSaved);
    }

    @Test
    public void readAndWriteDuaXMLtest() {
        final FaultClassification duaFaultClassification = createDuaFaultClassificationObject();

        JaguarSerializer.writeFaultClassification(duaFaultClassification, DUA_XML_FILE);
        final FaultClassification faultClassificationSaved = JaguarSerializer.readFaultCassification(DUA_XML_FILE);

        Assert.assertEquals(duaFaultClassification, faultClassificationSaved);
    }

    private static FaultClassification createLineFaultClassificationObject() {
        final LineRequirement requirement1 = new LineRequirement();
        requirement1.setLocation("package.Class:11");
        requirement1.setPosition(1);
        requirement1.setSuspiciousValue(new BigDecimal(0));

        final LineRequirement requirement2 = new LineRequirement();
        requirement2.setLocation("package.Class:22");
        requirement2.setPosition(1);
        requirement2.setSuspiciousValue(new BigDecimal(1));
        requirement2.setCnp(5);
        requirement2.setCnf(1);
        requirement2.setCep(0);
        requirement2.setCef(4);

        final List<Requirement> requirementList = new ArrayList<Requirement>();
        requirementList.add(requirement1);
        requirementList.add(requirement2);

        final FaultClassification xmlObject = new FaultClassification();
        xmlObject.setProject("fault localization");
        xmlObject.setHeuristic("TARANTULA");
        xmlObject.setRequirementType(Requirement.Type.LINE);
        xmlObject.setRequirements(requirementList);

        return xmlObject;
    }

    private static FaultClassification createDuaFaultClassificationObject() {
        final DuaRequirement requirement1 = new DuaRequirement();
        requirement1.setLocation("package.Class:11");
        requirement1.setPosition(1);
        requirement1.setSuspiciousValue(new BigDecimal(0));

        final DuaRequirement requirement2 = new DuaRequirement();
        requirement2.setLocation("package.Class:22");
        requirement2.setPosition(1);
        requirement2.setSuspiciousValue(new BigDecimal(1));
        requirement2.setCnp(5);
        requirement2.setCnf(1);
        requirement2.setCep(0);
        requirement2.setCef(4);
        requirement2.setVar("i");
        requirement2.setDef(6);
        requirement2.setTarget(8);
        requirement2.setUse(7);
        requirement2.setIndex(9);

        final List<Requirement> requirementList = new ArrayList<Requirement>();
        requirementList.add(requirement1);
        requirementList.add(requirement2);

        final FaultClassification xmlObject = new FaultClassification();
        xmlObject.setProject("fault localization");
        xmlObject.setHeuristic("TARANTULA");
        xmlObject.setRequirementType(Requirement.Type.LINE);
        xmlObject.setRequirements(requirementList);

        return xmlObject;
    }

}
