/**
 */
package platform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hardkey Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage#getHardkeyType()
 * @model
 * @generated
 */
public enum HardkeyType implements Enumerator {
	/**
	 * The '<em><b>Machine Specific</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACHINE_SPECIFIC_VALUE
	 * @generated
	 * @ordered
	 */
	MACHINE_SPECIFIC(0, "MachineSpecific", "MachineSpecific"),

	/**
	 * The '<em><b>Dialogue Specific</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIALOGUE_SPECIFIC_VALUE
	 * @generated
	 * @ordered
	 */
	DIALOGUE_SPECIFIC(0, "DialogueSpecific", "DialogueSpecific");

	/**
	 * The '<em><b>Machine Specific</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Machine Specific</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACHINE_SPECIFIC
	 * @model name="MachineSpecific"
	 * @generated
	 * @ordered
	 */
	public static final int MACHINE_SPECIFIC_VALUE = 0;

	/**
	 * The '<em><b>Dialogue Specific</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dialogue Specific</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIALOGUE_SPECIFIC
	 * @model name="DialogueSpecific"
	 * @generated
	 * @ordered
	 */
	public static final int DIALOGUE_SPECIFIC_VALUE = 0;

	/**
	 * An array of all the '<em><b>Hardkey Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HardkeyType[] VALUES_ARRAY =
		new HardkeyType[] {
			MACHINE_SPECIFIC,
			DIALOGUE_SPECIFIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Hardkey Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HardkeyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hardkey Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardkeyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardkeyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardkey Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardkeyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardkeyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardkey Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HardkeyType get(int value) {
		switch (value) {
			case MACHINE_SPECIFIC_VALUE: return MACHINE_SPECIFIC;
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
	private HardkeyType(int value, String name, String literal) {
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
	
} //HardkeyType
