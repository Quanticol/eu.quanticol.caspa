package eu.quanticol.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.quanticol.cASPA.Distribution;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.Uniform;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.typing.ActionExpressionType;
import eu.quanticol.typing.ActionType;
import eu.quanticol.typing.ETypeProvider;
import eu.quanticol.typing.EvaluationExpressionType;
import eu.quanticol.typing.ExpressionsType;
import eu.quanticol.typing.PredicateExpressionType;
import eu.quanticol.typing.UpdateExpressionType;
import java.util.Arrays;
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
  
  protected ActionType _typeForA(final /* LocalUpdateExpression */Object u) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final /* GlobalUpdateExpression */Object u) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final /* LocalUpdateExpressionFunction */Object u) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeForA cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final /* GlobalUpdateExpressionFunction */Object u) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeForA cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final /* FunctionExpression */Object functionExpression) {
    throw new Error("Unresolved compilation problems:"
      + "\ndistribution cannot be resolved"
      + "\ntypeForA cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final Uniform u) {
    final UpdateExpression expression = u.getExpression();
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
    final UpdateExpression expression = d.getExpression();
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
  
  protected ActionType _typeForA(final /* LocalEvaluationExpression */Object evaluationExpression) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot use null-safe feature call on primitive receiver"
      + "\nname cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final /* GlobalEvaluationExpression */Object evaluationExpression) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot use null-safe feature call on primitive receiver"
      + "\nname cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final /* FreeEvaluationExpression */Object evaluationExpression) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ngetClass cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected ActionType _typeForA(final PredicateExpression p) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method expression is undefined for the type ATypeProvider"
      + "\nThe method expression is undefined for the type ATypeProvider"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntypeFor cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public ActionType typeForA(final LocalUpdateExpression d) {
    if (d != null) {
      return _typeForA(d);
    } else if (d != null) {
      return _typeForA(d);
    } else if (d != null) {
      return _typeForA(d);
    } else if (d != null) {
      return _typeForA(d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(d).toString());
    }
  }
}
