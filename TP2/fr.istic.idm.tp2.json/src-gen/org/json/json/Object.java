/**
 */
package org.json.json;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.json.json.Object#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.json.json.JsonPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Value
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.json.json.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.json.json.JsonPackage#getObject_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Object
