/**
 */
package platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.InteractionProperty#getInteractionModality <em>Interaction Modality</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getInteractionProperty()
 * @model
 * @generated
 */
public interface InteractionProperty extends GenericProperty {
	/**
	 * Returns the value of the '<em><b>Interaction Modality</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link platform.InteractionModality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Modality</em>' attribute.
	 * @see platform.InteractionModality
	 * @see #setInteractionModality(InteractionModality)
	 * @see platform.PlatformPackage#getInteractionProperty_InteractionModality()
	 * @model default="none"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!InteractionProperty!interactionModality'"
	 * @generated
	 */
	InteractionModality getInteractionModality();

	/**
	 * Sets the value of the '{@link platform.InteractionProperty#getInteractionModality <em>Interaction Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Modality</em>' attribute.
	 * @see platform.InteractionModality
	 * @see #getInteractionModality()
	 * @generated
	 */
	void setInteractionModality(InteractionModality value);

} // InteractionProperty
