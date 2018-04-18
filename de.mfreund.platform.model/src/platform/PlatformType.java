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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage#getPlatformType()
 * @model
 * @generated
 */
public enum PlatformType implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "other", "other"),

	/**
	 * The '<em><b>Classic PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIC_PC_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIC_PC(1, "ClassicPC", "ClassicPC"),

	/**
	 * The '<em><b>Industrial Pc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL_PC_VALUE
	 * @generated
	 * @ordered
	 */
	INDUSTRIAL_PC(2, "IndustrialPc", "IndustrialPc"),

	/**
	 * The '<em><b>Laptop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAPTOP_VALUE
	 * @generated
	 * @ordered
	 */
	LAPTOP(3, "Laptop", "Laptop"),

	/**
	 * The '<em><b>Smartphone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	SMARTPHONE(4, "Smartphone", "Smartphone"),

	/**
	 * The '<em><b>Tablet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLET_VALUE
	 * @generated
	 * @ordered
	 */
	TABLET(5, "Tablet", "Tablet"),

	/**
	 * The '<em><b>Head Mounted Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_MOUNTED_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_MOUNTED_DEVICE(6, "HeadMountedDevice", "HeadMountedDevice");

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Classic PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Classic PC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASSIC_PC
	 * @model name="ClassicPC"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIC_PC_VALUE = 1;

	/**
	 * The '<em><b>Industrial Pc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Industrial Pc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL_PC
	 * @model name="IndustrialPc"
	 * @generated
	 * @ordered
	 */
	public static final int INDUSTRIAL_PC_VALUE = 2;

	/**
	 * The '<em><b>Laptop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Laptop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAPTOP
	 * @model name="Laptop"
	 * @generated
	 * @ordered
	 */
	public static final int LAPTOP_VALUE = 3;

	/**
	 * The '<em><b>Smartphone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smartphone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMARTPHONE
	 * @model name="Smartphone"
	 * @generated
	 * @ordered
	 */
	public static final int SMARTPHONE_VALUE = 4;

	/**
	 * The '<em><b>Tablet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tablet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLET
	 * @model name="Tablet"
	 * @generated
	 * @ordered
	 */
	public static final int TABLET_VALUE = 5;

	/**
	 * The '<em><b>Head Mounted Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Head Mounted Device</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_MOUNTED_DEVICE
	 * @model name="HeadMountedDevice"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_MOUNTED_DEVICE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlatformType[] VALUES_ARRAY =
		new PlatformType[] {
			OTHER,
			CLASSIC_PC,
			INDUSTRIAL_PC,
			LAPTOP,
			SMARTPHONE,
			TABLET,
			HEAD_MOUNTED_DEVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlatformType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlatformType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlatformType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlatformType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlatformType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlatformType get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case CLASSIC_PC_VALUE: return CLASSIC_PC;
			case INDUSTRIAL_PC_VALUE: return INDUSTRIAL_PC;
			case LAPTOP_VALUE: return LAPTOP;
			case SMARTPHONE_VALUE: return SMARTPHONE;
			case TABLET_VALUE: return TABLET;
			case HEAD_MOUNTED_DEVICE_VALUE: return HEAD_MOUNTED_DEVICE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PlatformType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PlatformType
