/**
 */
package bootstrapMetaModel.impl;

import bootstrapMetaModel.BootstrapMetaModelPackage;
import bootstrapMetaModel.Element;
import bootstrapMetaModel.UrlBasedLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Url Based Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bootstrapMetaModel.impl.UrlBasedLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link bootstrapMetaModel.impl.UrlBasedLinkImpl#getMyclass <em>Myclass</em>}</li>
 *   <li>{@link bootstrapMetaModel.impl.UrlBasedLinkImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link bootstrapMetaModel.impl.UrlBasedLinkImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UrlBasedLinkImpl extends CompositeTextElementImpl implements UrlBasedLink {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMyclass() <em>Myclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyclass()
	 * @generated
	 * @ordered
	 */
	protected static final String MYCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyclass() <em>Myclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyclass()
	 * @generated
	 * @ordered
	 */
	protected String myclass = MYCLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlBasedLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapMetaModelPackage.Literals.URL_BASED_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BootstrapMetaModelPackage.URL_BASED_LINK__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyclass() {
		return myclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyclass(String newMyclass) {
		String oldMyclass = myclass;
		myclass = newMyclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS,
					oldMyclass, myclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BootstrapMetaModelPackage.URL_BASED_LINK__URL, oldUrl,
					url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BootstrapMetaModelPackage.URL_BASED_LINK__TITLE,
					oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BootstrapMetaModelPackage.URL_BASED_LINK__ID:
			return getId();
		case BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS:
			return getMyclass();
		case BootstrapMetaModelPackage.URL_BASED_LINK__URL:
			return getUrl();
		case BootstrapMetaModelPackage.URL_BASED_LINK__TITLE:
			return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BootstrapMetaModelPackage.URL_BASED_LINK__ID:
			setId((String) newValue);
			return;
		case BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS:
			setMyclass((String) newValue);
			return;
		case BootstrapMetaModelPackage.URL_BASED_LINK__URL:
			setUrl((String) newValue);
			return;
		case BootstrapMetaModelPackage.URL_BASED_LINK__TITLE:
			setTitle((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BootstrapMetaModelPackage.URL_BASED_LINK__ID:
			setId(ID_EDEFAULT);
			return;
		case BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS:
			setMyclass(MYCLASS_EDEFAULT);
			return;
		case BootstrapMetaModelPackage.URL_BASED_LINK__URL:
			setUrl(URL_EDEFAULT);
			return;
		case BootstrapMetaModelPackage.URL_BASED_LINK__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BootstrapMetaModelPackage.URL_BASED_LINK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS:
			return MYCLASS_EDEFAULT == null ? myclass != null : !MYCLASS_EDEFAULT.equals(myclass);
		case BootstrapMetaModelPackage.URL_BASED_LINK__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case BootstrapMetaModelPackage.URL_BASED_LINK__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			case BootstrapMetaModelPackage.URL_BASED_LINK__ID:
				return BootstrapMetaModelPackage.ELEMENT__ID;
			case BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS:
				return BootstrapMetaModelPackage.ELEMENT__MYCLASS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			case BootstrapMetaModelPackage.ELEMENT__ID:
				return BootstrapMetaModelPackage.URL_BASED_LINK__ID;
			case BootstrapMetaModelPackage.ELEMENT__MYCLASS:
				return BootstrapMetaModelPackage.URL_BASED_LINK__MYCLASS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", myclass: ");
		result.append(myclass);
		result.append(", url: ");
		result.append(url);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //UrlBasedLinkImpl
