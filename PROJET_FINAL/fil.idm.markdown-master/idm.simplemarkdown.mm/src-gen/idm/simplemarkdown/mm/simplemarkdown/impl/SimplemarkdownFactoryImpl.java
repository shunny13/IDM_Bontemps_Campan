/**
 */
package idm.simplemarkdown.mm.simplemarkdown.impl;

import idm.simplemarkdown.mm.simplemarkdown.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplemarkdownFactoryImpl extends EFactoryImpl implements SimplemarkdownFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplemarkdownFactory init() {
		try {
			SimplemarkdownFactory theSimplemarkdownFactory = (SimplemarkdownFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimplemarkdownPackage.eNS_URI);
			if (theSimplemarkdownFactory != null) {
				return theSimplemarkdownFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplemarkdownFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemarkdownFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SimplemarkdownPackage.DOCUMENT:
			return createDocument();
		case SimplemarkdownPackage.PARAGRAPH:
			return createParagraph();
		case SimplemarkdownPackage.TITLE:
			return createTitle();
		case SimplemarkdownPackage.TEXT:
			return createText();
		case SimplemarkdownPackage.STRONG_EMPHASIS:
			return createStrongEmphasis();
		case SimplemarkdownPackage.CODE:
			return createCode();
		case SimplemarkdownPackage.BULLET_LIST:
			return createBulletList();
		case SimplemarkdownPackage.BULLET_LIST_ITEM:
			return createBulletListItem();
		case SimplemarkdownPackage.LINK:
			return createLink();
		case SimplemarkdownPackage.FOLDER:
			return createFolder();
		case SimplemarkdownPackage.ORDERED_LIST:
			return createOrderedList();
		case SimplemarkdownPackage.ORDERED_LIST_ITEM:
			return createOrderedListItem();
		case SimplemarkdownPackage.BLOCK_QUOTE:
			return createBlockQuote();
		case SimplemarkdownPackage.IMAGE:
			return createImage();
		case SimplemarkdownPackage.EMPHASIS:
			return createEmphasis();
		case SimplemarkdownPackage.CODE_BLOCK:
			return createCodeBlock();
		case SimplemarkdownPackage.HORIZONTAL_LINE:
			return createHorizontalLine();
		case SimplemarkdownPackage.CODE_LINE:
			return createCodeLine();
		case SimplemarkdownPackage.LINK_WITH_REF:
			return createLinkWithRef();
		case SimplemarkdownPackage.REFERENCE:
			return createReference();
		case SimplemarkdownPackage.TABLE_BLOCK:
			return createTableBlock();
		case SimplemarkdownPackage.TABLE_ROW:
			return createTableRow();
		case SimplemarkdownPackage.TABLE_HEAD:
			return createTableHead();
		case SimplemarkdownPackage.TABLE_BODY:
			return createTableBody();
		case SimplemarkdownPackage.TABLE_SEPARATOR:
			return createTableSeparator();
		case SimplemarkdownPackage.TABLE_CELL:
			return createTableCell();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SimplemarkdownPackage.TABLE_CELL_ALIGNEMENT:
			return createTableCellAlignementFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SimplemarkdownPackage.TABLE_CELL_ALIGNEMENT:
			return convertTableCellAlignementToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongEmphasis createStrongEmphasis() {
		StrongEmphasisImpl strongEmphasis = new StrongEmphasisImpl();
		return strongEmphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BulletList createBulletList() {
		BulletListImpl bulletList = new BulletListImpl();
		return bulletList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BulletListItem createBulletListItem() {
		BulletListItemImpl bulletListItem = new BulletListItemImpl();
		return bulletListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedList createOrderedList() {
		OrderedListImpl orderedList = new OrderedListImpl();
		return orderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedListItem createOrderedListItem() {
		OrderedListItemImpl orderedListItem = new OrderedListItemImpl();
		return orderedListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockQuote createBlockQuote() {
		BlockQuoteImpl blockQuote = new BlockQuoteImpl();
		return blockQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emphasis createEmphasis() {
		EmphasisImpl emphasis = new EmphasisImpl();
		return emphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HorizontalLine createHorizontalLine() {
		HorizontalLineImpl horizontalLine = new HorizontalLineImpl();
		return horizontalLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLine createCodeLine() {
		CodeLineImpl codeLine = new CodeLineImpl();
		return codeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkWithRef createLinkWithRef() {
		LinkWithRefImpl linkWithRef = new LinkWithRefImpl();
		return linkWithRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBlock createTableBlock() {
		TableBlockImpl tableBlock = new TableBlockImpl();
		return tableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableHead createTableHead() {
		TableHeadImpl tableHead = new TableHeadImpl();
		return tableHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableBody createTableBody() {
		TableBodyImpl tableBody = new TableBodyImpl();
		return tableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableSeparator createTableSeparator() {
		TableSeparatorImpl tableSeparator = new TableSeparatorImpl();
		return tableSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCellAlignement createTableCellAlignementFromString(EDataType eDataType, String initialValue) {
		TableCellAlignement result = TableCellAlignement.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableCellAlignementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplemarkdownPackage getSimplemarkdownPackage() {
		return (SimplemarkdownPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplemarkdownPackage getPackage() {
		return SimplemarkdownPackage.eINSTANCE;
	}

} //SimplemarkdownFactoryImpl
