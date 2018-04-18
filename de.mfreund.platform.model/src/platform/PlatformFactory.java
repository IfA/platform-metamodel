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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage
 * @generated
 */
public interface PlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformFactory eINSTANCE = platform.impl.PlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PMbase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PMbase</em>'.
	 * @generated
	 */
	PMbase createPMbase();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Generic Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Property</em>'.
	 * @generated
	 */
	GenericProperty createGenericProperty();

	/**
	 * Returns a new object of class '<em>Integer Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Property</em>'.
	 * @generated
	 */
	IntegerProperty createIntegerProperty();

	/**
	 * Returns a new object of class '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Property</em>'.
	 * @generated
	 */
	StringProperty createStringProperty();

	/**
	 * Returns a new object of class '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Property</em>'.
	 * @generated
	 */
	BooleanProperty createBooleanProperty();

	/**
	 * Returns a new object of class '<em>Float Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Property</em>'.
	 * @generated
	 */
	FloatProperty createFloatProperty();

	/**
	 * Returns a new object of class '<em>Interaction Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Property</em>'.
	 * @generated
	 */
	InteractionProperty createInteractionProperty();

	/**
	 * Returns a new object of class '<em>Generic Complex Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Complex Ressource</em>'.
	 * @generated
	 */
	GenericComplexRessource createGenericComplexRessource();

	/**
	 * Returns a new object of class '<em>Mouse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouse</em>'.
	 * @generated
	 */
	Mouse createMouse();

	/**
	 * Returns a new object of class '<em>Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyboard</em>'.
	 * @generated
	 */
	Keyboard createKeyboard();

	/**
	 * Returns a new object of class '<em>Visual Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Input Device</em>'.
	 * @generated
	 */
	VisualInputDevice createVisualInputDevice();

	/**
	 * Returns a new object of class '<em>Lighting Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lighting Device</em>'.
	 * @generated
	 */
	LightingDevice createLightingDevice();

	/**
	 * Returns a new object of class '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera</em>'.
	 * @generated
	 */
	Camera createCamera();

	/**
	 * Returns a new object of class '<em>Tactile Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tactile Input Device</em>'.
	 * @generated
	 */
	TactileInputDevice createTactileInputDevice();

	/**
	 * Returns a new object of class '<em>Hardkey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardkey</em>'.
	 * @generated
	 */
	Hardkey createHardkey();

	/**
	 * Returns a new object of class '<em>Touchscreen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touchscreen</em>'.
	 * @generated
	 */
	Touchscreen createTouchscreen();

	/**
	 * Returns a new object of class '<em>Auditive Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auditive Input Device</em>'.
	 * @generated
	 */
	AuditiveInputDevice createAuditiveInputDevice();

	/**
	 * Returns a new object of class '<em>Microphone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone</em>'.
	 * @generated
	 */
	Microphone createMicrophone();

	/**
	 * Returns a new object of class '<em>Proprioceptive Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proprioceptive Input Device</em>'.
	 * @generated
	 */
	ProprioceptiveInputDevice createProprioceptiveInputDevice();

	/**
	 * Returns a new object of class '<em>Pointing Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointing Device</em>'.
	 * @generated
	 */
	PointingDevice createPointingDevice();

	/**
	 * Returns a new object of class '<em>Visual Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Output Device</em>'.
	 * @generated
	 */
	VisualOutputDevice createVisualOutputDevice();

	/**
	 * Returns a new object of class '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display</em>'.
	 * @generated
	 */
	Display createDisplay();

	/**
	 * Returns a new object of class '<em>Tactile Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tactile Output Device</em>'.
	 * @generated
	 */
	TactileOutputDevice createTactileOutputDevice();

	/**
	 * Returns a new object of class '<em>Vibration Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vibration Motor</em>'.
	 * @generated
	 */
	VibrationMotor createVibrationMotor();

	/**
	 * Returns a new object of class '<em>Auditive Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auditive Output Device</em>'.
	 * @generated
	 */
	AuditiveOutputDevice createAuditiveOutputDevice();

	/**
	 * Returns a new object of class '<em>Speaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speaker</em>'.
	 * @generated
	 */
	Speaker createSpeaker();

	/**
	 * Returns a new object of class '<em>Proprioceptive Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proprioceptive Output Device</em>'.
	 * @generated
	 */
	ProprioceptiveOutputDevice createProprioceptiveOutputDevice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatformPackage getPlatformPackage();

} //PlatformFactory
