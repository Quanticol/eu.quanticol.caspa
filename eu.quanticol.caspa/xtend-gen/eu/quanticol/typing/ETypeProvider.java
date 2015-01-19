package eu.quanticol.typing;

import com.google.common.base.Objects;
import eu.quanticol.cASPA.ActionAnd;
import eu.quanticol.cASPA.ActionComparison;
import eu.quanticol.cASPA.ActionDiv;
import eu.quanticol.cASPA.ActionEquality;
import eu.quanticol.cASPA.ActionExpression;
import eu.quanticol.cASPA.ActionMul;
import eu.quanticol.cASPA.ActionNot;
import eu.quanticol.cASPA.ActionOr;
import eu.quanticol.cASPA.ActionPlu;
import eu.quanticol.cASPA.ActionSub;
import eu.quanticol.cASPA.And;
import eu.quanticol.cASPA.BoolConstant;
import eu.quanticol.cASPA.Comparison;
import eu.quanticol.cASPA.Div;
import eu.quanticol.cASPA.DoubleConstant;
import eu.quanticol.cASPA.Equality;
import eu.quanticol.cASPA.Expression;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.Mul;
import eu.quanticol.cASPA.Not;
import eu.quanticol.cASPA.Or;
import eu.quanticol.cASPA.Plu;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Sub;
import eu.quanticol.typing.BoolConstantType;
import eu.quanticol.typing.DoubleConstantType;
import eu.quanticol.typing.ExpressionsType;
import eu.quanticol.typing.FreeVariableType;
import eu.quanticol.typing.ModelUtil;
import eu.quanticol.typing.ReferencedStoreType;
import eu.quanticol.typing.SelfReferencedStoreType;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class ETypeProvider {
  public final static DoubleConstantType doubleConstantType = new DoubleConstantType();
  
  public final static FreeVariableType freeVariableType = new FreeVariableType();
  
  public final static BoolConstantType boolConstantType = new BoolConstantType();
  
  public final static ReferencedStoreType referencedStoreType = new ReferencedStoreType();
  
  public final static SelfReferencedStoreType selfReferencedStoreType = new SelfReferencedStoreType();
  
  protected ExpressionsType _typeFor(final Expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        _switchResult = ETypeProvider.doubleConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = ETypeProvider.boolConstantType;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionsType _typeFor(final Or e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.boolConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionOr e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.boolConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final And e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.boolConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionAnd e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.boolConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Equality e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.boolConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionEquality e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.boolConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      InputOutput.<String>println("here");
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Comparison e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionComparison e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Sub e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionSub e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Plu e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionPlu e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Mul e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionMul e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Div e) {
    Expression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    Expression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionDiv e) {
    ActionExpression _left = e.getLeft();
    ExpressionsType _typeFor = null;
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final ExpressionsType leftType = _typeFor;
    ActionExpression _right = e.getRight();
    ExpressionsType _typeFor_1 = null;
    if (_right!=null) {
      _typeFor_1=this.typeFor(_right);
    }
    final ExpressionsType rightType = _typeFor_1;
    boolean _and = false;
    boolean _or = false;
    boolean _equals = Objects.equal(leftType, ETypeProvider.doubleConstantType);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(leftType, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(rightType, ETypeProvider.freeVariableType);
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ETypeProvider.doubleConstantType);
        _or_1 = _equals_3;
      }
      _and = _or_1;
    }
    if (_and) {
      return ETypeProvider.doubleConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final Not e) {
    boolean _or = false;
    Expression _expression = e.getExpression();
    ExpressionsType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      Expression _expression_1 = e.getExpression();
      ExpressionsType _typeFor_1 = null;
      if (_expression_1!=null) {
        _typeFor_1=this.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ActionNot e) {
    boolean _or = false;
    ActionExpression _expression = e.getExpression();
    ExpressionsType _typeFor = null;
    if (_expression!=null) {
      _typeFor=this.typeFor(_expression);
    }
    boolean _equals = Objects.equal(_typeFor, ETypeProvider.boolConstantType);
    if (_equals) {
      _or = true;
    } else {
      ActionExpression _expression_1 = e.getExpression();
      ExpressionsType _typeFor_1 = null;
      if (_expression_1!=null) {
        _typeFor_1=this.typeFor(_expression_1);
      }
      boolean _equals_1 = Objects.equal(_typeFor_1, ETypeProvider.freeVariableType);
      _or = _equals_1;
    }
    if (_or) {
      return ETypeProvider.boolConstantType;
    } else {
      return null;
    }
  }
  
  protected ExpressionsType _typeFor(final ReferencedStore e) {
    boolean _or = false;
    boolean _or_1 = false;
    Store _value = e.getValue();
    boolean _equals = Objects.equal(_value, null);
    if (_equals) {
      _or_1 = true;
    } else {
      Store _selfReferencedStores = ModelUtil.selfReferencedStores(e);
      Store _value_1 = e.getValue();
      boolean _equals_1 = Objects.equal(_selfReferencedStores, _value_1);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<Store> _variablesHaveBeenDefinedBefore = ModelUtil.variablesHaveBeenDefinedBefore(e);
      Store _value_2 = e.getValue();
      boolean _contains = _variablesHaveBeenDefinedBefore.contains(_value_2);
      boolean _not = (!_contains);
      _or = _not;
    }
    if (_or) {
      return null;
    } else {
      Store _value_3 = e.getValue();
      Expression _value_4 = _value_3.getValue();
      ExpressionsType _typeFor = null;
      if (_value_4!=null) {
        _typeFor=this.typeFor(_value_4);
      }
      return _typeFor;
    }
  }
  
  protected ExpressionsType _typeFor(final SelfReferencedStore e) {
    boolean _or = false;
    Store _name = e.getName();
    Expression _value = _name.getValue();
    boolean _equals = Objects.equal(_value, null);
    if (_equals) {
      _or = true;
    } else {
      EList<Store> _variablesHaveBeenDefinedBefore = ModelUtil.variablesHaveBeenDefinedBefore(e);
      Store _name_1 = e.getName();
      boolean _contains = _variablesHaveBeenDefinedBefore.contains(((Store) _name_1));
      boolean _not = (!_contains);
      _or = _not;
    }
    if (_or) {
      return null;
    } else {
      return ETypeProvider.selfReferencedStoreType;
    }
  }
  
  protected ExpressionsType _typeFor(final FreeVariable e) {
    return ETypeProvider.freeVariableType;
  }
  
  public ExpressionsType typeFor(final EObject e) {
    if (e instanceof ActionAnd) {
      return _typeFor((ActionAnd)e);
    } else if (e instanceof ActionComparison) {
      return _typeFor((ActionComparison)e);
    } else if (e instanceof ActionDiv) {
      return _typeFor((ActionDiv)e);
    } else if (e instanceof ActionEquality) {
      return _typeFor((ActionEquality)e);
    } else if (e instanceof ActionMul) {
      return _typeFor((ActionMul)e);
    } else if (e instanceof ActionNot) {
      return _typeFor((ActionNot)e);
    } else if (e instanceof ActionOr) {
      return _typeFor((ActionOr)e);
    } else if (e instanceof ActionPlu) {
      return _typeFor((ActionPlu)e);
    } else if (e instanceof ActionSub) {
      return _typeFor((ActionSub)e);
    } else if (e instanceof And) {
      return _typeFor((And)e);
    } else if (e instanceof Comparison) {
      return _typeFor((Comparison)e);
    } else if (e instanceof Div) {
      return _typeFor((Div)e);
    } else if (e instanceof Equality) {
      return _typeFor((Equality)e);
    } else if (e instanceof FreeVariable) {
      return _typeFor((FreeVariable)e);
    } else if (e instanceof Mul) {
      return _typeFor((Mul)e);
    } else if (e instanceof Not) {
      return _typeFor((Not)e);
    } else if (e instanceof Or) {
      return _typeFor((Or)e);
    } else if (e instanceof Plu) {
      return _typeFor((Plu)e);
    } else if (e instanceof ReferencedStore) {
      return _typeFor((ReferencedStore)e);
    } else if (e instanceof Sub) {
      return _typeFor((Sub)e);
    } else if (e instanceof Expression) {
      return _typeFor((Expression)e);
    } else if (e instanceof SelfReferencedStore) {
      return _typeFor((SelfReferencedStore)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
