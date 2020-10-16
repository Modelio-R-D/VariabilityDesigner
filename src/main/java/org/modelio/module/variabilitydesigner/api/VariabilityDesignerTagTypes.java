package org.modelio.module.variabilitydesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerPeerModule;

@objid ("958f8595-820a-4a83-a5cb-60bbac419e53")
public class VariabilityDesignerTagTypes {
    @objid ("e5abe5b6-151d-4666-b404-566ff870293c")
    public static final String VARIATION_POINT_ID = "Variation_Point_ID";

    @objid ("fbf2c883-ebac-4404-8033-b6aac00a7eec")
    public static final String VARIATION_EXPRESSION_TYPE = "Type";

    @objid ("b7563441-bb8d-47ae-bef0-2d5a11727562")
    public static final String VARIATION_EXPRESSION_VALUE = "Expression";

    @objid ("62e0575f-fcbd-4ca7-af84-2bc315c3c986")
    public static final String VARIATION_CONDITION_VALUE = "Condition";

    @objid ("3fcd6644-b64f-4bd9-87e3-c6cc73e7c38d")
    public static final String VARIATION_VALUE = "Value";

    @objid ("b9b90d8c-61ac-4bbb-9697-7613e0f8f6ee")
    public static final String VARIATION_APPLIED_ON = "Applied_on";

//------------------------------------//
    @objid ("2e6b0492-f700-4190-84de-83b386499598")
    public static final String getVariationPointID(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_POINT_ID);
    }

    @objid ("cb42053b-c0e2-4a8f-8afb-160ad5731661")
    public static final String getVariationExpressionType(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_EXPRESSION_TYPE);
    }

    @objid ("de5faa04-29ef-4565-9892-d87a24a7f405")
    public static final String getVariationExpressionValue(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_EXPRESSION_VALUE);
    }

    @objid ("36151b76-6d96-484c-85f9-5bfb9d4f9227")
    public static final String getVariationConditionValue(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_CONDITION_VALUE);
    }

    @objid ("e9f9f796-cf18-4735-b582-2a7b39cbd9bb")
    public static final String getVariationValue(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_VALUE);
    }

    @objid ("ab68eb9d-e0b0-4de6-b122-3e9a4dea4150")
    public static final String getVariationAppliedOn(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_APPLIED_ON);
    }


//------------------------------------//
}
