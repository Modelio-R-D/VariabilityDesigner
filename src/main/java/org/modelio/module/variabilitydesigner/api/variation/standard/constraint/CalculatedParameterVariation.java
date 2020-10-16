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
 * Proxy class to handle a {@link Constraint} with << Calculated_Parameter_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CalculatedParameterVariation extends Variation {
    public static final String STEREOTYPE_NAME = "Calculated_Parameter_Variation";

    public static final String APPLIED_ON_TAGTYPE = "Applied_on";

    public static final String EXPRESSION_TAGTYPE = "Expression";

    public static final String TYPE_TAGTYPE = "Type";

    /**
     * Tells whether a {@link CalculatedParameterVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Calculated_Parameter_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, CalculatedParameterVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Calculated_Parameter_Variation >> then instantiate a {@link CalculatedParameterVariation} proxy.
     * 
     * @return a {@link CalculatedParameterVariation} proxy on the created {@link Constraint}.
     */
    public static CalculatedParameterVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, CalculatedParameterVariation.STEREOTYPE_NAME);
        return CalculatedParameterVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link CalculatedParameterVariation} proxy from a {@link Constraint} stereotyped << Calculated_Parameter_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link CalculatedParameterVariation} proxy or <i>null</i>.
     */
    public static CalculatedParameterVariation instantiate(final Constraint obj) {
        return CalculatedParameterVariation.canInstantiate(obj) ? new CalculatedParameterVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CalculatedParameterVariation} proxy from a {@link Constraint} stereotyped << Calculated_Parameter_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link CalculatedParameterVariation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CalculatedParameterVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (CalculatedParameterVariation.canInstantiate(obj))
            return new CalculatedParameterVariation(obj);
        else
            throw new IllegalArgumentException("CalculatedParameterVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CalculatedParameterVariation other = (CalculatedParameterVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getApplied_on() {
        return this.elt.getTagValue(CalculatedParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT);
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
     * Getter for string property 'Expression'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getExpression() {
        return this.elt.getTagValue(CalculatedParameterVariation.MdaTypes.EXPRESSION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getType() {
        return this.elt.getTagValue(CalculatedParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT);
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
        this.elt.putTagValue(CalculatedParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Expression'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setExpression(final String value) {
        this.elt.putTagValue(CalculatedParameterVariation.MdaTypes.EXPRESSION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setType(final String value) {
        this.elt.putTagValue(CalculatedParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    protected CalculatedParameterVariation(final Constraint elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TYPE_TAGTYPE_ELT;

        public static TagType EXPRESSION_TAGTYPE_ELT;

        public static TagType APPLIED_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b67fcb92-1c2d-4a52-9a18-a5ded16b9a4f");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85b8a68d-faba-47e7-a57c-8d8420954bf7");
            EXPRESSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3a90ba9-ec30-4b32-ab6a-855574ead050");
            APPLIED_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b105ec93-cda6-49a2-816e-d6e64e83964e");
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
