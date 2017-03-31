/**
 */
package platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Display#getXPixel <em>XPixel</em>}</li>
 *   <li>{@link platform.Display#getYPixel <em>YPixel</em>}</li>
 *   <li>{@link platform.Display#getHeight <em>Height</em>}</li>
 *   <li>{@link platform.Display#getWidth <em>Width</em>}</li>
 *   <li>{@link platform.Display#isIsColorCapable <em>Is Color Capable</em>}</li>
 *   <li>{@link platform.Display#isIsImagesCapable <em>Is Images Capable</em>}</li>
 *   <li>{@link platform.Display#isIsVideosCapable <em>Is Videos Capable</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends VisualOutputDevice {
	/**
	 * Returns the value of the '<em><b>XPixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPixel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPixel</em>' attribute.
	 * @see #setXPixel(int)
	 * @see platform.PlatformPackage#getDisplay_XPixel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!xPixel'"
	 * @generated
	 */
	int getXPixel();

	/**
	 * Sets the value of the '{@link platform.Display#getXPixel <em>XPixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPixel</em>' attribute.
	 * @see #getXPixel()
	 * @generated
	 */
	void setXPixel(int value);

	/**
	 * Returns the value of the '<em><b>YPixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPixel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPixel</em>' attribute.
	 * @see #setYPixel(int)
	 * @see platform.PlatformPackage#getDisplay_YPixel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!yPixel'"
	 * @generated
	 */
	int getYPixel();

	/**
	 * Sets the value of the '{@link platform.Display#getYPixel <em>YPixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPixel</em>' attribute.
	 * @see #getYPixel()
	 * @generated
	 */
	void setYPixel(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see platform.PlatformPackage#getDisplay_Height()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!height'"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link platform.Display#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see platform.PlatformPackage#getDisplay_Width()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!width'"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link platform.Display#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Is Color Capable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Color Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Color Capable</em>' attribute.
	 * @see #setIsColorCapable(boolean)
	 * @see platform.PlatformPackage#getDisplay_IsColorCapable()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!isColorCapable'"
	 * @generated
	 */
	boolean isIsColorCapable();

	/**
	 * Sets the value of the '{@link platform.Display#isIsColorCapable <em>Is Color Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Color Capable</em>' attribute.
	 * @see #isIsColorCapable()
	 * @generated
	 */
	void setIsColorCapable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Images Capable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Images Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Images Capable</em>' attribute.
	 * @see #setIsImagesCapable(boolean)
	 * @see platform.PlatformPackage#getDisplay_IsImagesCapable()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!isImagesCapable'"
	 * @generated
	 */
	boolean isIsImagesCapable();

	/**
	 * Sets the value of the '{@link platform.Display#isIsImagesCapable <em>Is Images Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Images Capable</em>' attribute.
	 * @see #isIsImagesCapable()
	 * @generated
	 */
	void setIsImagesCapable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Videos Capable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Videos Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Videos Capable</em>' attribute.
	 * @see #setIsVideosCapable(boolean)
	 * @see platform.PlatformPackage#getDisplay_IsVideosCapable()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Display!isVideosCapable'"
	 * @generated
	 */
	boolean isIsVideosCapable();

	/**
	 * Sets the value of the '{@link platform.Display#isIsVideosCapable <em>Is Videos Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Videos Capable</em>' attribute.
	 * @see #isIsVideosCapable()
	 * @generated
	 */
	void setIsVideosCapable(boolean value);

} // Display
