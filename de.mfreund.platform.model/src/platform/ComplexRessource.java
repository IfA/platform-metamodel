/**
 */
package platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.ComplexRessource#getSubRessources <em>Sub Ressources</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getComplexRessource()
 * @model abstract="true"
 * @generated
 */
public interface ComplexRessource extends Ressource {
	/**
	 * Returns the value of the '<em><b>Sub Ressources</b></em>' containment reference list.
	 * The list contents are of type {@link platform.Ressource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Ressources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Ressources</em>' containment reference list.
	 * @see platform.PlatformPackage#getComplexRessource_SubRessources()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ComplexRessource!subRessources'"
	 * @generated
	 */
	EList<Ressource> getSubRessources();

} // ComplexRessource
