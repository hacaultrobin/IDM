/**
 */
package fr.istic.idm.project.uIDsl.impl;

import fr.istic.idm.project.uIDsl.TextBox;
import fr.istic.idm.project.uIDsl.UIDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.project.uIDsl.impl.TextBoxImpl#getTextBox <em>Text Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextBoxImpl extends TypeImpl implements TextBox
{
  /**
   * The default value of the '{@link #getTextBox() <em>Text Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextBox()
   * @generated
   * @ordered
   */
  protected static final String TEXT_BOX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextBox() <em>Text Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextBox()
   * @generated
   * @ordered
   */
  protected String textBox = TEXT_BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextBoxImpl()
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
    return UIDslPackage.Literals.TEXT_BOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextBox()
  {
    return textBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextBox(String newTextBox)
  {
    String oldTextBox = textBox;
    textBox = newTextBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDslPackage.TEXT_BOX__TEXT_BOX, oldTextBox, textBox));
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
      case UIDslPackage.TEXT_BOX__TEXT_BOX:
        return getTextBox();
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
      case UIDslPackage.TEXT_BOX__TEXT_BOX:
        setTextBox((String)newValue);
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
      case UIDslPackage.TEXT_BOX__TEXT_BOX:
        setTextBox(TEXT_BOX_EDEFAULT);
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
      case UIDslPackage.TEXT_BOX__TEXT_BOX:
        return TEXT_BOX_EDEFAULT == null ? textBox != null : !TEXT_BOX_EDEFAULT.equals(textBox);
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
    result.append(" (textBox: ");
    result.append(textBox);
    result.append(')');
    return result.toString();
  }

} //TextBoxImpl
