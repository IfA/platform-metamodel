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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see platform.PlatformFactory
 * @model kind="package"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ifa/et/tu/dresden/platform/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ifa.et.tu.dresden.platform.metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link platform.impl.PMbaseImpl <em>PMbase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.PMbaseImpl
	 * @see platform.impl.PlatformPackageImpl#getPMbase()
	 * @generated
	 */
	int PMBASE = 0;

	/**
	 * The feature id for the '<em><b>Platform Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMBASE__PLATFORM_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Ressource Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMBASE__RESSOURCE_COLLECTION = 1;

	/**
	 * The number of structural features of the '<em>PMbase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMBASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PMbase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMBASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platform.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.PlatformImpl
	 * @see platform.impl.PlatformPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__PLATFORM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Platform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__PLATFORM_ID = 1;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__PLATFORM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ressources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__RESSOURCES = 3;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__GENERIC_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platform.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.RessourceImpl
	 * @see platform.impl.PlatformPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 2;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__RESSOURCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__GENERIC_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platform.impl.ComplexRessourceImpl <em>Complex Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.ComplexRessourceImpl
	 * @see platform.impl.PlatformPackageImpl#getComplexRessource()
	 * @generated
	 */
	int COMPLEX_RESSOURCE = 3;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESSOURCE__RESSOURCE_NAME = RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESSOURCE__GENERIC_PROPERTY = RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Sub Ressources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESSOURCE__SUB_RESSOURCES = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESSOURCE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_RESSOURCE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.GenericPropertyImpl <em>Generic Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.GenericPropertyImpl
	 * @see platform.impl.PlatformPackageImpl#getGenericProperty()
	 * @generated
	 */
	int GENERIC_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY__PROPERTY_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Generic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platform.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.IntegerPropertyImpl
	 * @see platform.impl.PlatformPackageImpl#getIntegerProperty()
	 * @generated
	 */
	int INTEGER_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__PROPERTY_NAME = GENERIC_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__PROPERTY_UNIT = GENERIC_PROPERTY__PROPERTY_UNIT;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__INTEGER_VALUE = GENERIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_FEATURE_COUNT = GENERIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_OPERATION_COUNT = GENERIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.StringPropertyImpl <em>String Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.StringPropertyImpl
	 * @see platform.impl.PlatformPackageImpl#getStringProperty()
	 * @generated
	 */
	int STRING_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__PROPERTY_NAME = GENERIC_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__PROPERTY_UNIT = GENERIC_PROPERTY__PROPERTY_UNIT;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__STRING_VALUE = GENERIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_FEATURE_COUNT = GENERIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_OPERATION_COUNT = GENERIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.BooleanPropertyImpl
	 * @see platform.impl.PlatformPackageImpl#getBooleanProperty()
	 * @generated
	 */
	int BOOLEAN_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__PROPERTY_NAME = GENERIC_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__PROPERTY_UNIT = GENERIC_PROPERTY__PROPERTY_UNIT;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__BOOLEAN_VALUE = GENERIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_FEATURE_COUNT = GENERIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_OPERATION_COUNT = GENERIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.FloatPropertyImpl <em>Float Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.FloatPropertyImpl
	 * @see platform.impl.PlatformPackageImpl#getFloatProperty()
	 * @generated
	 */
	int FLOAT_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PROPERTY__PROPERTY_NAME = GENERIC_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PROPERTY__PROPERTY_UNIT = GENERIC_PROPERTY__PROPERTY_UNIT;

	/**
	 * The feature id for the '<em><b>Float Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PROPERTY__FLOAT_VALUE = GENERIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PROPERTY_FEATURE_COUNT = GENERIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PROPERTY_OPERATION_COUNT = GENERIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.InteractionPropertyImpl <em>Interaction Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.InteractionPropertyImpl
	 * @see platform.impl.PlatformPackageImpl#getInteractionProperty()
	 * @generated
	 */
	int INTERACTION_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROPERTY__PROPERTY_NAME = GENERIC_PROPERTY__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROPERTY__PROPERTY_UNIT = GENERIC_PROPERTY__PROPERTY_UNIT;

	/**
	 * The feature id for the '<em><b>Interaction Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROPERTY__INTERACTION_MODALITY = GENERIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROPERTY_FEATURE_COUNT = GENERIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROPERTY_OPERATION_COUNT = GENERIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.GenericComplexRessourceImpl <em>Generic Complex Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.GenericComplexRessourceImpl
	 * @see platform.impl.PlatformPackageImpl#getGenericComplexRessource()
	 * @generated
	 */
	int GENERIC_COMPLEX_RESSOURCE = 10;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLEX_RESSOURCE__RESSOURCE_NAME = COMPLEX_RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLEX_RESSOURCE__GENERIC_PROPERTY = COMPLEX_RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Sub Ressources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLEX_RESSOURCE__SUB_RESSOURCES = COMPLEX_RESSOURCE__SUB_RESSOURCES;

	/**
	 * The number of structural features of the '<em>Generic Complex Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLEX_RESSOURCE_FEATURE_COUNT = COMPLEX_RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Complex Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLEX_RESSOURCE_OPERATION_COUNT = COMPLEX_RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.MouseImpl <em>Mouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.MouseImpl
	 * @see platform.impl.PlatformPackageImpl#getMouse()
	 * @generated
	 */
	int MOUSE = 11;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__RESSOURCE_NAME = COMPLEX_RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__GENERIC_PROPERTY = COMPLEX_RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Sub Ressources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__SUB_RESSOURCES = COMPLEX_RESSOURCE__SUB_RESSOURCES;

	/**
	 * The feature id for the '<em><b>Mouse Sensibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__MOUSE_SENSIBILITY = COMPLEX_RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usable For Transpartent Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE = COMPLEX_RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usable For Smooth Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__USABLE_FOR_SMOOTH_SURFACE = COMPLEX_RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Pointing Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__MAIN_POINTING_DEVICE = COMPLEX_RESSOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Left Mousebutton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__LEFT_MOUSEBUTTON = COMPLEX_RESSOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Right Mousebutton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__RIGHT_MOUSEBUTTON = COMPLEX_RESSOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_FEATURE_COUNT = COMPLEX_RESSOURCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Left Unequal Right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE___LEFT_UNEQUAL_RIGHT__DIAGNOSTICCHAIN_MAP = COMPLEX_RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OPERATION_COUNT = COMPLEX_RESSOURCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link platform.impl.KeyboardImpl <em>Keyboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.KeyboardImpl
	 * @see platform.impl.PlatformPackageImpl#getKeyboard()
	 * @generated
	 */
	int KEYBOARD = 12;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__RESSOURCE_NAME = COMPLEX_RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__GENERIC_PROPERTY = COMPLEX_RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Sub Ressources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__SUB_RESSOURCES = COMPLEX_RESSOURCE__SUB_RESSOURCES;

	/**
	 * The feature id for the '<em><b>Keyboard Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__KEYBOARD_TYPE = COMPLEX_RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keyboard Type Extra Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO = COMPLEX_RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fast Text Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__FAST_TEXT_INPUT = COMPLEX_RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Easy Text Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__EASY_TEXT_INPUT = COMPLEX_RESSOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hardkeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__HARDKEYS = COMPLEX_RESSOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_FEATURE_COUNT = COMPLEX_RESSOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_OPERATION_COUNT = COMPLEX_RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.ElementaryRessourceImpl <em>Elementary Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.ElementaryRessourceImpl
	 * @see platform.impl.PlatformPackageImpl#getElementaryRessource()
	 * @generated
	 */
	int ELEMENTARY_RESSOURCE = 13;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_RESSOURCE__RESSOURCE_NAME = RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_RESSOURCE__GENERIC_PROPERTY = RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Elementary Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_RESSOURCE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elementary Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_RESSOURCE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.InteractionRessourceImpl <em>Interaction Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.InteractionRessourceImpl
	 * @see platform.impl.PlatformPackageImpl#getInteractionRessource()
	 * @generated
	 */
	int INTERACTION_RESSOURCE = 14;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESSOURCE__RESSOURCE_NAME = ELEMENTARY_RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESSOURCE__GENERIC_PROPERTY = ELEMENTARY_RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Interaction Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESSOURCE_FEATURE_COUNT = ELEMENTARY_RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESSOURCE_OPERATION_COUNT = ELEMENTARY_RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.InputDeviceImpl <em>Input Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.InputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getInputDevice()
	 * @generated
	 */
	int INPUT_DEVICE = 15;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__RESSOURCE_NAME = INTERACTION_RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__GENERIC_PROPERTY = INTERACTION_RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__FAST_POINTING_CAPABLE = INTERACTION_RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__ACCURATE_POINTING_CAPABLE = INTERACTION_RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__SELECTING_CAPABLE = INTERACTION_RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__DRAWING_CAPABLE = INTERACTION_RESSOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__FAST_DRAWING_CAPABLE = INTERACTION_RESSOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__ALPHANUMERIC_CAPABLE = INTERACTION_RESSOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = INTERACTION_RESSOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__USABLE_WITH_GLOVES = INTERACTION_RESSOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE__USABLE_WITH_ONE_HAND = INTERACTION_RESSOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE_FEATURE_COUNT = INTERACTION_RESSOURCE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DEVICE_OPERATION_COUNT = INTERACTION_RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.ElementaryTasksForInputDevicesImpl <em>Elementary Tasks For Input Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.ElementaryTasksForInputDevicesImpl
	 * @see platform.impl.PlatformPackageImpl#getElementaryTasksForInputDevices()
	 * @generated
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES = 16;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE = 0;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE = 1;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE = 2;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE = 3;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE = 4;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE = 5;

	/**
	 * The number of structural features of the '<em>Elementary Tasks For Input Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Elementary Tasks For Input Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TASKS_FOR_INPUT_DEVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platform.impl.VisualInputDeviceImpl <em>Visual Input Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.VisualInputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getVisualInputDevice()
	 * @generated
	 */
	int VISUAL_INPUT_DEVICE = 17;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__RESSOURCE_NAME = INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__GENERIC_PROPERTY = INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__FAST_POINTING_CAPABLE = INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE = INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__SELECTING_CAPABLE = INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__DRAWING_CAPABLE = INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__FAST_DRAWING_CAPABLE = INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__ALPHANUMERIC_CAPABLE = INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__USABLE_WITH_GLOVES = INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE__USABLE_WITH_ONE_HAND = INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The number of structural features of the '<em>Visual Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visual Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_INPUT_DEVICE_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.OutputDeviceImpl <em>Output Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.OutputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getOutputDevice()
	 * @generated
	 */
	int OUTPUT_DEVICE = 27;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE__RESSOURCE_NAME = INTERACTION_RESSOURCE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE__GENERIC_PROPERTY = INTERACTION_RESSOURCE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE_FEATURE_COUNT = INTERACTION_RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVICE_OPERATION_COUNT = INTERACTION_RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.VisualOutputDeviceImpl <em>Visual Output Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.VisualOutputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getVisualOutputDevice()
	 * @generated
	 */
	int VISUAL_OUTPUT_DEVICE = 28;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_OUTPUT_DEVICE__RESSOURCE_NAME = OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_OUTPUT_DEVICE__GENERIC_PROPERTY = OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Visual Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_OUTPUT_DEVICE_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visual Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_OUTPUT_DEVICE_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.LightingDeviceImpl <em>Lighting Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.LightingDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getLightingDevice()
	 * @generated
	 */
	int LIGHTING_DEVICE = 18;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE__RESSOURCE_NAME = VISUAL_OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE__GENERIC_PROPERTY = VISUAL_OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Lightning Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE__LIGHTNING_TYPE = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE__LIGHT_SIZE = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Color Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lighting Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE_FEATURE_COUNT = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lighting Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_DEVICE_OPERATION_COUNT = VISUAL_OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.CameraImpl
	 * @see platform.impl.PlatformPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 19;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__RESSOURCE_NAME = VISUAL_INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__GENERIC_PROPERTY = VISUAL_INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__FAST_POINTING_CAPABLE = VISUAL_INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__ACCURATE_POINTING_CAPABLE = VISUAL_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__SELECTING_CAPABLE = VISUAL_INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__DRAWING_CAPABLE = VISUAL_INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__FAST_DRAWING_CAPABLE = VISUAL_INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__ALPHANUMERIC_CAPABLE = VISUAL_INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__SAFE_FOR_UNWANTED_ACTIONS = VISUAL_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__USABLE_WITH_GLOVES = VISUAL_INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__USABLE_WITH_ONE_HAND = VISUAL_INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = VISUAL_INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OPERATION_COUNT = VISUAL_INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.TactileInputDeviceImpl <em>Tactile Input Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.TactileInputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getTactileInputDevice()
	 * @generated
	 */
	int TACTILE_INPUT_DEVICE = 20;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__RESSOURCE_NAME = INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__GENERIC_PROPERTY = INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__FAST_POINTING_CAPABLE = INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE = INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__SELECTING_CAPABLE = INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__DRAWING_CAPABLE = INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__FAST_DRAWING_CAPABLE = INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__ALPHANUMERIC_CAPABLE = INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__USABLE_WITH_GLOVES = INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE__USABLE_WITH_ONE_HAND = INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The number of structural features of the '<em>Tactile Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tactile Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_INPUT_DEVICE_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.HardkeyImpl <em>Hardkey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.HardkeyImpl
	 * @see platform.impl.PlatformPackageImpl#getHardkey()
	 * @generated
	 */
	int HARDKEY = 21;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__RESSOURCE_NAME = TACTILE_INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__GENERIC_PROPERTY = TACTILE_INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__FAST_POINTING_CAPABLE = TACTILE_INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__ACCURATE_POINTING_CAPABLE = TACTILE_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__SELECTING_CAPABLE = TACTILE_INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__DRAWING_CAPABLE = TACTILE_INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__FAST_DRAWING_CAPABLE = TACTILE_INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__ALPHANUMERIC_CAPABLE = TACTILE_INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__SAFE_FOR_UNWANTED_ACTIONS = TACTILE_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__USABLE_WITH_GLOVES = TACTILE_INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__USABLE_WITH_ONE_HAND = TACTILE_INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The feature id for the '<em><b>Button Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__BUTTON_SYMBOL = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__BUTTON_COLOR = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Button Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__BUTTON_SIZE = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hardkey Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__HARDKEY_TYPE = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY__CONFIGURABLE = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardkey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY_FEATURE_COUNT = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Hardkey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDKEY_OPERATION_COUNT = TACTILE_INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.TouchscreenImpl <em>Touchscreen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.TouchscreenImpl
	 * @see platform.impl.PlatformPackageImpl#getTouchscreen()
	 * @generated
	 */
	int TOUCHSCREEN = 22;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__RESSOURCE_NAME = TACTILE_INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__GENERIC_PROPERTY = TACTILE_INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__FAST_POINTING_CAPABLE = TACTILE_INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__ACCURATE_POINTING_CAPABLE = TACTILE_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__SELECTING_CAPABLE = TACTILE_INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__DRAWING_CAPABLE = TACTILE_INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__FAST_DRAWING_CAPABLE = TACTILE_INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__ALPHANUMERIC_CAPABLE = TACTILE_INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__SAFE_FOR_UNWANTED_ACTIONS = TACTILE_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__USABLE_WITH_GLOVES = TACTILE_INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__USABLE_WITH_ONE_HAND = TACTILE_INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The feature id for the '<em><b>XPixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__XPIXEL = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YPixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__YPIXEL = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__HEIGHT = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__WIDTH = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Force For Actuating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__FORCE_FOR_ACTUATING = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Usable With Pen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__USABLE_WITH_PEN = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Multi Touch Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__MULTI_TOUCH_CAPABLE = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tactile Feedback Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Touch Gesture Recognition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Closeness Recognition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__CLOSENESS_RECOGNITION = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Correspond Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN__CORRESPOND_DISPLAY = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Touchscreen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN_FEATURE_COUNT = TACTILE_INPUT_DEVICE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Touchscreen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSCREEN_OPERATION_COUNT = TACTILE_INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.AuditiveInputDeviceImpl <em>Auditive Input Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.AuditiveInputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getAuditiveInputDevice()
	 * @generated
	 */
	int AUDITIVE_INPUT_DEVICE = 23;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__RESSOURCE_NAME = INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__GENERIC_PROPERTY = INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__FAST_POINTING_CAPABLE = INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE = INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__SELECTING_CAPABLE = INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__DRAWING_CAPABLE = INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__FAST_DRAWING_CAPABLE = INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__ALPHANUMERIC_CAPABLE = INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__USABLE_WITH_GLOVES = INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE__USABLE_WITH_ONE_HAND = INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The number of structural features of the '<em>Auditive Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auditive Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_INPUT_DEVICE_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.MicrophoneImpl <em>Microphone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.MicrophoneImpl
	 * @see platform.impl.PlatformPackageImpl#getMicrophone()
	 * @generated
	 */
	int MICROPHONE = 24;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__RESSOURCE_NAME = AUDITIVE_INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__GENERIC_PROPERTY = AUDITIVE_INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__FAST_POINTING_CAPABLE = AUDITIVE_INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__ACCURATE_POINTING_CAPABLE = AUDITIVE_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__SELECTING_CAPABLE = AUDITIVE_INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__DRAWING_CAPABLE = AUDITIVE_INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__FAST_DRAWING_CAPABLE = AUDITIVE_INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__ALPHANUMERIC_CAPABLE = AUDITIVE_INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__SAFE_FOR_UNWANTED_ACTIONS = AUDITIVE_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__USABLE_WITH_GLOVES = AUDITIVE_INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__USABLE_WITH_ONE_HAND = AUDITIVE_INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The number of structural features of the '<em>Microphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_FEATURE_COUNT = AUDITIVE_INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_OPERATION_COUNT = AUDITIVE_INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.ProprioceptiveInputDeviceImpl <em>Proprioceptive Input Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.ProprioceptiveInputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getProprioceptiveInputDevice()
	 * @generated
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE = 25;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__RESSOURCE_NAME = INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__GENERIC_PROPERTY = INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__FAST_POINTING_CAPABLE = INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__ACCURATE_POINTING_CAPABLE = INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__SELECTING_CAPABLE = INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__DRAWING_CAPABLE = INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__FAST_DRAWING_CAPABLE = INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__ALPHANUMERIC_CAPABLE = INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__USABLE_WITH_GLOVES = INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE__USABLE_WITH_ONE_HAND = INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The number of structural features of the '<em>Proprioceptive Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proprioceptive Input Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_INPUT_DEVICE_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.PointingDeviceImpl <em>Pointing Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.PointingDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getPointingDevice()
	 * @generated
	 */
	int POINTING_DEVICE = 26;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__RESSOURCE_NAME = INPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__GENERIC_PROPERTY = INPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__FAST_POINTING_CAPABLE = INPUT_DEVICE__FAST_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__ACCURATE_POINTING_CAPABLE = INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Selecting Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__SELECTING_CAPABLE = INPUT_DEVICE__SELECTING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__DRAWING_CAPABLE = INPUT_DEVICE__DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__FAST_DRAWING_CAPABLE = INPUT_DEVICE__FAST_DRAWING_CAPABLE;

	/**
	 * The feature id for the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__ALPHANUMERIC_CAPABLE = INPUT_DEVICE__ALPHANUMERIC_CAPABLE;

	/**
	 * The feature id for the '<em><b>Safe For Unwanted Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS;

	/**
	 * The feature id for the '<em><b>Usable With Gloves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__USABLE_WITH_GLOVES = INPUT_DEVICE__USABLE_WITH_GLOVES;

	/**
	 * The feature id for the '<em><b>Usable With One Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__USABLE_WITH_ONE_HAND = INPUT_DEVICE__USABLE_WITH_ONE_HAND;

	/**
	 * The feature id for the '<em><b>Has High Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__HAS_HIGH_PRECISION = INPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Degrees Of Freedom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE__DEGREES_OF_FREEDOM = INPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pointing Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE_FEATURE_COUNT = INPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pointing Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTING_DEVICE_OPERATION_COUNT = INPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.DisplayImpl
	 * @see platform.impl.PlatformPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 29;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__RESSOURCE_NAME = VISUAL_OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__GENERIC_PROPERTY = VISUAL_OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>XPixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__XPIXEL = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YPixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__YPIXEL = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__HEIGHT = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__WIDTH = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Color Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__IS_COLOR_CAPABLE = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Images Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__IS_IMAGES_CAPABLE = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Videos Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__IS_VIDEOS_CAPABLE = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = VISUAL_OUTPUT_DEVICE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = VISUAL_OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.TactileOutputDeviceImpl <em>Tactile Output Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.TactileOutputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getTactileOutputDevice()
	 * @generated
	 */
	int TACTILE_OUTPUT_DEVICE = 30;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_OUTPUT_DEVICE__RESSOURCE_NAME = OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_OUTPUT_DEVICE__GENERIC_PROPERTY = OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Tactile Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_OUTPUT_DEVICE_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tactile Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTILE_OUTPUT_DEVICE_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.VibrationMotorImpl <em>Vibration Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.VibrationMotorImpl
	 * @see platform.impl.PlatformPackageImpl#getVibrationMotor()
	 * @generated
	 */
	int VIBRATION_MOTOR = 31;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIBRATION_MOTOR__RESSOURCE_NAME = TACTILE_OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIBRATION_MOTOR__GENERIC_PROPERTY = TACTILE_OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Vibration Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIBRATION_MOTOR_FEATURE_COUNT = TACTILE_OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vibration Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIBRATION_MOTOR_OPERATION_COUNT = TACTILE_OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.AuditiveOutputDeviceImpl <em>Auditive Output Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.AuditiveOutputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getAuditiveOutputDevice()
	 * @generated
	 */
	int AUDITIVE_OUTPUT_DEVICE = 32;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_OUTPUT_DEVICE__RESSOURCE_NAME = OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_OUTPUT_DEVICE__GENERIC_PROPERTY = OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Auditive Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_OUTPUT_DEVICE_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auditive Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITIVE_OUTPUT_DEVICE_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.SpeakerImpl <em>Speaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.SpeakerImpl
	 * @see platform.impl.PlatformPackageImpl#getSpeaker()
	 * @generated
	 */
	int SPEAKER = 33;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__RESSOURCE_NAME = AUDITIVE_OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__GENERIC_PROPERTY = AUDITIVE_OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_FEATURE_COUNT = AUDITIVE_OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_OPERATION_COUNT = AUDITIVE_OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.impl.ProprioceptiveOutputDeviceImpl <em>Proprioceptive Output Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.impl.ProprioceptiveOutputDeviceImpl
	 * @see platform.impl.PlatformPackageImpl#getProprioceptiveOutputDevice()
	 * @generated
	 */
	int PROPRIOCEPTIVE_OUTPUT_DEVICE = 34;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_OUTPUT_DEVICE__RESSOURCE_NAME = OUTPUT_DEVICE__RESSOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Generic Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_OUTPUT_DEVICE__GENERIC_PROPERTY = OUTPUT_DEVICE__GENERIC_PROPERTY;

	/**
	 * The number of structural features of the '<em>Proprioceptive Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_OUTPUT_DEVICE_FEATURE_COUNT = OUTPUT_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proprioceptive Output Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIOCEPTIVE_OUTPUT_DEVICE_OPERATION_COUNT = OUTPUT_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platform.PlatformType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.PlatformType
	 * @see platform.impl.PlatformPackageImpl#getPlatformType()
	 * @generated
	 */
	int PLATFORM_TYPE = 35;

	/**
	 * The meta object id for the '{@link platform.InteractionModality <em>Interaction Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.InteractionModality
	 * @see platform.impl.PlatformPackageImpl#getInteractionModality()
	 * @generated
	 */
	int INTERACTION_MODALITY = 36;

	/**
	 * The meta object id for the '{@link platform.Sensibility <em>Sensibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.Sensibility
	 * @see platform.impl.PlatformPackageImpl#getSensibility()
	 * @generated
	 */
	int SENSIBILITY = 37;

	/**
	 * The meta object id for the '{@link platform.KeyboardType <em>Keyboard Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.KeyboardType
	 * @see platform.impl.PlatformPackageImpl#getKeyboardType()
	 * @generated
	 */
	int KEYBOARD_TYPE = 38;

	/**
	 * The meta object id for the '{@link platform.ElementaryTaskEvaluation <em>Elementary Task Evaluation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.ElementaryTaskEvaluation
	 * @see platform.impl.PlatformPackageImpl#getElementaryTaskEvaluation()
	 * @generated
	 */
	int ELEMENTARY_TASK_EVALUATION = 39;

	/**
	 * The meta object id for the '{@link platform.HardkeyType <em>Hardkey Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.HardkeyType
	 * @see platform.impl.PlatformPackageImpl#getHardkeyType()
	 * @generated
	 */
	int HARDKEY_TYPE = 40;

	/**
	 * The meta object id for the '{@link platform.SizeEvaluation <em>Size Evaluation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platform.SizeEvaluation
	 * @see platform.impl.PlatformPackageImpl#getSizeEvaluation()
	 * @generated
	 */
	int SIZE_EVALUATION = 41;


	/**
	 * Returns the meta object for class '{@link platform.PMbase <em>PMbase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMbase</em>'.
	 * @see platform.PMbase
	 * @generated
	 */
	EClass getPMbase();

	/**
	 * Returns the meta object for the containment reference list '{@link platform.PMbase#getPlatformCollection <em>Platform Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Collection</em>'.
	 * @see platform.PMbase#getPlatformCollection()
	 * @see #getPMbase()
	 * @generated
	 */
	EReference getPMbase_PlatformCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link platform.PMbase#getRessourceCollection <em>Ressource Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressource Collection</em>'.
	 * @see platform.PMbase#getRessourceCollection()
	 * @see #getPMbase()
	 * @generated
	 */
	EReference getPMbase_RessourceCollection();

	/**
	 * Returns the meta object for class '{@link platform.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see platform.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link platform.Platform#getPlatformName <em>Platform Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Name</em>'.
	 * @see platform.Platform#getPlatformName()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_PlatformName();

	/**
	 * Returns the meta object for the attribute '{@link platform.Platform#getPlatformId <em>Platform Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Id</em>'.
	 * @see platform.Platform#getPlatformId()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_PlatformId();

	/**
	 * Returns the meta object for the attribute '{@link platform.Platform#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see platform.Platform#getPlatformType()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_PlatformType();

	/**
	 * Returns the meta object for the reference list '{@link platform.Platform#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ressources</em>'.
	 * @see platform.Platform#getRessources()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Ressources();

	/**
	 * Returns the meta object for the containment reference list '{@link platform.Platform#getGenericProperty <em>Generic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Property</em>'.
	 * @see platform.Platform#getGenericProperty()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_GenericProperty();

	/**
	 * Returns the meta object for class '{@link platform.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see platform.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link platform.Ressource#getRessourceName <em>Ressource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ressource Name</em>'.
	 * @see platform.Ressource#getRessourceName()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_RessourceName();

	/**
	 * Returns the meta object for the containment reference list '{@link platform.Ressource#getGenericProperty <em>Generic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Property</em>'.
	 * @see platform.Ressource#getGenericProperty()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_GenericProperty();

	/**
	 * Returns the meta object for class '{@link platform.ComplexRessource <em>Complex Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Ressource</em>'.
	 * @see platform.ComplexRessource
	 * @generated
	 */
	EClass getComplexRessource();

	/**
	 * Returns the meta object for the containment reference list '{@link platform.ComplexRessource#getSubRessources <em>Sub Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Ressources</em>'.
	 * @see platform.ComplexRessource#getSubRessources()
	 * @see #getComplexRessource()
	 * @generated
	 */
	EReference getComplexRessource_SubRessources();

	/**
	 * Returns the meta object for class '{@link platform.GenericProperty <em>Generic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Property</em>'.
	 * @see platform.GenericProperty
	 * @generated
	 */
	EClass getGenericProperty();

	/**
	 * Returns the meta object for the attribute '{@link platform.GenericProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see platform.GenericProperty#getPropertyName()
	 * @see #getGenericProperty()
	 * @generated
	 */
	EAttribute getGenericProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link platform.GenericProperty#getPropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Unit</em>'.
	 * @see platform.GenericProperty#getPropertyUnit()
	 * @see #getGenericProperty()
	 * @generated
	 */
	EAttribute getGenericProperty_PropertyUnit();

	/**
	 * Returns the meta object for class '{@link platform.IntegerProperty <em>Integer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Property</em>'.
	 * @see platform.IntegerProperty
	 * @generated
	 */
	EClass getIntegerProperty();

	/**
	 * Returns the meta object for the attribute '{@link platform.IntegerProperty#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see platform.IntegerProperty#getIntegerValue()
	 * @see #getIntegerProperty()
	 * @generated
	 */
	EAttribute getIntegerProperty_IntegerValue();

	/**
	 * Returns the meta object for class '{@link platform.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Property</em>'.
	 * @see platform.StringProperty
	 * @generated
	 */
	EClass getStringProperty();

	/**
	 * Returns the meta object for the attribute '{@link platform.StringProperty#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see platform.StringProperty#getStringValue()
	 * @see #getStringProperty()
	 * @generated
	 */
	EAttribute getStringProperty_StringValue();

	/**
	 * Returns the meta object for class '{@link platform.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Property</em>'.
	 * @see platform.BooleanProperty
	 * @generated
	 */
	EClass getBooleanProperty();

	/**
	 * Returns the meta object for the attribute '{@link platform.BooleanProperty#isBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see platform.BooleanProperty#isBooleanValue()
	 * @see #getBooleanProperty()
	 * @generated
	 */
	EAttribute getBooleanProperty_BooleanValue();

	/**
	 * Returns the meta object for class '{@link platform.FloatProperty <em>Float Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Property</em>'.
	 * @see platform.FloatProperty
	 * @generated
	 */
	EClass getFloatProperty();

	/**
	 * Returns the meta object for the attribute '{@link platform.FloatProperty#getFloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Value</em>'.
	 * @see platform.FloatProperty#getFloatValue()
	 * @see #getFloatProperty()
	 * @generated
	 */
	EAttribute getFloatProperty_FloatValue();

	/**
	 * Returns the meta object for class '{@link platform.InteractionProperty <em>Interaction Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Property</em>'.
	 * @see platform.InteractionProperty
	 * @generated
	 */
	EClass getInteractionProperty();

	/**
	 * Returns the meta object for the attribute '{@link platform.InteractionProperty#getInteractionModality <em>Interaction Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Modality</em>'.
	 * @see platform.InteractionProperty#getInteractionModality()
	 * @see #getInteractionProperty()
	 * @generated
	 */
	EAttribute getInteractionProperty_InteractionModality();

	/**
	 * Returns the meta object for class '{@link platform.GenericComplexRessource <em>Generic Complex Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Complex Ressource</em>'.
	 * @see platform.GenericComplexRessource
	 * @generated
	 */
	EClass getGenericComplexRessource();

	/**
	 * Returns the meta object for class '{@link platform.Mouse <em>Mouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse</em>'.
	 * @see platform.Mouse
	 * @generated
	 */
	EClass getMouse();

	/**
	 * Returns the meta object for the attribute '{@link platform.Mouse#getMouseSensibility <em>Mouse Sensibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse Sensibility</em>'.
	 * @see platform.Mouse#getMouseSensibility()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_MouseSensibility();

	/**
	 * Returns the meta object for the attribute '{@link platform.Mouse#isUsableForTranspartentSurface <em>Usable For Transpartent Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable For Transpartent Surface</em>'.
	 * @see platform.Mouse#isUsableForTranspartentSurface()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_UsableForTranspartentSurface();

	/**
	 * Returns the meta object for the attribute '{@link platform.Mouse#isUsableForSmoothSurface <em>Usable For Smooth Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable For Smooth Surface</em>'.
	 * @see platform.Mouse#isUsableForSmoothSurface()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_UsableForSmoothSurface();

	/**
	 * Returns the meta object for the reference '{@link platform.Mouse#getMainPointingDevice <em>Main Pointing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Pointing Device</em>'.
	 * @see platform.Mouse#getMainPointingDevice()
	 * @see #getMouse()
	 * @generated
	 */
	EReference getMouse_MainPointingDevice();

	/**
	 * Returns the meta object for the reference '{@link platform.Mouse#getLeftMousebutton <em>Left Mousebutton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Mousebutton</em>'.
	 * @see platform.Mouse#getLeftMousebutton()
	 * @see #getMouse()
	 * @generated
	 */
	EReference getMouse_LeftMousebutton();

	/**
	 * Returns the meta object for the reference '{@link platform.Mouse#getRightMousebutton <em>Right Mousebutton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Mousebutton</em>'.
	 * @see platform.Mouse#getRightMousebutton()
	 * @see #getMouse()
	 * @generated
	 */
	EReference getMouse_RightMousebutton();

	/**
	 * Returns the meta object for the '{@link platform.Mouse#leftUnequalRight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Left Unequal Right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left Unequal Right</em>' operation.
	 * @see platform.Mouse#leftUnequalRight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMouse__LeftUnequalRight__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link platform.Keyboard <em>Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyboard</em>'.
	 * @see platform.Keyboard
	 * @generated
	 */
	EClass getKeyboard();

	/**
	 * Returns the meta object for the attribute '{@link platform.Keyboard#getKeyboardType <em>Keyboard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyboard Type</em>'.
	 * @see platform.Keyboard#getKeyboardType()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_KeyboardType();

	/**
	 * Returns the meta object for the attribute '{@link platform.Keyboard#getKeyboardTypeExtraInfo <em>Keyboard Type Extra Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyboard Type Extra Info</em>'.
	 * @see platform.Keyboard#getKeyboardTypeExtraInfo()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_KeyboardTypeExtraInfo();

	/**
	 * Returns the meta object for the attribute '{@link platform.Keyboard#isFastTextInput <em>Fast Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fast Text Input</em>'.
	 * @see platform.Keyboard#isFastTextInput()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_FastTextInput();

	/**
	 * Returns the meta object for the attribute '{@link platform.Keyboard#isEasyTextInput <em>Easy Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Easy Text Input</em>'.
	 * @see platform.Keyboard#isEasyTextInput()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_EasyTextInput();

	/**
	 * Returns the meta object for the reference list '{@link platform.Keyboard#getHardkeys <em>Hardkeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hardkeys</em>'.
	 * @see platform.Keyboard#getHardkeys()
	 * @see #getKeyboard()
	 * @generated
	 */
	EReference getKeyboard_Hardkeys();

	/**
	 * Returns the meta object for class '{@link platform.ElementaryRessource <em>Elementary Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Ressource</em>'.
	 * @see platform.ElementaryRessource
	 * @generated
	 */
	EClass getElementaryRessource();

	/**
	 * Returns the meta object for class '{@link platform.InteractionRessource <em>Interaction Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Ressource</em>'.
	 * @see platform.InteractionRessource
	 * @generated
	 */
	EClass getInteractionRessource();

	/**
	 * Returns the meta object for class '{@link platform.InputDevice <em>Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Device</em>'.
	 * @see platform.InputDevice
	 * @generated
	 */
	EClass getInputDevice();

	/**
	 * Returns the meta object for the attribute '{@link platform.InputDevice#isSafeForUnwantedActions <em>Safe For Unwanted Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe For Unwanted Actions</em>'.
	 * @see platform.InputDevice#isSafeForUnwantedActions()
	 * @see #getInputDevice()
	 * @generated
	 */
	EAttribute getInputDevice_SafeForUnwantedActions();

	/**
	 * Returns the meta object for the attribute '{@link platform.InputDevice#isUsableWithGloves <em>Usable With Gloves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable With Gloves</em>'.
	 * @see platform.InputDevice#isUsableWithGloves()
	 * @see #getInputDevice()
	 * @generated
	 */
	EAttribute getInputDevice_UsableWithGloves();

	/**
	 * Returns the meta object for the attribute '{@link platform.InputDevice#isUsableWithOneHand <em>Usable With One Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable With One Hand</em>'.
	 * @see platform.InputDevice#isUsableWithOneHand()
	 * @see #getInputDevice()
	 * @generated
	 */
	EAttribute getInputDevice_UsableWithOneHand();

	/**
	 * Returns the meta object for class '{@link platform.ElementaryTasksForInputDevices <em>Elementary Tasks For Input Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Tasks For Input Devices</em>'.
	 * @see platform.ElementaryTasksForInputDevices
	 * @generated
	 */
	EClass getElementaryTasksForInputDevices();

	/**
	 * Returns the meta object for the attribute '{@link platform.ElementaryTasksForInputDevices#getFastPointingCapable <em>Fast Pointing Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fast Pointing Capable</em>'.
	 * @see platform.ElementaryTasksForInputDevices#getFastPointingCapable()
	 * @see #getElementaryTasksForInputDevices()
	 * @generated
	 */
	EAttribute getElementaryTasksForInputDevices_FastPointingCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.ElementaryTasksForInputDevices#getAccuratePointingCapable <em>Accurate Pointing Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accurate Pointing Capable</em>'.
	 * @see platform.ElementaryTasksForInputDevices#getAccuratePointingCapable()
	 * @see #getElementaryTasksForInputDevices()
	 * @generated
	 */
	EAttribute getElementaryTasksForInputDevices_AccuratePointingCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.ElementaryTasksForInputDevices#getSelectingCapable <em>Selecting Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selecting Capable</em>'.
	 * @see platform.ElementaryTasksForInputDevices#getSelectingCapable()
	 * @see #getElementaryTasksForInputDevices()
	 * @generated
	 */
	EAttribute getElementaryTasksForInputDevices_SelectingCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.ElementaryTasksForInputDevices#getDrawingCapable <em>Drawing Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawing Capable</em>'.
	 * @see platform.ElementaryTasksForInputDevices#getDrawingCapable()
	 * @see #getElementaryTasksForInputDevices()
	 * @generated
	 */
	EAttribute getElementaryTasksForInputDevices_DrawingCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.ElementaryTasksForInputDevices#getFastDrawingCapable <em>Fast Drawing Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fast Drawing Capable</em>'.
	 * @see platform.ElementaryTasksForInputDevices#getFastDrawingCapable()
	 * @see #getElementaryTasksForInputDevices()
	 * @generated
	 */
	EAttribute getElementaryTasksForInputDevices_FastDrawingCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.ElementaryTasksForInputDevices#getAlphanumericCapable <em>Alphanumeric Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alphanumeric Capable</em>'.
	 * @see platform.ElementaryTasksForInputDevices#getAlphanumericCapable()
	 * @see #getElementaryTasksForInputDevices()
	 * @generated
	 */
	EAttribute getElementaryTasksForInputDevices_AlphanumericCapable();

	/**
	 * Returns the meta object for class '{@link platform.VisualInputDevice <em>Visual Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Input Device</em>'.
	 * @see platform.VisualInputDevice
	 * @generated
	 */
	EClass getVisualInputDevice();

	/**
	 * Returns the meta object for class '{@link platform.LightingDevice <em>Lighting Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lighting Device</em>'.
	 * @see platform.LightingDevice
	 * @generated
	 */
	EClass getLightingDevice();

	/**
	 * Returns the meta object for the attribute '{@link platform.LightingDevice#getLightningType <em>Lightning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lightning Type</em>'.
	 * @see platform.LightingDevice#getLightningType()
	 * @see #getLightingDevice()
	 * @generated
	 */
	EAttribute getLightingDevice_LightningType();

	/**
	 * Returns the meta object for the attribute '{@link platform.LightingDevice#getLightSize <em>Light Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light Size</em>'.
	 * @see platform.LightingDevice#getLightSize()
	 * @see #getLightingDevice()
	 * @generated
	 */
	EAttribute getLightingDevice_LightSize();

	/**
	 * Returns the meta object for the attribute '{@link platform.LightingDevice#isMultiColorConfigurable <em>Multi Color Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Color Configurable</em>'.
	 * @see platform.LightingDevice#isMultiColorConfigurable()
	 * @see #getLightingDevice()
	 * @generated
	 */
	EAttribute getLightingDevice_MultiColorConfigurable();

	/**
	 * Returns the meta object for class '{@link platform.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see platform.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for class '{@link platform.TactileInputDevice <em>Tactile Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tactile Input Device</em>'.
	 * @see platform.TactileInputDevice
	 * @generated
	 */
	EClass getTactileInputDevice();

	/**
	 * Returns the meta object for class '{@link platform.Hardkey <em>Hardkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardkey</em>'.
	 * @see platform.Hardkey
	 * @generated
	 */
	EClass getHardkey();

	/**
	 * Returns the meta object for the attribute '{@link platform.Hardkey#getButtonSymbol <em>Button Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Symbol</em>'.
	 * @see platform.Hardkey#getButtonSymbol()
	 * @see #getHardkey()
	 * @generated
	 */
	EAttribute getHardkey_ButtonSymbol();

	/**
	 * Returns the meta object for the attribute '{@link platform.Hardkey#getButtonColor <em>Button Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Color</em>'.
	 * @see platform.Hardkey#getButtonColor()
	 * @see #getHardkey()
	 * @generated
	 */
	EAttribute getHardkey_ButtonColor();

	/**
	 * Returns the meta object for the attribute '{@link platform.Hardkey#getButtonSize <em>Button Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Size</em>'.
	 * @see platform.Hardkey#getButtonSize()
	 * @see #getHardkey()
	 * @generated
	 */
	EAttribute getHardkey_ButtonSize();

	/**
	 * Returns the meta object for the attribute '{@link platform.Hardkey#getHardkeyType <em>Hardkey Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardkey Type</em>'.
	 * @see platform.Hardkey#getHardkeyType()
	 * @see #getHardkey()
	 * @generated
	 */
	EAttribute getHardkey_HardkeyType();

	/**
	 * Returns the meta object for the attribute '{@link platform.Hardkey#isConfigurable <em>Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configurable</em>'.
	 * @see platform.Hardkey#isConfigurable()
	 * @see #getHardkey()
	 * @generated
	 */
	EAttribute getHardkey_Configurable();

	/**
	 * Returns the meta object for class '{@link platform.Touchscreen <em>Touchscreen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchscreen</em>'.
	 * @see platform.Touchscreen
	 * @generated
	 */
	EClass getTouchscreen();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#getXPixel <em>XPixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPixel</em>'.
	 * @see platform.Touchscreen#getXPixel()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_XPixel();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#getYPixel <em>YPixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPixel</em>'.
	 * @see platform.Touchscreen#getYPixel()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_YPixel();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see platform.Touchscreen#getHeight()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_Height();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see platform.Touchscreen#getWidth()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_Width();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#isForceForActuating <em>Force For Actuating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force For Actuating</em>'.
	 * @see platform.Touchscreen#isForceForActuating()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_ForceForActuating();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#isUsableWithPen <em>Usable With Pen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable With Pen</em>'.
	 * @see platform.Touchscreen#isUsableWithPen()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_UsableWithPen();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#isMultiTouchCapable <em>Multi Touch Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Touch Capable</em>'.
	 * @see platform.Touchscreen#isMultiTouchCapable()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_MultiTouchCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#isTactileFeedbackCapable <em>Tactile Feedback Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tactile Feedback Capable</em>'.
	 * @see platform.Touchscreen#isTactileFeedbackCapable()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_TactileFeedbackCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#isTouchGestureRecognition <em>Touch Gesture Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touch Gesture Recognition</em>'.
	 * @see platform.Touchscreen#isTouchGestureRecognition()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_TouchGestureRecognition();

	/**
	 * Returns the meta object for the attribute '{@link platform.Touchscreen#isClosenessRecognition <em>Closeness Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closeness Recognition</em>'.
	 * @see platform.Touchscreen#isClosenessRecognition()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EAttribute getTouchscreen_ClosenessRecognition();

	/**
	 * Returns the meta object for the reference '{@link platform.Touchscreen#getCorrespondDisplay <em>Correspond Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correspond Display</em>'.
	 * @see platform.Touchscreen#getCorrespondDisplay()
	 * @see #getTouchscreen()
	 * @generated
	 */
	EReference getTouchscreen_CorrespondDisplay();

	/**
	 * Returns the meta object for class '{@link platform.AuditiveInputDevice <em>Auditive Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditive Input Device</em>'.
	 * @see platform.AuditiveInputDevice
	 * @generated
	 */
	EClass getAuditiveInputDevice();

	/**
	 * Returns the meta object for class '{@link platform.Microphone <em>Microphone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone</em>'.
	 * @see platform.Microphone
	 * @generated
	 */
	EClass getMicrophone();

	/**
	 * Returns the meta object for class '{@link platform.ProprioceptiveInputDevice <em>Proprioceptive Input Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprioceptive Input Device</em>'.
	 * @see platform.ProprioceptiveInputDevice
	 * @generated
	 */
	EClass getProprioceptiveInputDevice();

	/**
	 * Returns the meta object for class '{@link platform.PointingDevice <em>Pointing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointing Device</em>'.
	 * @see platform.PointingDevice
	 * @generated
	 */
	EClass getPointingDevice();

	/**
	 * Returns the meta object for the attribute '{@link platform.PointingDevice#isHasHighPrecision <em>Has High Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has High Precision</em>'.
	 * @see platform.PointingDevice#isHasHighPrecision()
	 * @see #getPointingDevice()
	 * @generated
	 */
	EAttribute getPointingDevice_HasHighPrecision();

	/**
	 * Returns the meta object for the attribute '{@link platform.PointingDevice#getDegreesOfFreedom <em>Degrees Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees Of Freedom</em>'.
	 * @see platform.PointingDevice#getDegreesOfFreedom()
	 * @see #getPointingDevice()
	 * @generated
	 */
	EAttribute getPointingDevice_DegreesOfFreedom();

	/**
	 * Returns the meta object for class '{@link platform.OutputDevice <em>Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Device</em>'.
	 * @see platform.OutputDevice
	 * @generated
	 */
	EClass getOutputDevice();

	/**
	 * Returns the meta object for class '{@link platform.VisualOutputDevice <em>Visual Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Output Device</em>'.
	 * @see platform.VisualOutputDevice
	 * @generated
	 */
	EClass getVisualOutputDevice();

	/**
	 * Returns the meta object for class '{@link platform.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see platform.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#getXPixel <em>XPixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPixel</em>'.
	 * @see platform.Display#getXPixel()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_XPixel();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#getYPixel <em>YPixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPixel</em>'.
	 * @see platform.Display#getYPixel()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_YPixel();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see platform.Display#getHeight()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Height();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see platform.Display#getWidth()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Width();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#isIsColorCapable <em>Is Color Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Color Capable</em>'.
	 * @see platform.Display#isIsColorCapable()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_IsColorCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#isIsImagesCapable <em>Is Images Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Images Capable</em>'.
	 * @see platform.Display#isIsImagesCapable()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_IsImagesCapable();

	/**
	 * Returns the meta object for the attribute '{@link platform.Display#isIsVideosCapable <em>Is Videos Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Videos Capable</em>'.
	 * @see platform.Display#isIsVideosCapable()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_IsVideosCapable();

	/**
	 * Returns the meta object for class '{@link platform.TactileOutputDevice <em>Tactile Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tactile Output Device</em>'.
	 * @see platform.TactileOutputDevice
	 * @generated
	 */
	EClass getTactileOutputDevice();

	/**
	 * Returns the meta object for class '{@link platform.VibrationMotor <em>Vibration Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vibration Motor</em>'.
	 * @see platform.VibrationMotor
	 * @generated
	 */
	EClass getVibrationMotor();

	/**
	 * Returns the meta object for class '{@link platform.AuditiveOutputDevice <em>Auditive Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditive Output Device</em>'.
	 * @see platform.AuditiveOutputDevice
	 * @generated
	 */
	EClass getAuditiveOutputDevice();

	/**
	 * Returns the meta object for class '{@link platform.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speaker</em>'.
	 * @see platform.Speaker
	 * @generated
	 */
	EClass getSpeaker();

	/**
	 * Returns the meta object for class '{@link platform.ProprioceptiveOutputDevice <em>Proprioceptive Output Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprioceptive Output Device</em>'.
	 * @see platform.ProprioceptiveOutputDevice
	 * @generated
	 */
	EClass getProprioceptiveOutputDevice();

	/**
	 * Returns the meta object for enum '{@link platform.PlatformType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see platform.PlatformType
	 * @generated
	 */
	EEnum getPlatformType();

	/**
	 * Returns the meta object for enum '{@link platform.InteractionModality <em>Interaction Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Modality</em>'.
	 * @see platform.InteractionModality
	 * @generated
	 */
	EEnum getInteractionModality();

	/**
	 * Returns the meta object for enum '{@link platform.Sensibility <em>Sensibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensibility</em>'.
	 * @see platform.Sensibility
	 * @generated
	 */
	EEnum getSensibility();

	/**
	 * Returns the meta object for enum '{@link platform.KeyboardType <em>Keyboard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Keyboard Type</em>'.
	 * @see platform.KeyboardType
	 * @generated
	 */
	EEnum getKeyboardType();

	/**
	 * Returns the meta object for enum '{@link platform.ElementaryTaskEvaluation <em>Elementary Task Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Elementary Task Evaluation</em>'.
	 * @see platform.ElementaryTaskEvaluation
	 * @generated
	 */
	EEnum getElementaryTaskEvaluation();

	/**
	 * Returns the meta object for enum '{@link platform.HardkeyType <em>Hardkey Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardkey Type</em>'.
	 * @see platform.HardkeyType
	 * @generated
	 */
	EEnum getHardkeyType();

	/**
	 * Returns the meta object for enum '{@link platform.SizeEvaluation <em>Size Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Evaluation</em>'.
	 * @see platform.SizeEvaluation
	 * @generated
	 */
	EEnum getSizeEvaluation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link platform.impl.PMbaseImpl <em>PMbase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.PMbaseImpl
		 * @see platform.impl.PlatformPackageImpl#getPMbase()
		 * @generated
		 */
		EClass PMBASE = eINSTANCE.getPMbase();

		/**
		 * The meta object literal for the '<em><b>Platform Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMBASE__PLATFORM_COLLECTION = eINSTANCE.getPMbase_PlatformCollection();

		/**
		 * The meta object literal for the '<em><b>Ressource Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMBASE__RESSOURCE_COLLECTION = eINSTANCE.getPMbase_RessourceCollection();

		/**
		 * The meta object literal for the '{@link platform.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.PlatformImpl
		 * @see platform.impl.PlatformPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Platform Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__PLATFORM_NAME = eINSTANCE.getPlatform_PlatformName();

		/**
		 * The meta object literal for the '<em><b>Platform Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__PLATFORM_ID = eINSTANCE.getPlatform_PlatformId();

		/**
		 * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__PLATFORM_TYPE = eINSTANCE.getPlatform_PlatformType();

		/**
		 * The meta object literal for the '<em><b>Ressources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__RESSOURCES = eINSTANCE.getPlatform_Ressources();

		/**
		 * The meta object literal for the '<em><b>Generic Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__GENERIC_PROPERTY = eINSTANCE.getPlatform_GenericProperty();

		/**
		 * The meta object literal for the '{@link platform.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.RessourceImpl
		 * @see platform.impl.PlatformPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Ressource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__RESSOURCE_NAME = eINSTANCE.getRessource_RessourceName();

		/**
		 * The meta object literal for the '<em><b>Generic Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__GENERIC_PROPERTY = eINSTANCE.getRessource_GenericProperty();

		/**
		 * The meta object literal for the '{@link platform.impl.ComplexRessourceImpl <em>Complex Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.ComplexRessourceImpl
		 * @see platform.impl.PlatformPackageImpl#getComplexRessource()
		 * @generated
		 */
		EClass COMPLEX_RESSOURCE = eINSTANCE.getComplexRessource();

		/**
		 * The meta object literal for the '<em><b>Sub Ressources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_RESSOURCE__SUB_RESSOURCES = eINSTANCE.getComplexRessource_SubRessources();

		/**
		 * The meta object literal for the '{@link platform.impl.GenericPropertyImpl <em>Generic Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.GenericPropertyImpl
		 * @see platform.impl.PlatformPackageImpl#getGenericProperty()
		 * @generated
		 */
		EClass GENERIC_PROPERTY = eINSTANCE.getGenericProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PROPERTY__PROPERTY_NAME = eINSTANCE.getGenericProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PROPERTY__PROPERTY_UNIT = eINSTANCE.getGenericProperty_PropertyUnit();

		/**
		 * The meta object literal for the '{@link platform.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.IntegerPropertyImpl
		 * @see platform.impl.PlatformPackageImpl#getIntegerProperty()
		 * @generated
		 */
		EClass INTEGER_PROPERTY = eINSTANCE.getIntegerProperty();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PROPERTY__INTEGER_VALUE = eINSTANCE.getIntegerProperty_IntegerValue();

		/**
		 * The meta object literal for the '{@link platform.impl.StringPropertyImpl <em>String Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.StringPropertyImpl
		 * @see platform.impl.PlatformPackageImpl#getStringProperty()
		 * @generated
		 */
		EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PROPERTY__STRING_VALUE = eINSTANCE.getStringProperty_StringValue();

		/**
		 * The meta object literal for the '{@link platform.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.BooleanPropertyImpl
		 * @see platform.impl.PlatformPackageImpl#getBooleanProperty()
		 * @generated
		 */
		EClass BOOLEAN_PROPERTY = eINSTANCE.getBooleanProperty();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PROPERTY__BOOLEAN_VALUE = eINSTANCE.getBooleanProperty_BooleanValue();

		/**
		 * The meta object literal for the '{@link platform.impl.FloatPropertyImpl <em>Float Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.FloatPropertyImpl
		 * @see platform.impl.PlatformPackageImpl#getFloatProperty()
		 * @generated
		 */
		EClass FLOAT_PROPERTY = eINSTANCE.getFloatProperty();

		/**
		 * The meta object literal for the '<em><b>Float Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_PROPERTY__FLOAT_VALUE = eINSTANCE.getFloatProperty_FloatValue();

		/**
		 * The meta object literal for the '{@link platform.impl.InteractionPropertyImpl <em>Interaction Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.InteractionPropertyImpl
		 * @see platform.impl.PlatformPackageImpl#getInteractionProperty()
		 * @generated
		 */
		EClass INTERACTION_PROPERTY = eINSTANCE.getInteractionProperty();

		/**
		 * The meta object literal for the '<em><b>Interaction Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_PROPERTY__INTERACTION_MODALITY = eINSTANCE.getInteractionProperty_InteractionModality();

		/**
		 * The meta object literal for the '{@link platform.impl.GenericComplexRessourceImpl <em>Generic Complex Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.GenericComplexRessourceImpl
		 * @see platform.impl.PlatformPackageImpl#getGenericComplexRessource()
		 * @generated
		 */
		EClass GENERIC_COMPLEX_RESSOURCE = eINSTANCE.getGenericComplexRessource();

		/**
		 * The meta object literal for the '{@link platform.impl.MouseImpl <em>Mouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.MouseImpl
		 * @see platform.impl.PlatformPackageImpl#getMouse()
		 * @generated
		 */
		EClass MOUSE = eINSTANCE.getMouse();

		/**
		 * The meta object literal for the '<em><b>Mouse Sensibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__MOUSE_SENSIBILITY = eINSTANCE.getMouse_MouseSensibility();

		/**
		 * The meta object literal for the '<em><b>Usable For Transpartent Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__USABLE_FOR_TRANSPARTENT_SURFACE = eINSTANCE.getMouse_UsableForTranspartentSurface();

		/**
		 * The meta object literal for the '<em><b>Usable For Smooth Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__USABLE_FOR_SMOOTH_SURFACE = eINSTANCE.getMouse_UsableForSmoothSurface();

		/**
		 * The meta object literal for the '<em><b>Main Pointing Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOUSE__MAIN_POINTING_DEVICE = eINSTANCE.getMouse_MainPointingDevice();

		/**
		 * The meta object literal for the '<em><b>Left Mousebutton</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOUSE__LEFT_MOUSEBUTTON = eINSTANCE.getMouse_LeftMousebutton();

		/**
		 * The meta object literal for the '<em><b>Right Mousebutton</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOUSE__RIGHT_MOUSEBUTTON = eINSTANCE.getMouse_RightMousebutton();

		/**
		 * The meta object literal for the '<em><b>Left Unequal Right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOUSE___LEFT_UNEQUAL_RIGHT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMouse__LeftUnequalRight__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link platform.impl.KeyboardImpl <em>Keyboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.KeyboardImpl
		 * @see platform.impl.PlatformPackageImpl#getKeyboard()
		 * @generated
		 */
		EClass KEYBOARD = eINSTANCE.getKeyboard();

		/**
		 * The meta object literal for the '<em><b>Keyboard Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__KEYBOARD_TYPE = eINSTANCE.getKeyboard_KeyboardType();

		/**
		 * The meta object literal for the '<em><b>Keyboard Type Extra Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO = eINSTANCE.getKeyboard_KeyboardTypeExtraInfo();

		/**
		 * The meta object literal for the '<em><b>Fast Text Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__FAST_TEXT_INPUT = eINSTANCE.getKeyboard_FastTextInput();

		/**
		 * The meta object literal for the '<em><b>Easy Text Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__EASY_TEXT_INPUT = eINSTANCE.getKeyboard_EasyTextInput();

		/**
		 * The meta object literal for the '<em><b>Hardkeys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYBOARD__HARDKEYS = eINSTANCE.getKeyboard_Hardkeys();

		/**
		 * The meta object literal for the '{@link platform.impl.ElementaryRessourceImpl <em>Elementary Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.ElementaryRessourceImpl
		 * @see platform.impl.PlatformPackageImpl#getElementaryRessource()
		 * @generated
		 */
		EClass ELEMENTARY_RESSOURCE = eINSTANCE.getElementaryRessource();

		/**
		 * The meta object literal for the '{@link platform.impl.InteractionRessourceImpl <em>Interaction Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.InteractionRessourceImpl
		 * @see platform.impl.PlatformPackageImpl#getInteractionRessource()
		 * @generated
		 */
		EClass INTERACTION_RESSOURCE = eINSTANCE.getInteractionRessource();

		/**
		 * The meta object literal for the '{@link platform.impl.InputDeviceImpl <em>Input Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.InputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getInputDevice()
		 * @generated
		 */
		EClass INPUT_DEVICE = eINSTANCE.getInputDevice();

		/**
		 * The meta object literal for the '<em><b>Safe For Unwanted Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS = eINSTANCE.getInputDevice_SafeForUnwantedActions();

		/**
		 * The meta object literal for the '<em><b>Usable With Gloves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEVICE__USABLE_WITH_GLOVES = eINSTANCE.getInputDevice_UsableWithGloves();

		/**
		 * The meta object literal for the '<em><b>Usable With One Hand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DEVICE__USABLE_WITH_ONE_HAND = eINSTANCE.getInputDevice_UsableWithOneHand();

		/**
		 * The meta object literal for the '{@link platform.impl.ElementaryTasksForInputDevicesImpl <em>Elementary Tasks For Input Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.ElementaryTasksForInputDevicesImpl
		 * @see platform.impl.PlatformPackageImpl#getElementaryTasksForInputDevices()
		 * @generated
		 */
		EClass ELEMENTARY_TASKS_FOR_INPUT_DEVICES = eINSTANCE.getElementaryTasksForInputDevices();

		/**
		 * The meta object literal for the '<em><b>Fast Pointing Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE = eINSTANCE.getElementaryTasksForInputDevices_FastPointingCapable();

		/**
		 * The meta object literal for the '<em><b>Accurate Pointing Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE = eINSTANCE.getElementaryTasksForInputDevices_AccuratePointingCapable();

		/**
		 * The meta object literal for the '<em><b>Selecting Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE = eINSTANCE.getElementaryTasksForInputDevices_SelectingCapable();

		/**
		 * The meta object literal for the '<em><b>Drawing Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE = eINSTANCE.getElementaryTasksForInputDevices_DrawingCapable();

		/**
		 * The meta object literal for the '<em><b>Fast Drawing Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE = eINSTANCE.getElementaryTasksForInputDevices_FastDrawingCapable();

		/**
		 * The meta object literal for the '<em><b>Alphanumeric Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE = eINSTANCE.getElementaryTasksForInputDevices_AlphanumericCapable();

		/**
		 * The meta object literal for the '{@link platform.impl.VisualInputDeviceImpl <em>Visual Input Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.VisualInputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getVisualInputDevice()
		 * @generated
		 */
		EClass VISUAL_INPUT_DEVICE = eINSTANCE.getVisualInputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.LightingDeviceImpl <em>Lighting Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.LightingDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getLightingDevice()
		 * @generated
		 */
		EClass LIGHTING_DEVICE = eINSTANCE.getLightingDevice();

		/**
		 * The meta object literal for the '<em><b>Lightning Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHTING_DEVICE__LIGHTNING_TYPE = eINSTANCE.getLightingDevice_LightningType();

		/**
		 * The meta object literal for the '<em><b>Light Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHTING_DEVICE__LIGHT_SIZE = eINSTANCE.getLightingDevice_LightSize();

		/**
		 * The meta object literal for the '<em><b>Multi Color Configurable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHTING_DEVICE__MULTI_COLOR_CONFIGURABLE = eINSTANCE.getLightingDevice_MultiColorConfigurable();

		/**
		 * The meta object literal for the '{@link platform.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.CameraImpl
		 * @see platform.impl.PlatformPackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '{@link platform.impl.TactileInputDeviceImpl <em>Tactile Input Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.TactileInputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getTactileInputDevice()
		 * @generated
		 */
		EClass TACTILE_INPUT_DEVICE = eINSTANCE.getTactileInputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.HardkeyImpl <em>Hardkey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.HardkeyImpl
		 * @see platform.impl.PlatformPackageImpl#getHardkey()
		 * @generated
		 */
		EClass HARDKEY = eINSTANCE.getHardkey();

		/**
		 * The meta object literal for the '<em><b>Button Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDKEY__BUTTON_SYMBOL = eINSTANCE.getHardkey_ButtonSymbol();

		/**
		 * The meta object literal for the '<em><b>Button Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDKEY__BUTTON_COLOR = eINSTANCE.getHardkey_ButtonColor();

		/**
		 * The meta object literal for the '<em><b>Button Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDKEY__BUTTON_SIZE = eINSTANCE.getHardkey_ButtonSize();

		/**
		 * The meta object literal for the '<em><b>Hardkey Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDKEY__HARDKEY_TYPE = eINSTANCE.getHardkey_HardkeyType();

		/**
		 * The meta object literal for the '<em><b>Configurable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDKEY__CONFIGURABLE = eINSTANCE.getHardkey_Configurable();

		/**
		 * The meta object literal for the '{@link platform.impl.TouchscreenImpl <em>Touchscreen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.TouchscreenImpl
		 * @see platform.impl.PlatformPackageImpl#getTouchscreen()
		 * @generated
		 */
		EClass TOUCHSCREEN = eINSTANCE.getTouchscreen();

		/**
		 * The meta object literal for the '<em><b>XPixel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__XPIXEL = eINSTANCE.getTouchscreen_XPixel();

		/**
		 * The meta object literal for the '<em><b>YPixel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__YPIXEL = eINSTANCE.getTouchscreen_YPixel();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__HEIGHT = eINSTANCE.getTouchscreen_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__WIDTH = eINSTANCE.getTouchscreen_Width();

		/**
		 * The meta object literal for the '<em><b>Force For Actuating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__FORCE_FOR_ACTUATING = eINSTANCE.getTouchscreen_ForceForActuating();

		/**
		 * The meta object literal for the '<em><b>Usable With Pen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__USABLE_WITH_PEN = eINSTANCE.getTouchscreen_UsableWithPen();

		/**
		 * The meta object literal for the '<em><b>Multi Touch Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__MULTI_TOUCH_CAPABLE = eINSTANCE.getTouchscreen_MultiTouchCapable();

		/**
		 * The meta object literal for the '<em><b>Tactile Feedback Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE = eINSTANCE.getTouchscreen_TactileFeedbackCapable();

		/**
		 * The meta object literal for the '<em><b>Touch Gesture Recognition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION = eINSTANCE.getTouchscreen_TouchGestureRecognition();

		/**
		 * The meta object literal for the '<em><b>Closeness Recognition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSCREEN__CLOSENESS_RECOGNITION = eINSTANCE.getTouchscreen_ClosenessRecognition();

		/**
		 * The meta object literal for the '<em><b>Correspond Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHSCREEN__CORRESPOND_DISPLAY = eINSTANCE.getTouchscreen_CorrespondDisplay();

		/**
		 * The meta object literal for the '{@link platform.impl.AuditiveInputDeviceImpl <em>Auditive Input Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.AuditiveInputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getAuditiveInputDevice()
		 * @generated
		 */
		EClass AUDITIVE_INPUT_DEVICE = eINSTANCE.getAuditiveInputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.MicrophoneImpl <em>Microphone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.MicrophoneImpl
		 * @see platform.impl.PlatformPackageImpl#getMicrophone()
		 * @generated
		 */
		EClass MICROPHONE = eINSTANCE.getMicrophone();

		/**
		 * The meta object literal for the '{@link platform.impl.ProprioceptiveInputDeviceImpl <em>Proprioceptive Input Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.ProprioceptiveInputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getProprioceptiveInputDevice()
		 * @generated
		 */
		EClass PROPRIOCEPTIVE_INPUT_DEVICE = eINSTANCE.getProprioceptiveInputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.PointingDeviceImpl <em>Pointing Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.PointingDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getPointingDevice()
		 * @generated
		 */
		EClass POINTING_DEVICE = eINSTANCE.getPointingDevice();

		/**
		 * The meta object literal for the '<em><b>Has High Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTING_DEVICE__HAS_HIGH_PRECISION = eINSTANCE.getPointingDevice_HasHighPrecision();

		/**
		 * The meta object literal for the '<em><b>Degrees Of Freedom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTING_DEVICE__DEGREES_OF_FREEDOM = eINSTANCE.getPointingDevice_DegreesOfFreedom();

		/**
		 * The meta object literal for the '{@link platform.impl.OutputDeviceImpl <em>Output Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.OutputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getOutputDevice()
		 * @generated
		 */
		EClass OUTPUT_DEVICE = eINSTANCE.getOutputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.VisualOutputDeviceImpl <em>Visual Output Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.VisualOutputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getVisualOutputDevice()
		 * @generated
		 */
		EClass VISUAL_OUTPUT_DEVICE = eINSTANCE.getVisualOutputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.DisplayImpl
		 * @see platform.impl.PlatformPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>XPixel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__XPIXEL = eINSTANCE.getDisplay_XPixel();

		/**
		 * The meta object literal for the '<em><b>YPixel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__YPIXEL = eINSTANCE.getDisplay_YPixel();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__HEIGHT = eINSTANCE.getDisplay_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__WIDTH = eINSTANCE.getDisplay_Width();

		/**
		 * The meta object literal for the '<em><b>Is Color Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__IS_COLOR_CAPABLE = eINSTANCE.getDisplay_IsColorCapable();

		/**
		 * The meta object literal for the '<em><b>Is Images Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__IS_IMAGES_CAPABLE = eINSTANCE.getDisplay_IsImagesCapable();

		/**
		 * The meta object literal for the '<em><b>Is Videos Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__IS_VIDEOS_CAPABLE = eINSTANCE.getDisplay_IsVideosCapable();

		/**
		 * The meta object literal for the '{@link platform.impl.TactileOutputDeviceImpl <em>Tactile Output Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.TactileOutputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getTactileOutputDevice()
		 * @generated
		 */
		EClass TACTILE_OUTPUT_DEVICE = eINSTANCE.getTactileOutputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.VibrationMotorImpl <em>Vibration Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.VibrationMotorImpl
		 * @see platform.impl.PlatformPackageImpl#getVibrationMotor()
		 * @generated
		 */
		EClass VIBRATION_MOTOR = eINSTANCE.getVibrationMotor();

		/**
		 * The meta object literal for the '{@link platform.impl.AuditiveOutputDeviceImpl <em>Auditive Output Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.AuditiveOutputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getAuditiveOutputDevice()
		 * @generated
		 */
		EClass AUDITIVE_OUTPUT_DEVICE = eINSTANCE.getAuditiveOutputDevice();

		/**
		 * The meta object literal for the '{@link platform.impl.SpeakerImpl <em>Speaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.SpeakerImpl
		 * @see platform.impl.PlatformPackageImpl#getSpeaker()
		 * @generated
		 */
		EClass SPEAKER = eINSTANCE.getSpeaker();

		/**
		 * The meta object literal for the '{@link platform.impl.ProprioceptiveOutputDeviceImpl <em>Proprioceptive Output Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.impl.ProprioceptiveOutputDeviceImpl
		 * @see platform.impl.PlatformPackageImpl#getProprioceptiveOutputDevice()
		 * @generated
		 */
		EClass PROPRIOCEPTIVE_OUTPUT_DEVICE = eINSTANCE.getProprioceptiveOutputDevice();

		/**
		 * The meta object literal for the '{@link platform.PlatformType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.PlatformType
		 * @see platform.impl.PlatformPackageImpl#getPlatformType()
		 * @generated
		 */
		EEnum PLATFORM_TYPE = eINSTANCE.getPlatformType();

		/**
		 * The meta object literal for the '{@link platform.InteractionModality <em>Interaction Modality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.InteractionModality
		 * @see platform.impl.PlatformPackageImpl#getInteractionModality()
		 * @generated
		 */
		EEnum INTERACTION_MODALITY = eINSTANCE.getInteractionModality();

		/**
		 * The meta object literal for the '{@link platform.Sensibility <em>Sensibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.Sensibility
		 * @see platform.impl.PlatformPackageImpl#getSensibility()
		 * @generated
		 */
		EEnum SENSIBILITY = eINSTANCE.getSensibility();

		/**
		 * The meta object literal for the '{@link platform.KeyboardType <em>Keyboard Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.KeyboardType
		 * @see platform.impl.PlatformPackageImpl#getKeyboardType()
		 * @generated
		 */
		EEnum KEYBOARD_TYPE = eINSTANCE.getKeyboardType();

		/**
		 * The meta object literal for the '{@link platform.ElementaryTaskEvaluation <em>Elementary Task Evaluation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.ElementaryTaskEvaluation
		 * @see platform.impl.PlatformPackageImpl#getElementaryTaskEvaluation()
		 * @generated
		 */
		EEnum ELEMENTARY_TASK_EVALUATION = eINSTANCE.getElementaryTaskEvaluation();

		/**
		 * The meta object literal for the '{@link platform.HardkeyType <em>Hardkey Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.HardkeyType
		 * @see platform.impl.PlatformPackageImpl#getHardkeyType()
		 * @generated
		 */
		EEnum HARDKEY_TYPE = eINSTANCE.getHardkeyType();

		/**
		 * The meta object literal for the '{@link platform.SizeEvaluation <em>Size Evaluation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platform.SizeEvaluation
		 * @see platform.impl.PlatformPackageImpl#getSizeEvaluation()
		 * @generated
		 */
		EEnum SIZE_EVALUATION = eINSTANCE.getSizeEvaluation();

	}

} //PlatformPackage
