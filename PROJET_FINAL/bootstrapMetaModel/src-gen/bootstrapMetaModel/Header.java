/**
 */
package bootstrapMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrapMetaModel.Header#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(int)
	 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getHeader_Grade()
	 * @model
	 * @generated
	 */
	int getGrade();

	/**
	 * Sets the value of the '{@link bootstrapMetaModel.Header#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(int value);

} // Header
