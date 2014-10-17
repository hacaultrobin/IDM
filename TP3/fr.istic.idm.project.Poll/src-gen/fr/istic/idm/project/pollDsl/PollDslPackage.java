/**
 */
package fr.istic.idm.project.pollDsl;

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
 * @see fr.istic.idm.project.pollDsl.PollDslFactory
 * @model kind="package"
 * @generated
 */
public interface PollDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pollDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/idm/project/PollDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pollDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PollDslPackage eINSTANCE = fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.idm.project.pollDsl.impl.PollSystemImpl <em>Poll System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.pollDsl.impl.PollSystemImpl
   * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getPollSystem()
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
   * The meta object id for the '{@link fr.istic.idm.project.pollDsl.impl.PollImpl <em>Poll</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.pollDsl.impl.PollImpl
   * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getPoll()
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
   * The meta object id for the '{@link fr.istic.idm.project.pollDsl.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.pollDsl.impl.QuestionImpl
   * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getQuestion()
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
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TEXT = 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__OPTIONS = 2;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.idm.project.pollDsl.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.project.pollDsl.impl.OptionImpl
   * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getOption()
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
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TEXT = 1;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.pollDsl.PollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll System</em>'.
   * @see fr.istic.idm.project.pollDsl.PollSystem
   * @generated
   */
  EClass getPollSystem();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.project.pollDsl.PollSystem#getPolls <em>Polls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Polls</em>'.
   * @see fr.istic.idm.project.pollDsl.PollSystem#getPolls()
   * @see #getPollSystem()
   * @generated
   */
  EReference getPollSystem_Polls();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.pollDsl.Poll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll</em>'.
   * @see fr.istic.idm.project.pollDsl.Poll
   * @generated
   */
  EClass getPoll();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.pollDsl.Poll#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.idm.project.pollDsl.Poll#getName()
   * @see #getPoll()
   * @generated
   */
  EAttribute getPoll_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.project.pollDsl.Poll#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see fr.istic.idm.project.pollDsl.Poll#getQuestions()
   * @see #getPoll()
   * @generated
   */
  EReference getPoll_Questions();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.pollDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see fr.istic.idm.project.pollDsl.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.pollDsl.Question#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.istic.idm.project.pollDsl.Question#getId()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.pollDsl.Question#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.istic.idm.project.pollDsl.Question#getText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Text();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.project.pollDsl.Question#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see fr.istic.idm.project.pollDsl.Question#getOptions()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Options();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.project.pollDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see fr.istic.idm.project.pollDsl.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.pollDsl.Option#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.istic.idm.project.pollDsl.Option#getId()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.project.pollDsl.Option#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.istic.idm.project.pollDsl.Option#getText()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PollDslFactory getPollDslFactory();

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
     * The meta object literal for the '{@link fr.istic.idm.project.pollDsl.impl.PollSystemImpl <em>Poll System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.pollDsl.impl.PollSystemImpl
     * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getPollSystem()
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
     * The meta object literal for the '{@link fr.istic.idm.project.pollDsl.impl.PollImpl <em>Poll</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.pollDsl.impl.PollImpl
     * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getPoll()
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
     * The meta object literal for the '{@link fr.istic.idm.project.pollDsl.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.pollDsl.impl.QuestionImpl
     * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getQuestion()
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
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

    /**
     * The meta object literal for the '{@link fr.istic.idm.project.pollDsl.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.project.pollDsl.impl.OptionImpl
     * @see fr.istic.idm.project.pollDsl.impl.PollDslPackageImpl#getOption()
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
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__TEXT = eINSTANCE.getOption_Text();

  }

} //PollDslPackage
