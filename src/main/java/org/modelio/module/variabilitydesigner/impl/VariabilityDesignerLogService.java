package org.modelio.module.variabilitydesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.log.ILogService;

/**
 * Proxy for the Modelio {@link ILogService}, configuring the
 * ModelingWizardMdac.
 */
@objid ("1daf5ad2-465b-4430-884f-cbe03fb5d247")
public class VariabilityDesignerLogService {
    @objid ("2753d3ec-83ca-4bc7-beb2-2f0a70fe9504")
    private VariabilityDesignerModule module;

    @objid ("4d99e2e7-089f-4f69-a78f-861e12556c62")
    private ILogService logService;

    /**
     * Default constructor.
     * 
     * @param logService the Modelio log service.
     * @param module the current instance of {@link  VariabilityDesignerModule }.
     */
    @objid ("a0dabfd6-14c8-4bcf-bda4-1ede89e0e989")
    public VariabilityDesignerLogService(final ILogService logService, final VariabilityDesignerModule module) {
        this.logService = logService;
        this.module = module;
    }

    /**
     * Output an information message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been
     * activated. The file and line of the log is displayed in the Modelio
     * console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("69e7d2f4-7cf4-4e2b-9086-3ba53a2c4123")
    public void info(final String msg) {
        this.logService.info(msg);
    }

    /**
     * Output a warning message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been
     * activated. The file and line of the log is displayed in the Modelio
     * console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("a215c550-c187-472f-85b8-bf585830c3ce")
    public void warning(final String msg) {
        this.logService.warning(msg);
    }

    /**
     * Output an error message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been
     * activated. The file and line of the log is displayed in the Modelio
     * console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("61d88649-3bb3-43cb-b172-b0900ffd5ed3")
    public void error(final String msg) {
        this.logService.error(msg);
    }

    /**
     * Log the given exception with its stack trace as an information.
     * <p>
     * This method send logs on Modelio console only if the logs have been
     * activated. The file and line of the log is displayed in the Modelio
     * console before the message.
     * @param t
     * an exception to be displayed as a log.
     */
    @objid ("20335478-280a-4df5-9fa1-7c134cb736de")
    public void info(final Throwable e) {
        this.logService.info(e);
    }

    /**
     * Log the given exception with its stack trace as a warning.
     * <p>
     * This method send logs on Modelio console only if the logs have been
     * activated. The file and line of the log is displayed in the Modelio
     * console before the message.
     * @param t
     * an exception to be displayed as a log.
     */
    @objid ("f40803db-3421-45f9-81b0-6d03f64a9347")
    public void warning(final Throwable e) {
        this.logService.warning(e);
    }

    /**
     * Log the given exception with its stack trace as an error.
     * <p>
     * This method send logs on Modelio console only if the logs have been
     * activated. The file and line of the log is displayed in the Modelio
     * console before the message.
     * @param t
     * an exception to be displayed as a log.
     */
    @objid ("e51fd045-e428-4758-84a8-349e34293467")
    public void error(final Throwable e) {
        this.logService.error(e);
    }

}
