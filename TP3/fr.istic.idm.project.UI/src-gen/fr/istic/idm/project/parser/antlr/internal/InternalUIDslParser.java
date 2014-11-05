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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUIDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'->'", "'0'", "'1'", "'2'", "'3'", "'4'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalUIDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUIDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUIDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g"; }



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



    // $ANTLR start "entryRulePollSystem"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:68:1: entryRulePollSystem returns [EObject current=null] : iv_rulePollSystem= rulePollSystem EOF ;
    public final EObject entryRulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSystem = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:69:2: (iv_rulePollSystem= rulePollSystem EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:70:2: iv_rulePollSystem= rulePollSystem EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:77:1: rulePollSystem returns [EObject current=null] : ( (lv_polls_0_0= rulePoll ) )* ;
    public final EObject rulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_polls_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:80:28: ( ( (lv_polls_0_0= rulePoll ) )* )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:81:1: ( (lv_polls_0_0= rulePoll ) )*
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:81:1: ( (lv_polls_0_0= rulePoll ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:82:1: (lv_polls_0_0= rulePoll )
            	    {
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:82:1: (lv_polls_0_0= rulePoll )
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:83:3: lv_polls_0_0= rulePoll
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:107:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:108:2: (iv_rulePoll= rulePoll EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:109:2: iv_rulePoll= rulePoll EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:116:1: rulePoll returns [EObject current=null] : (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:119:28: ( (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:120:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:120:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:120:3: otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePoll213); 

                	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:124:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:125:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:125:1: (lv_name_1_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:126:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:146:1: ( (lv_questions_3_0= ruleQuestion ) )+
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
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:147:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:147:1: (lv_questions_3_0= ruleQuestion )
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:148:3: lv_questions_3_0= ruleQuestion
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:176:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:177:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:178:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:185:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:188:28: ( (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:189:1: (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:189:1: (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:189:3: otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestion365); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:193:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:194:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:194:1: (lv_id_1_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:195:3: lv_id_1_0= RULE_ID
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
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleQuestion412); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getOptionsKeyword_3());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:219:1: ( (lv_options_4_0= ruleOption ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=17 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:220:1: (lv_options_4_0= ruleOption )
            	    {
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:220:1: (lv_options_4_0= ruleOption )
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:221:3: lv_options_4_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOption_in_ruleQuestion433);
            	    lv_options_4_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleQuestion446); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:249:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:250:2: (iv_ruleOption= ruleOption EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:251:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption482);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption492); 

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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:258:1: ruleOption returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:28: ( ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:1: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:1: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:263:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:263:1: (lv_id_0_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:264:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOption535); 

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

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOption552); 

                        	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:284:3: ( (lv_type_2_0= ruleType ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:285:1: (lv_type_2_0= ruleType )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:285:1: (lv_type_2_0= ruleType )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:286:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleOption575);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "ruleType"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:310:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:312:28: ( ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:313:1: ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:313:1: ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:313:2: (enumLiteral_0= '0' )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:313:2: (enumLiteral_0= '0' )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:313:4: enumLiteral_0= '0'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleType625); 

                            current = grammarAccess.getTypeAccess().getCheckBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCheckBoxEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:319:6: (enumLiteral_1= '1' )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:319:6: (enumLiteral_1= '1' )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:319:8: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleType642); 

                            current = grammarAccess.getTypeAccess().getRadioButtonEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getRadioButtonEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:325:6: (enumLiteral_2= '2' )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:325:6: (enumLiteral_2= '2' )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:325:8: enumLiteral_2= '2'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_19_in_ruleType659); 

                            current = grammarAccess.getTypeAccess().getComboBoxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getComboBoxEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:331:6: (enumLiteral_3= '3' )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:331:6: (enumLiteral_3= '3' )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:331:8: enumLiteral_3= '3'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_20_in_ruleType676); 

                            current = grammarAccess.getTypeAccess().getTextBoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getTextBoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:337:6: (enumLiteral_4= '4' )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:337:6: (enumLiteral_4= '4' )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:337:8: enumLiteral_4= '4'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_21_in_ruleType693); 

                            current = grammarAccess.getTypeAccess().getImageEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getImageEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleType"

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
    public static final BitSet FOLLOW_12_in_ruleQuestion400 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestion412 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_ruleOption_in_ruleQuestion433 = new BitSet(new long[]{0x00000000003E2010L});
    public static final BitSet FOLLOW_13_in_ruleQuestion446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOption535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOption552 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleOption575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType693 = new BitSet(new long[]{0x0000000000000002L});

}