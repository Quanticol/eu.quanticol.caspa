/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.In#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getIn()
 * @model
 * @generated
 */
public interface In extends Evaluations
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.EvaluationExpressionIn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getIn_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<EvaluationExpressionIn> getExpressions();

} // In
