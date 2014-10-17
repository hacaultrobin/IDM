/**
 */
package fr.istic.idm.project.uIDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.istic.idm.project.uIDsl.UIDslFactory
 * @model kind="package"
 * @generated
 */
public interface UIDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uIDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/idm/project/UIDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uIDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UIDslPackage eINSTANCE = fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.PollSystemImpl <em>Poll System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.PollSystemImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getPollSystem()
   * @generated
   */
  int POLL_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Polls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM__POLLS = 0;

  /**
   * The number of structural features of the '<em>Poll System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.PollImpl <em>Poll</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.PollImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getPoll()
   * @generated
   */
  int POLL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL__NAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL__QUESTIONS = 1;

  /**
   * The number of structural features of the '<em>Poll</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.QuestionImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ID = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.OptionImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getOption()
   * @generated
   */
  int OPTION = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.TypeImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DEFAULT = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.CheckBoxImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 5;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__DEFAULT = TYPE__DEFAULT;

  /**
   * The feature id for the '<em><b>Check Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__CHECK_BOX = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.RadioButtonImpl <em>Radio Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.RadioButtonImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getRadioButton()
   * @generated
   */
  int RADIO_BUTTON = 6;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__DEFAULT = TYPE__DEFAULT;

  /**
   * The feature id for the '<em><b>Radio Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__RADIO_BUTTON = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Radio Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.ComboBoxImpl <em>Combo Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.ComboBoxImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getComboBox()
   * @generated
   */
  int COMBO_BOX = 7;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX__DEFAULT = TYPE__DEFAULT;

  /**
   * The feature id for the '<em><b>Combo Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX__COMBO_BOX = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Combo Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.TextBoxImpl <em>Text Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.TextBoxImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getTextBox()
   * @generated
   */
  int TEXT_BOX = 8;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BOX__DEFAULT = TYPE__DEFAULT;

  /**
   * The feature id for the '<em><b>Text Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BOX__TEXT_BOX = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BOX_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.uIDsl.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.uIDsl.impl.ImageImpl
   * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 9;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__DEFAULT = TYPE__DEFAULT;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__URL = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.PollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll System</em>'.
   * @see fr.istic.idm.project.uIDsl.PollSystem
   * @generated
   */
  EClass getPollSystem();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.project.uIDsl.PollSystem#getPolls <em>Polls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Polls</em>'.
   * @see fr.istic.idm.project.uIDsl.PollSystem#getPolls()
   * @see #getPollSystem()
   * @generated
   */
  EReference getPollSystem_Polls();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.Poll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll</em>'.
   * @see fr.istic.idm.project.uIDsl.Poll
   * @generated
   */
  EClass getPoll();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.Poll#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.idm.project.uIDsl.Poll#getName()
   * @see #getPoll()
   * @generated
   */
  EAttribute getPoll_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.project.uIDsl.Poll#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see fr.istic.idm.project.uIDsl.Poll#getQuestions()
   * @see #getPoll()
   * @generated
   */
  EReference getPoll_Questions();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see fr.istic.idm.project.uIDsl.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.Question#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.istic.idm.project.uIDsl.Question#getId()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Id();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.project.uIDsl.Question#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see fr.istic.idm.project.uIDsl.Question#getOptions()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Options();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see fr.istic.idm.project.uIDsl.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.Option#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.istic.idm.project.uIDsl.Option#getId()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Id();

  /**
   * Returns the meta object for the containment reference '{@link fr.istic.idm.project.uIDsl.Option#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see fr.istic.idm.project.uIDsl.Option#getType()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Type();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see fr.istic.idm.project.uIDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.Type#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see fr.istic.idm.project.uIDsl.Type#getDefault()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Default();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see fr.istic.idm.project.uIDsl.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.CheckBox#getCheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Box</em>'.
   * @see fr.istic.idm.project.uIDsl.CheckBox#getCheckBox()
   * @see #getCheckBox()
   * @generated
   */
  EAttribute getCheckBox_CheckBox();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.RadioButton <em>Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio Button</em>'.
   * @see fr.istic.idm.project.uIDsl.RadioButton
   * @generated
   */
  EClass getRadioButton();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.RadioButton#getRadioButton <em>Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radio Button</em>'.
   * @see fr.istic.idm.project.uIDsl.RadioButton#getRadioButton()
   * @see #getRadioButton()
   * @generated
   */
  EAttribute getRadioButton_RadioButton();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.ComboBox <em>Combo Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combo Box</em>'.
   * @see fr.istic.idm.project.uIDsl.ComboBox
   * @generated
   */
  EClass getComboBox();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.ComboBox#getComboBox <em>Combo Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Combo Box</em>'.
   * @see fr.istic.idm.project.uIDsl.ComboBox#getComboBox()
   * @see #getComboBox()
   * @generated
   */
  EAttribute getComboBox_ComboBox();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.TextBox <em>Text Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Box</em>'.
   * @see fr.istic.idm.project.uIDsl.TextBox
   * @generated
   */
  EClass getTextBox();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.TextBox#getTextBox <em>Text Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text Box</em>'.
   * @see fr.istic.idm.project.uIDsl.TextBox#getTextBox()
   * @see #getTextBox()
   * @generated
   */
  EAttribute getTextBox_TextBox();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.uIDsl.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see fr.istic.idm.project.uIDsl.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.uIDsl.Image#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.istic.idm.project.uIDsl.Image#getUrl()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Url();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UIDslFactory getUIDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.PollSystemImpl <em>Poll System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.PollSystemImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getPollSystem()
     * @generated
     */
    EClass POLL_SYSTEM = eINSTANCE.getPollSystem();

    /**
     * The meta object literal for the '<em><b>Polls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLL_SYSTEM__POLLS = eINSTANCE.getPollSystem_Polls();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.PollImpl <em>Poll</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.PollImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getPoll()
     * @generated
     */
    EClass POLL = eINSTANCE.getPoll();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL__NAME = eINSTANCE.getPoll_Name();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLL__QUESTIONS = eINSTANCE.getPoll_Questions();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.QuestionImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.OptionImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__ID = eINSTANCE.getOption_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__TYPE = eINSTANCE.getOption_Type();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.TypeImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__DEFAULT = eINSTANCE.getType_Default();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.CheckBoxImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '<em><b>Check Box</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_BOX__CHECK_BOX = eINSTANCE.getCheckBox_CheckBox();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.RadioButtonImpl <em>Radio Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.RadioButtonImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getRadioButton()
     * @generated
     */
    EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

    /**
     * The meta object literal for the '<em><b>Radio Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_BUTTON__RADIO_BUTTON = eINSTANCE.getRadioButton_RadioButton();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.ComboBoxImpl <em>Combo Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.ComboBoxImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getComboBox()
     * @generated
     */
    EClass COMBO_BOX = eINSTANCE.getComboBox();

    /**
     * The meta object literal for the '<em><b>Combo Box</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMBO_BOX__COMBO_BOX = eINSTANCE.getComboBox_ComboBox();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.TextBoxImpl <em>Text Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.TextBoxImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getTextBox()
     * @generated
     */
    EClass TEXT_BOX = eINSTANCE.getTextBox();

    /**
     * The meta object literal for the '<em><b>Text Box</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_BOX__TEXT_BOX = eINSTANCE.getTextBox_TextBox();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.uIDsl.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.uIDsl.impl.ImageImpl
     * @see fr.istic.idm.project.uIDsl.impl.UIDslPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

  }

} //UIDslPackage
