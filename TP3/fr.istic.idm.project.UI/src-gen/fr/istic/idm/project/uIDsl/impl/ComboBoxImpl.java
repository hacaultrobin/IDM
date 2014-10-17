/**
 */
package fr.istic.idm.project.uIDsl.impl;

import fr.istic.idm.project.uIDsl.ComboBox;
import fr.istic.idm.project.uIDsl.UIDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.project.uIDsl.impl.ComboBoxImpl#getComboBox <em>Combo Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComboBoxImpl extends TypeImpl implements ComboBox
{
  /**
   * The default value of the '{@link #getComboBox() <em>Combo Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComboBox()
   * @generated
   * @ordered
   */
  protected static final String COMBO_BOX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComboBox() <em>Combo Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComboBox()
   * @generated
   * @ordered
   */
  protected String comboBox = COMBO_BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComboBoxImpl()
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
    return UIDslPackage.Literals.COMBO_BOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComboBox()
  {
    return comboBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComboBox(String newComboBox)
  {
    String oldComboBox = comboBox;
    comboBox = newComboBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDslPackage.COMBO_BOX__COMBO_BOX, oldComboBox, comboBox));
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
      case UIDslPackage.COMBO_BOX__COMBO_BOX:
        return getComboBox();
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
      case UIDslPackage.COMBO_BOX__COMBO_BOX:
        setComboBox((String)newValue);
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
      case UIDslPackage.COMBO_BOX__COMBO_BOX:
        setComboBox(COMBO_BOX_EDEFAULT);
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
      case UIDslPackage.COMBO_BOX__COMBO_BOX:
        return COMBO_BOX_EDEFAULT == null ? comboBox != null : !COMBO_BOX_EDEFAULT.equals(comboBox);
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
    result.append(" (comboBox: ");
    result.append(comboBox);
    result.append(')');
    return result.toString();
  }

} //ComboBoxImpl
