/**
 */
package fr.istic.idm.project.pollDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.idm.project.pollDsl.Option#getId <em>Id</em>}</li>
 *   <li>{@link fr.istic.idm.project.pollDsl.Option#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.project.pollDsl.PollDslPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see fr.istic.idm.project.pollDsl.PollDslPackage#getOption_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.istic.idm.project.pollDsl.Option#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see fr.istic.idm.project.pollDsl.PollDslPackage#getOption_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link fr.istic.idm.project.pollDsl.Option#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // Option
