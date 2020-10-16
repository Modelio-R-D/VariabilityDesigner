package org.modelio.module.variabilitydesigner.vel.imports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.variabilitydesigner.utils.specialcollections.SpecialMap;
import org.modelio.module.variabilitydesigner.utils.specialcollections.SpecialSet;
import org.modelio.module.variabilitydesigner.variabilitymodel.ArtifactElementType;
import org.modelio.module.variabilitydesigner.variabilitymodel.CalculatedParameterVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.CalculatedVariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.OptionalStructuralVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.Uuid;
import org.modelio.module.variabilitydesigner.variabilitymodel.ValueVariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelsType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.XorParameterVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.XorStructuralVariationpointType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8b61a3da-6fa3-453f-8c9e-c532beef68de")
public class TrimmingDataGenerator {
    @objid ("6d905090-33d9-46e1-8e6a-f57989bc980a")
    public TrimmingData generate(VariabilityExchangeModelsType variabilityExchangeModelsType, IModuleContext ctx) {
        TrimmingData result = new TrimmingData();
        
        Set<String> uuidsToRemove = fetchUUidsToRemove(variabilityExchangeModelsType);
        Set<MObject> set = buildSetOfElementsToRemove(ctx.getModelingSession(), uuidsToRemove);
        result.setElementsToKeep(set);
        
        //        result.setParameterToSet(getParameterHandling(ctx.getModelingSession(), variabilityExchangeModelsType));
        return result;
    }

    @objid ("bbc0aa3d-66d2-492d-9d45-73906bd2d215")
    private Set<MObject> buildSetOfElementsToRemove(IModelingSession modelingSession, Set<String> uuids) {
        Set<MObject> set = new SpecialSet();
        for(String uuid : uuids) {
            set.add(modelingSession.findElementById(Element.class, uuid));
        }
        return set;
    }

    @objid ("5f4003d6-a073-432a-abb5-28a2225e9f36")
    private Set<String> fetchUUidsToRemove(VariabilityExchangeModelsType variabilityExchangeModelsType) {
        Set<String> selected = new HashSet<>();
        Set<String> unselected = new HashSet<>();
        // TODO add check that the document is a configuration
        VariabilityExchangeModelType model = variabilityExchangeModelsType.getVariabilityExchangeModel().get(0);
        
        for(VariationpointType variationpoint : model.getVariationpointGroup()) {
            if(variationpoint instanceof OptionalStructuralVariationpointType || variationpoint instanceof XorStructuralVariationpointType) {
                extractUUIDs(variationpoint, selected, unselected);
            }
        }
        
        for(String str : selected) {
            if(unselected.contains(str)) {
                unselected.remove(str);
            }
        }
        return unselected;
    }

    @objid ("d6274e37-ffdb-4a89-b817-770fbeb453d1")
    private void extractUUIDs(VariationpointType variationpoint, Set<String> selected, Set<String> unselected) {
        for(VariationType variation : variationpoint.getVariations()) {
            Set<String> toAdd;
            if(variation.isSelected() != null && variation.isSelected()) {
                toAdd = selected;
            } else {
                toAdd = unselected;
            }
        
            for(ArtifactElementType artifact : variation.getCorrespondingVariableArtifactElement()) {
                for(Object any : artifact.getAny()) {
                    if (any instanceof Uuid) {
                        Uuid uuid = (Uuid) any;
                        toAdd.add(uuid.getValue());
                    }
                }
            }
        }
    }

    @objid ("3e690387-7890-4700-945a-2d9c178e040a")
    private Map<MObject, Collection<MAttributeValue>> getParameterHandling(IModelingSession modelingSession, VariabilityExchangeModelsType variabilityExchangeModelsType) {
        VariabilityExchangeModelType model = variabilityExchangeModelsType.getVariabilityExchangeModel().get(0);
        
        Map<MObject, Collection<MAttributeValue>> parameterSetup = new SpecialMap();
        for(VariationpointType variationpoint : model.getVariationpointGroup()) {
            if(variationpoint instanceof CalculatedParameterVariationpointType || variationpoint instanceof XorParameterVariationpointType) {
                for (VariationType variationType : variationpoint.getVariations()) {
                    if(variationType.isSelected() != null && variationType.isSelected()) {
                        Uuid uuid = (Uuid) variationType.getCorrespondingVariableArtifactElement().get(0).getAny().get(0);
                        Element element = modelingSession.findElementById(Element.class, uuid.getValue());
        
                        MAttributeValue locator = new MAttributeValue();
                        locator.setmAttribute(element.getMClass().getAttribute(uuid.getMAttribute()));
        
                        if (variationType instanceof ValueVariationType) {
                            ValueVariationType variation = (ValueVariationType) variationType;
                            locator.setValue(variation.getValue());
                        } else if (variationType instanceof CalculatedVariationType) {
                            CalculatedVariationType variation = (CalculatedVariationType) variationType;
                            locator.setValue(variation.getExpression().getValue());
                        }
        
                        addElementToCollectionMap(parameterSetup, element, locator, ArrayList::new);
                    }
                }
            }
        }
        return parameterSetup;
    }

    @objid ("54085072-6c9d-4100-bf48-ea0a521b147f")
    private <T,K> void addElementToCollectionMap(Map<T, Collection<K>> map, T key, K value, Supplier<Collection<K>> supplier) {
        Collection<K> col = map.get(key);
        if(col == null) {
            col = supplier.get();
            col.add(value);
            map.put(key, col);
        }
        else {
            col.add(value);
        }
    }

    @objid ("beda3d15-0340-4c1d-8083-4480f9afc453")
    public TrimmingData generate(IModuleContext ctx, org.modelio.metamodel.uml.statik.Class variant) {
        TrimmingData result = new TrimmingData();
        
        //        Set<String> uuidsToRemove = fetchUUidsToRemove(variabilityExchangeModelsType);
        Set<MObject> features = getFeatures(variant);
        result.setElementsToKeep(features);
        return result;
    }

    @objid ("cbe4fa1e-5dac-4faa-b227-4fe5591b490c")
    private Set<MObject> getFeatures(Class variant) {
        Set<MObject> set = new SpecialSet();
        for(Dependency dep : variant.getDependsOnDependency()) {
            if (dep.isStereotyped("ModelerModule", "trace")) {
                set.add(dep.getDependsOn());
            }
        }
        return set;
    }

}
