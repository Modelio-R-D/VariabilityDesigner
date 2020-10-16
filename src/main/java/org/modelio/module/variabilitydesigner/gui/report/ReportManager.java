package org.modelio.module.variabilitydesigner.gui.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
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
public class ReportManager {
    private static ReportDialog dialog;

    /**
     * This method opens the report dialog
     * 
     * @param report : the report model exposed in report dialog
     */
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
    public static ReportModel getNewReport() {
        return new ReportModel ();
    }

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
