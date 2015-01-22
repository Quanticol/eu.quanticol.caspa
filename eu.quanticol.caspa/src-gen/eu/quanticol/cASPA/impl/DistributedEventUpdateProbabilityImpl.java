/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
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
 * An implementation of the model object '<em><b>Distributed Event Update Probability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributedEventUpdateProbabilityImpl extends UpdatesImpl implements DistributedEventUpdateProbability
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected StoreExpression name;

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
  protected DistributedEventUpdateProbabilityImpl()
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
    return CASPAPackage.Literals.DISTRIBUTED_EVENT_UPDATE_PROBABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoreExpression getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(StoreExpression newName, NotificationChain msgs)
  {
    StoreExpression oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(StoreExpression newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME, newName, newName));
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
      distribution = new EObjectContainmentEList<Updates>(Updates.class, this, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION);
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME:
        return basicSetName(null, msgs);
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION:
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME:
        return getName();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION:
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME:
        setName((StoreExpression)newValue);
        return;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION:
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME:
        setName((StoreExpression)null);
        return;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION:
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__NAME:
        return name != null;
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION:
        return distribution != null && !distribution.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DistributedEventUpdateProbabilityImpl
