package org.modelio.module.variabilitydesigner.vel.generation.process;

import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerStereotypes;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerTagTypes;
import org.modelio.module.variabilitydesigner.utils.uml.UMLProcess;
import org.modelio.module.variabilitydesigner.variabilitymodel.ArtifactElementType;
import org.modelio.module.variabilitydesigner.variabilitymodel.CalculatedParameterVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.CalculatedVariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.ExpressionEnum;
import org.modelio.module.variabilitydesigner.variabilitymodel.ExpressionType;
import org.modelio.module.variabilitydesigner.variabilitymodel.ObjectFactory;
import org.modelio.module.variabilitydesigner.variabilitymodel.OptionalStructuralVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.OptionalVariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.Uuid;
import org.modelio.module.variabilitydesigner.variabilitymodel.ValueVariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariationType;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.XorParameterVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.XorStructuralVariationpointType;
import org.modelio.module.variabilitydesigner.variabilitymodel.XorVariationType;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("29b725fd-79f8-41d8-a1e4-8ba8b2844233")
public class VariabilityModelCreator extends UMLProcess {
    @objid ("9876259f-e5b1-4ce7-bbd0-99cb3ac98b25")
    private Map<String, VariationpointType> _map;

    @objid ("7ba15cf7-8ecb-4ea4-82af-b1f0ae7bfc9a")
    private ObjectFactory _factory;

    @objid ("7a5fcfea-71e7-4950-9db1-4e330fff1078")
    @Override
    public void process(MObject element) {
        if (element instanceof Constraint) {
            Constraint constraint = (Constraint) element;
            if(VariabilityDesignerStereotypes.isCalculatedParameterVariation(constraint)) {
                createCalculatedParameterVariation(constraint);
            } else if (VariabilityDesignerStereotypes.isXorParameterVariation(constraint)) {
                createValueParameterVariation(constraint);
            } else if (VariabilityDesignerStereotypes.isOptionalStructuralVariation(constraint)) {
                createOptionalStructuralVariation(constraint);
            } else if (VariabilityDesignerStereotypes.isXorStructuralVariation(constraint)){
                createXorStructuralVariation(constraint);
            }
        }
    }

    @objid ("d233f000-fcd5-4a7d-9dc3-9b97ddc82eb3")
    public VariabilityModelCreator(Map<String, VariationpointType> map, ObjectFactory factory) {
        super();
        _map = map;
        _factory = factory;
    }

    @objid ("2968788a-fdd1-4456-8d4e-531ff6a87a9b")
    private CalculatedVariationType createCalculatedParameterVariation(Constraint constraint) {
        CalculatedVariationType res = _factory.createCalculatedVariationType();
        
        res.setId(constraint.getName());
        
        addParameteredElements(constraint, res);
        
        ExpressionType expression = _factory.createExpressionType();
        expression.setValue(VariabilityDesignerTagTypes.getVariationConditionValue(constraint));
        expression.setType(ExpressionEnum.fromValue(VariabilityDesignerTagTypes.getVariationExpressionType(constraint)));
        res.setExpression(expression);
        
        
        String variationPointID = VariabilityDesignerTagTypes.getVariationPointID(constraint);
        CalculatedParameterVariationpointType variationPoint;
        
        VariationpointType buffer = _map.get(variationPointID);
        if(buffer == null) {
            variationPoint = _factory.createCalculatedParameterVariationpointType();
            variationPoint.setId(variationPointID);
            _map.put(variationPointID, variationPoint);
        } else if (!(buffer instanceof CalculatedParameterVariationpointType)) {
            throw new RuntimeException("Calculated Parameter Variation not in a Calculated Parameter Variation Point");
        } else {
            variationPoint = (CalculatedParameterVariationpointType)buffer;
        }
        variationPoint.setVariation(res);
        return res;
    }

    @objid ("ce5fdaa5-9ce2-44b8-9970-9ceb328e1471")
    private ValueVariationType createValueParameterVariation(Constraint constraint) {
        ValueVariationType res = _factory.createValueVariationType();
        
        res.setId(constraint.getName());
        addParameteredElements(constraint, res);
        
        ExpressionType expression = _factory.createExpressionType();
        expression.setValue(VariabilityDesignerTagTypes.getVariationConditionValue(constraint));
        expression.setType(ExpressionEnum.fromValue(VariabilityDesignerTagTypes.getVariationExpressionType(constraint)));
        res.setCondition(expression);
        
        res.setValue(VariabilityDesignerTagTypes.getVariationValue(constraint));
        
        String variationPointID = VariabilityDesignerTagTypes.getVariationPointID(constraint);
        XorParameterVariationpointType variationPoint;
        
        VariationpointType buffer = _map.get(variationPointID);
        if(buffer == null) {
            variationPoint = _factory.createXorParameterVariationpointType();
            variationPoint.setId(variationPointID);
            _map.put(variationPointID, variationPoint);
        } else if (!(buffer instanceof XorParameterVariationpointType)) {
            throw new RuntimeException("Xor Parameter Variation not in a Xor Parameter Variation Point");
        } else {
            variationPoint = (XorParameterVariationpointType)buffer;
        }
        variationPoint.getVariation().add(res);
        return res;
    }

