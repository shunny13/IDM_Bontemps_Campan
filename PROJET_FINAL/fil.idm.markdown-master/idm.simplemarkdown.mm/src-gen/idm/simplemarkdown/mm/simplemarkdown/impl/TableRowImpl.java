/**
 */
package idm.simplemarkdown.mm.simplemarkdown.impl;

import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage;
import idm.simplemarkdown.mm.simplemarkdown.TableCell;
import idm.simplemarkdown.mm.simplemarkdown.TableRow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableRowImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.impl.TableRowImpl#getRowNumber <em>Row Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableRowImpl extends MinimalEObjectImpl.Container implements TableRow {
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<TableCell> cells;

	/**
	 * The default value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected int rowNumber = ROW_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemarkdownPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableCell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<TableCell>(TableCell.class, this,
					SimplemarkdownPackage.TABLE_ROW__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRowNumber() {
		return rowNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowNumber(int newRowNumber) {
		int oldRowNumber = rowNumber;
		rowNumber = newRowNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemarkdownPackage.TABLE_ROW__ROW_NUMBER,
					oldRowNumber, rowNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_ROW__CELLS:
			return ((InternalEList<?>) getCells()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_ROW__CELLS:
			return getCells();
		case SimplemarkdownPackage.TABLE_ROW__ROW_NUMBER:
			return getRowNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplemarkdownPackage.TABLE_ROW__CELLS:
			getCells().clear();
			getCells().addAll((Collection<? extends TableCell>) newValue);
			return;
		case SimplemarkdownPackage.TABLE_ROW__ROW_NUMBER:
			setRowNumber((Integer) newValue);
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
		case SimplemarkdownPackage.TABLE_ROW__CELLS:
			getCells().clear();
			return;
		case SimplemarkdownPackage.TABLE_ROW__ROW_NUMBER:
			setRowNumber(ROW_NUMBER_EDEFAULT);
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
		case SimplemarkdownPackage.TABLE_ROW__CELLS:
			return cells != null && !cells.isEmpty();
		case SimplemarkdownPackage.TABLE_ROW__ROW_NUMBER:
			return rowNumber != ROW_NUMBER_EDEFAULT;
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
		result.append(" (rowNumber: ");
		result.append(rowNumber);
		result.append(')');
		return result.toString();
	}

} //TableRowImpl
