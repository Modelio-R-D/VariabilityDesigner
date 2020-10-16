/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.feature.standard.umlmodelelement;

import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("af9544a7-7894-4094-b41c-95fffac80f62")
public class ModelElement {
    @objid ("38427820-b606-4fe9-b16e-13609b551ca0")
    public static final String FEATURE_NOTETYPE = "Feature";

    /**
     * The underlying {@link UmlModelElement} represented by this proxy, never null.
     */
    @objid ("b19fc752-54f2-4e7a-afdc-25afa30704ab")
    protected final UmlModelElement elt;

    /**
     * Tells whether a {@link ModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link UmlModelElement}.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("023a2c4b-3ff6-4fac-b2ef-610e034838d1")
    public static boolean canInstantiate(final MObject elt) {
        return (elt instanceof UmlModelElement);
    }

    /**
     * Tries to instantiate a {@link ModelElement} proxy from a {@link UmlModelElement} checking its metaclass.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a UmlModelElement
     * @return a {@link ModelElement} proxy or <i>null</i>.
     */
    @objid ("471ca3a2-7594-49c7-8ede-9781d82dfa2f")
    public static ModelElement instantiate(final UmlModelElement obj) {
        return ModelElement.canInstantiate(obj) ? new ModelElement(obj) : null;
    }

    @objid ("218b052d-34bb-436d-9d62-008143ef8022")
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
     * @return the UmlModelElement represented by this proxy, never null.
     */
    @objid ("3bfee931-3f30-4cf0-90f9-0bf533ff7624")
    public UmlModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'Feature'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("8aaedc49-0e98-4fa7-825a-eddbafdb3c89")
    public String getFeatureNote() {
        return this.elt.getNoteContent(ModelElement.MdaTypes.FEATURE_NOTETYPE_ELT);
    }

    /**
     * Get the value of the 'relatedFeature' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("429862b3-28b5-4e5d-a16b-04f690ce4d03")
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

    @objid ("f6a70086-dc7f-4fd4-881f-3f36faedcfcf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'Feature'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("af6f797f-237f-4de5-9da0-e04a3be5b543")
    public void setFeatureNote(final String value) {
        this.elt.putNoteContent(ModelElement.MdaTypes.FEATURE_NOTETYPE_ELT, value);
    }

    /**
     * Set the value of the 'relatedFeature' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("6443499f-0952-4b61-b2bf-c39ce020bc1e")
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

    @objid ("740b7862-692d-4363-8168-fff3ed74c31d")
    protected ModelElement(final UmlModelElement elt) {
        this.elt = elt;
    }

    @objid ("0a5033bc-cc0f-4724-8b97-6df4390f7785")
    public static final class MdaTypes {
        @objid ("1bb589ea-203a-4dfc-b886-e70551493b8a")
        public static NoteType FEATURE_NOTETYPE_ELT;

        @objid ("c8bfb69a-3e97-4394-874d-c482c814316a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ce83a73-621b-4f94-a5ac-6363ea0e0cd3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("05cdd2e6-df51-4b33-bfc1-67e99176d15f")
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
