/*
 * generated by Xtext
 */
package eu.quanticol.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CASPAGenerator implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
//	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		for (e : resource.allContents.toIterable.filter(typeof(Model))){
//			fsa.generateFile("simulators/simulator.java",e.compile)
//		}
//	}
//	
//	def CharSequence compile(Model model){
//		'''
//		package simulators;
//		
//		public class simulator{
//			«FOR store : model.stores»
//					«store.compile»
//			«ENDFOR»
//		}
//		
//		'''
//	}
//	
//	def CharSequence compile(Store store){
//		'''
//		public double get«store.name.toFirstUpper»(){
//			return «store.value.compile» ;
//		}
//		'''
//	}
//	
//
//	def CharSequence compile(Expression e) {
//		switch (e) {
//			Or: 			'''(«e.left.compile» || «e.right.compile»)'''
//			And: 			'''(«e.left.compile» && «e.right.compile»)'''
//			Equality:   	'''(«e.left.compile» «e.op» «e.right.compile»)'''
//			Comparison: 	'''(«e.left.compile» «e.op» «e.right.compile»)'''
//			Sub: 			'''(«e.left.compile» - «e.right.compile»)'''
//			Plu: 			'''(«e.left.compile» + «e.right.compile»)'''
//			Mul:			'''(«e.left.compile» * «e.right.compile»)'''
//			Div: 			'''(«e.left.compile» / «e.right.compile»)'''
//			Not: 			'''! «e.expression.compile»'''
//			ReferencedStore: '''get«e.value.name.toFirstUpper»()'''
//			DoubleConstant: '''«e.value»'''
//			BoolConstant: 	'''«e.value»'''
//			}.toString
//	}
}