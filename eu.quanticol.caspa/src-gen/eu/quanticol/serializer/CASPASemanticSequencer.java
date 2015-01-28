package eu.quanticol.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.BooleanConstant;
import eu.quanticol.cASPA.Broadcast;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.DistributionNatural;
import eu.quanticol.cASPA.DistributionReference;
import eu.quanticol.cASPA.FreeVariable;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.OutStoreReference;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateAnd;
import eu.quanticol.cASPA.PredicateComparison;
import eu.quanticol.cASPA.PredicateDiv;
import eu.quanticol.cASPA.PredicateEquality;
import eu.quanticol.cASPA.PredicateMul;
import eu.quanticol.cASPA.PredicateNot;
import eu.quanticol.cASPA.PredicateOr;
import eu.quanticol.cASPA.PredicatePlu;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.PredicateStoreReference;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.Reference;
import eu.quanticol.cASPA.ReferencedProcess;
import eu.quanticol.cASPA.SelfReference;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.UniformNatural;
import eu.quanticol.cASPA.UniformReference;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateExpressionStoreReference;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateStoreReference;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.cASPA.Updates;
import eu.quanticol.services.CASPAGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CASPASemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CASPAGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CASPAPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CASPAPackage.ACTION_PROCESS:
				if(context == grammarAccess.getActionProcessRule() ||
				   context == grammarAccess.getAtomicProcessRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_ActionProcess(context, (ActionProcess) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.BOOLEAN_CONSTANT:
				if(context == grammarAccess.getBoolRule()) {
					sequence_Bool(context, (BooleanConstant) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAtomicRule() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateAtomic(context, (BooleanConstant) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.BROADCAST:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Broadcast) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.CONSTANT:
				if(context == grammarAccess.getExpressionsRule() ||
				   context == grammarAccess.getOutArgumentsRule()) {
					sequence_Expressions(context, (Constant) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAtomicRule() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateAtomic(context, (Constant) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUpdateAdditionRule() ||
				   context == grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0() ||
				   context == grammarAccess.getUpdateAtomicRule() ||
				   context == grammarAccess.getUpdateDivisionRule() ||
				   context == grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0() ||
				   context == grammarAccess.getUpdateExpressionRule() ||
				   context == grammarAccess.getUpdateMultiplicationRule() ||
				   context == grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0() ||
				   context == grammarAccess.getUpdatePrimaryRule() ||
				   context == grammarAccess.getUpdateSubtractionRule() ||
				   context == grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0()) {
					sequence_UpdateAtomic(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY:
				if(context == grammarAccess.getDistributedEventUpdateRule() ||
				   context == grammarAccess.getUpdateRule()) {
					sequence_DistributedEventUpdate(context, (DistributedEventUpdateProbability) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM:
				if(context == grammarAccess.getDistributedEventUpdateRule() ||
				   context == grammarAccess.getUpdateRule()) {
					sequence_DistributedEventUpdate(context, (DistributedEventUpdateUniform) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.DISTRIBUTION_NATURAL:
				if(context == grammarAccess.getDistributionRule()) {
					sequence_Distribution(context, (DistributionNatural) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.DISTRIBUTION_REFERENCE:
				if(context == grammarAccess.getDistributionRule() ||
				   context == grammarAccess.getDistributionReferenceRule()) {
					sequence_DistributionReference(context, (DistributionReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.FREE_VARIABLE:
				if(context == grammarAccess.getFreeVariableRule() ||
				   context == grammarAccess.getInArgumentsRule() ||
				   context == grammarAccess.getVariablesRule()) {
					sequence_FreeVariable(context, (FreeVariable) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.IN:
				if(context == grammarAccess.getArgumentsRule()) {
					sequence_Arguments(context, (In) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.LEAF:
				if(context == grammarAccess.getAtomicProcessRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_AtomicProcess(context, (Leaf) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE:
				if(context == grammarAccess.getSingleEventUpdateRule() ||
				   context == grammarAccess.getUpdateRule()) {
					sequence_SingleEventUpdate(context, (LocalSingleEventUpdate) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.OUT:
				if(context == grammarAccess.getArgumentsRule()) {
					sequence_Arguments(context, (Out) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.OUT_STORE_REFERENCE:
				if(context == grammarAccess.getExpressionsRule() ||
				   context == grammarAccess.getOutArgumentsRule() ||
				   context == grammarAccess.getOutStoreReferenceRule()) {
					sequence_OutStoreReference(context, (OutStoreReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PARALLEL:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_AND:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateAnd(context, (PredicateAnd) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_COMPARISON:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateComparison(context, (PredicateComparison) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_DIV:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateDivision(context, (PredicateDiv) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_EQUALITY:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateEquality(context, (PredicateEquality) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_MUL:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateMultiplication(context, (PredicateMul) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_NOT:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicatePrimary(context, (PredicateNot) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_OR:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateOr(context, (PredicateOr) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_PLU:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateAddition(context, (PredicatePlu) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_PROCESS:
				if(context == grammarAccess.getAtomicProcessRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPredicateProcessRule() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_PredicateProcess(context, (PredicateProcess) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_STORE_REFERENCE:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAtomicRule() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateStoreReferenceRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateStoreReference(context, (PredicateStoreReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PREDICATE_SUB:
				if(context == grammarAccess.getPredicateAdditionRule() ||
				   context == grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0() ||
				   context == grammarAccess.getPredicateAndRule() ||
				   context == grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0() ||
				   context == grammarAccess.getPredicateComparisonRule() ||
				   context == grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPredicateDivisionRule() ||
				   context == grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0() ||
				   context == grammarAccess.getPredicateEqualityRule() ||
				   context == grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0() ||
				   context == grammarAccess.getPredicateExpressionRule() ||
				   context == grammarAccess.getPredicateMultiplicationRule() ||
				   context == grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0() ||
				   context == grammarAccess.getPredicateOrRule() ||
				   context == grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0() ||
				   context == grammarAccess.getPredicatePrimaryRule() ||
				   context == grammarAccess.getPredicateSubtractionRule() ||
				   context == grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0()) {
					sequence_PredicateSubtraction(context, (PredicateSub) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (eu.quanticol.cASPA.Process) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.REFERENCE:
				if(context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.REFERENCED_PROCESS:
				if(context == grammarAccess.getAtomicProcessRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0() ||
				   context == grammarAccess.getParallelRule() ||
				   context == grammarAccess.getParallelAccess().getParallelLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryProcessRule() ||
				   context == grammarAccess.getProcessExpressionRule() ||
				   context == grammarAccess.getReferencedProcessRule()) {
					sequence_ReferencedProcess(context, (ReferencedProcess) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.SELF_REFERENCE:
				if(context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getSelfReferenceRule()) {
					sequence_SelfReference(context, (SelfReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.STORE:
				if(context == grammarAccess.getStoreRule()) {
					sequence_Store(context, (Store) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UNICAST:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Unicast) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UNIFORM_NATURAL:
				if(context == grammarAccess.getUniformRule()) {
					sequence_Uniform(context, (UniformNatural) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UNIFORM_REFERENCE:
				if(context == grammarAccess.getUniformRule() ||
				   context == grammarAccess.getUniformReferenceRule()) {
					sequence_UniformReference(context, (UniformReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATE_DIV:
				if(context == grammarAccess.getUpdateAdditionRule() ||
				   context == grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0() ||
				   context == grammarAccess.getUpdateDivisionRule() ||
				   context == grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0() ||
				   context == grammarAccess.getUpdateExpressionRule() ||
				   context == grammarAccess.getUpdateMultiplicationRule() ||
				   context == grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0() ||
				   context == grammarAccess.getUpdatePrimaryRule() ||
				   context == grammarAccess.getUpdateSubtractionRule() ||
				   context == grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0()) {
					sequence_UpdateDivision(context, (UpdateDiv) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATE_EXPRESSION_STORE_REFERENCE:
				if(context == grammarAccess.getUpdateAdditionRule() ||
				   context == grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0() ||
				   context == grammarAccess.getUpdateAtomicRule() ||
				   context == grammarAccess.getUpdateDivisionRule() ||
				   context == grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0() ||
				   context == grammarAccess.getUpdateExpressionRule() ||
				   context == grammarAccess.getUpdateExpressionStoreReferenceRule() ||
				   context == grammarAccess.getUpdateMultiplicationRule() ||
				   context == grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0() ||
				   context == grammarAccess.getUpdatePrimaryRule() ||
				   context == grammarAccess.getUpdateSubtractionRule() ||
				   context == grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0()) {
					sequence_UpdateExpressionStoreReference(context, (UpdateExpressionStoreReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATE_MUL:
				if(context == grammarAccess.getUpdateAdditionRule() ||
				   context == grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0() ||
				   context == grammarAccess.getUpdateDivisionRule() ||
				   context == grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0() ||
				   context == grammarAccess.getUpdateExpressionRule() ||
				   context == grammarAccess.getUpdateMultiplicationRule() ||
				   context == grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0() ||
				   context == grammarAccess.getUpdatePrimaryRule() ||
				   context == grammarAccess.getUpdateSubtractionRule() ||
				   context == grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0()) {
					sequence_UpdateMultiplication(context, (UpdateMul) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATE_PLU:
				if(context == grammarAccess.getUpdateAdditionRule() ||
				   context == grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0() ||
				   context == grammarAccess.getUpdateDivisionRule() ||
				   context == grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0() ||
				   context == grammarAccess.getUpdateExpressionRule() ||
				   context == grammarAccess.getUpdateMultiplicationRule() ||
				   context == grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0() ||
				   context == grammarAccess.getUpdatePrimaryRule() ||
				   context == grammarAccess.getUpdateSubtractionRule() ||
				   context == grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0()) {
					sequence_UpdateAddition(context, (UpdatePlu) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATE_STORE_REFERENCE:
				if(context == grammarAccess.getUpdateReferenceRule()) {
					sequence_UpdateReference(context, (UpdateStoreReference) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATE_SUB:
				if(context == grammarAccess.getUpdateAdditionRule() ||
				   context == grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0() ||
				   context == grammarAccess.getUpdateDivisionRule() ||
				   context == grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0() ||
				   context == grammarAccess.getUpdateExpressionRule() ||
				   context == grammarAccess.getUpdateMultiplicationRule() ||
				   context == grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0() ||
				   context == grammarAccess.getUpdatePrimaryRule() ||
				   context == grammarAccess.getUpdateSubtractionRule() ||
				   context == grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0()) {
					sequence_UpdateSubtraction(context, (UpdateSub) semanticObject); 
					return; 
				}
				else break;
			case CASPAPackage.UPDATES:
				if(context == grammarAccess.getUpdatesRule()) {
					sequence_Updates(context, (Updates) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (action=Action ref=PrimaryProcess)
	 */
	protected void sequence_ActionProcess(EObject context, ActionProcess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.ACTION_PROCESS__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.ACTION_PROCESS__ACTION));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.ACTION_PROCESS__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.ACTION_PROCESS__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getActionProcessAccess().getRefPrimaryProcessParserRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER predicate=Predicate arguments=Arguments updates=Updates?)
	 */
	protected void sequence_Action(EObject context, Broadcast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER predicate=Predicate arguments=Arguments updates=Updates?)
	 */
	protected void sequence_Action(EObject context, Unicast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=InArguments expressions+=InArguments*)
	 */
	protected void sequence_Arguments(EObject context, In semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=OutArguments expressions+=OutArguments*)
	 */
	protected void sequence_Arguments(EObject context, Out semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='nil' | value='kill')
	 */
	protected void sequence_AtomicProcess(EObject context, Leaf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BooleanConstant}
	 */
	protected void sequence_Bool(EObject context, BooleanConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Choice_Choice_1_0 right=PrimaryProcess)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.CHOICE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.CHOICE__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.CHOICE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.CHOICE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=UpdateReference assigner+=Distribution distribution+=Distribution*)
	 */
	protected void sequence_DistributedEventUpdate(EObject context, DistributedEventUpdateProbability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=UpdateReference assigner+=Uniform distribution+=Uniform*)
	 */
	protected void sequence_DistributedEventUpdate(EObject context, DistributedEventUpdateUniform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prob=Double ref=Ref)
	 */
	protected void sequence_DistributionReference(EObject context, DistributionReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prob=Double expression=Natural)
	 */
	protected void sequence_Distribution(EObject context, DistributionNatural semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Natural
	 */
	protected void sequence_Expressions(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionsAccess().getValueNaturalParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LOWER
	 */
	protected void sequence_FreeVariable(EObject context, FreeVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.FREE_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.FREE_VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFreeVariableAccess().getNameLOWERTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=Term+ processes+=Process+)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=Ref
	 */
	protected void sequence_OutStoreReference(EObject context, OutStoreReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Parallel_Parallel_1_0 right=Choice)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PARALLEL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PARALLEL__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PARALLEL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PARALLEL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParallelAccess().getParallelLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateAddition_PredicatePlu_1_0 right=PredicateMultiplication)
	 */
	protected void sequence_PredicateAddition(EObject context, PredicatePlu semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_PLU__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_PLU__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_PLU__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_PLU__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPredicateAdditionAccess().getRightPredicateMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateAnd_PredicateAnd_1_0 right=PredicateEquality)
	 */
	protected void sequence_PredicateAnd(EObject context, PredicateAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPredicateAndAccess().getRightPredicateEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Bool
	 */
	protected void sequence_PredicateAtomic(EObject context, BooleanConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.BOOLEAN_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.BOOLEAN_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAtomicAccess().getValueBoolParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Natural
	 */
	protected void sequence_PredicateAtomic(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAtomicAccess().getValueNaturalParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateComparison_PredicateComparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=PredicateSubtraction)
	 */
	protected void sequence_PredicateComparison(EObject context, PredicateComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateDivision_PredicateDiv_1_0 right=PredicatePrimary)
	 */
	protected void sequence_PredicateDivision(EObject context, PredicateDiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPredicateDivisionAccess().getRightPredicatePrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateEquality_PredicateEquality_1_0 (op='==' | op='!=') right=PredicateComparison)
	 */
	protected void sequence_PredicateEquality(EObject context, PredicateEquality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateMultiplication_PredicateMul_1_0 right=PredicateDivision)
	 */
	protected void sequence_PredicateMultiplication(EObject context, PredicateMul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_MUL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_MUL__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_MUL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_MUL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPredicateMultiplicationAccess().getRightPredicateDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateOr_PredicateOr_1_0 right=PredicateAnd)
	 */
	protected void sequence_PredicateOr(EObject context, PredicateOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPredicateOrAccess().getRightPredicateAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=PredicatePrimary
	 */
	protected void sequence_PredicatePrimary(EObject context, PredicateNot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicatePrimaryAccess().getExpressionPredicatePrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=Predicate ref=PrimaryProcess)
	 */
	protected void sequence_PredicateProcess(EObject context, PredicateProcess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_PROCESS__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_PROCESS__PREDICATE));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_PROCESS__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_PROCESS__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.accept(grammarAccess.getPredicateProcessAccess().getRefPrimaryProcessParserRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=Ref
	 */
	protected void sequence_PredicateStoreReference(EObject context, PredicateStoreReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PredicateSubtraction_PredicateSub_1_0 right=PredicateAddition)
	 */
	protected void sequence_PredicateSubtraction(EObject context, PredicateSub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_SUB__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE_SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE_SUB__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPredicateSubtractionAccess().getRightPredicateAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     predicate=PredicateExpression
	 */
	protected void sequence_Predicate(EObject context, Predicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PREDICATE__PREDICATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=UPPER value=ProcessExpression)
	 */
	protected void sequence_Process(EObject context, eu.quanticol.cASPA.Process semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PROCESS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PROCESS__NAME));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.PROCESS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.PROCESS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessAccess().getNameUPPERTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LOWER
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Process|UPPER]
	 */
	protected void sequence_ReferencedProcess(EObject context, ReferencedProcess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.REFERENCED_PROCESS__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.REFERENCED_PROCESS__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferencedProcessAccess().getRefProcessUPPERTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LOWER
	 */
	protected void sequence_SelfReference(EObject context, SelfReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=UpdateReference assigner=UpdateExpression)
	 */
	protected void sequence_SingleEventUpdate(EObject context, LocalSingleEventUpdate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LOWER value=Natural)
	 */
	protected void sequence_Store(EObject context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=ReferencedProcess stores+=Store stores+=Store*)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=Ref
	 */
	protected void sequence_UniformReference(EObject context, UniformReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Natural
	 */
	protected void sequence_Uniform(EObject context, UniformNatural semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UpdateAddition_UpdatePlu_1_0 right=UpdateMultiplication)
	 */
	protected void sequence_UpdateAddition(EObject context, UpdatePlu semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_PLU__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_PLU__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_PLU__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_PLU__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUpdateAdditionAccess().getRightUpdateMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Natural
	 */
	protected void sequence_UpdateAtomic(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateAtomicAccess().getValueNaturalParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UpdateDivision_UpdateDiv_1_0 right=UpdatePrimary)
	 */
	protected void sequence_UpdateDivision(EObject context, UpdateDiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUpdateDivisionAccess().getRightUpdatePrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=Ref
	 */
	protected void sequence_UpdateExpressionStoreReference(EObject context, UpdateExpressionStoreReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UpdateMultiplication_UpdateMul_1_0 right=UpdateDivision)
	 */
	protected void sequence_UpdateMultiplication(EObject context, UpdateMul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_MUL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_MUL__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_MUL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_MUL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUpdateMultiplicationAccess().getRightUpdateDivisionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=Ref
	 */
	protected void sequence_UpdateReference(EObject context, UpdateStoreReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UpdateSubtraction_UpdateSub_1_0 right=UpdateAddition)
	 */
	protected void sequence_UpdateSubtraction(EObject context, UpdateSub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_SUB__LEFT));
			if(transientValues.isValueTransient(semanticObject, CASPAPackage.Literals.UPDATE_SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CASPAPackage.Literals.UPDATE_SUB__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUpdateSubtractionAccess().getRightUpdateAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (updates+=Update updates+=Update*)
	 */
	protected void sequence_Updates(EObject context, Updates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
