/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Condition#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.domainmodel.domainmodel.ConditionValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' attribute.
   * @see org.example.domainmodel.domainmodel.ConditionValue
   * @see #setCond(ConditionValue)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getCondition_Cond()
   * @model
   * @generated
   */
  ConditionValue getCond();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Condition#getCond <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' attribute.
   * @see org.example.domainmodel.domainmodel.ConditionValue
   * @see #getCond()
   * @generated
   */
  void setCond(ConditionValue value);

} // Condition
