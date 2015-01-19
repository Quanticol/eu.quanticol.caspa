/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Action#getName <em>Name</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Action#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Action#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Action#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.quanticol.cASPA.CASPAPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Predicate)
   * @see eu.quanticol.cASPA.CASPAPackage#getAction_Predicate()
   * @model containment="true"
   * @generated
   */
  Predicate getPredicate();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Action#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Predicate value);

  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference.
   * @see #setEvaluations(Evaluations)
   * @see eu.quanticol.cASPA.CASPAPackage#getAction_Evaluations()
   * @model containment="true"
   * @generated
   */
  Evaluations getEvaluations();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Action#getEvaluations <em>Evaluations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluations</em>' containment reference.
   * @see #getEvaluations()
   * @generated
   */
  void setEvaluations(Evaluations value);

  /**
   * Returns the value of the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updates</em>' containment reference.
   * @see #setUpdates(Updates)
   * @see eu.quanticol.cASPA.CASPAPackage#getAction_Updates()
   * @model containment="true"
   * @generated
   */
  Updates getUpdates();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Action#getUpdates <em>Updates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updates</em>' containment reference.
   * @see #getUpdates()
   * @generated
   */
  void setUpdates(Updates value);

} // Action
