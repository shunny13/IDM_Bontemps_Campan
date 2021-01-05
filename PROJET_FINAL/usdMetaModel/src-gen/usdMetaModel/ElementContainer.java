/**
 */
package usdMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usdMetaModel.ElementContainer#getElement <em>Element</em>}</li>
 *   <li>{@link usdMetaModel.ElementContainer#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see usdMetaModel.UsdMetaModelPackage#getElementContainer()
 * @model
 * @generated
 */
public interface ElementContainer extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link usdMetaModel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see usdMetaModel.UsdMetaModelPackage#getElementContainer_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(int)
	 * @see usdMetaModel.UsdMetaModelPackage#getElementContainer_Grade()
	 * @model
	 * @generated
	 */
	int getGrade();

	/**
	 * Sets the value of the '{@link usdMetaModel.ElementContainer#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(int value);

} // ElementContainer
