/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Natural</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.DistributionNatural#getProb <em>Prob</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.DistributionNatural#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getDistributionNatural()
 * @model
 * @generated
 */
public interface DistributionNatural extends Updates
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
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributionNatural_Prob()
   * @model
   * @generated
   */
  double getProb();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.DistributionNatural#getProb <em>Prob</em>}' attribute.
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
   * @see #setExpression(int)
   * @see eu.quanticol.cASPA.CASPAPackage#getDistributionNatural_Expression()
   * @model
   * @generated
   */
  int getExpression();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.DistributionNatural#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(int value);

} // DistributionNatural
