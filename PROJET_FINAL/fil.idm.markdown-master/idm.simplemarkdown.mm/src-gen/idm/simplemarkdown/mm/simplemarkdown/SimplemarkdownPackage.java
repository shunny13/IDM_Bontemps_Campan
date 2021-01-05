/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory
 * @model kind="package"
 * @generated
 */
public interface SimplemarkdownPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplemarkdown";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplemarkdown";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplemarkdown";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplemarkdownPackage eINSTANCE = idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItemElement()
	 * @generated
	 */
	int LIST_ITEM_ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ELEMENTS = LIST_ITEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = LIST_ITEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = LIST_ITEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__ELEMENTS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ELEMENTS = TEXT_CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CompositeTextElementImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCompositeTextElement()
	 * @generated
	 */
	int COMPOSITE_TEXT_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT__SUBTEXT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl <em>Strong Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getStrongEmphasis()
	 * @generated
	 */
	int STRONG_EMPHASIS = 5;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS__SUBTEXT = COMPOSITE_TEXT_ELEMENT__SUBTEXT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS__TEXT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strong Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TEXT = TEXT__TEXT;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl <em>Bullet List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletList()
	 * @generated
	 */
	int BULLET_LIST = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__ITEMS = LIST__ITEMS;

	/**
	 * The number of structural features of the '<em>Bullet List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bullet List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl <em>Bullet List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletListItem()
	 * @generated
	 */
	int BULLET_LIST_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__ELEMENTS = LIST_ITEM__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Bullet List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bullet List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.UrlBasedLinkImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getUrlBasedLink()
	 * @generated
	 */
	int URL_BASED_LINK = 27;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__SUBTEXT = COMPOSITE_TEXT_ELEMENT__SUBTEXT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__URL = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__TITLE = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 10;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SUBTEXT = URL_BASED_LINK__SUBTEXT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = URL_BASED_LINK__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = URL_BASED_LINK__TITLE;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 14;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ITEMS = LIST__ITEMS;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedListItem()
	 * @generated
	 */
	int ORDERED_LIST_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__ELEMENTS = LIST_ITEM__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ordered List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlockQuote()
	 * @generated
	 */
	int BLOCK_QUOTE = 16;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__CONTENTS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 17;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUBTEXT = URL_BASED_LINK__SUBTEXT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = URL_BASED_LINK__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = URL_BASED_LINK__TITLE;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 18;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__SUBTEXT = COMPOSITE_TEXT_ELEMENT__SUBTEXT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__TEXT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 19;

	/**
	 * The feature id for the '<em><b>Codelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODELINES = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getHorizontalLine()
	 * @generated
	 */
	int HORIZONTAL_LINE = 20;

	/**
	 * The number of structural features of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl <em>Code Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeLine()
	 * @generated
	 */
	int CODE_LINE = 24;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkWithRefImpl <em>Link With Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkWithRefImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLinkWithRef()
	 * @generated
	 */
	int LINK_WITH_REF = 25;

	/**
	 * The feature id for the '<em><b>Subtext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WITH_REF__SUBTEXT = COMPOSITE_TEXT_ELEMENT__SUBTEXT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WITH_REF__REFERENCE = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link With Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WITH_REF_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link With Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_WITH_REF_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ReferenceImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__URL = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TITLE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableBlockImpl <em>Table Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableBlockImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableBlock()
	 * @generated
	 */
	int TABLE_BLOCK = 28;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK__SECTIONS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableRowImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 29;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ROW_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableSectionImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 34;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ROWS = 0;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableHeadImpl <em>Table Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableHeadImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableHead()
	 * @generated
	 */
	int TABLE_HEAD = 30;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableBodyImpl <em>Table Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableBodyImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableBody()
	 * @generated
	 */
	int TABLE_BODY = 31;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableSeparatorImpl <em>Table Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableSeparatorImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableSeparator()
	 * @generated
	 */
	int TABLE_SEPARATOR = 32;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 33;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ELEMENTS = TEXT_CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__IS_HEADER = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__SPAN = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ALIGNEMENT = TEXT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement <em>Table Cell Alignement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableCellAlignement()
	 * @generated
	 */
	int TABLE_CELL_ALIGNEMENT = 35;

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.Document#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document#getContents()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Contents();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis <em>Strong Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Emphasis</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis
	 * @generated
	 */
	EClass getStrongEmphasis();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis#getText()
	 * @see #getStrongEmphasis()
	 * @generated
	 */
	EAttribute getStrongEmphasis_Text();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.BulletList <em>Bullet List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet List</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BulletList
	 * @generated
	 */
	EClass getBulletList();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.BulletListItem <em>Bullet List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet List Item</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BulletListItem
	 * @generated
	 */
	EClass getBulletListItem();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.Folder#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder#getDocuments()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Documents();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.List#getItems()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Items();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.ListItem#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItem#getElements()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Elements();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.OrderedListItem <em>Ordered List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List Item</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.OrderedListItem
	 * @generated
	 */
	EClass getOrderedListItem();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Quote</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BlockQuote
	 * @generated
	 */
	EClass getBlockQuote();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.BlockQuote#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BlockQuote#getContents()
	 * @see #getBlockQuote()
	 * @generated
	 */
	EReference getBlockQuote_Contents();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Emphasis#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Emphasis#getText()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_Text();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.CodeBlock#getCodelines <em>Codelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codelines</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeBlock#getCodelines()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Codelines();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Line</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.HorizontalLine
	 * @generated
	 */
	EClass getHorizontalLine();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Element</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
	 * @generated
	 */
	EClass getListItemElement();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.TextContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextContainer#getElements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Elements();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Text Element</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CompositeTextElement
	 * @generated
	 */
	EClass getCompositeTextElement();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.CompositeTextElement#getSubtext <em>Subtext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtext</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CompositeTextElement#getSubtext()
	 * @see #getCompositeTextElement()
	 * @generated
	 */
	EReference getCompositeTextElement_Subtext();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Line</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeLine
	 * @generated
	 */
	EClass getCodeLine();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.CodeLine#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeLine#getText()
	 * @see #getCodeLine()
	 * @generated
	 */
	EAttribute getCodeLine_Text();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.LinkWithRef <em>Link With Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link With Ref</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkWithRef
	 * @generated
	 */
	EClass getLinkWithRef();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.LinkWithRef#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkWithRef#getReference()
	 * @see #getLinkWithRef()
	 * @generated
	 */
	EAttribute getLinkWithRef_Reference();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Reference#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Reference#getUrl()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Url();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Reference#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Reference#getTitle()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Title();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Based Link</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink
	 * @generated
	 */
	EClass getUrlBasedLink();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink#getUrl()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink#getTitle()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Title();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableBlock <em>Table Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Block</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableBlock
	 * @generated
	 */
	EClass getTableBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.TableBlock#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableBlock#getSections()
	 * @see #getTableBlock()
	 * @generated
	 */
	EReference getTableBlock_Sections();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.TableRow#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableRow#getRowNumber()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_RowNumber();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Head</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableHead
	 * @generated
	 */
	EClass getTableHead();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Body</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableBody
	 * @generated
	 */
	EClass getTableBody();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableSeparator <em>Table Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Separator</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableSeparator
	 * @generated
	 */
	EClass getTableSeparator();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#isIsHeader <em>Is Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Header</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCell#isIsHeader()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_IsHeader();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCell#getSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Span();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#getAlignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignement</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCell#getAlignement()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Alignement();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.TableSection#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableSection#getRows()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Rows();

	/**
	 * Returns the meta object for enum '{@link idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement <em>Table Cell Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Cell Alignement</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement
	 * @generated
	 */
	EEnum getTableCellAlignement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplemarkdownFactory getSimplemarkdownFactory();

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
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CONTENTS = eINSTANCE.getDocument_Contents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__LEVEL = eINSTANCE.getTitle_Level();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl <em>Strong Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getStrongEmphasis()
		 * @generated
		 */
		EClass STRONG_EMPHASIS = eINSTANCE.getStrongEmphasis();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_EMPHASIS__TEXT = eINSTANCE.getStrongEmphasis_Text();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl <em>Bullet List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletList()
		 * @generated
		 */
		EClass BULLET_LIST = eINSTANCE.getBulletList();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl <em>Bullet List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletListItem()
		 * @generated
		 */
		EClass BULLET_LIST_ITEM = eINSTANCE.getBulletListItem();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__DOCUMENTS = eINSTANCE.getFolder_Documents();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEMS = eINSTANCE.getList_Items();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__ELEMENTS = eINSTANCE.getListItem_Elements();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedListItem()
		 * @generated
		 */
		EClass ORDERED_LIST_ITEM = eINSTANCE.getOrderedListItem();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlockQuote()
		 * @generated
		 */
		EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_QUOTE__CONTENTS = eINSTANCE.getBlockQuote_Contents();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__TEXT = eINSTANCE.getEmphasis_Text();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Codelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CODELINES = eINSTANCE.getCodeBlock_Codelines();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getHorizontalLine()
		 * @generated
		 */
		EClass HORIZONTAL_LINE = eINSTANCE.getHorizontalLine();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItemElement()
		 * @generated
		 */
		EClass LIST_ITEM_ELEMENT = eINSTANCE.getListItemElement();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextContainer()
		 * @generated
		 */
		EClass TEXT_CONTAINER = eINSTANCE.getTextContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__ELEMENTS = eINSTANCE.getTextContainer_Elements();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CompositeTextElementImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCompositeTextElement()
		 * @generated
		 */
		EClass COMPOSITE_TEXT_ELEMENT = eINSTANCE.getCompositeTextElement();

		/**
		 * The meta object literal for the '<em><b>Subtext</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TEXT_ELEMENT__SUBTEXT = eINSTANCE.getCompositeTextElement_Subtext();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl <em>Code Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeLine()
		 * @generated
		 */
		EClass CODE_LINE = eINSTANCE.getCodeLine();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LINE__TEXT = eINSTANCE.getCodeLine_Text();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkWithRefImpl <em>Link With Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkWithRefImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLinkWithRef()
		 * @generated
		 */
		EClass LINK_WITH_REF = eINSTANCE.getLinkWithRef();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_WITH_REF__REFERENCE = eINSTANCE.getLinkWithRef_Reference();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ReferenceImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__URL = eINSTANCE.getReference_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__TITLE = eINSTANCE.getReference_Title();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.UrlBasedLinkImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getUrlBasedLink()
		 * @generated
		 */
		EClass URL_BASED_LINK = eINSTANCE.getUrlBasedLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_LINK__URL = eINSTANCE.getUrlBasedLink_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_LINK__TITLE = eINSTANCE.getUrlBasedLink_Title();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableBlockImpl <em>Table Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableBlockImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableBlock()
		 * @generated
		 */
		EClass TABLE_BLOCK = eINSTANCE.getTableBlock();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_BLOCK__SECTIONS = eINSTANCE.getTableBlock_Sections();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableRowImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Row Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__ROW_NUMBER = eINSTANCE.getTableRow_RowNumber();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableHeadImpl <em>Table Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableHeadImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableHead()
		 * @generated
		 */
		EClass TABLE_HEAD = eINSTANCE.getTableHead();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableBodyImpl <em>Table Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableBodyImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableBody()
		 * @generated
		 */
		EClass TABLE_BODY = eINSTANCE.getTableBody();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableSeparatorImpl <em>Table Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableSeparatorImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableSeparator()
		 * @generated
		 */
		EClass TABLE_SEPARATOR = eINSTANCE.getTableSeparator();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Is Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__IS_HEADER = eINSTANCE.getTableCell_IsHeader();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__SPAN = eINSTANCE.getTableCell_Span();

		/**
		 * The meta object literal for the '<em><b>Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ALIGNEMENT = eINSTANCE.getTableCell_Alignement();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TableSectionImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__ROWS = eINSTANCE.getTableSection_Rows();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement <em>Table Cell Alignement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTableCellAlignement()
		 * @generated
		 */
		EEnum TABLE_CELL_ALIGNEMENT = eINSTANCE.getTableCellAlignement();

	}

} //SimplemarkdownPackage
