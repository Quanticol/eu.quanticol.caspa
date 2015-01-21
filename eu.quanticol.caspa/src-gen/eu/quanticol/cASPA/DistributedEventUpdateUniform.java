/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributed Event Update Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.DistributedEventUpdateUniform#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getDistributedEventUpdateUniform()
 * @model
 * @generated
 */
public interface DistributedEventUpdateUniform extends DistributedEventUpdate
{
  /**
   * Returns the value of the '<em><b>Distribution</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Uniform}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributedEventUpdateUniform_Distribution()
   * @model containment="true"
   * @generated
   */
  EList<Uniform> getDistribution();

} // DistributedEventUpdateUniform