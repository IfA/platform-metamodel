/**
 */
package platform;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mouse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platform.Mouse#getMouseSensibility <em>Mouse Sensibility</em>}</li>
 *   <li>{@link platform.Mouse#isUsableForTranspartentSurface <em>Usable For Transpartent Surface</em>}</li>
 *   <li>{@link platform.Mouse#isUsableForSmoothSurface <em>Usable For Smooth Surface</em>}</li>
 *   <li>{@link platform.Mouse#getMainPointingDevice <em>Main Pointing Device</em>}</li>
 *   <li>{@link platform.Mouse#getLeftMousebutton <em>Left Mousebutton</em>}</li>
 *   <li>{@link platform.Mouse#getRightMousebutton <em>Right Mousebutton</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getMouse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='leftUnequalRight'"
 * @generated
 */
public interface Mouse extends ComplexRessource {
	/**
	 * Returns the value of the '<em><b>Mouse Sensibility</b></em>' attribute.
	 * The default value is <code>"other"</code>.
	 * The literals are from the enumeration {@link platform.Sensibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse Sensibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse Sensibility</em>' attribute.
	 * @see platform.Sensibility
	 * @see #setMouseSensibility(Sensibility)
	 * @see platform.PlatformPackage#getMouse_MouseSensibility()
	 * @model default="other"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Mouse!mouseSensibility'"
	 * @generated
	 */
	Sensibility getMouseSensibility();

	/**
	 * Sets the value of the '{@link platform.Mouse#getMouseSensibility <em>Mouse Sensibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse Sensibility</em>' attribute.
	 * @see platform.Sensibility
	 * @see #getMouseSensibility()
	 * @generated
	 */
	void setMouseSensibility(Sensibility value);

	/**
	 * Returns the value of the '<em><b>Usable For Transpartent Surface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable For Transpartent Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable For Transpartent Surface</em>' attribute.
	 * @see #setUsableForTranspartentSurface(boolean)
	 * @see platform.PlatformPackage#getMouse_UsableForTranspartentSurface()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Mouse!usableForTranspartentSurface'"
	 * @generated
	 */
	boolean isUsableForTranspartentSurface();

	/**
	 * Sets the value of the '{@link platform.Mouse#isUsableForTranspartentSurface <em>Usable For Transpartent Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable For Transpartent Surface</em>' attribute.
	 * @see #isUsableForTranspartentSurface()
	 * @generated
	 */
	void setUsableForTranspartentSurface(boolean value);

	/**
	 * Returns the value of the '<em><b>Usable For Smooth Surface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable For Smooth Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable For Smooth Surface</em>' attribute.
	 * @see #setUsableForSmoothSurface(boolean)
	 * @see platform.PlatformPackage#getMouse_UsableForSmoothSurface()
	 * @model default="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Mouse!usableForSmoothSurface'"
	 * @generated
	 */
	boolean isUsableForSmoothSurface();

	/**
	 * Sets the value of the '{@link platform.Mouse#isUsableForSmoothSurface <em>Usable For Smooth Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable For Smooth Surface</em>' attribute.
	 * @see #isUsableForSmoothSurface()
	 * @generated
	 */
	void setUsableForSmoothSurface(boolean value);

	/**
	 * Returns the value of the '<em><b>Main Pointing Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Pointing Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Pointing Device</em>' reference.
	 * @see #setMainPointingDevice(PointingDevice)
	 * @see platform.PlatformPackage#getMouse_MainPointingDevice()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Mouse!mainPointingDevice'"
	 * @generated
	 */
	PointingDevice getMainPointingDevice();

	/**
	 * Sets the value of the '{@link platform.Mouse#getMainPointingDevice <em>Main Pointing Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Pointing Device</em>' reference.
	 * @see #getMainPointingDevice()
	 * @generated
	 */
	void setMainPointingDevice(PointingDevice value);

	/**
	 * Returns the value of the '<em><b>Left Mousebutton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Mousebutton</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Mousebutton</em>' reference.
	 * @see #setLeftMousebutton(Hardkey)
	 * @see platform.PlatformPackage#getMouse_LeftMousebutton()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Mouse!leftMousebutton'"
	 * @generated
	 */
	Hardkey getLeftMousebutton();

	/**
	 * Sets the value of the '{@link platform.Mouse#getLeftMousebutton <em>Left Mousebutton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Mousebutton</em>' reference.
	 * @see #getLeftMousebutton()
	 * @generated
	 */
	void setLeftMousebutton(Hardkey value);

	/**
	 * Returns the value of the '<em><b>Right Mousebutton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Mousebutton</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Mousebutton</em>' reference.
	 * @see #setRightMousebutton(Hardkey)
	 * @see platform.PlatformPackage#getMouse_RightMousebutton()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://ifa/et/tu/dresden/platform/metamodel!Mouse!rightMousebutton'"
	 * @generated
	 */
	Hardkey getRightMousebutton();

	/**
	 * Sets the value of the '{@link platform.Mouse#getRightMousebutton <em>Right Mousebutton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Mousebutton</em>' reference.
	 * @see #getRightMousebutton()
	 * @generated
	 */
	void setRightMousebutton(Hardkey value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv leftUnequalRight:\n *   let severity : Integer[1] = \'Mouse::leftUnequalRight\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : OclAny[1] = self.leftMousebutton <> self.rightMousebutton\n *       in\n *         \'Mouse::leftUnequalRight\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%platform.PlatformTables%>.STR_Mouse_c_c_leftUnequalRight);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%platform.PlatformTables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@Thrown\052/ <%platform.Hardkey%> leftMousebutton = this.getLeftMousebutton();\n        final /*@Thrown\052/ <%platform.Hardkey%> rightMousebutton = this.getRightMousebutton();\n        final /*@Thrown\052/ boolean status = !leftMousebutton.equals(rightMousebutton);\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%platform.PlatformTables%>.STR_Mouse_c_c_leftUnequalRight, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%platform.PlatformTables%>.INT_0).booleanValue();\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean leftUnequalRight(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Mouse
