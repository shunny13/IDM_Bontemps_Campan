/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.CodeBlock#getCodelines <em>Codelines</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends Block, ListItemElement {
	/**
	 * Returns the value of the '<em><b>Codelines</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simplemarkdown.mm.simplemarkdown.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codelines</em>' containment reference list.
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getCodeBlock_Codelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getCodelines();

} // CodeBlock
