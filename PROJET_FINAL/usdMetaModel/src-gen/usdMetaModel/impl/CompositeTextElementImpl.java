/**
 */
package usdMetaModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import usdMetaModel.CompositeTextElement;
import usdMetaModel.TextElement;
import usdMetaModel.UsdMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Text Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usdMetaModel.impl.CompositeTextElementImpl#getSubtext <em>Subtext</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompositeTextElementImpl extends TextElementImpl implements CompositeTextElement {
	/**
	 * The cached value of the '{@link #getSubtext() <em>Subtext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtext()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElement> subtext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTextElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextElement> getSubtext() {
		if (subtext == null) {
			subtext = new EObjectContainmentEList<TextElement>(TextElement.class, this,
					UsdMetaModelPackage.COMPOSITE_TEXT_ELEMENT__SUBTEXT);
		}
		return subtext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdMetaModelPackage.COMPOSITE_TEXT_ELEMENT__SUBTEXT:
			return ((InternalEList<?>) getSubtext()).basicRemove(otherEnd, msgs);
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
		case UsdMetaModelPackage.COMPOSITE_TEXT_ELEMENT__SUBTEXT:
			return getSubtext();
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
		case UsdMetaModelPackage.COMPOSITE_TEXT_ELEMENT__SUBTEXT:
			getSubtext().clear();
			getSubtext().addAll((Collection<? extends TextElement>) newValue);
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
		case UsdMetaModelPackage.COMPOSITE_TEXT_ELEMENT__SUBTEXT:
			getSubtext().clear();
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
		case UsdMetaModelPackage.COMPOSITE_TEXT_ELEMENT__SUBTEXT:
			return subtext != null && !subtext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeTextElementImpl
