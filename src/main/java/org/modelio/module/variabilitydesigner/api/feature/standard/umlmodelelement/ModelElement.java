/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.umlmodelelement;

import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.Feature;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link UmlModelElement} metaclass.
 * <p>Description:
 * <br/><i>ModelElement</i></p>
 */
public class ModelElement {
    public static final String FEATURE_NOTETYPE = "Feature";

    /**
     * The underlying {@link UmlModelElement} represented by this proxy, never null.
     */
    protected final UmlModelElement elt;

    /**
     * Tells whether a {@link ModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link UmlModelElement}.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return (elt instanceof UmlModelElement);
    }

    /**
     * Tries to instantiate a {@link ModelElement} proxy from a {@link UmlModelElement} checking its metaclass.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a UmlModelElement
     * @return a {@link ModelElement} proxy or <i>null</i>.
     */
    public static ModelElement instantiate(final UmlModelElement obj) {
        return ModelElement.canInstantiate(obj) ? new ModelElement(obj) : null;
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
        ModelElement other = (ModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link UmlModelElement}.
     * 
     * @return the UmlModelElement represented by this proxy, never null.
     */
    public UmlModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'Feature'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    public String getFeatureNote() {
        return this.elt.getNoteContent(ModelElement.MdaTypes.FEATURE_NOTETYPE_ELT);
    }

    /**
     * Get the value of the 'relatedFeature' role.<p>
     * Role description:
     * null
     */
    public Feature getRelatedFeature() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(ModelElement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ModelElement.MdaTypes.MDAASSOCDEP_ROLE), "featuredElt")
              && Feature.canInstantiate(d.getImpacted())) {
                  return (Feature)VariabilityDesignerProxyFactory.instantiate(d.getImpacted(), Feature.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'Feature'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    public void setFeatureNote(final String value) {
        this.elt.putNoteContent(ModelElement.MdaTypes.FEATURE_NOTETYPE_ELT, value);
    }

    /**
     * Set the value of the 'relatedFeature' role.<p>
     * Role description:
     * null
     */
    public void setRelatedFeature(final Feature obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(ModelElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ModelElement.MdaTypes.MDAASSOCDEP_ROLE), "featuredElt")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, ModelElement.MdaTypes.MDAASSOCDEP);
              dep.setName("featuredElt");
              dep.putTagValue(ModelElement.MdaTypes.MDAASSOCDEP_ROLE, "featuredElt");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    protected ModelElement(final UmlModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static NoteType FEATURE_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            FEATURE_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "a0a32e9f-4557-446b-8453-6da2529f505e");
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
