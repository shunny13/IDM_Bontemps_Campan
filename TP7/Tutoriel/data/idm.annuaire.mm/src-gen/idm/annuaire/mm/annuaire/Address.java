/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.annuaire.mm.annuaire.Address#getTown <em>Town</em>}</li>
 *   <li>{@link idm.annuaire.mm.annuaire.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link idm.annuaire.mm.annuaire.Address#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Town</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Town</em>' attribute.
	 * @see #setTown(String)
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getAddress_Town()
	 * @model
	 * @generated
	 */
	String getTown();

	/**
	 * Sets the value of the '{@link idm.annuaire.mm.annuaire.Address#getTown <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town</em>' attribute.
	 * @see #getTown()
	 * @generated
	 */
	void setTown(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getAddress_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link idm.annuaire.mm.annuaire.Address#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getAddress_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link idm.annuaire.mm.annuaire.Address#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Address
