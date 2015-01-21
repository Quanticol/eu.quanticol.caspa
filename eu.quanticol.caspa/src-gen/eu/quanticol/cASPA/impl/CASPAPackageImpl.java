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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CASPAPackageImpl extends EPackageImpl implements CASPAPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedStoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selfReferencedStoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleEventUpdateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distributedEventUpdateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateProcessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionProcessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass broadcastEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unicastEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEqualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateSubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicatePluEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateMulEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateDivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localSingleEventUpdateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distributedEventUpdateProbabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distributedEventUpdateUniformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateEqualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateSubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updatePluEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateMulEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateDivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateNotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processReferenceEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.quanticol.cASPA.CASPAPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CASPAPackageImpl()
  {
    super(eNS_URI, CASPAFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CASPAPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CASPAPackage init()
  {
    if (isInited) return (CASPAPackage)EPackage.Registry.INSTANCE.getEPackage(CASPAPackage.eNS_URI);

    // Obtain or create and register package
    CASPAPackageImpl theCASPAPackage = (CASPAPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CASPAPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CASPAPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCASPAPackage.createPackageContents();

    // Initialize created meta-data
    theCASPAPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCASPAPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CASPAPackage.eNS_URI, theCASPAPackage);
    return theCASPAPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Stores()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Processes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Terms()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStore()
  {
    return storeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStore_Name()
  {
    return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStore_Value()
  {
    return (EAttribute)storeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencedStore()
  {
    return referencedStoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencedStore_Name()
  {
    return (EReference)referencedStoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelfReferencedStore()
  {
    return selfReferencedStoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelfReferencedStore_Name()
  {
    return (EReference)selfReferencedStoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Predicate()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Arguments()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Updates()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicate()
  {
    return predicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicate_Predicate()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateExpression()
  {
    return predicateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArguments()
  {
    return argumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInArguments()
  {
    return inArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutArguments()
  {
    return outArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressions()
  {
    return expressionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressions_Value()
  {
    return (EAttribute)expressionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariables()
  {
    return variablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdates()
  {
    return updatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdates_Updates()
  {
    return (EReference)updatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdate()
  {
    return updateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleEventUpdate()
  {
    return singleEventUpdateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistributedEventUpdate()
  {
    return distributedEventUpdateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistribution()
  {
    return distributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDistribution_Prob()
  {
    return (EAttribute)distributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDistribution_Expression()
  {
    return (EReference)distributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniform()
  {
    return uniformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniform_Expression()
  {
    return (EReference)uniformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateExpression()
  {
    return updateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Name()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Value()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessExpression()
  {
    return processExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateProcess()
  {
    return predicateProcessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateProcess_Predicate()
  {
    return (EReference)predicateProcessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateProcess_Value()
  {
    return (EReference)predicateProcessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionProcess()
  {
    return actionProcessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionProcess_Action()
  {
    return (EReference)actionProcessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionProcess_Value()
  {
    return (EReference)actionProcessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerm_Name()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerm_Stores()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBroadcast()
  {
    return broadcastEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnicast()
  {
    return unicastEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateOr()
  {
    return predicateOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateOr_Left()
  {
    return (EReference)predicateOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateOr_Right()
  {
    return (EReference)predicateOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateAnd()
  {
    return predicateAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateAnd_Left()
  {
    return (EReference)predicateAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateAnd_Right()
  {
    return (EReference)predicateAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateEquality()
  {
    return predicateEqualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateEquality_Left()
  {
    return (EReference)predicateEqualityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredicateEquality_Op()
  {
    return (EAttribute)predicateEqualityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateEquality_Right()
  {
    return (EReference)predicateEqualityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateComparison()
  {
    return predicateComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateComparison_Left()
  {
    return (EReference)predicateComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredicateComparison_Op()
  {
    return (EAttribute)predicateComparisonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateComparison_Right()
  {
    return (EReference)predicateComparisonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateSub()
  {
    return predicateSubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateSub_Left()
  {
    return (EReference)predicateSubEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateSub_Right()
  {
    return (EReference)predicateSubEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicatePlu()
  {
    return predicatePluEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicatePlu_Left()
  {
    return (EReference)predicatePluEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicatePlu_Right()
  {
    return (EReference)predicatePluEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateMul()
  {
    return predicateMulEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateMul_Left()
  {
    return (EReference)predicateMulEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateMul_Right()
  {
    return (EReference)predicateMulEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateDiv()
  {
    return predicateDivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateDiv_Left()
  {
    return (EReference)predicateDivEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateDiv_Right()
  {
    return (EReference)predicateDivEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNot()
  {
    return notEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNot_Expression()
  {
    return (EReference)notEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Value()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolConstant()
  {
    return boolConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolConstant_Value()
  {
    return (EAttribute)boolConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIn()
  {
    return inEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIn_Expressions()
  {
    return (EReference)inEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOut()
  {
    return outEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOut_Expressions()
  {
    return (EReference)outEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalSingleEventUpdate()
  {
    return localSingleEventUpdateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalSingleEventUpdate_Name()
  {
    return (EReference)localSingleEventUpdateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalSingleEventUpdate_Expression()
  {
    return (EReference)localSingleEventUpdateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistributedEventUpdateProbability()
  {
    return distributedEventUpdateProbabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDistributedEventUpdateProbability_Distribution()
  {
    return (EReference)distributedEventUpdateProbabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistributedEventUpdateUniform()
  {
    return distributedEventUpdateUniformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDistributedEventUpdateUniform_Distribution()
  {
    return (EReference)distributedEventUpdateUniformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateOr()
  {
    return updateOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateOr_Left()
  {
    return (EReference)updateOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateOr_Right()
  {
    return (EReference)updateOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateAnd()
  {
    return updateAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateAnd_Left()
  {
    return (EReference)updateAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateAnd_Right()
  {
    return (EReference)updateAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateEquality()
  {
    return updateEqualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateEquality_Left()
  {
    return (EReference)updateEqualityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdateEquality_Op()
  {
    return (EAttribute)updateEqualityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateEquality_Right()
  {
    return (EReference)updateEqualityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateComparison()
  {
    return updateComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateComparison_Left()
  {
    return (EReference)updateComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdateComparison_Op()
  {
    return (EAttribute)updateComparisonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateComparison_Right()
  {
    return (EReference)updateComparisonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateSub()
  {
    return updateSubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateSub_Left()
  {
    return (EReference)updateSubEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateSub_Right()
  {
    return (EReference)updateSubEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdatePlu()
  {
    return updatePluEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdatePlu_Left()
  {
    return (EReference)updatePluEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdatePlu_Right()
  {
    return (EReference)updatePluEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateMul()
  {
    return updateMulEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateMul_Left()
  {
    return (EReference)updateMulEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateMul_Right()
  {
    return (EReference)updateMulEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateDiv()
  {
    return updateDivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateDiv_Left()
  {
    return (EReference)updateDivEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateDiv_Right()
  {
    return (EReference)updateDivEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateNot()
  {
    return updateNotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateNot_Expression()
  {
    return (EReference)updateNotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParallel()
  {
    return parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_Left()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_Right()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoice()
  {
    return choiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoice_Left()
  {
    return (EReference)choiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoice_Right()
  {
    return (EReference)choiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeaf()
  {
    return leafEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLeaf_Value()
  {
    return (EAttribute)leafEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessReference()
  {
    return processReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessReference_Value()
  {
    return (EReference)processReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CASPAFactory getCASPAFactory()
  {
    return (CASPAFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__STORES);
    createEReference(modelEClass, MODEL__PROCESSES);
    createEReference(modelEClass, MODEL__TERMS);

    storeEClass = createEClass(STORE);
    createEAttribute(storeEClass, STORE__NAME);
    createEAttribute(storeEClass, STORE__VALUE);

    referencedStoreEClass = createEClass(REFERENCED_STORE);
    createEReference(referencedStoreEClass, REFERENCED_STORE__NAME);

    selfReferencedStoreEClass = createEClass(SELF_REFERENCED_STORE);
    createEReference(selfReferencedStoreEClass, SELF_REFERENCED_STORE__NAME);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__PREDICATE);
    createEReference(actionEClass, ACTION__ARGUMENTS);
    createEReference(actionEClass, ACTION__UPDATES);

    predicateEClass = createEClass(PREDICATE);
    createEReference(predicateEClass, PREDICATE__PREDICATE);

    predicateExpressionEClass = createEClass(PREDICATE_EXPRESSION);

    argumentsEClass = createEClass(ARGUMENTS);

    inArgumentsEClass = createEClass(IN_ARGUMENTS);

    outArgumentsEClass = createEClass(OUT_ARGUMENTS);

    expressionsEClass = createEClass(EXPRESSIONS);
    createEAttribute(expressionsEClass, EXPRESSIONS__VALUE);

    variablesEClass = createEClass(VARIABLES);

    updatesEClass = createEClass(UPDATES);
    createEReference(updatesEClass, UPDATES__UPDATES);

    updateEClass = createEClass(UPDATE);

    singleEventUpdateEClass = createEClass(SINGLE_EVENT_UPDATE);

    distributedEventUpdateEClass = createEClass(DISTRIBUTED_EVENT_UPDATE);

    distributionEClass = createEClass(DISTRIBUTION);
    createEAttribute(distributionEClass, DISTRIBUTION__PROB);
    createEReference(distributionEClass, DISTRIBUTION__EXPRESSION);

    uniformEClass = createEClass(UNIFORM);
    createEReference(uniformEClass, UNIFORM__EXPRESSION);

    updateExpressionEClass = createEClass(UPDATE_EXPRESSION);

    processEClass = createEClass(PROCESS);
    createEAttribute(processEClass, PROCESS__NAME);
    createEReference(processEClass, PROCESS__VALUE);

    processExpressionEClass = createEClass(PROCESS_EXPRESSION);

    predicateProcessEClass = createEClass(PREDICATE_PROCESS);
    createEReference(predicateProcessEClass, PREDICATE_PROCESS__PREDICATE);
    createEReference(predicateProcessEClass, PREDICATE_PROCESS__VALUE);

    actionProcessEClass = createEClass(ACTION_PROCESS);
    createEReference(actionProcessEClass, ACTION_PROCESS__ACTION);
    createEReference(actionProcessEClass, ACTION_PROCESS__VALUE);

    termEClass = createEClass(TERM);
    createEReference(termEClass, TERM__NAME);
    createEReference(termEClass, TERM__STORES);

    broadcastEClass = createEClass(BROADCAST);

    unicastEClass = createEClass(UNICAST);

    predicateOrEClass = createEClass(PREDICATE_OR);
    createEReference(predicateOrEClass, PREDICATE_OR__LEFT);
    createEReference(predicateOrEClass, PREDICATE_OR__RIGHT);

    predicateAndEClass = createEClass(PREDICATE_AND);
    createEReference(predicateAndEClass, PREDICATE_AND__LEFT);
    createEReference(predicateAndEClass, PREDICATE_AND__RIGHT);

    predicateEqualityEClass = createEClass(PREDICATE_EQUALITY);
    createEReference(predicateEqualityEClass, PREDICATE_EQUALITY__LEFT);
    createEAttribute(predicateEqualityEClass, PREDICATE_EQUALITY__OP);
    createEReference(predicateEqualityEClass, PREDICATE_EQUALITY__RIGHT);

    predicateComparisonEClass = createEClass(PREDICATE_COMPARISON);
    createEReference(predicateComparisonEClass, PREDICATE_COMPARISON__LEFT);
    createEAttribute(predicateComparisonEClass, PREDICATE_COMPARISON__OP);
    createEReference(predicateComparisonEClass, PREDICATE_COMPARISON__RIGHT);

    predicateSubEClass = createEClass(PREDICATE_SUB);
    createEReference(predicateSubEClass, PREDICATE_SUB__LEFT);
    createEReference(predicateSubEClass, PREDICATE_SUB__RIGHT);

    predicatePluEClass = createEClass(PREDICATE_PLU);
    createEReference(predicatePluEClass, PREDICATE_PLU__LEFT);
    createEReference(predicatePluEClass, PREDICATE_PLU__RIGHT);

    predicateMulEClass = createEClass(PREDICATE_MUL);
    createEReference(predicateMulEClass, PREDICATE_MUL__LEFT);
    createEReference(predicateMulEClass, PREDICATE_MUL__RIGHT);

    predicateDivEClass = createEClass(PREDICATE_DIV);
    createEReference(predicateDivEClass, PREDICATE_DIV__LEFT);
    createEReference(predicateDivEClass, PREDICATE_DIV__RIGHT);

    notEClass = createEClass(NOT);
    createEReference(notEClass, NOT__EXPRESSION);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__VALUE);

    boolConstantEClass = createEClass(BOOL_CONSTANT);
    createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

    inEClass = createEClass(IN);
    createEReference(inEClass, IN__EXPRESSIONS);

    outEClass = createEClass(OUT);
    createEReference(outEClass, OUT__EXPRESSIONS);

    localSingleEventUpdateEClass = createEClass(LOCAL_SINGLE_EVENT_UPDATE);
    createEReference(localSingleEventUpdateEClass, LOCAL_SINGLE_EVENT_UPDATE__NAME);
    createEReference(localSingleEventUpdateEClass, LOCAL_SINGLE_EVENT_UPDATE__EXPRESSION);

    distributedEventUpdateProbabilityEClass = createEClass(DISTRIBUTED_EVENT_UPDATE_PROBABILITY);
    createEReference(distributedEventUpdateProbabilityEClass, DISTRIBUTED_EVENT_UPDATE_PROBABILITY__DISTRIBUTION);

    distributedEventUpdateUniformEClass = createEClass(DISTRIBUTED_EVENT_UPDATE_UNIFORM);
    createEReference(distributedEventUpdateUniformEClass, DISTRIBUTED_EVENT_UPDATE_UNIFORM__DISTRIBUTION);

    updateOrEClass = createEClass(UPDATE_OR);
    createEReference(updateOrEClass, UPDATE_OR__LEFT);
    createEReference(updateOrEClass, UPDATE_OR__RIGHT);

    updateAndEClass = createEClass(UPDATE_AND);
    createEReference(updateAndEClass, UPDATE_AND__LEFT);
    createEReference(updateAndEClass, UPDATE_AND__RIGHT);

    updateEqualityEClass = createEClass(UPDATE_EQUALITY);
    createEReference(updateEqualityEClass, UPDATE_EQUALITY__LEFT);
    createEAttribute(updateEqualityEClass, UPDATE_EQUALITY__OP);
    createEReference(updateEqualityEClass, UPDATE_EQUALITY__RIGHT);

    updateComparisonEClass = createEClass(UPDATE_COMPARISON);
    createEReference(updateComparisonEClass, UPDATE_COMPARISON__LEFT);
    createEAttribute(updateComparisonEClass, UPDATE_COMPARISON__OP);
    createEReference(updateComparisonEClass, UPDATE_COMPARISON__RIGHT);

    updateSubEClass = createEClass(UPDATE_SUB);
    createEReference(updateSubEClass, UPDATE_SUB__LEFT);
    createEReference(updateSubEClass, UPDATE_SUB__RIGHT);

    updatePluEClass = createEClass(UPDATE_PLU);
    createEReference(updatePluEClass, UPDATE_PLU__LEFT);
    createEReference(updatePluEClass, UPDATE_PLU__RIGHT);

    updateMulEClass = createEClass(UPDATE_MUL);
    createEReference(updateMulEClass, UPDATE_MUL__LEFT);
    createEReference(updateMulEClass, UPDATE_MUL__RIGHT);

    updateDivEClass = createEClass(UPDATE_DIV);
    createEReference(updateDivEClass, UPDATE_DIV__LEFT);
    createEReference(updateDivEClass, UPDATE_DIV__RIGHT);

    updateNotEClass = createEClass(UPDATE_NOT);
    createEReference(updateNotEClass, UPDATE_NOT__EXPRESSION);

    parallelEClass = createEClass(PARALLEL);
    createEReference(parallelEClass, PARALLEL__LEFT);
    createEReference(parallelEClass, PARALLEL__RIGHT);

    choiceEClass = createEClass(CHOICE);
    createEReference(choiceEClass, CHOICE__LEFT);
    createEReference(choiceEClass, CHOICE__RIGHT);

    leafEClass = createEClass(LEAF);
    createEAttribute(leafEClass, LEAF__VALUE);

    processReferenceEClass = createEClass(PROCESS_REFERENCE);
    createEReference(processReferenceEClass, PROCESS_REFERENCE__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    referencedStoreEClass.getESuperTypes().add(this.getPredicateExpression());
    referencedStoreEClass.getESuperTypes().add(this.getExpressions());
    referencedStoreEClass.getESuperTypes().add(this.getVariables());
    referencedStoreEClass.getESuperTypes().add(this.getUpdateExpression());
    selfReferencedStoreEClass.getESuperTypes().add(this.getPredicateExpression());
    selfReferencedStoreEClass.getESuperTypes().add(this.getExpressions());
    selfReferencedStoreEClass.getESuperTypes().add(this.getVariables());
    selfReferencedStoreEClass.getESuperTypes().add(this.getUpdateExpression());
    expressionsEClass.getESuperTypes().add(this.getOutArguments());
    variablesEClass.getESuperTypes().add(this.getInArguments());
    singleEventUpdateEClass.getESuperTypes().add(this.getUpdate());
    distributedEventUpdateEClass.getESuperTypes().add(this.getUpdate());
    predicateProcessEClass.getESuperTypes().add(this.getProcessExpression());
    actionProcessEClass.getESuperTypes().add(this.getProcessExpression());
    broadcastEClass.getESuperTypes().add(this.getAction());
    unicastEClass.getESuperTypes().add(this.getAction());
    predicateOrEClass.getESuperTypes().add(this.getPredicateExpression());
    predicateAndEClass.getESuperTypes().add(this.getPredicateExpression());
    predicateEqualityEClass.getESuperTypes().add(this.getPredicateExpression());
    predicateComparisonEClass.getESuperTypes().add(this.getPredicateExpression());
    predicateSubEClass.getESuperTypes().add(this.getPredicateExpression());
    predicatePluEClass.getESuperTypes().add(this.getPredicateExpression());
    predicateMulEClass.getESuperTypes().add(this.getPredicateExpression());
    predicateDivEClass.getESuperTypes().add(this.getPredicateExpression());
    notEClass.getESuperTypes().add(this.getPredicateExpression());
    constantEClass.getESuperTypes().add(this.getPredicateExpression());
    constantEClass.getESuperTypes().add(this.getUpdateExpression());
    boolConstantEClass.getESuperTypes().add(this.getPredicateExpression());
    boolConstantEClass.getESuperTypes().add(this.getUpdateExpression());
    inEClass.getESuperTypes().add(this.getArguments());
    outEClass.getESuperTypes().add(this.getArguments());
    localSingleEventUpdateEClass.getESuperTypes().add(this.getSingleEventUpdate());
    distributedEventUpdateProbabilityEClass.getESuperTypes().add(this.getDistributedEventUpdate());
    distributedEventUpdateUniformEClass.getESuperTypes().add(this.getDistributedEventUpdate());
    updateOrEClass.getESuperTypes().add(this.getUpdateExpression());
    updateAndEClass.getESuperTypes().add(this.getUpdateExpression());
    updateEqualityEClass.getESuperTypes().add(this.getUpdateExpression());
    updateComparisonEClass.getESuperTypes().add(this.getUpdateExpression());
    updateSubEClass.getESuperTypes().add(this.getUpdateExpression());
    updatePluEClass.getESuperTypes().add(this.getUpdateExpression());
    updateMulEClass.getESuperTypes().add(this.getUpdateExpression());
    updateDivEClass.getESuperTypes().add(this.getUpdateExpression());
    updateNotEClass.getESuperTypes().add(this.getUpdateExpression());
    parallelEClass.getESuperTypes().add(this.getProcessExpression());
    choiceEClass.getESuperTypes().add(this.getProcessExpression());
    leafEClass.getESuperTypes().add(this.getProcessExpression());
    processReferenceEClass.getESuperTypes().add(this.getProcessExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Stores(), this.getStore(), null, "stores", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Processes(), this.getProcess(), null, "processes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Terms(), this.getTerm(), null, "terms", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStore_Name(), ecorePackage.getEString(), "name", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStore_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referencedStoreEClass, ReferencedStore.class, "ReferencedStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferencedStore_Name(), this.getStore(), null, "name", null, 0, 1, ReferencedStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selfReferencedStoreEClass, SelfReferencedStore.class, "SelfReferencedStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelfReferencedStore_Name(), this.getStore(), null, "name", null, 0, 1, SelfReferencedStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Predicate(), this.getPredicate(), null, "predicate", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Arguments(), this.getArguments(), null, "arguments", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Updates(), this.getUpdates(), null, "updates", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicate_Predicate(), this.getPredicateExpression(), null, "predicate", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateExpressionEClass, PredicateExpression.class, "PredicateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argumentsEClass, Arguments.class, "Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inArgumentsEClass, InArguments.class, "InArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outArgumentsEClass, OutArguments.class, "OutArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionsEClass, Expressions.class, "Expressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressions_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Expressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesEClass, Variables.class, "Variables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(updatesEClass, Updates.class, "Updates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdates_Updates(), this.getUpdate(), null, "updates", null, 0, -1, Updates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(singleEventUpdateEClass, SingleEventUpdate.class, "SingleEventUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(distributedEventUpdateEClass, DistributedEventUpdate.class, "DistributedEventUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDistribution_Prob(), ecorePackage.getEDouble(), "prob", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDistribution_Expression(), this.getUpdateExpression(), null, "expression", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uniformEClass, Uniform.class, "Uniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniform_Expression(), this.getUpdateExpression(), null, "expression", null, 0, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateExpressionEClass, UpdateExpression.class, "UpdateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processEClass, eu.quanticol.cASPA.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, eu.quanticol.cASPA.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Value(), this.getProcessExpression(), null, "value", null, 0, 1, eu.quanticol.cASPA.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processExpressionEClass, ProcessExpression.class, "ProcessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(predicateProcessEClass, PredicateProcess.class, "PredicateProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateProcess_Predicate(), this.getPredicate(), null, "predicate", null, 0, 1, PredicateProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateProcess_Value(), this.getProcess(), null, "value", null, 0, 1, PredicateProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionProcessEClass, ActionProcess.class, "ActionProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionProcess_Action(), this.getAction(), null, "action", null, 0, 1, ActionProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionProcess_Value(), this.getProcess(), null, "value", null, 0, 1, ActionProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerm_Name(), this.getProcess(), null, "name", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerm_Stores(), this.getStore(), null, "stores", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(broadcastEClass, Broadcast.class, "Broadcast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unicastEClass, Unicast.class, "Unicast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(predicateOrEClass, PredicateOr.class, "PredicateOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateOr_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateOr_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateAndEClass, PredicateAnd.class, "PredicateAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateAnd_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateAnd_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateEqualityEClass, PredicateEquality.class, "PredicateEquality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateEquality_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPredicateEquality_Op(), ecorePackage.getEString(), "op", null, 0, 1, PredicateEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateEquality_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateComparisonEClass, PredicateComparison.class, "PredicateComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateComparison_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPredicateComparison_Op(), ecorePackage.getEString(), "op", null, 0, 1, PredicateComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateComparison_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateSubEClass, PredicateSub.class, "PredicateSub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateSub_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateSub_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicatePluEClass, PredicatePlu.class, "PredicatePlu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicatePlu_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicatePlu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicatePlu_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicatePlu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateMulEClass, PredicateMul.class, "PredicateMul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateMul_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateMul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateMul_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateMul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateDivEClass, PredicateDiv.class, "PredicateDiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateDiv_Left(), this.getPredicateExpression(), null, "left", null, 0, 1, PredicateDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateDiv_Right(), this.getPredicateExpression(), null, "right", null, 0, 1, PredicateDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNot_Expression(), this.getPredicateExpression(), null, "expression", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIn_Expressions(), this.getInArguments(), null, "expressions", null, 0, -1, In.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outEClass, Out.class, "Out", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOut_Expressions(), this.getOutArguments(), null, "expressions", null, 0, -1, Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSingleEventUpdateEClass, LocalSingleEventUpdate.class, "LocalSingleEventUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalSingleEventUpdate_Name(), this.getSelfReferencedStore(), null, "name", null, 0, 1, LocalSingleEventUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalSingleEventUpdate_Expression(), this.getUpdateExpression(), null, "expression", null, 0, 1, LocalSingleEventUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(distributedEventUpdateProbabilityEClass, DistributedEventUpdateProbability.class, "DistributedEventUpdateProbability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDistributedEventUpdateProbability_Distribution(), this.getDistribution(), null, "distribution", null, 0, -1, DistributedEventUpdateProbability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(distributedEventUpdateUniformEClass, DistributedEventUpdateUniform.class, "DistributedEventUpdateUniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDistributedEventUpdateUniform_Distribution(), this.getUniform(), null, "distribution", null, 0, -1, DistributedEventUpdateUniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateOrEClass, UpdateOr.class, "UpdateOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateOr_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateOr_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateAndEClass, UpdateAnd.class, "UpdateAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateAnd_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateAnd_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateEqualityEClass, UpdateEquality.class, "UpdateEquality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateEquality_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUpdateEquality_Op(), ecorePackage.getEString(), "op", null, 0, 1, UpdateEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateEquality_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateComparisonEClass, UpdateComparison.class, "UpdateComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateComparison_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUpdateComparison_Op(), ecorePackage.getEString(), "op", null, 0, 1, UpdateComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateComparison_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateSubEClass, UpdateSub.class, "UpdateSub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateSub_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateSub_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updatePluEClass, UpdatePlu.class, "UpdatePlu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdatePlu_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdatePlu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdatePlu_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdatePlu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateMulEClass, UpdateMul.class, "UpdateMul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateMul_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateMul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateMul_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateMul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateDivEClass, UpdateDiv.class, "UpdateDiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateDiv_Left(), this.getUpdateExpression(), null, "left", null, 0, 1, UpdateDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateDiv_Right(), this.getUpdateExpression(), null, "right", null, 0, 1, UpdateDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateNotEClass, UpdateNot.class, "UpdateNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateNot_Expression(), this.getUpdateExpression(), null, "expression", null, 0, 1, UpdateNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParallel_Left(), this.getProcessExpression(), null, "left", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParallel_Right(), this.getProcessExpression(), null, "right", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChoice_Left(), this.getProcessExpression(), null, "left", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoice_Right(), this.getProcessExpression(), null, "right", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(leafEClass, Leaf.class, "Leaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLeaf_Value(), ecorePackage.getEString(), "value", null, 0, 1, Leaf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processReferenceEClass, ProcessReference.class, "ProcessReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessReference_Value(), this.getProcess(), null, "value", null, 0, 1, ProcessReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CASPAPackageImpl
