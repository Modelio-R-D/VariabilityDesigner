/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.infrastructure.matrixdefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link MatrixDefinition} with << VariantDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class VariantDefinition {
    public static final String STEREOTYPE_NAME = "VariantDefinition";

    /**
     * The underlying {@link MatrixDefinition} represented by this proxy, never null.
     */
    protected final MatrixDefinition elt;

    /**
     * Tells whether a {@link VariantDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link MatrixDefinition} stereotyped << VariantDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof MatrixDefinition) && ((MatrixDefinition) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, VariantDefinition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link MatrixDefinition} stereotyped << VariantDefinition >> then instantiate a {@link VariantDefinition} proxy.
     * 
     * @return a {@link VariantDefinition} proxy on the created {@link MatrixDefinition}.
     */
    public static VariantDefinition create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.MatrixDefinition");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, VariantDefinition.STEREOTYPE_NAME);
        return VariantDefinition.instantiate((MatrixDefinition)e);
    }

    /**
     * Tries to instantiate a {@link VariantDefinition} proxy from a {@link MatrixDefinition} stereotyped << VariantDefinition >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a MatrixDefinition
     * @return a {@link VariantDefinition} proxy or <i>null</i>.
     */
    public static VariantDefinition instantiate(final MatrixDefinition obj) {
        return VariantDefinition.canInstantiate(obj) ? new VariantDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VariantDefinition} proxy from a {@link MatrixDefinition} stereotyped << VariantDefinition >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link MatrixDefinition}
     * @return a {@link VariantDefinition} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static VariantDefinition safeInstantiate(final MatrixDefinition obj) throws IllegalArgumentException {
        if (VariantDefinition.canInstantiate(obj))
            return new VariantDefinition(obj);
        else
            throw new IllegalArgumentException("VariantDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        VariantDefinition other = (VariantDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link MatrixDefinition}.
     * 
     * @return the MatrixDefinition represented by this proxy, never null.
     */
    public MatrixDefinition getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected VariantDefinition(final MatrixDefinition elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7482db0-6136-496c-b767-fa2e748eb902");
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
