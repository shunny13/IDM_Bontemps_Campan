/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link With Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.LinkWithRef#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getLinkWithRef()
 * @model
 * @generated
 */
public interface LinkWithRef extends CompositeTextElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getLinkWithRef_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.LinkWithRef#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // LinkWithRef
