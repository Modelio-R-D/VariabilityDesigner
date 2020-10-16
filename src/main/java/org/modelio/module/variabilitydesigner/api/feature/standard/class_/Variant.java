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
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.Feature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.FeatureRoot;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Variant >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("939b5316-2866-4100-bc9b-8c9e61d4b80c")
public class Variant {
    @objid ("40c17591-caf4-4f3b-8d27-930968f335f4")
    public static final String STEREOTYPE_NAME = "Variant";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("01bb24f5-eae6-4e74-b3f2-53500435ed45")
    protected final Class elt;

    /**
     * Tells whether a {@link Variant proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Variant >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9329b27-8eb7-48d1-8054-452ef9edccd7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, Variant.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Variant >> then instantiate a {@link Variant} proxy.
     * 
     * @return a {@link Variant} proxy on the created {@link Class}.
     */
    @objid ("1862d85e-cc03-460d-8f59-52391597b106")
    public static Variant create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, Variant.STEREOTYPE_NAME);
        return Variant.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Variant} proxy from a {@link Class} stereotyped << Variant >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Variant} proxy or <i>null</i>.
     */
    @objid ("b0ac5115-69df-4916-a799-7923265943c4")
    public static Variant instantiate(final Class obj) {
        return Variant.canInstantiate(obj) ? new Variant(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Variant} proxy from a {@link Class} stereotyped << Variant >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Variant} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cb876e5c-e655-4975-9043-129dd7b9c2c5")
    public static Variant safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Variant.canInstantiate(obj))
        	return new Variant(obj);
        else
        	throw new IllegalArgumentException("Variant: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'feature' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b4a66323-627c-4f16-9ce7-dc4a99dcc3a2")
    public void addFeature(final Feature obj) {
        if (obj != null) {
            IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Variant.MdaTypes.MDAASSOCDEP);
            d.setName("feature");
            d.putTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE, "feature");
        }
    }

    @objid ("7f87a6cf-f8d7-4ff7-aa13-fd56fa1918ca")
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
        Variant other = (Variant) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9a434324-875e-4a49-bb7d-294c1e32bfdb")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'feature' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("64248b80-c957-43d8-a736-cb0048b400c8")
    public List<Feature> getFeature() {
        List<Feature> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(Variant.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE), "feature")
              && Feature.canInstantiate(d.getDependsOn()))
                results.add((Feature)VariabilityDesignerProxyFactory.instantiate(d.getDependsOn(), Feature.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'root' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a3b0b4f4-8ae5-4c10-aa27-2e302358c720")
    public FeatureRoot getRoot() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Variant.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE), "root")
                  && FeatureRoot.canInstantiate(d.getDependsOn())) {
                     return (FeatureRoot)VariabilityDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureRoot.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f20056fe-1b65-4c85-8bf3-945f8f2f50e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'feature' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("817674f3-d409-49ce-b29c-deeeb890431f")
    public boolean removeFeature(final Feature obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Variant.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE), "variant")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'root' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6f216e49-1879-4e3b-842b-4741a75b45f5")
    public void setRoot(final FeatureRoot obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Variant.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE), "root")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Variant.MdaTypes.MDAASSOCDEP);
              dep.setName("root");      dep.putTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE, "root");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("83ec2c4a-dc63-4224-87e3-9175193d577e")
    protected Variant(final Class elt) {
        this.elt = elt;
    }

    @objid ("39e8d603-3926-4a17-8311-d44221e18817")
    public static final class MdaTypes {
        @objid ("3a273cd0-3e88-4486-bc8d-f3bfdd2f0449")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f58d5171-896c-41dd-bac0-cd14ae3dd0d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("76c23401-72d3-4211-ab41-1eb2fd20de75")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6ce9a233-9f3f-4c1c-9320-14066e658c31")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d3208dba-742d-40c8-8e15-d84aa3f1bfc8");
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
