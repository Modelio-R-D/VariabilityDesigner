/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.variation.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << Alternative_Structural_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlternativeStructuralVariation extends Variation {
    public static final String STEREOTYPE_NAME = "Alternative_Structural_Variation";

    public static final String CONDITION_TAGTYPE = "Condition";

    public static final String TYPE_TAGTYPE = "Type";

    /**
     * Tells whether a {@link AlternativeStructuralVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Alternative_Structural_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeStructuralVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Alternative_Structural_Variation >> then instantiate a {@link AlternativeStructuralVariation} proxy.
     * 
     * @return a {@link AlternativeStructuralVariation} proxy on the created {@link Constraint}.
     */
    public static AlternativeStructuralVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeStructuralVariation.STEREOTYPE_NAME);
        return AlternativeStructuralVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link AlternativeStructuralVariation} proxy from a {@link Constraint} stereotyped << Alternative_Structural_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link AlternativeStructuralVariation} proxy or <i>null</i>.
     */
    public static AlternativeStructuralVariation instantiate(final Constraint obj) {
        return AlternativeStructuralVariation.canInstantiate(obj) ? new AlternativeStructuralVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlternativeStructuralVariation} proxy from a {@link Constraint} stereotyped << Alternative_Structural_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link AlternativeStructuralVariation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlternativeStructuralVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AlternativeStructuralVariation.canInstantiate(obj))
            return new AlternativeStructuralVariation(obj);
        else
            throw new IllegalArgumentException("AlternativeStructuralVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AlternativeStructuralVariation other = (AlternativeStructuralVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCondition() {
        return this.elt.getTagValue(AlternativeStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}.
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getType() {
        return this.elt.getTagValue(AlternativeStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCondition(final String value) {
        this.elt.putTagValue(AlternativeStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setType(final String value) {
        this.elt.putTagValue(AlternativeStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    protected AlternativeStructuralVariation(final Constraint elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TYPE_TAGTYPE_ELT;

        public static TagType CONDITION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bc83b3b7-a7bb-44f1-b3b1-8a0f60e3a7a2");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7fc513ff-2c09-4b58-a0ef-8a427170891c");
            CONDITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd0ff7fd-68d5-4591-bdb9-e901d7c78697");
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
