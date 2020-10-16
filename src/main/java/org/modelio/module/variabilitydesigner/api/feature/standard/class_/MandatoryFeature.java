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
 * Proxy class to handle a {@link Class} with << MandatoryFeature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f9a88220-fe1f-4720-964a-ace39b4d0da8")
public class MandatoryFeature extends Feature {
    @objid ("8b209d71-cd33-4280-8d7a-80f9e2c65b91")
    public static final String STEREOTYPE_NAME = "MandatoryFeature";

    /**
     * Tells whether a {@link MandatoryFeature proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MandatoryFeature >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8bcbd7e-8231-44b4-8f4c-1acd8d29eac9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MandatoryFeature >> then instantiate a {@link MandatoryFeature} proxy.
     * 
     * @return a {@link MandatoryFeature} proxy on the created {@link Class}.
     */
    @objid ("a86dd5f6-a08b-4e23-97a2-a9024580da6a")
    public static MandatoryFeature create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME);
        return MandatoryFeature.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MandatoryFeature} proxy from a {@link Class} stereotyped << MandatoryFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MandatoryFeature} proxy or <i>null</i>.
     */
    @objid ("b9e76a6a-31f4-4051-82bc-ca5d6977175f")
    public static MandatoryFeature instantiate(final Class obj) {
        return MandatoryFeature.canInstantiate(obj) ? new MandatoryFeature(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MandatoryFeature} proxy from a {@link Class} stereotyped << MandatoryFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MandatoryFeature} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9426cab4-e9a0-498f-b964-16d220a4ea5f")
    public static MandatoryFeature safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MandatoryFeature.canInstantiate(obj))
        	return new MandatoryFeature(obj);
        else
        	throw new IllegalArgumentException("MandatoryFeature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ffce1041-d5db-41cb-bda2-f78c06e066e1")
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
        MandatoryFeature other = (MandatoryFeature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e54e58e8-eb2e-4b26-9ec6-71c7d9b43059")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("1bb671cb-449e-40e8-93c7-7b46d7977345")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ee8fe65e-eb93-44b1-946e-2d30a9b770dc")
    protected MandatoryFeature(final Class elt) {
        super(elt);
    }

    @objid ("4699ea48-1417-4aac-abcd-6b0cb248048b")
    public static final class MdaTypes {
        @objid ("a6ac8bf4-dec8-4f3a-81ac-f855dafbb7fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3b4c562-beaa-4aa7-afdb-7e5d08ad0234")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4b1cea9-0e50-4b3c-a327-d0c468bb6383")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ce427cb-45ca-43d2-a90e-b0600fe17791")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "523c9b53-38f5-4f81-887d-57d47ee96b91");
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
