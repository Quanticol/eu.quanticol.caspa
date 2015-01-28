/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.Updates;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distributed Event Update Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl#getAssigner <em>Assigner</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributedEventUpdateUniformImpl extends UpdatesImpl implements DistributedEventUpdateUniform
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
   * The cached value of the '{@link #getAssigner() <em>Assigner</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigner()
   * @generated
   * @ordered
   */
  protected EList<Updates> assigner;

  /**
   * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribution()
   * @generated
   * @ordered
   */
  protected EList<Updates> distribution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DistributedEventUpdateUniformImpl()
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
    return CASPAPackage.Literals.DISTRIBUTED_EVENT_UPDATE_UNIFORM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE, oldAssignee, newAssignee);
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
        msgs = ((InternalEObject)assignee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE, null, msgs);
      if (newAssignee != null)
        msgs = ((InternalEObject)newAssignee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE, null, msgs);
      msgs = basicSetAssignee(newAssignee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE, newAssignee, newAssignee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Updates> getAssigner()
  {
    if (assigner == null)
    {
      assigner = new EObjectContainmentEList<Updates>(Updates.class, this, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER);
    }
    return assigner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Updates> getDistribution()
  {
    if (distribution == null)
    {
      distribution = new EObjectContainmentEList<Updates>(Updates.class, this, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION);
    }
    return distribution;
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE:
        return basicSetAssignee(null, msgs);
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER:
        return ((InternalEList<?>)getAssigner()).basicRemove(otherEnd, msgs);
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        return ((InternalEList<?>)getDistribution()).basicRemove(otherEnd, msgs);
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE:
        return getAssignee();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER:
        return getAssigner();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        return getDistribution();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE:
        setAssignee((StoreExpression)newValue);
        return;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER:
        getAssigner().clear();
        getAssigner().addAll((Collection<? extends Updates>)newValue);
        return;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        getDistribution().clear();
        getDistribution().addAll((Collection<? extends Updates>)newValue);
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE:
        setAssignee((StoreExpression)null);
        return;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER:
        getAssigner().clear();
        return;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        getDistribution().clear();
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE:
        return assignee != null;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER:
        return assigner != null && !assigner.isEmpty();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        return distribution != null && !distribution.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DistributedEventUpdateUniformImpl
