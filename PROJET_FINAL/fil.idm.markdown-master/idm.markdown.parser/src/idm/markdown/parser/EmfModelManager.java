/**
 * 
 */
package idm.markdown.parser;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import idm.simplemarkdown.mm.simplemarkdown.Document;
import idm.simplemarkdown.mm.simplemarkdown.Folder;
import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory;

/**
 * A class used to help to manage an EMF Model.
 * 
 * @author dumoulin
 *
 */
public class EmfModelManager {

	/**
	 * The current {@link ResourceSet}
	 */
	protected ResourceSet resourceSet;
	
	/**
	 * Current {@link Resource}
	 */
	protected Resource resource;

	/**
	 * Should we use a folder as the root of documents ?
	 */
	private boolean useFolderAsRoot = false;
	/**
	 * The root object used to collect the created Documents.
	 * This Folder is saved in the resource only if {@link #useFolderAsRoot} is set.
	 */
	protected Folder rootFolder;
	
	
	/**
	 * Constructor
	 */
	public EmfModelManager() {	
       this(false);
	}
	
	/**
	 * Constructor
	 * 
	 * @param useFolder If set to 'true', the resource will have a {@link Folder} used as root, and all {@link Document} will be contained in this folder.
	 *  
	 * @author dumoulin
	 */
	public EmfModelManager( boolean useFolder ) {
		
		this.useFolderAsRoot = useFolder;
		
		// Init ResourceSet
		// Register the XMI resource factory for the .website extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("simplemarkdown", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        resourceSet = new ResourceSetImpl();
        
        // Create the rootFolder, regardless if we need it in the saved resource
 		rootFolder = SimplemarkdownFactory.eINSTANCE.createFolder();
		
	}
	
	/**
	 * Reset this manager to its state after a creation.
	 * Do not change the {@link #useFolderAsRoot} field.
	 * 
	 */
	public void resetManager() {
		
		resource = null;
		
        // Obtain a new resource set
        resourceSet = new ResourceSetImpl();
        
        // Create the rootFolder, regardless if we need it in the saved resource
 		rootFolder = SimplemarkdownFactory.eINSTANCE.createFolder();
	}

	/** 
	 * Create a Document for the specified input File
	 * @param file
	 * @return
	 */
	public Document createFileDocumentFor(File file) {
		
        // create a resource
//        Resource resource = resourceSet.createResource(URI.createURI("tests/test1.simplemarkdown"));
        try {
        	String filename = file.getPath();
        	
        	System.out.println("Destination resource : " + filename );
        	
			resource = resourceSet.createResource(URI.createFileURI(filename));
//			resource = resourceSet.createResource(URI.createPlatformResourceURI(filename, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        resource = resourceSet.createResource(URI.createFileURI(file.getCanonicalPath()));
        
		Document doc = SimplemarkdownFactory.eINSTANCE.createDocument();
		doc.setName(file.getPath());

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(doc);

        return doc;
	}

	/** 
	 * Create a Document for the specified input File
	 * @param file
	 * @return
	 */
	public Document createPlatformResourceDocumentFor(File file) {
		
        // create a resource
//        Resource resource = resourceSet.createResource(URI.createURI("tests/test1.simplemarkdown"));
        try {
        	String filename = file.getPath();
        	
        	System.out.println("Destination resource : " + filename );
        	
//			resource = resourceSet.createResource(URI.createFileURI(filename));
			resource = resourceSet.createResource(URI.createPlatformResourceURI(filename, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        resource = resourceSet.createResource(URI.createFileURI(file.getCanonicalPath()));
        
		Document doc = SimplemarkdownFactory.eINSTANCE.createDocument();
		doc.setName(file.getPath());

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(doc);

        return doc;
	}

	public void saveDocument(Document doc, File file) {
        // now save the content.
		System.out.println("save resource to : " + resource.getURI());
       try {
           resource.save(Collections.EMPTY_MAP);
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
	}
	
	///////////////////////////////////////////////////////////////////////////////
	 
	/**
	 * If set to 'true', the resource will have a {@link Folder} used as root, and all {@link Document} will be contained in this folder.
	 * If set to 'false', all documents are accessible as roots of the resource.
	 * 
	 * @param useFolder
	 */
	public void setUseFolder(boolean useFolder ) {
		this.useFolderAsRoot = useFolder;
	}
	
	
	/** 
	 * Create a Document for the specified input File.
	 * The intput file is required to set a name to the created document.
	 * The created {@link Document} is added to the ressource.
	 * 
	 * @param file
	 * @return
	 */
	public Document createDocumentFor(File file) {
		        
		Document doc = SimplemarkdownFactory.eINSTANCE.createDocument();
		doc.setName(file.getPath());

        // Collect the created Documents int the rrotFolder.
		rootFolder.getDocuments().add(doc);
		
        return doc;
	}

	private boolean useFolderAsRoot() {
		// TODO Auto-generated method stub
		return useFolderAsRoot;
	}


	/** 
	 * Create the Resource for the specified File
	 * 
	 * @param file
	 * @return
	 */
	public void createPlatformResourceFor(File file) {
		
        // create a resource
//        Resource resource = resourceSet.createResource(URI.createURI("tests/test1.simplemarkdown"));
        try {
        	String filename = file.getPath();
        	
        	System.out.println("Model resource : " + filename );
        	
//			resource = resourceSet.createResource(URI.createFileURI(filename));
			resource = resourceSet.createResource(URI.createPlatformResourceURI(filename, true));
		} catch (Exception e) {
			//
			e.printStackTrace();
		}
	}

	/** 
	 * Create the Resource for the specified File
	 * 
	 * @param file
	 * @return
	 */
	public void createResourceFor(File file) {
		
         try {
        	String filename = file.getPath();
        	
        	System.out.println("Model resource : " + filename );
        	
			resource = resourceSet.createResource(URI.createFileURI(filename));
//			resource = resourceSet.createResource(URI.createPlatformResourceURI(filename, true));
		} catch (Exception e) {
			//
			e.printStackTrace();
		}

	}

	/**
	 * Save the model resource.
	 * 
	 * 
	 */
	public void saveResource() {
		
		if( resource == null ) {
			System.err.println("Resource is not created. Please call createResource() first.");
			System.err.println("Nothing is saved.");
			return;
		}
		
        // now save the content.
		System.out.println("save resource to : " + resource.getURI());
		// First, attach created elements to the resource
		if( useFolderAsRoot() ) {
			resource.getContents().add(rootFolder);
		}
		else
		{
			// Put all docs as roots
			resource.getContents().addAll(rootFolder.getDocuments());
		}
		
		
       try {
           resource.save(Collections.EMPTY_MAP);
       } catch (IOException e) {
           // 
           e.printStackTrace();
       }
	}
	

}
