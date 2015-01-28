/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.UpdateExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Single Event Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl#getAssigner <em>Assigner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalSingleEventUpdateImpl extends UpdatesImpl implements LocalSingleEventUpdate
{
  /**
   * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignee()
   * @generated
   * @ordered
   */
  protected StoreExpression assignee;

  /**
   * The cached value of the '{@link #getAssigner() <em>Assigner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigner()
   * @generated
   * @ordered
   */
  protected UpdateExpression assigner;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalSingleEventUpdateImpl()
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
    return CASPAPackage.Literals.LOCAL_SINGLE_EVENT_UPDATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoreExpression getAssignee()
  {
    return assignee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignee(StoreExpression newAssignee, NotificationChain msgs)
  {
    StoreExpression oldAssignee = assignee;
    assignee = newAssignee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE, oldAssignee, newAssignee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignee(StoreExpression newAssignee)
  {
    if (newAssignee != assignee)
    {
      NotificationChain msgs = null;
      if (assignee != null)
        msgs = ((InternalEObject)assignee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE, null, msgs);
      if (newAssignee != null)
        msgs = ((InternalEObject)newAssignee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE, null, msgs);
      msgs = basicSetAssignee(newAssignee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE, newAssignee, newAssignee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateExpression getAssigner()
  {
    return assigner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssigner(UpdateExpression newAssigner, NotificationChain msgs)
  {
    UpdateExpression oldAssigner = assigner;
    assigner = newAssigner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER, oldAssigner, newAssigner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssigner(UpdateExpression newAssigner)
  {
    if (newAssigner != assigner)
    {
      NotificationChain msgs = null;
      if (assigner != null)
        msgs = ((InternalEObject)assigner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER, null, msgs);
      if (newAssigner != null)
        msgs = ((InternalEObject)newAssigner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER, null, msgs);
      msgs = basicSetAssigner(newAssigner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER, newAssigner, newAssigner));
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
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE:
        return basicSetAssignee(null, msgs);
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER:
        return basicSetAssigner(null, msgs);
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
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE:
        return getAssignee();
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER:
        return getAssigner();
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
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE:
        setAssignee((StoreExpression)newValue);
        return;
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER:
        setAssigner((UpdateExpression)newValue);
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
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE:
        setAssignee((StoreExpression)null);
        return;
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER:
        setAssigner((UpdateExpression)null);
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
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE:
        return assignee != null;
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER:
        return assigner != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalSingleEventUpdateImpl
