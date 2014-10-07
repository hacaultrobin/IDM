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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=7;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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
        	return "Object";	
       	}
       	
       	@Override
       	protected JsonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleObject"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:67:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:68:2: (iv_ruleObject= ruleObject EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:69:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject75);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject85); 

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:76:1: ruleObject returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) )? (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:79:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) )? (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:80:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) )? (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:80:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) )? (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:80:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) )? (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleObject122); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:84:1: ( (lv_members_1_0= ruleMember ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:85:1: (lv_members_1_0= ruleMember )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:85:1: (lv_members_1_0= ruleMember )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:86:3: lv_members_1_0= ruleMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMember_in_ruleObject143);
                    lv_members_1_0=ruleMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"members",
                            		lv_members_1_0, 
                            		"Member");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:102:3: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:102:5: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleObject157); 

            	        	newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:106:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:107:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:107:1: (lv_members_3_0= ruleMember )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:108:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleObject178);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleObject192); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleMember"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:136:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:137:2: (iv_ruleMember= ruleMember EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:138:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember228);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember238); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:145:1: ruleMember returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:148:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:149:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:149:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:149:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:149:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:150:1: (lv_key_0_0= RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:150:1: (lv_key_0_0= RULE_STRING )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:151:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMember280); 

            			newLeafNode(lv_key_0_0, grammarAccess.getMemberAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleMember297); 

                	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:171:1: ( (lv_value_2_0= ruleValue ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:172:1: (lv_value_2_0= ruleValue )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:172:1: (lv_value_2_0= ruleValue )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:173:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getMemberAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleMember318);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleValue"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:197:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:198:2: (iv_ruleValue= ruleValue EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:199:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue354);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue364); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:206:1: ruleValue returns [EObject current=null] : (this_Object_0= ruleObject | this_STRING_1= RULE_STRING | this_Array_2= ruleArray | ruleBoolean | ruleNull | this_Number_5= RULE_NUMBER ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_Number_5=null;
        EObject this_Object_0 = null;

        EObject this_Array_2 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:209:28: ( (this_Object_0= ruleObject | this_STRING_1= RULE_STRING | this_Array_2= ruleArray | ruleBoolean | ruleNull | this_Number_5= RULE_NUMBER ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:210:1: (this_Object_0= ruleObject | this_STRING_1= RULE_STRING | this_Array_2= ruleArray | ruleBoolean | ruleNull | this_Number_5= RULE_NUMBER )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:210:1: (this_Object_0= ruleObject | this_STRING_1= RULE_STRING | this_Array_2= ruleArray | ruleBoolean | ruleNull | this_Number_5= RULE_NUMBER )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 18:
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case RULE_NUMBER:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:211:5: this_Object_0= ruleObject
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObject_in_ruleValue411);
                    this_Object_0=ruleObject();

                    state._fsp--;

                     
                            current = this_Object_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:220:6: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue427); 
                     
                        newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:226:5: this_Array_2= ruleArray
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleArray_in_ruleValue454);
                    this_Array_2=ruleArray();

                    state._fsp--;

                     
                            current = this_Array_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:236:5: ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBoolean_in_ruleValue475);
                    ruleBoolean();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:245:5: ruleNull
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNull_in_ruleValue496);
                    ruleNull();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:253:6: this_Number_5= RULE_NUMBER
                    {
                    this_Number_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleValue512); 
                     
                        newLeafNode(this_Number_5, grammarAccess.getValueAccess().getNumberTerminalRuleCall_5()); 
                        

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:265:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:266:2: (iv_ruleArray= ruleArray EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:267:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray547);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray557); 

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:274:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValue ) )? (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:277:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValue ) )? (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* otherlv_4= ']' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:278:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValue ) )? (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* otherlv_4= ']' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:278:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValue ) )? (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* otherlv_4= ']' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:278:3: otherlv_0= '[' ( (lv_values_1_0= ruleValue ) )? (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleArray594); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:282:1: ( (lv_values_1_0= ruleValue ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_NUMBER)||LA4_0==12||LA4_0==16||(LA4_0>=18 && LA4_0<=20)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:283:1: (lv_values_1_0= ruleValue )
                    {
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:283:1: (lv_values_1_0= ruleValue )
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:284:3: lv_values_1_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray615);
                    lv_values_1_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_1_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:300:3: (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:300:5: otherlv_2= ',' ( (lv_values_3_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleArray629); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:304:1: ( (lv_values_3_0= ruleValue ) )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:305:1: (lv_values_3_0= ruleValue )
            	    {
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:305:1: (lv_values_3_0= ruleValue )
            	    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:306:3: lv_values_3_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArray650);
            	    lv_values_3_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleArray664); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleBoolean"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:334:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:335:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:336:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean701);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean712); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:343:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:346:28: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:347:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:347:1: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:348:2: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleBoolean750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:355:2: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleBoolean769); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:368:1: entryRuleNull returns [String current=null] : iv_ruleNull= ruleNull EOF ;
    public final String entryRuleNull() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNull = null;


        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:369:2: (iv_ruleNull= ruleNull EOF )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:370:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull810);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull821); 

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
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:377:1: ruleNull returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNull() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:380:28: (kw= 'null' )
            // ../fr.istic.idm.tp2.json/src-gen/org/json/parser/antlr/internal/InternalJson.g:382:2: kw= 'null'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleNull858); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNullAccess().getNullKeyword()); 
                

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
    // $ANTLR end "ruleNull"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleObject122 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleObject143 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleObject157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleObject178 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleObject192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMember280 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMember297 = new BitSet(new long[]{0x00000000001D1030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMember318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleValue411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleValue475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleValue496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleValue512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleArray594 = new BitSet(new long[]{0x00000000001F3030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray615 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleArray629 = new BitSet(new long[]{0x00000000001D1030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray650 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleArray664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBoolean750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBoolean769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNull858 = new BitSet(new long[]{0x0000000000000002L});

}