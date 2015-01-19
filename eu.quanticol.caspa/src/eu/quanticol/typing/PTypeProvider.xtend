package eu.quanticol.typing

import com.google.inject.Inject
import eu.quanticol.cASPA.Leaf
import eu.quanticol.cASPA.Choice
import eu.quanticol.cASPA.Parallel
import eu.quanticol.cASPA.PredicateProcess
import eu.quanticol.cASPA.ActionProcess
import eu.quanticol.cASPA.ProcessReference

class PTypeProvider {
	
	@Inject extension ETypeProvider
	@Inject extension ATypeProvider
	
	//ProcessType
	public static val processType = new ProcessType
	
	def dispatch ProcessType typeForP(Leaf le){
		return processType
	}
	
	def dispatch ProcessType typeForP(Choice c){
		val leftType = c.left?.typeFor
		val rightType = c.right?.typeFor
			if (leftType == processType && rightType == processType)
				return processType
			else
				return null
	}
	
	def dispatch ProcessType typeForP(Parallel p){
		val leftType = p.left?.typeFor
		val rightType = p.right?.typeFor
			if (leftType == processType && rightType == processType)
				return processType
			else
				return null
		
	}
	
	def dispatch ProcessType typeForP(PredicateProcess pp){
		val predicate = pp.predicate.predicate.expression?.typeForA
		val reference = pp.value.value?.typeForP
		if(predicate == ETypeProvider::boolConstantType &&
			reference == processType)
			return processType
		else
			return null
	}
	
	def dispatch ProcessType typeForP(ActionProcess ap){
		
	}
	
	def dispatch ProcessType typeForP(ProcessReference pr){
		
	}
	
}