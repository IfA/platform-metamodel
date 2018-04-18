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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Keyboard#getKeyboardType <em>Keyboard Type</em>}</li>
 *   <li>{@link platform.Keyboard#getKeyboardTypeExtraInfo <em>Keyboard Type Extra Info</em>}</li>
 *   <li>{@link platform.Keyboard#isFastTextInput <em>Fast Text Input</em>}</li>
 *   <li>{@link platform.Keyboard#isEasyTextInput <em>Easy Text Input</em>}</li>
 *   <li>{@link platform.Keyboard#getHardkeys <em>Hardkeys</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getKeyboard()
 * @model
 * @generated
 */
public interface Keyboard extends ComplexRessource {
	/**
	 * Returns the value of the '<em><b>Keyboard Type</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.KeyboardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard Type</em>' attribute.
	 * @see platform.KeyboardType
	 * @see #setKeyboardType(KeyboardType)
	 * @see platform.PlatformPackage#getKeyboard_KeyboardType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Keyboard!keyboardType'"
	 * @generated
	 */
	KeyboardType getKeyboardType();

	/**
	 * Sets the value of the '{@link platform.Keyboard#getKeyboardType <em>Keyboard Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyboard Type</em>' attribute.
	 * @see platform.KeyboardType
	 * @see #getKeyboardType()
	 * @generated
	 */
	void setKeyboardType(KeyboardType value);

	/**
	 * Returns the value of the '<em><b>Keyboard Type Extra Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard Type Extra Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard Type Extra Info</em>' attribute.
	 * @see #setKeyboardTypeExtraInfo(String)
	 * @see platform.PlatformPackage#getKeyboard_KeyboardTypeExtraInfo()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Keyboard!keyboardTypeExtraInfo'"
	 * @generated
	 */
	String getKeyboardTypeExtraInfo();

	/**
	 * Sets the value of the '{@link platform.Keyboard#getKeyboardTypeExtraInfo <em>Keyboard Type Extra Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyboard Type Extra Info</em>' attribute.
	 * @see #getKeyboardTypeExtraInfo()
	 * @generated
	 */
	void setKeyboardTypeExtraInfo(String value);

	/**
	 * Returns the value of the '<em><b>Fast Text Input</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fast Text Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fast Text Input</em>' attribute.
	 * @see #setFastTextInput(boolean)
	 * @see platform.PlatformPackage#getKeyboard_FastTextInput()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Keyboard!fastTextInput'"
	 * @generated
	 */
	boolean isFastTextInput();

	/**
	 * Sets the value of the '{@link platform.Keyboard#isFastTextInput <em>Fast Text Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast Text Input</em>' attribute.
	 * @see #isFastTextInput()
	 * @generated
	 */
	void setFastTextInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Easy Text Input</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Easy Text Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Easy Text Input</em>' attribute.
	 * @see #setEasyTextInput(boolean)
	 * @see platform.PlatformPackage#getKeyboard_EasyTextInput()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Keyboard!easyTextInput'"
	 * @generated
	 */
	boolean isEasyTextInput();

	/**
	 * Sets the value of the '{@link platform.Keyboard#isEasyTextInput <em>Easy Text Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Easy Text Input</em>' attribute.
	 * @see #isEasyTextInput()
	 * @generated
	 */
	void setEasyTextInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Hardkeys</b></em>' reference list.
	 * The list contents are of type {@link platform.Hardkey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardkeys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardkeys</em>' reference list.
	 * @see platform.PlatformPackage#getKeyboard_Hardkeys()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Keyboard!hardkeys'"
	 * @generated
	 */
	EList<Hardkey> getHardkeys();

} // Keyboard
