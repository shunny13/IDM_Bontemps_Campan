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
import simpleWebsite.Section;
import simpleWebsite.SimpleWebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleWebsite.impl.SectionImpl#getContentInsideSection <em>Content Inside Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ContentImpl implements Section {
	/**
	 * The cached value of the '{@link #getContentInsideSection() <em>Content Inside Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentInsideSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> contentInsideSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleWebsitePackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Content> getContentInsideSection() {
		if (contentInsideSection == null) {
			contentInsideSection = new EObjectContainmentEList<Content>(Content.class, this,
					SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION);
		}
		return contentInsideSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION:
			return ((InternalEList<?>) getContentInsideSection()).basicRemove(otherEnd, msgs);
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
		case SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION:
			return getContentInsideSection();
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
		case SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION:
			getContentInsideSection().clear();
			getContentInsideSection().addAll((Collection<? extends Content>) newValue);
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
		case SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION:
			getContentInsideSection().clear();
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
		case SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION:
			return contentInsideSection != null && !contentInsideSection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
