/**
 */
package pje20.ville.ville.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pje20.ville.ville.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pje20.ville.ville.VillePackage
 * @generated
 */
public class VilleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VillePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VilleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VillePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VilleSwitch<Adapter> modelSwitch = new VilleSwitch<Adapter>() {
		@Override
		public Adapter caseVille(Ville object) {
			return createVilleAdapter();
		}

		@Override
		public Adapter caseHabitant(Habitant object) {
			return createHabitantAdapter();
		}

		@Override
		public Adapter caseRue(Rue object) {
			return createRueAdapter();
		}

		@Override
		public Adapter caseConstruction(Construction object) {
			return createConstructionAdapter();
		}

		@Override
		public Adapter caseMaison(Maison object) {
			return createMaisonAdapter();
		}

		@Override
		public Adapter caseImmeuble(Immeuble object) {
			return createImmeubleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link pje20.ville.ville.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pje20.ville.ville.Ville
	 * @generated
	 */
	public Adapter createVilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pje20.ville.ville.Habitant <em>Habitant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pje20.ville.ville.Habitant
	 * @generated
	 */
	public Adapter createHabitantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pje20.ville.ville.Rue <em>Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pje20.ville.ville.Rue
	 * @generated
	 */
	public Adapter createRueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pje20.ville.ville.Construction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pje20.ville.ville.Construction
	 * @generated
	 */
	public Adapter createConstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pje20.ville.ville.Maison <em>Maison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pje20.ville.ville.Maison
	 * @generated
	 */
	public Adapter createMaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pje20.ville.ville.Immeuble <em>Immeuble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pje20.ville.ville.Immeuble
	 * @generated
	 */
	public Adapter createImmeubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VilleAdapterFactory
