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
 * Proxy class to handle a {@link Class} with << Variant >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class Variant {
    public static final String STEREOTYPE_NAME = "Variant";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link Variant proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Variant >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, Variant.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Variant >> then instantiate a {@link Variant} proxy.
     * 
     * @return a {@link Variant} proxy on the created {@link Class}.
     */
    public static Variant create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, Variant.STEREOTYPE_NAME);
        return Variant.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Variant} proxy from a {@link Class} stereotyped << Variant >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Variant} proxy or <i>null</i>.
     */
    public static Variant instantiate(final Class obj) {
        return Variant.canInstantiate(obj) ? new Variant(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Variant} proxy from a {@link Class} stereotyped << Variant >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Variant} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
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
     */
    public void addFeature(final Feature obj) {
        if (obj != null) {
            IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Variant.MdaTypes.MDAASSOCDEP);
            d.setName("feature");
            d.putTagValue(Variant.MdaTypes.MDAASSOCDEP_ROLE, "feature");
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
        Variant other = (Variant) obj;
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
     * Get the values of the 'feature' role.<p>
     * Role description:
     * null
     */
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
     */
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'feature' role.<p>
     * Role description:
     * null
     */
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
     */
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

    protected Variant(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
