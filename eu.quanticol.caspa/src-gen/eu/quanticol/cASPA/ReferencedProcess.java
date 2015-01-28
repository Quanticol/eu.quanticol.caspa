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
 *   <li>{@link eu.quanticol.cASPA.ReferencedProcess#getRef <em>Ref</em>}</li>
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
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(eu.quanticol.cASPA.Process)
   * @see eu.quanticol.cASPA.CASPAPackage#getReferencedProcess_Ref()
   * @model
   * @generated
   */
  eu.quanticol.cASPA.Process getRef();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.ReferencedProcess#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(eu.quanticol.cASPA.Process value);

} // ReferencedProcess
