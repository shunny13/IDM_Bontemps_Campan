/**
 */
package pje20.ville.ville;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pje20.ville.ville.Ville#getHabitant <em>Habitant</em>}</li>
 *   <li>{@link pje20.ville.ville.Ville#getRue <em>Rue</em>}</li>
 *   <li>{@link pje20.ville.ville.Ville#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pje20.ville.ville.VillePackage#getVille()
 * @model
 * @generated
 */
public interface Ville extends EObject {
	/**
	 * Returns the value of the '<em><b>Habitant</b></em>' containment reference list.
	 * The list contents are of type {@link pje20.ville.ville.Habitant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Habitant</em>' containment reference list.
	 * @see pje20.ville.ville.VillePackage#getVille_Habitant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Habitant> getHabitant();

	/**
	 * Returns the value of the '<em><b>Rue</b></em>' containment reference list.
	 * The list contents are of type {@link pje20.ville.ville.Rue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rue</em>' containment reference list.
	 * @see pje20.ville.ville.VillePackage#getVille_Rue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rue> getRue();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pje20.ville.ville.VillePackage#getVille_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pje20.ville.ville.Ville#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Ville
