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

import org.eclipse.emf.ecore.EClass;

import platform.PlatformPackage;
import platform.VibrationMotor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vibration Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VibrationMotorImpl extends TactileOutputDeviceImpl implements VibrationMotor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VibrationMotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.VIBRATION_MOTOR;
	}

} //VibrationMotorImpl
