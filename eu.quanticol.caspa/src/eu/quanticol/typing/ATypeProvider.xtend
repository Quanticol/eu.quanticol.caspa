package eu.quanticol.typing

import com.google.inject.Inject
import eu.quanticol.cASPA.LocalUpdateExpression
import eu.quanticol.cASPA.GlobalUpdateExpression
import eu.quanticol.cASPA.LocalEvaluationExpression
import eu.quanticol.cASPA.GlobalEvaluationExpression
import eu.quanticol.cASPA.FreeEvaluationExpression
import eu.quanticol.cASPA.PredicateExpression
import eu.quanticol.cASPA.SelfReferencedStore
import eu.quanticol.cASPA.Store
import eu.quanticol.cASPA.LocalUpdateExpressionFunction
import eu.quanticol.cASPA.GlobalUpdateExpressionFunction
import eu.quanticol.cASPA.FunctionExpression
import eu.quanticol.cASPA.Uniform
import eu.quanticol.cASPA.Distribution

class ATypeProvider {
	
	@Inject extension ETypeProvider

	
	//ActionType
	public static val updateExpressionType = new UpdateExpressionType
	public static val predicateExpressionType = new PredicateExpressionType
	public static val evaluationExpressionType = new EvaluationExpressionType
	public static val actionExpression = new ActionExpressionType
	
	def dispatch ActionType typeForA(LocalUpdateExpression u){
		if((u.name.name.value?.typeFor == u.expression?.typeFor) || 
			(u.expression?.typeFor == ETypeProvider::freeVariableType)){
				return updateExpressionType
			}
			else {
				return null
			}
	}
	
	def dispatch ActionType typeForA(GlobalUpdateExpression u){
		if((u.name.value?.typeFor == u.expression?.typeFor) || 
			(u.expression?.typeFor == ETypeProvider::freeVariableType)){
				return updateExpressionType
			}
			else {
				return null
			}
	}
	
	def dispatch ActionType typeForA(LocalUpdateExpressionFunction u){
		if((u.name.name.value?.typeFor == u.expression?.typeForA) || 
			(u.expression?.typeFor == ETypeProvider::freeVariableType)){
				return updateExpressionType
			}
			else {
				return null
			}
	}
	
	def dispatch ActionType typeForA(GlobalUpdateExpressionFunction u){
		if((u.name.value?.typeFor == u.expression?.typeForA) || 
			(u.expression?.typeFor == ETypeProvider::freeVariableType)){
				return updateExpressionType
			}
			else {
				return null
			}
	}
	
	def dispatch ActionType typeForA(FunctionExpression functionExpression){
		var allCorrect = true
		
		for(dist : functionExpression.distribution)
			allCorrect = allCorrect && (dist?.typeForA == updateExpressionType)
			
		if(allCorrect)
			return updateExpressionType
		else
			return null
	}
	
	def dispatch ActionType typeForA(Uniform u){
		
		val expression = u.expression
		
		if(((expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType))){
			return updateExpressionType
		} else {
			return null
		}
		
	}
	
	def dispatch ActionType typeForA(Distribution d){
		
		val variable = d.prob
		val expression = d.expression
		
		if(((variable.getClass == Double)
			&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType))){
			return updateExpressionType
		} else {
			return null
		}
	}
		
	def dispatch ActionType typeForA(LocalEvaluationExpression evaluationExpression){
		
		val variable = ((evaluationExpression.name as SelfReferencedStore).name as Store).value
		val expression = evaluationExpression.expression
		
		if(((variable?.typeFor == expression?.typeFor)
		   	&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType)))
		   return evaluationExpressionType
	}
	
	def dispatch ActionType typeForA(GlobalEvaluationExpression evaluationExpression){
		
		val variable = (evaluationExpression.name as Store).value
		val expression = evaluationExpression.expression
		
		if(((variable?.typeFor == expression?.typeFor)
		   	&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType)))
		   	return evaluationExpressionType
		else
			return null
	}
	
	def dispatch ActionType typeForA(FreeEvaluationExpression evaluationExpression){
		
		val variable = evaluationExpression.name
		val expression = evaluationExpression.expression
		
		
		if((variable.getClass == String) 
		   	&& (expression?.typeFor == ETypeProvider::freeVariableType ||
		   		expression?.typeFor == ETypeProvider::boolConstantType ||
		   		expression?.typeFor == ETypeProvider::doubleConstantType) ||
		   		(expression?.typeFor == ETypeProvider::freeVariableType))
		   	return evaluationExpressionType
		else
			return null
	}


	def dispatch ActionType typeForA(PredicateExpression p){
		if((p.expression?.typeFor == ETypeProvider::boolConstantType) ||
		(p.expression?.typeFor == ETypeProvider::freeVariableType))
			return predicateExpressionType
		else
			return null
	}
	
}