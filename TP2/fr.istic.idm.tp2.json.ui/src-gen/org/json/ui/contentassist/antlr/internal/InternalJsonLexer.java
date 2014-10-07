package org.json.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalJsonLexer() {;} 
    public InternalJsonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJsonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:11:7: ( 'null' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:11:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:12:7: ( 'true' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:12:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:13:7: ( 'false' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:13:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:14:7: ( '{' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:15:7: ( '}' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:16:7: ( ',' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:17:7: ( ':' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:18:7: ( '[' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:19:7: ( ']' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:13: ( ( '-' )? ( RULE_INT )? '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:15: ( '-' )? ( RULE_INT )? '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:20: ( RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:20: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_INT(); 
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:43: ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:44: ( 'E' | 'e' ) ( '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:54: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:870:54: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:872:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:872:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:872:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:872:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:872:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:874:10: ( ( '0' .. '9' )+ )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:874:12: ( '0' .. '9' )+
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:874:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:874:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:876:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:878:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:878:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:878:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:878:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:880:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:882:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:882:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:882:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:884:16: ( . )
            // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:884:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=17;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:64: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 11 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:84: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:93: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../fr.istic.idm.tp2.json.ui/src-gen/org/json/ui/contentassist/antlr/internal/InternalJson.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\3\25\6\uffff\1\23\1\37\2\23\1\uffff\3\23\2\uffff\1\25\1\uffff\2\25\10\uffff\1\37\4\uffff\3\25\1\53\1\54\1\25\2\uffff\1\56\1\uffff";
    static final String DFA16_eofS =
        "\57\uffff";
    static final String DFA16_minS =
        "\1\0\1\165\1\162\1\141\6\uffff\2\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\154\1\uffff\1\165\1\154\10\uffff\1\56\4\uffff\1\154\1\145\1\163\2\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\165\1\162\1\141\6\uffff\3\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\154\1\uffff\1\165\1\154\10\uffff\1\71\4\uffff\1\154\1\145\1\163\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\4\uffff\1\13\3\uffff\1\20\1\21\1\uffff\1\13\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\14\1\uffff\1\15\1\16\1\17\1\20\6\uffff\1\1\1\2\1\uffff\1\3";
    static final String DFA16_specialS =
        "\1\2\16\uffff\1\0\1\1\36\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\4\23\1\6\1\12\1\14\1\21\12\13\1\7\6\23\32\16\1\10\1\23\1\11\1\15\1\16\1\23\5\16\1\3\7\16\1\1\5\16\1\2\6\16\1\4\1\23\1\5\uff82\23",
            "\1\24",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\12\36",
            "\1\36\1\uffff\12\40",
            "\12\36",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\41",
            "\0\41",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\12\40",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\55",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_15 = input.LA(1);

                        s = -1;
                        if ( ((LA16_15>='\u0000' && LA16_15<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_16 = input.LA(1);

                        s = -1;
                        if ( ((LA16_16>='\u0000' && LA16_16<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='n') ) {s = 1;}

                        else if ( (LA16_0=='t') ) {s = 2;}

                        else if ( (LA16_0=='f') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0==',') ) {s = 6;}

                        else if ( (LA16_0==':') ) {s = 7;}

                        else if ( (LA16_0=='[') ) {s = 8;}

                        else if ( (LA16_0==']') ) {s = 9;}

                        else if ( (LA16_0=='-') ) {s = 10;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 11;}

                        else if ( (LA16_0=='.') ) {s = 12;}

                        else if ( (LA16_0=='^') ) {s = 13;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='e')||(LA16_0>='g' && LA16_0<='m')||(LA16_0>='o' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 14;}

                        else if ( (LA16_0=='\"') ) {s = 15;}

                        else if ( (LA16_0=='\'') ) {s = 16;}

                        else if ( (LA16_0=='/') ) {s = 17;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 18;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='+')||(LA16_0>=';' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}