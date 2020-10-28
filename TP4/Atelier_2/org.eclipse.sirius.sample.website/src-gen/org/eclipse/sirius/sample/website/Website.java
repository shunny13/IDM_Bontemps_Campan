/**
 */
package org.eclipse.sirius.sample.website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.website.Website#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.website.WebsitePackage#getWebsite()
 * @model
 * @generated
 */
public interface Website extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getWebsite_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Website
