/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see idm.annuaire.mm.annuaire.AnnuairePackage
 * @generated
 */
public interface AnnuaireFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnuaireFactory eINSTANCE = idm.annuaire.mm.annuaire.impl.AnnuaireFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building</em>'.
	 * @generated
	 */
	Building createBuilding();

	/**
	 * Returns a new object of class '<em>Persons Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persons Library</em>'.
	 * @generated
	 */
	PersonsLibrary createPersonsLibrary();

	/**
	 * Returns a new object of class '<em>Building Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building Library</em>'.
	 * @generated
	 */
	BuildingLibrary createBuildingLibrary();

	/**
	 * Returns a new object of class '<em>Libraries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Libraries</em>'.
	 * @generated
	 */
	Libraries createLibraries();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnuairePackage getAnnuairePackage();

} //AnnuaireFactory
