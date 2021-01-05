/**
 */
package idm.simplemarkdown.mm.simplemarkdown.util;

import idm.simplemarkdown.mm.simplemarkdown.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage
 * @generated
 */
public class SimplemarkdownAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplemarkdownPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemarkdownAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplemarkdownPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplemarkdownSwitch<Adapter> modelSwitch = new SimplemarkdownSwitch<Adapter>() {
		@Override
		public Adapter caseDocument(Document object) {
			return createDocumentAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseParagraph(Paragraph object) {
			return createParagraphAdapter();
		}

		@Override
		public Adapter caseTitle(Title object) {
			return createTitleAdapter();
		}

		@Override
		public Adapter caseText(Text object) {
			return createTextAdapter();
		}

		@Override
		public Adapter caseStrongEmphasis(StrongEmphasis object) {
			return createStrongEmphasisAdapter();
		}

		@Override
		public Adapter caseTextElement(TextElement object) {
			return createTextElementAdapter();
		}

		@Override
		public Adapter caseCode(Code object) {
			return createCodeAdapter();
		}

		@Override
		public Adapter caseBulletList(BulletList object) {
			return createBulletListAdapter();
		}

		@Override
		public Adapter caseBulletListItem(BulletListItem object) {
			return createBulletListItemAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseFolder(Folder object) {
			return createFolderAdapter();
		}

		@Override
		public Adapter caseList(List object) {
			return createListAdapter();
		}

		@Override
		public Adapter caseListItem(ListItem object) {
			return createListItemAdapter();
		}

		@Override
		public Adapter caseOrderedList(OrderedList object) {
			return createOrderedListAdapter();
		}

		@Override
		public Adapter caseOrderedListItem(OrderedListItem object) {
			return createOrderedListItemAdapter();
		}

		@Override
		public Adapter caseBlockQuote(BlockQuote object) {
			return createBlockQuoteAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseEmphasis(Emphasis object) {
			return createEmphasisAdapter();
		}

		@Override
		public Adapter caseCodeBlock(CodeBlock object) {
			return createCodeBlockAdapter();
		}

		@Override
		public Adapter caseHorizontalLine(HorizontalLine object) {
			return createHorizontalLineAdapter();
		}

		@Override
		public Adapter caseListItemElement(ListItemElement object) {
			return createListItemElementAdapter();
		}

		@Override
		public Adapter caseTextContainer(TextContainer object) {
			return createTextContainerAdapter();
		}

		@Override
		public Adapter caseCompositeTextElement(CompositeTextElement object) {
			return createCompositeTextElementAdapter();
		}

		@Override
		public Adapter caseCodeLine(CodeLine object) {
			return createCodeLineAdapter();
		}

		@Override
		public Adapter caseLinkWithRef(LinkWithRef object) {
			return createLinkWithRefAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseUrlBasedLink(UrlBasedLink object) {
			return createUrlBasedLinkAdapter();
		}

		@Override
		public Adapter caseTableBlock(TableBlock object) {
			return createTableBlockAdapter();
		}

		@Override
		public Adapter caseTableRow(TableRow object) {
			return createTableRowAdapter();
		}

		@Override
		public Adapter caseTableHead(TableHead object) {
			return createTableHeadAdapter();
		}

		@Override
		public Adapter caseTableBody(TableBody object) {
			return createTableBodyAdapter();
		}

		@Override
		public Adapter caseTableSeparator(TableSeparator object) {
			return createTableSeparatorAdapter();
		}

		@Override
		public Adapter caseTableCell(TableCell object) {
			return createTableCellAdapter();
		}

		@Override
		public Adapter caseTableSection(TableSection object) {
			return createTableSectionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis <em>Strong Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis
	 * @generated
	 */
	public Adapter createStrongEmphasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.BulletList <em>Bullet List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BulletList
	 * @generated
	 */
	public Adapter createBulletListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.BulletListItem <em>Bullet List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BulletListItem
	 * @generated
	 */
	public Adapter createBulletListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.OrderedList
	 * @generated
	 */
	public Adapter createOrderedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.OrderedListItem <em>Ordered List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.OrderedListItem
	 * @generated
	 */
	public Adapter createOrderedListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BlockQuote
	 * @generated
	 */
	public Adapter createBlockQuoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Emphasis
	 * @generated
	 */
	public Adapter createEmphasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeBlock
	 * @generated
	 */
	public Adapter createCodeBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.HorizontalLine
	 * @generated
	 */
	public Adapter createHorizontalLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
	 * @generated
	 */
	public Adapter createListItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextContainer
	 * @generated
	 */
	public Adapter createTextContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CompositeTextElement
	 * @generated
	 */
	public Adapter createCompositeTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeLine
	 * @generated
	 */
	public Adapter createCodeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.LinkWithRef <em>Link With Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkWithRef
	 * @generated
	 */
	public Adapter createLinkWithRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.UrlBasedLink
	 * @generated
	 */
	public Adapter createUrlBasedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableBlock <em>Table Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableBlock
	 * @generated
	 */
	public Adapter createTableBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableHead
	 * @generated
	 */
	public Adapter createTableHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableBody
	 * @generated
	 */
	public Adapter createTableBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableSeparator <em>Table Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableSeparator
	 * @generated
	 */
	public Adapter createTableSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCell
	 * @generated
	 */
	public Adapter createTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simplemarkdown.mm.simplemarkdown.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableSection
	 * @generated
	 */
	public Adapter createTableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimplemarkdownAdapterFactory
