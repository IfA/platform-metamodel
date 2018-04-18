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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import platform.ComplexRessource;
import platform.PlatformPackage;
import platform.Ressource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.ComplexRessourceImpl#getSubRessources <em>Sub Ressources</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComplexRessourceImpl extends RessourceImpl implements ComplexRessource {
	/**
	 * The cached value of the '{@link #getSubRessources() <em>Sub Ressources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> subRessources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexRessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.COMPLEX_RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getSubRessources() {
		if (subRessources == null) {
			subRessources = new EObjectContainmentEList<Ressource>(Ressource.class, this, PlatformPackage.COMPLEX_RESSOURCE__SUB_RESSOURCES);
		}
		return subRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.COMPLEX_RESSOURCE__SUB_RESSOURCES:
				return ((InternalEList<?>)getSubRessources()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.COMPLEX_RESSOURCE__SUB_RESSOURCES:
				return getSubRessources();
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
			case PlatformPackage.COMPLEX_RESSOURCE__SUB_RESSOURCES:
				getSubRessources().clear();
				getSubRessources().addAll((Collection<? extends Ressource>)newValue);
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
			case PlatformPackage.COMPLEX_RESSOURCE__SUB_RESSOURCES:
				getSubRessources().clear();
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
			case PlatformPackage.COMPLEX_RESSOURCE__SUB_RESSOURCES:
				return subRessources != null && !subRessources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexRessourceImpl
