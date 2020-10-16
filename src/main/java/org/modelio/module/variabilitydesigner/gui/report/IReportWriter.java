package org.modelio.module.variabilitydesigner.gui.report;

import org.modelio.metamodel.uml.infrastructure.Element;

public interface IReportWriter {
    void addWarning(String message, Element element, String description);

    void addError(String message, Element element, String description);

    void addInfo(String message, Element element, String description);

    boolean isEmpty();

    boolean hasErrors();

    boolean hasWarnings();

    boolean hasInfos();

}
