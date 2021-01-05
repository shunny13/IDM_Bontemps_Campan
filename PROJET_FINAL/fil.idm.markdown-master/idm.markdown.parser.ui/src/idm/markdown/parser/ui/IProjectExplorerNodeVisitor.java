/*****************************************************************************
 * Copyright (c) 2016 Cedric Dumoulin and others.
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

package idm.markdown.parser.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;

/**
 * Visitor used to visit nodes of Eclipse Package Explorer.
 * 
 * @author cedric dumoulin
 *
 */
public interface IProjectExplorerNodeVisitor {

	/**
	 * @param node
	 */
	void visitICompilationUnit(ICompilationUnit node);

	/**
	 * @param node
	 */
	void visitIClassFile(IClassFile node);

	/**
	 * @param node
	 */
	void visitIPackageFragment(IPackageFragment node);

	/**
	 * @param node
	 */
	void visitIPackageFragmentRoot(IPackageFragmentRoot node);

	/**
	 * @param node
	 */
	void visitIClasspathContainer(IClasspathContainer node);

	/**
	 * @param node
	 */
	void visitIProject(IProject node);

	/**
	 * 
	 * @param node
	 */
	void visitIFile(IFile node);

	/**
	 * @param node
	 */
	void visitIJavaProject(IJavaProject node);
	
	/**
	 * @param
	 */
	void postVisit();
	
	/**
	 * @param
	 */
	void preVisit();

	/**
	 * 
	 * @param node
	 */
	void visitIFolder(IFolder node);

}
