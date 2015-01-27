package eu.quanticol.caspa.tests;

import com.google.inject.Inject;
import eu.quanticol.CASPAInjectorProvider;
import eu.quanticol.cASPA.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CASPAInjectorProvider.class)
@SuppressWarnings("all")
public class ModelParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSimple() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimple2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimple3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1,b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P=P;");
      _builder.newLine();
      _builder.append("Q=Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P=Q;");
      _builder.newLine();
      _builder.append("Q=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = A | B;");
      _builder.newLine();
      _builder.append("A = A;");
      _builder.newLine();
      _builder.append("B = B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleCho() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = A + B;");
      _builder.newLine();
      _builder.append("A = A;");
      _builder.newLine();
      _builder.append("B = B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleNil() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleKill() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = kill;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePredTrue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = [True]P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePredFalse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = [False]P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a[True]<1>.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a[False](1).P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a*[True]<1>.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a*[False](1).P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniOutU() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a[True]<1>{this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniInU() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a[False](1){this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroOutU() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a*[True]<1>{this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroInU() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1});");
      _builder.newLine();
      _builder.append("P = a*[False](1){this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleReference2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P=Q;");
      _builder.newLine();
      _builder.append("Q=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePar2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = A | B;");
      _builder.newLine();
      _builder.append("A = A;");
      _builder.newLine();
      _builder.append("B = B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleCho2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = A + B;");
      _builder.newLine();
      _builder.append("A = A;");
      _builder.newLine();
      _builder.append("B = B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleNil2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleKill2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = kill;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePredTrue2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = [True]P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePredFalse2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = [False]P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniOut2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a[True]<1>.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniIn2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a[False](1).P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroOut2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a*[True]<1>.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroIn2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a*[False](1).P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniOutU2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a[True]<1>{this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniInU2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a[False](1){this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroOutU2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a*[True]<1>{this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroInU2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("P = a*[False](1){this.a := 1}.P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleReference3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P=Q;");
      _builder.newLine();
      _builder.append("Q=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePar3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = A | B;");
      _builder.newLine();
      _builder.append("A = A;");
      _builder.newLine();
      _builder.append("B = B;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleCho3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = A + B;");
      _builder.newLine();
      _builder.append("A = A;");
      _builder.newLine();
      _builder.append("B = B;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleNil3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleKill3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = kill;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePredTrue3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = [True]P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimplePredFalse3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = [False]P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniOut3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a[True]<1>.P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniIn3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a[False](1).P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroOut3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a*[True]<1>.P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroIn3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a*[False](1).P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniOutU3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a[True]<1>{this.a := 1}.P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionUniInU3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a[False](1){this.a := 1}.P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroOutU3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a*[True]<1>{this.a := 1}.P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleActionBroInU3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a=1, b=1});");
      _builder.newLine();
      _builder.append("(Q,{a=1,b=1});");
      _builder.newLine();
      _builder.append("P = a*[False](1){this.a := 1}.P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBikeSharingModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("//bike stations");
      _builder.newLine();
      _builder.append("(Shed,{zone = 1, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 2, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 3, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 4, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//our people");
      _builder.newLine();
      _builder.append("(Q, {zone = 1});");
      _builder.newLine();
      _builder.append("(Q, {zone = 2});");
      _builder.newLine();
      _builder.append("(Q, {zone = 3});");
      _builder.newLine();
      _builder.append("(Q, {zone = 4});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//shed actions");
      _builder.newLine();
      _builder.append("Shed = G|R;");
      _builder.newLine();
      _builder.append("G = [bikes > 0] \t\tget[zone == this.zone]<1>{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;");
      _builder.newLine();
      _builder.append("R = [slots > bikes] \tret[zone == this.zone]<1>{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//people actions");
      _builder.newLine();
      _builder.append("Q = B;");
      _builder.newLine();
      _builder.append("//Uniform distribution \"U\"");
      _builder.newLine();
      _builder.append("B = move*[False]<1>{this.zone := U(1, 2, 3, 4)}.B + stop*[False]<1>.WS;");
      _builder.newLine();
      _builder.append("WS = ret[zone == this.zone](1).P;");
      _builder.newLine();
      _builder.append("P = go*[False]<1>.WB;");
      _builder.newLine();
      _builder.append("WB = get[zone == this.zone](1).B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBikeSharingArgsModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("//Now the pedestrians are interested in the total number of bikes and slots that they have seen");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//bike stations");
      _builder.newLine();
      _builder.append("(Shed,{zone = 1, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 2, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 3, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 4, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//our people");
      _builder.newLine();
      _builder.append("(Q, {zone = 1, slots = 0, bikes = 0});");
      _builder.newLine();
      _builder.append("(Q, {zone = 2, slots = 0, bikes = 0});");
      _builder.newLine();
      _builder.append("(Q, {zone = 3, slots = 0, bikes = 0});");
      _builder.newLine();
      _builder.append("(Q, {zone = 4, slots = 0, bikes = 0});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//shed actions");
      _builder.newLine();
      _builder.append("Shed = G|R;");
      _builder.newLine();
      _builder.append("G = [bikes > 0] \t\tget[zone == this.zone]<this.slots>{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;");
      _builder.newLine();
      _builder.append("R = [slots > bikes] \tret[zone == this.zone]<this.bikes>{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//people actions");
      _builder.newLine();
      _builder.append("Q = B;");
      _builder.newLine();
      _builder.append("B = move*[False]<1>{this.zone := U(1, 2, 3, 4)}.B + stop*[False]<1>.WS;");
      _builder.newLine();
      _builder.append("WS = ret[zone == this.zone](bikes){this.bikes := this.bikes + bikes}.P;");
      _builder.newLine();
      _builder.append("P = go*[False]<1>.WB;");
      _builder.newLine();
      _builder.append("WB = get[zone == this.zone](slots){this.slots := this.slots + slots}.B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBikeSharingPrModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("//bike stations");
      _builder.newLine();
      _builder.append("(Shed,{zone = 1, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 2, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 3, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(Shed,{zone = 4, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//our people");
      _builder.newLine();
      _builder.append("(Q, {zone = 1});");
      _builder.newLine();
      _builder.append("(Q, {zone = 2});");
      _builder.newLine();
      _builder.append("(Q, {zone = 3});");
      _builder.newLine();
      _builder.append("(Q, {zone = 4});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//shed actions");
      _builder.newLine();
      _builder.append("Shed = G|R;");
      _builder.newLine();
      _builder.append("G = [bikes > 0] \t\tget[zone == this.zone]<1>{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;");
      _builder.newLine();
      _builder.append("R = [slots > bikes] \tret[zone == this.zone]<1>{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//people actions");
      _builder.newLine();
      _builder.append("Q = B;");
      _builder.newLine();
      _builder.append("// notice the change to Pr here - probability:zone number");
      _builder.newLine();
      _builder.append("B = move*[False]<1>{this.zone := Pr(0.25:1, 0.05:2, 0.40:3, 0.3:4)}.B + stop*[False]<1>.WS;");
      _builder.newLine();
      _builder.append("WS = ret[zone == this.zone](1).P;");
      _builder.newLine();
      _builder.append("P = go*[False]<1>.WB;");
      _builder.newLine();
      _builder.append("WB = get[zone == this.zone](1).B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcessActions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Process - Actions (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Some examples");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("(@CDW VALIDATIONCHECK:Matching arguments \t27.01.15)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Actions are built up of:");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Part\t\t\t\t\tDefined-by\t\t\t\t\tType\t\t\t\tOptional/Compulsory");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ----------------------------------------------------------------------------------------");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Name \t\t\t\tlower case char\t\t\t\tString\t\t\t\tCompulsory\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Predicate \t\t\tsquare brackets\t\t\t\tLogical\t\t\t\tCompulsory");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* In/Out Arguments \tangled/round brackets\t\tValue\t\t\t\tOptional");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Update \t\t\t\tcurly brackets\t\t\t\tAssignment\t\t\tCompulsory");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ProcessReference\t\t\".\"\t\t\t\t\t\t\tProcessReference\tCompulsory");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Compulsory In/Out Arguments (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* The environment must facilitate the communication between action pairs if there is no");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* distinct in/out coupling.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* P = a{this.x := this.x + 1}.P");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Q = a{this.x := this.x + 1}.Q");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* In the above, who is the sender, and who is the receiver?");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* OR");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Compulsory In/Out?");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* P = a<1>{this.x := this.x + 1}.P");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Q = a(1){this.x := this.x + 1}.Q");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Compulsory Predicate? (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Not certain I understand the meaning of a[False]<>{}");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Predicates might well need to be compulsory as well.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("/*");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("* OPTIONAL Updates? (CDW 27.01.15)");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("* I am fairly certain that updates can be options, certainly for outgoing actions.");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("*/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("(P,{a=1,b=1});");
      _builder.newLine();
      _builder.append("(Q,{c=1,d=1});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//unicast");
      _builder.newLine();
      _builder.append("P = msg[True]<this.a>{this.a := this.a + 1}.R;");
      _builder.newLine();
      _builder.append("Q = msg[True](a){this.c := this.c + a}.S;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//broadcast");
      _builder.newLine();
      _builder.append("R = msg*[True]<this.a>{this.a := this.a + 1}.T;");
      _builder.newLine();
      _builder.append("S = msg*[True](a){this.c := this.c + a}.W;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//can miss out updates:");
      _builder.newLine();
      _builder.append("T = msg1[True]<this.a>.P;");
      _builder.newLine();
      _builder.append("W = msg1[True](a).Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcessLeaf() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Process - nil/kill - the leaves (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("(P,{a=1}); //should both parse, but fail validation");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("(Q,{a=1}); //(@CDW VALIDATIONCHECK:These are invalid Process for Term \t27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("P = nil;\t//OK, but how to check for this? - what if the ProcessExpression is more complex.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("Q = kill;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcessPredicate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Process - Predicate (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Some example expressions");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("(P,{a=1,b=1});");
      _builder.newLine();
      _builder.append("(Z,{c=1});");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//Demonstration of Predicate expressions - not real examples");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//atomic");
      _builder.newLine();
      _builder.append("P = [True]Q + [False]Q;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//values and comparison");
      _builder.newLine();
      _builder.append("Q = [this.a > 0]R ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [this.a < 0]R ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [this.a <= 0]R ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [this.a >= 0]R ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [this.a == 0]R ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [this.a != 0]R;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//arithmetic used inside logical expression");
      _builder.newLine();
      _builder.append("R = [this.a > (c * 1)]S;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//demonstration of different logical operators");
      _builder.newLine();
      _builder.append("S = [False || True]T ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [True && False]T ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [!False]T ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [!(True || False) && (!False && True)]T;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("//demonstration of arithmetic and comparison operators");
      _builder.newLine();
      _builder.append("T = [(this.a + this.b) >= 2]W ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [(this.a - this.b) <= 2]W ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [(this.a / this.b) < 2]W ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [(this.a * this.b) > 2]W");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [(this.a * this.b) == 2]W");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("+ [(this.a * this.b) != 2]W;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//demonstration using global reference");
      _builder.newLine();
      _builder.append("W = [(this.a - this.b) == c]P;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("Z = Z;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTermStore() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Stores (CDW 27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ATTR : VALUE (VALUE is Natural type)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* These should parse, but there are validation checks to be made");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("(P,{a=1}); \t\t// (@CDW VALIDATIONCHECK:Does the store ever get used? \t27.01.15)");
      _builder.newLine();
      _builder.append("(P,{a=1}); \t\t// (@CDW VALIDATIONCHECK:This is a TERM repetition. \t27.01.15)");
      _builder.newLine();
      _builder.append("(P,{a=1,a=1}); \t// (@CDW VALIDATIONCHECK:This is a STORE repetition. \t27.01.15)");
      _builder.newLine();
      _builder.append("(P,{a=1,b=1});");
      _builder.newLine();
      _builder.append("(P,{b=1,a=1});\t\t// (@CDW VALIDATIONCHECK:This is a TERM repetition. \t27.01.15)");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("P=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTermProcess() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* A Discussion of the expressions of Process in Terms (CDW 27.01.15).");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* In main3.pdf (CASPA: a Collective Adaptive Stochastic Process Algebra)");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* we see the use of (G|R, {zone = l, bikes = i, slots = j}). Ignore the stores as this is a discussion of");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Processes. The Process is two Processes running in parallel \"|\". If we allow for \"|\" in a Term definition, ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* then we should allow for full expressiveness in Terms (no?). I don\'t believe this to be sensible, Terms ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* could become polluted with Process expressions, and may confuse the user. Instead I think a singular Process");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* reference should be used in the Term, as shown below.  ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//parallel processes");
      _builder.newLine();
      _builder.append("(P, {a=1});");
      _builder.newLine();
      _builder.append("(A, {a=1});\t");
      _builder.newLine();
      _builder.append("(B, {a=1});");
      _builder.newLine();
      _builder.append("(C, {a=1});");
      _builder.newLine();
      _builder.append("//parallel and choice");
      _builder.newLine();
      _builder.append("(D, {a=1});");
      _builder.newLine();
      _builder.append("//parallel, choice and predicate");
      _builder.newLine();
      _builder.append("(E, {a=1});");
      _builder.newLine();
      _builder.append("//nil - a pointless expression? - this will need to be checked for at parsing (@CDW VALIDATIONCHECK 27.01.15)");
      _builder.newLine();
      _builder.append("(F, {a=1});");
      _builder.newLine();
      _builder.append("//kill - also pointless? - this will also need to be checked for at parsing (@CDW VALIDATIONCHECK 27.01.15)");
      _builder.newLine();
      _builder.append("(G, {a=1});");
      _builder.newLine();
      _builder.append("//Action - for a later discussion. (CDW 27.01.15)");
      _builder.newLine();
      _builder.append("(H, {a=1});");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//simplistic processes");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("Q = Q;");
      _builder.newLine();
      _builder.append("R = R;");
      _builder.newLine();
      _builder.append("S = S;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Parallel");
      _builder.newLine();
      _builder.append("A = P|Q;");
      _builder.newLine();
      _builder.append("B = P|Q|R;");
      _builder.newLine();
      _builder.append("C = P|Q|R|S;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Choice");
      _builder.newLine();
      _builder.append("D = A + R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Predicate");
      _builder.newLine();
      _builder.append("E = A + [True]D;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//nil");
      _builder.newLine();
      _builder.append("F = nil;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//kill");
      _builder.newLine();
      _builder.append("G = kill;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Action");
      _builder.newLine();
      _builder.append("H = a[True]<1>.H;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//UNUSED");
      _builder.newLine();
      _builder.append("I = I;\t//(@CDW VALIDATIONCHECK 27.01.15 - this goes unused, need a check for this?)");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
