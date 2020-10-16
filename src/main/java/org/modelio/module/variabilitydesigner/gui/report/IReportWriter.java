package org.modelio.module.variabilitydesigner.gui.report;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("606034b6-50dc-42d2-8bba-bb218d204939")
public interface IReportWriter {
    @objid ("808b2613-3651-4c85-87b7-6b118f4be363")
    void addWarning(String message, Element element, String description);

    @objid ("a3d18678-139f-4021-97f0-b09da338b8ec")
    void addError(String message, Element element, String description);

    @objid ("d4445b09-b17f-4a8e-b58d-4c8d355e4122")
    void addInfo(String message, Element element, String description);

    @objid ("d02d87a7-7a7b-4d5a-b2ed-e8672fbdca84")
    boolean isEmpty();

    @objid ("258d7c03-3615-4f82-b689-e9c9247b6c38")
    boolean hasErrors();

    @objid ("98087c87-6453-4094-9cfe-c8f16732067e")
    boolean hasWarnings();

    @objid ("a195bf16-f2cc-4c29-9398-3aa2216292c3")
    boolean hasInfos();

}
