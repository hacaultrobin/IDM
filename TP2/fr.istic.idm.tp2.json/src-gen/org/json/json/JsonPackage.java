/**
 */
package org.json.json;

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
 * @see org.json.json.JsonFactory
 * @model kind="package"
 * @generated
 */
public interface JsonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "json";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.json.org/Json";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "json";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonPackage eINSTANCE = org.json.json.impl.JsonPackageImpl.init();

  /**
   * The meta object id for the '{@link org.json.json.impl.JsonPollSystemImpl <em>Poll System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.JsonPollSystemImpl
   * @see org.json.json.impl.JsonPackageImpl#getJsonPollSystem()
   * @generated
   */
  int JSON_POLL_SYSTEM = 0;

  /**
   * The number of structural features of the '<em>Poll System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_POLL_SYSTEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.json.json.impl.ArrayJsonPollImpl <em>Array Json Poll</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.ArrayJsonPollImpl
   * @see org.json.json.impl.JsonPackageImpl#getArrayJsonPoll()
   * @generated
   */
  int ARRAY_JSON_POLL = 1;

  /**
   * The feature id for the '<em><b>Polls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_JSON_POLL__POLLS = JSON_POLL_SYSTEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Json Poll</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_JSON_POLL_FEATURE_COUNT = JSON_POLL_SYSTEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.json.json.impl.JsonPollImpl <em>Poll</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.JsonPollImpl
   * @see org.json.json.impl.JsonPackageImpl#getJsonPoll()
   * @generated
   */
  int JSON_POLL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_POLL__NAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_POLL__QUESTIONS = 1;

  /**
   * The number of structural features of the '<em>Poll</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_POLL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.json.json.impl.ArrayJsonQuestionImpl <em>Array Json Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.ArrayJsonQuestionImpl
   * @see org.json.json.impl.JsonPackageImpl#getArrayJsonQuestion()
   * @generated
   */
  int ARRAY_JSON_QUESTION = 3;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_JSON_QUESTION__QUESTION = 0;

  /**
   * The number of structural features of the '<em>Array Json Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_JSON_QUESTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.json.json.impl.JsonQuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.JsonQuestionImpl
   * @see org.json.json.impl.JsonPackageImpl#getJsonQuestion()
   * @generated
   */
  int JSON_QUESTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_QUESTION__TEXT = 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_QUESTION__OPTIONS = 2;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_QUESTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.json.json.impl.ArrayJsonOptionImpl <em>Array Json Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.ArrayJsonOptionImpl
   * @see org.json.json.impl.JsonPackageImpl#getArrayJsonOption()
   * @generated
   */
  int ARRAY_JSON_OPTION = 5;

  /**
   * The feature id for the '<em><b>Option</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_JSON_OPTION__OPTION = 0;

  /**
   * The number of structural features of the '<em>Array Json Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_JSON_OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.json.json.impl.JsonOptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.json.json.impl.JsonOptionImpl
   * @see org.json.json.impl.JsonPackageImpl#getJsonOption()
   * @generated
   */
  int JSON_OPTION = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OPTION__ID = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OPTION__TEXT = 1;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OPTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.json.json.JsonPollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll System</em>'.
   * @see org.json.json.JsonPollSystem
   * @generated
   */
  EClass getJsonPollSystem();

  /**
   * Returns the meta object for class '{@link org.json.json.ArrayJsonPoll <em>Array Json Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Json Poll</em>'.
   * @see org.json.json.ArrayJsonPoll
   * @generated
   */
  EClass getArrayJsonPoll();

  /**
   * Returns the meta object for the containment reference list '{@link org.json.json.ArrayJsonPoll#getPolls <em>Polls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Polls</em>'.
   * @see org.json.json.ArrayJsonPoll#getPolls()
   * @see #getArrayJsonPoll()
   * @generated
   */
  EReference getArrayJsonPoll_Polls();

  /**
   * Returns the meta object for class '{@link org.json.json.JsonPoll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll</em>'.
   * @see org.json.json.JsonPoll
   * @generated
   */
  EClass getJsonPoll();

  /**
   * Returns the meta object for the attribute '{@link org.json.json.JsonPoll#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.json.json.JsonPoll#getName()
   * @see #getJsonPoll()
   * @generated
   */
  EAttribute getJsonPoll_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.json.json.JsonPoll#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.json.json.JsonPoll#getQuestions()
   * @see #getJsonPoll()
   * @generated
   */
  EReference getJsonPoll_Questions();

  /**
   * Returns the meta object for class '{@link org.json.json.ArrayJsonQuestion <em>Array Json Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Json Question</em>'.
   * @see org.json.json.ArrayJsonQuestion
   * @generated
   */
  EClass getArrayJsonQuestion();

  /**
   * Returns the meta object for the containment reference list '{@link org.json.json.ArrayJsonQuestion#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Question</em>'.
   * @see org.json.json.ArrayJsonQuestion#getQuestion()
   * @see #getArrayJsonQuestion()
   * @generated
   */
  EReference getArrayJsonQuestion_Question();

  /**
   * Returns the meta object for class '{@link org.json.json.JsonQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.json.json.JsonQuestion
   * @generated
   */
  EClass getJsonQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.json.json.JsonQuestion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.json.json.JsonQuestion#getName()
   * @see #getJsonQuestion()
   * @generated
   */
  EAttribute getJsonQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link org.json.json.JsonQuestion#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.json.json.JsonQuestion#getText()
   * @see #getJsonQuestion()
   * @generated
   */
  EAttribute getJsonQuestion_Text();

  /**
   * Returns the meta object for the containment reference list '{@link org.json.json.JsonQuestion#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.json.json.JsonQuestion#getOptions()
   * @see #getJsonQuestion()
   * @generated
   */
  EReference getJsonQuestion_Options();

  /**
   * Returns the meta object for class '{@link org.json.json.ArrayJsonOption <em>Array Json Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Json Option</em>'.
   * @see org.json.json.ArrayJsonOption
   * @generated
   */
  EClass getArrayJsonOption();

  /**
   * Returns the meta object for the containment reference list '{@link org.json.json.ArrayJsonOption#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Option</em>'.
   * @see org.json.json.ArrayJsonOption#getOption()
   * @see #getArrayJsonOption()
   * @generated
   */
  EReference getArrayJsonOption_Option();

  /**
   * Returns the meta object for class '{@link org.json.json.JsonOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see org.json.json.JsonOption
   * @generated
   */
  EClass getJsonOption();

  /**
   * Returns the meta object for the attribute '{@link org.json.json.JsonOption#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.json.json.JsonOption#getId()
   * @see #getJsonOption()
   * @generated
   */
  EAttribute getJsonOption_Id();

  /**
   * Returns the meta object for the attribute '{@link org.json.json.JsonOption#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.json.json.JsonOption#getText()
   * @see #getJsonOption()
   * @generated
   */
  EAttribute getJsonOption_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JsonFactory getJsonFactory();

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
     * The meta object literal for the '{@link org.json.json.impl.JsonPollSystemImpl <em>Poll System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.JsonPollSystemImpl
     * @see org.json.json.impl.JsonPackageImpl#getJsonPollSystem()
     * @generated
     */
    EClass JSON_POLL_SYSTEM = eINSTANCE.getJsonPollSystem();

    /**
     * The meta object literal for the '{@link org.json.json.impl.ArrayJsonPollImpl <em>Array Json Poll</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.ArrayJsonPollImpl
     * @see org.json.json.impl.JsonPackageImpl#getArrayJsonPoll()
     * @generated
     */
    EClass ARRAY_JSON_POLL = eINSTANCE.getArrayJsonPoll();

    /**
     * The meta object literal for the '<em><b>Polls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_JSON_POLL__POLLS = eINSTANCE.getArrayJsonPoll_Polls();

    /**
     * The meta object literal for the '{@link org.json.json.impl.JsonPollImpl <em>Poll</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.JsonPollImpl
     * @see org.json.json.impl.JsonPackageImpl#getJsonPoll()
     * @generated
     */
    EClass JSON_POLL = eINSTANCE.getJsonPoll();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_POLL__NAME = eINSTANCE.getJsonPoll_Name();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_POLL__QUESTIONS = eINSTANCE.getJsonPoll_Questions();

    /**
     * The meta object literal for the '{@link org.json.json.impl.ArrayJsonQuestionImpl <em>Array Json Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.ArrayJsonQuestionImpl
     * @see org.json.json.impl.JsonPackageImpl#getArrayJsonQuestion()
     * @generated
     */
    EClass ARRAY_JSON_QUESTION = eINSTANCE.getArrayJsonQuestion();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_JSON_QUESTION__QUESTION = eINSTANCE.getArrayJsonQuestion_Question();

    /**
     * The meta object literal for the '{@link org.json.json.impl.JsonQuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.JsonQuestionImpl
     * @see org.json.json.impl.JsonPackageImpl#getJsonQuestion()
     * @generated
     */
    EClass JSON_QUESTION = eINSTANCE.getJsonQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_QUESTION__NAME = eINSTANCE.getJsonQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_QUESTION__TEXT = eINSTANCE.getJsonQuestion_Text();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_QUESTION__OPTIONS = eINSTANCE.getJsonQuestion_Options();

    /**
     * The meta object literal for the '{@link org.json.json.impl.ArrayJsonOptionImpl <em>Array Json Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.ArrayJsonOptionImpl
     * @see org.json.json.impl.JsonPackageImpl#getArrayJsonOption()
     * @generated
     */
    EClass ARRAY_JSON_OPTION = eINSTANCE.getArrayJsonOption();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_JSON_OPTION__OPTION = eINSTANCE.getArrayJsonOption_Option();

    /**
     * The meta object literal for the '{@link org.json.json.impl.JsonOptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.json.json.impl.JsonOptionImpl
     * @see org.json.json.impl.JsonPackageImpl#getJsonOption()
     * @generated
     */
    EClass JSON_OPTION = eINSTANCE.getJsonOption();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_OPTION__ID = eINSTANCE.getJsonOption_Id();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_OPTION__TEXT = eINSTANCE.getJsonOption_Text();

  }

} //JsonPackage
