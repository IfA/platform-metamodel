/*******************************************************************************
 * Copyright (C) 2015-2018 Matthias Freund and others, Institute of Automation, TU Dresden
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *   Institute of Automation, TU Dresden - Initial API and implementation
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
/**
 */
package platform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import platform.ElementaryTaskEvaluation;
import platform.ElementaryTasksForInputDevices;
import platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementary Tasks For Input Devices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.ElementaryTasksForInputDevicesImpl#getFastPointingCapable <em>Fast Pointing Capable</em>}</li>
 *   <li>{@link platform.impl.ElementaryTasksForInputDevicesImpl#getAccuratePointingCapable <em>Accurate Pointing Capable</em>}</li>
 *   <li>{@link platform.impl.ElementaryTasksForInputDevicesImpl#getSelectingCapable <em>Selecting Capable</em>}</li>
 *   <li>{@link platform.impl.ElementaryTasksForInputDevicesImpl#getDrawingCapable <em>Drawing Capable</em>}</li>
 *   <li>{@link platform.impl.ElementaryTasksForInputDevicesImpl#getFastDrawingCapable <em>Fast Drawing Capable</em>}</li>
 *   <li>{@link platform.impl.ElementaryTasksForInputDevicesImpl#getAlphanumericCapable <em>Alphanumeric Capable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementaryTasksForInputDevicesImpl extends MinimalEObjectImpl.Container implements ElementaryTasksForInputDevices {
	/**
	 * The default value of the '{@link #getFastPointingCapable() <em>Fast Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastPointingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation FAST_POINTING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getFastPointingCapable() <em>Fast Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastPointingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation fastPointingCapable = FAST_POINTING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuratePointingCapable() <em>Accurate Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuratePointingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation ACCURATE_POINTING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getAccuratePointingCapable() <em>Accurate Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuratePointingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation accuratePointingCapable = ACCURATE_POINTING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectingCapable() <em>Selecting Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation SELECTING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getSelectingCapable() <em>Selecting Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation selectingCapable = SELECTING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrawingCapable() <em>Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation DRAWING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getDrawingCapable() <em>Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation drawingCapable = DRAWING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFastDrawingCapable() <em>Fast Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation FAST_DRAWING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getFastDrawingCapable() <em>Fast Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation fastDrawingCapable = FAST_DRAWING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlphanumericCapable() <em>Alphanumeric Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphanumericCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation ALPHANUMERIC_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getAlphanumericCapable() <em>Alphanumeric Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphanumericCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation alphanumericCapable = ALPHANUMERIC_CAPABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryTasksForInputDevicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getFastPointingCapable() {
		return fastPointingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastPointingCapable(ElementaryTaskEvaluation newFastPointingCapable) {
		ElementaryTaskEvaluation oldFastPointingCapable = fastPointingCapable;
		fastPointingCapable = newFastPointingCapable == null ? FAST_POINTING_CAPABLE_EDEFAULT : newFastPointingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE, oldFastPointingCapable, fastPointingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getAccuratePointingCapable() {
		return accuratePointingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuratePointingCapable(ElementaryTaskEvaluation newAccuratePointingCapable) {
		ElementaryTaskEvaluation oldAccuratePointingCapable = accuratePointingCapable;
		accuratePointingCapable = newAccuratePointingCapable == null ? ACCURATE_POINTING_CAPABLE_EDEFAULT : newAccuratePointingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE, oldAccuratePointingCapable, accuratePointingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getSelectingCapable() {
		return selectingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectingCapable(ElementaryTaskEvaluation newSelectingCapable) {
		ElementaryTaskEvaluation oldSelectingCapable = selectingCapable;
		selectingCapable = newSelectingCapable == null ? SELECTING_CAPABLE_EDEFAULT : newSelectingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE, oldSelectingCapable, selectingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getDrawingCapable() {
		return drawingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingCapable(ElementaryTaskEvaluation newDrawingCapable) {
		ElementaryTaskEvaluation oldDrawingCapable = drawingCapable;
		drawingCapable = newDrawingCapable == null ? DRAWING_CAPABLE_EDEFAULT : newDrawingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE, oldDrawingCapable, drawingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getFastDrawingCapable() {
		return fastDrawingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastDrawingCapable(ElementaryTaskEvaluation newFastDrawingCapable) {
		ElementaryTaskEvaluation oldFastDrawingCapable = fastDrawingCapable;
		fastDrawingCapable = newFastDrawingCapable == null ? FAST_DRAWING_CAPABLE_EDEFAULT : newFastDrawingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE, oldFastDrawingCapable, fastDrawingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getAlphanumericCapable() {
		return alphanumericCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphanumericCapable(ElementaryTaskEvaluation newAlphanumericCapable) {
		ElementaryTaskEvaluation oldAlphanumericCapable = alphanumericCapable;
		alphanumericCapable = newAlphanumericCapable == null ? ALPHANUMERIC_CAPABLE_EDEFAULT : newAlphanumericCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE, oldAlphanumericCapable, alphanumericCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE:
				return getFastPointingCapable();
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE:
				return getAccuratePointingCapable();
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE:
				return getSelectingCapable();
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE:
				return getDrawingCapable();
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE:
				return getFastDrawingCapable();
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE:
				return getAlphanumericCapable();
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
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE:
				setFastPointingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE:
				setAccuratePointingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE:
				setSelectingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE:
				setDrawingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE:
				setFastDrawingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE:
				setAlphanumericCapable((ElementaryTaskEvaluation)newValue);
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
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE:
				setFastPointingCapable(FAST_POINTING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE:
				setAccuratePointingCapable(ACCURATE_POINTING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE:
				setSelectingCapable(SELECTING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE:
				setDrawingCapable(DRAWING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE:
				setFastDrawingCapable(FAST_DRAWING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE:
				setAlphanumericCapable(ALPHANUMERIC_CAPABLE_EDEFAULT);
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
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE:
				return fastPointingCapable != FAST_POINTING_CAPABLE_EDEFAULT;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE:
				return accuratePointingCapable != ACCURATE_POINTING_CAPABLE_EDEFAULT;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE:
				return selectingCapable != SELECTING_CAPABLE_EDEFAULT;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE:
				return drawingCapable != DRAWING_CAPABLE_EDEFAULT;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE:
				return fastDrawingCapable != FAST_DRAWING_CAPABLE_EDEFAULT;
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE:
				return alphanumericCapable != ALPHANUMERIC_CAPABLE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fastPointingCapable: ");
		result.append(fastPointingCapable);
		result.append(", accuratePointingCapable: ");
		result.append(accuratePointingCapable);
		result.append(", selectingCapable: ");
		result.append(selectingCapable);
		result.append(", drawingCapable: ");
		result.append(drawingCapable);
		result.append(", fastDrawingCapable: ");
		result.append(fastDrawingCapable);
		result.append(", alphanumericCapable: ");
		result.append(alphanumericCapable);
		result.append(')');
		return result.toString();
	}

} //ElementaryTasksForInputDevicesImpl
