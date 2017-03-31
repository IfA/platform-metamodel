/**
 */
package platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import platform.PMbase;
import platform.Platform;
import platform.PlatformPackage;
import platform.Ressource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMbase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platform.impl.PMbaseImpl#getPlatformCollection <em>Platform Collection</em>}</li>
 *   <li>{@link platform.impl.PMbaseImpl#getRessourceCollection <em>Ressource Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PMbaseImpl extends MinimalEObjectImpl.Container implements PMbase {
	/**
	 * The cached value of the '{@link #getPlatformCollection() <em>Platform Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platformCollection;

	/**
	 * The cached value of the '{@link #getRessourceCollection() <em>Ressource Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressourceCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMbaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PMBASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Platform> getPlatformCollection() {
		if (platformCollection == null) {
			platformCollection = new EObjectContainmentEList<Platform>(Platform.class, this, PlatformPackage.PMBASE__PLATFORM_COLLECTION);
		}
		return platformCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessourceCollection() {
		if (ressourceCollection == null) {
			ressourceCollection = new EObjectContainmentEList<Ressource>(Ressource.class, this, PlatformPackage.PMBASE__RESSOURCE_COLLECTION);
		}
		return ressourceCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PMBASE__PLATFORM_COLLECTION:
				return ((InternalEList<?>)getPlatformCollection()).basicRemove(otherEnd, msgs);
			case PlatformPackage.PMBASE__RESSOURCE_COLLECTION:
				return ((InternalEList<?>)getRessourceCollection()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.PMBASE__PLATFORM_COLLECTION:
				return getPlatformCollection();
			case PlatformPackage.PMBASE__RESSOURCE_COLLECTION:
				return getRessourceCollection();
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
			case PlatformPackage.PMBASE__PLATFORM_COLLECTION:
				getPlatformCollection().clear();
				getPlatformCollection().addAll((Collection<? extends Platform>)newValue);
				return;
			case PlatformPackage.PMBASE__RESSOURCE_COLLECTION:
				getRessourceCollection().clear();
				getRessourceCollection().addAll((Collection<? extends Ressource>)newValue);
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
			case PlatformPackage.PMBASE__PLATFORM_COLLECTION:
				getPlatformCollection().clear();
				return;
			case PlatformPackage.PMBASE__RESSOURCE_COLLECTION:
				getRessourceCollection().clear();
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
			case PlatformPackage.PMBASE__PLATFORM_COLLECTION:
				return platformCollection != null && !platformCollection.isEmpty();
			case PlatformPackage.PMBASE__RESSOURCE_COLLECTION:
				return ressourceCollection != null && !ressourceCollection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PMbaseImpl
