/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.DistributionReference#getProb <em>Prob</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.DistributionReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getDistributionReference()
 * @model
 * @generated
 */
public interface DistributionReference extends StoreExpression
{
  /**
   * Returns the value of the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prob</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prob</em>' attribute.
   * @see #setProb(double)
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributionReference_Prob()
   * @model
   * @generated
   */
  double getProb();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.DistributionReference#getProb <em>Prob</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prob</em>' attribute.
   * @see #getProb()
   * @generated
   */
  void setProb(double value);

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
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributionReference_Ref()
   * @model containment="true"
   * @generated
   */
  StoreExpression getRef();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.DistributionReference#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(StoreExpression value);

} // DistributionReference
