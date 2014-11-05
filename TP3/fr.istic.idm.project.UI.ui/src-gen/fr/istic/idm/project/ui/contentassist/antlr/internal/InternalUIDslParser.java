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
import fr.istic.idm.project.services.UIDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUIDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'0'", "'1'", "'2'", "'3'", "'4'", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'->'"
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
    public String getGrammarFileName() { return "../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g"; }


     
     	private UIDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UIDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePollSystem"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:60:1: entryRulePollSystem : rulePollSystem EOF ;
    public final void entryRulePollSystem() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:61:1: ( rulePollSystem EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:62:1: rulePollSystem EOF
            {
             before(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_rulePollSystem_in_entryRulePollSystem61);
            rulePollSystem();

            state._fsp--;

             after(grammarAccess.getPollSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePollSystem68); 

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
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:69:1: rulePollSystem : ( ( rule__PollSystem__PollsAssignment )* ) ;
    public final void rulePollSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:73:2: ( ( ( rule__PollSystem__PollsAssignment )* ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:74:1: ( ( rule__PollSystem__PollsAssignment )* )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:74:1: ( ( rule__PollSystem__PollsAssignment )* )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:75:1: ( rule__PollSystem__PollsAssignment )*
            {
             before(grammarAccess.getPollSystemAccess().getPollsAssignment()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:76:1: ( rule__PollSystem__PollsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:76:2: rule__PollSystem__PollsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__PollSystem__PollsAssignment_in_rulePollSystem94);
            	    rule__PollSystem__PollsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPollSystemAccess().getPollsAssignment()); 

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
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRulePoll"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:88:1: entryRulePoll : rulePoll EOF ;
    public final void entryRulePoll() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:89:1: ( rulePoll EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:90:1: rulePoll EOF
            {
             before(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_rulePoll_in_entryRulePoll122);
            rulePoll();

            state._fsp--;

             after(grammarAccess.getPollRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoll129); 

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
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:97:1: rulePoll : ( ( rule__Poll__Group__0 ) ) ;
    public final void rulePoll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:101:2: ( ( ( rule__Poll__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:102:1: ( ( rule__Poll__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:102:1: ( ( rule__Poll__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:103:1: ( rule__Poll__Group__0 )
            {
             before(grammarAccess.getPollAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:104:1: ( rule__Poll__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:104:2: rule__Poll__Group__0
            {
            pushFollow(FOLLOW_rule__Poll__Group__0_in_rulePoll155);
            rule__Poll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getGroup()); 

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
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleQuestion"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:117:1: ( ruleQuestion EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion182);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion189); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:125:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:129:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:130:1: ( ( rule__Question__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:130:1: ( ( rule__Question__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:131:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:132:1: ( rule__Question__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:132:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion215);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:144:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:145:1: ( ruleOption EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:146:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption242);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption249); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:153:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:157:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:158:1: ( ( rule__Option__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:158:1: ( ( rule__Option__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:159:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:160:1: ( rule__Option__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:160:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption275);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "ruleType"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:173:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:177:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:178:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:178:1: ( ( rule__Type__Alternatives ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:179:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:180:1: ( rule__Type__Alternatives )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:180:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType312);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:191:1: rule__Type__Alternatives : ( ( ( '0' ) ) | ( ( '1' ) ) | ( ( '2' ) ) | ( ( '3' ) ) | ( ( '4' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:195:1: ( ( ( '0' ) ) | ( ( '1' ) ) | ( ( '2' ) ) | ( ( '3' ) ) | ( ( '4' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:196:1: ( ( '0' ) )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:196:1: ( ( '0' ) )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:197:1: ( '0' )
                    {
                     before(grammarAccess.getTypeAccess().getCheckBoxEnumLiteralDeclaration_0()); 
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:198:1: ( '0' )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:198:3: '0'
                    {
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives348); 

                    }

                     after(grammarAccess.getTypeAccess().getCheckBoxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:203:6: ( ( '1' ) )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:203:6: ( ( '1' ) )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:204:1: ( '1' )
                    {
                     before(grammarAccess.getTypeAccess().getRadioButtonEnumLiteralDeclaration_1()); 
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:205:1: ( '1' )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:205:3: '1'
                    {
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives369); 

                    }

                     after(grammarAccess.getTypeAccess().getRadioButtonEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:210:6: ( ( '2' ) )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:210:6: ( ( '2' ) )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:211:1: ( '2' )
                    {
                     before(grammarAccess.getTypeAccess().getComboBoxEnumLiteralDeclaration_2()); 
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:212:1: ( '2' )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:212:3: '2'
                    {
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives390); 

                    }

                     after(grammarAccess.getTypeAccess().getComboBoxEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:217:6: ( ( '3' ) )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:217:6: ( ( '3' ) )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:218:1: ( '3' )
                    {
                     before(grammarAccess.getTypeAccess().getTextBoxEnumLiteralDeclaration_3()); 
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:219:1: ( '3' )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:219:3: '3'
                    {
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives411); 

                    }

                     after(grammarAccess.getTypeAccess().getTextBoxEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:224:6: ( ( '4' ) )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:224:6: ( ( '4' ) )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:225:1: ( '4' )
                    {
                     before(grammarAccess.getTypeAccess().getImageEnumLiteralDeclaration_4()); 
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:226:1: ( '4' )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:226:3: '4'
                    {
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives432); 

                    }

                     after(grammarAccess.getTypeAccess().getImageEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Poll__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:238:1: rule__Poll__Group__0 : rule__Poll__Group__0__Impl rule__Poll__Group__1 ;
    public final void rule__Poll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:242:1: ( rule__Poll__Group__0__Impl rule__Poll__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:243:2: rule__Poll__Group__0__Impl rule__Poll__Group__1
            {
            pushFollow(FOLLOW_rule__Poll__Group__0__Impl_in_rule__Poll__Group__0465);
            rule__Poll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__1_in_rule__Poll__Group__0468);
            rule__Poll__Group__1();

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
    // $ANTLR end "rule__Poll__Group__0"


    // $ANTLR start "rule__Poll__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:250:1: rule__Poll__Group__0__Impl : ( 'Poll' ) ;
    public final void rule__Poll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:254:1: ( ( 'Poll' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:255:1: ( 'Poll' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:255:1: ( 'Poll' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:256:1: 'Poll'
            {
             before(grammarAccess.getPollAccess().getPollKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Poll__Group__0__Impl496); 
             after(grammarAccess.getPollAccess().getPollKeyword_0()); 

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
    // $ANTLR end "rule__Poll__Group__0__Impl"


    // $ANTLR start "rule__Poll__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:269:1: rule__Poll__Group__1 : rule__Poll__Group__1__Impl rule__Poll__Group__2 ;
    public final void rule__Poll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:273:1: ( rule__Poll__Group__1__Impl rule__Poll__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:274:2: rule__Poll__Group__1__Impl rule__Poll__Group__2
            {
            pushFollow(FOLLOW_rule__Poll__Group__1__Impl_in_rule__Poll__Group__1527);
            rule__Poll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__2_in_rule__Poll__Group__1530);
            rule__Poll__Group__2();

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
    // $ANTLR end "rule__Poll__Group__1"


    // $ANTLR start "rule__Poll__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:281:1: rule__Poll__Group__1__Impl : ( ( rule__Poll__NameAssignment_1 )? ) ;
    public final void rule__Poll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:285:1: ( ( ( rule__Poll__NameAssignment_1 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:286:1: ( ( rule__Poll__NameAssignment_1 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:286:1: ( ( rule__Poll__NameAssignment_1 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:287:1: ( rule__Poll__NameAssignment_1 )?
            {
             before(grammarAccess.getPollAccess().getNameAssignment_1()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:288:1: ( rule__Poll__NameAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:288:2: rule__Poll__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Poll__NameAssignment_1_in_rule__Poll__Group__1__Impl557);
                    rule__Poll__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPollAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Poll__Group__1__Impl"


    // $ANTLR start "rule__Poll__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:298:1: rule__Poll__Group__2 : rule__Poll__Group__2__Impl rule__Poll__Group__3 ;
    public final void rule__Poll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:302:1: ( rule__Poll__Group__2__Impl rule__Poll__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:303:2: rule__Poll__Group__2__Impl rule__Poll__Group__3
            {
            pushFollow(FOLLOW_rule__Poll__Group__2__Impl_in_rule__Poll__Group__2588);
            rule__Poll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__3_in_rule__Poll__Group__2591);
            rule__Poll__Group__3();

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
    // $ANTLR end "rule__Poll__Group__2"


    // $ANTLR start "rule__Poll__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:310:1: rule__Poll__Group__2__Impl : ( '{' ) ;
    public final void rule__Poll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:314:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:315:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:315:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:316:1: '{'
            {
             before(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Poll__Group__2__Impl619); 
             after(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Poll__Group__2__Impl"


    // $ANTLR start "rule__Poll__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:329:1: rule__Poll__Group__3 : rule__Poll__Group__3__Impl rule__Poll__Group__4 ;
    public final void rule__Poll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:333:1: ( rule__Poll__Group__3__Impl rule__Poll__Group__4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:334:2: rule__Poll__Group__3__Impl rule__Poll__Group__4
            {
            pushFollow(FOLLOW_rule__Poll__Group__3__Impl_in_rule__Poll__Group__3650);
            rule__Poll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__4_in_rule__Poll__Group__3653);
            rule__Poll__Group__4();

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
    // $ANTLR end "rule__Poll__Group__3"


    // $ANTLR start "rule__Poll__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:341:1: rule__Poll__Group__3__Impl : ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) ) ;
    public final void rule__Poll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:345:1: ( ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:346:1: ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:346:1: ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:347:1: ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:347:1: ( ( rule__Poll__QuestionsAssignment_3 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:348:1: ( rule__Poll__QuestionsAssignment_3 )
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:349:1: ( rule__Poll__QuestionsAssignment_3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:349:2: rule__Poll__QuestionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl682);
            rule__Poll__QuestionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 

            }

            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:352:1: ( ( rule__Poll__QuestionsAssignment_3 )* )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:353:1: ( rule__Poll__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:354:1: ( rule__Poll__QuestionsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:354:2: rule__Poll__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl694);
            	    rule__Poll__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 

            }


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
    // $ANTLR end "rule__Poll__Group__3__Impl"


    // $ANTLR start "rule__Poll__Group__4"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:365:1: rule__Poll__Group__4 : rule__Poll__Group__4__Impl ;
    public final void rule__Poll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:369:1: ( rule__Poll__Group__4__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:370:2: rule__Poll__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Poll__Group__4__Impl_in_rule__Poll__Group__4727);
            rule__Poll__Group__4__Impl();

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
    // $ANTLR end "rule__Poll__Group__4"


    // $ANTLR start "rule__Poll__Group__4__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:376:1: rule__Poll__Group__4__Impl : ( '}' ) ;
    public final void rule__Poll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:380:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:381:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:381:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:382:1: '}'
            {
             before(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Poll__Group__4__Impl755); 
             after(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Poll__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:405:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:409:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:410:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0796);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0799);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:417:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:421:1: ( ( 'Question' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:422:1: ( 'Question' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:422:1: ( 'Question' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:423:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Question__Group__0__Impl827); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:436:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:440:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:441:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1858);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1861);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:448:1: rule__Question__Group__1__Impl : ( ( rule__Question__IdAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:452:1: ( ( ( rule__Question__IdAssignment_1 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:453:1: ( ( rule__Question__IdAssignment_1 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:453:1: ( ( rule__Question__IdAssignment_1 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:454:1: ( rule__Question__IdAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_1()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:455:1: ( rule__Question__IdAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:455:2: rule__Question__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Question__IdAssignment_1_in_rule__Question__Group__1__Impl888);
                    rule__Question__IdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:465:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:469:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:470:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2919);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2922);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:477:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:481:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:482:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:482:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:483:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__2__Impl950); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:496:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:500:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:501:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3981);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3984);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:508:1: rule__Question__Group__3__Impl : ( 'options' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:512:1: ( ( 'options' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:513:1: ( 'options' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:513:1: ( 'options' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:514:1: 'options'
            {
             before(grammarAccess.getQuestionAccess().getOptionsKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Question__Group__3__Impl1012); 
             after(grammarAccess.getQuestionAccess().getOptionsKeyword_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:527:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:531:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:532:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41043);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41046);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:539:1: rule__Question__Group__4__Impl : ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:543:1: ( ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:544:1: ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:544:1: ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:545:1: ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:545:1: ( ( rule__Question__OptionsAssignment_4 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:546:1: ( rule__Question__OptionsAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:547:1: ( rule__Question__OptionsAssignment_4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:547:2: rule__Question__OptionsAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1075);
            rule__Question__OptionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 

            }

            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:550:1: ( ( rule__Question__OptionsAssignment_4 )* )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:551:1: ( rule__Question__OptionsAssignment_4 )*
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:552:1: ( rule__Question__OptionsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:552:2: rule__Question__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1087);
            	    rule__Question__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 

            }


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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:563:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:567:1: ( rule__Question__Group__5__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:568:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51120);
            rule__Question__Group__5__Impl();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:574:1: rule__Question__Group__5__Impl : ( '}' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:578:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:579:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:579:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:580:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Question__Group__5__Impl1148); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:605:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:609:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:610:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01191);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01194);
            rule__Option__Group__1();

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:617:1: rule__Option__Group__0__Impl : ( ( rule__Option__Group_0__0 )? ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:621:1: ( ( ( rule__Option__Group_0__0 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:622:1: ( ( rule__Option__Group_0__0 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:622:1: ( ( rule__Option__Group_0__0 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:623:1: ( rule__Option__Group_0__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:624:1: ( rule__Option__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:624:2: rule__Option__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Option__Group_0__0_in_rule__Option__Group__0__Impl1221);
                    rule__Option__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:634:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:638:1: ( rule__Option__Group__1__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:639:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11252);
            rule__Option__Group__1__Impl();

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:645:1: rule__Option__Group__1__Impl : ( ( rule__Option__TypeAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:649:1: ( ( ( rule__Option__TypeAssignment_1 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:650:1: ( ( rule__Option__TypeAssignment_1 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:650:1: ( ( rule__Option__TypeAssignment_1 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:651:1: ( rule__Option__TypeAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getTypeAssignment_1()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:652:1: ( rule__Option__TypeAssignment_1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:652:2: rule__Option__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Option__TypeAssignment_1_in_rule__Option__Group__1__Impl1279);
            rule__Option__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group_0__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:666:1: rule__Option__Group_0__0 : rule__Option__Group_0__0__Impl rule__Option__Group_0__1 ;
    public final void rule__Option__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:670:1: ( rule__Option__Group_0__0__Impl rule__Option__Group_0__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:671:2: rule__Option__Group_0__0__Impl rule__Option__Group_0__1
            {
            pushFollow(FOLLOW_rule__Option__Group_0__0__Impl_in_rule__Option__Group_0__01313);
            rule__Option__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group_0__1_in_rule__Option__Group_0__01316);
            rule__Option__Group_0__1();

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
    // $ANTLR end "rule__Option__Group_0__0"


    // $ANTLR start "rule__Option__Group_0__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:678:1: rule__Option__Group_0__0__Impl : ( ( rule__Option__IdAssignment_0_0 ) ) ;
    public final void rule__Option__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:682:1: ( ( ( rule__Option__IdAssignment_0_0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:683:1: ( ( rule__Option__IdAssignment_0_0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:683:1: ( ( rule__Option__IdAssignment_0_0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:684:1: ( rule__Option__IdAssignment_0_0 )
            {
             before(grammarAccess.getOptionAccess().getIdAssignment_0_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:685:1: ( rule__Option__IdAssignment_0_0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:685:2: rule__Option__IdAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Option__IdAssignment_0_0_in_rule__Option__Group_0__0__Impl1343);
            rule__Option__IdAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getIdAssignment_0_0()); 

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
    // $ANTLR end "rule__Option__Group_0__0__Impl"


    // $ANTLR start "rule__Option__Group_0__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:695:1: rule__Option__Group_0__1 : rule__Option__Group_0__1__Impl ;
    public final void rule__Option__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:699:1: ( rule__Option__Group_0__1__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:700:2: rule__Option__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group_0__1__Impl_in_rule__Option__Group_0__11373);
            rule__Option__Group_0__1__Impl();

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
    // $ANTLR end "rule__Option__Group_0__1"


    // $ANTLR start "rule__Option__Group_0__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:706:1: rule__Option__Group_0__1__Impl : ( '->' ) ;
    public final void rule__Option__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:710:1: ( ( '->' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:711:1: ( '->' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:711:1: ( '->' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:712:1: '->'
            {
             before(grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Option__Group_0__1__Impl1401); 
             after(grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Option__Group_0__1__Impl"


    // $ANTLR start "rule__PollSystem__PollsAssignment"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:730:1: rule__PollSystem__PollsAssignment : ( rulePoll ) ;
    public final void rule__PollSystem__PollsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:734:1: ( ( rulePoll ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:735:1: ( rulePoll )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:735:1: ( rulePoll )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:736:1: rulePoll
            {
             before(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePoll_in_rule__PollSystem__PollsAssignment1441);
            rulePoll();

            state._fsp--;

             after(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); 

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
    // $ANTLR end "rule__PollSystem__PollsAssignment"


    // $ANTLR start "rule__Poll__NameAssignment_1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:745:1: rule__Poll__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Poll__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:749:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:750:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:750:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:751:1: RULE_ID
            {
             before(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Poll__NameAssignment_11472); 
             after(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Poll__NameAssignment_1"


    // $ANTLR start "rule__Poll__QuestionsAssignment_3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:760:1: rule__Poll__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Poll__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:764:1: ( ( ruleQuestion ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:765:1: ( ruleQuestion )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:765:1: ( ruleQuestion )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:766:1: ruleQuestion
            {
             before(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Poll__QuestionsAssignment_31503);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Poll__QuestionsAssignment_3"


    // $ANTLR start "rule__Question__IdAssignment_1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:775:1: rule__Question__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:779:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:780:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:780:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:781:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__IdAssignment_11534); 
             after(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question__IdAssignment_1"


    // $ANTLR start "rule__Question__OptionsAssignment_4"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:790:1: rule__Question__OptionsAssignment_4 : ( ruleOption ) ;
    public final void rule__Question__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:794:1: ( ( ruleOption ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:795:1: ( ruleOption )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:795:1: ( ruleOption )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:796:1: ruleOption
            {
             before(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Question__OptionsAssignment_41565);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Question__OptionsAssignment_4"


    // $ANTLR start "rule__Option__IdAssignment_0_0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:805:1: rule__Option__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Option__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:809:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:810:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:810:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:811:1: RULE_ID
            {
             before(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Option__IdAssignment_0_01596); 
             after(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Option__IdAssignment_0_0"


    // $ANTLR start "rule__Option__TypeAssignment_1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:820:1: rule__Option__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Option__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:824:1: ( ( ruleType ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:825:1: ( ruleType )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:825:1: ( ruleType )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:826:1: ruleType
            {
             before(grammarAccess.getOptionAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Option__TypeAssignment_11627);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getTypeTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Option__TypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePollSystem_in_entryRulePollSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__PollsAssignment_in_rulePollSystem94 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__0_in_rulePoll155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__0__Impl_in_rule__Poll__Group__0465 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Poll__Group__1_in_rule__Poll__Group__0468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Poll__Group__0__Impl496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__1__Impl_in_rule__Poll__Group__1527 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Poll__Group__2_in_rule__Poll__Group__1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__NameAssignment_1_in_rule__Poll__Group__1__Impl557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__2__Impl_in_rule__Poll__Group__2588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Poll__Group__3_in_rule__Poll__Group__2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Poll__Group__2__Impl619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__3__Impl_in_rule__Poll__Group__3650 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Poll__Group__4_in_rule__Poll__Group__3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl682 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl694 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Poll__Group__4__Impl_in_rule__Poll__Group__4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Poll__Group__4__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0796 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Question__Group__0__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1858 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_1_in_rule__Question__Group__1__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2919 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__2__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3981 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Question__Group__3__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41043 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1075 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1087 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Question__Group__5__Impl1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01191 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__0_in_rule__Option__Group__0__Impl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__TypeAssignment_1_in_rule__Option__Group__1__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__0__Impl_in_rule__Option__Group_0__01313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Option__Group_0__1_in_rule__Option__Group_0__01316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__IdAssignment_0_0_in_rule__Option__Group_0__0__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__1__Impl_in_rule__Option__Group_0__11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Option__Group_0__1__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_rule__PollSystem__PollsAssignment1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Poll__NameAssignment_11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Poll__QuestionsAssignment_31503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__IdAssignment_11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Question__OptionsAssignment_41565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Option__IdAssignment_0_01596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Option__TypeAssignment_11627 = new BitSet(new long[]{0x0000000000000002L});

}