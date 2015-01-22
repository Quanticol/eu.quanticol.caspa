/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TP Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.TPParallel#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.TPParallel#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getTPParallel()
 * @model
 * @generated
 */
public interface TPParallel extends ProcessExpression
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
   * @see #setLeft(ProcessExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getTPParallel_Left()
   * @model containment="true"
   * @generated
   */
  ProcessExpression getLeft();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.TPParallel#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ProcessExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ProcessExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getTPParallel_Right()
   * @model containment="true"
   * @generated
   */
  ProcessExpression getRight();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.TPParallel#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ProcessExpression value);

} // TPParallel
