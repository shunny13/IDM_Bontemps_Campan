/**
 */
package pje20.ville.ville;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pje20.ville.ville.Rue#getConstruction <em>Construction</em>}</li>
 *   <li>{@link pje20.ville.ville.Rue#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pje20.ville.ville.VillePackage#getRue()
 * @model
 * @generated
 */
public interface Rue extends EObject {
	/**
	 * Returns the value of the '<em><b>Construction</b></em>' containment reference list.
	 * The list contents are of type {@link pje20.ville.ville.Construction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction</em>' containment reference list.
	 * @see pje20.ville.ville.VillePackage#getRue_Construction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Construction> getConstruction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pje20.ville.ville.VillePackage#getRue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pje20.ville.ville.Rue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Rue
