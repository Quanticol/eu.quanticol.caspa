/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Term#getProcesses <em>Processes</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Term#getStores <em>Stores</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
{
  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference.
   * @see #setProcesses(ProcessExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getTerm_Processes()
   * @model containment="true"
   * @generated
   */
  ProcessExpression getProcesses();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Term#getProcesses <em>Processes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processes</em>' containment reference.
   * @see #getProcesses()
   * @generated
   */
  void setProcesses(ProcessExpression value);

  /**
   * Returns the value of the '<em><b>Stores</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.StoreExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stores</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getTerm_Stores()
   * @model containment="true"
   * @generated
   */
  EList<StoreExpression> getStores();

} // Term
