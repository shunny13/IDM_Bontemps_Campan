/**
 */
package org.eclipse.sirius.sample.website;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.website.WebsiteFactory
 * @model kind="package"
 * @generated
 */
public interface WebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "website";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/sample/website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "website";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsitePackage eINSTANCE = org.eclipse.sirius.sample.website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.WebsiteImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__PAGES = 0;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.PageImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.ContentImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 7;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.ParagraphImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.ImageImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.SectionImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 4;

	/**
	 * The feature id for the '<em><b>Sub Paragraphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_PARAGRAPHS = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_IMAGES = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_LINKS = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_BUTTONS = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CHILD_SECTIONS = CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARENT_SECTIONS = CONTENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.LinkImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_PAGE = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_PARAGRAPH = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target External Website</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_EXTERNAL_WEBSITE = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.website.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.website.impl.ButtonImpl
	 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TARGET_PAGE = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TARGET_PARAGRAPH = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target External Website</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TARGET_EXTERNAL_WEBSITE = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see org.eclipse.sirius.sample.website.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.website.Website#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.eclipse.sirius.sample.website.Website#getPages()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Pages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.eclipse.sirius.sample.website.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.website.Page#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.eclipse.sirius.sample.website.Page#getContent()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.sirius.sample.website.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.website.Paragraph#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.sirius.sample.website.Paragraph#getContent()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.sirius.sample.website.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.sirius.sample.website.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.website.Section#getSubParagraphs <em>Sub Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Paragraphs</em>'.
	 * @see org.eclipse.sirius.sample.website.Section#getSubParagraphs()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SubParagraphs();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.website.Section#getSubImages <em>Sub Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Images</em>'.
	 * @see org.eclipse.sirius.sample.website.Section#getSubImages()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SubImages();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.website.Section#getSubLinks <em>Sub Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Links</em>'.
	 * @see org.eclipse.sirius.sample.website.Section#getSubLinks()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SubLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.website.Section#getSubButtons <em>Sub Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Buttons</em>'.
	 * @see org.eclipse.sirius.sample.website.Section#getSubButtons()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SubButtons();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.website.Section#getChildSections <em>Child Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Sections</em>'.
	 * @see org.eclipse.sirius.sample.website.Section#getChildSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_ChildSections();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.website.Section#getParentSections <em>Parent Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Sections</em>'.
	 * @see org.eclipse.sirius.sample.website.Section#getParentSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_ParentSections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.sirius.sample.website.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.website.Link#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Page</em>'.
	 * @see org.eclipse.sirius.sample.website.Link#getTargetPage()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_TargetPage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.website.Link#getTargetParagraph <em>Target Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Paragraph</em>'.
	 * @see org.eclipse.sirius.sample.website.Link#getTargetParagraph()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_TargetParagraph();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.website.Link#getTargetExternalWebsite <em>Target External Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target External Website</em>'.
	 * @see org.eclipse.sirius.sample.website.Link#getTargetExternalWebsite()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_TargetExternalWebsite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.eclipse.sirius.sample.website.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.website.Button#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Page</em>'.
	 * @see org.eclipse.sirius.sample.website.Button#getTargetPage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_TargetPage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.website.Button#getTargetParagraph <em>Target Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Paragraph</em>'.
	 * @see org.eclipse.sirius.sample.website.Button#getTargetParagraph()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_TargetParagraph();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.website.Button#getTargetExternalWebsite <em>Target External Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target External Website</em>'.
	 * @see org.eclipse.sirius.sample.website.Button#getTargetExternalWebsite()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_TargetExternalWebsite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.website.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.eclipse.sirius.sample.website.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebsiteFactory getWebsiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.WebsiteImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__PAGES = eINSTANCE.getWebsite_Pages();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.PageImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTENT = eINSTANCE.getPage_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.ParagraphImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__CONTENT = eINSTANCE.getParagraph_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.ImageImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.SectionImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Sub Paragraphs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUB_PARAGRAPHS = eINSTANCE.getSection_SubParagraphs();

		/**
		 * The meta object literal for the '<em><b>Sub Images</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUB_IMAGES = eINSTANCE.getSection_SubImages();

		/**
		 * The meta object literal for the '<em><b>Sub Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUB_LINKS = eINSTANCE.getSection_SubLinks();

		/**
		 * The meta object literal for the '<em><b>Sub Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUB_BUTTONS = eINSTANCE.getSection_SubButtons();

		/**
		 * The meta object literal for the '<em><b>Child Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CHILD_SECTIONS = eINSTANCE.getSection_ChildSections();

		/**
		 * The meta object literal for the '<em><b>Parent Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARENT_SECTIONS = eINSTANCE.getSection_ParentSections();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.LinkImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET_PAGE = eINSTANCE.getLink_TargetPage();

		/**
		 * The meta object literal for the '<em><b>Target Paragraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET_PARAGRAPH = eINSTANCE.getLink_TargetParagraph();

		/**
		 * The meta object literal for the '<em><b>Target External Website</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET_EXTERNAL_WEBSITE = eINSTANCE.getLink_TargetExternalWebsite();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.ButtonImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TARGET_PAGE = eINSTANCE.getButton_TargetPage();

		/**
		 * The meta object literal for the '<em><b>Target Paragraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TARGET_PARAGRAPH = eINSTANCE.getButton_TargetParagraph();

		/**
		 * The meta object literal for the '<em><b>Target External Website</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TARGET_EXTERNAL_WEBSITE = eINSTANCE.getButton_TargetExternalWebsite();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.website.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.website.impl.ContentImpl
		 * @see org.eclipse.sirius.sample.website.impl.WebsitePackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

	}

} //WebsitePackage
