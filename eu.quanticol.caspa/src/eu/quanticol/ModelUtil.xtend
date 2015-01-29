package eu.quanticol

import eu.quanticol.cASPA.ProcessExpression
import eu.quanticol.cASPA.Process
import eu.quanticol.cASPA.ReferencedProcess
import eu.quanticol.cASPA.Store
//import eu.quanticol.cASPA.SelfReferencedStore
//import eu.quanticol.cASPA.ReferencedStore
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
import eu.quanticol.cASPA.SelfReference
import eu.quanticol.cASPA.Reference
import eu.quanticol.cASPA.DistributionNatural
import eu.quanticol.cASPA.UniformNatural
import java.util.HashMap
import eu.quanticol.cASPA.FreeVariable
import java.lang.reflect.Array

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
			Reference:				(pe as Reference).cTString
			SelfReference:			(pe as SelfReference).cTString
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
			SelfReference:				(a as StoreExpression).cTString
			Reference:					(a as StoreExpression).cTString
			Constant:					(a as Constant).cTString
			
		}.toString
	}

	
	def String cTString(Process p){
		"" + p.name
	}
	
	def String cTString(StoreExpression s){
		switch(s){
			Store:					"" + s.name + " = " + s.value
			SelfReference:			"" + s.name
			Reference:				"" + s.name
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
		u.assignee.cTString + " := " + u.assigner.cTString
	}
	
	def String cTString(DistributedEventUpdateProbability u){
		var String temp
		for(distribution : u.distribution){
			temp = temp + " " distribution.cTString} + ", "
		u.assignee.cTString + " :=  Pr( " + temp + " )"
	}
	
	def String cTString(DistributedEventUpdateUniform u){
		var String temp
		for(distribution : u.distribution){
			temp = temp + " " distribution.cTString} + ", "
		u.assignee.cTString + " :=  U( " + temp + " )"
	}
	
	def String cTString(DistributionNatural u){
		"" + u.prob.toString + " : " u.expression.toString
	}
	
	def String cTString(UniformNatural u){
		u.expression.toString
	}
	
	def String cTString(UpdateExpression ue){
		switch(ue){
			UpdateSub:				ue.left.cTString + " - "  + ue.right.cTString 
			UpdatePlu:				ue.left.cTString + " + "  + ue.right.cTString 
			UpdateMul:				ue.left.cTString + " * "  + ue.right.cTString 
			UpdateDiv:				ue.left.cTString + " / "  + ue.right.cTString 
			Constant:				(ue as Constant).cTString
			Reference:				(ue as StoreExpression).cTString
			SelfReference:			(ue as StoreExpression).cTString
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
	
	def Set<Term> fromProcessesGetParentTerms(Set<Process> processes){
		
		
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
	
	def Set<String> fromTermsGetStoreNames(Set<Term> terms){
		
		var Set<String> names = new HashSet<String>()
		
		for(term : terms)
			for(store : term.stores.stores)
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
	
	
	def Set<Process> fromStoreExpressionGetProcesses(StoreExpression sr){
		
		var processes = sr.getContainerOfType(typeof(Model)).processes
		var p = sr.getContainerOfType(typeof(Process))
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
	
	
	def HashMap<Integer,Term> fromProcessesGetHashMapOfTerms(Set<Process> processes){
		
		
		var terms = processes.get(0).getContainerOfType(typeof(Model)).terms
		var Set<String> names = new HashSet<String>()
		var HashMap<Integer,Term> results = new HashMap<Integer,Term>()
		var Integer count = 0
		
		for(process : processes)
			names.add(process.name)
			
			
		for(term : terms)
			for(name : names)
				if((term.ref as ReferencedProcess).ref.name.equals(name)){
					results.put(count,term)
					count++
				}
					
		
		return results
		
	}
	
	def HashMap<Integer,ArrayList<String>> fromHashMapOfTermsGetStoreNames(HashMap<Integer,Term> terms){
		
		var HashMap<Integer,ArrayList<String>> names = new HashMap<Integer,ArrayList<String>>()
		
		for(i : terms.keySet)
			for(store : terms.get(i).stores.stores){
				if(names.get(i) == null){
					names.put(i,new ArrayList<String>())
					
				} 
				names.get(i).add((store as Store).name)
			}
		
		return names
		
	}
	
	def boolean isInMap(String name, HashMap<Integer,ArrayList<String>> theList){
		var boolean result = true
		
		if(theList.size == 0)
			result = false
		
		for(i : theList.keySet)
				result = result && theList.get(i).contains(name)
		
		return result
	}
	
	def ArrayList<String> fromStoreExpressionGetProcessInArgs(StoreExpression sr){
		
		var p = sr.getContainerOfType(typeof(ProcessExpression))
		var ArrayList<String> results = new ArrayList<String>()
		
		var freeVariables = p.eAllOfType(FreeVariable)
		
		for(fv : freeVariables)
			results.add(fv.name)
		
		return results
	}
	
	
	def boolean isInList(String name, ArrayList<String> theList){
		var boolean result = true
		
		if(theList.length == 0)
			result = false
		
		for(nameOf : theList)
				result = result && nameOf.equals(name)
		
		return result
	}
}