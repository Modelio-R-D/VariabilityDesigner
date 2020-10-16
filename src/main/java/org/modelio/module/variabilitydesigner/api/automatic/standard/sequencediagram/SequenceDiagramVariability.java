/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.standard.sequencediagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.SequenceDiagram;
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
 * Proxy class to handle a {@link SequenceDiagram} with << Sequence_Diagram_(Variability) >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("67c30a19-5d9d-4659-98dc-1a97023009b2")
public class SequenceDiagramVariability extends VariationDiagram {
    @objid ("047550c7-5239-481f-8a8b-9c727c868ab7")
    public static final String STEREOTYPE_NAME = "Sequence_Diagram_(Variability)";

    /**
     * Tells whether a {@link SequenceDiagramVariability proxy} can be instantiated from a {@link MObject} checking it is a {@link SequenceDiagram} stereotyped << Sequence_Diagram_(Variability) >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bdc36726-1015-489c-bc0e-1995c7f9f055")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof SequenceDiagram) && ((SequenceDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, SequenceDiagramVariability.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link SequenceDiagram} stereotyped << Sequence_Diagram_(Variability) >> then instantiate a {@link SequenceDiagramVariability} proxy.
     * 
     * @return a {@link SequenceDiagramVariability} proxy on the created {@link SequenceDiagram}.
     */
    @objid ("605ee59d-d6aa-4552-839e-61239855e1d3")
    public static SequenceDiagramVariability create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.SequenceDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, SequenceDiagramVariability.STEREOTYPE_NAME);
        return SequenceDiagramVariability.instantiate((SequenceDiagram)e);
    }

    /**
     * Tries to instantiate a {@link SequenceDiagramVariability} proxy from a {@link SequenceDiagram} stereotyped << Sequence_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a SequenceDiagram
     * @return a {@link SequenceDiagramVariability} proxy or <i>null</i>.
     */
    @objid ("9bd0072f-e5e6-4d20-b447-48bc495eb9d3")
    public static SequenceDiagramVariability instantiate(final SequenceDiagram obj) {
        return SequenceDiagramVariability.canInstantiate(obj) ? new SequenceDiagramVariability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SequenceDiagramVariability} proxy from a {@link SequenceDiagram} stereotyped << Sequence_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link SequenceDiagram}
     * @return a {@link SequenceDiagramVariability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("00c0ae06-2577-42c2-8614-8ff936859a86")
    public static SequenceDiagramVariability safeInstantiate(final SequenceDiagram obj) throws IllegalArgumentException {
        if (SequenceDiagramVariability.canInstantiate(obj))
        	return new SequenceDiagramVariability(obj);
        else
        	throw new IllegalArgumentException("SequenceDiagramVariability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("041fc7ba-39df-4330-9954-1ae3db9f874d")
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
        SequenceDiagramVariability other = (SequenceDiagramVariability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link SequenceDiagram}. 
     * @return the SequenceDiagram represented by this proxy, never null.
     */
    @objid ("00719f3b-6518-4eac-9a84-b261cddd9018")
    @Override
    public SequenceDiagram getElement() {
        return (SequenceDiagram)super.getElement();
    }

    @objid ("5d3671e1-22f9-4637-a8ab-c9817d91a528")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3234581e-d1a6-4f2c-9e64-78214c10908a")
    protected SequenceDiagramVariability(final SequenceDiagram elt) {
        super(elt);
    }

    @objid ("c959d3ce-53de-4b69-839b-77ea65f2a591")
    public static final class MdaTypes {
        @objid ("325c4ba0-2aff-4d0c-8fb8-b7f4c1869082")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87c15122-e12a-4ed1-8b0f-4534debdbae6")
        private static Stereotype MDAASSOCDEP;

        @objid ("52c665c0-495d-4778-ab8c-2ea2c294c313")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42d5b07e-d233-41fe-a201-e54089d2d9a6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd2fe02a-d8c7-40d9-898b-46177e9cf19f");
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
