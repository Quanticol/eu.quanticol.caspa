package eu.quanticol.typing

import static org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import eu.quanticol.cASPA.ReferencedStore
import eu.quanticol.cASPA.Model
import eu.quanticol.cASPA.SelfReferencedStore

class ModelUtil {
	
	/*
	 * Has the reference been defined before?
	 */
	def static variablesHaveBeenDefinedBefore(ReferencedStore e) {
		val allElements = 
			e.getContainerOfType(typeof(Model)).stores
		return allElements
	}
	
	def static variablesHaveBeenDefinedBefore(SelfReferencedStore e) {
		val allElements = 
			e.getContainerOfType(typeof(Model)).stores
		return allElements
	}
	
	/*
	 * Is there a store that references itself?
	 */
	def static selfReferencedStores(ReferencedStore e) {
		val allElements = 
			e.getContainerOfType(typeof(Model)).
				stores
		allElements.findFirst[isAncestor(it, e)]
	}
}
