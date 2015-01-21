/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.FunctionExpression#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getFunctionExpression()
 * @model
 * @generated
 */
public interface FunctionExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Distribution</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getFunctionExpression_Distribution()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getDistribution();

} // FunctionExpression
