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
package platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.InputDevice#isSafeForUnwantedActions <em>Safe For Unwanted Actions</em>}</li>
 *   <li>{@link platform.InputDevice#isUsableWithGloves <em>Usable With Gloves</em>}</li>
 *   <li>{@link platform.InputDevice#isUsableWithOneHand <em>Usable With One Hand</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getInputDevice()
 * @model abstract="true"
 * @generated
 */
public interface InputDevice extends InteractionRessource, ElementaryTasksForInputDevices {
	/**
	 * Returns the value of the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe For Unwanted Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe For Unwanted Actions</em>' attribute.
	 * @see #setSafeForUnwantedActions(boolean)
	 * @see platform.PlatformPackage#getInputDevice_SafeForUnwantedActions()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!InputDevice!safeForUnwantedActions'"
	 * @generated
	 */
	boolean isSafeForUnwantedActions();

	/**
	 * Sets the value of the '{@link platform.InputDevice#isSafeForUnwantedActions <em>Safe For Unwanted Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe For Unwanted Actions</em>' attribute.
	 * @see #isSafeForUnwantedActions()
	 * @generated
	 */
	void setSafeForUnwantedActions(boolean value);

	/**
	 * Returns the value of the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable With Gloves</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable With Gloves</em>' attribute.
	 * @see #setUsableWithGloves(boolean)
	 * @see platform.PlatformPackage#getInputDevice_UsableWithGloves()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!InputDevice!usableWithGloves'"
	 * @generated
	 */
	boolean isUsableWithGloves();

	/**
	 * Sets the value of the '{@link platform.InputDevice#isUsableWithGloves <em>Usable With Gloves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable With Gloves</em>' attribute.
	 * @see #isUsableWithGloves()
	 * @generated
	 */
	void setUsableWithGloves(boolean value);

	/**
	 * Returns the value of the '<em><b>Usable With One Hand</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable With One Hand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable With One Hand</em>' attribute.
	 * @see #setUsableWithOneHand(boolean)
	 * @see platform.PlatformPackage#getInputDevice_UsableWithOneHand()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!InputDevice!usableWithOneHand'"
	 * @generated
	 */
	boolean isUsableWithOneHand();

	/**
	 * Sets the value of the '{@link platform.InputDevice#isUsableWithOneHand <em>Usable With One Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable With One Hand</em>' attribute.
	 * @see #isUsableWithOneHand()
	 * @generated
	 */
	void setUsableWithOneHand(boolean value);

} // InputDevice
