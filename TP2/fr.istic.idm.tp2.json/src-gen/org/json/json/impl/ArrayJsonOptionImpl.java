/**
 */
package org.json.json.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.json.json.ArrayJsonOption;
import org.json.json.JsonOption;
import org.json.json.JsonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Json Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.json.json.impl.ArrayJsonOptionImpl#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayJsonOptionImpl extends MinimalEObjectImpl.Container implements ArrayJsonOption
{
  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected EList<JsonOption> option;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayJsonOptionImpl()
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
    return JsonPackage.Literals.ARRAY_JSON_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonOption> getOption()
  {
    if (option == null)
    {
      option = new EObjectContainmentEList<JsonOption>(JsonOption.class, this, JsonPackage.ARRAY_JSON_OPTION__OPTION);
    }
    return option;
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
      case JsonPackage.ARRAY_JSON_OPTION__OPTION:
        return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
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
      case JsonPackage.ARRAY_JSON_OPTION__OPTION:
        return getOption();
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
      case JsonPackage.ARRAY_JSON_OPTION__OPTION:
        getOption().clear();
        getOption().addAll((Collection<? extends JsonOption>)newValue);
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
      case JsonPackage.ARRAY_JSON_OPTION__OPTION:
        getOption().clear();
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
      case JsonPackage.ARRAY_JSON_OPTION__OPTION:
        return option != null && !option.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayJsonOptionImpl
