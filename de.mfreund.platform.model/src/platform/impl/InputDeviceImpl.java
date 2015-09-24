/**
 */
package platform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platform.ElementaryTaskEvaluation;
import platform.ElementaryTasksForInputDevices;
import platform.InputDevice;
import platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.InputDeviceImpl#getFastPointingCapable <em>Fast Pointing Capable</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#getAccuratePointingCapable <em>Accurate Pointing Capable</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#getSelectingCapable <em>Selecting Capable</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#getDrawingCapable <em>Drawing Capable</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#getFastDrawingCapable <em>Fast Drawing Capable</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#getAlphanumericCapable <em>Alphanumeric Capable</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#isSafeForUnwantedActions <em>Safe For Unwanted Actions</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#isUsableWithGloves <em>Usable With Gloves</em>}</li>
 *   <li>{@link platform.impl.InputDeviceImpl#isUsableWithOneHand <em>Usable With One Hand</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputDeviceImpl extends InteractionRessourceImpl implements InputDevice {
	/**
	 * The default value of the '{@link #getFastPointingCapable() <em>Fast Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastPointingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation FAST_POINTING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getFastPointingCapable() <em>Fast Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastPointingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation fastPointingCapable = FAST_POINTING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuratePointingCapable() <em>Accurate Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuratePointingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation ACCURATE_POINTING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getAccuratePointingCapable() <em>Accurate Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuratePointingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation accuratePointingCapable = ACCURATE_POINTING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectingCapable() <em>Selecting Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation SELECTING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getSelectingCapable() <em>Selecting Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation selectingCapable = SELECTING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrawingCapable() <em>Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation DRAWING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getDrawingCapable() <em>Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation drawingCapable = DRAWING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFastDrawingCapable() <em>Fast Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation FAST_DRAWING_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getFastDrawingCapable() <em>Fast Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastDrawingCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation fastDrawingCapable = FAST_DRAWING_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlphanumericCapable() <em>Alphanumeric Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphanumericCapable()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryTaskEvaluation ALPHANUMERIC_CAPABLE_EDEFAULT = ElementaryTaskEvaluation.OTHER;

	/**
	 * The cached value of the '{@link #getAlphanumericCapable() <em>Alphanumeric Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphanumericCapable()
	 * @generated
	 * @ordered
	 */
	protected ElementaryTaskEvaluation alphanumericCapable = ALPHANUMERIC_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSafeForUnwantedActions() <em>Safe For Unwanted Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeForUnwantedActions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_FOR_UNWANTED_ACTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafeForUnwantedActions() <em>Safe For Unwanted Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeForUnwantedActions()
	 * @generated
	 * @ordered
	 */
	protected boolean safeForUnwantedActions = SAFE_FOR_UNWANTED_ACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsableWithGloves() <em>Usable With Gloves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableWithGloves()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_WITH_GLOVES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsableWithGloves() <em>Usable With Gloves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableWithGloves()
	 * @generated
	 * @ordered
	 */
	protected boolean usableWithGloves = USABLE_WITH_GLOVES_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsableWithOneHand() <em>Usable With One Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableWithOneHand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_WITH_ONE_HAND_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUsableWithOneHand() <em>Usable With One Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsableWithOneHand()
	 * @generated
	 * @ordered
	 */
	protected boolean usableWithOneHand = USABLE_WITH_ONE_HAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.INPUT_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getFastPointingCapable() {
		return fastPointingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastPointingCapable(ElementaryTaskEvaluation newFastPointingCapable) {
		ElementaryTaskEvaluation oldFastPointingCapable = fastPointingCapable;
		fastPointingCapable = newFastPointingCapable == null ? FAST_POINTING_CAPABLE_EDEFAULT : newFastPointingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE, oldFastPointingCapable, fastPointingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getAccuratePointingCapable() {
		return accuratePointingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuratePointingCapable(ElementaryTaskEvaluation newAccuratePointingCapable) {
		ElementaryTaskEvaluation oldAccuratePointingCapable = accuratePointingCapable;
		accuratePointingCapable = newAccuratePointingCapable == null ? ACCURATE_POINTING_CAPABLE_EDEFAULT : newAccuratePointingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE, oldAccuratePointingCapable, accuratePointingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getSelectingCapable() {
		return selectingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectingCapable(ElementaryTaskEvaluation newSelectingCapable) {
		ElementaryTaskEvaluation oldSelectingCapable = selectingCapable;
		selectingCapable = newSelectingCapable == null ? SELECTING_CAPABLE_EDEFAULT : newSelectingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE, oldSelectingCapable, selectingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getDrawingCapable() {
		return drawingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingCapable(ElementaryTaskEvaluation newDrawingCapable) {
		ElementaryTaskEvaluation oldDrawingCapable = drawingCapable;
		drawingCapable = newDrawingCapable == null ? DRAWING_CAPABLE_EDEFAULT : newDrawingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE, oldDrawingCapable, drawingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getFastDrawingCapable() {
		return fastDrawingCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastDrawingCapable(ElementaryTaskEvaluation newFastDrawingCapable) {
		ElementaryTaskEvaluation oldFastDrawingCapable = fastDrawingCapable;
		fastDrawingCapable = newFastDrawingCapable == null ? FAST_DRAWING_CAPABLE_EDEFAULT : newFastDrawingCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE, oldFastDrawingCapable, fastDrawingCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTaskEvaluation getAlphanumericCapable() {
		return alphanumericCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphanumericCapable(ElementaryTaskEvaluation newAlphanumericCapable) {
		ElementaryTaskEvaluation oldAlphanumericCapable = alphanumericCapable;
		alphanumericCapable = newAlphanumericCapable == null ? ALPHANUMERIC_CAPABLE_EDEFAULT : newAlphanumericCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE, oldAlphanumericCapable, alphanumericCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafeForUnwantedActions() {
		return safeForUnwantedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeForUnwantedActions(boolean newSafeForUnwantedActions) {
		boolean oldSafeForUnwantedActions = safeForUnwantedActions;
		safeForUnwantedActions = newSafeForUnwantedActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS, oldSafeForUnwantedActions, safeForUnwantedActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsableWithGloves() {
		return usableWithGloves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsableWithGloves(boolean newUsableWithGloves) {
		boolean oldUsableWithGloves = usableWithGloves;
		usableWithGloves = newUsableWithGloves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__USABLE_WITH_GLOVES, oldUsableWithGloves, usableWithGloves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsableWithOneHand() {
		return usableWithOneHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsableWithOneHand(boolean newUsableWithOneHand) {
		boolean oldUsableWithOneHand = usableWithOneHand;
		usableWithOneHand = newUsableWithOneHand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INPUT_DEVICE__USABLE_WITH_ONE_HAND, oldUsableWithOneHand, usableWithOneHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE:
				return getFastPointingCapable();
			case PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE:
				return getAccuratePointingCapable();
			case PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE:
				return getSelectingCapable();
			case PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE:
				return getDrawingCapable();
			case PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE:
				return getFastDrawingCapable();
			case PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE:
				return getAlphanumericCapable();
			case PlatformPackage.INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS:
				return isSafeForUnwantedActions();
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_GLOVES:
				return isUsableWithGloves();
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_ONE_HAND:
				return isUsableWithOneHand();
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
			case PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE:
				setFastPointingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE:
				setAccuratePointingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE:
				setSelectingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE:
				setDrawingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE:
				setFastDrawingCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE:
				setAlphanumericCapable((ElementaryTaskEvaluation)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS:
				setSafeForUnwantedActions((Boolean)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_GLOVES:
				setUsableWithGloves((Boolean)newValue);
				return;
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_ONE_HAND:
				setUsableWithOneHand((Boolean)newValue);
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
			case PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE:
				setFastPointingCapable(FAST_POINTING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE:
				setAccuratePointingCapable(ACCURATE_POINTING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE:
				setSelectingCapable(SELECTING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE:
				setDrawingCapable(DRAWING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE:
				setFastDrawingCapable(FAST_DRAWING_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE:
				setAlphanumericCapable(ALPHANUMERIC_CAPABLE_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS:
				setSafeForUnwantedActions(SAFE_FOR_UNWANTED_ACTIONS_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_GLOVES:
				setUsableWithGloves(USABLE_WITH_GLOVES_EDEFAULT);
				return;
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_ONE_HAND:
				setUsableWithOneHand(USABLE_WITH_ONE_HAND_EDEFAULT);
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
			case PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE:
				return fastPointingCapable != FAST_POINTING_CAPABLE_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE:
				return accuratePointingCapable != ACCURATE_POINTING_CAPABLE_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE:
				return selectingCapable != SELECTING_CAPABLE_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE:
				return drawingCapable != DRAWING_CAPABLE_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE:
				return fastDrawingCapable != FAST_DRAWING_CAPABLE_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE:
				return alphanumericCapable != ALPHANUMERIC_CAPABLE_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__SAFE_FOR_UNWANTED_ACTIONS:
				return safeForUnwantedActions != SAFE_FOR_UNWANTED_ACTIONS_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_GLOVES:
				return usableWithGloves != USABLE_WITH_GLOVES_EDEFAULT;
			case PlatformPackage.INPUT_DEVICE__USABLE_WITH_ONE_HAND:
				return usableWithOneHand != USABLE_WITH_ONE_HAND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementaryTasksForInputDevices.class) {
			switch (derivedFeatureID) {
				case PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE: return PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE;
				case PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE: return PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE;
				case PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE: return PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE;
				case PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE: return PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE;
				case PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE: return PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE;
				case PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE: return PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementaryTasksForInputDevices.class) {
			switch (baseFeatureID) {
				case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_POINTING_CAPABLE: return PlatformPackage.INPUT_DEVICE__FAST_POINTING_CAPABLE;
				case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ACCURATE_POINTING_CAPABLE: return PlatformPackage.INPUT_DEVICE__ACCURATE_POINTING_CAPABLE;
				case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__SELECTING_CAPABLE: return PlatformPackage.INPUT_DEVICE__SELECTING_CAPABLE;
				case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__DRAWING_CAPABLE: return PlatformPackage.INPUT_DEVICE__DRAWING_CAPABLE;
				case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__FAST_DRAWING_CAPABLE: return PlatformPackage.INPUT_DEVICE__FAST_DRAWING_CAPABLE;
				case PlatformPackage.ELEMENTARY_TASKS_FOR_INPUT_DEVICES__ALPHANUMERIC_CAPABLE: return PlatformPackage.INPUT_DEVICE__ALPHANUMERIC_CAPABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (fastPointingCapable: ");
		result.append(fastPointingCapable);
		result.append(", accuratePointingCapable: ");
		result.append(accuratePointingCapable);
		result.append(", selectingCapable: ");
		result.append(selectingCapable);
		result.append(", drawingCapable: ");
		result.append(drawingCapable);
		result.append(", fastDrawingCapable: ");
		result.append(fastDrawingCapable);
		result.append(", alphanumericCapable: ");
		result.append(alphanumericCapable);
		result.append(", safeForUnwantedActions: ");
		result.append(safeForUnwantedActions);
		result.append(", usableWithGloves: ");
		result.append(usableWithGloves);
		result.append(", usableWithOneHand: ");
		result.append(usableWithOneHand);
		result.append(')');
		return result.toString();
	}

} //InputDeviceImpl
