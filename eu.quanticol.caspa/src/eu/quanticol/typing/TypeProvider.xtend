package eu.quanticol.typing

import eu.quanticol.cASPA.Constant
import eu.quanticol.cASPA.ReferencedStore
import eu.quanticol.cASPA.SelfReferencedStore
import eu.quanticol.cASPA.PredicateExpression
import eu.quanticol.cASPA.PredicateOr
import eu.quanticol.cASPA.PredicateAnd
import eu.quanticol.cASPA.PredicateEquality
import eu.quanticol.cASPA.PredicateComparison
import eu.quanticol.cASPA.PredicateSub
import eu.quanticol.cASPA.PredicatePlu
import eu.quanticol.cASPA.PredicateMul
import eu.quanticol.cASPA.PredicateDiv
import eu.quanticol.cASPA.PredicateNot
import eu.quanticol.cASPA.Predicate
import eu.quanticol.cASPA.BooleanConstant
import eu.quanticol.cASPA.UpdateExpression
import eu.quanticol.cASPA.UpdateSub
import eu.quanticol.cASPA.UpdatePlu
import eu.quanticol.cASPA.UpdateMul
import eu.quanticol.cASPA.UpdateDiv
import eu.quanticol.cASPA.Arguments
import eu.quanticol.cASPA.StoreExpression
import eu.quanticol.cASPA.Store
import eu.quanticol.cASPA.LocalSingleEventUpdate

class TypeProvider {
	
	//Type
	public static val doubleConstantType = new DoubleConstantType
	public static val boolConstantType = new BoolConstantType
	public static val constantType = new ConstantType
	
	def dispatch BaseType typeFor(BooleanConstant b) {
		boolConstantType
	}
	
	def dispatch BaseType typeFor(Constant c){
		constantType
	}

	def dispatch BaseType typeFor(PredicateExpression e){
		switch(e){
			PredicateOr: 			boolConstantType
			PredicateAnd: 			boolConstantType
			PredicateEquality: 		boolConstantType
			PredicateComparison:	boolConstantType
			PredicateSub:			constantType
			PredicatePlu:			constantType
			PredicateMul:			constantType
			PredicateDiv:			constantType
			PredicateNot:			boolConstantType
			Constant:				constantType
			Store:					(e as StoreExpression)?.typeFor
			ReferencedStore:		(e as StoreExpression)?.typeFor
			SelfReferencedStore:	(e as StoreExpression)?.typeFor
		}
	}
	
	
	def dispatch BaseType typeFor(Predicate predicate){
		return boolConstantType
	}
	
	def BaseType typeFor(StoreExpression s){
		switch(s){
			Store:					constantType
			SelfReferencedStore:	constantType
			ReferencedStore:		constantType
		}
	}
	
	def dispatch BaseType typeFor(UpdateExpression e){
		switch(e){
			UpdateSub:			constantType
			UpdatePlu:			constantType
			UpdateMul:			constantType
			UpdateDiv:			constantType
			Store:					(e as StoreExpression)?.typeFor
			ReferencedStore:		(e as StoreExpression)?.typeFor
			SelfReferencedStore:	(e as StoreExpression)?.typeFor
		}
	}
	
	def dispatch BaseType typeFor(LocalSingleEventUpdate u){
		return constantType
	}
	
	
}