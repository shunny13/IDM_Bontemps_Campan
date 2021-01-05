/**
 */
package idm.simplemarkdown.mm.simplemarkdown.impl;

import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage;
import idm.simplemarkdown.mm.simplemarkdown.TableCell;
import idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl#isIsHeader <em>Is Header</em>}</li>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableCellImpl#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends TextContainerImpl implements TableCell {
	/**
	 * The default value of the '{@link #isIsHeader() <em>Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHeader() <em>Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean isHeader = IS_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected int span = SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected static final TableCellAlignement ALIGNEMENT_EDEFAULT = TableCellAlignement.LEFT;

	/**
	 * The cached value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected TableCellAlignement alignement = ALIGNEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemarkdownPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsHeader() {
		return isHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsHeader(boolean newIsHeader) {
		boolean oldIsHeader = isHeader;
		isHeader = newIsHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemarkdownPackage.TABLE_CELL__IS_HEADER,
					oldIsHeader, isHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpan(int newSpan) {
		int oldSpan = span;
		span = newSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemarkdownPackage.TABLE_CELL__SPAN, oldSpan,
					span));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCellAlignement getAlignement() {
		return alignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignement(TableCellAlignement newAlignement) {
		TableCellAlignement oldAlignement = alignement;
		alignement = newAlignement == null ? ALIGNEMENT_EDEFAULT : newAlignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemarkdownPackage.TABLE_CELL__ALIGNEMENT,
					oldAlignement, alignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_CELL__IS_HEADER:
			return isIsHeader();
		case SimplemarkdownPackage.TABLE_CELL__SPAN:
			return getSpan();
		case SimplemarkdownPackage.TABLE_CELL__ALIGNEMENT:
			return getAlignement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_CELL__IS_HEADER:
			setIsHeader((Boolean) newValue);
			return;
		case SimplemarkdownPackage.TABLE_CELL__SPAN:
			setSpan((Integer) newValue);
			return;
		case SimplemarkdownPackage.TABLE_CELL__ALIGNEMENT:
			setAlignement((TableCellAlignement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_CELL__IS_HEADER:
			setIsHeader(IS_HEADER_EDEFAULT);
			return;
		case SimplemarkdownPackage.TABLE_CELL__SPAN:
			setSpan(SPAN_EDEFAULT);
			return;
		case SimplemarkdownPackage.TABLE_CELL__ALIGNEMENT:
			setAlignement(ALIGNEMENT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_CELL__IS_HEADER:
			return isHeader != IS_HEADER_EDEFAULT;
		case SimplemarkdownPackage.TABLE_CELL__SPAN:
			return span != SPAN_EDEFAULT;
		case SimplemarkdownPackage.TABLE_CELL__ALIGNEMENT:
			return alignement != ALIGNEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isHeader: ");
		result.append(isHeader);
		result.append(", span: ");
		result.append(span);
		result.append(", alignement: ");
		result.append(alignement);
		result.append(')');
		return result.toString();
	}

} //TableCellImpl
