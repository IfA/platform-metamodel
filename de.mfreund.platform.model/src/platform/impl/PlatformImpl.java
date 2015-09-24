/**
 */
package platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import platform.GenericProperty;
import platform.Platform;
import platform.PlatformPackage;
import platform.PlatformType;
import platform.Ressource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.PlatformImpl#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link platform.impl.PlatformImpl#getPlatformId <em>Platform Id</em>}</li>
 *   <li>{@link platform.impl.PlatformImpl#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link platform.impl.PlatformImpl#getRessources <em>Ressources</em>}</li>
 *   <li>{@link platform.impl.PlatformImpl#getGenericProperty <em>Generic Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends MinimalEObjectImpl.Container implements Platform {
	/**
	 * The default value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String platformName = PLATFORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformId() <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformId()
	 * @generated
	 * @ordered
	 */
	protected static final int PLATFORM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlatformId() <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformId()
	 * @generated
	 * @ordered
	 */
	protected int platformId = PLATFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected static final PlatformType PLATFORM_TYPE_EDEFAULT = PlatformType.OTHER;

	/**
	 * The cached value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected PlatformType platformType = PLATFORM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressources;

	/**
	 * The cached value of the '{@link #getGenericProperty() <em>Generic Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericProperty> genericProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformName() {
		return platformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformName(String newPlatformName) {
		String oldPlatformName = platformName;
		platformName = newPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLATFORM__PLATFORM_NAME, oldPlatformName, platformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlatformId() {
		return platformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformId(int newPlatformId) {
		int oldPlatformId = platformId;
		platformId = newPlatformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLATFORM__PLATFORM_ID, oldPlatformId, platformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformType getPlatformType() {
		return platformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformType(PlatformType newPlatformType) {
		PlatformType oldPlatformType = platformType;
		platformType = newPlatformType == null ? PLATFORM_TYPE_EDEFAULT : newPlatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLATFORM__PLATFORM_TYPE, oldPlatformType, platformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessources() {
		if (ressources == null) {
			ressources = new EObjectResolvingEList<Ressource>(Ressource.class, this, PlatformPackage.PLATFORM__RESSOURCES);
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericProperty> getGenericProperty() {
		if (genericProperty == null) {
			genericProperty = new EObjectContainmentEList<GenericProperty>(GenericProperty.class, this, PlatformPackage.PLATFORM__GENERIC_PROPERTY);
		}
		return genericProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PLATFORM__GENERIC_PROPERTY:
				return ((InternalEList<?>)getGenericProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.PLATFORM__PLATFORM_NAME:
				return getPlatformName();
			case PlatformPackage.PLATFORM__PLATFORM_ID:
				return getPlatformId();
			case PlatformPackage.PLATFORM__PLATFORM_TYPE:
				return getPlatformType();
			case PlatformPackage.PLATFORM__RESSOURCES:
				return getRessources();
			case PlatformPackage.PLATFORM__GENERIC_PROPERTY:
				return getGenericProperty();
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
			case PlatformPackage.PLATFORM__PLATFORM_NAME:
				setPlatformName((String)newValue);
				return;
			case PlatformPackage.PLATFORM__PLATFORM_ID:
				setPlatformId((Integer)newValue);
				return;
			case PlatformPackage.PLATFORM__PLATFORM_TYPE:
				setPlatformType((PlatformType)newValue);
				return;
			case PlatformPackage.PLATFORM__RESSOURCES:
				getRessources().clear();
				getRessources().addAll((Collection<? extends Ressource>)newValue);
				return;
			case PlatformPackage.PLATFORM__GENERIC_PROPERTY:
				getGenericProperty().clear();
				getGenericProperty().addAll((Collection<? extends GenericProperty>)newValue);
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
			case PlatformPackage.PLATFORM__PLATFORM_NAME:
				setPlatformName(PLATFORM_NAME_EDEFAULT);
				return;
			case PlatformPackage.PLATFORM__PLATFORM_ID:
				setPlatformId(PLATFORM_ID_EDEFAULT);
				return;
			case PlatformPackage.PLATFORM__PLATFORM_TYPE:
				setPlatformType(PLATFORM_TYPE_EDEFAULT);
				return;
			case PlatformPackage.PLATFORM__RESSOURCES:
				getRessources().clear();
				return;
			case PlatformPackage.PLATFORM__GENERIC_PROPERTY:
				getGenericProperty().clear();
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
			case PlatformPackage.PLATFORM__PLATFORM_NAME:
				return PLATFORM_NAME_EDEFAULT == null ? platformName != null : !PLATFORM_NAME_EDEFAULT.equals(platformName);
			case PlatformPackage.PLATFORM__PLATFORM_ID:
				return platformId != PLATFORM_ID_EDEFAULT;
			case PlatformPackage.PLATFORM__PLATFORM_TYPE:
				return platformType != PLATFORM_TYPE_EDEFAULT;
			case PlatformPackage.PLATFORM__RESSOURCES:
				return ressources != null && !ressources.isEmpty();
			case PlatformPackage.PLATFORM__GENERIC_PROPERTY:
				return genericProperty != null && !genericProperty.isEmpty();
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
		result.append(" (platformName: ");
		result.append(platformName);
		result.append(", platformId: ");
		result.append(platformId);
		result.append(", platformType: ");
		result.append(platformType);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
