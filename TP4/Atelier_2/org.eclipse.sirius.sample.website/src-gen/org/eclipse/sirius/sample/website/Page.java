/**
 */
package org.eclipse.sirius.sample.website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.website.Page#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.website.WebsitePackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getPage_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

} // Page
