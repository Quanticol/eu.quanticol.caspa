/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Model#getStores <em>Stores</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Model#getProcesses <em>Processes</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Model#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Stores</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Store}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stores</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getModel_Stores()
   * @model containment="true"
   * @generated
   */
  EList<Store> getStores();

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getModel_Processes()
   * @model containment="true"
   * @generated
   */
  EList<eu.quanticol.cASPA.Process> getProcesses();

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getModel_Terms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getTerms();

} // Model
