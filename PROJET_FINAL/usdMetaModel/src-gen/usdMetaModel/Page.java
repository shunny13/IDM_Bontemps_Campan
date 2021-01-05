/**
 */
package usdMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usdMetaModel.Page#getPageName <em>Page Name</em>}</li>
 *   <li>{@link usdMetaModel.Page#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see usdMetaModel.UsdMetaModelPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' attribute.
	 * @see #setPageName(String)
	 * @see usdMetaModel.UsdMetaModelPackage#getPage_PageName()
	 * @model
	 * @generated
	 */
	String getPageName();

	/**
	 * Sets the value of the '{@link usdMetaModel.Page#getPageName <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' attribute.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link usdMetaModel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see usdMetaModel.UsdMetaModelPackage#getPage_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

} // Page
