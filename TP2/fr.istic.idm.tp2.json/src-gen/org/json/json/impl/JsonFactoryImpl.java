/**
 */
package org.json.json.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.json.json.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonFactoryImpl extends EFactoryImpl implements JsonFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonFactory init()
  {
    try
    {
      JsonFactory theJsonFactory = (JsonFactory)EPackage.Registry.INSTANCE.getEFactory(JsonPackage.eNS_URI);
      if (theJsonFactory != null)
      {
        return theJsonFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JsonFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JsonPackage.JSON_POLL_SYSTEM: return createJsonPollSystem();
      case JsonPackage.ARRAY_JSON_POLL: return createArrayJsonPoll();
      case JsonPackage.JSON_POLL: return createJsonPoll();
      case JsonPackage.ARRAY_JSON_QUESTION: return createArrayJsonQuestion();
      case JsonPackage.JSON_QUESTION: return createJsonQuestion();
      case JsonPackage.ARRAY_JSON_OPTION: return createArrayJsonOption();
      case JsonPackage.JSON_OPTION: return createJsonOption();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonPollSystem createJsonPollSystem()
  {
    JsonPollSystemImpl jsonPollSystem = new JsonPollSystemImpl();
    return jsonPollSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayJsonPoll createArrayJsonPoll()
  {
    ArrayJsonPollImpl arrayJsonPoll = new ArrayJsonPollImpl();
    return arrayJsonPoll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonPoll createJsonPoll()
  {
    JsonPollImpl jsonPoll = new JsonPollImpl();
    return jsonPoll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayJsonQuestion createArrayJsonQuestion()
  {
    ArrayJsonQuestionImpl arrayJsonQuestion = new ArrayJsonQuestionImpl();
    return arrayJsonQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonQuestion createJsonQuestion()
  {
    JsonQuestionImpl jsonQuestion = new JsonQuestionImpl();
    return jsonQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayJsonOption createArrayJsonOption()
  {
    ArrayJsonOptionImpl arrayJsonOption = new ArrayJsonOptionImpl();
    return arrayJsonOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonOption createJsonOption()
  {
    JsonOptionImpl jsonOption = new JsonOptionImpl();
    return jsonOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonPackage getJsonPackage()
  {
    return (JsonPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JsonPackage getPackage()
  {
    return JsonPackage.eINSTANCE;
  }

} //JsonFactoryImpl
