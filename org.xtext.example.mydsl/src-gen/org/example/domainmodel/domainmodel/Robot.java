/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Robot#getMsgs <em>Msgs</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Robot#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject
{
  /**
   * Returns the value of the '<em><b>Msgs</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msgs</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getRobot_Msgs()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMsgs();

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getRobot_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

} // Robot
