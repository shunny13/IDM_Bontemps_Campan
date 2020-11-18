/**
 */
package pje20.ville.ville.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pje20.ville.ville.Habitant;
import pje20.ville.ville.Rue;
import pje20.ville.ville.Ville;
import pje20.ville.ville.VillePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pje20.ville.ville.impl.VilleImpl#getHabitant <em>Habitant</em>}</li>
 *   <li>{@link pje20.ville.ville.impl.VilleImpl#getRue <em>Rue</em>}</li>
 *   <li>{@link pje20.ville.ville.impl.VilleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VilleImpl extends MinimalEObjectImpl.Container implements Ville {
	/**
	 * The cached value of the '{@link #getHabitant() <em>Habitant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHabitant()
	 * @generated
	 * @ordered
	 */
	protected EList<Habitant> habitant;

	/**
	 * The cached value of the '{@link #getRue() <em>Rue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRue()
	 * @generated
	 * @ordered
	 */
	protected EList<Rue> rue;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VilleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VillePackage.Literals.VILLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Habitant> getHabitant() {
		if (habitant == null) {
			habitant = new EObjectContainmentEList<Habitant>(Habitant.class, this, VillePackage.VILLE__HABITANT);
		}
		return habitant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rue> getRue() {
		if (rue == null) {
			rue = new EObjectContainmentEList<Rue>(Rue.class, this, VillePackage.VILLE__RUE);
		}
		return rue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VillePackage.VILLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VillePackage.VILLE__HABITANT:
			return ((InternalEList<?>) getHabitant()).basicRemove(otherEnd, msgs);
		case VillePackage.VILLE__RUE:
			return ((InternalEList<?>) getRue()).basicRemove(otherEnd, msgs);
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
		case VillePackage.VILLE__HABITANT:
			return getHabitant();
		case VillePackage.VILLE__RUE:
			return getRue();
		case VillePackage.VILLE__NAME:
			return getName();
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
		case VillePackage.VILLE__HABITANT:
			getHabitant().clear();
			getHabitant().addAll((Collection<? extends Habitant>) newValue);
			return;
		case VillePackage.VILLE__RUE:
			getRue().clear();
			getRue().addAll((Collection<? extends Rue>) newValue);
			return;
		case VillePackage.VILLE__NAME:
			setName((String) newValue);
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
		case VillePackage.VILLE__HABITANT:
			getHabitant().clear();
			return;
		case VillePackage.VILLE__RUE:
			getRue().clear();
			return;
		case VillePackage.VILLE__NAME:
			setName(NAME_EDEFAULT);
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
		case VillePackage.VILLE__HABITANT:
			return habitant != null && !habitant.isEmpty();
		case VillePackage.VILLE__RUE:
			return rue != null && !rue.isEmpty();
		case VillePackage.VILLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VilleImpl
