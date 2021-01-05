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

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.ITypeRoot;

import idm.markdown.parser.EmfModelManager;
import idm.markdown.parser.Markdown2Model;
import idm.simplemarkdown.mm.simplemarkdown.Document;

/**
 * This visitor visit the provided Nodes. 
 * Node are usually selections from Eclipse Project/Package Explorers.
 * 
 * This visitor is used discover Markdown files and to parse them to a Markdown Model.
 * 
 * @author cedric dumoulin
 *
 */
public class MarkdownFilesNodeVisitor implements IProjectExplorerNodeVisitor {


	protected Markdown2Model parser;
	protected EmfModelManager modelManager;
	private boolean isFirstNodeAlreadyVisited = false;
	private boolean isMultiSelectionParsedInMultiResources = true;
		
	/**
	 * Constructor.
	 *
	 */
	public MarkdownFilesNodeVisitor(boolean useFolder, boolean useMultipleFile ) {
   
		parser = new Markdown2Model();
        modelManager = new EmfModelManager();
        modelManager.setUseFolder(useFolder);
        
        this.isMultiSelectionParsedInMultiResources = useMultipleFile;
        
	}

	/**
	 * Constructor.
	 *
	 * @param parameters
	 */
	public MarkdownFilesNodeVisitor(Parameters parameters) {
		this( parameters.isUsingFolder(), parameters.isUsingMultipleFiles());
	}


	
	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitICompilationUnit(org.eclipse.jdt.core.ICompilationUnit)
	 *
	 * @param unit
	 */
	@Override
	public void visitICompilationUnit(ICompilationUnit unit) {
		processITypeRoot(unit);
	}

