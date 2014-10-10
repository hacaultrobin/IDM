/**
 */
package org.json.json.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.json.json.ArrayJsonOption;
import org.json.json.ArrayJsonPoll;
import org.json.json.ArrayJsonQuestion;
import org.json.json.JsonFactory;
import org.json.json.JsonOption;
import org.json.json.JsonPackage;
import org.json.json.JsonPoll;
import org.json.json.JsonPollSystem;
import org.json.json.JsonQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonPackageImpl extends EPackageImpl implements JsonPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonPollSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayJsonPollEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonPollEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayJsonQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayJsonOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonOptionEClass = null;

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
   * @see org.json.json.JsonPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JsonPackageImpl()
  {
    super(eNS_URI, JsonFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link JsonPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JsonPackage init()
  {
    if (isInited) return (JsonPackage)EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI);

    // Obtain or create and register package
    JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JsonPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJsonPackage.createPackageContents();

    // Initialize created meta-data
    theJsonPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJsonPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JsonPackage.eNS_URI, theJsonPackage);
    return theJsonPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonPollSystem()
  {
    return jsonPollSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayJsonPoll()
  {
    return arrayJsonPollEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayJsonPoll_Polls()
  {
    return (EReference)arrayJsonPollEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonPoll()
  {
    return jsonPollEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonPoll_Name()
  {
    return (EAttribute)jsonPollEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonPoll_Questions()
  {
    return (EReference)jsonPollEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayJsonQuestion()
  {
    return arrayJsonQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayJsonQuestion_Question()
  {
    return (EReference)arrayJsonQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonQuestion()
  {
    return jsonQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonQuestion_Name()
  {
    return (EAttribute)jsonQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonQuestion_Text()
  {
    return (EAttribute)jsonQuestionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonQuestion_Options()
  {
    return (EReference)jsonQuestionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayJsonOption()
  {
    return arrayJsonOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayJsonOption_Option()
  {
    return (EReference)arrayJsonOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonOption()
  {
    return jsonOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonOption_Id()
  {
    return (EAttribute)jsonOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonOption_Text()
  {
    return (EAttribute)jsonOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonFactory getJsonFactory()
  {
    return (JsonFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jsonPollSystemEClass = createEClass(JSON_POLL_SYSTEM);

    arrayJsonPollEClass = createEClass(ARRAY_JSON_POLL);
    createEReference(arrayJsonPollEClass, ARRAY_JSON_POLL__POLLS);

    jsonPollEClass = createEClass(JSON_POLL);
    createEAttribute(jsonPollEClass, JSON_POLL__NAME);
    createEReference(jsonPollEClass, JSON_POLL__QUESTIONS);

    arrayJsonQuestionEClass = createEClass(ARRAY_JSON_QUESTION);
    createEReference(arrayJsonQuestionEClass, ARRAY_JSON_QUESTION__QUESTION);

    jsonQuestionEClass = createEClass(JSON_QUESTION);
    createEAttribute(jsonQuestionEClass, JSON_QUESTION__NAME);
    createEAttribute(jsonQuestionEClass, JSON_QUESTION__TEXT);
    createEReference(jsonQuestionEClass, JSON_QUESTION__OPTIONS);

    arrayJsonOptionEClass = createEClass(ARRAY_JSON_OPTION);
    createEReference(arrayJsonOptionEClass, ARRAY_JSON_OPTION__OPTION);

    jsonOptionEClass = createEClass(JSON_OPTION);
    createEAttribute(jsonOptionEClass, JSON_OPTION__ID);
    createEAttribute(jsonOptionEClass, JSON_OPTION__TEXT);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    arrayJsonPollEClass.getESuperTypes().add(this.getJsonPollSystem());

    // Initialize classes and features; add operations and parameters
    initEClass(jsonPollSystemEClass, JsonPollSystem.class, "JsonPollSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayJsonPollEClass, ArrayJsonPoll.class, "ArrayJsonPoll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayJsonPoll_Polls(), this.getJsonPoll(), null, "polls", null, 0, -1, ArrayJsonPoll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonPollEClass, JsonPoll.class, "JsonPoll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonPoll_Name(), ecorePackage.getEString(), "name", null, 0, 1, JsonPoll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonPoll_Questions(), this.getArrayJsonQuestion(), null, "questions", null, 0, -1, JsonPoll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayJsonQuestionEClass, ArrayJsonQuestion.class, "ArrayJsonQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayJsonQuestion_Question(), this.getJsonQuestion(), null, "question", null, 0, -1, ArrayJsonQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonQuestionEClass, JsonQuestion.class, "JsonQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, JsonQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJsonQuestion_Text(), ecorePackage.getEString(), "text", null, 0, 1, JsonQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonQuestion_Options(), this.getArrayJsonOption(), null, "options", null, 0, -1, JsonQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayJsonOptionEClass, ArrayJsonOption.class, "ArrayJsonOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayJsonOption_Option(), this.getJsonOption(), null, "option", null, 0, -1, ArrayJsonOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonOptionEClass, JsonOption.class, "JsonOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonOption_Id(), ecorePackage.getEString(), "id", null, 0, 1, JsonOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJsonOption_Text(), ecorePackage.getEString(), "text", null, 0, 1, JsonOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JsonPackageImpl
