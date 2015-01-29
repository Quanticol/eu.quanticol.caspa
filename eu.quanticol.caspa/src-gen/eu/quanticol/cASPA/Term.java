/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Term#getRef <em>Ref</em>}</li>
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
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ProcessExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getTerm_Ref()
   * @model containment="true"
   * @generated
   */
  ProcessExpression getRef();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Term#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ProcessExpression value);

  /**
   * Returns the value of the '<em><b>Stores</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stores</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stores</em>' containment reference.
   * @see #setStores(Stores)
   * @see eu.quanticol.cASPA.CASPAPackage#getTerm_Stores()
   * @model containment="true"
   * @generated
   */
  Stores getStores();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Term#getStores <em>Stores</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stores</em>' containment reference.
   * @see #getStores()
   * @generated
   */
  void setStores(Stores value);

} // Term
