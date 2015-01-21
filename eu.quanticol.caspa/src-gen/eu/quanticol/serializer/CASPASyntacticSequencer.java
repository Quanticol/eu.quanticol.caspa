package eu.quanticol.serializer;

import com.google.inject.Inject;
import eu.quanticol.services.CASPAGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CASPASyntacticSequencer extends AbstractSyntacticSequencer {

	protected CASPAGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PredicatePrimary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PredicatePrimary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_UpdatePrimary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_UpdatePrimary_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CASPAGrammarAccess) access;
		match_PredicatePrimary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_PredicatePrimary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_UpdatePrimary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_UpdatePrimary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
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
			if(match_PredicatePrimary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PredicatePrimary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PredicatePrimary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PredicatePrimary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UpdatePrimary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_UpdatePrimary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UpdatePrimary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_UpdatePrimary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	
}
