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
 * Proxy class to handle a {@link Class} with << AlternativeFeature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1ca3059a-c96d-47f9-b809-1a70b42cedf8")
public class AlternativeFeature extends Feature {
    @objid ("efd93360-f94d-4560-bf14-7d2c105eac80")
    public static final String STEREOTYPE_NAME = "AlternativeFeature";

    /**
     * Tells whether a {@link AlternativeFeature proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << AlternativeFeature >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("61ce85ee-8602-4b72-8fe2-1ed9d6dd05dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << AlternativeFeature >> then instantiate a {@link AlternativeFeature} proxy.
     * 
     * @return a {@link AlternativeFeature} proxy on the created {@link Class}.
     */
    @objid ("b16e6b4a-a6e7-4bd8-8951-d954fbad1149")
    public static AlternativeFeature create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME);
        return AlternativeFeature.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link AlternativeFeature} proxy from a {@link Class} stereotyped << AlternativeFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link AlternativeFeature} proxy or <i>null</i>.
     */
    @objid ("80ac7c75-71ff-4aec-96aa-a9c1771b60ae")
    public static AlternativeFeature instantiate(final Class obj) {
        return AlternativeFeature.canInstantiate(obj) ? new AlternativeFeature(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlternativeFeature} proxy from a {@link Class} stereotyped << AlternativeFeature >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link AlternativeFeature} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1340df5f-0b89-40e5-954f-535a2c6e8331")
    public static AlternativeFeature safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AlternativeFeature.canInstantiate(obj))
        	return new AlternativeFeature(obj);
        else
        	throw new IllegalArgumentException("AlternativeFeature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("608c1ba4-e4e1-4336-8d15-084c15ff6ae8")
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
        AlternativeFeature other = (AlternativeFeature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2b854629-615b-4d3b-a83e-dcf46c248470")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("72b8de2e-5f10-45dd-97c9-bcab29f914a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fdb86775-62d9-48a7-bfa1-23005e9d9c1e")
    protected AlternativeFeature(final Class elt) {
        super(elt);
    }

    @objid ("f4136720-d5fc-413a-8193-49d86a436526")
    public static final class MdaTypes {
        @objid ("8d87a4ac-b235-4ae9-8a85-1343294cf371")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5888d8c5-871f-43a8-8ba0-edf83078b986")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e3fb44e-8873-4931-8c76-2d0d18979f8f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86ecfb3c-9f1c-47de-affb-434ec1ad654e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7a57929a-4732-49b8-aeab-83709e8be6c6");
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
