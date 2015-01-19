/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Evaluations;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.Updates;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.ActionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.ActionImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.ActionImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected Predicate predicate;

  /**
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected Evaluations evaluations;

  /**
   * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdates()
   * @generated
   * @ordered
   */
  protected Updates updates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CASPAPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(Predicate newPredicate, NotificationChain msgs)
  {
    Predicate oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__PREDICATE, oldPredicate, newPredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(Predicate newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.ACTION__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.ACTION__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__PREDICATE, newPredicate, newPredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluations getEvaluations()
  {
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluations(Evaluations newEvaluations, NotificationChain msgs)
  {
    Evaluations oldEvaluations = evaluations;
    evaluations = newEvaluations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__EVALUATIONS, oldEvaluations, newEvaluations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluations(Evaluations newEvaluations)
  {
    if (newEvaluations != evaluations)
    {
      NotificationChain msgs = null;
      if (evaluations != null)
        msgs = ((InternalEObject)evaluations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.ACTION__EVALUATIONS, null, msgs);
      if (newEvaluations != null)
        msgs = ((InternalEObject)newEvaluations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.ACTION__EVALUATIONS, null, msgs);
      msgs = basicSetEvaluations(newEvaluations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__EVALUATIONS, newEvaluations, newEvaluations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updates getUpdates()
  {
    return updates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdates(Updates newUpdates, NotificationChain msgs)
  {
    Updates oldUpdates = updates;
    updates = newUpdates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__UPDATES, oldUpdates, newUpdates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdates(Updates newUpdates)
  {
    if (newUpdates != updates)
    {
      NotificationChain msgs = null;
      if (updates != null)
        msgs = ((InternalEObject)updates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.ACTION__UPDATES, null, msgs);
      if (newUpdates != null)
        msgs = ((InternalEObject)newUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.ACTION__UPDATES, null, msgs);
      msgs = basicSetUpdates(newUpdates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.ACTION__UPDATES, newUpdates, newUpdates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CASPAPackage.ACTION__PREDICATE:
        return basicSetPredicate(null, msgs);
      case CASPAPackage.ACTION__EVALUATIONS:
        return basicSetEvaluations(null, msgs);
      case CASPAPackage.ACTION__UPDATES:
        return basicSetUpdates(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CASPAPackage.ACTION__NAME:
        return getName();
      case CASPAPackage.ACTION__PREDICATE:
        return getPredicate();
      case CASPAPackage.ACTION__EVALUATIONS:
        return getEvaluations();
      case CASPAPackage.ACTION__UPDATES:
        return getUpdates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CASPAPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case CASPAPackage.ACTION__PREDICATE:
        setPredicate((Predicate)newValue);
        return;
      case CASPAPackage.ACTION__EVALUATIONS:
        setEvaluations((Evaluations)newValue);
        return;
      case CASPAPackage.ACTION__UPDATES:
        setUpdates((Updates)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CASPAPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CASPAPackage.ACTION__PREDICATE:
        setPredicate((Predicate)null);
        return;
      case CASPAPackage.ACTION__EVALUATIONS:
        setEvaluations((Evaluations)null);
        return;
      case CASPAPackage.ACTION__UPDATES:
        setUpdates((Updates)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CASPAPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CASPAPackage.ACTION__PREDICATE:
        return predicate != null;
      case CASPAPackage.ACTION__EVALUATIONS:
        return evaluations != null;
      case CASPAPackage.ACTION__UPDATES:
        return updates != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
