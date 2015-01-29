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
import eu.quanticol.cASPA.DistributionNatural;
import eu.quanticol.cASPA.DistributionReference;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.OutStoreReference;
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
import eu.quanticol.cASPA.PredicateStoreReference;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.Reference;
import eu.quanticol.cASPA.ReferencedProcess;
import eu.quanticol.cASPA.SelfReference;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.UniformNatural;
import eu.quanticol.cASPA.UniformReference;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateExpressionStoreReference;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateStoreReference;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.cASPA.Updates;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.quanticol.cASPA.CASPAPackage
 * @generated
 */
public class CASPASwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CASPAPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CASPASwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CASPAPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CASPAPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.STORE_EXPRESSION:
      {
        StoreExpression storeExpression = (StoreExpression)theEObject;
        T result = caseStoreExpression(storeExpression);
        if (result == null) result = casePredicateExpression(storeExpression);
        if (result == null) result = caseArguments(storeExpression);
        if (result == null) result = caseUpdates(storeExpression);
        if (result == null) result = caseUpdateExpression(storeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_EXPRESSION:
      {
        PredicateExpression predicateExpression = (PredicateExpression)theEObject;
        T result = casePredicateExpression(predicateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ARGUMENTS:
      {
        Arguments arguments = (Arguments)theEObject;
        T result = caseArguments(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATES:
      {
        Updates updates = (Updates)theEObject;
        T result = caseUpdates(updates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_EXPRESSION:
      {
        UpdateExpression updateExpression = (UpdateExpression)theEObject;
        T result = caseUpdateExpression(updateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PROCESS:
      {
        eu.quanticol.cASPA.Process process = (eu.quanticol.cASPA.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PROCESS_EXPRESSION:
      {
        ProcessExpression processExpression = (ProcessExpression)theEObject;
        T result = caseProcessExpression(processExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.BOOLEAN_CONSTANT:
      {
        BooleanConstant booleanConstant = (BooleanConstant)theEObject;
        T result = caseBooleanConstant(booleanConstant);
        if (result == null) result = casePredicateExpression(booleanConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = caseStoreExpression(store);
        if (result == null) result = casePredicateExpression(store);
        if (result == null) result = caseArguments(store);
        if (result == null) result = caseUpdates(store);
        if (result == null) result = caseUpdateExpression(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseStoreExpression(reference);
        if (result == null) result = casePredicateExpression(reference);
        if (result == null) result = caseArguments(reference);
        if (result == null) result = caseUpdates(reference);
        if (result == null) result = caseUpdateExpression(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.SELF_REFERENCE:
      {
        SelfReference selfReference = (SelfReference)theEObject;
        T result = caseSelfReference(selfReference);
        if (result == null) result = caseStoreExpression(selfReference);
        if (result == null) result = casePredicateExpression(selfReference);
        if (result == null) result = caseArguments(selfReference);
        if (result == null) result = caseUpdates(selfReference);
        if (result == null) result = caseUpdateExpression(selfReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.FREE_VARIABLE:
      {
        FreeVariable freeVariable = (FreeVariable)theEObject;
        T result = caseFreeVariable(freeVariable);
        if (result == null) result = caseStoreExpression(freeVariable);
        if (result == null) result = casePredicateExpression(freeVariable);
        if (result == null) result = caseArguments(freeVariable);
        if (result == null) result = caseUpdates(freeVariable);
        if (result == null) result = caseUpdateExpression(freeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.BROADCAST:
      {
        Broadcast broadcast = (Broadcast)theEObject;
        T result = caseBroadcast(broadcast);
        if (result == null) result = caseAction(broadcast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UNICAST:
      {
        Unicast unicast = (Unicast)theEObject;
        T result = caseUnicast(unicast);
        if (result == null) result = caseAction(unicast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_OR:
      {
        PredicateOr predicateOr = (PredicateOr)theEObject;
        T result = casePredicateOr(predicateOr);
        if (result == null) result = casePredicateExpression(predicateOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_AND:
      {
        PredicateAnd predicateAnd = (PredicateAnd)theEObject;
        T result = casePredicateAnd(predicateAnd);
        if (result == null) result = casePredicateExpression(predicateAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_EQUALITY:
      {
        PredicateEquality predicateEquality = (PredicateEquality)theEObject;
        T result = casePredicateEquality(predicateEquality);
        if (result == null) result = casePredicateExpression(predicateEquality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_COMPARISON:
      {
        PredicateComparison predicateComparison = (PredicateComparison)theEObject;
        T result = casePredicateComparison(predicateComparison);
        if (result == null) result = casePredicateExpression(predicateComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_SUB:
      {
        PredicateSub predicateSub = (PredicateSub)theEObject;
        T result = casePredicateSub(predicateSub);
        if (result == null) result = casePredicateExpression(predicateSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_PLU:
      {
        PredicatePlu predicatePlu = (PredicatePlu)theEObject;
        T result = casePredicatePlu(predicatePlu);
        if (result == null) result = casePredicateExpression(predicatePlu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_MUL:
      {
        PredicateMul predicateMul = (PredicateMul)theEObject;
        T result = casePredicateMul(predicateMul);
        if (result == null) result = casePredicateExpression(predicateMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_DIV:
      {
        PredicateDiv predicateDiv = (PredicateDiv)theEObject;
        T result = casePredicateDiv(predicateDiv);
        if (result == null) result = casePredicateExpression(predicateDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_NOT:
      {
        PredicateNot predicateNot = (PredicateNot)theEObject;
        T result = casePredicateNot(predicateNot);
        if (result == null) result = casePredicateExpression(predicateNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = casePredicateExpression(constant);
        if (result == null) result = caseArguments(constant);
        if (result == null) result = caseUpdateExpression(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_STORE_REFERENCE:
      {
        PredicateStoreReference predicateStoreReference = (PredicateStoreReference)theEObject;
        T result = casePredicateStoreReference(predicateStoreReference);
        if (result == null) result = caseStoreExpression(predicateStoreReference);
        if (result == null) result = casePredicateExpression(predicateStoreReference);
        if (result == null) result = caseArguments(predicateStoreReference);
        if (result == null) result = caseUpdates(predicateStoreReference);
        if (result == null) result = caseUpdateExpression(predicateStoreReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.IN:
      {
        In in = (In)theEObject;
        T result = caseIn(in);
        if (result == null) result = caseArguments(in);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.OUT:
      {
        Out out = (Out)theEObject;
        T result = caseOut(out);
        if (result == null) result = caseArguments(out);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.OUT_STORE_REFERENCE:
      {
        OutStoreReference outStoreReference = (OutStoreReference)theEObject;
        T result = caseOutStoreReference(outStoreReference);
        if (result == null) result = caseStoreExpression(outStoreReference);
        if (result == null) result = casePredicateExpression(outStoreReference);
        if (result == null) result = caseArguments(outStoreReference);
        if (result == null) result = caseUpdates(outStoreReference);
        if (result == null) result = caseUpdateExpression(outStoreReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE:
      {
        LocalSingleEventUpdate localSingleEventUpdate = (LocalSingleEventUpdate)theEObject;
        T result = caseLocalSingleEventUpdate(localSingleEventUpdate);
        if (result == null) result = caseUpdates(localSingleEventUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY:
      {
        DistributedEventUpdateProbability distributedEventUpdateProbability = (DistributedEventUpdateProbability)theEObject;
        T result = caseDistributedEventUpdateProbability(distributedEventUpdateProbability);
        if (result == null) result = caseUpdates(distributedEventUpdateProbability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM:
      {
        DistributedEventUpdateUniform distributedEventUpdateUniform = (DistributedEventUpdateUniform)theEObject;
        T result = caseDistributedEventUpdateUniform(distributedEventUpdateUniform);
        if (result == null) result = caseUpdates(distributedEventUpdateUniform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_STORE_REFERENCE:
      {
        UpdateStoreReference updateStoreReference = (UpdateStoreReference)theEObject;
        T result = caseUpdateStoreReference(updateStoreReference);
        if (result == null) result = caseStoreExpression(updateStoreReference);
        if (result == null) result = casePredicateExpression(updateStoreReference);
        if (result == null) result = caseArguments(updateStoreReference);
        if (result == null) result = caseUpdates(updateStoreReference);
        if (result == null) result = caseUpdateExpression(updateStoreReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTION_NATURAL:
      {
        DistributionNatural distributionNatural = (DistributionNatural)theEObject;
        T result = caseDistributionNatural(distributionNatural);
        if (result == null) result = caseUpdates(distributionNatural);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTION_REFERENCE:
      {
        DistributionReference distributionReference = (DistributionReference)theEObject;
        T result = caseDistributionReference(distributionReference);
        if (result == null) result = caseStoreExpression(distributionReference);
        if (result == null) result = casePredicateExpression(distributionReference);
        if (result == null) result = caseArguments(distributionReference);
        if (result == null) result = caseUpdates(distributionReference);
        if (result == null) result = caseUpdateExpression(distributionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UNIFORM_NATURAL:
      {
        UniformNatural uniformNatural = (UniformNatural)theEObject;
        T result = caseUniformNatural(uniformNatural);
        if (result == null) result = caseUpdates(uniformNatural);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UNIFORM_REFERENCE:
      {
        UniformReference uniformReference = (UniformReference)theEObject;
        T result = caseUniformReference(uniformReference);
        if (result == null) result = caseStoreExpression(uniformReference);
        if (result == null) result = casePredicateExpression(uniformReference);
        if (result == null) result = caseArguments(uniformReference);
        if (result == null) result = caseUpdates(uniformReference);
        if (result == null) result = caseUpdateExpression(uniformReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_SUB:
      {
        UpdateSub updateSub = (UpdateSub)theEObject;
        T result = caseUpdateSub(updateSub);
        if (result == null) result = caseUpdateExpression(updateSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_PLU:
      {
        UpdatePlu updatePlu = (UpdatePlu)theEObject;
        T result = caseUpdatePlu(updatePlu);
        if (result == null) result = caseUpdateExpression(updatePlu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_MUL:
      {
        UpdateMul updateMul = (UpdateMul)theEObject;
        T result = caseUpdateMul(updateMul);
        if (result == null) result = caseUpdateExpression(updateMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_DIV:
      {
        UpdateDiv updateDiv = (UpdateDiv)theEObject;
        T result = caseUpdateDiv(updateDiv);
        if (result == null) result = caseUpdateExpression(updateDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_EXPRESSION_STORE_REFERENCE:
      {
        UpdateExpressionStoreReference updateExpressionStoreReference = (UpdateExpressionStoreReference)theEObject;
        T result = caseUpdateExpressionStoreReference(updateExpressionStoreReference);
        if (result == null) result = caseStoreExpression(updateExpressionStoreReference);
        if (result == null) result = casePredicateExpression(updateExpressionStoreReference);
        if (result == null) result = caseArguments(updateExpressionStoreReference);
        if (result == null) result = caseUpdates(updateExpressionStoreReference);
        if (result == null) result = caseUpdateExpression(updateExpressionStoreReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseProcessExpression(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.CHOICE:
      {
        Choice choice = (Choice)theEObject;
        T result = caseChoice(choice);
        if (result == null) result = caseProcessExpression(choice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.LEAF:
      {
        Leaf leaf = (Leaf)theEObject;
        T result = caseLeaf(leaf);
        if (result == null) result = caseProcessExpression(leaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_PROCESS:
      {
        PredicateProcess predicateProcess = (PredicateProcess)theEObject;
        T result = casePredicateProcess(predicateProcess);
        if (result == null) result = caseProcessExpression(predicateProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_PROCESS:
      {
        ActionProcess actionProcess = (ActionProcess)theEObject;
        T result = caseActionProcess(actionProcess);
        if (result == null) result = caseProcessExpression(actionProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.REFERENCED_PROCESS:
      {
        ReferencedProcess referencedProcess = (ReferencedProcess)theEObject;
        T result = caseReferencedProcess(referencedProcess);
        if (result == null) result = caseProcessExpression(referencedProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoreExpression(StoreExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateExpression(PredicateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArguments(Arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Updates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Updates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdates(Updates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateExpression(UpdateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(eu.quanticol.cASPA.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessExpression(ProcessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanConstant(BooleanConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfReference(SelfReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeVariable(FreeVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcast(Broadcast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unicast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unicast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnicast(Unicast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateOr(PredicateOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateAnd(PredicateAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateEquality(PredicateEquality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateComparison(PredicateComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateSub(PredicateSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicatePlu(PredicatePlu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateMul(PredicateMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateDiv(PredicateDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateNot(PredicateNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Store Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Store Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateStoreReference(PredicateStoreReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIn(In object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOut(Out object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Store Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Store Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutStoreReference(OutStoreReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Single Event Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Single Event Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalSingleEventUpdate(LocalSingleEventUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distributed Event Update Probability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distributed Event Update Probability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributedEventUpdateProbability(DistributedEventUpdateProbability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distributed Event Update Uniform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distributed Event Update Uniform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributedEventUpdateUniform(DistributedEventUpdateUniform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Store Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Store Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateStoreReference(UpdateStoreReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distribution Natural</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distribution Natural</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributionNatural(DistributionNatural object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distribution Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distribution Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributionReference(DistributionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uniform Natural</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uniform Natural</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniformNatural(UniformNatural object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uniform Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uniform Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniformReference(UniformReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateSub(UpdateSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdatePlu(UpdatePlu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateMul(UpdateMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateDiv(UpdateDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Expression Store Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Expression Store Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateExpressionStoreReference(UpdateExpressionStoreReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoice(Choice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeaf(Leaf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateProcess(PredicateProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionProcess(ActionProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedProcess(ReferencedProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CASPASwitch
