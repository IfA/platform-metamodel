/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.mfreund.platform.model/model/platform.ecore
 * using:
 *   /de.mfreund.platform.model/model/platform.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package platform;

import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import platform.PlatformTables;

/**
 * PlatformTables provides the dispatch tables for the platform for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class PlatformTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PlatformPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://ifa/et/tu/dresden/platform/metamodel", null, platform.PlatformPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ComplexRessource = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("ComplexRessource", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Display = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Display", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_GenericProperty = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("GenericProperty", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Hardkey = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Hardkey", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Keyboard = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Keyboard", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mouse = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Mouse", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PMbase = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("PMbase", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Platform = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Platform", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PointingDevice = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("PointingDevice", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ressource = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Ressource", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Touchscreen = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getClassId("Touchscreen", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EFloat = platform.PlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = platform.PlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ElementaryTaskEvaluation = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("ElementaryTaskEvaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_HardkeyType = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("HardkeyType");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_InteractionModality = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("InteractionModality");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_KeyboardType = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("KeyboardType");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_PlatformType = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("PlatformType");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Sensibility = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("Sensibility");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_SizeEvaluation = platform.PlatformTables.PACKid_http_c_s_s_ifa_s_et_s_tu_s_dresden_s_platform_s_metamodel.getEnumerationId("SizeEvaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
    public static final /*@NonInvalid*/ java.lang.String STR_Mouse_c_c_leftUnequalRight = "Mouse::leftUnequalRight";
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Keyboard = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(platform.PlatformTables.CLSSid_Keyboard);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Mouse = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(platform.PlatformTables.CLSSid_Mouse);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Platform = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(platform.PlatformTables.CLSSid_Platform);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Touchscreen = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(platform.PlatformTables.CLSSid_Touchscreen);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_GenericProperty = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(platform.PlatformTables.CLSSid_GenericProperty);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Hardkey = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(platform.PlatformTables.CLSSid_Hardkey);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Platform = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(platform.PlatformTables.CLSSid_Platform);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Ressource = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(platform.PlatformTables.CLSSid_Ressource);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PlatformTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _AuditiveInputDevice = new EcoreExecutorType(PlatformPackage.Literals.AUDITIVE_INPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AuditiveOutputDevice = new EcoreExecutorType(PlatformPackage.Literals.AUDITIVE_OUTPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BooleanProperty = new EcoreExecutorType(PlatformPackage.Literals.BOOLEAN_PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Camera = new EcoreExecutorType(PlatformPackage.Literals.CAMERA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ComplexRessource = new EcoreExecutorType(PlatformPackage.Literals.COMPLEX_RESSOURCE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Display = new EcoreExecutorType(PlatformPackage.Literals.DISPLAY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ElementaryRessource = new EcoreExecutorType(PlatformPackage.Literals.ELEMENTARY_RESSOURCE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ElementaryTaskEvaluation = new EcoreExecutorEnumeration(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ElementaryTasksForInputDevices = new EcoreExecutorType(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _FloatProperty = new EcoreExecutorType(PlatformPackage.Literals.FLOAT_PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GenericComplexRessource = new EcoreExecutorType(PlatformPackage.Literals.GENERIC_COMPLEX_RESSOURCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GenericProperty = new EcoreExecutorType(PlatformPackage.Literals.GENERIC_PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Hardkey = new EcoreExecutorType(PlatformPackage.Literals.HARDKEY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _HardkeyType = new EcoreExecutorEnumeration(PlatformPackage.Literals.HARDKEY_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InputDevice = new EcoreExecutorType(PlatformPackage.Literals.INPUT_DEVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _IntegerProperty = new EcoreExecutorType(PlatformPackage.Literals.INTEGER_PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _InteractionModality = new EcoreExecutorEnumeration(PlatformPackage.Literals.INTERACTION_MODALITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InteractionProperty = new EcoreExecutorType(PlatformPackage.Literals.INTERACTION_PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InteractionRessource = new EcoreExecutorType(PlatformPackage.Literals.INTERACTION_RESSOURCE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Keyboard = new EcoreExecutorType(PlatformPackage.Literals.KEYBOARD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _KeyboardType = new EcoreExecutorEnumeration(PlatformPackage.Literals.KEYBOARD_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _LightingDevice = new EcoreExecutorType(PlatformPackage.Literals.LIGHTING_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Microphone = new EcoreExecutorType(PlatformPackage.Literals.MICROPHONE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mouse = new EcoreExecutorType(PlatformPackage.Literals.MOUSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _OutputDevice = new EcoreExecutorType(PlatformPackage.Literals.OUTPUT_DEVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _PMbase = new EcoreExecutorType(PlatformPackage.Literals.PMBASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Platform = new EcoreExecutorType(PlatformPackage.Literals.PLATFORM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _PlatformType = new EcoreExecutorEnumeration(PlatformPackage.Literals.PLATFORM_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PointingDevice = new EcoreExecutorType(PlatformPackage.Literals.POINTING_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ProprioceptiveInputDevice = new EcoreExecutorType(PlatformPackage.Literals.PROPRIOCEPTIVE_INPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ProprioceptiveOutputDevice = new EcoreExecutorType(PlatformPackage.Literals.PROPRIOCEPTIVE_OUTPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ressource = new EcoreExecutorType(PlatformPackage.Literals.RESSOURCE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Sensibility = new EcoreExecutorEnumeration(PlatformPackage.Literals.SENSIBILITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _SizeEvaluation = new EcoreExecutorEnumeration(PlatformPackage.Literals.SIZE_EVALUATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Speaker = new EcoreExecutorType(PlatformPackage.Literals.SPEAKER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _StringProperty = new EcoreExecutorType(PlatformPackage.Literals.STRING_PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TactileInputDevice = new EcoreExecutorType(PlatformPackage.Literals.TACTILE_INPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TactileOutputDevice = new EcoreExecutorType(PlatformPackage.Literals.TACTILE_OUTPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Touchscreen = new EcoreExecutorType(PlatformPackage.Literals.TOUCHSCREEN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VibrationMotor = new EcoreExecutorType(PlatformPackage.Literals.VIBRATION_MOTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VisualInputDevice = new EcoreExecutorType(PlatformPackage.Literals.VISUAL_INPUT_DEVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VisualOutputDevice = new EcoreExecutorType(PlatformPackage.Literals.VISUAL_OUTPUT_DEVICE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_AuditiveInputDevice,
			_AuditiveOutputDevice,
			_BooleanProperty,
			_Camera,
			_ComplexRessource,
			_Display,
			_ElementaryRessource,
			_ElementaryTaskEvaluation,
			_ElementaryTasksForInputDevices,
			_FloatProperty,
			_GenericComplexRessource,
			_GenericProperty,
			_Hardkey,
			_HardkeyType,
			_InputDevice,
			_IntegerProperty,
			_InteractionModality,
			_InteractionProperty,
			_InteractionRessource,
			_Keyboard,
			_KeyboardType,
			_LightingDevice,
			_Microphone,
			_Mouse,
			_OutputDevice,
			_PMbase,
			_Platform,
			_PlatformType,
			_PointingDevice,
			_ProprioceptiveInputDevice,
			_ProprioceptiveOutputDevice,
			_Ressource,
			_Sensibility,
			_SizeEvaluation,
			_Speaker,
			_StringProperty,
			_TactileInputDevice,
			_TactileOutputDevice,
			_Touchscreen,
			_VibrationMotor,
			_VisualInputDevice,
			_VisualOutputDevice
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__AuditiveInputDevice = new ExecutorFragment(Types._AuditiveInputDevice, PlatformTables.Types._AuditiveInputDevice);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__ElementaryRessource = new ExecutorFragment(Types._AuditiveInputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__ElementaryTasksForInputDevices = new ExecutorFragment(Types._AuditiveInputDevice, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__InputDevice = new ExecutorFragment(Types._AuditiveInputDevice, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__InteractionRessource = new ExecutorFragment(Types._AuditiveInputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__OclAny = new ExecutorFragment(Types._AuditiveInputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__OclElement = new ExecutorFragment(Types._AuditiveInputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveInputDevice__Ressource = new ExecutorFragment(Types._AuditiveInputDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__AuditiveOutputDevice = new ExecutorFragment(Types._AuditiveOutputDevice, PlatformTables.Types._AuditiveOutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__ElementaryRessource = new ExecutorFragment(Types._AuditiveOutputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__InteractionRessource = new ExecutorFragment(Types._AuditiveOutputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__OclAny = new ExecutorFragment(Types._AuditiveOutputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__OclElement = new ExecutorFragment(Types._AuditiveOutputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__OutputDevice = new ExecutorFragment(Types._AuditiveOutputDevice, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _AuditiveOutputDevice__Ressource = new ExecutorFragment(Types._AuditiveOutputDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _BooleanProperty__BooleanProperty = new ExecutorFragment(Types._BooleanProperty, PlatformTables.Types._BooleanProperty);
		private static final /*@NonNull*/ ExecutorFragment _BooleanProperty__GenericProperty = new ExecutorFragment(Types._BooleanProperty, PlatformTables.Types._GenericProperty);
		private static final /*@NonNull*/ ExecutorFragment _BooleanProperty__OclAny = new ExecutorFragment(Types._BooleanProperty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BooleanProperty__OclElement = new ExecutorFragment(Types._BooleanProperty, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Camera__Camera = new ExecutorFragment(Types._Camera, PlatformTables.Types._Camera);
		private static final /*@NonNull*/ ExecutorFragment _Camera__ElementaryRessource = new ExecutorFragment(Types._Camera, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _Camera__ElementaryTasksForInputDevices = new ExecutorFragment(Types._Camera, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _Camera__InputDevice = new ExecutorFragment(Types._Camera, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Camera__InteractionRessource = new ExecutorFragment(Types._Camera, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _Camera__OclAny = new ExecutorFragment(Types._Camera, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Camera__OclElement = new ExecutorFragment(Types._Camera, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Camera__Ressource = new ExecutorFragment(Types._Camera, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _Camera__VisualInputDevice = new ExecutorFragment(Types._Camera, PlatformTables.Types._VisualInputDevice);

		private static final /*@NonNull*/ ExecutorFragment _ComplexRessource__ComplexRessource = new ExecutorFragment(Types._ComplexRessource, PlatformTables.Types._ComplexRessource);
		private static final /*@NonNull*/ ExecutorFragment _ComplexRessource__OclAny = new ExecutorFragment(Types._ComplexRessource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ComplexRessource__OclElement = new ExecutorFragment(Types._ComplexRessource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ComplexRessource__Ressource = new ExecutorFragment(Types._ComplexRessource, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _Display__Display = new ExecutorFragment(Types._Display, PlatformTables.Types._Display);
		private static final /*@NonNull*/ ExecutorFragment _Display__ElementaryRessource = new ExecutorFragment(Types._Display, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _Display__InteractionRessource = new ExecutorFragment(Types._Display, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _Display__OclAny = new ExecutorFragment(Types._Display, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Display__OclElement = new ExecutorFragment(Types._Display, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Display__OutputDevice = new ExecutorFragment(Types._Display, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Display__Ressource = new ExecutorFragment(Types._Display, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _Display__VisualOutputDevice = new ExecutorFragment(Types._Display, PlatformTables.Types._VisualOutputDevice);

		private static final /*@NonNull*/ ExecutorFragment _ElementaryRessource__ElementaryRessource = new ExecutorFragment(Types._ElementaryRessource, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryRessource__OclAny = new ExecutorFragment(Types._ElementaryRessource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryRessource__OclElement = new ExecutorFragment(Types._ElementaryRessource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryRessource__Ressource = new ExecutorFragment(Types._ElementaryRessource, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _ElementaryTaskEvaluation__ElementaryTaskEvaluation = new ExecutorFragment(Types._ElementaryTaskEvaluation, PlatformTables.Types._ElementaryTaskEvaluation);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryTaskEvaluation__OclAny = new ExecutorFragment(Types._ElementaryTaskEvaluation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryTaskEvaluation__OclElement = new ExecutorFragment(Types._ElementaryTaskEvaluation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryTaskEvaluation__OclEnumeration = new ExecutorFragment(Types._ElementaryTaskEvaluation, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryTaskEvaluation__OclType = new ExecutorFragment(Types._ElementaryTaskEvaluation, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _ElementaryTasksForInputDevices__ElementaryTasksForInputDevices = new ExecutorFragment(Types._ElementaryTasksForInputDevices, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryTasksForInputDevices__OclAny = new ExecutorFragment(Types._ElementaryTasksForInputDevices, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ElementaryTasksForInputDevices__OclElement = new ExecutorFragment(Types._ElementaryTasksForInputDevices, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _FloatProperty__FloatProperty = new ExecutorFragment(Types._FloatProperty, PlatformTables.Types._FloatProperty);
		private static final /*@NonNull*/ ExecutorFragment _FloatProperty__GenericProperty = new ExecutorFragment(Types._FloatProperty, PlatformTables.Types._GenericProperty);
		private static final /*@NonNull*/ ExecutorFragment _FloatProperty__OclAny = new ExecutorFragment(Types._FloatProperty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _FloatProperty__OclElement = new ExecutorFragment(Types._FloatProperty, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _GenericComplexRessource__ComplexRessource = new ExecutorFragment(Types._GenericComplexRessource, PlatformTables.Types._ComplexRessource);
		private static final /*@NonNull*/ ExecutorFragment _GenericComplexRessource__GenericComplexRessource = new ExecutorFragment(Types._GenericComplexRessource, PlatformTables.Types._GenericComplexRessource);
		private static final /*@NonNull*/ ExecutorFragment _GenericComplexRessource__OclAny = new ExecutorFragment(Types._GenericComplexRessource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GenericComplexRessource__OclElement = new ExecutorFragment(Types._GenericComplexRessource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _GenericComplexRessource__Ressource = new ExecutorFragment(Types._GenericComplexRessource, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _GenericProperty__GenericProperty = new ExecutorFragment(Types._GenericProperty, PlatformTables.Types._GenericProperty);
		private static final /*@NonNull*/ ExecutorFragment _GenericProperty__OclAny = new ExecutorFragment(Types._GenericProperty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GenericProperty__OclElement = new ExecutorFragment(Types._GenericProperty, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Hardkey__ElementaryRessource = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__ElementaryTasksForInputDevices = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__Hardkey = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._Hardkey);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__InputDevice = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__InteractionRessource = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__OclAny = new ExecutorFragment(Types._Hardkey, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__OclElement = new ExecutorFragment(Types._Hardkey, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__Ressource = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _Hardkey__TactileInputDevice = new ExecutorFragment(Types._Hardkey, PlatformTables.Types._TactileInputDevice);

		private static final /*@NonNull*/ ExecutorFragment _HardkeyType__HardkeyType = new ExecutorFragment(Types._HardkeyType, PlatformTables.Types._HardkeyType);
		private static final /*@NonNull*/ ExecutorFragment _HardkeyType__OclAny = new ExecutorFragment(Types._HardkeyType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _HardkeyType__OclElement = new ExecutorFragment(Types._HardkeyType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _HardkeyType__OclEnumeration = new ExecutorFragment(Types._HardkeyType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _HardkeyType__OclType = new ExecutorFragment(Types._HardkeyType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _InputDevice__ElementaryRessource = new ExecutorFragment(Types._InputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _InputDevice__ElementaryTasksForInputDevices = new ExecutorFragment(Types._InputDevice, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _InputDevice__InputDevice = new ExecutorFragment(Types._InputDevice, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _InputDevice__InteractionRessource = new ExecutorFragment(Types._InputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _InputDevice__OclAny = new ExecutorFragment(Types._InputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InputDevice__OclElement = new ExecutorFragment(Types._InputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InputDevice__Ressource = new ExecutorFragment(Types._InputDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _IntegerProperty__GenericProperty = new ExecutorFragment(Types._IntegerProperty, PlatformTables.Types._GenericProperty);
		private static final /*@NonNull*/ ExecutorFragment _IntegerProperty__IntegerProperty = new ExecutorFragment(Types._IntegerProperty, PlatformTables.Types._IntegerProperty);
		private static final /*@NonNull*/ ExecutorFragment _IntegerProperty__OclAny = new ExecutorFragment(Types._IntegerProperty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _IntegerProperty__OclElement = new ExecutorFragment(Types._IntegerProperty, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InteractionModality__InteractionModality = new ExecutorFragment(Types._InteractionModality, PlatformTables.Types._InteractionModality);
		private static final /*@NonNull*/ ExecutorFragment _InteractionModality__OclAny = new ExecutorFragment(Types._InteractionModality, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InteractionModality__OclElement = new ExecutorFragment(Types._InteractionModality, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InteractionModality__OclEnumeration = new ExecutorFragment(Types._InteractionModality, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _InteractionModality__OclType = new ExecutorFragment(Types._InteractionModality, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _InteractionProperty__GenericProperty = new ExecutorFragment(Types._InteractionProperty, PlatformTables.Types._GenericProperty);
		private static final /*@NonNull*/ ExecutorFragment _InteractionProperty__InteractionProperty = new ExecutorFragment(Types._InteractionProperty, PlatformTables.Types._InteractionProperty);
		private static final /*@NonNull*/ ExecutorFragment _InteractionProperty__OclAny = new ExecutorFragment(Types._InteractionProperty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InteractionProperty__OclElement = new ExecutorFragment(Types._InteractionProperty, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InteractionRessource__ElementaryRessource = new ExecutorFragment(Types._InteractionRessource, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _InteractionRessource__InteractionRessource = new ExecutorFragment(Types._InteractionRessource, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _InteractionRessource__OclAny = new ExecutorFragment(Types._InteractionRessource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InteractionRessource__OclElement = new ExecutorFragment(Types._InteractionRessource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InteractionRessource__Ressource = new ExecutorFragment(Types._InteractionRessource, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _Keyboard__ComplexRessource = new ExecutorFragment(Types._Keyboard, PlatformTables.Types._ComplexRessource);
		private static final /*@NonNull*/ ExecutorFragment _Keyboard__Keyboard = new ExecutorFragment(Types._Keyboard, PlatformTables.Types._Keyboard);
		private static final /*@NonNull*/ ExecutorFragment _Keyboard__OclAny = new ExecutorFragment(Types._Keyboard, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Keyboard__OclElement = new ExecutorFragment(Types._Keyboard, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Keyboard__Ressource = new ExecutorFragment(Types._Keyboard, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _KeyboardType__KeyboardType = new ExecutorFragment(Types._KeyboardType, PlatformTables.Types._KeyboardType);
		private static final /*@NonNull*/ ExecutorFragment _KeyboardType__OclAny = new ExecutorFragment(Types._KeyboardType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _KeyboardType__OclElement = new ExecutorFragment(Types._KeyboardType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _KeyboardType__OclEnumeration = new ExecutorFragment(Types._KeyboardType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _KeyboardType__OclType = new ExecutorFragment(Types._KeyboardType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__ElementaryRessource = new ExecutorFragment(Types._LightingDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__InteractionRessource = new ExecutorFragment(Types._LightingDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__LightingDevice = new ExecutorFragment(Types._LightingDevice, PlatformTables.Types._LightingDevice);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__OclAny = new ExecutorFragment(Types._LightingDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__OclElement = new ExecutorFragment(Types._LightingDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__OutputDevice = new ExecutorFragment(Types._LightingDevice, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__Ressource = new ExecutorFragment(Types._LightingDevice, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _LightingDevice__VisualOutputDevice = new ExecutorFragment(Types._LightingDevice, PlatformTables.Types._VisualOutputDevice);

		private static final /*@NonNull*/ ExecutorFragment _Microphone__AuditiveInputDevice = new ExecutorFragment(Types._Microphone, PlatformTables.Types._AuditiveInputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__ElementaryRessource = new ExecutorFragment(Types._Microphone, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__ElementaryTasksForInputDevices = new ExecutorFragment(Types._Microphone, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__InputDevice = new ExecutorFragment(Types._Microphone, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__InteractionRessource = new ExecutorFragment(Types._Microphone, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__Microphone = new ExecutorFragment(Types._Microphone, PlatformTables.Types._Microphone);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__OclAny = new ExecutorFragment(Types._Microphone, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__OclElement = new ExecutorFragment(Types._Microphone, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Microphone__Ressource = new ExecutorFragment(Types._Microphone, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _Mouse__ComplexRessource = new ExecutorFragment(Types._Mouse, PlatformTables.Types._ComplexRessource);
		private static final /*@NonNull*/ ExecutorFragment _Mouse__Mouse = new ExecutorFragment(Types._Mouse, PlatformTables.Types._Mouse);
		private static final /*@NonNull*/ ExecutorFragment _Mouse__OclAny = new ExecutorFragment(Types._Mouse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mouse__OclElement = new ExecutorFragment(Types._Mouse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mouse__Ressource = new ExecutorFragment(Types._Mouse, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _OutputDevice__ElementaryRessource = new ExecutorFragment(Types._OutputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _OutputDevice__InteractionRessource = new ExecutorFragment(Types._OutputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _OutputDevice__OclAny = new ExecutorFragment(Types._OutputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _OutputDevice__OclElement = new ExecutorFragment(Types._OutputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _OutputDevice__OutputDevice = new ExecutorFragment(Types._OutputDevice, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _OutputDevice__Ressource = new ExecutorFragment(Types._OutputDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _PMbase__OclAny = new ExecutorFragment(Types._PMbase, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PMbase__OclElement = new ExecutorFragment(Types._PMbase, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PMbase__PMbase = new ExecutorFragment(Types._PMbase, PlatformTables.Types._PMbase);

		private static final /*@NonNull*/ ExecutorFragment _Platform__OclAny = new ExecutorFragment(Types._Platform, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Platform__OclElement = new ExecutorFragment(Types._Platform, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Platform__Platform = new ExecutorFragment(Types._Platform, PlatformTables.Types._Platform);

		private static final /*@NonNull*/ ExecutorFragment _PlatformType__OclAny = new ExecutorFragment(Types._PlatformType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PlatformType__OclElement = new ExecutorFragment(Types._PlatformType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PlatformType__OclEnumeration = new ExecutorFragment(Types._PlatformType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _PlatformType__OclType = new ExecutorFragment(Types._PlatformType, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _PlatformType__PlatformType = new ExecutorFragment(Types._PlatformType, PlatformTables.Types._PlatformType);

		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__ElementaryRessource = new ExecutorFragment(Types._PointingDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__ElementaryTasksForInputDevices = new ExecutorFragment(Types._PointingDevice, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__InputDevice = new ExecutorFragment(Types._PointingDevice, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__InteractionRessource = new ExecutorFragment(Types._PointingDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__OclAny = new ExecutorFragment(Types._PointingDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__OclElement = new ExecutorFragment(Types._PointingDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__PointingDevice = new ExecutorFragment(Types._PointingDevice, PlatformTables.Types._PointingDevice);
		private static final /*@NonNull*/ ExecutorFragment _PointingDevice__Ressource = new ExecutorFragment(Types._PointingDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__ElementaryRessource = new ExecutorFragment(Types._ProprioceptiveInputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__ElementaryTasksForInputDevices = new ExecutorFragment(Types._ProprioceptiveInputDevice, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__InputDevice = new ExecutorFragment(Types._ProprioceptiveInputDevice, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__InteractionRessource = new ExecutorFragment(Types._ProprioceptiveInputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__OclAny = new ExecutorFragment(Types._ProprioceptiveInputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__OclElement = new ExecutorFragment(Types._ProprioceptiveInputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__ProprioceptiveInputDevice = new ExecutorFragment(Types._ProprioceptiveInputDevice, PlatformTables.Types._ProprioceptiveInputDevice);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveInputDevice__Ressource = new ExecutorFragment(Types._ProprioceptiveInputDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__ElementaryRessource = new ExecutorFragment(Types._ProprioceptiveOutputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__InteractionRessource = new ExecutorFragment(Types._ProprioceptiveOutputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__OclAny = new ExecutorFragment(Types._ProprioceptiveOutputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__OclElement = new ExecutorFragment(Types._ProprioceptiveOutputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__OutputDevice = new ExecutorFragment(Types._ProprioceptiveOutputDevice, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__ProprioceptiveOutputDevice = new ExecutorFragment(Types._ProprioceptiveOutputDevice, PlatformTables.Types._ProprioceptiveOutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _ProprioceptiveOutputDevice__Ressource = new ExecutorFragment(Types._ProprioceptiveOutputDevice, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _Ressource__OclAny = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ressource__OclElement = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ressource__Ressource = new ExecutorFragment(Types._Ressource, PlatformTables.Types._Ressource);

		private static final /*@NonNull*/ ExecutorFragment _Sensibility__OclAny = new ExecutorFragment(Types._Sensibility, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sensibility__OclElement = new ExecutorFragment(Types._Sensibility, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensibility__OclEnumeration = new ExecutorFragment(Types._Sensibility, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Sensibility__OclType = new ExecutorFragment(Types._Sensibility, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Sensibility__Sensibility = new ExecutorFragment(Types._Sensibility, PlatformTables.Types._Sensibility);

		private static final /*@NonNull*/ ExecutorFragment _SizeEvaluation__OclAny = new ExecutorFragment(Types._SizeEvaluation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SizeEvaluation__OclElement = new ExecutorFragment(Types._SizeEvaluation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SizeEvaluation__OclEnumeration = new ExecutorFragment(Types._SizeEvaluation, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _SizeEvaluation__OclType = new ExecutorFragment(Types._SizeEvaluation, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _SizeEvaluation__SizeEvaluation = new ExecutorFragment(Types._SizeEvaluation, PlatformTables.Types._SizeEvaluation);

		private static final /*@NonNull*/ ExecutorFragment _Speaker__AuditiveOutputDevice = new ExecutorFragment(Types._Speaker, PlatformTables.Types._AuditiveOutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__ElementaryRessource = new ExecutorFragment(Types._Speaker, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__InteractionRessource = new ExecutorFragment(Types._Speaker, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__OclAny = new ExecutorFragment(Types._Speaker, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__OclElement = new ExecutorFragment(Types._Speaker, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__OutputDevice = new ExecutorFragment(Types._Speaker, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__Ressource = new ExecutorFragment(Types._Speaker, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _Speaker__Speaker = new ExecutorFragment(Types._Speaker, PlatformTables.Types._Speaker);

		private static final /*@NonNull*/ ExecutorFragment _StringProperty__GenericProperty = new ExecutorFragment(Types._StringProperty, PlatformTables.Types._GenericProperty);
		private static final /*@NonNull*/ ExecutorFragment _StringProperty__OclAny = new ExecutorFragment(Types._StringProperty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StringProperty__OclElement = new ExecutorFragment(Types._StringProperty, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StringProperty__StringProperty = new ExecutorFragment(Types._StringProperty, PlatformTables.Types._StringProperty);

		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__ElementaryRessource = new ExecutorFragment(Types._TactileInputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__ElementaryTasksForInputDevices = new ExecutorFragment(Types._TactileInputDevice, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__InputDevice = new ExecutorFragment(Types._TactileInputDevice, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__InteractionRessource = new ExecutorFragment(Types._TactileInputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__OclAny = new ExecutorFragment(Types._TactileInputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__OclElement = new ExecutorFragment(Types._TactileInputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__Ressource = new ExecutorFragment(Types._TactileInputDevice, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _TactileInputDevice__TactileInputDevice = new ExecutorFragment(Types._TactileInputDevice, PlatformTables.Types._TactileInputDevice);

		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__ElementaryRessource = new ExecutorFragment(Types._TactileOutputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__InteractionRessource = new ExecutorFragment(Types._TactileOutputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__OclAny = new ExecutorFragment(Types._TactileOutputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__OclElement = new ExecutorFragment(Types._TactileOutputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__OutputDevice = new ExecutorFragment(Types._TactileOutputDevice, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__Ressource = new ExecutorFragment(Types._TactileOutputDevice, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _TactileOutputDevice__TactileOutputDevice = new ExecutorFragment(Types._TactileOutputDevice, PlatformTables.Types._TactileOutputDevice);

		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__ElementaryRessource = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__ElementaryTasksForInputDevices = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__InputDevice = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__InteractionRessource = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__OclAny = new ExecutorFragment(Types._Touchscreen, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__OclElement = new ExecutorFragment(Types._Touchscreen, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__Ressource = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__TactileInputDevice = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._TactileInputDevice);
		private static final /*@NonNull*/ ExecutorFragment _Touchscreen__Touchscreen = new ExecutorFragment(Types._Touchscreen, PlatformTables.Types._Touchscreen);

		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__ElementaryRessource = new ExecutorFragment(Types._VibrationMotor, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__InteractionRessource = new ExecutorFragment(Types._VibrationMotor, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__OclAny = new ExecutorFragment(Types._VibrationMotor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__OclElement = new ExecutorFragment(Types._VibrationMotor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__OutputDevice = new ExecutorFragment(Types._VibrationMotor, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__Ressource = new ExecutorFragment(Types._VibrationMotor, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__TactileOutputDevice = new ExecutorFragment(Types._VibrationMotor, PlatformTables.Types._TactileOutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _VibrationMotor__VibrationMotor = new ExecutorFragment(Types._VibrationMotor, PlatformTables.Types._VibrationMotor);

		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__ElementaryRessource = new ExecutorFragment(Types._VisualInputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__ElementaryTasksForInputDevices = new ExecutorFragment(Types._VisualInputDevice, PlatformTables.Types._ElementaryTasksForInputDevices);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__InputDevice = new ExecutorFragment(Types._VisualInputDevice, PlatformTables.Types._InputDevice);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__InteractionRessource = new ExecutorFragment(Types._VisualInputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__OclAny = new ExecutorFragment(Types._VisualInputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__OclElement = new ExecutorFragment(Types._VisualInputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__Ressource = new ExecutorFragment(Types._VisualInputDevice, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _VisualInputDevice__VisualInputDevice = new ExecutorFragment(Types._VisualInputDevice, PlatformTables.Types._VisualInputDevice);

		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__ElementaryRessource = new ExecutorFragment(Types._VisualOutputDevice, PlatformTables.Types._ElementaryRessource);
		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__InteractionRessource = new ExecutorFragment(Types._VisualOutputDevice, PlatformTables.Types._InteractionRessource);
		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__OclAny = new ExecutorFragment(Types._VisualOutputDevice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__OclElement = new ExecutorFragment(Types._VisualOutputDevice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__OutputDevice = new ExecutorFragment(Types._VisualOutputDevice, PlatformTables.Types._OutputDevice);
		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__Ressource = new ExecutorFragment(Types._VisualOutputDevice, PlatformTables.Types._Ressource);
		private static final /*@NonNull*/ ExecutorFragment _VisualOutputDevice__VisualOutputDevice = new ExecutorFragment(Types._VisualOutputDevice, PlatformTables.Types._VisualOutputDevice);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _BooleanProperty__booleanValue = new EcoreExecutorProperty(PlatformPackage.Literals.BOOLEAN_PROPERTY__BOOLEAN_VALUE, Types._BooleanProperty, 0);

		public static final /*@NonNull*/ ExecutorProperty _ComplexRessource__subRessources = new EcoreExecutorProperty(PlatformPackage.Literals.COMPLEX_RESSOURCE__SUB_RESSOURCES, Types._ComplexRessource, 0);

		public static final /*@NonNull*/ ExecutorProperty _Display__height = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__HEIGHT, Types._Display, 0);
		public static final /*@NonNull*/ ExecutorProperty _Display__isColorCapable = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__IS_COLOR_CAPABLE, Types._Display, 1);
		public static final /*@NonNull*/ ExecutorProperty _Display__isImagesCapable = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__IS_IMAGES_CAPABLE, Types._Display, 2);
		public static final /*@NonNull*/ ExecutorProperty _Display__isVideosCapable = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__IS_VIDEOS_CAPABLE, Types._Display, 3);
		public static final /*@NonNull*/ ExecutorProperty _Display__width = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__WIDTH, Types._Display, 4);
		public static final /*@NonNull*/ ExecutorProperty _Display__xPixel = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__XPIXEL, Types._Display, 5);
		public static final /*@NonNull*/ ExecutorProperty _Display__yPixel = new EcoreExecutorProperty(PlatformPackage.Literals.DISPLAY__YPIXEL, Types._Display, 6);
		public static final /*@NonNull*/ ExecutorProperty _Display__Touchscreen__correspondDisplay = new ExecutorPropertyWithImplementation("Touchscreen", Types._Display, 7, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.TOUCHSCREEN__CORRESPOND_DISPLAY));

		public static final /*@NonNull*/ ExecutorProperty _ElementaryTasksForInputDevices__accuratePointingCapable = new EcoreExecutorProperty(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE, Types._ElementaryTasksForInputDevices, 0);
		public static final /*@NonNull*/ ExecutorProperty _ElementaryTasksForInputDevices__alphanumericCapable = new EcoreExecutorProperty(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE, Types._ElementaryTasksForInputDevices, 1);
		public static final /*@NonNull*/ ExecutorProperty _ElementaryTasksForInputDevices__drawingCapable = new EcoreExecutorProperty(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE, Types._ElementaryTasksForInputDevices, 2);
		public static final /*@NonNull*/ ExecutorProperty _ElementaryTasksForInputDevices__fastDrawingCapable = new EcoreExecutorProperty(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE, Types._ElementaryTasksForInputDevices, 3);
		public static final /*@NonNull*/ ExecutorProperty _ElementaryTasksForInputDevices__fastPointingCapable = new EcoreExecutorProperty(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE, Types._ElementaryTasksForInputDevices, 4);
		public static final /*@NonNull*/ ExecutorProperty _ElementaryTasksForInputDevices__selectingCapable = new EcoreExecutorProperty(PlatformPackage.Literals.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE, Types._ElementaryTasksForInputDevices, 5);

		public static final /*@NonNull*/ ExecutorProperty _FloatProperty__floatValue = new EcoreExecutorProperty(PlatformPackage.Literals.FLOAT_PROPERTY__FLOAT_VALUE, Types._FloatProperty, 0);

		public static final /*@NonNull*/ ExecutorProperty _GenericProperty__propertyName = new EcoreExecutorProperty(PlatformPackage.Literals.GENERIC_PROPERTY__PROPERTY_NAME, Types._GenericProperty, 0);
		public static final /*@NonNull*/ ExecutorProperty _GenericProperty__propertyUnit = new EcoreExecutorProperty(PlatformPackage.Literals.GENERIC_PROPERTY__PROPERTY_UNIT, Types._GenericProperty, 1);
		public static final /*@NonNull*/ ExecutorProperty _GenericProperty__Platform__genericProperty = new ExecutorPropertyWithImplementation("Platform", Types._GenericProperty, 2, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.PLATFORM__GENERIC_PROPERTY));
		public static final /*@NonNull*/ ExecutorProperty _GenericProperty__Ressource__genericProperty = new ExecutorPropertyWithImplementation("Ressource", Types._GenericProperty, 3, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.RESSOURCE__GENERIC_PROPERTY));

		public static final /*@NonNull*/ ExecutorProperty _Hardkey__buttonColor = new EcoreExecutorProperty(PlatformPackage.Literals.HARDKEY__BUTTON_COLOR, Types._Hardkey, 0);
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__buttonSize = new EcoreExecutorProperty(PlatformPackage.Literals.HARDKEY__BUTTON_SIZE, Types._Hardkey, 1);
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__buttonSymbol = new EcoreExecutorProperty(PlatformPackage.Literals.HARDKEY__BUTTON_SYMBOL, Types._Hardkey, 2);
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__configurable = new EcoreExecutorProperty(PlatformPackage.Literals.HARDKEY__CONFIGURABLE, Types._Hardkey, 3);
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__hardkeyType = new EcoreExecutorProperty(PlatformPackage.Literals.HARDKEY__HARDKEY_TYPE, Types._Hardkey, 4);
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__Keyboard__hardkeys = new ExecutorPropertyWithImplementation("Keyboard", Types._Hardkey, 5, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.KEYBOARD__HARDKEYS));
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__Mouse__leftMousebutton = new ExecutorPropertyWithImplementation("Mouse", Types._Hardkey, 6, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.MOUSE__LEFT_MOUSEBUTTON));
		public static final /*@NonNull*/ ExecutorProperty _Hardkey__Mouse__rightMousebutton = new ExecutorPropertyWithImplementation("Mouse", Types._Hardkey, 7, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.MOUSE__RIGHT_MOUSEBUTTON));

		public static final /*@NonNull*/ ExecutorProperty _InputDevice__safeForUnwantedActions = new EcoreExecutorProperty(PlatformPackage.Literals.INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS, Types._InputDevice, 0);
		public static final /*@NonNull*/ ExecutorProperty _InputDevice__usableWithGloves = new EcoreExecutorProperty(PlatformPackage.Literals.INPUT_DEVICE__USABLE_WITH_GLOVES, Types._InputDevice, 1);
		public static final /*@NonNull*/ ExecutorProperty _InputDevice__usableWithOneHand = new EcoreExecutorProperty(PlatformPackage.Literals.INPUT_DEVICE__USABLE_WITH_ONE_HAND, Types._InputDevice, 2);

		public static final /*@NonNull*/ ExecutorProperty _IntegerProperty__integerValue = new EcoreExecutorProperty(PlatformPackage.Literals.INTEGER_PROPERTY__INTEGER_VALUE, Types._IntegerProperty, 0);

		public static final /*@NonNull*/ ExecutorProperty _InteractionProperty__interactionModality = new EcoreExecutorProperty(PlatformPackage.Literals.INTERACTION_PROPERTY__INTERACTION_MODALITY, Types._InteractionProperty, 0);

		public static final /*@NonNull*/ ExecutorProperty _Keyboard__easyTextInput = new EcoreExecutorProperty(PlatformPackage.Literals.KEYBOARD__EASY_TEXT_INPUT, Types._Keyboard, 0);
		public static final /*@NonNull*/ ExecutorProperty _Keyboard__fastTextInput = new EcoreExecutorProperty(PlatformPackage.Literals.KEYBOARD__FAST_TEXT_INPUT, Types._Keyboard, 1);
		public static final /*@NonNull*/ ExecutorProperty _Keyboard__hardkeys = new EcoreExecutorProperty(PlatformPackage.Literals.KEYBOARD__HARDKEYS, Types._Keyboard, 2);
		public static final /*@NonNull*/ ExecutorProperty _Keyboard__keyboardType = new EcoreExecutorProperty(PlatformPackage.Literals.KEYBOARD__KEYBOARD_TYPE, Types._Keyboard, 3);
		public static final /*@NonNull*/ ExecutorProperty _Keyboard__keyboardTypeExtraInfo = new EcoreExecutorProperty(PlatformPackage.Literals.KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO, Types._Keyboard, 4);

		public static final /*@NonNull*/ ExecutorProperty _LightingDevice__lightSize = new EcoreExecutorProperty(PlatformPackage.Literals.LIGHTING_DEVICE__LIGHT_SIZE, Types._LightingDevice, 0);
		public static final /*@NonNull*/ ExecutorProperty _LightingDevice__lightningType = new EcoreExecutorProperty(PlatformPackage.Literals.LIGHTING_DEVICE__LIGHTNING_TYPE, Types._LightingDevice, 1);
		public static final /*@NonNull*/ ExecutorProperty _LightingDevice__multiColorConfigurable = new EcoreExecutorProperty(PlatformPackage.Literals.LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE, Types._LightingDevice, 2);

		public static final /*@NonNull*/ ExecutorProperty _Mouse__leftMousebutton = new EcoreExecutorProperty(PlatformPackage.Literals.MOUSE__LEFT_MOUSEBUTTON, Types._Mouse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mouse__mainPointingDevice = new EcoreExecutorProperty(PlatformPackage.Literals.MOUSE__MAIN_POINTING_DEVICE, Types._Mouse, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mouse__mouseSensibility = new EcoreExecutorProperty(PlatformPackage.Literals.MOUSE__MOUSE_SENSIBILITY, Types._Mouse, 2);
		public static final /*@NonNull*/ ExecutorProperty _Mouse__rightMousebutton = new EcoreExecutorProperty(PlatformPackage.Literals.MOUSE__RIGHT_MOUSEBUTTON, Types._Mouse, 3);
		public static final /*@NonNull*/ ExecutorProperty _Mouse__usableForSmoothSurface = new EcoreExecutorProperty(PlatformPackage.Literals.MOUSE__USABLE_FOR_SMOOTH_SURFACE, Types._Mouse, 4);
		public static final /*@NonNull*/ ExecutorProperty _Mouse__usableForTranspartentSurface = new EcoreExecutorProperty(PlatformPackage.Literals.MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE, Types._Mouse, 5);

		public static final /*@NonNull*/ ExecutorProperty _PMbase__platformCollection = new EcoreExecutorProperty(PlatformPackage.Literals.PMBASE__PLATFORM_COLLECTION, Types._PMbase, 0);
		public static final /*@NonNull*/ ExecutorProperty _PMbase__ressourceCollection = new EcoreExecutorProperty(PlatformPackage.Literals.PMBASE__RESSOURCE_COLLECTION, Types._PMbase, 1);

		public static final /*@NonNull*/ ExecutorProperty _Platform__genericProperty = new EcoreExecutorProperty(PlatformPackage.Literals.PLATFORM__GENERIC_PROPERTY, Types._Platform, 0);
		public static final /*@NonNull*/ ExecutorProperty _Platform__platformId = new EcoreExecutorProperty(PlatformPackage.Literals.PLATFORM__PLATFORM_ID, Types._Platform, 1);
		public static final /*@NonNull*/ ExecutorProperty _Platform__platformName = new EcoreExecutorProperty(PlatformPackage.Literals.PLATFORM__PLATFORM_NAME, Types._Platform, 2);
		public static final /*@NonNull*/ ExecutorProperty _Platform__platformType = new EcoreExecutorProperty(PlatformPackage.Literals.PLATFORM__PLATFORM_TYPE, Types._Platform, 3);
		public static final /*@NonNull*/ ExecutorProperty _Platform__ressources = new EcoreExecutorProperty(PlatformPackage.Literals.PLATFORM__RESSOURCES, Types._Platform, 4);
		public static final /*@NonNull*/ ExecutorProperty _Platform__PMbase__platformCollection = new ExecutorPropertyWithImplementation("PMbase", Types._Platform, 5, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.PMBASE__PLATFORM_COLLECTION));

		public static final /*@NonNull*/ ExecutorProperty _PointingDevice__degreesOfFreedom = new EcoreExecutorProperty(PlatformPackage.Literals.POINTING_DEVICE__DEGREES_OF_FREEDOM, Types._PointingDevice, 0);
		public static final /*@NonNull*/ ExecutorProperty _PointingDevice__hasHighPrecision = new EcoreExecutorProperty(PlatformPackage.Literals.POINTING_DEVICE__HAS_HIGH_PRECISION, Types._PointingDevice, 1);
		public static final /*@NonNull*/ ExecutorProperty _PointingDevice__Mouse__mainPointingDevice = new ExecutorPropertyWithImplementation("Mouse", Types._PointingDevice, 2, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.MOUSE__MAIN_POINTING_DEVICE));

		public static final /*@NonNull*/ ExecutorProperty _Ressource__genericProperty = new EcoreExecutorProperty(PlatformPackage.Literals.RESSOURCE__GENERIC_PROPERTY, Types._Ressource, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ressource__ressourceName = new EcoreExecutorProperty(PlatformPackage.Literals.RESSOURCE__RESSOURCE_NAME, Types._Ressource, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ressource__ComplexRessource__subRessources = new ExecutorPropertyWithImplementation("ComplexRessource", Types._Ressource, 2, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.COMPLEX_RESSOURCE__SUB_RESSOURCES));
		public static final /*@NonNull*/ ExecutorProperty _Ressource__PMbase__ressourceCollection = new ExecutorPropertyWithImplementation("PMbase", Types._Ressource, 3, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.PMBASE__RESSOURCE_COLLECTION));
		public static final /*@NonNull*/ ExecutorProperty _Ressource__Platform__ressources = new ExecutorPropertyWithImplementation("Platform", Types._Ressource, 4, new EcoreLibraryOppositeProperty(PlatformPackage.Literals.PLATFORM__RESSOURCES));

		public static final /*@NonNull*/ ExecutorProperty _StringProperty__stringValue = new EcoreExecutorProperty(PlatformPackage.Literals.STRING_PROPERTY__STRING_VALUE, Types._StringProperty, 0);

		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__closenessRecognition = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__CLOSENESS_RECOGNITION, Types._Touchscreen, 0);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__correspondDisplay = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__CORRESPOND_DISPLAY, Types._Touchscreen, 1);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__forceForActuating = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__FORCE_FOR_ACTUATING, Types._Touchscreen, 2);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__height = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__HEIGHT, Types._Touchscreen, 3);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__multiTouchCapable = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__MULTI_TOUCH_CAPABLE, Types._Touchscreen, 4);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__tactileFeedbackCapable = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE, Types._Touchscreen, 5);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__touchGestureRecognition = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION, Types._Touchscreen, 6);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__usableWithPen = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__USABLE_WITH_PEN, Types._Touchscreen, 7);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__width = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__WIDTH, Types._Touchscreen, 8);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__xPixel = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__XPIXEL, Types._Touchscreen, 9);
		public static final /*@NonNull*/ ExecutorProperty _Touchscreen__yPixel = new EcoreExecutorProperty(PlatformPackage.Literals.TOUCHSCREEN__YPIXEL, Types._Touchscreen, 10);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AuditiveInputDevice =
		{
			Fragments._AuditiveInputDevice__OclAny /* 0 */,
			Fragments._AuditiveInputDevice__OclElement /* 1 */,
			Fragments._AuditiveInputDevice__ElementaryTasksForInputDevices /* 2 */,
			Fragments._AuditiveInputDevice__Ressource /* 2 */,
			Fragments._AuditiveInputDevice__ElementaryRessource /* 3 */,
			Fragments._AuditiveInputDevice__InteractionRessource /* 4 */,
			Fragments._AuditiveInputDevice__InputDevice /* 5 */,
			Fragments._AuditiveInputDevice__AuditiveInputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __AuditiveInputDevice = { 1,1,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AuditiveOutputDevice =
		{
			Fragments._AuditiveOutputDevice__OclAny /* 0 */,
			Fragments._AuditiveOutputDevice__OclElement /* 1 */,
			Fragments._AuditiveOutputDevice__Ressource /* 2 */,
			Fragments._AuditiveOutputDevice__ElementaryRessource /* 3 */,
			Fragments._AuditiveOutputDevice__InteractionRessource /* 4 */,
			Fragments._AuditiveOutputDevice__OutputDevice /* 5 */,
			Fragments._AuditiveOutputDevice__AuditiveOutputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __AuditiveOutputDevice = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BooleanProperty =
		{
			Fragments._BooleanProperty__OclAny /* 0 */,
			Fragments._BooleanProperty__OclElement /* 1 */,
			Fragments._BooleanProperty__GenericProperty /* 2 */,
			Fragments._BooleanProperty__BooleanProperty /* 3 */
		};
		private static final int /*@NonNull*/ [] __BooleanProperty = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Camera =
		{
			Fragments._Camera__OclAny /* 0 */,
			Fragments._Camera__OclElement /* 1 */,
			Fragments._Camera__ElementaryTasksForInputDevices /* 2 */,
			Fragments._Camera__Ressource /* 2 */,
			Fragments._Camera__ElementaryRessource /* 3 */,
			Fragments._Camera__InteractionRessource /* 4 */,
			Fragments._Camera__InputDevice /* 5 */,
			Fragments._Camera__VisualInputDevice /* 6 */,
			Fragments._Camera__Camera /* 7 */
		};
		private static final int /*@NonNull*/ [] __Camera = { 1,1,2,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ComplexRessource =
		{
			Fragments._ComplexRessource__OclAny /* 0 */,
			Fragments._ComplexRessource__OclElement /* 1 */,
			Fragments._ComplexRessource__Ressource /* 2 */,
			Fragments._ComplexRessource__ComplexRessource /* 3 */
		};
		private static final int /*@NonNull*/ [] __ComplexRessource = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Display =
		{
			Fragments._Display__OclAny /* 0 */,
			Fragments._Display__OclElement /* 1 */,
			Fragments._Display__Ressource /* 2 */,
			Fragments._Display__ElementaryRessource /* 3 */,
			Fragments._Display__InteractionRessource /* 4 */,
			Fragments._Display__OutputDevice /* 5 */,
			Fragments._Display__VisualOutputDevice /* 6 */,
			Fragments._Display__Display /* 7 */
		};
		private static final int /*@NonNull*/ [] __Display = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ElementaryRessource =
		{
			Fragments._ElementaryRessource__OclAny /* 0 */,
			Fragments._ElementaryRessource__OclElement /* 1 */,
			Fragments._ElementaryRessource__Ressource /* 2 */,
			Fragments._ElementaryRessource__ElementaryRessource /* 3 */
		};
		private static final int /*@NonNull*/ [] __ElementaryRessource = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ElementaryTaskEvaluation =
		{
			Fragments._ElementaryTaskEvaluation__OclAny /* 0 */,
			Fragments._ElementaryTaskEvaluation__OclElement /* 1 */,
			Fragments._ElementaryTaskEvaluation__OclType /* 2 */,
			Fragments._ElementaryTaskEvaluation__OclEnumeration /* 3 */,
			Fragments._ElementaryTaskEvaluation__ElementaryTaskEvaluation /* 4 */
		};
		private static final int /*@NonNull*/ [] __ElementaryTaskEvaluation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ElementaryTasksForInputDevices =
		{
			Fragments._ElementaryTasksForInputDevices__OclAny /* 0 */,
			Fragments._ElementaryTasksForInputDevices__OclElement /* 1 */,
			Fragments._ElementaryTasksForInputDevices__ElementaryTasksForInputDevices /* 2 */
		};
		private static final int /*@NonNull*/ [] __ElementaryTasksForInputDevices = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _FloatProperty =
		{
			Fragments._FloatProperty__OclAny /* 0 */,
			Fragments._FloatProperty__OclElement /* 1 */,
			Fragments._FloatProperty__GenericProperty /* 2 */,
			Fragments._FloatProperty__FloatProperty /* 3 */
		};
		private static final int /*@NonNull*/ [] __FloatProperty = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GenericComplexRessource =
		{
			Fragments._GenericComplexRessource__OclAny /* 0 */,
			Fragments._GenericComplexRessource__OclElement /* 1 */,
			Fragments._GenericComplexRessource__Ressource /* 2 */,
			Fragments._GenericComplexRessource__ComplexRessource /* 3 */,
			Fragments._GenericComplexRessource__GenericComplexRessource /* 4 */
		};
		private static final int /*@NonNull*/ [] __GenericComplexRessource = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GenericProperty =
		{
			Fragments._GenericProperty__OclAny /* 0 */,
			Fragments._GenericProperty__OclElement /* 1 */,
			Fragments._GenericProperty__GenericProperty /* 2 */
		};
		private static final int /*@NonNull*/ [] __GenericProperty = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Hardkey =
		{
			Fragments._Hardkey__OclAny /* 0 */,
			Fragments._Hardkey__OclElement /* 1 */,
			Fragments._Hardkey__ElementaryTasksForInputDevices /* 2 */,
			Fragments._Hardkey__Ressource /* 2 */,
			Fragments._Hardkey__ElementaryRessource /* 3 */,
			Fragments._Hardkey__InteractionRessource /* 4 */,
			Fragments._Hardkey__InputDevice /* 5 */,
			Fragments._Hardkey__TactileInputDevice /* 6 */,
			Fragments._Hardkey__Hardkey /* 7 */
		};
		private static final int /*@NonNull*/ [] __Hardkey = { 1,1,2,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _HardkeyType =
		{
			Fragments._HardkeyType__OclAny /* 0 */,
			Fragments._HardkeyType__OclElement /* 1 */,
			Fragments._HardkeyType__OclType /* 2 */,
			Fragments._HardkeyType__OclEnumeration /* 3 */,
			Fragments._HardkeyType__HardkeyType /* 4 */
		};
		private static final int /*@NonNull*/ [] __HardkeyType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InputDevice =
		{
			Fragments._InputDevice__OclAny /* 0 */,
			Fragments._InputDevice__OclElement /* 1 */,
			Fragments._InputDevice__ElementaryTasksForInputDevices /* 2 */,
			Fragments._InputDevice__Ressource /* 2 */,
			Fragments._InputDevice__ElementaryRessource /* 3 */,
			Fragments._InputDevice__InteractionRessource /* 4 */,
			Fragments._InputDevice__InputDevice /* 5 */
		};
		private static final int /*@NonNull*/ [] __InputDevice = { 1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _IntegerProperty =
		{
			Fragments._IntegerProperty__OclAny /* 0 */,
			Fragments._IntegerProperty__OclElement /* 1 */,
			Fragments._IntegerProperty__GenericProperty /* 2 */,
			Fragments._IntegerProperty__IntegerProperty /* 3 */
		};
		private static final int /*@NonNull*/ [] __IntegerProperty = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InteractionModality =
		{
			Fragments._InteractionModality__OclAny /* 0 */,
			Fragments._InteractionModality__OclElement /* 1 */,
			Fragments._InteractionModality__OclType /* 2 */,
			Fragments._InteractionModality__OclEnumeration /* 3 */,
			Fragments._InteractionModality__InteractionModality /* 4 */
		};
		private static final int /*@NonNull*/ [] __InteractionModality = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InteractionProperty =
		{
			Fragments._InteractionProperty__OclAny /* 0 */,
			Fragments._InteractionProperty__OclElement /* 1 */,
			Fragments._InteractionProperty__GenericProperty /* 2 */,
			Fragments._InteractionProperty__InteractionProperty /* 3 */
		};
		private static final int /*@NonNull*/ [] __InteractionProperty = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InteractionRessource =
		{
			Fragments._InteractionRessource__OclAny /* 0 */,
			Fragments._InteractionRessource__OclElement /* 1 */,
			Fragments._InteractionRessource__Ressource /* 2 */,
			Fragments._InteractionRessource__ElementaryRessource /* 3 */,
			Fragments._InteractionRessource__InteractionRessource /* 4 */
		};
		private static final int /*@NonNull*/ [] __InteractionRessource = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Keyboard =
		{
			Fragments._Keyboard__OclAny /* 0 */,
			Fragments._Keyboard__OclElement /* 1 */,
			Fragments._Keyboard__Ressource /* 2 */,
			Fragments._Keyboard__ComplexRessource /* 3 */,
			Fragments._Keyboard__Keyboard /* 4 */
		};
		private static final int /*@NonNull*/ [] __Keyboard = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _KeyboardType =
		{
			Fragments._KeyboardType__OclAny /* 0 */,
			Fragments._KeyboardType__OclElement /* 1 */,
			Fragments._KeyboardType__OclType /* 2 */,
			Fragments._KeyboardType__OclEnumeration /* 3 */,
			Fragments._KeyboardType__KeyboardType /* 4 */
		};
		private static final int /*@NonNull*/ [] __KeyboardType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _LightingDevice =
		{
			Fragments._LightingDevice__OclAny /* 0 */,
			Fragments._LightingDevice__OclElement /* 1 */,
			Fragments._LightingDevice__Ressource /* 2 */,
			Fragments._LightingDevice__ElementaryRessource /* 3 */,
			Fragments._LightingDevice__InteractionRessource /* 4 */,
			Fragments._LightingDevice__OutputDevice /* 5 */,
			Fragments._LightingDevice__VisualOutputDevice /* 6 */,
			Fragments._LightingDevice__LightingDevice /* 7 */
		};
		private static final int /*@NonNull*/ [] __LightingDevice = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Microphone =
		{
			Fragments._Microphone__OclAny /* 0 */,
			Fragments._Microphone__OclElement /* 1 */,
			Fragments._Microphone__ElementaryTasksForInputDevices /* 2 */,
			Fragments._Microphone__Ressource /* 2 */,
			Fragments._Microphone__ElementaryRessource /* 3 */,
			Fragments._Microphone__InteractionRessource /* 4 */,
			Fragments._Microphone__InputDevice /* 5 */,
			Fragments._Microphone__AuditiveInputDevice /* 6 */,
			Fragments._Microphone__Microphone /* 7 */
		};
		private static final int /*@NonNull*/ [] __Microphone = { 1,1,2,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mouse =
		{
			Fragments._Mouse__OclAny /* 0 */,
			Fragments._Mouse__OclElement /* 1 */,
			Fragments._Mouse__Ressource /* 2 */,
			Fragments._Mouse__ComplexRessource /* 3 */,
			Fragments._Mouse__Mouse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Mouse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _OutputDevice =
		{
			Fragments._OutputDevice__OclAny /* 0 */,
			Fragments._OutputDevice__OclElement /* 1 */,
			Fragments._OutputDevice__Ressource /* 2 */,
			Fragments._OutputDevice__ElementaryRessource /* 3 */,
			Fragments._OutputDevice__InteractionRessource /* 4 */,
			Fragments._OutputDevice__OutputDevice /* 5 */
		};
		private static final int /*@NonNull*/ [] __OutputDevice = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PMbase =
		{
			Fragments._PMbase__OclAny /* 0 */,
			Fragments._PMbase__OclElement /* 1 */,
			Fragments._PMbase__PMbase /* 2 */
		};
		private static final int /*@NonNull*/ [] __PMbase = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Platform =
		{
			Fragments._Platform__OclAny /* 0 */,
			Fragments._Platform__OclElement /* 1 */,
			Fragments._Platform__Platform /* 2 */
		};
		private static final int /*@NonNull*/ [] __Platform = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PlatformType =
		{
			Fragments._PlatformType__OclAny /* 0 */,
			Fragments._PlatformType__OclElement /* 1 */,
			Fragments._PlatformType__OclType /* 2 */,
			Fragments._PlatformType__OclEnumeration /* 3 */,
			Fragments._PlatformType__PlatformType /* 4 */
		};
		private static final int /*@NonNull*/ [] __PlatformType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PointingDevice =
		{
			Fragments._PointingDevice__OclAny /* 0 */,
			Fragments._PointingDevice__OclElement /* 1 */,
			Fragments._PointingDevice__ElementaryTasksForInputDevices /* 2 */,
			Fragments._PointingDevice__Ressource /* 2 */,
			Fragments._PointingDevice__ElementaryRessource /* 3 */,
			Fragments._PointingDevice__InteractionRessource /* 4 */,
			Fragments._PointingDevice__InputDevice /* 5 */,
			Fragments._PointingDevice__PointingDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __PointingDevice = { 1,1,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ProprioceptiveInputDevice =
		{
			Fragments._ProprioceptiveInputDevice__OclAny /* 0 */,
			Fragments._ProprioceptiveInputDevice__OclElement /* 1 */,
			Fragments._ProprioceptiveInputDevice__ElementaryTasksForInputDevices /* 2 */,
			Fragments._ProprioceptiveInputDevice__Ressource /* 2 */,
			Fragments._ProprioceptiveInputDevice__ElementaryRessource /* 3 */,
			Fragments._ProprioceptiveInputDevice__InteractionRessource /* 4 */,
			Fragments._ProprioceptiveInputDevice__InputDevice /* 5 */,
			Fragments._ProprioceptiveInputDevice__ProprioceptiveInputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __ProprioceptiveInputDevice = { 1,1,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ProprioceptiveOutputDevice =
		{
			Fragments._ProprioceptiveOutputDevice__OclAny /* 0 */,
			Fragments._ProprioceptiveOutputDevice__OclElement /* 1 */,
			Fragments._ProprioceptiveOutputDevice__Ressource /* 2 */,
			Fragments._ProprioceptiveOutputDevice__ElementaryRessource /* 3 */,
			Fragments._ProprioceptiveOutputDevice__InteractionRessource /* 4 */,
			Fragments._ProprioceptiveOutputDevice__OutputDevice /* 5 */,
			Fragments._ProprioceptiveOutputDevice__ProprioceptiveOutputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __ProprioceptiveOutputDevice = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ressource =
		{
			Fragments._Ressource__OclAny /* 0 */,
			Fragments._Ressource__OclElement /* 1 */,
			Fragments._Ressource__Ressource /* 2 */
		};
		private static final int /*@NonNull*/ [] __Ressource = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sensibility =
		{
			Fragments._Sensibility__OclAny /* 0 */,
			Fragments._Sensibility__OclElement /* 1 */,
			Fragments._Sensibility__OclType /* 2 */,
			Fragments._Sensibility__OclEnumeration /* 3 */,
			Fragments._Sensibility__Sensibility /* 4 */
		};
		private static final int /*@NonNull*/ [] __Sensibility = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SizeEvaluation =
		{
			Fragments._SizeEvaluation__OclAny /* 0 */,
			Fragments._SizeEvaluation__OclElement /* 1 */,
			Fragments._SizeEvaluation__OclType /* 2 */,
			Fragments._SizeEvaluation__OclEnumeration /* 3 */,
			Fragments._SizeEvaluation__SizeEvaluation /* 4 */
		};
		private static final int /*@NonNull*/ [] __SizeEvaluation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Speaker =
		{
			Fragments._Speaker__OclAny /* 0 */,
			Fragments._Speaker__OclElement /* 1 */,
			Fragments._Speaker__Ressource /* 2 */,
			Fragments._Speaker__ElementaryRessource /* 3 */,
			Fragments._Speaker__InteractionRessource /* 4 */,
			Fragments._Speaker__OutputDevice /* 5 */,
			Fragments._Speaker__AuditiveOutputDevice /* 6 */,
			Fragments._Speaker__Speaker /* 7 */
		};
		private static final int /*@NonNull*/ [] __Speaker = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StringProperty =
		{
			Fragments._StringProperty__OclAny /* 0 */,
			Fragments._StringProperty__OclElement /* 1 */,
			Fragments._StringProperty__GenericProperty /* 2 */,
			Fragments._StringProperty__StringProperty /* 3 */
		};
		private static final int /*@NonNull*/ [] __StringProperty = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TactileInputDevice =
		{
			Fragments._TactileInputDevice__OclAny /* 0 */,
			Fragments._TactileInputDevice__OclElement /* 1 */,
			Fragments._TactileInputDevice__ElementaryTasksForInputDevices /* 2 */,
			Fragments._TactileInputDevice__Ressource /* 2 */,
			Fragments._TactileInputDevice__ElementaryRessource /* 3 */,
			Fragments._TactileInputDevice__InteractionRessource /* 4 */,
			Fragments._TactileInputDevice__InputDevice /* 5 */,
			Fragments._TactileInputDevice__TactileInputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __TactileInputDevice = { 1,1,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TactileOutputDevice =
		{
			Fragments._TactileOutputDevice__OclAny /* 0 */,
			Fragments._TactileOutputDevice__OclElement /* 1 */,
			Fragments._TactileOutputDevice__Ressource /* 2 */,
			Fragments._TactileOutputDevice__ElementaryRessource /* 3 */,
			Fragments._TactileOutputDevice__InteractionRessource /* 4 */,
			Fragments._TactileOutputDevice__OutputDevice /* 5 */,
			Fragments._TactileOutputDevice__TactileOutputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __TactileOutputDevice = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Touchscreen =
		{
			Fragments._Touchscreen__OclAny /* 0 */,
			Fragments._Touchscreen__OclElement /* 1 */,
			Fragments._Touchscreen__ElementaryTasksForInputDevices /* 2 */,
			Fragments._Touchscreen__Ressource /* 2 */,
			Fragments._Touchscreen__ElementaryRessource /* 3 */,
			Fragments._Touchscreen__InteractionRessource /* 4 */,
			Fragments._Touchscreen__InputDevice /* 5 */,
			Fragments._Touchscreen__TactileInputDevice /* 6 */,
			Fragments._Touchscreen__Touchscreen /* 7 */
		};
		private static final int /*@NonNull*/ [] __Touchscreen = { 1,1,2,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VibrationMotor =
		{
			Fragments._VibrationMotor__OclAny /* 0 */,
			Fragments._VibrationMotor__OclElement /* 1 */,
			Fragments._VibrationMotor__Ressource /* 2 */,
			Fragments._VibrationMotor__ElementaryRessource /* 3 */,
			Fragments._VibrationMotor__InteractionRessource /* 4 */,
			Fragments._VibrationMotor__OutputDevice /* 5 */,
			Fragments._VibrationMotor__TactileOutputDevice /* 6 */,
			Fragments._VibrationMotor__VibrationMotor /* 7 */
		};
		private static final int /*@NonNull*/ [] __VibrationMotor = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VisualInputDevice =
		{
			Fragments._VisualInputDevice__OclAny /* 0 */,
			Fragments._VisualInputDevice__OclElement /* 1 */,
			Fragments._VisualInputDevice__ElementaryTasksForInputDevices /* 2 */,
			Fragments._VisualInputDevice__Ressource /* 2 */,
			Fragments._VisualInputDevice__ElementaryRessource /* 3 */,
			Fragments._VisualInputDevice__InteractionRessource /* 4 */,
			Fragments._VisualInputDevice__InputDevice /* 5 */,
			Fragments._VisualInputDevice__VisualInputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __VisualInputDevice = { 1,1,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VisualOutputDevice =
		{
			Fragments._VisualOutputDevice__OclAny /* 0 */,
			Fragments._VisualOutputDevice__OclElement /* 1 */,
			Fragments._VisualOutputDevice__Ressource /* 2 */,
			Fragments._VisualOutputDevice__ElementaryRessource /* 3 */,
			Fragments._VisualOutputDevice__InteractionRessource /* 4 */,
			Fragments._VisualOutputDevice__OutputDevice /* 5 */,
			Fragments._VisualOutputDevice__VisualOutputDevice /* 6 */
		};
		private static final int /*@NonNull*/ [] __VisualOutputDevice = { 1,1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AuditiveInputDevice.initFragments(_AuditiveInputDevice, __AuditiveInputDevice);
			Types._AuditiveOutputDevice.initFragments(_AuditiveOutputDevice, __AuditiveOutputDevice);
			Types._BooleanProperty.initFragments(_BooleanProperty, __BooleanProperty);
			Types._Camera.initFragments(_Camera, __Camera);
			Types._ComplexRessource.initFragments(_ComplexRessource, __ComplexRessource);
			Types._Display.initFragments(_Display, __Display);
			Types._ElementaryRessource.initFragments(_ElementaryRessource, __ElementaryRessource);
			Types._ElementaryTaskEvaluation.initFragments(_ElementaryTaskEvaluation, __ElementaryTaskEvaluation);
			Types._ElementaryTasksForInputDevices.initFragments(_ElementaryTasksForInputDevices, __ElementaryTasksForInputDevices);
			Types._FloatProperty.initFragments(_FloatProperty, __FloatProperty);
			Types._GenericComplexRessource.initFragments(_GenericComplexRessource, __GenericComplexRessource);
			Types._GenericProperty.initFragments(_GenericProperty, __GenericProperty);
			Types._Hardkey.initFragments(_Hardkey, __Hardkey);
			Types._HardkeyType.initFragments(_HardkeyType, __HardkeyType);
			Types._InputDevice.initFragments(_InputDevice, __InputDevice);
			Types._IntegerProperty.initFragments(_IntegerProperty, __IntegerProperty);
			Types._InteractionModality.initFragments(_InteractionModality, __InteractionModality);
			Types._InteractionProperty.initFragments(_InteractionProperty, __InteractionProperty);
			Types._InteractionRessource.initFragments(_InteractionRessource, __InteractionRessource);
			Types._Keyboard.initFragments(_Keyboard, __Keyboard);
			Types._KeyboardType.initFragments(_KeyboardType, __KeyboardType);
			Types._LightingDevice.initFragments(_LightingDevice, __LightingDevice);
			Types._Microphone.initFragments(_Microphone, __Microphone);
			Types._Mouse.initFragments(_Mouse, __Mouse);
			Types._OutputDevice.initFragments(_OutputDevice, __OutputDevice);
			Types._PMbase.initFragments(_PMbase, __PMbase);
			Types._Platform.initFragments(_Platform, __Platform);
			Types._PlatformType.initFragments(_PlatformType, __PlatformType);
			Types._PointingDevice.initFragments(_PointingDevice, __PointingDevice);
			Types._ProprioceptiveInputDevice.initFragments(_ProprioceptiveInputDevice, __ProprioceptiveInputDevice);
			Types._ProprioceptiveOutputDevice.initFragments(_ProprioceptiveOutputDevice, __ProprioceptiveOutputDevice);
			Types._Ressource.initFragments(_Ressource, __Ressource);
			Types._Sensibility.initFragments(_Sensibility, __Sensibility);
			Types._SizeEvaluation.initFragments(_SizeEvaluation, __SizeEvaluation);
			Types._Speaker.initFragments(_Speaker, __Speaker);
			Types._StringProperty.initFragments(_StringProperty, __StringProperty);
			Types._TactileInputDevice.initFragments(_TactileInputDevice, __TactileInputDevice);
			Types._TactileOutputDevice.initFragments(_TactileOutputDevice, __TactileOutputDevice);
			Types._Touchscreen.initFragments(_Touchscreen, __Touchscreen);
			Types._VibrationMotor.initFragments(_VibrationMotor, __VibrationMotor);
			Types._VisualInputDevice.initFragments(_VisualInputDevice, __VisualInputDevice);
			Types._VisualOutputDevice.initFragments(_VisualOutputDevice, __VisualOutputDevice);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__AuditiveInputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveInputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__AuditiveOutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AuditiveOutputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanProperty__BooleanProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanProperty__GenericProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__Camera = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Camera__VisualInputDevice = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComplexRessource__ComplexRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComplexRessource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComplexRessource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComplexRessource__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__Display = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Display__VisualOutputDevice = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryRessource__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryRessource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryRessource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryRessource__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTaskEvaluation__ElementaryTaskEvaluation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTaskEvaluation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTaskEvaluation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTaskEvaluation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTaskEvaluation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTasksForInputDevices__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTasksForInputDevices__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElementaryTasksForInputDevices__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FloatProperty__FloatProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FloatProperty__GenericProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FloatProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FloatProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericComplexRessource__GenericComplexRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericComplexRessource__ComplexRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericComplexRessource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericComplexRessource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericComplexRessource__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericProperty__GenericProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GenericProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__Hardkey = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hardkey__TactileInputDevice = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HardkeyType__HardkeyType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HardkeyType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HardkeyType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HardkeyType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HardkeyType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IntegerProperty__IntegerProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IntegerProperty__GenericProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IntegerProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IntegerProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionModality__InteractionModality = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionModality__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionModality__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionModality__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionModality__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionProperty__InteractionProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionProperty__GenericProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionRessource__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionRessource__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionRessource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionRessource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InteractionRessource__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keyboard__Keyboard = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keyboard__ComplexRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keyboard__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keyboard__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keyboard__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _KeyboardType__KeyboardType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _KeyboardType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _KeyboardType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _KeyboardType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _KeyboardType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__LightingDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LightingDevice__VisualOutputDevice = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__Microphone = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__AuditiveInputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Microphone__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouse__Mouse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouse__ComplexRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouse__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputDevice__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OutputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PMbase__PMbase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PMbase__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PMbase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Platform__Platform = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Platform__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Platform__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlatformType__PlatformType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlatformType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlatformType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlatformType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PlatformType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__PointingDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointingDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__ProprioceptiveInputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveInputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__ProprioceptiveOutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ProprioceptiveOutputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ressource__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ressource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ressource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensibility__Sensibility = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensibility__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensibility__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensibility__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensibility__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SizeEvaluation__SizeEvaluation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SizeEvaluation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SizeEvaluation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SizeEvaluation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SizeEvaluation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__Speaker = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__AuditiveOutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Speaker__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringProperty__StringProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringProperty__GenericProperty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__TactileInputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileInputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__TactileOutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TactileOutputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__Touchscreen = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchscreen__TactileInputDevice = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__VibrationMotor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__Ressource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VibrationMotor__TactileOutputDevice = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__VisualInputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__ElementaryTasksForInputDevices = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__InputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualInputDevice__Ressource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__VisualOutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__ElementaryRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__InteractionRessource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__OutputDevice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisualOutputDevice__Ressource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AuditiveInputDevice__AuditiveInputDevice.initOperations(_AuditiveInputDevice__AuditiveInputDevice);
			Fragments._AuditiveInputDevice__ElementaryRessource.initOperations(_AuditiveInputDevice__ElementaryRessource);
			Fragments._AuditiveInputDevice__ElementaryTasksForInputDevices.initOperations(_AuditiveInputDevice__ElementaryTasksForInputDevices);
			Fragments._AuditiveInputDevice__InputDevice.initOperations(_AuditiveInputDevice__InputDevice);
			Fragments._AuditiveInputDevice__InteractionRessource.initOperations(_AuditiveInputDevice__InteractionRessource);
			Fragments._AuditiveInputDevice__OclAny.initOperations(_AuditiveInputDevice__OclAny);
			Fragments._AuditiveInputDevice__OclElement.initOperations(_AuditiveInputDevice__OclElement);
			Fragments._AuditiveInputDevice__Ressource.initOperations(_AuditiveInputDevice__Ressource);

			Fragments._AuditiveOutputDevice__AuditiveOutputDevice.initOperations(_AuditiveOutputDevice__AuditiveOutputDevice);
			Fragments._AuditiveOutputDevice__ElementaryRessource.initOperations(_AuditiveOutputDevice__ElementaryRessource);
			Fragments._AuditiveOutputDevice__InteractionRessource.initOperations(_AuditiveOutputDevice__InteractionRessource);
			Fragments._AuditiveOutputDevice__OclAny.initOperations(_AuditiveOutputDevice__OclAny);
			Fragments._AuditiveOutputDevice__OclElement.initOperations(_AuditiveOutputDevice__OclElement);
			Fragments._AuditiveOutputDevice__OutputDevice.initOperations(_AuditiveOutputDevice__OutputDevice);
			Fragments._AuditiveOutputDevice__Ressource.initOperations(_AuditiveOutputDevice__Ressource);

			Fragments._BooleanProperty__BooleanProperty.initOperations(_BooleanProperty__BooleanProperty);
			Fragments._BooleanProperty__GenericProperty.initOperations(_BooleanProperty__GenericProperty);
			Fragments._BooleanProperty__OclAny.initOperations(_BooleanProperty__OclAny);
			Fragments._BooleanProperty__OclElement.initOperations(_BooleanProperty__OclElement);

			Fragments._Camera__Camera.initOperations(_Camera__Camera);
			Fragments._Camera__ElementaryRessource.initOperations(_Camera__ElementaryRessource);
			Fragments._Camera__ElementaryTasksForInputDevices.initOperations(_Camera__ElementaryTasksForInputDevices);
			Fragments._Camera__InputDevice.initOperations(_Camera__InputDevice);
			Fragments._Camera__InteractionRessource.initOperations(_Camera__InteractionRessource);
			Fragments._Camera__OclAny.initOperations(_Camera__OclAny);
			Fragments._Camera__OclElement.initOperations(_Camera__OclElement);
			Fragments._Camera__Ressource.initOperations(_Camera__Ressource);
			Fragments._Camera__VisualInputDevice.initOperations(_Camera__VisualInputDevice);

			Fragments._ComplexRessource__ComplexRessource.initOperations(_ComplexRessource__ComplexRessource);
			Fragments._ComplexRessource__OclAny.initOperations(_ComplexRessource__OclAny);
			Fragments._ComplexRessource__OclElement.initOperations(_ComplexRessource__OclElement);
			Fragments._ComplexRessource__Ressource.initOperations(_ComplexRessource__Ressource);

			Fragments._Display__Display.initOperations(_Display__Display);
			Fragments._Display__ElementaryRessource.initOperations(_Display__ElementaryRessource);
			Fragments._Display__InteractionRessource.initOperations(_Display__InteractionRessource);
			Fragments._Display__OclAny.initOperations(_Display__OclAny);
			Fragments._Display__OclElement.initOperations(_Display__OclElement);
			Fragments._Display__OutputDevice.initOperations(_Display__OutputDevice);
			Fragments._Display__Ressource.initOperations(_Display__Ressource);
			Fragments._Display__VisualOutputDevice.initOperations(_Display__VisualOutputDevice);

			Fragments._ElementaryRessource__ElementaryRessource.initOperations(_ElementaryRessource__ElementaryRessource);
			Fragments._ElementaryRessource__OclAny.initOperations(_ElementaryRessource__OclAny);
			Fragments._ElementaryRessource__OclElement.initOperations(_ElementaryRessource__OclElement);
			Fragments._ElementaryRessource__Ressource.initOperations(_ElementaryRessource__Ressource);

			Fragments._ElementaryTaskEvaluation__ElementaryTaskEvaluation.initOperations(_ElementaryTaskEvaluation__ElementaryTaskEvaluation);
			Fragments._ElementaryTaskEvaluation__OclAny.initOperations(_ElementaryTaskEvaluation__OclAny);
			Fragments._ElementaryTaskEvaluation__OclElement.initOperations(_ElementaryTaskEvaluation__OclElement);
			Fragments._ElementaryTaskEvaluation__OclEnumeration.initOperations(_ElementaryTaskEvaluation__OclEnumeration);
			Fragments._ElementaryTaskEvaluation__OclType.initOperations(_ElementaryTaskEvaluation__OclType);

			Fragments._ElementaryTasksForInputDevices__ElementaryTasksForInputDevices.initOperations(_ElementaryTasksForInputDevices__ElementaryTasksForInputDevices);
			Fragments._ElementaryTasksForInputDevices__OclAny.initOperations(_ElementaryTasksForInputDevices__OclAny);
			Fragments._ElementaryTasksForInputDevices__OclElement.initOperations(_ElementaryTasksForInputDevices__OclElement);

			Fragments._FloatProperty__FloatProperty.initOperations(_FloatProperty__FloatProperty);
			Fragments._FloatProperty__GenericProperty.initOperations(_FloatProperty__GenericProperty);
			Fragments._FloatProperty__OclAny.initOperations(_FloatProperty__OclAny);
			Fragments._FloatProperty__OclElement.initOperations(_FloatProperty__OclElement);

			Fragments._GenericComplexRessource__ComplexRessource.initOperations(_GenericComplexRessource__ComplexRessource);
			Fragments._GenericComplexRessource__GenericComplexRessource.initOperations(_GenericComplexRessource__GenericComplexRessource);
			Fragments._GenericComplexRessource__OclAny.initOperations(_GenericComplexRessource__OclAny);
			Fragments._GenericComplexRessource__OclElement.initOperations(_GenericComplexRessource__OclElement);
			Fragments._GenericComplexRessource__Ressource.initOperations(_GenericComplexRessource__Ressource);

			Fragments._GenericProperty__GenericProperty.initOperations(_GenericProperty__GenericProperty);
			Fragments._GenericProperty__OclAny.initOperations(_GenericProperty__OclAny);
			Fragments._GenericProperty__OclElement.initOperations(_GenericProperty__OclElement);

			Fragments._Hardkey__ElementaryRessource.initOperations(_Hardkey__ElementaryRessource);
			Fragments._Hardkey__ElementaryTasksForInputDevices.initOperations(_Hardkey__ElementaryTasksForInputDevices);
			Fragments._Hardkey__Hardkey.initOperations(_Hardkey__Hardkey);
			Fragments._Hardkey__InputDevice.initOperations(_Hardkey__InputDevice);
			Fragments._Hardkey__InteractionRessource.initOperations(_Hardkey__InteractionRessource);
			Fragments._Hardkey__OclAny.initOperations(_Hardkey__OclAny);
			Fragments._Hardkey__OclElement.initOperations(_Hardkey__OclElement);
			Fragments._Hardkey__Ressource.initOperations(_Hardkey__Ressource);
			Fragments._Hardkey__TactileInputDevice.initOperations(_Hardkey__TactileInputDevice);

			Fragments._HardkeyType__HardkeyType.initOperations(_HardkeyType__HardkeyType);
			Fragments._HardkeyType__OclAny.initOperations(_HardkeyType__OclAny);
			Fragments._HardkeyType__OclElement.initOperations(_HardkeyType__OclElement);
			Fragments._HardkeyType__OclEnumeration.initOperations(_HardkeyType__OclEnumeration);
			Fragments._HardkeyType__OclType.initOperations(_HardkeyType__OclType);

			Fragments._InputDevice__ElementaryRessource.initOperations(_InputDevice__ElementaryRessource);
			Fragments._InputDevice__ElementaryTasksForInputDevices.initOperations(_InputDevice__ElementaryTasksForInputDevices);
			Fragments._InputDevice__InputDevice.initOperations(_InputDevice__InputDevice);
			Fragments._InputDevice__InteractionRessource.initOperations(_InputDevice__InteractionRessource);
			Fragments._InputDevice__OclAny.initOperations(_InputDevice__OclAny);
			Fragments._InputDevice__OclElement.initOperations(_InputDevice__OclElement);
			Fragments._InputDevice__Ressource.initOperations(_InputDevice__Ressource);

			Fragments._IntegerProperty__GenericProperty.initOperations(_IntegerProperty__GenericProperty);
			Fragments._IntegerProperty__IntegerProperty.initOperations(_IntegerProperty__IntegerProperty);
			Fragments._IntegerProperty__OclAny.initOperations(_IntegerProperty__OclAny);
			Fragments._IntegerProperty__OclElement.initOperations(_IntegerProperty__OclElement);

			Fragments._InteractionModality__InteractionModality.initOperations(_InteractionModality__InteractionModality);
			Fragments._InteractionModality__OclAny.initOperations(_InteractionModality__OclAny);
			Fragments._InteractionModality__OclElement.initOperations(_InteractionModality__OclElement);
			Fragments._InteractionModality__OclEnumeration.initOperations(_InteractionModality__OclEnumeration);
			Fragments._InteractionModality__OclType.initOperations(_InteractionModality__OclType);

			Fragments._InteractionProperty__GenericProperty.initOperations(_InteractionProperty__GenericProperty);
			Fragments._InteractionProperty__InteractionProperty.initOperations(_InteractionProperty__InteractionProperty);
			Fragments._InteractionProperty__OclAny.initOperations(_InteractionProperty__OclAny);
			Fragments._InteractionProperty__OclElement.initOperations(_InteractionProperty__OclElement);

			Fragments._InteractionRessource__ElementaryRessource.initOperations(_InteractionRessource__ElementaryRessource);
			Fragments._InteractionRessource__InteractionRessource.initOperations(_InteractionRessource__InteractionRessource);
			Fragments._InteractionRessource__OclAny.initOperations(_InteractionRessource__OclAny);
			Fragments._InteractionRessource__OclElement.initOperations(_InteractionRessource__OclElement);
			Fragments._InteractionRessource__Ressource.initOperations(_InteractionRessource__Ressource);

			Fragments._Keyboard__ComplexRessource.initOperations(_Keyboard__ComplexRessource);
			Fragments._Keyboard__Keyboard.initOperations(_Keyboard__Keyboard);
			Fragments._Keyboard__OclAny.initOperations(_Keyboard__OclAny);
			Fragments._Keyboard__OclElement.initOperations(_Keyboard__OclElement);
			Fragments._Keyboard__Ressource.initOperations(_Keyboard__Ressource);

			Fragments._KeyboardType__KeyboardType.initOperations(_KeyboardType__KeyboardType);
			Fragments._KeyboardType__OclAny.initOperations(_KeyboardType__OclAny);
			Fragments._KeyboardType__OclElement.initOperations(_KeyboardType__OclElement);
			Fragments._KeyboardType__OclEnumeration.initOperations(_KeyboardType__OclEnumeration);
			Fragments._KeyboardType__OclType.initOperations(_KeyboardType__OclType);

			Fragments._LightingDevice__ElementaryRessource.initOperations(_LightingDevice__ElementaryRessource);
			Fragments._LightingDevice__InteractionRessource.initOperations(_LightingDevice__InteractionRessource);
			Fragments._LightingDevice__LightingDevice.initOperations(_LightingDevice__LightingDevice);
			Fragments._LightingDevice__OclAny.initOperations(_LightingDevice__OclAny);
			Fragments._LightingDevice__OclElement.initOperations(_LightingDevice__OclElement);
			Fragments._LightingDevice__OutputDevice.initOperations(_LightingDevice__OutputDevice);
			Fragments._LightingDevice__Ressource.initOperations(_LightingDevice__Ressource);
			Fragments._LightingDevice__VisualOutputDevice.initOperations(_LightingDevice__VisualOutputDevice);

			Fragments._Microphone__AuditiveInputDevice.initOperations(_Microphone__AuditiveInputDevice);
			Fragments._Microphone__ElementaryRessource.initOperations(_Microphone__ElementaryRessource);
			Fragments._Microphone__ElementaryTasksForInputDevices.initOperations(_Microphone__ElementaryTasksForInputDevices);
			Fragments._Microphone__InputDevice.initOperations(_Microphone__InputDevice);
			Fragments._Microphone__InteractionRessource.initOperations(_Microphone__InteractionRessource);
			Fragments._Microphone__Microphone.initOperations(_Microphone__Microphone);
			Fragments._Microphone__OclAny.initOperations(_Microphone__OclAny);
			Fragments._Microphone__OclElement.initOperations(_Microphone__OclElement);
			Fragments._Microphone__Ressource.initOperations(_Microphone__Ressource);

			Fragments._Mouse__ComplexRessource.initOperations(_Mouse__ComplexRessource);
			Fragments._Mouse__Mouse.initOperations(_Mouse__Mouse);
			Fragments._Mouse__OclAny.initOperations(_Mouse__OclAny);
			Fragments._Mouse__OclElement.initOperations(_Mouse__OclElement);
			Fragments._Mouse__Ressource.initOperations(_Mouse__Ressource);

			Fragments._OutputDevice__ElementaryRessource.initOperations(_OutputDevice__ElementaryRessource);
			Fragments._OutputDevice__InteractionRessource.initOperations(_OutputDevice__InteractionRessource);
			Fragments._OutputDevice__OclAny.initOperations(_OutputDevice__OclAny);
			Fragments._OutputDevice__OclElement.initOperations(_OutputDevice__OclElement);
			Fragments._OutputDevice__OutputDevice.initOperations(_OutputDevice__OutputDevice);
			Fragments._OutputDevice__Ressource.initOperations(_OutputDevice__Ressource);

			Fragments._PMbase__OclAny.initOperations(_PMbase__OclAny);
			Fragments._PMbase__OclElement.initOperations(_PMbase__OclElement);
			Fragments._PMbase__PMbase.initOperations(_PMbase__PMbase);

			Fragments._Platform__OclAny.initOperations(_Platform__OclAny);
			Fragments._Platform__OclElement.initOperations(_Platform__OclElement);
			Fragments._Platform__Platform.initOperations(_Platform__Platform);

			Fragments._PlatformType__OclAny.initOperations(_PlatformType__OclAny);
			Fragments._PlatformType__OclElement.initOperations(_PlatformType__OclElement);
			Fragments._PlatformType__OclEnumeration.initOperations(_PlatformType__OclEnumeration);
			Fragments._PlatformType__OclType.initOperations(_PlatformType__OclType);
			Fragments._PlatformType__PlatformType.initOperations(_PlatformType__PlatformType);

			Fragments._PointingDevice__ElementaryRessource.initOperations(_PointingDevice__ElementaryRessource);
			Fragments._PointingDevice__ElementaryTasksForInputDevices.initOperations(_PointingDevice__ElementaryTasksForInputDevices);
			Fragments._PointingDevice__InputDevice.initOperations(_PointingDevice__InputDevice);
			Fragments._PointingDevice__InteractionRessource.initOperations(_PointingDevice__InteractionRessource);
			Fragments._PointingDevice__OclAny.initOperations(_PointingDevice__OclAny);
			Fragments._PointingDevice__OclElement.initOperations(_PointingDevice__OclElement);
			Fragments._PointingDevice__PointingDevice.initOperations(_PointingDevice__PointingDevice);
			Fragments._PointingDevice__Ressource.initOperations(_PointingDevice__Ressource);

			Fragments._ProprioceptiveInputDevice__ElementaryRessource.initOperations(_ProprioceptiveInputDevice__ElementaryRessource);
			Fragments._ProprioceptiveInputDevice__ElementaryTasksForInputDevices.initOperations(_ProprioceptiveInputDevice__ElementaryTasksForInputDevices);
			Fragments._ProprioceptiveInputDevice__InputDevice.initOperations(_ProprioceptiveInputDevice__InputDevice);
			Fragments._ProprioceptiveInputDevice__InteractionRessource.initOperations(_ProprioceptiveInputDevice__InteractionRessource);
			Fragments._ProprioceptiveInputDevice__OclAny.initOperations(_ProprioceptiveInputDevice__OclAny);
			Fragments._ProprioceptiveInputDevice__OclElement.initOperations(_ProprioceptiveInputDevice__OclElement);
			Fragments._ProprioceptiveInputDevice__ProprioceptiveInputDevice.initOperations(_ProprioceptiveInputDevice__ProprioceptiveInputDevice);
			Fragments._ProprioceptiveInputDevice__Ressource.initOperations(_ProprioceptiveInputDevice__Ressource);

			Fragments._ProprioceptiveOutputDevice__ElementaryRessource.initOperations(_ProprioceptiveOutputDevice__ElementaryRessource);
			Fragments._ProprioceptiveOutputDevice__InteractionRessource.initOperations(_ProprioceptiveOutputDevice__InteractionRessource);
			Fragments._ProprioceptiveOutputDevice__OclAny.initOperations(_ProprioceptiveOutputDevice__OclAny);
			Fragments._ProprioceptiveOutputDevice__OclElement.initOperations(_ProprioceptiveOutputDevice__OclElement);
			Fragments._ProprioceptiveOutputDevice__OutputDevice.initOperations(_ProprioceptiveOutputDevice__OutputDevice);
			Fragments._ProprioceptiveOutputDevice__ProprioceptiveOutputDevice.initOperations(_ProprioceptiveOutputDevice__ProprioceptiveOutputDevice);
			Fragments._ProprioceptiveOutputDevice__Ressource.initOperations(_ProprioceptiveOutputDevice__Ressource);

			Fragments._Ressource__OclAny.initOperations(_Ressource__OclAny);
			Fragments._Ressource__OclElement.initOperations(_Ressource__OclElement);
			Fragments._Ressource__Ressource.initOperations(_Ressource__Ressource);

			Fragments._Sensibility__OclAny.initOperations(_Sensibility__OclAny);
			Fragments._Sensibility__OclElement.initOperations(_Sensibility__OclElement);
			Fragments._Sensibility__OclEnumeration.initOperations(_Sensibility__OclEnumeration);
			Fragments._Sensibility__OclType.initOperations(_Sensibility__OclType);
			Fragments._Sensibility__Sensibility.initOperations(_Sensibility__Sensibility);

			Fragments._SizeEvaluation__OclAny.initOperations(_SizeEvaluation__OclAny);
			Fragments._SizeEvaluation__OclElement.initOperations(_SizeEvaluation__OclElement);
			Fragments._SizeEvaluation__OclEnumeration.initOperations(_SizeEvaluation__OclEnumeration);
			Fragments._SizeEvaluation__OclType.initOperations(_SizeEvaluation__OclType);
			Fragments._SizeEvaluation__SizeEvaluation.initOperations(_SizeEvaluation__SizeEvaluation);

			Fragments._Speaker__AuditiveOutputDevice.initOperations(_Speaker__AuditiveOutputDevice);
			Fragments._Speaker__ElementaryRessource.initOperations(_Speaker__ElementaryRessource);
			Fragments._Speaker__InteractionRessource.initOperations(_Speaker__InteractionRessource);
			Fragments._Speaker__OclAny.initOperations(_Speaker__OclAny);
			Fragments._Speaker__OclElement.initOperations(_Speaker__OclElement);
			Fragments._Speaker__OutputDevice.initOperations(_Speaker__OutputDevice);
			Fragments._Speaker__Ressource.initOperations(_Speaker__Ressource);
			Fragments._Speaker__Speaker.initOperations(_Speaker__Speaker);

			Fragments._StringProperty__GenericProperty.initOperations(_StringProperty__GenericProperty);
			Fragments._StringProperty__OclAny.initOperations(_StringProperty__OclAny);
			Fragments._StringProperty__OclElement.initOperations(_StringProperty__OclElement);
			Fragments._StringProperty__StringProperty.initOperations(_StringProperty__StringProperty);

			Fragments._TactileInputDevice__ElementaryRessource.initOperations(_TactileInputDevice__ElementaryRessource);
			Fragments._TactileInputDevice__ElementaryTasksForInputDevices.initOperations(_TactileInputDevice__ElementaryTasksForInputDevices);
			Fragments._TactileInputDevice__InputDevice.initOperations(_TactileInputDevice__InputDevice);
			Fragments._TactileInputDevice__InteractionRessource.initOperations(_TactileInputDevice__InteractionRessource);
			Fragments._TactileInputDevice__OclAny.initOperations(_TactileInputDevice__OclAny);
			Fragments._TactileInputDevice__OclElement.initOperations(_TactileInputDevice__OclElement);
			Fragments._TactileInputDevice__Ressource.initOperations(_TactileInputDevice__Ressource);
			Fragments._TactileInputDevice__TactileInputDevice.initOperations(_TactileInputDevice__TactileInputDevice);

			Fragments._TactileOutputDevice__ElementaryRessource.initOperations(_TactileOutputDevice__ElementaryRessource);
			Fragments._TactileOutputDevice__InteractionRessource.initOperations(_TactileOutputDevice__InteractionRessource);
			Fragments._TactileOutputDevice__OclAny.initOperations(_TactileOutputDevice__OclAny);
			Fragments._TactileOutputDevice__OclElement.initOperations(_TactileOutputDevice__OclElement);
			Fragments._TactileOutputDevice__OutputDevice.initOperations(_TactileOutputDevice__OutputDevice);
			Fragments._TactileOutputDevice__Ressource.initOperations(_TactileOutputDevice__Ressource);
			Fragments._TactileOutputDevice__TactileOutputDevice.initOperations(_TactileOutputDevice__TactileOutputDevice);

			Fragments._Touchscreen__ElementaryRessource.initOperations(_Touchscreen__ElementaryRessource);
			Fragments._Touchscreen__ElementaryTasksForInputDevices.initOperations(_Touchscreen__ElementaryTasksForInputDevices);
			Fragments._Touchscreen__InputDevice.initOperations(_Touchscreen__InputDevice);
			Fragments._Touchscreen__InteractionRessource.initOperations(_Touchscreen__InteractionRessource);
			Fragments._Touchscreen__OclAny.initOperations(_Touchscreen__OclAny);
			Fragments._Touchscreen__OclElement.initOperations(_Touchscreen__OclElement);
			Fragments._Touchscreen__Ressource.initOperations(_Touchscreen__Ressource);
			Fragments._Touchscreen__TactileInputDevice.initOperations(_Touchscreen__TactileInputDevice);
			Fragments._Touchscreen__Touchscreen.initOperations(_Touchscreen__Touchscreen);

			Fragments._VibrationMotor__ElementaryRessource.initOperations(_VibrationMotor__ElementaryRessource);
			Fragments._VibrationMotor__InteractionRessource.initOperations(_VibrationMotor__InteractionRessource);
			Fragments._VibrationMotor__OclAny.initOperations(_VibrationMotor__OclAny);
			Fragments._VibrationMotor__OclElement.initOperations(_VibrationMotor__OclElement);
			Fragments._VibrationMotor__OutputDevice.initOperations(_VibrationMotor__OutputDevice);
			Fragments._VibrationMotor__Ressource.initOperations(_VibrationMotor__Ressource);
			Fragments._VibrationMotor__TactileOutputDevice.initOperations(_VibrationMotor__TactileOutputDevice);
			Fragments._VibrationMotor__VibrationMotor.initOperations(_VibrationMotor__VibrationMotor);

			Fragments._VisualInputDevice__ElementaryRessource.initOperations(_VisualInputDevice__ElementaryRessource);
			Fragments._VisualInputDevice__ElementaryTasksForInputDevices.initOperations(_VisualInputDevice__ElementaryTasksForInputDevices);
			Fragments._VisualInputDevice__InputDevice.initOperations(_VisualInputDevice__InputDevice);
			Fragments._VisualInputDevice__InteractionRessource.initOperations(_VisualInputDevice__InteractionRessource);
			Fragments._VisualInputDevice__OclAny.initOperations(_VisualInputDevice__OclAny);
			Fragments._VisualInputDevice__OclElement.initOperations(_VisualInputDevice__OclElement);
			Fragments._VisualInputDevice__Ressource.initOperations(_VisualInputDevice__Ressource);
			Fragments._VisualInputDevice__VisualInputDevice.initOperations(_VisualInputDevice__VisualInputDevice);

			Fragments._VisualOutputDevice__ElementaryRessource.initOperations(_VisualOutputDevice__ElementaryRessource);
			Fragments._VisualOutputDevice__InteractionRessource.initOperations(_VisualOutputDevice__InteractionRessource);
			Fragments._VisualOutputDevice__OclAny.initOperations(_VisualOutputDevice__OclAny);
			Fragments._VisualOutputDevice__OclElement.initOperations(_VisualOutputDevice__OclElement);
			Fragments._VisualOutputDevice__OutputDevice.initOperations(_VisualOutputDevice__OutputDevice);
			Fragments._VisualOutputDevice__Ressource.initOperations(_VisualOutputDevice__Ressource);
			Fragments._VisualOutputDevice__VisualOutputDevice.initOperations(_VisualOutputDevice__VisualOutputDevice);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AuditiveInputDevice = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AuditiveOutputDevice = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BooleanProperty = {
			PlatformTables.Properties._BooleanProperty__booleanValue,
			PlatformTables.Properties._GenericProperty__propertyName,
			PlatformTables.Properties._GenericProperty__propertyUnit,
			PlatformTables.Properties._GenericProperty__Platform__genericProperty,
			PlatformTables.Properties._GenericProperty__Ressource__genericProperty
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Camera = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ComplexRessource = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Display = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Display__height,
			PlatformTables.Properties._Display__isColorCapable,
			PlatformTables.Properties._Display__isImagesCapable,
			PlatformTables.Properties._Display__isVideosCapable,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Display__width,
			PlatformTables.Properties._Display__xPixel,
			PlatformTables.Properties._Display__yPixel,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources,
			PlatformTables.Properties._Display__Touchscreen__correspondDisplay
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ElementaryRessource = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ElementaryTaskEvaluation = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ElementaryTasksForInputDevices = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _FloatProperty = {
			PlatformTables.Properties._FloatProperty__floatValue,
			PlatformTables.Properties._GenericProperty__propertyName,
			PlatformTables.Properties._GenericProperty__propertyUnit,
			PlatformTables.Properties._GenericProperty__Platform__genericProperty,
			PlatformTables.Properties._GenericProperty__Ressource__genericProperty
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GenericComplexRessource = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GenericProperty = {
			PlatformTables.Properties._GenericProperty__propertyName,
			PlatformTables.Properties._GenericProperty__propertyUnit,
			PlatformTables.Properties._GenericProperty__Platform__genericProperty,
			PlatformTables.Properties._GenericProperty__Ressource__genericProperty
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Hardkey = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._Hardkey__buttonColor,
			PlatformTables.Properties._Hardkey__buttonSize,
			PlatformTables.Properties._Hardkey__buttonSymbol,
			PlatformTables.Properties._Hardkey__configurable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Hardkey__hardkeyType,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Hardkey__Keyboard__hardkeys,
			PlatformTables.Properties._Hardkey__Mouse__leftMousebutton,
			PlatformTables.Properties._Hardkey__Mouse__rightMousebutton,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _HardkeyType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InputDevice = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _IntegerProperty = {
			PlatformTables.Properties._IntegerProperty__integerValue,
			PlatformTables.Properties._GenericProperty__propertyName,
			PlatformTables.Properties._GenericProperty__propertyUnit,
			PlatformTables.Properties._GenericProperty__Platform__genericProperty,
			PlatformTables.Properties._GenericProperty__Ressource__genericProperty
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InteractionModality = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InteractionProperty = {
			PlatformTables.Properties._InteractionProperty__interactionModality,
			PlatformTables.Properties._GenericProperty__propertyName,
			PlatformTables.Properties._GenericProperty__propertyUnit,
			PlatformTables.Properties._GenericProperty__Platform__genericProperty,
			PlatformTables.Properties._GenericProperty__Ressource__genericProperty
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InteractionRessource = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Keyboard = {
			PlatformTables.Properties._Keyboard__easyTextInput,
			PlatformTables.Properties._Keyboard__fastTextInput,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Keyboard__hardkeys,
			PlatformTables.Properties._Keyboard__keyboardType,
			PlatformTables.Properties._Keyboard__keyboardTypeExtraInfo,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _KeyboardType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _LightingDevice = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._LightingDevice__lightSize,
			PlatformTables.Properties._LightingDevice__lightningType,
			PlatformTables.Properties._LightingDevice__multiColorConfigurable,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Microphone = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mouse = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Mouse__leftMousebutton,
			PlatformTables.Properties._Mouse__mainPointingDevice,
			PlatformTables.Properties._Mouse__mouseSensibility,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Mouse__rightMousebutton,
			PlatformTables.Properties._ComplexRessource__subRessources,
			PlatformTables.Properties._Mouse__usableForSmoothSurface,
			PlatformTables.Properties._Mouse__usableForTranspartentSurface,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OutputDevice = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PMbase = {
			PlatformTables.Properties._PMbase__platformCollection,
			PlatformTables.Properties._PMbase__ressourceCollection
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Platform = {
			PlatformTables.Properties._Platform__genericProperty,
			PlatformTables.Properties._Platform__platformId,
			PlatformTables.Properties._Platform__platformName,
			PlatformTables.Properties._Platform__platformType,
			PlatformTables.Properties._Platform__ressources,
			PlatformTables.Properties._Platform__PMbase__platformCollection
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PlatformType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PointingDevice = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._PointingDevice__degreesOfFreedom,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._PointingDevice__hasHighPrecision,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._PointingDevice__Mouse__mainPointingDevice,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ProprioceptiveInputDevice = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ProprioceptiveOutputDevice = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ressource = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sensibility = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SizeEvaluation = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Speaker = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StringProperty = {
			PlatformTables.Properties._GenericProperty__propertyName,
			PlatformTables.Properties._GenericProperty__propertyUnit,
			PlatformTables.Properties._StringProperty__stringValue,
			PlatformTables.Properties._GenericProperty__Platform__genericProperty,
			PlatformTables.Properties._GenericProperty__Ressource__genericProperty
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TactileInputDevice = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TactileOutputDevice = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Touchscreen = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._Touchscreen__closenessRecognition,
			PlatformTables.Properties._Touchscreen__correspondDisplay,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Touchscreen__forceForActuating,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Touchscreen__height,
			PlatformTables.Properties._Touchscreen__multiTouchCapable,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._Touchscreen__tactileFeedbackCapable,
			PlatformTables.Properties._Touchscreen__touchGestureRecognition,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Touchscreen__usableWithPen,
			PlatformTables.Properties._Touchscreen__width,
			PlatformTables.Properties._Touchscreen__xPixel,
			PlatformTables.Properties._Touchscreen__yPixel,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VibrationMotor = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VisualInputDevice = {
			PlatformTables.Properties._ElementaryTasksForInputDevices__accuratePointingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__alphanumericCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__drawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastDrawingCapable,
			PlatformTables.Properties._ElementaryTasksForInputDevices__fastPointingCapable,
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._InputDevice__safeForUnwantedActions,
			PlatformTables.Properties._ElementaryTasksForInputDevices__selectingCapable,
			PlatformTables.Properties._InputDevice__usableWithGloves,
			PlatformTables.Properties._InputDevice__usableWithOneHand,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VisualOutputDevice = {
			PlatformTables.Properties._Ressource__genericProperty,
			PlatformTables.Properties._Ressource__ressourceName,
			PlatformTables.Properties._Ressource__ComplexRessource__subRessources,
			PlatformTables.Properties._Ressource__PMbase__ressourceCollection,
			PlatformTables.Properties._Ressource__Platform__ressources
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AuditiveInputDevice__AuditiveInputDevice.initProperties(_AuditiveInputDevice);
			Fragments._AuditiveOutputDevice__AuditiveOutputDevice.initProperties(_AuditiveOutputDevice);
			Fragments._BooleanProperty__BooleanProperty.initProperties(_BooleanProperty);
			Fragments._Camera__Camera.initProperties(_Camera);
			Fragments._ComplexRessource__ComplexRessource.initProperties(_ComplexRessource);
			Fragments._Display__Display.initProperties(_Display);
			Fragments._ElementaryRessource__ElementaryRessource.initProperties(_ElementaryRessource);
			Fragments._ElementaryTaskEvaluation__ElementaryTaskEvaluation.initProperties(_ElementaryTaskEvaluation);
			Fragments._ElementaryTasksForInputDevices__ElementaryTasksForInputDevices.initProperties(_ElementaryTasksForInputDevices);
			Fragments._FloatProperty__FloatProperty.initProperties(_FloatProperty);
			Fragments._GenericComplexRessource__GenericComplexRessource.initProperties(_GenericComplexRessource);
			Fragments._GenericProperty__GenericProperty.initProperties(_GenericProperty);
			Fragments._Hardkey__Hardkey.initProperties(_Hardkey);
			Fragments._HardkeyType__HardkeyType.initProperties(_HardkeyType);
			Fragments._InputDevice__InputDevice.initProperties(_InputDevice);
			Fragments._IntegerProperty__IntegerProperty.initProperties(_IntegerProperty);
			Fragments._InteractionModality__InteractionModality.initProperties(_InteractionModality);
			Fragments._InteractionProperty__InteractionProperty.initProperties(_InteractionProperty);
			Fragments._InteractionRessource__InteractionRessource.initProperties(_InteractionRessource);
			Fragments._Keyboard__Keyboard.initProperties(_Keyboard);
			Fragments._KeyboardType__KeyboardType.initProperties(_KeyboardType);
			Fragments._LightingDevice__LightingDevice.initProperties(_LightingDevice);
			Fragments._Microphone__Microphone.initProperties(_Microphone);
			Fragments._Mouse__Mouse.initProperties(_Mouse);
			Fragments._OutputDevice__OutputDevice.initProperties(_OutputDevice);
			Fragments._PMbase__PMbase.initProperties(_PMbase);
			Fragments._Platform__Platform.initProperties(_Platform);
			Fragments._PlatformType__PlatformType.initProperties(_PlatformType);
			Fragments._PointingDevice__PointingDevice.initProperties(_PointingDevice);
			Fragments._ProprioceptiveInputDevice__ProprioceptiveInputDevice.initProperties(_ProprioceptiveInputDevice);
			Fragments._ProprioceptiveOutputDevice__ProprioceptiveOutputDevice.initProperties(_ProprioceptiveOutputDevice);
			Fragments._Ressource__Ressource.initProperties(_Ressource);
			Fragments._Sensibility__Sensibility.initProperties(_Sensibility);
			Fragments._SizeEvaluation__SizeEvaluation.initProperties(_SizeEvaluation);
			Fragments._Speaker__Speaker.initProperties(_Speaker);
			Fragments._StringProperty__StringProperty.initProperties(_StringProperty);
			Fragments._TactileInputDevice__TactileInputDevice.initProperties(_TactileInputDevice);
			Fragments._TactileOutputDevice__TactileOutputDevice.initProperties(_TactileOutputDevice);
			Fragments._Touchscreen__Touchscreen.initProperties(_Touchscreen);
			Fragments._VibrationMotor__VibrationMotor.initProperties(_VibrationMotor);
			Fragments._VisualInputDevice__VisualInputDevice.initProperties(_VisualInputDevice);
			Fragments._VisualOutputDevice__VisualOutputDevice.initProperties(_VisualOutputDevice);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElementaryTaskEvaluation__other = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION.getEEnumLiteral("other"), Types._ElementaryTaskEvaluation, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElementaryTaskEvaluation__none = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION.getEEnumLiteral("none"), Types._ElementaryTaskEvaluation, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElementaryTaskEvaluation__insufficient = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION.getEEnumLiteral("insufficient"), Types._ElementaryTaskEvaluation, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElementaryTaskEvaluation__sufficient = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION.getEEnumLiteral("sufficient"), Types._ElementaryTaskEvaluation, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElementaryTaskEvaluation__good = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION.getEEnumLiteral("good"), Types._ElementaryTaskEvaluation, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElementaryTaskEvaluation__veryGood = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.ELEMENTARY_TASK_EVALUATION.getEEnumLiteral("veryGood"), Types._ElementaryTaskEvaluation, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ElementaryTaskEvaluation = {
			_ElementaryTaskEvaluation__other,
			_ElementaryTaskEvaluation__none,
			_ElementaryTaskEvaluation__insufficient,
			_ElementaryTaskEvaluation__sufficient,
			_ElementaryTaskEvaluation__good,
			_ElementaryTaskEvaluation__veryGood
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _HardkeyType__MachineSpecific = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.HARDKEY_TYPE.getEEnumLiteral("MachineSpecific"), Types._HardkeyType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _HardkeyType__DialogueSpecific = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.HARDKEY_TYPE.getEEnumLiteral("DialogueSpecific"), Types._HardkeyType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _HardkeyType = {
			_HardkeyType__MachineSpecific,
			_HardkeyType__DialogueSpecific
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__visualInput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("visualInput"), Types._InteractionModality, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__auditiveInput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("auditiveInput"), Types._InteractionModality, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__tactileInput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("tactileInput"), Types._InteractionModality, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__proprioceptiveInput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("proprioceptiveInput"), Types._InteractionModality, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__visualOutput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("visualOutput"), Types._InteractionModality, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__auditiveOutput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("auditiveOutput"), Types._InteractionModality, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__tactileOutput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("tactileOutput"), Types._InteractionModality, 6);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__proprioceptiveOutput = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("proprioceptiveOutput"), Types._InteractionModality, 7);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__other = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("other"), Types._InteractionModality, 8);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InteractionModality__none = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.INTERACTION_MODALITY.getEEnumLiteral("none"), Types._InteractionModality, 9);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InteractionModality = {
			_InteractionModality__visualInput,
			_InteractionModality__auditiveInput,
			_InteractionModality__tactileInput,
			_InteractionModality__proprioceptiveInput,
			_InteractionModality__visualOutput,
			_InteractionModality__auditiveOutput,
			_InteractionModality__tactileOutput,
			_InteractionModality__proprioceptiveOutput,
			_InteractionModality__other,
			_InteractionModality__none
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _KeyboardType__other = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.KEYBOARD_TYPE.getEEnumLiteral("other"), Types._KeyboardType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _KeyboardType__alphanumerical = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.KEYBOARD_TYPE.getEEnumLiteral("alphanumerical"), Types._KeyboardType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _KeyboardType__numerical = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.KEYBOARD_TYPE.getEEnumLiteral("numerical"), Types._KeyboardType, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _KeyboardType__keypad = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.KEYBOARD_TYPE.getEEnumLiteral("keypad"), Types._KeyboardType, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _KeyboardType__phonepad = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.KEYBOARD_TYPE.getEEnumLiteral("phonepad"), Types._KeyboardType, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _KeyboardType = {
			_KeyboardType__other,
			_KeyboardType__alphanumerical,
			_KeyboardType__numerical,
			_KeyboardType__keypad,
			_KeyboardType__phonepad
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__other = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("other"), Types._PlatformType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__ClassicPC = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("ClassicPC"), Types._PlatformType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__IndustrialPc = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("IndustrialPc"), Types._PlatformType, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__Laptop = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("Laptop"), Types._PlatformType, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__Smartphone = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("Smartphone"), Types._PlatformType, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__Tablet = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("Tablet"), Types._PlatformType, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PlatformType__HeadMountedDevice = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.PLATFORM_TYPE.getEEnumLiteral("HeadMountedDevice"), Types._PlatformType, 6);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PlatformType = {
			_PlatformType__other,
			_PlatformType__ClassicPC,
			_PlatformType__IndustrialPc,
			_PlatformType__Laptop,
			_PlatformType__Smartphone,
			_PlatformType__Tablet,
			_PlatformType__HeadMountedDevice
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Sensibility__other = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SENSIBILITY.getEEnumLiteral("other"), Types._Sensibility, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Sensibility__nonsensitive = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SENSIBILITY.getEEnumLiteral("nonsensitive"), Types._Sensibility, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Sensibility__lowSensitive = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SENSIBILITY.getEEnumLiteral("lowSensitive"), Types._Sensibility, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Sensibility__normal = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SENSIBILITY.getEEnumLiteral("normal"), Types._Sensibility, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Sensibility__sensitive = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SENSIBILITY.getEEnumLiteral("sensitive"), Types._Sensibility, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Sensibility__highSensitive = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SENSIBILITY.getEEnumLiteral("highSensitive"), Types._Sensibility, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Sensibility = {
			_Sensibility__other,
			_Sensibility__nonsensitive,
			_Sensibility__lowSensitive,
			_Sensibility__normal,
			_Sensibility__sensitive,
			_Sensibility__highSensitive
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SizeEvaluation__verySmall = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SIZE_EVALUATION.getEEnumLiteral("verySmall"), Types._SizeEvaluation, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SizeEvaluation__small = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SIZE_EVALUATION.getEEnumLiteral("small"), Types._SizeEvaluation, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SizeEvaluation__middle = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SIZE_EVALUATION.getEEnumLiteral("middle"), Types._SizeEvaluation, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SizeEvaluation__big = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SIZE_EVALUATION.getEEnumLiteral("big"), Types._SizeEvaluation, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SizeEvaluation__veryBig = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SIZE_EVALUATION.getEEnumLiteral("veryBig"), Types._SizeEvaluation, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SizeEvaluation__jumbo = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.SIZE_EVALUATION.getEEnumLiteral("jumbo"), Types._SizeEvaluation, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SizeEvaluation = {
			_SizeEvaluation__verySmall,
			_SizeEvaluation__small,
			_SizeEvaluation__middle,
			_SizeEvaluation__big,
			_SizeEvaluation__veryBig,
			_SizeEvaluation__jumbo
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ElementaryTaskEvaluation.initLiterals(_ElementaryTaskEvaluation);
			Types._HardkeyType.initLiterals(_HardkeyType);
			Types._InteractionModality.initLiterals(_InteractionModality);
			Types._KeyboardType.initLiterals(_KeyboardType);
			Types._PlatformType.initLiterals(_PlatformType);
			Types._Sensibility.initLiterals(_Sensibility);
			Types._SizeEvaluation.initLiterals(_SizeEvaluation);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
