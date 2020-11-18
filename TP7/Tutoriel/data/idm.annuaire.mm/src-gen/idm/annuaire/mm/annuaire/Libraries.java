/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.annuaire.mm.annuaire.Libraries#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link idm.annuaire.mm.annuaire.Libraries#getBuildings <em>Buildings</em>}</li>
 * </ul>
 *
 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getLibraries()
 * @model
 * @generated
 */
public interface Libraries extends EObject {
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference.
	 * @see #setLibraries(PersonsLibrary)
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getLibraries_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	PersonsLibrary getLibraries();

	/**
	 * Sets the value of the '{@link idm.annuaire.mm.annuaire.Libraries#getLibraries <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraries</em>' containment reference.
	 * @see #getLibraries()
	 * @generated
	 */
	void setLibraries(PersonsLibrary value);

	/**
	 * Returns the value of the '<em><b>Buildings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildings</em>' containment reference.
	 * @see #setBuildings(BuildingLibrary)
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getLibraries_Buildings()
	 * @model containment="true"
	 * @generated
	 */
	BuildingLibrary getBuildings();

	/**
	 * Sets the value of the '{@link idm.annuaire.mm.annuaire.Libraries#getBuildings <em>Buildings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buildings</em>' containment reference.
	 * @see #getBuildings()
	 * @generated
	 */
	void setBuildings(BuildingLibrary value);

} // Libraries
