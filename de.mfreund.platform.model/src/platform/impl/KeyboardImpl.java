/**
 */
package platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import platform.Hardkey;
import platform.Keyboard;
import platform.KeyboardType;
import platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.KeyboardImpl#getKeyboardType <em>Keyboard Type</em>}</li>
 *   <li>{@link platform.impl.KeyboardImpl#getKeyboardTypeExtraInfo <em>Keyboard Type Extra Info</em>}</li>
 *   <li>{@link platform.impl.KeyboardImpl#isFastTextInput <em>Fast Text Input</em>}</li>
 *   <li>{@link platform.impl.KeyboardImpl#isEasyTextInput <em>Easy Text Input</em>}</li>
 *   <li>{@link platform.impl.KeyboardImpl#getHardkeys <em>Hardkeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyboardImpl extends ComplexRessourceImpl implements Keyboard {
	/**
	 * The default value of the '{@link #getKeyboardType() <em>Keyboard Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardType()
	 * @generated
	 * @ordered
	 */
	protected static final KeyboardType KEYBOARD_TYPE_EDEFAULT = KeyboardType.OTHER;

	/**
	 * The cached value of the '{@link #getKeyboardType() <em>Keyboard Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardType()
	 * @generated
	 * @ordered
	 */
	protected KeyboardType keyboardType = KEYBOARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyboardTypeExtraInfo() <em>Keyboard Type Extra Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardTypeExtraInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYBOARD_TYPE_EXTRA_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyboardTypeExtraInfo() <em>Keyboard Type Extra Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboardTypeExtraInfo()
	 * @generated
	 * @ordered
	 */
	protected String keyboardTypeExtraInfo = KEYBOARD_TYPE_EXTRA_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #isFastTextInput() <em>Fast Text Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFastTextInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAST_TEXT_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFastTextInput() <em>Fast Text Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFastTextInput()
	 * @generated
	 * @ordered
	 */
	protected boolean fastTextInput = FAST_TEXT_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEasyTextInput() <em>Easy Text Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEasyTextInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EASY_TEXT_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEasyTextInput() <em>Easy Text Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEasyTextInput()
	 * @generated
	 * @ordered
	 */
	protected boolean easyTextInput = EASY_TEXT_INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHardkeys() <em>Hardkeys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardkeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Hardkey> hardkeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.KEYBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyboardType getKeyboardType() {
		return keyboardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyboardType(KeyboardType newKeyboardType) {
		KeyboardType oldKeyboardType = keyboardType;
		keyboardType = newKeyboardType == null ? KEYBOARD_TYPE_EDEFAULT : newKeyboardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.KEYBOARD__KEYBOARD_TYPE, oldKeyboardType, keyboardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyboardTypeExtraInfo() {
		return keyboardTypeExtraInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyboardTypeExtraInfo(String newKeyboardTypeExtraInfo) {
		String oldKeyboardTypeExtraInfo = keyboardTypeExtraInfo;
		keyboardTypeExtraInfo = newKeyboardTypeExtraInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO, oldKeyboardTypeExtraInfo, keyboardTypeExtraInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFastTextInput() {
		return fastTextInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastTextInput(boolean newFastTextInput) {
		boolean oldFastTextInput = fastTextInput;
		fastTextInput = newFastTextInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.KEYBOARD__FAST_TEXT_INPUT, oldFastTextInput, fastTextInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEasyTextInput() {
		return easyTextInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEasyTextInput(boolean newEasyTextInput) {
		boolean oldEasyTextInput = easyTextInput;
		easyTextInput = newEasyTextInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.KEYBOARD__EASY_TEXT_INPUT, oldEasyTextInput, easyTextInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hardkey> getHardkeys() {
		if (hardkeys == null) {
			hardkeys = new EObjectResolvingEList<Hardkey>(Hardkey.class, this, PlatformPackage.KEYBOARD__HARDKEYS);
		}
		return hardkeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE:
				return getKeyboardType();
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO:
				return getKeyboardTypeExtraInfo();
			case PlatformPackage.KEYBOARD__FAST_TEXT_INPUT:
				return isFastTextInput();
			case PlatformPackage.KEYBOARD__EASY_TEXT_INPUT:
				return isEasyTextInput();
			case PlatformPackage.KEYBOARD__HARDKEYS:
				return getHardkeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE:
				setKeyboardType((KeyboardType)newValue);
				return;
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO:
				setKeyboardTypeExtraInfo((String)newValue);
				return;
			case PlatformPackage.KEYBOARD__FAST_TEXT_INPUT:
				setFastTextInput((Boolean)newValue);
				return;
			case PlatformPackage.KEYBOARD__EASY_TEXT_INPUT:
				setEasyTextInput((Boolean)newValue);
				return;
			case PlatformPackage.KEYBOARD__HARDKEYS:
				getHardkeys().clear();
				getHardkeys().addAll((Collection<? extends Hardkey>)newValue);
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
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE:
				setKeyboardType(KEYBOARD_TYPE_EDEFAULT);
				return;
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO:
				setKeyboardTypeExtraInfo(KEYBOARD_TYPE_EXTRA_INFO_EDEFAULT);
				return;
			case PlatformPackage.KEYBOARD__FAST_TEXT_INPUT:
				setFastTextInput(FAST_TEXT_INPUT_EDEFAULT);
				return;
			case PlatformPackage.KEYBOARD__EASY_TEXT_INPUT:
				setEasyTextInput(EASY_TEXT_INPUT_EDEFAULT);
				return;
			case PlatformPackage.KEYBOARD__HARDKEYS:
				getHardkeys().clear();
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
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE:
				return keyboardType != KEYBOARD_TYPE_EDEFAULT;
			case PlatformPackage.KEYBOARD__KEYBOARD_TYPE_EXTRA_INFO:
				return KEYBOARD_TYPE_EXTRA_INFO_EDEFAULT == null ? keyboardTypeExtraInfo != null : !KEYBOARD_TYPE_EXTRA_INFO_EDEFAULT.equals(keyboardTypeExtraInfo);
			case PlatformPackage.KEYBOARD__FAST_TEXT_INPUT:
				return fastTextInput != FAST_TEXT_INPUT_EDEFAULT;
			case PlatformPackage.KEYBOARD__EASY_TEXT_INPUT:
				return easyTextInput != EASY_TEXT_INPUT_EDEFAULT;
			case PlatformPackage.KEYBOARD__HARDKEYS:
				return hardkeys != null && !hardkeys.isEmpty();
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
		result.append(" (keyboardType: ");
		result.append(keyboardType);
		result.append(", keyboardTypeExtraInfo: ");
		result.append(keyboardTypeExtraInfo);
		result.append(", fastTextInput: ");
		result.append(fastTextInput);
		result.append(", easyTextInput: ");
		result.append(easyTextInput);
		result.append(')');
		return result.toString();
	}

} //KeyboardImpl
