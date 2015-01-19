package eu.quanticol.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.quanticol.cASPA.ActionExpression;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ProcessReference;
import eu.quanticol.typing.ATypeProvider;
import eu.quanticol.typing.ActionType;
import eu.quanticol.typing.ETypeProvider;
import eu.quanticol.typing.ExpressionsType;
import eu.quanticol.typing.ProcessType;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PTypeProvider {
  @Inject
  @Extension
  private ETypeProvider _eTypeProvider;
  
  @Inject
  @Extension
  private ATypeProvider _aTypeProvider;
  
  public final static ProcessType processType = new ProcessType();
  
  protected ProcessType _typeForP(final Leaf le) {
    return PTypeProvider.processType;
  }
  
  protected ProcessType _typeForP(final Choice c) {
    ProcessExpression _left = c.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this._eTypeProvider.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ProcessExpression _right = c.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, PTypeProvider.processType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, PTypeProvider.processType);
      _and = _equals_1;
    }
    if (_and) {
      return PTypeProvider.processType;
    } else {
      return null;
    }
  }
  
  protected ProcessType _typeForP(final Parallel p) {
    ProcessExpression _left = p.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this._eTypeProvider.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ProcessExpression _right = p.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, PTypeProvider.processType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, PTypeProvider.processType);
      _and = _equals_1;
    }
    if (_and) {
      return PTypeProvider.processType;
    } else {
      return null;
    }
  }
  
  protected ProcessType _typeForP(final PredicateProcess pp) {
    Predicate _predicate = pp.getPredicate();
    PredicateExpression _predicate_1 = _predicate.getPredicate();
    ActionExpression _expression = _predicate_1.getExpression();
    ActionType _typeForA = null;
    if (_expression!=null) {
      _typeForA=this._aTypeProvider.typeForA(_expression);
    }
    final ActionType predicate = _typeForA;
    eu.quanticol.cASPA.Process _value = pp.getValue();
    ProcessExpression _value_1 = _value.getValue();
    ProcessType _typeForP = null;
    if (_value_1!=null) {
      _typeForP=this.typeForP(_value_1);
    }
    final ProcessType reference = _typeForP;
    boolean _and = false;
    boolean _equals = Objects.equal(predicate, ETypeProvider.boolConstantType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(reference, PTypeProvider.processType);
      _and = _equals_1;
    }
    if (_and) {
      return PTypeProvider.processType;
    } else {
      return null;
    }
  }
  
  protected ProcessType _typeForP(final ActionProcess ap) {
    return null;
  }
  
  protected ProcessType _typeForP(final ProcessReference pr) {
    return null;
  }
  
  public ProcessType typeForP(final ProcessExpression ap) {
    if (ap instanceof ActionProcess) {
      return _typeForP((ActionProcess)ap);
    } else if (ap instanceof Choice) {
      return _typeForP((Choice)ap);
    } else if (ap instanceof Leaf) {
      return _typeForP((Leaf)ap);
    } else if (ap instanceof Parallel) {
      return _typeForP((Parallel)ap);
    } else if (ap instanceof PredicateProcess) {
      return _typeForP((PredicateProcess)ap);
    } else if (ap instanceof ProcessReference) {
      return _typeForP((ProcessReference)ap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ap).toString());
    }
  }
}
