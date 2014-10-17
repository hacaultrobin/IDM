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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'->'", "'Image'", "'Checkbox'", "'RadioButton'", "'ComboBoxItem'", "'TextBox'"
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

                if ( (LA1_0==11) ) {
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


    // $ANTLR start "entryRuleType"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:173:1: ( ruleType EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType302);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType309); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:181:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:185:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:186:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:186:1: ( ( rule__Type__Alternatives ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:187:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:188:1: ( rule__Type__Alternatives )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:188:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType335);
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


    // $ANTLR start "entryRuleCheckBox"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:200:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:201:1: ( ruleCheckBox EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:202:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox362);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox369); 

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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:209:1: ruleCheckBox : ( ( rule__CheckBox__Group__0 ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:213:2: ( ( ( rule__CheckBox__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:214:1: ( ( rule__CheckBox__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:214:1: ( ( rule__CheckBox__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:215:1: ( rule__CheckBox__Group__0 )
            {
             before(grammarAccess.getCheckBoxAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:216:1: ( rule__CheckBox__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:216:2: rule__CheckBox__Group__0
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__0_in_ruleCheckBox395);
            rule__CheckBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getGroup()); 

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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioButton"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:228:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:229:1: ( ruleRadioButton EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:230:1: ruleRadioButton EOF
            {
             before(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton422);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton429); 

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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:237:1: ruleRadioButton : ( ( rule__RadioButton__Group__0 ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:241:2: ( ( ( rule__RadioButton__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:242:1: ( ( rule__RadioButton__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:242:1: ( ( rule__RadioButton__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:243:1: ( rule__RadioButton__Group__0 )
            {
             before(grammarAccess.getRadioButtonAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:244:1: ( rule__RadioButton__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:244:2: rule__RadioButton__Group__0
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__0_in_ruleRadioButton455);
            rule__RadioButton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleComboBox"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:256:1: entryRuleComboBox : ruleComboBox EOF ;
    public final void entryRuleComboBox() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:257:1: ( ruleComboBox EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:258:1: ruleComboBox EOF
            {
             before(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_ruleComboBox_in_entryRuleComboBox482);
            ruleComboBox();

            state._fsp--;

             after(grammarAccess.getComboBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboBox489); 

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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:265:1: ruleComboBox : ( ( rule__ComboBox__Group__0 ) ) ;
    public final void ruleComboBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:269:2: ( ( ( rule__ComboBox__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:270:1: ( ( rule__ComboBox__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:270:1: ( ( rule__ComboBox__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:271:1: ( rule__ComboBox__Group__0 )
            {
             before(grammarAccess.getComboBoxAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:272:1: ( rule__ComboBox__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:272:2: rule__ComboBox__Group__0
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__0_in_ruleComboBox515);
            rule__ComboBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getGroup()); 

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
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "entryRuleTextBox"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:284:1: entryRuleTextBox : ruleTextBox EOF ;
    public final void entryRuleTextBox() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:285:1: ( ruleTextBox EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:286:1: ruleTextBox EOF
            {
             before(grammarAccess.getTextBoxRule()); 
            pushFollow(FOLLOW_ruleTextBox_in_entryRuleTextBox542);
            ruleTextBox();

            state._fsp--;

             after(grammarAccess.getTextBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBox549); 

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
    // $ANTLR end "entryRuleTextBox"


    // $ANTLR start "ruleTextBox"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:293:1: ruleTextBox : ( ( rule__TextBox__Group__0 ) ) ;
    public final void ruleTextBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:297:2: ( ( ( rule__TextBox__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:298:1: ( ( rule__TextBox__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:298:1: ( ( rule__TextBox__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:299:1: ( rule__TextBox__Group__0 )
            {
             before(grammarAccess.getTextBoxAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:300:1: ( rule__TextBox__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:300:2: rule__TextBox__Group__0
            {
            pushFollow(FOLLOW_rule__TextBox__Group__0_in_ruleTextBox575);
            rule__TextBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getGroup()); 

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
    // $ANTLR end "ruleTextBox"


    // $ANTLR start "entryRuleImage"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:312:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:313:1: ( ruleImage EOF )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:314:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage602);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage609); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:321:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:325:2: ( ( ( rule__Image__Group__0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:326:1: ( ( rule__Image__Group__0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:326:1: ( ( rule__Image__Group__0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:327:1: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:328:1: ( rule__Image__Group__0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:328:2: rule__Image__Group__0
            {
            pushFollow(FOLLOW_rule__Image__Group__0_in_ruleImage635);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "rule__Type__Alternatives"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:340:1: rule__Type__Alternatives : ( ( ruleCheckBox ) | ( ruleRadioButton ) | ( ruleComboBox ) | ( ruleTextBox ) | ( ruleImage ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:344:1: ( ( ruleCheckBox ) | ( ruleRadioButton ) | ( ruleComboBox ) | ( ruleTextBox ) | ( ruleImage ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 17:
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
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:345:1: ( ruleCheckBox )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:345:1: ( ruleCheckBox )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:346:1: ruleCheckBox
                    {
                     before(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCheckBox_in_rule__Type__Alternatives671);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCheckBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:351:6: ( ruleRadioButton )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:351:6: ( ruleRadioButton )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:352:1: ruleRadioButton
                    {
                     before(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRadioButton_in_rule__Type__Alternatives688);
                    ruleRadioButton();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRadioButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:357:6: ( ruleComboBox )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:357:6: ( ruleComboBox )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:358:1: ruleComboBox
                    {
                     before(grammarAccess.getTypeAccess().getComboBoxParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleComboBox_in_rule__Type__Alternatives705);
                    ruleComboBox();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComboBoxParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:363:6: ( ruleTextBox )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:363:6: ( ruleTextBox )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:364:1: ruleTextBox
                    {
                     before(grammarAccess.getTypeAccess().getTextBoxParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTextBox_in_rule__Type__Alternatives722);
                    ruleTextBox();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTextBoxParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:369:6: ( ruleImage )
                    {
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:369:6: ( ruleImage )
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:370:1: ruleImage
                    {
                     before(grammarAccess.getTypeAccess().getImageParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleImage_in_rule__Type__Alternatives739);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getImageParserRuleCall_4()); 

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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:382:1: rule__Poll__Group__0 : rule__Poll__Group__0__Impl rule__Poll__Group__1 ;
    public final void rule__Poll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:386:1: ( rule__Poll__Group__0__Impl rule__Poll__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:387:2: rule__Poll__Group__0__Impl rule__Poll__Group__1
            {
            pushFollow(FOLLOW_rule__Poll__Group__0__Impl_in_rule__Poll__Group__0769);
            rule__Poll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__1_in_rule__Poll__Group__0772);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:394:1: rule__Poll__Group__0__Impl : ( 'Poll' ) ;
    public final void rule__Poll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:398:1: ( ( 'Poll' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:399:1: ( 'Poll' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:399:1: ( 'Poll' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:400:1: 'Poll'
            {
             before(grammarAccess.getPollAccess().getPollKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Poll__Group__0__Impl800); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:413:1: rule__Poll__Group__1 : rule__Poll__Group__1__Impl rule__Poll__Group__2 ;
    public final void rule__Poll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:417:1: ( rule__Poll__Group__1__Impl rule__Poll__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:418:2: rule__Poll__Group__1__Impl rule__Poll__Group__2
            {
            pushFollow(FOLLOW_rule__Poll__Group__1__Impl_in_rule__Poll__Group__1831);
            rule__Poll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__2_in_rule__Poll__Group__1834);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:425:1: rule__Poll__Group__1__Impl : ( ( rule__Poll__NameAssignment_1 )? ) ;
    public final void rule__Poll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:429:1: ( ( ( rule__Poll__NameAssignment_1 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:430:1: ( ( rule__Poll__NameAssignment_1 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:430:1: ( ( rule__Poll__NameAssignment_1 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:431:1: ( rule__Poll__NameAssignment_1 )?
            {
             before(grammarAccess.getPollAccess().getNameAssignment_1()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:432:1: ( rule__Poll__NameAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:432:2: rule__Poll__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Poll__NameAssignment_1_in_rule__Poll__Group__1__Impl861);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:442:1: rule__Poll__Group__2 : rule__Poll__Group__2__Impl rule__Poll__Group__3 ;
    public final void rule__Poll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:446:1: ( rule__Poll__Group__2__Impl rule__Poll__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:447:2: rule__Poll__Group__2__Impl rule__Poll__Group__3
            {
            pushFollow(FOLLOW_rule__Poll__Group__2__Impl_in_rule__Poll__Group__2892);
            rule__Poll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__3_in_rule__Poll__Group__2895);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:454:1: rule__Poll__Group__2__Impl : ( '{' ) ;
    public final void rule__Poll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:458:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:459:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:459:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:460:1: '{'
            {
             before(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Poll__Group__2__Impl923); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:473:1: rule__Poll__Group__3 : rule__Poll__Group__3__Impl rule__Poll__Group__4 ;
    public final void rule__Poll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:477:1: ( rule__Poll__Group__3__Impl rule__Poll__Group__4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:478:2: rule__Poll__Group__3__Impl rule__Poll__Group__4
            {
            pushFollow(FOLLOW_rule__Poll__Group__3__Impl_in_rule__Poll__Group__3954);
            rule__Poll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poll__Group__4_in_rule__Poll__Group__3957);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:485:1: rule__Poll__Group__3__Impl : ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) ) ;
    public final void rule__Poll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:489:1: ( ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:490:1: ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:490:1: ( ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:491:1: ( ( rule__Poll__QuestionsAssignment_3 ) ) ( ( rule__Poll__QuestionsAssignment_3 )* )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:491:1: ( ( rule__Poll__QuestionsAssignment_3 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:492:1: ( rule__Poll__QuestionsAssignment_3 )
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:493:1: ( rule__Poll__QuestionsAssignment_3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:493:2: rule__Poll__QuestionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl986);
            rule__Poll__QuestionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 

            }

            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:496:1: ( ( rule__Poll__QuestionsAssignment_3 )* )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:497:1: ( rule__Poll__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_3()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:498:1: ( rule__Poll__QuestionsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:498:2: rule__Poll__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl998);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:509:1: rule__Poll__Group__4 : rule__Poll__Group__4__Impl ;
    public final void rule__Poll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:513:1: ( rule__Poll__Group__4__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:514:2: rule__Poll__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Poll__Group__4__Impl_in_rule__Poll__Group__41031);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:520:1: rule__Poll__Group__4__Impl : ( '}' ) ;
    public final void rule__Poll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:524:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:525:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:525:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:526:1: '}'
            {
             before(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Poll__Group__4__Impl1059); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:549:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:553:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:554:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01100);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01103);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:561:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:565:1: ( ( 'Question' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:566:1: ( 'Question' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:566:1: ( 'Question' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:567:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__0__Impl1131); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:580:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:584:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:585:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11162);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11165);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:592:1: rule__Question__Group__1__Impl : ( ( rule__Question__IdAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:596:1: ( ( ( rule__Question__IdAssignment_1 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:597:1: ( ( rule__Question__IdAssignment_1 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:597:1: ( ( rule__Question__IdAssignment_1 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:598:1: ( rule__Question__IdAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_1()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:599:1: ( rule__Question__IdAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:599:2: rule__Question__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Question__IdAssignment_1_in_rule__Question__Group__1__Impl1192);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:609:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:613:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:614:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21223);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21226);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:621:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:625:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:626:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:626:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:627:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__2__Impl1254); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:640:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:644:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:645:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31285);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31288);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:652:1: rule__Question__Group__3__Impl : ( 'options' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:656:1: ( ( 'options' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:657:1: ( 'options' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:657:1: ( 'options' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:658:1: 'options'
            {
             before(grammarAccess.getQuestionAccess().getOptionsKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Question__Group__3__Impl1316); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:671:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:675:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:676:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41347);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41350);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:683:1: rule__Question__Group__4__Impl : ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:687:1: ( ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:688:1: ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:688:1: ( ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:689:1: ( ( rule__Question__OptionsAssignment_4 ) ) ( ( rule__Question__OptionsAssignment_4 )* )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:689:1: ( ( rule__Question__OptionsAssignment_4 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:690:1: ( rule__Question__OptionsAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:691:1: ( rule__Question__OptionsAssignment_4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:691:2: rule__Question__OptionsAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1379);
            rule__Question__OptionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 

            }

            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:694:1: ( ( rule__Question__OptionsAssignment_4 )* )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:695:1: ( rule__Question__OptionsAssignment_4 )*
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_4()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:696:1: ( rule__Question__OptionsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=17 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:696:2: rule__Question__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1391);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:707:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:711:1: ( rule__Question__Group__5__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:712:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51424);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:718:1: rule__Question__Group__5__Impl : ( '}' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:722:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:723:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:723:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:724:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Question__Group__5__Impl1452); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:749:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:753:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:754:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01495);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01498);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:761:1: rule__Option__Group__0__Impl : ( ( rule__Option__Group_0__0 )? ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:765:1: ( ( ( rule__Option__Group_0__0 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:766:1: ( ( rule__Option__Group_0__0 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:766:1: ( ( rule__Option__Group_0__0 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:767:1: ( rule__Option__Group_0__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:768:1: ( rule__Option__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:768:2: rule__Option__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Option__Group_0__0_in_rule__Option__Group__0__Impl1525);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:778:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:782:1: ( rule__Option__Group__1__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:783:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11556);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:789:1: rule__Option__Group__1__Impl : ( ( rule__Option__TypeAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:793:1: ( ( ( rule__Option__TypeAssignment_1 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:794:1: ( ( rule__Option__TypeAssignment_1 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:794:1: ( ( rule__Option__TypeAssignment_1 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:795:1: ( rule__Option__TypeAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getTypeAssignment_1()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:796:1: ( rule__Option__TypeAssignment_1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:796:2: rule__Option__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Option__TypeAssignment_1_in_rule__Option__Group__1__Impl1583);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:810:1: rule__Option__Group_0__0 : rule__Option__Group_0__0__Impl rule__Option__Group_0__1 ;
    public final void rule__Option__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:814:1: ( rule__Option__Group_0__0__Impl rule__Option__Group_0__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:815:2: rule__Option__Group_0__0__Impl rule__Option__Group_0__1
            {
            pushFollow(FOLLOW_rule__Option__Group_0__0__Impl_in_rule__Option__Group_0__01617);
            rule__Option__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group_0__1_in_rule__Option__Group_0__01620);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:822:1: rule__Option__Group_0__0__Impl : ( ( rule__Option__IdAssignment_0_0 ) ) ;
    public final void rule__Option__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:826:1: ( ( ( rule__Option__IdAssignment_0_0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:827:1: ( ( rule__Option__IdAssignment_0_0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:827:1: ( ( rule__Option__IdAssignment_0_0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:828:1: ( rule__Option__IdAssignment_0_0 )
            {
             before(grammarAccess.getOptionAccess().getIdAssignment_0_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:829:1: ( rule__Option__IdAssignment_0_0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:829:2: rule__Option__IdAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Option__IdAssignment_0_0_in_rule__Option__Group_0__0__Impl1647);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:839:1: rule__Option__Group_0__1 : rule__Option__Group_0__1__Impl ;
    public final void rule__Option__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:843:1: ( rule__Option__Group_0__1__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:844:2: rule__Option__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group_0__1__Impl_in_rule__Option__Group_0__11677);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:850:1: rule__Option__Group_0__1__Impl : ( '->' ) ;
    public final void rule__Option__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:854:1: ( ( '->' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:855:1: ( '->' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:855:1: ( '->' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:856:1: '->'
            {
             before(grammarAccess.getOptionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,16,FOLLOW_16_in_rule__Option__Group_0__1__Impl1705); 
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


    // $ANTLR start "rule__CheckBox__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:873:1: rule__CheckBox__Group__0 : rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 ;
    public final void rule__CheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:877:1: ( rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:878:2: rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__0__Impl_in_rule__CheckBox__Group__01740);
            rule__CheckBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__1_in_rule__CheckBox__Group__01743);
            rule__CheckBox__Group__1();

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
    // $ANTLR end "rule__CheckBox__Group__0"


    // $ANTLR start "rule__CheckBox__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:885:1: rule__CheckBox__Group__0__Impl : ( ( rule__CheckBox__CheckBoxAssignment_0 ) ) ;
    public final void rule__CheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:889:1: ( ( ( rule__CheckBox__CheckBoxAssignment_0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:890:1: ( ( rule__CheckBox__CheckBoxAssignment_0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:890:1: ( ( rule__CheckBox__CheckBoxAssignment_0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:891:1: ( rule__CheckBox__CheckBoxAssignment_0 )
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxAssignment_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:892:1: ( rule__CheckBox__CheckBoxAssignment_0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:892:2: rule__CheckBox__CheckBoxAssignment_0
            {
            pushFollow(FOLLOW_rule__CheckBox__CheckBoxAssignment_0_in_rule__CheckBox__Group__0__Impl1770);
            rule__CheckBox__CheckBoxAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getCheckBoxAssignment_0()); 

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
    // $ANTLR end "rule__CheckBox__Group__0__Impl"


    // $ANTLR start "rule__CheckBox__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:902:1: rule__CheckBox__Group__1 : rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 ;
    public final void rule__CheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:906:1: ( rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:907:2: rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__1__Impl_in_rule__CheckBox__Group__11800);
            rule__CheckBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__2_in_rule__CheckBox__Group__11803);
            rule__CheckBox__Group__2();

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
    // $ANTLR end "rule__CheckBox__Group__1"


    // $ANTLR start "rule__CheckBox__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:914:1: rule__CheckBox__Group__1__Impl : ( '{' ) ;
    public final void rule__CheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:918:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:919:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:919:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:920:1: '{'
            {
             before(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__CheckBox__Group__1__Impl1831); 
             after(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CheckBox__Group__1__Impl"


    // $ANTLR start "rule__CheckBox__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:933:1: rule__CheckBox__Group__2 : rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3 ;
    public final void rule__CheckBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:937:1: ( rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:938:2: rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__2__Impl_in_rule__CheckBox__Group__21862);
            rule__CheckBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__3_in_rule__CheckBox__Group__21865);
            rule__CheckBox__Group__3();

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
    // $ANTLR end "rule__CheckBox__Group__2"


    // $ANTLR start "rule__CheckBox__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:945:1: rule__CheckBox__Group__2__Impl : ( ( rule__CheckBox__DefaultAssignment_2 )? ) ;
    public final void rule__CheckBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:949:1: ( ( ( rule__CheckBox__DefaultAssignment_2 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:950:1: ( ( rule__CheckBox__DefaultAssignment_2 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:950:1: ( ( rule__CheckBox__DefaultAssignment_2 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:951:1: ( rule__CheckBox__DefaultAssignment_2 )?
            {
             before(grammarAccess.getCheckBoxAccess().getDefaultAssignment_2()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:952:1: ( rule__CheckBox__DefaultAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:952:2: rule__CheckBox__DefaultAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CheckBox__DefaultAssignment_2_in_rule__CheckBox__Group__2__Impl1892);
                    rule__CheckBox__DefaultAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckBoxAccess().getDefaultAssignment_2()); 

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
    // $ANTLR end "rule__CheckBox__Group__2__Impl"


    // $ANTLR start "rule__CheckBox__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:962:1: rule__CheckBox__Group__3 : rule__CheckBox__Group__3__Impl ;
    public final void rule__CheckBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:966:1: ( rule__CheckBox__Group__3__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:967:2: rule__CheckBox__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__3__Impl_in_rule__CheckBox__Group__31923);
            rule__CheckBox__Group__3__Impl();

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
    // $ANTLR end "rule__CheckBox__Group__3"


    // $ANTLR start "rule__CheckBox__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:973:1: rule__CheckBox__Group__3__Impl : ( '}' ) ;
    public final void rule__CheckBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:977:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:978:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:978:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:979:1: '}'
            {
             before(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__CheckBox__Group__3__Impl1951); 
             after(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__CheckBox__Group__3__Impl"


    // $ANTLR start "rule__RadioButton__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1000:1: rule__RadioButton__Group__0 : rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1 ;
    public final void rule__RadioButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1004:1: ( rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1005:2: rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__0__Impl_in_rule__RadioButton__Group__01990);
            rule__RadioButton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__1_in_rule__RadioButton__Group__01993);
            rule__RadioButton__Group__1();

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
    // $ANTLR end "rule__RadioButton__Group__0"


    // $ANTLR start "rule__RadioButton__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1012:1: rule__RadioButton__Group__0__Impl : ( ( rule__RadioButton__RadioButtonAssignment_0 ) ) ;
    public final void rule__RadioButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1016:1: ( ( ( rule__RadioButton__RadioButtonAssignment_0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1017:1: ( ( rule__RadioButton__RadioButtonAssignment_0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1017:1: ( ( rule__RadioButton__RadioButtonAssignment_0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1018:1: ( rule__RadioButton__RadioButtonAssignment_0 )
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonAssignment_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1019:1: ( rule__RadioButton__RadioButtonAssignment_0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1019:2: rule__RadioButton__RadioButtonAssignment_0
            {
            pushFollow(FOLLOW_rule__RadioButton__RadioButtonAssignment_0_in_rule__RadioButton__Group__0__Impl2020);
            rule__RadioButton__RadioButtonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getRadioButtonAssignment_0()); 

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
    // $ANTLR end "rule__RadioButton__Group__0__Impl"


    // $ANTLR start "rule__RadioButton__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1029:1: rule__RadioButton__Group__1 : rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2 ;
    public final void rule__RadioButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1033:1: ( rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1034:2: rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__1__Impl_in_rule__RadioButton__Group__12050);
            rule__RadioButton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__2_in_rule__RadioButton__Group__12053);
            rule__RadioButton__Group__2();

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
    // $ANTLR end "rule__RadioButton__Group__1"


    // $ANTLR start "rule__RadioButton__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1041:1: rule__RadioButton__Group__1__Impl : ( '{' ) ;
    public final void rule__RadioButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1045:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1046:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1046:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1047:1: '{'
            {
             before(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__RadioButton__Group__1__Impl2081); 
             after(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RadioButton__Group__1__Impl"


    // $ANTLR start "rule__RadioButton__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1060:1: rule__RadioButton__Group__2 : rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3 ;
    public final void rule__RadioButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1064:1: ( rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1065:2: rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__2__Impl_in_rule__RadioButton__Group__22112);
            rule__RadioButton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__3_in_rule__RadioButton__Group__22115);
            rule__RadioButton__Group__3();

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
    // $ANTLR end "rule__RadioButton__Group__2"


    // $ANTLR start "rule__RadioButton__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1072:1: rule__RadioButton__Group__2__Impl : ( ( rule__RadioButton__DefaultAssignment_2 )? ) ;
    public final void rule__RadioButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1076:1: ( ( ( rule__RadioButton__DefaultAssignment_2 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1077:1: ( ( rule__RadioButton__DefaultAssignment_2 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1077:1: ( ( rule__RadioButton__DefaultAssignment_2 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1078:1: ( rule__RadioButton__DefaultAssignment_2 )?
            {
             before(grammarAccess.getRadioButtonAccess().getDefaultAssignment_2()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1079:1: ( rule__RadioButton__DefaultAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1079:2: rule__RadioButton__DefaultAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RadioButton__DefaultAssignment_2_in_rule__RadioButton__Group__2__Impl2142);
                    rule__RadioButton__DefaultAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadioButtonAccess().getDefaultAssignment_2()); 

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
    // $ANTLR end "rule__RadioButton__Group__2__Impl"


    // $ANTLR start "rule__RadioButton__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1089:1: rule__RadioButton__Group__3 : rule__RadioButton__Group__3__Impl ;
    public final void rule__RadioButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1093:1: ( rule__RadioButton__Group__3__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1094:2: rule__RadioButton__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__3__Impl_in_rule__RadioButton__Group__32173);
            rule__RadioButton__Group__3__Impl();

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
    // $ANTLR end "rule__RadioButton__Group__3"


    // $ANTLR start "rule__RadioButton__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1100:1: rule__RadioButton__Group__3__Impl : ( '}' ) ;
    public final void rule__RadioButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1104:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1105:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1105:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1106:1: '}'
            {
             before(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__RadioButton__Group__3__Impl2201); 
             after(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RadioButton__Group__3__Impl"


    // $ANTLR start "rule__ComboBox__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1127:1: rule__ComboBox__Group__0 : rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 ;
    public final void rule__ComboBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1131:1: ( rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1132:2: rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__0__Impl_in_rule__ComboBox__Group__02240);
            rule__ComboBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__1_in_rule__ComboBox__Group__02243);
            rule__ComboBox__Group__1();

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
    // $ANTLR end "rule__ComboBox__Group__0"


    // $ANTLR start "rule__ComboBox__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1139:1: rule__ComboBox__Group__0__Impl : ( ( rule__ComboBox__ComboBoxAssignment_0 ) ) ;
    public final void rule__ComboBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1143:1: ( ( ( rule__ComboBox__ComboBoxAssignment_0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1144:1: ( ( rule__ComboBox__ComboBoxAssignment_0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1144:1: ( ( rule__ComboBox__ComboBoxAssignment_0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1145:1: ( rule__ComboBox__ComboBoxAssignment_0 )
            {
             before(grammarAccess.getComboBoxAccess().getComboBoxAssignment_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1146:1: ( rule__ComboBox__ComboBoxAssignment_0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1146:2: rule__ComboBox__ComboBoxAssignment_0
            {
            pushFollow(FOLLOW_rule__ComboBox__ComboBoxAssignment_0_in_rule__ComboBox__Group__0__Impl2270);
            rule__ComboBox__ComboBoxAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getComboBoxAssignment_0()); 

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
    // $ANTLR end "rule__ComboBox__Group__0__Impl"


    // $ANTLR start "rule__ComboBox__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1156:1: rule__ComboBox__Group__1 : rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 ;
    public final void rule__ComboBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1160:1: ( rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1161:2: rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__1__Impl_in_rule__ComboBox__Group__12300);
            rule__ComboBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__2_in_rule__ComboBox__Group__12303);
            rule__ComboBox__Group__2();

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
    // $ANTLR end "rule__ComboBox__Group__1"


    // $ANTLR start "rule__ComboBox__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1168:1: rule__ComboBox__Group__1__Impl : ( '{' ) ;
    public final void rule__ComboBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1172:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1173:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1173:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1174:1: '{'
            {
             before(grammarAccess.getComboBoxAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ComboBox__Group__1__Impl2331); 
             after(grammarAccess.getComboBoxAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ComboBox__Group__1__Impl"


    // $ANTLR start "rule__ComboBox__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1187:1: rule__ComboBox__Group__2 : rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 ;
    public final void rule__ComboBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1191:1: ( rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1192:2: rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__2__Impl_in_rule__ComboBox__Group__22362);
            rule__ComboBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__3_in_rule__ComboBox__Group__22365);
            rule__ComboBox__Group__3();

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
    // $ANTLR end "rule__ComboBox__Group__2"


    // $ANTLR start "rule__ComboBox__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1199:1: rule__ComboBox__Group__2__Impl : ( ( rule__ComboBox__DefaultAssignment_2 )? ) ;
    public final void rule__ComboBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1203:1: ( ( ( rule__ComboBox__DefaultAssignment_2 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1204:1: ( ( rule__ComboBox__DefaultAssignment_2 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1204:1: ( ( rule__ComboBox__DefaultAssignment_2 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1205:1: ( rule__ComboBox__DefaultAssignment_2 )?
            {
             before(grammarAccess.getComboBoxAccess().getDefaultAssignment_2()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1206:1: ( rule__ComboBox__DefaultAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1206:2: rule__ComboBox__DefaultAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ComboBox__DefaultAssignment_2_in_rule__ComboBox__Group__2__Impl2392);
                    rule__ComboBox__DefaultAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComboBoxAccess().getDefaultAssignment_2()); 

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
    // $ANTLR end "rule__ComboBox__Group__2__Impl"


    // $ANTLR start "rule__ComboBox__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1216:1: rule__ComboBox__Group__3 : rule__ComboBox__Group__3__Impl ;
    public final void rule__ComboBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1220:1: ( rule__ComboBox__Group__3__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1221:2: rule__ComboBox__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__3__Impl_in_rule__ComboBox__Group__32423);
            rule__ComboBox__Group__3__Impl();

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
    // $ANTLR end "rule__ComboBox__Group__3"


    // $ANTLR start "rule__ComboBox__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1227:1: rule__ComboBox__Group__3__Impl : ( '}' ) ;
    public final void rule__ComboBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1231:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1232:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1232:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1233:1: '}'
            {
             before(grammarAccess.getComboBoxAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ComboBox__Group__3__Impl2451); 
             after(grammarAccess.getComboBoxAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ComboBox__Group__3__Impl"


    // $ANTLR start "rule__TextBox__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1254:1: rule__TextBox__Group__0 : rule__TextBox__Group__0__Impl rule__TextBox__Group__1 ;
    public final void rule__TextBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1258:1: ( rule__TextBox__Group__0__Impl rule__TextBox__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1259:2: rule__TextBox__Group__0__Impl rule__TextBox__Group__1
            {
            pushFollow(FOLLOW_rule__TextBox__Group__0__Impl_in_rule__TextBox__Group__02490);
            rule__TextBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextBox__Group__1_in_rule__TextBox__Group__02493);
            rule__TextBox__Group__1();

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
    // $ANTLR end "rule__TextBox__Group__0"


    // $ANTLR start "rule__TextBox__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1266:1: rule__TextBox__Group__0__Impl : ( ( rule__TextBox__TextBoxAssignment_0 ) ) ;
    public final void rule__TextBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1270:1: ( ( ( rule__TextBox__TextBoxAssignment_0 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1271:1: ( ( rule__TextBox__TextBoxAssignment_0 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1271:1: ( ( rule__TextBox__TextBoxAssignment_0 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1272:1: ( rule__TextBox__TextBoxAssignment_0 )
            {
             before(grammarAccess.getTextBoxAccess().getTextBoxAssignment_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1273:1: ( rule__TextBox__TextBoxAssignment_0 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1273:2: rule__TextBox__TextBoxAssignment_0
            {
            pushFollow(FOLLOW_rule__TextBox__TextBoxAssignment_0_in_rule__TextBox__Group__0__Impl2520);
            rule__TextBox__TextBoxAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getTextBoxAssignment_0()); 

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
    // $ANTLR end "rule__TextBox__Group__0__Impl"


    // $ANTLR start "rule__TextBox__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1283:1: rule__TextBox__Group__1 : rule__TextBox__Group__1__Impl rule__TextBox__Group__2 ;
    public final void rule__TextBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1287:1: ( rule__TextBox__Group__1__Impl rule__TextBox__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1288:2: rule__TextBox__Group__1__Impl rule__TextBox__Group__2
            {
            pushFollow(FOLLOW_rule__TextBox__Group__1__Impl_in_rule__TextBox__Group__12550);
            rule__TextBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextBox__Group__2_in_rule__TextBox__Group__12553);
            rule__TextBox__Group__2();

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
    // $ANTLR end "rule__TextBox__Group__1"


    // $ANTLR start "rule__TextBox__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1295:1: rule__TextBox__Group__1__Impl : ( '{' ) ;
    public final void rule__TextBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1299:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1300:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1300:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1301:1: '{'
            {
             before(grammarAccess.getTextBoxAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__TextBox__Group__1__Impl2581); 
             after(grammarAccess.getTextBoxAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__TextBox__Group__1__Impl"


    // $ANTLR start "rule__TextBox__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1314:1: rule__TextBox__Group__2 : rule__TextBox__Group__2__Impl rule__TextBox__Group__3 ;
    public final void rule__TextBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1318:1: ( rule__TextBox__Group__2__Impl rule__TextBox__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1319:2: rule__TextBox__Group__2__Impl rule__TextBox__Group__3
            {
            pushFollow(FOLLOW_rule__TextBox__Group__2__Impl_in_rule__TextBox__Group__22612);
            rule__TextBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextBox__Group__3_in_rule__TextBox__Group__22615);
            rule__TextBox__Group__3();

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
    // $ANTLR end "rule__TextBox__Group__2"


    // $ANTLR start "rule__TextBox__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1326:1: rule__TextBox__Group__2__Impl : ( ( rule__TextBox__DefaultAssignment_2 )? ) ;
    public final void rule__TextBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1330:1: ( ( ( rule__TextBox__DefaultAssignment_2 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1331:1: ( ( rule__TextBox__DefaultAssignment_2 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1331:1: ( ( rule__TextBox__DefaultAssignment_2 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1332:1: ( rule__TextBox__DefaultAssignment_2 )?
            {
             before(grammarAccess.getTextBoxAccess().getDefaultAssignment_2()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1333:1: ( rule__TextBox__DefaultAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1333:2: rule__TextBox__DefaultAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TextBox__DefaultAssignment_2_in_rule__TextBox__Group__2__Impl2642);
                    rule__TextBox__DefaultAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextBoxAccess().getDefaultAssignment_2()); 

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
    // $ANTLR end "rule__TextBox__Group__2__Impl"


    // $ANTLR start "rule__TextBox__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1343:1: rule__TextBox__Group__3 : rule__TextBox__Group__3__Impl ;
    public final void rule__TextBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1347:1: ( rule__TextBox__Group__3__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1348:2: rule__TextBox__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextBox__Group__3__Impl_in_rule__TextBox__Group__32673);
            rule__TextBox__Group__3__Impl();

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
    // $ANTLR end "rule__TextBox__Group__3"


    // $ANTLR start "rule__TextBox__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1354:1: rule__TextBox__Group__3__Impl : ( '}' ) ;
    public final void rule__TextBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1358:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1359:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1359:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1360:1: '}'
            {
             before(grammarAccess.getTextBoxAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__TextBox__Group__3__Impl2701); 
             after(grammarAccess.getTextBoxAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__TextBox__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1381:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1385:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1386:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__02740);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__1_in_rule__Image__Group__02743);
            rule__Image__Group__1();

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
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1393:1: rule__Image__Group__0__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1397:1: ( ( 'Image' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1398:1: ( 'Image' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1398:1: ( 'Image' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1399:1: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Image__Group__0__Impl2771); 
             after(grammarAccess.getImageAccess().getImageKeyword_0()); 

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
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1412:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1416:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1417:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__12802);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__2_in_rule__Image__Group__12805);
            rule__Image__Group__2();

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
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1424:1: rule__Image__Group__1__Impl : ( '{' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1428:1: ( ( '{' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1429:1: ( '{' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1429:1: ( '{' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1430:1: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Image__Group__1__Impl2833); 
             after(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1443:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1447:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1448:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__22864);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__3_in_rule__Image__Group__22867);
            rule__Image__Group__3();

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
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1455:1: rule__Image__Group__2__Impl : ( ( rule__Image__DefaultAssignment_2 )? ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1459:1: ( ( ( rule__Image__DefaultAssignment_2 )? ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1460:1: ( ( rule__Image__DefaultAssignment_2 )? )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1460:1: ( ( rule__Image__DefaultAssignment_2 )? )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1461:1: ( rule__Image__DefaultAssignment_2 )?
            {
             before(grammarAccess.getImageAccess().getDefaultAssignment_2()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1462:1: ( rule__Image__DefaultAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1462:2: rule__Image__DefaultAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Image__DefaultAssignment_2_in_rule__Image__Group__2__Impl2894);
                    rule__Image__DefaultAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getDefaultAssignment_2()); 

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
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1472:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1476:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1477:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__32925);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__4_in_rule__Image__Group__32928);
            rule__Image__Group__4();

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
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1484:1: rule__Image__Group__3__Impl : ( ( rule__Image__UrlAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1488:1: ( ( ( rule__Image__UrlAssignment_3 ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1489:1: ( ( rule__Image__UrlAssignment_3 ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1489:1: ( ( rule__Image__UrlAssignment_3 ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1490:1: ( rule__Image__UrlAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_3()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1491:1: ( rule__Image__UrlAssignment_3 )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1491:2: rule__Image__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Image__UrlAssignment_3_in_rule__Image__Group__3__Impl2955);
            rule__Image__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getUrlAssignment_3()); 

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
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1501:1: rule__Image__Group__4 : rule__Image__Group__4__Impl ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1505:1: ( rule__Image__Group__4__Impl )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1506:2: rule__Image__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__42985);
            rule__Image__Group__4__Impl();

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
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1512:1: rule__Image__Group__4__Impl : ( '}' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1516:1: ( ( '}' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1517:1: ( '}' )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1517:1: ( '}' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1518:1: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Image__Group__4__Impl3013); 
             after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__PollSystem__PollsAssignment"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1542:1: rule__PollSystem__PollsAssignment : ( rulePoll ) ;
    public final void rule__PollSystem__PollsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1546:1: ( ( rulePoll ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1547:1: ( rulePoll )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1547:1: ( rulePoll )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1548:1: rulePoll
            {
             before(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePoll_in_rule__PollSystem__PollsAssignment3059);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1557:1: rule__Poll__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Poll__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1561:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1562:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1562:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1563:1: RULE_ID
            {
             before(grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Poll__NameAssignment_13090); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1572:1: rule__Poll__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Poll__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1576:1: ( ( ruleQuestion ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1577:1: ( ruleQuestion )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1577:1: ( ruleQuestion )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1578:1: ruleQuestion
            {
             before(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Poll__QuestionsAssignment_33121);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1587:1: rule__Question__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1591:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1592:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1592:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1593:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__IdAssignment_13152); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1602:1: rule__Question__OptionsAssignment_4 : ( ruleOption ) ;
    public final void rule__Question__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1606:1: ( ( ruleOption ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1607:1: ( ruleOption )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1607:1: ( ruleOption )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1608:1: ruleOption
            {
             before(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Question__OptionsAssignment_43183);
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1617:1: rule__Option__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Option__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1621:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1622:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1622:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1623:1: RULE_ID
            {
             before(grammarAccess.getOptionAccess().getIdIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Option__IdAssignment_0_03214); 
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
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1632:1: rule__Option__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Option__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1636:1: ( ( ruleType ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1637:1: ( ruleType )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1637:1: ( ruleType )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1638:1: ruleType
            {
             before(grammarAccess.getOptionAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Option__TypeAssignment_13245);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getTypeTypeParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__CheckBox__CheckBoxAssignment_0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1647:1: rule__CheckBox__CheckBoxAssignment_0 : ( ( 'Checkbox' ) ) ;
    public final void rule__CheckBox__CheckBoxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1651:1: ( ( ( 'Checkbox' ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1652:1: ( ( 'Checkbox' ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1652:1: ( ( 'Checkbox' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1653:1: ( 'Checkbox' )
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxCheckboxKeyword_0_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1654:1: ( 'Checkbox' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1655:1: 'Checkbox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxCheckboxKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__CheckBox__CheckBoxAssignment_03281); 
             after(grammarAccess.getCheckBoxAccess().getCheckBoxCheckboxKeyword_0_0()); 

            }

             after(grammarAccess.getCheckBoxAccess().getCheckBoxCheckboxKeyword_0_0()); 

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
    // $ANTLR end "rule__CheckBox__CheckBoxAssignment_0"


    // $ANTLR start "rule__CheckBox__DefaultAssignment_2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1670:1: rule__CheckBox__DefaultAssignment_2 : ( RULE_ID ) ;
    public final void rule__CheckBox__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1674:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1675:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1675:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1676:1: RULE_ID
            {
             before(grammarAccess.getCheckBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CheckBox__DefaultAssignment_23320); 
             after(grammarAccess.getCheckBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CheckBox__DefaultAssignment_2"


    // $ANTLR start "rule__RadioButton__RadioButtonAssignment_0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1685:1: rule__RadioButton__RadioButtonAssignment_0 : ( ( 'RadioButton' ) ) ;
    public final void rule__RadioButton__RadioButtonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1689:1: ( ( ( 'RadioButton' ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1690:1: ( ( 'RadioButton' ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1690:1: ( ( 'RadioButton' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1691:1: ( 'RadioButton' )
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonRadioButtonKeyword_0_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1692:1: ( 'RadioButton' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1693:1: 'RadioButton'
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonRadioButtonKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__RadioButton__RadioButtonAssignment_03356); 
             after(grammarAccess.getRadioButtonAccess().getRadioButtonRadioButtonKeyword_0_0()); 

            }

             after(grammarAccess.getRadioButtonAccess().getRadioButtonRadioButtonKeyword_0_0()); 

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
    // $ANTLR end "rule__RadioButton__RadioButtonAssignment_0"


    // $ANTLR start "rule__RadioButton__DefaultAssignment_2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1708:1: rule__RadioButton__DefaultAssignment_2 : ( RULE_ID ) ;
    public final void rule__RadioButton__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1712:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1713:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1713:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1714:1: RULE_ID
            {
             before(grammarAccess.getRadioButtonAccess().getDefaultIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RadioButton__DefaultAssignment_23395); 
             after(grammarAccess.getRadioButtonAccess().getDefaultIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RadioButton__DefaultAssignment_2"


    // $ANTLR start "rule__ComboBox__ComboBoxAssignment_0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1723:1: rule__ComboBox__ComboBoxAssignment_0 : ( ( 'ComboBoxItem' ) ) ;
    public final void rule__ComboBox__ComboBoxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1727:1: ( ( ( 'ComboBoxItem' ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1728:1: ( ( 'ComboBoxItem' ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1728:1: ( ( 'ComboBoxItem' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1729:1: ( 'ComboBoxItem' )
            {
             before(grammarAccess.getComboBoxAccess().getComboBoxComboBoxItemKeyword_0_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1730:1: ( 'ComboBoxItem' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1731:1: 'ComboBoxItem'
            {
             before(grammarAccess.getComboBoxAccess().getComboBoxComboBoxItemKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__ComboBox__ComboBoxAssignment_03431); 
             after(grammarAccess.getComboBoxAccess().getComboBoxComboBoxItemKeyword_0_0()); 

            }

             after(grammarAccess.getComboBoxAccess().getComboBoxComboBoxItemKeyword_0_0()); 

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
    // $ANTLR end "rule__ComboBox__ComboBoxAssignment_0"


    // $ANTLR start "rule__ComboBox__DefaultAssignment_2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1746:1: rule__ComboBox__DefaultAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComboBox__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1750:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1751:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1751:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1752:1: RULE_ID
            {
             before(grammarAccess.getComboBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComboBox__DefaultAssignment_23470); 
             after(grammarAccess.getComboBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComboBox__DefaultAssignment_2"


    // $ANTLR start "rule__TextBox__TextBoxAssignment_0"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1761:1: rule__TextBox__TextBoxAssignment_0 : ( ( 'TextBox' ) ) ;
    public final void rule__TextBox__TextBoxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1765:1: ( ( ( 'TextBox' ) ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1766:1: ( ( 'TextBox' ) )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1766:1: ( ( 'TextBox' ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1767:1: ( 'TextBox' )
            {
             before(grammarAccess.getTextBoxAccess().getTextBoxTextBoxKeyword_0_0()); 
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1768:1: ( 'TextBox' )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1769:1: 'TextBox'
            {
             before(grammarAccess.getTextBoxAccess().getTextBoxTextBoxKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__TextBox__TextBoxAssignment_03506); 
             after(grammarAccess.getTextBoxAccess().getTextBoxTextBoxKeyword_0_0()); 

            }

             after(grammarAccess.getTextBoxAccess().getTextBoxTextBoxKeyword_0_0()); 

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
    // $ANTLR end "rule__TextBox__TextBoxAssignment_0"


    // $ANTLR start "rule__TextBox__DefaultAssignment_2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1784:1: rule__TextBox__DefaultAssignment_2 : ( RULE_ID ) ;
    public final void rule__TextBox__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1788:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1789:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1789:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1790:1: RULE_ID
            {
             before(grammarAccess.getTextBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextBox__DefaultAssignment_23545); 
             after(grammarAccess.getTextBoxAccess().getDefaultIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TextBox__DefaultAssignment_2"


    // $ANTLR start "rule__Image__DefaultAssignment_2"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1799:1: rule__Image__DefaultAssignment_2 : ( RULE_ID ) ;
    public final void rule__Image__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1803:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1804:1: ( RULE_ID )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1804:1: ( RULE_ID )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1805:1: RULE_ID
            {
             before(grammarAccess.getImageAccess().getDefaultIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Image__DefaultAssignment_23576); 
             after(grammarAccess.getImageAccess().getDefaultIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Image__DefaultAssignment_2"


    // $ANTLR start "rule__Image__UrlAssignment_3"
    // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1814:1: rule__Image__UrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1818:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1819:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1819:1: ( RULE_STRING )
            // ../fr.istic.idm.project.UI.ui/src-gen/fr/istic/idm/project/ui/contentassist/antlr/internal/InternalUIDsl.g:1820:1: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Image__UrlAssignment_33607); 
             after(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Image__UrlAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePollSystem_in_entryRulePollSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__PollsAssignment_in_rulePollSystem94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__0_in_rulePoll155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__0_in_ruleCheckBox395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__0_in_ruleRadioButton455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_entryRuleComboBox482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboBox489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__0_in_ruleComboBox515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBox_in_entryRuleTextBox542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBox549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__Group__0_in_ruleTextBox575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0_in_ruleImage635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_rule__Type__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_rule__Type__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_rule__Type__Alternatives705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBox_in_rule__Type__Alternatives722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_rule__Type__Alternatives739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__0__Impl_in_rule__Poll__Group__0769 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Poll__Group__1_in_rule__Poll__Group__0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Poll__Group__0__Impl800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__1__Impl_in_rule__Poll__Group__1831 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Poll__Group__2_in_rule__Poll__Group__1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__NameAssignment_1_in_rule__Poll__Group__1__Impl861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__2__Impl_in_rule__Poll__Group__2892 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Poll__Group__3_in_rule__Poll__Group__2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Poll__Group__2__Impl923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__Group__3__Impl_in_rule__Poll__Group__3954 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Poll__Group__4_in_rule__Poll__Group__3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl986 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Poll__QuestionsAssignment_3_in_rule__Poll__Group__3__Impl998 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Poll__Group__4__Impl_in_rule__Poll__Group__41031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Poll__Group__4__Impl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01100 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11162 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_1_in_rule__Question__Group__1__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21223 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__2__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31285 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Question__Group__3__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41347 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1379 = new BitSet(new long[]{0x00000000003E0012L});
    public static final BitSet FOLLOW_rule__Question__OptionsAssignment_4_in_rule__Question__Group__4__Impl1391 = new BitSet(new long[]{0x00000000003E0012L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Question__Group__5__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01495 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__0_in_rule__Option__Group__0__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__TypeAssignment_1_in_rule__Option__Group__1__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__0__Impl_in_rule__Option__Group_0__01617 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Option__Group_0__1_in_rule__Option__Group_0__01620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__IdAssignment_0_0_in_rule__Option__Group_0__0__Impl1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_0__1__Impl_in_rule__Option__Group_0__11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Option__Group_0__1__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__0__Impl_in_rule__CheckBox__Group__01740 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__1_in_rule__CheckBox__Group__01743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__CheckBoxAssignment_0_in_rule__CheckBox__Group__0__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__1__Impl_in_rule__CheckBox__Group__11800 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__2_in_rule__CheckBox__Group__11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CheckBox__Group__1__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__2__Impl_in_rule__CheckBox__Group__21862 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__3_in_rule__CheckBox__Group__21865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__DefaultAssignment_2_in_rule__CheckBox__Group__2__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__3__Impl_in_rule__CheckBox__Group__31923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CheckBox__Group__3__Impl1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__0__Impl_in_rule__RadioButton__Group__01990 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__1_in_rule__RadioButton__Group__01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__RadioButtonAssignment_0_in_rule__RadioButton__Group__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__1__Impl_in_rule__RadioButton__Group__12050 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__2_in_rule__RadioButton__Group__12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RadioButton__Group__1__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__2__Impl_in_rule__RadioButton__Group__22112 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__3_in_rule__RadioButton__Group__22115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__DefaultAssignment_2_in_rule__RadioButton__Group__2__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__3__Impl_in_rule__RadioButton__Group__32173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RadioButton__Group__3__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__0__Impl_in_rule__ComboBox__Group__02240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__1_in_rule__ComboBox__Group__02243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__ComboBoxAssignment_0_in_rule__ComboBox__Group__0__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__1__Impl_in_rule__ComboBox__Group__12300 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__2_in_rule__ComboBox__Group__12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComboBox__Group__1__Impl2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__2__Impl_in_rule__ComboBox__Group__22362 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__3_in_rule__ComboBox__Group__22365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__DefaultAssignment_2_in_rule__ComboBox__Group__2__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__3__Impl_in_rule__ComboBox__Group__32423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComboBox__Group__3__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__Group__0__Impl_in_rule__TextBox__Group__02490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TextBox__Group__1_in_rule__TextBox__Group__02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__TextBoxAssignment_0_in_rule__TextBox__Group__0__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__Group__1__Impl_in_rule__TextBox__Group__12550 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__TextBox__Group__2_in_rule__TextBox__Group__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TextBox__Group__1__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__Group__2__Impl_in_rule__TextBox__Group__22612 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__TextBox__Group__3_in_rule__TextBox__Group__22615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__DefaultAssignment_2_in_rule__TextBox__Group__2__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBox__Group__3__Impl_in_rule__TextBox__Group__32673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TextBox__Group__3__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__02740 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Image__Group__1_in_rule__Image__Group__02743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Image__Group__0__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__12802 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Image__Group__2_in_rule__Image__Group__12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Image__Group__1__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__22864 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Image__Group__3_in_rule__Image__Group__22867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__DefaultAssignment_2_in_rule__Image__Group__2__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__32925 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Image__Group__4_in_rule__Image__Group__32928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__UrlAssignment_3_in_rule__Image__Group__3__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__42985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Image__Group__4__Impl3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_rule__PollSystem__PollsAssignment3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Poll__NameAssignment_13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Poll__QuestionsAssignment_33121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__IdAssignment_13152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Question__OptionsAssignment_43183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Option__IdAssignment_0_03214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Option__TypeAssignment_13245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CheckBox__CheckBoxAssignment_03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CheckBox__DefaultAssignment_23320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RadioButton__RadioButtonAssignment_03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RadioButton__DefaultAssignment_23395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComboBox__ComboBoxAssignment_03431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComboBox__DefaultAssignment_23470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TextBox__TextBoxAssignment_03506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextBox__DefaultAssignment_23545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Image__DefaultAssignment_23576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Image__UrlAssignment_33607 = new BitSet(new long[]{0x0000000000000002L});

}