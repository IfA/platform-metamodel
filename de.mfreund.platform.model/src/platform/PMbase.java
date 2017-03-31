/**
 */
package platform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMbase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.PMbase#getPlatformCollection <em>Platform Collection</em>}</li>
 *   <li>{@link platform.PMbase#getRessourceCollection <em>Ressource Collection</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getPMbase()
 * @model
 * @generated
 */
public interface PMbase extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform Collection</b></em>' containment reference list.
	 * The list contents are of type {@link platform.Platform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Collection</em>' containment reference list.
	 * @see platform.PlatformPackage#getPMbase_PlatformCollection()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!PMbase!platformCollection'"
	 * @generated
	 */
	EList<Platform> getPlatformCollection();

	/**
	 * Returns the value of the '<em><b>Ressource Collection</b></em>' containment reference list.
	 * The list contents are of type {@link platform.Ressource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource Collection</em>' containment reference list.
	 * @see platform.PlatformPackage#getPMbase_RessourceCollection()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!PMbase!ressourceCollection'"
	 * @generated
	 */
	EList<Ressource> getRessourceCollection();

} // PMbase
