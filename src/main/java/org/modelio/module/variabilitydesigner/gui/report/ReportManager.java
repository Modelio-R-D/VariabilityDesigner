package org.modelio.module.variabilitydesigner.gui.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.modelio.navigation.INavigationService;
import org.modelio.module.variabilitydesigner.gui.report.ReportModel.ElementMessage;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;

/**
 * This class is the controller of the report windows.
 * 
 * It provides all needed services and manages the relations between the report model and the report dialog.
 * @author ebrosse
 */
@objid ("6738974c-18ad-4061-9bbd-af17eecb59c3")
public class ReportManager {
    @objid ("f6e7d865-88ee-4cfc-bd89-216c8e10055b")
    private static ReportDialog dialog;

    /**
     * This method opens the report dialog
     * 
     * @param report : the report model exposed in report dialog
     */
    @objid ("5736d00c-d738-4b06-9cad-fee7f934574b")
    public static void showGenerationReport(final Shell shell, final ReportModel report, final INavigationService navServices) {
        if (report == null || report.isEmpty ()) {
            if (ReportManager.dialog != null &&
                    !ReportManager.dialog.isDisposed ()) {
                ReportManager.dialog.close ();
            }
        } else {
        
            // Get the current display
            if (ReportManager.dialog == null ||
                    ReportManager.dialog.isDisposed ()) {
                ReportManager.dialog = new ReportDialog (shell, navServices);
            }
        
            ReportManager.dialog.setModel(report);
        
            if (ReportManager.dialog.open () == SWT.OK) {
                shell.dispose();
            }
        }
    }

    /**
     * This method creates a new Report Model
     * 
     * @return the created Report Model
     */
    @objid ("e3f1c2a8-cbca-4d69-9c52-a95174066687")
    public static ReportModel getNewReport() {
        return new ReportModel ();
    }

    @objid ("a2eea58f-b719-4ebf-aae3-35e3806e1d0b")
    private static File getLogFile(String logFilePath) {
        File logFile = new File(logFilePath);
        
        try {
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
        } catch (IOException e) {
            VariabilityDesignerModule.logService.error(e);
        }
        return logFile;
    }

    @objid ("a92dd02d-f790-46a3-a4e0-6990d9257209")
    public static void writeReport(final ReportModel report, String logFilePath) {
        File logFile = getLogFile(logFilePath);
        
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.MEDIUM, Locale.getDefault());
        
        try (FileWriter f = new FileWriter(logFile, true);
                BufferedWriter bf = new BufferedWriter(f);){
        
            for (ElementMessage error : report.getErrors()){
                bf.write("[" +  dateFormat.format(Calendar.getInstance().getTime()) + "]: Error : " + error.message);
                bf.newLine();
            }
        
            for (ElementMessage warning : report.getWarnings()){
                bf.write("[" +  dateFormat.format(Calendar.getInstance().getTime()) + "]: Warning : " + warning.message);
                bf.newLine();
            }
        
            for (ElementMessage info : report.getInfos()){
                bf.write("[" +  dateFormat.format(Calendar.getInstance().getTime()) + "]: Info : " + info.message);
                bf.newLine();
            }
        
        } catch (IOException e) {
            VariabilityDesignerModule.logService.error(e);
        }
    }

}
