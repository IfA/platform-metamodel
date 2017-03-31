/**
 */
package platform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size Evaluation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see platform.PlatformPackage#getSizeEvaluation()
 * @model
 * @generated
 */
public enum SizeEvaluation implements Enumerator {
	/**
	 * The '<em><b>Very Small</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_SMALL(3, "verySmall", "verySmall"),

	/**
	 * The '<em><b>Small</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL(4, "small", "small"),

	/**
	 * The '<em><b>Middle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE(5, "middle", "middle"),

	/**
	 * The '<em><b>Big</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_VALUE
	 * @generated
	 * @ordered
	 */
	BIG(2, "big", "big"),

	/**
	 * The '<em><b>Very Big</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_BIG_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_BIG(1, "veryBig", "veryBig"),

	/**
	 * The '<em><b>Jumbo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMBO_VALUE
	 * @generated
	 * @ordered
	 */
	JUMBO(0, "jumbo", "jumbo");

	/**
	 * The '<em><b>Very Small</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Very Small</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERY_SMALL
	 * @model name="verySmall"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_SMALL_VALUE = 3;

	/**
	 * The '<em><b>Small</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Small</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @model name="small"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_VALUE = 4;

	/**
	 * The '<em><b>Middle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Middle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE
	 * @model name="middle"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_VALUE = 5;

	/**
	 * The '<em><b>Big</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Big</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG
	 * @model name="big"
	 * @generated
	 * @ordered
	 */
	public static final int BIG_VALUE = 2;

	/**
	 * The '<em><b>Very Big</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Very Big</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERY_BIG
	 * @model name="veryBig"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_BIG_VALUE = 1;

	/**
	 * The '<em><b>Jumbo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jumbo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUMBO
	 * @model name="jumbo"
	 * @generated
	 * @ordered
	 */
	public static final int JUMBO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Size Evaluation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizeEvaluation[] VALUES_ARRAY =
		new SizeEvaluation[] {
			VERY_SMALL,
			SMALL,
			MIDDLE,
			BIG,
			VERY_BIG,
			JUMBO,
		};

	/**
	 * A public read-only list of all the '<em><b>Size Evaluation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SizeEvaluation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size Evaluation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeEvaluation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeEvaluation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Evaluation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeEvaluation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeEvaluation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Evaluation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeEvaluation get(int value) {
		switch (value) {
			case VERY_SMALL_VALUE: return VERY_SMALL;
			case SMALL_VALUE: return SMALL;
			case MIDDLE_VALUE: return MIDDLE;
			case BIG_VALUE: return BIG;
			case VERY_BIG_VALUE: return VERY_BIG;
			case JUMBO_VALUE: return JUMBO;
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
	private SizeEvaluation(int value, String name, String literal) {
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
	
} //SizeEvaluation
