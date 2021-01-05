/**
 */
package simpleWebsite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleWebsite.Content;
import simpleWebsite.Div;
import simpleWebsite.SimpleWebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleWebsite.impl.DivImpl#getContentInsideDiv <em>Content Inside Div</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivImpl extends ContentImpl implements Div {
	/**
	 * The cached value of the '{@link #getContentInsideDiv() <em>Content Inside Div</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentInsideDiv()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> contentInsideDiv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleWebsitePackage.Literals.DIV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Content> getContentInsideDiv() {
		if (contentInsideDiv == null) {
			contentInsideDiv = new EObjectContainmentEList<Content>(Content.class, this,
					SimpleWebsitePackage.DIV__CONTENT_INSIDE_DIV);
		}
		return contentInsideDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleWebsitePackage.DIV__CONTENT_INSIDE_DIV:
			return ((InternalEList<?>) getContentInsideDiv()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleWebsitePackage.DIV__CONTENT_INSIDE_DIV:
			return getContentInsideDiv();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleWebsitePackage.DIV__CONTENT_INSIDE_DIV:
			getContentInsideDiv().clear();
			getContentInsideDiv().addAll((Collection<? extends Content>) newValue);
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
		case SimpleWebsitePackage.DIV__CONTENT_INSIDE_DIV:
			getContentInsideDiv().clear();
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
		case SimpleWebsitePackage.DIV__CONTENT_INSIDE_DIV:
			return contentInsideDiv != null && !contentInsideDiv.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DivImpl
