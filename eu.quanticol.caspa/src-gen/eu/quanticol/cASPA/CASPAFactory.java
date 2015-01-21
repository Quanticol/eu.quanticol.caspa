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
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

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
   * Returns a new object of class '<em>Evaluations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluations</em>'.
   * @generated
   */
  Evaluations createEvaluations();

  /**
   * Returns a new object of class '<em>Updates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Updates</em>'.
   * @generated
   */
  Updates createUpdates();

  /**
   * Returns a new object of class '<em>Predicate Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Expression</em>'.
   * @generated
   */
  PredicateExpression createPredicateExpression();

  /**
   * Returns a new object of class '<em>Evaluation Expression In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Expression In</em>'.
   * @generated
   */
  EvaluationExpressionIn createEvaluationExpressionIn();

  /**
   * Returns a new object of class '<em>Evaluation Expression Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Expression Out</em>'.
   * @generated
   */
  EvaluationExpressionOut createEvaluationExpressionOut();

  /**
   * Returns a new object of class '<em>Update Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Expression</em>'.
   * @generated
   */
  UpdateExpression createUpdateExpression();

  /**
   * Returns a new object of class '<em>Self Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Referenced Store</em>'.
   * @generated
   */
  SelfReferencedStore createSelfReferencedStore();

  /**
   * Returns a new object of class '<em>Function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Expression</em>'.
   * @generated
   */
  FunctionExpression createFunctionExpression();

  /**
   * Returns a new object of class '<em>Distribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distribution</em>'.
   * @generated
   */
  Distribution createDistribution();

  /**
   * Returns a new object of class '<em>Uniform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uniform</em>'.
   * @generated
   */
  Uniform createUniform();

  /**
   * Returns a new object of class '<em>Action Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Expression</em>'.
   * @generated
   */
  ActionExpression createActionExpression();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

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
   * Returns a new object of class '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Reference</em>'.
   * @generated
   */
  ProcessReference createProcessReference();

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
   * Returns a new object of class '<em>Local Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Evaluation Expression</em>'.
   * @generated
   */
  LocalEvaluationExpression createLocalEvaluationExpression();

  /**
   * Returns a new object of class '<em>Global Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Evaluation Expression</em>'.
   * @generated
   */
  GlobalEvaluationExpression createGlobalEvaluationExpression();

  /**
   * Returns a new object of class '<em>Free Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Evaluation Expression</em>'.
   * @generated
   */
  FreeEvaluationExpression createFreeEvaluationExpression();

  /**
   * Returns a new object of class '<em>Local Update Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Update Expression</em>'.
   * @generated
   */
  LocalUpdateExpression createLocalUpdateExpression();

  /**
   * Returns a new object of class '<em>Global Update Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Update Expression</em>'.
   * @generated
   */
  GlobalUpdateExpression createGlobalUpdateExpression();

  /**
   * Returns a new object of class '<em>Local Update Expression Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Update Expression Function</em>'.
   * @generated
   */
  LocalUpdateExpressionFunction createLocalUpdateExpressionFunction();

  /**
   * Returns a new object of class '<em>Global Update Expression Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Update Expression Function</em>'.
   * @generated
   */
  GlobalUpdateExpressionFunction createGlobalUpdateExpressionFunction();

  /**
   * Returns a new object of class '<em>Action Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Or</em>'.
   * @generated
   */
  ActionOr createActionOr();

  /**
   * Returns a new object of class '<em>Action And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action And</em>'.
   * @generated
   */
  ActionAnd createActionAnd();

  /**
   * Returns a new object of class '<em>Action Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Equality</em>'.
   * @generated
   */
  ActionEquality createActionEquality();

  /**
   * Returns a new object of class '<em>Action Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Comparison</em>'.
   * @generated
   */
  ActionComparison createActionComparison();

  /**
   * Returns a new object of class '<em>Action Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Sub</em>'.
   * @generated
   */
  ActionSub createActionSub();

  /**
   * Returns a new object of class '<em>Action Plu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Plu</em>'.
   * @generated
   */
  ActionPlu createActionPlu();

  /**
   * Returns a new object of class '<em>Action Mul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Mul</em>'.
   * @generated
   */
  ActionMul createActionMul();

  /**
   * Returns a new object of class '<em>Action Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Div</em>'.
   * @generated
   */
  ActionDiv createActionDiv();

  /**
   * Returns a new object of class '<em>Action Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Not</em>'.
   * @generated
   */
  ActionNot createActionNot();

  /**
   * Returns a new object of class '<em>Double Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Constant</em>'.
   * @generated
   */
  DoubleConstant createDoubleConstant();

  /**
   * Returns a new object of class '<em>Free Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Variable</em>'.
   * @generated
   */
  FreeVariable createFreeVariable();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  BoolConstant createBoolConstant();

  /**
   * Returns a new object of class '<em>Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referenced Store</em>'.
   * @generated
   */
  ReferencedStore createReferencedStore();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub</em>'.
   * @generated
   */
  Sub createSub();

  /**
   * Returns a new object of class '<em>Plu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plu</em>'.
   * @generated
   */
  Plu createPlu();

  /**
   * Returns a new object of class '<em>Mul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul</em>'.
   * @generated
   */
  Mul createMul();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CASPAPackage getCASPAPackage();

} //CASPAFactory
