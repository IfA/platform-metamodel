/**
 */
package platform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platform.Display;
import platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.DisplayImpl#getXPixel <em>XPixel</em>}</li>
 *   <li>{@link platform.impl.DisplayImpl#getYPixel <em>YPixel</em>}</li>
 *   <li>{@link platform.impl.DisplayImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link platform.impl.DisplayImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link platform.impl.DisplayImpl#isIsColorCapable <em>Is Color Capable</em>}</li>
 *   <li>{@link platform.impl.DisplayImpl#isIsImagesCapable <em>Is Images Capable</em>}</li>
 *   <li>{@link platform.impl.DisplayImpl#isIsVideosCapable <em>Is Videos Capable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends VisualOutputDeviceImpl implements Display {
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
	 * The default value of the '{@link #isIsColorCapable() <em>Is Color Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsColorCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLOR_CAPABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsColorCapable() <em>Is Color Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsColorCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean isColorCapable = IS_COLOR_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsImagesCapable() <em>Is Images Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImagesCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMAGES_CAPABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsImagesCapable() <em>Is Images Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImagesCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean isImagesCapable = IS_IMAGES_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVideosCapable() <em>Is Videos Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVideosCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VIDEOS_CAPABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsVideosCapable() <em>Is Videos Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVideosCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean isVideosCapable = IS_VIDEOS_CAPABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DISPLAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__XPIXEL, oldXPixel, xPixel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__YPIXEL, oldYPixel, yPixel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsColorCapable() {
		return isColorCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsColorCapable(boolean newIsColorCapable) {
		boolean oldIsColorCapable = isColorCapable;
		isColorCapable = newIsColorCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__IS_COLOR_CAPABLE, oldIsColorCapable, isColorCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImagesCapable() {
		return isImagesCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImagesCapable(boolean newIsImagesCapable) {
		boolean oldIsImagesCapable = isImagesCapable;
		isImagesCapable = newIsImagesCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__IS_IMAGES_CAPABLE, oldIsImagesCapable, isImagesCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVideosCapable() {
		return isVideosCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVideosCapable(boolean newIsVideosCapable) {
		boolean oldIsVideosCapable = isVideosCapable;
		isVideosCapable = newIsVideosCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DISPLAY__IS_VIDEOS_CAPABLE, oldIsVideosCapable, isVideosCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DISPLAY__XPIXEL:
				return getXPixel();
			case PlatformPackage.DISPLAY__YPIXEL:
				return getYPixel();
			case PlatformPackage.DISPLAY__HEIGHT:
				return getHeight();
			case PlatformPackage.DISPLAY__WIDTH:
				return getWidth();
			case PlatformPackage.DISPLAY__IS_COLOR_CAPABLE:
				return isIsColorCapable();
			case PlatformPackage.DISPLAY__IS_IMAGES_CAPABLE:
				return isIsImagesCapable();
			case PlatformPackage.DISPLAY__IS_VIDEOS_CAPABLE:
				return isIsVideosCapable();
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
			case PlatformPackage.DISPLAY__XPIXEL:
				setXPixel((Integer)newValue);
				return;
			case PlatformPackage.DISPLAY__YPIXEL:
				setYPixel((Integer)newValue);
				return;
			case PlatformPackage.DISPLAY__HEIGHT:
				setHeight((Float)newValue);
				return;
			case PlatformPackage.DISPLAY__WIDTH:
				setWidth((Float)newValue);
				return;
			case PlatformPackage.DISPLAY__IS_COLOR_CAPABLE:
				setIsColorCapable((Boolean)newValue);
				return;
			case PlatformPackage.DISPLAY__IS_IMAGES_CAPABLE:
				setIsImagesCapable((Boolean)newValue);
				return;
			case PlatformPackage.DISPLAY__IS_VIDEOS_CAPABLE:
				setIsVideosCapable((Boolean)newValue);
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
			case PlatformPackage.DISPLAY__XPIXEL:
				setXPixel(XPIXEL_EDEFAULT);
				return;
			case PlatformPackage.DISPLAY__YPIXEL:
				setYPixel(YPIXEL_EDEFAULT);
				return;
			case PlatformPackage.DISPLAY__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PlatformPackage.DISPLAY__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PlatformPackage.DISPLAY__IS_COLOR_CAPABLE:
				setIsColorCapable(IS_COLOR_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.DISPLAY__IS_IMAGES_CAPABLE:
				setIsImagesCapable(IS_IMAGES_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.DISPLAY__IS_VIDEOS_CAPABLE:
				setIsVideosCapable(IS_VIDEOS_CAPABLE_EDEFAULT);
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
			case PlatformPackage.DISPLAY__XPIXEL:
				return xPixel != XPIXEL_EDEFAULT;
			case PlatformPackage.DISPLAY__YPIXEL:
				return yPixel != YPIXEL_EDEFAULT;
			case PlatformPackage.DISPLAY__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PlatformPackage.DISPLAY__WIDTH:
				return width != WIDTH_EDEFAULT;
			case PlatformPackage.DISPLAY__IS_COLOR_CAPABLE:
				return isColorCapable != IS_COLOR_CAPABLE_EDEFAULT;
			case PlatformPackage.DISPLAY__IS_IMAGES_CAPABLE:
				return isImagesCapable != IS_IMAGES_CAPABLE_EDEFAULT;
			case PlatformPackage.DISPLAY__IS_VIDEOS_CAPABLE:
				return isVideosCapable != IS_VIDEOS_CAPABLE_EDEFAULT;
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
		result.append(", isColorCapable: ");
		result.append(isColorCapable);
		result.append(", isImagesCapable: ");
		result.append(isImagesCapable);
		result.append(", isVideosCapable: ");
		result.append(isVideosCapable);
		result.append(')');
		return result.toString();
	}

} //DisplayImpl