    @objid ("4a683416-a7cc-41ab-82e8-636fd82800a7")
    private XorVariationType createXorStructuralVariation(Constraint constraint) {
        XorVariationType res = _factory.createXorVariationType();
        
        res.setId(constraint.getName());
        
        addElementsToRemove(constraint, res);
        
        ExpressionType expression = _factory.createExpressionType();
        expression.setValue(VariabilityDesignerTagTypes.getVariationConditionValue(constraint));
        expression.setType(ExpressionEnum.fromValue(VariabilityDesignerTagTypes.getVariationExpressionType(constraint)));
        res.setCondition(expression);
        
        String variationPointID = VariabilityDesignerTagTypes.getVariationPointID(constraint);
        XorStructuralVariationpointType variationPoint;
        VariationpointType buffer = _map.get(variationPointID);
        if(buffer == null) {
            variationPoint = _factory.createXorStructuralVariationpointType();
            variationPoint.setId(variationPointID);
            _map.put(variationPointID, variationPoint);
        } else if (!(buffer instanceof XorStructuralVariationpointType)) {
            throw new RuntimeException("Xor Variation not in a Xor Variation Point");
        } else {
            variationPoint = (XorStructuralVariationpointType)buffer;
        }
        
        variationPoint.getVariation().add(res);
        return res;
    }

    @objid ("325d9aee-5080-4c16-a902-5ba08bdd1c4c")
    private OptionalVariationType createOptionalStructuralVariation(Constraint constraint) {
        OptionalVariationType res = _factory.createOptionalVariationType();
        
        res.setId(constraint.getName());
        
        addElementsToRemove(constraint, res);
        
        ExpressionType expression = _factory.createExpressionType();
        expression.setValue(VariabilityDesignerTagTypes.getVariationConditionValue(constraint));
        expression.setType(ExpressionEnum.fromValue(VariabilityDesignerTagTypes.getVariationExpressionType(constraint)));
        res.setCondition(expression);
                
        String variationPointID = VariabilityDesignerTagTypes.getVariationPointID(constraint);
        OptionalStructuralVariationpointType variationPoint;
        VariationpointType buffer = _map.get(variationPointID);
        if(buffer == null) {
            variationPoint = _factory.createOptionalStructuralVariationpointType();
            variationPoint.setId(variationPointID);
            _map.put(variationPointID, variationPoint);
        } else if (!(buffer instanceof OptionalStructuralVariationpointType)) {
            throw new RuntimeException("Optional Variation not in a Optional Variation Point");
        } else {
            variationPoint = (OptionalStructuralVariationpointType)buffer;
        }
        
        variationPoint.getVariation().add(res);
        return res;
    }

    @objid ("e5207718-55f2-4fee-9c00-10ea2865bd95")
    protected void addElementsToRemove(Constraint constraint, VariationType res) {
        ArtifactElementType artifact = _factory.createArtifactElementType();
        for(UmlModelElement element : constraint.getConstrainedElement()) {
            artifact.getAny().add(new JAXBElement<Uuid>(new QName("uuid"), Uuid.class, new Uuid(element.getUuid())));
        }
        res.getCorrespondingVariableArtifactElement().add(artifact);
    }

    @objid ("2a407d59-76fb-49d4-b377-06030025b29f")
    protected void addParameteredElements(Constraint constraint, VariationType res) {
        //TODO add checks ? Not needed if used correctly ...
        ArtifactElementType artifact = _factory.createArtifactElementType();
        for(UmlModelElement element : constraint.getConstrainedElement()) {
            Uuid uuid = new Uuid(element.getUuid());
            uuid.setMAttribute(VariabilityDesignerTagTypes.getVariationAppliedOn(constraint));
            artifact.getAny().add(new JAXBElement<Uuid>(new QName("uuid"), Uuid.class, uuid));
        }
        res.getCorrespondingVariableArtifactElement().add(artifact);
    }

}
