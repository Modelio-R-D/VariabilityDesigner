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
 * Proxy class to handle a {@link Class} with << OrFeature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a47886f2-a78e-41d0-b16b-ff3d34a99909")
public class OrFeature extends Feature {
    @objid ("c1806798-5c6d-4fac-8c1c-12eed823e37c")
    public static final String STEREOTYPE_NAME = "OrFeature";

    /**
     * Tells whether a {@link OrFeature proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OrFeature >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4743f84e-ad16-4b39-a421-a5d6c84a1917")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OrFeature >> then instantiate a {@link OrFeature} proxy.
     * 
     * @return a {@link OrFeature} proxy on the created {@link Class}.
     */
    @objid ("104c280e-e89f-494f-a184-fd46cff23b5d")
    public static OrFeature create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME);
        return OrFeature.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OrFeature} proxy from a {@link Class} stereotyped << OrFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link OrFeature} proxy or <i>null</i>.
     */
    @objid ("9b91263e-4466-4dba-b645-e1800773ab74")
    public static OrFeature instantiate(final Class obj) {
        return OrFeature.canInstantiate(obj) ? new OrFeature(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OrFeature} proxy from a {@link Class} stereotyped << OrFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link OrFeature} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d74851a-f55e-4bb4-94fb-564382b27ee9")
    public static OrFeature safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OrFeature.canInstantiate(obj))
        	return new OrFeature(obj);
        else
        	throw new IllegalArgumentException("OrFeature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dba63b1e-aad5-4b7e-ab15-9b3b04f7ac3c")
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
        OrFeature other = (OrFeature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("29f089be-ca42-4171-975f-0da8f11aa6c7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("e88c858e-76f4-4ca0-98a0-a12522f29a34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b54edfcf-f0d1-420b-ab3b-57e69d0457f8")
    protected OrFeature(final Class elt) {
        super(elt);
    }

    @objid ("985a11db-d643-40e0-9ba1-9dafd0c23801")
    public static final class MdaTypes {
        @objid ("6996ae2c-0983-4971-85cb-18967f6a236a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c3daf46c-3ea5-4aa9-812b-256419b0e733")
        private static Stereotype MDAASSOCDEP;

        @objid ("90bc2048-30ca-4526-9c26-4f697c8fb253")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ad095541-dac4-4cdf-bd6d-ad68a3a76b71")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a33dfdac-cf62-4751-b671-820cee4606f6");
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
