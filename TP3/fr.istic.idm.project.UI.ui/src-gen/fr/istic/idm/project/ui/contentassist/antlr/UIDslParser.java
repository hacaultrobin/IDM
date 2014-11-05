/*
* generated by Xtext
*/
package fr.istic.idm.project.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.istic.idm.project.services.UIDslGrammarAccess;

public class UIDslParser extends AbstractContentAssistParser {
	
	@Inject
	private UIDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.istic.idm.project.ui.contentassist.antlr.internal.InternalUIDslParser createParser() {
		fr.istic.idm.project.ui.contentassist.antlr.internal.InternalUIDslParser result = new fr.istic.idm.project.ui.contentassist.antlr.internal.InternalUIDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getPollAccess().getGroup(), "rule__Poll__Group__0");
					put(grammarAccess.getQuestionAccess().getGroup(), "rule__Question__Group__0");
					put(grammarAccess.getOptionAccess().getGroup(), "rule__Option__Group__0");
					put(grammarAccess.getOptionAccess().getGroup_0(), "rule__Option__Group_0__0");
					put(grammarAccess.getPollSystemAccess().getPollsAssignment(), "rule__PollSystem__PollsAssignment");
					put(grammarAccess.getPollAccess().getNameAssignment_1(), "rule__Poll__NameAssignment_1");
					put(grammarAccess.getPollAccess().getQuestionsAssignment_3(), "rule__Poll__QuestionsAssignment_3");
					put(grammarAccess.getQuestionAccess().getIdAssignment_1(), "rule__Question__IdAssignment_1");
					put(grammarAccess.getQuestionAccess().getOptionsAssignment_4(), "rule__Question__OptionsAssignment_4");
					put(grammarAccess.getOptionAccess().getIdAssignment_0_0(), "rule__Option__IdAssignment_0_0");
					put(grammarAccess.getOptionAccess().getTypeAssignment_1(), "rule__Option__TypeAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.istic.idm.project.ui.contentassist.antlr.internal.InternalUIDslParser typedParser = (fr.istic.idm.project.ui.contentassist.antlr.internal.InternalUIDslParser) parser;
			typedParser.entryRulePollSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public UIDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(UIDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
