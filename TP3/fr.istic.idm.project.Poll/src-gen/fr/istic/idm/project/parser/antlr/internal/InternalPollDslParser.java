package fr.istic.idm.project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.idm.project.services.PollDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPollDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalPollDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPollDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPollDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g"; }



     	private PollDslGrammarAccess grammarAccess;
     	
        public InternalPollDslParser(TokenStream input, PollDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PollSystem";	
       	}
       	
       	@Override
       	protected PollDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePollSystem"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:67:1: entryRulePollSystem returns [EObject current=null] : iv_rulePollSystem= rulePollSystem EOF ;
    public final EObject entryRulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSystem = null;


        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:68:2: (iv_rulePollSystem= rulePollSystem EOF )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:69:2: iv_rulePollSystem= rulePollSystem EOF
            {
             newCompositeNode(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_rulePollSystem_in_entryRulePollSystem75);
            iv_rulePollSystem=rulePollSystem();

            state._fsp--;

             current =iv_rulePollSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePollSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:76:1: rulePollSystem returns [EObject current=null] : ( (lv_polls_0_0= rulePoll ) )* ;
    public final EObject rulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_polls_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:79:28: ( ( (lv_polls_0_0= rulePoll ) )* )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:80:1: ( (lv_polls_0_0= rulePoll ) )*
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:80:1: ( (lv_polls_0_0= rulePoll ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:81:1: (lv_polls_0_0= rulePoll )
            	    {
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:81:1: (lv_polls_0_0= rulePoll )
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:82:3: lv_polls_0_0= rulePoll
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoll_in_rulePollSystem130);
            	    lv_polls_0_0=rulePoll();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPollSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"polls",
            	            		lv_polls_0_0, 
            	            		"Poll");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRulePoll"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:106:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:107:2: (iv_rulePoll= rulePoll EOF )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:108:2: iv_rulePoll= rulePoll EOF
            {
             newCompositeNode(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_rulePoll_in_entryRulePoll166);
            iv_rulePoll=rulePoll();

            state._fsp--;

             current =iv_rulePoll; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoll176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:115:1: rulePoll returns [EObject current=null] : (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:118:28: ( (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' ) )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:119:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' )
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:119:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:119:3: otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePoll213); 

                	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
                
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:124:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:124:1: (lv_name_1_0= RULE_ID )
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:125:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePoll230); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPollRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePoll248); 

                	newLeafNode(otherlv_2, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:145:1: ( (lv_questions_3_0= ruleQuestion ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:146:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:146:1: (lv_questions_3_0= ruleQuestion )
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:147:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePoll269);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPollRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePoll282); 

                	newLeafNode(otherlv_4, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleQuestion"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:175:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:176:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:177:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion318);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:184:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'options' ( (lv_options_5_0= ruleOption ) )+ otherlv_6= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_options_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:187:28: ( (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'options' ( (lv_options_5_0= ruleOption ) )+ otherlv_6= '}' ) )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:188:1: (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'options' ( (lv_options_5_0= ruleOption ) )+ otherlv_6= '}' )
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:188:1: (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'options' ( (lv_options_5_0= ruleOption ) )+ otherlv_6= '}' )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:188:3: otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'options' ( (lv_options_5_0= ruleOption ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestion365); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:192:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:193:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:193:1: (lv_id_1_0= RULE_ID )
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:194:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion382); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestion400); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:214:1: ( (lv_text_3_0= RULE_STRING ) )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:215:1: (lv_text_3_0= RULE_STRING )
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:215:1: (lv_text_3_0= RULE_STRING )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:216:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion417); 

            			newLeafNode(lv_text_3_0, grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleQuestion434); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getOptionsKeyword_4());
                
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:236:1: ( (lv_options_5_0= ruleOption ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:237:1: (lv_options_5_0= ruleOption )
            	    {
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:237:1: (lv_options_5_0= ruleOption )
            	    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:238:3: lv_options_5_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleQuestion455);
            	    lv_options_5_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_5_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleQuestion468); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:266:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:267:2: (iv_ruleOption= ruleOption EOF )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:268:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption504);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption514); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:275:1: ruleOption returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:278:28: ( ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:279:1: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:279:1: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_text_2_0= RULE_STRING ) ) )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:279:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_text_2_0= RULE_STRING ) )
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:279:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:279:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:279:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:280:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:280:1: (lv_id_0_0= RULE_ID )
                    // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:281:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOption557); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOption574); 

                        	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:301:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:302:1: (lv_text_2_0= RULE_STRING )
            {
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:302:1: (lv_text_2_0= RULE_STRING )
            // ../fr.istic.idm.project.Poll/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalPollDsl.g:303:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOption593); 

            			newLeafNode(lv_text_2_0, grammarAccess.getOptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePollSystem_in_entryRulePollSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_rulePollSystem130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePoll213 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePoll230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePoll248 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePoll269 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePoll282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQuestion365 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion417 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestion434 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleOption_in_ruleQuestion455 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_13_in_ruleQuestion468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOption557 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOption574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOption593 = new BitSet(new long[]{0x0000000000000002L});

}