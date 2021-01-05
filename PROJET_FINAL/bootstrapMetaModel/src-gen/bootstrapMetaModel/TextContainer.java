/**
 */
package bootstrapMetaModel;

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
 *   <li>{@link bootstrapMetaModel.TextContainer#getTextelement <em>Textelement</em>}</li>
 * </ul>
 *
 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends Element {
	/**
	 * Returns the value of the '<em><b>Textelement</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrapMetaModel.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelement</em>' containment reference list.
	 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getTextContainer_Textelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextelement();

} // TextContainer
