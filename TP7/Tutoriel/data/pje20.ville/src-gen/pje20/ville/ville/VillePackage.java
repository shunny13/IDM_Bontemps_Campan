/**
 */
package pje20.ville.ville;

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
 * @see pje20.ville.ville.VilleFactory
 * @model kind="package"
 * @generated
 */
public interface VillePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ville";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ville";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ville";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VillePackage eINSTANCE = pje20.ville.ville.impl.VillePackageImpl.init();

	/**
	 * The meta object id for the '{@link pje20.ville.ville.impl.VilleImpl <em>Ville</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pje20.ville.ville.impl.VilleImpl
	 * @see pje20.ville.ville.impl.VillePackageImpl#getVille()
	 * @generated
	 */
	int VILLE = 0;

	/**
	 * The feature id for the '<em><b>Habitant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__HABITANT = 0;

	/**
	 * The feature id for the '<em><b>Rue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__RUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pje20.ville.ville.impl.HabitantImpl <em>Habitant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pje20.ville.ville.impl.HabitantImpl
	 * @see pje20.ville.ville.impl.VillePackageImpl#getHabitant()
	 * @generated
	 */
	int HABITANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Construction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITANT__CONSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Habitant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Habitant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pje20.ville.ville.impl.RueImpl <em>Rue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pje20.ville.ville.impl.RueImpl
	 * @see pje20.ville.ville.impl.VillePackageImpl#getRue()
	 * @generated
	 */
	int RUE = 2;

	/**
	 * The feature id for the '<em><b>Construction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUE__CONSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Rue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pje20.ville.ville.impl.ConstructionImpl <em>Construction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pje20.ville.ville.impl.ConstructionImpl
	 * @see pje20.ville.ville.impl.VillePackageImpl#getConstruction()
	 * @generated
	 */
	int CONSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Habitant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION__HABITANT = 1;

	/**
	 * The number of structural features of the '<em>Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pje20.ville.ville.impl.MaisonImpl <em>Maison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pje20.ville.ville.impl.MaisonImpl
	 * @see pje20.ville.ville.impl.VillePackageImpl#getMaison()
	 * @generated
	 */
	int MAISON = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON__NAME = CONSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Habitant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON__HABITANT = CONSTRUCTION__HABITANT;

	/**
	 * The number of structural features of the '<em>Maison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_FEATURE_COUNT = CONSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_OPERATION_COUNT = CONSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pje20.ville.ville.impl.ImmeubleImpl <em>Immeuble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pje20.ville.ville.impl.ImmeubleImpl
	 * @see pje20.ville.ville.impl.VillePackageImpl#getImmeuble()
	 * @generated
	 */
	int IMMEUBLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEUBLE__NAME = CONSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Habitant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEUBLE__HABITANT = CONSTRUCTION__HABITANT;

	/**
	 * The number of structural features of the '<em>Immeuble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEUBLE_FEATURE_COUNT = CONSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immeuble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEUBLE_OPERATION_COUNT = CONSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link pje20.ville.ville.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ville</em>'.
	 * @see pje20.ville.ville.Ville
	 * @generated
	 */
	EClass getVille();

	/**
	 * Returns the meta object for the containment reference list '{@link pje20.ville.ville.Ville#getHabitant <em>Habitant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Habitant</em>'.
	 * @see pje20.ville.ville.Ville#getHabitant()
	 * @see #getVille()
	 * @generated
	 */
	EReference getVille_Habitant();

	/**
	 * Returns the meta object for the containment reference list '{@link pje20.ville.ville.Ville#getRue <em>Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rue</em>'.
	 * @see pje20.ville.ville.Ville#getRue()
	 * @see #getVille()
	 * @generated
	 */
	EReference getVille_Rue();

	/**
	 * Returns the meta object for the attribute '{@link pje20.ville.ville.Ville#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pje20.ville.ville.Ville#getName()
	 * @see #getVille()
	 * @generated
	 */
	EAttribute getVille_Name();

	/**
	 * Returns the meta object for class '{@link pje20.ville.ville.Habitant <em>Habitant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Habitant</em>'.
	 * @see pje20.ville.ville.Habitant
	 * @generated
	 */
	EClass getHabitant();

	/**
	 * Returns the meta object for the attribute '{@link pje20.ville.ville.Habitant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pje20.ville.ville.Habitant#getName()
	 * @see #getHabitant()
	 * @generated
	 */
	EAttribute getHabitant_Name();

	/**
	 * Returns the meta object for the reference list '{@link pje20.ville.ville.Habitant#getConstruction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Construction</em>'.
	 * @see pje20.ville.ville.Habitant#getConstruction()
	 * @see #getHabitant()
	 * @generated
	 */
	EReference getHabitant_Construction();

	/**
	 * Returns the meta object for class '{@link pje20.ville.ville.Rue <em>Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rue</em>'.
	 * @see pje20.ville.ville.Rue
	 * @generated
	 */
	EClass getRue();

	/**
	 * Returns the meta object for the containment reference list '{@link pje20.ville.ville.Rue#getConstruction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Construction</em>'.
	 * @see pje20.ville.ville.Rue#getConstruction()
	 * @see #getRue()
	 * @generated
	 */
	EReference getRue_Construction();

	/**
	 * Returns the meta object for the attribute '{@link pje20.ville.ville.Rue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pje20.ville.ville.Rue#getName()
	 * @see #getRue()
	 * @generated
	 */
	EAttribute getRue_Name();

	/**
	 * Returns the meta object for class '{@link pje20.ville.ville.Construction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construction</em>'.
	 * @see pje20.ville.ville.Construction
	 * @generated
	 */
	EClass getConstruction();

	/**
	 * Returns the meta object for the attribute '{@link pje20.ville.ville.Construction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pje20.ville.ville.Construction#getName()
	 * @see #getConstruction()
	 * @generated
	 */
	EAttribute getConstruction_Name();

	/**
	 * Returns the meta object for the reference list '{@link pje20.ville.ville.Construction#getHabitant <em>Habitant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Habitant</em>'.
	 * @see pje20.ville.ville.Construction#getHabitant()
	 * @see #getConstruction()
	 * @generated
	 */
	EReference getConstruction_Habitant();

	/**
	 * Returns the meta object for class '{@link pje20.ville.ville.Maison <em>Maison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maison</em>'.
	 * @see pje20.ville.ville.Maison
	 * @generated
	 */
	EClass getMaison();

	/**
	 * Returns the meta object for class '{@link pje20.ville.ville.Immeuble <em>Immeuble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immeuble</em>'.
	 * @see pje20.ville.ville.Immeuble
	 * @generated
	 */
	EClass getImmeuble();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VilleFactory getVilleFactory();

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
		 * The meta object literal for the '{@link pje20.ville.ville.impl.VilleImpl <em>Ville</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pje20.ville.ville.impl.VilleImpl
		 * @see pje20.ville.ville.impl.VillePackageImpl#getVille()
		 * @generated
		 */
		EClass VILLE = eINSTANCE.getVille();

		/**
		 * The meta object literal for the '<em><b>Habitant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VILLE__HABITANT = eINSTANCE.getVille_Habitant();

		/**
		 * The meta object literal for the '<em><b>Rue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VILLE__RUE = eINSTANCE.getVille_Rue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VILLE__NAME = eINSTANCE.getVille_Name();

		/**
		 * The meta object literal for the '{@link pje20.ville.ville.impl.HabitantImpl <em>Habitant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pje20.ville.ville.impl.HabitantImpl
		 * @see pje20.ville.ville.impl.VillePackageImpl#getHabitant()
		 * @generated
		 */
		EClass HABITANT = eINSTANCE.getHabitant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HABITANT__NAME = eINSTANCE.getHabitant_Name();

		/**
		 * The meta object literal for the '<em><b>Construction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HABITANT__CONSTRUCTION = eINSTANCE.getHabitant_Construction();

		/**
		 * The meta object literal for the '{@link pje20.ville.ville.impl.RueImpl <em>Rue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pje20.ville.ville.impl.RueImpl
		 * @see pje20.ville.ville.impl.VillePackageImpl#getRue()
		 * @generated
		 */
		EClass RUE = eINSTANCE.getRue();

		/**
		 * The meta object literal for the '<em><b>Construction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUE__CONSTRUCTION = eINSTANCE.getRue_Construction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUE__NAME = eINSTANCE.getRue_Name();

		/**
		 * The meta object literal for the '{@link pje20.ville.ville.impl.ConstructionImpl <em>Construction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pje20.ville.ville.impl.ConstructionImpl
		 * @see pje20.ville.ville.impl.VillePackageImpl#getConstruction()
		 * @generated
		 */
		EClass CONSTRUCTION = eINSTANCE.getConstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTION__NAME = eINSTANCE.getConstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Habitant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTION__HABITANT = eINSTANCE.getConstruction_Habitant();

		/**
		 * The meta object literal for the '{@link pje20.ville.ville.impl.MaisonImpl <em>Maison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pje20.ville.ville.impl.MaisonImpl
		 * @see pje20.ville.ville.impl.VillePackageImpl#getMaison()
		 * @generated
		 */
		EClass MAISON = eINSTANCE.getMaison();

		/**
		 * The meta object literal for the '{@link pje20.ville.ville.impl.ImmeubleImpl <em>Immeuble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pje20.ville.ville.impl.ImmeubleImpl
		 * @see pje20.ville.ville.impl.VillePackageImpl#getImmeuble()
		 * @generated
		 */
		EClass IMMEUBLE = eINSTANCE.getImmeuble();

	}

} //VillePackage
