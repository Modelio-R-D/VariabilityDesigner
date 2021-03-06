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
 * Proxy class to handle a {@link Class} with << FeatureRoot >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class FeatureRoot extends Feature {
    public static final String STEREOTYPE_NAME = "FeatureRoot";

    /**
     * Tells whether a {@link FeatureRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FeatureRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureRoot.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FeatureRoot >> then instantiate a {@link FeatureRoot} proxy.
     * 
     * @return a {@link FeatureRoot} proxy on the created {@link Class}.
     */
    public static FeatureRoot create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureRoot.STEREOTYPE_NAME);
        return FeatureRoot.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FeatureRoot} proxy from a {@link Class} stereotyped << FeatureRoot >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FeatureRoot} proxy or <i>null</i>.
     */
    public static FeatureRoot instantiate(final Class obj) {
        return FeatureRoot.canInstantiate(obj) ? new FeatureRoot(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureRoot} proxy from a {@link Class} stereotyped << FeatureRoot >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link FeatureRoot} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
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
     */
    public void addVariant(final Variant obj) {
        if (obj != null) {
            IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, FeatureRoot.MdaTypes.MDAASSOCDEP);
            d.setName("root");
            d.putTagValue(FeatureRoot.MdaTypes.MDAASSOCDEP_ROLE, "root");
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
        FeatureRoot other = (FeatureRoot) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'variant' role.<p>
     * Role description:
     * null
     */
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'variant' role.<p>
     * Role description:
     * null
     */
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

    protected FeatureRoot(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
