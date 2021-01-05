/**
 */
package bootstrapMetaModel.impl;

import bootstrapMetaModel.*;

import org.eclipse.emf.ecore.EClass;
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
public class BootstrapMetaModelFactoryImpl extends EFactoryImpl implements BootstrapMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BootstrapMetaModelFactory init() {
		try {
			BootstrapMetaModelFactory theBootstrapMetaModelFactory = (BootstrapMetaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(BootstrapMetaModelPackage.eNS_URI);
			if (theBootstrapMetaModelFactory != null) {
				return theBootstrapMetaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BootstrapMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapMetaModelFactoryImpl() {
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
		case BootstrapMetaModelPackage.PAGE:
			return createPage();
		case BootstrapMetaModelPackage.TEXT:
			return createText();
		case BootstrapMetaModelPackage.BOLD:
			return createBold();
		case BootstrapMetaModelPackage.ITALIC:
			return createItalic();
		case BootstrapMetaModelPackage.LINK_WITH_REF:
			return createLinkWithRef();
		case BootstrapMetaModelPackage.LINK:
			return createLink();
		case BootstrapMetaModelPackage.IMAGE:
			return createImage();
		case BootstrapMetaModelPackage.BUTTON:
			return createButton();
		case BootstrapMetaModelPackage.HEADER:
			return createHeader();
		case BootstrapMetaModelPackage.PARAGRAPH:
			return createParagraph();
		case BootstrapMetaModelPackage.SECTION:
			return createSection();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bold createBold() {
		BoldImpl bold = new BoldImpl();
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Italic createItalic() {
		ItalicImpl italic = new ItalicImpl();
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkWithRef createLinkWithRef() {
		LinkWithRefImpl linkWithRef = new LinkWithRefImpl();
		return linkWithRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapMetaModelPackage getBootstrapMetaModelPackage() {
		return (BootstrapMetaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BootstrapMetaModelPackage getPackage() {
		return BootstrapMetaModelPackage.eINSTANCE;
	}

} //BootstrapMetaModelFactoryImpl
