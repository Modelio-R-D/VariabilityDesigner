/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.standard.deploymentdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram.VariationDiagram;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DeploymentDiagram} with << Deployment_Diagram_(Variability) >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6f041b1b-0201-4ce4-ac22-9cb5d89e4518")
public class DeploymentDiagramVariability extends VariationDiagram {
    @objid ("a47f1002-7567-4bfb-b6cd-bdb434744a10")
    public static final String STEREOTYPE_NAME = "Deployment_Diagram_(Variability)";

    /**
     * Tells whether a {@link DeploymentDiagramVariability proxy} can be instantiated from a {@link MObject} checking it is a {@link DeploymentDiagram} stereotyped << Deployment_Diagram_(Variability) >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8378685d-213e-4d5d-b3e2-599a6d4254ed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DeploymentDiagram) && ((DeploymentDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, DeploymentDiagramVariability.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DeploymentDiagram} stereotyped << Deployment_Diagram_(Variability) >> then instantiate a {@link DeploymentDiagramVariability} proxy.
     * 
     * @return a {@link DeploymentDiagramVariability} proxy on the created {@link DeploymentDiagram}.
     */
    @objid ("b5810dbc-9d71-4c7f-bed1-9284baea18c1")
    public static DeploymentDiagramVariability create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DeploymentDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, DeploymentDiagramVariability.STEREOTYPE_NAME);
        return DeploymentDiagramVariability.instantiate((DeploymentDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentDiagramVariability} proxy from a {@link DeploymentDiagram} stereotyped << Deployment_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DeploymentDiagram
     * @return a {@link DeploymentDiagramVariability} proxy or <i>null</i>.
     */
    @objid ("8bda618c-268c-4c2f-8473-5471e6fbd336")
    public static DeploymentDiagramVariability instantiate(final DeploymentDiagram obj) {
        return DeploymentDiagramVariability.canInstantiate(obj) ? new DeploymentDiagramVariability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentDiagramVariability} proxy from a {@link DeploymentDiagram} stereotyped << Deployment_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DeploymentDiagram}
     * @return a {@link DeploymentDiagramVariability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cf2c8137-2e9e-496a-b931-2b35e99959b9")
    public static DeploymentDiagramVariability safeInstantiate(final DeploymentDiagram obj) throws IllegalArgumentException {
        if (DeploymentDiagramVariability.canInstantiate(obj))
        	return new DeploymentDiagramVariability(obj);
        else
        	throw new IllegalArgumentException("DeploymentDiagramVariability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e2f556f-c7f7-45da-b1c7-f71f17ea2504")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DeploymentDiagramVariability other = (DeploymentDiagramVariability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DeploymentDiagram}. 
     * @return the DeploymentDiagram represented by this proxy, never null.
     */
    @objid ("f777f90a-5dba-4218-9e73-f45fd9892e60")
    @Override
    public DeploymentDiagram getElement() {
        return (DeploymentDiagram)super.getElement();
    }

    @objid ("129e2fc0-8695-40aa-981b-fbfd11b35d78")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d01bb2e4-b17f-4151-820a-3ec37e430884")
    protected DeploymentDiagramVariability(final DeploymentDiagram elt) {
        super(elt);
    }

    @objid ("7c5c5445-8f55-4738-a33b-603fc97f8e70")
    public static final class MdaTypes {
        @objid ("c942b0bc-0f07-4a8f-818d-f23719c1bf43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08e735ef-0f91-43e7-8be3-a003170de919")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a2b23cc-d162-411f-8d18-c0187014577d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2e442bc-ce4e-4727-90d8-524142b58e02")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f534f6ce-af80-4e35-9404-5fb8bdd23352");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(VariabilityDesignerModule.getInstance() != null) {
			init(VariabilityDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
