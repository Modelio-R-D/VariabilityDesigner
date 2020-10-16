package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {
    private static final QName _VariabilityExchangeModels_QNAME = new QName("", "variability-exchange-models");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KeyValuePairType }
     */
    public KeyValuePairType createKeyValuePairType() {
        return new KeyValuePairType();
    }

    /**
     * Create an instance of {@link VariationDependencyType }
     */
    public VariationDependencyType createVariationDependencyType() {
        return new VariationDependencyType();
    }

    /**
     * Create an instance of {@link VariationpointHierarchyType }
     */
    public VariationpointHierarchyType createVariationpointHierarchyType() {
        return new VariationpointHierarchyType();
    }

    /**
     * Create an instance of {@link VariabilityExchangeModelsType }
     */
    public VariabilityExchangeModelsType createVariabilityExchangeModelsType() {
        return new VariabilityExchangeModelsType();
    }

    /**
     * Create an instance of {@link XorParameterVariationpointType }
     */
    public XorParameterVariationpointType createXorParameterVariationpointType() {
        return new XorParameterVariationpointType();
    }

    /**
     * Create an instance of {@link ExpressionType }
     */
    public ExpressionType createExpressionType() {
        return new ExpressionType();
    }

    /**
     * Create an instance of {@link CalculatedParameterVariationpointType }
     */
    public CalculatedParameterVariationpointType createCalculatedParameterVariationpointType() {
        return new CalculatedParameterVariationpointType();
    }

    /**
     * Create an instance of {@link VariabilityExchangeModelType }
     */
    public VariabilityExchangeModelType createVariabilityExchangeModelType() {
        return new VariabilityExchangeModelType();
    }

    /**
     * Create an instance of {@link SpecialDataType }
     */
    public SpecialDataType createSpecialDataType() {
        return new SpecialDataType();
    }

    /**
     * Create an instance of {@link XorVariationType }
     */
    public XorVariationType createXorVariationType() {
        return new XorVariationType();
    }

    /**
     * Create an instance of {@link OptionalStructuralVariationpointType }
     */
    public OptionalStructuralVariationpointType createOptionalStructuralVariationpointType() {
        return new OptionalStructuralVariationpointType();
    }

    /**
     * Create an instance of {@link CalculatedVariationType }
     */
    public CalculatedVariationType createCalculatedVariationType() {
        return new CalculatedVariationType();
    }

    /**
     * Create an instance of {@link CapabilityType }
     */
    public CapabilityType createCapabilityType() {
        return new CapabilityType();
    }

    /**
     * Create an instance of {@link XorStructuralVariationpointType }
     */
    public XorStructuralVariationpointType createXorStructuralVariationpointType() {
        return new XorStructuralVariationpointType();
    }

    /**
     * Create an instance of {@link OptionalVariationType }
     */
    public OptionalVariationType createOptionalVariationType() {
        return new OptionalVariationType();
    }

    /**
     * Create an instance of {@link BindingtimeType }
     */
    public BindingtimeType createBindingtimeType() {
        return new BindingtimeType();
    }

    /**
     * Create an instance of {@link ValueVariationType }
     */
    public ValueVariationType createValueVariationType() {
        return new ValueVariationType();
    }

    /**
     * Create an instance of {@link ArtifactElementType }
     */
    public ArtifactElementType createArtifactElementType() {
        return new ArtifactElementType();
    }

    /**
     * Create an instance of {@link KeyValuePairType.Value }
     */
    public org.modelio.module.variabilitydesigner.variabilitymodel.KeyValuePairType.Value createKeyValuePairTypeValue() {
        return new KeyValuePairType.Value();
    }

    /**
     * Create an instance of {@link VariationDependencyType.Variation }
     */
    public org.modelio.module.variabilitydesigner.variabilitymodel.VariationDependencyType.Variation createVariationDependencyTypeVariation() {
        return new VariationDependencyType.Variation();
    }

    /**
     * Create an instance of {@link VariationpointHierarchyType.Variationpoint }
     */
    public org.modelio.module.variabilitydesigner.variabilitymodel.VariationpointHierarchyType.Variationpoint createVariationpointHierarchyTypeVariationpoint() {
        return new VariationpointHierarchyType.Variationpoint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariabilityExchangeModelsType }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "variability-exchange-models")
    public JAXBElement<VariabilityExchangeModelsType> createVariabilityExchangeModels(VariabilityExchangeModelsType value) {
        return new JAXBElement<VariabilityExchangeModelsType>(_VariabilityExchangeModels_QNAME, VariabilityExchangeModelsType.class, null, value);
    }

}
