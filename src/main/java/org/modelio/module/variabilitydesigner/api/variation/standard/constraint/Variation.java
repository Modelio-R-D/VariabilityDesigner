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
 * Proxy class to handle a {@link Constraint} with << Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fe58e23a-38c0-4755-8b26-f4f48f4e226d")
public abstract class Variation {
    @objid ("511b2552-c254-40ce-981c-232e1789d1c5")
    public static final String STEREOTYPE_NAME = "Variation";

    @objid ("99a45825-3666-4ae1-80fb-d32c667ee4c8")
    public static final String VARIATION_POINT_ID_TAGTYPE = "Variation_Point_ID";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("f564e1bd-75e1-423f-81f5-df80beda3c74")
    protected final Constraint elt;

    @objid ("41b2a0ba-380b-4b16-b4b6-2a6538caa38d")
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
        Variation other = (Variation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("16f709c5-4f32-4f82-8897-8fb8755e1fb2")
    public Constraint getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Variation_Point_ID'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7dc1bdb-1490-4b6d-b3bd-7f2e9a5ba1f8")
    public String getVariation_Point_ID() {
        return this.elt.getTagValue(Variation.MdaTypes.VARIATION_POINT_ID_TAGTYPE_ELT);
    }

    @objid ("0e36d0a2-cebe-43f6-a3b9-671b166cafd7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Variation_Point_ID'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("441a7b31-44a0-4195-a61a-0899df57d601")
    public void setVariation_Point_ID(final String value) {
        this.elt.putTagValue(Variation.MdaTypes.VARIATION_POINT_ID_TAGTYPE_ELT, value);
    }

    @objid ("4dbe37f7-0120-4123-a37a-4884729e416d")
    protected Variation(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("c51a1bfc-d91a-4484-8411-d8d912eae4df")
    public static final class MdaTypes {
        @objid ("b2a4995d-3f95-4bcc-a170-eeea0e5c0a4e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e54f18b6-0fa6-4bfd-9894-0399d92f3a99")
        public static TagType VARIATION_POINT_ID_TAGTYPE_ELT;

        @objid ("6d99d7b2-da99-4d9f-aee8-bd2b64add154")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1a561c8-f404-4582-9be8-56af8b394871")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbd34b2a-3a51-40f6-a80c-a2ba017637a2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ebd3be3d-24ea-49d7-883f-58b3a3de118d");
            VARIATION_POINT_ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d2b918d-3d7f-4834-a3cc-761929978967");
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
