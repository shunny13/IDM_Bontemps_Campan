/**
 */
package simpleWebsite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWebsite.Section#getContentInsideSection <em>Content Inside Section</em>}</li>
 * </ul>
 *
 * @see simpleWebsite.SimpleWebsitePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Content {
	/**
	 * Returns the value of the '<em><b>Content Inside Section</b></em>' containment reference list.
	 * The list contents are of type {@link simpleWebsite.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Inside Section</em>' containment reference list.
	 * @see simpleWebsite.SimpleWebsitePackage#getSection_ContentInsideSection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContentInsideSection();

} // Section
