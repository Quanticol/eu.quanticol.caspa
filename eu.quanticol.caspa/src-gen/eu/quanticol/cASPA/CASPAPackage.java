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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.TermImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getTerm()
   * @generated
   */
  int TERM = 1;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ProcessImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 2;

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
  int PROCESS_EXPRESSION = 3;

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
  int PREDICATE_PROCESS = 4;

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
  int ACTION_PROCESS = 5;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

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
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__EVALUATIONS = 2;

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
  int PREDICATE = 7;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.EvaluationsImpl <em>Evaluations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.EvaluationsImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEvaluations()
   * @generated
   */
  int EVALUATIONS = 8;

  /**
   * The number of structural features of the '<em>Evaluations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdatesImpl <em>Updates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdatesImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdates()
   * @generated
   */
  int UPDATES = 9;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateExpression()
   * @generated
   */
  int PREDICATE_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Predicate Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.EvaluationExpressionInImpl <em>Evaluation Expression In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.EvaluationExpressionInImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEvaluationExpressionIn()
   * @generated
   */
  int EVALUATION_EXPRESSION_IN = 11;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION_IN__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Evaluation Expression In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION_IN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.EvaluationExpressionOutImpl <em>Evaluation Expression Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.EvaluationExpressionOutImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEvaluationExpressionOut()
   * @generated
   */
  int EVALUATION_EXPRESSION_OUT = 12;

  /**
   * The number of structural features of the '<em>Evaluation Expression Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION_OUT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateExpression()
   * @generated
   */
  int UPDATE_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.SelfReferencedStoreImpl <em>Self Referenced Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.SelfReferencedStoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSelfReferencedStore()
   * @generated
   */
  int SELF_REFERENCED_STORE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE__NAME = 0;

  /**
   * The number of structural features of the '<em>Self Referenced Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCED_STORE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionExpression()
   * @generated
   */
  int ACTION_EXPRESSION = 15;

  /**
   * The number of structural features of the '<em>Action Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.StoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStore()
   * @generated
   */
  int STORE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 17;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ParallelImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 18;

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
  int CHOICE = 19;

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
  int LEAF = 20;

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
  int PROCESS_REFERENCE = 21;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BroadcastImpl <em>Broadcast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BroadcastImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBroadcast()
   * @generated
   */
  int BROADCAST = 22;

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
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST__EVALUATIONS = ACTION__EVALUATIONS;

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
  int UNICAST = 23;

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
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICAST__EVALUATIONS = ACTION__EVALUATIONS;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.InImpl <em>In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.InImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getIn()
   * @generated
   */
  int IN = 24;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__EXPRESSIONS = EVALUATIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_FEATURE_COUNT = EVALUATIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.OutImpl <em>Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.OutImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOut()
   * @generated
   */
  int OUT = 25;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT__EXPRESSIONS = EVALUATIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_FEATURE_COUNT = EVALUATIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.LocalEvaluationExpressionImpl <em>Local Evaluation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.LocalEvaluationExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalEvaluationExpression()
   * @generated
   */
  int LOCAL_EVALUATION_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EVALUATION_EXPRESSION__EXPRESSION = EVALUATION_EXPRESSION_IN__EXPRESSION;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EVALUATION_EXPRESSION__NAME = EVALUATION_EXPRESSION_IN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Evaluation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EVALUATION_EXPRESSION_FEATURE_COUNT = EVALUATION_EXPRESSION_IN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.GlobalEvaluationExpressionImpl <em>Global Evaluation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.GlobalEvaluationExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getGlobalEvaluationExpression()
   * @generated
   */
  int GLOBAL_EVALUATION_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_EVALUATION_EXPRESSION__EXPRESSION = EVALUATION_EXPRESSION_IN__EXPRESSION;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_EVALUATION_EXPRESSION__NAME = EVALUATION_EXPRESSION_IN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Global Evaluation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_EVALUATION_EXPRESSION_FEATURE_COUNT = EVALUATION_EXPRESSION_IN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.FreeEvaluationExpressionImpl <em>Free Evaluation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.FreeEvaluationExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getFreeEvaluationExpression()
   * @generated
   */
  int FREE_EVALUATION_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_EVALUATION_EXPRESSION__NAME = EVALUATION_EXPRESSION_OUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_EVALUATION_EXPRESSION__EXPRESSION = EVALUATION_EXPRESSION_OUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Free Evaluation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_EVALUATION_EXPRESSION_FEATURE_COUNT = EVALUATION_EXPRESSION_OUT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.LocalUpdateExpressionImpl <em>Local Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.LocalUpdateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalUpdateExpression()
   * @generated
   */
  int LOCAL_UPDATE_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_UPDATE_EXPRESSION__EXPRESSION = UPDATE_EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_UPDATE_EXPRESSION__NAME = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_UPDATE_EXPRESSION_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.GlobalUpdateExpressionImpl <em>Global Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.GlobalUpdateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getGlobalUpdateExpression()
   * @generated
   */
  int GLOBAL_UPDATE_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_UPDATE_EXPRESSION__EXPRESSION = UPDATE_EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_UPDATE_EXPRESSION__NAME = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Global Update Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_UPDATE_EXPRESSION_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionOrImpl <em>Action Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionOrImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionOr()
   * @generated
   */
  int ACTION_OR = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OR__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OR__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OR_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionAndImpl <em>Action And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionAndImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionAnd()
   * @generated
   */
  int ACTION_AND = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_AND__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_AND__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_AND_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionEqualityImpl <em>Action Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionEqualityImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionEquality()
   * @generated
   */
  int ACTION_EQUALITY = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY__OP = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EQUALITY_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionComparisonImpl <em>Action Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionComparisonImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionComparison()
   * @generated
   */
  int ACTION_COMPARISON = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON__OP = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COMPARISON_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionSubImpl <em>Action Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionSubImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionSub()
   * @generated
   */
  int ACTION_SUB = 35;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SUB__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SUB__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SUB_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionPluImpl <em>Action Plu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionPluImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionPlu()
   * @generated
   */
  int ACTION_PLU = 36;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PLU__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PLU__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Plu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PLU_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionMulImpl <em>Action Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionMulImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionMul()
   * @generated
   */
  int ACTION_MUL = 37;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_MUL__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_MUL__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_MUL_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionDivImpl <em>Action Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionDivImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionDiv()
   * @generated
   */
  int ACTION_DIV = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DIV__LEFT = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DIV__RIGHT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DIV_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionNotImpl <em>Action Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionNotImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionNot()
   * @generated
   */
  int ACTION_NOT = 39;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_NOT__EXPRESSION = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_NOT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DoubleConstantImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDoubleConstant()
   * @generated
   */
  int DOUBLE_CONSTANT = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.FreeVariableImpl <em>Free Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.FreeVariableImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getFreeVariable()
   * @generated
   */
  int FREE_VARIABLE = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Free Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BoolConstantImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ReferencedStoreImpl <em>Referenced Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ReferencedStoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReferencedStore()
   * @generated
   */
  int REFERENCED_STORE = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE__VALUE = ACTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Referenced Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_STORE_FEATURE_COUNT = ACTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.OrImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOr()
   * @generated
   */
  int OR = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.AndImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getAnd()
   * @generated
   */
  int AND = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.EqualityImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ComparisonImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.SubImpl <em>Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.SubImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSub()
   * @generated
   */
  int SUB = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PluImpl <em>Plu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PluImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPlu()
   * @generated
   */
  int PLU = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLU__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLU__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLU_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.MulImpl <em>Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.MulImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getMul()
   * @generated
   */
  int MUL = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DivImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDiv()
   * @generated
   */
  int DIV = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.NotImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getNot()
   * @generated
   */
  int NOT = 52;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Action#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluations</em>'.
   * @see eu.quanticol.cASPA.Action#getEvaluations()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Evaluations();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Evaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluations</em>'.
   * @see eu.quanticol.cASPA.Evaluations
   * @generated
   */
  EClass getEvaluations();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateExpression <em>Predicate Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Expression</em>'.
   * @see eu.quanticol.cASPA.PredicateExpression
   * @generated
   */
  EClass getPredicateExpression();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.PredicateExpression#getExpression()
   * @see #getPredicateExpression()
   * @generated
   */
  EReference getPredicateExpression_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.EvaluationExpressionIn <em>Evaluation Expression In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Expression In</em>'.
   * @see eu.quanticol.cASPA.EvaluationExpressionIn
   * @generated
   */
  EClass getEvaluationExpressionIn();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.EvaluationExpressionIn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.EvaluationExpressionIn#getExpression()
   * @see #getEvaluationExpressionIn()
   * @generated
   */
  EReference getEvaluationExpressionIn_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.EvaluationExpressionOut <em>Evaluation Expression Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Expression Out</em>'.
   * @see eu.quanticol.cASPA.EvaluationExpressionOut
   * @generated
   */
  EClass getEvaluationExpressionOut();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.UpdateExpression#getExpression()
   * @see #getUpdateExpression()
   * @generated
   */
  EReference getUpdateExpression_Expression();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Expression</em>'.
   * @see eu.quanticol.cASPA.ActionExpression
   * @generated
   */
  EClass getActionExpression();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Store#getValue()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.Expression
   * @generated
   */
  EClass getExpression();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.LocalEvaluationExpression <em>Local Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Evaluation Expression</em>'.
   * @see eu.quanticol.cASPA.LocalEvaluationExpression
   * @generated
   */
  EClass getLocalEvaluationExpression();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.LocalEvaluationExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.LocalEvaluationExpression#getName()
   * @see #getLocalEvaluationExpression()
   * @generated
   */
  EReference getLocalEvaluationExpression_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.GlobalEvaluationExpression <em>Global Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Evaluation Expression</em>'.
   * @see eu.quanticol.cASPA.GlobalEvaluationExpression
   * @generated
   */
  EClass getGlobalEvaluationExpression();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.GlobalEvaluationExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.GlobalEvaluationExpression#getName()
   * @see #getGlobalEvaluationExpression()
   * @generated
   */
  EReference getGlobalEvaluationExpression_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.FreeEvaluationExpression <em>Free Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Evaluation Expression</em>'.
   * @see eu.quanticol.cASPA.FreeEvaluationExpression
   * @generated
   */
  EClass getFreeEvaluationExpression();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.FreeEvaluationExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.FreeEvaluationExpression#getName()
   * @see #getFreeEvaluationExpression()
   * @generated
   */
  EAttribute getFreeEvaluationExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.FreeEvaluationExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.FreeEvaluationExpression#getExpression()
   * @see #getFreeEvaluationExpression()
   * @generated
   */
  EReference getFreeEvaluationExpression_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.LocalUpdateExpression <em>Local Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Update Expression</em>'.
   * @see eu.quanticol.cASPA.LocalUpdateExpression
   * @generated
   */
  EClass getLocalUpdateExpression();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.LocalUpdateExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.LocalUpdateExpression#getName()
   * @see #getLocalUpdateExpression()
   * @generated
   */
  EReference getLocalUpdateExpression_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.GlobalUpdateExpression <em>Global Update Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Update Expression</em>'.
   * @see eu.quanticol.cASPA.GlobalUpdateExpression
   * @generated
   */
  EClass getGlobalUpdateExpression();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.GlobalUpdateExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see eu.quanticol.cASPA.GlobalUpdateExpression#getName()
   * @see #getGlobalUpdateExpression()
   * @generated
   */
  EReference getGlobalUpdateExpression_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionOr <em>Action Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Or</em>'.
   * @see eu.quanticol.cASPA.ActionOr
   * @generated
   */
  EClass getActionOr();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionOr#getLeft()
   * @see #getActionOr()
   * @generated
   */
  EReference getActionOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionOr#getRight()
   * @see #getActionOr()
   * @generated
   */
  EReference getActionOr_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionAnd <em>Action And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action And</em>'.
   * @see eu.quanticol.cASPA.ActionAnd
   * @generated
   */
  EClass getActionAnd();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionAnd#getLeft()
   * @see #getActionAnd()
   * @generated
   */
  EReference getActionAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionAnd#getRight()
   * @see #getActionAnd()
   * @generated
   */
  EReference getActionAnd_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionEquality <em>Action Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Equality</em>'.
   * @see eu.quanticol.cASPA.ActionEquality
   * @generated
   */
  EClass getActionEquality();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionEquality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionEquality#getLeft()
   * @see #getActionEquality()
   * @generated
   */
  EReference getActionEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.ActionEquality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.ActionEquality#getOp()
   * @see #getActionEquality()
   * @generated
   */
  EAttribute getActionEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionEquality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionEquality#getRight()
   * @see #getActionEquality()
   * @generated
   */
  EReference getActionEquality_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionComparison <em>Action Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Comparison</em>'.
   * @see eu.quanticol.cASPA.ActionComparison
   * @generated
   */
  EClass getActionComparison();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionComparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionComparison#getLeft()
   * @see #getActionComparison()
   * @generated
   */
  EReference getActionComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.ActionComparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.ActionComparison#getOp()
   * @see #getActionComparison()
   * @generated
   */
  EAttribute getActionComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionComparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionComparison#getRight()
   * @see #getActionComparison()
   * @generated
   */
  EReference getActionComparison_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionSub <em>Action Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Sub</em>'.
   * @see eu.quanticol.cASPA.ActionSub
   * @generated
   */
  EClass getActionSub();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionSub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionSub#getLeft()
   * @see #getActionSub()
   * @generated
   */
  EReference getActionSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionSub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionSub#getRight()
   * @see #getActionSub()
   * @generated
   */
  EReference getActionSub_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionPlu <em>Action Plu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Plu</em>'.
   * @see eu.quanticol.cASPA.ActionPlu
   * @generated
   */
  EClass getActionPlu();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionPlu#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionPlu#getLeft()
   * @see #getActionPlu()
   * @generated
   */
  EReference getActionPlu_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionPlu#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionPlu#getRight()
   * @see #getActionPlu()
   * @generated
   */
  EReference getActionPlu_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionMul <em>Action Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Mul</em>'.
   * @see eu.quanticol.cASPA.ActionMul
   * @generated
   */
  EClass getActionMul();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionMul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionMul#getLeft()
   * @see #getActionMul()
   * @generated
   */
  EReference getActionMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionMul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionMul#getRight()
   * @see #getActionMul()
   * @generated
   */
  EReference getActionMul_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionDiv <em>Action Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Div</em>'.
   * @see eu.quanticol.cASPA.ActionDiv
   * @generated
   */
  EClass getActionDiv();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.ActionDiv#getLeft()
   * @see #getActionDiv()
   * @generated
   */
  EReference getActionDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.ActionDiv#getRight()
   * @see #getActionDiv()
   * @generated
   */
  EReference getActionDiv_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ActionNot <em>Action Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Not</em>'.
   * @see eu.quanticol.cASPA.ActionNot
   * @generated
   */
  EClass getActionNot();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionNot#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.ActionNot#getExpression()
   * @see #getActionNot()
   * @generated
   */
  EReference getActionNot_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Constant</em>'.
   * @see eu.quanticol.cASPA.DoubleConstant
   * @generated
   */
  EClass getDoubleConstant();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.DoubleConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.DoubleConstant#getValue()
   * @see #getDoubleConstant()
   * @generated
   */
  EAttribute getDoubleConstant_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.FreeVariable <em>Free Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Variable</em>'.
   * @see eu.quanticol.cASPA.FreeVariable
   * @generated
   */
  EClass getFreeVariable();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.FreeVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.quanticol.cASPA.FreeVariable#getValue()
   * @see #getFreeVariable()
   * @generated
   */
  EAttribute getFreeVariable_Value();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ReferencedStore <em>Referenced Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Store</em>'.
   * @see eu.quanticol.cASPA.ReferencedStore
   * @generated
   */
  EClass getReferencedStore();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.ReferencedStore#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.ReferencedStore#getValue()
   * @see #getReferencedStore()
   * @generated
   */
  EReference getReferencedStore_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see eu.quanticol.cASPA.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see eu.quanticol.cASPA.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see eu.quanticol.cASPA.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Equality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Equality#getLeft()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Equality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.Equality#getOp()
   * @see #getEquality()
   * @generated
   */
  EAttribute getEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Equality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Equality#getRight()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see eu.quanticol.cASPA.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see eu.quanticol.cASPA.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub</em>'.
   * @see eu.quanticol.cASPA.Sub
   * @generated
   */
  EClass getSub();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Sub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Sub#getLeft()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Sub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Sub#getRight()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Plu <em>Plu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plu</em>'.
   * @see eu.quanticol.cASPA.Plu
   * @generated
   */
  EClass getPlu();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Plu#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Plu#getLeft()
   * @see #getPlu()
   * @generated
   */
  EReference getPlu_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Plu#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Plu#getRight()
   * @see #getPlu()
   * @generated
   */
  EReference getPlu_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Mul <em>Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul</em>'.
   * @see eu.quanticol.cASPA.Mul
   * @generated
   */
  EClass getMul();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Mul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Mul#getLeft()
   * @see #getMul()
   * @generated
   */
  EReference getMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Mul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Mul#getRight()
   * @see #getMul()
   * @generated
   */
  EReference getMul_Right();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see eu.quanticol.cASPA.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.quanticol.cASPA.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.quanticol.cASPA.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

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
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__EVALUATIONS = eINSTANCE.getAction_Evaluations();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.EvaluationsImpl <em>Evaluations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.EvaluationsImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEvaluations()
     * @generated
     */
    EClass EVALUATIONS = eINSTANCE.getEvaluations();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateExpression()
     * @generated
     */
    EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_EXPRESSION__EXPRESSION = eINSTANCE.getPredicateExpression_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.EvaluationExpressionInImpl <em>Evaluation Expression In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.EvaluationExpressionInImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEvaluationExpressionIn()
     * @generated
     */
    EClass EVALUATION_EXPRESSION_IN = eINSTANCE.getEvaluationExpressionIn();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_EXPRESSION_IN__EXPRESSION = eINSTANCE.getEvaluationExpressionIn_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.EvaluationExpressionOutImpl <em>Evaluation Expression Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.EvaluationExpressionOutImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEvaluationExpressionOut()
     * @generated
     */
    EClass EVALUATION_EXPRESSION_OUT = eINSTANCE.getEvaluationExpressionOut();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EXPRESSION__EXPRESSION = eINSTANCE.getUpdateExpression_Expression();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionExpression()
     * @generated
     */
    EClass ACTION_EXPRESSION = eINSTANCE.getActionExpression();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__VALUE = eINSTANCE.getStore_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.LocalEvaluationExpressionImpl <em>Local Evaluation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.LocalEvaluationExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalEvaluationExpression()
     * @generated
     */
    EClass LOCAL_EVALUATION_EXPRESSION = eINSTANCE.getLocalEvaluationExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_EVALUATION_EXPRESSION__NAME = eINSTANCE.getLocalEvaluationExpression_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.GlobalEvaluationExpressionImpl <em>Global Evaluation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.GlobalEvaluationExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getGlobalEvaluationExpression()
     * @generated
     */
    EClass GLOBAL_EVALUATION_EXPRESSION = eINSTANCE.getGlobalEvaluationExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_EVALUATION_EXPRESSION__NAME = eINSTANCE.getGlobalEvaluationExpression_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.FreeEvaluationExpressionImpl <em>Free Evaluation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.FreeEvaluationExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getFreeEvaluationExpression()
     * @generated
     */
    EClass FREE_EVALUATION_EXPRESSION = eINSTANCE.getFreeEvaluationExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREE_EVALUATION_EXPRESSION__NAME = eINSTANCE.getFreeEvaluationExpression_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FREE_EVALUATION_EXPRESSION__EXPRESSION = eINSTANCE.getFreeEvaluationExpression_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.LocalUpdateExpressionImpl <em>Local Update Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.LocalUpdateExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalUpdateExpression()
     * @generated
     */
    EClass LOCAL_UPDATE_EXPRESSION = eINSTANCE.getLocalUpdateExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_UPDATE_EXPRESSION__NAME = eINSTANCE.getLocalUpdateExpression_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.GlobalUpdateExpressionImpl <em>Global Update Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.GlobalUpdateExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getGlobalUpdateExpression()
     * @generated
     */
    EClass GLOBAL_UPDATE_EXPRESSION = eINSTANCE.getGlobalUpdateExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_UPDATE_EXPRESSION__NAME = eINSTANCE.getGlobalUpdateExpression_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionOrImpl <em>Action Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionOrImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionOr()
     * @generated
     */
    EClass ACTION_OR = eINSTANCE.getActionOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_OR__LEFT = eINSTANCE.getActionOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_OR__RIGHT = eINSTANCE.getActionOr_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionAndImpl <em>Action And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionAndImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionAnd()
     * @generated
     */
    EClass ACTION_AND = eINSTANCE.getActionAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_AND__LEFT = eINSTANCE.getActionAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_AND__RIGHT = eINSTANCE.getActionAnd_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionEqualityImpl <em>Action Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionEqualityImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionEquality()
     * @generated
     */
    EClass ACTION_EQUALITY = eINSTANCE.getActionEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EQUALITY__LEFT = eINSTANCE.getActionEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_EQUALITY__OP = eINSTANCE.getActionEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EQUALITY__RIGHT = eINSTANCE.getActionEquality_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionComparisonImpl <em>Action Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionComparisonImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionComparison()
     * @generated
     */
    EClass ACTION_COMPARISON = eINSTANCE.getActionComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_COMPARISON__LEFT = eINSTANCE.getActionComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_COMPARISON__OP = eINSTANCE.getActionComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_COMPARISON__RIGHT = eINSTANCE.getActionComparison_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionSubImpl <em>Action Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionSubImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionSub()
     * @generated
     */
    EClass ACTION_SUB = eINSTANCE.getActionSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SUB__LEFT = eINSTANCE.getActionSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SUB__RIGHT = eINSTANCE.getActionSub_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionPluImpl <em>Action Plu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionPluImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionPlu()
     * @generated
     */
    EClass ACTION_PLU = eINSTANCE.getActionPlu();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PLU__LEFT = eINSTANCE.getActionPlu_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PLU__RIGHT = eINSTANCE.getActionPlu_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionMulImpl <em>Action Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionMulImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionMul()
     * @generated
     */
    EClass ACTION_MUL = eINSTANCE.getActionMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_MUL__LEFT = eINSTANCE.getActionMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_MUL__RIGHT = eINSTANCE.getActionMul_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionDivImpl <em>Action Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionDivImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionDiv()
     * @generated
     */
    EClass ACTION_DIV = eINSTANCE.getActionDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_DIV__LEFT = eINSTANCE.getActionDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_DIV__RIGHT = eINSTANCE.getActionDiv_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ActionNotImpl <em>Action Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ActionNotImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getActionNot()
     * @generated
     */
    EClass ACTION_NOT = eINSTANCE.getActionNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_NOT__EXPRESSION = eINSTANCE.getActionNot_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DoubleConstantImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDoubleConstant()
     * @generated
     */
    EClass DOUBLE_CONSTANT = eINSTANCE.getDoubleConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_CONSTANT__VALUE = eINSTANCE.getDoubleConstant_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.FreeVariableImpl <em>Free Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.FreeVariableImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getFreeVariable()
     * @generated
     */
    EClass FREE_VARIABLE = eINSTANCE.getFreeVariable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREE_VARIABLE__VALUE = eINSTANCE.getFreeVariable_Value();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ReferencedStoreImpl <em>Referenced Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ReferencedStoreImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReferencedStore()
     * @generated
     */
    EClass REFERENCED_STORE = eINSTANCE.getReferencedStore();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_STORE__VALUE = eINSTANCE.getReferencedStore_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.OrImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.AndImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.EqualityImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ComparisonImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.SubImpl <em>Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.SubImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSub()
     * @generated
     */
    EClass SUB = eINSTANCE.getSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__LEFT = eINSTANCE.getSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__RIGHT = eINSTANCE.getSub_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PluImpl <em>Plu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PluImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPlu()
     * @generated
     */
    EClass PLU = eINSTANCE.getPlu();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLU__LEFT = eINSTANCE.getPlu_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLU__RIGHT = eINSTANCE.getPlu_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.MulImpl <em>Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.MulImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getMul()
     * @generated
     */
    EClass MUL = eINSTANCE.getMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL__LEFT = eINSTANCE.getMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL__RIGHT = eINSTANCE.getMul_Right();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DivImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

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

  }

} //CASPAPackage
