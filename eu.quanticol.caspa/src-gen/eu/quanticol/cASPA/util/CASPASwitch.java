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
      case CASPAPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
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
      case CASPAPackage.EVALUATIONS:
      {
        Evaluations evaluations = (Evaluations)theEObject;
        T result = caseEvaluations(evaluations);
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
      case CASPAPackage.PREDICATE_EXPRESSION:
      {
        PredicateExpression predicateExpression = (PredicateExpression)theEObject;
        T result = casePredicateExpression(predicateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.EVALUATION_EXPRESSION_IN:
      {
        EvaluationExpressionIn evaluationExpressionIn = (EvaluationExpressionIn)theEObject;
        T result = caseEvaluationExpressionIn(evaluationExpressionIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.EVALUATION_EXPRESSION_OUT:
      {
        EvaluationExpressionOut evaluationExpressionOut = (EvaluationExpressionOut)theEObject;
        T result = caseEvaluationExpressionOut(evaluationExpressionOut);
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
      case CASPAPackage.SELF_REFERENCED_STORE:
      {
        SelfReferencedStore selfReferencedStore = (SelfReferencedStore)theEObject;
        T result = caseSelfReferencedStore(selfReferencedStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_EXPRESSION:
      {
        ActionExpression actionExpression = (ActionExpression)theEObject;
        T result = caseActionExpression(actionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
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
      case CASPAPackage.PROCESS_REFERENCE:
      {
        ProcessReference processReference = (ProcessReference)theEObject;
        T result = caseProcessReference(processReference);
        if (result == null) result = caseProcessExpression(processReference);
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
      case CASPAPackage.IN:
      {
        In in = (In)theEObject;
        T result = caseIn(in);
        if (result == null) result = caseEvaluations(in);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.OUT:
      {
        Out out = (Out)theEObject;
        T result = caseOut(out);
        if (result == null) result = caseEvaluations(out);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.LOCAL_EVALUATION_EXPRESSION:
      {
        LocalEvaluationExpression localEvaluationExpression = (LocalEvaluationExpression)theEObject;
        T result = caseLocalEvaluationExpression(localEvaluationExpression);
        if (result == null) result = caseEvaluationExpressionIn(localEvaluationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.GLOBAL_EVALUATION_EXPRESSION:
      {
        GlobalEvaluationExpression globalEvaluationExpression = (GlobalEvaluationExpression)theEObject;
        T result = caseGlobalEvaluationExpression(globalEvaluationExpression);
        if (result == null) result = caseEvaluationExpressionIn(globalEvaluationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.FREE_EVALUATION_EXPRESSION:
      {
        FreeEvaluationExpression freeEvaluationExpression = (FreeEvaluationExpression)theEObject;
        T result = caseFreeEvaluationExpression(freeEvaluationExpression);
        if (result == null) result = caseEvaluationExpressionOut(freeEvaluationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION:
      {
        LocalUpdateExpression localUpdateExpression = (LocalUpdateExpression)theEObject;
        T result = caseLocalUpdateExpression(localUpdateExpression);
        if (result == null) result = caseUpdateExpression(localUpdateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.GLOBAL_UPDATE_EXPRESSION:
      {
        GlobalUpdateExpression globalUpdateExpression = (GlobalUpdateExpression)theEObject;
        T result = caseGlobalUpdateExpression(globalUpdateExpression);
        if (result == null) result = caseUpdateExpression(globalUpdateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_OR:
      {
        ActionOr actionOr = (ActionOr)theEObject;
        T result = caseActionOr(actionOr);
        if (result == null) result = caseActionExpression(actionOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_AND:
      {
        ActionAnd actionAnd = (ActionAnd)theEObject;
        T result = caseActionAnd(actionAnd);
        if (result == null) result = caseActionExpression(actionAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_EQUALITY:
      {
        ActionEquality actionEquality = (ActionEquality)theEObject;
        T result = caseActionEquality(actionEquality);
        if (result == null) result = caseActionExpression(actionEquality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_COMPARISON:
      {
        ActionComparison actionComparison = (ActionComparison)theEObject;
        T result = caseActionComparison(actionComparison);
        if (result == null) result = caseActionExpression(actionComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_SUB:
      {
        ActionSub actionSub = (ActionSub)theEObject;
        T result = caseActionSub(actionSub);
        if (result == null) result = caseActionExpression(actionSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_PLU:
      {
        ActionPlu actionPlu = (ActionPlu)theEObject;
        T result = caseActionPlu(actionPlu);
        if (result == null) result = caseActionExpression(actionPlu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_MUL:
      {
        ActionMul actionMul = (ActionMul)theEObject;
        T result = caseActionMul(actionMul);
        if (result == null) result = caseActionExpression(actionMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_DIV:
      {
        ActionDiv actionDiv = (ActionDiv)theEObject;
        T result = caseActionDiv(actionDiv);
        if (result == null) result = caseActionExpression(actionDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_NOT:
      {
        ActionNot actionNot = (ActionNot)theEObject;
        T result = caseActionNot(actionNot);
        if (result == null) result = caseActionExpression(actionNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DOUBLE_CONSTANT:
      {
        DoubleConstant doubleConstant = (DoubleConstant)theEObject;
        T result = caseDoubleConstant(doubleConstant);
        if (result == null) result = caseActionExpression(doubleConstant);
        if (result == null) result = caseExpression(doubleConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.FREE_VARIABLE:
      {
        FreeVariable freeVariable = (FreeVariable)theEObject;
        T result = caseFreeVariable(freeVariable);
        if (result == null) result = caseActionExpression(freeVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = caseActionExpression(boolConstant);
        if (result == null) result = caseExpression(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.REFERENCED_STORE:
      {
        ReferencedStore referencedStore = (ReferencedStore)theEObject;
        T result = caseReferencedStore(referencedStore);
        if (result == null) result = caseActionExpression(referencedStore);
        if (result == null) result = caseExpression(referencedStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpression(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpression(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.EQUALITY:
      {
        Equality equality = (Equality)theEObject;
        T result = caseEquality(equality);
        if (result == null) result = caseExpression(equality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = caseExpression(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.SUB:
      {
        Sub sub = (Sub)theEObject;
        T result = caseSub(sub);
        if (result == null) result = caseExpression(sub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PLU:
      {
        Plu plu = (Plu)theEObject;
        T result = casePlu(plu);
        if (result == null) result = caseExpression(plu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.MUL:
      {
        Mul mul = (Mul)theEObject;
        T result = caseMul(mul);
        if (result == null) result = caseExpression(mul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseExpression(not);
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
   * Returns the result of interpreting the object as an instance of '<em>Evaluations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluations(Evaluations object)
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
   * Returns the result of interpreting the object as an instance of '<em>Evaluation Expression In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation Expression In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluationExpressionIn(EvaluationExpressionIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation Expression Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation Expression Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluationExpressionOut(EvaluationExpressionOut object)
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
   * Returns the result of interpreting the object as an instance of '<em>Self Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Referenced Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfReferencedStore(SelfReferencedStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionExpression(ActionExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessReference(ProcessReference object)
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
   * Returns the result of interpreting the object as an instance of '<em>Local Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Evaluation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalEvaluationExpression(LocalEvaluationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Evaluation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalEvaluationExpression(GlobalEvaluationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Evaluation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeEvaluationExpression(FreeEvaluationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Update Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Update Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalUpdateExpression(LocalUpdateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Update Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Update Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalUpdateExpression(GlobalUpdateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionOr(ActionOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionAnd(ActionAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionEquality(ActionEquality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionComparison(ActionComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionSub(ActionSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionPlu(ActionPlu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionMul(ActionMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDiv(ActionDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionNot(ActionNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleConstant(DoubleConstant object)
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
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedStore(ReferencedStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality(Equality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSub(Sub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlu(Plu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMul(Mul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
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
