package org.modelio.module.variabilitydesigner.gui.report;

import java.util.Set;
import java.util.TreeSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

/**
 * This class represents the report model
 * @author ebrosse
 */
@objid ("b06da73d-19c5-42b2-98ca-dbb918fe1172")
public class ReportModel implements IReportWriter {
    @objid ("d30e9c16-141a-4134-9b76-07df3b9eeed5")
    private Set<ElementMessage> errors;

    @objid ("9fa436e7-f155-414b-b222-830ce7d2defe")
    private Set<ElementMessage> warnings;

    @objid ("5089e421-1085-4e55-a580-4da684a75e01")
    private Set<ElementMessage> infos;

    /**
     * This default constructor initializes the lists of message (errors, warning and infos)
     */
    @objid ("dffaa1e0-4d64-481e-985c-04adf8792c87")
    public ReportModel() {
        this.errors = new TreeSet <> ();
        this.warnings = new TreeSet <> ();
        this.infos = new TreeSet <> ();
    }

    @objid ("8922ca3e-a5ca-478f-9f89-386f0923d106")
    @Override
    public void addWarning(String message, Element element, String description) {
        if (message == null) {
            message = "";
        }
        
        this.warnings.add (new ElementMessage (message, element, description));
    }

    @objid ("55e1f3f9-7d67-47c1-b629-3ec8734a388b")
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
    @objid ("fba17ede-4b92-49e9-b6a9-ccbad54fa9cb")
    public Set<ElementMessage> getErrors() {
        return this.errors;
    }

    /**
     * This method returns the list of warning message
     * 
     * @return set of warning message
     */
    @objid ("4dcbd483-2ddb-45b7-b989-ad22b0324dbe")
    public Set<ElementMessage> getWarnings() {
        return this.warnings;
    }

    @objid ("8a847f04-0ba3-46b1-a07b-0fcf43dc332f")
    @Override
    public boolean isEmpty() {
        return !(hasErrors () || hasWarnings () || hasInfos ());
    }

    @objid ("0768b643-74a6-43c0-be40-fc422905ee2e")
    @Override
    public void addInfo(String message, Element element, String description) {
        this.infos.add (new ElementMessage (message, element, description));
    }

    /**
     * This method returns the list of info message
     * 
     * @return set of info message
     */
    @objid ("d797cb80-4a7d-4d44-9b27-b38d0677a94d")
    public Set<ElementMessage> getInfos() {
        return this.infos;
    }

    @objid ("10954675-55aa-44c4-b8d6-2d4d2653cebf")
    @Override
    public boolean hasErrors() {
        return !this.errors.isEmpty ();
    }

    @objid ("c805037e-5f2d-4f99-a6e7-2e55933b91d0")
    @Override
    public boolean hasInfos() {
        return !this.infos.isEmpty ();
    }

    @objid ("b5695152-e8b2-4982-bdf3-e867ebbf82a3")
    @Override
    public boolean hasWarnings() {
        return !this.warnings.isEmpty ();
    }

    @objid ("c8cd31ef-39f6-4e53-be5c-1975724f9e72")
    class ElementMessage implements Comparable<ElementMessage> {
        @objid ("004bae3c-6a99-4a9b-94d6-d97db96afd53")
        public String message;

        @objid ("5ab1978f-de1e-4ef4-b818-0e0f224a779c")
        public String description;

        @objid ("e15de550-2fd2-49a7-acff-10493c78dc36")
        public Element element;

        @objid ("99c42d12-f552-46f5-ba66-59e94f379710")
        ElementMessage(final String message, final Element element, final String description) {
            this.message = message;
            this.element = element;
            this.description = description;
        }

        @objid ("e6143fdc-e8ba-4ab2-96ca-7f64cd6e3b61")
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

        @objid ("7ce21d40-132b-464d-9e63-a9ee4911c6e0")
        @Override
        public int compareTo(final ElementMessage anotherMessage) {
            if (this.element.equals(anotherMessage.element))
                return this.message.compareTo(anotherMessage.message) ;
            else
                return 1;
        }

        @objid ("c28e6e9e-b9cc-41bd-b2e2-bce344adf7a7")
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

        @objid ("ed9bbd1f-b3f4-4ed4-a1d2-13b9781c6eba")
        private ReportModel getOuterType() {
            return ReportModel.this;
        }

    }

}
