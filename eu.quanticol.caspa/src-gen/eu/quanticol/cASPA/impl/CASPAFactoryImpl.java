/**
 */
package eu.quanticol.cASPA.impl;

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
import eu.quanticol.cASPA.CASPAFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CASPAFactoryImpl extends EFactoryImpl implements CASPAFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CASPAFactory init()
  {
    try
    {
      CASPAFactory theCASPAFactory = (CASPAFactory)EPackage.Registry.INSTANCE.getEFactory(CASPAPackage.eNS_URI);
      if (theCASPAFactory != null)
      {
        return theCASPAFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CASPAFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CASPAFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CASPAPackage.MODEL: return createModel();
      case CASPAPackage.TERM: return createTerm();
      case CASPAPackage.PROCESS: return createProcess();
      case CASPAPackage.PROCESS_EXPRESSION: return createProcessExpression();
      case CASPAPackage.PREDICATE_PROCESS: return createPredicateProcess();
      case CASPAPackage.ACTION_PROCESS: return createActionProcess();
      case CASPAPackage.ACTION: return createAction();
      case CASPAPackage.PREDICATE: return createPredicate();
      case CASPAPackage.EVALUATIONS: return createEvaluations();
      case CASPAPackage.UPDATES: return createUpdates();
      case CASPAPackage.PREDICATE_EXPRESSION: return createPredicateExpression();
      case CASPAPackage.EVALUATION_EXPRESSION_IN: return createEvaluationExpressionIn();
      case CASPAPackage.EVALUATION_EXPRESSION_OUT: return createEvaluationExpressionOut();
      case CASPAPackage.UPDATE_EXPRESSION: return createUpdateExpression();
      case CASPAPackage.SELF_REFERENCED_STORE: return createSelfReferencedStore();
      case CASPAPackage.ACTION_EXPRESSION: return createActionExpression();
      case CASPAPackage.STORE: return createStore();
      case CASPAPackage.EXPRESSION: return createExpression();
      case CASPAPackage.PARALLEL: return createParallel();
      case CASPAPackage.CHOICE: return createChoice();
      case CASPAPackage.LEAF: return createLeaf();
      case CASPAPackage.PROCESS_REFERENCE: return createProcessReference();
      case CASPAPackage.BROADCAST: return createBroadcast();
      case CASPAPackage.UNICAST: return createUnicast();
      case CASPAPackage.IN: return createIn();
      case CASPAPackage.OUT: return createOut();
      case CASPAPackage.LOCAL_EVALUATION_EXPRESSION: return createLocalEvaluationExpression();
      case CASPAPackage.GLOBAL_EVALUATION_EXPRESSION: return createGlobalEvaluationExpression();
      case CASPAPackage.FREE_EVALUATION_EXPRESSION: return createFreeEvaluationExpression();
      case CASPAPackage.LOCAL_UPDATE_EXPRESSION: return createLocalUpdateExpression();
      case CASPAPackage.GLOBAL_UPDATE_EXPRESSION: return createGlobalUpdateExpression();
      case CASPAPackage.ACTION_OR: return createActionOr();
      case CASPAPackage.ACTION_AND: return createActionAnd();
      case CASPAPackage.ACTION_EQUALITY: return createActionEquality();
      case CASPAPackage.ACTION_COMPARISON: return createActionComparison();
      case CASPAPackage.ACTION_SUB: return createActionSub();
      case CASPAPackage.ACTION_PLU: return createActionPlu();
      case CASPAPackage.ACTION_MUL: return createActionMul();
      case CASPAPackage.ACTION_DIV: return createActionDiv();
      case CASPAPackage.ACTION_NOT: return createActionNot();
      case CASPAPackage.DOUBLE_CONSTANT: return createDoubleConstant();
      case CASPAPackage.FREE_VARIABLE: return createFreeVariable();
      case CASPAPackage.BOOL_CONSTANT: return createBoolConstant();
      case CASPAPackage.REFERENCED_STORE: return createReferencedStore();
      case CASPAPackage.OR: return createOr();
      case CASPAPackage.AND: return createAnd();
      case CASPAPackage.EQUALITY: return createEquality();
      case CASPAPackage.COMPARISON: return createComparison();
      case CASPAPackage.SUB: return createSub();
      case CASPAPackage.PLU: return createPlu();
      case CASPAPackage.MUL: return createMul();
      case CASPAPackage.DIV: return createDiv();
      case CASPAPackage.NOT: return createNot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public eu.quanticol.cASPA.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessExpression createProcessExpression()
  {
    ProcessExpressionImpl processExpression = new ProcessExpressionImpl();
    return processExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateProcess createPredicateProcess()
  {
    PredicateProcessImpl predicateProcess = new PredicateProcessImpl();
    return predicateProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionProcess createActionProcess()
  {
    ActionProcessImpl actionProcess = new ActionProcessImpl();
    return actionProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluations createEvaluations()
  {
    EvaluationsImpl evaluations = new EvaluationsImpl();
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updates createUpdates()
  {
    UpdatesImpl updates = new UpdatesImpl();
    return updates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateExpression createPredicateExpression()
  {
    PredicateExpressionImpl predicateExpression = new PredicateExpressionImpl();
    return predicateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationExpressionIn createEvaluationExpressionIn()
  {
    EvaluationExpressionInImpl evaluationExpressionIn = new EvaluationExpressionInImpl();
    return evaluationExpressionIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationExpressionOut createEvaluationExpressionOut()
  {
    EvaluationExpressionOutImpl evaluationExpressionOut = new EvaluationExpressionOutImpl();
    return evaluationExpressionOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateExpression createUpdateExpression()
  {
    UpdateExpressionImpl updateExpression = new UpdateExpressionImpl();
    return updateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfReferencedStore createSelfReferencedStore()
  {
    SelfReferencedStoreImpl selfReferencedStore = new SelfReferencedStoreImpl();
    return selfReferencedStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionExpression createActionExpression()
  {
    ActionExpressionImpl actionExpression = new ActionExpressionImpl();
    return actionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallel createParallel()
  {
    ParallelImpl parallel = new ParallelImpl();
    return parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choice createChoice()
  {
    ChoiceImpl choice = new ChoiceImpl();
    return choice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Leaf createLeaf()
  {
    LeafImpl leaf = new LeafImpl();
    return leaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessReference createProcessReference()
  {
    ProcessReferenceImpl processReference = new ProcessReferenceImpl();
    return processReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Broadcast createBroadcast()
  {
    BroadcastImpl broadcast = new BroadcastImpl();
    return broadcast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unicast createUnicast()
  {
    UnicastImpl unicast = new UnicastImpl();
    return unicast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public In createIn()
  {
    InImpl in = new InImpl();
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Out createOut()
  {
    OutImpl out = new OutImpl();
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalEvaluationExpression createLocalEvaluationExpression()
  {
    LocalEvaluationExpressionImpl localEvaluationExpression = new LocalEvaluationExpressionImpl();
    return localEvaluationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalEvaluationExpression createGlobalEvaluationExpression()
  {
    GlobalEvaluationExpressionImpl globalEvaluationExpression = new GlobalEvaluationExpressionImpl();
    return globalEvaluationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeEvaluationExpression createFreeEvaluationExpression()
  {
    FreeEvaluationExpressionImpl freeEvaluationExpression = new FreeEvaluationExpressionImpl();
    return freeEvaluationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalUpdateExpression createLocalUpdateExpression()
  {
    LocalUpdateExpressionImpl localUpdateExpression = new LocalUpdateExpressionImpl();
    return localUpdateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalUpdateExpression createGlobalUpdateExpression()
  {
    GlobalUpdateExpressionImpl globalUpdateExpression = new GlobalUpdateExpressionImpl();
    return globalUpdateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOr createActionOr()
  {
    ActionOrImpl actionOr = new ActionOrImpl();
    return actionOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionAnd createActionAnd()
  {
    ActionAndImpl actionAnd = new ActionAndImpl();
    return actionAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionEquality createActionEquality()
  {
    ActionEqualityImpl actionEquality = new ActionEqualityImpl();
    return actionEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionComparison createActionComparison()
  {
    ActionComparisonImpl actionComparison = new ActionComparisonImpl();
    return actionComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSub createActionSub()
  {
    ActionSubImpl actionSub = new ActionSubImpl();
    return actionSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionPlu createActionPlu()
  {
    ActionPluImpl actionPlu = new ActionPluImpl();
    return actionPlu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionMul createActionMul()
  {
    ActionMulImpl actionMul = new ActionMulImpl();
    return actionMul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDiv createActionDiv()
  {
    ActionDivImpl actionDiv = new ActionDivImpl();
    return actionDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionNot createActionNot()
  {
    ActionNotImpl actionNot = new ActionNotImpl();
    return actionNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleConstant createDoubleConstant()
  {
    DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
    return doubleConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeVariable createFreeVariable()
  {
    FreeVariableImpl freeVariable = new FreeVariableImpl();
    return freeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedStore createReferencedStore()
  {
    ReferencedStoreImpl referencedStore = new ReferencedStoreImpl();
    return referencedStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plu createPlu()
  {
    PluImpl plu = new PluImpl();
    return plu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CASPAPackage getCASPAPackage()
  {
    return (CASPAPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CASPAPackage getPackage()
  {
    return CASPAPackage.eINSTANCE;
  }

} //CASPAFactoryImpl
