/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.PredicateStoreReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getPredicateStoreReference()
 * @model
 * @generated
 */
public interface PredicateStoreReference extends StoreExpression
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
   * @see #setRef(StoreExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getPredicateStoreReference_Ref()
   * @model containment="true"
   * @generated
   */
  StoreExpression getRef();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.PredicateStoreReference#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(StoreExpression value);

} // PredicateStoreReference
