/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.quanticol.cASPA.CASPAFactory
 * @model kind="package"
 * @generated
 */
public interface CASPAPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cASPA";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.quanticol.eu/CASPA";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cASPA";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CASPAPackage eINSTANCE = eu.quanticol.cASPA.impl.CASPAPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ModelImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Stores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STORES = 0;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROCESSES = 1;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TERMS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.StoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStore()
   * @generated
   */
  int STORE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateExpression()
   * @generated
   */
  int PREDICATE_EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Predicate Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ReferencedStoreImpl <em>Referenced Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ReferencedStoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReferencedStore()
   * @generated
   */
  int REFERENCED_STORE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE__VALUE = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE__NAME = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Referenced Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.SelfReferencedStoreImpl <em>Self Referenced Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.SelfReferencedStoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSelfReferencedStore()
   * @generated
   */
  int SELF_REFERENCED_STORE = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE__VALUE = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE__NAME = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Self Referenced Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getAction()
   * @generated
   */
  int ACTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PREDICATE = 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ARGUMENTS = 2;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__UPDATES = 3;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 5;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ArgumentsImpl <em>Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ArgumentsImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getArguments()
   * @generated
   */
  int ARGUMENTS = 7;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.InArgumentsImpl <em>In Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.InArgumentsImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getInArguments()
   * @generated
   */
  int IN_ARGUMENTS = 8;

  /**
   * The number of structural features of the '<em>In Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ARGUMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.OutArgumentsImpl <em>Out Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.OutArgumentsImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOutArguments()
   * @generated
   */
  int OUT_ARGUMENTS = 9;

  /**
   * The number of structural features of the '<em>Out Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_ARGUMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ExpressionsImpl <em>Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ExpressionsImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getExpressions()
   * @generated
   */
  int EXPRESSIONS = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSIONS__VALUE = OUT_ARGUMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSIONS_FEATURE_COUNT = OUT_ARGUMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.VariablesImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 11;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = IN_ARGUMENTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdatesImpl <em>Updates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdatesImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdates()
   * @generated
   */
  int UPDATES = 12;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATES__UPDATES = 0;

  /**
   * The number of structural features of the '<em>Updates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateImpl <em>Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdate()
   * @generated
   */
  int UPDATE = 13;

  /**
   * The number of structural features of the '<em>Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.SingleEventUpdateImpl <em>Single Event Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.SingleEventUpdateImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSingleEventUpdate()
   * @generated
   */
  int SINGLE_EVENT_UPDATE = 14;

  /**
   * The number of structural features of the '<em>Single Event Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_EVENT_UPDATE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateImpl <em>Distributed Event Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributedEventUpdateImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdate()
   * @generated
   */
  int DISTRIBUTED_EVENT_UPDATE = 15;

  /**
   * The number of structural features of the '<em>Distributed Event Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributionImpl <em>Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 16;

  /**
   * The feature id for the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__PROB = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Distribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UniformImpl <em>Uniform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UniformImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUniform()
   * @generated
   */
  int UNIFORM = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Uniform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateExpression()
   * @generated
   */
  int UPDATE_EXPRESSION = 18;

  /**
   * The number of structural features of the '<em>Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ProcessImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__VALUE = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ProcessExpressionImpl <em>Process Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ProcessExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcessExpression()
   * @generated
   */
  int PROCESS_EXPRESSION = 20;

  /**
   * The number of structural features of the '<em>Process Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateProcessImpl <em>Predicate Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateProcessImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateProcess()
   * @generated
   */
  int PREDICATE_PROCESS = 21;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS__PREDICATE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionProcessImpl <em>Action Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionProcessImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionProcess()
   * @generated
   */
  int ACTION_PROCESS = 22;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS__ACTION = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.TermImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getTerm()
   * @generated
   */
  int TERM = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__NAME = 0;

  /**
   * The feature id for the '<em><b>Stores</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__STORES = 1;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BroadcastImpl <em>Broadcast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BroadcastImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBroadcast()
   * @generated
   */
  int BROADCAST = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__PREDICATE = ACTION__PREDICATE;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__ARGUMENTS = ACTION__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__UPDATES = ACTION__UPDATES;

  /**
   * The number of structural features of the '<em>Broadcast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UnicastImpl <em>Unicast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UnicastImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUnicast()
   * @generated
   */
  int UNICAST = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__PREDICATE = ACTION__PREDICATE;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__ARGUMENTS = ACTION__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__UPDATES = ACTION__UPDATES;

  /**
   * The number of structural features of the '<em>Unicast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateOrImpl <em>Predicate Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateOrImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateOr()
   * @generated
   */
  int PREDICATE_OR = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OR_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateAndImpl <em>Predicate And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateAndImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateAnd()
   * @generated
   */
  int PREDICATE_AND = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_AND_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateEqualityImpl <em>Predicate Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateEqualityImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateEquality()
   * @generated
   */
  int PREDICATE_EQUALITY = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EQUALITY__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EQUALITY__OP = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EQUALITY__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Predicate Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EQUALITY_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateComparisonImpl <em>Predicate Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateComparisonImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateComparison()
   * @generated
   */
  int PREDICATE_COMPARISON = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_COMPARISON__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_COMPARISON__OP = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_COMPARISON__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Predicate Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_COMPARISON_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateSubImpl <em>Predicate Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateSubImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateSub()
   * @generated
   */
  int PREDICATE_SUB = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_SUB__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_SUB__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_SUB_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicatePluImpl <em>Predicate Plu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicatePluImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicatePlu()
   * @generated
   */
  int PREDICATE_PLU = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PLU__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PLU__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Plu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PLU_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateMulImpl <em>Predicate Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateMulImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateMul()
   * @generated
   */
  int PREDICATE_MUL = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_MUL__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_MUL__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_MUL_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateDivImpl <em>Predicate Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateDivImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateDiv()
   * @generated
   */
  int PREDICATE_DIV = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_DIV__LEFT = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_DIV__RIGHT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_DIV_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.NotImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getNot()
   * @generated
   */
  int NOT = 34;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXPRESSION = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ConstantImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BoolConstantImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.InImpl <em>In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.InImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getIn()
   * @generated
   */
  int IN = 37;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__EXPRESSIONS = ARGUMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_FEATURE_COUNT = ARGUMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.OutImpl <em>Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.OutImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOut()
   * @generated
   */
  int OUT = 38;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__EXPRESSIONS = ARGUMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_FEATURE_COUNT = ARGUMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl <em>Local Single Event Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalSingleEventUpdate()
   * @generated
   */
  int LOCAL_SINGLE_EVENT_UPDATE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE__NAME = SINGLE_EVENT_UPDATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE__EXPRESSION = SINGLE_EVENT_UPDATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Single Event Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE_FEATURE_COUNT = SINGLE_EVENT_UPDATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl <em>Distributed Event Update Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdateProbability()
   * @generated
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY = 40;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION = DISTRIBUTED_EVENT_UPDATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Distributed Event Update Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY_FEATURE_COUNT = DISTRIBUTED_EVENT_UPDATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl <em>Distributed Event Update Uniform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdateUniform()
   * @generated
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM = 41;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION = DISTRIBUTED_EVENT_UPDATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Distributed Event Update Uniform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM_FEATURE_COUNT = DISTRIBUTED_EVENT_UPDATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateOrImpl <em>Update Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateOrImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateOr()
   * @generated
   */
  int UPDATE_OR = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_OR__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_OR__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_OR_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateAndImpl <em>Update And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateAndImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateAnd()
   * @generated
   */
  int UPDATE_AND = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_AND__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_AND__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_AND_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateEqualityImpl <em>Update Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateEqualityImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateEquality()
   * @generated
   */
  int UPDATE_EQUALITY = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EQUALITY__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EQUALITY__OP = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EQUALITY__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Update Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EQUALITY_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateComparisonImpl <em>Update Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateComparisonImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateComparison()
   * @generated
   */
  int UPDATE_COMPARISON = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COMPARISON__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COMPARISON__OP = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COMPARISON__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Update Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COMPARISON_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateSubImpl <em>Update Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateSubImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateSub()
   * @generated
   */
  int UPDATE_SUB = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_SUB__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_SUB__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_SUB_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdatePluImpl <em>Update Plu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdatePluImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdatePlu()
   * @generated
   */
  int UPDATE_PLU = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_PLU__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_PLU__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Plu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_PLU_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateMulImpl <em>Update Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateMulImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateMul()
   * @generated
   */
  int UPDATE_MUL = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_MUL__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_MUL__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_MUL_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateDivImpl <em>Update Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateDivImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateDiv()
   * @generated
   */
  int UPDATE_DIV = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_DIV__LEFT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_DIV__RIGHT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_DIV_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateNotImpl <em>Update Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateNotImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateNot()
   * @generated
   */
  int UPDATE_NOT = 50;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_NOT__EXPRESSION = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_NOT_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ParallelImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__LEFT = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__RIGHT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ChoiceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__LEFT = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__RIGHT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.LeafImpl <em>Leaf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.LeafImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLeaf()
   * @generated
   */
  int LEAF = 53;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Leaf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ProcessReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcessReference()
   * @generated
   */
  int PROCESS_REFERENCE = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE__VALUE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Process Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see eu.quanticol.cASPA.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.Model#getStores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stores</em>'.
   * @see eu.quanticol.cASPA.Model#getStores()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Stores();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.Model#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see eu.quanticol.cASPA.Model#getProcesses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Processes();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.Model#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see eu.quanticol.cASPA.Model#getTerms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Terms();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store</em>'.
   * @see eu.quanticol.cASPA.Store
   * @generated
   */
  EClass getStore();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Store#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.Store#getName()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Store#getValue()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ReferencedStore <em>Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Store</em>'.
   * @see eu.quanticol.cASPA.ReferencedStore
   * @generated
   */
  EClass getReferencedStore();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.ReferencedStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.ReferencedStore#getName()
   * @see #getReferencedStore()
   * @generated
   */
  EReference getReferencedStore_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.SelfReferencedStore <em>Self Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Referenced Store</em>'.
   * @see eu.quanticol.cASPA.SelfReferencedStore
   * @generated
   */
  EClass getSelfReferencedStore();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.SelfReferencedStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.SelfReferencedStore#getName()
   * @see #getSelfReferencedStore()
   * @generated
   */
  EReference getSelfReferencedStore_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see eu.quanticol.cASPA.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Action#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see eu.quanticol.cASPA.Action#getPredicate()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Action#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see eu.quanticol.cASPA.Action#getArguments()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Arguments();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Action#getUpdates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Updates</em>'.
   * @see eu.quanticol.cASPA.Action#getUpdates()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Updates();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see eu.quanticol.cASPA.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Predicate#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see eu.quanticol.cASPA.Predicate#getPredicate()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Predicate();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateExpression <em>Predicate Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Expression</em>'.
   * @see eu.quanticol.cASPA.PredicateExpression
   * @generated
   */
  EClass getPredicateExpression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arguments</em>'.
   * @see eu.quanticol.cASPA.Arguments
   * @generated
   */
  EClass getArguments();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.InArguments <em>In Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Arguments</em>'.
   * @see eu.quanticol.cASPA.InArguments
   * @generated
   */
  EClass getInArguments();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.OutArguments <em>Out Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Arguments</em>'.
   * @see eu.quanticol.cASPA.OutArguments
   * @generated
   */
  EClass getOutArguments();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Expressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expressions</em>'.
   * @see eu.quanticol.cASPA.Expressions
   * @generated
   */
  EClass getExpressions();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Expressions#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Expressions#getValue()
   * @see #getExpressions()
   * @generated
   */
  EAttribute getExpressions_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see eu.quanticol.cASPA.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Updates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Updates</em>'.
   * @see eu.quanticol.cASPA.Updates
   * @generated
   */
  EClass getUpdates();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.Updates#getUpdates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Updates</em>'.
   * @see eu.quanticol.cASPA.Updates#getUpdates()
   * @see #getUpdates()
   * @generated
   */
  EReference getUpdates_Updates();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Update <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update</em>'.
   * @see eu.quanticol.cASPA.Update
   * @generated
   */
  EClass getUpdate();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.SingleEventUpdate <em>Single Event Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Event Update</em>'.
   * @see eu.quanticol.cASPA.SingleEventUpdate
   * @generated
   */
  EClass getSingleEventUpdate();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.DistributedEventUpdate <em>Distributed Event Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distributed Event Update</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdate
   * @generated
   */
  EClass getDistributedEventUpdate();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution</em>'.
   * @see eu.quanticol.cASPA.Distribution
   * @generated
   */
  EClass getDistribution();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Distribution#getProb <em>Prob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prob</em>'.
   * @see eu.quanticol.cASPA.Distribution#getProb()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_Prob();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Distribution#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.Distribution#getExpression()
   * @see #getDistribution()
   * @generated
   */
  EReference getDistribution_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Uniform <em>Uniform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uniform</em>'.
   * @see eu.quanticol.cASPA.Uniform
   * @generated
   */
  EClass getUniform();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Uniform#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.Uniform#getExpression()
   * @see #getUniform()
   * @generated
   */
  EReference getUniform_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateExpression <em>Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Expression</em>'.
   * @see eu.quanticol.cASPA.UpdateExpression
   * @generated
   */
  EClass getUpdateExpression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see eu.quanticol.cASPA.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Process#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Process#getValue()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ProcessExpression <em>Process Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Expression</em>'.
   * @see eu.quanticol.cASPA.ProcessExpression
   * @generated
   */
  EClass getProcessExpression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateProcess <em>Predicate Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Process</em>'.
   * @see eu.quanticol.cASPA.PredicateProcess
   * @generated
   */
  EClass getPredicateProcess();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateProcess#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see eu.quanticol.cASPA.PredicateProcess#getPredicate()
   * @see #getPredicateProcess()
   * @generated
   */
  EReference getPredicateProcess_Predicate();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.PredicateProcess#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.PredicateProcess#getValue()
   * @see #getPredicateProcess()
   * @generated
   */
  EReference getPredicateProcess_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionProcess <em>Action Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Process</em>'.
   * @see eu.quanticol.cASPA.ActionProcess
   * @generated
   */
  EClass getActionProcess();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionProcess#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see eu.quanticol.cASPA.ActionProcess#getAction()
   * @see #getActionProcess()
   * @generated
   */
  EReference getActionProcess_Action();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.ActionProcess#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.ActionProcess#getValue()
   * @see #getActionProcess()
   * @generated
   */
  EReference getActionProcess_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see eu.quanticol.cASPA.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.Term#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.Term#getName()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Name();

  /**
   * Returns the meta object for the reference list '{@link eu.quanticol.cASPA.Term#getStores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stores</em>'.
   * @see eu.quanticol.cASPA.Term#getStores()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Stores();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Broadcast <em>Broadcast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast</em>'.
   * @see eu.quanticol.cASPA.Broadcast
   * @generated
   */
  EClass getBroadcast();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Unicast <em>Unicast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unicast</em>'.
   * @see eu.quanticol.cASPA.Unicast
   * @generated
   */
  EClass getUnicast();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateOr <em>Predicate Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Or</em>'.
   * @see eu.quanticol.cASPA.PredicateOr
   * @generated
   */
  EClass getPredicateOr();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateOr#getLeft()
   * @see #getPredicateOr()
   * @generated
   */
  EReference getPredicateOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateOr#getRight()
   * @see #getPredicateOr()
   * @generated
   */
  EReference getPredicateOr_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateAnd <em>Predicate And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate And</em>'.
   * @see eu.quanticol.cASPA.PredicateAnd
   * @generated
   */
  EClass getPredicateAnd();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateAnd#getLeft()
   * @see #getPredicateAnd()
   * @generated
   */
  EReference getPredicateAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateAnd#getRight()
   * @see #getPredicateAnd()
   * @generated
   */
  EReference getPredicateAnd_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateEquality <em>Predicate Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Equality</em>'.
   * @see eu.quanticol.cASPA.PredicateEquality
   * @generated
   */
  EClass getPredicateEquality();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateEquality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateEquality#getLeft()
   * @see #getPredicateEquality()
   * @generated
   */
  EReference getPredicateEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.PredicateEquality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.PredicateEquality#getOp()
   * @see #getPredicateEquality()
   * @generated
   */
  EAttribute getPredicateEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateEquality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateEquality#getRight()
   * @see #getPredicateEquality()
   * @generated
   */
  EReference getPredicateEquality_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateComparison <em>Predicate Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Comparison</em>'.
   * @see eu.quanticol.cASPA.PredicateComparison
   * @generated
   */
  EClass getPredicateComparison();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateComparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateComparison#getLeft()
   * @see #getPredicateComparison()
   * @generated
   */
  EReference getPredicateComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.PredicateComparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.PredicateComparison#getOp()
   * @see #getPredicateComparison()
   * @generated
   */
  EAttribute getPredicateComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateComparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateComparison#getRight()
   * @see #getPredicateComparison()
   * @generated
   */
  EReference getPredicateComparison_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateSub <em>Predicate Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Sub</em>'.
   * @see eu.quanticol.cASPA.PredicateSub
   * @generated
   */
  EClass getPredicateSub();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateSub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateSub#getLeft()
   * @see #getPredicateSub()
   * @generated
   */
  EReference getPredicateSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateSub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateSub#getRight()
   * @see #getPredicateSub()
   * @generated
   */
  EReference getPredicateSub_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicatePlu <em>Predicate Plu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Plu</em>'.
   * @see eu.quanticol.cASPA.PredicatePlu
   * @generated
   */
  EClass getPredicatePlu();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicatePlu#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicatePlu#getLeft()
   * @see #getPredicatePlu()
   * @generated
   */
  EReference getPredicatePlu_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicatePlu#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicatePlu#getRight()
   * @see #getPredicatePlu()
   * @generated
   */
  EReference getPredicatePlu_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateMul <em>Predicate Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Mul</em>'.
   * @see eu.quanticol.cASPA.PredicateMul
   * @generated
   */
  EClass getPredicateMul();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateMul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateMul#getLeft()
   * @see #getPredicateMul()
   * @generated
   */
  EReference getPredicateMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateMul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateMul#getRight()
   * @see #getPredicateMul()
   * @generated
   */
  EReference getPredicateMul_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateDiv <em>Predicate Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Div</em>'.
   * @see eu.quanticol.cASPA.PredicateDiv
   * @generated
   */
  EClass getPredicateDiv();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.PredicateDiv#getLeft()
   * @see #getPredicateDiv()
   * @generated
   */
  EReference getPredicateDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.PredicateDiv#getRight()
   * @see #getPredicateDiv()
   * @generated
   */
  EReference getPredicateDiv_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see eu.quanticol.cASPA.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Not#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.Not#getExpression()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see eu.quanticol.cASPA.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constant</em>'.
   * @see eu.quanticol.cASPA.BoolConstant
   * @generated
   */
  EClass getBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.BoolConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.BoolConstant#getValue()
   * @see #getBoolConstant()
   * @generated
   */
  EAttribute getBoolConstant_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In</em>'.
   * @see eu.quanticol.cASPA.In
   * @generated
   */
  EClass getIn();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.In#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see eu.quanticol.cASPA.In#getExpressions()
   * @see #getIn()
   * @generated
   */
  EReference getIn_Expressions();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Out <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out</em>'.
   * @see eu.quanticol.cASPA.Out
   * @generated
   */
  EClass getOut();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.Out#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see eu.quanticol.cASPA.Out#getExpressions()
   * @see #getOut()
   * @generated
   */
  EReference getOut_Expressions();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.LocalSingleEventUpdate <em>Local Single Event Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Single Event Update</em>'.
   * @see eu.quanticol.cASPA.LocalSingleEventUpdate
   * @generated
   */
  EClass getLocalSingleEventUpdate();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.LocalSingleEventUpdate#getName()
   * @see #getLocalSingleEventUpdate()
   * @generated
   */
  EReference getLocalSingleEventUpdate_Name();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.LocalSingleEventUpdate#getExpression()
   * @see #getLocalSingleEventUpdate()
   * @generated
   */
  EReference getLocalSingleEventUpdate_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.DistributedEventUpdateProbability <em>Distributed Event Update Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distributed Event Update Probability</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateProbability
   * @generated
   */
  EClass getDistributedEventUpdateProbability();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.DistributedEventUpdateProbability#getDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Distribution</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateProbability#getDistribution()
   * @see #getDistributedEventUpdateProbability()
   * @generated
   */
  EReference getDistributedEventUpdateProbability_Distribution();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.DistributedEventUpdateUniform <em>Distributed Event Update Uniform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distributed Event Update Uniform</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateUniform
   * @generated
   */
  EClass getDistributedEventUpdateUniform();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.DistributedEventUpdateUniform#getDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Distribution</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateUniform#getDistribution()
   * @see #getDistributedEventUpdateUniform()
   * @generated
   */
  EReference getDistributedEventUpdateUniform_Distribution();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateOr <em>Update Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Or</em>'.
   * @see eu.quanticol.cASPA.UpdateOr
   * @generated
   */
  EClass getUpdateOr();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateOr#getLeft()
   * @see #getUpdateOr()
   * @generated
   */
  EReference getUpdateOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateOr#getRight()
   * @see #getUpdateOr()
   * @generated
   */
  EReference getUpdateOr_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateAnd <em>Update And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update And</em>'.
   * @see eu.quanticol.cASPA.UpdateAnd
   * @generated
   */
  EClass getUpdateAnd();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateAnd#getLeft()
   * @see #getUpdateAnd()
   * @generated
   */
  EReference getUpdateAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateAnd#getRight()
   * @see #getUpdateAnd()
   * @generated
   */
  EReference getUpdateAnd_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateEquality <em>Update Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Equality</em>'.
   * @see eu.quanticol.cASPA.UpdateEquality
   * @generated
   */
  EClass getUpdateEquality();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateEquality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateEquality#getLeft()
   * @see #getUpdateEquality()
   * @generated
   */
  EReference getUpdateEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.UpdateEquality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.UpdateEquality#getOp()
   * @see #getUpdateEquality()
   * @generated
   */
  EAttribute getUpdateEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateEquality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateEquality#getRight()
   * @see #getUpdateEquality()
   * @generated
   */
  EReference getUpdateEquality_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateComparison <em>Update Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Comparison</em>'.
   * @see eu.quanticol.cASPA.UpdateComparison
   * @generated
   */
  EClass getUpdateComparison();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateComparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateComparison#getLeft()
   * @see #getUpdateComparison()
   * @generated
   */
  EReference getUpdateComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.UpdateComparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.UpdateComparison#getOp()
   * @see #getUpdateComparison()
   * @generated
   */
  EAttribute getUpdateComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateComparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateComparison#getRight()
   * @see #getUpdateComparison()
   * @generated
   */
  EReference getUpdateComparison_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateSub <em>Update Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Sub</em>'.
   * @see eu.quanticol.cASPA.UpdateSub
   * @generated
   */
  EClass getUpdateSub();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateSub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateSub#getLeft()
   * @see #getUpdateSub()
   * @generated
   */
  EReference getUpdateSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateSub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateSub#getRight()
   * @see #getUpdateSub()
   * @generated
   */
  EReference getUpdateSub_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdatePlu <em>Update Plu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Plu</em>'.
   * @see eu.quanticol.cASPA.UpdatePlu
   * @generated
   */
  EClass getUpdatePlu();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdatePlu#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdatePlu#getLeft()
   * @see #getUpdatePlu()
   * @generated
   */
  EReference getUpdatePlu_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdatePlu#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdatePlu#getRight()
   * @see #getUpdatePlu()
   * @generated
   */
  EReference getUpdatePlu_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateMul <em>Update Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Mul</em>'.
   * @see eu.quanticol.cASPA.UpdateMul
   * @generated
   */
  EClass getUpdateMul();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateMul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateMul#getLeft()
   * @see #getUpdateMul()
   * @generated
   */
  EReference getUpdateMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateMul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateMul#getRight()
   * @see #getUpdateMul()
   * @generated
   */
  EReference getUpdateMul_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateDiv <em>Update Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Div</em>'.
   * @see eu.quanticol.cASPA.UpdateDiv
   * @generated
   */
  EClass getUpdateDiv();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.UpdateDiv#getLeft()
   * @see #getUpdateDiv()
   * @generated
   */
  EReference getUpdateDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.UpdateDiv#getRight()
   * @see #getUpdateDiv()
   * @generated
   */
  EReference getUpdateDiv_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateNot <em>Update Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Not</em>'.
   * @see eu.quanticol.cASPA.UpdateNot
   * @generated
   */
  EClass getUpdateNot();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateNot#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.UpdateNot#getExpression()
   * @see #getUpdateNot()
   * @generated
   */
  EReference getUpdateNot_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see eu.quanticol.cASPA.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Parallel#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Parallel#getLeft()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Parallel#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Parallel#getRight()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see eu.quanticol.cASPA.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Choice#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Choice#getLeft()
   * @see #getChoice()
   * @generated
   */
  EReference getChoice_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Choice#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Choice#getRight()
   * @see #getChoice()
   * @generated
   */
  EReference getChoice_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Leaf <em>Leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf</em>'.
   * @see eu.quanticol.cASPA.Leaf
   * @generated
   */
  EClass getLeaf();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Leaf#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Leaf#getValue()
   * @see #getLeaf()
   * @generated
   */
  EAttribute getLeaf_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Reference</em>'.
   * @see eu.quanticol.cASPA.ProcessReference
   * @generated
   */
  EClass getProcessReference();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.ProcessReference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.ProcessReference#getValue()
   * @see #getProcessReference()
   * @generated
   */
  EReference getProcessReference_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CASPAFactory getCASPAFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ModelImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Stores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STORES = eINSTANCE.getModel_Stores();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROCESSES = eINSTANCE.getModel_Processes();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TERMS = eINSTANCE.getModel_Terms();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.StoreImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStore()
     * @generated
     */
    EClass STORE = eINSTANCE.getStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__NAME = eINSTANCE.getStore_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__VALUE = eINSTANCE.getStore_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ReferencedStoreImpl <em>Referenced Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ReferencedStoreImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReferencedStore()
     * @generated
     */
    EClass REFERENCED_STORE = eINSTANCE.getReferencedStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_STORE__NAME = eINSTANCE.getReferencedStore_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.SelfReferencedStoreImpl <em>Self Referenced Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.SelfReferencedStoreImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSelfReferencedStore()
     * @generated
     */
    EClass SELF_REFERENCED_STORE = eINSTANCE.getSelfReferencedStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_REFERENCED_STORE__NAME = eINSTANCE.getSelfReferencedStore_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PREDICATE = eINSTANCE.getAction_Predicate();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ARGUMENTS = eINSTANCE.getAction_Arguments();

    /**
     * The meta object literal for the '<em><b>Updates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__UPDATES = eINSTANCE.getAction_Updates();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__PREDICATE = eINSTANCE.getPredicate_Predicate();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateExpression()
     * @generated
     */
    EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ArgumentsImpl <em>Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ArgumentsImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getArguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getArguments();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.InArgumentsImpl <em>In Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.InArgumentsImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getInArguments()
     * @generated
     */
    EClass IN_ARGUMENTS = eINSTANCE.getInArguments();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.OutArgumentsImpl <em>Out Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.OutArgumentsImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOutArguments()
     * @generated
     */
    EClass OUT_ARGUMENTS = eINSTANCE.getOutArguments();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ExpressionsImpl <em>Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ExpressionsImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getExpressions()
     * @generated
     */
    EClass EXPRESSIONS = eINSTANCE.getExpressions();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSIONS__VALUE = eINSTANCE.getExpressions_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.VariablesImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdatesImpl <em>Updates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdatesImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdates()
     * @generated
     */
    EClass UPDATES = eINSTANCE.getUpdates();

    /**
     * The meta object literal for the '<em><b>Updates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATES__UPDATES = eINSTANCE.getUpdates_Updates();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateImpl <em>Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdate()
     * @generated
     */
    EClass UPDATE = eINSTANCE.getUpdate();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.SingleEventUpdateImpl <em>Single Event Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.SingleEventUpdateImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSingleEventUpdate()
     * @generated
     */
    EClass SINGLE_EVENT_UPDATE = eINSTANCE.getSingleEventUpdate();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateImpl <em>Distributed Event Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DistributedEventUpdateImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdate()
     * @generated
     */
    EClass DISTRIBUTED_EVENT_UPDATE = eINSTANCE.getDistributedEventUpdate();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DistributionImpl <em>Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DistributionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistribution()
     * @generated
     */
    EClass DISTRIBUTION = eINSTANCE.getDistribution();

    /**
     * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__PROB = eINSTANCE.getDistribution_Prob();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTION__EXPRESSION = eINSTANCE.getDistribution_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UniformImpl <em>Uniform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UniformImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUniform()
     * @generated
     */
    EClass UNIFORM = eINSTANCE.getUniform();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIFORM__EXPRESSION = eINSTANCE.getUniform_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateExpression()
     * @generated
     */
    EClass UPDATE_EXPRESSION = eINSTANCE.getUpdateExpression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ProcessImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__VALUE = eINSTANCE.getProcess_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ProcessExpressionImpl <em>Process Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ProcessExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcessExpression()
     * @generated
     */
    EClass PROCESS_EXPRESSION = eINSTANCE.getProcessExpression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateProcessImpl <em>Predicate Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateProcessImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateProcess()
     * @generated
     */
    EClass PREDICATE_PROCESS = eINSTANCE.getPredicateProcess();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PROCESS__PREDICATE = eINSTANCE.getPredicateProcess_Predicate();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PROCESS__VALUE = eINSTANCE.getPredicateProcess_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionProcessImpl <em>Action Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionProcessImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionProcess()
     * @generated
     */
    EClass ACTION_PROCESS = eINSTANCE.getActionProcess();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PROCESS__ACTION = eINSTANCE.getActionProcess_Action();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PROCESS__VALUE = eINSTANCE.getActionProcess_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.TermImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__NAME = eINSTANCE.getTerm_Name();

    /**
     * The meta object literal for the '<em><b>Stores</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__STORES = eINSTANCE.getTerm_Stores();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.BroadcastImpl <em>Broadcast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.BroadcastImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBroadcast()
     * @generated
     */
    EClass BROADCAST = eINSTANCE.getBroadcast();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UnicastImpl <em>Unicast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UnicastImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUnicast()
     * @generated
     */
    EClass UNICAST = eINSTANCE.getUnicast();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateOrImpl <em>Predicate Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateOrImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateOr()
     * @generated
     */
    EClass PREDICATE_OR = eINSTANCE.getPredicateOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_OR__LEFT = eINSTANCE.getPredicateOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_OR__RIGHT = eINSTANCE.getPredicateOr_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateAndImpl <em>Predicate And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateAndImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateAnd()
     * @generated
     */
    EClass PREDICATE_AND = eINSTANCE.getPredicateAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_AND__LEFT = eINSTANCE.getPredicateAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_AND__RIGHT = eINSTANCE.getPredicateAnd_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateEqualityImpl <em>Predicate Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateEqualityImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateEquality()
     * @generated
     */
    EClass PREDICATE_EQUALITY = eINSTANCE.getPredicateEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_EQUALITY__LEFT = eINSTANCE.getPredicateEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE_EQUALITY__OP = eINSTANCE.getPredicateEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_EQUALITY__RIGHT = eINSTANCE.getPredicateEquality_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateComparisonImpl <em>Predicate Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateComparisonImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateComparison()
     * @generated
     */
    EClass PREDICATE_COMPARISON = eINSTANCE.getPredicateComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_COMPARISON__LEFT = eINSTANCE.getPredicateComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE_COMPARISON__OP = eINSTANCE.getPredicateComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_COMPARISON__RIGHT = eINSTANCE.getPredicateComparison_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateSubImpl <em>Predicate Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateSubImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateSub()
     * @generated
     */
    EClass PREDICATE_SUB = eINSTANCE.getPredicateSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_SUB__LEFT = eINSTANCE.getPredicateSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_SUB__RIGHT = eINSTANCE.getPredicateSub_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicatePluImpl <em>Predicate Plu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicatePluImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicatePlu()
     * @generated
     */
    EClass PREDICATE_PLU = eINSTANCE.getPredicatePlu();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PLU__LEFT = eINSTANCE.getPredicatePlu_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PLU__RIGHT = eINSTANCE.getPredicatePlu_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateMulImpl <em>Predicate Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateMulImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateMul()
     * @generated
     */
    EClass PREDICATE_MUL = eINSTANCE.getPredicateMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_MUL__LEFT = eINSTANCE.getPredicateMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_MUL__RIGHT = eINSTANCE.getPredicateMul_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateDivImpl <em>Predicate Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateDivImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateDiv()
     * @generated
     */
    EClass PREDICATE_DIV = eINSTANCE.getPredicateDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_DIV__LEFT = eINSTANCE.getPredicateDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_DIV__RIGHT = eINSTANCE.getPredicateDiv_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.NotImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ConstantImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.BoolConstantImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBoolConstant()
     * @generated
     */
    EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.InImpl <em>In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.InImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getIn()
     * @generated
     */
    EClass IN = eINSTANCE.getIn();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN__EXPRESSIONS = eINSTANCE.getIn_Expressions();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.OutImpl <em>Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.OutImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOut()
     * @generated
     */
    EClass OUT = eINSTANCE.getOut();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT__EXPRESSIONS = eINSTANCE.getOut_Expressions();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl <em>Local Single Event Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalSingleEventUpdate()
     * @generated
     */
    EClass LOCAL_SINGLE_EVENT_UPDATE = eINSTANCE.getLocalSingleEventUpdate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SINGLE_EVENT_UPDATE__NAME = eINSTANCE.getLocalSingleEventUpdate_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SINGLE_EVENT_UPDATE__EXPRESSION = eINSTANCE.getLocalSingleEventUpdate_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl <em>Distributed Event Update Probability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdateProbability()
     * @generated
     */
    EClass DISTRIBUTED_EVENT_UPDATE_PROBABILITY = eINSTANCE.getDistributedEventUpdateProbability();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION = eINSTANCE.getDistributedEventUpdateProbability_Distribution();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl <em>Distributed Event Update Uniform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdateUniform()
     * @generated
     */
    EClass DISTRIBUTED_EVENT_UPDATE_UNIFORM = eINSTANCE.getDistributedEventUpdateUniform();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION = eINSTANCE.getDistributedEventUpdateUniform_Distribution();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateOrImpl <em>Update Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateOrImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateOr()
     * @generated
     */
    EClass UPDATE_OR = eINSTANCE.getUpdateOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_OR__LEFT = eINSTANCE.getUpdateOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_OR__RIGHT = eINSTANCE.getUpdateOr_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateAndImpl <em>Update And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateAndImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateAnd()
     * @generated
     */
    EClass UPDATE_AND = eINSTANCE.getUpdateAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_AND__LEFT = eINSTANCE.getUpdateAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_AND__RIGHT = eINSTANCE.getUpdateAnd_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateEqualityImpl <em>Update Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateEqualityImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateEquality()
     * @generated
     */
    EClass UPDATE_EQUALITY = eINSTANCE.getUpdateEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EQUALITY__LEFT = eINSTANCE.getUpdateEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE_EQUALITY__OP = eINSTANCE.getUpdateEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EQUALITY__RIGHT = eINSTANCE.getUpdateEquality_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateComparisonImpl <em>Update Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateComparisonImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateComparison()
     * @generated
     */
    EClass UPDATE_COMPARISON = eINSTANCE.getUpdateComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_COMPARISON__LEFT = eINSTANCE.getUpdateComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE_COMPARISON__OP = eINSTANCE.getUpdateComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_COMPARISON__RIGHT = eINSTANCE.getUpdateComparison_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateSubImpl <em>Update Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateSubImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateSub()
     * @generated
     */
    EClass UPDATE_SUB = eINSTANCE.getUpdateSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_SUB__LEFT = eINSTANCE.getUpdateSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_SUB__RIGHT = eINSTANCE.getUpdateSub_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdatePluImpl <em>Update Plu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdatePluImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdatePlu()
     * @generated
     */
    EClass UPDATE_PLU = eINSTANCE.getUpdatePlu();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_PLU__LEFT = eINSTANCE.getUpdatePlu_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_PLU__RIGHT = eINSTANCE.getUpdatePlu_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateMulImpl <em>Update Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateMulImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateMul()
     * @generated
     */
    EClass UPDATE_MUL = eINSTANCE.getUpdateMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_MUL__LEFT = eINSTANCE.getUpdateMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_MUL__RIGHT = eINSTANCE.getUpdateMul_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateDivImpl <em>Update Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateDivImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateDiv()
     * @generated
     */
    EClass UPDATE_DIV = eINSTANCE.getUpdateDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_DIV__LEFT = eINSTANCE.getUpdateDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_DIV__RIGHT = eINSTANCE.getUpdateDiv_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateNotImpl <em>Update Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateNotImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateNot()
     * @generated
     */
    EClass UPDATE_NOT = eINSTANCE.getUpdateNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_NOT__EXPRESSION = eINSTANCE.getUpdateNot_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ParallelImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__LEFT = eINSTANCE.getParallel_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__RIGHT = eINSTANCE.getParallel_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ChoiceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE__LEFT = eINSTANCE.getChoice_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE__RIGHT = eINSTANCE.getChoice_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.LeafImpl <em>Leaf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.LeafImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLeaf()
     * @generated
     */
    EClass LEAF = eINSTANCE.getLeaf();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEAF__VALUE = eINSTANCE.getLeaf_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ProcessReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcessReference()
     * @generated
     */
    EClass PROCESS_REFERENCE = eINSTANCE.getProcessReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_REFERENCE__VALUE = eINSTANCE.getProcessReference_Value();

  }

} //CASPAPackage
