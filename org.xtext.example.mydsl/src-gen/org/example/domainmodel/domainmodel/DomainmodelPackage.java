/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DomainmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/domainmodel/Domainmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelPackage eINSTANCE = org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.RobotImpl <em>Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.RobotImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getRobot()
   * @generated
   */
  int ROBOT = 0;

  /**
   * The feature id for the '<em><b>Msgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__MSGS = 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__TASKS = 1;

  /**
   * The number of structural features of the '<em>Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MessageImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 1;

  /**
   * The feature id for the '<em><b>Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__MSG = 0;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.TaskImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getTask()
   * @generated
   */
  int TASK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__FREQUENCY = 1;

  /**
   * The feature id for the '<em><b>Moves</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__MOVES = 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MoveImpl <em>Move</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MoveImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMove()
   * @generated
   */
  int MOVE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__START = 1;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__END = 2;

  /**
   * The feature id for the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__SEED = 3;

  /**
   * The feature id for the '<em><b>Rotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__ROTATION = 4;

  /**
   * The number of structural features of the '<em>Move</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ConditionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 4;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COND = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.ConditionValue <em>Condition Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.ConditionValue
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getConditionValue()
   * @generated
   */
  int CONDITION_VALUE = 5;


  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot</em>'.
   * @see org.example.domainmodel.domainmodel.Robot
   * @generated
   */
  EClass getRobot();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.Robot#getMsgs <em>Msgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msgs</em>'.
   * @see org.example.domainmodel.domainmodel.Robot#getMsgs()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Msgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.Robot#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.example.domainmodel.domainmodel.Robot#getTasks()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Tasks();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.example.domainmodel.domainmodel.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Message#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg</em>'.
   * @see org.example.domainmodel.domainmodel.Message#getMsg()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Msg();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.example.domainmodel.domainmodel.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Task#getFrequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frequency</em>'.
   * @see org.example.domainmodel.domainmodel.Task#getFrequency()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Frequency();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.Task#getMoves <em>Moves</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Moves</em>'.
   * @see org.example.domainmodel.domainmodel.Task#getMoves()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Moves();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move</em>'.
   * @see org.example.domainmodel.domainmodel.Move
   * @generated
   */
  EClass getMove();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Move#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.Move#getName()
   * @see #getMove()
   * @generated
   */
  EAttribute getMove_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.Move#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.example.domainmodel.domainmodel.Move#getStart()
   * @see #getMove()
   * @generated
   */
  EReference getMove_Start();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.Move#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see org.example.domainmodel.domainmodel.Move#getEnd()
   * @see #getMove()
   * @generated
   */
  EReference getMove_End();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Move#getSeed <em>Seed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seed</em>'.
   * @see org.example.domainmodel.domainmodel.Move#getSeed()
   * @see #getMove()
   * @generated
   */
  EAttribute getMove_Seed();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Move#getRotation <em>Rotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rotation</em>'.
   * @see org.example.domainmodel.domainmodel.Move#getRotation()
   * @see #getMove()
   * @generated
   */
  EAttribute getMove_Rotation();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.example.domainmodel.domainmodel.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Condition#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see org.example.domainmodel.domainmodel.Condition#getCond()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Cond();

  /**
   * Returns the meta object for enum '{@link org.example.domainmodel.domainmodel.ConditionValue <em>Condition Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Condition Value</em>'.
   * @see org.example.domainmodel.domainmodel.ConditionValue
   * @generated
   */
  EEnum getConditionValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainmodelFactory getDomainmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.RobotImpl <em>Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.RobotImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getRobot()
     * @generated
     */
    EClass ROBOT = eINSTANCE.getRobot();

    /**
     * The meta object literal for the '<em><b>Msgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__MSGS = eINSTANCE.getRobot_Msgs();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__TASKS = eINSTANCE.getRobot_Tasks();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MessageImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__MSG = eINSTANCE.getMessage_Msg();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.TaskImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__FREQUENCY = eINSTANCE.getTask_Frequency();

    /**
     * The meta object literal for the '<em><b>Moves</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__MOVES = eINSTANCE.getTask_Moves();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MoveImpl <em>Move</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MoveImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMove()
     * @generated
     */
    EClass MOVE = eINSTANCE.getMove();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE__NAME = eINSTANCE.getMove_Name();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVE__START = eINSTANCE.getMove_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVE__END = eINSTANCE.getMove_End();

    /**
     * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE__SEED = eINSTANCE.getMove_Seed();

    /**
     * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE__ROTATION = eINSTANCE.getMove_Rotation();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ConditionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__COND = eINSTANCE.getCondition_Cond();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.ConditionValue <em>Condition Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.ConditionValue
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getConditionValue()
     * @generated
     */
    EEnum CONDITION_VALUE = eINSTANCE.getConditionValue();

  }

} //DomainmodelPackage
