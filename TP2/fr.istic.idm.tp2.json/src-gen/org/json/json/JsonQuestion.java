/**
 */
package org.json.json;

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
 *   <li>{@link org.json.json.JsonQuestion#getName <em>Name</em>}</li>
 *   <li>{@link org.json.json.JsonQuestion#getText <em>Text</em>}</li>
 *   <li>{@link org.json.json.JsonQuestion#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.json.json.JsonPackage#getJsonQuestion()
 * @model
 * @generated
 */
public interface JsonQuestion extends EObject
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
   * @see org.json.json.JsonPackage#getJsonQuestion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.json.json.JsonQuestion#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.json.json.JsonPackage#getJsonQuestion_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.json.json.JsonQuestion#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.json.json.ArrayJsonOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.json.json.JsonPackage#getJsonQuestion_Options()
   * @model containment="true"
   * @generated
   */
  EList<ArrayJsonOption> getOptions();

} // JsonQuestion
