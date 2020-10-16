/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'VariabilityDesigner' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>Variability Designer is a Modelio Module that allows Modelio users to manage variability on UML/SysML models. It allows to create 150% Models and generate variant model based on VEL configuration file.</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< Optional_Structural_Variation >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link OptionalStructuralVariation}
 * <li><< Alternative_Structural_Variation >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link AlternativeStructuralVariation}
 * <li><< Calculated_Parameter_Variation >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link CalculatedParameterVariation}
 * <li><< Alternative_Parameter_Variation >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link AlternativeParameterVariation}
 * <li><< model150 >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link Model150}
 * <li><< Class_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ClassDiagramVariability}
 * <li><< Activity_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.ActivityDiagram}: instantiates a {@link ActivityDiagramVariability}
 * <li><< Communication_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.CommunicationDiagram}: instantiates a {@link CommunicationDiagramVariability}
 * <li><< Deployment_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.DeploymentDiagram}: instantiates a {@link DeploymentDiagramVariability}
 * <li><< Object_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.ObjectDiagram}: instantiates a {@link ObjectDiagramVariability}
 * <li><< Sequence_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.SequenceDiagram}: instantiates a {@link SequenceDiagramVariability}
 * <li><< State_Machine_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.StateMachineDiagram}: instantiates a {@link StateMachineDiagramVariability}
 * <li><< Use_Case_Diagram_(Variability) >> on a {@link org.modelio.metamodel.diagrams.UseCaseDiagram}: instantiates a {@link UseCaseDiagramVariability}
 * <li><< Variation_Diagram >> on a {@link org.modelio.metamodel.diagrams.AbstractDiagram}: instantiates a {@link VariationDiagram}
 * <li><< Feature_Diagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link FeatureDiagram}
 * <li><< FeatureModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link FeatureModel}
 * <li><< FeatureRoot >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FeatureRoot}
 * <li><< Feature >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Feature}
 * <li><< MandatoryFeature >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MandatoryFeature}
 * <li><< OptionalFeature >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link OptionalFeature}
 * <li><< AlternativeFeature >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link AlternativeFeature}
 * <li><< OrFeature >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link OrFeature}
 * <li><< Variant >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Variant}
 * <li><< VariantDefinition >> on a {@link org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition}: instantiates a {@link VariantDefinition}
 * </ul>
 */
@objid ("5e4a94b1-36a9-4416-9022-28198dad8e79")
public class VariabilityDesignerProxyFactory {
    @objid ("f3bb5a7d-6f86-4533-9976-e5f7838c9013")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'VariabilityDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("a5c436b8-efd7-48ad-9ebf-0742e88d2261")
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              ModuleComponent module = s.getModule();
              if (module != null && module.getName().equals(IVariabilityDesignerPeerModule.MODULE_NAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'VariabilityDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("4df7b4bd-561b-421e-bb0b-096ccc0c27a1")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("e4794c69-2d98-49f4-9906-8936ac704c50")
    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("11516447-a7be-4949-bd6a-9034ae5fecc0")
        private String stName;

        @objid ("34c340ea-1650-469e-a07c-09636c34d61e")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("7dcd0fe8-5367-4245-b95b-70167b2c4558")
        @Override
        public final Object visitAbstractDiagram(AbstractDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram.VariationDiagram.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram.VariationDiagram.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitAbstractDiagram(obj);
        }

        @objid ("71ad3420-0f58-47b8-a8a9-642f7fb6c37e")
        @Override
        public final Object visitStateMachineDiagram(StateMachineDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.statemachinediagram.StateMachineDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.statemachinediagram.StateMachineDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitStateMachineDiagram(obj);
        }

        @objid ("2b3bbf45-a202-4081-aa22-2d79c1ffbc6c")
        @Override
        public final Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.classdiagram.ClassDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.classdiagram.ClassDiagramVariability.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.classdiagram.FeatureDiagram.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.classdiagram.FeatureDiagram.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @objid ("45cf8af7-5d85-4ae0-96bc-039461fa8159")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.projectsetup.standard.package_.Model150.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.projectsetup.standard.package_.Model150.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.package_.FeatureModel.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.package_.FeatureModel.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @objid ("783c74f6-8f38-4d2d-b6c4-2fbc77d82044")
        @Override
        public final Object visitMatrixDefinition(MatrixDefinition obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.feature.infrastructure.matrixdefinition.VariantDefinition.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.infrastructure.matrixdefinition.VariantDefinition.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitMatrixDefinition(obj);
        }

        @objid ("9aac3cf8-e79e-4969-99fc-275e4899046d")
        @Override
        public final Object visitObjectDiagram(ObjectDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.objectdiagram.ObjectDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.objectdiagram.ObjectDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitObjectDiagram(obj);
        }

        @objid ("4aafe765-894c-4ad8-8560-4e8c9f064cb1")
        @Override
        public final Object visitActivityDiagram(ActivityDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.activitydiagram.ActivityDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.activitydiagram.ActivityDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitActivityDiagram(obj);
        }

        @objid ("d4ab5a15-9131-44d7-9cee-0917f2b2c7a6")
        @Override
        public final Object visitSequenceDiagram(SequenceDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.sequencediagram.SequenceDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.sequencediagram.SequenceDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitSequenceDiagram(obj);
        }

        @objid ("a373bb3a-4cb6-4ffb-abb8-9d3285521b0f")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.FeatureRoot.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.FeatureRoot.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.Feature.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.Feature.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.feature.standard.class_.Variant.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.standard.class_.Variant.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @objid ("d360b779-3d88-4f9a-9b2a-5b467d5c03e0")
        @Override
        public final Object visitConstraint(Constraint obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.variation.standard.constraint.OptionalStructuralVariation.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.variation.standard.constraint.OptionalStructuralVariation.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.variation.standard.constraint.AlternativeStructuralVariation.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.variation.standard.constraint.AlternativeStructuralVariation.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.variation.standard.constraint.CalculatedParameterVariation.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.variation.standard.constraint.CalculatedParameterVariation.instantiate(obj);
            	case org.modelio.module.variabilitydesigner.api.variation.standard.constraint.AlternativeParameterVariation.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.variation.standard.constraint.AlternativeParameterVariation.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitConstraint(obj);
        }

        @objid ("0575b6df-cd58-4b74-ba8b-ee988b9eecbe")
        @Override
        public final Object visitCommunicationDiagram(CommunicationDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.communicationdiagram.CommunicationDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.communicationdiagram.CommunicationDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitCommunicationDiagram(obj);
        }

        @objid ("21e2aaac-5ecd-4f00-a1df-244c4adee77f")
        @Override
        public final Object visitUseCaseDiagram(UseCaseDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.usecasediagram.UseCaseDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.usecasediagram.UseCaseDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitUseCaseDiagram(obj);
        }

        @objid ("708f8eb1-ec22-4e2c-91dd-862011d2ef42")
        @Override
        public final Object visitDeploymentDiagram(DeploymentDiagram obj) {
            switch (this.stName) {
            	case org.modelio.module.variabilitydesigner.api.automatic.standard.deploymentdiagram.DeploymentDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.deploymentdiagram.DeploymentDiagramVariability.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitDeploymentDiagram(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("2b8f386e-6d2c-452e-8991-66667013e794")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
