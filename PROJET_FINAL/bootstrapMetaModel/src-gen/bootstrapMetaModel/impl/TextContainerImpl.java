/**
 */
package bootstrapMetaModel.impl;

import bootstrapMetaModel.BootstrapMetaModelPackage;
import bootstrapMetaModel.TextContainer;
import bootstrapMetaModel.TextElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bootstrapMetaModel.impl.TextContainerImpl#getTextelement <em>Textelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextContainerImpl extends ElementImpl implements TextContainer {
	/**
	 * The cached value of the '{@link #getTextelement() <em>Textelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextelement()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElement> textelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapMetaModelPackage.Literals.TEXT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextElement> getTextelement() {
		if (textelement == null) {
			textelement = new EObjectContainmentEList<TextElement>(TextElement.class, this,
					BootstrapMetaModelPackage.TEXT_CONTAINER__TEXTELEMENT);
		}
		return textelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BootstrapMetaModelPackage.TEXT_CONTAINER__TEXTELEMENT:
			return ((InternalEList<?>) getTextelement()).basicRemove(otherEnd, msgs);
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
		case BootstrapMetaModelPackage.TEXT_CONTAINER__TEXTELEMENT:
			return getTextelement();
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
		case BootstrapMetaModelPackage.TEXT_CONTAINER__TEXTELEMENT:
			getTextelement().clear();
			getTextelement().addAll((Collection<? extends TextElement>) newValue);
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
		case BootstrapMetaModelPackage.TEXT_CONTAINER__TEXTELEMENT:
			getTextelement().clear();
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
		case BootstrapMetaModelPackage.TEXT_CONTAINER__TEXTELEMENT:
			return textelement != null && !textelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextContainerImpl
