/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Distribution#getProb <em>Prob</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.Distribution#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getDistribution()
 * @model
 * @generated
 */
public interface Distribution extends Updates
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
   * @see eu.quanticol.cASPA.CASPAPackage#getDistribution_Prob()
   * @model
   * @generated
   */
  double getProb();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Distribution#getProb <em>Prob</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prob</em>' attribute.
   * @see #getProb()
   * @generated
   */
  void setProb(double value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see eu.quanticol.cASPA.CASPAPackage#getDistribution_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Distribution#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

} // Distribution
