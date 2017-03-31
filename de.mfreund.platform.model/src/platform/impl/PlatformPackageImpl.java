/**
 */
package platform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import platform.AuditiveInputDevice;
import platform.AuditiveOutputDevice;
import platform.BooleanProperty;
import platform.Camera;
import platform.ComplexRessource;
import platform.Display;
import platform.ElementaryRessource;
import platform.ElementaryTaskEvaluation;
import platform.ElementaryTasksForInputDevices;
import platform.FloatProperty;
import platform.GenericComplexRessource;
import platform.GenericProperty;
import platform.Hardkey;
import platform.HardkeyType;
import platform.InputDevice;
import platform.IntegerProperty;
import platform.InteractionModality;
import platform.InteractionProperty;
import platform.InteractionRessource;
import platform.Keyboard;
import platform.KeyboardType;
import platform.LightingDevice;
import platform.Microphone;
import platform.Mouse;
import platform.OutputDevice;
import platform.PMbase;
import platform.Platform;
import platform.PlatformFactory;
import platform.PlatformPackage;
import platform.PlatformType;
import platform.PointingDevice;
import platform.ProprioceptiveInputDevice;
import platform.ProprioceptiveOutputDevice;
import platform.Ressource;
import platform.Sensibility;
import platform.SizeEvaluation;
import platform.Speaker;
import platform.StringProperty;
import platform.TactileInputDevice;
import platform.TactileOutputDevice;
import platform.Touchscreen;
import platform.VibrationMotor;
import platform.VisualInputDevice;
import platform.VisualOutputDevice;

