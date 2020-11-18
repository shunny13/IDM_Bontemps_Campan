/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.annuaire.mm.annuaire.Building#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link idm.annuaire.mm.annuaire.Building#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends EObject {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link idm.annuaire.mm.annuaire.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getBuilding_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getBuilding_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.annuaire.mm.annuaire.Building#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Building
