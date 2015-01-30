/**
 * generated by Xtext
 */
package eu.quanticol.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.quanticol.ModelUtil;
import eu.quanticol.cASPA.Arguments;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributionReference;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.OutStoreReference;
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
import eu.quanticol.cASPA.PredicateStoreReference;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.Reference;
import eu.quanticol.cASPA.ReferencedProcess;
import eu.quanticol.cASPA.SelfReference;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.Stores;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.UniformReference;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateExpressionStoreReference;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateStoreReference;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.typing.BaseType;
import eu.quanticol.typing.TypeProvider;
import eu.quanticol.validation.AbstractCASPAValidator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class CASPAValidator extends AbstractCASPAValidator {
  @Inject
  @Extension
  private TypeProvider _typeProvider;
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  public final static String PROCESS_NAMES_UNIQUE = "eu.quanticol.processNamesUnique";
  
  public final static String WRONG_TYPE = "eu.quanticol.WrongType";
  
  public final static String FREE_VARIABLES_UNIQUE = "eu.quanticol.freeVariablesUnique";
  
  public final static String REFERENCE_HAS_NO_REFERENCE = "eu.quanticol.ReferenceHasNoReference";
  
  public final static String NO_DUPLICATE_STORES_IN_TERMS = "eu.quanticol.noDuplicateStoresInTerms";
  
  public final static String REQUIRE_UNIQUE_TERMS = "eu.quanticol.requireUniqueTerms";
  
  public final static String STORE_NEVER_USED = "eu.quanticol.storeNeverUsed";
  
  public final static String ARGUMENTS_MATCH = "eu.quanticol.argumentsMatch";
  
  public final static String NO_ACTION_PARTNER = "eu.quanticol.noActionPartner";
  
  public final static String PROCESS_NEVER_USED = "eu.quanticol.processNeverUsed";
  
  public final static String PROCESSEXPRESSION_NOT_JUST_REFERENCES = "eu.quanticol.processExpressionsNotJustReferences";
  
  @Check
  public void checkProcessNamesUnique(final eu.quanticol.cASPA.Process process) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(process, Model.class);
    EList<eu.quanticol.cASPA.Process> processes = _containerOfType.getProcesses();
    int count = 0;
    for (final eu.quanticol.cASPA.Process proc : processes) {
      String _name = proc.getName();
      String _name_1 = process.getName();
      boolean _equals = _name.equals(_name_1);
      if (_equals) {
        count = (count + 1);
      }
    }
    if ((count == 1)) {
      return;
    } else {
      String _name_2 = process.getName();
      String _plus = ("Must have unique process names. \'" + _name_2);
      String _plus_1 = (_plus + "\' is repeated");
      EAttribute _process_Name = CASPAPackage.eINSTANCE.getProcess_Name();
      this.error(_plus_1, _process_Name, 
        CASPAValidator.PROCESS_NAMES_UNIQUE);
    }
  }
  
  @Check
  public void checkType(final Predicate predicate) {
    PredicateExpression _predicate = predicate.getPredicate();
    this.checkExpectedBoolean(_predicate, CASPAPackage.Literals.PREDICATE__PREDICATE);
  }
  
  @Check
  public void checkType(final PredicateOr p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedBoolean(_left, CASPAPackage.Literals.PREDICATE_OR__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedBoolean(_right, CASPAPackage.Literals.PREDICATE_OR__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateAnd p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedBoolean(_left, CASPAPackage.Literals.PREDICATE_AND__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedBoolean(_right, CASPAPackage.Literals.PREDICATE_AND__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateEquality p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.PREDICATE_EQUALITY__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.PREDICATE_EQUALITY__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateComparison p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.PREDICATE_COMPARISON__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.PREDICATE_COMPARISON__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateSub p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.PREDICATE_SUB__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.PREDICATE_SUB__RIGHT);
  }
  
  @Check
  public void checkType(final PredicatePlu p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.PREDICATE_PLU__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.PREDICATE_PLU__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateMul p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.PREDICATE_MUL__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.PREDICATE_MUL__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateDiv p) {
    PredicateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.PREDICATE_DIV__LEFT);
    PredicateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.PREDICATE_DIV__RIGHT);
  }
  
  @Check
  public void checkType(final PredicateNot p) {
    PredicateExpression _expression = p.getExpression();
    this.checkExpectedBoolean(_expression, CASPAPackage.Literals.PREDICATE_NOT__EXPRESSION);
  }
  
  private void checkExpectedBoolean(final PredicateExpression exp, final EReference reference) {
    this.checkExpectedType(exp, TypeProvider.boolConstantType, reference);
  }
  
  private void checkExpectedInt(final PredicateExpression exp, final EReference reference) {
    this.checkExpectedType(exp, TypeProvider.constantType, reference);
  }
  
  private void checkExpectedType(final PredicateExpression exp, final BaseType expectedType, final EReference reference) {
    final BaseType actualType = this.getTypeAndCheckNotNull(exp, reference);
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("expected " + expectedType) + " type, but was ") + actualType), reference, CASPAValidator.WRONG_TYPE);
    }
  }
  
  private BaseType getTypeAndCheckNotNull(final PredicateExpression exp, final EReference reference) {
    BaseType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._typeProvider.typeFor(exp);
    }
    BaseType type = _typeFor;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("null type", reference, CASPAValidator.WRONG_TYPE);
    }
    return type;
  }
  
  @Check
  public void checkType(final LocalSingleEventUpdate update) {
    UpdateExpression _assigner = update.getAssigner();
    this.checkExpectedInt(_assigner, CASPAPackage.Literals.LOCAL_SINGLE_EVENT_UPDATE__ASSIGNER);
  }
  
  @Check
  public void checkType(final UpdateSub p) {
    UpdateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.UPDATE_SUB__LEFT);
    UpdateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.UPDATE_SUB__RIGHT);
  }
  
  @Check
  public void checkType(final UpdatePlu p) {
    UpdateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.UPDATE_PLU__LEFT);
    UpdateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.UPDATE_PLU__RIGHT);
  }
  
  @Check
  public void checkType(final UpdateMul p) {
    UpdateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.UPDATE_MUL__LEFT);
    UpdateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.UPDATE_MUL__RIGHT);
  }
  
  @Check
  public void checkType(final UpdateDiv p) {
    UpdateExpression _left = p.getLeft();
    this.checkExpectedInt(_left, CASPAPackage.Literals.UPDATE_DIV__LEFT);
    UpdateExpression _right = p.getRight();
    this.checkExpectedInt(_right, CASPAPackage.Literals.UPDATE_DIV__RIGHT);
  }
  
  private void checkExpectedInt(final UpdateExpression exp, final EReference reference) {
    this.checkExpectedType(exp, TypeProvider.constantType, reference);
  }
  
  private void checkExpectedType(final UpdateExpression exp, final BaseType expectedType, final EReference reference) {
    final BaseType actualType = this.getTypeAndCheckNotNull(exp, reference);
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("expected " + expectedType) + " type, but was ") + actualType), reference, CASPAValidator.WRONG_TYPE);
    }
  }
  
  private BaseType getTypeAndCheckNotNull(final UpdateExpression exp, final EReference reference) {
    BaseType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._typeProvider.typeFor(exp);
    }
    BaseType type = _typeFor;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      this.error("null type", reference, CASPAValidator.WRONG_TYPE);
    }
    return type;
  }
  
  @Check
  public void checkFreeVariableNamesUnique(final In in) {
    Set<String> freeVariableNames = new HashSet<String>();
    Set<String> allParentTermsStoreNames = new HashSet<String>();
    Set<String> temp = new HashSet<String>();
    EList<Arguments> _expressions = in.getExpressions();
    for (final Arguments expression : _expressions) {
      String _name = ((FreeVariable) expression).getName();
      freeVariableNames.add(_name);
    }
    eu.quanticol.cASPA.Process _fromInGetProcess = this._modelUtil.fromInGetProcess(in);
    Set<eu.quanticol.cASPA.Process> _fromProcessGetReferences = this._modelUtil.fromProcessGetReferences(_fromInGetProcess);
    Set<Term> _fromProcessesGetParentTerms = this._modelUtil.fromProcessesGetParentTerms(_fromProcessGetReferences);
    Set<String> _fromTermsGetStoreNames = this._modelUtil.fromTermsGetStoreNames(_fromProcessesGetParentTerms);
    allParentTermsStoreNames = _fromTermsGetStoreNames;
    for (final String name : allParentTermsStoreNames) {
      temp.add(name);
    }
    temp.removeAll(freeVariableNames);
    int _size = temp.size();
    int _size_1 = allParentTermsStoreNames.size();
    boolean _notEquals = (_size != _size_1);
    if (_notEquals) {
      EReference _in_Expressions = CASPAPackage.eINSTANCE.getIn_Expressions();
      this.error("Free variable names cannot be the same as local store names.", _in_Expressions, 
        CASPAValidator.FREE_VARIABLES_UNIQUE);
    }
  }
  
  @Check
  public void checkReference(final StoreExpression se) {
    String result = this.getResult(se);
    String name = this.getName(se);
    int _length = result.length();
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      EReference _type = this.getType(se);
      this.error((("Reference \'" + name) + result), _type, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE);
    }
  }
  
  public String getResult(final StoreExpression se) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (se instanceof Store) {
        _matched=true;
        _switchResult = "\'";
      }
    }
    if (!_matched) {
      if (se instanceof SelfReference) {
        _matched=true;
        _switchResult = "\'";
      }
    }
    if (!_matched) {
      if (se instanceof Reference) {
        _matched=true;
        _switchResult = "\'";
      }
    }
    if (!_matched) {
      if (se instanceof PredicateStoreReference) {
        _matched=true;
        _switchResult = this.check(((PredicateStoreReference)se));
      }
    }
    if (!_matched) {
      if (se instanceof OutStoreReference) {
        _matched=true;
        _switchResult = this.check(((OutStoreReference)se));
      }
    }
    if (!_matched) {
      if (se instanceof UpdateStoreReference) {
        _matched=true;
        _switchResult = this.check(((UpdateStoreReference)se));
      }
    }
    if (!_matched) {
      if (se instanceof UpdateExpressionStoreReference) {
        _matched=true;
        _switchResult = this.check(((UpdateExpressionStoreReference)se));
      }
    }
    if (!_matched) {
      if (se instanceof DistributionReference) {
        _matched=true;
        _switchResult = this.check(((DistributionReference)se));
      }
    }
    if (!_matched) {
      if (se instanceof UniformReference) {
        _matched=true;
        _switchResult = this.check(((UniformReference)se));
      }
    }
    return _switchResult;
  }
  
  public EReference getType(final StoreExpression se) {
    EReference _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (se instanceof PredicateStoreReference) {
        _matched=true;
        _switchResult = CASPAPackage.eINSTANCE.getPredicateStoreReference_Ref();
      }
    }
    if (!_matched) {
      if (se instanceof OutStoreReference) {
        _matched=true;
        _switchResult = CASPAPackage.eINSTANCE.getOutStoreReference_Ref();
      }
    }
    if (!_matched) {
      if (se instanceof UpdateStoreReference) {
        _matched=true;
        _switchResult = CASPAPackage.eINSTANCE.getUpdateStoreReference_Ref();
      }
    }
    if (!_matched) {
      if (se instanceof UpdateExpressionStoreReference) {
        _matched=true;
        _switchResult = CASPAPackage.eINSTANCE.getUpdateExpressionStoreReference_Ref();
      }
    }
    if (!_matched) {
      if (se instanceof DistributionReference) {
        _matched=true;
        _switchResult = CASPAPackage.eINSTANCE.getDistributionReference_Ref();
      }
    }
    if (!_matched) {
      if (se instanceof UniformReference) {
        _matched=true;
        _switchResult = CASPAPackage.eINSTANCE.getUniformReference_Ref();
      }
    }
    return _switchResult;
  }
  
  public String getName(final StoreExpression se) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (se instanceof Store) {
        _matched=true;
        _switchResult = ((Store)se).getName();
      }
    }
    if (!_matched) {
      if (se instanceof Reference) {
        _matched=true;
        _switchResult = ((Reference)se).getName();
      }
    }
    if (!_matched) {
      if (se instanceof SelfReference) {
        _matched=true;
        _switchResult = ((SelfReference)se).getName();
      }
    }
    if (!_matched) {
      if (se instanceof PredicateStoreReference) {
        _matched=true;
        StoreExpression _ref = ((PredicateStoreReference)se).getRef();
        _switchResult = this.getName(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof OutStoreReference) {
        _matched=true;
        StoreExpression _ref = ((OutStoreReference)se).getRef();
        _switchResult = this.getName(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof UpdateStoreReference) {
        _matched=true;
        StoreExpression _ref = ((UpdateStoreReference)se).getRef();
        _switchResult = this.getName(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof UpdateExpressionStoreReference) {
        _matched=true;
        StoreExpression _ref = ((UpdateExpressionStoreReference)se).getRef();
        _switchResult = this.getName(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof DistributionReference) {
        _matched=true;
        StoreExpression _ref = ((DistributionReference)se).getRef();
        _switchResult = this.getName(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof UniformReference) {
        _matched=true;
        StoreExpression _ref = ((UniformReference)se).getRef();
        _switchResult = this.getName(_ref);
      }
    }
    return _switchResult;
  }
  
  public String getStoreType(final StoreExpression se) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (se instanceof Store) {
        _matched=true;
        _switchResult = "sto";
      }
    }
    if (!_matched) {
      if (se instanceof Reference) {
        _matched=true;
        _switchResult = "ref";
      }
    }
    if (!_matched) {
      if (se instanceof SelfReference) {
        _matched=true;
        _switchResult = "sel";
      }
    }
    if (!_matched) {
      if (se instanceof PredicateStoreReference) {
        _matched=true;
        StoreExpression _ref = ((PredicateStoreReference)se).getRef();
        _switchResult = this.getStoreType(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof OutStoreReference) {
        _matched=true;
        StoreExpression _ref = ((OutStoreReference)se).getRef();
        _switchResult = this.getStoreType(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof UpdateStoreReference) {
        _matched=true;
        StoreExpression _ref = ((UpdateStoreReference)se).getRef();
        _switchResult = this.getStoreType(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof UpdateExpressionStoreReference) {
        _matched=true;
        StoreExpression _ref = ((UpdateExpressionStoreReference)se).getRef();
        _switchResult = this.getStoreType(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof DistributionReference) {
        _matched=true;
        StoreExpression _ref = ((DistributionReference)se).getRef();
        _switchResult = this.getStoreType(_ref);
      }
    }
    if (!_matched) {
      if (se instanceof UniformReference) {
        _matched=true;
        StoreExpression _ref = ((UniformReference)se).getRef();
        _switchResult = this.getStoreType(_ref);
      }
    }
    return _switchResult;
  }
  
  public String check(final PredicateStoreReference sr) {
    StoreExpression _ref = sr.getRef();
    boolean _isReferenceSeenInTerms = this.isReferenceSeenInTerms(_ref);
    boolean _not = (!_isReferenceSeenInTerms);
    if (_not) {
      return "\' does not refer to a declared store.";
    }
    return "";
  }
  
  public String check(final OutStoreReference sr) {
    StoreExpression _ref = sr.getRef();
    boolean _isReferenceSeenInTerms = this.isReferenceSeenInTerms(_ref);
    boolean _not = (!_isReferenceSeenInTerms);
    if (_not) {
      return "\' does not refer to a declared store.";
    }
    return "";
  }
  
  public String check(final UpdateStoreReference sr) {
    StoreExpression _ref = sr.getRef();
    boolean _isReferenceSeenInTerms = this.isReferenceSeenInTerms(_ref);
    boolean _not = (!_isReferenceSeenInTerms);
    if (_not) {
      return "\' does not refer to a declared store.";
    }
    return "";
  }
  
  public boolean isReferenceSeenInTerms(final StoreExpression sr) {
    String _name = this.getName(sr);
    Set<eu.quanticol.cASPA.Process> _fromStoreExpressionGetProcesses = this._modelUtil.fromStoreExpressionGetProcesses(sr);
    HashMap<Integer, Term> _fromProcessesGetHashMapOfTerms = this._modelUtil.fromProcessesGetHashMapOfTerms(_fromStoreExpressionGetProcesses);
    HashMap<Integer, ArrayList<String>> _fromHashMapOfTermsGetStoreNames = this._modelUtil.fromHashMapOfTermsGetStoreNames(_fromProcessesGetHashMapOfTerms);
    return this._modelUtil.isInMap(_name, _fromHashMapOfTermsGetStoreNames);
  }
  
  public String check(final UpdateExpressionStoreReference sr) {
    ProcessExpression _containerOfType = EcoreUtil2.<ProcessExpression>getContainerOfType(sr, ProcessExpression.class);
    List<In> _allContentsOfType = EcoreUtil2.<In>getAllContentsOfType(_containerOfType, In.class);
    int _length = ((Object[])Conversions.unwrapArray(_allContentsOfType, Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String _storeType = this.getStoreType(sr);
      boolean _equals = _storeType.equals("sel");
      if (_equals) {
        StoreExpression _ref = sr.getRef();
        boolean _isReferenceSeenInTerms = this.isReferenceSeenInTerms(_ref);
        boolean _not = (!_isReferenceSeenInTerms);
        if (_not) {
          return "\' does not refer to a declared store.";
        }
      }
      StoreExpression _ref_1 = sr.getRef();
      boolean _isReferenceSeenInTerms_1 = this.isReferenceSeenInTerms(_ref_1);
      boolean _not_1 = (!_isReferenceSeenInTerms_1);
      if (_not_1) {
        StoreExpression _ref_2 = sr.getRef();
        boolean _isReferenceSeenInInputArguments = this.isReferenceSeenInInputArguments(_ref_2);
        boolean _not_2 = (!_isReferenceSeenInInputArguments);
        if (_not_2) {
          return "\' does not refer to a declared store or free variable.";
        }
      }
      return "";
    } else {
      StoreExpression _ref_3 = sr.getRef();
      boolean _isReferenceSeenInTerms_2 = this.isReferenceSeenInTerms(_ref_3);
      boolean _not_3 = (!_isReferenceSeenInTerms_2);
      if (_not_3) {
        return "\' does not refer to a declared store.";
      }
      return "";
    }
  }
  
  public String check(final DistributionReference sr) {
    StoreExpression _ref = sr.getRef();
    boolean _isReferenceSeenInTerms = this.isReferenceSeenInTerms(_ref);
    boolean _not = (!_isReferenceSeenInTerms);
    if (_not) {
      String _storeType = this.getStoreType(sr);
      boolean _equals = _storeType.equals("sel");
      if (_equals) {
        StoreExpression _ref_1 = sr.getRef();
        boolean _isReferenceSeenInTerms_1 = this.isReferenceSeenInTerms(_ref_1);
        boolean _not_1 = (!_isReferenceSeenInTerms_1);
        if (_not_1) {
          return "\' does not refer to a declared store.";
        }
      }
    }
    StoreExpression _ref_2 = sr.getRef();
    boolean _isReferenceSeenInInputArguments = this.isReferenceSeenInInputArguments(_ref_2);
    boolean _not_2 = (!_isReferenceSeenInInputArguments);
    if (_not_2) {
      return "\' does not refer to a declared store or free variable.";
    }
    return "";
  }
  
  public String check(final UniformReference sr) {
    StoreExpression _ref = sr.getRef();
    boolean _isReferenceSeenInTerms = this.isReferenceSeenInTerms(_ref);
    boolean _not = (!_isReferenceSeenInTerms);
    if (_not) {
      String _storeType = this.getStoreType(sr);
      boolean _equals = _storeType.equals("sel");
      if (_equals) {
        StoreExpression _ref_1 = sr.getRef();
        boolean _isReferenceSeenInTerms_1 = this.isReferenceSeenInTerms(_ref_1);
        boolean _not_1 = (!_isReferenceSeenInTerms_1);
        if (_not_1) {
          return "\' does not refer to a declared store.";
        }
      }
    }
    StoreExpression _ref_2 = sr.getRef();
    boolean _isReferenceSeenInInputArguments = this.isReferenceSeenInInputArguments(_ref_2);
    boolean _not_2 = (!_isReferenceSeenInInputArguments);
    if (_not_2) {
      return "\' does not refer to a declared store or free variable.";
    }
    return "";
  }
  
  public boolean isReferenceSeenInInputArguments(final StoreExpression sr) {
    String _name = this.getName(sr);
    ArrayList<String> _fromStoreExpressionGetProcessInArgs = this._modelUtil.fromStoreExpressionGetProcessInArgs(sr);
    return this._modelUtil.isInList(_name, _fromStoreExpressionGetProcessInArgs);
  }
  
  @Check
  public void checkNoDuplicateStoresInTerms(final Store store) {
    int count = 0;
    Term _containerOfType = EcoreUtil2.<Term>getContainerOfType(store, Term.class);
    Stores _stores = _containerOfType.getStores();
    EList<StoreExpression> _stores_1 = _stores.getStores();
    for (final StoreExpression st : _stores_1) {
      String _name = store.getName();
      String _name_1 = ((Store) st).getName();
      boolean _equals = _name.equals(_name_1);
      if (_equals) {
        count++;
      }
    }
    if ((count > 1)) {
      EAttribute _store_Name = CASPAPackage.eINSTANCE.getStore_Name();
      this.error("Store names cannot be repeated in Terms.", _store_Name, 
        CASPAValidator.NO_DUPLICATE_STORES_IN_TERMS);
    }
  }
  
  @Check
  public void checkUniqueTerms(final Term term) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(term, Model.class);
    EList<Term> terms = _containerOfType.getTerms();
    ProcessExpression _ref = term.getRef();
    eu.quanticol.cASPA.Process _ref_1 = ((ReferencedProcess) _ref).getRef();
    String name = ((eu.quanticol.cASPA.Process) _ref_1).getName();
    Set<String> myStoreNames = new HashSet<String>();
    int count = 0;
    Stores _stores = term.getStores();
    EList<StoreExpression> _stores_1 = _stores.getStores();
    for (final StoreExpression s : _stores_1) {
      String _name = ((Store) s).getName();
      int _value = ((Store) s).getValue();
      String _plus = (_name + Integer.valueOf(_value));
      myStoreNames.add(_plus);
    }
    for (final Term t : terms) {
      {
        ProcessExpression _ref_2 = t.getRef();
        eu.quanticol.cASPA.Process _ref_3 = ((ReferencedProcess) _ref_2).getRef();
        String tName = ((eu.quanticol.cASPA.Process) _ref_3).getName();
        Set<String> temp = new HashSet<String>();
        Stores _stores_2 = t.getStores();
        EList<StoreExpression> _stores_3 = _stores_2.getStores();
        for (final StoreExpression s_1 : _stores_3) {
          String _name_1 = ((Store) s_1).getName();
          int _value_1 = ((Store) s_1).getValue();
          String _plus_1 = (_name_1 + Integer.valueOf(_value_1));
          temp.add(_plus_1);
        }
        boolean _and = false;
        boolean _equals = myStoreNames.equals(temp);
        if (!_equals) {
          _and = false;
        } else {
          boolean _equals_1 = name.equals(tName);
          _and = _equals_1;
        }
        if (_and) {
          count++;
        }
      }
    }
    if ((count > 1)) {
      this.error("Terms must be unique.", 
        CASPAPackage.Literals.TERM__STORES, 
        CASPAValidator.REQUIRE_UNIQUE_TERMS);
    }
  }
  
  @Check
  public void checkStoresAreUsed(final Store store) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(store, Model.class);
    EList<eu.quanticol.cASPA.Process> processes = _containerOfType.getProcesses();
    String name = store.getName();
    boolean exists = false;
    for (final eu.quanticol.cASPA.Process process : processes) {
      {
        List<SelfReference> _allContentsOfType = EcoreUtil2.<SelfReference>getAllContentsOfType(process, SelfReference.class);
        for (final SelfReference sr : _allContentsOfType) {
          String _name = sr.getName();
          boolean _equals = _name.equals(name);
          if (_equals) {
            exists = true;
          }
        }
        List<Reference> _allContentsOfType_1 = EcoreUtil2.<Reference>getAllContentsOfType(process, Reference.class);
        for (final Reference r : _allContentsOfType_1) {
          String _name_1 = r.getName();
          boolean _equals_1 = _name_1.equals(name);
          if (_equals_1) {
            exists = true;
          }
        }
      }
    }
    if ((!exists)) {
      this.warning("Store never used locally.", 
        CASPAPackage.Literals.STORE__NAME, 
        CASPAValidator.STORE_NEVER_USED);
    }
  }
  
  @Check
  public void checkArgumentsMatch(final Unicast action) {
    boolean fails = true;
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(action, Model.class);
    EList<eu.quanticol.cASPA.Process> processes = _containerOfType.getProcesses();
    String name = action.getName();
    Arguments _arguments = action.getArguments();
    String inputOutput = this.inputOrOutputArgument(_arguments);
    int args = 0;
    int count = 0;
    Arguments _arguments_1 = action.getArguments();
    String _inputOrOutputArgument = this.inputOrOutputArgument(_arguments_1);
    boolean _equals = _inputOrOutputArgument.equals("In");
    if (_equals) {
      Arguments _arguments_2 = action.getArguments();
      List<FreeVariable> _allContentsOfType = EcoreUtil2.<FreeVariable>getAllContentsOfType(_arguments_2, FreeVariable.class);
      int _size = _allContentsOfType.size();
      args = _size;
    } else {
      Arguments _arguments_3 = action.getArguments();
      List<Constant> _allContentsOfType_1 = EcoreUtil2.<Constant>getAllContentsOfType(_arguments_3, Constant.class);
      int _size_1 = _allContentsOfType_1.size();
      args = _size_1;
      Arguments _arguments_4 = action.getArguments();
      List<Reference> _allContentsOfType_2 = EcoreUtil2.<Reference>getAllContentsOfType(_arguments_4, Reference.class);
      int _size_2 = _allContentsOfType_2.size();
      int _plus = (args + _size_2);
      args = _plus;
      Arguments _arguments_5 = action.getArguments();
      List<SelfReference> _allContentsOfType_3 = EcoreUtil2.<SelfReference>getAllContentsOfType(_arguments_5, SelfReference.class);
      int _size_3 = _allContentsOfType_3.size();
      int _plus_1 = (args + _size_3);
      args = _plus_1;
    }
    for (final eu.quanticol.cASPA.Process p : processes) {
      List<Unicast> _allContentsOfType_4 = EcoreUtil2.<Unicast>getAllContentsOfType(p, Unicast.class);
      for (final Unicast u : _allContentsOfType_4) {
        Arguments _arguments_6 = u.getArguments();
        String _inputOrOutputArgument_1 = this.inputOrOutputArgument(_arguments_6);
        boolean _equals_1 = _inputOrOutputArgument_1.equals(inputOutput);
        boolean _not = (!_equals_1);
        if (_not) {
          int temp = 0;
          Arguments _arguments_7 = u.getArguments();
          String _inputOrOutputArgument_2 = this.inputOrOutputArgument(_arguments_7);
          boolean _equals_2 = _inputOrOutputArgument_2.equals("In");
          if (_equals_2) {
            Arguments _arguments_8 = u.getArguments();
            List<FreeVariable> _allContentsOfType_5 = EcoreUtil2.<FreeVariable>getAllContentsOfType(_arguments_8, FreeVariable.class);
            int _size_4 = _allContentsOfType_5.size();
            temp = _size_4;
          } else {
            Arguments _arguments_9 = u.getArguments();
            List<Constant> _allContentsOfType_6 = EcoreUtil2.<Constant>getAllContentsOfType(_arguments_9, Constant.class);
            int _size_5 = _allContentsOfType_6.size();
            temp = _size_5;
            Arguments _arguments_10 = u.getArguments();
            List<Reference> _allContentsOfType_7 = EcoreUtil2.<Reference>getAllContentsOfType(_arguments_10, Reference.class);
            int _size_6 = _allContentsOfType_7.size();
            int _plus_2 = (temp + _size_6);
            temp = _plus_2;
            Arguments _arguments_11 = u.getArguments();
            List<SelfReference> _allContentsOfType_8 = EcoreUtil2.<SelfReference>getAllContentsOfType(_arguments_11, SelfReference.class);
            int _size_7 = _allContentsOfType_8.size();
            int _plus_3 = (temp + _size_7);
            temp = _plus_3;
          }
          boolean _and = false;
          String _name = u.getName();
          boolean _equals_3 = _name.equals(name);
          if (!_equals_3) {
            _and = false;
          } else {
            _and = (temp == args);
          }
          if (_and) {
            count++;
          }
        }
      }
    }
    fails = (count == 0);
    if (fails) {
      this.error("No partner action with matching number of arguments.", 
        CASPAPackage.Literals.ACTION__NAME, 
        CASPAValidator.ARGUMENTS_MATCH);
    }
  }
  
  @Check
  public void checkActionHasPartner(final Unicast action) {
    boolean fails = true;
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(action, Model.class);
    EList<eu.quanticol.cASPA.Process> processes = _containerOfType.getProcesses();
    String name = action.getName();
    Arguments _arguments = action.getArguments();
    String inputOutput = this.inputOrOutputArgument(_arguments);
    int count = 0;
    for (final eu.quanticol.cASPA.Process p : processes) {
      List<Unicast> _allContentsOfType = EcoreUtil2.<Unicast>getAllContentsOfType(p, Unicast.class);
      for (final Unicast u : _allContentsOfType) {
        Arguments _arguments_1 = u.getArguments();
        String _inputOrOutputArgument = this.inputOrOutputArgument(_arguments_1);
        boolean _equals = _inputOrOutputArgument.equals(inputOutput);
        boolean _not = (!_equals);
        if (_not) {
          String _name = u.getName();
          boolean _equals_1 = _name.equals(name);
          if (_equals_1) {
            count++;
          }
        }
      }
    }
    fails = (count == 0);
    if (fails) {
      this.error("No receiving or sending partner action.", 
        CASPAPackage.Literals.ACTION__NAME, 
        CASPAValidator.NO_ACTION_PARTNER);
    }
  }
  
  public String inputOrOutputArgument(final Arguments arg) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (arg instanceof In) {
        _matched=true;
        _switchResult = "In";
      }
    }
    if (!_matched) {
      if (arg instanceof Out) {
        _matched=true;
        _switchResult = "Out";
      }
    }
    return _switchResult;
  }
  
  @Check
  public void checkProcessIsUsed(final eu.quanticol.cASPA.Process process) {
    boolean fails = true;
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(process, Model.class);
    EList<Term> terms = _containerOfType.getTerms();
    ArrayList<String> referencedProcesses = new ArrayList<String>();
    Set<eu.quanticol.cASPA.Process> allProcesses = this._modelUtil.fromProcessGetProcesses(process);
    for (final Term term : terms) {
      List<ReferencedProcess> _allContentsOfType = EcoreUtil2.<ReferencedProcess>getAllContentsOfType(term, ReferencedProcess.class);
      for (final ReferencedProcess rp : _allContentsOfType) {
        eu.quanticol.cASPA.Process _ref = rp.getRef();
        String _name = _ref.getName();
        referencedProcesses.add(_name);
      }
    }
    boolean _and = false;
    String _name_1 = process.getName();
    boolean _contains = referencedProcesses.contains(_name_1);
    boolean _not = (!_contains);
    if (!_not) {
      _and = false;
    } else {
      int _size = allProcesses.size();
      boolean _equals = (_size == 1);
      _and = _equals;
    }
    fails = _and;
    if (fails) {
      this.warning("Process is never used.", 
        CASPAPackage.Literals.PROCESS__NAME, 
        CASPAValidator.PROCESS_NEVER_USED);
    }
  }
  
  @Check
  public void checkProcessExpressionsAreMoreThanJustReferences(final eu.quanticol.cASPA.Process p) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method isReferencedProcess is undefined for the type CASPAValidator"
      + "\n|| cannot be resolved");
  }
  
  public boolean testMoreThanChoParRef(final Set<eu.quanticol.cASPA.Process> set, final eu.quanticol.cASPA.Process start) {
    Set<eu.quanticol.cASPA.Process> mySet = new HashSet<eu.quanticol.cASPA.Process>(set);
    mySet.remove(start);
    ArrayList<eu.quanticol.cASPA.Process> refs = this.getReference(start);
    this.removeRefFromSet(mySet, refs);
    int _size = refs.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return false;
    }
    return false;
  }
  
  public ArrayList<eu.quanticol.cASPA.Process> getReference(final eu.quanticol.cASPA.Process p) {
    List<ReferencedProcess> refProcs = EcoreUtil2.<ReferencedProcess>getAllContentsOfType(p, ReferencedProcess.class);
    ArrayList<eu.quanticol.cASPA.Process> procs = new ArrayList<eu.quanticol.cASPA.Process>();
    for (final ReferencedProcess refProc : refProcs) {
      eu.quanticol.cASPA.Process _ref = refProc.getRef();
      procs.add(((eu.quanticol.cASPA.Process) _ref));
    }
    return procs;
  }
  
  public void removeRefFromSet(final Set<eu.quanticol.cASPA.Process> s, final ArrayList<eu.quanticol.cASPA.Process> l) {
    for (final eu.quanticol.cASPA.Process proc : l) {
      s.remove(proc);
    }
  }
}
