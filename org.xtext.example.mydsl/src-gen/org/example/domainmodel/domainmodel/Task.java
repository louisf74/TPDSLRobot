/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Task#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Task#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Task#getMoves <em>Moves</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frequency</em>' attribute.
   * @see #setFrequency(int)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getTask_Frequency()
   * @model
   * @generated
   */
  int getFrequency();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Task#getFrequency <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frequency</em>' attribute.
   * @see #getFrequency()
   * @generated
   */
  void setFrequency(int value);

  /**
   * Returns the value of the '<em><b>Moves</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.Move}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moves</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moves</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getTask_Moves()
   * @model containment="true"
   * @generated
   */
  EList<Move> getMoves();

} // Task
