/**
 */
package org.json.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Json Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.json.json.ArrayJsonQuestion#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.json.json.JsonPackage#getArrayJsonQuestion()
 * @model
 * @generated
 */
public interface ArrayJsonQuestion extends EObject
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' containment reference list.
   * The list contents are of type {@link org.json.json.JsonQuestion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' containment reference list.
   * @see org.json.json.JsonPackage#getArrayJsonQuestion_Question()
   * @model containment="true"
   * @generated
   */
  EList<JsonQuestion> getQuestion();

} // ArrayJsonQuestion
