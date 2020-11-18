/**
 */
package idm.annuaire.mm.annuaire.impl;

import idm.annuaire.mm.annuaire.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnuaireFactoryImpl extends EFactoryImpl implements AnnuaireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnuaireFactory init() {
		try {
			AnnuaireFactory theAnnuaireFactory = (AnnuaireFactory) EPackage.Registry.INSTANCE
					.getEFactory(AnnuairePackage.eNS_URI);
			if (theAnnuaireFactory != null) {
				return theAnnuaireFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnuaireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnuaireFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AnnuairePackage.PERSON:
			return createPerson();
		case AnnuairePackage.ADDRESS:
			return createAddress();
		case AnnuairePackage.BUILDING:
			return createBuilding();
		case AnnuairePackage.PERSONS_LIBRARY:
			return createPersonsLibrary();
		case AnnuairePackage.BUILDING_LIBRARY:
			return createBuildingLibrary();
		case AnnuairePackage.LIBRARIES:
			return createLibraries();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonsLibrary createPersonsLibrary() {
		PersonsLibraryImpl personsLibrary = new PersonsLibraryImpl();
		return personsLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingLibrary createBuildingLibrary() {
		BuildingLibraryImpl buildingLibrary = new BuildingLibraryImpl();
		return buildingLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Libraries createLibraries() {
		LibrariesImpl libraries = new LibrariesImpl();
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnuairePackage getAnnuairePackage() {
		return (AnnuairePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnnuairePackage getPackage() {
		return AnnuairePackage.eINSTANCE;
	}

} //AnnuaireFactoryImpl
