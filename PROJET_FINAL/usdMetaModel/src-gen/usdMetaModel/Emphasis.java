/**
 */
package usdMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emphasis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usdMetaModel.Emphasis#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see usdMetaModel.UsdMetaModelPackage#getEmphasis()
 * @model
 * @generated
 */
public interface Emphasis extends CompositeTextElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see usdMetaModel.UsdMetaModelPackage#getEmphasis_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link usdMetaModel.Emphasis#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Emphasis
