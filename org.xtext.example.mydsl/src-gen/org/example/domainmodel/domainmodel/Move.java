/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Move#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Move#getStart <em>Start</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Move#getEnd <em>End</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Move#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Move#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends EObject
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMove_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Move#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Condition)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMove_Start()
   * @model containment="true"
   * @generated
   */
  Condition getStart();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Move#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Condition value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(Condition)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMove_End()
   * @model containment="true"
   * @generated
   */
  Condition getEnd();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Move#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Condition value);

  /**
   * Returns the value of the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seed</em>' attribute.
   * @see #setSeed(int)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMove_Seed()
   * @model
   * @generated
   */
  int getSeed();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Move#getSeed <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seed</em>' attribute.
   * @see #getSeed()
   * @generated
   */
  void setSeed(int value);

  /**
   * Returns the value of the '<em><b>Rotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' attribute.
   * @see #setRotation(int)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMove_Rotation()
   * @model
   * @generated
   */
  int getRotation();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Move#getRotation <em>Rotation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' attribute.
   * @see #getRotation()
   * @generated
   */
  void setRotation(int value);

} // Move
