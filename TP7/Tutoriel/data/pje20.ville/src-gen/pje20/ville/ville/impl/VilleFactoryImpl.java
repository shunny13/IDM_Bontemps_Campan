/**
 */
package pje20.ville.ville.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pje20.ville.ville.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VilleFactoryImpl extends EFactoryImpl implements VilleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VilleFactory init() {
		try {
			VilleFactory theVilleFactory = (VilleFactory) EPackage.Registry.INSTANCE.getEFactory(VillePackage.eNS_URI);
			if (theVilleFactory != null) {
				return theVilleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VilleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VilleFactoryImpl() {
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
		case VillePackage.VILLE:
			return createVille();
		case VillePackage.HABITANT:
			return createHabitant();
		case VillePackage.RUE:
			return createRue();
		case VillePackage.MAISON:
			return createMaison();
		case VillePackage.IMMEUBLE:
			return createImmeuble();
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
	public Ville createVille() {
		VilleImpl ville = new VilleImpl();
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Habitant createHabitant() {
		HabitantImpl habitant = new HabitantImpl();
		return habitant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rue createRue() {
		RueImpl rue = new RueImpl();
		return rue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Maison createMaison() {
		MaisonImpl maison = new MaisonImpl();
		return maison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Immeuble createImmeuble() {
		ImmeubleImpl immeuble = new ImmeubleImpl();
		return immeuble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VillePackage getVillePackage() {
		return (VillePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VillePackage getPackage() {
		return VillePackage.eINSTANCE;
	}

} //VilleFactoryImpl
