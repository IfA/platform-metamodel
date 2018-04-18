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

import platform.InteractionModality;
import platform.InteractionProperty;
import platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.InteractionPropertyImpl#getInteractionModality <em>Interaction Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionPropertyImpl extends GenericPropertyImpl implements InteractionProperty {
	/**
	 * The default value of the '{@link #getInteractionModality() <em>Interaction Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModality()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionModality INTERACTION_MODALITY_EDEFAULT = InteractionModality.NONE;

	/**
	 * The cached value of the '{@link #getInteractionModality() <em>Interaction Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModality()
	 * @generated
	 * @ordered
	 */
	protected InteractionModality interactionModality = INTERACTION_MODALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.INTERACTION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModality getInteractionModality() {
		return interactionModality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionModality(InteractionModality newInteractionModality) {
		InteractionModality oldInteractionModality = interactionModality;
		interactionModality = newInteractionModality == null ? INTERACTION_MODALITY_EDEFAULT : newInteractionModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INTERACTION_PROPERTY__INTERACTION_MODALITY, oldInteractionModality, interactionModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.INTERACTION_PROPERTY__INTERACTION_MODALITY:
				return getInteractionModality();
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
			case PlatformPackage.INTERACTION_PROPERTY__INTERACTION_MODALITY:
				setInteractionModality((InteractionModality)newValue);
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
			case PlatformPackage.INTERACTION_PROPERTY__INTERACTION_MODALITY:
				setInteractionModality(INTERACTION_MODALITY_EDEFAULT);
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
			case PlatformPackage.INTERACTION_PROPERTY__INTERACTION_MODALITY:
				return interactionModality != INTERACTION_MODALITY_EDEFAULT;
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
		result.append(" (interactionModality: ");
		result.append(interactionModality);
		result.append(')');
		return result.toString();
	}

} //InteractionPropertyImpl
