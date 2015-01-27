/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.TermImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.TermImpl#getStores <em>Stores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term
{
  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected ProcessExpression processes;

  /**
   * The cached value of the '{@link #getStores() <em>Stores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStores()
   * @generated
   * @ordered
   */
  protected EList<StoreExpression> stores;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return CASPAPackage.Literals.TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessExpression getProcesses()
  {
    return processes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcesses(ProcessExpression newProcesses, NotificationChain msgs)
  {
    ProcessExpression oldProcesses = processes;
    processes = newProcesses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.TERM__PROCESSES, oldProcesses, newProcesses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcesses(ProcessExpression newProcesses)
  {
    if (newProcesses != processes)
    {
      NotificationChain msgs = null;
      if (processes != null)
        msgs = ((InternalEObject)processes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.TERM__PROCESSES, null, msgs);
      if (newProcesses != null)
        msgs = ((InternalEObject)newProcesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.TERM__PROCESSES, null, msgs);
      msgs = basicSetProcesses(newProcesses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.TERM__PROCESSES, newProcesses, newProcesses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StoreExpression> getStores()
  {
    if (stores == null)
    {
      stores = new EObjectContainmentEList<StoreExpression>(StoreExpression.class, this, CASPAPackage.TERM__STORES);
    }
    return stores;
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
      case CASPAPackage.TERM__PROCESSES:
        return basicSetProcesses(null, msgs);
      case CASPAPackage.TERM__STORES:
        return ((InternalEList<?>)getStores()).basicRemove(otherEnd, msgs);
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
      case CASPAPackage.TERM__PROCESSES:
        return getProcesses();
      case CASPAPackage.TERM__STORES:
        return getStores();
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
      case CASPAPackage.TERM__PROCESSES:
        setProcesses((ProcessExpression)newValue);
        return;
      case CASPAPackage.TERM__STORES:
        getStores().clear();
        getStores().addAll((Collection<? extends StoreExpression>)newValue);
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
      case CASPAPackage.TERM__PROCESSES:
        setProcesses((ProcessExpression)null);
        return;
      case CASPAPackage.TERM__STORES:
        getStores().clear();
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
      case CASPAPackage.TERM__PROCESSES:
        return processes != null;
      case CASPAPackage.TERM__STORES:
        return stores != null && !stores.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TermImpl
