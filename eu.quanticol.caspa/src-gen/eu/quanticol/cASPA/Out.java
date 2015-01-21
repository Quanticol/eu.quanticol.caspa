/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Out#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getOut()
 * @model
 * @generated
 */
public interface Out extends Arguments
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.OutArguments}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getOut_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<OutArguments> getExpressions();

} // Out
