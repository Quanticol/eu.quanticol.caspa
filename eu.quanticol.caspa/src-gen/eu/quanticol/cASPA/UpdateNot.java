/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.UpdateNot#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getUpdateNot()
 * @model
 * @generated
 */
public interface UpdateNot extends UpdateExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(UpdateExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getUpdateNot_Expression()
   * @model containment="true"
   * @generated
   */
  UpdateExpression getExpression();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.UpdateNot#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(UpdateExpression value);

} // UpdateNot
