/**
 */
package bootstrapMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrapMetaModel.CompositeTextElement#getSubtext <em>Subtext</em>}</li>
 * </ul>
 *
 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getCompositeTextElement()
 * @model abstract="true"
 * @generated
 */
public interface CompositeTextElement extends TextElement {
	/**
	 * Returns the value of the '<em><b>Subtext</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrapMetaModel.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtext</em>' containment reference list.
	 * @see bootstrapMetaModel.BootstrapMetaModelPackage#getCompositeTextElement_Subtext()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getSubtext();

} // CompositeTextElement
