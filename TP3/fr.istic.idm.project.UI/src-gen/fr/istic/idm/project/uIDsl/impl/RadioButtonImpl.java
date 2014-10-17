/**
 */
package fr.istic.idm.project.uIDsl.impl;

import fr.istic.idm.project.uIDsl.RadioButton;
import fr.istic.idm.project.uIDsl.UIDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.project.uIDsl.impl.RadioButtonImpl#getRadioButton <em>Radio Button</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioButtonImpl extends TypeImpl implements RadioButton
{
  /**
   * The default value of the '{@link #getRadioButton() <em>Radio Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadioButton()
   * @generated
   * @ordered
   */
  protected static final String RADIO_BUTTON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRadioButton() <em>Radio Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadioButton()
   * @generated
   * @ordered
   */
  protected String radioButton = RADIO_BUTTON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadioButtonImpl()
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
    return UIDslPackage.Literals.RADIO_BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRadioButton()
  {
    return radioButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadioButton(String newRadioButton)
  {
    String oldRadioButton = radioButton;
    radioButton = newRadioButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDslPackage.RADIO_BUTTON__RADIO_BUTTON, oldRadioButton, radioButton));
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
      case UIDslPackage.RADIO_BUTTON__RADIO_BUTTON:
        return getRadioButton();
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
      case UIDslPackage.RADIO_BUTTON__RADIO_BUTTON:
        setRadioButton((String)newValue);
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
      case UIDslPackage.RADIO_BUTTON__RADIO_BUTTON:
        setRadioButton(RADIO_BUTTON_EDEFAULT);
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
      case UIDslPackage.RADIO_BUTTON__RADIO_BUTTON:
        return RADIO_BUTTON_EDEFAULT == null ? radioButton != null : !RADIO_BUTTON_EDEFAULT.equals(radioButton);
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
    result.append(" (radioButton: ");
    result.append(radioButton);
    result.append(')');
    return result.toString();
  }

} //RadioButtonImpl
