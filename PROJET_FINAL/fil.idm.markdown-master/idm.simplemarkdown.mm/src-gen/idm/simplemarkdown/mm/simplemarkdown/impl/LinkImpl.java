/**
 */
package idm.simplemarkdown.mm.simplemarkdown.impl;

import idm.simplemarkdown.mm.simplemarkdown.Link;
import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LinkImpl extends UrlBasedLinkImpl implements Link {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemarkdownPackage.Literals.LINK;
	}

} //LinkImpl
