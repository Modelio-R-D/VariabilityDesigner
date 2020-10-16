/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << FeatureModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2e974c37-91e7-4a51-87c7-c5b37727fb97")
public class FeatureModel {
    @objid ("8021de3f-e691-42d4-9cd5-784c9223b6f9")
    public static final String STEREOTYPE_NAME = "FeatureModel";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("f6648571-6c06-42e5-8526-420a06dc9fc0")
    protected final Package elt;

    /**
     * Tells whether a {@link FeatureModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << FeatureModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("80ba8779-c844-4b63-b5a3-039bcc287269")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << FeatureModel >> then instantiate a {@link FeatureModel} proxy.
     * 
     * @return a {@link FeatureModel} proxy on the created {@link Package}.
     */
    @objid ("1c66fc09-a384-4f5a-9600-d3ef6c02cbdb")
    public static FeatureModel create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureModel.STEREOTYPE_NAME);
        return FeatureModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link FeatureModel} proxy from a {@link Package} stereotyped << FeatureModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link FeatureModel} proxy or <i>null</i>.
     */
    @objid ("1cb2b317-c37c-4beb-b1ba-856cf0dcf8b9")
    public static FeatureModel instantiate(final Package obj) {
        return FeatureModel.canInstantiate(obj) ? new FeatureModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureModel} proxy from a {@link Package} stereotyped << FeatureModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link FeatureModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("48661dee-1425-4856-998c-479a0987d090")
    public static FeatureModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (FeatureModel.canInstantiate(obj))
        	return new FeatureModel(obj);
        else
        	throw new IllegalArgumentException("FeatureModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("942ac058-769f-4474-be65-3156da6c5acc")
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
        FeatureModel other = (FeatureModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("77a6eac0-5b48-4276-b145-9284710f7c08")
    public Package getElement() {
        return this.elt;
    }

    @objid ("392382c2-4858-4a56-9043-64c3f10437e6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5782d162-bb1b-42ed-bc4d-898bd2004633")
    protected FeatureModel(final Package elt) {
        this.elt = elt;
    }

    @objid ("4cb7f9c1-c03b-4fa9-bdd4-a57abd3c9e46")
    public static final class MdaTypes {
        @objid ("c33459e5-dc2d-46da-9ab5-4e2415f6b63f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c92528d-6d8d-4465-9303-9b8276b842c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("a149b073-4633-421e-bb9e-883a24e3391c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fc92c6fe-cf43-4f65-a09b-b7857bb3d074")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9e29638a-e6aa-4437-9bfc-1961caa78867");
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
