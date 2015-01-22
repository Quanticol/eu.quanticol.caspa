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
  public void testBikeSharingModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("//our stations");
      _builder.newLine();
      _builder.append("(G|R,{zone = 1, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 2, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 3, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 4, bikes = 5, slots = 5});");
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
      _builder.append("G = [bikes > 0] \t\tget[zone == this.zone]{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;");
      _builder.newLine();
      _builder.append("R = [slots > bikes] \tret[zone == this.zone]{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//people actions");
      _builder.newLine();
      _builder.append("Q = B;");
      _builder.newLine();
      _builder.append("//Uniform distribution \"U\"");
      _builder.newLine();
      _builder.append("B = move*[False]{this.zone := U(1, 2, 3, 4)}.B + stop*[False].WS;");
      _builder.newLine();
      _builder.append("WS = ret[zone == this.zone].P;");
      _builder.newLine();
      _builder.append("P = go*[False].WB;");
      _builder.newLine();
      _builder.append("WB = get[zone == this.zone].B;");
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
      _builder.append("//our stations");
      _builder.newLine();
      _builder.append("(G|R,{zone = 1, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 2, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 3, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 4, bikes = 5, slots = 5});");
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
      _builder.append("G = [bikes > 0] \t\tget[zone == this.zone]<this.slots>{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;");
      _builder.newLine();
      _builder.append("R = [slots > bikes] \tret[zone == this.zone]<this.bikes>{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//people actions");
      _builder.newLine();
      _builder.append("Q = B;");
      _builder.newLine();
      _builder.append("B = move*[False]{this.zone := U(1, 2, 3, 4)}.B + stop*[False].WS;");
      _builder.newLine();
      _builder.append("WS = ret[zone == this.zone](bikes){this.bikes := this.bikes + bikes}.P;");
      _builder.newLine();
      _builder.append("P = go*[False].WB;");
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
      _builder.append("//our stations");
      _builder.newLine();
      _builder.append("(G|R,{zone = 1, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 2, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 3, bikes = 5, slots = 5});");
      _builder.newLine();
      _builder.append("(G|R,{zone = 4, bikes = 5, slots = 5});");
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
      _builder.append("G = [bikes > 0] \t\tget[zone == this.zone]{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;");
      _builder.newLine();
      _builder.append("R = [slots > bikes] \tret[zone == this.zone]{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//people actions");
      _builder.newLine();
      _builder.append("Q = B;");
      _builder.newLine();
      _builder.append("// notice the change to Pr here - probability:zone number");
      _builder.newLine();
      _builder.append("B = move*[False]{this.zone := Pr(0.25:1, 0.05:2, 0.40:3, 0.3:4)}.B + stop*[False].WS;");
      _builder.newLine();
      _builder.append("WS = ret[zone == this.zone].P;");
      _builder.newLine();
      _builder.append("P = go*[False].WB;");
      _builder.newLine();
      _builder.append("WB = get[zone == this.zone].B;");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
