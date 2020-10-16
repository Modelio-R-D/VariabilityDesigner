/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api;

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
public class VariabilityDesignerProxyFactory {
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'VariabilityDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
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
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        private String stName;

        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @Override
        public final Object visitAbstractDiagram(AbstractDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram.VariationDiagram.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram.VariationDiagram.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitAbstractDiagram(obj);
        }

        @Override
        public final Object visitStateMachineDiagram(StateMachineDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.standard.statemachinediagram.StateMachineDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.statemachinediagram.StateMachineDiagramVariability.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitStateMachineDiagram(obj);
        }

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

        @Override
        public final Object visitMatrixDefinition(MatrixDefinition obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.feature.infrastructure.matrixdefinition.VariantDefinition.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.feature.infrastructure.matrixdefinition.VariantDefinition.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitMatrixDefinition(obj);
        }

        @Override
        public final Object visitObjectDiagram(ObjectDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.standard.objectdiagram.ObjectDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.objectdiagram.ObjectDiagramVariability.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitObjectDiagram(obj);
        }

        @Override
        public final Object visitActivityDiagram(ActivityDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.standard.activitydiagram.ActivityDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.activitydiagram.ActivityDiagramVariability.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitActivityDiagram(obj);
        }

        @Override
        public final Object visitSequenceDiagram(SequenceDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.standard.sequencediagram.SequenceDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.sequencediagram.SequenceDiagramVariability.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitSequenceDiagram(obj);
        }

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

        @Override
        public final Object visitCommunicationDiagram(CommunicationDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.standard.communicationdiagram.CommunicationDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.communicationdiagram.CommunicationDiagramVariability.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitCommunicationDiagram(obj);
        }

        @Override
        public final Object visitUseCaseDiagram(UseCaseDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.variabilitydesigner.api.automatic.standard.usecasediagram.UseCaseDiagramVariability.STEREOTYPE_NAME: return org.modelio.module.variabilitydesigner.api.automatic.standard.usecasediagram.UseCaseDiagramVariability.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitUseCaseDiagram(obj);
        }

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
         * 
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
