/*******************************************************************************
 * Copyright (C) 2015-2018 Matthias Freund and others, Institute of Automation, TU Dresden
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *   Institute of Automation, TU Dresden - Initial API and implementation
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
/**
 */
package platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchscreen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Touchscreen#getXPixel <em>XPixel</em>}</li>
 *   <li>{@link platform.Touchscreen#getYPixel <em>YPixel</em>}</li>
 *   <li>{@link platform.Touchscreen#getHeight <em>Height</em>}</li>
 *   <li>{@link platform.Touchscreen#getWidth <em>Width</em>}</li>
 *   <li>{@link platform.Touchscreen#isForceForActuating <em>Force For Actuating</em>}</li>
 *   <li>{@link platform.Touchscreen#isUsableWithPen <em>Usable With Pen</em>}</li>
 *   <li>{@link platform.Touchscreen#isMultiTouchCapable <em>Multi Touch Capable</em>}</li>
 *   <li>{@link platform.Touchscreen#isTactileFeedbackCapable <em>Tactile Feedback Capable</em>}</li>
 *   <li>{@link platform.Touchscreen#isTouchGestureRecognition <em>Touch Gesture Recognition</em>}</li>
 *   <li>{@link platform.Touchscreen#isClosenessRecognition <em>Closeness Recognition</em>}</li>
 *   <li>{@link platform.Touchscreen#getCorrespondDisplay <em>Correspond Display</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getTouchscreen()
 * @model
 * @generated
 */
public interface Touchscreen extends TactileInputDevice {
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
	 * @see platform.PlatformPackage#getTouchscreen_XPixel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!xPixel'"
	 * @generated
	 */
	int getXPixel();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#getXPixel <em>XPixel</em>}' attribute.
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
	 * @see platform.PlatformPackage#getTouchscreen_YPixel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!yPixel'"
	 * @generated
	 */
	int getYPixel();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#getYPixel <em>YPixel</em>}' attribute.
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
	 * @see platform.PlatformPackage#getTouchscreen_Height()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!height'"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#getHeight <em>Height</em>}' attribute.
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
	 * @see platform.PlatformPackage#getTouchscreen_Width()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!width'"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Force For Actuating</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force For Actuating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force For Actuating</em>' attribute.
	 * @see #setForceForActuating(boolean)
	 * @see platform.PlatformPackage#getTouchscreen_ForceForActuating()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!forceForActuating'"
	 * @generated
	 */
	boolean isForceForActuating();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#isForceForActuating <em>Force For Actuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force For Actuating</em>' attribute.
	 * @see #isForceForActuating()
	 * @generated
	 */
	void setForceForActuating(boolean value);

	/**
	 * Returns the value of the '<em><b>Usable With Pen</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable With Pen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable With Pen</em>' attribute.
	 * @see #setUsableWithPen(boolean)
	 * @see platform.PlatformPackage#getTouchscreen_UsableWithPen()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!usableWithPen'"
	 * @generated
	 */
	boolean isUsableWithPen();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#isUsableWithPen <em>Usable With Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable With Pen</em>' attribute.
	 * @see #isUsableWithPen()
	 * @generated
	 */
	void setUsableWithPen(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Touch Capable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Touch Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Touch Capable</em>' attribute.
	 * @see #setMultiTouchCapable(boolean)
	 * @see platform.PlatformPackage#getTouchscreen_MultiTouchCapable()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!multiTouchCapable'"
	 * @generated
	 */
	boolean isMultiTouchCapable();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#isMultiTouchCapable <em>Multi Touch Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Touch Capable</em>' attribute.
	 * @see #isMultiTouchCapable()
	 * @generated
	 */
	void setMultiTouchCapable(boolean value);

	/**
	 * Returns the value of the '<em><b>Tactile Feedback Capable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tactile Feedback Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tactile Feedback Capable</em>' attribute.
	 * @see #setTactileFeedbackCapable(boolean)
	 * @see platform.PlatformPackage#getTouchscreen_TactileFeedbackCapable()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!tactileFeedbackCapable'"
	 * @generated
	 */
	boolean isTactileFeedbackCapable();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#isTactileFeedbackCapable <em>Tactile Feedback Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tactile Feedback Capable</em>' attribute.
	 * @see #isTactileFeedbackCapable()
	 * @generated
	 */
	void setTactileFeedbackCapable(boolean value);

	/**
	 * Returns the value of the '<em><b>Touch Gesture Recognition</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touch Gesture Recognition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touch Gesture Recognition</em>' attribute.
	 * @see #setTouchGestureRecognition(boolean)
	 * @see platform.PlatformPackage#getTouchscreen_TouchGestureRecognition()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!touchGestureRecognition'"
	 * @generated
	 */
	boolean isTouchGestureRecognition();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#isTouchGestureRecognition <em>Touch Gesture Recognition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touch Gesture Recognition</em>' attribute.
	 * @see #isTouchGestureRecognition()
	 * @generated
	 */
	void setTouchGestureRecognition(boolean value);

	/**
	 * Returns the value of the '<em><b>Closeness Recognition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closeness Recognition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closeness Recognition</em>' attribute.
	 * @see #setClosenessRecognition(boolean)
	 * @see platform.PlatformPackage#getTouchscreen_ClosenessRecognition()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!closenessRecognition'"
	 * @generated
	 */
	boolean isClosenessRecognition();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#isClosenessRecognition <em>Closeness Recognition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closeness Recognition</em>' attribute.
	 * @see #isClosenessRecognition()
	 * @generated
	 */
	void setClosenessRecognition(boolean value);

	/**
	 * Returns the value of the '<em><b>Correspond Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond Display</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond Display</em>' reference.
	 * @see #setCorrespondDisplay(Display)
	 * @see platform.PlatformPackage#getTouchscreen_CorrespondDisplay()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Touchscreen!correspondDisplay'"
	 * @generated
	 */
	Display getCorrespondDisplay();

	/**
	 * Sets the value of the '{@link platform.Touchscreen#getCorrespondDisplay <em>Correspond Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspond Display</em>' reference.
	 * @see #getCorrespondDisplay()
	 * @generated
	 */
	void setCorrespondDisplay(Display value);

} // Touchscreen
