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
 * A representation of the model object '<em><b>Lighting Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.LightingDevice#getLightningType <em>Lightning Type</em>}</li>
 *   <li>{@link platform.LightingDevice#getLightSize <em>Light Size</em>}</li>
 *   <li>{@link platform.LightingDevice#isMultiColorConfigurable <em>Multi Color Configurable</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getLightingDevice()
 * @model
 * @generated
 */
public interface LightingDevice extends VisualOutputDevice {
	/**
	 * Returns the value of the '<em><b>Lightning Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lightning Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lightning Type</em>' attribute.
	 * @see #setLightningType(String)
	 * @see platform.PlatformPackage#getLightingDevice_LightningType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!LightingDevice!lightningType'"
	 * @generated
	 */
	String getLightningType();

	/**
	 * Sets the value of the '{@link platform.LightingDevice#getLightningType <em>Lightning Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lightning Type</em>' attribute.
	 * @see #getLightningType()
	 * @generated
	 */
	void setLightningType(String value);

	/**
	 * Returns the value of the '<em><b>Light Size</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.SizeEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Size</em>' attribute.
	 * @see platform.SizeEvaluation
	 * @see #setLightSize(SizeEvaluation)
	 * @see platform.PlatformPackage#getLightingDevice_LightSize()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!LightingDevice!lightSize'"
	 * @generated
	 */
	SizeEvaluation getLightSize();

	/**
	 * Sets the value of the '{@link platform.LightingDevice#getLightSize <em>Light Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Size</em>' attribute.
	 * @see platform.SizeEvaluation
	 * @see #getLightSize()
	 * @generated
	 */
	void setLightSize(SizeEvaluation value);

	/**
	 * Returns the value of the '<em><b>Multi Color Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Color Configurable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Color Configurable</em>' attribute.
	 * @see #setMultiColorConfigurable(boolean)
	 * @see platform.PlatformPackage#getLightingDevice_MultiColorConfigurable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!LightingDevice!multiColorConfigurable'"
	 * @generated
	 */
	boolean isMultiColorConfigurable();

	/**
	 * Sets the value of the '{@link platform.LightingDevice#isMultiColorConfigurable <em>Multi Color Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Color Configurable</em>' attribute.
	 * @see #isMultiColorConfigurable()
	 * @generated
	 */
	void setMultiColorConfigurable(boolean value);

} // LightingDevice
