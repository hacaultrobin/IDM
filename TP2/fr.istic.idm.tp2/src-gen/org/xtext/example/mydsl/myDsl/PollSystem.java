/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PollSystem#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPollSystem()
 * @model
 * @generated
 */
public interface PollSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Polls</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Poll}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polls</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPollSystem_Polls()
   * @model containment="true"
   * @generated
   */
  EList<Poll> getPolls();

} // PollSystem
