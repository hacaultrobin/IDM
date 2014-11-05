/**
 */
package UIMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UIMM.Option#getId <em>Id</em>}</li>
 *   <li>{@link UIMM.Option#getContent <em>Content</em>}</li>
 *   <li>{@link UIMM.Option#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see UIMM.UIMMPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see UIMM.UIMMPackage#getOption_Id()
	 * @model default=""
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link UIMM.Option#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see UIMM.UIMMPackage#getOption_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link UIMM.Option#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link UIMM.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see UIMM.Type
	 * @see #setType(Type)
	 * @see UIMM.UIMMPackage#getOption_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link UIMM.Option#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see UIMM.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Option
