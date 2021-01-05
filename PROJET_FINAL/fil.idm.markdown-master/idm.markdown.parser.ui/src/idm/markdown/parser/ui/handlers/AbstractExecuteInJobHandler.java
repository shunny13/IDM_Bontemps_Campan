/*****************************************************************************
 * Copyright (c) 2020 Cedric Dumoulin and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Cedric Dumoulin - Initial API and implementation
 *   
 *****************************************************************************/

package idm.markdown.parser.ui.handlers;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import idm.markdown.parser.ui.Activator;
import idm.markdown.parser.ui.exception.MarkdownParserUIException;

/**
 * A base class to implement ui {@link IHandler} that should run in a Job and in a transactional command.
 * <br>
 * This class must be subclassed, and the following method should be implemented :
 * <ul>
 * <li>{@link #getJobName()}</li>
 * <li>{@link #doPrepareExecute(ExecutionEvent)}</li>
 * <li>{@link #doExecuteTransactionInJob(IProgressMonitor)}</li>
 * </ul>
 * 
 * This method are called in the previous order.
 * <br>
 * This class also provides miscellaneous methods.
 * 
 * @author cedric dumoulin
 *
 */
public abstract class AbstractExecuteInJobHandler extends AbstractHandler {


	/**
	 * Event provided to the execute method. The event is stored when the execute() method start.
	 * Other method can then use this event.
	 */
	protected ExecutionEvent event;

	/**
	 * Constructor.
	 *
	 */
	public AbstractExecuteInJobHandler() {
		super();
	}

	/**
	 * Method called when button is pressed.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
	
		boolean isStatusOk = doPrepareExecute(event);
		if( !isStatusOk) {
			return null;
		}
		
		// Create Job
		Job job = new JobForHandler(getJobName());
		// Execute Job
		job.setUser(true);
		job.schedule();
	
		return null;
	}

	/**
	 * Return a name that will be used for the created Job.
	 * @return
	 */
	abstract String getJobName();
	
	/**
	 * This method is called outside the Job and outside the transaction. It is called first.
	 * This method can be used to prepare the execution, check if the handler can be executed, collect data ...
	 * 
	 * 
	 * @param event
	 * @return True if the execution should continue, false if the execution should stop.
	 */
	protected abstract boolean doPrepareExecute(ExecutionEvent event);

	/**
	 * This method is run inside a Job and in a Transaction.
	 * Papyrus models can be modified inside this method.
	 * 
	 * @param monitor
	 */
	protected abstract void doExecuteTransactionInJob(IProgressMonitor monitor);

	/**
	 * Get the active shell from the event, or from the active page if event is null.
	 * 
	 * @param event
	 * @return
	 */
	protected Shell getShell() {
		
		if(event != null ) {
			return HandlerUtil.getActiveShell(event);
		}
		else {
			return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getShell();
	
		}
	}

	/**
	 * Get the {@link IJavaProject} containing the provided node. Node should be an node selected in Package/Project Explorer.
	 * 
	 * @param node The node for which the enclosing {@link IJavaProject} is looked. 
	 * @return
	 * @throws CoreException 
	 */
	protected IJavaProject getNodeEnclosingIJavaProject(Object node) throws MarkdownParserUIException {
		
		if( node instanceof IJavaElement ) {
			
			return (IJavaProject)((IJavaElement)node).getAncestor(IJavaProject.JAVA_PROJECT);
		}
		if( node instanceof IProject ) {
			// Try to get the Java nature
			IProject project = (IProject)node;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
				return javaProject;
				}
			} catch (CoreException e) {
				throw new MarkdownParserUIException(String.format("Can't find enclosing Project for node '%s'", node), e); //$NON-NLS-1$
			}
		}
		
		// Not found
		throw new MarkdownParserUIException(String.format("Can't find enclosing Project for node '%s'", node)); //$NON-NLS-1$
	}

	/**
	 * Get the current selection.
	 * First, try with ISources.ACTIVE_CURRENT_SELECTION_NAME.
	 * Then try with PlatformUI.getWorkbench() ...
	 * @return
	 */
	protected ISelection getCurrentSelection() {
		ISelection selection=null;
	
		if (event != null) {
			// Try to get selection from context
			Object context = event.getApplicationContext();
			if ( context instanceof IEvaluationContext) {
				IEvaluationContext evaluationContext = (IEvaluationContext) context;
				selection = (ISelection)evaluationContext.getVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME);
			}
		}
		if( selection == null) {
			// Try to get selection from ActivePage
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			selection = page.getSelection();
		}
		return selection;
	}

	/**
	 * An internal {@link Job} implementation used to execute a part of the Handler as a Job.
	 * 
	 */
	protected class JobForHandler extends Job {

		/**
		 * Constructor.
		 * @param name 
		 *
		 * @param domain
		 */
		public JobForHandler(String name) {
			super(name);
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			
			
			try {
				doExecuteTransactionInJob( monitor );
			} catch (Exception e) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			}
			
			return Status.OK_STATUS;
		}

		
		
	}
	
}