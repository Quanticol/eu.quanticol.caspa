/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Mul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.ActionMul#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.ActionMul#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getActionMul()
 * @model
 * @generated
 */
public interface ActionMul extends ActionExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ActionExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getActionMul_Left()
   * @model containment="true"
   * @generated
   */
  ActionExpression getLeft();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ActionMul#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ActionExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ActionExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getActionMul_Right()
   * @model containment="true"
   * @generated
   */
  ActionExpression getRight();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ActionMul#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ActionExpression value);

} // ActionMul
