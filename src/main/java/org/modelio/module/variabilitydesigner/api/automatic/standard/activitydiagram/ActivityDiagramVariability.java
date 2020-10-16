/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.standard.activitydiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ActivityDiagram;
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
 * Proxy class to handle a {@link ActivityDiagram} with << Activity_Diagram_(Variability) >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ActivityDiagramVariability extends VariationDiagram {
    public static final String STEREOTYPE_NAME = "Activity_Diagram_(Variability)";

    /**
     * Tells whether a {@link ActivityDiagramVariability proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityDiagram} stereotyped << Activity_Diagram_(Variability) >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityDiagram) && ((ActivityDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, ActivityDiagramVariability.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityDiagram} stereotyped << Activity_Diagram_(Variability) >> then instantiate a {@link ActivityDiagramVariability} proxy.
     * 
     * @return a {@link ActivityDiagramVariability} proxy on the created {@link ActivityDiagram}.
     */
    public static ActivityDiagramVariability create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ActivityDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, ActivityDiagramVariability.STEREOTYPE_NAME);
        return ActivityDiagramVariability.instantiate((ActivityDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ActivityDiagramVariability} proxy from a {@link ActivityDiagram} stereotyped << Activity_Diagram_(Variability) >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ActivityDiagram
     * @return a {@link ActivityDiagramVariability} proxy or <i>null</i>.
     */
    public static ActivityDiagramVariability instantiate(final ActivityDiagram obj) {
        return ActivityDiagramVariability.canInstantiate(obj) ? new ActivityDiagramVariability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ActivityDiagramVariability} proxy from a {@link ActivityDiagram} stereotyped << Activity_Diagram_(Variability) >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ActivityDiagram}
     * @return a {@link ActivityDiagramVariability} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ActivityDiagramVariability safeInstantiate(final ActivityDiagram obj) throws IllegalArgumentException {
        if (ActivityDiagramVariability.canInstantiate(obj))
            return new ActivityDiagramVariability(obj);
        else
            throw new IllegalArgumentException("ActivityDiagramVariability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        ActivityDiagramVariability other = (ActivityDiagramVariability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ActivityDiagram}.
     * 
     * @return the ActivityDiagram represented by this proxy, never null.
     */
    @Override
    public ActivityDiagram getElement() {
        return (ActivityDiagram)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected ActivityDiagramVariability(final ActivityDiagram elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ab5fd973-2bd6-4d3e-9ec5-01774002b15d");
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
