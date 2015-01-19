/**
 */
package eu.quanticol.cASPA.util;

import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionAnd;
import eu.quanticol.cASPA.ActionComparison;
import eu.quanticol.cASPA.ActionDiv;
import eu.quanticol.cASPA.ActionEquality;
import eu.quanticol.cASPA.ActionExpression;
import eu.quanticol.cASPA.ActionMul;
import eu.quanticol.cASPA.ActionNot;
import eu.quanticol.cASPA.ActionOr;
import eu.quanticol.cASPA.ActionPlu;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.ActionSub;
import eu.quanticol.cASPA.And;
import eu.quanticol.cASPA.BoolConstant;
import eu.quanticol.cASPA.Broadcast;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Comparison;
import eu.quanticol.cASPA.Div;
import eu.quanticol.cASPA.DoubleConstant;
import eu.quanticol.cASPA.Equality;
import eu.quanticol.cASPA.EvaluationExpressionIn;
import eu.quanticol.cASPA.EvaluationExpressionOut;
import eu.quanticol.cASPA.Evaluations;
import eu.quanticol.cASPA.Expression;
import eu.quanticol.cASPA.FreeEvaluationExpression;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.GlobalEvaluationExpression;
import eu.quanticol.cASPA.GlobalUpdateExpression;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalEvaluationExpression;
import eu.quanticol.cASPA.LocalUpdateExpression;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Mul;
import eu.quanticol.cASPA.Not;
import eu.quanticol.cASPA.Or;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Plu;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ProcessReference;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Sub;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.UpdateExpression;
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
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
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
      public Adapter caseEvaluations(Evaluations object)
      {
        return createEvaluationsAdapter();
      }
      @Override
      public Adapter caseUpdates(Updates object)
      {
        return createUpdatesAdapter();
      }
      @Override
      public Adapter casePredicateExpression(PredicateExpression object)
      {
        return createPredicateExpressionAdapter();
      }
      @Override
      public Adapter caseEvaluationExpressionIn(EvaluationExpressionIn object)
      {
        return createEvaluationExpressionInAdapter();
      }
      @Override
      public Adapter caseEvaluationExpressionOut(EvaluationExpressionOut object)
      {
        return createEvaluationExpressionOutAdapter();
      }
      @Override
      public Adapter caseUpdateExpression(UpdateExpression object)
      {
        return createUpdateExpressionAdapter();
      }
      @Override
      public Adapter caseSelfReferencedStore(SelfReferencedStore object)
      {
        return createSelfReferencedStoreAdapter();
      }
      @Override
      public Adapter caseActionExpression(ActionExpression object)
      {
        return createActionExpressionAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
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
      public Adapter caseProcessReference(ProcessReference object)
      {
        return createProcessReferenceAdapter();
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
      public Adapter caseLocalEvaluationExpression(LocalEvaluationExpression object)
      {
        return createLocalEvaluationExpressionAdapter();
      }
      @Override
      public Adapter caseGlobalEvaluationExpression(GlobalEvaluationExpression object)
      {
        return createGlobalEvaluationExpressionAdapter();
      }
      @Override
      public Adapter caseFreeEvaluationExpression(FreeEvaluationExpression object)
      {
        return createFreeEvaluationExpressionAdapter();
      }
      @Override
      public Adapter caseLocalUpdateExpression(LocalUpdateExpression object)
      {
        return createLocalUpdateExpressionAdapter();
      }
      @Override
      public Adapter caseGlobalUpdateExpression(GlobalUpdateExpression object)
      {
        return createGlobalUpdateExpressionAdapter();
      }
      @Override
      public Adapter caseActionOr(ActionOr object)
      {
        return createActionOrAdapter();
      }
      @Override
      public Adapter caseActionAnd(ActionAnd object)
      {
        return createActionAndAdapter();
      }
      @Override
      public Adapter caseActionEquality(ActionEquality object)
      {
        return createActionEqualityAdapter();
      }
      @Override
      public Adapter caseActionComparison(ActionComparison object)
      {
        return createActionComparisonAdapter();
      }
      @Override
      public Adapter caseActionSub(ActionSub object)
      {
        return createActionSubAdapter();
      }
      @Override
      public Adapter caseActionPlu(ActionPlu object)
      {
        return createActionPluAdapter();
      }
      @Override
      public Adapter caseActionMul(ActionMul object)
      {
        return createActionMulAdapter();
      }
      @Override
      public Adapter caseActionDiv(ActionDiv object)
      {
        return createActionDivAdapter();
      }
      @Override
      public Adapter caseActionNot(ActionNot object)
      {
        return createActionNotAdapter();
      }
      @Override
      public Adapter caseDoubleConstant(DoubleConstant object)
      {
        return createDoubleConstantAdapter();
      }
      @Override
      public Adapter caseFreeVariable(FreeVariable object)
      {
        return createFreeVariableAdapter();
      }
      @Override
      public Adapter caseBoolConstant(BoolConstant object)
      {
        return createBoolConstantAdapter();
      }
      @Override
      public Adapter caseReferencedStore(ReferencedStore object)
      {
        return createReferencedStoreAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter caseSub(Sub object)
      {
        return createSubAdapter();
      }
      @Override
      public Adapter casePlu(Plu object)
      {
        return createPluAdapter();
      }
      @Override
      public Adapter caseMul(Mul object)
      {
        return createMulAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Evaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Evaluations
   * @generated
   */
  public Adapter createEvaluationsAdapter()
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.EvaluationExpressionIn <em>Evaluation Expression In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.EvaluationExpressionIn
   * @generated
   */
  public Adapter createEvaluationExpressionInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.EvaluationExpressionOut <em>Evaluation Expression Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.EvaluationExpressionOut
   * @generated
   */
  public Adapter createEvaluationExpressionOutAdapter()
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionExpression
   * @generated
   */
  public Adapter createActionExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ProcessReference
   * @generated
   */
  public Adapter createProcessReferenceAdapter()
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.LocalEvaluationExpression <em>Local Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.LocalEvaluationExpression
   * @generated
   */
  public Adapter createLocalEvaluationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.GlobalEvaluationExpression <em>Global Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.GlobalEvaluationExpression
   * @generated
   */
  public Adapter createGlobalEvaluationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.FreeEvaluationExpression <em>Free Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.FreeEvaluationExpression
   * @generated
   */
  public Adapter createFreeEvaluationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.LocalUpdateExpression <em>Local Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.LocalUpdateExpression
   * @generated
   */
  public Adapter createLocalUpdateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.GlobalUpdateExpression <em>Global Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.GlobalUpdateExpression
   * @generated
   */
  public Adapter createGlobalUpdateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionOr <em>Action Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionOr
   * @generated
   */
  public Adapter createActionOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionAnd <em>Action And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionAnd
   * @generated
   */
  public Adapter createActionAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionEquality <em>Action Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionEquality
   * @generated
   */
  public Adapter createActionEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionComparison <em>Action Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionComparison
   * @generated
   */
  public Adapter createActionComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionSub <em>Action Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionSub
   * @generated
   */
  public Adapter createActionSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionPlu <em>Action Plu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionPlu
   * @generated
   */
  public Adapter createActionPluAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionMul <em>Action Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionMul
   * @generated
   */
  public Adapter createActionMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionDiv <em>Action Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionDiv
   * @generated
   */
  public Adapter createActionDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.ActionNot <em>Action Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.ActionNot
   * @generated
   */
  public Adapter createActionNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.DoubleConstant
   * @generated
   */
  public Adapter createDoubleConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.FreeVariable <em>Free Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.FreeVariable
   * @generated
   */
  public Adapter createFreeVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.BoolConstant
   * @generated
   */
  public Adapter createBoolConstantAdapter()
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
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Sub
   * @generated
   */
  public Adapter createSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Plu <em>Plu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Plu
   * @generated
   */
  public Adapter createPluAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Mul <em>Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Mul
   * @generated
   */
  public Adapter createMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.quanticol.cASPA.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.quanticol.cASPA.Not
   * @generated
   */
  public Adapter createNotAdapter()
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
