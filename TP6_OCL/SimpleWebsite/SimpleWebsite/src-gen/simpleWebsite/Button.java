/**
 */
package simpleWebsite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleWebsite.Button#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link simpleWebsite.Button#getTargetParagraph <em>Target Paragraph</em>}</li>
 * </ul>
 *
 * @see simpleWebsite.SimpleWebsitePackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Content {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see simpleWebsite.SimpleWebsitePackage#getButton_TargetPage()
	 * @model
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link simpleWebsite.Button#getTargetPage <em>Target Page</em>}' reference.
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
	 * @see simpleWebsite.SimpleWebsitePackage#getButton_TargetParagraph()
	 * @model
	 * @generated
	 */
	Paragraph getTargetParagraph();

	/**
	 * Sets the value of the '{@link simpleWebsite.Button#getTargetParagraph <em>Target Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Paragraph</em>' reference.
	 * @see #getTargetParagraph()
	 * @generated
	 */
	void setTargetParagraph(Paragraph value);

} // Button
