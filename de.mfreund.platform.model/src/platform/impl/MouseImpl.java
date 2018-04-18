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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import platform.Hardkey;
import platform.Mouse;
import platform.PlatformPackage;
import platform.PlatformTables;
import platform.PointingDevice;
import platform.Sensibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mouse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.MouseImpl#getMouseSensibility <em>Mouse Sensibility</em>}</li>
 *   <li>{@link platform.impl.MouseImpl#isUsableForTranspartentSurface <em>Usable For Transpartent Surface</em>}</li>
 *   <li>{@link platform.impl.MouseImpl#isUsableForSmoothSurface <em>Usable For Smooth Surface</em>}</li>
 *   <li>{@link platform.impl.MouseImpl#getMainPointingDevice <em>Main Pointing Device</em>}</li>
 *   <li>{@link platform.impl.MouseImpl#getLeftMousebutton <em>Left Mousebutton</em>}</li>
 *   <li>{@link platform.impl.MouseImpl#getRightMousebutton <em>Right Mousebutton</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MouseImpl extends ComplexRessourceImpl implements Mouse {
	/**
	 * The default value of the '{@link #getMouseSensibility() <em>Mouse Sensibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseSensibility()
	 * @generated
	 * @ordered
	 */
	protected static final Sensibility MOUSE_SENSIBILITY_EDEFAULT = Sensibility.OTHER;

	/**
	 * The cached value of the '{@link #getMouseSensibility() <em>Mouse Sensibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouseSensibility()
	 * @generated
	 * @ordered
	 */
	protected Sensibility mouseSensibility = MOUSE_SENSIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsableForTranspartentSurface() <em>Usable For Transpartent Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableForTranspartentSurface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_FOR_TRANSPARTENT_SURFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUsableForTranspartentSurface() <em>Usable For Transpartent Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableForTranspartentSurface()
	 * @generated
	 * @ordered
	 */
	protected boolean usableForTranspartentSurface = USABLE_FOR_TRANSPARTENT_SURFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsableForSmoothSurface() <em>Usable For Smooth Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableForSmoothSurface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_FOR_SMOOTH_SURFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUsableForSmoothSurface() <em>Usable For Smooth Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableForSmoothSurface()
	 * @generated
	 * @ordered
	 */
	protected boolean usableForSmoothSurface = USABLE_FOR_SMOOTH_SURFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMainPointingDevice() <em>Main Pointing Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPointingDevice()
	 * @generated
	 * @ordered
	 */
	protected PointingDevice mainPointingDevice;

	/**
	 * The cached value of the '{@link #getLeftMousebutton() <em>Left Mousebutton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMousebutton()
	 * @generated
	 * @ordered
	 */
	protected Hardkey leftMousebutton;

	/**
	 * The cached value of the '{@link #getRightMousebutton() <em>Right Mousebutton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMousebutton()
	 * @generated
	 * @ordered
	 */
	protected Hardkey rightMousebutton;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.MOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensibility getMouseSensibility() {
		return mouseSensibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouseSensibility(Sensibility newMouseSensibility) {
		Sensibility oldMouseSensibility = mouseSensibility;
		mouseSensibility = newMouseSensibility == null ? MOUSE_SENSIBILITY_EDEFAULT : newMouseSensibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MOUSE__MOUSE_SENSIBILITY, oldMouseSensibility, mouseSensibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsableForTranspartentSurface() {
		return usableForTranspartentSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsableForTranspartentSurface(boolean newUsableForTranspartentSurface) {
		boolean oldUsableForTranspartentSurface = usableForTranspartentSurface;
		usableForTranspartentSurface = newUsableForTranspartentSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE, oldUsableForTranspartentSurface, usableForTranspartentSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsableForSmoothSurface() {
		return usableForSmoothSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsableForSmoothSurface(boolean newUsableForSmoothSurface) {
		boolean oldUsableForSmoothSurface = usableForSmoothSurface;
		usableForSmoothSurface = newUsableForSmoothSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MOUSE__USABLE_FOR_SMOOTH_SURFACE, oldUsableForSmoothSurface, usableForSmoothSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointingDevice getMainPointingDevice() {
		if (mainPointingDevice != null && mainPointingDevice.eIsProxy()) {
			InternalEObject oldMainPointingDevice = (InternalEObject)mainPointingDevice;
			mainPointingDevice = (PointingDevice)eResolveProxy(oldMainPointingDevice);
			if (mainPointingDevice != oldMainPointingDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.MOUSE__MAIN_POINTING_DEVICE, oldMainPointingDevice, mainPointingDevice));
			}
		}
		return mainPointingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointingDevice basicGetMainPointingDevice() {
		return mainPointingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainPointingDevice(PointingDevice newMainPointingDevice) {
		PointingDevice oldMainPointingDevice = mainPointingDevice;
		mainPointingDevice = newMainPointingDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MOUSE__MAIN_POINTING_DEVICE, oldMainPointingDevice, mainPointingDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardkey getLeftMousebutton() {
		if (leftMousebutton != null && leftMousebutton.eIsProxy()) {
			InternalEObject oldLeftMousebutton = (InternalEObject)leftMousebutton;
			leftMousebutton = (Hardkey)eResolveProxy(oldLeftMousebutton);
			if (leftMousebutton != oldLeftMousebutton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.MOUSE__LEFT_MOUSEBUTTON, oldLeftMousebutton, leftMousebutton));
			}
		}
		return leftMousebutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardkey basicGetLeftMousebutton() {
		return leftMousebutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMousebutton(Hardkey newLeftMousebutton) {
		Hardkey oldLeftMousebutton = leftMousebutton;
		leftMousebutton = newLeftMousebutton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MOUSE__LEFT_MOUSEBUTTON, oldLeftMousebutton, leftMousebutton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardkey getRightMousebutton() {
		if (rightMousebutton != null && rightMousebutton.eIsProxy()) {
			InternalEObject oldRightMousebutton = (InternalEObject)rightMousebutton;
			rightMousebutton = (Hardkey)eResolveProxy(oldRightMousebutton);
			if (rightMousebutton != oldRightMousebutton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.MOUSE__RIGHT_MOUSEBUTTON, oldRightMousebutton, rightMousebutton));
			}
		}
		return rightMousebutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardkey basicGetRightMousebutton() {
		return rightMousebutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMousebutton(Hardkey newRightMousebutton) {
		Hardkey oldRightMousebutton = rightMousebutton;
		rightMousebutton = newRightMousebutton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MOUSE__RIGHT_MOUSEBUTTON, oldRightMousebutton, rightMousebutton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean leftUnequalRight(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv leftUnequalRight:
		 *   let severity : Integer[1] = 'Mouse::leftUnequalRight'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[1] = self.leftMousebutton <> self.rightMousebutton
		 *       in
		 *         'Mouse::leftUnequalRight'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, PlatformTables.STR_Mouse_c_c_leftUnequalRight);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, PlatformTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Caught*/ /*@NonNull*/ Object CAUGHT_status;
		    try {
		        final /*@Thrown*/ Hardkey leftMousebutton = this.getLeftMousebutton();
		        final /*@Thrown*/ Hardkey rightMousebutton = this.getRightMousebutton();
		        final /*@Thrown*/ boolean status = !leftMousebutton.equals(rightMousebutton);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, PlatformTables.STR_Mouse_c_c_leftUnequalRight, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PlatformTables.INT_0).booleanValue();
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.MOUSE__MOUSE_SENSIBILITY:
				return getMouseSensibility();
			case PlatformPackage.MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE:
				return isUsableForTranspartentSurface();
			case PlatformPackage.MOUSE__USABLE_FOR_SMOOTH_SURFACE:
				return isUsableForSmoothSurface();
			case PlatformPackage.MOUSE__MAIN_POINTING_DEVICE:
				if (resolve) return getMainPointingDevice();
				return basicGetMainPointingDevice();
			case PlatformPackage.MOUSE__LEFT_MOUSEBUTTON:
				if (resolve) return getLeftMousebutton();
				return basicGetLeftMousebutton();
			case PlatformPackage.MOUSE__RIGHT_MOUSEBUTTON:
				if (resolve) return getRightMousebutton();
				return basicGetRightMousebutton();
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
			case PlatformPackage.MOUSE__MOUSE_SENSIBILITY:
				setMouseSensibility((Sensibility)newValue);
				return;
			case PlatformPackage.MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE:
				setUsableForTranspartentSurface((Boolean)newValue);
				return;
			case PlatformPackage.MOUSE__USABLE_FOR_SMOOTH_SURFACE:
				setUsableForSmoothSurface((Boolean)newValue);
				return;
			case PlatformPackage.MOUSE__MAIN_POINTING_DEVICE:
				setMainPointingDevice((PointingDevice)newValue);
				return;
			case PlatformPackage.MOUSE__LEFT_MOUSEBUTTON:
				setLeftMousebutton((Hardkey)newValue);
				return;
			case PlatformPackage.MOUSE__RIGHT_MOUSEBUTTON:
				setRightMousebutton((Hardkey)newValue);
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
			case PlatformPackage.MOUSE__MOUSE_SENSIBILITY:
				setMouseSensibility(MOUSE_SENSIBILITY_EDEFAULT);
				return;
			case PlatformPackage.MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE:
				setUsableForTranspartentSurface(USABLE_FOR_TRANSPARTENT_SURFACE_EDEFAULT);
				return;
			case PlatformPackage.MOUSE__USABLE_FOR_SMOOTH_SURFACE:
				setUsableForSmoothSurface(USABLE_FOR_SMOOTH_SURFACE_EDEFAULT);
				return;
			case PlatformPackage.MOUSE__MAIN_POINTING_DEVICE:
				setMainPointingDevice((PointingDevice)null);
				return;
			case PlatformPackage.MOUSE__LEFT_MOUSEBUTTON:
				setLeftMousebutton((Hardkey)null);
				return;
			case PlatformPackage.MOUSE__RIGHT_MOUSEBUTTON:
				setRightMousebutton((Hardkey)null);
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
			case PlatformPackage.MOUSE__MOUSE_SENSIBILITY:
				return mouseSensibility != MOUSE_SENSIBILITY_EDEFAULT;
			case PlatformPackage.MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE:
				return usableForTranspartentSurface != USABLE_FOR_TRANSPARTENT_SURFACE_EDEFAULT;
			case PlatformPackage.MOUSE__USABLE_FOR_SMOOTH_SURFACE:
				return usableForSmoothSurface != USABLE_FOR_SMOOTH_SURFACE_EDEFAULT;
			case PlatformPackage.MOUSE__MAIN_POINTING_DEVICE:
				return mainPointingDevice != null;
			case PlatformPackage.MOUSE__LEFT_MOUSEBUTTON:
				return leftMousebutton != null;
			case PlatformPackage.MOUSE__RIGHT_MOUSEBUTTON:
				return rightMousebutton != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PlatformPackage.MOUSE___LEFT_UNEQUAL_RIGHT__DIAGNOSTICCHAIN_MAP:
				return leftUnequalRight((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (mouseSensibility: ");
		result.append(mouseSensibility);
		result.append(", usableForTranspartentSurface: ");
		result.append(usableForTranspartentSurface);
		result.append(", usableForSmoothSurface: ");
		result.append(usableForSmoothSurface);
		result.append(')');
		return result.toString();
	}

} //MouseImpl
