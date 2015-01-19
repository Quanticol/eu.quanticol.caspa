package eu.quanticol.caspa.tests;

import com.google.inject.Inject;
import eu.quanticol.CASPAInjectorProvider;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Model;
import eu.quanticol.validation.CASPAValidator;
import org.eclipse.emf.ecore.EClass;
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
public class ValidationTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCheckNotSelfReferencing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = i;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _referencedStore = CASPAPackage.eINSTANCE.getReferencedStore();
      this._validationTestHelper.assertError(_parse, _referencedStore, 
        CASPAValidator.SELF_REFERENCING_STORE, 
        "Cannot have self referencing stores. \'i\' is seen in the expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckStoresNamesUnique() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
      _builder.newLine();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _store = CASPAPackage.eINSTANCE.getStore();
      this._validationTestHelper.assertError(_parse, _store, 
        CASPAValidator.STORE_NAMES_UNIQUE, 
        "Must have unique store names. \'i\' is repeated");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckProcessNamesUnique() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _process = CASPAPackage.eINSTANCE.getProcess();
      this._validationTestHelper.assertError(_parse, _process, 
        CASPAValidator.PROCESS_NAMES_UNIQUE, 
        "Must have unique process names. \'P\' is repeated");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferencing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = !a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _not = CASPAPackage.eINSTANCE.getNot();
      this._validationTestHelper.assertError(_parse, _not, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = 3.0;");
      _builder.newLine();
      _builder.append("P = c[$x;](this.b := $y;){this.b := !a;}.P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionNot = CASPAPackage.eINSTANCE.getActionNot();
      this._validationTestHelper.assertError(_parse, _actionNot, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true || a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _or = CASPAPackage.eINSTANCE.getOr();
      this._validationTestHelper.assertError(_parse, _or, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionOr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x == (a || b);]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionOr = CASPAPackage.eINSTANCE.getActionOr();
      this._validationTestHelper.assertError(_parse, _actionOr, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true && a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _and = CASPAPackage.eINSTANCE.getAnd();
      this._validationTestHelper.assertError(_parse, _and, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionAnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[(a && b);]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionAnd = CASPAPackage.eINSTANCE.getActionAnd();
      this._validationTestHelper.assertError(_parse, _actionAnd, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testEq() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true == a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _equality = CASPAPackage.eINSTANCE.getEquality();
      this._validationTestHelper.assertError(_parse, _equality, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionEq() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x == a;]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionEquality = CASPAPackage.eINSTANCE.getActionEquality();
      this._validationTestHelper.assertError(_parse, _actionEquality, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testEq1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true != a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _equality = CASPAPackage.eINSTANCE.getEquality();
      this._validationTestHelper.assertError(_parse, _equality, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionEq1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x != a;]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionEquality = CASPAPackage.eINSTANCE.getActionEquality();
      this._validationTestHelper.assertError(_parse, _actionEquality, 
        CASPAValidator.WRONG_TYPE, 
        "Expected boolean type, but was double");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testCom1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true < a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _comparison = CASPAPackage.eINSTANCE.getComparison();
      this._validationTestHelper.assertError(_parse, _comparison, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionCom1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c[$x < a;]($y;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionComparison = CASPAPackage.eINSTANCE.getActionComparison();
      this._validationTestHelper.assertError(_parse, _actionComparison, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testSub1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true - a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _sub = CASPAPackage.eINSTANCE.getSub();
      this._validationTestHelper.assertError(_parse, _sub, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionSub1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c(this.b := $y - a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionSub = CASPAPackage.eINSTANCE.getActionSub();
      this._validationTestHelper.assertError(_parse, _actionSub, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testPlu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true - a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _plu = CASPAPackage.eINSTANCE.getPlu();
      this._validationTestHelper.assertError(_parse, _plu, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionPlu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c(this.b := $y + a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionPlu = CASPAPackage.eINSTANCE.getActionPlu();
      this._validationTestHelper.assertError(_parse, _actionPlu, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMul1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true * a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _mul = CASPAPackage.eINSTANCE.getMul();
      this._validationTestHelper.assertError(_parse, _mul, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionMul1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c(this.b := $y * a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionMul = CASPAPackage.eINSTANCE.getActionMul();
      this._validationTestHelper.assertError(_parse, _actionMul, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDiv1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 1.0;");
      _builder.newLine();
      _builder.append("b = true / a;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _div = CASPAPackage.eINSTANCE.getDiv();
      this._validationTestHelper.assertError(_parse, _div, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testActionDiv1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = true;");
      _builder.newLine();
      _builder.append("b = true;");
      _builder.newLine();
      _builder.append("P = c(this.b := $y / a;).P;");
      _builder.newLine();
      _builder.append("(P,{b});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _actionDiv = CASPAPackage.eINSTANCE.getActionDiv();
      this._validationTestHelper.assertError(_parse, _actionDiv, 
        CASPAValidator.WRONG_TYPE, 
        "Expected double type, but was boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUpdateExpression1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c{this.z := boolean;}.P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpression = CASPAPackage.eINSTANCE.getUpdateExpression();
      this._validationTestHelper.assertError(_parse, _updateExpression, 
        CASPAValidator.WRONG_TYPE, 
        "assignment has non matching type to reference");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUpdateExpression2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c{z := boolean;}.P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpression = CASPAPackage.eINSTANCE.getUpdateExpression();
      this._validationTestHelper.assertError(_parse, _updateExpression, 
        CASPAValidator.WRONG_TYPE, 
        "assignment has non matching type to reference");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPredicateExpression1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c[1.0].P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _predicateExpression = CASPAPackage.eINSTANCE.getPredicateExpression();
      this._validationTestHelper.assertError(_parse, _predicateExpression, 
        CASPAValidator.WRONG_TYPE, 
        "Predicates must be boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLocalEvalIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c(this.z := false).P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _evaluationExpressionIn = CASPAPackage.eINSTANCE.getEvaluationExpressionIn();
      this._validationTestHelper.assertError(_parse, _evaluationExpressionIn, 
        CASPAValidator.WRONG_TYPE, 
        "bad assignment, check types and references");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGlobalEvalIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c(this.z := false).P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _evaluationExpressionIn = CASPAPackage.eINSTANCE.getEvaluationExpressionIn();
      this._validationTestHelper.assertError(_parse, _evaluationExpressionIn, 
        CASPAValidator.WRONG_TYPE, 
        "bad assignment, check types and references");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFreeEvalOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("z = 0.2;");
      _builder.newLine();
      _builder.append("P = c<$z := Pello;>.P;");
      _builder.newLine();
      _builder.append("(P,{z});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _freeEvaluationExpression = CASPAPackage.eINSTANCE.getFreeEvaluationExpression();
      this._validationTestHelper.assertError(_parse, _freeEvaluationExpression, 
        CASPAValidator.WRONG_TYPE, 
        "bad assignment, check types and references");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
