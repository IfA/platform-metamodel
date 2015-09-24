/**
 */
package platform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platform.Hardkey;
import platform.HardkeyType;
import platform.PlatformPackage;
import platform.SizeEvaluation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardkey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.HardkeyImpl#getButtonSymbol <em>Button Symbol</em>}</li>
 *   <li>{@link platform.impl.HardkeyImpl#getButtonColor <em>Button Color</em>}</li>
 *   <li>{@link platform.impl.HardkeyImpl#getButtonSize <em>Button Size</em>}</li>
 *   <li>{@link platform.impl.HardkeyImpl#getHardkeyType <em>Hardkey Type</em>}</li>
 *   <li>{@link platform.impl.HardkeyImpl#isConfigurable <em>Configurable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardkeyImpl extends TactileInputDeviceImpl implements Hardkey {
	/**
	 * The default value of the '{@link #getButtonSymbol() <em>Button Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTON_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtonSymbol() <em>Button Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonSymbol()
	 * @generated
	 * @ordered
	 */
	protected String buttonSymbol = BUTTON_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtonColor() <em>Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTON_COLOR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getButtonColor() <em>Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonColor()
	 * @generated
	 * @ordered
	 */
	protected String buttonColor = BUTTON_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtonSize() <em>Button Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonSize()
	 * @generated
	 * @ordered
	 */
	protected static final SizeEvaluation BUTTON_SIZE_EDEFAULT = SizeEvaluation.MIDDLE;

	/**
	 * The cached value of the '{@link #getButtonSize() <em>Button Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonSize()
	 * @generated
	 * @ordered
	 */
	protected SizeEvaluation buttonSize = BUTTON_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardkeyType() <em>Hardkey Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardkeyType()
	 * @generated
	 * @ordered
	 */
	protected static final HardkeyType HARDKEY_TYPE_EDEFAULT = HardkeyType.MACHINE_SPECIFIC;

	/**
	 * The cached value of the '{@link #getHardkeyType() <em>Hardkey Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardkeyType()
	 * @generated
	 * @ordered
	 */
	protected HardkeyType hardkeyType = HARDKEY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfigurable() <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIGURABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfigurable() <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigurable()
	 * @generated
	 * @ordered
	 */
	protected boolean configurable = CONFIGURABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardkeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.HARDKEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButtonSymbol() {
		return buttonSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonSymbol(String newButtonSymbol) {
		String oldButtonSymbol = buttonSymbol;
		buttonSymbol = newButtonSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HARDKEY__BUTTON_SYMBOL, oldButtonSymbol, buttonSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButtonColor() {
		return buttonColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonColor(String newButtonColor) {
		String oldButtonColor = buttonColor;
		buttonColor = newButtonColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HARDKEY__BUTTON_COLOR, oldButtonColor, buttonColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeEvaluation getButtonSize() {
		return buttonSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonSize(SizeEvaluation newButtonSize) {
		SizeEvaluation oldButtonSize = buttonSize;
		buttonSize = newButtonSize == null ? BUTTON_SIZE_EDEFAULT : newButtonSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HARDKEY__BUTTON_SIZE, oldButtonSize, buttonSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardkeyType getHardkeyType() {
		return hardkeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardkeyType(HardkeyType newHardkeyType) {
		HardkeyType oldHardkeyType = hardkeyType;
		hardkeyType = newHardkeyType == null ? HARDKEY_TYPE_EDEFAULT : newHardkeyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HARDKEY__HARDKEY_TYPE, oldHardkeyType, hardkeyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfigurable() {
		return configurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurable(boolean newConfigurable) {
		boolean oldConfigurable = configurable;
		configurable = newConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HARDKEY__CONFIGURABLE, oldConfigurable, configurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.HARDKEY__BUTTON_SYMBOL:
				return getButtonSymbol();
			case PlatformPackage.HARDKEY__BUTTON_COLOR:
				return getButtonColor();
			case PlatformPackage.HARDKEY__BUTTON_SIZE:
				return getButtonSize();
			case PlatformPackage.HARDKEY__HARDKEY_TYPE:
				return getHardkeyType();
			case PlatformPackage.HARDKEY__CONFIGURABLE:
				return isConfigurable();
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
			case PlatformPackage.HARDKEY__BUTTON_SYMBOL:
				setButtonSymbol((String)newValue);
				return;
			case PlatformPackage.HARDKEY__BUTTON_COLOR:
				setButtonColor((String)newValue);
				return;
			case PlatformPackage.HARDKEY__BUTTON_SIZE:
				setButtonSize((SizeEvaluation)newValue);
				return;
			case PlatformPackage.HARDKEY__HARDKEY_TYPE:
				setHardkeyType((HardkeyType)newValue);
				return;
			case PlatformPackage.HARDKEY__CONFIGURABLE:
				setConfigurable((Boolean)newValue);
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
			case PlatformPackage.HARDKEY__BUTTON_SYMBOL:
				setButtonSymbol(BUTTON_SYMBOL_EDEFAULT);
				return;
			case PlatformPackage.HARDKEY__BUTTON_COLOR:
				setButtonColor(BUTTON_COLOR_EDEFAULT);
				return;
			case PlatformPackage.HARDKEY__BUTTON_SIZE:
				setButtonSize(BUTTON_SIZE_EDEFAULT);
				return;
			case PlatformPackage.HARDKEY__HARDKEY_TYPE:
				setHardkeyType(HARDKEY_TYPE_EDEFAULT);
				return;
			case PlatformPackage.HARDKEY__CONFIGURABLE:
				setConfigurable(CONFIGURABLE_EDEFAULT);
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
			case PlatformPackage.HARDKEY__BUTTON_SYMBOL:
				return BUTTON_SYMBOL_EDEFAULT == null ? buttonSymbol != null : !BUTTON_SYMBOL_EDEFAULT.equals(buttonSymbol);
			case PlatformPackage.HARDKEY__BUTTON_COLOR:
				return BUTTON_COLOR_EDEFAULT == null ? buttonColor != null : !BUTTON_COLOR_EDEFAULT.equals(buttonColor);
			case PlatformPackage.HARDKEY__BUTTON_SIZE:
				return buttonSize != BUTTON_SIZE_EDEFAULT;
			case PlatformPackage.HARDKEY__HARDKEY_TYPE:
				return hardkeyType != HARDKEY_TYPE_EDEFAULT;
			case PlatformPackage.HARDKEY__CONFIGURABLE:
				return configurable != CONFIGURABLE_EDEFAULT;
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
		result.append(" (buttonSymbol: ");
		result.append(buttonSymbol);
		result.append(", buttonColor: ");
		result.append(buttonColor);
		result.append(", buttonSize: ");
		result.append(buttonSize);
		result.append(", hardkeyType: ");
		result.append(hardkeyType);
		result.append(", configurable: ");
		result.append(configurable);
		result.append(')');
		return result.toString();
	}

} //HardkeyImpl
