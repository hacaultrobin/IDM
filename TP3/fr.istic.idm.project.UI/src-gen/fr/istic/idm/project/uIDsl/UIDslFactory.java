/**
 */
package fr.istic.idm.project.uIDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.istic.idm.project.uIDsl.UIDslPackage
 * @generated
 */
public interface UIDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UIDslFactory eINSTANCE = fr.istic.idm.project.uIDsl.impl.UIDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Poll System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll System</em>'.
   * @generated
   */
  PollSystem createPollSystem();

  /**
   * Returns a new object of class '<em>Poll</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll</em>'.
   * @generated
   */
  Poll createPoll();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UIDslPackage getUIDslPackage();

} //UIDslFactory
