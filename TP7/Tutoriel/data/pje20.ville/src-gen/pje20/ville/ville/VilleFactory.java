/**
 */
package pje20.ville.ville;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pje20.ville.ville.VillePackage
 * @generated
 */
public interface VilleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VilleFactory eINSTANCE = pje20.ville.ville.impl.VilleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ville</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ville</em>'.
	 * @generated
	 */
	Ville createVille();

	/**
	 * Returns a new object of class '<em>Habitant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Habitant</em>'.
	 * @generated
	 */
	Habitant createHabitant();

	/**
	 * Returns a new object of class '<em>Rue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rue</em>'.
	 * @generated
	 */
	Rue createRue();

	/**
	 * Returns a new object of class '<em>Maison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maison</em>'.
	 * @generated
	 */
	Maison createMaison();

	/**
	 * Returns a new object of class '<em>Immeuble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immeuble</em>'.
	 * @generated
	 */
	Immeuble createImmeuble();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VillePackage getVillePackage();

} //VilleFactory
