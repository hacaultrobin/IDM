/*
* generated by Xtext
*/
grammar InternalPollDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package fr.istic.idm.project.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.istic.idm.project.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.istic.idm.project.services.PollDslGrammarAccess;

}

@parser::members {
 
 	private PollDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PollDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRulePollSystem
entryRulePollSystem 
:
{ before(grammarAccess.getPollSystemRule()); }
	 rulePollSystem
{ after(grammarAccess.getPollSystemRule()); } 
	 EOF 
;

// Rule PollSystem
rulePollSystem
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPollSystemAccess().getPollsAssignment()); }
(rule__PollSystem__PollsAssignment)*
{ after(grammarAccess.getPollSystemAccess().getPollsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePoll
entryRulePoll 
:
{ before(grammarAccess.getPollRule()); }
	 rulePoll
{ after(grammarAccess.getPollRule()); } 
	 EOF 
;

// Rule Poll
rulePoll
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPollAccess().getGroup()); }
(rule__Poll__Group__0)
{ after(grammarAccess.getPollAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQuestion
entryRuleQuestion 
:
{ before(grammarAccess.getQuestionRule()); }
	 ruleQuestion
{ after(grammarAccess.getQuestionRule()); } 
	 EOF 
;

// Rule Question
ruleQuestion
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQuestionAccess().getGroup()); }
(rule__Question__Group__0)
{ after(grammarAccess.getQuestionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOption
entryRuleOption 
:
{ before(grammarAccess.getOptionRule()); }
	 ruleOption
{ after(grammarAccess.getOptionRule()); } 
	 EOF 
;

// Rule Option
ruleOption
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOptionAccess().getGroup()); }
(rule__Option__Group__0)
{ after(grammarAccess.getOptionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Poll__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poll__Group__0__Impl
	rule__Poll__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollAccess().getPollKeyword_0()); }

	'Poll' 

{ after(grammarAccess.getPollAccess().getPollKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poll__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poll__Group__1__Impl
	rule__Poll__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollAccess().getNameAssignment_1()); }
(rule__Poll__NameAssignment_1)?
{ after(grammarAccess.getPollAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poll__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poll__Group__2__Impl
	rule__Poll__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poll__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poll__Group__3__Impl
	rule__Poll__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); }
(rule__Poll__QuestionsAssignment_3)
{ after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); }
)
(
{ before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); }
(rule__Poll__QuestionsAssignment_3)*
{ after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poll__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poll__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Question__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__0__Impl
	rule__Question__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }

	'Question' 

{ after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__1__Impl
	rule__Question__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getIdAssignment_1()); }
(rule__Question__IdAssignment_1)?
{ after(grammarAccess.getQuestionAccess().getIdAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__2__Impl
	rule__Question__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__3__Impl
	rule__Question__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getContentAssignment_3()); }
(rule__Question__ContentAssignment_3)
{ after(grammarAccess.getQuestionAccess().getContentAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__4__Impl
	rule__Question__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getOptionsKeyword_4()); }

	'options' 

{ after(grammarAccess.getQuestionAccess().getOptionsKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__5__Impl
	rule__Question__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); }
(rule__Question__OptionsAssignment_5)
{ after(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); }
)
(
{ before(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); }
(rule__Question__OptionsAssignment_5)*
{ after(grammarAccess.getQuestionAccess().getOptionsAssignment_5()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Question__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Option__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Option__Group__0__Impl
	rule__Option__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionAccess().getGroup_0()); }
(rule__Option__Group_0__0)?
{ after(grammarAccess.getOptionAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Option__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Option__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionAccess().getContentAssignment_1()); }
(rule__Option__ContentAssignment_1)
{ after(grammarAccess.getOptionAccess().getContentAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Option__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Option__Group_0__0__Impl
	rule__Option__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionAccess().getIdAssignment_0_0()); }
(rule__Option__IdAssignment_0_0)
{ after(grammarAccess.getOptionAccess().getIdAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Option__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Option__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Option__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); }

	'->' 

{ after(grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__PollSystem__PollsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); }
	rulePoll{ after(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Poll__QuestionsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); }
	ruleQuestion{ after(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Question__IdAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Question__ContentAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getContentSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getQuestionAccess().getContentSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Question__OptionsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_5_0()); }
	ruleOption{ after(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Option__IdAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); }
	RULE_ID{ after(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Option__ContentAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionAccess().getContentSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getOptionAccess().getContentSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


