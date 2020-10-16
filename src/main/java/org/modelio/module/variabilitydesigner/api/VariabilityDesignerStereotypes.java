package org.modelio.module.variabilitydesigner.api;

import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerPeerModule;

public final class VariabilityDesignerStereotypes {
    public static final String VARIATION = "Variation";

    public static final String OPTIONAL_STRUCTURAL = "Optional_Structural_Variation";

    public static final String AlTERNATIVE_STRUCTURAL = "Alternative_Structural_Variation";

    public static final String CALCULATED_PARAMETER = "Calculated_Parameter_Variation";

    public static final String ALTERNATIVE_PARAMETER = "Alternative_Parameter_Variation";

    public static final String VARIATION_CLASS_DIAGRAM = "Class_Diagram_(Variability)";

    public static final String VARIATION_MODEL_ROOT = "150%_model_root";

    public static final String VARIATION_ACTIVITY_DIAGRAM = "Activity_Diagram_(Variability)";

    public static final String VARIATION_COMMUNICATION_DIAGRAM = "Communication_Diagram_(Variability)";

    public static final String VARIATION_DEPLOYMENT_DIAGRAM = "Deployment_Diagram_(Variability)";

    public static final String VARIATION_OBJECT_DIAGRAM = "Object_Diagram_(Variability)";

    public static final String VARIATION_SEQUENCE_DIAGRAM = "Sequence_Diagram_(Variability)";

    public static final String VARIATION_STATE_DIAGRAM = "State_Machine_Diagram_(Variability)";

    public static final String VARIATION_USECASE_DIAGRAM = "Use_Case_Diagram_(Variability)";

    public static final String VARIATION_DIAGRAM = "Variation_Diagram";

//------------------------------------//
    public static final boolean isVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION);
    }

    public static final boolean isOptionalStructuralVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, OPTIONAL_STRUCTURAL);
    }

    public static final boolean isXorStructuralVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, AlTERNATIVE_STRUCTURAL);
    }

    public static final boolean isCalculatedParameterVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, CALCULATED_PARAMETER);
    }

    public static final boolean isXorParameterVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, ALTERNATIVE_PARAMETER);
    }

    public static final boolean isVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_DIAGRAM);
    }

    public static final boolean isVariationModelRoot(Package element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_MODEL_ROOT);
    }

    public static final boolean isClassVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_CLASS_DIAGRAM);
    }

    public static final boolean isActivityVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_ACTIVITY_DIAGRAM);
    }

    public static final boolean isCommunicationVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_COMMUNICATION_DIAGRAM);
    }

    public static final boolean isDeploymentVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_DEPLOYMENT_DIAGRAM);
    }

    public static final boolean isObjectVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_OBJECT_DIAGRAM);
    }

    public static final boolean isSequenceVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_SEQUENCE_DIAGRAM);
    }

    public static final boolean isStateVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_STATE_DIAGRAM);
    }

    public static final boolean isUseCaseVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_USECASE_DIAGRAM);
    }

    public static final void removeVariationDiagramStereotype(AbstractDiagram element) {
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_CLASS_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_ACTIVITY_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_COMMUNICATION_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_DEPLOYMENT_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_OBJECT_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_SEQUENCE_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_STATE_DIAGRAM);
        element.removeStereotypes(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_USECASE_DIAGRAM);
    }


//------------------------------------//
}
