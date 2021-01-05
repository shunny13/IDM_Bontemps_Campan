/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.TableBlock#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTableBlock()
 * @model
 * @generated
 */
public interface TableBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simplemarkdown.mm.simplemarkdown.TableSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTableBlock_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableSection> getSections();

} // TableBlock
