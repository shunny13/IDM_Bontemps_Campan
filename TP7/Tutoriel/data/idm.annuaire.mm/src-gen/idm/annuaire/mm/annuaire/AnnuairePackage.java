/**
 */
package idm.annuaire.mm.annuaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see idm.annuaire.mm.annuaire.AnnuaireFactory
 * @model kind="package"
 * @generated
 */
public interface AnnuairePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annuaire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/annuaire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annuaire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnuairePackage eINSTANCE = idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.annuaire.mm.annuaire.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.annuaire.mm.annuaire.impl.PersonImpl
	 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESSES = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.annuaire.mm.annuaire.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.annuaire.mm.annuaire.impl.AddressImpl
	 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Town</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TOWN = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.annuaire.mm.annuaire.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.annuaire.mm.annuaire.impl.BuildingImpl
	 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 2;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ADDRESSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = 1;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.annuaire.mm.annuaire.impl.PersonsLibraryImpl <em>Persons Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.annuaire.mm.annuaire.impl.PersonsLibraryImpl
	 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getPersonsLibrary()
	 * @generated
	 */
	int PERSONS_LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_LIBRARY__PERSONS = 0;

	/**
	 * The number of structural features of the '<em>Persons Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Persons Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.annuaire.mm.annuaire.impl.BuildingLibraryImpl <em>Building Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.annuaire.mm.annuaire.impl.BuildingLibraryImpl
	 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getBuildingLibrary()
	 * @generated
	 */
	int BUILDING_LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_LIBRARY__BUILDINGS = 0;

	/**
	 * The number of structural features of the '<em>Building Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Building Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.annuaire.mm.annuaire.impl.LibrariesImpl <em>Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.annuaire.mm.annuaire.impl.LibrariesImpl
	 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getLibraries()
	 * @generated
	 */
	int LIBRARIES = 5;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES__LIBRARIES = 0;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES__BUILDINGS = 1;

	/**
	 * The number of structural features of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link idm.annuaire.mm.annuaire.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see idm.annuaire.mm.annuaire.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link idm.annuaire.mm.annuaire.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.annuaire.mm.annuaire.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.annuaire.mm.annuaire.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see idm.annuaire.mm.annuaire.Person#getAddresses()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Addresses();

	/**
	 * Returns the meta object for class '{@link idm.annuaire.mm.annuaire.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see idm.annuaire.mm.annuaire.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link idm.annuaire.mm.annuaire.Address#getTown <em>Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Town</em>'.
	 * @see idm.annuaire.mm.annuaire.Address#getTown()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Town();

	/**
	 * Returns the meta object for the attribute '{@link idm.annuaire.mm.annuaire.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see idm.annuaire.mm.annuaire.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link idm.annuaire.mm.annuaire.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see idm.annuaire.mm.annuaire.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Type();

	/**
	 * Returns the meta object for class '{@link idm.annuaire.mm.annuaire.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see idm.annuaire.mm.annuaire.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.annuaire.mm.annuaire.Building#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see idm.annuaire.mm.annuaire.Building#getAddresses()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link idm.annuaire.mm.annuaire.Building#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.annuaire.mm.annuaire.Building#getName()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Name();

	/**
	 * Returns the meta object for class '{@link idm.annuaire.mm.annuaire.PersonsLibrary <em>Persons Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persons Library</em>'.
	 * @see idm.annuaire.mm.annuaire.PersonsLibrary
	 * @generated
	 */
	EClass getPersonsLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.annuaire.mm.annuaire.PersonsLibrary#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see idm.annuaire.mm.annuaire.PersonsLibrary#getPersons()
	 * @see #getPersonsLibrary()
	 * @generated
	 */
	EReference getPersonsLibrary_Persons();

	/**
	 * Returns the meta object for class '{@link idm.annuaire.mm.annuaire.BuildingLibrary <em>Building Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Library</em>'.
	 * @see idm.annuaire.mm.annuaire.BuildingLibrary
	 * @generated
	 */
	EClass getBuildingLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.annuaire.mm.annuaire.BuildingLibrary#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see idm.annuaire.mm.annuaire.BuildingLibrary#getBuildings()
	 * @see #getBuildingLibrary()
	 * @generated
	 */
	EReference getBuildingLibrary_Buildings();

	/**
	 * Returns the meta object for class '{@link idm.annuaire.mm.annuaire.Libraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libraries</em>'.
	 * @see idm.annuaire.mm.annuaire.Libraries
	 * @generated
	 */
	EClass getLibraries();

	/**
	 * Returns the meta object for the containment reference '{@link idm.annuaire.mm.annuaire.Libraries#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Libraries</em>'.
	 * @see idm.annuaire.mm.annuaire.Libraries#getLibraries()
	 * @see #getLibraries()
	 * @generated
	 */
	EReference getLibraries_Libraries();

	/**
	 * Returns the meta object for the containment reference '{@link idm.annuaire.mm.annuaire.Libraries#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buildings</em>'.
	 * @see idm.annuaire.mm.annuaire.Libraries#getBuildings()
	 * @see #getLibraries()
	 * @generated
	 */
	EReference getLibraries_Buildings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnuaireFactory getAnnuaireFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link idm.annuaire.mm.annuaire.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.annuaire.mm.annuaire.impl.PersonImpl
		 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

		/**
		 * The meta object literal for the '{@link idm.annuaire.mm.annuaire.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.annuaire.mm.annuaire.impl.AddressImpl
		 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Town</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TOWN = eINSTANCE.getAddress_Town();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '{@link idm.annuaire.mm.annuaire.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.annuaire.mm.annuaire.impl.BuildingImpl
		 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__ADDRESSES = eINSTANCE.getBuilding_Addresses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__NAME = eINSTANCE.getBuilding_Name();

		/**
		 * The meta object literal for the '{@link idm.annuaire.mm.annuaire.impl.PersonsLibraryImpl <em>Persons Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.annuaire.mm.annuaire.impl.PersonsLibraryImpl
		 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getPersonsLibrary()
		 * @generated
		 */
		EClass PERSONS_LIBRARY = eINSTANCE.getPersonsLibrary();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONS_LIBRARY__PERSONS = eINSTANCE.getPersonsLibrary_Persons();

		/**
		 * The meta object literal for the '{@link idm.annuaire.mm.annuaire.impl.BuildingLibraryImpl <em>Building Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.annuaire.mm.annuaire.impl.BuildingLibraryImpl
		 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getBuildingLibrary()
		 * @generated
		 */
		EClass BUILDING_LIBRARY = eINSTANCE.getBuildingLibrary();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_LIBRARY__BUILDINGS = eINSTANCE.getBuildingLibrary_Buildings();

		/**
		 * The meta object literal for the '{@link idm.annuaire.mm.annuaire.impl.LibrariesImpl <em>Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.annuaire.mm.annuaire.impl.LibrariesImpl
		 * @see idm.annuaire.mm.annuaire.impl.AnnuairePackageImpl#getLibraries()
		 * @generated
		 */
		EClass LIBRARIES = eINSTANCE.getLibraries();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARIES__LIBRARIES = eINSTANCE.getLibraries_Libraries();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARIES__BUILDINGS = eINSTANCE.getLibraries_Buildings();

	}

} //AnnuairePackage
