/**
 */
package UIMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UIMM.Poll#getQuestions <em>Questions</em>}</li>
 *   <li>{@link UIMM.Poll#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see UIMM.UIMMPackage#getPoll()
 * @model
 * @generated
 */
public interface Poll extends EObject {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' reference list.
	 * The list contents are of type {@link UIMM.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' reference list.
	 * @see UIMM.UIMMPackage#getPoll_Questions()
	 * @model
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UIMM.UIMMPackage#getPoll_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UIMM.Poll#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Poll
