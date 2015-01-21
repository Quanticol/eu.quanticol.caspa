/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Uniform#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getUniform()
 * @model
 * @generated
 */
public interface Uniform extends EObject
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
   * @see #setExpression(ActionExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getUniform_Expression()
   * @model containment="true"
   * @generated
   */
  ActionExpression getExpression();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Uniform#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ActionExpression value);

} // Uniform
