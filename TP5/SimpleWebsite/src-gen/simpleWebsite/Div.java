/**
 */
package simpleWebsite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWebsite.Div#getContentInsideDiv <em>Content Inside Div</em>}</li>
 * </ul>
 *
 * @see simpleWebsite.SimpleWebsitePackage#getDiv()
 * @model
 * @generated
 */
public interface Div extends Content {
	/**
	 * Returns the value of the '<em><b>Content Inside Div</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWebsite.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Inside Div</em>' containment reference list.
	 * @see simpleWebsite.SimpleWebsitePackage#getDiv_ContentInsideDiv()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContentInsideDiv();

} // Div
