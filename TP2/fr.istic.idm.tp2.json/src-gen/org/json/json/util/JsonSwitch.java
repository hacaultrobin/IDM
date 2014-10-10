/**
 */
package org.json.json.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.json.json.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.json.json.JsonPackage
 * @generated
 */
public class JsonSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JsonPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JsonPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JsonPackage.JSON_POLL_SYSTEM:
      {
        JsonPollSystem jsonPollSystem = (JsonPollSystem)theEObject;
        T result = caseJsonPollSystem(jsonPollSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.ARRAY_JSON_POLL:
      {
        ArrayJsonPoll arrayJsonPoll = (ArrayJsonPoll)theEObject;
        T result = caseArrayJsonPoll(arrayJsonPoll);
        if (result == null) result = caseJsonPollSystem(arrayJsonPoll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.JSON_POLL:
      {
        JsonPoll jsonPoll = (JsonPoll)theEObject;
        T result = caseJsonPoll(jsonPoll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.ARRAY_JSON_QUESTION:
      {
        ArrayJsonQuestion arrayJsonQuestion = (ArrayJsonQuestion)theEObject;
        T result = caseArrayJsonQuestion(arrayJsonQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.JSON_QUESTION:
      {
        JsonQuestion jsonQuestion = (JsonQuestion)theEObject;
        T result = caseJsonQuestion(jsonQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.ARRAY_JSON_OPTION:
      {
        ArrayJsonOption arrayJsonOption = (ArrayJsonOption)theEObject;
        T result = caseArrayJsonOption(arrayJsonOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.JSON_OPTION:
      {
        JsonOption jsonOption = (JsonOption)theEObject;
        T result = caseJsonOption(jsonOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Poll System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Poll System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonPollSystem(JsonPollSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Json Poll</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Json Poll</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayJsonPoll(ArrayJsonPoll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Poll</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Poll</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonPoll(JsonPoll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Json Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Json Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayJsonQuestion(ArrayJsonQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonQuestion(JsonQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Json Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Json Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayJsonOption(ArrayJsonOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonOption(JsonOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JsonSwitch
