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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import platform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage
 * @generated
 */
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter casePMbase(PMbase object) {
				return createPMbaseAdapter();
			}
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseRessource(Ressource object) {
				return createRessourceAdapter();
			}
			@Override
			public Adapter caseComplexRessource(ComplexRessource object) {
				return createComplexRessourceAdapter();
			}
			@Override
			public Adapter caseGenericProperty(GenericProperty object) {
				return createGenericPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerProperty(IntegerProperty object) {
				return createIntegerPropertyAdapter();
			}
			@Override
			public Adapter caseStringProperty(StringProperty object) {
				return createStringPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanProperty(BooleanProperty object) {
				return createBooleanPropertyAdapter();
			}
			@Override
			public Adapter caseFloatProperty(FloatProperty object) {
				return createFloatPropertyAdapter();
			}
			@Override
			public Adapter caseInteractionProperty(InteractionProperty object) {
				return createInteractionPropertyAdapter();
			}
			@Override
			public Adapter caseGenericComplexRessource(GenericComplexRessource object) {
				return createGenericComplexRessourceAdapter();
			}
			@Override
			public Adapter caseMouse(Mouse object) {
				return createMouseAdapter();
			}
			@Override
			public Adapter caseKeyboard(Keyboard object) {
				return createKeyboardAdapter();
			}
			@Override
			public Adapter caseElementaryRessource(ElementaryRessource object) {
				return createElementaryRessourceAdapter();
			}
			@Override
			public Adapter caseInteractionRessource(InteractionRessource object) {
				return createInteractionRessourceAdapter();
			}
			@Override
			public Adapter caseInputDevice(InputDevice object) {
				return createInputDeviceAdapter();
			}
			@Override
			public Adapter caseElementaryTasksForInputDevices(ElementaryTasksForInputDevices object) {
				return createElementaryTasksForInputDevicesAdapter();
			}
			@Override
			public Adapter caseVisualInputDevice(VisualInputDevice object) {
				return createVisualInputDeviceAdapter();
			}
			@Override
			public Adapter caseLightingDevice(LightingDevice object) {
				return createLightingDeviceAdapter();
			}
			@Override
			public Adapter caseCamera(Camera object) {
				return createCameraAdapter();
			}
			@Override
			public Adapter caseTactileInputDevice(TactileInputDevice object) {
				return createTactileInputDeviceAdapter();
			}
			@Override
			public Adapter caseHardkey(Hardkey object) {
				return createHardkeyAdapter();
			}
			@Override
			public Adapter caseTouchscreen(Touchscreen object) {
				return createTouchscreenAdapter();
			}
			@Override
			public Adapter caseAuditiveInputDevice(AuditiveInputDevice object) {
				return createAuditiveInputDeviceAdapter();
			}
			@Override
			public Adapter caseMicrophone(Microphone object) {
				return createMicrophoneAdapter();
			}
			@Override
			public Adapter caseProprioceptiveInputDevice(ProprioceptiveInputDevice object) {
				return createProprioceptiveInputDeviceAdapter();
			}
			@Override
			public Adapter casePointingDevice(PointingDevice object) {
				return createPointingDeviceAdapter();
			}
			@Override
			public Adapter caseOutputDevice(OutputDevice object) {
				return createOutputDeviceAdapter();
			}
			@Override
			public Adapter caseVisualOutputDevice(VisualOutputDevice object) {
				return createVisualOutputDeviceAdapter();
			}
			@Override
			public Adapter caseDisplay(Display object) {
				return createDisplayAdapter();
			}
			@Override
			public Adapter caseTactileOutputDevice(TactileOutputDevice object) {
				return createTactileOutputDeviceAdapter();
			}
			@Override
			public Adapter caseVibrationMotor(VibrationMotor object) {
				return createVibrationMotorAdapter();
			}
			@Override
			public Adapter caseAuditiveOutputDevice(AuditiveOutputDevice object) {
				return createAuditiveOutputDeviceAdapter();
			}
			@Override
			public Adapter caseSpeaker(Speaker object) {
				return createSpeakerAdapter();
			}
			@Override
			public Adapter caseProprioceptiveOutputDevice(ProprioceptiveOutputDevice object) {
				return createProprioceptiveOutputDeviceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link platform.PMbase <em>PMbase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.PMbase
	 * @generated
	 */
	public Adapter createPMbaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Ressource
	 * @generated
	 */
	public Adapter createRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.ComplexRessource <em>Complex Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.ComplexRessource
	 * @generated
	 */
	public Adapter createComplexRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.GenericProperty <em>Generic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.GenericProperty
	 * @generated
	 */
	public Adapter createGenericPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.IntegerProperty <em>Integer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.IntegerProperty
	 * @generated
	 */
	public Adapter createIntegerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.StringProperty
	 * @generated
	 */
	public Adapter createStringPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.BooleanProperty
	 * @generated
	 */
	public Adapter createBooleanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.FloatProperty <em>Float Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.FloatProperty
	 * @generated
	 */
	public Adapter createFloatPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.InteractionProperty <em>Interaction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.InteractionProperty
	 * @generated
	 */
	public Adapter createInteractionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.GenericComplexRessource <em>Generic Complex Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.GenericComplexRessource
	 * @generated
	 */
	public Adapter createGenericComplexRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Mouse <em>Mouse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Mouse
	 * @generated
	 */
	public Adapter createMouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Keyboard <em>Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Keyboard
	 * @generated
	 */
	public Adapter createKeyboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.ElementaryRessource <em>Elementary Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.ElementaryRessource
	 * @generated
	 */
	public Adapter createElementaryRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.InteractionRessource <em>Interaction Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.InteractionRessource
	 * @generated
	 */
	public Adapter createInteractionRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.InputDevice <em>Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.InputDevice
	 * @generated
	 */
	public Adapter createInputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.ElementaryTasksForInputDevices <em>Elementary Tasks For Input Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.ElementaryTasksForInputDevices
	 * @generated
	 */
	public Adapter createElementaryTasksForInputDevicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.VisualInputDevice <em>Visual Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.VisualInputDevice
	 * @generated
	 */
	public Adapter createVisualInputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.LightingDevice <em>Lighting Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.LightingDevice
	 * @generated
	 */
	public Adapter createLightingDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.TactileInputDevice <em>Tactile Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.TactileInputDevice
	 * @generated
	 */
	public Adapter createTactileInputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Hardkey <em>Hardkey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Hardkey
	 * @generated
	 */
	public Adapter createHardkeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Touchscreen <em>Touchscreen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Touchscreen
	 * @generated
	 */
	public Adapter createTouchscreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.AuditiveInputDevice <em>Auditive Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.AuditiveInputDevice
	 * @generated
	 */
	public Adapter createAuditiveInputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Microphone <em>Microphone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Microphone
	 * @generated
	 */
	public Adapter createMicrophoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.ProprioceptiveInputDevice <em>Proprioceptive Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.ProprioceptiveInputDevice
	 * @generated
	 */
	public Adapter createProprioceptiveInputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.PointingDevice <em>Pointing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.PointingDevice
	 * @generated
	 */
	public Adapter createPointingDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.OutputDevice <em>Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.OutputDevice
	 * @generated
	 */
	public Adapter createOutputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.VisualOutputDevice <em>Visual Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.VisualOutputDevice
	 * @generated
	 */
	public Adapter createVisualOutputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.TactileOutputDevice <em>Tactile Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.TactileOutputDevice
	 * @generated
	 */
	public Adapter createTactileOutputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.VibrationMotor <em>Vibration Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.VibrationMotor
	 * @generated
	 */
	public Adapter createVibrationMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.AuditiveOutputDevice <em>Auditive Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.AuditiveOutputDevice
	 * @generated
	 */
	public Adapter createAuditiveOutputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.Speaker
	 * @generated
	 */
	public Adapter createSpeakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link platform.ProprioceptiveOutputDevice <em>Proprioceptive Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see platform.ProprioceptiveOutputDevice
	 * @generated
	 */
	public Adapter createProprioceptiveOutputDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlatformAdapterFactory
