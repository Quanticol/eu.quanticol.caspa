package eu.quanticol.typing

import static extension eu.quanticol.typing.ModelUtil.*
import eu.quanticol.cASPA.Expression
import eu.quanticol.cASPA.DoubleConstant
import eu.quanticol.cASPA.BoolConstant
import eu.quanticol.cASPA.ActionOr
import eu.quanticol.cASPA.And
import eu.quanticol.cASPA.ActionAnd
import eu.quanticol.cASPA.Equality
import eu.quanticol.cASPA.ActionEquality
import eu.quanticol.cASPA.Comparison
import eu.quanticol.cASPA.ActionComparison
import eu.quanticol.cASPA.Sub
import eu.quanticol.cASPA.ActionSub
import eu.quanticol.cASPA.Plu
import eu.quanticol.cASPA.ActionPlu
import eu.quanticol.cASPA.Mul
import eu.quanticol.cASPA.ActionMul
import eu.quanticol.cASPA.Div
import eu.quanticol.cASPA.ActionDiv
import eu.quanticol.cASPA.Not
import eu.quanticol.cASPA.ActionNot
import eu.quanticol.cASPA.ReferencedStore
import eu.quanticol.cASPA.FreeVariable
import eu.quanticol.cASPA.Or
import eu.quanticol.cASPA.SelfReferencedStore
import eu.quanticol.cASPA.Store

class ETypeProvider {
	
	//ExpressionType
	public static val doubleConstantType = new DoubleConstantType
	public static val freeVariableType = new FreeVariableType
	public static val boolConstantType = new BoolConstantType
	public static val referencedStoreType = new ReferencedStoreType
	public static val selfReferencedStoreType = new SelfReferencedStoreType
	
	
		def dispatch ExpressionsType typeFor(Expression e) {
			switch (e) {
				DoubleConstant: 		doubleConstantType
				BoolConstant: 			boolConstantType	
			}
		}
		
		def dispatch ExpressionsType typeFor(Or e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionOr e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(And e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionAnd e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Equality e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType))
				return boolConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionEquality e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == boolConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == boolConstantType)){
				println("here")
				return boolConstantType}
			else
				{return null}
		}
		
		def dispatch ExpressionsType typeFor(Comparison e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return boolConstantType
			else
				return null
			
		}
		
		def dispatch ExpressionsType typeFor(ActionComparison e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return boolConstantType
			else
				return null
			
		}
		
		def dispatch ExpressionsType typeFor(Sub e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionSub e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Plu e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionPlu e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Mul e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionMul e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Div e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(ActionDiv e){
			val leftType = e.left?.typeFor
			val rightType = e.right?.typeFor
			if ((leftType == doubleConstantType || leftType == freeVariableType) 
			&& (rightType == freeVariableType || rightType == doubleConstantType))
				return doubleConstantType
			else
				return null
		}
		
		def dispatch ExpressionsType typeFor(Not e){
			if (e.expression?.typeFor == boolConstantType 
				|| e.expression?.typeFor == freeVariableType)
				return boolConstantType
			else 
				return null 
		}
		
		def dispatch ExpressionsType typeFor(ActionNot e){
			if (e.expression?.typeFor == boolConstantType 
				|| e.expression?.typeFor == freeVariableType)
				return boolConstantType
			else 
				return null 
		}

		def dispatch ExpressionsType typeFor(ReferencedStore e){
			if( e.value == null || (e.selfReferencedStores == e.value) ||
				!(e.variablesHaveBeenDefinedBefore.contains(e.value))) {
				return null}
			else{
				return e.value.value?.typeFor}
		}
		
		def dispatch ExpressionsType typeFor(SelfReferencedStore e){
			if( e.name.value == null ||
				!(e.variablesHaveBeenDefinedBefore.contains((e.name as Store)))) {
				return null}
			else{
				return selfReferencedStoreType}
		}
		
		def dispatch ExpressionsType typeFor(FreeVariable e){
			return freeVariableType
		}
		

	
}