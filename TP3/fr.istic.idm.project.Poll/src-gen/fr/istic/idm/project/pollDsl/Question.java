/**
 */
package fr.istic.idm.project.pollDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.idm.project.pollDsl.Question#getId <em>Id</em>}</li>
 *   <li>{@link fr.istic.idm.project.pollDsl.Question#getText <em>Text</em>}</li>
 *   <li>{@link fr.istic.idm.project.pollDsl.Question#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.project.pollDsl.PollDslPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
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
   * @see fr.istic.idm.project.pollDsl.PollDslPackage#getQuestion_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.istic.idm.project.pollDsl.Question#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see fr.istic.idm.project.pollDsl.PollDslPackage#getQuestion_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link fr.istic.idm.project.pollDsl.Question#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.idm.project.pollDsl.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see fr.istic.idm.project.pollDsl.PollDslPackage#getQuestion_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

} // Question
