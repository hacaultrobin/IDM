/**
 */
package org.json.json;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Json Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.json.json.ArrayJsonPoll#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.json.json.JsonPackage#getArrayJsonPoll()
 * @model
 * @generated
 */
public interface ArrayJsonPoll extends JsonPollSystem
{
  /**
   * Returns the value of the '<em><b>Polls</b></em>' containment reference list.
   * The list contents are of type {@link org.json.json.JsonPoll}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polls</em>' containment reference list.
   * @see org.json.json.JsonPackage#getArrayJsonPoll_Polls()
   * @model containment="true"
   * @generated
   */
  EList<JsonPoll> getPolls();

} // ArrayJsonPoll
