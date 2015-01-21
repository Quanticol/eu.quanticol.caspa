/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.ecore.EObject;

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
public interface Distribution extends EObject
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
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ActionExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getDistribution_Expression()
   * @model containment="true"
   * @generated
   */
  ActionExpression getExpression();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Distribution#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ActionExpression value);

} // Distribution
