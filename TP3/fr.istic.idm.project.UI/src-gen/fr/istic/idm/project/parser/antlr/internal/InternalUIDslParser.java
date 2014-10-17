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
import fr.istic.idm.project.services.UIDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUIDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'->'", "'Checkbox'", "'RadioButton'", "'ComboBoxItem'", "'TextBox'", "'Image'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:67:1: entryRulePollSystem returns [EObject current=null] : iv_rulePollSystem= rulePollSystem EOF ;
    public final EObject entryRulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSystem = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:68:2: (iv_rulePollSystem= rulePollSystem EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:69:2: iv_rulePollSystem= rulePollSystem EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:76:1: rulePollSystem returns [EObject current=null] : ( (lv_polls_0_0= rulePoll ) )* ;
    public final EObject rulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_polls_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:79:28: ( ( (lv_polls_0_0= rulePoll ) )* )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:80:1: ( (lv_polls_0_0= rulePoll ) )*
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:80:1: ( (lv_polls_0_0= rulePoll ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:81:1: (lv_polls_0_0= rulePoll )
            	    {
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:81:1: (lv_polls_0_0= rulePoll )
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:82:3: lv_polls_0_0= rulePoll
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:106:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:107:2: (iv_rulePoll= rulePoll EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:108:2: iv_rulePoll= rulePoll EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:115:1: rulePoll returns [EObject current=null] : (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:118:28: ( (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:119:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:119:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:119:3: otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePoll213); 

                	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:124:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:124:1: (lv_name_1_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:125:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:145:1: ( (lv_questions_3_0= ruleQuestion ) )+
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
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:146:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:146:1: (lv_questions_3_0= ruleQuestion )
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:147:3: lv_questions_3_0= ruleQuestion
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:175:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:176:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:177:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:184:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' ) ;
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
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:187:28: ( (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:188:1: (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:188:1: (otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:188:3: otherlv_0= 'Question' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' otherlv_3= 'options' ( (lv_options_4_0= ruleOption ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestion365); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:192:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:193:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:193:1: (lv_id_1_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:194:3: lv_id_1_0= RULE_ID
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
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:218:1: ( (lv_options_4_0= ruleOption ) )+
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
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:219:1: (lv_options_4_0= ruleOption )
            	    {
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:219:1: (lv_options_4_0= ruleOption )
            	    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:220:3: lv_options_4_0= ruleOption
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:248:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:249:2: (iv_ruleOption= ruleOption EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:250:2: iv_ruleOption= ruleOption EOF
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
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:257:1: ruleOption returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:260:28: ( ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:1: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:1: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (lv_type_2_0= ruleType ) )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:261:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:262:1: (lv_id_0_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:263:3: lv_id_0_0= RULE_ID
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

            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:283:3: ( (lv_type_2_0= ruleType ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:284:1: (lv_type_2_0= ruleType )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:284:1: (lv_type_2_0= ruleType )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:285:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
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


    // $ANTLR start "entryRuleType"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:309:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:310:2: (iv_ruleType= ruleType EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:311:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType611);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType621); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:318:1: ruleType returns [EObject current=null] : (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_ComboBox_2= ruleComboBox | this_TextBox_3= ruleTextBox | this_Image_4= ruleImage ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_CheckBox_0 = null;

        EObject this_RadioButton_1 = null;

        EObject this_ComboBox_2 = null;

        EObject this_TextBox_3 = null;

        EObject this_Image_4 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:321:28: ( (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_ComboBox_2= ruleComboBox | this_TextBox_3= ruleTextBox | this_Image_4= ruleImage ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:322:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_ComboBox_2= ruleComboBox | this_TextBox_3= ruleTextBox | this_Image_4= ruleImage )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:322:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_ComboBox_2= ruleComboBox | this_TextBox_3= ruleTextBox | this_Image_4= ruleImage )
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
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:323:5: this_CheckBox_0= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleType668);
                    this_CheckBox_0=ruleCheckBox();

                    state._fsp--;

                     
                            current = this_CheckBox_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:333:5: this_RadioButton_1= ruleRadioButton
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRadioButton_in_ruleType695);
                    this_RadioButton_1=ruleRadioButton();

                    state._fsp--;

                     
                            current = this_RadioButton_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:343:5: this_ComboBox_2= ruleComboBox
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getComboBoxParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleComboBox_in_ruleType722);
                    this_ComboBox_2=ruleComboBox();

                    state._fsp--;

                     
                            current = this_ComboBox_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:353:5: this_TextBox_3= ruleTextBox
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTextBoxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTextBox_in_ruleType749);
                    this_TextBox_3=ruleTextBox();

                    state._fsp--;

                     
                            current = this_TextBox_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:363:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleType776);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

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


    // $ANTLR start "entryRuleCheckBox"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:379:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:380:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:381:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox811);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox821); 

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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:388:1: ruleCheckBox returns [EObject current=null] : ( ( (lv_checkBox_0_0= 'Checkbox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token lv_checkBox_0_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:391:28: ( ( ( (lv_checkBox_0_0= 'Checkbox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:392:1: ( ( (lv_checkBox_0_0= 'Checkbox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:392:1: ( ( (lv_checkBox_0_0= 'Checkbox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:392:2: ( (lv_checkBox_0_0= 'Checkbox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}'
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:392:2: ( (lv_checkBox_0_0= 'Checkbox' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:393:1: (lv_checkBox_0_0= 'Checkbox' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:393:1: (lv_checkBox_0_0= 'Checkbox' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:394:3: lv_checkBox_0_0= 'Checkbox'
            {
            lv_checkBox_0_0=(Token)match(input,17,FOLLOW_17_in_ruleCheckBox864); 

                    newLeafNode(lv_checkBox_0_0, grammarAccess.getCheckBoxAccess().getCheckBoxCheckboxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckBoxRule());
            	        }
                   		setWithLastConsumed(current, "checkBox", lv_checkBox_0_0, "Checkbox");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCheckBox889); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:411:1: ( (lv_default_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:412:1: (lv_default_2_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:412:1: (lv_default_2_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:413:3: lv_default_2_0= RULE_ID
                    {
                    lv_default_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckBox906); 

                    			newLeafNode(lv_default_2_0, grammarAccess.getCheckBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCheckBox924); 

                	newLeafNode(otherlv_3, grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioButton"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:441:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:442:2: (iv_ruleRadioButton= ruleRadioButton EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:443:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton960);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton970); 

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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:450:1: ruleRadioButton returns [EObject current=null] : ( ( (lv_radioButton_0_0= 'RadioButton' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token lv_radioButton_0_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:453:28: ( ( ( (lv_radioButton_0_0= 'RadioButton' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:454:1: ( ( (lv_radioButton_0_0= 'RadioButton' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:454:1: ( ( (lv_radioButton_0_0= 'RadioButton' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:454:2: ( (lv_radioButton_0_0= 'RadioButton' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}'
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:454:2: ( (lv_radioButton_0_0= 'RadioButton' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:455:1: (lv_radioButton_0_0= 'RadioButton' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:455:1: (lv_radioButton_0_0= 'RadioButton' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:456:3: lv_radioButton_0_0= 'RadioButton'
            {
            lv_radioButton_0_0=(Token)match(input,18,FOLLOW_18_in_ruleRadioButton1013); 

                    newLeafNode(lv_radioButton_0_0, grammarAccess.getRadioButtonAccess().getRadioButtonRadioButtonKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioButtonRule());
            	        }
                   		setWithLastConsumed(current, "radioButton", lv_radioButton_0_0, "RadioButton");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRadioButton1038); 

                	newLeafNode(otherlv_1, grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:473:1: ( (lv_default_2_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:474:1: (lv_default_2_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:474:1: (lv_default_2_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:475:3: lv_default_2_0= RULE_ID
                    {
                    lv_default_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRadioButton1055); 

                    			newLeafNode(lv_default_2_0, grammarAccess.getRadioButtonAccess().getDefaultIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRadioButton1073); 

                	newLeafNode(otherlv_3, grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleComboBox"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:503:1: entryRuleComboBox returns [EObject current=null] : iv_ruleComboBox= ruleComboBox EOF ;
    public final EObject entryRuleComboBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBox = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:504:2: (iv_ruleComboBox= ruleComboBox EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:505:2: iv_ruleComboBox= ruleComboBox EOF
            {
             newCompositeNode(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_ruleComboBox_in_entryRuleComboBox1109);
            iv_ruleComboBox=ruleComboBox();

            state._fsp--;

             current =iv_ruleComboBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboBox1119); 

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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:512:1: ruleComboBox returns [EObject current=null] : ( ( (lv_comboBox_0_0= 'ComboBoxItem' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) ;
    public final EObject ruleComboBox() throws RecognitionException {
        EObject current = null;

        Token lv_comboBox_0_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:515:28: ( ( ( (lv_comboBox_0_0= 'ComboBoxItem' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:516:1: ( ( (lv_comboBox_0_0= 'ComboBoxItem' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:516:1: ( ( (lv_comboBox_0_0= 'ComboBoxItem' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:516:2: ( (lv_comboBox_0_0= 'ComboBoxItem' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}'
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:516:2: ( (lv_comboBox_0_0= 'ComboBoxItem' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:517:1: (lv_comboBox_0_0= 'ComboBoxItem' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:517:1: (lv_comboBox_0_0= 'ComboBoxItem' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:518:3: lv_comboBox_0_0= 'ComboBoxItem'
            {
            lv_comboBox_0_0=(Token)match(input,19,FOLLOW_19_in_ruleComboBox1162); 

                    newLeafNode(lv_comboBox_0_0, grammarAccess.getComboBoxAccess().getComboBoxComboBoxItemKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComboBoxRule());
            	        }
                   		setWithLastConsumed(current, "comboBox", lv_comboBox_0_0, "ComboBoxItem");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleComboBox1187); 

                	newLeafNode(otherlv_1, grammarAccess.getComboBoxAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:535:1: ( (lv_default_2_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:536:1: (lv_default_2_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:536:1: (lv_default_2_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:537:3: lv_default_2_0= RULE_ID
                    {
                    lv_default_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComboBox1204); 

                    			newLeafNode(lv_default_2_0, grammarAccess.getComboBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComboBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleComboBox1222); 

                	newLeafNode(otherlv_3, grammarAccess.getComboBoxAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "entryRuleTextBox"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:565:1: entryRuleTextBox returns [EObject current=null] : iv_ruleTextBox= ruleTextBox EOF ;
    public final EObject entryRuleTextBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBox = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:566:2: (iv_ruleTextBox= ruleTextBox EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:567:2: iv_ruleTextBox= ruleTextBox EOF
            {
             newCompositeNode(grammarAccess.getTextBoxRule()); 
            pushFollow(FOLLOW_ruleTextBox_in_entryRuleTextBox1258);
            iv_ruleTextBox=ruleTextBox();

            state._fsp--;

             current =iv_ruleTextBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBox1268); 

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
    // $ANTLR end "entryRuleTextBox"


    // $ANTLR start "ruleTextBox"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:574:1: ruleTextBox returns [EObject current=null] : ( ( (lv_textBox_0_0= 'TextBox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) ;
    public final EObject ruleTextBox() throws RecognitionException {
        EObject current = null;

        Token lv_textBox_0_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:577:28: ( ( ( (lv_textBox_0_0= 'TextBox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:578:1: ( ( (lv_textBox_0_0= 'TextBox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:578:1: ( ( (lv_textBox_0_0= 'TextBox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:578:2: ( (lv_textBox_0_0= 'TextBox' ) ) otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? otherlv_3= '}'
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:578:2: ( (lv_textBox_0_0= 'TextBox' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:579:1: (lv_textBox_0_0= 'TextBox' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:579:1: (lv_textBox_0_0= 'TextBox' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:580:3: lv_textBox_0_0= 'TextBox'
            {
            lv_textBox_0_0=(Token)match(input,20,FOLLOW_20_in_ruleTextBox1311); 

                    newLeafNode(lv_textBox_0_0, grammarAccess.getTextBoxAccess().getTextBoxTextBoxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextBoxRule());
            	        }
                   		setWithLastConsumed(current, "textBox", lv_textBox_0_0, "TextBox");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTextBox1336); 

                	newLeafNode(otherlv_1, grammarAccess.getTextBoxAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:597:1: ( (lv_default_2_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:598:1: (lv_default_2_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:598:1: (lv_default_2_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:599:3: lv_default_2_0= RULE_ID
                    {
                    lv_default_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextBox1353); 

                    			newLeafNode(lv_default_2_0, grammarAccess.getTextBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextBoxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTextBox1371); 

                	newLeafNode(otherlv_3, grammarAccess.getTextBoxAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleTextBox"


    // $ANTLR start "entryRuleImage"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:627:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:628:2: (iv_ruleImage= ruleImage EOF )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:629:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage1407);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage1417); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:636:1: ruleImage returns [EObject current=null] : (otherlv_0= 'Image' otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;
        Token lv_url_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:639:28: ( (otherlv_0= 'Image' otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:640:1: (otherlv_0= 'Image' otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:640:1: (otherlv_0= 'Image' otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:640:3: otherlv_0= 'Image' otherlv_1= '{' ( (lv_default_2_0= RULE_ID ) )? ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImage1454); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleImage1466); 

                	newLeafNode(otherlv_1, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:648:1: ( (lv_default_2_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:649:1: (lv_default_2_0= RULE_ID )
                    {
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:649:1: (lv_default_2_0= RULE_ID )
                    // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:650:3: lv_default_2_0= RULE_ID
                    {
                    lv_default_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage1483); 

                    			newLeafNode(lv_default_2_0, grammarAccess.getImageAccess().getDefaultIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:666:3: ( (lv_url_3_0= RULE_STRING ) )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:667:1: (lv_url_3_0= RULE_STRING )
            {
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:667:1: (lv_url_3_0= RULE_STRING )
            // ../fr.istic.idm.project.UI/src-gen/fr/istic/idm/project/parser/antlr/internal/InternalUIDsl.g:668:3: lv_url_3_0= RULE_STRING
            {
            lv_url_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage1506); 

            			newLeafNode(lv_url_3_0, grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleImage1523); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleImage"

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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_ruleType695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_ruleType722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBox_in_ruleType749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleType776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCheckBox864 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCheckBox889 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckBox906 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCheckBox924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRadioButton1013 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRadioButton1038 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRadioButton1055 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRadioButton1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_entryRuleComboBox1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboBox1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleComboBox1162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComboBox1187 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComboBox1204 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComboBox1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBox_in_entryRuleTextBox1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBox1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTextBox1311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTextBox1336 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextBox1353 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTextBox1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImage1454 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImage1466 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage1483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage1506 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImage1523 = new BitSet(new long[]{0x0000000000000002L});

}