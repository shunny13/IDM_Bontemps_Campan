/**
 */
package usdMetaModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import usdMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsdMetaModelFactoryImpl extends EFactoryImpl implements UsdMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsdMetaModelFactory init() {
		try {
			UsdMetaModelFactory theUsdMetaModelFactory = (UsdMetaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(UsdMetaModelPackage.eNS_URI);
			if (theUsdMetaModelFactory != null) {
				return theUsdMetaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsdMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdMetaModelFactoryImpl() {
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
		case UsdMetaModelPackage.TEXT:
			return createText();
		case UsdMetaModelPackage.STRONG:
			return createStrong();
		case UsdMetaModelPackage.EMPHASIS:
			return createEmphasis();
		case UsdMetaModelPackage.LINK_WITH_REF:
			return createLinkWithRef();
		case UsdMetaModelPackage.LINK:
			return createLink();
		case UsdMetaModelPackage.IMAGE:
			return createImage();
		case UsdMetaModelPackage.BUTTON:
			return createButton();
		case UsdMetaModelPackage.PAGE:
			return createPage();
		case UsdMetaModelPackage.ELEMENT_CONTAINER:
			return createElementContainer();
		case UsdMetaModelPackage.TITLE:
			return createTitle();
		case UsdMetaModelPackage.PARAGRAPH:
			return createParagraph();
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
	public Strong createStrong() {
		StrongImpl strong = new StrongImpl();
		return strong;
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
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementContainer createElementContainer() {
		ElementContainerImpl elementContainer = new ElementContainerImpl();
		return elementContainer;
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
	public UsdMetaModelPackage getUsdMetaModelPackage() {
		return (UsdMetaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsdMetaModelPackage getPackage() {
		return UsdMetaModelPackage.eINSTANCE;
	}

} //UsdMetaModelFactoryImpl
