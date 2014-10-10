/**
 */
package org.json.json.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.json.json.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.json.json.JsonPackage
 * @generated
 */
public class JsonAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JsonPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JsonPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonSwitch<Adapter> modelSwitch =
    new JsonSwitch<Adapter>()
    {
      @Override
      public Adapter caseJsonPollSystem(JsonPollSystem object)
      {
        return createJsonPollSystemAdapter();
      }
      @Override
      public Adapter caseArrayJsonPoll(ArrayJsonPoll object)
      {
        return createArrayJsonPollAdapter();
      }
      @Override
      public Adapter caseJsonPoll(JsonPoll object)
      {
        return createJsonPollAdapter();
      }
      @Override
      public Adapter caseArrayJsonQuestion(ArrayJsonQuestion object)
      {
        return createArrayJsonQuestionAdapter();
      }
      @Override
      public Adapter caseJsonQuestion(JsonQuestion object)
      {
        return createJsonQuestionAdapter();
      }
      @Override
      public Adapter caseArrayJsonOption(ArrayJsonOption object)
      {
        return createArrayJsonOptionAdapter();
      }
      @Override
      public Adapter caseJsonOption(JsonOption object)
      {
        return createJsonOptionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.json.json.JsonPollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.JsonPollSystem
   * @generated
   */
  public Adapter createJsonPollSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.json.json.ArrayJsonPoll <em>Array Json Poll</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.ArrayJsonPoll
   * @generated
   */
  public Adapter createArrayJsonPollAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.json.json.JsonPoll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.JsonPoll
   * @generated
   */
  public Adapter createJsonPollAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.json.json.ArrayJsonQuestion <em>Array Json Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.ArrayJsonQuestion
   * @generated
   */
  public Adapter createArrayJsonQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.json.json.JsonQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.JsonQuestion
   * @generated
   */
  public Adapter createJsonQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.json.json.ArrayJsonOption <em>Array Json Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.ArrayJsonOption
   * @generated
   */
  public Adapter createArrayJsonOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.json.json.JsonOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.json.json.JsonOption
   * @generated
   */
  public Adapter createJsonOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JsonAdapterFactory
