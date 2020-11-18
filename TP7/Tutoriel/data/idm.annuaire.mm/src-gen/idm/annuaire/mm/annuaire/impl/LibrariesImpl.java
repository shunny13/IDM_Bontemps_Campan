/**
 */
package idm.annuaire.mm.annuaire.impl;

import idm.annuaire.mm.annuaire.AnnuairePackage;
import idm.annuaire.mm.annuaire.BuildingLibrary;
import idm.annuaire.mm.annuaire.Libraries;
import idm.annuaire.mm.annuaire.PersonsLibrary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Libraries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.annuaire.mm.annuaire.impl.LibrariesImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link idm.annuaire.mm.annuaire.impl.LibrariesImpl#getBuildings <em>Buildings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibrariesImpl extends MinimalEObjectImpl.Container implements Libraries {
	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected PersonsLibrary libraries;

	/**
	 * The cached value of the '{@link #getBuildings() <em>Buildings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildings()
	 * @generated
	 * @ordered
	 */
	protected BuildingLibrary buildings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibrariesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnuairePackage.Literals.LIBRARIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonsLibrary getLibraries() {
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraries(PersonsLibrary newLibraries, NotificationChain msgs) {
		PersonsLibrary oldLibraries = libraries;
		libraries = newLibraries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AnnuairePackage.LIBRARIES__LIBRARIES, oldLibraries, newLibraries);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraries(PersonsLibrary newLibraries) {
		if (newLibraries != libraries) {
			NotificationChain msgs = null;
			if (libraries != null)
				msgs = ((InternalEObject) libraries).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AnnuairePackage.LIBRARIES__LIBRARIES, null, msgs);
			if (newLibraries != null)
				msgs = ((InternalEObject) newLibraries).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnnuairePackage.LIBRARIES__LIBRARIES, null, msgs);
			msgs = basicSetLibraries(newLibraries, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnuairePackage.LIBRARIES__LIBRARIES, newLibraries,
					newLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingLibrary getBuildings() {
		return buildings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildings(BuildingLibrary newBuildings, NotificationChain msgs) {
		BuildingLibrary oldBuildings = buildings;
		buildings = newBuildings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AnnuairePackage.LIBRARIES__BUILDINGS, oldBuildings, newBuildings);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildings(BuildingLibrary newBuildings) {
		if (newBuildings != buildings) {
			NotificationChain msgs = null;
			if (buildings != null)
				msgs = ((InternalEObject) buildings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AnnuairePackage.LIBRARIES__BUILDINGS, null, msgs);
			if (newBuildings != null)
				msgs = ((InternalEObject) newBuildings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnnuairePackage.LIBRARIES__BUILDINGS, null, msgs);
			msgs = basicSetBuildings(newBuildings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnuairePackage.LIBRARIES__BUILDINGS, newBuildings,
					newBuildings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnnuairePackage.LIBRARIES__LIBRARIES:
			return basicSetLibraries(null, msgs);
		case AnnuairePackage.LIBRARIES__BUILDINGS:
			return basicSetBuildings(null, msgs);
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
		case AnnuairePackage.LIBRARIES__LIBRARIES:
			return getLibraries();
		case AnnuairePackage.LIBRARIES__BUILDINGS:
			return getBuildings();
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
		case AnnuairePackage.LIBRARIES__LIBRARIES:
			setLibraries((PersonsLibrary) newValue);
			return;
		case AnnuairePackage.LIBRARIES__BUILDINGS:
			setBuildings((BuildingLibrary) newValue);
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
		case AnnuairePackage.LIBRARIES__LIBRARIES:
			setLibraries((PersonsLibrary) null);
			return;
		case AnnuairePackage.LIBRARIES__BUILDINGS:
			setBuildings((BuildingLibrary) null);
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
		case AnnuairePackage.LIBRARIES__LIBRARIES:
			return libraries != null;
		case AnnuairePackage.LIBRARIES__BUILDINGS:
			return buildings != null;
		}
		return super.eIsSet(featureID);
	}

} //LibrariesImpl
