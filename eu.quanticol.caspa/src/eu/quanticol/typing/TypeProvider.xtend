package eu.quanticol.typing

import static extension eu.quanticol.typing.ModelUtil.*
import eu.quanticol.cASPA.BoolConstant
import eu.quanticol.cASPA.Constant
import eu.quanticol.cASPA.Store

class TypeProvider {
	
	//Type
	public static val doubleConstantType = new DoubleConstantType
	public static val boolConstantType = new BoolConstantType
	public static val constantType = new ConstantType


	def dispatch BaseType typeFor(Double d) {
		doubleConstantType
	}
	
	def dispatch BaseType typeFor(BoolConstant b) {
		boolConstantType
	}
	
	def dispatch BaseType typeFor(Constant c){
		constantType
	}
	
	def dispatch BaseType typeFor(Store s){
		if(s.value == constantType)
			constantType
		else
			null
	}
	
//	def dispatch BaseType typeFor(StoreExpression e){
//		
//		switch(e){
//			StoreOr: 		returnBiLogicalType(e)
//			StoreAnd: 		returnBiLogicalType(e)
//			StoreEquality: 	returnBiLogicalType(e)
//		}
//	}
//	
//	def BaseType returnBiLogicalType(StoreExpression e){
//		
//		var exp = (e as StoreOr)
//		
//		if (exp.left?.typeFor == boolConstantType && exp.right?.typeFor == boolConstantType)
//			return boolConstantType
//		else
//			return null
//	}
//	
//	def BaseType returnUniLogicalType(StoreExpression e){
//		
//		var exp = (e as StoreNot)
//		
//		if (e.left?.typeFor == boolConstantType && right?.typeFor)
//			return boolConstantType
//		else
//			return null
//	}
	
}