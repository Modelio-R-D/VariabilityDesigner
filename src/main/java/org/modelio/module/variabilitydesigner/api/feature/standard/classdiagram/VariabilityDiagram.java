/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.00

 * This file was generated on 5/5/20 3:06 PM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("1f51683d-fa55-468f-a988-cce4e3c0d6ac")
public class VariabilityDiagram {
    @objid ("2310f658-521b-4d28-82c0-dee2ea2a3032")
    public static final String STEREOTYPE_NAME = "VariabilityDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("248d96d8-463f-4fe8-af29-17665658e36a")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link VariabilityDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << VariabilityDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ffc40db7-5329-40de-8500-3f9812f326e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, VariabilityDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << VariabilityDiagram >> then instantiate a {@link VariabilityDiagram} proxy.
     * 
     * @return a {@link VariabilityDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("f93ea8f6-942a-470e-b6ef-be267c77e113")
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
    @objid ("b9e8e1f7-9547-4d55-b428-8c503f982d97")
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
    @objid ("0dc9caa9-df3c-401e-a14a-a27fe3f1efbb")
    public static VariabilityDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (VariabilityDiagram.canInstantiate(obj))
            return new VariabilityDiagram(obj);
        else
            throw new IllegalArgumentException("VariabilityDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c7d013a2-15ed-4c90-92fe-a2355f134ab5")
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
    @objid ("9381cf5e-6270-4094-85c7-c58361ce867a")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("f54365a3-d57b-4cba-a816-d8a93eb0e1b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b6dfbfc3-57f5-4cfc-bb78-c90098015bde")
    protected VariabilityDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("4d214dce-c095-447c-ac38-7dcab6ba7555")
    public static final class MdaTypes {
        @objid ("30ece6c7-e08b-435e-a7d0-3be8a14317b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fc569ec4-6ec9-411a-b1ef-6b36a4288ef3")
        private static Stereotype MDAASSOCDEP;

        @objid ("00133a74-3c02-454e-afbf-fb3900de3e65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd5d0324-1d34-4cdc-9a21-921779177a9e")
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
