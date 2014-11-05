/*
* generated by Xtext
*/
package fr.istic.idm.project.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class UIDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PollSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PollSystem");
		private final Assignment cPollsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPollsPollParserRuleCall_0 = (RuleCall)cPollsAssignment.eContents().get(0);
		
		//PollSystem:
		//	polls+=Poll*;
		public ParserRule getRule() { return rule; }

		//polls+=Poll*
		public Assignment getPollsAssignment() { return cPollsAssignment; }

		//Poll
		public RuleCall getPollsPollParserRuleCall_0() { return cPollsPollParserRuleCall_0; }
	}

	public class PollElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Poll");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPollKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuestionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuestionsQuestionParserRuleCall_3_0 = (RuleCall)cQuestionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Poll:
		//	"Poll" name=ID? "{" questions+=Question+ "}";
		public ParserRule getRule() { return rule; }

		//"Poll" name=ID? "{" questions+=Question+ "}"
		public Group getGroup() { return cGroup; }

		//"Poll"
		public Keyword getPollKeyword_0() { return cPollKeyword_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//questions+=Question+
		public Assignment getQuestionsAssignment_3() { return cQuestionsAssignment_3; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_3_0() { return cQuestionsQuestionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cOptionsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cOptionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOptionsOptionParserRuleCall_4_0 = (RuleCall)cOptionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Question:
		//	"Question" id=ID? "{" "options" options+=Option+ "}";
		public ParserRule getRule() { return rule; }

		//"Question" id=ID? "{" "options" options+=Option+ "}"
		public Group getGroup() { return cGroup; }

		//"Question"
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }

		//id=ID?
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"options"
		public Keyword getOptionsKeyword_3() { return cOptionsKeyword_3; }

		//options+=Option+
		public Assignment getOptionsAssignment_4() { return cOptionsAssignment_4; }

		//Option
		public RuleCall getOptionsOptionParserRuleCall_4_0() { return cOptionsOptionParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class OptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Option");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cIdIDTerminalRuleCall_0_0_0 = (RuleCall)cIdAssignment_0_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Option:
		//	(id=ID "->")? type=Type;
		public ParserRule getRule() { return rule; }

		//(id=ID "->")? type=Type
		public Group getGroup() { return cGroup; }

		//(id=ID "->")?
		public Group getGroup_0() { return cGroup_0; }

		//id=ID
		public Assignment getIdAssignment_0_0() { return cIdAssignment_0_0; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_0_0_0() { return cIdIDTerminalRuleCall_0_0_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_0_1() { return cHyphenMinusGreaterThanSignKeyword_0_1; }

		//type=Type
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//Type
		public RuleCall getTypeTypeEnumRuleCall_1_0() { return cTypeTypeEnumRuleCall_1_0; }
	}
	
	
	public class TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCheckBoxEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCheckBox0Keyword_0_0 = (Keyword)cCheckBoxEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRadioButtonEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRadioButton1Keyword_1_0 = (Keyword)cRadioButtonEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cComboBoxEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cComboBox2Keyword_2_0 = (Keyword)cComboBoxEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cTextBoxEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cTextBox3Keyword_3_0 = (Keyword)cTextBoxEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cImageEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cImage4Keyword_4_0 = (Keyword)cImageEnumLiteralDeclaration_4.eContents().get(0);
		
		////CheckBox:
		////	checkBox = 'Checkbox' '{' default=ID? '}'
		////;
		////
		////RadioButton:
		////	radioButton = 'RadioButton' '{' default=ID? '}'
		////;
		////
		////ComboBox:
		////	comboBox = 'ComboBoxItem' '{' default=ID? '}'
		////;
		////
		////TextBox:
		////	textBox = 'TextBox' '{' default=ID? '}'
		////;
		////
		////Image:
		////	'Image' '{' default=ID? url=STRING '}'
		////; enum Type:
		//	CheckBox="0" | RadioButton="1" | ComboBox="2" | TextBox="3" | Image="4";
		public EnumRule getRule() { return rule; }

		//CheckBox="0" | RadioButton="1" | ComboBox="2" | TextBox="3" | Image="4"
		public Alternatives getAlternatives() { return cAlternatives; }

		//CheckBox="0"
		public EnumLiteralDeclaration getCheckBoxEnumLiteralDeclaration_0() { return cCheckBoxEnumLiteralDeclaration_0; }

		//"0"
		public Keyword getCheckBox0Keyword_0_0() { return cCheckBox0Keyword_0_0; }

		//RadioButton="1"
		public EnumLiteralDeclaration getRadioButtonEnumLiteralDeclaration_1() { return cRadioButtonEnumLiteralDeclaration_1; }

		//"1"
		public Keyword getRadioButton1Keyword_1_0() { return cRadioButton1Keyword_1_0; }

		//ComboBox="2"
		public EnumLiteralDeclaration getComboBoxEnumLiteralDeclaration_2() { return cComboBoxEnumLiteralDeclaration_2; }

		//"2"
		public Keyword getComboBox2Keyword_2_0() { return cComboBox2Keyword_2_0; }

		//TextBox="3"
		public EnumLiteralDeclaration getTextBoxEnumLiteralDeclaration_3() { return cTextBoxEnumLiteralDeclaration_3; }

		//"3"
		public Keyword getTextBox3Keyword_3_0() { return cTextBox3Keyword_3_0; }

		//Image="4"
		public EnumLiteralDeclaration getImageEnumLiteralDeclaration_4() { return cImageEnumLiteralDeclaration_4; }

		//"4"
		public Keyword getImage4Keyword_4_0() { return cImage4Keyword_4_0; }
	}
	
	private final PollSystemElements pPollSystem;
	private final PollElements pPoll;
	private final QuestionElements pQuestion;
	private final OptionElements pOption;
	private final TypeElements unknownRuleType;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UIDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPollSystem = new PollSystemElements();
		this.pPoll = new PollElements();
		this.pQuestion = new QuestionElements();
		this.pOption = new OptionElements();
		this.unknownRuleType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.istic.idm.project.UIDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PollSystem:
	//	polls+=Poll*;
	public PollSystemElements getPollSystemAccess() {
		return pPollSystem;
	}
	
	public ParserRule getPollSystemRule() {
		return getPollSystemAccess().getRule();
	}

	//Poll:
	//	"Poll" name=ID? "{" questions+=Question+ "}";
	public PollElements getPollAccess() {
		return pPoll;
	}
	
	public ParserRule getPollRule() {
		return getPollAccess().getRule();
	}

	//Question:
	//	"Question" id=ID? "{" "options" options+=Option+ "}";
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//Option:
	//	(id=ID "->")? type=Type;
	public OptionElements getOptionAccess() {
		return pOption;
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}

	////CheckBox:
	////	checkBox = 'Checkbox' '{' default=ID? '}'
	////;
	////
	////RadioButton:
	////	radioButton = 'RadioButton' '{' default=ID? '}'
	////;
	////
	////ComboBox:
	////	comboBox = 'ComboBoxItem' '{' default=ID? '}'
	////;
	////
	////TextBox:
	////	textBox = 'TextBox' '{' default=ID? '}'
	////;
	////
	////Image:
	////	'Image' '{' default=ID? url=STRING '}'
	////; enum Type:
	//	CheckBox="0" | RadioButton="1" | ComboBox="2" | TextBox="3" | Image="4";
	public TypeElements getTypeAccess() {
		return unknownRuleType;
	}
	
	public EnumRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