	/**
	 * Process a {@link ICompilationUnit} or a {@link IClassFile}.
	 * 
	 * @param unit
	 */
	protected void processITypeRoot(ITypeRoot unit) {
		System.out.println("try to reverseType(" + unit.getElementName() + ")");
//		try {
//			String source = unit.getSource();
//			if (source == null)
//			{
//				System.err.println("No source attached to unit '" + unit.getElementName() + "'");
//				return;
//			}
//
//
//			CompilationUnit cu = JavaParser.parse(new StringReader(source),true);
//			javaAnalyser.processCompilationUnit(cu);
//			// Add the name to the reversed list
//			addReversedName(unit.findPrimaryType().getFullyQualifiedName('.'));
//		} catch (JavaModelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIClassFile(org.eclipse.jdt.core.IClassFile)
	 *
	 * @param unit
	 */
	@Override
	public void visitIClassFile(IClassFile unit) {
		processITypeRoot(unit);
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIPackageFragment(org.eclipse.jdt.core.IPackageFragment)
	 *
	 * @param node
	 */
	@Override
	public void visitIPackageFragment(IPackageFragment node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIPackageFragmentRoot(org.eclipse.jdt.core.IPackageFragmentRoot)
	 *
	 * @param node
	 */
	@Override
	public void visitIPackageFragmentRoot(IPackageFragmentRoot node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIClasspathContainer(org.eclipse.jdt.core.IClasspathContainer)
	 *
	 * @param node
	 */
	@Override
	public void visitIClasspathContainer(IClasspathContainer node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIProject(org.eclipse.core.resources.IProject)
	 *
	 * @param node
	 */
	@Override
	public void visitIProject(IProject node) {
		
		if( (!isMultiSelectionParsedInMultiResources)  && checkAndSetIsFirstVisitedNode() ) {
			// We are using single resource and We are the first visited node.
			// Set the model resource name
//			System.out.println("modelManager.createPlatformResourceFor( " + folderPath.toFile() + " )");
			
			String filename = node.getName();
			IPath outputFilePath = node.getFullPath().append(filename).addFileExtension("simplemarkdown");
			
			System.out.println("modelManager.createPlatformResourceFor( " + outputFilePath.toFile() + " )");
			
			modelManager.createPlatformResourceFor( outputFilePath.toFile() );
		}
	}

	@Override
	public void visitIFile(IFile node) {
		
		if( "md".equals( node.getFileExtension() ) ) {
			System.out.println("Visit markdown file " + node.getName());
			System.out.println("Visit markdown fullpath " + node.getFullPath());
			System.out.println("Visit markdown location " + node.getLocation().toString());
		}
		else {
		    System.out.println("Visit file " + node.getName());
		    return;
		    
		}   
		
//		node.getProject();
//		node.getF
		
		// Compute model filename
		IPath modelPath = node.getFullPath().removeFileExtension().addFileExtension("simplemarkdown");
//		IPath modelPath = node.getLocation().removeFileExtension().addFileExtension("simplemarkdown");
		System.out.println("Destination file = " + modelPath.toString());
		
		if( isMultiSelectionParsedInMultiResources ) {
			modelManager.createPlatformResourceFor(modelPath.toFile());
		}
		else if( checkAndSetIsFirstVisitedNode() ) {
			// We use a single resource and We are the first visited node.
			// Set the model resource name
			modelManager.createPlatformResourceFor(modelPath.toFile());
		}
		
		// Create a doc for this file node
		System.out.println("modelManager.createDocumentFor(" + modelPath.toFile() + ") ");
		Document doc =  modelManager.createDocumentFor(modelPath.toFile() );
		
		FileReader reader;
        try {
//	        String filename = "src/resources/md/installPapyrus.md";
        	File filename = node.getLocation().toFile();
        	
        	reader = new FileReader(filename);
        	// parse file
        	parser.parseFile(reader, doc);
        	// Close resource
            reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

        // Save resource in case of multiple files
        if( isMultiSelectionParsedInMultiResources ) {
        	modelManager.saveResource();
        }
	}

	private boolean checkAndSetIsFirstVisitedNode() {
		// TODO Auto-generated method stub
		if( isFirstNodeAlreadyVisited  == false ) {
			isFirstNodeAlreadyVisited = true;
			return true;
		}
		return false;
	}

	@Override
	public void visitIFolder(IFolder node) {
		
		
		if( (!isMultiSelectionParsedInMultiResources)  && checkAndSetIsFirstVisitedNode() ) {
			// We are using single resource and We are the first visited node.
			// Set the model resource name
//			System.out.println("modelManager.createPlatformResourceFor( " + folderPath.toFile() + " )");
			
			String filename = node.getName();
			IPath outputFilePath = node.getFullPath().append(filename).addFileExtension("simplemarkdown");
			
			System.out.println("modelManager.createPlatformResourceFor( " + outputFilePath.toFile() + " )");
			
			modelManager.createPlatformResourceFor( outputFilePath.toFile() );
		}
		

	}

	
	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#visitIJavaProject(org.eclipse.jdt.core.IJavaProject)
	 *
	 * @param node
	 */
	@Override
	public void visitIJavaProject(IJavaProject node) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Parameters to provide to the constructor.
	 *
	 */
	static public class Parameters {
		
		protected boolean isUsingMultipleFiles;
		
		protected String useFolder;
		
		protected boolean isUsingFolder;

		/**
		 * @return the isUsingMultipleFiles
		 */
		public boolean isUsingMultipleFiles() {
			return isUsingMultipleFiles;
		}

		/**
		 * @param isUsingMultipleFiles the isUsingMultipleFiles to set
		 */
		public void setUsingMultipleFiles(boolean isUsingMultipleFiles) {
			this.isUsingMultipleFiles = isUsingMultipleFiles;
		}

		/**
		 * @return the useFolder
		 */
		public String getUseFolder() {
			return useFolder;
		}

		/**
		 * @param useFolder the useFolder to set
		 */
		public void setUseFolder(String useFolder) {
			this.useFolder = useFolder;
			if("never".equals(useFolder)) {
				setUsingFolder(false);
			}
			else if( "always".equals(useFolder)) {
				setUsingFolder(true);
			}
			else {
				setUsingFolder(isUsingMultipleFiles());
			}
		}

		/**
		 * @return the isUsingFolder
		 */
		public boolean isUsingFolder() {
			return isUsingFolder;
		}

		/**
		 * @param isUsingFolder the isUsingFolder to set
		 */
		public void setUsingFolder(boolean isUsingFolder) {
			this.isUsingFolder = isUsingFolder;
		}
		
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#postVisit()
	 *
	 */
	@Override
	public void postVisit() {
		// save ressource
		
		if( ! isMultiSelectionParsedInMultiResources ) {
			System.out.println("modelManager.saveResource()");
			modelManager.saveResource();
		}
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.java.reverse.ui.IProjectExplorerNodeVisitor#preVisit()
	 *
	 */
	@Override
	public void preVisit() {
	}
}
