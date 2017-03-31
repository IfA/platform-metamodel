/**
 */
package platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.IntegerProperty#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getIntegerProperty()
 * @model
 * @generated
 */
public interface IntegerProperty extends GenericProperty {
	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(int)
	 * @see platform.PlatformPackage#getIntegerProperty_IntegerValue()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!IntegerProperty!integerValue'"
	 * @generated
	 */
	int getIntegerValue();

	/**
	 * Sets the value of the '{@link platform.IntegerProperty#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(int value);

} // IntegerProperty