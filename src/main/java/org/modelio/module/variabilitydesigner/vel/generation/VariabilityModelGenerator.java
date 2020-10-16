package org.modelio.module.variabilitydesigner.vel.generation;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.variabilitydesigner.utils.uml.CompositionUMLElement;
import org.modelio.module.variabilitydesigner.utils.uml.IUMLElement;
import org.modelio.module.variabilitydesigner.utils.walkers.Walker;
import org.modelio.module.variabilitydesigner.variabilitymodel.CapabilityType;
import org.modelio.module.variabilitydesigner.variabilitymodel.ObjectFactory;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityApiEnum;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelsType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariationpointType;
import org.modelio.module.variabilitydesigner.vel.generation.process.VariabilityModelCreator;

@objid ("c6f73d51-46c0-4553-94b7-bed6e722c3a2")
public class VariabilityModelGenerator {
    @objid ("b1147dda-8a00-42bf-a301-4182db1738d1")
    public JAXBElement<VariabilityExchangeModelsType> generate(Package root) {
        Walker<IUMLElement> walker = new Walker<>();
        
        Map<String, VariationpointType> map = new HashMap<>();
        ObjectFactory factory = new ObjectFactory();
        
        walker.setProcess(new VariabilityModelCreator(map, factory));
        walker.walk(new CompositionUMLElement(root));
        
        VariabilityExchangeModelType exchangemodel = factory.createVariabilityExchangeModelType();
        exchangemodel.setId(root.getName());
        exchangemodel.setType(VariabilityApiEnum.VARIATIONPOINT_DESCRIPTION);
        exchangemodel.getVariationpointGroup().addAll(map.values());
        
        VariabilityExchangeModelsType models = factory.createVariabilityExchangeModelsType();
        models.setId("root");
        models.getVariabilityExchangeModel().add(exchangemodel);
        
        CapabilityType capability = factory.createCapabilityType();
        capability.setExportVariabilityExchangeModel(true);
        capability.setGetConfiguration(true);
        capability.setImportVariabilityExchangeModel(true);
        capability.setSetConfiguration(true);
        
        models.setCapability(capability);
        return factory.createVariabilityExchangeModels(models);
    }

    @objid ("f78b4a99-1ab8-412b-88f4-74575c54840e")
    public JAXBElement<VariabilityExchangeModelsType> generateVariantd(org.modelio.metamodel.uml.statik.Class root) {
        Walker<IUMLElement> walker = new Walker<>();
        
        Map<String, VariationpointType> map = new HashMap<>();
        ObjectFactory factory = new ObjectFactory();
        
        walker.setProcess(new VariabilityModelCreator(map, factory));
        walker.walk(new CompositionUMLElement(root));
        
        VariabilityExchangeModelType exchangemodel = factory.createVariabilityExchangeModelType();
        exchangemodel.setId(root.getName());
        exchangemodel.setType(VariabilityApiEnum.VARIATIONPOINT_DESCRIPTION);
        exchangemodel.getVariationpointGroup().addAll(map.values());
        
        VariabilityExchangeModelsType models = factory.createVariabilityExchangeModelsType();
        models.setId("root");
        models.getVariabilityExchangeModel().add(exchangemodel);
        
        CapabilityType capability = factory.createCapabilityType();
        capability.setExportVariabilityExchangeModel(true);
        capability.setGetConfiguration(true);
        capability.setImportVariabilityExchangeModel(true);
        capability.setSetConfiguration(true);
        
        models.setCapability(capability);
        return factory.createVariabilityExchangeModels(models);
    }

}
