/**
 */
package org.example.domainmodel.domainmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getConditionValue()
 * @model
 * @generated
 */
public enum ConditionValue implements Enumerator
{
  /**
   * The '<em><b>Border</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BORDER_VALUE
   * @generated
   * @ordered
   */
  BORDER(0, "border", "border"),

  /**
   * The '<em><b>No Border</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_BORDER_VALUE
   * @generated
   * @ordered
   */
  NO_BORDER(1, "noBorder", "noBorder"),

  /**
   * The '<em><b>Lake</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAKE_VALUE
   * @generated
   * @ordered
   */
  LAKE(2, "lake", "lake"),

  /**
   * The '<em><b>No Lake</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_LAKE_VALUE
   * @generated
   * @ordered
   */
  NO_LAKE(3, "noLake", "noLake");

  /**
   * The '<em><b>Border</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Border</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BORDER
   * @model name="border"
   * @generated
   * @ordered
   */
  public static final int BORDER_VALUE = 0;

  /**
   * The '<em><b>No Border</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>No Border</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_BORDER
   * @model name="noBorder"
   * @generated
   * @ordered
   */
  public static final int NO_BORDER_VALUE = 1;

  /**
   * The '<em><b>Lake</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lake</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAKE
   * @model name="lake"
   * @generated
   * @ordered
   */
  public static final int LAKE_VALUE = 2;

  /**
   * The '<em><b>No Lake</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>No Lake</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_LAKE
   * @model name="noLake"
   * @generated
   * @ordered
   */
  public static final int NO_LAKE_VALUE = 3;

  /**
   * An array of all the '<em><b>Condition Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConditionValue[] VALUES_ARRAY =
    new ConditionValue[]
    {
      BORDER,
      NO_BORDER,
      LAKE,
      NO_LAKE,
    };

  /**
   * A public read-only list of all the '<em><b>Condition Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConditionValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Condition Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConditionValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConditionValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Condition Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConditionValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConditionValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Condition Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConditionValue get(int value)
  {
    switch (value)
    {
      case BORDER_VALUE: return BORDER;
      case NO_BORDER_VALUE: return NO_BORDER;
      case LAKE_VALUE: return LAKE;
      case NO_LAKE_VALUE: return NO_LAKE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ConditionValue(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ConditionValue
