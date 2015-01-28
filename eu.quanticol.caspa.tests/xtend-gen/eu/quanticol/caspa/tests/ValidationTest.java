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
}
