package eu.quanticol.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCASPALexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_LOWER=5;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_UPPER=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCASPALexer() {;} 
    public InternalCASPALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCASPALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:11:7: ( '(' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:11:9: '('
            {
            match('('); 

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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:12:7: ( ',' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:12:9: ','
            {
            match(','); 

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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:13:7: ( '{' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:13:9: '{'
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:14:7: ( '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:14:9: '}'
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:15:7: ( ')' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:15:9: ')'
            {
            match(')'); 

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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:16:7: ( ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:16:9: ';'
            {
            match(';'); 

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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:17:7: ( '=' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:17:9: '='
            {
            match('='); 

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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:18:7: ( '|' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:18:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:19:7: ( '+' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:20:7: ( 'nil' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:20:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:21:7: ( 'kill' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:21:9: 'kill'
            {
            match("kill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:22:7: ( '*' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:22:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:23:7: ( '.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:24:7: ( '[' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:25:7: ( ']' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:26:7: ( '<' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:26:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:27:7: ( '>' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:27:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:28:7: ( ':=' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:28:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:29:7: ( 'this.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:29:9: 'this.'
            {
            match("this."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:30:7: ( 'Pr' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:30:9: 'Pr'
            {
            match("Pr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:31:7: ( 'U' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:31:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:32:7: ( ':' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:32:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:33:7: ( '||' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:33:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:34:7: ( '&&' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:34:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:35:7: ( '==' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:35:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:36:7: ( '!=' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:36:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:37:7: ( '>=' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:37:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:38:7: ( '<=' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:38:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:39:7: ( '-' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:40:7: ( '/' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:40:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:41:7: ( '!' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:41:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:42:7: ( 'true' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:42:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:43:7: ( 'false' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:43:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:44:7: ( 'e' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:44:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:45:7: ( 'E' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:45:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:46:7: ( '$' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:46:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_LOWER"
    public final void mRULE_LOWER() throws RecognitionException {
        try {
            int _type = RULE_LOWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3771:12: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3771:14: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3771:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER"

    // $ANTLR start "RULE_UPPER"
    public final void mRULE_UPPER() throws RecognitionException {
        try {
            int _type = RULE_UPPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3773:12: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3773:14: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3773:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3775:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3775:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3775:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3775:11: '^'
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3775:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:
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
            	    break loop4;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3777:10: ( ( '0' .. '9' )+ )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3777:12: ( '0' .. '9' )+
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3777:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3777:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3779:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3781:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3781:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3781:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3781:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:41: ( '\\r' )? '\\n'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3783:41: '\\r'
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3785:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3785:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3785:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3787:16: ( . )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3787:18: .
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
        // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_LOWER | RULE_UPPER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=45;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:226: RULE_LOWER
                {
                mRULE_LOWER(); 

                }
                break;
            case 38 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:237: RULE_UPPER
                {
                mRULE_UPPER(); 

                }
                break;
            case 39 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:248: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:256: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:265: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:277: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:293: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:309: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1:317: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\7\uffff\1\56\1\60\1\uffff\2\63\4\uffff\1\73\1\75\1\77\1\63\1\103\1\105\1\46\1\110\1\uffff\1\114\1\63\1\116\1\117\1\uffff\1\63\1\103\1\46\2\uffff\2\46\15\uffff\1\63\1\uffff\2\63\12\uffff\2\63\1\131\1\uffff\1\103\10\uffff\1\63\7\uffff\1\133\3\63\1\uffff\1\63\1\uffff\1\140\1\63\1\142\1\63\3\uffff\1\144\1\uffff";
    static final String DFA14_eofS =
        "\145\uffff";
    static final String DFA14_minS =
        "\1\0\6\uffff\1\75\1\174\1\uffff\2\60\4\uffff\3\75\3\60\1\46\1\75\1\uffff\1\52\3\60\1\uffff\2\60\1\101\2\uffff\2\0\15\uffff\1\60\1\uffff\2\60\12\uffff\3\60\1\uffff\1\60\10\uffff\1\60\7\uffff\4\60\1\uffff\1\60\1\uffff\1\60\1\56\2\60\3\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\6\uffff\1\75\1\174\1\uffff\2\172\4\uffff\3\75\3\172\1\46\1\75\1\uffff\1\57\3\172\1\uffff\3\172\2\uffff\2\uffff\15\uffff\1\172\1\uffff\2\172\12\uffff\3\172\1\uffff\1\172\10\uffff\1\172\7\uffff\4\172\1\uffff\1\172\1\uffff\4\172\3\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\2\uffff\1\14\1\15\1\16\1\17\10\uffff\1\35\4\uffff\1\44\3\uffff\1\47\1\50\2\uffff\1\54\1\55\1\1\1\2\1\3\1\4\1\5\1\6\1\31\1\7\1\27\1\10\1\11\1\uffff\1\45\2\uffff\1\14\1\15\1\16\1\17\1\34\1\20\1\33\1\21\1\22\1\26\3\uffff\1\46\1\uffff\1\25\1\30\1\32\1\37\1\35\1\52\1\53\1\36\1\uffff\1\42\1\43\1\44\1\47\1\50\1\51\1\54\4\uffff\1\24\1\uffff\1\12\4\uffff\1\13\1\23\1\40\1\uffff\1\41";
    static final String DFA14_specialS =
        "\1\2\42\uffff\1\0\1\1\100\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\27\1\43\1\46\1\35\1\46\1\26\1\44\1\1\1\5\1\14\1\11\1\2\1\30\1\15\1\31\12\42\1\22\1\6\1\20\1\7\1\21\2\46\4\37\1\34\12\37\1\24\4\37\1\25\5\37\1\16\1\46\1\17\1\40\1\41\1\46\4\36\1\33\1\32\4\36\1\13\2\36\1\12\5\36\1\23\6\36\1\3\1\10\1\4\uff82\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\57",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\62\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\65\21\64",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\74",
            "\1\76",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\100\11\64\1\101\10\64",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\102\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\1\106",
            "\1\107",
            "",
            "\1\112\4\uffff\1\113",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\115\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\32\121\4\uffff\1\121\1\uffff\32\121",
            "",
            "",
            "\0\123",
            "\0\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\125\16\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\126\16\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\127\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\130\5\64",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\132\16\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\134\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\135\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\136\25\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\137\7\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\141\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\143\25\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_LOWER | RULE_UPPER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 83;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( ((LA14_36>='\u0000' && LA14_36<='\uFFFF')) ) {s = 83;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='(') ) {s = 1;}

                        else if ( (LA14_0==',') ) {s = 2;}

                        else if ( (LA14_0=='{') ) {s = 3;}

                        else if ( (LA14_0=='}') ) {s = 4;}

                        else if ( (LA14_0==')') ) {s = 5;}

                        else if ( (LA14_0==';') ) {s = 6;}

                        else if ( (LA14_0=='=') ) {s = 7;}

                        else if ( (LA14_0=='|') ) {s = 8;}

                        else if ( (LA14_0=='+') ) {s = 9;}

                        else if ( (LA14_0=='n') ) {s = 10;}

                        else if ( (LA14_0=='k') ) {s = 11;}

                        else if ( (LA14_0=='*') ) {s = 12;}

                        else if ( (LA14_0=='.') ) {s = 13;}

                        else if ( (LA14_0=='[') ) {s = 14;}

                        else if ( (LA14_0==']') ) {s = 15;}

                        else if ( (LA14_0=='<') ) {s = 16;}

                        else if ( (LA14_0=='>') ) {s = 17;}

                        else if ( (LA14_0==':') ) {s = 18;}

                        else if ( (LA14_0=='t') ) {s = 19;}

                        else if ( (LA14_0=='P') ) {s = 20;}

                        else if ( (LA14_0=='U') ) {s = 21;}

                        else if ( (LA14_0=='&') ) {s = 22;}

                        else if ( (LA14_0=='!') ) {s = 23;}

                        else if ( (LA14_0=='-') ) {s = 24;}

                        else if ( (LA14_0=='/') ) {s = 25;}

                        else if ( (LA14_0=='f') ) {s = 26;}

                        else if ( (LA14_0=='e') ) {s = 27;}

                        else if ( (LA14_0=='E') ) {s = 28;}

                        else if ( (LA14_0=='$') ) {s = 29;}

                        else if ( ((LA14_0>='a' && LA14_0<='d')||(LA14_0>='g' && LA14_0<='j')||(LA14_0>='l' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 30;}

                        else if ( ((LA14_0>='A' && LA14_0<='D')||(LA14_0>='F' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='T')||(LA14_0>='V' && LA14_0<='Z')) ) {s = 31;}

                        else if ( (LA14_0=='^') ) {s = 32;}

                        else if ( (LA14_0=='_') ) {s = 33;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 34;}

                        else if ( (LA14_0=='\"') ) {s = 35;}

                        else if ( (LA14_0=='\'') ) {s = 36;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 37;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='#'||LA14_0=='%'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}