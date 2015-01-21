package eu.quanticol.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.quanticol.cASPA.ActionExpression;
import eu.quanticol.cASPA.Distribution;
import eu.quanticol.cASPA.Expression;
import eu.quanticol.cASPA.FreeEvaluationExpression;
import eu.quanticol.cASPA.FunctionExpression;
import eu.quanticol.cASPA.GlobalEvaluationExpression;
import eu.quanticol.cASPA.GlobalUpdateExpression;
import eu.quanticol.cASPA.GlobalUpdateExpressionFunction;
import eu.quanticol.cASPA.LocalEvaluationExpression;
import eu.quanticol.cASPA.LocalUpdateExpression;
import eu.quanticol.cASPA.LocalUpdateExpressionFunction;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Uniform;
import eu.quanticol.typing.ActionExpressionType;
import eu.quanticol.typing.ActionType;
import eu.quanticol.typing.ETypeProvider;
import eu.quanticol.typing.EvaluationExpressionType;
import eu.quanticol.typing.ExpressionsType;
import eu.quanticol.typing.PredicateExpressionType;
import eu.quanticol.typing.UpdateExpressionType;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ATypeProvider {
  @Inject
  @Extension
  private ETypeProvider _eTypeProvider;
  
  public final static UpdateExpressionType updateExpressionType = new UpdateExpressionType();
  
  public final static PredicateExpressionType predicateExpressionType = new PredicateExpressionType();
  
  public final static EvaluationExpressionType evaluationExpressionType = new EvaluationExpressionType();
  
  public final static ActionExpressionType actionExpression = new ActionExpressionType();
  
  protected ActionType _typeForA(final LocalUpdateExpression u) {
    boolean _or = false;
    SelfReferencedStore _name = u.getName();
    Store _name_1 = _name.getName();
    Expression _value = _name_1.getValue();
    ExpressionsType _typeFor = null;
    if (_value!=null) {
      _typeFor=this._eTypeProvider.typeFor(_value);
    }
    ActionExpression _expression = u.getExpression();
    ExpressionsType _typeFor_1 = null;
    if (_expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = u.getExpression();
      ExpressionsType _typeFor_2 = null;
      if (_expression_1!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final GlobalUpdateExpression u) {
    boolean _or = false;
    Store _name = u.getName();
    Expression _value = _name.getValue();
    ExpressionsType _typeFor = null;
    if (_value!=null) {
      _typeFor=this._eTypeProvider.typeFor(_value);
    }
    ActionExpression _expression = u.getExpression();
    ExpressionsType _typeFor_1 = null;
    if (_expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = u.getExpression();
      ExpressionsType _typeFor_2 = null;
      if (_expression_1!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final LocalUpdateExpressionFunction u) {
    boolean _or = false;
    SelfReferencedStore _name = u.getName();
    Store _name_1 = _name.getName();
    Expression _value = _name_1.getValue();
    ExpressionsType _typeFor = null;
    if (_value!=null) {
      _typeFor=this._eTypeProvider.typeFor(_value);
    }
    FunctionExpression _expression = u.getExpression();
    ActionType _typeForA = null;
    if (_expression!=null) {
      _typeForA=this.typeForA(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeForA);
    if (_equals) {
      _or = true;
    } else {
      FunctionExpression _expression_1 = u.getExpression();
      ExpressionsType _typeFor_1 = null;
      if (_expression_1!=null) {
        _typeFor_1=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final GlobalUpdateExpressionFunction u) {
    boolean _or = false;
    Store _name = u.getName();
    Expression _value = _name.getValue();
    ExpressionsType _typeFor = null;
    if (_value!=null) {
      _typeFor=this._eTypeProvider.typeFor(_value);
    }
    FunctionExpression _expression = u.getExpression();
    ActionType _typeForA = null;
    if (_expression!=null) {
      _typeForA=this.typeForA(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeForA);
    if (_equals) {
      _or = true;
    } else {
      FunctionExpression _expression_1 = u.getExpression();
      ExpressionsType _typeFor_1 = null;
      if (_expression_1!=null) {
        _typeFor_1=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final FunctionExpression functionExpression) {
    boolean allCorrect = true;
    EList<EObject> _distribution = functionExpression.getDistribution();
    for (final EObject dist : _distribution) {
      boolean _and = false;
      if (!allCorrect) {
        _and = false;
      } else {
        ActionType _typeForA = null;
        if (dist!=null) {
          _typeForA=this.typeForA(dist);
        }
        boolean _equals = Objects.equal(_typeForA, ATypeProvider.updateExpressionType);
        _and = _equals;
      }
      allCorrect = _and;
    }
    if (allCorrect) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final Uniform u) {
    final ActionExpression expression = u.getExpression();
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    ExpressionsType _typeFor = null;
    if (expression!=null) {
      _typeFor=this._eTypeProvider.typeFor(expression);
    }
    boolean _equals = Objects.equal(_typeFor, ETypeProvider.freeVariableType);
    if (_equals) {
      _or_2 = true;
    } else {
      ExpressionsType _typeFor_1 = null;
      if (expression!=null) {
        _typeFor_1=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.boolConstantType);
      _or_2 = _equals_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      ExpressionsType _typeFor_2 = null;
      if (expression!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_2 = Objects.equal(_typeFor_2, ETypeProvider.doubleConstantType);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      ExpressionsType _typeFor_3 = null;
      if (expression!=null) {
        _typeFor_3=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_3 = Objects.equal(_typeFor_3, ETypeProvider.freeVariableType);
      _or = _equals_3;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final Distribution d) {
    final double variable = d.getProb();
    final ActionExpression expression = d.getExpression();
    boolean _or = false;
    boolean _and = false;
    Class<? extends Double> _class = Double.valueOf(variable).getClass();
    boolean _equals = Objects.equal(_class, Double.class);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor = null;
      if (expression!=null) {
        _typeFor=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_1 = null;
        if (expression!=null) {
          _typeFor_1=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_1, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_2 = null;
        if (expression!=null) {
          _typeFor_2=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_2, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_3 = null;
      if (expression!=null) {
        _typeFor_3=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_3, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.updateExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final LocalEvaluationExpression evaluationExpression) {
    SelfReferencedStore _name = evaluationExpression.getName();
    Store _name_1 = ((SelfReferencedStore) _name).getName();
    final Expression variable = ((Store) _name_1).getValue();
    final ActionExpression expression = evaluationExpression.getExpression();
    boolean _or = false;
    boolean _and = false;
    ExpressionsType _typeFor = null;
    if (variable!=null) {
      _typeFor=this._eTypeProvider.typeFor(variable);
    }
    ExpressionsType _typeFor_1 = null;
    if (expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor_2 = null;
      if (expression!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_3 = null;
        if (expression!=null) {
          _typeFor_3=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_3, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_4 = null;
        if (expression!=null) {
          _typeFor_4=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_4, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_5 = null;
      if (expression!=null) {
        _typeFor_5=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_5, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.evaluationExpressionType;
    }
    return null;
  }
  
  protected ActionType _typeForA(final GlobalEvaluationExpression evaluationExpression) {
    Store _name = evaluationExpression.getName();
    final Expression variable = ((Store) _name).getValue();
    final ActionExpression expression = evaluationExpression.getExpression();
    boolean _or = false;
    boolean _and = false;
    ExpressionsType _typeFor = null;
    if (variable!=null) {
      _typeFor=this._eTypeProvider.typeFor(variable);
    }
    ExpressionsType _typeFor_1 = null;
    if (expression!=null) {
      _typeFor_1=this._eTypeProvider.typeFor(expression);
    }
    boolean _equals = Objects.equal(_typeFor, _typeFor_1);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor_2 = null;
      if (expression!=null) {
        _typeFor_2=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor_2, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_3 = null;
        if (expression!=null) {
          _typeFor_3=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_3, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_4 = null;
        if (expression!=null) {
          _typeFor_4=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_4, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_5 = null;
      if (expression!=null) {
        _typeFor_5=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_5, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.evaluationExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final FreeEvaluationExpression evaluationExpression) {
    final String variable = evaluationExpression.getName();
    final ActionExpression expression = evaluationExpression.getExpression();
    boolean _or = false;
    boolean _and = false;
    Class<? extends String> _class = variable.getClass();
    boolean _equals = Objects.equal(_class, String.class);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      ExpressionsType _typeFor = null;
      if (expression!=null) {
        _typeFor=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_1 = Objects.equal(_typeFor, ETypeProvider.freeVariableType);
      if (_equals_1) {
        _or_2 = true;
      } else {
        ExpressionsType _typeFor_1 = null;
        if (expression!=null) {
          _typeFor_1=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_2 = Objects.equal(_typeFor_1, ETypeProvider.boolConstantType);
        _or_2 = _equals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        ExpressionsType _typeFor_2 = null;
        if (expression!=null) {
          _typeFor_2=this._eTypeProvider.typeFor(expression);
        }
        boolean _equals_3 = Objects.equal(_typeFor_2, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      _or = true;
    } else {
      ExpressionsType _typeFor_3 = null;
      if (expression!=null) {
        _typeFor_3=this._eTypeProvider.typeFor(expression);
      }
      boolean _equals_4 = Objects.equal(_typeFor_3, ETypeProvider.freeVariableType);
      _or = _equals_4;
    }
    if (_or) {
      return ATypeProvider.evaluationExpressionType;
    } else {
      return null;
    }
  }
  
  protected ActionType _typeForA(final PredicateExpression p) {
    boolean _or = false;
    ActionExpression _expression = p.getExpression();
    ExpressionsType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this._eTypeProvider.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = p.getExpression();
      ExpressionsType _typeFor_1 = null;
      if (_expression_1!=null) {
        _typeFor_1=this._eTypeProvider.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ATypeProvider.predicateExpressionType;
    } else {
      return null;
    }
  }
  
  public ActionType typeForA(final EObject evaluationExpression) {
    if (evaluationExpression instanceof FreeEvaluationExpression) {
      return _typeForA((FreeEvaluationExpression)evaluationExpression);
    } else if (evaluationExpression instanceof GlobalEvaluationExpression) {
      return _typeForA((GlobalEvaluationExpression)evaluationExpression);
    } else if (evaluationExpression instanceof GlobalUpdateExpression) {
      return _typeForA((GlobalUpdateExpression)evaluationExpression);
    } else if (evaluationExpression instanceof GlobalUpdateExpressionFunction) {
      return _typeForA((GlobalUpdateExpressionFunction)evaluationExpression);
    } else if (evaluationExpression instanceof LocalEvaluationExpression) {
      return _typeForA((LocalEvaluationExpression)evaluationExpression);
    } else if (evaluationExpression instanceof LocalUpdateExpression) {
      return _typeForA((LocalUpdateExpression)evaluationExpression);
    } else if (evaluationExpression instanceof LocalUpdateExpressionFunction) {
      return _typeForA((LocalUpdateExpressionFunction)evaluationExpression);
    } else if (evaluationExpression instanceof Distribution) {
      return _typeForA((Distribution)evaluationExpression);
    } else if (evaluationExpression instanceof FunctionExpression) {
      return _typeForA((FunctionExpression)evaluationExpression);
    } else if (evaluationExpression instanceof PredicateExpression) {
      return _typeForA((PredicateExpression)evaluationExpression);
    } else if (evaluationExpression instanceof Uniform) {
      return _typeForA((Uniform)evaluationExpression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(evaluationExpression).toString());
    }
  }
}
