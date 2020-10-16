/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.variation.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("4b0aaea0-6643-4553-a985-b88ba0ee68d7")
public class OptionalStructuralVariation extends Variation {
    @objid ("d975a14d-6fe5-47a3-aabf-8809081e0324")
    public static final String STEREOTYPE_NAME = "Optional_Structural_Variation";

    @objid ("c85136bb-94dd-4b4b-bff8-643caec61e4d")
    public static final String CONDITION_TAGTYPE = "Condition";

    @objid ("99bd6921-71ab-4207-be41-a596b6a8c72c")
    public static final String TYPE_TAGTYPE = "Type";

    /**
     * Tells whether a {@link OptionalStructuralVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Optional_Structural_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("abe5ef11-1ff9-43c7-a185-699a1032f122")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalStructuralVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Optional_Structural_Variation >> then instantiate a {@link OptionalStructuralVariation} proxy.
     * 
     * @return a {@link OptionalStructuralVariation} proxy on the created {@link Constraint}.
     */
    @objid ("4ad2c2d7-5897-40d0-bfff-2352c0cd5445")
    public static OptionalStructuralVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalStructuralVariation.STEREOTYPE_NAME);
        return OptionalStructuralVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link OptionalStructuralVariation} proxy from a {@link Constraint} stereotyped << Optional_Structural_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link OptionalStructuralVariation} proxy or <i>null</i>.
     */
    @objid ("b5484d3c-f8cd-4971-af38-f63a5e496a26")
    public static OptionalStructuralVariation instantiate(final Constraint obj) {
        return OptionalStructuralVariation.canInstantiate(obj) ? new OptionalStructuralVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptionalStructuralVariation} proxy from a {@link Constraint} stereotyped << Optional_Structural_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link OptionalStructuralVariation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("21c19343-fff5-45bd-9289-23d22969748b")
    public static OptionalStructuralVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (OptionalStructuralVariation.canInstantiate(obj))
        	return new OptionalStructuralVariation(obj);
        else
        	throw new IllegalArgumentException("OptionalStructuralVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b398217b-82c0-4cb3-bb1c-e291563f7613")
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
    @objid ("05825160-0ac0-40e9-9f2f-14b3095423ac")
    public String getCondition() {
        return this.elt.getTagValue(OptionalStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("fb7dc9e3-d887-4050-87b5-63602bd35666")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07c59139-9c3f-408c-9f82-d2757173fbff")
    public String getType() {
        return this.elt.getTagValue(OptionalStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("0e506a80-7f38-4219-ab81-a30082c88b4a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6f55771-8e32-49b3-8a7a-1353944479de")
    public void setCondition(final String value) {
        this.elt.putTagValue(OptionalStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06d08811-0bde-495d-aa40-5ac5b6d1d7c4")
    public void setType(final String value) {
        this.elt.putTagValue(OptionalStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("e5b26b6a-b96b-4572-b415-a0f239f60d69")
    protected OptionalStructuralVariation(final Constraint elt) {
        super(elt);
    }

    @objid ("d0e6beec-1084-40c0-9146-abfd5ccfa335")
    public static final class MdaTypes {
        @objid ("36c7c132-ff38-4476-b4b8-ea6f376da08f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ebb863fc-6d64-493f-9216-fc5a629541c9")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("12e037d7-4168-4c01-9503-90a1cad7f373")
        public static TagType CONDITION_TAGTYPE_ELT;

        @objid ("044f4f2e-0f2a-48dd-9002-c7e85ab7161c")
        private static Stereotype MDAASSOCDEP;

        @objid ("a93fc9ea-2c6c-45da-ac0d-70fc1891cae6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b59df01e-5b63-44ee-a577-67342c01c523")
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
