package eu.quanticol.caspa.tests;

import com.google.inject.Inject;
import eu.quanticol.CASPAInjectorProvider;
import eu.quanticol.cASPA.Expression;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Store;
import eu.quanticol.typing.ETypeProvider;
import eu.quanticol.typing.ExpressionsType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CASPAInjectorProvider.class)
@SuppressWarnings("all")
public class TypeTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ETypeProvider _eTypeProvider;
  
  @Test
  public void doubleConstant() {
    this.assertDoubleConstantType("i = 10;");
  }
  
  @Test
  public void boolConstantType() {
    this.assertBoolConstantType("i = true;");
  }
  
  @Test
  public void andType() {
    this.assertBoolConstantType("i = true && false;");
  }
  
  @Test
  public void OrType() {
    this.assertBoolConstantType("i = true || false;");
  }
  
  @Test
  public void EqType() {
    this.assertBoolConstantType("i = true == false;");
  }
  
  @Test
  public void ComType() {
    this.assertBoolConstantType("i = 10 <= 10;");
  }
  
  @Test
  public void ComType2() {
    this.assertBoolConstantType("i = (10 + 1) <= (10 + 2);");
  }
  
  @Test
  public void NotType() {
    this.assertBoolConstantType("i = !false;");
  }
  
  public void assertDoubleConstantType(final CharSequence input) {
    this.assertType(input, ETypeProvider.doubleConstantType);
  }
  
  public void assertBoolConstantType(final CharSequence input) {
    this.assertType(input, ETypeProvider.boolConstantType);
  }
  
  public void assertType(final CharSequence input, final ExpressionsType expectedType) {
    try {
      Model _parse = this._parseHelper.parse(input);
      EList<Store> _stores = _parse.getStores();
      Store _last = IterableExtensions.<Store>last(_stores);
      Expression _value = _last.getValue();
      ExpressionsType _typeFor = this._eTypeProvider.typeFor(_value);
      Assert.assertSame(expectedType, _typeFor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
