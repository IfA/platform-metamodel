/**
 */
package platform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.GenericProperty#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link platform.GenericProperty#getPropertyUnit <em>Property Unit</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getGenericProperty()
 * @model
 * @generated
 */
public interface GenericProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see platform.PlatformPackage#getGenericProperty_PropertyName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!GenericProperty!propertyName'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link platform.GenericProperty#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Unit</em>' attribute.
	 * @see #setPropertyUnit(String)
	 * @see platform.PlatformPackage#getGenericProperty_PropertyUnit()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!GenericProperty!propertyUnit'"
	 * @generated
	 */
	String getPropertyUnit();

	/**
	 * Sets the value of the '{@link platform.GenericProperty#getPropertyUnit <em>Property Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Unit</em>' attribute.
	 * @see #getPropertyUnit()
	 * @generated
	 */
	void setPropertyUnit(String value);

} // GenericProperty
