package org.modelio.module.variabilitydesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerPeerModule;

@objid ("30d75aab-a6c3-456d-9397-e0ab94643ac3")
public final class VariabilityDesignerStereotypes {
    @objid ("5a0339a7-ff20-4e69-9396-96af6b9b644f")
    public static final String VARIATION = "Variation";

    @objid ("eeb0ace0-5418-4af2-b3c8-21b286ac1464")
    public static final String OPTIONAL_STRUCTURAL = "Optional_Structural_Variation";

    @objid ("88da51c5-7a60-476e-af80-6ed009a8a0bb")
    public static final String AlTERNATIVE_STRUCTURAL = "Alternative_Structural_Variation";

    @objid ("23d24ac7-bd6c-45d0-963d-8623883ae9ff")
    public static final String CALCULATED_PARAMETER = "Calculated_Parameter_Variation";

    @objid ("8a014805-9265-4f59-931f-5930bf3846c5")
    public static final String ALTERNATIVE_PARAMETER = "Alternative_Parameter_Variation";

    @objid ("32c45bc3-1936-46a8-adfe-4e226eab7ea4")
    public static final String VARIATION_CLASS_DIAGRAM = "Class_Diagram_(Variability)";

    @objid ("3e10ad7a-a59c-4103-984c-7cf906472f2c")
    public static final String VARIATION_MODEL_ROOT = "150%_model_root";

    @objid ("1f2e77e5-e5e5-4d51-97e9-3c53b7efa102")
    public static final String VARIATION_ACTIVITY_DIAGRAM = "Activity_Diagram_(Variability)";

    @objid ("d6a37699-9f6c-49f0-bb49-09177cc4d19c")
    public static final String VARIATION_COMMUNICATION_DIAGRAM = "Communication_Diagram_(Variability)";

    @objid ("eff9f022-f610-4beb-b8f4-735f3c53db56")
    public static final String VARIATION_DEPLOYMENT_DIAGRAM = "Deployment_Diagram_(Variability)";

    @objid ("86c179b7-6678-4eaa-9b35-bbb94f810085")
    public static final String VARIATION_OBJECT_DIAGRAM = "Object_Diagram_(Variability)";

    @objid ("f0c6f601-b408-4c12-b2a7-2aba20cfa3af")
    public static final String VARIATION_SEQUENCE_DIAGRAM = "Sequence_Diagram_(Variability)";

    @objid ("d6ae3d58-1756-4051-8b25-b789efb188f4")
    public static final String VARIATION_STATE_DIAGRAM = "State_Machine_Diagram_(Variability)";

    @objid ("cf7092e3-e68b-485b-bed9-e0a4df684890")
    public static final String VARIATION_USECASE_DIAGRAM = "Use_Case_Diagram_(Variability)";

    @objid ("4985f067-5b86-4125-9c9d-5ad78e9bc372")
    public static final String VARIATION_DIAGRAM = "Variation_Diagram";

//------------------------------------//
    @objid ("c1423256-36e4-4cb6-9054-3dc538c1a9ec")
    public static final boolean isVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION);
    }

    @objid ("1745bf75-869e-4047-b0cb-70ca5b081638")
    public static final boolean isOptionalStructuralVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, OPTIONAL_STRUCTURAL);
    }

    @objid ("0946e4b9-1d5d-47d3-bfff-acb3933ccf79")
    public static final boolean isXorStructuralVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, AlTERNATIVE_STRUCTURAL);
    }

    @objid ("7e84a924-3dbc-4abe-a676-3829b6315ed5")
    public static final boolean isCalculatedParameterVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, CALCULATED_PARAMETER);
    }

    @objid ("cb1974ff-1d22-496b-b235-a4c081cb16b9")
    public static final boolean isXorParameterVariation(Constraint element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, ALTERNATIVE_PARAMETER);
    }

    @objid ("80d57426-be15-4aa4-8464-30da5dc5e1da")
    public static final boolean isVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_DIAGRAM);
    }

    @objid ("cbc3195f-d613-46ed-ba5a-5f37e2ed1f2f")
    public static final boolean isVariationModelRoot(Package element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_MODEL_ROOT);
    }

    @objid ("4d8b99a4-f997-4302-a3a2-31ab77f7085e")
    public static final boolean isClassVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_CLASS_DIAGRAM);
    }

    @objid ("ed80b81b-6a64-4977-b107-09145e2c8566")
    public static final boolean isActivityVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_ACTIVITY_DIAGRAM);
    }

    @objid ("034790f6-8136-49ae-8a72-633f879b976c")
    public static final boolean isCommunicationVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_COMMUNICATION_DIAGRAM);
    }

    @objid ("47941c3f-b476-4266-b2ba-3efcfa6fdab6")
    public static final boolean isDeploymentVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_DEPLOYMENT_DIAGRAM);
    }

    @objid ("b8d381be-c222-4c06-8c16-5c643ac65e38")
    public static final boolean isObjectVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_OBJECT_DIAGRAM);
    }

    @objid ("d66dec7c-af05-4d26-915d-8fc0d7aef4bf")
    public static final boolean isSequenceVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_SEQUENCE_DIAGRAM);
    }

    @objid ("1e8277f4-b9b9-45cf-9ed0-4d9ebb15fa25")
    public static final boolean isStateVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_STATE_DIAGRAM);
    }

    @objid ("9319a530-6336-48f4-b8d2-84b46171029d")
    public static final boolean isUseCaseVariationDiagram(AbstractDiagram element) {
        return element.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME,VARIATION_USECASE_DIAGRAM);
    }

    @objid ("976a3420-876e-4b27-bbf9-52efc2cd60e6")
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
