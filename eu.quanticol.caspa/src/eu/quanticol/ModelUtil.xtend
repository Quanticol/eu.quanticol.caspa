package eu.quanticol

import eu.quanticol.cASPA.ProcessExpression
import eu.quanticol.cASPA.Process
import eu.quanticol.cASPA.ReferencedProcess
import eu.quanticol.cASPA.Store
import eu.quanticol.cASPA.SelfReferencedStore
import eu.quanticol.cASPA.ReferencedStore
import eu.quanticol.cASPA.StoreExpression
import eu.quanticol.cASPA.Parallel
import eu.quanticol.cASPA.Choice
import eu.quanticol.cASPA.Leaf
import eu.quanticol.cASPA.PredicateProcess
import eu.quanticol.cASPA.ActionProcess
import eu.quanticol.cASPA.Predicate
import eu.quanticol.cASPA.Action
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
import eu.quanticol.cASPA.Constant
import eu.quanticol.cASPA.BooleanConstant
import eu.quanticol.cASPA.Arguments
import eu.quanticol.cASPA.In
import eu.quanticol.cASPA.Out
import eu.quanticol.cASPA.Updates
import eu.quanticol.cASPA.LocalSingleEventUpdate
import eu.quanticol.cASPA.DistributedEventUpdateProbability
import eu.quanticol.cASPA.DistributedEventUpdateUniform
import eu.quanticol.cASPA.Distribution
import eu.quanticol.cASPA.Uniform
import eu.quanticol.cASPA.UpdateExpression
import eu.quanticol.cASPA.UpdateSub
import eu.quanticol.cASPA.UpdatePlu
import eu.quanticol.cASPA.UpdateMul
import eu.quanticol.cASPA.UpdateDiv

import static org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import eu.quanticol.cASPA.Term
import java.util.ArrayList
import eu.quanticol.cASPA.CASPAPackage
import eu.quanticol.cASPA.Model
import org.eclipse.emf.common.util.EList
import java.util.Set
import java.util.HashSet

class ModelUtil {
	
	
	def String cTString(ProcessExpression e) {
		switch (e) {
			ReferencedProcess:				"" + e.ref.cTString
			Parallel:						e.left.cTString + " | " + e.right.cTString
			Choice:							e.left.cTString + " + " + e.right.cTString
			Leaf:							"" + e.value
			PredicateProcess:				e.predicate.cTString
			ActionProcess:					e.action.cTString
			}.toString
	}
	
	def String cTString(Predicate p){
		"Predicate: " + p.predicate.cTString
	}
	
	def String cTString(PredicateExpression pe){
		switch(pe){
			PredicateOr:			pe.left.cTString + " || "  + pe.right.cTString 
			PredicateAnd:			pe.left.cTString + " && "  + pe.right.cTString 
			PredicateEquality:		pe.left.cTString + " " + pe.op.toString + " " + pe.right.cTString 
			PredicateComparison:	pe.left.cTString + " " + pe.op.toString + " " + pe.right.cTString 
			PredicateSub:			pe.left.cTString + " - "  + pe.right.cTString 
			PredicatePlu:			pe.left.cTString + " + "  + pe.right.cTString 
			PredicateMul:			pe.left.cTString + " * "  + pe.right.cTString 
			PredicateDiv:			pe.left.cTString + " / "  + pe.right.cTString 
			PredicateNot:			"!" + pe.expression.cTString
			Constant:				(pe as Constant).cTString
			BooleanConstant:		(pe as BooleanConstant).cTString
			ReferencedStore:		(pe as ReferencedStore).cTString
			SelfReferencedStore:	(pe as SelfReferencedStore).cTString
		}.toString
		
	}
	
	def String cTString(Constant c){
		"" + c.value
	}
	
	def String cTString(BooleanConstant bc){
		"" + bc.value
	}
	
	def String cTString(Action a){
		
		var String args = ""
		var String upds	= "" 
			 
		args = a.arguments.cTString 
		
		upds = a.updates.cTString
			
		return "Action: " + a.name + " " + a.predicate.cTString + " " + args + " " + upds
	}
	
	def String cTString(Arguments a){
		switch(a){
			In:						{ 	var String temp = "( "  
										for(expression : a.expressions){
											temp + " " + expression.cTString
										} 
										temp = temp + " " + ")"
										return temp}
			Out:					{ 	var String temp = "< "  
										for(expression : a.expressions){
											temp + " " + expression.cTString
										} 
										temp = temp + " " + " >"
										return temp}
			SelfReferencedStore:		(a as StoreExpression).cTString
			ReferencedStore:			(a as StoreExpression).cTString
			Constant:					(a as Constant).cTString
			
		}.toString
	}

	
	def String cTString(Process p){
		"" + p.name
	}
	
