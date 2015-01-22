/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributed Event Update Probability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.DistributedEventUpdateProbability#getName <em>Name</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.DistributedEventUpdateProbability#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getDistributedEventUpdateProbability()
 * @model
 * @generated
 */
public interface DistributedEventUpdateProbability extends Updates
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
   * @see #setName(StoreExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributedEventUpdateProbability_Name()
   * @model containment="true"
   * @generated
   */
  StoreExpression getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.DistributedEventUpdateProbability#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(StoreExpression value);

  /**
   * Returns the value of the '<em><b>Distribution</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Updates}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributedEventUpdateProbability_Distribution()
   * @model containment="true"
   * @generated
   */
  EList<Updates> getDistribution();

} // DistributedEventUpdateProbability
