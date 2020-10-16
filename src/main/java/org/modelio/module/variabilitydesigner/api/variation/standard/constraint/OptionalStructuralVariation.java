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
 * Proxy class to handle a {@link Constraint} with << Optional_Structural_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class OptionalStructuralVariation extends Variation {
    public static final String STEREOTYPE_NAME = "Optional_Structural_Variation";

    public static final String CONDITION_TAGTYPE = "Condition";

    public static final String TYPE_TAGTYPE = "Type";

    /**
     * Tells whether a {@link OptionalStructuralVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Optional_Structural_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalStructuralVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Optional_Structural_Variation >> then instantiate a {@link OptionalStructuralVariation} proxy.
     * 
     * @return a {@link OptionalStructuralVariation} proxy on the created {@link Constraint}.
     */
    public static OptionalStructuralVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalStructuralVariation.STEREOTYPE_NAME);
        return OptionalStructuralVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link OptionalStructuralVariation} proxy from a {@link Constraint} stereotyped << Optional_Structural_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link OptionalStructuralVariation} proxy or <i>null</i>.
     */
    public static OptionalStructuralVariation instantiate(final Constraint obj) {
        return OptionalStructuralVariation.canInstantiate(obj) ? new OptionalStructuralVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptionalStructuralVariation} proxy from a {@link Constraint} stereotyped << Optional_Structural_Variation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link OptionalStructuralVariation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static OptionalStructuralVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (OptionalStructuralVariation.canInstantiate(obj))
            return new OptionalStructuralVariation(obj);
        else
            throw new IllegalArgumentException("OptionalStructuralVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        OptionalStructuralVariation other = (OptionalStructuralVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCondition() {
        return this.elt.getTagValue(OptionalStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT);
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
        return this.elt.getTagValue(OptionalStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT);
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
        this.elt.putTagValue(OptionalStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setType(final String value) {
        this.elt.putTagValue(OptionalStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    protected OptionalStructuralVariation(final Constraint elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TYPE_TAGTYPE_ELT;

        public static TagType CONDITION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "13a0bd3b-2d6c-4df9-8d0a-1e4f17868c20");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7195e113-ffdf-474f-bcfe-95c61934952f");
            CONDITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6cdec601-1400-41d1-ab1b-683bba6018de");
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
