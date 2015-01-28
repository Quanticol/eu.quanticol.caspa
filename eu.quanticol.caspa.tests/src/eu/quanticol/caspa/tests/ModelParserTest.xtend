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
	def void testSimple(){
		'''
		(P,{a:=1});
		P=P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimple2(){
		'''
		(P,{a:=1,b:=1});
		P=P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimple3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P=P;
		Q=Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleReference(){
		'''
		(P,{a:=1});
		P=Q;
		Q=P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePar(){
		'''
		(P,{a:=1});
		P = A | B;
		A = A;
		B = B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleCho(){
		'''
		(P,{a:=1});
		P = A + B;
		A = A;
		B = B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleNil(){
		'''
		(P,{a:=1});
		P = nil;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleKill(){
		'''
		(P,{a:=1});
		P = kill;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePredTrue(){
		'''
		(P,{a:=1});
		P = [True]P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePredFalse(){
		'''
		(P,{a:=1});
		P = [False]P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniOut(){
		'''
		(P,{a:=1});
		P = a[True]<1>.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniIn(){
		'''
		(P,{a:=1});
		P = a[False]().P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroOut(){
		'''
		(P,{a:=1});
		P = a*[True]<1>.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroIn(){
		'''
		(P,{a:=1});
		P = a*[False]().P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniOutU(){
		'''
		(P,{a:=1});
		P = a[True]<1>{this.a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniInU(){
		'''
		(P,{a:=1});
		P = a[False](){this.a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroOutU(){
		'''
		(P,{a:=1});
		P = a*[True]<1>{this.a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroInU(){
		'''
		(P,{a:=1});
		P = a*[False](){this.a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleReference2(){
		'''
		(P,{a:=1, b:=1});
		P=Q;
		Q=P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePar2(){
		'''
		(P,{a:=1, b:=1});
		P = A | B;
		A = A;
		B = B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleCho2(){
		'''
		(P,{a:=1, b:=1});
		P = A + B;
		A = A;
		B = B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleNil2(){
		'''
		(P,{a:=1, b:=1});
		P = nil;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleKill2(){
		'''
		(P,{a:=1, b:=1});
		P = kill;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePredTrue2(){
		'''
		(P,{a:=1, b:=1});
		P = [True]P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePredFalse2(){
		'''
		(P,{a:=1, b:=1});
		P = [False]P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniOut2(){
		'''
		(P,{a:=1, b:=1});
		P = a[True]<1>.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniIn2(){
		'''
		(P,{a:=1, b:=1});
		P = a[False]().P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroOut2(){
		'''
		(P,{a:=1, b:=1});
		P = a*[True]<1>.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroIn2(){
		'''
		(P,{a:=1, b:=1});
		P = a*[False]().P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniOutU2(){
		'''
		(P,{a:=1, b:=1});
		P = a[True]<1>{this.a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniInU2(){
		'''
		(P,{a:=1, b:=1});
		P = a[False](){this.a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroOutU2(){
		'''
		(P,{a:=1, b:=1});
		P = a*[True]<1>{a := 1}.P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroInU2(){
		'''
		(P,{a:=1, b:=1});
		P = a*[False](){a := 1}.P;
		'''.parse.assertNoErrors
	}
	
@Test
	def void testSimpleReference3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P=Q;
		Q=P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePar3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = A | B;
		A = A;
		B = B;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleCho3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = A + B;
		A = A;
		B = B;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleNil3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = nil;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleKill3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = kill;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePredTrue3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = [True]P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimplePredFalse3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = [False]P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniOut3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a[True]<1>.P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniIn3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a[False]().P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroOut3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a*[True]<1>.P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroIn3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a*[False]().P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniOutU3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a[True]<1>{a := 1}.P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionUniInU3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a[False](){a := 1}.P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroOutU3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a*[True]<1>{a := 1}.P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleActionBroInU3(){
		'''
		(P,{a:=1,b:=1});
		(Q,{a:=1,b:=1});
		P = a*[False](){a := 1}.P;
		Q = Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBikeSharingModel(){
		'''
		//bike stations
		(Shed,{zone := 1, bikes := 5, slots := 5});
		(Shed,{zone := 2, bikes := 5, slots := 5});
		(Shed,{zone := 3, bikes := 5, slots := 5});
		(Shed,{zone := 4, bikes := 5, slots := 5});
		
		//our people
		(Q, {zone := 1});
		(Q, {zone := 2});
		(Q, {zone := 3});
		(Q, {zone := 4});
		
		//shed actions
		Shed = G|R;
		G = [bikes > 0] 		get[zone == this.zone]<>{bikes := this.bikes - 1; slots := this.slots + 1}.G;
		R = [slots > bikes] 	ret[zone == this.zone]<>{bikes := this.bikes + 1; slots := this.slots - 1}.R;
		
		//people actions
		Q = B;
		//Uniform distribution "U"
		B = move*[False]<>{this.zone := U(1, 2, 3, 4)}.B + stop*[False]<>.WS;
		WS = ret[zone == this.zone]().P;
		P = go*[False]<>.WB;
		WB = get[zone == this.zone]().B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBikeSharingArgsModel(){
		'''
		//Now the pedestrians are interested in the total number of bikes and slots that they have seen
		
		//bike stations
		(Shed,{zone := 1, bikes := 5, slots := 5});
		(Shed,{zone := 2, bikes := 5, slots := 5});
		(Shed,{zone := 3, bikes := 5, slots := 5});
		(Shed,{zone := 4, bikes := 5, slots := 5});
		
		//our people
		(Q, {zone := 1, slots := 0, bikes := 0});
		(Q, {zone := 2, slots := 0, bikes := 0});
		(Q, {zone := 3, slots := 0, bikes := 0});
		(Q, {zone := 4, slots := 0, bikes := 0});
		
		//shed actions
		Shed = G|R;
		G = [bikes > 0] 		get[zone == this.zone]<this.slots>{bikes := bikes - 1; slots := slots + 1}.G;
		R = [slots > bikes] 	ret[zone == this.zone]<this.bikes>{bikes := bikes + 1; slots := slots - 1}.R;
		
		//people actions
		Q = B;
		B = move*[False]<>{this.zone := U(1, 2, 3, 4)}.B + stop*[False]<>.WS;
		WS = ret[zone == this.zone](b){this.bikes := this.bikes + b}.P;
		P = go*[False]<>.WB;
		WB = get[zone == this.zone](s){this.slots := this.slots + s}.B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBikeSharingPrModel(){
		'''
		//bike stations
		(Shed,{zone := 1, bikes := 5, slots := 5});
		(Shed,{zone := 2, bikes := 5, slots := 5});
		(Shed,{zone := 3, bikes := 5, slots := 5});
		(Shed,{zone := 4, bikes := 5, slots := 5});
		
		//our people
		(Q, {zone := 1});
		(Q, {zone := 2});
		(Q, {zone := 3});
		(Q, {zone := 4});
		
		//shed actions
		Shed = G|R;
		G = [bikes > 0] 		get[zone == this.zone]<>{this.bikes := this.bikes - 1; this.slots := this.slots + 1}.G;
		R = [slots > bikes] 	ret[zone == this.zone]<>{this.bikes := this.bikes + 1; this.slots := this.slots - 1}.R;
		
		//people actions
		Q = B;
		// notice the change to Pr here - probability:zone number
		B = move*[False]<>{this.zone := Pr(0.25:1, 0.05:2, 0.40:3, 0.3:4)}.B + stop*[False]<>.WS;
		WS = ret[zone == this.zone]().P;
		P = go*[False]<>.WB;
		WB = get[zone == this.zone]().B;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testProcessActions(){
		'''
		/*
		 * Process - Actions (CDW 27.01.15)
		 * Some examples
		 */
		 
		//(@CDW VALIDATIONCHECK:Matching arguments 	27.01.15)

		/*
		 * (CDW 27.01.15)
		 * Actions are built up of:
		 * Part					Defined-by					Type				Optional/Compulsory
		 * ----------------------------------------------------------------------------------------
		 * Name 				lower case char				String				Compulsory							
		 * Predicate 			square brackets				Logical				Compulsory
		 * In/Out Arguments 	angled/round brackets		Value				Optional
		 * Update 				curly brackets				Assignment			Compulsory
		 * ProcessReference		"."							ProcessReference	Compulsory
		 */

		/*
		 * Compulsory In/Out Arguments (CDW 27.01.15)
		 * 
		 * The environment must facilitate the communication between action pairs if there is no
		 * distinct in/out coupling.
		 * 
		 * P = a{this.x := this.x + 1}.P
		 * Q = a{this.x := this.x + 1}.Q
		 * 
		 * In the above, who is the sender, and who is the receiver?
		 * 
		 * OR
		 * 
		 * Compulsory In/Out?
		 * 
		 * P = a<1>{this.x := this.x + 1}.P
		 * Q = a(1){this.x := this.x + 1}.Q
		 * 
		 */
		
		/*
		 * Compulsory Predicate? (CDW 27.01.15)
		 * 
		 * Not certain I understand the meaning of a[False]<>{}
		 * 
		 * Predicates might well need to be compulsory as well.
		 * 
		 */
		 /*
		  * OPTIONAL Updates? (CDW 27.01.15)
		  * 
		  * I am fairly certain that updates can be options, certainly for outgoing actions.
		  * 
		  */
		
		(P,{a:=1,b:=1});
		(Q,{c:=1,d:=1});
		
		//unicast
		P = msg[True]<this.a>{this.a := this.a + 1}.R;
		Q = msg[True](a){this.c := this.c + a}.S;
		
		//broadcast
		R = msg*[True]<this.a>{this.a := this.a + 1}.T;
		S = msg*[True](a){this.c := this.c + a}.W;
		 
		//can miss out updates:
		T = msg1[True]<this.a>.P;
		W = msg1[True]().Q;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testProcessLeaf(){
		'''
		/*
		 * Process - nil/kill - the leaves (CDW 27.01.15)
		 */
		 
		 (P,{a:=1}); //should both parse, but fail validation
		 (Q,{a:=1}); //(@CDW VALIDATIONCHECK:These are invalid Process for Term 	27.01.15)
		 
		 P = nil;	//OK, but how to check for this? - what if the ProcessExpression is more complex.
		 Q = kill;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testProcessPredicate(){
		'''
		/*
		 * Process - Predicate (CDW 27.01.15)
		 * Some example expressions
		 */
		 
		 
		(P,{a:=1,b:=1});
		(Z,{c:=1});
		 
		//Demonstration of Predicate expressions - not real examples
		 
		//atomic
		P = [True]Q + [False]Q;
		 
		//values and comparison
		Q = [this.a > 0]R 
		 + [this.a < 0]R 
		 + [this.a <= 0]R 
		 + [this.a >= 0]R 
		 + [this.a == 0]R 
		 + [this.a != 0]R;
		 
		//arithmetic used inside logical expression
		R = [this.a > (c * 1)]S;
		 
		//demonstration of different logical operators
		S = [False || True]T 
		 + [True && False]T 
		 + [!False]T 
		 + [!(True || False) && (!False && True)]T;
		 
		//demonstration of arithmetic and comparison operators
		T = [(this.a + this.b) >= 2]W 
		 + [(this.a - this.b) <= 2]W 
		 + [(this.a / this.b) < 2]W 
		 + [(this.a * this.b) > 2]W
		 + [(this.a * this.b) == 2]W
		 + [(this.a * this.b) != 2]W;
		
		//demonstration using global reference
		W = [(this.a - this.b) == c]P;
		 
		Z = Z;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testTermStore(){
		'''
		/*
		 * Stores (CDW 27.01.15)
		 * ATTR : VALUE (VALUE is Natural type)
		 * These should parse, but there are validation checks to be made
		 */
		 
		(P,{a:=1}); 		// (@CDW VALIDATIONCHECK:Does the store ever get used? 	27.01.15)
		(P,{a:=1}); 		// (@CDW VALIDATIONCHECK:This is a TERM repetition. 	27.01.15)
		(P,{a:=1,a:=1}); 	// (@CDW VALIDATIONCHECK:This is a STORE repetition. 	27.01.15)
		(P,{a:=1,b:=1});
		(P,{b:=1,a:=1});		// (@CDW VALIDATIONCHECK:This is a TERM repetition. 	27.01.15)
		 
		P=P;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testTermProcess(){
		'''
		/*
		 * A Discussion of the expressions of Process in Terms (CDW 27.01.15).
		 * 
		 * In main3.pdf (CASPA: a Collective Adaptive Stochastic Process Algebra)
		 * we see the use of (G|R, {zone = l, bikes = i, slots = j}). Ignore the stores as this is a discussion of
		 * Processes. The Process is two Processes running in parallel "|". If we allow for "|" in a Term definition, 
		 * then we should allow for full expressiveness in Terms (no?). I don't believe this to be sensible, Terms 
		 * could become polluted with Process expressions, and may confuse the user. Instead I think a singular Process
		 * reference should be used in the Term, as shown below.  
		 */
		
		//parallel processes
		(P, {a:=1});
		(A, {a:=1});	
		(B, {a:=1});
		(C, {a:=1});
		//parallel and choice
		(D, {a:=1});
		//parallel, choice and predicate
		(E, {a:=1});
		//nil - a pointless expression? - this will need to be checked for at parsing (@CDW VALIDATIONCHECK 27.01.15)
		(F, {a:=1});
		//kill - also pointless? - this will also need to be checked for at parsing (@CDW VALIDATIONCHECK 27.01.15)
		(G, {a:=1});
		//Action - for a later discussion. (CDW 27.01.15)
		(H, {a:=1});
		
		//simplistic processes
		P = P;
		Q = Q;
		R = R;
		S = S;
		
		//Parallel
		A = P|Q;
		B = P|Q|R;
		C = P|Q|R|S;
		
		//Choice
		D = A + R;
		
		//Predicate
		E = A + [True]D;
		
		//nil
		F = nil;
		
		//kill
		G = kill;
		
		//Action
		H = a[True]<1>.H;
		
		//UNUSED
		I = I;	//(@CDW VALIDATIONCHECK 27.01.15 - this goes unused, need a check for this?)
		'''.parse.assertNoErrors
	}
	
}