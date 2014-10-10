package org.json.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.json.services.JsonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'polls'", "':'", "'}'", "'['", "','", "']'", "'name'", "'questions'", "'question'", "'text'", "'options'", "'id'", "'test'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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


        public InternalJsonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g"; }



     	private JsonGrammarAccess grammarAccess;
     	
        public InternalJsonParser(TokenStream input, JsonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "JsonPollSystem";	
       	}
       	
       	@Override
       	protected JsonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJsonPollSystem"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:67:1: entryRuleJsonPollSystem returns [EObject current=null] : iv_ruleJsonPollSystem= ruleJsonPollSystem EOF ;
    public final EObject entryRuleJsonPollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPollSystem = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:68:2: (iv_ruleJsonPollSystem= ruleJsonPollSystem EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:69:2: iv_ruleJsonPollSystem= ruleJsonPollSystem EOF
            {
             newCompositeNode(grammarAccess.getJsonPollSystemRule()); 
            pushFollow(FOLLOW_ruleJsonPollSystem_in_entryRuleJsonPollSystem75);
            iv_ruleJsonPollSystem=ruleJsonPollSystem();

            state._fsp--;

             current =iv_ruleJsonPollSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonPollSystem85); 

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
    // $ANTLR end "entryRuleJsonPollSystem"


    // $ANTLR start "ruleJsonPollSystem"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:76:1: ruleJsonPollSystem returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'polls' otherlv_2= ':' this_ArrayJsonPoll_3= ruleArrayJsonPoll otherlv_4= '}' )? ;
    public final EObject ruleJsonPollSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ArrayJsonPoll_3 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:79:28: ( (otherlv_0= '{' otherlv_1= 'polls' otherlv_2= ':' this_ArrayJsonPoll_3= ruleArrayJsonPoll otherlv_4= '}' )? )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:80:1: (otherlv_0= '{' otherlv_1= 'polls' otherlv_2= ':' this_ArrayJsonPoll_3= ruleArrayJsonPoll otherlv_4= '}' )?
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:80:1: (otherlv_0= '{' otherlv_1= 'polls' otherlv_2= ':' this_ArrayJsonPoll_3= ruleArrayJsonPoll otherlv_4= '}' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:80:3: otherlv_0= '{' otherlv_1= 'polls' otherlv_2= ':' this_ArrayJsonPoll_3= ruleArrayJsonPoll otherlv_4= '}'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleJsonPollSystem122); 

                        	newLeafNode(otherlv_0, grammarAccess.getJsonPollSystemAccess().getLeftCurlyBracketKeyword_0());
                        
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleJsonPollSystem134); 

                        	newLeafNode(otherlv_1, grammarAccess.getJsonPollSystemAccess().getPollsKeyword_1());
                        
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleJsonPollSystem146); 

                        	newLeafNode(otherlv_2, grammarAccess.getJsonPollSystemAccess().getColonKeyword_2());
                        
                     
                            newCompositeNode(grammarAccess.getJsonPollSystemAccess().getArrayJsonPollParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleArrayJsonPoll_in_ruleJsonPollSystem168);
                    this_ArrayJsonPoll_3=ruleArrayJsonPoll();

                    state._fsp--;

                     
                            current = this_ArrayJsonPoll_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleJsonPollSystem179); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonPollSystemAccess().getRightCurlyBracketKeyword_4());
                        

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
    // $ANTLR end "ruleJsonPollSystem"


    // $ANTLR start "entryRuleArrayJsonPoll"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:113:1: entryRuleArrayJsonPoll returns [EObject current=null] : iv_ruleArrayJsonPoll= ruleArrayJsonPoll EOF ;
    public final EObject entryRuleArrayJsonPoll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayJsonPoll = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:114:2: (iv_ruleArrayJsonPoll= ruleArrayJsonPoll EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:115:2: iv_ruleArrayJsonPoll= ruleArrayJsonPoll EOF
            {
             newCompositeNode(grammarAccess.getArrayJsonPollRule()); 
            pushFollow(FOLLOW_ruleArrayJsonPoll_in_entryRuleArrayJsonPoll216);
            iv_ruleArrayJsonPoll=ruleArrayJsonPoll();

            state._fsp--;

             current =iv_ruleArrayJsonPoll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayJsonPoll226); 

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
    // $ANTLR end "entryRuleArrayJsonPoll"


    // $ANTLR start "ruleArrayJsonPoll"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:122:1: ruleArrayJsonPoll returns [EObject current=null] : (otherlv_0= '[' ( (lv_polls_1_0= ruleJsonPoll ) )? (otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayJsonPoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_polls_1_0 = null;

        EObject lv_polls_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:125:28: ( (otherlv_0= '[' ( (lv_polls_1_0= ruleJsonPoll ) )? (otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) ) )* otherlv_4= ']' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:126:1: (otherlv_0= '[' ( (lv_polls_1_0= ruleJsonPoll ) )? (otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) ) )* otherlv_4= ']' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:126:1: (otherlv_0= '[' ( (lv_polls_1_0= ruleJsonPoll ) )? (otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) ) )* otherlv_4= ']' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:126:3: otherlv_0= '[' ( (lv_polls_1_0= ruleJsonPoll ) )? (otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleArrayJsonPoll263); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayJsonPollAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:130:1: ( (lv_polls_1_0= ruleJsonPoll ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:131:1: (lv_polls_1_0= ruleJsonPoll )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:131:1: (lv_polls_1_0= ruleJsonPoll )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:132:3: lv_polls_1_0= ruleJsonPoll
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayJsonPollAccess().getPollsJsonPollParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonPoll_in_ruleArrayJsonPoll284);
                    lv_polls_1_0=ruleJsonPoll();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayJsonPollRule());
                    	        }
                           		add(
                           			current, 
                           			"polls",
                            		lv_polls_1_0, 
                            		"JsonPoll");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:148:3: (otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:148:5: otherlv_2= ',' ( (lv_polls_3_0= ruleJsonPoll ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleArrayJsonPoll298); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayJsonPollAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:152:1: ( (lv_polls_3_0= ruleJsonPoll ) )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:153:1: (lv_polls_3_0= ruleJsonPoll )
            	    {
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:153:1: (lv_polls_3_0= ruleJsonPoll )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:154:3: lv_polls_3_0= ruleJsonPoll
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayJsonPollAccess().getPollsJsonPollParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonPoll_in_ruleArrayJsonPoll319);
            	    lv_polls_3_0=ruleJsonPoll();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayJsonPollRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"polls",
            	            		lv_polls_3_0, 
            	            		"JsonPoll");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleArrayJsonPoll333); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayJsonPollAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleArrayJsonPoll"


    // $ANTLR start "entryRuleJsonPoll"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:182:1: entryRuleJsonPoll returns [EObject current=null] : iv_ruleJsonPoll= ruleJsonPoll EOF ;
    public final EObject entryRuleJsonPoll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPoll = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:183:2: (iv_ruleJsonPoll= ruleJsonPoll EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:184:2: iv_ruleJsonPoll= ruleJsonPoll EOF
            {
             newCompositeNode(grammarAccess.getJsonPollRule()); 
            pushFollow(FOLLOW_ruleJsonPoll_in_entryRuleJsonPoll369);
            iv_ruleJsonPoll=ruleJsonPoll();

            state._fsp--;

             current =iv_ruleJsonPoll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonPoll379); 

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
    // $ANTLR end "entryRuleJsonPoll"


    // $ANTLR start "ruleJsonPoll"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:191:1: ruleJsonPoll returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'questions' otherlv_6= ':' ( (lv_questions_7_0= ruleArrayJsonQuestion ) ) otherlv_8= '}' ) ;
    public final EObject ruleJsonPoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_questions_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:194:28: ( (otherlv_0= '{' (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'questions' otherlv_6= ':' ( (lv_questions_7_0= ruleArrayJsonQuestion ) ) otherlv_8= '}' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:195:1: (otherlv_0= '{' (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'questions' otherlv_6= ':' ( (lv_questions_7_0= ruleArrayJsonQuestion ) ) otherlv_8= '}' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:195:1: (otherlv_0= '{' (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'questions' otherlv_6= ':' ( (lv_questions_7_0= ruleArrayJsonQuestion ) ) otherlv_8= '}' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:195:3: otherlv_0= '{' (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'questions' otherlv_6= ':' ( (lv_questions_7_0= ruleArrayJsonQuestion ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleJsonPoll416); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonPollAccess().getLeftCurlyBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:199:1: (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:199:3: otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ','
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleJsonPoll429); 

                        	newLeafNode(otherlv_1, grammarAccess.getJsonPollAccess().getNameKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleJsonPoll441); 

                        	newLeafNode(otherlv_2, grammarAccess.getJsonPollAccess().getColonKeyword_1_1());
                        
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:207:1: ( (lv_name_3_0= RULE_STRING ) )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:208:1: (lv_name_3_0= RULE_STRING )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:208:1: (lv_name_3_0= RULE_STRING )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:209:3: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonPoll458); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getJsonPollAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonPollRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleJsonPoll475); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonPollAccess().getCommaKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleJsonPoll489); 

                	newLeafNode(otherlv_5, grammarAccess.getJsonPollAccess().getQuestionsKeyword_2());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleJsonPoll501); 

                	newLeafNode(otherlv_6, grammarAccess.getJsonPollAccess().getColonKeyword_3());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:237:1: ( (lv_questions_7_0= ruleArrayJsonQuestion ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:238:1: (lv_questions_7_0= ruleArrayJsonQuestion )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:238:1: (lv_questions_7_0= ruleArrayJsonQuestion )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:239:3: lv_questions_7_0= ruleArrayJsonQuestion
            {
             
            	        newCompositeNode(grammarAccess.getJsonPollAccess().getQuestionsArrayJsonQuestionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArrayJsonQuestion_in_ruleJsonPoll522);
            lv_questions_7_0=ruleArrayJsonQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonPollRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_7_0, 
                    		"ArrayJsonQuestion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleJsonPoll534); 

                	newLeafNode(otherlv_8, grammarAccess.getJsonPollAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleJsonPoll"


    // $ANTLR start "entryRuleArrayJsonQuestion"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:267:1: entryRuleArrayJsonQuestion returns [EObject current=null] : iv_ruleArrayJsonQuestion= ruleArrayJsonQuestion EOF ;
    public final EObject entryRuleArrayJsonQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayJsonQuestion = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:268:2: (iv_ruleArrayJsonQuestion= ruleArrayJsonQuestion EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:269:2: iv_ruleArrayJsonQuestion= ruleArrayJsonQuestion EOF
            {
             newCompositeNode(grammarAccess.getArrayJsonQuestionRule()); 
            pushFollow(FOLLOW_ruleArrayJsonQuestion_in_entryRuleArrayJsonQuestion570);
            iv_ruleArrayJsonQuestion=ruleArrayJsonQuestion();

            state._fsp--;

             current =iv_ruleArrayJsonQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayJsonQuestion580); 

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
    // $ANTLR end "entryRuleArrayJsonQuestion"


    // $ANTLR start "ruleArrayJsonQuestion"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:276:1: ruleArrayJsonQuestion returns [EObject current=null] : (otherlv_0= '[' ( (lv_question_1_0= ruleJsonQuestion ) )? (otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayJsonQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_question_1_0 = null;

        EObject lv_question_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:279:28: ( (otherlv_0= '[' ( (lv_question_1_0= ruleJsonQuestion ) )? (otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) ) )* otherlv_4= ']' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:280:1: (otherlv_0= '[' ( (lv_question_1_0= ruleJsonQuestion ) )? (otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) ) )* otherlv_4= ']' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:280:1: (otherlv_0= '[' ( (lv_question_1_0= ruleJsonQuestion ) )? (otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) ) )* otherlv_4= ']' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:280:3: otherlv_0= '[' ( (lv_question_1_0= ruleJsonQuestion ) )? (otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleArrayJsonQuestion617); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayJsonQuestionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:284:1: ( (lv_question_1_0= ruleJsonQuestion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:285:1: (lv_question_1_0= ruleJsonQuestion )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:285:1: (lv_question_1_0= ruleJsonQuestion )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:286:3: lv_question_1_0= ruleJsonQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayJsonQuestionAccess().getQuestionJsonQuestionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonQuestion_in_ruleArrayJsonQuestion638);
                    lv_question_1_0=ruleJsonQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayJsonQuestionRule());
                    	        }
                           		add(
                           			current, 
                           			"question",
                            		lv_question_1_0, 
                            		"JsonQuestion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:302:3: (otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:302:5: otherlv_2= ',' ( (lv_question_3_0= ruleJsonQuestion ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleArrayJsonQuestion652); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayJsonQuestionAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:306:1: ( (lv_question_3_0= ruleJsonQuestion ) )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:307:1: (lv_question_3_0= ruleJsonQuestion )
            	    {
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:307:1: (lv_question_3_0= ruleJsonQuestion )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:308:3: lv_question_3_0= ruleJsonQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayJsonQuestionAccess().getQuestionJsonQuestionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonQuestion_in_ruleArrayJsonQuestion673);
            	    lv_question_3_0=ruleJsonQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayJsonQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"question",
            	            		lv_question_3_0, 
            	            		"JsonQuestion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleArrayJsonQuestion687); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayJsonQuestionAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleArrayJsonQuestion"


    // $ANTLR start "entryRuleJsonQuestion"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:336:1: entryRuleJsonQuestion returns [EObject current=null] : iv_ruleJsonQuestion= ruleJsonQuestion EOF ;
    public final EObject entryRuleJsonQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonQuestion = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:337:2: (iv_ruleJsonQuestion= ruleJsonQuestion EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:338:2: iv_ruleJsonQuestion= ruleJsonQuestion EOF
            {
             newCompositeNode(grammarAccess.getJsonQuestionRule()); 
            pushFollow(FOLLOW_ruleJsonQuestion_in_entryRuleJsonQuestion723);
            iv_ruleJsonQuestion=ruleJsonQuestion();

            state._fsp--;

             current =iv_ruleJsonQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonQuestion733); 

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
    // $ANTLR end "entryRuleJsonQuestion"


    // $ANTLR start "ruleJsonQuestion"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:345:1: ruleJsonQuestion returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'question' otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' )? otherlv_8= 'text' otherlv_9= ':' ( (lv_text_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'options' otherlv_13= ':' ( (lv_options_14_0= ruleArrayJsonOption ) ) otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleJsonQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_text_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_options_14_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:348:28: ( (otherlv_0= '{' otherlv_1= 'question' otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' )? otherlv_8= 'text' otherlv_9= ':' ( (lv_text_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'options' otherlv_13= ':' ( (lv_options_14_0= ruleArrayJsonOption ) ) otherlv_15= '}' otherlv_16= '}' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:349:1: (otherlv_0= '{' otherlv_1= 'question' otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' )? otherlv_8= 'text' otherlv_9= ':' ( (lv_text_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'options' otherlv_13= ':' ( (lv_options_14_0= ruleArrayJsonOption ) ) otherlv_15= '}' otherlv_16= '}' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:349:1: (otherlv_0= '{' otherlv_1= 'question' otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' )? otherlv_8= 'text' otherlv_9= ':' ( (lv_text_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'options' otherlv_13= ':' ( (lv_options_14_0= ruleArrayJsonOption ) ) otherlv_15= '}' otherlv_16= '}' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:349:3: otherlv_0= '{' otherlv_1= 'question' otherlv_2= ':' otherlv_3= '{' (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' )? otherlv_8= 'text' otherlv_9= ':' ( (lv_text_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'options' otherlv_13= ':' ( (lv_options_14_0= ruleArrayJsonOption ) ) otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleJsonQuestion770); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonQuestionAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleJsonQuestion782); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonQuestionAccess().getQuestionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleJsonQuestion794); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonQuestionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleJsonQuestion806); 

                	newLeafNode(otherlv_3, grammarAccess.getJsonQuestionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:365:1: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:365:3: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ','
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleJsonQuestion819); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonQuestionAccess().getNameKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleJsonQuestion831); 

                        	newLeafNode(otherlv_5, grammarAccess.getJsonQuestionAccess().getColonKeyword_4_1());
                        
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:373:1: ( (lv_name_6_0= RULE_STRING ) )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:374:1: (lv_name_6_0= RULE_STRING )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:374:1: (lv_name_6_0= RULE_STRING )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:375:3: lv_name_6_0= RULE_STRING
                    {
                    lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonQuestion848); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getJsonQuestionAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonQuestionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleJsonQuestion865); 

                        	newLeafNode(otherlv_7, grammarAccess.getJsonQuestionAccess().getCommaKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleJsonQuestion879); 

                	newLeafNode(otherlv_8, grammarAccess.getJsonQuestionAccess().getTextKeyword_5());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleJsonQuestion891); 

                	newLeafNode(otherlv_9, grammarAccess.getJsonQuestionAccess().getColonKeyword_6());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:403:1: ( (lv_text_10_0= RULE_STRING ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:404:1: (lv_text_10_0= RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:404:1: (lv_text_10_0= RULE_STRING )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:405:3: lv_text_10_0= RULE_STRING
            {
            lv_text_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonQuestion908); 

            			newLeafNode(lv_text_10_0, grammarAccess.getJsonQuestionAccess().getTextSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJsonQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleJsonQuestion925); 

                	newLeafNode(otherlv_11, grammarAccess.getJsonQuestionAccess().getCommaKeyword_8());
                
            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleJsonQuestion937); 

                	newLeafNode(otherlv_12, grammarAccess.getJsonQuestionAccess().getOptionsKeyword_9());
                
            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleJsonQuestion949); 

                	newLeafNode(otherlv_13, grammarAccess.getJsonQuestionAccess().getColonKeyword_10());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:433:1: ( (lv_options_14_0= ruleArrayJsonOption ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:434:1: (lv_options_14_0= ruleArrayJsonOption )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:434:1: (lv_options_14_0= ruleArrayJsonOption )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:435:3: lv_options_14_0= ruleArrayJsonOption
            {
             
            	        newCompositeNode(grammarAccess.getJsonQuestionAccess().getOptionsArrayJsonOptionParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleArrayJsonOption_in_ruleJsonQuestion970);
            lv_options_14_0=ruleArrayJsonOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_14_0, 
                    		"ArrayJsonOption");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleJsonQuestion982); 

                	newLeafNode(otherlv_15, grammarAccess.getJsonQuestionAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleJsonQuestion994); 

                	newLeafNode(otherlv_16, grammarAccess.getJsonQuestionAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleJsonQuestion"


    // $ANTLR start "entryRuleArrayJsonOption"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:467:1: entryRuleArrayJsonOption returns [EObject current=null] : iv_ruleArrayJsonOption= ruleArrayJsonOption EOF ;
    public final EObject entryRuleArrayJsonOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayJsonOption = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:468:2: (iv_ruleArrayJsonOption= ruleArrayJsonOption EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:469:2: iv_ruleArrayJsonOption= ruleArrayJsonOption EOF
            {
             newCompositeNode(grammarAccess.getArrayJsonOptionRule()); 
            pushFollow(FOLLOW_ruleArrayJsonOption_in_entryRuleArrayJsonOption1030);
            iv_ruleArrayJsonOption=ruleArrayJsonOption();

            state._fsp--;

             current =iv_ruleArrayJsonOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayJsonOption1040); 

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
    // $ANTLR end "entryRuleArrayJsonOption"


    // $ANTLR start "ruleArrayJsonOption"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:476:1: ruleArrayJsonOption returns [EObject current=null] : (otherlv_0= '[' ( (lv_option_1_0= ruleJsonOption ) )? (otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayJsonOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_option_1_0 = null;

        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:479:28: ( (otherlv_0= '[' ( (lv_option_1_0= ruleJsonOption ) )? (otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) ) )* otherlv_4= ']' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:480:1: (otherlv_0= '[' ( (lv_option_1_0= ruleJsonOption ) )? (otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) ) )* otherlv_4= ']' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:480:1: (otherlv_0= '[' ( (lv_option_1_0= ruleJsonOption ) )? (otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) ) )* otherlv_4= ']' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:480:3: otherlv_0= '[' ( (lv_option_1_0= ruleJsonOption ) )? (otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleArrayJsonOption1077); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayJsonOptionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:484:1: ( (lv_option_1_0= ruleJsonOption ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:485:1: (lv_option_1_0= ruleJsonOption )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:485:1: (lv_option_1_0= ruleJsonOption )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:486:3: lv_option_1_0= ruleJsonOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayJsonOptionAccess().getOptionJsonOptionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonOption_in_ruleArrayJsonOption1098);
                    lv_option_1_0=ruleJsonOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayJsonOptionRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_1_0, 
                            		"JsonOption");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:502:3: (otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:502:5: otherlv_2= ',' ( (lv_option_3_0= ruleJsonOption ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleArrayJsonOption1112); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayJsonOptionAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:506:1: ( (lv_option_3_0= ruleJsonOption ) )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:507:1: (lv_option_3_0= ruleJsonOption )
            	    {
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:507:1: (lv_option_3_0= ruleJsonOption )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:508:3: lv_option_3_0= ruleJsonOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayJsonOptionAccess().getOptionJsonOptionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonOption_in_ruleArrayJsonOption1133);
            	    lv_option_3_0=ruleJsonOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayJsonOptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"option",
            	            		lv_option_3_0, 
            	            		"JsonOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleArrayJsonOption1147); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayJsonOptionAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleArrayJsonOption"


    // $ANTLR start "entryRuleJsonOption"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:536:1: entryRuleJsonOption returns [EObject current=null] : iv_ruleJsonOption= ruleJsonOption EOF ;
    public final EObject entryRuleJsonOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonOption = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:537:2: (iv_ruleJsonOption= ruleJsonOption EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:538:2: iv_ruleJsonOption= ruleJsonOption EOF
            {
             newCompositeNode(grammarAccess.getJsonOptionRule()); 
            pushFollow(FOLLOW_ruleJsonOption_in_entryRuleJsonOption1183);
            iv_ruleJsonOption=ruleJsonOption();

            state._fsp--;

             current =iv_ruleJsonOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonOption1193); 

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
    // $ANTLR end "entryRuleJsonOption"


    // $ANTLR start "ruleJsonOption"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:545:1: ruleJsonOption returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'test' otherlv_6= ':' ( (lv_text_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleJsonOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_text_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:548:28: ( (otherlv_0= '{' (otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'test' otherlv_6= ':' ( (lv_text_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:549:1: (otherlv_0= '{' (otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'test' otherlv_6= ':' ( (lv_text_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:549:1: (otherlv_0= '{' (otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'test' otherlv_6= ':' ( (lv_text_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:549:3: otherlv_0= '{' (otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ',' )? otherlv_5= 'test' otherlv_6= ':' ( (lv_text_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleJsonOption1230); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonOptionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:553:1: (otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:553:3: otherlv_1= 'id' otherlv_2= ':' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ','
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleJsonOption1243); 

                        	newLeafNode(otherlv_1, grammarAccess.getJsonOptionAccess().getIdKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleJsonOption1255); 

                        	newLeafNode(otherlv_2, grammarAccess.getJsonOptionAccess().getColonKeyword_1_1());
                        
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:561:1: ( (lv_id_3_0= RULE_STRING ) )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:562:1: (lv_id_3_0= RULE_STRING )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:562:1: (lv_id_3_0= RULE_STRING )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:563:3: lv_id_3_0= RULE_STRING
                    {
                    lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonOption1272); 

                    			newLeafNode(lv_id_3_0, grammarAccess.getJsonOptionAccess().getIdSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleJsonOption1289); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonOptionAccess().getCommaKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleJsonOption1303); 

                	newLeafNode(otherlv_5, grammarAccess.getJsonOptionAccess().getTestKeyword_2());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleJsonOption1315); 

                	newLeafNode(otherlv_6, grammarAccess.getJsonOptionAccess().getColonKeyword_3());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:591:1: ( (lv_text_7_0= RULE_STRING ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:592:1: (lv_text_7_0= RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:592:1: (lv_text_7_0= RULE_STRING )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:593:3: lv_text_7_0= RULE_STRING
            {
            lv_text_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonOption1332); 

            			newLeafNode(lv_text_7_0, grammarAccess.getJsonOptionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJsonOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleJsonOption1349); 

                	newLeafNode(otherlv_8, grammarAccess.getJsonOptionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleJsonOption"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJsonPollSystem_in_entryRuleJsonPollSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonPollSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJsonPollSystem122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleJsonPollSystem134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonPollSystem146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleArrayJsonPoll_in_ruleJsonPollSystem168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonPollSystem179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonPoll_in_entryRuleArrayJsonPoll216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayJsonPoll226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArrayJsonPoll263 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_ruleJsonPoll_in_ruleArrayJsonPoll284 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleArrayJsonPoll298 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJsonPoll_in_ruleArrayJsonPoll319 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleArrayJsonPoll333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonPoll_in_entryRuleJsonPoll369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonPoll379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJsonPoll416 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleJsonPoll429 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonPoll441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonPoll458 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonPoll475 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJsonPoll489 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonPoll501 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleArrayJsonQuestion_in_ruleJsonPoll522 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonPoll534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonQuestion_in_entryRuleArrayJsonQuestion570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayJsonQuestion580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArrayJsonQuestion617 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_ruleJsonQuestion_in_ruleArrayJsonQuestion638 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleArrayJsonQuestion652 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJsonQuestion_in_ruleArrayJsonQuestion673 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleArrayJsonQuestion687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonQuestion_in_entryRuleJsonQuestion723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonQuestion733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJsonQuestion770 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleJsonQuestion782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonQuestion794 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleJsonQuestion806 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleJsonQuestion819 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonQuestion831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonQuestion848 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonQuestion865 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleJsonQuestion879 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonQuestion891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonQuestion908 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonQuestion925 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleJsonQuestion937 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonQuestion949 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleArrayJsonOption_in_ruleJsonQuestion970 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonQuestion982 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonQuestion994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonOption_in_entryRuleArrayJsonOption1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayJsonOption1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArrayJsonOption1077 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_ruleJsonOption_in_ruleArrayJsonOption1098 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleArrayJsonOption1112 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJsonOption_in_ruleArrayJsonOption1133 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleArrayJsonOption1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonOption_in_entryRuleJsonOption1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonOption1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJsonOption1230 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleJsonOption1243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonOption1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonOption1272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonOption1289 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleJsonOption1303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJsonOption1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonOption1332 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonOption1349 = new BitSet(new long[]{0x0000000000000002L});

}