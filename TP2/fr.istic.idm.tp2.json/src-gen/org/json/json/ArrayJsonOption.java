/**
 */
package org.json.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Json Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.json.json.ArrayJsonOption#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.json.json.JsonPackage#getArrayJsonOption()
 * @model
 * @generated
 */
public interface ArrayJsonOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' containment reference list.
   * The list contents are of type {@link org.json.json.JsonOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' containment reference list.
   * @see org.json.json.JsonPackage#getArrayJsonOption_Option()
   * @model containment="true"
   * @generated
   */
  EList<JsonOption> getOption();

} // ArrayJsonOption
