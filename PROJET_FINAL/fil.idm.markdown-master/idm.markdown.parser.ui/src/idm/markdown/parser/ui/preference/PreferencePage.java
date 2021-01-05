package idm.markdown.parser.ui.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import idm.markdown.parser.ui.Activator;

/**
 * 
 * @author dumoulin
 *
 */
public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public PreferencePage() {
		super(GRID);
	}

	public PreferencePage(int style) {
		super(style);
	}

	public PreferencePage(String title, int style) {
		super(title, style);
	}

	public PreferencePage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Edit your preferences to parse Mardown Files to Markdow Model"); //$NON-NLS-1$
		
	}

	@Override
	protected void createFieldEditors() {
        addField(new BooleanFieldEditor(PreferenceConstants.P_IS_USING_MULTIPLE_FILES, "Generate &multiple models on multiple selection", getFieldEditorParent()));

        addField(new RadioGroupFieldEditor(PreferenceConstants.P_USE_FOLDER, "Create a root &Folder", 3,
                new String[][] { { "&Always", PreferenceConstants.P_USE_FOLDER_ALWAYS }, 
        	                     { "&Never", PreferenceConstants.P_USE_FOLDER_NEVER }, 
        	                     { "I&f Needed", PreferenceConstants.P_USE_FOLDER_IF_NEEDED } }, getFieldEditorParent()));
	}

}
