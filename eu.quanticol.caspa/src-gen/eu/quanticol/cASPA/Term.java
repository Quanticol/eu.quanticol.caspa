/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.Term#getName <em>Name</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(eu.quanticol.cASPA.Process)
   * @see eu.quanticol.cASPA.CASPAPackage#getTerm_Name()
   * @model
   * @generated
   */
  eu.quanticol.cASPA.Process getName();

  /**
   * Sets the value of the '{@link eu.quanticol.cASPA.Term#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(eu.quanticol.cASPA.Process value);

  /**
   * Returns the value of the '<em><b>Stores</b></em>' reference list.
   * The list contents are of type {@link eu.quanticol.cASPA.Store}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stores</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stores</em>' reference list.
   * @see eu.quanticol.cASPA.CASPAPackage#getTerm_Stores()
   * @model
   * @generated
   */
  EList<Store> getStores();

} // Term
