/**
 */
package platform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Platform#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link platform.Platform#getPlatformId <em>Platform Id</em>}</li>
 *   <li>{@link platform.Platform#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link platform.Platform#getRessources <em>Ressources</em>}</li>
 *   <li>{@link platform.Platform#getGenericProperty <em>Generic Property</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getPlatform()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='test'"
 * @generated
 */
public interface Platform extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Name</em>' attribute.
	 * @see #setPlatformName(String)
	 * @see platform.PlatformPackage#getPlatform_PlatformName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Platform!platformName'"
	 * @generated
	 */
	String getPlatformName();

	/**
	 * Sets the value of the '{@link platform.Platform#getPlatformName <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Name</em>' attribute.
	 * @see #getPlatformName()
	 * @generated
	 */
	void setPlatformName(String value);

	/**
	 * Returns the value of the '<em><b>Platform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Id</em>' attribute.
	 * @see #setPlatformId(int)
	 * @see platform.PlatformPackage#getPlatform_PlatformId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Platform!platformId'"
	 * @generated
	 */
	int getPlatformId();

	/**
	 * Sets the value of the '{@link platform.Platform#getPlatformId <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Id</em>' attribute.
	 * @see #getPlatformId()
	 * @generated
	 */
	void setPlatformId(int value);

	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.PlatformType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type</em>' attribute.
	 * @see platform.PlatformType
	 * @see #setPlatformType(PlatformType)
	 * @see platform.PlatformPackage#getPlatform_PlatformType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Platform!platformType'"
	 * @generated
	 */
	PlatformType getPlatformType();

	/**
	 * Sets the value of the '{@link platform.Platform#getPlatformType <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' attribute.
	 * @see platform.PlatformType
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(PlatformType value);

	/**
	 * Returns the value of the '<em><b>Ressources</b></em>' reference list.
	 * The list contents are of type {@link platform.Ressource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources</em>' reference list.
	 * @see platform.PlatformPackage#getPlatform_Ressources()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Platform!ressources'"
	 * @generated
	 */
	EList<Ressource> getRessources();

	/**
	 * Returns the value of the '<em><b>Generic Property</b></em>' containment reference list.
	 * The list contents are of type {@link platform.GenericProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Property</em>' containment reference list.
	 * @see platform.PlatformPackage#getPlatform_GenericProperty()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Platform!genericProperty'"
	 * @generated
	 */
	EList<GenericProperty> getGenericProperty();

} // Platform
