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
 * A representation of the model object '<em><b>Hardkey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Hardkey#getButtonSymbol <em>Button Symbol</em>}</li>
 *   <li>{@link platform.Hardkey#getButtonColor <em>Button Color</em>}</li>
 *   <li>{@link platform.Hardkey#getButtonSize <em>Button Size</em>}</li>
 *   <li>{@link platform.Hardkey#getHardkeyType <em>Hardkey Type</em>}</li>
 *   <li>{@link platform.Hardkey#isConfigurable <em>Configurable</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getHardkey()
 * @model
 * @generated
 */
public interface Hardkey extends TactileInputDevice {
	/**
	 * Returns the value of the '<em><b>Button Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Symbol</em>' attribute.
	 * @see #setButtonSymbol(String)
	 * @see platform.PlatformPackage#getHardkey_ButtonSymbol()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Hardkey!buttonSymbol'"
	 * @generated
	 */
	String getButtonSymbol();

	/**
	 * Sets the value of the '{@link platform.Hardkey#getButtonSymbol <em>Button Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Symbol</em>' attribute.
	 * @see #getButtonSymbol()
	 * @generated
	 */
	void setButtonSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Button Color</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Color</em>' attribute.
	 * @see #setButtonColor(String)
	 * @see platform.PlatformPackage#getHardkey_ButtonColor()
	 * @model default=""
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Hardkey!buttonColor'"
	 * @generated
	 */
	String getButtonColor();

	/**
	 * Sets the value of the '{@link platform.Hardkey#getButtonColor <em>Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Color</em>' attribute.
	 * @see #getButtonColor()
	 * @generated
	 */
	void setButtonColor(String value);

	/**
	 * Returns the value of the '<em><b>Button Size</b></em>' attribute.
	 * The default value is <code>"middle"</code>.
	 * The literals are from the enumeration {@link platform.SizeEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Size</em>' attribute.
	 * @see platform.SizeEvaluation
	 * @see #setButtonSize(SizeEvaluation)
	 * @see platform.PlatformPackage#getHardkey_ButtonSize()
	 * @model default="middle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Hardkey!buttonSize'"
	 * @generated
	 */
	SizeEvaluation getButtonSize();

	/**
	 * Sets the value of the '{@link platform.Hardkey#getButtonSize <em>Button Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Size</em>' attribute.
	 * @see platform.SizeEvaluation
	 * @see #getButtonSize()
	 * @generated
	 */
	void setButtonSize(SizeEvaluation value);

	/**
	 * Returns the value of the '<em><b>Hardkey Type</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.HardkeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardkey Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardkey Type</em>' attribute.
	 * @see platform.HardkeyType
	 * @see #setHardkeyType(HardkeyType)
	 * @see platform.PlatformPackage#getHardkey_HardkeyType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Hardkey!hardkeyType'"
	 * @generated
	 */
	HardkeyType getHardkeyType();

	/**
	 * Sets the value of the '{@link platform.Hardkey#getHardkeyType <em>Hardkey Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardkey Type</em>' attribute.
	 * @see platform.HardkeyType
	 * @see #getHardkeyType()
	 * @generated
	 */
	void setHardkeyType(HardkeyType value);

	/**
	 * Returns the value of the '<em><b>Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurable</em>' attribute.
	 * @see #setConfigurable(boolean)
	 * @see platform.PlatformPackage#getHardkey_Configurable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Hardkey!configurable'"
	 * @generated
	 */
	boolean isConfigurable();

	/**
	 * Sets the value of the '{@link platform.Hardkey#isConfigurable <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable</em>' attribute.
	 * @see #isConfigurable()
	 * @generated
	 */
	void setConfigurable(boolean value);

} // Hardkey
