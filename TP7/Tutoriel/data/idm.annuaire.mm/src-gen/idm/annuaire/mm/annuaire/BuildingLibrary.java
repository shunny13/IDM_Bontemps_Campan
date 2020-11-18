/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.annuaire.mm.annuaire.BuildingLibrary#getBuildings <em>Buildings</em>}</li>
 * </ul>
 *
 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getBuildingLibrary()
 * @model
 * @generated
 */
public interface BuildingLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Buildings</b></em>' containment reference list.
	 * The list contents are of type {@link idm.annuaire.mm.annuaire.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildings</em>' containment reference list.
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getBuildingLibrary_Buildings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Building> getBuildings();

} // BuildingLibrary
