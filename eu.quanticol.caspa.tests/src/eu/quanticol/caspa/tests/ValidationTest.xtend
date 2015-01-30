package eu.quanticol.caspa.tests
//
import com.google.inject.Inject
import eu.quanticol.CASPAInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import eu.quanticol.cASPA.CASPAPackage
import eu.quanticol.validation.CASPAValidator
import eu.quanticol.cASPA.Model

//
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CASPAInjectorProvider))
class ValidationTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testFreeVariableNotUniqueFromStore(){
		'''
		(Q,{a:=1});
		Q = P;
		P = action1[True](a).P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.in,
			CASPAValidator::FREE_VARIABLES_UNIQUE,
			"Free variable names cannot be the same as local store names.")
	}
	
	@Test
	def void testSelfReferencePredicate(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[this.c < 1]().Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.predicateStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferencePredicate(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[c < 1]().Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.predicateStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testSelfReferenceOut(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<this.c>.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.outStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferenceOut(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<this.c>.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.outStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testSelfReferenceUpdate(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{this.c := 1}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferenceUpdate(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{c := 1}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testSelfReferenceUpdateExpressionOut(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{a := this.c}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpressionStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferenceUpdateUpdateExpressionOut(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{a := c}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpressionStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testSelfReferenceUpdateExpressionIn(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True](){a := this.c}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpressionStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferenceUpdateUpdateExpressionIn(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True](){a := c}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpressionStoreReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store or free variable.")
	}
	
	@Test
	def void testSelfReferenceDistribution(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{a := U(this.c)}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.uniformReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferenceUpdateDistribution(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{a := U(c)}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.uniformReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store or free variable.")
	}
	
	@Test
	def void testSelfReferencePr(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{a := Pr(0.5:this.c)}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.distributionReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store.")
	}
	
	@Test
	def void testReferenceUpdatePr(){
		'''
		(Q,{a:=1});
		Q = R;
		R = action[True]<>{a := Pr(0.5:c)}.Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.distributionReference,
			CASPAValidator::REFERENCE_HAS_NO_REFERENCE,
			"Reference 'c' does not refer to a declared store or free variable.")
	}
	
	@Test
	def void testNoDuplicateStoresInTerms(){
		'''
		(P,{a:=1,a:=1});
		P=P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.store,
			CASPAValidator::NO_DUPLICATE_STORES_IN_TERMS,
			"Store names cannot be repeated in Terms.")
	}
	
	@Test
	def void requireUniqueTerms1(){
		'''
		(P,{a:=1});
		(P,{a:=1});
		P=P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.term,
			CASPAValidator::REQUIRE_UNIQUE_TERMS,
			"Terms must be unique.")
	}
	
	@Test
	def void requireUniqueTerms2(){
		'''
		(P,{a:=1,b:=1});
		(P,{b:=1,a:=1});
		P=P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.term,
			CASPAValidator::REQUIRE_UNIQUE_TERMS,
			"Terms must be unique.")
		
	}
	
	
	@Test
	def void storeNeverUsed(){
		'''
		(P,{a:=1});
		P=P;
		'''.parse.assertWarning(CASPAPackage::eINSTANCE.store,
			CASPAValidator::STORE_NEVER_USED,
			"Store never used locally.")
		
	}
	
	@Test
	def void actionPartner(){
		'''
		(P,{a:=1});
		P = a[a == 1]<>.P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.action,
			CASPAValidator::NO_ACTION_PARTNER,
			"No receiving or sending partner action.")
		
	}
	
	@Test
	def void actionMatchingArgs(){
		'''
		(P,{a:=1});
		(Q,{a:=1});
		P = a[a == 1]<a, 1>.P;
		Q = a[a == 1](b).Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.action,
			CASPAValidator::ARGUMENTS_MATCH,
			"No partner action with matching number of arguments.")
		
	}
	
	@Test
	def void actionMatchingArgs1(){
		'''
		(P,{a:=1});
		(Q,{a:=1});
		P = a[a == 1]<1>.P;
		Q = a[a == 1]().Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.action,
			CASPAValidator::ARGUMENTS_MATCH,
			"No partner action with matching number of arguments.")
		
	}
	
	@Test
	def void actionMatchingArgs2(){
		'''
		(P,{a:=1});
		(Q,{a:=1});
		P = a[a == 1]<>.P;
		Q = a[a == 1](c).Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.action,
			CASPAValidator::ARGUMENTS_MATCH,
			"No partner action with matching number of arguments.")
		
	}
	
	@Test
	def void processesUsed(){
		'''
		(P,{a:=1});
		P = [True]P;
		Q = [True]Q;
		'''.parse.assertWarning(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESS_NEVER_USED,
			"Process 'Q' is never used.")
		
	}
	
	@Test
	def void allReferencedProcesses(){
		'''
		(P,{a:=1});
		P = [a > 0]Q;
		Q = Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESSEXPRESSION_NOT_JUST_REFERENCES,
			"Process 'Q' has looping process references: Expression 'Q'.")
		
	}
	
	@Test
	def void allReferencedProcesses2(){
		'''
		(P,{a:=1,b:=1});
		P=Q;
		Q=P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESSEXPRESSION_NOT_JUST_REFERENCES,
			"Process 'P' has looping process references: Expression 'Q'.")
		
	}
	
	@Test
	def void allReferencedProcesses3(){
		'''
		(A,{a:=1,b:=1});
		A = P + Q;
		P = C + D;
		Q = [True]Q;
		C = [True]C;
		D = P;
		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESSEXPRESSION_NOT_JUST_REFERENCES,
			"Process 'A' has looping process references: Expression 'P + Q'")
		
	}
	
	
	@Test
	def void allReferencedProcesses4(){
		'''
		(A,{a:=1,b:=1});
		A = P | Q;
		P = P | Q;
		Q = P | Q;
		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESSEXPRESSION_NOT_JUST_REFERENCES,
			"Process 'A' has looping process references: Expression 'P | Q'.")
		
	}
	
	@Test
	def void allReferencedProcesses5(){
		'''
		(P,{a:=1, b:=1});
		P = A + B;
		A = A;
		B = B;
		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESSEXPRESSION_NOT_JUST_REFERENCES,
			"Process 'P' has looping process references: Expression 'A + B'.")
	}
	
	@Test
	def void testNil(){
		'''
		(P,{a:=1});
		P = nil;
		'''.parse.assertWarning(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESS_IS_NIL_KILL,
			"Process 'P' is only 'nil'.")
	}
	
	@Test
	def void testKill(){
		'''
		(P,{a:=1});
		P = kill;
		'''.parse.assertWarning(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESS_IS_NIL_KILL,
			"Process 'P' is only 'kill'.")
	}
	
