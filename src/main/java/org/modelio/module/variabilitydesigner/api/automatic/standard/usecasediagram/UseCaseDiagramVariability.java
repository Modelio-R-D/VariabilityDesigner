/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.standard.usecasediagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.UseCaseDiagram;
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
 * Proxy class to handle a {@link UseCaseDiagram} with << Use_Case_Diagram_(Variability) >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("141e5757-2ac6-4946-a536-4fa6f6c483f3")
public class UseCaseDiagramVariability extends VariationDiagram {
    @objid ("707ed4ab-55d5-44d8-a2ef-129e337bf4e9")
    public static final String STEREOTYPE_NAME = "Use_Case_Diagram_(Variability)";

    /**
     * Tells whether a {@link UseCaseDiagramVariability proxy} can be instantiated from a {@link MObject} checking it is a {@link UseCaseDiagram} stereotyped << Use_Case_Diagram_(Variability) >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("56f4e41a-4c35-40e5-b9df-8337db4d41b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof UseCaseDiagram) && ((UseCaseDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, UseCaseDiagramVariability.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link UseCaseDiagram} stereotyped << Use_Case_Diagram_(Variability) >> then instantiate a {@link UseCaseDiagramVariability} proxy.
     * 
     * @return a {@link UseCaseDiagramVariability} proxy on the created {@link UseCaseDiagram}.
     */
    @objid ("ad2c7454-94d5-464b-badd-34519158d1d7")
    public static UseCaseDiagramVariability create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.UseCaseDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, UseCaseDiagramVariability.STEREOTYPE_NAME);
        return UseCaseDiagramVariability.instantiate((UseCaseDiagram)e);
    }

    /**
     * Tries to instantiate a {@link UseCaseDiagramVariability} proxy from a {@link UseCaseDiagram} stereotyped << Use_Case_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a UseCaseDiagram
     * @return a {@link UseCaseDiagramVariability} proxy or <i>null</i>.
     */
    @objid ("14388e99-fe90-42b1-a599-b46e8320ffa5")
    public static UseCaseDiagramVariability instantiate(final UseCaseDiagram obj) {
        return UseCaseDiagramVariability.canInstantiate(obj) ? new UseCaseDiagramVariability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UseCaseDiagramVariability} proxy from a {@link UseCaseDiagram} stereotyped << Use_Case_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link UseCaseDiagram}
     * @return a {@link UseCaseDiagramVariability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7707ebb8-faac-4e33-901a-f5441e67d0d6")
    public static UseCaseDiagramVariability safeInstantiate(final UseCaseDiagram obj) throws IllegalArgumentException {
        if (UseCaseDiagramVariability.canInstantiate(obj))
        	return new UseCaseDiagramVariability(obj);
        else
        	throw new IllegalArgumentException("UseCaseDiagramVariability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("814bd30a-29f3-44ea-9de5-1c1446a1e73e")
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
        UseCaseDiagramVariability other = (UseCaseDiagramVariability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link UseCaseDiagram}. 
     * @return the UseCaseDiagram represented by this proxy, never null.
     */
    @objid ("b3834940-ff14-4fdb-ade7-815a96becb2a")
    @Override
    public UseCaseDiagram getElement() {
        return (UseCaseDiagram)super.getElement();
    }

    @objid ("e84a2b37-27d5-4046-b7e3-89cd73088e67")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1447f77a-09c7-441e-b8a9-8a58657f34f3")
    protected UseCaseDiagramVariability(final UseCaseDiagram elt) {
        super(elt);
    }

    @objid ("ecd98297-8490-4343-8c46-7cdb411be5ab")
    public static final class MdaTypes {
        @objid ("c097d840-971f-4d1d-80bb-7f6b4c3eda22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b104d41b-1aa8-421b-9370-f474af81673d")
        private static Stereotype MDAASSOCDEP;

        @objid ("f3c9ced4-f107-40f6-9257-2ed60af7cc7b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("340bca0d-351c-4bb4-a885-cc53a84655fc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e03a90f1-d88d-4ee7-a169-3d4c07e7c238");
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
