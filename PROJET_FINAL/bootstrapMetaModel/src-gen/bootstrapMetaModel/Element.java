/**
 */
package bootstrapMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrapMetaModel.Element#getId <em>Id</em>}</li>
 *   <li>{@link bootstrapMetaModel.Element#getMyclass <em>Myclass</em>}</li>
 * </ul>
 *
 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link bootstrapMetaModel.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Myclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Myclass</em>' attribute.
	 * @see #setMyclass(String)
	 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getElement_Myclass()
	 * @model
	 * @generated
	 */
	String getMyclass();

	/**
	 * Sets the value of the '{@link bootstrapMetaModel.Element#getMyclass <em>Myclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Myclass</em>' attribute.
	 * @see #getMyclass()
	 * @generated
	 */
	void setMyclass(String value);

} // Element
