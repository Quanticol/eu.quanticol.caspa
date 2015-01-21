package eu.quanticol.typing;

import com.google.common.base.Objects;
import eu.quanticol.cASPA.BoolConstant;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.Store;
import eu.quanticol.typing.BaseType;
import eu.quanticol.typing.BoolConstantType;
import eu.quanticol.typing.ConstantType;
import eu.quanticol.typing.DoubleConstantType;
import java.util.Arrays;

@SuppressWarnings("all")
public class TypeProvider {
  public final static DoubleConstantType doubleConstantType = new DoubleConstantType();
  
  public final static BoolConstantType boolConstantType = new BoolConstantType();
  
  public final static ConstantType constantType = new ConstantType();
  
  protected BaseType _typeFor(final Double d) {
    return TypeProvider.doubleConstantType;
  }
  
  protected BaseType _typeFor(final BoolConstant b) {
    return TypeProvider.boolConstantType;
  }
  
  protected BaseType _typeFor(final Constant c) {
    return TypeProvider.constantType;
  }
  
  protected BaseType _typeFor(final Store s) {
    ConstantType _xifexpression = null;
    int _value = s.getValue();
    boolean _equals = Objects.equal(Integer.valueOf(_value), TypeProvider.constantType);
    if (_equals) {
      _xifexpression = TypeProvider.constantType;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public BaseType typeFor(final Object b) {
    if (b instanceof BoolConstant) {
      return _typeFor((BoolConstant)b);
    } else if (b instanceof Constant) {
      return _typeFor((Constant)b);
    } else if (b instanceof Store) {
      return _typeFor((Store)b);
    } else if (b instanceof Double) {
      return _typeFor((Double)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(b).toString());
    }
  }
}
