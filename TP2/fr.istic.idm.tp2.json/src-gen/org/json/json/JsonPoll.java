/**
 */
package org.json.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.json.json.JsonPoll#getName <em>Name</em>}</li>
 *   <li>{@link org.json.json.JsonPoll#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.json.json.JsonPackage#getJsonPoll()
 * @model
 * @generated
 */
public interface JsonPoll extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.json.json.JsonPackage#getJsonPoll_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.json.json.JsonPoll#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
   * The list contents are of type {@link org.json.json.ArrayJsonQuestion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questions</em>' containment reference list.
   * @see org.json.json.JsonPackage#getJsonPoll_Questions()
   * @model containment="true"
   * @generated
   */
  EList<ArrayJsonQuestion> getQuestions();

} // JsonPoll
