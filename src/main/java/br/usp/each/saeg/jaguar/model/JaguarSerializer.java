package br.usp.each.saeg.jaguar.model;

import javax.xml.bind.JAXB;
import java.io.File;

/**
 * This class should be used to read and write the jaguar-core objects.
 *
 * Created by henrique on 7/16/17.
 */
public class JaguarSerializer {

    public static void writeFaultClassification(FaultClassification object, String destFile) {
        JAXB.marshal(object, new File(destFile));
    }

    public static FaultClassification readFaultCassification(String sourceFile){
        return JAXB.unmarshal(new File(sourceFile), FaultClassification.class);
    }
}
