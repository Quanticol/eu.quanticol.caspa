/**
 */
package eu.quanticol.cASPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Single Event Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getAssigner <em>Assigner</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.quanticol.cASPA.CASPAPackage#getLocalSingleEventUpdate()
 * @model
 * @generated
 */
public interface LocalSingleEventUpdate extends Updates
{
  /**
   * Returns the value of the '<em><b>Assignee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignee</em>' containment reference.
   * @see #setAssignee(StoreExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getLocalSingleEventUpdate_Assignee()
   * @model containment="true"
   * @generated
   */
  StoreExpression getAssignee();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getAssignee <em>Assignee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignee</em>' containment reference.
   * @see #getAssignee()
   * @generated
   */
  void setAssignee(StoreExpression value);

  /**
   * Returns the value of the '<em><b>Assigner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigner</em>' containment reference.
   * @see #setAssigner(UpdateExpression)
   * @see eu.quanticol.cASPA.CASPAPackage#getLocalSingleEventUpdate_Assigner()
   * @model containment="true"
   * @generated
   */
  UpdateExpression getAssigner();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getAssigner <em>Assigner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigner</em>' containment reference.
   * @see #getAssigner()
   * @generated
   */
  void setAssigner(UpdateExpression value);

} // LocalSingleEventUpdate
