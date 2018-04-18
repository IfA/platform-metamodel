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
package platform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import platform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage
 * @generated
 */
public class PlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PlatformPackage.PMBASE: {
				PMbase pMbase = (PMbase)theEObject;
				T result = casePMbase(pMbase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.RESSOURCE: {
				Ressource ressource = (Ressource)theEObject;
				T result = caseRessource(ressource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPLEX_RESSOURCE: {
				ComplexRessource complexRessource = (ComplexRessource)theEObject;
				T result = caseComplexRessource(complexRessource);
				if (result == null) result = caseRessource(complexRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.GENERIC_PROPERTY: {
				GenericProperty genericProperty = (GenericProperty)theEObject;
				T result = caseGenericProperty(genericProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INTEGER_PROPERTY: {
				IntegerProperty integerProperty = (IntegerProperty)theEObject;
				T result = caseIntegerProperty(integerProperty);
				if (result == null) result = caseGenericProperty(integerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRING_PROPERTY: {
				StringProperty stringProperty = (StringProperty)theEObject;
				T result = caseStringProperty(stringProperty);
				if (result == null) result = caseGenericProperty(stringProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BOOLEAN_PROPERTY: {
				BooleanProperty booleanProperty = (BooleanProperty)theEObject;
				T result = caseBooleanProperty(booleanProperty);
				if (result == null) result = caseGenericProperty(booleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FLOAT_PROPERTY: {
				FloatProperty floatProperty = (FloatProperty)theEObject;
				T result = caseFloatProperty(floatProperty);
				if (result == null) result = caseGenericProperty(floatProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INTERACTION_PROPERTY: {
				InteractionProperty interactionProperty = (InteractionProperty)theEObject;
				T result = caseInteractionProperty(interactionProperty);
				if (result == null) result = caseGenericProperty(interactionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.GENERIC_COMPLEX_RESSOURCE: {
				GenericComplexRessource genericComplexRessource = (GenericComplexRessource)theEObject;
				T result = caseGenericComplexRessource(genericComplexRessource);
				if (result == null) result = caseComplexRessource(genericComplexRessource);
				if (result == null) result = caseRessource(genericComplexRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MOUSE: {
				Mouse mouse = (Mouse)theEObject;
				T result = caseMouse(mouse);
				if (result == null) result = caseComplexRessource(mouse);
				if (result == null) result = caseRessource(mouse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.KEYBOARD: {
				Keyboard keyboard = (Keyboard)theEObject;
				T result = caseKeyboard(keyboard);
				if (result == null) result = caseComplexRessource(keyboard);
				if (result == null) result = caseRessource(keyboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ELEMENTARY_RESSOURCE: {
				ElementaryRessource elementaryRessource = (ElementaryRessource)theEObject;
				T result = caseElementaryRessource(elementaryRessource);
				if (result == null) result = caseRessource(elementaryRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INTERACTION_RESSOURCE: {
				InteractionRessource interactionRessource = (InteractionRessource)theEObject;
				T result = caseInteractionRessource(interactionRessource);
				if (result == null) result = caseElementaryRessource(interactionRessource);
				if (result == null) result = caseRessource(interactionRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INPUT_DEVICE: {
				InputDevice inputDevice = (InputDevice)theEObject;
				T result = caseInputDevice(inputDevice);
				if (result == null) result = caseInteractionRessource(inputDevice);
				if (result == null) result = caseElementaryTasksForInputDevices(inputDevice);
				if (result == null) result = caseElementaryRessource(inputDevice);
				if (result == null) result = caseRessource(inputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES: {
				ElementaryTasksForInputDevices elementaryTasksForInputDevices = (ElementaryTasksForInputDevices)theEObject;
				T result = caseElementaryTasksForInputDevices(elementaryTasksForInputDevices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.VISUAL_INPUT_DEVICE: {
				VisualInputDevice visualInputDevice = (VisualInputDevice)theEObject;
				T result = caseVisualInputDevice(visualInputDevice);
				if (result == null) result = caseInputDevice(visualInputDevice);
				if (result == null) result = caseInteractionRessource(visualInputDevice);
				if (result == null) result = caseElementaryTasksForInputDevices(visualInputDevice);
				if (result == null) result = caseElementaryRessource(visualInputDevice);
				if (result == null) result = caseRessource(visualInputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LIGHTING_DEVICE: {
				LightingDevice lightingDevice = (LightingDevice)theEObject;
				T result = caseLightingDevice(lightingDevice);
				if (result == null) result = caseVisualOutputDevice(lightingDevice);
				if (result == null) result = caseOutputDevice(lightingDevice);
				if (result == null) result = caseInteractionRessource(lightingDevice);
				if (result == null) result = caseElementaryRessource(lightingDevice);
				if (result == null) result = caseRessource(lightingDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CAMERA: {
				Camera camera = (Camera)theEObject;
				T result = caseCamera(camera);
				if (result == null) result = caseVisualInputDevice(camera);
				if (result == null) result = caseInputDevice(camera);
				if (result == null) result = caseInteractionRessource(camera);
				if (result == null) result = caseElementaryTasksForInputDevices(camera);
				if (result == null) result = caseElementaryRessource(camera);
				if (result == null) result = caseRessource(camera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.TACTILE_INPUT_DEVICE: {
				TactileInputDevice tactileInputDevice = (TactileInputDevice)theEObject;
				T result = caseTactileInputDevice(tactileInputDevice);
				if (result == null) result = caseInputDevice(tactileInputDevice);
				if (result == null) result = caseInteractionRessource(tactileInputDevice);
				if (result == null) result = caseElementaryTasksForInputDevices(tactileInputDevice);
				if (result == null) result = caseElementaryRessource(tactileInputDevice);
				if (result == null) result = caseRessource(tactileInputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.HARDKEY: {
				Hardkey hardkey = (Hardkey)theEObject;
				T result = caseHardkey(hardkey);
				if (result == null) result = caseTactileInputDevice(hardkey);
				if (result == null) result = caseInputDevice(hardkey);
				if (result == null) result = caseInteractionRessource(hardkey);
				if (result == null) result = caseElementaryTasksForInputDevices(hardkey);
				if (result == null) result = caseElementaryRessource(hardkey);
				if (result == null) result = caseRessource(hardkey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.TOUCHSCREEN: {
				Touchscreen touchscreen = (Touchscreen)theEObject;
				T result = caseTouchscreen(touchscreen);
				if (result == null) result = caseTactileInputDevice(touchscreen);
				if (result == null) result = caseInputDevice(touchscreen);
				if (result == null) result = caseInteractionRessource(touchscreen);
				if (result == null) result = caseElementaryTasksForInputDevices(touchscreen);
				if (result == null) result = caseElementaryRessource(touchscreen);
				if (result == null) result = caseRessource(touchscreen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.AUDITIVE_INPUT_DEVICE: {
				AuditiveInputDevice auditiveInputDevice = (AuditiveInputDevice)theEObject;
				T result = caseAuditiveInputDevice(auditiveInputDevice);
				if (result == null) result = caseInputDevice(auditiveInputDevice);
				if (result == null) result = caseInteractionRessource(auditiveInputDevice);
				if (result == null) result = caseElementaryTasksForInputDevices(auditiveInputDevice);
				if (result == null) result = caseElementaryRessource(auditiveInputDevice);
				if (result == null) result = caseRessource(auditiveInputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MICROPHONE: {
				Microphone microphone = (Microphone)theEObject;
				T result = caseMicrophone(microphone);
				if (result == null) result = caseAuditiveInputDevice(microphone);
				if (result == null) result = caseInputDevice(microphone);
				if (result == null) result = caseInteractionRessource(microphone);
				if (result == null) result = caseElementaryTasksForInputDevices(microphone);
				if (result == null) result = caseElementaryRessource(microphone);
				if (result == null) result = caseRessource(microphone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PROPRIOCEPTIVE_INPUT_DEVICE: {
				ProprioceptiveInputDevice proprioceptiveInputDevice = (ProprioceptiveInputDevice)theEObject;
				T result = caseProprioceptiveInputDevice(proprioceptiveInputDevice);
				if (result == null) result = caseInputDevice(proprioceptiveInputDevice);
				if (result == null) result = caseInteractionRessource(proprioceptiveInputDevice);
				if (result == null) result = caseElementaryTasksForInputDevices(proprioceptiveInputDevice);
				if (result == null) result = caseElementaryRessource(proprioceptiveInputDevice);
				if (result == null) result = caseRessource(proprioceptiveInputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.POINTING_DEVICE: {
				PointingDevice pointingDevice = (PointingDevice)theEObject;
				T result = casePointingDevice(pointingDevice);
				if (result == null) result = caseInputDevice(pointingDevice);
				if (result == null) result = caseInteractionRessource(pointingDevice);
				if (result == null) result = caseElementaryTasksForInputDevices(pointingDevice);
				if (result == null) result = caseElementaryRessource(pointingDevice);
				if (result == null) result = caseRessource(pointingDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.OUTPUT_DEVICE: {
				OutputDevice outputDevice = (OutputDevice)theEObject;
				T result = caseOutputDevice(outputDevice);
				if (result == null) result = caseInteractionRessource(outputDevice);
				if (result == null) result = caseElementaryRessource(outputDevice);
				if (result == null) result = caseRessource(outputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.VISUAL_OUTPUT_DEVICE: {
				VisualOutputDevice visualOutputDevice = (VisualOutputDevice)theEObject;
				T result = caseVisualOutputDevice(visualOutputDevice);
				if (result == null) result = caseOutputDevice(visualOutputDevice);
				if (result == null) result = caseInteractionRessource(visualOutputDevice);
				if (result == null) result = caseElementaryRessource(visualOutputDevice);
				if (result == null) result = caseRessource(visualOutputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DISPLAY: {
				Display display = (Display)theEObject;
				T result = caseDisplay(display);
				if (result == null) result = caseVisualOutputDevice(display);
				if (result == null) result = caseOutputDevice(display);
				if (result == null) result = caseInteractionRessource(display);
				if (result == null) result = caseElementaryRessource(display);
				if (result == null) result = caseRessource(display);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.TACTILE_OUTPUT_DEVICE: {
				TactileOutputDevice tactileOutputDevice = (TactileOutputDevice)theEObject;
				T result = caseTactileOutputDevice(tactileOutputDevice);
				if (result == null) result = caseOutputDevice(tactileOutputDevice);
				if (result == null) result = caseInteractionRessource(tactileOutputDevice);
				if (result == null) result = caseElementaryRessource(tactileOutputDevice);
				if (result == null) result = caseRessource(tactileOutputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.VIBRATION_MOTOR: {
				VibrationMotor vibrationMotor = (VibrationMotor)theEObject;
				T result = caseVibrationMotor(vibrationMotor);
				if (result == null) result = caseTactileOutputDevice(vibrationMotor);
				if (result == null) result = caseOutputDevice(vibrationMotor);
				if (result == null) result = caseInteractionRessource(vibrationMotor);
				if (result == null) result = caseElementaryRessource(vibrationMotor);
				if (result == null) result = caseRessource(vibrationMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.AUDITIVE_OUTPUT_DEVICE: {
				AuditiveOutputDevice auditiveOutputDevice = (AuditiveOutputDevice)theEObject;
				T result = caseAuditiveOutputDevice(auditiveOutputDevice);
				if (result == null) result = caseOutputDevice(auditiveOutputDevice);
				if (result == null) result = caseInteractionRessource(auditiveOutputDevice);
				if (result == null) result = caseElementaryRessource(auditiveOutputDevice);
				if (result == null) result = caseRessource(auditiveOutputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SPEAKER: {
				Speaker speaker = (Speaker)theEObject;
				T result = caseSpeaker(speaker);
				if (result == null) result = caseAuditiveOutputDevice(speaker);
				if (result == null) result = caseOutputDevice(speaker);
				if (result == null) result = caseInteractionRessource(speaker);
				if (result == null) result = caseElementaryRessource(speaker);
				if (result == null) result = caseRessource(speaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PROPRIOCEPTIVE_OUTPUT_DEVICE: {
				ProprioceptiveOutputDevice proprioceptiveOutputDevice = (ProprioceptiveOutputDevice)theEObject;
				T result = caseProprioceptiveOutputDevice(proprioceptiveOutputDevice);
				if (result == null) result = caseOutputDevice(proprioceptiveOutputDevice);
				if (result == null) result = caseInteractionRessource(proprioceptiveOutputDevice);
				if (result == null) result = caseElementaryRessource(proprioceptiveOutputDevice);
				if (result == null) result = caseRessource(proprioceptiveOutputDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PMbase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PMbase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMbase(PMbase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessource(Ressource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexRessource(ComplexRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericProperty(GenericProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerProperty(IntegerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringProperty(StringProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanProperty(BooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatProperty(FloatProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionProperty(InteractionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Complex Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Complex Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericComplexRessource(GenericComplexRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouse(Mouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyboard(Keyboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryRessource(ElementaryRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionRessource(InteractionRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDevice(InputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Tasks For Input Devices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Tasks For Input Devices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryTasksForInputDevices(ElementaryTasksForInputDevices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Input Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualInputDevice(VisualInputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lighting Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lighting Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightingDevice(LightingDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamera(Camera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tactile Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tactile Input Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTactileInputDevice(TactileInputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardkey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardkey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardkey(Hardkey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touchscreen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touchscreen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchscreen(Touchscreen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auditive Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auditive Input Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditiveInputDevice(AuditiveInputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophone(Microphone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proprioceptive Input Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proprioceptive Input Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprioceptiveInputDevice(ProprioceptiveInputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointing Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointing Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointingDevice(PointingDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDevice(OutputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Output Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualOutputDevice(VisualOutputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tactile Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tactile Output Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTactileOutputDevice(TactileOutputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vibration Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vibration Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVibrationMotor(VibrationMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auditive Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auditive Output Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditiveOutputDevice(AuditiveOutputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeaker(Speaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proprioceptive Output Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proprioceptive Output Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprioceptiveOutputDevice(ProprioceptiveOutputDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PlatformSwitch
