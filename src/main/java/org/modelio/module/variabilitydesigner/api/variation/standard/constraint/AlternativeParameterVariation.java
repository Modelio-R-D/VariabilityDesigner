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
 * Proxy class to handle a {@link Constraint} with << Alternative_Parameter_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlternativeParameterVariation extends Variation {
    public static final String STEREOTYPE_NAME = "Alternative_Parameter_Variation";

    public static final String APPLIED_ON_TAGTYPE = "Applied_on";

    public static final String CONDITION_TAGTYPE = "Condition";

    public static final String TYPE_TAGTYPE = "Type";

    public static final String VALUE_TAGTYPE = "Value";

    /**
     * Tells whether a {@link AlternativeParameterVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Alternative_Parameter_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeParameterVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Alternative_Parameter_Variation >> then instantiate a {@link AlternativeParameterVariation} proxy.
     * 
     * @return a {@link AlternativeParameterVariation} proxy on the created {@link Constraint}.
     */
    public static AlternativeParameterVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeParameterVariation.STEREOTYPE_NAME);
        return AlternativeParameterVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link AlternativeParameterVariation} proxy from a {@link Constraint} stereotyped << Alternative_Parameter_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link AlternativeParameterVariation} proxy or <i>null</i>.
     */
    public static AlternativeParameterVariation instantiate(final Constraint obj) {
        return AlternativeParameterVariation.canInstantiate(obj) ? new AlternativeParameterVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlternativeParameterVariation} proxy from a {@link Constraint} stereotyped << Alternative_Parameter_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link AlternativeParameterVariation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlternativeParameterVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AlternativeParameterVariation.canInstantiate(obj))
            return new AlternativeParameterVariation(obj);
        else
            throw new IllegalArgumentException("AlternativeParameterVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AlternativeParameterVariation other = (AlternativeParameterVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getApplied_on() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCondition() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.CONDITION_TAGTYPE_ELT);
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
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Value'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getValue() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setApplied_on(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCondition(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.CONDITION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setType(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Value'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setValue(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    protected AlternativeParameterVariation(final Constraint elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TYPE_TAGTYPE_ELT;

        public static TagType CONDITION_TAGTYPE_ELT;

        public static TagType VALUE_TAGTYPE_ELT;

        public static TagType APPLIED_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f9faa55-f77b-4111-a573-8295ceb345fc");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "09055b18-ba6e-4c41-a512-e941fe8a81c3");
            CONDITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f28591df-8e84-4ebe-8033-863b5e6a0aa3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9028bb23-ad01-4140-b7dc-05756dad7c11");
            APPLIED_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f55a5703-9625-4370-a599-dc61ca4c2200");
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
