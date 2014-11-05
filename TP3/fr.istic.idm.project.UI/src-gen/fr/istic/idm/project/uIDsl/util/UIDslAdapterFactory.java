/**
 */
package fr.istic.idm.project.uIDsl.util;

import fr.istic.idm.project.uIDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.istic.idm.project.uIDsl.UIDslPackage
 * @generated
 */
public class UIDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UIDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UIDslPackage.eINSTANCE;
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
  protected UIDslSwitch<Adapter> modelSwitch =
    new UIDslSwitch<Adapter>()
    {
      @Override
      public Adapter casePollSystem(PollSystem object)
      {
        return createPollSystemAdapter();
      }
      @Override
      public Adapter casePoll(Poll object)
      {
        return createPollAdapter();
      }
      @Override
      public Adapter caseQuestion(Question object)
      {
        return createQuestionAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.istic.idm.project.uIDsl.PollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.idm.project.uIDsl.PollSystem
   * @generated
   */
  public Adapter createPollSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.idm.project.uIDsl.Poll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.idm.project.uIDsl.Poll
   * @generated
   */
  public Adapter createPollAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.idm.project.uIDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.idm.project.uIDsl.Question
   * @generated
   */
  public Adapter createQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.idm.project.uIDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.idm.project.uIDsl.Option
   * @generated
   */
  public Adapter createOptionAdapter()
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

} //UIDslAdapterFactory
