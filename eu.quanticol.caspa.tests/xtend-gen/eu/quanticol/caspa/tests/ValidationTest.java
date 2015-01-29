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
  public void testFreeVariableNotUniqueFromStore() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = P;");
      _builder.newLine();
      _builder.append("P = action1[True](a).P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _in = CASPAPackage.eINSTANCE.getIn();
      this._validationTestHelper.assertError(_parse, _in, 
        CASPAValidator.FREE_VARIABLES_UNIQUE, 
        "Free variable names cannot be the same as local store names.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferencePredicate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[this.c < 1]().Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _predicateStoreReference = CASPAPackage.eINSTANCE.getPredicateStoreReference();
      this._validationTestHelper.assertError(_parse, _predicateStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferencePredicate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[c < 1]().Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _predicateStoreReference = CASPAPackage.eINSTANCE.getPredicateStoreReference();
      this._validationTestHelper.assertError(_parse, _predicateStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferenceOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<this.c>.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _outStoreReference = CASPAPackage.eINSTANCE.getOutStoreReference();
      this._validationTestHelper.assertError(_parse, _outStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<this.c>.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _outStoreReference = CASPAPackage.eINSTANCE.getOutStoreReference();
      this._validationTestHelper.assertError(_parse, _outStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferenceUpdate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{this.c := 1}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateStoreReference = CASPAPackage.eINSTANCE.getUpdateStoreReference();
      this._validationTestHelper.assertError(_parse, _updateStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceUpdate() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{c := 1}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateStoreReference = CASPAPackage.eINSTANCE.getUpdateStoreReference();
      this._validationTestHelper.assertError(_parse, _updateStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferenceUpdateExpressionOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{a := this.c}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpressionStoreReference = CASPAPackage.eINSTANCE.getUpdateExpressionStoreReference();
      this._validationTestHelper.assertError(_parse, _updateExpressionStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceUpdateUpdateExpressionOut() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{a := c}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpressionStoreReference = CASPAPackage.eINSTANCE.getUpdateExpressionStoreReference();
      this._validationTestHelper.assertError(_parse, _updateExpressionStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferenceUpdateExpressionIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True](){a := this.c}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpressionStoreReference = CASPAPackage.eINSTANCE.getUpdateExpressionStoreReference();
      this._validationTestHelper.assertError(_parse, _updateExpressionStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceUpdateUpdateExpressionIn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True](){a := c}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _updateExpressionStoreReference = CASPAPackage.eINSTANCE.getUpdateExpressionStoreReference();
      this._validationTestHelper.assertError(_parse, _updateExpressionStoreReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store or free variable.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferenceDistribution() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{a := U(this.c)}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _uniformReference = CASPAPackage.eINSTANCE.getUniformReference();
      this._validationTestHelper.assertError(_parse, _uniformReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceUpdateDistribution() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{a := U(c)}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _uniformReference = CASPAPackage.eINSTANCE.getUniformReference();
      this._validationTestHelper.assertError(_parse, _uniformReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store or free variable.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSelfReferencePr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{a := Pr(0.5:this.c)}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _distributionReference = CASPAPackage.eINSTANCE.getDistributionReference();
      this._validationTestHelper.assertError(_parse, _distributionReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceUpdatePr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(Q,{a:=1});");
      _builder.newLine();
      _builder.append("Q = R;");
      _builder.newLine();
      _builder.append("R = action[True]<>{a := Pr(0.5:c)}.Q;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _distributionReference = CASPAPackage.eINSTANCE.getDistributionReference();
      this._validationTestHelper.assertError(_parse, _distributionReference, 
        CASPAValidator.REFERENCE_HAS_NO_REFERENCE, 
        "Reference \'c\' does not refer to a declared store or free variable.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNoDuplicateStoresInTerms() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(P,{a:=1,a:=1});");
      _builder.newLine();
      _builder.append("P=P;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _store = CASPAPackage.eINSTANCE.getStore();
      this._validationTestHelper.assertError(_parse, _store, 
        CASPAValidator.NO_DUPLICATE_STORES_IN_TERMS, 
        "Store names cannot be repeated in Terms.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
