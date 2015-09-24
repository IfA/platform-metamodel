/**
 */
package platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import platform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory(PlatformPackage.eNS_URI);
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatformPackage.PMBASE: return createPMbase();
			case PlatformPackage.PLATFORM: return createPlatform();
			case PlatformPackage.GENERIC_PROPERTY: return createGenericProperty();
			case PlatformPackage.INTEGER_PROPERTY: return createIntegerProperty();
			case PlatformPackage.STRING_PROPERTY: return createStringProperty();
			case PlatformPackage.BOOLEAN_PROPERTY: return createBooleanProperty();
			case PlatformPackage.FLOAT_PROPERTY: return createFloatProperty();
			case PlatformPackage.INTERACTION_PROPERTY: return createInteractionProperty();
			case PlatformPackage.GENERIC_COMPLEX_RESSOURCE: return createGenericComplexRessource();
			case PlatformPackage.MOUSE: return createMouse();
			case PlatformPackage.KEYBOARD: return createKeyboard();
			case PlatformPackage.VISUAL_INPUT_DEVICE: return createVisualInputDevice();
			case PlatformPackage.LIGHTING_DEVICE: return createLightingDevice();
			case PlatformPackage.CAMERA: return createCamera();
			case PlatformPackage.TACTILE_INPUT_DEVICE: return createTactileInputDevice();
			case PlatformPackage.HARDKEY: return createHardkey();
			case PlatformPackage.TOUCHSCREEN: return createTouchscreen();
			case PlatformPackage.AUDITIVE_INPUT_DEVICE: return createAuditiveInputDevice();
			case PlatformPackage.MICROPHONE: return createMicrophone();
			case PlatformPackage.PROPRIOCEPTIVE_INPUT_DEVICE: return createProprioceptiveInputDevice();
			case PlatformPackage.POINTING_DEVICE: return createPointingDevice();
			case PlatformPackage.VISUAL_OUTPUT_DEVICE: return createVisualOutputDevice();
			case PlatformPackage.DISPLAY: return createDisplay();
			case PlatformPackage.TACTILE_OUTPUT_DEVICE: return createTactileOutputDevice();
			case PlatformPackage.VIBRATION_MOTOR: return createVibrationMotor();
			case PlatformPackage.AUDITIVE_OUTPUT_DEVICE: return createAuditiveOutputDevice();
			case PlatformPackage.SPEAKER: return createSpeaker();
			case PlatformPackage.PROPRIOCEPTIVE_OUTPUT_DEVICE: return createProprioceptiveOutputDevice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlatformPackage.PLATFORM_TYPE:
				return createPlatformTypeFromString(eDataType, initialValue);
			case PlatformPackage.INTERACTION_MODALITY:
				return createInteractionModalityFromString(eDataType, initialValue);
			case PlatformPackage.SENSIBILITY:
				return createSensibilityFromString(eDataType, initialValue);
			case PlatformPackage.KEYBOARD_TYPE:
				return createKeyboardTypeFromString(eDataType, initialValue);
			case PlatformPackage.ELEMENTARY_TASK_EVALUATION:
				return createElementaryTaskEvaluationFromString(eDataType, initialValue);
			case PlatformPackage.HARDKEY_TYPE:
				return createHardkeyTypeFromString(eDataType, initialValue);
			case PlatformPackage.SIZE_EVALUATION:
				return createSizeEvaluationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlatformPackage.PLATFORM_TYPE:
				return convertPlatformTypeToString(eDataType, instanceValue);
			case PlatformPackage.INTERACTION_MODALITY:
				return convertInteractionModalityToString(eDataType, instanceValue);
			case PlatformPackage.SENSIBILITY:
				return convertSensibilityToString(eDataType, instanceValue);
			case PlatformPackage.KEYBOARD_TYPE:
				return convertKeyboardTypeToString(eDataType, instanceValue);
			case PlatformPackage.ELEMENTARY_TASK_EVALUATION:
				return convertElementaryTaskEvaluationToString(eDataType, instanceValue);
			case PlatformPackage.HARDKEY_TYPE:
				return convertHardkeyTypeToString(eDataType, instanceValue);
			case PlatformPackage.SIZE_EVALUATION:
				return convertSizeEvaluationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMbase createPMbase() {
		PMbaseImpl pMbase = new PMbaseImpl();
		return pMbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericProperty createGenericProperty() {
		GenericPropertyImpl genericProperty = new GenericPropertyImpl();
		return genericProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerProperty createIntegerProperty() {
		IntegerPropertyImpl integerProperty = new IntegerPropertyImpl();
		return integerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringProperty createStringProperty() {
		StringPropertyImpl stringProperty = new StringPropertyImpl();
		return stringProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanProperty createBooleanProperty() {
		BooleanPropertyImpl booleanProperty = new BooleanPropertyImpl();
		return booleanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatProperty createFloatProperty() {
		FloatPropertyImpl floatProperty = new FloatPropertyImpl();
		return floatProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProperty createInteractionProperty() {
		InteractionPropertyImpl interactionProperty = new InteractionPropertyImpl();
		return interactionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericComplexRessource createGenericComplexRessource() {
		GenericComplexRessourceImpl genericComplexRessource = new GenericComplexRessourceImpl();
		return genericComplexRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mouse createMouse() {
		MouseImpl mouse = new MouseImpl();
		return mouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyboard createKeyboard() {
		KeyboardImpl keyboard = new KeyboardImpl();
		return keyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualInputDevice createVisualInputDevice() {
		VisualInputDeviceImpl visualInputDevice = new VisualInputDeviceImpl();
		return visualInputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightingDevice createLightingDevice() {
		LightingDeviceImpl lightingDevice = new LightingDeviceImpl();
		return lightingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TactileInputDevice createTactileInputDevice() {
		TactileInputDeviceImpl tactileInputDevice = new TactileInputDeviceImpl();
		return tactileInputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardkey createHardkey() {
		HardkeyImpl hardkey = new HardkeyImpl();
		return hardkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touchscreen createTouchscreen() {
		TouchscreenImpl touchscreen = new TouchscreenImpl();
		return touchscreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditiveInputDevice createAuditiveInputDevice() {
		AuditiveInputDeviceImpl auditiveInputDevice = new AuditiveInputDeviceImpl();
		return auditiveInputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microphone createMicrophone() {
		MicrophoneImpl microphone = new MicrophoneImpl();
		return microphone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprioceptiveInputDevice createProprioceptiveInputDevice() {
		ProprioceptiveInputDeviceImpl proprioceptiveInputDevice = new ProprioceptiveInputDeviceImpl();
		return proprioceptiveInputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointingDevice createPointingDevice() {
		PointingDeviceImpl pointingDevice = new PointingDeviceImpl();
		return pointingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualOutputDevice createVisualOutputDevice() {
		VisualOutputDeviceImpl visualOutputDevice = new VisualOutputDeviceImpl();
		return visualOutputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TactileOutputDevice createTactileOutputDevice() {
		TactileOutputDeviceImpl tactileOutputDevice = new TactileOutputDeviceImpl();
		return tactileOutputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VibrationMotor createVibrationMotor() {
		VibrationMotorImpl vibrationMotor = new VibrationMotorImpl();
		return vibrationMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditiveOutputDevice createAuditiveOutputDevice() {
		AuditiveOutputDeviceImpl auditiveOutputDevice = new AuditiveOutputDeviceImpl();
		return auditiveOutputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker createSpeaker() {
		SpeakerImpl speaker = new SpeakerImpl();
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprioceptiveOutputDevice createProprioceptiveOutputDevice() {
		ProprioceptiveOutputDeviceImpl proprioceptiveOutputDevice = new ProprioceptiveOutputDeviceImpl();
		return proprioceptiveOutputDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformType createPlatformTypeFromString(EDataType eDataType, String initialValue) {
		PlatformType result = PlatformType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModality createInteractionModalityFromString(EDataType eDataType, String initialValue) {
		InteractionModality result = InteractionModality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensibility createSensibilityFromString(EDataType eDataType, String initialValue) {
		Sensibility result = Sensibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyboardType createKeyboardTypeFromString(EDataType eDataType, String initialValue) {
		KeyboardType result = KeyboardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyboardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation createElementaryTaskEvaluationFromString(EDataType eDataType, String initialValue) {
		ElementaryTaskEvaluation result = ElementaryTaskEvaluation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementaryTaskEvaluationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardkeyType createHardkeyTypeFromString(EDataType eDataType, String initialValue) {
		HardkeyType result = HardkeyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHardkeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeEvaluation createSizeEvaluationFromString(EDataType eDataType, String initialValue) {
		SizeEvaluation result = SizeEvaluation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeEvaluationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
