/**
 */
package pje20.ville.ville;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Habitant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pje20.ville.ville.Habitant#getName <em>Name</em>}</li>
 *   <li>{@link pje20.ville.ville.Habitant#getConstruction <em>Construction</em>}</li>
 * </ul>
 *
 * @see pje20.ville.ville.VillePackage#getHabitant()
 * @model
 * @generated
 */
public interface Habitant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pje20.ville.ville.VillePackage#getHabitant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pje20.ville.ville.Habitant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Construction</b></em>' reference list.
	 * The list contents are of type {@link pje20.ville.ville.Construction}.
	 * It is bidirectional and its opposite is '{@link pje20.ville.ville.Construction#getHabitant <em>Habitant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction</em>' reference list.
	 * @see pje20.ville.ville.VillePackage#getHabitant_Construction()
	 * @see pje20.ville.ville.Construction#getHabitant
	 * @model opposite="habitant"
	 * @generated
	 */
	EList<Construction> getConstruction();

} // Habitant
