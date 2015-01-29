package eu.quanticol.typing

import eu.quanticol.cASPA.Bool
import eu.quanticol.cASPA.BooleanConstant
import eu.quanticol.cASPA.Constant
import eu.quanticol.cASPA.DistributionReference
import eu.quanticol.cASPA.FreeVariable
import eu.quanticol.cASPA.LocalSingleEventUpdate
import eu.quanticol.cASPA.OutStoreReference
import eu.quanticol.cASPA.Predicate
import eu.quanticol.cASPA.PredicateAnd
import eu.quanticol.cASPA.PredicateComparison
import eu.quanticol.cASPA.PredicateDiv
import eu.quanticol.cASPA.PredicateEquality
import eu.quanticol.cASPA.PredicateExpression
import eu.quanticol.cASPA.PredicateMul
import eu.quanticol.cASPA.PredicateNot
import eu.quanticol.cASPA.PredicateOr
import eu.quanticol.cASPA.PredicatePlu
import eu.quanticol.cASPA.PredicateStoreReference
import eu.quanticol.cASPA.PredicateSub
import eu.quanticol.cASPA.Reference
import eu.quanticol.cASPA.SelfReference
import eu.quanticol.cASPA.Store
import eu.quanticol.cASPA.StoreExpression
import eu.quanticol.cASPA.UniformReference
import eu.quanticol.cASPA.UpdateDiv
import eu.quanticol.cASPA.UpdateExpression
import eu.quanticol.cASPA.UpdateExpressionStoreReference
import eu.quanticol.cASPA.UpdateMul
import eu.quanticol.cASPA.UpdatePlu
import eu.quanticol.cASPA.UpdateSub

class TypeProvider {
	
	//Type
	public static val doubleConstantType = new DoubleConstantType
	public static val boolConstantType = new BoolConstantType
	public static val constantType = new ConstantType
	
	def dispatch BaseType typeFor(BooleanConstant b) {
		boolConstantType
	}
	
	def dispatch BaseType typeFor(Bool b) {
		boolConstantType
	}
	
	def dispatch BaseType typeFor(Constant c){
		constantType
	}
	
	def dispatch BaseType typeFor(Reference c){
		constantType
	}
	
	def dispatch BaseType typeFor(SelfReference c){
		constantType
	}
	
	def dispatch BaseType typeFor(FreeVariable c){
		constantType
	}

	def dispatch BaseType typeFor(PredicateExpression e){
		switch(e){
			PredicateOr: 					boolConstantType
			PredicateAnd: 					boolConstantType
			PredicateEquality: 				boolConstantType
			PredicateComparison:			boolConstantType
			PredicateSub:					constantType
			PredicatePlu:					constantType
			PredicateMul:					constantType
			PredicateDiv:					constantType
			PredicateNot:					boolConstantType
			Constant:						constantType
			Store:							(e as StoreExpression)?.typeFor
			FreeVariable:					(e as StoreExpression)?.typeFor
			Reference:						(e as StoreExpression)?.typeFor
			SelfReference:					(e as StoreExpression)?.typeFor
			PredicateStoreReference:		(e as StoreExpression)?.typeFor
			OutStoreReference:				(e as StoreExpression)?.typeFor
			UpdateExpressionStoreReference: (e as StoreExpression)?.typeFor
			DistributionReference: 			(e as StoreExpression)?.typeFor
			UniformReference: 				(e as StoreExpression)?.typeFor
		}
	}
	
	
	def dispatch BaseType typeFor(Predicate predicate){
		return boolConstantType
	}
	
	def dispatch BaseType typeFor(StoreExpression s){
		switch(s){
			Store:							constantType
			SelfReference:					constantType
			Reference:						constantType
			FreeVariable:					constantType
			PredicateStoreReference:		constantType
			OutStoreReference:				constantType
			UpdateExpressionStoreReference: constantType
			DistributionReference: 			constantType
			UniformReference: 				constantType
		}
	}
	
	def dispatch BaseType typeFor(UpdateExpression e){
		switch(e){
			UpdateSub:			constantType
			UpdatePlu:			constantType
			UpdateMul:			constantType
			UpdateDiv:			constantType
			Store:							(e as StoreExpression)?.typeFor
			FreeVariable:					(e as StoreExpression)?.typeFor
			Reference:						(e as StoreExpression)?.typeFor
			SelfReference:					(e as StoreExpression)?.typeFor
			PredicateStoreReference:		(e as StoreExpression)?.typeFor
			OutStoreReference:				(e as StoreExpression)?.typeFor
			UpdateExpressionStoreReference: (e as StoreExpression)?.typeFor
			DistributionReference: 			(e as StoreExpression)?.typeFor
			UniformReference: 				(e as StoreExpression)?.typeFor
		}
	}
	
	def dispatch BaseType typeFor(LocalSingleEventUpdate u){
		return constantType
	}
	
	
}