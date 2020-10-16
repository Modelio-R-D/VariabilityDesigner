/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AbstractDiagram} with << Variation_Diagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class VariationDiagram {
    public static final String STEREOTYPE_NAME = "Variation_Diagram";

    /**
     * The underlying {@link AbstractDiagram} represented by this proxy, never null.
     */
    protected final AbstractDiagram elt;

    /**
     * Tells whether a {@link VariationDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link AbstractDiagram} stereotyped << Variation_Diagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AbstractDiagram) && ((AbstractDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, VariationDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AbstractDiagram} stereotyped << Variation_Diagram >> then instantiate a {@link VariationDiagram} proxy.
     * 
     * @return a {@link VariationDiagram} proxy on the created {@link AbstractDiagram}.
     */
    public static VariationDiagram create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.AbstractDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, VariationDiagram.STEREOTYPE_NAME);
        return VariationDiagram.instantiate((AbstractDiagram)e);
    }

    /**
     * Tries to instantiate a {@link VariationDiagram} proxy from a {@link AbstractDiagram} stereotyped << Variation_Diagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a AbstractDiagram
     * @return a {@link VariationDiagram} proxy or <i>null</i>.
     */
    public static VariationDiagram instantiate(final AbstractDiagram obj) {
        return VariationDiagram.canInstantiate(obj) ? new VariationDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VariationDiagram} proxy from a {@link AbstractDiagram} stereotyped << Variation_Diagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link AbstractDiagram}
     * @return a {@link VariationDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static VariationDiagram safeInstantiate(final AbstractDiagram obj) throws IllegalArgumentException {
        if (VariationDiagram.canInstantiate(obj))
            return new VariationDiagram(obj);
        else
            throw new IllegalArgumentException("VariationDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        VariationDiagram other = (VariationDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AbstractDiagram}.
     * 
     * @return the AbstractDiagram represented by this proxy, never null.
     */
    public AbstractDiagram getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected VariationDiagram(final AbstractDiagram elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "80f753fc-c7a9-424d-9b5a-b9475971dad9");
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
