package org.json.ui.contentassist.antlr.internal; 

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
import org.json.services.JsonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'polls'", "':'", "'}'", "'['", "']'", "','", "'questions'", "'name'", "'question'", "'text'", "'options'", "'test'", "'id'"
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
    public String getGrammarFileName() { return "../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g"; }


     
     	private JsonGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JsonGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleJsonPollSystem"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:60:1: entryRuleJsonPollSystem : ruleJsonPollSystem EOF ;
    public final void entryRuleJsonPollSystem() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:61:1: ( ruleJsonPollSystem EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:62:1: ruleJsonPollSystem EOF
            {
             before(grammarAccess.getJsonPollSystemRule()); 
            pushFollow(FOLLOW_ruleJsonPollSystem_in_entryRuleJsonPollSystem61);
            ruleJsonPollSystem();

            state._fsp--;

             after(grammarAccess.getJsonPollSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonPollSystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonPollSystem"


    // $ANTLR start "ruleJsonPollSystem"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:69:1: ruleJsonPollSystem : ( ( rule__JsonPollSystem__Group__0 ) ) ;
    public final void ruleJsonPollSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:73:2: ( ( ( rule__JsonPollSystem__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:74:1: ( ( rule__JsonPollSystem__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:74:1: ( ( rule__JsonPollSystem__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:75:1: ( rule__JsonPollSystem__Group__0 )
            {
             before(grammarAccess.getJsonPollSystemAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:76:1: ( rule__JsonPollSystem__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:76:2: rule__JsonPollSystem__Group__0
            {
            pushFollow(FOLLOW_rule__JsonPollSystem__Group__0_in_ruleJsonPollSystem94);
            rule__JsonPollSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonPollSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonPollSystem"


    // $ANTLR start "entryRuleArrayJsonPoll"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:88:1: entryRuleArrayJsonPoll : ruleArrayJsonPoll EOF ;
    public final void entryRuleArrayJsonPoll() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:89:1: ( ruleArrayJsonPoll EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:90:1: ruleArrayJsonPoll EOF
            {
             before(grammarAccess.getArrayJsonPollRule()); 
            pushFollow(FOLLOW_ruleArrayJsonPoll_in_entryRuleArrayJsonPoll121);
            ruleArrayJsonPoll();

            state._fsp--;

             after(grammarAccess.getArrayJsonPollRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayJsonPoll128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayJsonPoll"


    // $ANTLR start "ruleArrayJsonPoll"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:97:1: ruleArrayJsonPoll : ( ( rule__ArrayJsonPoll__Group__0 ) ) ;
    public final void ruleArrayJsonPoll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:101:2: ( ( ( rule__ArrayJsonPoll__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:102:1: ( ( rule__ArrayJsonPoll__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:102:1: ( ( rule__ArrayJsonPoll__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:103:1: ( rule__ArrayJsonPoll__Group__0 )
            {
             before(grammarAccess.getArrayJsonPollAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:104:1: ( rule__ArrayJsonPoll__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:104:2: rule__ArrayJsonPoll__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__0_in_ruleArrayJsonPoll154);
            rule__ArrayJsonPoll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayJsonPollAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayJsonPoll"


    // $ANTLR start "entryRuleJsonPoll"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:116:1: entryRuleJsonPoll : ruleJsonPoll EOF ;
    public final void entryRuleJsonPoll() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:117:1: ( ruleJsonPoll EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:118:1: ruleJsonPoll EOF
            {
             before(grammarAccess.getJsonPollRule()); 
            pushFollow(FOLLOW_ruleJsonPoll_in_entryRuleJsonPoll181);
            ruleJsonPoll();

            state._fsp--;

             after(grammarAccess.getJsonPollRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonPoll188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonPoll"


    // $ANTLR start "ruleJsonPoll"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:125:1: ruleJsonPoll : ( ( rule__JsonPoll__Group__0 ) ) ;
    public final void ruleJsonPoll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:129:2: ( ( ( rule__JsonPoll__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:130:1: ( ( rule__JsonPoll__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:130:1: ( ( rule__JsonPoll__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:131:1: ( rule__JsonPoll__Group__0 )
            {
             before(grammarAccess.getJsonPollAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:132:1: ( rule__JsonPoll__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:132:2: rule__JsonPoll__Group__0
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__0_in_ruleJsonPoll214);
            rule__JsonPoll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonPollAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonPoll"


    // $ANTLR start "entryRuleArrayJsonQuestion"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:144:1: entryRuleArrayJsonQuestion : ruleArrayJsonQuestion EOF ;
    public final void entryRuleArrayJsonQuestion() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:145:1: ( ruleArrayJsonQuestion EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:146:1: ruleArrayJsonQuestion EOF
            {
             before(grammarAccess.getArrayJsonQuestionRule()); 
            pushFollow(FOLLOW_ruleArrayJsonQuestion_in_entryRuleArrayJsonQuestion241);
            ruleArrayJsonQuestion();

            state._fsp--;

             after(grammarAccess.getArrayJsonQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayJsonQuestion248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayJsonQuestion"


    // $ANTLR start "ruleArrayJsonQuestion"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:153:1: ruleArrayJsonQuestion : ( ( rule__ArrayJsonQuestion__Group__0 ) ) ;
    public final void ruleArrayJsonQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:157:2: ( ( ( rule__ArrayJsonQuestion__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:158:1: ( ( rule__ArrayJsonQuestion__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:158:1: ( ( rule__ArrayJsonQuestion__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:159:1: ( rule__ArrayJsonQuestion__Group__0 )
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:160:1: ( rule__ArrayJsonQuestion__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:160:2: rule__ArrayJsonQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__0_in_ruleArrayJsonQuestion274);
            rule__ArrayJsonQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayJsonQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayJsonQuestion"


    // $ANTLR start "entryRuleJsonQuestion"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:172:1: entryRuleJsonQuestion : ruleJsonQuestion EOF ;
    public final void entryRuleJsonQuestion() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:173:1: ( ruleJsonQuestion EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:174:1: ruleJsonQuestion EOF
            {
             before(grammarAccess.getJsonQuestionRule()); 
            pushFollow(FOLLOW_ruleJsonQuestion_in_entryRuleJsonQuestion301);
            ruleJsonQuestion();

            state._fsp--;

             after(grammarAccess.getJsonQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonQuestion308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonQuestion"


    // $ANTLR start "ruleJsonQuestion"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:181:1: ruleJsonQuestion : ( ( rule__JsonQuestion__Group__0 ) ) ;
    public final void ruleJsonQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:185:2: ( ( ( rule__JsonQuestion__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:186:1: ( ( rule__JsonQuestion__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:186:1: ( ( rule__JsonQuestion__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:187:1: ( rule__JsonQuestion__Group__0 )
            {
             before(grammarAccess.getJsonQuestionAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:188:1: ( rule__JsonQuestion__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:188:2: rule__JsonQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__0_in_ruleJsonQuestion334);
            rule__JsonQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonQuestion"


    // $ANTLR start "entryRuleArrayJsonOption"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:200:1: entryRuleArrayJsonOption : ruleArrayJsonOption EOF ;
    public final void entryRuleArrayJsonOption() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:201:1: ( ruleArrayJsonOption EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:202:1: ruleArrayJsonOption EOF
            {
             before(grammarAccess.getArrayJsonOptionRule()); 
            pushFollow(FOLLOW_ruleArrayJsonOption_in_entryRuleArrayJsonOption361);
            ruleArrayJsonOption();

            state._fsp--;

             after(grammarAccess.getArrayJsonOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayJsonOption368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayJsonOption"


    // $ANTLR start "ruleArrayJsonOption"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:209:1: ruleArrayJsonOption : ( ( rule__ArrayJsonOption__Group__0 ) ) ;
    public final void ruleArrayJsonOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:213:2: ( ( ( rule__ArrayJsonOption__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:214:1: ( ( rule__ArrayJsonOption__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:214:1: ( ( rule__ArrayJsonOption__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:215:1: ( rule__ArrayJsonOption__Group__0 )
            {
             before(grammarAccess.getArrayJsonOptionAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:216:1: ( rule__ArrayJsonOption__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:216:2: rule__ArrayJsonOption__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__0_in_ruleArrayJsonOption394);
            rule__ArrayJsonOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayJsonOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayJsonOption"


    // $ANTLR start "entryRuleJsonOption"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:228:1: entryRuleJsonOption : ruleJsonOption EOF ;
    public final void entryRuleJsonOption() throws RecognitionException {
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:229:1: ( ruleJsonOption EOF )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:230:1: ruleJsonOption EOF
            {
             before(grammarAccess.getJsonOptionRule()); 
            pushFollow(FOLLOW_ruleJsonOption_in_entryRuleJsonOption421);
            ruleJsonOption();

            state._fsp--;

             after(grammarAccess.getJsonOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonOption428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonOption"


    // $ANTLR start "ruleJsonOption"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:237:1: ruleJsonOption : ( ( rule__JsonOption__Group__0 ) ) ;
    public final void ruleJsonOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:241:2: ( ( ( rule__JsonOption__Group__0 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:242:1: ( ( rule__JsonOption__Group__0 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:242:1: ( ( rule__JsonOption__Group__0 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:243:1: ( rule__JsonOption__Group__0 )
            {
             before(grammarAccess.getJsonOptionAccess().getGroup()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:244:1: ( rule__JsonOption__Group__0 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:244:2: rule__JsonOption__Group__0
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__0_in_ruleJsonOption454);
            rule__JsonOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonOption"


    // $ANTLR start "rule__JsonPollSystem__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:258:1: rule__JsonPollSystem__Group__0 : rule__JsonPollSystem__Group__0__Impl rule__JsonPollSystem__Group__1 ;
    public final void rule__JsonPollSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:262:1: ( rule__JsonPollSystem__Group__0__Impl rule__JsonPollSystem__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:263:2: rule__JsonPollSystem__Group__0__Impl rule__JsonPollSystem__Group__1
            {
            pushFollow(FOLLOW_rule__JsonPollSystem__Group__0__Impl_in_rule__JsonPollSystem__Group__0488);
            rule__JsonPollSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPollSystem__Group__1_in_rule__JsonPollSystem__Group__0491);
            rule__JsonPollSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__0"


    // $ANTLR start "rule__JsonPollSystem__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:270:1: rule__JsonPollSystem__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonPollSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:274:1: ( ( '{' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:275:1: ( '{' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:275:1: ( '{' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:276:1: '{'
            {
             before(grammarAccess.getJsonPollSystemAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__JsonPollSystem__Group__0__Impl519); 
             after(grammarAccess.getJsonPollSystemAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__0__Impl"


    // $ANTLR start "rule__JsonPollSystem__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:289:1: rule__JsonPollSystem__Group__1 : rule__JsonPollSystem__Group__1__Impl rule__JsonPollSystem__Group__2 ;
    public final void rule__JsonPollSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:293:1: ( rule__JsonPollSystem__Group__1__Impl rule__JsonPollSystem__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:294:2: rule__JsonPollSystem__Group__1__Impl rule__JsonPollSystem__Group__2
            {
            pushFollow(FOLLOW_rule__JsonPollSystem__Group__1__Impl_in_rule__JsonPollSystem__Group__1550);
            rule__JsonPollSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPollSystem__Group__2_in_rule__JsonPollSystem__Group__1553);
            rule__JsonPollSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__1"


    // $ANTLR start "rule__JsonPollSystem__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:301:1: rule__JsonPollSystem__Group__1__Impl : ( 'polls' ) ;
    public final void rule__JsonPollSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:305:1: ( ( 'polls' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:306:1: ( 'polls' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:306:1: ( 'polls' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:307:1: 'polls'
            {
             before(grammarAccess.getJsonPollSystemAccess().getPollsKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__JsonPollSystem__Group__1__Impl581); 
             after(grammarAccess.getJsonPollSystemAccess().getPollsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__1__Impl"


    // $ANTLR start "rule__JsonPollSystem__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:320:1: rule__JsonPollSystem__Group__2 : rule__JsonPollSystem__Group__2__Impl rule__JsonPollSystem__Group__3 ;
    public final void rule__JsonPollSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:324:1: ( rule__JsonPollSystem__Group__2__Impl rule__JsonPollSystem__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:325:2: rule__JsonPollSystem__Group__2__Impl rule__JsonPollSystem__Group__3
            {
            pushFollow(FOLLOW_rule__JsonPollSystem__Group__2__Impl_in_rule__JsonPollSystem__Group__2612);
            rule__JsonPollSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPollSystem__Group__3_in_rule__JsonPollSystem__Group__2615);
            rule__JsonPollSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__2"


    // $ANTLR start "rule__JsonPollSystem__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:332:1: rule__JsonPollSystem__Group__2__Impl : ( ':' ) ;
    public final void rule__JsonPollSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:336:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:337:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:337:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:338:1: ':'
            {
             before(grammarAccess.getJsonPollSystemAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__JsonPollSystem__Group__2__Impl643); 
             after(grammarAccess.getJsonPollSystemAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__2__Impl"


    // $ANTLR start "rule__JsonPollSystem__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:351:1: rule__JsonPollSystem__Group__3 : rule__JsonPollSystem__Group__3__Impl rule__JsonPollSystem__Group__4 ;
    public final void rule__JsonPollSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:355:1: ( rule__JsonPollSystem__Group__3__Impl rule__JsonPollSystem__Group__4 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:356:2: rule__JsonPollSystem__Group__3__Impl rule__JsonPollSystem__Group__4
            {
            pushFollow(FOLLOW_rule__JsonPollSystem__Group__3__Impl_in_rule__JsonPollSystem__Group__3674);
            rule__JsonPollSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPollSystem__Group__4_in_rule__JsonPollSystem__Group__3677);
            rule__JsonPollSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__3"


    // $ANTLR start "rule__JsonPollSystem__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:363:1: rule__JsonPollSystem__Group__3__Impl : ( ruleArrayJsonPoll ) ;
    public final void rule__JsonPollSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:367:1: ( ( ruleArrayJsonPoll ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:368:1: ( ruleArrayJsonPoll )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:368:1: ( ruleArrayJsonPoll )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:369:1: ruleArrayJsonPoll
            {
             before(grammarAccess.getJsonPollSystemAccess().getArrayJsonPollParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleArrayJsonPoll_in_rule__JsonPollSystem__Group__3__Impl704);
            ruleArrayJsonPoll();

            state._fsp--;

             after(grammarAccess.getJsonPollSystemAccess().getArrayJsonPollParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__3__Impl"


    // $ANTLR start "rule__JsonPollSystem__Group__4"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:380:1: rule__JsonPollSystem__Group__4 : rule__JsonPollSystem__Group__4__Impl ;
    public final void rule__JsonPollSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:384:1: ( rule__JsonPollSystem__Group__4__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:385:2: rule__JsonPollSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonPollSystem__Group__4__Impl_in_rule__JsonPollSystem__Group__4733);
            rule__JsonPollSystem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__4"


    // $ANTLR start "rule__JsonPollSystem__Group__4__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:391:1: rule__JsonPollSystem__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonPollSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:395:1: ( ( '}' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:396:1: ( '}' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:396:1: ( '}' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:397:1: '}'
            {
             before(grammarAccess.getJsonPollSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__JsonPollSystem__Group__4__Impl761); 
             after(grammarAccess.getJsonPollSystemAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPollSystem__Group__4__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:420:1: rule__ArrayJsonPoll__Group__0 : rule__ArrayJsonPoll__Group__0__Impl rule__ArrayJsonPoll__Group__1 ;
    public final void rule__ArrayJsonPoll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:424:1: ( rule__ArrayJsonPoll__Group__0__Impl rule__ArrayJsonPoll__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:425:2: rule__ArrayJsonPoll__Group__0__Impl rule__ArrayJsonPoll__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__0__Impl_in_rule__ArrayJsonPoll__Group__0802);
            rule__ArrayJsonPoll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__1_in_rule__ArrayJsonPoll__Group__0805);
            rule__ArrayJsonPoll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__0"


    // $ANTLR start "rule__ArrayJsonPoll__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:432:1: rule__ArrayJsonPoll__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayJsonPoll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:436:1: ( ( '[' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:437:1: ( '[' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:437:1: ( '[' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:438:1: '['
            {
             before(grammarAccess.getArrayJsonPollAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ArrayJsonPoll__Group__0__Impl833); 
             after(grammarAccess.getArrayJsonPollAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__0__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:451:1: rule__ArrayJsonPoll__Group__1 : rule__ArrayJsonPoll__Group__1__Impl rule__ArrayJsonPoll__Group__2 ;
    public final void rule__ArrayJsonPoll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:455:1: ( rule__ArrayJsonPoll__Group__1__Impl rule__ArrayJsonPoll__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:456:2: rule__ArrayJsonPoll__Group__1__Impl rule__ArrayJsonPoll__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__1__Impl_in_rule__ArrayJsonPoll__Group__1864);
            rule__ArrayJsonPoll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__2_in_rule__ArrayJsonPoll__Group__1867);
            rule__ArrayJsonPoll__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__1"


    // $ANTLR start "rule__ArrayJsonPoll__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:463:1: rule__ArrayJsonPoll__Group__1__Impl : ( ( rule__ArrayJsonPoll__PollsAssignment_1 )? ) ;
    public final void rule__ArrayJsonPoll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:467:1: ( ( ( rule__ArrayJsonPoll__PollsAssignment_1 )? ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:468:1: ( ( rule__ArrayJsonPoll__PollsAssignment_1 )? )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:468:1: ( ( rule__ArrayJsonPoll__PollsAssignment_1 )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:469:1: ( rule__ArrayJsonPoll__PollsAssignment_1 )?
            {
             before(grammarAccess.getArrayJsonPollAccess().getPollsAssignment_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:470:1: ( rule__ArrayJsonPoll__PollsAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:470:2: rule__ArrayJsonPoll__PollsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ArrayJsonPoll__PollsAssignment_1_in_rule__ArrayJsonPoll__Group__1__Impl894);
                    rule__ArrayJsonPoll__PollsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayJsonPollAccess().getPollsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__1__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:480:1: rule__ArrayJsonPoll__Group__2 : rule__ArrayJsonPoll__Group__2__Impl rule__ArrayJsonPoll__Group__3 ;
    public final void rule__ArrayJsonPoll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:484:1: ( rule__ArrayJsonPoll__Group__2__Impl rule__ArrayJsonPoll__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:485:2: rule__ArrayJsonPoll__Group__2__Impl rule__ArrayJsonPoll__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__2__Impl_in_rule__ArrayJsonPoll__Group__2925);
            rule__ArrayJsonPoll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__3_in_rule__ArrayJsonPoll__Group__2928);
            rule__ArrayJsonPoll__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__2"


    // $ANTLR start "rule__ArrayJsonPoll__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:492:1: rule__ArrayJsonPoll__Group__2__Impl : ( ( rule__ArrayJsonPoll__Group_2__0 )* ) ;
    public final void rule__ArrayJsonPoll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:496:1: ( ( ( rule__ArrayJsonPoll__Group_2__0 )* ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:497:1: ( ( rule__ArrayJsonPoll__Group_2__0 )* )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:497:1: ( ( rule__ArrayJsonPoll__Group_2__0 )* )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:498:1: ( rule__ArrayJsonPoll__Group_2__0 )*
            {
             before(grammarAccess.getArrayJsonPollAccess().getGroup_2()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:499:1: ( rule__ArrayJsonPoll__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:499:2: rule__ArrayJsonPoll__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayJsonPoll__Group_2__0_in_rule__ArrayJsonPoll__Group__2__Impl955);
            	    rule__ArrayJsonPoll__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getArrayJsonPollAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__2__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:509:1: rule__ArrayJsonPoll__Group__3 : rule__ArrayJsonPoll__Group__3__Impl ;
    public final void rule__ArrayJsonPoll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:513:1: ( rule__ArrayJsonPoll__Group__3__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:514:2: rule__ArrayJsonPoll__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group__3__Impl_in_rule__ArrayJsonPoll__Group__3986);
            rule__ArrayJsonPoll__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__3"


    // $ANTLR start "rule__ArrayJsonPoll__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:520:1: rule__ArrayJsonPoll__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayJsonPoll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:524:1: ( ( ']' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:525:1: ( ']' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:525:1: ( ']' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:526:1: ']'
            {
             before(grammarAccess.getArrayJsonPollAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ArrayJsonPoll__Group__3__Impl1014); 
             after(grammarAccess.getArrayJsonPollAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group__3__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__Group_2__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:547:1: rule__ArrayJsonPoll__Group_2__0 : rule__ArrayJsonPoll__Group_2__0__Impl rule__ArrayJsonPoll__Group_2__1 ;
    public final void rule__ArrayJsonPoll__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:551:1: ( rule__ArrayJsonPoll__Group_2__0__Impl rule__ArrayJsonPoll__Group_2__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:552:2: rule__ArrayJsonPoll__Group_2__0__Impl rule__ArrayJsonPoll__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group_2__0__Impl_in_rule__ArrayJsonPoll__Group_2__01053);
            rule__ArrayJsonPoll__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group_2__1_in_rule__ArrayJsonPoll__Group_2__01056);
            rule__ArrayJsonPoll__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group_2__0"


    // $ANTLR start "rule__ArrayJsonPoll__Group_2__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:559:1: rule__ArrayJsonPoll__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayJsonPoll__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:563:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:564:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:564:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:565:1: ','
            {
             before(grammarAccess.getArrayJsonPollAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__ArrayJsonPoll__Group_2__0__Impl1084); 
             after(grammarAccess.getArrayJsonPollAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__Group_2__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:578:1: rule__ArrayJsonPoll__Group_2__1 : rule__ArrayJsonPoll__Group_2__1__Impl ;
    public final void rule__ArrayJsonPoll__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:582:1: ( rule__ArrayJsonPoll__Group_2__1__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:583:2: rule__ArrayJsonPoll__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__Group_2__1__Impl_in_rule__ArrayJsonPoll__Group_2__11115);
            rule__ArrayJsonPoll__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group_2__1"


    // $ANTLR start "rule__ArrayJsonPoll__Group_2__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:589:1: rule__ArrayJsonPoll__Group_2__1__Impl : ( ( rule__ArrayJsonPoll__PollsAssignment_2_1 ) ) ;
    public final void rule__ArrayJsonPoll__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:593:1: ( ( ( rule__ArrayJsonPoll__PollsAssignment_2_1 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:594:1: ( ( rule__ArrayJsonPoll__PollsAssignment_2_1 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:594:1: ( ( rule__ArrayJsonPoll__PollsAssignment_2_1 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:595:1: ( rule__ArrayJsonPoll__PollsAssignment_2_1 )
            {
             before(grammarAccess.getArrayJsonPollAccess().getPollsAssignment_2_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:596:1: ( rule__ArrayJsonPoll__PollsAssignment_2_1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:596:2: rule__ArrayJsonPoll__PollsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayJsonPoll__PollsAssignment_2_1_in_rule__ArrayJsonPoll__Group_2__1__Impl1142);
            rule__ArrayJsonPoll__PollsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayJsonPollAccess().getPollsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__Group_2__1__Impl"


    // $ANTLR start "rule__JsonPoll__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:610:1: rule__JsonPoll__Group__0 : rule__JsonPoll__Group__0__Impl rule__JsonPoll__Group__1 ;
    public final void rule__JsonPoll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:614:1: ( rule__JsonPoll__Group__0__Impl rule__JsonPoll__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:615:2: rule__JsonPoll__Group__0__Impl rule__JsonPoll__Group__1
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__0__Impl_in_rule__JsonPoll__Group__01176);
            rule__JsonPoll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group__1_in_rule__JsonPoll__Group__01179);
            rule__JsonPoll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__0"


    // $ANTLR start "rule__JsonPoll__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:622:1: rule__JsonPoll__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonPoll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:626:1: ( ( '{' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:627:1: ( '{' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:627:1: ( '{' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:628:1: '{'
            {
             before(grammarAccess.getJsonPollAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__JsonPoll__Group__0__Impl1207); 
             after(grammarAccess.getJsonPollAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__0__Impl"


    // $ANTLR start "rule__JsonPoll__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:641:1: rule__JsonPoll__Group__1 : rule__JsonPoll__Group__1__Impl rule__JsonPoll__Group__2 ;
    public final void rule__JsonPoll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:645:1: ( rule__JsonPoll__Group__1__Impl rule__JsonPoll__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:646:2: rule__JsonPoll__Group__1__Impl rule__JsonPoll__Group__2
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__1__Impl_in_rule__JsonPoll__Group__11238);
            rule__JsonPoll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group__2_in_rule__JsonPoll__Group__11241);
            rule__JsonPoll__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__1"


    // $ANTLR start "rule__JsonPoll__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:653:1: rule__JsonPoll__Group__1__Impl : ( ( rule__JsonPoll__Group_1__0 )? ) ;
    public final void rule__JsonPoll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:657:1: ( ( ( rule__JsonPoll__Group_1__0 )? ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:658:1: ( ( rule__JsonPoll__Group_1__0 )? )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:658:1: ( ( rule__JsonPoll__Group_1__0 )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:659:1: ( rule__JsonPoll__Group_1__0 )?
            {
             before(grammarAccess.getJsonPollAccess().getGroup_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:660:1: ( rule__JsonPoll__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:660:2: rule__JsonPoll__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonPoll__Group_1__0_in_rule__JsonPoll__Group__1__Impl1268);
                    rule__JsonPoll__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonPollAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__1__Impl"


    // $ANTLR start "rule__JsonPoll__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:670:1: rule__JsonPoll__Group__2 : rule__JsonPoll__Group__2__Impl rule__JsonPoll__Group__3 ;
    public final void rule__JsonPoll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:674:1: ( rule__JsonPoll__Group__2__Impl rule__JsonPoll__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:675:2: rule__JsonPoll__Group__2__Impl rule__JsonPoll__Group__3
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__2__Impl_in_rule__JsonPoll__Group__21299);
            rule__JsonPoll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group__3_in_rule__JsonPoll__Group__21302);
            rule__JsonPoll__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__2"


    // $ANTLR start "rule__JsonPoll__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:682:1: rule__JsonPoll__Group__2__Impl : ( 'questions' ) ;
    public final void rule__JsonPoll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:686:1: ( ( 'questions' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:687:1: ( 'questions' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:687:1: ( 'questions' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:688:1: 'questions'
            {
             before(grammarAccess.getJsonPollAccess().getQuestionsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__JsonPoll__Group__2__Impl1330); 
             after(grammarAccess.getJsonPollAccess().getQuestionsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__2__Impl"


    // $ANTLR start "rule__JsonPoll__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:701:1: rule__JsonPoll__Group__3 : rule__JsonPoll__Group__3__Impl rule__JsonPoll__Group__4 ;
    public final void rule__JsonPoll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:705:1: ( rule__JsonPoll__Group__3__Impl rule__JsonPoll__Group__4 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:706:2: rule__JsonPoll__Group__3__Impl rule__JsonPoll__Group__4
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__3__Impl_in_rule__JsonPoll__Group__31361);
            rule__JsonPoll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group__4_in_rule__JsonPoll__Group__31364);
            rule__JsonPoll__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__3"


    // $ANTLR start "rule__JsonPoll__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:713:1: rule__JsonPoll__Group__3__Impl : ( ':' ) ;
    public final void rule__JsonPoll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:717:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:718:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:718:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:719:1: ':'
            {
             before(grammarAccess.getJsonPollAccess().getColonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__JsonPoll__Group__3__Impl1392); 
             after(grammarAccess.getJsonPollAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__3__Impl"


    // $ANTLR start "rule__JsonPoll__Group__4"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:732:1: rule__JsonPoll__Group__4 : rule__JsonPoll__Group__4__Impl rule__JsonPoll__Group__5 ;
    public final void rule__JsonPoll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:736:1: ( rule__JsonPoll__Group__4__Impl rule__JsonPoll__Group__5 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:737:2: rule__JsonPoll__Group__4__Impl rule__JsonPoll__Group__5
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__4__Impl_in_rule__JsonPoll__Group__41423);
            rule__JsonPoll__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group__5_in_rule__JsonPoll__Group__41426);
            rule__JsonPoll__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__4"


    // $ANTLR start "rule__JsonPoll__Group__4__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:744:1: rule__JsonPoll__Group__4__Impl : ( ( rule__JsonPoll__QuestionsAssignment_4 ) ) ;
    public final void rule__JsonPoll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:748:1: ( ( ( rule__JsonPoll__QuestionsAssignment_4 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:749:1: ( ( rule__JsonPoll__QuestionsAssignment_4 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:749:1: ( ( rule__JsonPoll__QuestionsAssignment_4 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:750:1: ( rule__JsonPoll__QuestionsAssignment_4 )
            {
             before(grammarAccess.getJsonPollAccess().getQuestionsAssignment_4()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:751:1: ( rule__JsonPoll__QuestionsAssignment_4 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:751:2: rule__JsonPoll__QuestionsAssignment_4
            {
            pushFollow(FOLLOW_rule__JsonPoll__QuestionsAssignment_4_in_rule__JsonPoll__Group__4__Impl1453);
            rule__JsonPoll__QuestionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJsonPollAccess().getQuestionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__4__Impl"


    // $ANTLR start "rule__JsonPoll__Group__5"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:761:1: rule__JsonPoll__Group__5 : rule__JsonPoll__Group__5__Impl ;
    public final void rule__JsonPoll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:765:1: ( rule__JsonPoll__Group__5__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:766:2: rule__JsonPoll__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group__5__Impl_in_rule__JsonPoll__Group__51483);
            rule__JsonPoll__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__5"


    // $ANTLR start "rule__JsonPoll__Group__5__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:772:1: rule__JsonPoll__Group__5__Impl : ( '}' ) ;
    public final void rule__JsonPoll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:776:1: ( ( '}' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:777:1: ( '}' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:777:1: ( '}' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:778:1: '}'
            {
             before(grammarAccess.getJsonPollAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__JsonPoll__Group__5__Impl1511); 
             after(grammarAccess.getJsonPollAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group__5__Impl"


    // $ANTLR start "rule__JsonPoll__Group_1__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:803:1: rule__JsonPoll__Group_1__0 : rule__JsonPoll__Group_1__0__Impl rule__JsonPoll__Group_1__1 ;
    public final void rule__JsonPoll__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:807:1: ( rule__JsonPoll__Group_1__0__Impl rule__JsonPoll__Group_1__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:808:2: rule__JsonPoll__Group_1__0__Impl rule__JsonPoll__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group_1__0__Impl_in_rule__JsonPoll__Group_1__01554);
            rule__JsonPoll__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group_1__1_in_rule__JsonPoll__Group_1__01557);
            rule__JsonPoll__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__0"


    // $ANTLR start "rule__JsonPoll__Group_1__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:815:1: rule__JsonPoll__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__JsonPoll__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:819:1: ( ( 'name' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:820:1: ( 'name' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:820:1: ( 'name' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:821:1: 'name'
            {
             before(grammarAccess.getJsonPollAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__JsonPoll__Group_1__0__Impl1585); 
             after(grammarAccess.getJsonPollAccess().getNameKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__0__Impl"


    // $ANTLR start "rule__JsonPoll__Group_1__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:834:1: rule__JsonPoll__Group_1__1 : rule__JsonPoll__Group_1__1__Impl rule__JsonPoll__Group_1__2 ;
    public final void rule__JsonPoll__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:838:1: ( rule__JsonPoll__Group_1__1__Impl rule__JsonPoll__Group_1__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:839:2: rule__JsonPoll__Group_1__1__Impl rule__JsonPoll__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group_1__1__Impl_in_rule__JsonPoll__Group_1__11616);
            rule__JsonPoll__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group_1__2_in_rule__JsonPoll__Group_1__11619);
            rule__JsonPoll__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__1"


    // $ANTLR start "rule__JsonPoll__Group_1__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:846:1: rule__JsonPoll__Group_1__1__Impl : ( ':' ) ;
    public final void rule__JsonPoll__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:850:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:851:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:851:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:852:1: ':'
            {
             before(grammarAccess.getJsonPollAccess().getColonKeyword_1_1()); 
            match(input,13,FOLLOW_13_in_rule__JsonPoll__Group_1__1__Impl1647); 
             after(grammarAccess.getJsonPollAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__1__Impl"


    // $ANTLR start "rule__JsonPoll__Group_1__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:865:1: rule__JsonPoll__Group_1__2 : rule__JsonPoll__Group_1__2__Impl rule__JsonPoll__Group_1__3 ;
    public final void rule__JsonPoll__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:869:1: ( rule__JsonPoll__Group_1__2__Impl rule__JsonPoll__Group_1__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:2: rule__JsonPoll__Group_1__2__Impl rule__JsonPoll__Group_1__3
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group_1__2__Impl_in_rule__JsonPoll__Group_1__21678);
            rule__JsonPoll__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonPoll__Group_1__3_in_rule__JsonPoll__Group_1__21681);
            rule__JsonPoll__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__2"


    // $ANTLR start "rule__JsonPoll__Group_1__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:877:1: rule__JsonPoll__Group_1__2__Impl : ( ( rule__JsonPoll__NameAssignment_1_2 ) ) ;
    public final void rule__JsonPoll__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:881:1: ( ( ( rule__JsonPoll__NameAssignment_1_2 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:882:1: ( ( rule__JsonPoll__NameAssignment_1_2 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:882:1: ( ( rule__JsonPoll__NameAssignment_1_2 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:883:1: ( rule__JsonPoll__NameAssignment_1_2 )
            {
             before(grammarAccess.getJsonPollAccess().getNameAssignment_1_2()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:884:1: ( rule__JsonPoll__NameAssignment_1_2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:884:2: rule__JsonPoll__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JsonPoll__NameAssignment_1_2_in_rule__JsonPoll__Group_1__2__Impl1708);
            rule__JsonPoll__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonPollAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__2__Impl"


    // $ANTLR start "rule__JsonPoll__Group_1__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:894:1: rule__JsonPoll__Group_1__3 : rule__JsonPoll__Group_1__3__Impl ;
    public final void rule__JsonPoll__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:898:1: ( rule__JsonPoll__Group_1__3__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:899:2: rule__JsonPoll__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonPoll__Group_1__3__Impl_in_rule__JsonPoll__Group_1__31738);
            rule__JsonPoll__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__3"


    // $ANTLR start "rule__JsonPoll__Group_1__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:905:1: rule__JsonPoll__Group_1__3__Impl : ( ',' ) ;
    public final void rule__JsonPoll__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:909:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:910:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:910:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:911:1: ','
            {
             before(grammarAccess.getJsonPollAccess().getCommaKeyword_1_3()); 
            match(input,17,FOLLOW_17_in_rule__JsonPoll__Group_1__3__Impl1766); 
             after(grammarAccess.getJsonPollAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__Group_1__3__Impl"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:932:1: rule__ArrayJsonQuestion__Group__0 : rule__ArrayJsonQuestion__Group__0__Impl rule__ArrayJsonQuestion__Group__1 ;
    public final void rule__ArrayJsonQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:936:1: ( rule__ArrayJsonQuestion__Group__0__Impl rule__ArrayJsonQuestion__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:937:2: rule__ArrayJsonQuestion__Group__0__Impl rule__ArrayJsonQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__0__Impl_in_rule__ArrayJsonQuestion__Group__01805);
            rule__ArrayJsonQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__1_in_rule__ArrayJsonQuestion__Group__01808);
            rule__ArrayJsonQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__0"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:944:1: rule__ArrayJsonQuestion__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayJsonQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:948:1: ( ( '[' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:949:1: ( '[' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:949:1: ( '[' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:950:1: '['
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ArrayJsonQuestion__Group__0__Impl1836); 
             after(grammarAccess.getArrayJsonQuestionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__0__Impl"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:963:1: rule__ArrayJsonQuestion__Group__1 : rule__ArrayJsonQuestion__Group__1__Impl rule__ArrayJsonQuestion__Group__2 ;
    public final void rule__ArrayJsonQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:967:1: ( rule__ArrayJsonQuestion__Group__1__Impl rule__ArrayJsonQuestion__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:968:2: rule__ArrayJsonQuestion__Group__1__Impl rule__ArrayJsonQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__1__Impl_in_rule__ArrayJsonQuestion__Group__11867);
            rule__ArrayJsonQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__2_in_rule__ArrayJsonQuestion__Group__11870);
            rule__ArrayJsonQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__1"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:975:1: rule__ArrayJsonQuestion__Group__1__Impl : ( ( rule__ArrayJsonQuestion__QuestionAssignment_1 )? ) ;
    public final void rule__ArrayJsonQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:979:1: ( ( ( rule__ArrayJsonQuestion__QuestionAssignment_1 )? ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:980:1: ( ( rule__ArrayJsonQuestion__QuestionAssignment_1 )? )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:980:1: ( ( rule__ArrayJsonQuestion__QuestionAssignment_1 )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:981:1: ( rule__ArrayJsonQuestion__QuestionAssignment_1 )?
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getQuestionAssignment_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:982:1: ( rule__ArrayJsonQuestion__QuestionAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:982:2: rule__ArrayJsonQuestion__QuestionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ArrayJsonQuestion__QuestionAssignment_1_in_rule__ArrayJsonQuestion__Group__1__Impl1897);
                    rule__ArrayJsonQuestion__QuestionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayJsonQuestionAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__1__Impl"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:992:1: rule__ArrayJsonQuestion__Group__2 : rule__ArrayJsonQuestion__Group__2__Impl rule__ArrayJsonQuestion__Group__3 ;
    public final void rule__ArrayJsonQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:996:1: ( rule__ArrayJsonQuestion__Group__2__Impl rule__ArrayJsonQuestion__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:997:2: rule__ArrayJsonQuestion__Group__2__Impl rule__ArrayJsonQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__2__Impl_in_rule__ArrayJsonQuestion__Group__21928);
            rule__ArrayJsonQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__3_in_rule__ArrayJsonQuestion__Group__21931);
            rule__ArrayJsonQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__2"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1004:1: rule__ArrayJsonQuestion__Group__2__Impl : ( ( rule__ArrayJsonQuestion__Group_2__0 )* ) ;
    public final void rule__ArrayJsonQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1008:1: ( ( ( rule__ArrayJsonQuestion__Group_2__0 )* ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1009:1: ( ( rule__ArrayJsonQuestion__Group_2__0 )* )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1009:1: ( ( rule__ArrayJsonQuestion__Group_2__0 )* )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1010:1: ( rule__ArrayJsonQuestion__Group_2__0 )*
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getGroup_2()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1011:1: ( rule__ArrayJsonQuestion__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1011:2: rule__ArrayJsonQuestion__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group_2__0_in_rule__ArrayJsonQuestion__Group__2__Impl1958);
            	    rule__ArrayJsonQuestion__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getArrayJsonQuestionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__2__Impl"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1021:1: rule__ArrayJsonQuestion__Group__3 : rule__ArrayJsonQuestion__Group__3__Impl ;
    public final void rule__ArrayJsonQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1025:1: ( rule__ArrayJsonQuestion__Group__3__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1026:2: rule__ArrayJsonQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group__3__Impl_in_rule__ArrayJsonQuestion__Group__31989);
            rule__ArrayJsonQuestion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__3"


    // $ANTLR start "rule__ArrayJsonQuestion__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1032:1: rule__ArrayJsonQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayJsonQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1036:1: ( ( ']' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1037:1: ( ']' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1037:1: ( ']' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1038:1: ']'
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ArrayJsonQuestion__Group__3__Impl2017); 
             after(grammarAccess.getArrayJsonQuestionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group__3__Impl"


    // $ANTLR start "rule__ArrayJsonQuestion__Group_2__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1059:1: rule__ArrayJsonQuestion__Group_2__0 : rule__ArrayJsonQuestion__Group_2__0__Impl rule__ArrayJsonQuestion__Group_2__1 ;
    public final void rule__ArrayJsonQuestion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1063:1: ( rule__ArrayJsonQuestion__Group_2__0__Impl rule__ArrayJsonQuestion__Group_2__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1064:2: rule__ArrayJsonQuestion__Group_2__0__Impl rule__ArrayJsonQuestion__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group_2__0__Impl_in_rule__ArrayJsonQuestion__Group_2__02056);
            rule__ArrayJsonQuestion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group_2__1_in_rule__ArrayJsonQuestion__Group_2__02059);
            rule__ArrayJsonQuestion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group_2__0"


    // $ANTLR start "rule__ArrayJsonQuestion__Group_2__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1071:1: rule__ArrayJsonQuestion__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayJsonQuestion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1075:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1076:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1076:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1077:1: ','
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__ArrayJsonQuestion__Group_2__0__Impl2087); 
             after(grammarAccess.getArrayJsonQuestionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayJsonQuestion__Group_2__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1090:1: rule__ArrayJsonQuestion__Group_2__1 : rule__ArrayJsonQuestion__Group_2__1__Impl ;
    public final void rule__ArrayJsonQuestion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1094:1: ( rule__ArrayJsonQuestion__Group_2__1__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1095:2: rule__ArrayJsonQuestion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__Group_2__1__Impl_in_rule__ArrayJsonQuestion__Group_2__12118);
            rule__ArrayJsonQuestion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group_2__1"


    // $ANTLR start "rule__ArrayJsonQuestion__Group_2__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1101:1: rule__ArrayJsonQuestion__Group_2__1__Impl : ( ( rule__ArrayJsonQuestion__QuestionAssignment_2_1 ) ) ;
    public final void rule__ArrayJsonQuestion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1105:1: ( ( ( rule__ArrayJsonQuestion__QuestionAssignment_2_1 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1106:1: ( ( rule__ArrayJsonQuestion__QuestionAssignment_2_1 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1106:1: ( ( rule__ArrayJsonQuestion__QuestionAssignment_2_1 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1107:1: ( rule__ArrayJsonQuestion__QuestionAssignment_2_1 )
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getQuestionAssignment_2_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1108:1: ( rule__ArrayJsonQuestion__QuestionAssignment_2_1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1108:2: rule__ArrayJsonQuestion__QuestionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayJsonQuestion__QuestionAssignment_2_1_in_rule__ArrayJsonQuestion__Group_2__1__Impl2145);
            rule__ArrayJsonQuestion__QuestionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayJsonQuestionAccess().getQuestionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__Group_2__1__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1122:1: rule__JsonQuestion__Group__0 : rule__JsonQuestion__Group__0__Impl rule__JsonQuestion__Group__1 ;
    public final void rule__JsonQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1126:1: ( rule__JsonQuestion__Group__0__Impl rule__JsonQuestion__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1127:2: rule__JsonQuestion__Group__0__Impl rule__JsonQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__0__Impl_in_rule__JsonQuestion__Group__02179);
            rule__JsonQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__1_in_rule__JsonQuestion__Group__02182);
            rule__JsonQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__0"


    // $ANTLR start "rule__JsonQuestion__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1134:1: rule__JsonQuestion__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1138:1: ( ( '{' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1139:1: ( '{' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1139:1: ( '{' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1140:1: '{'
            {
             before(grammarAccess.getJsonQuestionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__JsonQuestion__Group__0__Impl2210); 
             after(grammarAccess.getJsonQuestionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__0__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1153:1: rule__JsonQuestion__Group__1 : rule__JsonQuestion__Group__1__Impl rule__JsonQuestion__Group__2 ;
    public final void rule__JsonQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1157:1: ( rule__JsonQuestion__Group__1__Impl rule__JsonQuestion__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1158:2: rule__JsonQuestion__Group__1__Impl rule__JsonQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__1__Impl_in_rule__JsonQuestion__Group__12241);
            rule__JsonQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__2_in_rule__JsonQuestion__Group__12244);
            rule__JsonQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__1"


    // $ANTLR start "rule__JsonQuestion__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1165:1: rule__JsonQuestion__Group__1__Impl : ( 'question' ) ;
    public final void rule__JsonQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1169:1: ( ( 'question' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1170:1: ( 'question' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1170:1: ( 'question' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1171:1: 'question'
            {
             before(grammarAccess.getJsonQuestionAccess().getQuestionKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__JsonQuestion__Group__1__Impl2272); 
             after(grammarAccess.getJsonQuestionAccess().getQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__1__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1184:1: rule__JsonQuestion__Group__2 : rule__JsonQuestion__Group__2__Impl rule__JsonQuestion__Group__3 ;
    public final void rule__JsonQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1188:1: ( rule__JsonQuestion__Group__2__Impl rule__JsonQuestion__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1189:2: rule__JsonQuestion__Group__2__Impl rule__JsonQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__2__Impl_in_rule__JsonQuestion__Group__22303);
            rule__JsonQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__3_in_rule__JsonQuestion__Group__22306);
            rule__JsonQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__2"


    // $ANTLR start "rule__JsonQuestion__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1196:1: rule__JsonQuestion__Group__2__Impl : ( ':' ) ;
    public final void rule__JsonQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1200:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1201:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1201:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1202:1: ':'
            {
             before(grammarAccess.getJsonQuestionAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__JsonQuestion__Group__2__Impl2334); 
             after(grammarAccess.getJsonQuestionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__2__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1215:1: rule__JsonQuestion__Group__3 : rule__JsonQuestion__Group__3__Impl rule__JsonQuestion__Group__4 ;
    public final void rule__JsonQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1219:1: ( rule__JsonQuestion__Group__3__Impl rule__JsonQuestion__Group__4 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1220:2: rule__JsonQuestion__Group__3__Impl rule__JsonQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__3__Impl_in_rule__JsonQuestion__Group__32365);
            rule__JsonQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__4_in_rule__JsonQuestion__Group__32368);
            rule__JsonQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__3"


    // $ANTLR start "rule__JsonQuestion__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1227:1: rule__JsonQuestion__Group__3__Impl : ( '{' ) ;
    public final void rule__JsonQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1231:1: ( ( '{' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1232:1: ( '{' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1232:1: ( '{' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1233:1: '{'
            {
             before(grammarAccess.getJsonQuestionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__JsonQuestion__Group__3__Impl2396); 
             after(grammarAccess.getJsonQuestionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__3__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__4"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1246:1: rule__JsonQuestion__Group__4 : rule__JsonQuestion__Group__4__Impl rule__JsonQuestion__Group__5 ;
    public final void rule__JsonQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1250:1: ( rule__JsonQuestion__Group__4__Impl rule__JsonQuestion__Group__5 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1251:2: rule__JsonQuestion__Group__4__Impl rule__JsonQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__4__Impl_in_rule__JsonQuestion__Group__42427);
            rule__JsonQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__5_in_rule__JsonQuestion__Group__42430);
            rule__JsonQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__4"


    // $ANTLR start "rule__JsonQuestion__Group__4__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1258:1: rule__JsonQuestion__Group__4__Impl : ( ( rule__JsonQuestion__Group_4__0 )? ) ;
    public final void rule__JsonQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1262:1: ( ( ( rule__JsonQuestion__Group_4__0 )? ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1263:1: ( ( rule__JsonQuestion__Group_4__0 )? )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1263:1: ( ( rule__JsonQuestion__Group_4__0 )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1264:1: ( rule__JsonQuestion__Group_4__0 )?
            {
             before(grammarAccess.getJsonQuestionAccess().getGroup_4()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1265:1: ( rule__JsonQuestion__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1265:2: rule__JsonQuestion__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__JsonQuestion__Group_4__0_in_rule__JsonQuestion__Group__4__Impl2457);
                    rule__JsonQuestion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonQuestionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__4__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__5"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1275:1: rule__JsonQuestion__Group__5 : rule__JsonQuestion__Group__5__Impl rule__JsonQuestion__Group__6 ;
    public final void rule__JsonQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1279:1: ( rule__JsonQuestion__Group__5__Impl rule__JsonQuestion__Group__6 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1280:2: rule__JsonQuestion__Group__5__Impl rule__JsonQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__5__Impl_in_rule__JsonQuestion__Group__52488);
            rule__JsonQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__6_in_rule__JsonQuestion__Group__52491);
            rule__JsonQuestion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__5"


    // $ANTLR start "rule__JsonQuestion__Group__5__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1287:1: rule__JsonQuestion__Group__5__Impl : ( 'text' ) ;
    public final void rule__JsonQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1291:1: ( ( 'text' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1292:1: ( 'text' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1292:1: ( 'text' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1293:1: 'text'
            {
             before(grammarAccess.getJsonQuestionAccess().getTextKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__JsonQuestion__Group__5__Impl2519); 
             after(grammarAccess.getJsonQuestionAccess().getTextKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__5__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__6"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1306:1: rule__JsonQuestion__Group__6 : rule__JsonQuestion__Group__6__Impl rule__JsonQuestion__Group__7 ;
    public final void rule__JsonQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1310:1: ( rule__JsonQuestion__Group__6__Impl rule__JsonQuestion__Group__7 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1311:2: rule__JsonQuestion__Group__6__Impl rule__JsonQuestion__Group__7
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__6__Impl_in_rule__JsonQuestion__Group__62550);
            rule__JsonQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__7_in_rule__JsonQuestion__Group__62553);
            rule__JsonQuestion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__6"


    // $ANTLR start "rule__JsonQuestion__Group__6__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1318:1: rule__JsonQuestion__Group__6__Impl : ( ':' ) ;
    public final void rule__JsonQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1322:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1323:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1323:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1324:1: ':'
            {
             before(grammarAccess.getJsonQuestionAccess().getColonKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__JsonQuestion__Group__6__Impl2581); 
             after(grammarAccess.getJsonQuestionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__6__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__7"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1337:1: rule__JsonQuestion__Group__7 : rule__JsonQuestion__Group__7__Impl rule__JsonQuestion__Group__8 ;
    public final void rule__JsonQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1341:1: ( rule__JsonQuestion__Group__7__Impl rule__JsonQuestion__Group__8 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1342:2: rule__JsonQuestion__Group__7__Impl rule__JsonQuestion__Group__8
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__7__Impl_in_rule__JsonQuestion__Group__72612);
            rule__JsonQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__8_in_rule__JsonQuestion__Group__72615);
            rule__JsonQuestion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__7"


    // $ANTLR start "rule__JsonQuestion__Group__7__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1349:1: rule__JsonQuestion__Group__7__Impl : ( ( rule__JsonQuestion__TextAssignment_7 ) ) ;
    public final void rule__JsonQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1353:1: ( ( ( rule__JsonQuestion__TextAssignment_7 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1354:1: ( ( rule__JsonQuestion__TextAssignment_7 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1354:1: ( ( rule__JsonQuestion__TextAssignment_7 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1355:1: ( rule__JsonQuestion__TextAssignment_7 )
            {
             before(grammarAccess.getJsonQuestionAccess().getTextAssignment_7()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1356:1: ( rule__JsonQuestion__TextAssignment_7 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1356:2: rule__JsonQuestion__TextAssignment_7
            {
            pushFollow(FOLLOW_rule__JsonQuestion__TextAssignment_7_in_rule__JsonQuestion__Group__7__Impl2642);
            rule__JsonQuestion__TextAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJsonQuestionAccess().getTextAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__7__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__8"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1366:1: rule__JsonQuestion__Group__8 : rule__JsonQuestion__Group__8__Impl rule__JsonQuestion__Group__9 ;
    public final void rule__JsonQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1370:1: ( rule__JsonQuestion__Group__8__Impl rule__JsonQuestion__Group__9 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1371:2: rule__JsonQuestion__Group__8__Impl rule__JsonQuestion__Group__9
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__8__Impl_in_rule__JsonQuestion__Group__82672);
            rule__JsonQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__9_in_rule__JsonQuestion__Group__82675);
            rule__JsonQuestion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__8"


    // $ANTLR start "rule__JsonQuestion__Group__8__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1378:1: rule__JsonQuestion__Group__8__Impl : ( ',' ) ;
    public final void rule__JsonQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1382:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1383:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1383:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1384:1: ','
            {
             before(grammarAccess.getJsonQuestionAccess().getCommaKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__JsonQuestion__Group__8__Impl2703); 
             after(grammarAccess.getJsonQuestionAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__8__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__9"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1397:1: rule__JsonQuestion__Group__9 : rule__JsonQuestion__Group__9__Impl rule__JsonQuestion__Group__10 ;
    public final void rule__JsonQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1401:1: ( rule__JsonQuestion__Group__9__Impl rule__JsonQuestion__Group__10 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1402:2: rule__JsonQuestion__Group__9__Impl rule__JsonQuestion__Group__10
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__9__Impl_in_rule__JsonQuestion__Group__92734);
            rule__JsonQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__10_in_rule__JsonQuestion__Group__92737);
            rule__JsonQuestion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__9"


    // $ANTLR start "rule__JsonQuestion__Group__9__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1409:1: rule__JsonQuestion__Group__9__Impl : ( 'options' ) ;
    public final void rule__JsonQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1413:1: ( ( 'options' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1414:1: ( 'options' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1414:1: ( 'options' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1415:1: 'options'
            {
             before(grammarAccess.getJsonQuestionAccess().getOptionsKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__JsonQuestion__Group__9__Impl2765); 
             after(grammarAccess.getJsonQuestionAccess().getOptionsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__9__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__10"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1428:1: rule__JsonQuestion__Group__10 : rule__JsonQuestion__Group__10__Impl rule__JsonQuestion__Group__11 ;
    public final void rule__JsonQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1432:1: ( rule__JsonQuestion__Group__10__Impl rule__JsonQuestion__Group__11 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1433:2: rule__JsonQuestion__Group__10__Impl rule__JsonQuestion__Group__11
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__10__Impl_in_rule__JsonQuestion__Group__102796);
            rule__JsonQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__11_in_rule__JsonQuestion__Group__102799);
            rule__JsonQuestion__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__10"


    // $ANTLR start "rule__JsonQuestion__Group__10__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1440:1: rule__JsonQuestion__Group__10__Impl : ( ':' ) ;
    public final void rule__JsonQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1444:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1445:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1445:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1446:1: ':'
            {
             before(grammarAccess.getJsonQuestionAccess().getColonKeyword_10()); 
            match(input,13,FOLLOW_13_in_rule__JsonQuestion__Group__10__Impl2827); 
             after(grammarAccess.getJsonQuestionAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__10__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__11"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1459:1: rule__JsonQuestion__Group__11 : rule__JsonQuestion__Group__11__Impl rule__JsonQuestion__Group__12 ;
    public final void rule__JsonQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1463:1: ( rule__JsonQuestion__Group__11__Impl rule__JsonQuestion__Group__12 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1464:2: rule__JsonQuestion__Group__11__Impl rule__JsonQuestion__Group__12
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__11__Impl_in_rule__JsonQuestion__Group__112858);
            rule__JsonQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__12_in_rule__JsonQuestion__Group__112861);
            rule__JsonQuestion__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__11"


    // $ANTLR start "rule__JsonQuestion__Group__11__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1471:1: rule__JsonQuestion__Group__11__Impl : ( ( rule__JsonQuestion__OptionsAssignment_11 ) ) ;
    public final void rule__JsonQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1475:1: ( ( ( rule__JsonQuestion__OptionsAssignment_11 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1476:1: ( ( rule__JsonQuestion__OptionsAssignment_11 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1476:1: ( ( rule__JsonQuestion__OptionsAssignment_11 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1477:1: ( rule__JsonQuestion__OptionsAssignment_11 )
            {
             before(grammarAccess.getJsonQuestionAccess().getOptionsAssignment_11()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1478:1: ( rule__JsonQuestion__OptionsAssignment_11 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1478:2: rule__JsonQuestion__OptionsAssignment_11
            {
            pushFollow(FOLLOW_rule__JsonQuestion__OptionsAssignment_11_in_rule__JsonQuestion__Group__11__Impl2888);
            rule__JsonQuestion__OptionsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getJsonQuestionAccess().getOptionsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__11__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__12"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1488:1: rule__JsonQuestion__Group__12 : rule__JsonQuestion__Group__12__Impl rule__JsonQuestion__Group__13 ;
    public final void rule__JsonQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1492:1: ( rule__JsonQuestion__Group__12__Impl rule__JsonQuestion__Group__13 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1493:2: rule__JsonQuestion__Group__12__Impl rule__JsonQuestion__Group__13
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__12__Impl_in_rule__JsonQuestion__Group__122918);
            rule__JsonQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group__13_in_rule__JsonQuestion__Group__122921);
            rule__JsonQuestion__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__12"


    // $ANTLR start "rule__JsonQuestion__Group__12__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1500:1: rule__JsonQuestion__Group__12__Impl : ( '}' ) ;
    public final void rule__JsonQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1504:1: ( ( '}' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1505:1: ( '}' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1505:1: ( '}' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1506:1: '}'
            {
             before(grammarAccess.getJsonQuestionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__JsonQuestion__Group__12__Impl2949); 
             after(grammarAccess.getJsonQuestionAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__12__Impl"


    // $ANTLR start "rule__JsonQuestion__Group__13"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1519:1: rule__JsonQuestion__Group__13 : rule__JsonQuestion__Group__13__Impl ;
    public final void rule__JsonQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1523:1: ( rule__JsonQuestion__Group__13__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1524:2: rule__JsonQuestion__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group__13__Impl_in_rule__JsonQuestion__Group__132980);
            rule__JsonQuestion__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__13"


    // $ANTLR start "rule__JsonQuestion__Group__13__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1530:1: rule__JsonQuestion__Group__13__Impl : ( '}' ) ;
    public final void rule__JsonQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1534:1: ( ( '}' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1535:1: ( '}' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1535:1: ( '}' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1536:1: '}'
            {
             before(grammarAccess.getJsonQuestionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,14,FOLLOW_14_in_rule__JsonQuestion__Group__13__Impl3008); 
             after(grammarAccess.getJsonQuestionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group__13__Impl"


    // $ANTLR start "rule__JsonQuestion__Group_4__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1577:1: rule__JsonQuestion__Group_4__0 : rule__JsonQuestion__Group_4__0__Impl rule__JsonQuestion__Group_4__1 ;
    public final void rule__JsonQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1581:1: ( rule__JsonQuestion__Group_4__0__Impl rule__JsonQuestion__Group_4__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1582:2: rule__JsonQuestion__Group_4__0__Impl rule__JsonQuestion__Group_4__1
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__0__Impl_in_rule__JsonQuestion__Group_4__03067);
            rule__JsonQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__1_in_rule__JsonQuestion__Group_4__03070);
            rule__JsonQuestion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__0"


    // $ANTLR start "rule__JsonQuestion__Group_4__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1589:1: rule__JsonQuestion__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__JsonQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1593:1: ( ( 'name' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1594:1: ( 'name' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1594:1: ( 'name' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1595:1: 'name'
            {
             before(grammarAccess.getJsonQuestionAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__JsonQuestion__Group_4__0__Impl3098); 
             after(grammarAccess.getJsonQuestionAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__0__Impl"


    // $ANTLR start "rule__JsonQuestion__Group_4__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1608:1: rule__JsonQuestion__Group_4__1 : rule__JsonQuestion__Group_4__1__Impl rule__JsonQuestion__Group_4__2 ;
    public final void rule__JsonQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1612:1: ( rule__JsonQuestion__Group_4__1__Impl rule__JsonQuestion__Group_4__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1613:2: rule__JsonQuestion__Group_4__1__Impl rule__JsonQuestion__Group_4__2
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__1__Impl_in_rule__JsonQuestion__Group_4__13129);
            rule__JsonQuestion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__2_in_rule__JsonQuestion__Group_4__13132);
            rule__JsonQuestion__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__1"


    // $ANTLR start "rule__JsonQuestion__Group_4__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1620:1: rule__JsonQuestion__Group_4__1__Impl : ( ':' ) ;
    public final void rule__JsonQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1624:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1625:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1625:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1626:1: ':'
            {
             before(grammarAccess.getJsonQuestionAccess().getColonKeyword_4_1()); 
            match(input,13,FOLLOW_13_in_rule__JsonQuestion__Group_4__1__Impl3160); 
             after(grammarAccess.getJsonQuestionAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__1__Impl"


    // $ANTLR start "rule__JsonQuestion__Group_4__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1639:1: rule__JsonQuestion__Group_4__2 : rule__JsonQuestion__Group_4__2__Impl rule__JsonQuestion__Group_4__3 ;
    public final void rule__JsonQuestion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1643:1: ( rule__JsonQuestion__Group_4__2__Impl rule__JsonQuestion__Group_4__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1644:2: rule__JsonQuestion__Group_4__2__Impl rule__JsonQuestion__Group_4__3
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__2__Impl_in_rule__JsonQuestion__Group_4__23191);
            rule__JsonQuestion__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__3_in_rule__JsonQuestion__Group_4__23194);
            rule__JsonQuestion__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__2"


    // $ANTLR start "rule__JsonQuestion__Group_4__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1651:1: rule__JsonQuestion__Group_4__2__Impl : ( ( rule__JsonQuestion__NameAssignment_4_2 ) ) ;
    public final void rule__JsonQuestion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1655:1: ( ( ( rule__JsonQuestion__NameAssignment_4_2 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1656:1: ( ( rule__JsonQuestion__NameAssignment_4_2 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1656:1: ( ( rule__JsonQuestion__NameAssignment_4_2 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1657:1: ( rule__JsonQuestion__NameAssignment_4_2 )
            {
             before(grammarAccess.getJsonQuestionAccess().getNameAssignment_4_2()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1658:1: ( rule__JsonQuestion__NameAssignment_4_2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1658:2: rule__JsonQuestion__NameAssignment_4_2
            {
            pushFollow(FOLLOW_rule__JsonQuestion__NameAssignment_4_2_in_rule__JsonQuestion__Group_4__2__Impl3221);
            rule__JsonQuestion__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonQuestionAccess().getNameAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__2__Impl"


    // $ANTLR start "rule__JsonQuestion__Group_4__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1668:1: rule__JsonQuestion__Group_4__3 : rule__JsonQuestion__Group_4__3__Impl ;
    public final void rule__JsonQuestion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1672:1: ( rule__JsonQuestion__Group_4__3__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1673:2: rule__JsonQuestion__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonQuestion__Group_4__3__Impl_in_rule__JsonQuestion__Group_4__33251);
            rule__JsonQuestion__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__3"


    // $ANTLR start "rule__JsonQuestion__Group_4__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1679:1: rule__JsonQuestion__Group_4__3__Impl : ( ',' ) ;
    public final void rule__JsonQuestion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1683:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1684:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1684:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1685:1: ','
            {
             before(grammarAccess.getJsonQuestionAccess().getCommaKeyword_4_3()); 
            match(input,17,FOLLOW_17_in_rule__JsonQuestion__Group_4__3__Impl3279); 
             after(grammarAccess.getJsonQuestionAccess().getCommaKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__Group_4__3__Impl"


    // $ANTLR start "rule__ArrayJsonOption__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1706:1: rule__ArrayJsonOption__Group__0 : rule__ArrayJsonOption__Group__0__Impl rule__ArrayJsonOption__Group__1 ;
    public final void rule__ArrayJsonOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1710:1: ( rule__ArrayJsonOption__Group__0__Impl rule__ArrayJsonOption__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1711:2: rule__ArrayJsonOption__Group__0__Impl rule__ArrayJsonOption__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__0__Impl_in_rule__ArrayJsonOption__Group__03318);
            rule__ArrayJsonOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__1_in_rule__ArrayJsonOption__Group__03321);
            rule__ArrayJsonOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__0"


    // $ANTLR start "rule__ArrayJsonOption__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1718:1: rule__ArrayJsonOption__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayJsonOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1722:1: ( ( '[' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1723:1: ( '[' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1723:1: ( '[' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1724:1: '['
            {
             before(grammarAccess.getArrayJsonOptionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ArrayJsonOption__Group__0__Impl3349); 
             after(grammarAccess.getArrayJsonOptionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__0__Impl"


    // $ANTLR start "rule__ArrayJsonOption__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1737:1: rule__ArrayJsonOption__Group__1 : rule__ArrayJsonOption__Group__1__Impl rule__ArrayJsonOption__Group__2 ;
    public final void rule__ArrayJsonOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1741:1: ( rule__ArrayJsonOption__Group__1__Impl rule__ArrayJsonOption__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1742:2: rule__ArrayJsonOption__Group__1__Impl rule__ArrayJsonOption__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__1__Impl_in_rule__ArrayJsonOption__Group__13380);
            rule__ArrayJsonOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__2_in_rule__ArrayJsonOption__Group__13383);
            rule__ArrayJsonOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__1"


    // $ANTLR start "rule__ArrayJsonOption__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1749:1: rule__ArrayJsonOption__Group__1__Impl : ( ( rule__ArrayJsonOption__OptionAssignment_1 )? ) ;
    public final void rule__ArrayJsonOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1753:1: ( ( ( rule__ArrayJsonOption__OptionAssignment_1 )? ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1754:1: ( ( rule__ArrayJsonOption__OptionAssignment_1 )? )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1754:1: ( ( rule__ArrayJsonOption__OptionAssignment_1 )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1755:1: ( rule__ArrayJsonOption__OptionAssignment_1 )?
            {
             before(grammarAccess.getArrayJsonOptionAccess().getOptionAssignment_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1756:1: ( rule__ArrayJsonOption__OptionAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1756:2: rule__ArrayJsonOption__OptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ArrayJsonOption__OptionAssignment_1_in_rule__ArrayJsonOption__Group__1__Impl3410);
                    rule__ArrayJsonOption__OptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayJsonOptionAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__1__Impl"


    // $ANTLR start "rule__ArrayJsonOption__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1766:1: rule__ArrayJsonOption__Group__2 : rule__ArrayJsonOption__Group__2__Impl rule__ArrayJsonOption__Group__3 ;
    public final void rule__ArrayJsonOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1770:1: ( rule__ArrayJsonOption__Group__2__Impl rule__ArrayJsonOption__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1771:2: rule__ArrayJsonOption__Group__2__Impl rule__ArrayJsonOption__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__2__Impl_in_rule__ArrayJsonOption__Group__23441);
            rule__ArrayJsonOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__3_in_rule__ArrayJsonOption__Group__23444);
            rule__ArrayJsonOption__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__2"


    // $ANTLR start "rule__ArrayJsonOption__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1778:1: rule__ArrayJsonOption__Group__2__Impl : ( ( rule__ArrayJsonOption__Group_2__0 )* ) ;
    public final void rule__ArrayJsonOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1782:1: ( ( ( rule__ArrayJsonOption__Group_2__0 )* ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1783:1: ( ( rule__ArrayJsonOption__Group_2__0 )* )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1783:1: ( ( rule__ArrayJsonOption__Group_2__0 )* )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1784:1: ( rule__ArrayJsonOption__Group_2__0 )*
            {
             before(grammarAccess.getArrayJsonOptionAccess().getGroup_2()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1785:1: ( rule__ArrayJsonOption__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1785:2: rule__ArrayJsonOption__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayJsonOption__Group_2__0_in_rule__ArrayJsonOption__Group__2__Impl3471);
            	    rule__ArrayJsonOption__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getArrayJsonOptionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__2__Impl"


    // $ANTLR start "rule__ArrayJsonOption__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1795:1: rule__ArrayJsonOption__Group__3 : rule__ArrayJsonOption__Group__3__Impl ;
    public final void rule__ArrayJsonOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1799:1: ( rule__ArrayJsonOption__Group__3__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1800:2: rule__ArrayJsonOption__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group__3__Impl_in_rule__ArrayJsonOption__Group__33502);
            rule__ArrayJsonOption__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__3"


    // $ANTLR start "rule__ArrayJsonOption__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1806:1: rule__ArrayJsonOption__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayJsonOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1810:1: ( ( ']' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1811:1: ( ']' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1811:1: ( ']' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1812:1: ']'
            {
             before(grammarAccess.getArrayJsonOptionAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ArrayJsonOption__Group__3__Impl3530); 
             after(grammarAccess.getArrayJsonOptionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group__3__Impl"


    // $ANTLR start "rule__ArrayJsonOption__Group_2__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1833:1: rule__ArrayJsonOption__Group_2__0 : rule__ArrayJsonOption__Group_2__0__Impl rule__ArrayJsonOption__Group_2__1 ;
    public final void rule__ArrayJsonOption__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1837:1: ( rule__ArrayJsonOption__Group_2__0__Impl rule__ArrayJsonOption__Group_2__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1838:2: rule__ArrayJsonOption__Group_2__0__Impl rule__ArrayJsonOption__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group_2__0__Impl_in_rule__ArrayJsonOption__Group_2__03569);
            rule__ArrayJsonOption__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayJsonOption__Group_2__1_in_rule__ArrayJsonOption__Group_2__03572);
            rule__ArrayJsonOption__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group_2__0"


    // $ANTLR start "rule__ArrayJsonOption__Group_2__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1845:1: rule__ArrayJsonOption__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayJsonOption__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1849:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1850:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1850:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1851:1: ','
            {
             before(grammarAccess.getArrayJsonOptionAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__ArrayJsonOption__Group_2__0__Impl3600); 
             after(grammarAccess.getArrayJsonOptionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayJsonOption__Group_2__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1864:1: rule__ArrayJsonOption__Group_2__1 : rule__ArrayJsonOption__Group_2__1__Impl ;
    public final void rule__ArrayJsonOption__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1868:1: ( rule__ArrayJsonOption__Group_2__1__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1869:2: rule__ArrayJsonOption__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__Group_2__1__Impl_in_rule__ArrayJsonOption__Group_2__13631);
            rule__ArrayJsonOption__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group_2__1"


    // $ANTLR start "rule__ArrayJsonOption__Group_2__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1875:1: rule__ArrayJsonOption__Group_2__1__Impl : ( ( rule__ArrayJsonOption__OptionAssignment_2_1 ) ) ;
    public final void rule__ArrayJsonOption__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1879:1: ( ( ( rule__ArrayJsonOption__OptionAssignment_2_1 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1880:1: ( ( rule__ArrayJsonOption__OptionAssignment_2_1 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1880:1: ( ( rule__ArrayJsonOption__OptionAssignment_2_1 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1881:1: ( rule__ArrayJsonOption__OptionAssignment_2_1 )
            {
             before(grammarAccess.getArrayJsonOptionAccess().getOptionAssignment_2_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1882:1: ( rule__ArrayJsonOption__OptionAssignment_2_1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1882:2: rule__ArrayJsonOption__OptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayJsonOption__OptionAssignment_2_1_in_rule__ArrayJsonOption__Group_2__1__Impl3658);
            rule__ArrayJsonOption__OptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayJsonOptionAccess().getOptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__Group_2__1__Impl"


    // $ANTLR start "rule__JsonOption__Group__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1896:1: rule__JsonOption__Group__0 : rule__JsonOption__Group__0__Impl rule__JsonOption__Group__1 ;
    public final void rule__JsonOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1900:1: ( rule__JsonOption__Group__0__Impl rule__JsonOption__Group__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1901:2: rule__JsonOption__Group__0__Impl rule__JsonOption__Group__1
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__0__Impl_in_rule__JsonOption__Group__03692);
            rule__JsonOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group__1_in_rule__JsonOption__Group__03695);
            rule__JsonOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__0"


    // $ANTLR start "rule__JsonOption__Group__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1908:1: rule__JsonOption__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1912:1: ( ( '{' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1913:1: ( '{' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1913:1: ( '{' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1914:1: '{'
            {
             before(grammarAccess.getJsonOptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__JsonOption__Group__0__Impl3723); 
             after(grammarAccess.getJsonOptionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__0__Impl"


    // $ANTLR start "rule__JsonOption__Group__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1927:1: rule__JsonOption__Group__1 : rule__JsonOption__Group__1__Impl rule__JsonOption__Group__2 ;
    public final void rule__JsonOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1931:1: ( rule__JsonOption__Group__1__Impl rule__JsonOption__Group__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1932:2: rule__JsonOption__Group__1__Impl rule__JsonOption__Group__2
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__1__Impl_in_rule__JsonOption__Group__13754);
            rule__JsonOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group__2_in_rule__JsonOption__Group__13757);
            rule__JsonOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__1"


    // $ANTLR start "rule__JsonOption__Group__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1939:1: rule__JsonOption__Group__1__Impl : ( ( rule__JsonOption__Group_1__0 )? ) ;
    public final void rule__JsonOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1943:1: ( ( ( rule__JsonOption__Group_1__0 )? ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1944:1: ( ( rule__JsonOption__Group_1__0 )? )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1944:1: ( ( rule__JsonOption__Group_1__0 )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1945:1: ( rule__JsonOption__Group_1__0 )?
            {
             before(grammarAccess.getJsonOptionAccess().getGroup_1()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1946:1: ( rule__JsonOption__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1946:2: rule__JsonOption__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonOption__Group_1__0_in_rule__JsonOption__Group__1__Impl3784);
                    rule__JsonOption__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonOptionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__1__Impl"


    // $ANTLR start "rule__JsonOption__Group__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1956:1: rule__JsonOption__Group__2 : rule__JsonOption__Group__2__Impl rule__JsonOption__Group__3 ;
    public final void rule__JsonOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1960:1: ( rule__JsonOption__Group__2__Impl rule__JsonOption__Group__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1961:2: rule__JsonOption__Group__2__Impl rule__JsonOption__Group__3
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__2__Impl_in_rule__JsonOption__Group__23815);
            rule__JsonOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group__3_in_rule__JsonOption__Group__23818);
            rule__JsonOption__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__2"


    // $ANTLR start "rule__JsonOption__Group__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1968:1: rule__JsonOption__Group__2__Impl : ( 'test' ) ;
    public final void rule__JsonOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1972:1: ( ( 'test' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1973:1: ( 'test' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1973:1: ( 'test' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1974:1: 'test'
            {
             before(grammarAccess.getJsonOptionAccess().getTestKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__JsonOption__Group__2__Impl3846); 
             after(grammarAccess.getJsonOptionAccess().getTestKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__2__Impl"


    // $ANTLR start "rule__JsonOption__Group__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1987:1: rule__JsonOption__Group__3 : rule__JsonOption__Group__3__Impl rule__JsonOption__Group__4 ;
    public final void rule__JsonOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1991:1: ( rule__JsonOption__Group__3__Impl rule__JsonOption__Group__4 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1992:2: rule__JsonOption__Group__3__Impl rule__JsonOption__Group__4
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__3__Impl_in_rule__JsonOption__Group__33877);
            rule__JsonOption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group__4_in_rule__JsonOption__Group__33880);
            rule__JsonOption__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__3"


    // $ANTLR start "rule__JsonOption__Group__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1999:1: rule__JsonOption__Group__3__Impl : ( ':' ) ;
    public final void rule__JsonOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2003:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2004:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2004:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2005:1: ':'
            {
             before(grammarAccess.getJsonOptionAccess().getColonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__JsonOption__Group__3__Impl3908); 
             after(grammarAccess.getJsonOptionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__3__Impl"


    // $ANTLR start "rule__JsonOption__Group__4"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2018:1: rule__JsonOption__Group__4 : rule__JsonOption__Group__4__Impl rule__JsonOption__Group__5 ;
    public final void rule__JsonOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2022:1: ( rule__JsonOption__Group__4__Impl rule__JsonOption__Group__5 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2023:2: rule__JsonOption__Group__4__Impl rule__JsonOption__Group__5
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__4__Impl_in_rule__JsonOption__Group__43939);
            rule__JsonOption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group__5_in_rule__JsonOption__Group__43942);
            rule__JsonOption__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__4"


    // $ANTLR start "rule__JsonOption__Group__4__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2030:1: rule__JsonOption__Group__4__Impl : ( ( rule__JsonOption__TextAssignment_4 ) ) ;
    public final void rule__JsonOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2034:1: ( ( ( rule__JsonOption__TextAssignment_4 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2035:1: ( ( rule__JsonOption__TextAssignment_4 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2035:1: ( ( rule__JsonOption__TextAssignment_4 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2036:1: ( rule__JsonOption__TextAssignment_4 )
            {
             before(grammarAccess.getJsonOptionAccess().getTextAssignment_4()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2037:1: ( rule__JsonOption__TextAssignment_4 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2037:2: rule__JsonOption__TextAssignment_4
            {
            pushFollow(FOLLOW_rule__JsonOption__TextAssignment_4_in_rule__JsonOption__Group__4__Impl3969);
            rule__JsonOption__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJsonOptionAccess().getTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__4__Impl"


    // $ANTLR start "rule__JsonOption__Group__5"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2047:1: rule__JsonOption__Group__5 : rule__JsonOption__Group__5__Impl ;
    public final void rule__JsonOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2051:1: ( rule__JsonOption__Group__5__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2052:2: rule__JsonOption__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__JsonOption__Group__5__Impl_in_rule__JsonOption__Group__53999);
            rule__JsonOption__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__5"


    // $ANTLR start "rule__JsonOption__Group__5__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2058:1: rule__JsonOption__Group__5__Impl : ( '}' ) ;
    public final void rule__JsonOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2062:1: ( ( '}' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2063:1: ( '}' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2063:1: ( '}' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2064:1: '}'
            {
             before(grammarAccess.getJsonOptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__JsonOption__Group__5__Impl4027); 
             after(grammarAccess.getJsonOptionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group__5__Impl"


    // $ANTLR start "rule__JsonOption__Group_1__0"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2089:1: rule__JsonOption__Group_1__0 : rule__JsonOption__Group_1__0__Impl rule__JsonOption__Group_1__1 ;
    public final void rule__JsonOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2093:1: ( rule__JsonOption__Group_1__0__Impl rule__JsonOption__Group_1__1 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2094:2: rule__JsonOption__Group_1__0__Impl rule__JsonOption__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonOption__Group_1__0__Impl_in_rule__JsonOption__Group_1__04070);
            rule__JsonOption__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group_1__1_in_rule__JsonOption__Group_1__04073);
            rule__JsonOption__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__0"


    // $ANTLR start "rule__JsonOption__Group_1__0__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2101:1: rule__JsonOption__Group_1__0__Impl : ( 'id' ) ;
    public final void rule__JsonOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2105:1: ( ( 'id' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2106:1: ( 'id' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2106:1: ( 'id' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2107:1: 'id'
            {
             before(grammarAccess.getJsonOptionAccess().getIdKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__JsonOption__Group_1__0__Impl4101); 
             after(grammarAccess.getJsonOptionAccess().getIdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__0__Impl"


    // $ANTLR start "rule__JsonOption__Group_1__1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2120:1: rule__JsonOption__Group_1__1 : rule__JsonOption__Group_1__1__Impl rule__JsonOption__Group_1__2 ;
    public final void rule__JsonOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2124:1: ( rule__JsonOption__Group_1__1__Impl rule__JsonOption__Group_1__2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2125:2: rule__JsonOption__Group_1__1__Impl rule__JsonOption__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonOption__Group_1__1__Impl_in_rule__JsonOption__Group_1__14132);
            rule__JsonOption__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group_1__2_in_rule__JsonOption__Group_1__14135);
            rule__JsonOption__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__1"


    // $ANTLR start "rule__JsonOption__Group_1__1__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2132:1: rule__JsonOption__Group_1__1__Impl : ( ':' ) ;
    public final void rule__JsonOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2136:1: ( ( ':' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2137:1: ( ':' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2137:1: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2138:1: ':'
            {
             before(grammarAccess.getJsonOptionAccess().getColonKeyword_1_1()); 
            match(input,13,FOLLOW_13_in_rule__JsonOption__Group_1__1__Impl4163); 
             after(grammarAccess.getJsonOptionAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__1__Impl"


    // $ANTLR start "rule__JsonOption__Group_1__2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2151:1: rule__JsonOption__Group_1__2 : rule__JsonOption__Group_1__2__Impl rule__JsonOption__Group_1__3 ;
    public final void rule__JsonOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2155:1: ( rule__JsonOption__Group_1__2__Impl rule__JsonOption__Group_1__3 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2156:2: rule__JsonOption__Group_1__2__Impl rule__JsonOption__Group_1__3
            {
            pushFollow(FOLLOW_rule__JsonOption__Group_1__2__Impl_in_rule__JsonOption__Group_1__24194);
            rule__JsonOption__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonOption__Group_1__3_in_rule__JsonOption__Group_1__24197);
            rule__JsonOption__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__2"


    // $ANTLR start "rule__JsonOption__Group_1__2__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2163:1: rule__JsonOption__Group_1__2__Impl : ( ( rule__JsonOption__IdAssignment_1_2 ) ) ;
    public final void rule__JsonOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2167:1: ( ( ( rule__JsonOption__IdAssignment_1_2 ) ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2168:1: ( ( rule__JsonOption__IdAssignment_1_2 ) )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2168:1: ( ( rule__JsonOption__IdAssignment_1_2 ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2169:1: ( rule__JsonOption__IdAssignment_1_2 )
            {
             before(grammarAccess.getJsonOptionAccess().getIdAssignment_1_2()); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2170:1: ( rule__JsonOption__IdAssignment_1_2 )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2170:2: rule__JsonOption__IdAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JsonOption__IdAssignment_1_2_in_rule__JsonOption__Group_1__2__Impl4224);
            rule__JsonOption__IdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonOptionAccess().getIdAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__2__Impl"


    // $ANTLR start "rule__JsonOption__Group_1__3"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2180:1: rule__JsonOption__Group_1__3 : rule__JsonOption__Group_1__3__Impl ;
    public final void rule__JsonOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2184:1: ( rule__JsonOption__Group_1__3__Impl )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2185:2: rule__JsonOption__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonOption__Group_1__3__Impl_in_rule__JsonOption__Group_1__34254);
            rule__JsonOption__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__3"


    // $ANTLR start "rule__JsonOption__Group_1__3__Impl"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2191:1: rule__JsonOption__Group_1__3__Impl : ( ',' ) ;
    public final void rule__JsonOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2195:1: ( ( ',' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2196:1: ( ',' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2196:1: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2197:1: ','
            {
             before(grammarAccess.getJsonOptionAccess().getCommaKeyword_1_3()); 
            match(input,17,FOLLOW_17_in_rule__JsonOption__Group_1__3__Impl4282); 
             after(grammarAccess.getJsonOptionAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__Group_1__3__Impl"


    // $ANTLR start "rule__ArrayJsonPoll__PollsAssignment_1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2219:1: rule__ArrayJsonPoll__PollsAssignment_1 : ( ruleJsonPoll ) ;
    public final void rule__ArrayJsonPoll__PollsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2223:1: ( ( ruleJsonPoll ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2224:1: ( ruleJsonPoll )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2224:1: ( ruleJsonPoll )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2225:1: ruleJsonPoll
            {
             before(grammarAccess.getArrayJsonPollAccess().getPollsJsonPollParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonPoll_in_rule__ArrayJsonPoll__PollsAssignment_14326);
            ruleJsonPoll();

            state._fsp--;

             after(grammarAccess.getArrayJsonPollAccess().getPollsJsonPollParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__PollsAssignment_1"


    // $ANTLR start "rule__ArrayJsonPoll__PollsAssignment_2_1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2234:1: rule__ArrayJsonPoll__PollsAssignment_2_1 : ( ruleJsonPoll ) ;
    public final void rule__ArrayJsonPoll__PollsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2238:1: ( ( ruleJsonPoll ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2239:1: ( ruleJsonPoll )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2239:1: ( ruleJsonPoll )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2240:1: ruleJsonPoll
            {
             before(grammarAccess.getArrayJsonPollAccess().getPollsJsonPollParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonPoll_in_rule__ArrayJsonPoll__PollsAssignment_2_14357);
            ruleJsonPoll();

            state._fsp--;

             after(grammarAccess.getArrayJsonPollAccess().getPollsJsonPollParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonPoll__PollsAssignment_2_1"


    // $ANTLR start "rule__JsonPoll__NameAssignment_1_2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2249:1: rule__JsonPoll__NameAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__JsonPoll__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2253:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2254:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2254:1: ( RULE_STRING )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2255:1: RULE_STRING
            {
             before(grammarAccess.getJsonPollAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonPoll__NameAssignment_1_24388); 
             after(grammarAccess.getJsonPollAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__NameAssignment_1_2"


    // $ANTLR start "rule__JsonPoll__QuestionsAssignment_4"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2264:1: rule__JsonPoll__QuestionsAssignment_4 : ( ruleArrayJsonQuestion ) ;
    public final void rule__JsonPoll__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2268:1: ( ( ruleArrayJsonQuestion ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2269:1: ( ruleArrayJsonQuestion )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2269:1: ( ruleArrayJsonQuestion )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2270:1: ruleArrayJsonQuestion
            {
             before(grammarAccess.getJsonPollAccess().getQuestionsArrayJsonQuestionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArrayJsonQuestion_in_rule__JsonPoll__QuestionsAssignment_44419);
            ruleArrayJsonQuestion();

            state._fsp--;

             after(grammarAccess.getJsonPollAccess().getQuestionsArrayJsonQuestionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPoll__QuestionsAssignment_4"


    // $ANTLR start "rule__ArrayJsonQuestion__QuestionAssignment_1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2279:1: rule__ArrayJsonQuestion__QuestionAssignment_1 : ( ruleJsonQuestion ) ;
    public final void rule__ArrayJsonQuestion__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2283:1: ( ( ruleJsonQuestion ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2284:1: ( ruleJsonQuestion )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2284:1: ( ruleJsonQuestion )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2285:1: ruleJsonQuestion
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getQuestionJsonQuestionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonQuestion_in_rule__ArrayJsonQuestion__QuestionAssignment_14450);
            ruleJsonQuestion();

            state._fsp--;

             after(grammarAccess.getArrayJsonQuestionAccess().getQuestionJsonQuestionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__QuestionAssignment_1"


    // $ANTLR start "rule__ArrayJsonQuestion__QuestionAssignment_2_1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2294:1: rule__ArrayJsonQuestion__QuestionAssignment_2_1 : ( ruleJsonQuestion ) ;
    public final void rule__ArrayJsonQuestion__QuestionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2298:1: ( ( ruleJsonQuestion ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2299:1: ( ruleJsonQuestion )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2299:1: ( ruleJsonQuestion )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2300:1: ruleJsonQuestion
            {
             before(grammarAccess.getArrayJsonQuestionAccess().getQuestionJsonQuestionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonQuestion_in_rule__ArrayJsonQuestion__QuestionAssignment_2_14481);
            ruleJsonQuestion();

            state._fsp--;

             after(grammarAccess.getArrayJsonQuestionAccess().getQuestionJsonQuestionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonQuestion__QuestionAssignment_2_1"


    // $ANTLR start "rule__JsonQuestion__NameAssignment_4_2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2309:1: rule__JsonQuestion__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__JsonQuestion__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2313:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2314:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2314:1: ( RULE_STRING )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2315:1: RULE_STRING
            {
             before(grammarAccess.getJsonQuestionAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonQuestion__NameAssignment_4_24512); 
             after(grammarAccess.getJsonQuestionAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__NameAssignment_4_2"


    // $ANTLR start "rule__JsonQuestion__TextAssignment_7"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2324:1: rule__JsonQuestion__TextAssignment_7 : ( RULE_STRING ) ;
    public final void rule__JsonQuestion__TextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2328:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2329:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2329:1: ( RULE_STRING )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2330:1: RULE_STRING
            {
             before(grammarAccess.getJsonQuestionAccess().getTextSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonQuestion__TextAssignment_74543); 
             after(grammarAccess.getJsonQuestionAccess().getTextSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__TextAssignment_7"


    // $ANTLR start "rule__JsonQuestion__OptionsAssignment_11"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2339:1: rule__JsonQuestion__OptionsAssignment_11 : ( ruleArrayJsonOption ) ;
    public final void rule__JsonQuestion__OptionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2343:1: ( ( ruleArrayJsonOption ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2344:1: ( ruleArrayJsonOption )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2344:1: ( ruleArrayJsonOption )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2345:1: ruleArrayJsonOption
            {
             before(grammarAccess.getJsonQuestionAccess().getOptionsArrayJsonOptionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleArrayJsonOption_in_rule__JsonQuestion__OptionsAssignment_114574);
            ruleArrayJsonOption();

            state._fsp--;

             after(grammarAccess.getJsonQuestionAccess().getOptionsArrayJsonOptionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonQuestion__OptionsAssignment_11"


    // $ANTLR start "rule__ArrayJsonOption__OptionAssignment_1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2354:1: rule__ArrayJsonOption__OptionAssignment_1 : ( ruleJsonOption ) ;
    public final void rule__ArrayJsonOption__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2358:1: ( ( ruleJsonOption ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2359:1: ( ruleJsonOption )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2359:1: ( ruleJsonOption )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2360:1: ruleJsonOption
            {
             before(grammarAccess.getArrayJsonOptionAccess().getOptionJsonOptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonOption_in_rule__ArrayJsonOption__OptionAssignment_14605);
            ruleJsonOption();

            state._fsp--;

             after(grammarAccess.getArrayJsonOptionAccess().getOptionJsonOptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__OptionAssignment_1"


    // $ANTLR start "rule__ArrayJsonOption__OptionAssignment_2_1"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2369:1: rule__ArrayJsonOption__OptionAssignment_2_1 : ( ruleJsonOption ) ;
    public final void rule__ArrayJsonOption__OptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2373:1: ( ( ruleJsonOption ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2374:1: ( ruleJsonOption )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2374:1: ( ruleJsonOption )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2375:1: ruleJsonOption
            {
             before(grammarAccess.getArrayJsonOptionAccess().getOptionJsonOptionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonOption_in_rule__ArrayJsonOption__OptionAssignment_2_14636);
            ruleJsonOption();

            state._fsp--;

             after(grammarAccess.getArrayJsonOptionAccess().getOptionJsonOptionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayJsonOption__OptionAssignment_2_1"


    // $ANTLR start "rule__JsonOption__IdAssignment_1_2"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2384:1: rule__JsonOption__IdAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__JsonOption__IdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2388:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2389:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2389:1: ( RULE_STRING )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2390:1: RULE_STRING
            {
             before(grammarAccess.getJsonOptionAccess().getIdSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonOption__IdAssignment_1_24667); 
             after(grammarAccess.getJsonOptionAccess().getIdSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__IdAssignment_1_2"


    // $ANTLR start "rule__JsonOption__TextAssignment_4"
    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2399:1: rule__JsonOption__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__JsonOption__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2403:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2404:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2404:1: ( RULE_STRING )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:2405:1: RULE_STRING
            {
             before(grammarAccess.getJsonOptionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonOption__TextAssignment_44698); 
             after(grammarAccess.getJsonOptionAccess().getTextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonOption__TextAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJsonPollSystem_in_entryRuleJsonPollSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonPollSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__0_in_ruleJsonPollSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonPoll_in_entryRuleArrayJsonPoll121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayJsonPoll128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__0_in_ruleArrayJsonPoll154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonPoll_in_entryRuleJsonPoll181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonPoll188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__0_in_ruleJsonPoll214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonQuestion_in_entryRuleArrayJsonQuestion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayJsonQuestion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__0_in_ruleArrayJsonQuestion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonQuestion_in_entryRuleJsonQuestion301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonQuestion308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__0_in_ruleJsonQuestion334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonOption_in_entryRuleArrayJsonOption361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayJsonOption368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__0_in_ruleArrayJsonOption394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonOption_in_entryRuleJsonOption421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonOption428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__0_in_ruleJsonOption454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__0__Impl_in_rule__JsonPollSystem__Group__0488 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__1_in_rule__JsonPollSystem__Group__0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__JsonPollSystem__Group__0__Impl519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__1__Impl_in_rule__JsonPollSystem__Group__1550 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__2_in_rule__JsonPollSystem__Group__1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__JsonPollSystem__Group__1__Impl581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__2__Impl_in_rule__JsonPollSystem__Group__2612 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__3_in_rule__JsonPollSystem__Group__2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonPollSystem__Group__2__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__3__Impl_in_rule__JsonPollSystem__Group__3674 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__4_in_rule__JsonPollSystem__Group__3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonPoll_in_rule__JsonPollSystem__Group__3__Impl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPollSystem__Group__4__Impl_in_rule__JsonPollSystem__Group__4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JsonPollSystem__Group__4__Impl761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__0__Impl_in_rule__ArrayJsonPoll__Group__0802 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__1_in_rule__ArrayJsonPoll__Group__0805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArrayJsonPoll__Group__0__Impl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__1__Impl_in_rule__ArrayJsonPoll__Group__1864 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__2_in_rule__ArrayJsonPoll__Group__1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__PollsAssignment_1_in_rule__ArrayJsonPoll__Group__1__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__2__Impl_in_rule__ArrayJsonPoll__Group__2925 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__3_in_rule__ArrayJsonPoll__Group__2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group_2__0_in_rule__ArrayJsonPoll__Group__2__Impl955 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group__3__Impl_in_rule__ArrayJsonPoll__Group__3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArrayJsonPoll__Group__3__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group_2__0__Impl_in_rule__ArrayJsonPoll__Group_2__01053 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group_2__1_in_rule__ArrayJsonPoll__Group_2__01056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ArrayJsonPoll__Group_2__0__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__Group_2__1__Impl_in_rule__ArrayJsonPoll__Group_2__11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonPoll__PollsAssignment_2_1_in_rule__ArrayJsonPoll__Group_2__1__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__0__Impl_in_rule__JsonPoll__Group__01176 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__1_in_rule__JsonPoll__Group__01179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__JsonPoll__Group__0__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__1__Impl_in_rule__JsonPoll__Group__11238 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__2_in_rule__JsonPoll__Group__11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__0_in_rule__JsonPoll__Group__1__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__2__Impl_in_rule__JsonPoll__Group__21299 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__3_in_rule__JsonPoll__Group__21302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__JsonPoll__Group__2__Impl1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__3__Impl_in_rule__JsonPoll__Group__31361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__4_in_rule__JsonPoll__Group__31364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonPoll__Group__3__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__4__Impl_in_rule__JsonPoll__Group__41423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__5_in_rule__JsonPoll__Group__41426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__QuestionsAssignment_4_in_rule__JsonPoll__Group__4__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group__5__Impl_in_rule__JsonPoll__Group__51483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JsonPoll__Group__5__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__0__Impl_in_rule__JsonPoll__Group_1__01554 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__1_in_rule__JsonPoll__Group_1__01557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonPoll__Group_1__0__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__1__Impl_in_rule__JsonPoll__Group_1__11616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__2_in_rule__JsonPoll__Group_1__11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonPoll__Group_1__1__Impl1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__2__Impl_in_rule__JsonPoll__Group_1__21678 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__3_in_rule__JsonPoll__Group_1__21681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__NameAssignment_1_2_in_rule__JsonPoll__Group_1__2__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonPoll__Group_1__3__Impl_in_rule__JsonPoll__Group_1__31738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonPoll__Group_1__3__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__0__Impl_in_rule__ArrayJsonQuestion__Group__01805 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__1_in_rule__ArrayJsonQuestion__Group__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArrayJsonQuestion__Group__0__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__1__Impl_in_rule__ArrayJsonQuestion__Group__11867 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__2_in_rule__ArrayJsonQuestion__Group__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__QuestionAssignment_1_in_rule__ArrayJsonQuestion__Group__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__2__Impl_in_rule__ArrayJsonQuestion__Group__21928 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__3_in_rule__ArrayJsonQuestion__Group__21931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group_2__0_in_rule__ArrayJsonQuestion__Group__2__Impl1958 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group__3__Impl_in_rule__ArrayJsonQuestion__Group__31989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArrayJsonQuestion__Group__3__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group_2__0__Impl_in_rule__ArrayJsonQuestion__Group_2__02056 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group_2__1_in_rule__ArrayJsonQuestion__Group_2__02059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ArrayJsonQuestion__Group_2__0__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__Group_2__1__Impl_in_rule__ArrayJsonQuestion__Group_2__12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonQuestion__QuestionAssignment_2_1_in_rule__ArrayJsonQuestion__Group_2__1__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__0__Impl_in_rule__JsonQuestion__Group__02179 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__1_in_rule__JsonQuestion__Group__02182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__JsonQuestion__Group__0__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__1__Impl_in_rule__JsonQuestion__Group__12241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__2_in_rule__JsonQuestion__Group__12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JsonQuestion__Group__1__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__2__Impl_in_rule__JsonQuestion__Group__22303 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__3_in_rule__JsonQuestion__Group__22306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonQuestion__Group__2__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__3__Impl_in_rule__JsonQuestion__Group__32365 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__4_in_rule__JsonQuestion__Group__32368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__JsonQuestion__Group__3__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__4__Impl_in_rule__JsonQuestion__Group__42427 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__5_in_rule__JsonQuestion__Group__42430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__0_in_rule__JsonQuestion__Group__4__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__5__Impl_in_rule__JsonQuestion__Group__52488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__6_in_rule__JsonQuestion__Group__52491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JsonQuestion__Group__5__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__6__Impl_in_rule__JsonQuestion__Group__62550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__7_in_rule__JsonQuestion__Group__62553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonQuestion__Group__6__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__7__Impl_in_rule__JsonQuestion__Group__72612 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__8_in_rule__JsonQuestion__Group__72615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__TextAssignment_7_in_rule__JsonQuestion__Group__7__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__8__Impl_in_rule__JsonQuestion__Group__82672 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__9_in_rule__JsonQuestion__Group__82675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonQuestion__Group__8__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__9__Impl_in_rule__JsonQuestion__Group__92734 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__10_in_rule__JsonQuestion__Group__92737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonQuestion__Group__9__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__10__Impl_in_rule__JsonQuestion__Group__102796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__11_in_rule__JsonQuestion__Group__102799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonQuestion__Group__10__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__11__Impl_in_rule__JsonQuestion__Group__112858 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__12_in_rule__JsonQuestion__Group__112861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__OptionsAssignment_11_in_rule__JsonQuestion__Group__11__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__12__Impl_in_rule__JsonQuestion__Group__122918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__13_in_rule__JsonQuestion__Group__122921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JsonQuestion__Group__12__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group__13__Impl_in_rule__JsonQuestion__Group__132980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JsonQuestion__Group__13__Impl3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__0__Impl_in_rule__JsonQuestion__Group_4__03067 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__1_in_rule__JsonQuestion__Group_4__03070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonQuestion__Group_4__0__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__1__Impl_in_rule__JsonQuestion__Group_4__13129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__2_in_rule__JsonQuestion__Group_4__13132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonQuestion__Group_4__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__2__Impl_in_rule__JsonQuestion__Group_4__23191 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__3_in_rule__JsonQuestion__Group_4__23194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__NameAssignment_4_2_in_rule__JsonQuestion__Group_4__2__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonQuestion__Group_4__3__Impl_in_rule__JsonQuestion__Group_4__33251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonQuestion__Group_4__3__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__0__Impl_in_rule__ArrayJsonOption__Group__03318 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__1_in_rule__ArrayJsonOption__Group__03321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArrayJsonOption__Group__0__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__1__Impl_in_rule__ArrayJsonOption__Group__13380 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__2_in_rule__ArrayJsonOption__Group__13383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__OptionAssignment_1_in_rule__ArrayJsonOption__Group__1__Impl3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__2__Impl_in_rule__ArrayJsonOption__Group__23441 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__3_in_rule__ArrayJsonOption__Group__23444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group_2__0_in_rule__ArrayJsonOption__Group__2__Impl3471 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group__3__Impl_in_rule__ArrayJsonOption__Group__33502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArrayJsonOption__Group__3__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group_2__0__Impl_in_rule__ArrayJsonOption__Group_2__03569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group_2__1_in_rule__ArrayJsonOption__Group_2__03572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ArrayJsonOption__Group_2__0__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__Group_2__1__Impl_in_rule__ArrayJsonOption__Group_2__13631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayJsonOption__OptionAssignment_2_1_in_rule__ArrayJsonOption__Group_2__1__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__0__Impl_in_rule__JsonOption__Group__03692 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__1_in_rule__JsonOption__Group__03695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__JsonOption__Group__0__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__1__Impl_in_rule__JsonOption__Group__13754 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__2_in_rule__JsonOption__Group__13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__0_in_rule__JsonOption__Group__1__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__2__Impl_in_rule__JsonOption__Group__23815 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__3_in_rule__JsonOption__Group__23818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonOption__Group__2__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__3__Impl_in_rule__JsonOption__Group__33877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__4_in_rule__JsonOption__Group__33880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonOption__Group__3__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__4__Impl_in_rule__JsonOption__Group__43939 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__5_in_rule__JsonOption__Group__43942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__TextAssignment_4_in_rule__JsonOption__Group__4__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group__5__Impl_in_rule__JsonOption__Group__53999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JsonOption__Group__5__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__0__Impl_in_rule__JsonOption__Group_1__04070 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__1_in_rule__JsonOption__Group_1__04073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonOption__Group_1__0__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__1__Impl_in_rule__JsonOption__Group_1__14132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__2_in_rule__JsonOption__Group_1__14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JsonOption__Group_1__1__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__2__Impl_in_rule__JsonOption__Group_1__24194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__3_in_rule__JsonOption__Group_1__24197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__IdAssignment_1_2_in_rule__JsonOption__Group_1__2__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonOption__Group_1__3__Impl_in_rule__JsonOption__Group_1__34254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonOption__Group_1__3__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonPoll_in_rule__ArrayJsonPoll__PollsAssignment_14326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonPoll_in_rule__ArrayJsonPoll__PollsAssignment_2_14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonPoll__NameAssignment_1_24388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonQuestion_in_rule__JsonPoll__QuestionsAssignment_44419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonQuestion_in_rule__ArrayJsonQuestion__QuestionAssignment_14450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonQuestion_in_rule__ArrayJsonQuestion__QuestionAssignment_2_14481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonQuestion__NameAssignment_4_24512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonQuestion__TextAssignment_74543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayJsonOption_in_rule__JsonQuestion__OptionsAssignment_114574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonOption_in_rule__ArrayJsonOption__OptionAssignment_14605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonOption_in_rule__ArrayJsonOption__OptionAssignment_2_14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonOption__IdAssignment_1_24667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonOption__TextAssignment_44698 = new BitSet(new long[]{0x0000000000000002L});

}