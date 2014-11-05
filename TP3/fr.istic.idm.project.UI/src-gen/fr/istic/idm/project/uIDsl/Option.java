/**
 */
package fr.istic.idm.project.uIDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.idm.project.uIDsl.Option#getId <em>Id</em>}</li>
 *   <li>{@link fr.istic.idm.project.uIDsl.Option#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.project.uIDsl.UIDslPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see fr.istic.idm.project.uIDsl.UIDslPackage#getOption_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.istic.idm.project.uIDsl.Option#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.istic.idm.project.uIDsl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.istic.idm.project.uIDsl.Type
   * @see #setType(Type)
   * @see fr.istic.idm.project.uIDsl.UIDslPackage#getOption_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link fr.istic.idm.project.uIDsl.Option#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.istic.idm.project.uIDsl.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Option
