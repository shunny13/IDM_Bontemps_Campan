/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persons Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.annuaire.mm.annuaire.PersonsLibrary#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getPersonsLibrary()
 * @model
 * @generated
 */
public interface PersonsLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link idm.annuaire.mm.annuaire.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see idm.annuaire.mm.annuaire.AnnuairePackage#getPersonsLibrary_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // PersonsLibrary
