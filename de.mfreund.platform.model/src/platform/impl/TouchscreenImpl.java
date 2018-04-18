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
package platform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platform.Display;
import platform.PlatformPackage;
import platform.Touchscreen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchscreen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.TouchscreenImpl#getXPixel <em>XPixel</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#getYPixel <em>YPixel</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#isForceForActuating <em>Force For Actuating</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#isUsableWithPen <em>Usable With Pen</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#isMultiTouchCapable <em>Multi Touch Capable</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#isTactileFeedbackCapable <em>Tactile Feedback Capable</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#isTouchGestureRecognition <em>Touch Gesture Recognition</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#isClosenessRecognition <em>Closeness Recognition</em>}</li>
 *   <li>{@link platform.impl.TouchscreenImpl#getCorrespondDisplay <em>Correspond Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchscreenImpl extends TactileInputDeviceImpl implements Touchscreen {
	/**
	 * The default value of the '{@link #getXPixel() <em>XPixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPixel()
	 * @generated
	 * @ordered
	 */
	protected static final int XPIXEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXPixel() <em>XPixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPixel()
	 * @generated
	 * @ordered
	 */
	protected int xPixel = XPIXEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPixel() <em>YPixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPixel()
	 * @generated
	 * @ordered
	 */
	protected static final int YPIXEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYPixel() <em>YPixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPixel()
	 * @generated
	 * @ordered
	 */
	protected int yPixel = YPIXEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isForceForActuating() <em>Force For Actuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceForActuating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_FOR_ACTUATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForceForActuating() <em>Force For Actuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceForActuating()
	 * @generated
	 * @ordered
	 */
	protected boolean forceForActuating = FORCE_FOR_ACTUATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsableWithPen() <em>Usable With Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableWithPen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_WITH_PEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsableWithPen() <em>Usable With Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableWithPen()
	 * @generated
	 * @ordered
	 */
	protected boolean usableWithPen = USABLE_WITH_PEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiTouchCapable() <em>Multi Touch Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiTouchCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_TOUCH_CAPABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMultiTouchCapable() <em>Multi Touch Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiTouchCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean multiTouchCapable = MULTI_TOUCH_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTactileFeedbackCapable() <em>Tactile Feedback Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTactileFeedbackCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TACTILE_FEEDBACK_CAPABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTactileFeedbackCapable() <em>Tactile Feedback Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTactileFeedbackCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean tactileFeedbackCapable = TACTILE_FEEDBACK_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTouchGestureRecognition() <em>Touch Gesture Recognition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTouchGestureRecognition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOUCH_GESTURE_RECOGNITION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTouchGestureRecognition() <em>Touch Gesture Recognition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTouchGestureRecognition()
	 * @generated
	 * @ordered
	 */
	protected boolean touchGestureRecognition = TOUCH_GESTURE_RECOGNITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isClosenessRecognition() <em>Closeness Recognition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosenessRecognition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSENESS_RECOGNITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosenessRecognition() <em>Closeness Recognition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosenessRecognition()
	 * @generated
	 * @ordered
	 */
	protected boolean closenessRecognition = CLOSENESS_RECOGNITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrespondDisplay() <em>Correspond Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondDisplay()
	 * @generated
	 * @ordered
	 */
	protected Display correspondDisplay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchscreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.TOUCHSCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXPixel() {
		return xPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPixel(int newXPixel) {
		int oldXPixel = xPixel;
		xPixel = newXPixel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__XPIXEL, oldXPixel, xPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYPixel() {
		return yPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPixel(int newYPixel) {
		int oldYPixel = yPixel;
		yPixel = newYPixel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__YPIXEL, oldYPixel, yPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForceForActuating() {
		return forceForActuating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceForActuating(boolean newForceForActuating) {
		boolean oldForceForActuating = forceForActuating;
		forceForActuating = newForceForActuating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__FORCE_FOR_ACTUATING, oldForceForActuating, forceForActuating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsableWithPen() {
		return usableWithPen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsableWithPen(boolean newUsableWithPen) {
		boolean oldUsableWithPen = usableWithPen;
		usableWithPen = newUsableWithPen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__USABLE_WITH_PEN, oldUsableWithPen, usableWithPen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiTouchCapable() {
		return multiTouchCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiTouchCapable(boolean newMultiTouchCapable) {
		boolean oldMultiTouchCapable = multiTouchCapable;
		multiTouchCapable = newMultiTouchCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__MULTI_TOUCH_CAPABLE, oldMultiTouchCapable, multiTouchCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTactileFeedbackCapable() {
		return tactileFeedbackCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTactileFeedbackCapable(boolean newTactileFeedbackCapable) {
		boolean oldTactileFeedbackCapable = tactileFeedbackCapable;
		tactileFeedbackCapable = newTactileFeedbackCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE, oldTactileFeedbackCapable, tactileFeedbackCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTouchGestureRecognition() {
		return touchGestureRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouchGestureRecognition(boolean newTouchGestureRecognition) {
		boolean oldTouchGestureRecognition = touchGestureRecognition;
		touchGestureRecognition = newTouchGestureRecognition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION, oldTouchGestureRecognition, touchGestureRecognition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosenessRecognition() {
		return closenessRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosenessRecognition(boolean newClosenessRecognition) {
		boolean oldClosenessRecognition = closenessRecognition;
		closenessRecognition = newClosenessRecognition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__CLOSENESS_RECOGNITION, oldClosenessRecognition, closenessRecognition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display getCorrespondDisplay() {
		if (correspondDisplay != null && correspondDisplay.eIsProxy()) {
			InternalEObject oldCorrespondDisplay = (InternalEObject)correspondDisplay;
			correspondDisplay = (Display)eResolveProxy(oldCorrespondDisplay);
			if (correspondDisplay != oldCorrespondDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.TOUCHSCREEN__CORRESPOND_DISPLAY, oldCorrespondDisplay, correspondDisplay));
			}
		}
		return correspondDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display basicGetCorrespondDisplay() {
		return correspondDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondDisplay(Display newCorrespondDisplay) {
		Display oldCorrespondDisplay = correspondDisplay;
		correspondDisplay = newCorrespondDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.TOUCHSCREEN__CORRESPOND_DISPLAY, oldCorrespondDisplay, correspondDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.TOUCHSCREEN__XPIXEL:
				return getXPixel();
			case PlatformPackage.TOUCHSCREEN__YPIXEL:
				return getYPixel();
			case PlatformPackage.TOUCHSCREEN__HEIGHT:
				return getHeight();
			case PlatformPackage.TOUCHSCREEN__WIDTH:
				return getWidth();
			case PlatformPackage.TOUCHSCREEN__FORCE_FOR_ACTUATING:
				return isForceForActuating();
			case PlatformPackage.TOUCHSCREEN__USABLE_WITH_PEN:
				return isUsableWithPen();
			case PlatformPackage.TOUCHSCREEN__MULTI_TOUCH_CAPABLE:
				return isMultiTouchCapable();
			case PlatformPackage.TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE:
				return isTactileFeedbackCapable();
			case PlatformPackage.TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION:
				return isTouchGestureRecognition();
			case PlatformPackage.TOUCHSCREEN__CLOSENESS_RECOGNITION:
				return isClosenessRecognition();
			case PlatformPackage.TOUCHSCREEN__CORRESPOND_DISPLAY:
				if (resolve) return getCorrespondDisplay();
				return basicGetCorrespondDisplay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.TOUCHSCREEN__XPIXEL:
				setXPixel((Integer)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__YPIXEL:
				setYPixel((Integer)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__HEIGHT:
				setHeight((Float)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__WIDTH:
				setWidth((Float)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__FORCE_FOR_ACTUATING:
				setForceForActuating((Boolean)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__USABLE_WITH_PEN:
				setUsableWithPen((Boolean)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__MULTI_TOUCH_CAPABLE:
				setMultiTouchCapable((Boolean)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE:
				setTactileFeedbackCapable((Boolean)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION:
				setTouchGestureRecognition((Boolean)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__CLOSENESS_RECOGNITION:
				setClosenessRecognition((Boolean)newValue);
				return;
			case PlatformPackage.TOUCHSCREEN__CORRESPOND_DISPLAY:
				setCorrespondDisplay((Display)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.TOUCHSCREEN__XPIXEL:
				setXPixel(XPIXEL_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__YPIXEL:
				setYPixel(YPIXEL_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__FORCE_FOR_ACTUATING:
				setForceForActuating(FORCE_FOR_ACTUATING_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__USABLE_WITH_PEN:
				setUsableWithPen(USABLE_WITH_PEN_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__MULTI_TOUCH_CAPABLE:
				setMultiTouchCapable(MULTI_TOUCH_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE:
				setTactileFeedbackCapable(TACTILE_FEEDBACK_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION:
				setTouchGestureRecognition(TOUCH_GESTURE_RECOGNITION_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__CLOSENESS_RECOGNITION:
				setClosenessRecognition(CLOSENESS_RECOGNITION_EDEFAULT);
				return;
			case PlatformPackage.TOUCHSCREEN__CORRESPOND_DISPLAY:
				setCorrespondDisplay((Display)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.TOUCHSCREEN__XPIXEL:
				return xPixel != XPIXEL_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__YPIXEL:
				return yPixel != YPIXEL_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__WIDTH:
				return width != WIDTH_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__FORCE_FOR_ACTUATING:
				return forceForActuating != FORCE_FOR_ACTUATING_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__USABLE_WITH_PEN:
				return usableWithPen != USABLE_WITH_PEN_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__MULTI_TOUCH_CAPABLE:
				return multiTouchCapable != MULTI_TOUCH_CAPABLE_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__TACTILE_FEEDBACK_CAPABLE:
				return tactileFeedbackCapable != TACTILE_FEEDBACK_CAPABLE_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__TOUCH_GESTURE_RECOGNITION:
				return touchGestureRecognition != TOUCH_GESTURE_RECOGNITION_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__CLOSENESS_RECOGNITION:
				return closenessRecognition != CLOSENESS_RECOGNITION_EDEFAULT;
			case PlatformPackage.TOUCHSCREEN__CORRESPOND_DISPLAY:
				return correspondDisplay != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xPixel: ");
		result.append(xPixel);
		result.append(", yPixel: ");
		result.append(yPixel);
		result.append(", height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", forceForActuating: ");
		result.append(forceForActuating);
		result.append(", usableWithPen: ");
		result.append(usableWithPen);
		result.append(", multiTouchCapable: ");
		result.append(multiTouchCapable);
		result.append(", tactileFeedbackCapable: ");
		result.append(tactileFeedbackCapable);
		result.append(", touchGestureRecognition: ");
		result.append(touchGestureRecognition);
		result.append(", closenessRecognition: ");
		result.append(closenessRecognition);
		result.append(')');
		return result.toString();
	}

} //TouchscreenImpl
