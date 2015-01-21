/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Update Expression Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.LocalUpdateExpressionFunction#getName <em>Name</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.LocalUpdateExpressionFunction#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getLocalUpdateExpressionFunction()
 * @model
 * @generated
 */
public interface LocalUpdateExpressionFunction extends UpdateExpression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(SelfReferencedStore)
   * @see eu.quanticol.cASPA.CASPAPackage#getLocalUpdateExpressionFunction_Name()
   * @model containment="true"
   * @generated
   */
  SelfReferencedStore getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.LocalUpdateExpressionFunction#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(SelfReferencedStore value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(FunctionExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getLocalUpdateExpressionFunction_Expression()
   * @model containment="true"
   * @generated
   */
  FunctionExpression getExpression();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.LocalUpdateExpressionFunction#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(FunctionExpression value);

} // LocalUpdateExpressionFunction
