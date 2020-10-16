/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.projectsetup.standard.package_;

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
 * Proxy class to handle a {@link Package} with << model150 >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7e41c2d4-3d73-4b78-94c1-d1be998aa617")
public class Model150 {
    @objid ("f8997203-5783-4c86-9d57-d15ea52b854d")
    public static final String STEREOTYPE_NAME = "model150";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("99dc144f-0bfe-4f9a-9c07-8b08a3ffd868")
    protected final Package elt;

    /**
     * Tells whether a {@link Model150 proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << model150 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("127283d4-06e7-4f4b-b880-895fb2cb1d9e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, Model150.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << model150 >> then instantiate a {@link Model150} proxy.
     * 
     * @return a {@link Model150} proxy on the created {@link Package}.
     */
    @objid ("10e885f3-3a21-4a85-a8f2-064925060d4a")
    public static Model150 create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, Model150.STEREOTYPE_NAME);
        return Model150.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link Model150} proxy from a {@link Package} stereotyped << model150 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link Model150} proxy or <i>null</i>.
     */
    @objid ("24d60e20-1037-43c9-b9ef-fc11cf93cef1")
    public static Model150 instantiate(final Package obj) {
        return Model150.canInstantiate(obj) ? new Model150(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Model150} proxy from a {@link Package} stereotyped << model150 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link Model150} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("becf5f10-dc69-4d75-95cf-44c0e7c6b871")
    public static Model150 safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (Model150.canInstantiate(obj))
        	return new Model150(obj);
        else
        	throw new IllegalArgumentException("Model150: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("de97bb99-1ece-4bd4-9cb5-914c8ccdc234")
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
        Model150 other = (Model150) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("544fc9ce-f2ea-4682-bee4-850efa0c3691")
    public Package getElement() {
        return this.elt;
    }

    @objid ("aeb576e3-1f07-4064-9dfb-fbbd155be55c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7d898fa2-9207-4613-b262-c526b8bad376")
    protected Model150(final Package elt) {
        this.elt = elt;
    }

    @objid ("1b61205d-fc72-493b-bca2-b3549f9ce5d8")
    public static final class MdaTypes {
        @objid ("0ff1022a-ca8d-42ef-94fb-06ffb906a278")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("65b536b7-e6cc-4dc4-bb63-e6d51cc36f68")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e6ad3c8-09d2-4735-894d-8290fa22d7fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("758f0f1f-9977-4980-86e0-e4b790a33c10")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8518a7a5-144c-4189-a2c4-5bb7df84003f");
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
