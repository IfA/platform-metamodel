/**
 */
package platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointing Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.PointingDevice#isHasHighPrecision <em>Has High Precision</em>}</li>
 *   <li>{@link platform.PointingDevice#getDegreesOfFreedom <em>Degrees Of Freedom</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getPointingDevice()
 * @model
 * @generated
 */
public interface PointingDevice extends InputDevice {
	/**
	 * Returns the value of the '<em><b>Has High Precision</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has High Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has High Precision</em>' attribute.
	 * @see #setHasHighPrecision(boolean)
	 * @see platform.PlatformPackage#getPointingDevice_HasHighPrecision()
	 * @model default="True"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!PointingDevice!hasHighPrecision'"
	 * @generated
	 */
	boolean isHasHighPrecision();

	/**
	 * Sets the value of the '{@link platform.PointingDevice#isHasHighPrecision <em>Has High Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has High Precision</em>' attribute.
	 * @see #isHasHighPrecision()
	 * @generated
	 */
	void setHasHighPrecision(boolean value);

	/**
	 * Returns the value of the '<em><b>Degrees Of Freedom</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees Of Freedom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees Of Freedom</em>' attribute.
	 * @see #setDegreesOfFreedom(int)
	 * @see platform.PlatformPackage#getPointingDevice_DegreesOfFreedom()
	 * @model default="2"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!PointingDevice!degreesOfFreedom'"
	 * @generated
	 */
	int getDegreesOfFreedom();

	/**
	 * Sets the value of the '{@link platform.PointingDevice#getDegreesOfFreedom <em>Degrees Of Freedom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees Of Freedom</em>' attribute.
	 * @see #getDegreesOfFreedom()
	 * @generated
	 */
	void setDegreesOfFreedom(int value);

} // PointingDevice
