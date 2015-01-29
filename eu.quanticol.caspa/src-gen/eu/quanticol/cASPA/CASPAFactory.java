/**
 */
package eu.quanticol.cASPA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.quanticol.cASPA.CASPAPackage
 * @generated
 */
public interface CASPAFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CASPAFactory eINSTANCE = eu.quanticol.cASPA.impl.CASPAFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Store Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store Expression</em>'.
   * @generated
   */
  StoreExpression createStoreExpression();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate</em>'.
   * @generated
   */
  Predicate createPredicate();

  /**
   * Returns a new object of class '<em>Predicate Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Expression</em>'.
   * @generated
   */
  PredicateExpression createPredicateExpression();

  /**
   * Returns a new object of class '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arguments</em>'.
   * @generated
   */
  Arguments createArguments();

  /**
   * Returns a new object of class '<em>Updates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Updates</em>'.
   * @generated
   */
  Updates createUpdates();

  /**
   * Returns a new object of class '<em>Update Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Expression</em>'.
   * @generated
   */
  UpdateExpression createUpdateExpression();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Process Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Expression</em>'.
   * @generated
   */
  ProcessExpression createProcessExpression();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Stores</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stores</em>'.
   * @generated
   */
  Stores createStores();

  /**
   * Returns a new object of class '<em>Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Constant</em>'.
   * @generated
   */
  BooleanConstant createBooleanConstant();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Self Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Reference</em>'.
   * @generated
   */
  SelfReference createSelfReference();

  /**
   * Returns a new object of class '<em>Free Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Variable</em>'.
   * @generated
   */
  FreeVariable createFreeVariable();

  /**
   * Returns a new object of class '<em>Broadcast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Broadcast</em>'.
   * @generated
   */
  Broadcast createBroadcast();

  /**
   * Returns a new object of class '<em>Unicast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unicast</em>'.
   * @generated
   */
  Unicast createUnicast();

  /**
   * Returns a new object of class '<em>Predicate Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Or</em>'.
   * @generated
   */
  PredicateOr createPredicateOr();

  /**
   * Returns a new object of class '<em>Predicate And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate And</em>'.
   * @generated
   */
  PredicateAnd createPredicateAnd();

  /**
   * Returns a new object of class '<em>Predicate Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Equality</em>'.
   * @generated
   */
  PredicateEquality createPredicateEquality();

  /**
   * Returns a new object of class '<em>Predicate Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Comparison</em>'.
   * @generated
   */
  PredicateComparison createPredicateComparison();

  /**
   * Returns a new object of class '<em>Predicate Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Sub</em>'.
   * @generated
   */
  PredicateSub createPredicateSub();

  /**
   * Returns a new object of class '<em>Predicate Plu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Plu</em>'.
   * @generated
   */
  PredicatePlu createPredicatePlu();

  /**
   * Returns a new object of class '<em>Predicate Mul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Mul</em>'.
   * @generated
   */
  PredicateMul createPredicateMul();

  /**
   * Returns a new object of class '<em>Predicate Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Div</em>'.
   * @generated
   */
  PredicateDiv createPredicateDiv();

  /**
   * Returns a new object of class '<em>Predicate Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Not</em>'.
   * @generated
   */
  PredicateNot createPredicateNot();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Predicate Store Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Store Reference</em>'.
   * @generated
   */
  PredicateStoreReference createPredicateStoreReference();

  /**
   * Returns a new object of class '<em>In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In</em>'.
   * @generated
   */
  In createIn();

  /**
   * Returns a new object of class '<em>Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out</em>'.
   * @generated
   */
  Out createOut();

  /**
   * Returns a new object of class '<em>Out Store Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Store Reference</em>'.
   * @generated
   */
  OutStoreReference createOutStoreReference();

  /**
   * Returns a new object of class '<em>Local Single Event Update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Single Event Update</em>'.
   * @generated
   */
  LocalSingleEventUpdate createLocalSingleEventUpdate();

  /**
   * Returns a new object of class '<em>Distributed Event Update Probability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distributed Event Update Probability</em>'.
   * @generated
   */
  DistributedEventUpdateProbability createDistributedEventUpdateProbability();

  /**
   * Returns a new object of class '<em>Distributed Event Update Uniform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distributed Event Update Uniform</em>'.
   * @generated
   */
  DistributedEventUpdateUniform createDistributedEventUpdateUniform();

  /**
   * Returns a new object of class '<em>Update Store Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Store Reference</em>'.
   * @generated
   */
  UpdateStoreReference createUpdateStoreReference();

  /**
   * Returns a new object of class '<em>Distribution Natural</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distribution Natural</em>'.
   * @generated
   */
  DistributionNatural createDistributionNatural();

  /**
   * Returns a new object of class '<em>Distribution Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distribution Reference</em>'.
   * @generated
   */
  DistributionReference createDistributionReference();

  /**
   * Returns a new object of class '<em>Uniform Natural</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uniform Natural</em>'.
   * @generated
   */
  UniformNatural createUniformNatural();

  /**
   * Returns a new object of class '<em>Uniform Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uniform Reference</em>'.
   * @generated
   */
  UniformReference createUniformReference();

  /**
   * Returns a new object of class '<em>Update Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Sub</em>'.
   * @generated
   */
  UpdateSub createUpdateSub();

  /**
   * Returns a new object of class '<em>Update Plu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Plu</em>'.
   * @generated
   */
  UpdatePlu createUpdatePlu();

  /**
   * Returns a new object of class '<em>Update Mul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Mul</em>'.
   * @generated
   */
  UpdateMul createUpdateMul();

  /**
   * Returns a new object of class '<em>Update Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Div</em>'.
   * @generated
   */
  UpdateDiv createUpdateDiv();

  /**
   * Returns a new object of class '<em>Update Expression Store Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Expression Store Reference</em>'.
   * @generated
   */
  UpdateExpressionStoreReference createUpdateExpressionStoreReference();

  /**
   * Returns a new object of class '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel</em>'.
   * @generated
   */
  Parallel createParallel();

  /**
   * Returns a new object of class '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice</em>'.
   * @generated
   */
  Choice createChoice();

  /**
   * Returns a new object of class '<em>Leaf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf</em>'.
   * @generated
   */
  Leaf createLeaf();

  /**
   * Returns a new object of class '<em>Predicate Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Process</em>'.
   * @generated
   */
  PredicateProcess createPredicateProcess();

  /**
   * Returns a new object of class '<em>Action Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Process</em>'.
   * @generated
   */
  ActionProcess createActionProcess();

  /**
   * Returns a new object of class '<em>Referenced Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referenced Process</em>'.
   * @generated
   */
  ReferencedProcess createReferencedProcess();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CASPAPackage getCASPAPackage();

} //CASPAFactory
