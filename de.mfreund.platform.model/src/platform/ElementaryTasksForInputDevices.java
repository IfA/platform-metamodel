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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Tasks For Input Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.ElementaryTasksForInputDevices#getFastPointingCapable <em>Fast Pointing Capable</em>}</li>
 *   <li>{@link platform.ElementaryTasksForInputDevices#getAccuratePointingCapable <em>Accurate Pointing Capable</em>}</li>
 *   <li>{@link platform.ElementaryTasksForInputDevices#getSelectingCapable <em>Selecting Capable</em>}</li>
 *   <li>{@link platform.ElementaryTasksForInputDevices#getDrawingCapable <em>Drawing Capable</em>}</li>
 *   <li>{@link platform.ElementaryTasksForInputDevices#getFastDrawingCapable <em>Fast Drawing Capable</em>}</li>
 *   <li>{@link platform.ElementaryTasksForInputDevices#getAlphanumericCapable <em>Alphanumeric Capable</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getElementaryTasksForInputDevices()
 * @model abstract="true"
 * @generated
 */
public interface ElementaryTasksForInputDevices extends EObject {
	/**
	 * Returns the value of the '<em><b>Fast Pointing Capable</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.ElementaryTaskEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fast Pointing Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fast Pointing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #setFastPointingCapable(ElementaryTaskEvaluation)
	 * @see platform.PlatformPackage#getElementaryTasksForInputDevices_FastPointingCapable()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ElementaryTasksForInputDevices!fastPointingCapable'"
	 * @generated
	 */
	ElementaryTaskEvaluation getFastPointingCapable();

	/**
	 * Sets the value of the '{@link platform.ElementaryTasksForInputDevices#getFastPointingCapable <em>Fast Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast Pointing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #getFastPointingCapable()
	 * @generated
	 */
	void setFastPointingCapable(ElementaryTaskEvaluation value);

	/**
	 * Returns the value of the '<em><b>Accurate Pointing Capable</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.ElementaryTaskEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accurate Pointing Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accurate Pointing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #setAccuratePointingCapable(ElementaryTaskEvaluation)
	 * @see platform.PlatformPackage#getElementaryTasksForInputDevices_AccuratePointingCapable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ElementaryTasksForInputDevices!accuratePointingCapable'"
	 * @generated
	 */
	ElementaryTaskEvaluation getAccuratePointingCapable();

	/**
	 * Sets the value of the '{@link platform.ElementaryTasksForInputDevices#getAccuratePointingCapable <em>Accurate Pointing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accurate Pointing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #getAccuratePointingCapable()
	 * @generated
	 */
	void setAccuratePointingCapable(ElementaryTaskEvaluation value);

	/**
	 * Returns the value of the '<em><b>Selecting Capable</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.ElementaryTaskEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selecting Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selecting Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #setSelectingCapable(ElementaryTaskEvaluation)
	 * @see platform.PlatformPackage#getElementaryTasksForInputDevices_SelectingCapable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ElementaryTasksForInputDevices!selectingCapable'"
	 * @generated
	 */
	ElementaryTaskEvaluation getSelectingCapable();

	/**
	 * Sets the value of the '{@link platform.ElementaryTasksForInputDevices#getSelectingCapable <em>Selecting Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selecting Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #getSelectingCapable()
	 * @generated
	 */
	void setSelectingCapable(ElementaryTaskEvaluation value);

	/**
	 * Returns the value of the '<em><b>Drawing Capable</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.ElementaryTaskEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawing Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #setDrawingCapable(ElementaryTaskEvaluation)
	 * @see platform.PlatformPackage#getElementaryTasksForInputDevices_DrawingCapable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ElementaryTasksForInputDevices!drawingCapable'"
	 * @generated
	 */
	ElementaryTaskEvaluation getDrawingCapable();

	/**
	 * Sets the value of the '{@link platform.ElementaryTasksForInputDevices#getDrawingCapable <em>Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #getDrawingCapable()
	 * @generated
	 */
	void setDrawingCapable(ElementaryTaskEvaluation value);

	/**
	 * Returns the value of the '<em><b>Fast Drawing Capable</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.ElementaryTaskEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fast Drawing Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fast Drawing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #setFastDrawingCapable(ElementaryTaskEvaluation)
	 * @see platform.PlatformPackage#getElementaryTasksForInputDevices_FastDrawingCapable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ElementaryTasksForInputDevices!fastDrawingCapable'"
	 * @generated
	 */
	ElementaryTaskEvaluation getFastDrawingCapable();

	/**
	 * Sets the value of the '{@link platform.ElementaryTasksForInputDevices#getFastDrawingCapable <em>Fast Drawing Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast Drawing Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #getFastDrawingCapable()
	 * @generated
	 */
	void setFastDrawingCapable(ElementaryTaskEvaluation value);

	/**
	 * Returns the value of the '<em><b>Alphanumeric Capable</b></em>' attribute.
	 * The literals are from the enumeration {@link platform.ElementaryTaskEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphanumeric Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphanumeric Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #setAlphanumericCapable(ElementaryTaskEvaluation)
	 * @see platform.PlatformPackage#getElementaryTasksForInputDevices_AlphanumericCapable()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!ElementaryTasksForInputDevices!alphanumericCapable'"
	 * @generated
	 */
	ElementaryTaskEvaluation getAlphanumericCapable();

	/**
	 * Sets the value of the '{@link platform.ElementaryTasksForInputDevices#getAlphanumericCapable <em>Alphanumeric Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphanumeric Capable</em>' attribute.
	 * @see platform.ElementaryTaskEvaluation
	 * @see #getAlphanumericCapable()
	 * @generated
	 */
	void setAlphanumericCapable(ElementaryTaskEvaluation value);

} // ElementaryTasksForInputDevices
