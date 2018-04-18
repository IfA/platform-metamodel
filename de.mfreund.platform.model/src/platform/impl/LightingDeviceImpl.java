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

import platform.LightingDevice;
import platform.PlatformPackage;
import platform.SizeEvaluation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lighting Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.LightingDeviceImpl#getLightningType <em>Lightning Type</em>}</li>
 *   <li>{@link platform.impl.LightingDeviceImpl#getLightSize <em>Light Size</em>}</li>
 *   <li>{@link platform.impl.LightingDeviceImpl#isMultiColorConfigurable <em>Multi Color Configurable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightingDeviceImpl extends VisualOutputDeviceImpl implements LightingDevice {
	/**
	 * The default value of the '{@link #getLightningType() <em>Lightning Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightningType()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTNING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLightningType() <em>Lightning Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightningType()
	 * @generated
	 * @ordered
	 */
	protected String lightningType = LIGHTNING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLightSize() <em>Light Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSize()
	 * @generated
	 * @ordered
	 */
	protected static final SizeEvaluation LIGHT_SIZE_EDEFAULT = SizeEvaluation.VERY_SMALL;

	/**
	 * The cached value of the '{@link #getLightSize() <em>Light Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSize()
	 * @generated
	 * @ordered
	 */
	protected SizeEvaluation lightSize = LIGHT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiColorConfigurable() <em>Multi Color Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiColorConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_COLOR_CONFIGURABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiColorConfigurable() <em>Multi Color Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiColorConfigurable()
	 * @generated
	 * @ordered
	 */
	protected boolean multiColorConfigurable = MULTI_COLOR_CONFIGURABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightingDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.LIGHTING_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLightningType() {
		return lightningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightningType(String newLightningType) {
		String oldLightningType = lightningType;
		lightningType = newLightningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.LIGHTING_DEVICE__LIGHTNING_TYPE, oldLightningType, lightningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeEvaluation getLightSize() {
		return lightSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightSize(SizeEvaluation newLightSize) {
		SizeEvaluation oldLightSize = lightSize;
		lightSize = newLightSize == null ? LIGHT_SIZE_EDEFAULT : newLightSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.LIGHTING_DEVICE__LIGHT_SIZE, oldLightSize, lightSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiColorConfigurable() {
		return multiColorConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiColorConfigurable(boolean newMultiColorConfigurable) {
		boolean oldMultiColorConfigurable = multiColorConfigurable;
		multiColorConfigurable = newMultiColorConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE, oldMultiColorConfigurable, multiColorConfigurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.LIGHTING_DEVICE__LIGHTNING_TYPE:
				return getLightningType();
			case PlatformPackage.LIGHTING_DEVICE__LIGHT_SIZE:
				return getLightSize();
			case PlatformPackage.LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE:
				return isMultiColorConfigurable();
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
			case PlatformPackage.LIGHTING_DEVICE__LIGHTNING_TYPE:
				setLightningType((String)newValue);
				return;
			case PlatformPackage.LIGHTING_DEVICE__LIGHT_SIZE:
				setLightSize((SizeEvaluation)newValue);
				return;
			case PlatformPackage.LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE:
				setMultiColorConfigurable((Boolean)newValue);
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
			case PlatformPackage.LIGHTING_DEVICE__LIGHTNING_TYPE:
				setLightningType(LIGHTNING_TYPE_EDEFAULT);
				return;
			case PlatformPackage.LIGHTING_DEVICE__LIGHT_SIZE:
				setLightSize(LIGHT_SIZE_EDEFAULT);
				return;
			case PlatformPackage.LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE:
				setMultiColorConfigurable(MULTI_COLOR_CONFIGURABLE_EDEFAULT);
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
			case PlatformPackage.LIGHTING_DEVICE__LIGHTNING_TYPE:
				return LIGHTNING_TYPE_EDEFAULT == null ? lightningType != null : !LIGHTNING_TYPE_EDEFAULT.equals(lightningType);
			case PlatformPackage.LIGHTING_DEVICE__LIGHT_SIZE:
				return lightSize != LIGHT_SIZE_EDEFAULT;
			case PlatformPackage.LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE:
				return multiColorConfigurable != MULTI_COLOR_CONFIGURABLE_EDEFAULT;
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
		result.append(" (lightningType: ");
		result.append(lightningType);
		result.append(", lightSize: ");
		result.append(lightSize);
		result.append(", multiColorConfigurable: ");
		result.append(multiColorConfigurable);
		result.append(')');
		return result.toString();
	}

} //LightingDeviceImpl
