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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import platform.GenericProperty;
import platform.PlatformPackage;
import platform.Ressource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.RessourceImpl#getRessourceName <em>Ressource Name</em>}</li>
 *   <li>{@link platform.impl.RessourceImpl#getGenericProperty <em>Generic Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RessourceImpl extends MinimalEObjectImpl.Container implements Ressource {
	/**
	 * The default value of the '{@link #getRessourceName() <em>Ressource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESSOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRessourceName() <em>Ressource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceName()
	 * @generated
	 * @ordered
	 */
	protected String ressourceName = RESSOURCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenericProperty() <em>Generic Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericProperty> genericProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRessourceName() {
		return ressourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessourceName(String newRessourceName) {
		String oldRessourceName = ressourceName;
		ressourceName = newRessourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.RESSOURCE__RESSOURCE_NAME, oldRessourceName, ressourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericProperty> getGenericProperty() {
		if (genericProperty == null) {
			genericProperty = new EObjectContainmentEList<GenericProperty>(GenericProperty.class, this, PlatformPackage.RESSOURCE__GENERIC_PROPERTY);
		}
		return genericProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.RESSOURCE__GENERIC_PROPERTY:
				return ((InternalEList<?>)getGenericProperty()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.RESSOURCE__RESSOURCE_NAME:
				return getRessourceName();
			case PlatformPackage.RESSOURCE__GENERIC_PROPERTY:
				return getGenericProperty();
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
			case PlatformPackage.RESSOURCE__RESSOURCE_NAME:
				setRessourceName((String)newValue);
				return;
			case PlatformPackage.RESSOURCE__GENERIC_PROPERTY:
				getGenericProperty().clear();
				getGenericProperty().addAll((Collection<? extends GenericProperty>)newValue);
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
			case PlatformPackage.RESSOURCE__RESSOURCE_NAME:
				setRessourceName(RESSOURCE_NAME_EDEFAULT);
				return;
			case PlatformPackage.RESSOURCE__GENERIC_PROPERTY:
				getGenericProperty().clear();
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
			case PlatformPackage.RESSOURCE__RESSOURCE_NAME:
				return RESSOURCE_NAME_EDEFAULT == null ? ressourceName != null : !RESSOURCE_NAME_EDEFAULT.equals(ressourceName);
			case PlatformPackage.RESSOURCE__GENERIC_PROPERTY:
				return genericProperty != null && !genericProperty.isEmpty();
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
		result.append(" (ressourceName: ");
		result.append(ressourceName);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl
