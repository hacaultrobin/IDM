/**
 */
package UIMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UIMM.UIMMFactory
 * @model kind="package"
 * @generated
 */
public interface UIMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UIMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.istic.idm.project.UI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UIMMPackage eINSTANCE = UIMM.impl.UIMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link UIMM.impl.PollSystemImpl <em>Poll System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UIMM.impl.PollSystemImpl
	 * @see UIMM.impl.UIMMPackageImpl#getPollSystem()
	 * @generated
	 */
	int POLL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Polls</b></em>' reference list.
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
	 * The number of operations of the '<em>Poll System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UIMM.impl.PollImpl <em>Poll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UIMM.impl.PollImpl
	 * @see UIMM.impl.UIMMPackageImpl#getPoll()
	 * @generated
	 */
	int POLL = 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__QUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UIMM.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UIMM.impl.QuestionImpl
	 * @see UIMM.impl.UIMMPackageImpl#getQuestion()
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
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
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
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UIMM.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UIMM.impl.OptionImpl
	 * @see UIMM.impl.UIMMPackageImpl#getOption()
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
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UIMM.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UIMM.Type
	 * @see UIMM.impl.UIMMPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;


	/**
	 * Returns the meta object for class '{@link UIMM.PollSystem <em>Poll System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll System</em>'.
	 * @see UIMM.PollSystem
	 * @generated
	 */
	EClass getPollSystem();

	/**
	 * Returns the meta object for the reference list '{@link UIMM.PollSystem#getPolls <em>Polls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polls</em>'.
	 * @see UIMM.PollSystem#getPolls()
	 * @see #getPollSystem()
	 * @generated
	 */
	EReference getPollSystem_Polls();

	/**
	 * Returns the meta object for class '{@link UIMM.Poll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll</em>'.
	 * @see UIMM.Poll
	 * @generated
	 */
	EClass getPoll();

	/**
	 * Returns the meta object for the reference list '{@link UIMM.Poll#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questions</em>'.
	 * @see UIMM.Poll#getQuestions()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Questions();

	/**
	 * Returns the meta object for the attribute '{@link UIMM.Poll#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UIMM.Poll#getName()
	 * @see #getPoll()
	 * @generated
	 */
	EAttribute getPoll_Name();

	/**
	 * Returns the meta object for class '{@link UIMM.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see UIMM.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link UIMM.Question#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see UIMM.Question#getId()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Id();

	/**
	 * Returns the meta object for the attribute '{@link UIMM.Question#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see UIMM.Question#getContent()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Content();

	/**
	 * Returns the meta object for the reference list '{@link UIMM.Question#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see UIMM.Question#getOptions()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Options();

	/**
	 * Returns the meta object for class '{@link UIMM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see UIMM.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link UIMM.Option#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see UIMM.Option#getId()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Id();

	/**
	 * Returns the meta object for the attribute '{@link UIMM.Option#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see UIMM.Option#getContent()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Content();

	/**
	 * Returns the meta object for the attribute '{@link UIMM.Option#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see UIMM.Option#getType()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Type();

	/**
	 * Returns the meta object for enum '{@link UIMM.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see UIMM.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UIMMFactory getUIMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UIMM.impl.PollSystemImpl <em>Poll System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UIMM.impl.PollSystemImpl
		 * @see UIMM.impl.UIMMPackageImpl#getPollSystem()
		 * @generated
		 */
		EClass POLL_SYSTEM = eINSTANCE.getPollSystem();

		/**
		 * The meta object literal for the '<em><b>Polls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_SYSTEM__POLLS = eINSTANCE.getPollSystem_Polls();

		/**
		 * The meta object literal for the '{@link UIMM.impl.PollImpl <em>Poll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UIMM.impl.PollImpl
		 * @see UIMM.impl.UIMMPackageImpl#getPoll()
		 * @generated
		 */
		EClass POLL = eINSTANCE.getPoll();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__QUESTIONS = eINSTANCE.getPoll_Questions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL__NAME = eINSTANCE.getPoll_Name();

		/**
		 * The meta object literal for the '{@link UIMM.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UIMM.impl.QuestionImpl
		 * @see UIMM.impl.UIMMPackageImpl#getQuestion()
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
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CONTENT = eINSTANCE.getQuestion_Content();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

		/**
		 * The meta object literal for the '{@link UIMM.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UIMM.impl.OptionImpl
		 * @see UIMM.impl.UIMMPackageImpl#getOption()
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
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__CONTENT = eINSTANCE.getOption_Content();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TYPE = eINSTANCE.getOption_Type();

		/**
		 * The meta object literal for the '{@link UIMM.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UIMM.Type
		 * @see UIMM.impl.UIMMPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //UIMMPackage
