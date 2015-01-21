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
 *   <li>{@link eu.quanticol.cASPA.Action#getArguments <em>Arguments</em>}</li>
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
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(Arguments)
   * @see eu.quanticol.cASPA.CASPAPackage#getAction_Arguments()
   * @model containment="true"
   * @generated
   */
  Arguments getArguments();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Action#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(Arguments value);

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
