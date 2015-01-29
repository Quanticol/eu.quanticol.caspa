package eu.quanticol.typing;

import eu.quanticol.cASPA.Bool;
import eu.quanticol.cASPA.BooleanConstant;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributionReference;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
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
import eu.quanticol.cASPA.Reference;
import eu.quanticol.cASPA.SelfReference;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.UniformReference;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateExpressionStoreReference;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.typing.BaseType;
import eu.quanticol.typing.BoolConstantType;
import eu.quanticol.typing.ConstantType;
import eu.quanticol.typing.DoubleConstantType;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TypeProvider {
  public final static DoubleConstantType doubleConstantType = new DoubleConstantType();
  
  public final static BoolConstantType boolConstantType = new BoolConstantType();
  
  public final static ConstantType constantType = new ConstantType();
  
  protected BaseType _typeFor(final BooleanConstant b) {
    return TypeProvider.boolConstantType;
  }
  
  protected BaseType _typeFor(final Bool b) {
    return TypeProvider.boolConstantType;
  }
  
  protected BaseType _typeFor(final Constant c) {
    return TypeProvider.constantType;
  }
  
  protected BaseType _typeFor(final Reference c) {
    return TypeProvider.constantType;
  }
  
  protected BaseType _typeFor(final SelfReference c) {
    return TypeProvider.constantType;
  }
  
  protected BaseType _typeFor(final FreeVariable c) {
    return TypeProvider.constantType;
  }
  
  protected BaseType _typeFor(final PredicateExpression e) {
    BaseType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof PredicateOr) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateAnd) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateEquality) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateComparison) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateSub) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicatePlu) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateMul) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateDiv) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateNot) {
        _matched=true;
        _switchResult = TypeProvider.boolConstantType;
      }
    }
    if (!_matched) {
      if (e instanceof Constant) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof Store) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof FreeVariable) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof Reference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof SelfReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateStoreReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof OutStoreReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof UpdateExpressionStoreReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof DistributionReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof UniformReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    return _switchResult;
  }
  
  protected BaseType _typeFor(final Predicate predicate) {
    return TypeProvider.boolConstantType;
  }
  
  protected BaseType _typeFor(final StoreExpression s) {
    ConstantType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (s instanceof Store) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof SelfReference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof Reference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof FreeVariable) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof PredicateStoreReference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof OutStoreReference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof UpdateExpressionStoreReference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof DistributionReference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (s instanceof UniformReference) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    return _switchResult;
  }
  
  protected BaseType _typeFor(final UpdateExpression e) {
    BaseType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof UpdateSub) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof UpdatePlu) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof UpdateMul) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof UpdateDiv) {
        _matched=true;
        _switchResult = TypeProvider.constantType;
      }
    }
    if (!_matched) {
      if (e instanceof Store) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof FreeVariable) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof Reference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof SelfReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof PredicateStoreReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof OutStoreReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof UpdateExpressionStoreReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof DistributionReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    if (!_matched) {
      if (e instanceof UniformReference) {
        _matched=true;
        BaseType _typeFor = null;
        if (((StoreExpression) e)!=null) {
          _typeFor=this.typeFor(((StoreExpression) e));
        }
        _switchResult = _typeFor;
      }
    }
    return _switchResult;
  }
  
  protected BaseType _typeFor(final LocalSingleEventUpdate u) {
    return TypeProvider.constantType;
  }
  
  public BaseType typeFor(final EObject c) {
    if (c instanceof FreeVariable) {
      return _typeFor((FreeVariable)c);
    } else if (c instanceof Reference) {
      return _typeFor((Reference)c);
    } else if (c instanceof SelfReference) {
      return _typeFor((SelfReference)c);
    } else if (c instanceof Bool) {
      return _typeFor((Bool)c);
    } else if (c instanceof Constant) {
      return _typeFor((Constant)c);
    } else if (c instanceof LocalSingleEventUpdate) {
      return _typeFor((LocalSingleEventUpdate)c);
    } else if (c instanceof StoreExpression) {
      return _typeFor((StoreExpression)c);
    } else if (c instanceof BooleanConstant) {
      return _typeFor((BooleanConstant)c);
    } else if (c instanceof Predicate) {
      return _typeFor((Predicate)c);
    } else if (c instanceof PredicateExpression) {
      return _typeFor((PredicateExpression)c);
    } else if (c instanceof UpdateExpression) {
      return _typeFor((UpdateExpression)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
