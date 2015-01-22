/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Updates#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getUpdates()
 * @model
 * @generated
 */
public interface Updates extends EObject
{
  /**
   * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Updates}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updates</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getUpdates_Updates()
   * @model containment="true"
   * @generated
   */
  EList<Updates> getUpdates();

} // Updates
