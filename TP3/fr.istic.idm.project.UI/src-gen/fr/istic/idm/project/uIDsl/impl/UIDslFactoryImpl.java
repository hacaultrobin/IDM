/**
 */
package fr.istic.idm.project.uIDsl.impl;

import fr.istic.idm.project.uIDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIDslFactoryImpl extends EFactoryImpl implements UIDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UIDslFactory init()
  {
    try
    {
      UIDslFactory theUIDslFactory = (UIDslFactory)EPackage.Registry.INSTANCE.getEFactory(UIDslPackage.eNS_URI);
      if (theUIDslFactory != null)
      {
        return theUIDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UIDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDslFactoryImpl()
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
      case UIDslPackage.POLL_SYSTEM: return createPollSystem();
      case UIDslPackage.POLL: return createPoll();
      case UIDslPackage.QUESTION: return createQuestion();
      case UIDslPackage.OPTION: return createOption();
      case UIDslPackage.TYPE: return createType();
      case UIDslPackage.CHECK_BOX: return createCheckBox();
      case UIDslPackage.RADIO_BUTTON: return createRadioButton();
      case UIDslPackage.COMBO_BOX: return createComboBox();
      case UIDslPackage.TEXT_BOX: return createTextBox();
      case UIDslPackage.IMAGE: return createImage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystem createPollSystem()
  {
    PollSystemImpl pollSystem = new PollSystemImpl();
    return pollSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Poll createPoll()
  {
    PollImpl poll = new PollImpl();
    return poll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBox createCheckBox()
  {
    CheckBoxImpl checkBox = new CheckBoxImpl();
    return checkBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadioButton createRadioButton()
  {
    RadioButtonImpl radioButton = new RadioButtonImpl();
    return radioButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComboBox createComboBox()
  {
    ComboBoxImpl comboBox = new ComboBoxImpl();
    return comboBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextBox createTextBox()
  {
    TextBoxImpl textBox = new TextBoxImpl();
    return textBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDslPackage getUIDslPackage()
  {
    return (UIDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UIDslPackage getPackage()
  {
    return UIDslPackage.eINSTANCE;
  }

} //UIDslFactoryImpl
