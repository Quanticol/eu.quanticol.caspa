package eu.quanticol.serializer;

import com.google.inject.Inject;
import eu.quanticol.services.CASPAGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CASPASyntacticSequencer extends AbstractSyntacticSequencer {

	protected CASPAGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Arguments_CommaKeyword_0_3_0_q;
	protected AbstractElementAlias match_Arguments_CommaKeyword_2_3_0_q;
	protected AbstractElementAlias match_Bool_FalseKeyword_1_1_or_TrueKeyword_1_0;
	protected AbstractElementAlias match_DistributedEventUpdate_CommaKeyword_0_6_0_q;
	protected AbstractElementAlias match_DistributedEventUpdate_CommaKeyword_1_6_0_q;
	protected AbstractElementAlias match_PredicatePrimary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PredicatePrimary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_PrimaryProcess_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PrimaryProcess_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Term_CommaKeyword_5_0_q;
	protected AbstractElementAlias match_UpdatePrimary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_UpdatePrimary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Updates_SemicolonKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CASPAGrammarAccess) access;
		match_Arguments_CommaKeyword_0_3_0_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getCommaKeyword_0_3_0());
		match_Arguments_CommaKeyword_2_3_0_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getCommaKeyword_2_3_0());
		match_Bool_FalseKeyword_1_1_or_TrueKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBoolAccess().getFalseKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getBoolAccess().getTrueKeyword_1_0()));
		match_DistributedEventUpdate_CommaKeyword_0_6_0_q = new TokenAlias(false, true, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_0_6_0());
		match_DistributedEventUpdate_CommaKeyword_1_6_0_q = new TokenAlias(false, true, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_1_6_0());
		match_PredicatePrimary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_PredicatePrimary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryProcess_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryProcessAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryProcess_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryProcessAccess().getLeftParenthesisKeyword_0_0());
		match_Term_CommaKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getTermAccess().getCommaKeyword_5_0());
		match_UpdatePrimary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_UpdatePrimary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Updates_SemicolonKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getUpdatesAccess().getSemicolonKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Arguments_CommaKeyword_0_3_0_q.equals(syntax))
				emit_Arguments_CommaKeyword_0_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Arguments_CommaKeyword_2_3_0_q.equals(syntax))
				emit_Arguments_CommaKeyword_2_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Bool_FalseKeyword_1_1_or_TrueKeyword_1_0.equals(syntax))
				emit_Bool_FalseKeyword_1_1_or_TrueKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DistributedEventUpdate_CommaKeyword_0_6_0_q.equals(syntax))
				emit_DistributedEventUpdate_CommaKeyword_0_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DistributedEventUpdate_CommaKeyword_1_6_0_q.equals(syntax))
				emit_DistributedEventUpdate_CommaKeyword_1_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PredicatePrimary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PredicatePrimary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PredicatePrimary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PredicatePrimary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryProcess_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PrimaryProcess_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryProcess_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PrimaryProcess_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Term_CommaKeyword_5_0_q.equals(syntax))
				emit_Term_CommaKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UpdatePrimary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_UpdatePrimary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UpdatePrimary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_UpdatePrimary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Updates_SemicolonKeyword_3_0_q.equals(syntax))
				emit_Updates_SemicolonKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Arguments_CommaKeyword_0_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Arguments_CommaKeyword_2_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'True' | 'False'
	 */
	protected void emit_Bool_FalseKeyword_1_1_or_TrueKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_DistributedEventUpdate_CommaKeyword_0_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_DistributedEventUpdate_CommaKeyword_1_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_PredicatePrimary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_PredicatePrimary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_PrimaryProcess_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_PrimaryProcess_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Term_CommaKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_UpdatePrimary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_UpdatePrimary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Updates_SemicolonKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
