/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Update Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.LocalUpdateExpression#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getLocalUpdateExpression()
 * @model
 * @generated
 */
public interface LocalUpdateExpression extends UpdateExpression
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
   * @see eu.quanticol.cASPA.CASPAPackage#getLocalUpdateExpression_Name()
   * @model containment="true"
   * @generated
   */
  SelfReferencedStore getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.LocalUpdateExpression#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(SelfReferencedStore value);

} // LocalUpdateExpression