//	
//	@Test
//	def void testStoreIsConstant(){
//		'''
//		i = 05;
//		P = [True;]P;
//		(P,{i});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.predicateExpression,
//			CASPAValidator::WRONG_TYPE,
//			"Must be boolean")
//	}
//	
//	
//	@Test
//	def void testCheckNotSelfReferencing(){
//		'''
//		i = i;
//		P = P;
//		(P,{i});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.referencedStore,
//			CASPAValidator::SELF_REFERENCING_STORE,
//			"Cannot have self referencing stores. 'i' is seen in the expression"
//		)
//	}
//	
//	@Test
//	def void testCheckStoresNamesUnique(){
//		'''
//		i = 10;
//		i = 0.1;
//		P = P;
//		(P,{i});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.store,
//			CASPAValidator::STORE_NAMES_UNIQUE,
//			"Must have unique store names. 'i' is repeated"
//		)
//	}
//	
//	@Test
//	def void testCheckProcessNamesUnique(){
//		'''
//		i = 10;
//		P = P;
//		P = P;
//		(P,{i});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
//			CASPAValidator::PROCESS_NAMES_UNIQUE,
//			"Must have unique process names. 'P' is repeated"
//		)
//	}
//	
//	@Test
//	def void testReferencing(){
//		'''
//		a = 1.0;
//		b = !a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.not,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testActionReference(){
//		'''
//		a = 1.0;
//		b = 3.0;
//		P = c[$x;](this.b := $y;){this.b := !a;}.P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionNot,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testOr(){
//		'''
//		a = 1.0;
//		b = true || a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.or,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testActionOr(){
//		'''
//		a = 1.0;
//		b = true;
//		P = c[$x == (a || b);]($y;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionOr,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testAnd(){
//		'''
//		a = 1.0;
//		b = true && a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.and,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testActionAnd(){
//		'''
//		a = 1.0;
//		b = true;
//		P = c[(a && b);]($y;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionAnd,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	def void testEq(){
//		'''
//		a = 1.0;
//		b = true == a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.equality,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testActionEq(){
//		'''
//		a = 1.0;
//		b = true;
//		P = c[$x == a;]($y;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionEquality,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	def void testEq1(){
//		'''
//		a = 1.0;
//		b = true != a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.equality,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	@Test
//	def void testActionEq1(){
//		'''
//		a = 1.0;
//		b = true;
//		P = c[$x != a;]($y;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionEquality,
//			CASPAValidator::WRONG_TYPE,
//			"Expected boolean type, but was double"
//		)
//	}
//	
//	
//	def void testCom1(){
//		'''
//		a = 1.0;
//		b = true < a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.comparison,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testActionCom1(){
//		'''
//		a = true;
//		b = true;
//		P = c[$x < a;]($y;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionComparison,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	def void testSub1(){
//		'''
//		a = 1.0;
//		b = true - a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.sub,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testActionSub1(){
//		'''
//		a = true;
//		b = true;
//		P = c(this.b := $y - a;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionSub,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	def void testPlu1(){
//		'''
//		a = 1.0;
//		b = true - a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.plu,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testActionPlu1(){
//		'''
//		a = true;
//		b = true;
//		P = c(this.b := $y + a;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionPlu,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testMul1(){
//		'''
//		a = 1.0;
//		b = true * a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.mul,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testActionMul1(){
//		'''
//		a = true;
//		b = true;
//		P = c(this.b := $y * a;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionMul,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testDiv1(){
//		'''
//		a = 1.0;
//		b = true / a;
//		P = nil;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.div,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testActionDiv1(){
//		'''
//		a = true;
//		b = true;
//		P = c(this.b := $y / a;).P;
//		(P,{b});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.actionDiv,
//			CASPAValidator::WRONG_TYPE,
//			"Expected double type, but was boolean"
//		)
//	}
//	
//	@Test
//	def void testUpdateExpression1(){
//		'''
//		z = 0.2;
//		P = c{this.z := boolean;}.P;
//		(P,{z});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpression,
//			CASPAValidator::WRONG_TYPE,
//			"assignment has non matching type to reference"
//		)
//	}
//	
//	@Test
//	def void testUpdateExpression2(){
//		'''
//		z = 0.2;
//		P = c{z := boolean;}.P;
//		(P,{z});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpression,
//			CASPAValidator::WRONG_TYPE,
//			"assignment has non matching type to reference"
//		)
//	}
//	
//	@Test
//	def void testPredicateExpression1(){
//		'''
//		z = 0.2;
//		P = c[1.0].P;
//		(P,{z});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.predicateExpression,
//			CASPAValidator::WRONG_TYPE,
//			"Predicates must be boolean"
//		)
//	}	
//	
//	@Test
//	def void testLocalEvalIn(){
//		'''
//		z = 0.2;
//		P = c(this.z := false).P;
//		(P,{z});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.evaluationExpressionIn,
//			CASPAValidator::WRONG_TYPE,
//			"bad assignment, check types and references"
//		)
//	}
//	
//	@Test
//	def void testGlobalEvalIn(){
//		'''
//		z = 0.2;
//		P = c(this.z := false).P;
//		(P,{z});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.evaluationExpressionIn,
//			CASPAValidator::WRONG_TYPE,
//			"bad assignment, check types and references"
//		)
//	}
//	
//	@Test
//	def void testFreeEvalOut(){
//		'''
//		z = 0.2;
//		P = c<$z := Pello;>.P;
//		(P,{z});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.freeEvaluationExpression,
//			CASPAValidator::WRONG_TYPE,
//			"bad assignment, check types and references"
//		)
//	}
	
//	@Test
//	def void testFreeEvalIn(){
//		'''
//		a = 0.1;
//		P = c(this.a := $y;).P;
//		(P,{a});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.evaluationExpressionIn,
//			CASPAValidator::WRONG_TYPE,
//			"bad assignment, check types and references"
//		)
//	}
//	
//	
}