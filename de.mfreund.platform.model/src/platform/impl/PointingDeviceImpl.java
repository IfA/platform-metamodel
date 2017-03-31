/**
 */
package platform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platform.PlatformPackage;
import platform.PointingDevice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointing Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.PointingDeviceImpl#isHasHighPrecision <em>Has High Precision</em>}</li>
 *   <li>{@link platform.impl.PointingDeviceImpl#getDegreesOfFreedom <em>Degrees Of Freedom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointingDeviceImpl extends InputDeviceImpl implements PointingDevice {
	/**
	 * The default value of the '{@link #isHasHighPrecision() <em>Has High Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasHighPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_HIGH_PRECISION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasHighPrecision() <em>Has High Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasHighPrecision()
	 * @generated
	 * @ordered
	 */
	protected boolean hasHighPrecision = HAS_HIGH_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegreesOfFreedom() <em>Degrees Of Freedom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreesOfFreedom()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGREES_OF_FREEDOM_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getDegreesOfFreedom() <em>Degrees Of Freedom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreesOfFreedom()
	 * @generated
	 * @ordered
	 */
	protected int degreesOfFreedom = DEGREES_OF_FREEDOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointingDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.POINTING_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasHighPrecision() {
		return hasHighPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHighPrecision(boolean newHasHighPrecision) {
		boolean oldHasHighPrecision = hasHighPrecision;
		hasHighPrecision = newHasHighPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.POINTING_DEVICE__HAS_HIGH_PRECISION, oldHasHighPrecision, hasHighPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegreesOfFreedom() {
		return degreesOfFreedom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreesOfFreedom(int newDegreesOfFreedom) {
		int oldDegreesOfFreedom = degreesOfFreedom;
		degreesOfFreedom = newDegreesOfFreedom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.POINTING_DEVICE__DEGREES_OF_FREEDOM, oldDegreesOfFreedom, degreesOfFreedom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.POINTING_DEVICE__HAS_HIGH_PRECISION:
				return isHasHighPrecision();
			case PlatformPackage.POINTING_DEVICE__DEGREES_OF_FREEDOM:
				return getDegreesOfFreedom();
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
			case PlatformPackage.POINTING_DEVICE__HAS_HIGH_PRECISION:
				setHasHighPrecision((Boolean)newValue);
				return;
			case PlatformPackage.POINTING_DEVICE__DEGREES_OF_FREEDOM:
				setDegreesOfFreedom((Integer)newValue);
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
			case PlatformPackage.POINTING_DEVICE__HAS_HIGH_PRECISION:
				setHasHighPrecision(HAS_HIGH_PRECISION_EDEFAULT);
				return;
			case PlatformPackage.POINTING_DEVICE__DEGREES_OF_FREEDOM:
				setDegreesOfFreedom(DEGREES_OF_FREEDOM_EDEFAULT);
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
			case PlatformPackage.POINTING_DEVICE__HAS_HIGH_PRECISION:
				return hasHighPrecision != HAS_HIGH_PRECISION_EDEFAULT;
			case PlatformPackage.POINTING_DEVICE__DEGREES_OF_FREEDOM:
				return degreesOfFreedom != DEGREES_OF_FREEDOM_EDEFAULT;
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
		result.append(" (hasHighPrecision: ");
		result.append(hasHighPrecision);
		result.append(", degreesOfFreedom: ");
		result.append(degreesOfFreedom);
		result.append(')');
		return result.toString();
	}

} //PointingDeviceImpl
