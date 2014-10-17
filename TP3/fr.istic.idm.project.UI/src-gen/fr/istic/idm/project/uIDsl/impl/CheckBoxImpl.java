/**
 */
package fr.istic.idm.project.uIDsl.impl;

import fr.istic.idm.project.uIDsl.CheckBox;
import fr.istic.idm.project.uIDsl.UIDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.project.uIDsl.impl.CheckBoxImpl#getCheckBox <em>Check Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckBoxImpl extends TypeImpl implements CheckBox
{
  /**
   * The default value of the '{@link #getCheckBox() <em>Check Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckBox()
   * @generated
   * @ordered
   */
  protected static final String CHECK_BOX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCheckBox() <em>Check Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckBox()
   * @generated
   * @ordered
   */
  protected String checkBox = CHECK_BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckBoxImpl()
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
    return UIDslPackage.Literals.CHECK_BOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCheckBox()
  {
    return checkBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckBox(String newCheckBox)
  {
    String oldCheckBox = checkBox;
    checkBox = newCheckBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDslPackage.CHECK_BOX__CHECK_BOX, oldCheckBox, checkBox));
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
      case UIDslPackage.CHECK_BOX__CHECK_BOX:
        return getCheckBox();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UIDslPackage.CHECK_BOX__CHECK_BOX:
        setCheckBox((String)newValue);
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
      case UIDslPackage.CHECK_BOX__CHECK_BOX:
        setCheckBox(CHECK_BOX_EDEFAULT);
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
      case UIDslPackage.CHECK_BOX__CHECK_BOX:
        return CHECK_BOX_EDEFAULT == null ? checkBox != null : !CHECK_BOX_EDEFAULT.equals(checkBox);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (checkBox: ");
    result.append(checkBox);
    result.append(')');
    return result.toString();
  }

} //CheckBoxImpl
