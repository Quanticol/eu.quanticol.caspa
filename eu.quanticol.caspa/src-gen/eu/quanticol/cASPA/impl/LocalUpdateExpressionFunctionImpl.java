/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.FunctionExpression;
import eu.quanticol.cASPA.LocalUpdateExpressionFunction;
import eu.quanticol.cASPA.SelfReferencedStore;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Update Expression Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.quanticol.cASPA.impl.LocalUpdateExpressionFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.quanticol.cASPA.impl.LocalUpdateExpressionFunctionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalUpdateExpressionFunctionImpl extends UpdateExpressionImpl implements LocalUpdateExpressionFunction
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected SelfReferencedStore name;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected FunctionExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalUpdateExpressionFunctionImpl()
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
    return CASPAPackage.Literals.LOCAL_UPDATE_EXPRESSION_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfReferencedStore getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(SelfReferencedStore newName, NotificationChain msgs)
  {
    SelfReferencedStore oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(SelfReferencedStore newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(FunctionExpression newExpression, NotificationChain msgs)
  {
    FunctionExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(FunctionExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION, newExpression, newExpression));
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
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME:
        return basicSetName(null, msgs);
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME:
        return getName();
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION:
        return getExpression();
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
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME:
        setName((SelfReferencedStore)newValue);
        return;
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION:
        setExpression((FunctionExpression)newValue);
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
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME:
        setName((SelfReferencedStore)null);
        return;
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION:
        setExpression((FunctionExpression)null);
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
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__NAME:
        return name != null;
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION_FUNCTION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalUpdateExpressionFunctionImpl
