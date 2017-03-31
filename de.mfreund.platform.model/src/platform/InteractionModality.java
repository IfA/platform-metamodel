/**
 */
package platform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Modality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage#getInteractionModality()
 * @model
 * @generated
 */
public enum InteractionModality implements Enumerator {
	/**
	 * The '<em><b>Visual Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUAL_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	VISUAL_INPUT(0, "visualInput", "visualInput"),

	/**
	 * The '<em><b>Auditive Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDITIVE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDITIVE_INPUT(1, "auditiveInput", "auditiveInput"),

	/**
	 * The '<em><b>Tactile Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TACTILE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	TACTILE_INPUT(2, "tactileInput", "tactileInput"),

	/**
	 * The '<em><b>Proprioceptive Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPRIOCEPTIVE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	PROPRIOCEPTIVE_INPUT(3, "proprioceptiveInput", "proprioceptiveInput"),

	/**
	 * The '<em><b>Visual Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUAL_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	VISUAL_OUTPUT(4, "visualOutput", "visualOutput"),

	/**
	 * The '<em><b>Auditive Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDITIVE_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDITIVE_OUTPUT(5, "auditiveOutput", "auditiveOutput"),

	/**
	 * The '<em><b>Tactile Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TACTILE_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	TACTILE_OUTPUT(6, "tactileOutput", "tactileOutput"),

	/**
	 * The '<em><b>Proprioceptive Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPRIOCEPTIVE_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	PROPRIOCEPTIVE_OUTPUT(7, "proprioceptiveOutput", "proprioceptiveOutput"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "other", "other"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(9, "none", "none");

	/**
	 * The '<em><b>Visual Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visual Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISUAL_INPUT
	 * @model name="visualInput"
	 * @generated
	 * @ordered
	 */
	public static final int VISUAL_INPUT_VALUE = 0;

	/**
	 * The '<em><b>Auditive Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auditive Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUDITIVE_INPUT
	 * @model name="auditiveInput"
	 * @generated
	 * @ordered
	 */
	public static final int AUDITIVE_INPUT_VALUE = 1;

	/**
	 * The '<em><b>Tactile Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tactile Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TACTILE_INPUT
	 * @model name="tactileInput"
	 * @generated
	 * @ordered
	 */
	public static final int TACTILE_INPUT_VALUE = 2;

	/**
	 * The '<em><b>Proprioceptive Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proprioceptive Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPRIOCEPTIVE_INPUT
	 * @model name="proprioceptiveInput"
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIOCEPTIVE_INPUT_VALUE = 3;

	/**
	 * The '<em><b>Visual Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visual Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISUAL_OUTPUT
	 * @model name="visualOutput"
	 * @generated
	 * @ordered
	 */
	public static final int VISUAL_OUTPUT_VALUE = 4;

	/**
	 * The '<em><b>Auditive Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auditive Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUDITIVE_OUTPUT
	 * @model name="auditiveOutput"
	 * @generated
	 * @ordered
	 */
	public static final int AUDITIVE_OUTPUT_VALUE = 5;

	/**
	 * The '<em><b>Tactile Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tactile Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TACTILE_OUTPUT
	 * @model name="tactileOutput"
	 * @generated
	 * @ordered
	 */
	public static final int TACTILE_OUTPUT_VALUE = 6;

	/**
	 * The '<em><b>Proprioceptive Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proprioceptive Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPRIOCEPTIVE_OUTPUT
	 * @model name="proprioceptiveOutput"
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIOCEPTIVE_OUTPUT_VALUE = 7;

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
	public static final int OTHER_VALUE = 8;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Interaction Modality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionModality[] VALUES_ARRAY =
		new InteractionModality[] {
			VISUAL_INPUT,
			AUDITIVE_INPUT,
			TACTILE_INPUT,
			PROPRIOCEPTIVE_INPUT,
			VISUAL_OUTPUT,
			AUDITIVE_OUTPUT,
			TACTILE_OUTPUT,
			PROPRIOCEPTIVE_OUTPUT,
			OTHER,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Interaction Modality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteractionModality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Modality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionModality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionModality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Modality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionModality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionModality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Modality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InteractionModality get(int value) {
		switch (value) {
			case VISUAL_INPUT_VALUE: return VISUAL_INPUT;
			case AUDITIVE_INPUT_VALUE: return AUDITIVE_INPUT;
			case TACTILE_INPUT_VALUE: return TACTILE_INPUT;
			case PROPRIOCEPTIVE_INPUT_VALUE: return PROPRIOCEPTIVE_INPUT;
			case VISUAL_OUTPUT_VALUE: return VISUAL_OUTPUT;
			case AUDITIVE_OUTPUT_VALUE: return AUDITIVE_OUTPUT;
			case TACTILE_OUTPUT_VALUE: return TACTILE_OUTPUT;
			case PROPRIOCEPTIVE_OUTPUT_VALUE: return PROPRIOCEPTIVE_OUTPUT;
			case OTHER_VALUE: return OTHER;
			case NONE_VALUE: return NONE;
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
	private InteractionModality(int value, String name, String literal) {
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
	
} //InteractionModality
