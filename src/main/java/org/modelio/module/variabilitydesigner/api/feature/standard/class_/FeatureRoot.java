/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.Variant;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << FeatureRoot >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("563bce98-be27-43c1-8fd1-58af9d80b4c8")
public class FeatureRoot extends Feature {
    @objid ("0522db50-0e59-4841-8a23-ea239bde2e13")
    public static final String STEREOTYPE_NAME = "FeatureRoot";

    /**
     * Tells whether a {@link FeatureRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FeatureRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c930e5a-63a0-49e9-89e9-93d58172f1aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureRoot.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FeatureRoot >> then instantiate a {@link FeatureRoot} proxy.
     * 
     * @return a {@link FeatureRoot} proxy on the created {@link Class}.
     */
    @objid ("8c4935a0-0cd0-4ca3-af0a-a24b7deb0e8b")
    public static FeatureRoot create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureRoot.STEREOTYPE_NAME);
        return FeatureRoot.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FeatureRoot} proxy from a {@link Class} stereotyped << FeatureRoot >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FeatureRoot} proxy or <i>null</i>.
     */
    @objid ("4aceaa05-1032-4713-adff-37151b83d9fa")
    public static FeatureRoot instantiate(final Class obj) {
        return FeatureRoot.canInstantiate(obj) ? new FeatureRoot(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureRoot} proxy from a {@link Class} stereotyped << FeatureRoot >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FeatureRoot} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c4eec3e6-5e2d-406b-9374-874ecbc9182c")
    public static FeatureRoot safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FeatureRoot.canInstantiate(obj))
        	return new FeatureRoot(obj);
        else
        	throw new IllegalArgumentException("FeatureRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'variant' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d25f3182-ace7-45f2-a977-338a58fa6ce6")
    public void addVariant(final Variant obj) {
        if (obj != null) {
            IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, FeatureRoot.MdaTypes.MDAASSOCDEP);
            d.setName("root");
            d.putTagValue(FeatureRoot.MdaTypes.MDAASSOCDEP_ROLE, "root");
        }
    }

    @objid ("b44f70f3-4039-48cc-8b52-6591d2b8e6d5")
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
        FeatureRoot other = (FeatureRoot) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("57a7c398-13a9-4c67-9d26-58656fb24066")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'variant' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e049ce99-cd83-4334-8583-f3332b7705c2")
    public List<Variant> getVariant() {
        List<Variant> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(FeatureRoot.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(FeatureRoot.MdaTypes.MDAASSOCDEP_ROLE), "root")
              && Variant.canInstantiate(d.getImpacted())) {
                 results.add((Variant)VariabilityDesignerProxyFactory.instantiate(d.getImpacted(), Variant.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0228c46a-e85b-4418-b5e8-555e8be5832f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'variant' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a8c7d75f-4316-4571-8fd6-aaffeaffd360")
    public boolean removeVariant(final Variant obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(FeatureRoot.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FeatureRoot.MdaTypes.MDAASSOCDEP_ROLE), "root"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("f62d417e-aa9a-4d8e-815e-73221c37ad48")
    protected FeatureRoot(final Class elt) {
        super(elt);
    }

    @objid ("d87852be-b3be-4179-9d26-6c5a5e4dc8a1")
    public static final class MdaTypes {
        @objid ("c315a9a2-2370-4cae-939a-4b55fd26cbf0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59527a55-f7b2-4a28-bcf4-a5a411381d5c")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e0f190d-76cc-4119-b73f-7bfb40c47797")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ae9890d3-573a-4d4e-bb35-7787d278483d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f64bc54e-2d80-4bae-98ed-792224160a56");
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
