package org.json.serializer;

import com.google.inject.Inject;
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
import org.json.services.JsonGrammarAccess;

@SuppressWarnings("all")
public class JsonSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JsonGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Value_BooleanParserRuleCall_3_or_NullParserRuleCall_4_or_NumberTerminalRuleCall_5_or_STRINGTerminalRuleCall_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JsonGrammarAccess) access;
		match_Value_BooleanParserRuleCall_3_or_NullParserRuleCall_4_or_NumberTerminalRuleCall_5_or_STRINGTerminalRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getBooleanParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getValueAccess().getNullParserRuleCall_4()), new TokenAlias(false, false, grammarAccess.getValueAccess().getNumberTerminalRuleCall_5()), new TokenAlias(false, false, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBooleanRule())
			return getBooleanToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNullRule())
			return getNullToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNumberRule())
			return getNumberToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Boolean:
	 * 	'true' | 'false';
	 */
	protected String getBooleanToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * Null:
	 * 	'null';
	 */
	protected String getNullToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "null";
	}
	
	/**
	 * terminal Number:
	 * 	'-'? INT? '.' INT (('E'|'e') '-'? INT)?;
	 */
	protected String getNumberToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Value_BooleanParserRuleCall_3_or_NullParserRuleCall_4_or_NumberTerminalRuleCall_5_or_STRINGTerminalRuleCall_1.equals(syntax))
				emit_Value_BooleanParserRuleCall_3_or_NullParserRuleCall_4_or_NumberTerminalRuleCall_5_or_STRINGTerminalRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     STRING | Boolean | Null | Number
	 */
	protected void emit_Value_BooleanParserRuleCall_3_or_NullParserRuleCall_4_or_NumberTerminalRuleCall_5_or_STRINGTerminalRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
