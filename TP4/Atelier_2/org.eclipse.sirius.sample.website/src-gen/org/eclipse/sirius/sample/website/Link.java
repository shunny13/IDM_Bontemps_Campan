/**
 */
package org.eclipse.sirius.sample.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.website.Link#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Link#getTargetParagraph <em>Target Paragraph</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Link#getTargetExternalWebsite <em>Target External Website</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.website.WebsitePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Content {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getLink_TargetPage()
	 * @model
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.website.Link#getTargetPage <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(Page value);

	/**
	 * Returns the value of the '<em><b>Target Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Paragraph</em>' reference.
	 * @see #setTargetParagraph(Paragraph)
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getLink_TargetParagraph()
	 * @model
	 * @generated
	 */
	Paragraph getTargetParagraph();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.website.Link#getTargetParagraph <em>Target Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Paragraph</em>' reference.
	 * @see #getTargetParagraph()
	 * @generated
	 */
	void setTargetParagraph(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Target External Website</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target External Website</em>' reference.
	 * @see #setTargetExternalWebsite(Website)
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getLink_TargetExternalWebsite()
	 * @model
	 * @generated
	 */
	Website getTargetExternalWebsite();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.website.Link#getTargetExternalWebsite <em>Target External Website</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target External Website</em>' reference.
	 * @see #getTargetExternalWebsite()
	 * @generated
	 */
	void setTargetExternalWebsite(Website value);

} // Link
