package eu.quanticol.caspa.tests;

import com.google.inject.Inject;
import eu.quanticol.CASPAInjectorProvider;
import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionAnd;
import eu.quanticol.cASPA.ActionComparison;
import eu.quanticol.cASPA.ActionDiv;
import eu.quanticol.cASPA.ActionEquality;
import eu.quanticol.cASPA.ActionExpression;
import eu.quanticol.cASPA.ActionMul;
import eu.quanticol.cASPA.ActionNot;
import eu.quanticol.cASPA.ActionOr;
import eu.quanticol.cASPA.ActionPlu;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.ActionSub;
import eu.quanticol.cASPA.And;
import eu.quanticol.cASPA.BoolConstant;
import eu.quanticol.cASPA.Broadcast;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Comparison;
import eu.quanticol.cASPA.Div;
import eu.quanticol.cASPA.DoubleConstant;
import eu.quanticol.cASPA.Equality;
import eu.quanticol.cASPA.EvaluationExpressionIn;
import eu.quanticol.cASPA.EvaluationExpressionOut;
import eu.quanticol.cASPA.Evaluations;
import eu.quanticol.cASPA.Expression;
import eu.quanticol.cASPA.FreeEvaluationExpression;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.GlobalEvaluationExpression;
import eu.quanticol.cASPA.GlobalUpdateExpression;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalEvaluationExpression;
import eu.quanticol.cASPA.LocalUpdateExpression;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Mul;
import eu.quanticol.cASPA.Not;
import eu.quanticol.cASPA.Or;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Plu;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ProcessReference;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Sub;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.Updates;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
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
  
  private CharSequence output;
  
  private Store intermediateStore;
  
  private eu.quanticol.cASPA.Process intermediateProcess;
  
  private Model intermediateModel;
  
  @Test
  public void testVariableExpression1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(Q,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionSub1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 - 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionPlu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 + 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionMul1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 * 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionDiv1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 / 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionOr1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true || false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionAnd1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = false && false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionEqu1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true != false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionEqu2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true == true;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 2.0 >= 2.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 2.0 > 1.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 1.0 < 2.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionCom4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 2.0 >= 2.0;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionNot1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = !true;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionBoolConstant1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = true;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionBoolConstant2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = false;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionRat1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 / 0.1;");
      _builder.newLine();
      _builder.append("j = 0.2;");
      _builder.newLine();
      _builder.append("k = i + j;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionExp1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = (0.2 / 0.1) + 0.4;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpressionExp2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.2 / 0.1;");
      _builder.newLine();
      _builder.append("j = 0.2;");
      _builder.newLine();
      _builder.append("k = (0.1 + i) + j;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c*[$x;]<$y := b;>{a := $z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.3;");
      _builder.newLine();
      _builder.append("P = c*[$x;](this.a := 0.25;){a := $z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c[$x;]<$y := 0.1 ;>{a := $z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c[$x;](a := b;){a := $z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c[$x;](a := b;){this.a := $z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleAction6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 0.1;");
      _builder.newLine();
      _builder.append("b = 0.1;");
      _builder.newLine();
      _builder.append("P = c[$x;]<$y := b;>{this.a := $z;}.P;");
      _builder.newLine();
      _builder.append("(P,{a});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = nil;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = kill;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P + Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = P | Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = [$x;]P;");
      _builder.newLine();
      _builder.append("(P,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProcess7() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0.1;");
      _builder.newLine();
      _builder.append("P = Q;");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("R = P + Q;");
      _builder.newLine();
      _builder.append("(R,{i});");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimple() {
    this.assertReprStores("i = 10.0;", "10.0");
  }
  
  @Test
  public void testSimple1() {
    this.assertReprStores("i = (10.0);", "10.0");
  }
  
  @Test
  public void testSimple2() {
    this.assertReprStores("i = true;", "true");
  }
  
  @Test
  public void testSimple3() {
    this.assertReprStores("i = false;", "false");
  }
  
  @Test
  public void testSimple4() {
    this.assertReprStores("i = !false;", "! false");
  }
  
  @Test
  public void testSimple5() {
    this.assertReprStores("i = !true;", "! true");
  }
  
  @Test
  public void testSimpleOr() {
    this.assertReprStores("i = true || false);", "(true || false)");
  }
  
  @Test
  public void testSimpleAnd() {
    this.assertReprStores("i = true && false);", "(true && false)");
  }
  
  @Test
  public void testSimpleEquality1() {
    this.assertReprStores("i = true == true);", "(true == true)");
  }
  
  @Test
  public void testSimpleEquality2() {
    this.assertReprStores("i = true != false);", "(true != false)");
  }
  
  @Test
  public void testSimpleComparison1() {
    this.assertReprStores("i = 0.1 < 0.2);", "(0.1 < 0.2)");
  }
  
  @Test
  public void testSimpleComparison2() {
    this.assertReprStores("i = 0.2 <= 0.2);", "(0.2 <= 0.2)");
  }
  
  @Test
  public void testSimpleComparison3() {
    this.assertReprStores("i = 0.2 > 0.1);", "(0.2 > 0.1)");
  }
  
  @Test
  public void testSimpleComparison4() {
    this.assertReprStores("i = 0.2 >= 0.2);", "(0.2 >= 0.2)");
  }
  
  @Test
  public void testSimplePlus() {
    this.assertReprStores("i = (10.0 + 1.0);", "(10.0 + 1.0)");
  }
  
  @Test
  public void testSimplePlus1() {
    this.assertReprStores("i = 10.0 + 1.0;", "(10.0 + 1.0)");
  }
  
  @Test
  public void testPlus1() {
    this.assertReprStores("i = (10.0 + 1.0) + 3.0;", "((10.0 + 1.0) + 3.0)");
  }
  
  @Test
  public void testMix1() {
    this.assertReprStores("i = ((10.0+1.0)/2.0)+((3.0+1.0)/2.0);", "(((10.0 + 1.0) / 2.0) + ((3.0 + 1.0) / 2.0))");
  }
  
  public void assertReprStores(final CharSequence input, final CharSequence expectation) {
    try {
      Model _parse = this._parseHelper.parse(input);
      this.intermediateModel = _parse;
      EList<Store> _stores = this.intermediateModel.getStores();
      Store _last = IterableExtensions.<Store>last(_stores);
      this.intermediateStore = _last;
      Expression _value = this.intermediateStore.getValue();
      CharSequence _stringRepr = this.stringRepr(_value);
      this.output = _stringRepr;
      Assert.assertEquals(this.output, expectation);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssertProcess1() {
    this.assertReprProcesses("i = 0.1; P = nil; (P,{i});", "nil");
  }
  
  @Test
  public void testAssertProcess2() {
    this.assertReprProcesses("i = 0.1; P = kill; (P,{i});", "kill");
  }
  
  @Test
  public void testAssertProcess3() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]<$y := 0.1;>{this.a := $z;}.P; (P,{a});", 
      "c[$x;]<$y:=0.1;>{this.a:=$z;}.P");
  }
  
  @Test
  public void testAssertProcess4() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a:=0.1;){this.a := $z;}.P; (P,{a});", 
      "c[$x;](this.a:=0.1;){this.a:=$z;}.P");
  }
  
  @Test
  public void testAssertProcess5() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a:=0.1;this.b:=a;){this.a := $z;}.P; (P,{a});", 
      "c[$x;](this.a:=0.1;this.b:=a;){this.a:=$z;}.P");
  }
  
  @Test
  public void testAssertProcess6() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a:=0.1;this.b:=a;){this.a := $z;b:=$a;}.P; (P,{a});", 
      "c[$x;](this.a:=0.1;this.b:=a;){this.a:=$z;b:=$a;}.P");
  }
  
  @Test
  public void testAssertProcess7() {
    this.assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P + Q (R,{a});", "(P + Q)");
  }
  
  @Test
  public void testAssertProcess8() {
    this.assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P | Q (R,{a});", "(P | Q)");
  }
  
  @Test
  public void testAssertProcess9() {
    this.assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P | Q + P (R,{a});", "(P | (Q + P))");
  }
  
  @Test
  public void testAssertProcess10() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = [$x]P (R,{a});", "[$x;]P");
  }
  
  @Test
  public void testAssertProcess11() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = Q; R = P; (R,{a});", "P");
  }
  
  @Test
  public void testAssertProcess12() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});", 
      "c[$x;](this.a:=$y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P");
  }
  
  @Test
  public void testAssertProcess12a() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z+1.0;}.P; (P,{a});", 
      "c[$x;](this.a:=$y;){this.a:=($z + 1.0);}.P");
  }
  
  @Test
  public void testAssertProcess13() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x + 5 * 2.0 / 0.5 - 2;](this.a := $y;){this.a := $z;}.P; (P,{a});", 
      "c[(($x + (5.0 * (2.0 / 0.5))) - 2.0);](this.a:=$y;){this.a:=$z;}.P");
  }
  
  @Test
  public void testAssertProcess14() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});", 
      "c[$x;](this.a:=$y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P");
  }
  
  @Test
  public void testAssertProcess15() {
    this.assertReprProcesses("a = 0.1; b = 0.1; P = c*[$x;](this.a := $y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});", 
      "c*[$x;](this.a:=$y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P");
  }
  
  public void assertReprProcesses(final CharSequence input, final CharSequence expectation) {
    try {
      Model _parse = this._parseHelper.parse(input);
      this.intermediateModel = _parse;
      EList<eu.quanticol.cASPA.Process> _processes = this.intermediateModel.getProcesses();
      eu.quanticol.cASPA.Process _last = IterableExtensions.<eu.quanticol.cASPA.Process>last(_processes);
      this.intermediateProcess = _last;
      ProcessExpression _value = this.intermediateProcess.getValue();
      CharSequence _stringRepr = this.stringRepr(_value);
      this.output = _stringRepr;
      Assert.assertEquals(this.output, expectation);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence stringRepr(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Or)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" || ");
        Expression _right = ((Or)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((And)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" && ");
        Expression _right = ((And)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Equality)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((Equality)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Equality)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Comparison)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((Comparison)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Comparison)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Sub) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Sub)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" - ");
        Expression _right = ((Sub)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Plu) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Plu)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        Expression _right = ((Plu)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Mul) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Mul)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" * ");
        Expression _right = ((Mul)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Div) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Div)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" / ");
        Expression _right = ((Div)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("! ");
        Expression _expression = ((Not)e).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Store _value = ((ReferencedStore)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((DoubleConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
  
  public CharSequence stringRepr(final ActionExpression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof ActionOr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionOr)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" || ");
        ActionExpression _right = ((ActionOr)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionAnd) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionAnd)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" && ");
        ActionExpression _right = ((ActionAnd)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionEquality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionEquality)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((ActionEquality)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        ActionExpression _right = ((ActionEquality)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionComparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionComparison)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((ActionComparison)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        ActionExpression _right = ((ActionComparison)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionSub) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionSub)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" - ");
        ActionExpression _right = ((ActionSub)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionPlu) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionPlu)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        ActionExpression _right = ((ActionPlu)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionMul) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionMul)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" * ");
        ActionExpression _right = ((ActionMul)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionDiv) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ActionExpression _left = ((ActionDiv)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" / ");
        ActionExpression _right = ((ActionDiv)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionNot) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("! ");
        ActionExpression _expression = ((ActionNot)e).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof FreeVariable) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((FreeVariable)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof SelfReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        Store _name = ((SelfReferencedStore)e).getName();
        String _name_1 = _name.getName();
        _builder.append(_name_1, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedStore) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _value = ((ReferencedStore)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((DoubleConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
  
  public CharSequence stringRepr(final ProcessExpression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Parallel) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ProcessExpression _left = ((Parallel)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" | ");
        ProcessExpression _right = ((Parallel)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Choice) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        ProcessExpression _left = ((Choice)e).getLeft();
        CharSequence _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        ProcessExpression _right = ((Choice)e).getRight();
        CharSequence _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Leaf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((Leaf)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PredicateProcess) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Predicate _predicate = ((PredicateProcess)e).getPredicate();
        CharSequence _stringRepr = this.stringRepr(_predicate);
        _builder.append(_stringRepr, "");
        eu.quanticol.cASPA.Process _value = ((PredicateProcess)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ActionProcess) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Action _action = ((ActionProcess)e).getAction();
        CharSequence _stringRepr = this.stringRepr(((Action) _action));
        _builder.append(_stringRepr, "");
        _builder.append(".");
        eu.quanticol.cASPA.Process _value = ((ActionProcess)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ProcessReference) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        eu.quanticol.cASPA.Process _value = ((ProcessReference)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
  
  public CharSequence stringRepr(final Action a) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (a instanceof Broadcast) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((Broadcast)a).getName();
        _builder.append(_name, "");
        _builder.append("*");
        Predicate _predicate = ((Broadcast)a).getPredicate();
        CharSequence _stringRepr = this.stringRepr(_predicate);
        _builder.append(_stringRepr, "");
        Evaluations _evaluations = ((Broadcast)a).getEvaluations();
        CharSequence _stringRepr_1 = this.stringRepr(_evaluations);
        _builder.append(_stringRepr_1, "");
        Updates _updates = ((Broadcast)a).getUpdates();
        CharSequence _stringRepr_2 = this.stringRepr(_updates);
        _builder.append(_stringRepr_2, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (a instanceof Unicast) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((Unicast)a).getName();
        _builder.append(_name, "");
        Predicate _predicate = ((Unicast)a).getPredicate();
        CharSequence _stringRepr = this.stringRepr(_predicate);
        _builder.append(_stringRepr, "");
        Evaluations _evaluations = ((Unicast)a).getEvaluations();
        CharSequence _stringRepr_1 = this.stringRepr(_evaluations);
        _builder.append(_stringRepr_1, "");
        Updates _updates = ((Unicast)a).getUpdates();
        CharSequence _stringRepr_2 = this.stringRepr(_updates);
        _builder.append(_stringRepr_2, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
  
  public CharSequence stringRepr(final Predicate p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    PredicateExpression _predicate = p.getPredicate();
    ActionExpression _expression = _predicate.getExpression();
    CharSequence _stringRepr = this.stringRepr(((ActionExpression) _expression));
    _builder.append(_stringRepr, "");
    _builder.append(";]");
    return _builder;
  }
  
  public CharSequence stringRepr(final Evaluations e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof In) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        {
          EList<EvaluationExpressionIn> _expressions = ((In)e).getExpressions();
          for(final EvaluationExpressionIn evaluationExpression : _expressions) {
            CharSequence _stringRepr = this.stringRepr(((EvaluationExpressionIn) evaluationExpression));
            _builder.append(_stringRepr, "");
            _builder.append(";");
          }
        }
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Out) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<");
        {
          EList<EvaluationExpressionOut> _expressions = ((Out)e).getExpressions();
          for(final EvaluationExpressionOut evaluationExpression : _expressions) {
            CharSequence _stringRepr = this.stringRepr(((FreeEvaluationExpression) evaluationExpression));
            _builder.append(_stringRepr, "");
            _builder.append(";");
          }
        }
        _builder.append(">");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final EvaluationExpressionIn e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof LocalEvaluationExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        SelfReferencedStore _name = ((LocalEvaluationExpression)e).getName();
        Store _name_1 = ((SelfReferencedStore) _name).getName();
        String _name_2 = _name_1.getName();
        _builder.append(_name_2, "");
        _builder.append(":=");
        ActionExpression _expression = ((LocalEvaluationExpression)e).getExpression();
        CharSequence _stringRepr = this.stringRepr(((ActionExpression) _expression));
        _builder.append(_stringRepr, "");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof GlobalEvaluationExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _name = ((GlobalEvaluationExpression)e).getName();
        Expression _value = ((Store) _name).getValue();
        CharSequence _stringRepr = this.stringRepr(_value);
        _builder.append(_stringRepr, "");
        _builder.append(":=");
        ActionExpression _expression = ((GlobalEvaluationExpression)e).getExpression();
        CharSequence _stringRepr_1 = this.stringRepr(((ActionExpression) _expression));
        _builder.append(_stringRepr_1, "");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence stringRepr(final FreeEvaluationExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(":=");
    ActionExpression _expression = e.getExpression();
    CharSequence _stringRepr = this.stringRepr(((ActionExpression) _expression));
    _builder.append(_stringRepr, "");
    return _builder;
  }
  
  public CharSequence stringRepr(final Updates u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      EList<UpdateExpression> _updates = u.getUpdates();
      for(final UpdateExpression updateExpression : _updates) {
        CharSequence _stringRepr = this.stringRepr(updateExpression);
        _builder.append(_stringRepr, "");
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence stringRepr(final UpdateExpression u) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (u instanceof LocalUpdateExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        SelfReferencedStore _name = ((LocalUpdateExpression)u).getName();
        Store _name_1 = _name.getName();
        String _name_2 = _name_1.getName();
        _builder.append(_name_2, "");
        _builder.append(":=");
        ActionExpression _expression = ((LocalUpdateExpression)u).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _builder.append(";");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (u instanceof GlobalUpdateExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Store _name = ((GlobalUpdateExpression)u).getName();
        String _name_1 = _name.getName();
        _builder.append(_name_1, "");
        _builder.append(":=");
        ActionExpression _expression = ((GlobalUpdateExpression)u).getExpression();
        CharSequence _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _builder.append(";");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
}
