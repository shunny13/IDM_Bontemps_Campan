/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.ListItem#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getListItem()
 * @model abstract="true"
 * @generated
 */
public interface ListItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getListItem_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItemElement> getElements();

} // ListItem
