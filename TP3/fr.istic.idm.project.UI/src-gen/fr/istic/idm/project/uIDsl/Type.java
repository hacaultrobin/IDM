/**
 */
package fr.istic.idm.project.uIDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.istic.idm.project.uIDsl.UIDslPackage#getType()
 * @model
 * @generated
 */
public enum Type implements Enumerator
{
  /**
   * The '<em><b>Check Box</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHECK_BOX_VALUE
   * @generated
   * @ordered
   */
  CHECK_BOX(0, "CheckBox", "0"),

  /**
   * The '<em><b>Radio Button</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RADIO_BUTTON_VALUE
   * @generated
   * @ordered
   */
  RADIO_BUTTON(1, "RadioButton", "1"),

  /**
   * The '<em><b>Combo Box</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMBO_BOX_VALUE
   * @generated
   * @ordered
   */
  COMBO_BOX(2, "ComboBox", "2"),

  /**
   * The '<em><b>Text Box</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_BOX_VALUE
   * @generated
   * @ordered
   */
  TEXT_BOX(3, "TextBox", "3"),

  /**
   * The '<em><b>Image</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAGE_VALUE
   * @generated
   * @ordered
   */
  IMAGE(4, "Image", "4");

  /**
   * The '<em><b>Check Box</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Check Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHECK_BOX
   * @model name="CheckBox" literal="0"
   * @generated
   * @ordered
   */
  public static final int CHECK_BOX_VALUE = 0;

  /**
   * The '<em><b>Radio Button</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Radio Button</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RADIO_BUTTON
   * @model name="RadioButton" literal="1"
   * @generated
   * @ordered
   */
  public static final int RADIO_BUTTON_VALUE = 1;

  /**
   * The '<em><b>Combo Box</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Combo Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMBO_BOX
   * @model name="ComboBox" literal="2"
   * @generated
   * @ordered
   */
  public static final int COMBO_BOX_VALUE = 2;

  /**
   * The '<em><b>Text Box</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT_BOX
   * @model name="TextBox" literal="3"
   * @generated
   * @ordered
   */
  public static final int TEXT_BOX_VALUE = 3;

  /**
   * The '<em><b>Image</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Image</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMAGE
   * @model name="Image" literal="4"
   * @generated
   * @ordered
   */
  public static final int IMAGE_VALUE = 4;

  /**
   * An array of all the '<em><b>Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Type[] VALUES_ARRAY =
    new Type[]
    {
      CHECK_BOX,
      RADIO_BUTTON,
      COMBO_BOX,
      TEXT_BOX,
      IMAGE,
    };

  /**
   * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Type result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Type result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type get(int value)
  {
    switch (value)
    {
      case CHECK_BOX_VALUE: return CHECK_BOX;
      case RADIO_BUTTON_VALUE: return RADIO_BUTTON;
      case COMBO_BOX_VALUE: return COMBO_BOX;
      case TEXT_BOX_VALUE: return TEXT_BOX;
      case IMAGE_VALUE: return IMAGE;
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
  private Type(int value, String name, String literal)
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
  
} //Type
