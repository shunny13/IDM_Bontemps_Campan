/**
 */
package usdMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url Based Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usdMetaModel.UrlBasedLink#getUrl <em>Url</em>}</li>
 *   <li>{@link usdMetaModel.UrlBasedLink#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see usdMetaModel.UsdMetaModelPackage#getUrlBasedLink()
 * @model abstract="true"
 * @generated
 */
public interface UrlBasedLink extends Element, CompositeTextElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see usdMetaModel.UsdMetaModelPackage#getUrlBasedLink_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link usdMetaModel.UrlBasedLink#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see usdMetaModel.UsdMetaModelPackage#getUrlBasedLink_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link usdMetaModel.UrlBasedLink#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // UrlBasedLink
