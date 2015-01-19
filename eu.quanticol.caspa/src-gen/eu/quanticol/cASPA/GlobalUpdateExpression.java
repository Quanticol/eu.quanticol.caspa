/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Update Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.GlobalUpdateExpression#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getGlobalUpdateExpression()
 * @model
 * @generated
 */
public interface GlobalUpdateExpression extends UpdateExpression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Store)
   * @see eu.quanticol.cASPA.CASPAPackage#getGlobalUpdateExpression_Name()
   * @model
   * @generated
   */
  Store getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.GlobalUpdateExpression#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Store value);

} // GlobalUpdateExpression
