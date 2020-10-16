package org.modelio.module.variabilitydesigner.gui.report;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.navigation.INavigationService;
import org.modelio.api.ui.ModelioDialog;
import org.modelio.module.variabilitydesigner.gui.report.ReportModel.ElementMessage;

/**
 * Dialog box used for the generation report.
 */
@objid ("64e71244-bb58-4d16-b422-a25545148eea")
class ReportDialog extends ModelioDialog {
    @objid ("323fc053-350b-42f9-9fe0-d556b7922582")
    private ReportModel model;

    @objid ("aac36c4d-f613-4f07-b578-955fda4f22f4")
     INavigationService navigationService;

    @objid ("568e3868-2e8b-4b99-9420-5f59d7b2a10e")
    private Image warningImage;

    @objid ("2bfca4f6-138b-4833-8437-ff9b2c1ee07e")
    private Image errorImage;

    @objid ("4af28d1a-fd5c-4c43-be5b-5a7fdde3115e")
     Table table;

    @objid ("4b8f2697-f98e-4cf9-9573-1d27b2f714d7")
    private Image infoImage;

    @objid ("6b4ecdcd-cfd0-456b-8137-daada9394861")
     Text descriptionText;

    @objid ("ddbff466-7505-47e0-aa4d-636f8f913b4e")
    public ReportDialog(Shell parentShell, final INavigationService iModelioNavigationService) {
        super (parentShell);
        setShellStyle (SWT.DIALOG_TRIM | getDefaultOrientation ());
        this.navigationService = iModelioNavigationService;
    }

    @objid ("d5ef34d7-9974-4c66-a384-dc978321bcfa")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton (parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    }

    @objid ("60a78450-9b56-45f1-9cae-633a4580fc69")
    @Override
    public Control createContentArea(Composite parent) {
        this.warningImage = JFaceResources.getImage ("dialog_message_warning_image");
        this.errorImage = JFaceResources.getImage ("dialog_message_error_image");
        this.infoImage = JFaceResources.getImage ("dialog_messasge_info_image");
        
        Point s = getInitialSize ();
        
        this.table = new Table (parent, SWT.MULTI | SWT.BORDER |
                SWT.FULL_SELECTION);
        GridData data = new GridData (SWT.FILL, SWT.FILL, true, true);
        this.table.setLayoutData (data);
        this.table.setLinesVisible (true);
        
        
        TableColumn column = new TableColumn (this.table, SWT.NONE);
        column.setText ("Message");
        column.setResizable(true);
        
        updateViewFromModel ();
        
        column.setWidth(s.x + 20);
        
        this.table.addMouseListener (new MouseListener () {
            @Override
            public void mouseDoubleClick (MouseEvent e) {
                TableItem item = ReportDialog.this.table.getItem (new Point (e.x, e.y));
                if (item != null) {
                    if (item.getData () instanceof ElementMessage) {
                        ElementMessage theElement = (ElementMessage) item.getData ();
        
                        String desc = theElement.description;
                        ReportDialog.this.descriptionText.setText (desc);
        
                        // On a double clic, select the element
                        if (theElement.element != null && theElement.element.isValid ()) {
                            ReportDialog.this.navigationService.fireNavigate (theElement.element);
                        }
                    }
                }
            }
        
            @Override
            public void mouseDown (MouseEvent e) {
                // Nothing to do
            }
        
            @Override
            public void mouseUp (MouseEvent e) {
                TableItem item = ReportDialog.this.table.getItem (new Point (e.x, e.y));
                if (item != null) {
                    if (item.getData () instanceof ElementMessage) {
                        ElementMessage theElement = (ElementMessage) item.getData ();
        
                        String desc = theElement.description;
                        ReportDialog.this.descriptionText.setText (desc);
        
                        // On a CTRL + clic, select the element
                        if ((e.stateMask & SWT.CTRL) != 0) {
                            if (theElement.element != null && theElement.element.isValid ()) {
                                ReportDialog.this.navigationService.fireNavigate (theElement.element);
                            }
                        }
                    }
                }
            }
        });
        
        this.descriptionText = new Text (parent, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.WRAP);
        GridData data_description = new GridData (SWT.FILL, SWT.FILL, true, false);
        data_description.heightHint = 50;
        this.descriptionText.setLayoutData (data_description);
        //        this.descriptionText.setBackground (UIColor.TEXT_READONLY_BG);
        return parent;
    }

    @objid ("d6423eca-cb49-4cab-b12e-93d515ef9746")
    private void updateViewFromModel() {
        if (this.table != null) {
            this.table.removeAll ();
        
            if (this.model != null) {
                for (ElementMessage error : this.model.getErrors ()) {
                    TableItem item = new TableItem (this.table, SWT.NONE);
                    item.setImage (0, this.errorImage);
                    item.setText (0, error.message);
                    item.setData (error);
                }
        
                for (ElementMessage warning : this.model.getWarnings ()) {
                    TableItem item = new TableItem (this.table, SWT.NONE);
                    item.setImage (0, this.warningImage);
                    item.setText (0, warning.message);
                    item.setData (warning);
                }
        
                for (ElementMessage info : this.model.getInfos ()) {
                    TableItem item = new TableItem (this.table, SWT.NONE);
                    item.setImage (0, this.infoImage);
                    item.setText (0, info.message);
                    item.setData (info);
                }
            }
        
            this.table.getColumn (0).pack ();
        }
    }

    @objid ("b4ed1857-83a1-4304-900b-6471af7544bf")
    public void setModel(ReportModel model) {
        this.model = model;
        updateViewFromModel ();
    }

    @objid ("2cb99ddd-afea-42bf-89cd-41bf5c175e5a")
    public boolean isDisposed() {
        Shell s = getShell ();
        return s == null || s.isDisposed ();
    }

    @objid ("bc1261df-b401-4415-892f-bb45d1a060cd")
    @Override
    public void init() {
        Shell shell = getShell ();
        
        // Put the messages in the banner area
        setLogoImage (null);
        shell.setText ("Report");
        setTitle ("Report");
        setMessage ("Message");
    }

    @objid ("26c515f6-79f5-444d-96bf-58066ffcdc54")
    @Override
    protected Point getInitialSize() {
        Point p = super.getInitialSize();
        p.x = (int) Math.floor(p.x*1.15);
        return p;
    }

}
