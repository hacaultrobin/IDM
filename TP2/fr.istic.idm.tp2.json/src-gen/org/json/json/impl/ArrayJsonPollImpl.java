/**
 */
package org.json.json.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.json.json.ArrayJsonPoll;
import org.json.json.JsonPackage;
import org.json.json.JsonPoll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Json Poll</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.json.json.impl.ArrayJsonPollImpl#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayJsonPollImpl extends JsonPollSystemImpl implements ArrayJsonPoll
{
  /**
   * The cached value of the '{@link #getPolls() <em>Polls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolls()
   * @generated
   * @ordered
   */
  protected EList<JsonPoll> polls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayJsonPollImpl()
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
    return JsonPackage.Literals.ARRAY_JSON_POLL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonPoll> getPolls()
  {
    if (polls == null)
    {
      polls = new EObjectContainmentEList<JsonPoll>(JsonPoll.class, this, JsonPackage.ARRAY_JSON_POLL__POLLS);
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
      case JsonPackage.ARRAY_JSON_POLL__POLLS:
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
      case JsonPackage.ARRAY_JSON_POLL__POLLS:
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
      case JsonPackage.ARRAY_JSON_POLL__POLLS:
        getPolls().clear();
        getPolls().addAll((Collection<? extends JsonPoll>)newValue);
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
      case JsonPackage.ARRAY_JSON_POLL__POLLS:
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
      case JsonPackage.ARRAY_JSON_POLL__POLLS:
        return polls != null && !polls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayJsonPollImpl
