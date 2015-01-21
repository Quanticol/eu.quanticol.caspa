/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Plu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.UpdatePlu#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.UpdatePlu#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getUpdatePlu()
 * @model
 * @generated
 */
public interface UpdatePlu extends UpdateExpression
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
   * @see #setLeft(UpdateExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getUpdatePlu_Left()
   * @model containment="true"
   * @generated
   */
  UpdateExpression getLeft();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.UpdatePlu#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UpdateExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(UpdateExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getUpdatePlu_Right()
   * @model containment="true"
   * @generated
   */
  UpdateExpression getRight();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.UpdatePlu#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(UpdateExpression value);

} // UpdatePlu
