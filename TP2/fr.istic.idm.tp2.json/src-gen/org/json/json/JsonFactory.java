/**
 */
package org.json.json;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.json.json.JsonPackage
 * @generated
 */
public interface JsonFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonFactory eINSTANCE = org.json.json.impl.JsonFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Poll System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll System</em>'.
   * @generated
   */
  JsonPollSystem createJsonPollSystem();

  /**
   * Returns a new object of class '<em>Array Json Poll</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Json Poll</em>'.
   * @generated
   */
  ArrayJsonPoll createArrayJsonPoll();

  /**
   * Returns a new object of class '<em>Poll</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll</em>'.
   * @generated
   */
  JsonPoll createJsonPoll();

  /**
   * Returns a new object of class '<em>Array Json Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Json Question</em>'.
   * @generated
   */
  ArrayJsonQuestion createArrayJsonQuestion();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  JsonQuestion createJsonQuestion();

  /**
   * Returns a new object of class '<em>Array Json Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Json Option</em>'.
   * @generated
   */
  ArrayJsonOption createArrayJsonOption();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  JsonOption createJsonOption();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JsonPackage getJsonPackage();

} //JsonFactory
