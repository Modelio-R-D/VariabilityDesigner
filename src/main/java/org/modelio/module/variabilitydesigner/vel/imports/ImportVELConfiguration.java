package org.modelio.module.variabilitydesigner.vel.imports;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelsType;

public class ImportVELConfiguration {
    public VariabilityExchangeModelsType importVelFile(File file) {
        try {
            JAXBContext context = JAXBContext.newInstance(VariabilityExchangeModelsType.class);
            Unmarshaller um = context.createUnmarshaller();
            
            @SuppressWarnings ("unchecked")
            JAXBElement<VariabilityExchangeModelsType> obj = (JAXBElement<VariabilityExchangeModelsType>) um.unmarshal(file);
            
            return obj.getValue();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
