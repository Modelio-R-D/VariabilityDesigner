package org.modelio.module.variabilitydesigner.gui.report;

import java.util.Set;
import java.util.TreeSet;
import org.modelio.metamodel.uml.infrastructure.Element;

/**
 * This class represents the report model
 * @author ebrosse
 */
public class ReportModel implements IReportWriter {
    private Set<ElementMessage> errors;

    private Set<ElementMessage> warnings;

    private Set<ElementMessage> infos;

    /**
     * This default constructor initializes the lists of message (errors, warning and infos)
     */
    public ReportModel() {
        this.errors = new TreeSet <> ();
        this.warnings = new TreeSet <> ();
        this.infos = new TreeSet <> ();
    }

    @Override
    public void addWarning(String message, Element element, String description) {
        if (message == null) {
            message = "";
        }
        
        this.warnings.add (new ElementMessage (message, element, description));
    }

    @Override
    public void addError(String message, Element element, String description) {
        if (message == null) {
            message = "";
        }
        
        this.errors.add (new ElementMessage (message, element, description));
    }

    /**
     * This method returns the list of error message
     * 
     * @return set of error message
     */
    public Set<ElementMessage> getErrors() {
        return this.errors;
    }

    /**
     * This method returns the list of warning message
     * 
     * @return set of warning message
     */
    public Set<ElementMessage> getWarnings() {
        return this.warnings;
    }

    @Override
    public boolean isEmpty() {
        return !(hasErrors () || hasWarnings () || hasInfos ());
    }

    @Override
    public void addInfo(String message, Element element, String description) {
        this.infos.add (new ElementMessage (message, element, description));
    }

    /**
     * This method returns the list of info message
     * 
     * @return set of info message
     */
    public Set<ElementMessage> getInfos() {
        return this.infos;
    }

    @Override
    public boolean hasErrors() {
        return !this.errors.isEmpty ();
    }

    @Override
    public boolean hasInfos() {
        return !this.infos.isEmpty ();
    }

    @Override
    public boolean hasWarnings() {
        return !this.warnings.isEmpty ();
    }

    class ElementMessage implements Comparable<ElementMessage> {
        public String message;

        public String description;

        public Element element;

        ElementMessage(final String message, final Element element, final String description) {
            this.message = message;
            this.element = element;
            this.description = description;
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ElementMessage other = (ElementMessage) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (this.description == null) {
                if (other.description != null)
                    return false;
            } else if (!this.description.equals(other.description))
                return false;
            if (this.element == null) {
                if (other.element != null)
                    return false;
            } else if (!this.element.equals(other.element))
                return false;
            if (this.message == null) {
                if (other.message != null)
                    return false;
            } else if (!this.message.equals(other.message))
                return false;
            return true;
        }

        @Override
        public int compareTo(final ElementMessage anotherMessage) {
            if (this.element.equals(anotherMessage.element))
                return this.message.compareTo(anotherMessage.message) ;
            else
                return 1;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
            result = prime * result + ((this.element == null) ? 0 : this.element.hashCode());
            result = prime * result + ((this.message == null) ? 0 : this.message.hashCode());
            return result;
        }

        private ReportModel getOuterType() {
            return ReportModel.this;
        }

    }

}
