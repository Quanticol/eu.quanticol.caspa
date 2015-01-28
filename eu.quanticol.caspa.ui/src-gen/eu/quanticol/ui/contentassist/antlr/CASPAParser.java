/*
* generated by Xtext
*/
package eu.quanticol.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import eu.quanticol.services.CASPAGrammarAccess;

public class CASPAParser extends AbstractContentAssistParser {
	
	@Inject
	private CASPAGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected eu.quanticol.ui.contentassist.antlr.internal.InternalCASPAParser createParser() {
		eu.quanticol.ui.contentassist.antlr.internal.InternalCASPAParser result = new eu.quanticol.ui.contentassist.antlr.internal.InternalCASPAParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStoreRefAccess().getAlternatives(), "rule__StoreRef__Alternatives");
					put(grammarAccess.getActionAccess().getAlternatives_0(), "rule__Action__Alternatives_0");
					put(grammarAccess.getPredicateEqualityAccess().getOpAlternatives_1_1_0(), "rule__PredicateEquality__OpAlternatives_1_1_0");
					put(grammarAccess.getPredicateComparisonAccess().getOpAlternatives_1_1_0(), "rule__PredicateComparison__OpAlternatives_1_1_0");
					put(grammarAccess.getPredicatePrimaryAccess().getAlternatives(), "rule__PredicatePrimary__Alternatives");
					put(grammarAccess.getPredicateAtomicAccess().getAlternatives(), "rule__PredicateAtomic__Alternatives");
					put(grammarAccess.getArgumentsAccess().getAlternatives(), "rule__Arguments__Alternatives");
					put(grammarAccess.getExpressionsAccess().getAlternatives(), "rule__Expressions__Alternatives");
					put(grammarAccess.getVariablesAccess().getAlternatives(), "rule__Variables__Alternatives");
					put(grammarAccess.getUpdateAccess().getAlternatives(), "rule__Update__Alternatives");
					put(grammarAccess.getDistributedEventUpdateAccess().getAlternatives(), "rule__DistributedEventUpdate__Alternatives");
					put(grammarAccess.getUpdatePrimaryAccess().getAlternatives(), "rule__UpdatePrimary__Alternatives");
					put(grammarAccess.getUpdateAtomicAccess().getAlternatives(), "rule__UpdateAtomic__Alternatives");
					put(grammarAccess.getPrimaryProcessAccess().getAlternatives(), "rule__PrimaryProcess__Alternatives");
					put(grammarAccess.getAtomicProcessAccess().getAlternatives(), "rule__AtomicProcess__Alternatives");
					put(grammarAccess.getBoolAccess().getAlternatives_1(), "rule__Bool__Alternatives_1");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
					put(grammarAccess.getReferencedStoreAccess().getGroup(), "rule__ReferencedStore__Group__0");
					put(grammarAccess.getSelfReferencedStoreAccess().getGroup(), "rule__SelfReferencedStore__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_0_0(), "rule__Action__Group_0_0__0");
					put(grammarAccess.getActionAccess().getGroup_0_1(), "rule__Action__Group_0_1__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getPredicateOrAccess().getGroup(), "rule__PredicateOr__Group__0");
					put(grammarAccess.getPredicateOrAccess().getGroup_1(), "rule__PredicateOr__Group_1__0");
					put(grammarAccess.getPredicateAndAccess().getGroup(), "rule__PredicateAnd__Group__0");
					put(grammarAccess.getPredicateAndAccess().getGroup_1(), "rule__PredicateAnd__Group_1__0");
					put(grammarAccess.getPredicateEqualityAccess().getGroup(), "rule__PredicateEquality__Group__0");
					put(grammarAccess.getPredicateEqualityAccess().getGroup_1(), "rule__PredicateEquality__Group_1__0");
					put(grammarAccess.getPredicateComparisonAccess().getGroup(), "rule__PredicateComparison__Group__0");
					put(grammarAccess.getPredicateComparisonAccess().getGroup_1(), "rule__PredicateComparison__Group_1__0");
					put(grammarAccess.getPredicateSubtractionAccess().getGroup(), "rule__PredicateSubtraction__Group__0");
					put(grammarAccess.getPredicateSubtractionAccess().getGroup_1(), "rule__PredicateSubtraction__Group_1__0");
					put(grammarAccess.getPredicateAdditionAccess().getGroup(), "rule__PredicateAddition__Group__0");
					put(grammarAccess.getPredicateAdditionAccess().getGroup_1(), "rule__PredicateAddition__Group_1__0");
					put(grammarAccess.getPredicateMultiplicationAccess().getGroup(), "rule__PredicateMultiplication__Group__0");
					put(grammarAccess.getPredicateMultiplicationAccess().getGroup_1(), "rule__PredicateMultiplication__Group_1__0");
					put(grammarAccess.getPredicateDivisionAccess().getGroup(), "rule__PredicateDivision__Group__0");
					put(grammarAccess.getPredicateDivisionAccess().getGroup_1(), "rule__PredicateDivision__Group_1__0");
					put(grammarAccess.getPredicatePrimaryAccess().getGroup_0(), "rule__PredicatePrimary__Group_0__0");
					put(grammarAccess.getPredicatePrimaryAccess().getGroup_1(), "rule__PredicatePrimary__Group_1__0");
					put(grammarAccess.getPredicateAtomicAccess().getGroup_0(), "rule__PredicateAtomic__Group_0__0");
					put(grammarAccess.getPredicateAtomicAccess().getGroup_1(), "rule__PredicateAtomic__Group_1__0");
					put(grammarAccess.getArgumentsAccess().getGroup_0(), "rule__Arguments__Group_0__0");
					put(grammarAccess.getArgumentsAccess().getGroup_0_3(), "rule__Arguments__Group_0_3__0");
					put(grammarAccess.getArgumentsAccess().getGroup_1(), "rule__Arguments__Group_1__0");
					put(grammarAccess.getArgumentsAccess().getGroup_1_3(), "rule__Arguments__Group_1_3__0");
					put(grammarAccess.getExpressionsAccess().getGroup_1(), "rule__Expressions__Group_1__0");
					put(grammarAccess.getVariablesAccess().getGroup_1(), "rule__Variables__Group_1__0");
					put(grammarAccess.getUpdatesAccess().getGroup(), "rule__Updates__Group__0");
					put(grammarAccess.getUpdatesAccess().getGroup_3(), "rule__Updates__Group_3__0");
					put(grammarAccess.getSingleEventUpdateAccess().getGroup(), "rule__SingleEventUpdate__Group__0");
					put(grammarAccess.getDistributedEventUpdateAccess().getGroup_0(), "rule__DistributedEventUpdate__Group_0__0");
					put(grammarAccess.getDistributedEventUpdateAccess().getGroup_0_6(), "rule__DistributedEventUpdate__Group_0_6__0");
					put(grammarAccess.getDistributedEventUpdateAccess().getGroup_1(), "rule__DistributedEventUpdate__Group_1__0");
					put(grammarAccess.getDistributedEventUpdateAccess().getGroup_1_6(), "rule__DistributedEventUpdate__Group_1_6__0");
					put(grammarAccess.getDistributionAccess().getGroup(), "rule__Distribution__Group__0");
					put(grammarAccess.getUniformAccess().getGroup(), "rule__Uniform__Group__0");
					put(grammarAccess.getUpdateSubtractionAccess().getGroup(), "rule__UpdateSubtraction__Group__0");
					put(grammarAccess.getUpdateSubtractionAccess().getGroup_1(), "rule__UpdateSubtraction__Group_1__0");
					put(grammarAccess.getUpdateAdditionAccess().getGroup(), "rule__UpdateAddition__Group__0");
					put(grammarAccess.getUpdateAdditionAccess().getGroup_1(), "rule__UpdateAddition__Group_1__0");
					put(grammarAccess.getUpdateMultiplicationAccess().getGroup(), "rule__UpdateMultiplication__Group__0");
					put(grammarAccess.getUpdateMultiplicationAccess().getGroup_1(), "rule__UpdateMultiplication__Group_1__0");
					put(grammarAccess.getUpdateDivisionAccess().getGroup(), "rule__UpdateDivision__Group__0");
					put(grammarAccess.getUpdateDivisionAccess().getGroup_1(), "rule__UpdateDivision__Group_1__0");
					put(grammarAccess.getUpdatePrimaryAccess().getGroup_0(), "rule__UpdatePrimary__Group_0__0");
					put(grammarAccess.getUpdateAtomicAccess().getGroup_0(), "rule__UpdateAtomic__Group_0__0");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getParallelAccess().getGroup(), "rule__Parallel__Group__0");
					put(grammarAccess.getParallelAccess().getGroup_1(), "rule__Parallel__Group_1__0");
					put(grammarAccess.getChoiceAccess().getGroup(), "rule__Choice__Group__0");
					put(grammarAccess.getChoiceAccess().getGroup_1(), "rule__Choice__Group_1__0");
					put(grammarAccess.getPrimaryProcessAccess().getGroup_0(), "rule__PrimaryProcess__Group_0__0");
					put(grammarAccess.getAtomicProcessAccess().getGroup_0(), "rule__AtomicProcess__Group_0__0");
					put(grammarAccess.getAtomicProcessAccess().getGroup_1(), "rule__AtomicProcess__Group_1__0");
					put(grammarAccess.getPredicateProcessAccess().getGroup(), "rule__PredicateProcess__Group__0");
					put(grammarAccess.getActionProcessAccess().getGroup(), "rule__ActionProcess__Group__0");
					put(grammarAccess.getReferencedProcessAccess().getGroup(), "rule__ReferencedProcess__Group__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_5(), "rule__Term__Group_5__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup_1(), "rule__Double__Group_1__0");
					put(grammarAccess.getDoubleAccess().getGroup_1_2(), "rule__Double__Group_1_2__0");
					put(grammarAccess.getBoolAccess().getGroup(), "rule__Bool__Group__0");
					put(grammarAccess.getModelAccess().getTermsAssignment_0(), "rule__Model__TermsAssignment_0");
					put(grammarAccess.getModelAccess().getProcessesAssignment_1(), "rule__Model__ProcessesAssignment_1");
					put(grammarAccess.getStoreAccess().getNameAssignment_1(), "rule__Store__NameAssignment_1");
					put(grammarAccess.getStoreAccess().getValueAssignment_3(), "rule__Store__ValueAssignment_3");
					put(grammarAccess.getReferencedStoreAccess().getNameAssignment_1(), "rule__ReferencedStore__NameAssignment_1");
					put(grammarAccess.getSelfReferencedStoreAccess().getNameAssignment_2(), "rule__SelfReferencedStore__NameAssignment_2");
					put(grammarAccess.getActionAccess().getNameAssignment_0_0_1(), "rule__Action__NameAssignment_0_0_1");
					put(grammarAccess.getActionAccess().getNameAssignment_0_1_1(), "rule__Action__NameAssignment_0_1_1");
					put(grammarAccess.getActionAccess().getPredicateAssignment_1(), "rule__Action__PredicateAssignment_1");
					put(grammarAccess.getActionAccess().getArgumentsAssignment_2(), "rule__Action__ArgumentsAssignment_2");
					put(grammarAccess.getActionAccess().getUpdatesAssignment_3(), "rule__Action__UpdatesAssignment_3");
					put(grammarAccess.getPredicateAccess().getPredicateAssignment_2(), "rule__Predicate__PredicateAssignment_2");
					put(grammarAccess.getPredicateOrAccess().getRightAssignment_1_2(), "rule__PredicateOr__RightAssignment_1_2");
					put(grammarAccess.getPredicateAndAccess().getRightAssignment_1_2(), "rule__PredicateAnd__RightAssignment_1_2");
					put(grammarAccess.getPredicateEqualityAccess().getOpAssignment_1_1(), "rule__PredicateEquality__OpAssignment_1_1");
					put(grammarAccess.getPredicateEqualityAccess().getRightAssignment_1_2(), "rule__PredicateEquality__RightAssignment_1_2");
					put(grammarAccess.getPredicateComparisonAccess().getOpAssignment_1_1(), "rule__PredicateComparison__OpAssignment_1_1");
					put(grammarAccess.getPredicateComparisonAccess().getRightAssignment_1_2(), "rule__PredicateComparison__RightAssignment_1_2");
					put(grammarAccess.getPredicateSubtractionAccess().getRightAssignment_1_2(), "rule__PredicateSubtraction__RightAssignment_1_2");
					put(grammarAccess.getPredicateAdditionAccess().getRightAssignment_1_2(), "rule__PredicateAddition__RightAssignment_1_2");
					put(grammarAccess.getPredicateMultiplicationAccess().getRightAssignment_1_2(), "rule__PredicateMultiplication__RightAssignment_1_2");
					put(grammarAccess.getPredicateDivisionAccess().getRightAssignment_1_2(), "rule__PredicateDivision__RightAssignment_1_2");
					put(grammarAccess.getPredicatePrimaryAccess().getExpressionAssignment_1_2(), "rule__PredicatePrimary__ExpressionAssignment_1_2");
					put(grammarAccess.getPredicateAtomicAccess().getValueAssignment_0_1(), "rule__PredicateAtomic__ValueAssignment_0_1");
					put(grammarAccess.getPredicateAtomicAccess().getValueAssignment_1_1(), "rule__PredicateAtomic__ValueAssignment_1_1");
					put(grammarAccess.getArgumentsAccess().getExpressionsAssignment_0_2(), "rule__Arguments__ExpressionsAssignment_0_2");
					put(grammarAccess.getArgumentsAccess().getExpressionsAssignment_0_3_1(), "rule__Arguments__ExpressionsAssignment_0_3_1");
					put(grammarAccess.getArgumentsAccess().getExpressionsAssignment_1_2(), "rule__Arguments__ExpressionsAssignment_1_2");
					put(grammarAccess.getArgumentsAccess().getExpressionsAssignment_1_3_1(), "rule__Arguments__ExpressionsAssignment_1_3_1");
					put(grammarAccess.getExpressionsAccess().getValueAssignment_1_1(), "rule__Expressions__ValueAssignment_1_1");
					put(grammarAccess.getVariablesAccess().getValueAssignment_1_1(), "rule__Variables__ValueAssignment_1_1");
					put(grammarAccess.getUpdatesAccess().getUpdatesAssignment_2(), "rule__Updates__UpdatesAssignment_2");
					put(grammarAccess.getUpdatesAccess().getUpdatesAssignment_3_1(), "rule__Updates__UpdatesAssignment_3_1");
					put(grammarAccess.getSingleEventUpdateAccess().getNameAssignment_1(), "rule__SingleEventUpdate__NameAssignment_1");
					put(grammarAccess.getSingleEventUpdateAccess().getExpressionAssignment_3(), "rule__SingleEventUpdate__ExpressionAssignment_3");
					put(grammarAccess.getDistributedEventUpdateAccess().getNameAssignment_0_1(), "rule__DistributedEventUpdate__NameAssignment_0_1");
					put(grammarAccess.getDistributedEventUpdateAccess().getDistributionAssignment_0_5(), "rule__DistributedEventUpdate__DistributionAssignment_0_5");
					put(grammarAccess.getDistributedEventUpdateAccess().getDistributionAssignment_0_6_1(), "rule__DistributedEventUpdate__DistributionAssignment_0_6_1");
					put(grammarAccess.getDistributedEventUpdateAccess().getNameAssignment_1_1(), "rule__DistributedEventUpdate__NameAssignment_1_1");
					put(grammarAccess.getDistributedEventUpdateAccess().getDistributionAssignment_1_5(), "rule__DistributedEventUpdate__DistributionAssignment_1_5");
					put(grammarAccess.getDistributedEventUpdateAccess().getDistributionAssignment_1_6_1(), "rule__DistributedEventUpdate__DistributionAssignment_1_6_1");
					put(grammarAccess.getDistributionAccess().getProbAssignment_1(), "rule__Distribution__ProbAssignment_1");
					put(grammarAccess.getDistributionAccess().getExpressionAssignment_3(), "rule__Distribution__ExpressionAssignment_3");
					put(grammarAccess.getUniformAccess().getExpressionAssignment_1(), "rule__Uniform__ExpressionAssignment_1");
					put(grammarAccess.getUpdateSubtractionAccess().getRightAssignment_1_2(), "rule__UpdateSubtraction__RightAssignment_1_2");
					put(grammarAccess.getUpdateAdditionAccess().getRightAssignment_1_2(), "rule__UpdateAddition__RightAssignment_1_2");
					put(grammarAccess.getUpdateMultiplicationAccess().getRightAssignment_1_2(), "rule__UpdateMultiplication__RightAssignment_1_2");
					put(grammarAccess.getUpdateDivisionAccess().getRightAssignment_1_2(), "rule__UpdateDivision__RightAssignment_1_2");
					put(grammarAccess.getUpdateAtomicAccess().getValueAssignment_0_1(), "rule__UpdateAtomic__ValueAssignment_0_1");
					put(grammarAccess.getProcessAccess().getNameAssignment_0(), "rule__Process__NameAssignment_0");
					put(grammarAccess.getProcessAccess().getValueAssignment_2(), "rule__Process__ValueAssignment_2");
					put(grammarAccess.getParallelAccess().getRightAssignment_1_2(), "rule__Parallel__RightAssignment_1_2");
					put(grammarAccess.getChoiceAccess().getRightAssignment_1_2(), "rule__Choice__RightAssignment_1_2");
					put(grammarAccess.getAtomicProcessAccess().getValueAssignment_0_1(), "rule__AtomicProcess__ValueAssignment_0_1");
					put(grammarAccess.getAtomicProcessAccess().getValueAssignment_1_1(), "rule__AtomicProcess__ValueAssignment_1_1");
					put(grammarAccess.getPredicateProcessAccess().getPredicateAssignment_1(), "rule__PredicateProcess__PredicateAssignment_1");
					put(grammarAccess.getPredicateProcessAccess().getRefAssignment_2(), "rule__PredicateProcess__RefAssignment_2");
					put(grammarAccess.getActionProcessAccess().getActionAssignment_1(), "rule__ActionProcess__ActionAssignment_1");
					put(grammarAccess.getActionProcessAccess().getRefAssignment_2(), "rule__ActionProcess__RefAssignment_2");
					put(grammarAccess.getReferencedProcessAccess().getNameAssignment_1(), "rule__ReferencedProcess__NameAssignment_1");
					put(grammarAccess.getTermAccess().getProcessesAssignment_1(), "rule__Term__ProcessesAssignment_1");
					put(grammarAccess.getTermAccess().getStoresAssignment_4(), "rule__Term__StoresAssignment_4");
					put(grammarAccess.getTermAccess().getStoresAssignment_5_1(), "rule__Term__StoresAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			eu.quanticol.ui.contentassist.antlr.internal.InternalCASPAParser typedParser = (eu.quanticol.ui.contentassist.antlr.internal.InternalCASPAParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CASPAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CASPAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
