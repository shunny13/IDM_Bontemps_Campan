/*****************************************************************************
 * Copyright (c) 2020 Cedric Dumoulin.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   cedric.dumoulin@univ-lille.fr - Initial API and implementation
 *   
 *****************************************************************************/

package idm.markdown.parser.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.widgets.Shell;

import idm.markdown.parser.ui.Activator;
import idm.markdown.parser.ui.Messages;
import idm.markdown.parser.ui.ProjectExplorerNodeWalkerWithIProgress;
import idm.markdown.parser.ui.MarkdownFilesNodeVisitor;
import idm.markdown.parser.ui.MarkdownFilesNodeVisitor.Parameters;
import idm.markdown.parser.ui.preference.PreferenceConstants;


/**
 * A {@link IHandler} to start Java Code reverse.
 * The current selection is retrieved. For each selected element, try to reverse it to UML if it correspond to 
 * Java code.
 *  
 * @author cedric dumoulin
 * 
 */
public class ParseMarkdownFileToModelInJobHandler extends AbstractExecuteInJobHandler implements IHandler {

	/**
	 * The selection recorded before the Job was started.
	 */
	private ITreeSelection recordedSelection;

	private Parameters parameters;

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.handlers.AbstractExecuteInJobHandler#getJobName()
	 *
	 * @return
	 */
	@Override
	String getJobName() {
		return "Generate Markdown Model";
	}

	/**
	 * @param event
	 * @return True if the execution should continue, false if the execution should stop.
	 */
	@Override
	protected boolean doPrepareExecute(ExecutionEvent event) {
		

		// Get reverse parameters from a dialog
		Shell shell = getShell();
		// ReverseCodeDialog dialog = new ReverseCodeDialog(shell, DefaultGenerationPackageName, Arrays.asList("generated") );
////		final ReverseCodeDialog dialog = getDialog(shell, modelUid);
//
//		int res = dialog.open();
//		// System.out.println("dialog result =" + res);
//		if (res == Window.CANCEL) {
//			return false;
//		}
		
		parameters = new MarkdownFilesNodeVisitor.Parameters();
//		parameters.setSearchPaths( Arrays.asList(dialog.getSearchPath() ) );
//		parameters.setPackageName( getPackageName(dialog) );
//		selectedParser = dialog.getSelectedParserIndex();
//		parameters.setCreationPaths(dialog.getCreationPaths());
		
		// Create reverse command
		ISelection selection = getCurrentSelection();
		if(! (selection instanceof ITreeSelection) ) {
			Status errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ReverseCodeHandler_WrongSelectionType_Title);
			ErrorDialog.openError(shell, "", Messages.ReverseCodeHandler_WrongSelectionType_Message, errorStatus);

			// Stop the handler execution.
			return false;
		}
		recordedSelection = (ITreeSelection)selection;
		
		// Get qualified names of CUs in projects
//		QualifiedNamesFromIJavaElementCollector collector = new QualifiedNamesFromIJavaElementCollector(false, true, false);
//		List<String> qualifiedNamesInProjects = collector.getQualifiedNamesFromSelection(recordedSelection);
//		parameters.setQualifiedNamesInProjects(qualifiedNamesInProjects);
		
		// Read preferences
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		boolean isUsingMultipleFile = store.getBoolean(PreferenceConstants.P_IS_USING_MULTIPLE_FILES);
		String useFolderPref = store.getString(PreferenceConstants.P_USE_FOLDER);
		
		// Compute if we need to use a Folder 
		boolean useFolder=false;
		// 
		if(PreferenceConstants.P_USE_FOLDER_ALWAYS.equals(useFolderPref)) {
			useFolder = true;
		}
		else if( PreferenceConstants.P_USE_FOLDER_NEVER.equals(useFolderPref)) {
			useFolder = false;
		}
		else { // PreferenceConstants.P_USE_FOLDER_IF_NEEDED
			if( isMultipleSelection() ) {
				useFolder = true;
			}
			else {
				useFolder = false;
			}
		}
		
		// Set parser parameters
		parameters.setUsingFolder(useFolder);
		parameters.setUsingMultipleFiles( isUsingMultipleFile );
		
		return true;
	}

	/**
	 * Return true if the selection is multiple.
	 * @return
	 */
	private boolean isMultipleSelection() {
		if(  recordedSelection.size()>1) {
			return true;
		}
		Object selectedElement = recordedSelection.getFirstElement();
		if( selectedElement instanceof IFolder || selectedElement instanceof IProject ) {
			return true;
		}
		return false;
	}

	/**
	 * Method called from a Job, and in a Transactionnal command
	 * @param monitor
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected void doExecuteTransactionInJob(IProgressMonitor monitor) {
		System.err.println("Transaction and job called !");

		MarkdownFilesNodeVisitor visitor = new MarkdownFilesNodeVisitor(parameters);
		ProjectExplorerNodeWalkerWithIProgress reverseWalker = new ProjectExplorerNodeWalkerWithIProgress(visitor);
		reverseWalker.visit(recordedSelection.toList(), monitor);

	}


	/**
	 * The dialog used for user.
	 *
	 * @param shell
	 * @param modelUid
	 * @return the dialog to show to user
	 */
//	protected ReverseCodeDialog getDialog(Shell shell, String modelUid) {
//		
//		String selectedProjectName;
//		try {
//			selectedProjectName = getSelectedProjectName();
//		} catch (MarkdownParserUIException e) {
//			selectedProjectName = "";
//		}
//		
//		return new ReverseCodeDialog(shell, modelUid, selectedProjectName, null);
//	}
	
	/**
	 * Find the name of the model provided by the dialog
	 *
	 * @param dialog
	 *            opened dialog to user
	 * @return the name of the model. If the user has changed this name, return the name provided by the user; return the default model name
	 *         otherwise.
	 */
//	protected String getPackageName(ReverseCodeDialog dialog) {
//		String generationPackageName = dialog.getValue();
//		if (generationPackageName == null || generationPackageName.length() == 0) {
//			generationPackageName = DefaultGenerationModeleName;
//		}
//		return generationPackageName;
//	}
}
