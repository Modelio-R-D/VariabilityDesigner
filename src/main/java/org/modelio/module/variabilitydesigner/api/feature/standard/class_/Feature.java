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
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Feature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class Feature {
    public static final String STEREOTYPE_NAME = "Feature";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link Feature proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Feature >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Feature >> then instantiate a {@link Feature} proxy.
     * 
     * @return a {@link Feature} proxy on the created {@link Class}.
     */
    public static Feature create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME);
        return Feature.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Feature} proxy from a {@link Class} stereotyped << Feature >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Feature} proxy or <i>null</i>.
     */
    public static Feature instantiate(final Class obj) {
        return Feature.canInstantiate(obj) ? new Feature(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Feature} proxy from a {@link Class} stereotyped << Feature >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Feature} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static Feature safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Feature.canInstantiate(obj))
            return new Feature(obj);
        else
            throw new IllegalArgumentException("Feature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'featuredElt' role.<p>
     * Role description:
     * null
     */
    public void addFeaturedElt(final ModelElement obj) {
        if (obj != null) {
            IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj, Feature.MdaTypes.MDAASSOCDEP);
            d.setName("featuredElt");
            d.putTagValue(Feature.MdaTypes.MDAASSOCDEP_ROLE, "featuredElt");
        }
    }

    /**
     * Add a value of the 'variant' role.<p>
     * Role description:
     * null
     */
    public void addVariant(final Variant obj) {
        if (obj != null) {
            IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, Feature.MdaTypes.MDAASSOCDEP);
            d.setName("feature");
            d.putTagValue(Feature.MdaTypes.MDAASSOCDEP_ROLE, "feature");
        }
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
        Feature other = (Feature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'featuredElt' role.<p>
     * Role description:
     * null
     */
    public List<ModelElement> getFeaturedElt() {
        List<ModelElement> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(Feature.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Feature.MdaTypes.MDAASSOCDEP_ROLE), "featuredElt"))
                results.add(d.getDependsOn());
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'variant' role.<p>
     * Role description:
     * null
     */
    public List<Variant> getVariant() {
        List<Variant> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(Feature.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Feature.MdaTypes.MDAASSOCDEP_ROLE), "feature")
              && Variant.canInstantiate(d.getImpacted())) {
                 results.add((Variant)VariabilityDesignerProxyFactory.instantiate(d.getImpacted(), Variant.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'featuredElt' role.<p>
     * Role description:
     * null
     */
    public boolean removeFeaturedElt(final ModelElement obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Feature.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Feature.MdaTypes.MDAASSOCDEP_ROLE), "relatedFeature"))
              if (Objects.equals(d.getDependsOn(), obj)) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from 'variant' role.<p>
     * Role description:
     * null
     */
    public boolean removeVariant(final Variant obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(Feature.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Feature.MdaTypes.MDAASSOCDEP_ROLE), "feature"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    protected Feature(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7477447f-27bb-4997-b4d4-49785dee4238");
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
