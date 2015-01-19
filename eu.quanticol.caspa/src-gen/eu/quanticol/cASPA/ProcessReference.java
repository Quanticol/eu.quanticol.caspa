/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.ProcessReference#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getProcessReference()
 * @model
 * @generated
 */
public interface ProcessReference extends ProcessExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(eu.quanticol.cASPA.Process)
   * @see eu.quanticol.cASPA.CASPAPackage#getProcessReference_Value()
   * @model
   * @generated
   */
  eu.quanticol.cASPA.Process getValue();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ProcessReference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(eu.quanticol.cASPA.Process value);

} // ProcessReference
