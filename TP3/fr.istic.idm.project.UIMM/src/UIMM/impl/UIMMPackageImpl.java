/**
 */
package UIMM.impl;

import UIMM.Option;
import UIMM.Poll;
import UIMM.PollSystem;
import UIMM.Question;
import UIMM.Type;
import UIMM.UIMMFactory;
import UIMM.UIMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIMMPackageImpl extends EPackageImpl implements UIMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UIMM.UIMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UIMMPackageImpl() {
		super(eNS_URI, UIMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UIMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UIMMPackage init() {
		if (isInited) return (UIMMPackage)EPackage.Registry.INSTANCE.getEPackage(UIMMPackage.eNS_URI);

		// Obtain or create and register package
		UIMMPackageImpl theUIMMPackage = (UIMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UIMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UIMMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUIMMPackage.createPackageContents();

		// Initialize created meta-data
		theUIMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUIMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UIMMPackage.eNS_URI, theUIMMPackage);
		return theUIMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollSystem() {
		return pollSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollSystem_Polls() {
		return (EReference)pollSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoll() {
		return pollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoll_Questions() {
		return (EReference)pollEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoll_Name() {
		return (EAttribute)pollEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Id() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Content() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Options() {
		return (EReference)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Id() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Content() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Type() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIMMFactory getUIMMFactory() {
		return (UIMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pollSystemEClass = createEClass(POLL_SYSTEM);
		createEReference(pollSystemEClass, POLL_SYSTEM__POLLS);

		pollEClass = createEClass(POLL);
		createEReference(pollEClass, POLL__QUESTIONS);
		createEAttribute(pollEClass, POLL__NAME);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__ID);
		createEAttribute(questionEClass, QUESTION__CONTENT);
		createEReference(questionEClass, QUESTION__OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__ID);
		createEAttribute(optionEClass, OPTION__CONTENT);
		createEAttribute(optionEClass, OPTION__TYPE);

		// Create enums
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pollSystemEClass, PollSystem.class, "PollSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPollSystem_Polls(), this.getPoll(), null, "polls", null, 0, -1, PollSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollEClass, Poll.class, "Poll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoll_Questions(), this.getQuestion(), null, "questions", null, 0, -1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoll_Name(), ecorePackage.getEString(), "name", "", 0, 1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Id(), ecorePackage.getEString(), "id", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Content(), ecorePackage.getEString(), "content", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Options(), this.getOption(), null, "options", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Id(), ecorePackage.getEString(), "id", "", 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Content(), ecorePackage.getEString(), "content", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Type(), this.getType(), "type", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.CHECK_BOX);
		addEEnumLiteral(typeEEnum, Type.RADIO_BUTTON);
		addEEnumLiteral(typeEEnum, Type.COMBO_BOX);
		addEEnumLiteral(typeEEnum, Type.TEXT_BOX);
		addEEnumLiteral(typeEEnum, Type.IMAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //UIMMPackageImpl
