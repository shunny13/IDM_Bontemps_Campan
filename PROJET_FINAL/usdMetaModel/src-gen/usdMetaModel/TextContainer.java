/**
 */
package usdMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usdMetaModel.TextContainer#getTextelement <em>Textelement</em>}</li>
 * </ul>
 *
 * @see usdMetaModel.UsdMetaModelPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends Element {

	/**
	 * Returns the value of the '<em><b>Textelement</b></em>' containment reference list.
	 * The list contents are of type {@link usdMetaModel.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelement</em>' containment reference list.
	 * @see usdMetaModel.UsdMetaModelPackage#getTextContainer_Textelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextelement();
} // TextContainer
