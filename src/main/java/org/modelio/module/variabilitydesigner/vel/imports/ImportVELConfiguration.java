package org.modelio.module.variabilitydesigner.vel.imports;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelsType;

@objid ("359953ba-7c51-4a9d-9f7a-95052a321dd2")
public class ImportVELConfiguration {
    @objid ("bbb60225-224c-43c0-a2f9-21aaae272bac")
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
