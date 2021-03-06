/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.00

 * This file was generated on 5/5/20 3:06 PM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
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
 * Proxy class to handle a {@link ClassDiagram} with << VariabilityDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class VariabilityDiagram {
    public static final String STEREOTYPE_NAME = "VariabilityDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link VariabilityDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << VariabilityDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, VariabilityDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << VariabilityDiagram >> then instantiate a {@link VariabilityDiagram} proxy.
     * 
     * @return a {@link VariabilityDiagram} proxy on the created {@link ClassDiagram}.
     */
    public static VariabilityDiagram create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, VariabilityDiagram.STEREOTYPE_NAME);
        return VariabilityDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link VariabilityDiagram} proxy from a {@link ClassDiagram} stereotyped << VariabilityDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link VariabilityDiagram} proxy or <i>null</i>.
     */
    public static VariabilityDiagram instantiate(final ClassDiagram obj) {
        return VariabilityDiagram.canInstantiate(obj) ? new VariabilityDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VariabilityDiagram} proxy from a {@link ClassDiagram} stereotyped << VariabilityDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link VariabilityDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static VariabilityDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (VariabilityDiagram.canInstantiate(obj))
            return new VariabilityDiagram(obj);
        else
            throw new IllegalArgumentException("VariabilityDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        VariabilityDiagram other = (VariabilityDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    public ClassDiagram getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected VariabilityDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "525c6525-7dd9-438e-8317-eb2ba304b770");
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
