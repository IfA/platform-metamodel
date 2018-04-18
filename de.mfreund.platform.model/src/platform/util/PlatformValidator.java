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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import platform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage
 * @generated
 */
public class PlatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PlatformValidator INSTANCE = new PlatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "platform";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Left Unequal Right' of 'Mouse'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOUSE__LEFT_UNEQUAL_RIGHT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PlatformPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PlatformPackage.PMBASE:
				return validatePMbase((PMbase)value, diagnostics, context);
			case PlatformPackage.PLATFORM:
				return validatePlatform((Platform)value, diagnostics, context);
			case PlatformPackage.RESSOURCE:
				return validateRessource((Ressource)value, diagnostics, context);
			case PlatformPackage.COMPLEX_RESSOURCE:
				return validateComplexRessource((ComplexRessource)value, diagnostics, context);
			case PlatformPackage.GENERIC_PROPERTY:
				return validateGenericProperty((GenericProperty)value, diagnostics, context);
			case PlatformPackage.INTEGER_PROPERTY:
				return validateIntegerProperty((IntegerProperty)value, diagnostics, context);
			case PlatformPackage.STRING_PROPERTY:
				return validateStringProperty((StringProperty)value, diagnostics, context);
			case PlatformPackage.BOOLEAN_PROPERTY:
				return validateBooleanProperty((BooleanProperty)value, diagnostics, context);
			case PlatformPackage.FLOAT_PROPERTY:
				return validateFloatProperty((FloatProperty)value, diagnostics, context);
			case PlatformPackage.INTERACTION_PROPERTY:
				return validateInteractionProperty((InteractionProperty)value, diagnostics, context);
			case PlatformPackage.GENERIC_COMPLEX_RESSOURCE:
				return validateGenericComplexRessource((GenericComplexRessource)value, diagnostics, context);
			case PlatformPackage.MOUSE:
				return validateMouse((Mouse)value, diagnostics, context);
			case PlatformPackage.KEYBOARD:
				return validateKeyboard((Keyboard)value, diagnostics, context);
			case PlatformPackage.ELEMENTARY_RESSOURCE:
				return validateElementaryRessource((ElementaryRessource)value, diagnostics, context);
			case PlatformPackage.INTERACTION_RESSOURCE:
				return validateInteractionRessource((InteractionRessource)value, diagnostics, context);
			case PlatformPackage.INPUT_DEVICE:
				return validateInputDevice((InputDevice)value, diagnostics, context);
			case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES:
				return validateElementaryTasksForInputDevices((ElementaryTasksForInputDevices)value, diagnostics, context);
			case PlatformPackage.VISUAL_INPUT_DEVICE:
				return validateVisualInputDevice((VisualInputDevice)value, diagnostics, context);
			case PlatformPackage.LIGHTING_DEVICE:
				return validateLightingDevice((LightingDevice)value, diagnostics, context);
			case PlatformPackage.CAMERA:
				return validateCamera((Camera)value, diagnostics, context);
			case PlatformPackage.TACTILE_INPUT_DEVICE:
				return validateTactileInputDevice((TactileInputDevice)value, diagnostics, context);
			case PlatformPackage.HARDKEY:
				return validateHardkey((Hardkey)value, diagnostics, context);
			case PlatformPackage.TOUCHSCREEN:
				return validateTouchscreen((Touchscreen)value, diagnostics, context);
			case PlatformPackage.AUDITIVE_INPUT_DEVICE:
				return validateAuditiveInputDevice((AuditiveInputDevice)value, diagnostics, context);
			case PlatformPackage.MICROPHONE:
				return validateMicrophone((Microphone)value, diagnostics, context);
			case PlatformPackage.PROPRIOCEPTIVE_INPUT_DEVICE:
				return validateProprioceptiveInputDevice((ProprioceptiveInputDevice)value, diagnostics, context);
			case PlatformPackage.POINTING_DEVICE:
				return validatePointingDevice((PointingDevice)value, diagnostics, context);
			case PlatformPackage.OUTPUT_DEVICE:
				return validateOutputDevice((OutputDevice)value, diagnostics, context);
			case PlatformPackage.VISUAL_OUTPUT_DEVICE:
				return validateVisualOutputDevice((VisualOutputDevice)value, diagnostics, context);
			case PlatformPackage.DISPLAY:
				return validateDisplay((Display)value, diagnostics, context);
			case PlatformPackage.TACTILE_OUTPUT_DEVICE:
				return validateTactileOutputDevice((TactileOutputDevice)value, diagnostics, context);
			case PlatformPackage.VIBRATION_MOTOR:
				return validateVibrationMotor((VibrationMotor)value, diagnostics, context);
			case PlatformPackage.AUDITIVE_OUTPUT_DEVICE:
				return validateAuditiveOutputDevice((AuditiveOutputDevice)value, diagnostics, context);
			case PlatformPackage.SPEAKER:
				return validateSpeaker((Speaker)value, diagnostics, context);
			case PlatformPackage.PROPRIOCEPTIVE_OUTPUT_DEVICE:
				return validateProprioceptiveOutputDevice((ProprioceptiveOutputDevice)value, diagnostics, context);
			case PlatformPackage.PLATFORM_TYPE:
				return validatePlatformType((PlatformType)value, diagnostics, context);
			case PlatformPackage.INTERACTION_MODALITY:
				return validateInteractionModality((InteractionModality)value, diagnostics, context);
			case PlatformPackage.SENSIBILITY:
				return validateSensibility((Sensibility)value, diagnostics, context);
			case PlatformPackage.KEYBOARD_TYPE:
				return validateKeyboardType((KeyboardType)value, diagnostics, context);
			case PlatformPackage.ELEMENTARY_TASK_EVALUATION:
				return validateElementaryTaskEvaluation((ElementaryTaskEvaluation)value, diagnostics, context);
			case PlatformPackage.HARDKEY_TYPE:
				return validateHardkeyType((HardkeyType)value, diagnostics, context);
			case PlatformPackage.SIZE_EVALUATION:
				return validateSizeEvaluation((SizeEvaluation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePMbase(PMbase pMbase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pMbase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(platform, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(platform, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatform_test(platform, diagnostics, context);
		return result;
	}

	/**
	 * Validates the test constraint of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform_test(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "test", getObjectLabel(platform, context) },
						 new Object[] { platform },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ressource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexRessource(ComplexRessource complexRessource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexRessource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericProperty(GenericProperty genericProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerProperty(IntegerProperty integerProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringProperty(StringProperty stringProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanProperty(BooleanProperty booleanProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatProperty(FloatProperty floatProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProperty(InteractionProperty interactionProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericComplexRessource(GenericComplexRessource genericComplexRessource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericComplexRessource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMouse(Mouse mouse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mouse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mouse, diagnostics, context);
		if (result || diagnostics != null) result &= validateMouse_leftUnequalRight(mouse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the leftUnequalRight constraint of '<em>Mouse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMouse_leftUnequalRight(Mouse mouse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mouse.leftUnequalRight(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyboard(Keyboard keyboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyboard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementaryRessource(ElementaryRessource elementaryRessource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementaryRessource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionRessource(InteractionRessource interactionRessource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionRessource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputDevice(InputDevice inputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementaryTasksForInputDevices(ElementaryTasksForInputDevices elementaryTasksForInputDevices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementaryTasksForInputDevices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualInputDevice(VisualInputDevice visualInputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visualInputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightingDevice(LightingDevice lightingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightingDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCamera(Camera camera, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(camera, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTactileInputDevice(TactileInputDevice tactileInputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tactileInputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardkey(Hardkey hardkey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardkey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTouchscreen(Touchscreen touchscreen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(touchscreen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditiveInputDevice(AuditiveInputDevice auditiveInputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditiveInputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrophone(Microphone microphone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microphone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProprioceptiveInputDevice(ProprioceptiveInputDevice proprioceptiveInputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proprioceptiveInputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointingDevice(PointingDevice pointingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointingDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDevice(OutputDevice outputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualOutputDevice(VisualOutputDevice visualOutputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visualOutputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplay(Display display, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(display, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTactileOutputDevice(TactileOutputDevice tactileOutputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tactileOutputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVibrationMotor(VibrationMotor vibrationMotor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vibrationMotor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditiveOutputDevice(AuditiveOutputDevice auditiveOutputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditiveOutputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeaker(Speaker speaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speaker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProprioceptiveOutputDevice(ProprioceptiveOutputDevice proprioceptiveOutputDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proprioceptiveOutputDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformType(PlatformType platformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionModality(InteractionModality interactionModality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensibility(Sensibility sensibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyboardType(KeyboardType keyboardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementaryTaskEvaluation(ElementaryTaskEvaluation elementaryTaskEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardkeyType(HardkeyType hardkeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeEvaluation(SizeEvaluation sizeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PlatformValidator
