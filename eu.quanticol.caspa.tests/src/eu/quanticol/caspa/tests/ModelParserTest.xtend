package eu.quanticol.caspa.tests;

import eu.quanticol.CASPAInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import eu.quanticol.cASPA.Model
import org.junit.Test
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CASPAInjectorProvider))
public class ModelParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testBikeSharingModel(){
		'''
		//our stations
		(G|R,{zone = 1, bikes = 5, slots = 5});
		(G|R,{zone = 2, bikes = 5, slots = 5});
		(G|R,{zone = 3, bikes = 5, slots = 5});
		(G|R,{zone = 4, bikes = 5, slots = 5});

		//our people
		(Q, {zone = 1});
		(Q, {zone = 2});
		(Q, {zone = 3});
		(Q, {zone = 4});

		//shed actions
		G = [bikes > 0] 		get[zone == this.zone]{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;
		R = [slots > bikes] 	ret[zone == this.zone]{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;

		//people actions
		Q = B;
		//Uniform distribution "U"
		B = move*[False]{this.zone := U(1, 2, 3, 4)}.B + stop*[False].WS;
		WS = ret[zone == this.zone].P;
		P = go*[False].WB;
		WB = get[zone == this.zone].B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBikeSharingArgsModel(){
		'''
		//Now the pedestrians are interested in the total number of bikes and slots that they have seen

		//our stations
		(G|R,{zone = 1, bikes = 5, slots = 5});
		(G|R,{zone = 2, bikes = 5, slots = 5});
		(G|R,{zone = 3, bikes = 5, slots = 5});
		(G|R,{zone = 4, bikes = 5, slots = 5});

		//our people
		(Q, {zone = 1, slots = 0, bikes = 0});
		(Q, {zone = 2, slots = 0, bikes = 0});
		(Q, {zone = 3, slots = 0, bikes = 0});
		(Q, {zone = 4, slots = 0, bikes = 0});

