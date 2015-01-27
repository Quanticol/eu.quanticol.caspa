/**
 */
package eu.quanticol.cASPA.util;

import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.Arguments;
import eu.quanticol.cASPA.BooleanConstant;
import eu.quanticol.cASPA.Broadcast;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.Distribution;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateAnd;
import eu.quanticol.cASPA.PredicateComparison;
import eu.quanticol.cASPA.PredicateDiv;
import eu.quanticol.cASPA.PredicateEquality;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateMul;
import eu.quanticol.cASPA.PredicateNot;
import eu.quanticol.cASPA.PredicateOr;
import eu.quanticol.cASPA.PredicatePlu;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ReferencedProcess;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.Uniform;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.cASPA.Updates;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.quanticol.cASPA.CASPAPackage
 * @generated
 */
public class CASPAAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CASPAPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CASPAAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CASPAPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CASPASwitch<Adapter> modelSwitch =
    new CASPASwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStoreExpression(StoreExpression object)
      {
        return createStoreExpressionAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter casePredicateExpression(PredicateExpression object)
      {
        return createPredicateExpressionAdapter();
      }
      @Override
      public Adapter caseArguments(Arguments object)
      {
        return createArgumentsAdapter();
      }
      @Override
      public Adapter caseUpdates(Updates object)
      {
        return createUpdatesAdapter();
      }
      @Override
      public Adapter caseUpdateExpression(UpdateExpression object)
      {
        return createUpdateExpressionAdapter();
      }
      @Override
      public Adapter caseProcess(eu.quanticol.cASPA.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessExpression(ProcessExpression object)
      {
        return createProcessExpressionAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseBooleanConstant(BooleanConstant object)
      {
        return createBooleanConstantAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter caseReferencedStore(ReferencedStore object)
      {
        return createReferencedStoreAdapter();
      }
      @Override
      public Adapter caseSelfReferencedStore(SelfReferencedStore object)
      {
        return createSelfReferencedStoreAdapter();
      }
      @Override
      public Adapter caseBroadcast(Broadcast object)
      {
        return createBroadcastAdapter();
      }
      @Override
      public Adapter caseUnicast(Unicast object)
      {
        return createUnicastAdapter();
      }
      @Override
      public Adapter casePredicateOr(PredicateOr object)
      {
        return createPredicateOrAdapter();
      }
      @Override
      public Adapter casePredicateAnd(PredicateAnd object)
      {
        return createPredicateAndAdapter();
      }
      @Override
      public Adapter casePredicateEquality(PredicateEquality object)
      {
        return createPredicateEqualityAdapter();
      }
      @Override
      public Adapter casePredicateComparison(PredicateComparison object)
      {
        return createPredicateComparisonAdapter();
      }
      @Override
      public Adapter casePredicateSub(PredicateSub object)
      {
        return createPredicateSubAdapter();
      }
      @Override
      public Adapter casePredicatePlu(PredicatePlu object)
      {
        return createPredicatePluAdapter();
      }
      @Override
      public Adapter casePredicateMul(PredicateMul object)
      {
        return createPredicateMulAdapter();
      }
      @Override
      public Adapter casePredicateDiv(PredicateDiv object)
      {
        return createPredicateDivAdapter();
      }
      @Override
      public Adapter casePredicateNot(PredicateNot object)
      {
        return createPredicateNotAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseIn(In object)
      {
        return createInAdapter();
      }
      @Override
      public Adapter caseOut(Out object)
      {
        return createOutAdapter();
      }
      @Override
      public Adapter caseLocalSingleEventUpdate(LocalSingleEventUpdate object)
      {
        return createLocalSingleEventUpdateAdapter();
      }
      @Override
      public Adapter caseDistributedEventUpdateProbability(DistributedEventUpdateProbability object)
      {
        return createDistributedEventUpdateProbabilityAdapter();
      }
      @Override
      public Adapter caseDistributedEventUpdateUniform(DistributedEventUpdateUniform object)
      {
        return createDistributedEventUpdateUniformAdapter();
      }
      @Override
      public Adapter caseDistribution(Distribution object)
      {
        return createDistributionAdapter();
      }
      @Override
      public Adapter caseUniform(Uniform object)
      {
        return createUniformAdapter();
      }
      @Override
      public Adapter caseUpdateSub(UpdateSub object)
      {
        return createUpdateSubAdapter();
      }
      @Override
      public Adapter caseUpdatePlu(UpdatePlu object)
      {
        return createUpdatePluAdapter();
      }
      @Override
      public Adapter caseUpdateMul(UpdateMul object)
      {
        return createUpdateMulAdapter();
      }
      @Override
      public Adapter caseUpdateDiv(UpdateDiv object)
      {
        return createUpdateDivAdapter();
      }
      @Override
      public Adapter caseParallel(Parallel object)
      {
        return createParallelAdapter();
      }
      @Override
      public Adapter caseChoice(Choice object)
      {
        return createChoiceAdapter();
      }
      @Override
      public Adapter caseLeaf(Leaf object)
      {
        return createLeafAdapter();
      }
      @Override
      public Adapter casePredicateProcess(PredicateProcess object)
      {
        return createPredicateProcessAdapter();
      }
      @Override
      public Adapter caseActionProcess(ActionProcess object)
      {
        return createActionProcessAdapter();
      }
      @Override
      public Adapter caseReferencedProcess(ReferencedProcess object)
      {
        return createReferencedProcessAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.StoreExpression <em>Store Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.StoreExpression
   * @generated
   */
  public Adapter createStoreExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateExpression <em>Predicate Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateExpression
   * @generated
   */
  public Adapter createPredicateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Arguments
   * @generated
   */
  public Adapter createArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Updates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Updates
   * @generated
   */
  public Adapter createUpdatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.UpdateExpression <em>Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.UpdateExpression
   * @generated
   */
  public Adapter createUpdateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ProcessExpression <em>Process Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ProcessExpression
   * @generated
   */
  public Adapter createProcessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.BooleanConstant <em>Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.BooleanConstant
   * @generated
   */
  public Adapter createBooleanConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Store
   * @generated
   */
  public Adapter createStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ReferencedStore <em>Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ReferencedStore
   * @generated
   */
  public Adapter createReferencedStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.SelfReferencedStore <em>Self Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.SelfReferencedStore
   * @generated
   */
  public Adapter createSelfReferencedStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Broadcast <em>Broadcast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Broadcast
   * @generated
   */
  public Adapter createBroadcastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Unicast <em>Unicast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Unicast
   * @generated
   */
  public Adapter createUnicastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateOr <em>Predicate Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateOr
   * @generated
   */
  public Adapter createPredicateOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateAnd <em>Predicate And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateAnd
   * @generated
   */
  public Adapter createPredicateAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateEquality <em>Predicate Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateEquality
   * @generated
   */
  public Adapter createPredicateEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateComparison <em>Predicate Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateComparison
   * @generated
   */
  public Adapter createPredicateComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateSub <em>Predicate Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateSub
   * @generated
   */
  public Adapter createPredicateSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicatePlu <em>Predicate Plu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicatePlu
   * @generated
   */
  public Adapter createPredicatePluAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateMul <em>Predicate Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateMul
   * @generated
   */
  public Adapter createPredicateMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateDiv <em>Predicate Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateDiv
   * @generated
   */
  public Adapter createPredicateDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateNot <em>Predicate Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateNot
   * @generated
   */
  public Adapter createPredicateNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.In
   * @generated
   */
  public Adapter createInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Out <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Out
   * @generated
   */
  public Adapter createOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.LocalSingleEventUpdate <em>Local Single Event Update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.LocalSingleEventUpdate
   * @generated
   */
  public Adapter createLocalSingleEventUpdateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.DistributedEventUpdateProbability <em>Distributed Event Update Probability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.DistributedEventUpdateProbability
   * @generated
   */
  public Adapter createDistributedEventUpdateProbabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.DistributedEventUpdateUniform <em>Distributed Event Update Uniform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.DistributedEventUpdateUniform
   * @generated
   */
  public Adapter createDistributedEventUpdateUniformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Distribution
   * @generated
   */
  public Adapter createDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Uniform <em>Uniform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Uniform
   * @generated
   */
  public Adapter createUniformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.UpdateSub <em>Update Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.UpdateSub
   * @generated
   */
  public Adapter createUpdateSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.UpdatePlu <em>Update Plu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.UpdatePlu
   * @generated
   */
  public Adapter createUpdatePluAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.UpdateMul <em>Update Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.UpdateMul
   * @generated
   */
  public Adapter createUpdateMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.UpdateDiv <em>Update Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.UpdateDiv
   * @generated
   */
  public Adapter createUpdateDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Parallel
   * @generated
   */
  public Adapter createParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Choice
   * @generated
   */
  public Adapter createChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Leaf <em>Leaf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Leaf
   * @generated
   */
  public Adapter createLeafAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.PredicateProcess <em>Predicate Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.PredicateProcess
   * @generated
   */
  public Adapter createPredicateProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionProcess <em>Action Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionProcess
   * @generated
   */
  public Adapter createActionProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ReferencedProcess <em>Referenced Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ReferencedProcess
   * @generated
   */
  public Adapter createReferencedProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CASPAAdapterFactory
