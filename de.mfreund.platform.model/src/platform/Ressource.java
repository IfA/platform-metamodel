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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Ressource#getRessourceName <em>Ressource Name</em>}</li>
 *   <li>{@link platform.Ressource#getGenericProperty <em>Generic Property</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getRessource()
 * @model abstract="true"
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource Name</em>' attribute.
	 * @see #setRessourceName(String)
	 * @see platform.PlatformPackage#getRessource_RessourceName()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Ressource!ressourceName'"
	 * @generated
	 */
	String getRessourceName();

	/**
	 * Sets the value of the '{@link platform.Ressource#getRessourceName <em>Ressource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource Name</em>' attribute.
	 * @see #getRessourceName()
	 * @generated
	 */
	void setRessourceName(String value);

	/**
	 * Returns the value of the '<em><b>Generic Property</b></em>' containment reference list.
	 * The list contents are of type {@link platform.GenericProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Property</em>' containment reference list.
	 * @see platform.PlatformPackage#getRessource_GenericProperty()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Ressource!genericProperty'"
	 * @generated
	 */
	EList<GenericProperty> getGenericProperty();

} // Ressource
