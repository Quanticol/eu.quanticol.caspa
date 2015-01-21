/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.Uniform;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distributed Event Update Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributedEventUpdateUniformImpl extends DistributedEventUpdateImpl implements DistributedEventUpdateUniform
{
  /**
   * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribution()
   * @generated
   * @ordered
   */
  protected EList<Uniform> distribution;

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
  public EList<Uniform> getDistribution()
  {
    if (distribution == null)
    {
      distribution = new EObjectContainmentEList<Uniform>(Uniform.class, this, CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION);
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        getDistribution().clear();
        getDistribution().addAll((Collection<? extends Uniform>)newValue);
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
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION:
        return distribution != null && !distribution.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DistributedEventUpdateUniformImpl
