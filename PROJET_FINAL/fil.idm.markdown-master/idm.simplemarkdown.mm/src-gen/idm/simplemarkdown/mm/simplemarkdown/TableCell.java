/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#isIsHeader <em>Is Header</em>}</li>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#getSpan <em>Span</em>}</li>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Header</em>' attribute.
	 * @see #setIsHeader(boolean)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTableCell_IsHeader()
	 * @model
	 * @generated
	 */
	boolean isIsHeader();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#isIsHeader <em>Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Header</em>' attribute.
	 * @see #isIsHeader()
	 * @generated
	 */
	void setIsHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(int)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTableCell_Span()
	 * @model default="1"
	 * @generated
	 */
	int getSpan();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(int value);

	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement
	 * @see #setAlignement(TableCellAlignement)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTableCell_Alignement()
	 * @model
	 * @generated
	 */
	TableCellAlignement getAlignement();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.TableCell#getAlignement <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement
	 * @see #getAlignement()
	 * @generated
	 */
	void setAlignement(TableCellAlignement value);

} // TableCell
