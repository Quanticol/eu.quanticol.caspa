/**
 */
package eu.quanticol.cASPA.impl;

import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.Arguments;
import eu.quanticol.cASPA.BoolConstant;
import eu.quanticol.cASPA.Broadcast;
import eu.quanticol.cASPA.CASPAFactory;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributedEventUpdate;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.Distribution;
import eu.quanticol.cASPA.Expressions;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.InArguments;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Not;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.OutArguments;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateAnd;
import eu.quanticol.cASPA.PredicateComparison;
import eu.quanticol.cASPA.PredicateDiv;
import eu.quanticol.cASPA.PredicateEquality;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateMul;
import eu.quanticol.cASPA.PredicateOr;
import eu.quanticol.cASPA.PredicatePlu;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ProcessReference;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.SingleEventUpdate;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.Uniform;
import eu.quanticol.cASPA.Update;
import eu.quanticol.cASPA.UpdateAnd;
import eu.quanticol.cASPA.UpdateComparison;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateEquality;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdateNot;
import eu.quanticol.cASPA.UpdateOr;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.cASPA.Updates;
import eu.quanticol.cASPA.Variables;

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
      case CASPAPackage.STORE: return createStore();
      case CASPAPackage.REFERENCED_STORE: return createReferencedStore();
      case CASPAPackage.SELF_REFERENCED_STORE: return createSelfReferencedStore();
      case CASPAPackage.ACTION: return createAction();
      case CASPAPackage.PREDICATE: return createPredicate();
      case CASPAPackage.PREDICATE_EXPRESSION: return createPredicateExpression();
      case CASPAPackage.ARGUMENTS: return createArguments();
      case CASPAPackage.IN_ARGUMENTS: return createInArguments();
      case CASPAPackage.OUT_ARGUMENTS: return createOutArguments();
      case CASPAPackage.EXPRESSIONS: return createExpressions();
      case CASPAPackage.VARIABLES: return createVariables();
      case CASPAPackage.UPDATES: return createUpdates();
      case CASPAPackage.UPDATE: return createUpdate();
      case CASPAPackage.SINGLE_EVENT_UPDATE: return createSingleEventUpdate();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE: return createDistributedEventUpdate();
      case CASPAPackage.DISTRIBUTION: return createDistribution();
      case CASPAPackage.UNIFORM: return createUniform();
      case CASPAPackage.UPDATE_EXPRESSION: return createUpdateExpression();
      case CASPAPackage.PROCESS: return createProcess();
      case CASPAPackage.PROCESS_EXPRESSION: return createProcessExpression();
      case CASPAPackage.PREDICATE_PROCESS: return createPredicateProcess();
      case CASPAPackage.ACTION_PROCESS: return createActionProcess();
      case CASPAPackage.TERM: return createTerm();
      case CASPAPackage.BROADCAST: return createBroadcast();
      case CASPAPackage.UNICAST: return createUnicast();
      case CASPAPackage.PREDICATE_OR: return createPredicateOr();
      case CASPAPackage.PREDICATE_AND: return createPredicateAnd();
      case CASPAPackage.PREDICATE_EQUALITY: return createPredicateEquality();
      case CASPAPackage.PREDICATE_COMPARISON: return createPredicateComparison();
      case CASPAPackage.PREDICATE_SUB: return createPredicateSub();
      case CASPAPackage.PREDICATE_PLU: return createPredicatePlu();
      case CASPAPackage.PREDICATE_MUL: return createPredicateMul();
      case CASPAPackage.PREDICATE_DIV: return createPredicateDiv();
      case CASPAPackage.NOT: return createNot();
      case CASPAPackage.CONSTANT: return createConstant();
      case CASPAPackage.BOOL_CONSTANT: return createBoolConstant();
      case CASPAPackage.IN: return createIn();
      case CASPAPackage.OUT: return createOut();
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE: return createLocalSingleEventUpdate();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY: return createDistributedEventUpdateProbability();
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM: return createDistributedEventUpdateUniform();
      case CASPAPackage.UPDATE_OR: return createUpdateOr();
      case CASPAPackage.UPDATE_AND: return createUpdateAnd();
      case CASPAPackage.UPDATE_EQUALITY: return createUpdateEquality();
      case CASPAPackage.UPDATE_COMPARISON: return createUpdateComparison();
      case CASPAPackage.UPDATE_SUB: return createUpdateSub();
      case CASPAPackage.UPDATE_PLU: return createUpdatePlu();
      case CASPAPackage.UPDATE_MUL: return createUpdateMul();
      case CASPAPackage.UPDATE_DIV: return createUpdateDiv();
      case CASPAPackage.UPDATE_NOT: return createUpdateNot();
      case CASPAPackage.PARALLEL: return createParallel();
      case CASPAPackage.CHOICE: return createChoice();
      case CASPAPackage.LEAF: return createLeaf();
      case CASPAPackage.PROCESS_REFERENCE: return createProcessReference();
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
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InArguments createInArguments()
  {
    InArgumentsImpl inArguments = new InArgumentsImpl();
    return inArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutArguments createOutArguments()
  {
    OutArgumentsImpl outArguments = new OutArgumentsImpl();
    return outArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expressions createExpressions()
  {
    ExpressionsImpl expressions = new ExpressionsImpl();
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables createVariables()
  {
    VariablesImpl variables = new VariablesImpl();
    return variables;
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
  public Update createUpdate()
  {
    UpdateImpl update = new UpdateImpl();
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleEventUpdate createSingleEventUpdate()
  {
    SingleEventUpdateImpl singleEventUpdate = new SingleEventUpdateImpl();
    return singleEventUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistributedEventUpdate createDistributedEventUpdate()
  {
    DistributedEventUpdateImpl distributedEventUpdate = new DistributedEventUpdateImpl();
    return distributedEventUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution createDistribution()
  {
    DistributionImpl distribution = new DistributionImpl();
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uniform createUniform()
  {
    UniformImpl uniform = new UniformImpl();
    return uniform;
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
  public PredicateOr createPredicateOr()
  {
    PredicateOrImpl predicateOr = new PredicateOrImpl();
    return predicateOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateAnd createPredicateAnd()
  {
    PredicateAndImpl predicateAnd = new PredicateAndImpl();
    return predicateAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateEquality createPredicateEquality()
  {
    PredicateEqualityImpl predicateEquality = new PredicateEqualityImpl();
    return predicateEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateComparison createPredicateComparison()
  {
    PredicateComparisonImpl predicateComparison = new PredicateComparisonImpl();
    return predicateComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateSub createPredicateSub()
  {
    PredicateSubImpl predicateSub = new PredicateSubImpl();
    return predicateSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicatePlu createPredicatePlu()
  {
    PredicatePluImpl predicatePlu = new PredicatePluImpl();
    return predicatePlu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateMul createPredicateMul()
  {
    PredicateMulImpl predicateMul = new PredicateMulImpl();
    return predicateMul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateDiv createPredicateDiv()
  {
    PredicateDivImpl predicateDiv = new PredicateDivImpl();
    return predicateDiv;
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
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
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
  public LocalSingleEventUpdate createLocalSingleEventUpdate()
  {
    LocalSingleEventUpdateImpl localSingleEventUpdate = new LocalSingleEventUpdateImpl();
    return localSingleEventUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistributedEventUpdateProbability createDistributedEventUpdateProbability()
  {
    DistributedEventUpdateProbabilityImpl distributedEventUpdateProbability = new DistributedEventUpdateProbabilityImpl();
    return distributedEventUpdateProbability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistributedEventUpdateUniform createDistributedEventUpdateUniform()
  {
    DistributedEventUpdateUniformImpl distributedEventUpdateUniform = new DistributedEventUpdateUniformImpl();
    return distributedEventUpdateUniform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateOr createUpdateOr()
  {
    UpdateOrImpl updateOr = new UpdateOrImpl();
    return updateOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateAnd createUpdateAnd()
  {
    UpdateAndImpl updateAnd = new UpdateAndImpl();
    return updateAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateEquality createUpdateEquality()
  {
    UpdateEqualityImpl updateEquality = new UpdateEqualityImpl();
    return updateEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateComparison createUpdateComparison()
  {
    UpdateComparisonImpl updateComparison = new UpdateComparisonImpl();
    return updateComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateSub createUpdateSub()
  {
    UpdateSubImpl updateSub = new UpdateSubImpl();
    return updateSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdatePlu createUpdatePlu()
  {
    UpdatePluImpl updatePlu = new UpdatePluImpl();
    return updatePlu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateMul createUpdateMul()
  {
    UpdateMulImpl updateMul = new UpdateMulImpl();
    return updateMul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateDiv createUpdateDiv()
  {
    UpdateDivImpl updateDiv = new UpdateDivImpl();
    return updateDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateNot createUpdateNot()
  {
    UpdateNotImpl updateNot = new UpdateNotImpl();
    return updateNot;
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
