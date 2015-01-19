/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.ActionEquality#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.ActionEquality#getOp <em>Op</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.ActionEquality#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getActionEquality()
 * @model
 * @generated
 */
public interface ActionEquality extends ActionExpression
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
   * @see eu.quanticol.cASPA.CASPAPackage#getActionEquality_Left()
   * @model containment="true"
   * @generated
   */
  ActionExpression getLeft();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ActionEquality#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ActionExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see eu.quanticol.cASPA.CASPAPackage#getActionEquality_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ActionEquality#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

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
   * @see eu.quanticol.cASPA.CASPAPackage#getActionEquality_Right()
   * @model containment="true"
   * @generated
   */
  ActionExpression getRight();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ActionEquality#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ActionExpression value);

} // ActionEquality
