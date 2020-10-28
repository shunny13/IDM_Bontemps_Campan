/**
 */
package org.eclipse.sirius.sample.website;

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
 *   <li>{@link org.eclipse.sirius.sample.website.Section#getSubParagraphs <em>Sub Paragraphs</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Section#getSubImages <em>Sub Images</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Section#getSubLinks <em>Sub Links</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Section#getSubButtons <em>Sub Buttons</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Section#getChildSections <em>Child Sections</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.Section#getParentSections <em>Parent Sections</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Content {
	/**
	 * Returns the value of the '<em><b>Sub Paragraphs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Paragraphs</em>' reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection_SubParagraphs()
	 * @model
	 * @generated
	 */
	EList<Paragraph> getSubParagraphs();

	/**
	 * Returns the value of the '<em><b>Sub Images</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Images</em>' reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection_SubImages()
	 * @model
	 * @generated
	 */
	EList<Image> getSubImages();

	/**
	 * Returns the value of the '<em><b>Sub Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Links</em>' reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection_SubLinks()
	 * @model
	 * @generated
	 */
	EList<Link> getSubLinks();

	/**
	 * Returns the value of the '<em><b>Sub Buttons</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Buttons</em>' reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection_SubButtons()
	 * @model
	 * @generated
	 */
	EList<Button> getSubButtons();

	/**
	 * Returns the value of the '<em><b>Child Sections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Section}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.website.Section#getParentSections <em>Parent Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Sections</em>' reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection_ChildSections()
	 * @see org.eclipse.sirius.sample.website.Section#getParentSections
	 * @model opposite="parentSections"
	 * @generated
	 */
	EList<Section> getChildSections();

	/**
	 * Returns the value of the '<em><b>Parent Sections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.website.Section}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.website.Section#getChildSections <em>Child Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sections</em>' reference list.
	 * @see org.eclipse.sirius.sample.website.WebsitePackage#getSection_ParentSections()
	 * @see org.eclipse.sirius.sample.website.Section#getChildSections
	 * @model opposite="childSections"
	 * @generated
	 */
	EList<Section> getParentSections();

} // Section
