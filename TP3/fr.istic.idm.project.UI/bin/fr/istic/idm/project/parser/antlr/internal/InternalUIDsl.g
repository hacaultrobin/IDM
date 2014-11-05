/*
* generated by Xtext
*/
grammar InternalUIDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.istic.idm.project.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.istic.idm.project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.idm.project.services.UIDslGrammarAccess;

}

@parser::members {

 	private UIDslGrammarAccess grammarAccess;
 	
    public InternalUIDslParser(TokenStream input, UIDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "PollSystem";	
   	}
   	
   	@Override
   	protected UIDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulePollSystem
entryRulePollSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPollSystemRule()); }
	 iv_rulePollSystem=rulePollSystem 
	 { $current=$iv_rulePollSystem.current; } 
	 EOF 
;

// Rule PollSystem
rulePollSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); 
	    }
		lv_polls_0_0=rulePoll		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPollSystemRule());
	        }
       		add(
       			$current, 
       			"polls",
        		lv_polls_0_0, 
        		"Poll");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRulePoll
entryRulePoll returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPollRule()); }
	 iv_rulePoll=rulePoll 
	 { $current=$iv_rulePoll.current; } 
	 EOF 
;

// Rule Poll
rulePoll returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Poll' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPollRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)?	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPollRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Question' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
    }
(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)?	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='options' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getOptionsKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
	    }
		lv_options_4_0=ruleOption		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_4_0, 
        		"Option");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleOption
entryRuleOption returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionRule()); }
	 iv_ruleOption=ruleOption 
	 { $current=$iv_ruleOption.current; } 
	 EOF 
;

// Rule Option
ruleOption returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_id_0_0=RULE_ID
		{
			newLeafNode(lv_id_0_0, grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"ID");
	    }

)
)	otherlv_1='->' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionAccess().getTypeTypeEnumRuleCall_1_0()); 
	    }
		lv_type_2_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Rule Type
ruleType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='0' 
	{
        $current = grammarAccess.getTypeAccess().getCheckBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCheckBoxEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='1' 
	{
        $current = grammarAccess.getTypeAccess().getRadioButtonEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getRadioButtonEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='2' 
	{
        $current = grammarAccess.getTypeAccess().getComboBoxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getComboBoxEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='3' 
	{
        $current = grammarAccess.getTypeAccess().getTextBoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getTextBoxEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='4' 
	{
        $current = grammarAccess.getTypeAccess().getImageEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getImageEnumLiteralDeclaration_4()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


