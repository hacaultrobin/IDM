/**
 */
package fr.istic.idm.project.pollDsl.impl;

import fr.istic.idm.project.pollDsl.Poll;
import fr.istic.idm.project.pollDsl.PollDslPackage;
import fr.istic.idm.project.pollDsl.PollSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.project.pollDsl.impl.PollSystemImpl#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollSystemImpl extends MinimalEObjectImpl.Container implements PollSystem
{
  /**
   * The cached value of the '{@link #getPolls() <em>Polls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolls()
   * @generated
   * @ordered
   */
  protected EList<Poll> polls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PollSystemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PollDslPackage.Literals.POLL_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Poll> getPolls()
  {
    if (polls == null)
    {
      polls = new EObjectContainmentEList<Poll>(Poll.class, this, PollDslPackage.POLL_SYSTEM__POLLS);
    }
    return polls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PollDslPackage.POLL_SYSTEM__POLLS:
        return ((InternalEList<?>)getPolls()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PollDslPackage.POLL_SYSTEM__POLLS:
        return getPolls();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PollDslPackage.POLL_SYSTEM__POLLS:
        getPolls().clear();
        getPolls().addAll((Collection<? extends Poll>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PollDslPackage.POLL_SYSTEM__POLLS:
        getPolls().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PollDslPackage.POLL_SYSTEM__POLLS:
        return polls != null && !polls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PollSystemImpl
