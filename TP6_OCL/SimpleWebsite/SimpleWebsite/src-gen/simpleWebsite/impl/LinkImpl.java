/**
 */
package simpleWebsite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleWebsite.Link;
import simpleWebsite.Page;
import simpleWebsite.Paragraph;
import simpleWebsite.SimpleWebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleWebsite.impl.LinkImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link simpleWebsite.impl.LinkImpl#getTargetParagraph <em>Target Paragraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends ContentImpl implements Link {
	/**
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected Page targetPage;

	/**
	 * The cached value of the '{@link #getTargetParagraph() <em>Target Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParagraph()
	 * @generated
	 * @ordered
	 */
	protected Paragraph targetParagraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleWebsitePackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject) targetPage;
			targetPage = (Page) eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleWebsitePackage.LINK__TARGET_PAGE,
							oldTargetPage, targetPage));
			}
		}
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPage(Page newTargetPage) {
		Page oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebsitePackage.LINK__TARGET_PAGE, oldTargetPage,
					targetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph getTargetParagraph() {
		if (targetParagraph != null && targetParagraph.eIsProxy()) {
			InternalEObject oldTargetParagraph = (InternalEObject) targetParagraph;
			targetParagraph = (Paragraph) eResolveProxy(oldTargetParagraph);
			if (targetParagraph != oldTargetParagraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimpleWebsitePackage.LINK__TARGET_PARAGRAPH, oldTargetParagraph, targetParagraph));
			}
		}
		return targetParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph basicGetTargetParagraph() {
		return targetParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetParagraph(Paragraph newTargetParagraph) {
		Paragraph oldTargetParagraph = targetParagraph;
		targetParagraph = newTargetParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleWebsitePackage.LINK__TARGET_PARAGRAPH,
					oldTargetParagraph, targetParagraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleWebsitePackage.LINK__TARGET_PAGE:
			if (resolve)
				return getTargetPage();
			return basicGetTargetPage();
		case SimpleWebsitePackage.LINK__TARGET_PARAGRAPH:
			if (resolve)
				return getTargetParagraph();
			return basicGetTargetParagraph();
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
		case SimpleWebsitePackage.LINK__TARGET_PAGE:
			setTargetPage((Page) newValue);
			return;
		case SimpleWebsitePackage.LINK__TARGET_PARAGRAPH:
			setTargetParagraph((Paragraph) newValue);
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
		case SimpleWebsitePackage.LINK__TARGET_PAGE:
			setTargetPage((Page) null);
			return;
		case SimpleWebsitePackage.LINK__TARGET_PARAGRAPH:
			setTargetParagraph((Paragraph) null);
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
		case SimpleWebsitePackage.LINK__TARGET_PAGE:
			return targetPage != null;
		case SimpleWebsitePackage.LINK__TARGET_PARAGRAPH:
			return targetParagraph != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