import platform.util.PlatformValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pMbaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexRessourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericComplexRessourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryRessourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionRessourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryTasksForInputDevicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualInputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightingDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tactileInputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardkeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchscreenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditiveInputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprioceptiveInputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointingDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualOutputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tactileOutputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vibrationMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditiveOutputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprioceptiveOutputDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum platformTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionModalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyboardTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementaryTaskEvaluationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardkeyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEvaluationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlatformPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlatformPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PlatformValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatformPackage.eNS_URI, thePlatformPackage);
		return thePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMbase() {
		return pMbaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMbase_PlatformCollection() {
		return (EReference)pMbaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMbase_RessourceCollection() {
		return (EReference)pMbaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_PlatformName() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_PlatformId() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_PlatformType() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_Ressources() {
		return (EReference)platformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_GenericProperty() {
		return (EReference)platformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_RessourceName() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessource_GenericProperty() {
		return (EReference)ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexRessource() {
		return complexRessourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexRessource_SubRessources() {
		return (EReference)complexRessourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericProperty() {
		return genericPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericProperty_PropertyName() {
		return (EAttribute)genericPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericProperty_PropertyUnit() {
		return (EAttribute)genericPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerProperty() {
		return integerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerProperty_IntegerValue() {
		return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringProperty() {
		return stringPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringProperty_StringValue() {
		return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanProperty() {
		return booleanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanProperty_BooleanValue() {
		return (EAttribute)booleanPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatProperty() {
		return floatPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatProperty_FloatValue() {
		return (EAttribute)floatPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionProperty() {
		return interactionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionProperty_InteractionModality() {
		return (EAttribute)interactionPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericComplexRessource() {
		return genericComplexRessourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMouse() {
		return mouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_MouseSensibility() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_UsableForTranspartentSurface() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_UsableForSmoothSurface() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMouse_MainPointingDevice() {
		return (EReference)mouseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMouse_LeftMousebutton() {
		return (EReference)mouseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMouse_RightMousebutton() {
		return (EReference)mouseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMouse__LeftUnequalRight__DiagnosticChain_Map() {
		return mouseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyboard() {
		return keyboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_KeyboardType() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_KeyboardTypeExtraInfo() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_FastTextInput() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_EasyTextInput() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyboard_Hardkeys() {
		return (EReference)keyboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryRessource() {
		return elementaryRessourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionRessource() {
		return interactionRessourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDevice() {
		return inputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDevice_SafeForUnwantedActions() {
		return (EAttribute)inputDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDevice_UsableWithGloves() {
		return (EAttribute)inputDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDevice_UsableWithOneHand() {
		return (EAttribute)inputDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryTasksForInputDevices() {
		return elementaryTasksForInputDevicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryTasksForInputDevices_FastPointingCapable() {
		return (EAttribute)elementaryTasksForInputDevicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryTasksForInputDevices_AccuratePointingCapable() {
		return (EAttribute)elementaryTasksForInputDevicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryTasksForInputDevices_SelectingCapable() {
		return (EAttribute)elementaryTasksForInputDevicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryTasksForInputDevices_DrawingCapable() {
		return (EAttribute)elementaryTasksForInputDevicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryTasksForInputDevices_FastDrawingCapable() {
		return (EAttribute)elementaryTasksForInputDevicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryTasksForInputDevices_AlphanumericCapable() {
		return (EAttribute)elementaryTasksForInputDevicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualInputDevice() {
		return visualInputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightingDevice() {
		return lightingDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingDevice_LightningType() {
		return (EAttribute)lightingDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingDevice_LightSize() {
		return (EAttribute)lightingDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightingDevice_MultiColorConfigurable() {
		return (EAttribute)lightingDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCamera() {
		return cameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTactileInputDevice() {
		return tactileInputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardkey() {
		return hardkeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardkey_ButtonSymbol() {
		return (EAttribute)hardkeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardkey_ButtonColor() {
		return (EAttribute)hardkeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardkey_ButtonSize() {
		return (EAttribute)hardkeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardkey_HardkeyType() {
		return (EAttribute)hardkeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardkey_Configurable() {
		return (EAttribute)hardkeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchscreen() {
		return touchscreenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_XPixel() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_YPixel() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_Height() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_Width() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_ForceForActuating() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_UsableWithPen() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_MultiTouchCapable() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_TactileFeedbackCapable() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_TouchGestureRecognition() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchscreen_ClosenessRecognition() {
		return (EAttribute)touchscreenEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchscreen_CorrespondDisplay() {
		return (EReference)touchscreenEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditiveInputDevice() {
		return auditiveInputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophone() {
		return microphoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProprioceptiveInputDevice() {
		return proprioceptiveInputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointingDevice() {
		return pointingDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointingDevice_HasHighPrecision() {
		return (EAttribute)pointingDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointingDevice_DegreesOfFreedom() {
		return (EAttribute)pointingDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDevice() {
		return outputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualOutputDevice() {
		return visualOutputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_XPixel() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_YPixel() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_Height() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_Width() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_IsColorCapable() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_IsImagesCapable() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_IsVideosCapable() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTactileOutputDevice() {
		return tactileOutputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVibrationMotor() {
		return vibrationMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditiveOutputDevice() {
		return auditiveOutputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeaker() {
		return speakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProprioceptiveOutputDevice() {
		return proprioceptiveOutputDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlatformType() {
		return platformTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionModality() {
		return interactionModalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensibility() {
		return sensibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeyboardType() {
		return keyboardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementaryTaskEvaluation() {
		return elementaryTaskEvaluationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHardkeyType() {
		return hardkeyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizeEvaluation() {
		return sizeEvaluationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pMbaseEClass = createEClass(PMBASE);
		createEReference(pMbaseEClass, PMBASE__PLATFORM_COLLECTION);
		createEReference(pMbaseEClass, PMBASE__RESSOURCE_COLLECTION);

		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__PLATFORM_NAME);
		createEAttribute(platformEClass, PLATFORM__PLATFORM_ID);
		createEAttribute(platformEClass, PLATFORM__PLATFORM_TYPE);
		createEReference(platformEClass, PLATFORM__RESSOURCES);
		createEReference(platformEClass, PLATFORM__GENERIC_PROPERTY);

		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__RESSOURCE_NAME);
		createEReference(ressourceEClass, RESSOURCE__GENERIC_PROPERTY);

		complexRessourceEClass = createEClass(COMPLEX_RESSOURCE);
		createEReference(complexRessourceEClass, COMPLEX_RESSOURCE__SUB_RESSOURCES);

		genericPropertyEClass = createEClass(GENERIC_PROPERTY);
		createEAttribute(genericPropertyEClass, GENERIC_PROPERTY__PROPERTY_NAME);
		createEAttribute(genericPropertyEClass, GENERIC_PROPERTY__PROPERTY_UNIT);

		integerPropertyEClass = createEClass(INTEGER_PROPERTY);
		createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__INTEGER_VALUE);

		stringPropertyEClass = createEClass(STRING_PROPERTY);
		createEAttribute(stringPropertyEClass, STRING_PROPERTY__STRING_VALUE);

		booleanPropertyEClass = createEClass(BOOLEAN_PROPERTY);
		createEAttribute(booleanPropertyEClass, BOOLEAN_PROPERTY__BOOLEAN_VALUE);

		floatPropertyEClass = createEClass(FLOAT_PROPERTY);
		createEAttribute(floatPropertyEClass, FLOAT_PROPERTY__FLOAT_VALUE);

		interactionPropertyEClass = createEClass(INTERACTION_PROPERTY);
		createEAttribute(interactionPropertyEClass, INTERACTION_PROPERTY__INTERACTION_MODALITY);

		genericComplexRessourceEClass = createEClass(GENERIC_COMPLEX_RESSOURCE);

		mouseEClass = createEClass(MOUSE);
		createEAttribute(mouseEClass, MOUSE__MOUSE_SENSIBILITY);
		createEAttribute(mouseEClass, MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE);
		createEAttribute(mouseEClass, MOUSE__USABLE_FOR_SMOOTH_SURFACE);
		createEReference(mouseEClass, MOUSE__MAIN_POINTING_DEVICE);
		createEReference(mouseEClass, MOUSE__LEFT_MOUSEBUTTON);
		createEReference(mouseEClass, MOUSE__RIGHT_MOUSEBUTTON);
		createEOperation(mouseEClass, MOUSE___LEFT_UNEQUAL_RIGHT__DIAGNOSTICCHAIN_MAP);

		keyboardEClass = createEClass(KEYBOARD);
		createEAttribute(keyboardEClass, KEYBOARD__KEYBOARD_TYPE);
		createEAttribute(keyboardEClass, KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO);
		createEAttribute(keyboardEClass, KEYBOARD__FAST_TEXT_INPUT);
		createEAttribute(keyboardEClass, KEYBOARD__EASY_TEXT_INPUT);
		createEReference(keyboardEClass, KEYBOARD__HARDKEYS);

		elementaryRessourceEClass = createEClass(ELEMENTARY_RESSOURCE);

		interactionRessourceEClass = createEClass(INTERACTION_RESSOURCE);

		inputDeviceEClass = createEClass(INPUT_DEVICE);
		createEAttribute(inputDeviceEClass, INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS);
		createEAttribute(inputDeviceEClass, INPUT_DEVICE__USABLE_WITH_GLOVES);
		createEAttribute(inputDeviceEClass, INPUT_DEVICE__USABLE_WITH_ONE_HAND);

		elementaryTasksForInputDevicesEClass = createEClass(ELEMENTARY_TASKS_FOR_INPUT_DEVICES);
		createEAttribute(elementaryTasksForInputDevicesEClass, ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE);
		createEAttribute(elementaryTasksForInputDevicesEClass, ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE);
		createEAttribute(elementaryTasksForInputDevicesEClass, ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE);
		createEAttribute(elementaryTasksForInputDevicesEClass, ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE);
		createEAttribute(elementaryTasksForInputDevicesEClass, ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE);
		createEAttribute(elementaryTasksForInputDevicesEClass, ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE);

		visualInputDeviceEClass = createEClass(VISUAL_INPUT_DEVICE);

		lightingDeviceEClass = createEClass(LIGHTING_DEVICE);
		createEAttribute(lightingDeviceEClass, LIGHTING_DEVICE__LIGHTNING_TYPE);
		createEAttribute(lightingDeviceEClass, LIGHTING_DEVICE__LIGHT_SIZE);
		createEAttribute(lightingDeviceEClass, LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE);

		cameraEClass = createEClass(CAMERA);

		tactileInputDeviceEClass = createEClass(TACTILE_INPUT_DEVICE);

		hardkeyEClass = createEClass(HARDKEY);
		createEAttribute(hardkeyEClass, HARDKEY__BUTTON_SYMBOL);
		createEAttribute(hardkeyEClass, HARDKEY__BUTTON_COLOR);
		createEAttribute(hardkeyEClass, HARDKEY__BUTTON_SIZE);
		createEAttribute(hardkeyEClass, HARDKEY__HARDKEY_TYPE);
		createEAttribute(hardkeyEClass, HARDKEY__CONFIGURABLE);

		touchscreenEClass = createEClass(TOUCHSCREEN);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__XPIXEL);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__YPIXEL);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__HEIGHT);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__WIDTH);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__FORCE_FOR_ACTUATING);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__USABLE_WITH_PEN);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__MULTI_TOUCH_CAPABLE);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION);
		createEAttribute(touchscreenEClass, TOUCHSCREEN__CLOSENESS_RECOGNITION);
		createEReference(touchscreenEClass, TOUCHSCREEN__CORRESPOND_DISPLAY);

		auditiveInputDeviceEClass = createEClass(AUDITIVE_INPUT_DEVICE);

		microphoneEClass = createEClass(MICROPHONE);

		proprioceptiveInputDeviceEClass = createEClass(PROPRIOCEPTIVE_INPUT_DEVICE);

		pointingDeviceEClass = createEClass(POINTING_DEVICE);
		createEAttribute(pointingDeviceEClass, POINTING_DEVICE__HAS_HIGH_PRECISION);
		createEAttribute(pointingDeviceEClass, POINTING_DEVICE__DEGREES_OF_FREEDOM);

		outputDeviceEClass = createEClass(OUTPUT_DEVICE);

		visualOutputDeviceEClass = createEClass(VISUAL_OUTPUT_DEVICE);

		displayEClass = createEClass(DISPLAY);
		createEAttribute(displayEClass, DISPLAY__XPIXEL);
		createEAttribute(displayEClass, DISPLAY__YPIXEL);
		createEAttribute(displayEClass, DISPLAY__HEIGHT);
		createEAttribute(displayEClass, DISPLAY__WIDTH);
		createEAttribute(displayEClass, DISPLAY__IS_COLOR_CAPABLE);
		createEAttribute(displayEClass, DISPLAY__IS_IMAGES_CAPABLE);
		createEAttribute(displayEClass, DISPLAY__IS_VIDEOS_CAPABLE);

		tactileOutputDeviceEClass = createEClass(TACTILE_OUTPUT_DEVICE);

		vibrationMotorEClass = createEClass(VIBRATION_MOTOR);

		auditiveOutputDeviceEClass = createEClass(AUDITIVE_OUTPUT_DEVICE);

		speakerEClass = createEClass(SPEAKER);

		proprioceptiveOutputDeviceEClass = createEClass(PROPRIOCEPTIVE_OUTPUT_DEVICE);

		// Create enums
		platformTypeEEnum = createEEnum(PLATFORM_TYPE);
		interactionModalityEEnum = createEEnum(INTERACTION_MODALITY);
		sensibilityEEnum = createEEnum(SENSIBILITY);
		keyboardTypeEEnum = createEEnum(KEYBOARD_TYPE);
		elementaryTaskEvaluationEEnum = createEEnum(ELEMENTARY_TASK_EVALUATION);
		hardkeyTypeEEnum = createEEnum(HARDKEY_TYPE);
		sizeEvaluationEEnum = createEEnum(SIZE_EVALUATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		complexRessourceEClass.getESuperTypes().add(this.getRessource());
		integerPropertyEClass.getESuperTypes().add(this.getGenericProperty());
		stringPropertyEClass.getESuperTypes().add(this.getGenericProperty());
		booleanPropertyEClass.getESuperTypes().add(this.getGenericProperty());
		floatPropertyEClass.getESuperTypes().add(this.getGenericProperty());
		interactionPropertyEClass.getESuperTypes().add(this.getGenericProperty());
		genericComplexRessourceEClass.getESuperTypes().add(this.getComplexRessource());
		mouseEClass.getESuperTypes().add(this.getComplexRessource());
		keyboardEClass.getESuperTypes().add(this.getComplexRessource());
		elementaryRessourceEClass.getESuperTypes().add(this.getRessource());
		interactionRessourceEClass.getESuperTypes().add(this.getElementaryRessource());
		inputDeviceEClass.getESuperTypes().add(this.getInteractionRessource());
		inputDeviceEClass.getESuperTypes().add(this.getElementaryTasksForInputDevices());
		visualInputDeviceEClass.getESuperTypes().add(this.getInputDevice());
		lightingDeviceEClass.getESuperTypes().add(this.getVisualOutputDevice());
		cameraEClass.getESuperTypes().add(this.getVisualInputDevice());
		tactileInputDeviceEClass.getESuperTypes().add(this.getInputDevice());
		hardkeyEClass.getESuperTypes().add(this.getTactileInputDevice());
		touchscreenEClass.getESuperTypes().add(this.getTactileInputDevice());
		auditiveInputDeviceEClass.getESuperTypes().add(this.getInputDevice());
		microphoneEClass.getESuperTypes().add(this.getAuditiveInputDevice());
		proprioceptiveInputDeviceEClass.getESuperTypes().add(this.getInputDevice());
		pointingDeviceEClass.getESuperTypes().add(this.getInputDevice());
		outputDeviceEClass.getESuperTypes().add(this.getInteractionRessource());
		visualOutputDeviceEClass.getESuperTypes().add(this.getOutputDevice());
		displayEClass.getESuperTypes().add(this.getVisualOutputDevice());
		tactileOutputDeviceEClass.getESuperTypes().add(this.getOutputDevice());
		vibrationMotorEClass.getESuperTypes().add(this.getTactileOutputDevice());
		auditiveOutputDeviceEClass.getESuperTypes().add(this.getOutputDevice());
		speakerEClass.getESuperTypes().add(this.getAuditiveOutputDevice());
		proprioceptiveOutputDeviceEClass.getESuperTypes().add(this.getOutputDevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(pMbaseEClass, PMbase.class, "PMbase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPMbase_PlatformCollection(), this.getPlatform(), null, "platformCollection", null, 0, -1, PMbase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMbase_RessourceCollection(), this.getRessource(), null, "ressourceCollection", null, 0, -1, PMbase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_PlatformName(), ecorePackage.getEString(), "platformName", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_PlatformId(), ecorePackage.getEInt(), "platformId", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_PlatformType(), this.getPlatformType(), "platformType", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Ressources(), this.getRessource(), null, "ressources", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_GenericProperty(), this.getGenericProperty(), null, "genericProperty", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceEClass, Ressource.class, "Ressource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_RessourceName(), ecorePackage.getEString(), "ressourceName", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRessource_GenericProperty(), this.getGenericProperty(), null, "genericProperty", null, 0, -1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexRessourceEClass, ComplexRessource.class, "ComplexRessource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexRessource_SubRessources(), this.getRessource(), null, "subRessources", null, 0, -1, ComplexRessource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericPropertyEClass, GenericProperty.class, "GenericProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericProperty_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, GenericProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericProperty_PropertyUnit(), ecorePackage.getEString(), "propertyUnit", null, 0, 1, GenericProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerPropertyEClass, IntegerProperty.class, "IntegerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerProperty_IntegerValue(), ecorePackage.getEInt(), "integerValue", null, 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringProperty_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanPropertyEClass, BooleanProperty.class, "BooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanProperty_BooleanValue(), ecorePackage.getEBoolean(), "booleanValue", null, 0, 1, BooleanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatPropertyEClass, FloatProperty.class, "FloatProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatProperty_FloatValue(), ecorePackage.getEFloat(), "floatValue", null, 0, 1, FloatProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionPropertyEClass, InteractionProperty.class, "InteractionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionProperty_InteractionModality(), this.getInteractionModality(), "interactionModality", "none", 0, 1, InteractionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericComplexRessourceEClass, GenericComplexRessource.class, "GenericComplexRessource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mouseEClass, Mouse.class, "Mouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMouse_MouseSensibility(), this.getSensibility(), "mouseSensibility", "other", 0, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMouse_UsableForTranspartentSurface(), ecorePackage.getEBoolean(), "usableForTranspartentSurface", "true", 0, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMouse_UsableForSmoothSurface(), ecorePackage.getEBoolean(), "usableForSmoothSurface", "true", 0, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMouse_MainPointingDevice(), this.getPointingDevice(), null, "mainPointingDevice", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMouse_LeftMousebutton(), this.getHardkey(), null, "leftMousebutton", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMouse_RightMousebutton(), this.getHardkey(), null, "rightMousebutton", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMouse__LeftUnequalRight__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "leftUnequalRight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(keyboardEClass, Keyboard.class, "Keyboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyboard_KeyboardType(), this.getKeyboardType(), "keyboardType", null, 0, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_KeyboardTypeExtraInfo(), ecorePackage.getEString(), "keyboardTypeExtraInfo", null, 0, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_FastTextInput(), ecorePackage.getEBoolean(), "fastTextInput", "false", 0, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_EasyTextInput(), ecorePackage.getEBoolean(), "easyTextInput", "false", 0, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyboard_Hardkeys(), this.getHardkey(), null, "hardkeys", null, 0, -1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryRessourceEClass, ElementaryRessource.class, "ElementaryRessource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionRessourceEClass, InteractionRessource.class, "InteractionRessource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDeviceEClass, InputDevice.class, "InputDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputDevice_SafeForUnwantedActions(), ecorePackage.getEBoolean(), "safeForUnwantedActions", null, 0, 1, InputDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDevice_UsableWithGloves(), ecorePackage.getEBoolean(), "usableWithGloves", null, 0, 1, InputDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDevice_UsableWithOneHand(), ecorePackage.getEBoolean(), "usableWithOneHand", "true", 0, 1, InputDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryTasksForInputDevicesEClass, ElementaryTasksForInputDevices.class, "ElementaryTasksForInputDevices", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementaryTasksForInputDevices_FastPointingCapable(), this.getElementaryTaskEvaluation(), "fastPointingCapable", null, 0, 1, ElementaryTasksForInputDevices.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryTasksForInputDevices_AccuratePointingCapable(), this.getElementaryTaskEvaluation(), "accuratePointingCapable", null, 0, 1, ElementaryTasksForInputDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryTasksForInputDevices_SelectingCapable(), this.getElementaryTaskEvaluation(), "selectingCapable", null, 0, 1, ElementaryTasksForInputDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryTasksForInputDevices_DrawingCapable(), this.getElementaryTaskEvaluation(), "drawingCapable", null, 0, 1, ElementaryTasksForInputDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryTasksForInputDevices_FastDrawingCapable(), this.getElementaryTaskEvaluation(), "fastDrawingCapable", null, 0, 1, ElementaryTasksForInputDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryTasksForInputDevices_AlphanumericCapable(), this.getElementaryTaskEvaluation(), "alphanumericCapable", null, 0, 1, ElementaryTasksForInputDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualInputDeviceEClass, VisualInputDevice.class, "VisualInputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightingDeviceEClass, LightingDevice.class, "LightingDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLightingDevice_LightningType(), ecorePackage.getEString(), "lightningType", null, 0, 1, LightingDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightingDevice_LightSize(), this.getSizeEvaluation(), "lightSize", null, 0, 1, LightingDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightingDevice_MultiColorConfigurable(), ecorePackage.getEBoolean(), "multiColorConfigurable", null, 0, 1, LightingDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraEClass, Camera.class, "Camera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tactileInputDeviceEClass, TactileInputDevice.class, "TactileInputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardkeyEClass, Hardkey.class, "Hardkey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardkey_ButtonSymbol(), ecorePackage.getEString(), "buttonSymbol", null, 0, 1, Hardkey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardkey_ButtonColor(), ecorePackage.getEString(), "buttonColor", "", 0, 1, Hardkey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardkey_ButtonSize(), this.getSizeEvaluation(), "buttonSize", "middle", 0, 1, Hardkey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardkey_HardkeyType(), this.getHardkeyType(), "hardkeyType", null, 0, 1, Hardkey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardkey_Configurable(), ecorePackage.getEBoolean(), "configurable", null, 0, 1, Hardkey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchscreenEClass, Touchscreen.class, "Touchscreen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchscreen_XPixel(), ecorePackage.getEInt(), "xPixel", null, 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_YPixel(), ecorePackage.getEInt(), "yPixel", null, 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_ForceForActuating(), ecorePackage.getEBoolean(), "forceForActuating", "false", 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_UsableWithPen(), ecorePackage.getEBoolean(), "usableWithPen", "false", 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_MultiTouchCapable(), ecorePackage.getEBoolean(), "multiTouchCapable", "true", 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_TactileFeedbackCapable(), ecorePackage.getEBoolean(), "tactileFeedbackCapable", "false", 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_TouchGestureRecognition(), ecorePackage.getEBoolean(), "touchGestureRecognition", "true", 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchscreen_ClosenessRecognition(), ecorePackage.getEBoolean(), "closenessRecognition", "false", 0, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchscreen_CorrespondDisplay(), this.getDisplay(), null, "correspondDisplay", null, 1, 1, Touchscreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditiveInputDeviceEClass, AuditiveInputDevice.class, "AuditiveInputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneEClass, Microphone.class, "Microphone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proprioceptiveInputDeviceEClass, ProprioceptiveInputDevice.class, "ProprioceptiveInputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointingDeviceEClass, PointingDevice.class, "PointingDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointingDevice_HasHighPrecision(), ecorePackage.getEBoolean(), "hasHighPrecision", "True", 0, 1, PointingDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointingDevice_DegreesOfFreedom(), ecorePackage.getEInt(), "degreesOfFreedom", "2", 0, 1, PointingDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDeviceEClass, OutputDevice.class, "OutputDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualOutputDeviceEClass, VisualOutputDevice.class, "VisualOutputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplay_XPixel(), ecorePackage.getEInt(), "xPixel", null, 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_YPixel(), ecorePackage.getEInt(), "yPixel", null, 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_IsColorCapable(), ecorePackage.getEBoolean(), "isColorCapable", "true", 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_IsImagesCapable(), ecorePackage.getEBoolean(), "isImagesCapable", "true", 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_IsVideosCapable(), ecorePackage.getEBoolean(), "isVideosCapable", "true", 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tactileOutputDeviceEClass, TactileOutputDevice.class, "TactileOutputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vibrationMotorEClass, VibrationMotor.class, "VibrationMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auditiveOutputDeviceEClass, AuditiveOutputDevice.class, "AuditiveOutputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speakerEClass, Speaker.class, "Speaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proprioceptiveOutputDeviceEClass, ProprioceptiveOutputDevice.class, "ProprioceptiveOutputDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(platformTypeEEnum, PlatformType.class, "PlatformType");
		addEEnumLiteral(platformTypeEEnum, PlatformType.OTHER);
		addEEnumLiteral(platformTypeEEnum, PlatformType.CLASSIC_PC);
		addEEnumLiteral(platformTypeEEnum, PlatformType.INDUSTRIAL_PC);
		addEEnumLiteral(platformTypeEEnum, PlatformType.LAPTOP);
		addEEnumLiteral(platformTypeEEnum, PlatformType.SMARTPHONE);
		addEEnumLiteral(platformTypeEEnum, PlatformType.TABLET);
		addEEnumLiteral(platformTypeEEnum, PlatformType.HEAD_MOUNTED_DEVICE);

		initEEnum(interactionModalityEEnum, InteractionModality.class, "InteractionModality");
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.VISUAL_INPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.AUDITIVE_INPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.TACTILE_INPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.PROPRIOCEPTIVE_INPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.VISUAL_OUTPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.AUDITIVE_OUTPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.TACTILE_OUTPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.PROPRIOCEPTIVE_OUTPUT);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.OTHER);
		addEEnumLiteral(interactionModalityEEnum, InteractionModality.NONE);

		initEEnum(sensibilityEEnum, Sensibility.class, "Sensibility");
		addEEnumLiteral(sensibilityEEnum, Sensibility.OTHER);
		addEEnumLiteral(sensibilityEEnum, Sensibility.NONSENSITIVE);
		addEEnumLiteral(sensibilityEEnum, Sensibility.LOW_SENSITIVE);
		addEEnumLiteral(sensibilityEEnum, Sensibility.NORMAL);
		addEEnumLiteral(sensibilityEEnum, Sensibility.SENSITIVE);
		addEEnumLiteral(sensibilityEEnum, Sensibility.HIGH_SENSITIVE);

		initEEnum(keyboardTypeEEnum, KeyboardType.class, "KeyboardType");
		addEEnumLiteral(keyboardTypeEEnum, KeyboardType.OTHER);
		addEEnumLiteral(keyboardTypeEEnum, KeyboardType.ALPHANUMERICAL);
		addEEnumLiteral(keyboardTypeEEnum, KeyboardType.NUMERICAL);
		addEEnumLiteral(keyboardTypeEEnum, KeyboardType.KEYPAD);
		addEEnumLiteral(keyboardTypeEEnum, KeyboardType.PHONEPAD);

		initEEnum(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.class, "ElementaryTaskEvaluation");
		addEEnumLiteral(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.OTHER);
		addEEnumLiteral(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.NONE);
		addEEnumLiteral(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.INSUFFICIENT);
		addEEnumLiteral(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.SUFFICIENT);
		addEEnumLiteral(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.GOOD);
		addEEnumLiteral(elementaryTaskEvaluationEEnum, ElementaryTaskEvaluation.VERY_GOOD);

		initEEnum(hardkeyTypeEEnum, HardkeyType.class, "HardkeyType");
		addEEnumLiteral(hardkeyTypeEEnum, HardkeyType.MACHINE_SPECIFIC);
		addEEnumLiteral(hardkeyTypeEEnum, HardkeyType.DIALOGUE_SPECIFIC);

		initEEnum(sizeEvaluationEEnum, SizeEvaluation.class, "SizeEvaluation");
		addEEnumLiteral(sizeEvaluationEEnum, SizeEvaluation.VERY_SMALL);
		addEEnumLiteral(sizeEvaluationEEnum, SizeEvaluation.SMALL);
		addEEnumLiteral(sizeEvaluationEEnum, SizeEvaluation.MIDDLE);
		addEEnumLiteral(sizeEvaluationEEnum, SizeEvaluation.BIG);
		addEEnumLiteral(sizeEvaluationEEnum, SizeEvaluation.VERY_BIG);
		addEEnumLiteral(sizeEvaluationEEnum, SizeEvaluation.JUMBO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (platformEClass, 
		   source, 
		   new String[] {
			 "constraints", "test"
		   });	
		addAnnotation
		  (mouseEClass, 
		   source, 
		   new String[] {
			 "constraints", "leftUnequalRight"
		   });
	}

} //PlatformPackageImpl
