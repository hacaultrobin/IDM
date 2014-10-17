/**
 */
package fr.istic.idm.project.pollDsl;

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
 *   <li>{@link fr.istic.idm.project.pollDsl.PollSystem#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.project.pollDsl.PollDslPackage#getPollSystem()
 * @model
 * @generated
 */
public interface PollSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Polls</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.idm.project.pollDsl.Poll}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polls</em>' containment reference list.
   * @see fr.istic.idm.project.pollDsl.PollDslPackage#getPollSystem_Polls()
   * @model containment="true"
   * @generated
   */
  EList<Poll> getPolls();

} // PollSystem
