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
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TERMS = 0;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROCESSES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateExpression()
   * @generated
   */
  int PREDICATE_EXPRESSION = 4;

  /**
   * The number of structural features of the '<em>Predicate Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.StoreExpressionImpl <em>Store Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.StoreExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStoreExpression()
   * @generated
   */
  int STORE_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_EXPRESSION__UPDATES = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Store Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ActionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

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
  int PREDICATE = 3;

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
  int ARGUMENTS = 5;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdatesImpl <em>Updates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdatesImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdates()
   * @generated
   */
  int UPDATES = 6;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateExpressionImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateExpression()
   * @generated
   */
  int UPDATE_EXPRESSION = 7;

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
  int PROCESS = 8;

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
  int PROCESS_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Process Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.TermImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getTerm()
   * @generated
   */
  int TERM = 10;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__REF = 0;

  /**
   * The feature id for the '<em><b>Stores</b></em>' containment reference.
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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.StoresImpl <em>Stores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.StoresImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStores()
   * @generated
   */
  int STORES = 11;

  /**
   * The feature id for the '<em><b>Stores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORES__STORES = 0;

  /**
   * The number of structural features of the '<em>Stores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BooleanConstantImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBooleanConstant()
   * @generated
   */
  int BOOLEAN_CONSTANT = 12;

  /**
   * The number of structural features of the '<em>Boolean Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.StoreImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStore()
   * @generated
   */
  int STORE = 13;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__NAME = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__VALUE = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 14;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.SelfReferenceImpl <em>Self Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.SelfReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSelfReference()
   * @generated
   */
  int SELF_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__NAME = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Self Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.FreeVariableImpl <em>Free Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.FreeVariableImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getFreeVariable()
   * @generated
   */
  int FREE_VARIABLE = 16;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE__NAME = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Free Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VARIABLE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BroadcastImpl <em>Broadcast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BroadcastImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBroadcast()
   * @generated
   */
  int BROADCAST = 17;

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
  int UNICAST = 18;

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
  int PREDICATE_OR = 19;

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
  int PREDICATE_AND = 20;

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
  int PREDICATE_EQUALITY = 21;

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
  int PREDICATE_COMPARISON = 22;

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
  int PREDICATE_SUB = 23;

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
  int PREDICATE_PLU = 24;

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
  int PREDICATE_MUL = 25;

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
  int PREDICATE_DIV = 26;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateNotImpl <em>Predicate Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateNotImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateNot()
   * @generated
   */
  int PREDICATE_NOT = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_NOT__EXPRESSION = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Predicate Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_NOT_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ConstantImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 28;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.BoolImpl <em>Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.BoolImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBool()
   * @generated
   */
  int BOOL = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__VALUE = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateStoreReferenceImpl <em>Predicate Store Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateStoreReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateStoreReference()
   * @generated
   */
  int PREDICATE_STORE_REFERENCE = 30;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_STORE_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_STORE_REFERENCE__REF = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Predicate Store Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_STORE_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.InImpl <em>In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.InImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getIn()
   * @generated
   */
  int IN = 31;

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
  int OUT = 32;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.OutStoreReferenceImpl <em>Out Store Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.OutStoreReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOutStoreReference()
   * @generated
   */
  int OUT_STORE_REFERENCE = 33;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_STORE_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_STORE_REFERENCE__REF = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Out Store Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_STORE_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl <em>Local Single Event Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.LocalSingleEventUpdateImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getLocalSingleEventUpdate()
   * @generated
   */
  int LOCAL_SINGLE_EVENT_UPDATE = 34;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE__UPDATES = UPDATES__UPDATES;

  /**
   * The feature id for the '<em><b>Assignee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE = UPDATES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assigner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER = UPDATES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Single Event Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SINGLE_EVENT_UPDATE_FEATURE_COUNT = UPDATES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl <em>Distributed Event Update Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributedEventUpdateProbabilityImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdateProbability()
   * @generated
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY = 35;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY__UPDATES = UPDATES__UPDATES;

  /**
   * The feature id for the '<em><b>Assignee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY__ASSIGNEE = UPDATES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assigner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY__ASSIGNER = UPDATES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION = UPDATES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Distributed Event Update Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_PROBABILITY_FEATURE_COUNT = UPDATES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl <em>Distributed Event Update Uniform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributedEventUpdateUniformImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributedEventUpdateUniform()
   * @generated
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM = 36;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM__UPDATES = UPDATES__UPDATES;

  /**
   * The feature id for the '<em><b>Assignee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE = UPDATES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assigner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER = UPDATES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION = UPDATES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Distributed Event Update Uniform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTED_EVENT_UPDATE_UNIFORM_FEATURE_COUNT = UPDATES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateStoreReferenceImpl <em>Update Store Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateStoreReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateStoreReference()
   * @generated
   */
  int UPDATE_STORE_REFERENCE = 37;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STORE_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STORE_REFERENCE__REF = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Store Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STORE_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributionNaturalImpl <em>Distribution Natural</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributionNaturalImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributionNatural()
   * @generated
   */
  int DISTRIBUTION_NATURAL = 38;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_NATURAL__UPDATES = UPDATES__UPDATES;

  /**
   * The feature id for the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_NATURAL__PROB = UPDATES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_NATURAL__EXPRESSION = UPDATES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Distribution Natural</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_NATURAL_FEATURE_COUNT = UPDATES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.DistributionReferenceImpl <em>Distribution Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.DistributionReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributionReference()
   * @generated
   */
  int DISTRIBUTION_REFERENCE = 39;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_REFERENCE__PROB = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_REFERENCE__REF = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Distribution Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UniformNaturalImpl <em>Uniform Natural</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UniformNaturalImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUniformNatural()
   * @generated
   */
  int UNIFORM_NATURAL = 40;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_NATURAL__UPDATES = UPDATES__UPDATES;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_NATURAL__EXPRESSION = UPDATES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Uniform Natural</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_NATURAL_FEATURE_COUNT = UPDATES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UniformReferenceImpl <em>Uniform Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UniformReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUniformReference()
   * @generated
   */
  int UNIFORM_REFERENCE = 41;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_REFERENCE__REF = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Uniform Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateSubImpl <em>Update Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateSubImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateSub()
   * @generated
   */
  int UPDATE_SUB = 42;

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
  int UPDATE_PLU = 43;

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
  int UPDATE_MUL = 44;

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
  int UPDATE_DIV = 45;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.UpdateExpressionStoreReferenceImpl <em>Update Expression Store Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.UpdateExpressionStoreReferenceImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateExpressionStoreReference()
   * @generated
   */
  int UPDATE_EXPRESSION_STORE_REFERENCE = 46;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_STORE_REFERENCE__UPDATES = STORE_EXPRESSION__UPDATES;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_STORE_REFERENCE__REF = STORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Expression Store Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_EXPRESSION_STORE_REFERENCE_FEATURE_COUNT = STORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ParallelImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 47;

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
  int CHOICE = 48;

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
  int LEAF = 49;

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
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.PredicateProcessImpl <em>Predicate Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.PredicateProcessImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateProcess()
   * @generated
   */
  int PREDICATE_PROCESS = 50;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS__PREDICATE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_PROCESS__REF = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

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
  int ACTION_PROCESS = 51;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS__ACTION = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS__REF = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.quanticol.cASPA.impl.ReferencedProcessImpl <em>Referenced Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.quanticol.cASPA.impl.ReferencedProcessImpl
   * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReferencedProcess()
   * @generated
   */
  int REFERENCED_PROCESS = 52;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_PROCESS__REF = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Referenced Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.StoreExpression <em>Store Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store Expression</em>'.
   * @see eu.quanticol.cASPA.StoreExpression
   * @generated
   */
  EClass getStoreExpression();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see eu.quanticol.cASPA.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Term#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.Term#getRef()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Ref();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Term#getStores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stores</em>'.
   * @see eu.quanticol.cASPA.Term#getStores()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Stores();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Stores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stores</em>'.
   * @see eu.quanticol.cASPA.Stores
   * @generated
   */
  EClass getStores();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.Stores#getStores <em>Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stores</em>'.
   * @see eu.quanticol.cASPA.Stores#getStores()
   * @see #getStores()
   * @generated
   */
  EReference getStores_Stores();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.BooleanConstant <em>Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Constant</em>'.
   * @see eu.quanticol.cASPA.BooleanConstant
   * @generated
   */
  EClass getBooleanConstant();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see eu.quanticol.cASPA.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.Reference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.Reference#getName()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Name();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.SelfReference <em>Self Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Reference</em>'.
   * @see eu.quanticol.cASPA.SelfReference
   * @generated
   */
  EClass getSelfReference();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.SelfReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.SelfReference#getName()
   * @see #getSelfReference()
   * @generated
   */
  EAttribute getSelfReference_Name();

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
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.FreeVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.quanticol.cASPA.FreeVariable#getName()
   * @see #getFreeVariable()
   * @generated
   */
  EAttribute getFreeVariable_Name();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateNot <em>Predicate Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Not</em>'.
   * @see eu.quanticol.cASPA.PredicateNot
   * @generated
   */
  EClass getPredicateNot();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateNot#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.PredicateNot#getExpression()
   * @see #getPredicateNot()
   * @generated
   */
  EReference getPredicateNot_Expression();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool</em>'.
   * @see eu.quanticol.cASPA.Bool
   * @generated
   */
  EClass getBool();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.Bool#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.quanticol.cASPA.Bool#getValue()
   * @see #getBool()
   * @generated
   */
  EReference getBool_Value();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.PredicateStoreReference <em>Predicate Store Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Store Reference</em>'.
   * @see eu.quanticol.cASPA.PredicateStoreReference
   * @generated
   */
  EClass getPredicateStoreReference();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateStoreReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.PredicateStoreReference#getRef()
   * @see #getPredicateStoreReference()
   * @generated
   */
  EReference getPredicateStoreReference_Ref();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.OutStoreReference <em>Out Store Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Store Reference</em>'.
   * @see eu.quanticol.cASPA.OutStoreReference
   * @generated
   */
  EClass getOutStoreReference();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.OutStoreReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.OutStoreReference#getRef()
   * @see #getOutStoreReference()
   * @generated
   */
  EReference getOutStoreReference_Ref();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getAssignee <em>Assignee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignee</em>'.
   * @see eu.quanticol.cASPA.LocalSingleEventUpdate#getAssignee()
   * @see #getLocalSingleEventUpdate()
   * @generated
   */
  EReference getLocalSingleEventUpdate_Assignee();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.LocalSingleEventUpdate#getAssigner <em>Assigner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assigner</em>'.
   * @see eu.quanticol.cASPA.LocalSingleEventUpdate#getAssigner()
   * @see #getLocalSingleEventUpdate()
   * @generated
   */
  EReference getLocalSingleEventUpdate_Assigner();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.DistributedEventUpdateProbability#getAssignee <em>Assignee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignee</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateProbability#getAssignee()
   * @see #getDistributedEventUpdateProbability()
   * @generated
   */
  EReference getDistributedEventUpdateProbability_Assignee();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.DistributedEventUpdateProbability#getAssigner <em>Assigner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigner</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateProbability#getAssigner()
   * @see #getDistributedEventUpdateProbability()
   * @generated
   */
  EReference getDistributedEventUpdateProbability_Assigner();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.DistributedEventUpdateUniform#getAssignee <em>Assignee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignee</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateUniform#getAssignee()
   * @see #getDistributedEventUpdateUniform()
   * @generated
   */
  EReference getDistributedEventUpdateUniform_Assignee();

  /**
   * Returns the meta object for the containment reference list '{@link eu.quanticol.cASPA.DistributedEventUpdateUniform#getAssigner <em>Assigner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assigner</em>'.
   * @see eu.quanticol.cASPA.DistributedEventUpdateUniform#getAssigner()
   * @see #getDistributedEventUpdateUniform()
   * @generated
   */
  EReference getDistributedEventUpdateUniform_Assigner();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateStoreReference <em>Update Store Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Store Reference</em>'.
   * @see eu.quanticol.cASPA.UpdateStoreReference
   * @generated
   */
  EClass getUpdateStoreReference();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateStoreReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.UpdateStoreReference#getRef()
   * @see #getUpdateStoreReference()
   * @generated
   */
  EReference getUpdateStoreReference_Ref();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.DistributionNatural <em>Distribution Natural</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution Natural</em>'.
   * @see eu.quanticol.cASPA.DistributionNatural
   * @generated
   */
  EClass getDistributionNatural();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.DistributionNatural#getProb <em>Prob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prob</em>'.
   * @see eu.quanticol.cASPA.DistributionNatural#getProb()
   * @see #getDistributionNatural()
   * @generated
   */
  EAttribute getDistributionNatural_Prob();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.DistributionNatural#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.DistributionNatural#getExpression()
   * @see #getDistributionNatural()
   * @generated
   */
  EAttribute getDistributionNatural_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.DistributionReference <em>Distribution Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution Reference</em>'.
   * @see eu.quanticol.cASPA.DistributionReference
   * @generated
   */
  EClass getDistributionReference();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.DistributionReference#getProb <em>Prob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prob</em>'.
   * @see eu.quanticol.cASPA.DistributionReference#getProb()
   * @see #getDistributionReference()
   * @generated
   */
  EAttribute getDistributionReference_Prob();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.DistributionReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.DistributionReference#getRef()
   * @see #getDistributionReference()
   * @generated
   */
  EReference getDistributionReference_Ref();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UniformNatural <em>Uniform Natural</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uniform Natural</em>'.
   * @see eu.quanticol.cASPA.UniformNatural
   * @generated
   */
  EClass getUniformNatural();

  /**
   * Returns the meta object for the attribute '{@link eu.quanticol.cASPA.UniformNatural#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see eu.quanticol.cASPA.UniformNatural#getExpression()
   * @see #getUniformNatural()
   * @generated
   */
  EAttribute getUniformNatural_Expression();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UniformReference <em>Uniform Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uniform Reference</em>'.
   * @see eu.quanticol.cASPA.UniformReference
   * @generated
   */
  EClass getUniformReference();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UniformReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.UniformReference#getRef()
   * @see #getUniformReference()
   * @generated
   */
  EReference getUniformReference_Ref();

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
   * Returns the meta object for class '{@link eu.quanticol.cASPA.UpdateExpressionStoreReference <em>Update Expression Store Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Expression Store Reference</em>'.
   * @see eu.quanticol.cASPA.UpdateExpressionStoreReference
   * @generated
   */
  EClass getUpdateExpressionStoreReference();

  /**
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.UpdateExpressionStoreReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.UpdateExpressionStoreReference#getRef()
   * @see #getUpdateExpressionStoreReference()
   * @generated
   */
  EReference getUpdateExpressionStoreReference_Ref();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.PredicateProcess#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.PredicateProcess#getRef()
   * @see #getPredicateProcess()
   * @generated
   */
  EReference getPredicateProcess_Ref();

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
   * Returns the meta object for the containment reference '{@link eu.quanticol.cASPA.ActionProcess#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.ActionProcess#getRef()
   * @see #getActionProcess()
   * @generated
   */
  EReference getActionProcess_Ref();

  /**
   * Returns the meta object for class '{@link eu.quanticol.cASPA.ReferencedProcess <em>Referenced Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Process</em>'.
   * @see eu.quanticol.cASPA.ReferencedProcess
   * @generated
   */
  EClass getReferencedProcess();

  /**
   * Returns the meta object for the reference '{@link eu.quanticol.cASPA.ReferencedProcess#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see eu.quanticol.cASPA.ReferencedProcess#getRef()
   * @see #getReferencedProcess()
   * @generated
   */
  EReference getReferencedProcess_Ref();

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
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TERMS = eINSTANCE.getModel_Terms();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROCESSES = eINSTANCE.getModel_Processes();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.StoreExpressionImpl <em>Store Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.StoreExpressionImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStoreExpression()
     * @generated
     */
    EClass STORE_EXPRESSION = eINSTANCE.getStoreExpression();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.TermImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__REF = eINSTANCE.getTerm_Ref();

    /**
     * The meta object literal for the '<em><b>Stores</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__STORES = eINSTANCE.getTerm_Stores();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.StoresImpl <em>Stores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.StoresImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getStores()
     * @generated
     */
    EClass STORES = eINSTANCE.getStores();

    /**
     * The meta object literal for the '<em><b>Stores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORES__STORES = eINSTANCE.getStores_Stores();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.BooleanConstantImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBooleanConstant()
     * @generated
     */
    EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.SelfReferenceImpl <em>Self Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.SelfReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getSelfReference()
     * @generated
     */
    EClass SELF_REFERENCE = eINSTANCE.getSelfReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_REFERENCE__NAME = eINSTANCE.getSelfReference_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREE_VARIABLE__NAME = eINSTANCE.getFreeVariable_Name();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateNotImpl <em>Predicate Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateNotImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateNot()
     * @generated
     */
    EClass PREDICATE_NOT = eINSTANCE.getPredicateNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_NOT__EXPRESSION = eINSTANCE.getPredicateNot_Expression();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.BoolImpl <em>Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.BoolImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getBool()
     * @generated
     */
    EClass BOOL = eINSTANCE.getBool();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOL__VALUE = eINSTANCE.getBool_Value();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.PredicateStoreReferenceImpl <em>Predicate Store Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.PredicateStoreReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getPredicateStoreReference()
     * @generated
     */
    EClass PREDICATE_STORE_REFERENCE = eINSTANCE.getPredicateStoreReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_STORE_REFERENCE__REF = eINSTANCE.getPredicateStoreReference_Ref();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.OutStoreReferenceImpl <em>Out Store Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.OutStoreReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getOutStoreReference()
     * @generated
     */
    EClass OUT_STORE_REFERENCE = eINSTANCE.getOutStoreReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_STORE_REFERENCE__REF = eINSTANCE.getOutStoreReference_Ref();

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
     * The meta object literal for the '<em><b>Assignee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SINGLE_EVENT_UPDATE__ASSIGNEE = eINSTANCE.getLocalSingleEventUpdate_Assignee();

    /**
     * The meta object literal for the '<em><b>Assigner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER = eINSTANCE.getLocalSingleEventUpdate_Assigner();

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
     * The meta object literal for the '<em><b>Assignee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_PROBABILITY__ASSIGNEE = eINSTANCE.getDistributedEventUpdateProbability_Assignee();

    /**
     * The meta object literal for the '<em><b>Assigner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_PROBABILITY__ASSIGNER = eINSTANCE.getDistributedEventUpdateProbability_Assigner();

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
     * The meta object literal for the '<em><b>Assignee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNEE = eINSTANCE.getDistributedEventUpdateUniform_Assignee();

    /**
     * The meta object literal for the '<em><b>Assigner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_UNIFORM__ASSIGNER = eINSTANCE.getDistributedEventUpdateUniform_Assigner();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION = eINSTANCE.getDistributedEventUpdateUniform_Distribution();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateStoreReferenceImpl <em>Update Store Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateStoreReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateStoreReference()
     * @generated
     */
    EClass UPDATE_STORE_REFERENCE = eINSTANCE.getUpdateStoreReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STORE_REFERENCE__REF = eINSTANCE.getUpdateStoreReference_Ref();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DistributionNaturalImpl <em>Distribution Natural</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DistributionNaturalImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributionNatural()
     * @generated
     */
    EClass DISTRIBUTION_NATURAL = eINSTANCE.getDistributionNatural();

    /**
     * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION_NATURAL__PROB = eINSTANCE.getDistributionNatural_Prob();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION_NATURAL__EXPRESSION = eINSTANCE.getDistributionNatural_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.DistributionReferenceImpl <em>Distribution Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.DistributionReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getDistributionReference()
     * @generated
     */
    EClass DISTRIBUTION_REFERENCE = eINSTANCE.getDistributionReference();

    /**
     * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION_REFERENCE__PROB = eINSTANCE.getDistributionReference_Prob();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTION_REFERENCE__REF = eINSTANCE.getDistributionReference_Ref();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UniformNaturalImpl <em>Uniform Natural</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UniformNaturalImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUniformNatural()
     * @generated
     */
    EClass UNIFORM_NATURAL = eINSTANCE.getUniformNatural();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIFORM_NATURAL__EXPRESSION = eINSTANCE.getUniformNatural_Expression();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UniformReferenceImpl <em>Uniform Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UniformReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUniformReference()
     * @generated
     */
    EClass UNIFORM_REFERENCE = eINSTANCE.getUniformReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIFORM_REFERENCE__REF = eINSTANCE.getUniformReference_Ref();

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
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.UpdateExpressionStoreReferenceImpl <em>Update Expression Store Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.UpdateExpressionStoreReferenceImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getUpdateExpressionStoreReference()
     * @generated
     */
    EClass UPDATE_EXPRESSION_STORE_REFERENCE = eINSTANCE.getUpdateExpressionStoreReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_EXPRESSION_STORE_REFERENCE__REF = eINSTANCE.getUpdateExpressionStoreReference_Ref();

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
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_PROCESS__REF = eINSTANCE.getPredicateProcess_Ref();

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
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PROCESS__REF = eINSTANCE.getActionProcess_Ref();

    /**
     * The meta object literal for the '{@link eu.quanticol.cASPA.impl.ReferencedProcessImpl <em>Referenced Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.quanticol.cASPA.impl.ReferencedProcessImpl
     * @see eu.quanticol.cASPA.impl.CASPAPackageImpl#getReferencedProcess()
     * @generated
     */
    EClass REFERENCED_PROCESS = eINSTANCE.getReferencedProcess();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_PROCESS__REF = eINSTANCE.getReferencedProcess_Ref();

  }

} //CASPAPackage