	def String cTString(StoreExpression s){
		switch(s){
			Store:					"" + s.name + " = " + s.value
			SelfReferencedStore:	(s.ref as StoreExpression).cTString
			ReferencedStore:		(s.ref as StoreExpression).cTString
		}.toString
	}
	
	def String cTString(Store s){
		"" + s.name + " = " + s.value 
	}


	def String cTString(Updates u){
		var String temp = ""
		for(update : u.updates){
			temp = temp + " " update.cTString}
		return "Update: " + temp
	}
	
	def String cTString(LocalSingleEventUpdate u){
		u.name.cTString + " := " + u.expression.cTString
	}
	
	def String cTString(DistributedEventUpdateProbability u){
		var String temp
		for(distribution : u.distribution){
			temp = temp + " " distribution.cTString} + ", "
		u.name.cTString + " :=  Pr( " + temp + " )"
	}
	
	def String cTString(DistributedEventUpdateUniform u){
		var String temp
		for(distribution : u.distribution){
			temp = temp + " " distribution.cTString} + ", "
		u.name.cTString + " :=  U( " + temp + " )"
	}
	
	def String cTString(Distribution u){
		"" + u.prob.toString + " : " u.expression.toString
	}
	
	def String cTString(Uniform u){
		u.expression.toString
	}
	
	def String cTString(UpdateExpression ue){
		switch(ue){
			UpdateSub:				ue.left.cTString + " - "  + ue.right.cTString 
			UpdatePlu:				ue.left.cTString + " + "  + ue.right.cTString 
			UpdateMul:				ue.left.cTString + " * "  + ue.right.cTString 
			UpdateDiv:				ue.left.cTString + " / "  + ue.right.cTString 
			Constant:				(ue as Constant).cTString
			ReferencedStore:		(ue as StoreExpression).cTString
			SelfReferencedStore:	(ue as StoreExpression).cTString
		}.toString
	}
	
	def Process fromInGetProcess(In in){
		in.getContainerOfType(typeof(Process))
	}
	
	def Set<Process> fromProcessGetReferences(Process p){
		
		var processes = p.getContainerOfType(typeof(Model)).processes
		var Set<Process> refProcesses = new HashSet<Process>()
		var Set<Process> lastRefProcesses = new HashSet<Process>()
		
		refProcesses.add(p)
		
		while(refProcesses.size > lastRefProcesses.size){
			
			for(rp : refProcesses)
					lastRefProcesses.add(rp)
			
			for(process : processes){
				for(rp : lastRefProcesses)
					process.value.getReferencedProcess(refProcesses,rp)
			}
			
		}
		
		return refProcesses
	}
	
	def Set<Term> getParentTerms(Set<Process> processes){
		
		
		var terms = processes.get(0).getContainerOfType(typeof(Model)).terms
		var Set<String> names = new HashSet<String>()
		var Set<Term> results = new HashSet<Term>()
		
		for(process : processes)
			names.add(process.name)
			
			
		for(term : terms)
			for(name : names)
				if((term.ref as ReferencedProcess).ref.name.equals(name))
					results.add(term)
					
		
		return results
		
	}
	
	def Set<String> getStoreNamesFromTerms(Set<Term> terms){
		
		var Set<String> names = new HashSet<String>()
		
		for(term : terms)
			for(store : term.stores)
				names.add((store as Store).name)
		
		return names
		
	}
	
	def void getReferencedProcess(ProcessExpression pe,
		Set<Process> results,
		Process p){
			
			
		switch(pe){
			Parallel: 			{pe.left.getReferencedProcess(results,p)
								pe.right.getReferencedProcess(results,p)}
			Choice: 			{pe.left.getReferencedProcess(results,p)
								pe.right.getReferencedProcess(results,p)}
			PredicateProcess: 	pe.ref.getReferencedProcess(results,p)
			ActionProcess:		pe.ref.getReferencedProcess(results,p)
			ReferencedProcess:	{ 	
									if(pe.ref.name.equals(p.name)){
										results.add(pe.getContainerOfType(typeof(Process)))
									}
								}
		}
	}
	
	
	
	/*
	 * Has the reference been defined before?
	 */
//	def static variablesHaveBeenDefinedBefore(ReferencedStore e) {
//		val allElements = 
//			e.getContainerOfType(typeof(Model)).stores
//		return allElements
//	}
//	
//	def static variablesHaveBeenDefinedBefore(SelfReferencedStore e) {
//		val allElements = 
//			e.getContainerOfType(typeof(Model)).stores
//		return allElements
//	}
//	
//	/*
//	 * Is there a store that references itself?
//	 */
//	def static selfReferencedStores(ReferencedStore e) {
//		val allElements = 
//			e.getContainerOfType(typeof(Model)).
//				stores
//		allElements.findFirst[isAncestor(it, e)]
//	}
}