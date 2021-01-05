/**
 */
package usdMetaModel;

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
 *   <li>{@link usdMetaModel.CompositeTextElement#getSubtext <em>Subtext</em>}</li>
 * </ul>
 *
 * @see usdMetaModel.UsdMetaModelPackage#getCompositeTextElement()
 * @model abstract="true"
 * @generated
 */
public interface CompositeTextElement extends TextElement {
	/**
	 * Returns the value of the '<em><b>Subtext</b></em>' containment reference list.
	 * The list contents are of type {@link usdMetaModel.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtext</em>' containment reference list.
	 * @see usdMetaModel.UsdMetaModelPackage#getCompositeTextElement_Subtext()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getSubtext();

} // CompositeTextElement
