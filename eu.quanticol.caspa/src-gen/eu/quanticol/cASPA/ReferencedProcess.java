/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.ReferencedProcess#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getReferencedProcess()
 * @model
 * @generated
 */
public interface ReferencedProcess extends ProcessExpression
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
   * @see #setName(eu.quanticol.cASPA.Process)
   * @see eu.quanticol.cASPA.CASPAPackage#getReferencedProcess_Name()
   * @model
   * @generated
   */
  eu.quanticol.cASPA.Process getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ReferencedProcess#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(eu.quanticol.cASPA.Process value);

} // ReferencedProcess
