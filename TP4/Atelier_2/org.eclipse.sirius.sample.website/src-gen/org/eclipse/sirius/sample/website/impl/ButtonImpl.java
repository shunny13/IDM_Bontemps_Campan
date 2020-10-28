/**
 */
package org.eclipse.sirius.sample.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.sample.website.Button;
import org.eclipse.sirius.sample.website.Page;
import org.eclipse.sirius.sample.website.Paragraph;
import org.eclipse.sirius.sample.website.Website;
import org.eclipse.sirius.sample.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.ButtonImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.ButtonImpl#getTargetParagraph <em>Target Paragraph</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.ButtonImpl#getTargetExternalWebsite <em>Target External Website</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends ContentImpl implements Button {
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
	 * The cached value of the '{@link #getTargetExternalWebsite() <em>Target External Website</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetExternalWebsite()
	 * @generated
	 * @ordered
	 */
	protected Website targetExternalWebsite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject) targetPage;
			targetPage = (Page) eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.BUTTON__TARGET_PAGE,
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
	public void setTargetPage(Page newTargetPage) {
		Page oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.BUTTON__TARGET_PAGE, oldTargetPage,
					targetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getTargetParagraph() {
		if (targetParagraph != null && targetParagraph.eIsProxy()) {
			InternalEObject oldTargetParagraph = (InternalEObject) targetParagraph;
			targetParagraph = (Paragraph) eResolveProxy(oldTargetParagraph);
			if (targetParagraph != oldTargetParagraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.BUTTON__TARGET_PARAGRAPH,
							oldTargetParagraph, targetParagraph));
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
	public void setTargetParagraph(Paragraph newTargetParagraph) {
		Paragraph oldTargetParagraph = targetParagraph;
		targetParagraph = newTargetParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.BUTTON__TARGET_PARAGRAPH,
					oldTargetParagraph, targetParagraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website getTargetExternalWebsite() {
		if (targetExternalWebsite != null && targetExternalWebsite.eIsProxy()) {
			InternalEObject oldTargetExternalWebsite = (InternalEObject) targetExternalWebsite;
			targetExternalWebsite = (Website) eResolveProxy(oldTargetExternalWebsite);
			if (targetExternalWebsite != oldTargetExternalWebsite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WebsitePackage.BUTTON__TARGET_EXTERNAL_WEBSITE, oldTargetExternalWebsite,
							targetExternalWebsite));
			}
		}
		return targetExternalWebsite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website basicGetTargetExternalWebsite() {
		return targetExternalWebsite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetExternalWebsite(Website newTargetExternalWebsite) {
		Website oldTargetExternalWebsite = targetExternalWebsite;
		targetExternalWebsite = newTargetExternalWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.BUTTON__TARGET_EXTERNAL_WEBSITE,
					oldTargetExternalWebsite, targetExternalWebsite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebsitePackage.BUTTON__TARGET_PAGE:
			if (resolve)
				return getTargetPage();
			return basicGetTargetPage();
		case WebsitePackage.BUTTON__TARGET_PARAGRAPH:
			if (resolve)
				return getTargetParagraph();
			return basicGetTargetParagraph();
		case WebsitePackage.BUTTON__TARGET_EXTERNAL_WEBSITE:
			if (resolve)
				return getTargetExternalWebsite();
			return basicGetTargetExternalWebsite();
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
		case WebsitePackage.BUTTON__TARGET_PAGE:
			setTargetPage((Page) newValue);
			return;
		case WebsitePackage.BUTTON__TARGET_PARAGRAPH:
			setTargetParagraph((Paragraph) newValue);
			return;
		case WebsitePackage.BUTTON__TARGET_EXTERNAL_WEBSITE:
			setTargetExternalWebsite((Website) newValue);
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
		case WebsitePackage.BUTTON__TARGET_PAGE:
			setTargetPage((Page) null);
			return;
		case WebsitePackage.BUTTON__TARGET_PARAGRAPH:
			setTargetParagraph((Paragraph) null);
			return;
		case WebsitePackage.BUTTON__TARGET_EXTERNAL_WEBSITE:
			setTargetExternalWebsite((Website) null);
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
		case WebsitePackage.BUTTON__TARGET_PAGE:
			return targetPage != null;
		case WebsitePackage.BUTTON__TARGET_PARAGRAPH:
			return targetParagraph != null;
		case WebsitePackage.BUTTON__TARGET_EXTERNAL_WEBSITE:
			return targetExternalWebsite != null;
		}
		return super.eIsSet(featureID);
	}

} //ButtonImpl