		//shed actions
		G = [bikes > 0] 		get[zone == this.zone]<this.slots>{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;
		R = [slots > bikes] 	ret[zone == this.zone]<this.bikes>{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;

		//people actions
		Q = B;
		B = move*[False]{this.zone := U(1, 2, 3, 4)}.B + stop*[False].WS;
		WS = ret[zone == this.zone](bikes){this.bikes := this.bikes + bikes}.P;
		P = go*[False].WB;
		WB = get[zone == this.zone](slots){this.slots := this.slots + slots}.B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBikeSharingPrModel(){
		'''
		//our stations
		(G|R,{zone = 1, bikes = 5, slots = 5});
		(G|R,{zone = 2, bikes = 5, slots = 5});
		(G|R,{zone = 3, bikes = 5, slots = 5});
		(G|R,{zone = 4, bikes = 5, slots = 5});

		//our people
		(Q, {zone = 1});
		(Q, {zone = 2});
		(Q, {zone = 3});
		(Q, {zone = 4});

		//shed actions
		G = [bikes > 0] 		get[zone == this.zone]{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;
		R = [slots > bikes] 	ret[zone == this.zone]{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;

		//people actions
		Q = B;
		// notice the change to Pr here - probability:zone number
		B = move*[False]{this.zone := Pr(0.25:1, 0.05:2, 0.40:3, 0.3:4)}.B + stop*[False].WS;
		WS = ret[zone == this.zone].P;
		P = go*[False].WB;
		WB = get[zone == this.zone].B;
		'''.parse.assertNoErrors
	}
	
//	CharSequence output
//	
//	Store intermediateStore
//	Process intermediateProcess
//	
//	Model intermediateModel
//	
//	@Test 
//	def void testVariableExpression1() {
//		'''
//		i = 10;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpression2() {
//		'''
//		i = 10.0;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpression3() {
//		'''
//		i = 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpression4() {
//		'''
//		i = 0.1;
//		P = Q;
//		Q = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpression5() {
//		'''
//		i = 0.1;
//		P = Q;
//		Q = P;
//		(Q,{i});
//		'''.parse.assertNoErrors
//	}
//
//	@Test 
//	def void testVariableExpressionSub1() {
//		'''
//		i = 0.2 - 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionPlu1() {
//		'''
//		i = 0.2 + 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionMul1() {
//		'''
//		i = 0.2 * 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionDiv1() {
//		'''
//		i = 0.2 / 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionOr1() {
//		'''
//		i = true || false;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionAnd1() {
//		'''
//		i = false && false;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionEqu1() {
//		'''
//		i = true != false;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionEqu2() {
//		'''
//		i = true == true;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionCom1() {
//		'''
//		i = 2.0 >= 2.0;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionCom2() {
//		'''
//		i = 2.0 > 1.0;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionCom3() {
//		'''
//		i = 1.0 < 2.0;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionCom4() {
//		'''
//		i = 2.0 >= 2.0;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionNot1() {
//		'''
//		i = !true;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionBoolConstant1() {
//		'''
//		i = true;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionBoolConstant2() {
//		'''
//		i = false;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionRat1() {
//		'''
//		i = 0.2 / 0.1;
//		j = 0.2;
//		k = i + j;
//		P = P;
//		(P,{i});
//	   '''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionExp1() {
//		'''
//		i = (0.2 / 0.1) + 0.4;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testVariableExpressionExp2() {
//		'''
//		i = 0.2 / 0.1;
//		j = 0.2;
//		k = (0.1 + i) + j;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimpleAction1(){
//		'''
//		a = 0.1;
//		b = 0.1;
//		P = c*[$x;]<$y := b;>{a := $z;}.P;
//		(P,{a});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimpleAction2(){
//		'''
//		a = 0.1;
//		b = 0.3;
//		P = c*[$x;](this.a := 0.25;){a := $z;}.P;
//		(P,{a});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimpleAction3(){
//		'''
//		a = 0.1;
//		b = 0.1;
//		P = c[$x;]<$y := 0.1 ;>{a := $z;}.P;
//		(P,{a});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimpleAction4(){
//		'''
//		a = 0.1;
//		b = 0.1;
//		P = c[$x;](a := b;){a := $z;}.P;
//		(P,{a});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimpleAction5(){
//		'''
//		a = 0.1;
//		b = 0.1;
//		P = c[$x;](a := b;){this.a := $z;}.P;
//		(P,{a});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimpleAction6(){
//		'''
//		a = 0.1;
//		b = 0.1;
//		P = c[$x;]<$y := b;>{this.a := $z;}.P;
//		(P,{a});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess1() {
//		'''
//		i = 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess2() {
//		'''
//		i = 0.1;
//		P = nil;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess3() {
//		'''
//		i = 0.1;
//		P = kill;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess4() {
//		'''
//		i = 0.1;
//		P = P + Q;
//		Q = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess5() {
//		'''
//		i = 0.1;
//		P = P | Q;
//		Q = P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess6() {
//		'''
//		i = 0.1;
//		P = [$x;]P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testProcess7() {
//		'''
//		i = 0.1;
//		P = Q;
//		Q = P;
//		R = P + Q;
//		(R,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testUpdates() {
//		'''
//		i = 0.1;
//		P = a{i := U(0.2;);}.P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testUpdates1() {
//		'''
//		i = 0.1;
//		P = a{this.i := U (0.2;);}.P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testUpdates3() {
//		'''
//		i = 0.1;
//		P = a{i := Pr (1:0.2;);}.P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testUpdates4() {
//		'''
//		i = 0.1;
//		P = a{this.i := Pr (0.5:0.2;);}.P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testUpdates5() {
//		'''
//		i = 0.1;
//		P = a{i := 0.2;}.P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test 
//	def void testUpdates6() {
//		'''
//		i = 0.1;
//		P = a{this.i := 0.2;}.P;
//		(P,{i});
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def void testSimple() {
//		assertReprStores("i = 10.0;","10.0")
//	}
//	
//	@Test
//	def void testSimple1() {
//		assertReprStores("i = (10.0);","10.0")
//	}
//	
//	@Test
//	def void testSimple2() {
//		assertReprStores("i = true;","true")
//	}
//	
//	@Test
//	def void testSimple3() {
//		assertReprStores("i = false;","false")
//	}
//	
//	@Test
//	def void testSimple4() {
//		assertReprStores("i = !false;","! false")
//	}
//	
//	@Test
//	def void testSimple5() {
//		assertReprStores("i = !true;","! true")
//	}
//	
//	@Test
//	def void testSimpleOr() {
//		assertReprStores("i = true || false);","(true || false)")
//	}
//	
//	@Test
//	def void testSimpleAnd() {
//		assertReprStores("i = true && false);","(true && false)")
//	}
//	
//	@Test
//	def void testSimpleEquality1() {
//		assertReprStores("i = true == true);","(true == true)")
//	}
//	
//	@Test
//	def void testSimpleEquality2() {
//		assertReprStores("i = true != false);","(true != false)")
//	}
//	
//	@Test
//	def void testSimpleComparison1() {
//		assertReprStores("i = 0.1 < 0.2);","(0.1 < 0.2)")
//	}
//	
//	@Test
//	def void testSimpleComparison2() {
//		assertReprStores("i = 0.2 <= 0.2);","(0.2 <= 0.2)")
//	}
//	
//	@Test
//	def void testSimpleComparison3() {
//		assertReprStores("i = 0.2 > 0.1);","(0.2 > 0.1)")
//	}
//	
//	@Test
//	def void testSimpleComparison4() {
//		assertReprStores("i = 0.2 >= 0.2);","(0.2 >= 0.2)")
//	}
//	
//	@Test
//	def void testSimplePlus() {
//		assertReprStores("i = (10.0 + 1.0);","(10.0 + 1.0)")
//	}
//	
//	@Test
//	def void testSimplePlus1() {
//		assertReprStores("i = 10.0 + 1.0;","(10.0 + 1.0)")
//	}
//	
//	@Test
//	def void testPlus1() {
//		assertReprStores("i = (10.0 + 1.0) + 3.0;","((10.0 + 1.0) + 3.0)")
//	}
//	
//	@Test
//	def void testMix1() {
//		assertReprStores("i = ((10.0+1.0)/2.0)+((3.0+1.0)/2.0);","(((10.0 + 1.0) / 2.0) + ((3.0 + 1.0) / 2.0))")
//	}
//	
//	def assertReprStores(CharSequence input, CharSequence expectation) {
//		
//		intermediateModel = input.parse
//		intermediateStore = intermediateModel.stores.last
//		output = intermediateStore.value.stringRepr
//		//println(output)
//		//println(expectation)
//		Assert::assertEquals(output,expectation)
//		
//	}
//	
//	@Test
//	def void testAssertProcess1() {
//		assertReprProcesses("i = 0.1; P = nil; (P,{i});","nil")
//	}
//	
//	@Test
//	def void testAssertProcess2() {
//		assertReprProcesses("i = 0.1; P = kill; (P,{i});","kill")
//	}
//	
//	@Test
//	def void testAssertProcess3() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;]<$y := 0.1;>{this.a := $z;}.P; (P,{a});",
//		"c[$x;]<$y:=0.1;>{this.a:=$z;}.P")
//	}
//	
//	@Test
//	def void testAssertProcess4() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a:=0.1;){this.a := $z;}.P; (P,{a});",
//		"c[$x;](this.a:=0.1;){this.a:=$z;}.P")
//	}
//	
//	@Test
//	def void testAssertProcess5() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a:=0.1;this.b:=a;){this.a := $z;}.P; (P,{a});",
//		"c[$x;](this.a:=0.1;this.b:=a;){this.a:=$z;}.P")
//	}
//	
//	@Test
//	def void testAssertProcess6() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a:=0.1;this.b:=a;){this.a := $z;b:=$a;}.P; (P,{a});",
//		"c[$x;](this.a:=0.1;this.b:=a;){this.a:=$z;b:=$a;}.P")
//	}
//	
//	@Test
//	def void testAssertProcess7() {
//		assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P + Q (R,{a});","(P + Q)")
//	}
//	
//	@Test
//	def void testAssertProcess8() {
//		assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P | Q (R,{a});","(P | Q)")
//	}
//	
//	@Test
//	def void testAssertProcess9() {
//		assertReprProcesses("a = 0.1; b = 0.1; Q = P; P = Q; R = P | Q + P (R,{a});","(P | (Q + P))")
//	}
//	
//	@Test
//	def void testAssertProcess10() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = [$x]P (R,{a});","[$x;]P")
//	}
//	
//	@Test
//	def void testAssertProcess11() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = Q; R = P; (R,{a});","P")
//	}
//	
//	@Test
//	def void testAssertProcess12() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});",
//		"c[$x;](this.a:=$y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P")
//	}
//	
//	@Test
//	def void testAssertProcess12a() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z+1.0;}.P; (P,{a});",
//		"c[$x;](this.a:=$y;){this.a:=($z + 1.0);}.P")
//	}
//	
//	@Test
//	def void testAssertProcess13() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x + 5 * 2.0 / 0.5 - 2;](this.a := $y;){this.a := $z;}.P; (P,{a});",
//		"c[(($x + (5.0 * (2.0 / 0.5))) - 2.0);](this.a:=$y;){this.a:=$z;}.P")
//	}
//	
//	@Test
//	def void testAssertProcess14() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c[$x;](this.a := $y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});",
//		"c[$x;](this.a:=$y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P")
//	}
//	
//	@Test
//	def void testAssertProcess15() {
//		assertReprProcesses("a = 0.1; b = 0.1; P = c*[$x;](this.a := $y;){this.a := $z + 5 * 2.0 / 0.5 - 2;}.P; (P,{a});",
//		"c*[$x;](this.a:=$y;){this.a:=(($z + (5.0 * (2.0 / 0.5))) - 2.0);}.P")
//	}
//	
//	def assertReprProcesses(CharSequence input, CharSequence expectation) {
//		
//		//println("input:")
//		//println(input)
//		intermediateModel = input.parse
//		intermediateProcess = intermediateModel.processes.last
//		output = intermediateProcess.value.stringRepr
//		//println("output:")
//		//println(output)
//		//println("expectation:")
//		//println(expectation)
//		Assert::assertEquals(output,expectation)
//		
//	}
//	
//	def CharSequence stringRepr(Expression e) {
//		switch (e) {
//			Or: 					'''(«e.left.stringRepr» || «e.right.stringRepr»)'''
//			And: 					'''(«e.left.stringRepr» && «e.right.stringRepr»)'''
//			Equality:   			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
//			Comparison: 			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
//			Sub: 					'''(«e.left.stringRepr» - «e.right.stringRepr»)'''
//			Plu: 					'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
//			Mul:					'''(«e.left.stringRepr» * «e.right.stringRepr»)'''
//			Div: 					'''(«e.left.stringRepr» / «e.right.stringRepr»)'''
//			Not: 					'''! «e.expression.stringRepr»'''
//			ReferencedStore: 		'''(«e.value.name»)'''
//			DoubleConstant: 		'''«e.value»'''
//			BoolConstant: 			'''«e.value»'''
//			}.toString
//	}
//	
//	def CharSequence stringRepr(ActionExpression e) {
//		switch (e) {
//			ActionOr: 					'''(«e.left.stringRepr» || «e.right.stringRepr»)'''
//			ActionAnd: 					'''(«e.left.stringRepr» && «e.right.stringRepr»)'''
//			ActionEquality:   			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
//			ActionComparison: 			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
//			ActionSub: 					'''(«e.left.stringRepr» - «e.right.stringRepr»)'''
//			ActionPlu: 					'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
//			ActionMul:					'''(«e.left.stringRepr» * «e.right.stringRepr»)'''
//			ActionDiv: 					'''(«e.left.stringRepr» / «e.right.stringRepr»)'''
//			ActionNot: 					'''! «e.expression.stringRepr»'''
//			FreeVariable:				'''«e.value»'''
//			SelfReferencedStore: 		'''this.«e.name.name»'''
//			ReferencedStore: 		'''«e.value.name»'''
//			DoubleConstant: 		'''«e.value»'''
//			BoolConstant: 			'''«e.value»'''
//			}.toString
//	}
//	
//	def CharSequence stringRepr(ProcessExpression e) {
//		switch (e) {
//			Parallel:			'''(«e.left.stringRepr» | «e.right.stringRepr»)'''
//			Choice:				'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
//			Leaf:				'''«e.value»'''
//			PredicateProcess:	'''«e.predicate.stringRepr»«e.value.name»'''
//			ActionProcess:		{'''«(e.action as Action).stringRepr».«e.value.name»'''}
//			ProcessReference:	'''«e.value.name»'''
//			}.toString
//	}
//	
//	def CharSequence stringRepr(Action a) {
//		switch(a){
//			Broadcast:	'''«a.name»*«a.predicate.stringRepr»«a.evaluations.stringRepr»«a.updates.stringRepr»'''
//			Unicast:	'''«a.name»«a.predicate.stringRepr»«a.evaluations.stringRepr»«a.updates.stringRepr»'''
//		}.toString
//		
//	}
//	
//	def CharSequence stringRepr(Predicate p){
//		'''[«(p.predicate.expression as ActionExpression).stringRepr»;]'''
//	}
//	
//	def CharSequence stringRepr(Evaluations e){
//		switch(e){
//			In:				'''(«FOR evaluationExpression : e.expressions»«(evaluationExpression as EvaluationExpressionIn).stringRepr»;«ENDFOR»)'''
//			Out:			'''<«FOR evaluationExpression : e.expressions»«(evaluationExpression as FreeEvaluationExpression).stringRepr»;«ENDFOR»>'''	
//		}
//	}
//	
//	def CharSequence stringRepr(EvaluationExpressionIn e){
//		switch(e){
//			LocalEvaluationExpression:			'''this.«(e.name as SelfReferencedStore).name.name»:=«(e.expression as ActionExpression).stringRepr»'''
//			GlobalEvaluationExpression:			'''«(e.name as Store).value.stringRepr»:=«(e.expression as ActionExpression).stringRepr»'''	
//		}
//	}
//	
//	
//	def CharSequence stringRepr(FreeEvaluationExpression e){
//		'''«e.name»:=«(e.expression as ActionExpression).stringRepr»'''
//	}
//	
//	def CharSequence stringRepr(Updates u){
//			'''{«FOR updateExpression : u.updates»«updateExpression.stringRepr»«ENDFOR»}'''
//				
//	}
//	
//	def CharSequence stringRepr(UpdateExpression u){
//		switch(u){
//			LocalUpdateExpression: 	'''this.«u.name.name.name»:=«u.expression.stringRepr»;''' 
//			GlobalUpdateExpression:		'''«u.name.name»:=«u.expression.stringRepr»;'''
//		}
//	}
	
}