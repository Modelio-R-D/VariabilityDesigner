/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << OptionalFeature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b78a7b97-1700-4445-99fb-273c076e7394")
public class OptionalFeature extends Feature {
    @objid ("ddf4c779-e453-4544-abb4-390783aedff8")
    public static final String STEREOTYPE_NAME = "OptionalFeature";

    /**
     * Tells whether a {@link OptionalFeature proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OptionalFeature >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("915ff068-a911-4a9b-bdfb-4fc5ff5bf8fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OptionalFeature >> then instantiate a {@link OptionalFeature} proxy.
     * 
     * @return a {@link OptionalFeature} proxy on the created {@link Class}.
     */
    @objid ("d4d06285-1e70-4082-a9bf-af277fe3a997")
    public static OptionalFeature create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME);
        return OptionalFeature.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OptionalFeature} proxy from a {@link Class} stereotyped << OptionalFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link OptionalFeature} proxy or <i>null</i>.
     */
    @objid ("9047de1a-eb4c-49d7-a55d-107be0470521")
    public static OptionalFeature instantiate(final Class obj) {
        return OptionalFeature.canInstantiate(obj) ? new OptionalFeature(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptionalFeature} proxy from a {@link Class} stereotyped << OptionalFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link OptionalFeature} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ad3d53f-7d7f-45f4-b69b-4eac01f59ec4")
    public static OptionalFeature safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OptionalFeature.canInstantiate(obj))
        	return new OptionalFeature(obj);
        else
        	throw new IllegalArgumentException("OptionalFeature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb7103d3-555d-431f-8802-9ab51bd7e9b1")
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
        OptionalFeature other = (OptionalFeature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("67f073d3-d48c-4daa-8f3c-e0ffc65c13c6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ecc313f8-d0fd-49e1-afec-d185340481b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b369f32f-f007-480e-82dd-332ac07b44a9")
    protected OptionalFeature(final Class elt) {
        super(elt);
    }

    @objid ("f7f3ee67-f9aa-471f-97e2-3e5a0ce9ac8a")
    public static final class MdaTypes {
        @objid ("5dfdba44-977e-479a-9ef6-a7ac1b351bcf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63d7b6ca-8658-407e-81bb-ba4ceb095b7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c0bb785-7c9f-49d3-beff-c057b2905352")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4320722-31f8-4e4b-971d-32a06a1823d7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7f47f70f-9623-422b-b953-1791a7dc994c");
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
