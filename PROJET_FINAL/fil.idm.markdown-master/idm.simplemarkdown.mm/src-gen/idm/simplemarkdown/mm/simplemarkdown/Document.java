/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.Document#getContents <em>Contents</em>}</li>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.Document#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simplemarkdown.mm.simplemarkdown.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getDocument_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getContents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Document
