package eu.quanticol.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.quanticol.services.CASPAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCASPAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UPPER", "RULE_LOWER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "'{'", "'}'", "')'", "';'", "'='", "'|'", "'+'", "'nil'", "'kill'", "'*'", "'.'", "'['", "']'", "'<'", "'>'", "':='", "'this.'", "'Pr'", "'U'", "':'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'-'", "'/'", "'!'", "'true'", "'false'", "'e'", "'E'", "'$'"
    };
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


        public InternalCASPAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCASPAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCASPAParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g"; }



     	private CASPAGrammarAccess grammarAccess;
     	
        public InternalCASPAParser(TokenStream input, CASPAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CASPAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:71:2: (iv_ruleModel= ruleModel EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:72:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:82:1: ruleModel returns [EObject current=null] : ( ( (lv_stores_0_0= ruleStore ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ( (lv_terms_2_0= ruleTerm ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_stores_0_0 = null;

        EObject lv_processes_1_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:86:28: ( ( ( (lv_stores_0_0= ruleStore ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ( (lv_terms_2_0= ruleTerm ) )+ ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:1: ( ( (lv_stores_0_0= ruleStore ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ( (lv_terms_2_0= ruleTerm ) )+ )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:1: ( ( (lv_stores_0_0= ruleStore ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ( (lv_terms_2_0= ruleTerm ) )+ )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:2: ( (lv_stores_0_0= ruleStore ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ( (lv_terms_2_0= ruleTerm ) )+
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:2: ( (lv_stores_0_0= ruleStore ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_LOWER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:88:1: (lv_stores_0_0= ruleStore )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:88:1: (lv_stores_0_0= ruleStore )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:89:3: lv_stores_0_0= ruleStore
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStoresStoreParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStore_in_ruleModel141);
            	    lv_stores_0_0=ruleStore();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stores",
            	            		lv_stores_0_0, 
            	            		"Store");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:105:3: ( (lv_processes_1_0= ruleProcess ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_UPPER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:106:1: (lv_processes_1_0= ruleProcess )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:106:1: (lv_processes_1_0= ruleProcess )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:107:3: lv_processes_1_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcess_in_ruleModel163);
            	    lv_processes_1_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"processes",
            	            		lv_processes_1_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:123:3: ( (lv_terms_2_0= ruleTerm ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:124:1: (lv_terms_2_0= ruleTerm )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:124:1: (lv_terms_2_0= ruleTerm )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:125:3: lv_terms_2_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTermsTermParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleModel185);
            	    lv_terms_2_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_2_0, 
            	            		"Term");
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


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTerm"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:152:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:156:2: (iv_ruleTerm= ruleTerm EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:157:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm232);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm242); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:167:1: ruleTerm returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:171:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:1: (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:1: (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:3: otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTerm283); 

                	newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:176:1: ( (otherlv_1= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:177:1: (otherlv_1= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:177:1: (otherlv_1= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:178:3: otherlv_1= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTermRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleTerm303); 

            		newLeafNode(otherlv_1, grammarAccess.getTermAccess().getNameProcessCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTerm315); 

                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTerm327); 

                	newLeafNode(otherlv_3, grammarAccess.getTermAccess().getLeftCurlyBracketKeyword_3());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:197:1: ( (otherlv_4= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:198:1: (otherlv_4= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:198:1: (otherlv_4= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:199:3: otherlv_4= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTermRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleTerm347); 

            		newLeafNode(otherlv_4, grammarAccess.getTermAccess().getStoresStoreCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleTerm359); 

                	newLeafNode(otherlv_5, grammarAccess.getTermAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleTerm371); 

                	newLeafNode(otherlv_6, grammarAccess.getTermAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTerm383); 

                	newLeafNode(otherlv_7, grammarAccess.getTermAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:233:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:237:2: (iv_ruleProcess= ruleProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:238:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess429);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:248:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:252:28: ( ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:253:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:253:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:253:2: ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:253:2: ( (lv_name_0_0= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:254:1: (lv_name_0_0= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:254:1: (lv_name_0_0= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:255:3: lv_name_0_0= RULE_UPPER
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleProcess485); 

            			newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNameUPPERTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"UPPER");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleProcess502); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:275:1: ( (lv_value_2_0= ruleProcessExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:276:1: (lv_value_2_0= ruleProcessExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:276:1: (lv_value_2_0= ruleProcessExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:277:3: lv_value_2_0= ruleProcessExpression
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessExpression_in_ruleProcess523);
            lv_value_2_0=ruleProcessExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ProcessExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProcess535); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:308:1: entryRuleProcessExpression returns [EObject current=null] : iv_ruleProcessExpression= ruleProcessExpression EOF ;
    public final EObject entryRuleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:312:2: (iv_ruleProcessExpression= ruleProcessExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:313:2: iv_ruleProcessExpression= ruleProcessExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessExpressionRule()); 
            pushFollow(FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression581);
            iv_ruleProcessExpression=ruleProcessExpression();

            state._fsp--;

             current =iv_ruleProcessExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessExpression591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleProcessExpression"


    // $ANTLR start "ruleProcessExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:323:1: ruleProcessExpression returns [EObject current=null] : this_Parallel_0= ruleParallel ;
    public final EObject ruleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Parallel_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:327:28: (this_Parallel_0= ruleParallel )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:329:5: this_Parallel_0= ruleParallel
            {
             
                    newCompositeNode(grammarAccess.getProcessExpressionAccess().getParallelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleParallel_in_ruleProcessExpression641);
            this_Parallel_0=ruleParallel();

            state._fsp--;

             
                    current = this_Parallel_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProcessExpression"


    // $ANTLR start "entryRuleParallel"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:348:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:352:2: (iv_ruleParallel= ruleParallel EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:353:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel685);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:363:1: ruleParallel returns [EObject current=null] : (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Choice_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:367:28: ( (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:368:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:368:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:369:5: this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getParallelAccess().getChoiceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleChoice_in_ruleParallel746);
            this_Choice_0=ruleChoice();

            state._fsp--;

             
                    current = this_Choice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:377:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:377:2: () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:377:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:378:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getParallelAccess().getParallelLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleParallel767); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:387:1: ( (lv_right_3_0= ruleChoice ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:388:1: (lv_right_3_0= ruleChoice )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:388:1: (lv_right_3_0= ruleChoice )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:389:3: lv_right_3_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleParallel788);
            	    lv_right_3_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleChoice"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:416:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:420:2: (iv_ruleChoice= ruleChoice EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:421:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice836);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:431:1: ruleChoice returns [EObject current=null] : (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryProcess_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:435:28: ( (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:436:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:436:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:437:5: this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getChoiceAccess().getPrimaryProcessParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice897);
            this_PrimaryProcess_0=rulePrimaryProcess();

            state._fsp--;

             
                    current = this_PrimaryProcess_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:445:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:445:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:445:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:446:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleChoice918); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:455:1: ( (lv_right_3_0= rulePrimaryProcess ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:456:1: (lv_right_3_0= rulePrimaryProcess )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:456:1: (lv_right_3_0= rulePrimaryProcess )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:457:3: lv_right_3_0= rulePrimaryProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice939);
            	    lv_right_3_0=rulePrimaryProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PrimaryProcess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRulePrimaryProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:484:1: entryRulePrimaryProcess returns [EObject current=null] : iv_rulePrimaryProcess= rulePrimaryProcess EOF ;
    public final EObject entryRulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:488:2: (iv_rulePrimaryProcess= rulePrimaryProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:489:2: iv_rulePrimaryProcess= rulePrimaryProcess EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProcessRule()); 
            pushFollow(FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess987);
            iv_rulePrimaryProcess=rulePrimaryProcess();

            state._fsp--;

             current =iv_rulePrimaryProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryProcess997); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryProcess"


    // $ANTLR start "rulePrimaryProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:499:1: rulePrimaryProcess returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) ) ;
    public final EObject rulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_7=null;
        EObject this_PredicateProcess_4 = null;

        EObject this_ActionProcess_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:503:28: ( ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case RULE_LOWER:
                {
                alt6=4;
                }
                break;
            case RULE_UPPER:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:3: () ( (lv_value_1_0= 'nil' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:505:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryProcessAccess().getLeafAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:510:2: ( (lv_value_1_0= 'nil' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:511:1: (lv_value_1_0= 'nil' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:511:1: (lv_value_1_0= 'nil' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:512:3: lv_value_1_0= 'nil'
                    {
                    lv_value_1_0=(Token)match(input,22,FOLLOW_22_in_rulePrimaryProcess1054); 

                            newLeafNode(lv_value_1_0, grammarAccess.getPrimaryProcessAccess().getValueNilKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryProcessRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "nil");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:526:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:526:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:526:7: () ( (lv_value_3_0= 'kill' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:526:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:527:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryProcessAccess().getLeafAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:532:2: ( (lv_value_3_0= 'kill' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:533:1: (lv_value_3_0= 'kill' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:533:1: (lv_value_3_0= 'kill' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:534:3: lv_value_3_0= 'kill'
                    {
                    lv_value_3_0=(Token)match(input,23,FOLLOW_23_in_rulePrimaryProcess1102); 

                            newLeafNode(lv_value_3_0, grammarAccess.getPrimaryProcessAccess().getValueKillKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryProcessRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "kill");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:549:5: this_PredicateProcess_4= rulePredicateProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getPredicateProcessParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateProcess_in_rulePrimaryProcess1144);
                    this_PredicateProcess_4=rulePredicateProcess();

                    state._fsp--;

                     
                            current = this_PredicateProcess_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:559:5: this_ActionProcess_5= ruleActionProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getActionProcessParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActionProcess_in_rulePrimaryProcess1171);
                    this_ActionProcess_5=ruleActionProcess();

                    state._fsp--;

                     
                            current = this_ActionProcess_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:568:6: ( () ( (otherlv_7= RULE_UPPER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:568:6: ( () ( (otherlv_7= RULE_UPPER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:568:7: () ( (otherlv_7= RULE_UPPER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:568:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:569:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryProcessAccess().getProcessReferenceAction_4_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:574:2: ( (otherlv_7= RULE_UPPER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:575:1: (otherlv_7= RULE_UPPER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:575:1: (otherlv_7= RULE_UPPER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:576:3: otherlv_7= RULE_UPPER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryProcessRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_rulePrimaryProcess1206); 

                    		newLeafNode(otherlv_7, grammarAccess.getPrimaryProcessAccess().getValueProcessCrossReference_4_1_0()); 
                    	

                    }


                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePrimaryProcess"


    // $ANTLR start "entryRulePredicateProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:598:1: entryRulePredicateProcess returns [EObject current=null] : iv_rulePredicateProcess= rulePredicateProcess EOF ;
    public final EObject entryRulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:602:2: (iv_rulePredicateProcess= rulePredicateProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:603:2: iv_rulePredicateProcess= rulePredicateProcess EOF
            {
             newCompositeNode(grammarAccess.getPredicateProcessRule()); 
            pushFollow(FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess1253);
            iv_rulePredicateProcess=rulePredicateProcess();

            state._fsp--;

             current =iv_rulePredicateProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateProcess1263); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePredicateProcess"


    // $ANTLR start "rulePredicateProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:613:1: rulePredicateProcess returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) ) ;
    public final EObject rulePredicateProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_predicate_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:617:28: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:618:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:618:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:618:2: () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:618:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:619:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateProcessAccess().getPredicateProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:624:2: ( (lv_predicate_1_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:625:1: (lv_predicate_1_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:625:1: (lv_predicate_1_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:626:3: lv_predicate_1_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_rulePredicateProcess1322);
            lv_predicate_1_0=rulePredicate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateProcessRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_1_0, 
                    		"Predicate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:642:2: ( (otherlv_2= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:643:1: (otherlv_2= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:643:1: (otherlv_2= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:644:3: otherlv_2= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicateProcessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_rulePredicateProcess1342); 

            		newLeafNode(otherlv_2, grammarAccess.getPredicateProcessAccess().getValueProcessCrossReference_2_0()); 
            	

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePredicateProcess"


    // $ANTLR start "entryRuleActionProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:666:1: entryRuleActionProcess returns [EObject current=null] : iv_ruleActionProcess= ruleActionProcess EOF ;
    public final EObject entryRuleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:670:2: (iv_ruleActionProcess= ruleActionProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:671:2: iv_ruleActionProcess= ruleActionProcess EOF
            {
             newCompositeNode(grammarAccess.getActionProcessRule()); 
            pushFollow(FOLLOW_ruleActionProcess_in_entryRuleActionProcess1388);
            iv_ruleActionProcess=ruleActionProcess();

            state._fsp--;

             current =iv_ruleActionProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionProcess1398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionProcess"


    // $ANTLR start "ruleActionProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:681:1: ruleActionProcess returns [EObject current=null] : ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) ) ;
    public final EObject ruleActionProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:685:28: ( ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:686:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:686:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:686:2: () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:686:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:687:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionProcessAccess().getActionProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:692:2: ( (lv_action_1_0= ruleAction ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:693:1: (lv_action_1_0= ruleAction )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:693:1: (lv_action_1_0= ruleAction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:694:3: lv_action_1_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleActionProcess1457);
            lv_action_1_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionProcessRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_1_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:710:2: ( (otherlv_2= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:711:1: (otherlv_2= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:711:1: (otherlv_2= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:712:3: otherlv_2= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionProcessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleActionProcess1477); 

            		newLeafNode(otherlv_2, grammarAccess.getActionProcessAccess().getValueProcessCrossReference_2_0()); 
            	

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionProcess"


    // $ANTLR start "entryRuleAction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:734:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:738:2: (iv_ruleAction= ruleAction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:739:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1523);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:749:1: ruleAction returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_evaluations_6_0= ruleEvaluations ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_8=null;
        EObject lv_predicate_5_0 = null;

        EObject lv_evaluations_6_0 = null;

        EObject lv_updates_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:753:28: ( ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_evaluations_6_0= ruleEvaluations ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_evaluations_6_0= ruleEvaluations ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_evaluations_6_0= ruleEvaluations ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_evaluations_6_0= ruleEvaluations ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LOWER) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==24) ) {
                    alt7=1;
                }
                else if ( (LA7_1==13||LA7_1==15||(LA7_1>=25 && LA7_1<=26)||LA7_1==28) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:4: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:755:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getBroadcastAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:760:2: ( (lv_name_1_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:761:1: (lv_name_1_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:761:1: (lv_name_1_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:762:3: lv_name_1_0= RULE_LOWER
                    {
                    lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction1590); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameLOWERTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"LOWER");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAction1607); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getAsteriskKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:7: () ( (lv_name_4_0= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:784:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getUnicastAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:789:2: ( (lv_name_4_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:790:1: (lv_name_4_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:790:1: (lv_name_4_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:791:3: lv_name_4_0= RULE_LOWER
                    {
                    lv_name_4_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction1641); 

                    			newLeafNode(lv_name_4_0, grammarAccess.getActionAccess().getNameLOWERTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_4_0, 
                            		"LOWER");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:807:4: ( (lv_predicate_5_0= rulePredicate ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:808:1: (lv_predicate_5_0= rulePredicate )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:808:1: (lv_predicate_5_0= rulePredicate )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:809:3: lv_predicate_5_0= rulePredicate
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getPredicatePredicateParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicate_in_ruleAction1669);
                    lv_predicate_5_0=rulePredicate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_5_0, 
                            		"Predicate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:825:3: ( (lv_evaluations_6_0= ruleEvaluations ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13||LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:826:1: (lv_evaluations_6_0= ruleEvaluations )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:826:1: (lv_evaluations_6_0= ruleEvaluations )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:827:3: lv_evaluations_6_0= ruleEvaluations
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getEvaluationsEvaluationsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvaluations_in_ruleAction1691);
                    lv_evaluations_6_0=ruleEvaluations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"evaluations",
                            		lv_evaluations_6_0, 
                            		"Evaluations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:843:3: ( (lv_updates_7_0= ruleUpdates ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:844:1: (lv_updates_7_0= ruleUpdates )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:844:1: (lv_updates_7_0= ruleUpdates )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:845:3: lv_updates_7_0= ruleUpdates
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getUpdatesUpdatesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdates_in_ruleAction1713);
                    lv_updates_7_0=ruleUpdates();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"updates",
                            		lv_updates_7_0, 
                            		"Updates");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleAction1726); 

                	newLeafNode(otherlv_8, grammarAccess.getActionAccess().getFullStopKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePredicate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:876:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:880:2: (iv_rulePredicate= rulePredicate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:881:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate1772);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate1782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:891:1: rulePredicate returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:895:28: ( ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:896:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:896:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:896:2: () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:896:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:897:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateAccess().getPredicateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePredicate1832); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:906:1: ( (lv_predicate_2_0= rulePredicateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:907:1: (lv_predicate_2_0= rulePredicateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:907:1: (lv_predicate_2_0= rulePredicateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:908:3: lv_predicate_2_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicate1853);
            lv_predicate_2_0=rulePredicateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_2_0, 
                    		"PredicateExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePredicate1865); 

                	newLeafNode(otherlv_3, grammarAccess.getPredicateAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleEvaluations"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:939:1: entryRuleEvaluations returns [EObject current=null] : iv_ruleEvaluations= ruleEvaluations EOF ;
    public final EObject entryRuleEvaluations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluations = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:943:2: (iv_ruleEvaluations= ruleEvaluations EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:944:2: iv_ruleEvaluations= ruleEvaluations EOF
            {
             newCompositeNode(grammarAccess.getEvaluationsRule()); 
            pushFollow(FOLLOW_ruleEvaluations_in_entryRuleEvaluations1911);
            iv_ruleEvaluations=ruleEvaluations();

            state._fsp--;

             current =iv_ruleEvaluations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluations1921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluations"


    // $ANTLR start "ruleEvaluations"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:954:1: ruleEvaluations returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>' ) ) ;
    public final EObject ruleEvaluations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_6_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:958:28: ( ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:959:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:959:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:959:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:959:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:959:4: otherlv_0= '(' () ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+ otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleEvaluations1963); 

                        	newLeafNode(otherlv_0, grammarAccess.getEvaluationsAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:963:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:964:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEvaluationsAccess().getInAction_0_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:969:2: ( (lv_expressions_2_0= ruleEvaluationExpressionIn ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_LOWER||LA11_0==31) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:970:1: (lv_expressions_2_0= ruleEvaluationExpressionIn )
                    	    {
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:970:1: (lv_expressions_2_0= ruleEvaluationExpressionIn )
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:971:3: lv_expressions_2_0= ruleEvaluationExpressionIn
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationsAccess().getExpressionsEvaluationExpressionInParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationExpressionIn_in_ruleEvaluations1993);
                    	    lv_expressions_2_0=ruleEvaluationExpressionIn();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEvaluationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_2_0, 
                    	            		"EvaluationExpressionIn");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEvaluations2006); 

                        	newLeafNode(otherlv_3, grammarAccess.getEvaluationsAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:992:6: (otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:992:6: (otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:992:8: otherlv_4= '<' () ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+ otherlv_7= '>'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleEvaluations2026); 

                        	newLeafNode(otherlv_4, grammarAccess.getEvaluationsAccess().getLessThanSignKeyword_1_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:996:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:997:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEvaluationsAccess().getOutAction_1_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1002:2: ( (lv_expressions_6_0= ruleEvaluationExpressionOut ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==48) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1003:1: (lv_expressions_6_0= ruleEvaluationExpressionOut )
                    	    {
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1003:1: (lv_expressions_6_0= ruleEvaluationExpressionOut )
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1004:3: lv_expressions_6_0= ruleEvaluationExpressionOut
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationsAccess().getExpressionsEvaluationExpressionOutParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationExpressionOut_in_ruleEvaluations2056);
                    	    lv_expressions_6_0=ruleEvaluationExpressionOut();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEvaluationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_6_0, 
                    	            		"EvaluationExpressionOut");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleEvaluations2069); 

                        	newLeafNode(otherlv_7, grammarAccess.getEvaluationsAccess().getGreaterThanSignKeyword_1_3());
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleEvaluations"


    // $ANTLR start "entryRuleUpdates"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1035:1: entryRuleUpdates returns [EObject current=null] : iv_ruleUpdates= ruleUpdates EOF ;
    public final EObject entryRuleUpdates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdates = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1039:2: (iv_ruleUpdates= ruleUpdates EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1040:2: iv_ruleUpdates= ruleUpdates EOF
            {
             newCompositeNode(grammarAccess.getUpdatesRule()); 
            pushFollow(FOLLOW_ruleUpdates_in_entryRuleUpdates2116);
            iv_ruleUpdates=ruleUpdates();

            state._fsp--;

             current =iv_ruleUpdates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdates2126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUpdates"


    // $ANTLR start "ruleUpdates"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1050:1: ruleUpdates returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdateExpression ) )+ otherlv_3= '}' ) ;
    public final EObject ruleUpdates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_updates_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1054:28: ( ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdateExpression ) )+ otherlv_3= '}' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdateExpression ) )+ otherlv_3= '}' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdateExpression ) )+ otherlv_3= '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:2: () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdateExpression ) )+ otherlv_3= '}'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1056:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdatesAccess().getUpdatesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleUpdates2176); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdatesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1065:1: ( (lv_updates_2_0= ruleUpdateExpression ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_LOWER||LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1066:1: (lv_updates_2_0= ruleUpdateExpression )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1066:1: (lv_updates_2_0= ruleUpdateExpression )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1067:3: lv_updates_2_0= ruleUpdateExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateExpression_in_ruleUpdates2197);
            	    lv_updates_2_0=ruleUpdateExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdatesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"updates",
            	            		lv_updates_2_0, 
            	            		"UpdateExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUpdates2210); 

                	newLeafNode(otherlv_3, grammarAccess.getUpdatesAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUpdates"


    // $ANTLR start "entryRulePredicateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1098:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1102:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1103:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression2256);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression2266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePredicateExpression"


    // $ANTLR start "rulePredicateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1113:1: rulePredicateExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' ) ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1117:28: ( ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1118:1: ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1118:1: ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1118:2: ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1118:2: ( (lv_expression_0_0= ruleActionExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1119:1: (lv_expression_0_0= ruleActionExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1119:1: (lv_expression_0_0= ruleActionExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1120:3: lv_expression_0_0= ruleActionExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleActionExpression_in_rulePredicateExpression2316);
            lv_expression_0_0=ruleActionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ActionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePredicateExpression2328); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateExpressionAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePredicateExpression"


    // $ANTLR start "entryRuleEvaluationExpressionIn"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1151:1: entryRuleEvaluationExpressionIn returns [EObject current=null] : iv_ruleEvaluationExpressionIn= ruleEvaluationExpressionIn EOF ;
    public final EObject entryRuleEvaluationExpressionIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationExpressionIn = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1155:2: (iv_ruleEvaluationExpressionIn= ruleEvaluationExpressionIn EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1156:2: iv_ruleEvaluationExpressionIn= ruleEvaluationExpressionIn EOF
            {
             newCompositeNode(grammarAccess.getEvaluationExpressionInRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpressionIn_in_entryRuleEvaluationExpressionIn2374);
            iv_ruleEvaluationExpressionIn=ruleEvaluationExpressionIn();

            state._fsp--;

             current =iv_ruleEvaluationExpressionIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpressionIn2384); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationExpressionIn"


    // $ANTLR start "ruleEvaluationExpressionIn"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1166:1: ruleEvaluationExpressionIn returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) ) otherlv_8= ';' ) ;
    public final EObject ruleEvaluationExpressionIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1170:28: ( ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) ) otherlv_8= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:1: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) ) otherlv_8= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:1: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) ) otherlv_8= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:2: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) ) otherlv_8= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:2: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_LOWER) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:3: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:3: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:4: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1172:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEvaluationExpressionInAccess().getLocalEvaluationExpressionAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1177:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1178:1: (lv_name_1_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1178:1: (lv_name_1_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1179:3: lv_name_1_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationExpressionInAccess().getNameSelfReferencedStoreParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleEvaluationExpressionIn2445);
                    lv_name_1_0=ruleSelfReferencedStore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionInRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"SelfReferencedStore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationExpressionIn2457); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationExpressionInAccess().getColonEqualsSignKeyword_0_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1199:1: ( (lv_expression_3_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: (lv_expression_3_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: (lv_expression_3_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1201:3: lv_expression_3_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationExpressionInAccess().getExpressionActionExpressionParserRuleCall_0_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2478);
                    lv_expression_3_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionInRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:6: ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:6: ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:7: () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1219:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEvaluationExpressionInAccess().getGlobalEvaluationExpressionAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1224:2: ( (otherlv_5= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1225:1: (otherlv_5= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1225:1: (otherlv_5= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1226:3: otherlv_5= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationExpressionInRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleEvaluationExpressionIn2515); 

                    		newLeafNode(otherlv_5, grammarAccess.getEvaluationExpressionInAccess().getNameStoreCrossReference_0_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationExpressionIn2527); 

                        	newLeafNode(otherlv_6, grammarAccess.getEvaluationExpressionInAccess().getColonEqualsSignKeyword_0_1_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1241:1: ( (lv_expression_7_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1242:1: (lv_expression_7_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1242:1: (lv_expression_7_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1243:3: lv_expression_7_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationExpressionInAccess().getExpressionActionExpressionParserRuleCall_0_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2548);
                    lv_expression_7_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionInRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_7_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationExpressionIn2562); 

                	newLeafNode(otherlv_8, grammarAccess.getEvaluationExpressionInAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleEvaluationExpressionIn"


    // $ANTLR start "entryRuleEvaluationExpressionOut"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1274:1: entryRuleEvaluationExpressionOut returns [EObject current=null] : iv_ruleEvaluationExpressionOut= ruleEvaluationExpressionOut EOF ;
    public final EObject entryRuleEvaluationExpressionOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationExpressionOut = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1278:2: (iv_ruleEvaluationExpressionOut= ruleEvaluationExpressionOut EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1279:2: iv_ruleEvaluationExpressionOut= ruleEvaluationExpressionOut EOF
            {
             newCompositeNode(grammarAccess.getEvaluationExpressionOutRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpressionOut_in_entryRuleEvaluationExpressionOut2608);
            iv_ruleEvaluationExpressionOut=ruleEvaluationExpressionOut();

            state._fsp--;

             current =iv_ruleEvaluationExpressionOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpressionOut2618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationExpressionOut"


    // $ANTLR start "ruleEvaluationExpressionOut"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1289:1: ruleEvaluationExpressionOut returns [EObject current=null] : ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleEvaluationExpressionOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1293:28: ( ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1294:1: ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1294:1: ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1294:2: () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1294:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1295:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvaluationExpressionOutAccess().getFreeEvaluationExpressionAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1300:2: ( (lv_name_1_0= ruleFreeVariable ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1301:1: (lv_name_1_0= ruleFreeVariable )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1301:1: (lv_name_1_0= ruleFreeVariable )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1302:3: lv_name_1_0= ruleFreeVariable
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationExpressionOutAccess().getNameFreeVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFreeVariable_in_ruleEvaluationExpressionOut2677);
            lv_name_1_0=ruleFreeVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionOutRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FreeVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationExpressionOut2689); 

                	newLeafNode(otherlv_2, grammarAccess.getEvaluationExpressionOutAccess().getColonEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1322:1: ( (lv_expression_3_0= ruleActionExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1323:1: (lv_expression_3_0= ruleActionExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1323:1: (lv_expression_3_0= ruleActionExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1324:3: lv_expression_3_0= ruleActionExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationExpressionOutAccess().getExpressionActionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionOut2710);
            lv_expression_3_0=ruleActionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionOutRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"ActionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationExpressionOut2722); 

                	newLeafNode(otherlv_4, grammarAccess.getEvaluationExpressionOutAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleEvaluationExpressionOut"


    // $ANTLR start "entryRuleUpdateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1355:1: entryRuleUpdateExpression returns [EObject current=null] : iv_ruleUpdateExpression= ruleUpdateExpression EOF ;
    public final EObject entryRuleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1359:2: (iv_ruleUpdateExpression= ruleUpdateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1360:2: iv_ruleUpdateExpression= ruleUpdateExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression2768);
            iv_ruleUpdateExpression=ruleUpdateExpression();

            state._fsp--;

             current =iv_ruleUpdateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpression2778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateExpression"


    // $ANTLR start "ruleUpdateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1370:1: ruleUpdateExpression returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) ) otherlv_16= ';' ) ;
    public final EObject ruleUpdateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_name_9_0 = null;

        EObject lv_expression_11_0 = null;

        EObject lv_expression_15_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1374:28: ( ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) ) otherlv_16= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:1: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) ) otherlv_16= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:1: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) ) otherlv_16= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:2: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) ) otherlv_16= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:2: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:3: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:3: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:4: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1375:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1376:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateExpressionAccess().getLocalUpdateExpressionAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1381:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1382:1: (lv_name_1_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1382:1: (lv_name_1_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1383:3: lv_name_1_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getNameSelfReferencedStoreParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleUpdateExpression2839);
                    lv_name_1_0=ruleSelfReferencedStore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"SelfReferencedStore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleUpdateExpression2851); 

                        	newLeafNode(otherlv_2, grammarAccess.getUpdateExpressionAccess().getColonEqualsSignKeyword_0_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1403:1: ( (lv_expression_3_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1404:1: (lv_expression_3_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1404:1: (lv_expression_3_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1405:3: lv_expression_3_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleUpdateExpression2872);
                    lv_expression_3_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1422:6: ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1422:6: ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1422:7: () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1422:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1423:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateExpressionAccess().getGlobalUpdateExpressionAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1428:2: ( (otherlv_5= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1429:1: (otherlv_5= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1429:1: (otherlv_5= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:3: otherlv_5= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateExpressionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleUpdateExpression2909); 

                    		newLeafNode(otherlv_5, grammarAccess.getUpdateExpressionAccess().getNameStoreCrossReference_0_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleUpdateExpression2921); 

                        	newLeafNode(otherlv_6, grammarAccess.getUpdateExpressionAccess().getColonEqualsSignKeyword_0_1_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1445:1: ( (lv_expression_7_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1446:1: (lv_expression_7_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1446:1: (lv_expression_7_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1447:3: lv_expression_7_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleUpdateExpression2942);
                    lv_expression_7_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_7_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1464:6: ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1464:6: ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1464:7: () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1464:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1465:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateExpressionAccess().getLocalUpdateExpressionFunctionAction_0_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1470:2: ( (lv_name_9_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1471:1: (lv_name_9_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1471:1: (lv_name_9_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1472:3: lv_name_9_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getNameSelfReferencedStoreParserRuleCall_0_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleUpdateExpression2980);
                    lv_name_9_0=ruleSelfReferencedStore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_9_0, 
                            		"SelfReferencedStore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleUpdateExpression2992); 

                        	newLeafNode(otherlv_10, grammarAccess.getUpdateExpressionAccess().getColonEqualsSignKeyword_0_2_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:1: ( (lv_expression_11_0= ruleFunctionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1493:1: (lv_expression_11_0= ruleFunctionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1493:1: (lv_expression_11_0= ruleFunctionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1494:3: lv_expression_11_0= ruleFunctionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getExpressionFunctionExpressionParserRuleCall_0_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionExpression_in_ruleUpdateExpression3013);
                    lv_expression_11_0=ruleFunctionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_11_0, 
                            		"FunctionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1511:6: ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1511:6: ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1511:7: () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1511:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1512:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateExpressionAccess().getGlobalUpdateExpressionFunctionAction_0_3_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1517:2: ( (otherlv_13= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1518:1: (otherlv_13= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1518:1: (otherlv_13= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1519:3: otherlv_13= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateExpressionRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleUpdateExpression3050); 

                    		newLeafNode(otherlv_13, grammarAccess.getUpdateExpressionAccess().getNameStoreCrossReference_0_3_1_0()); 
                    	

                    }


                    }

                    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleUpdateExpression3062); 

                        	newLeafNode(otherlv_14, grammarAccess.getUpdateExpressionAccess().getColonEqualsSignKeyword_0_3_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1534:1: ( (lv_expression_15_0= ruleFunctionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1535:1: (lv_expression_15_0= ruleFunctionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1535:1: (lv_expression_15_0= ruleFunctionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1536:3: lv_expression_15_0= ruleFunctionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getExpressionFunctionExpressionParserRuleCall_0_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionExpression_in_ruleUpdateExpression3083);
                    lv_expression_15_0=ruleFunctionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_15_0, 
                            		"FunctionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleUpdateExpression3097); 

                	newLeafNode(otherlv_16, grammarAccess.getUpdateExpressionAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUpdateExpression"


    // $ANTLR start "entryRuleSelfReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1567:1: entryRuleSelfReferencedStore returns [EObject current=null] : iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF ;
    public final EObject entryRuleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferencedStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1571:2: (iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1572:2: iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF
            {
             newCompositeNode(grammarAccess.getSelfReferencedStoreRule()); 
            pushFollow(FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore3143);
            iv_ruleSelfReferencedStore=ruleSelfReferencedStore();

            state._fsp--;

             current =iv_ruleSelfReferencedStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfReferencedStore3153); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSelfReferencedStore"


    // $ANTLR start "ruleSelfReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1582:1: ruleSelfReferencedStore returns [EObject current=null] : ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) ;
    public final EObject ruleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1586:28: ( ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1587:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1587:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1587:2: () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1587:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1588:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelfReferencedStoreAccess().getSelfReferencedStoreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSelfReferencedStore3203); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfReferencedStoreAccess().getThisKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1597:1: ( (otherlv_2= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1598:1: (otherlv_2= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1598:1: (otherlv_2= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1599:3: otherlv_2= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfReferencedStoreRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore3223); 

            		newLeafNode(otherlv_2, grammarAccess.getSelfReferencedStoreAccess().getNameStoreCrossReference_2_0()); 
            	

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSelfReferencedStore"


    // $ANTLR start "entryRuleFunctionExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1621:1: entryRuleFunctionExpression returns [EObject current=null] : iv_ruleFunctionExpression= ruleFunctionExpression EOF ;
    public final EObject entryRuleFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1625:2: (iv_ruleFunctionExpression= ruleFunctionExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1626:2: iv_ruleFunctionExpression= ruleFunctionExpression EOF
            {
             newCompositeNode(grammarAccess.getFunctionExpressionRule()); 
            pushFollow(FOLLOW_ruleFunctionExpression_in_entryRuleFunctionExpression3269);
            iv_ruleFunctionExpression=ruleFunctionExpression();

            state._fsp--;

             current =iv_ruleFunctionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionExpression3279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionExpression"


    // $ANTLR start "ruleFunctionExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1636:1: ruleFunctionExpression returns [EObject current=null] : ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_distribution_3_0 = null;

        EObject lv_distribution_8_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1640:28: ( ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:1: ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:1: ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:2: ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:2: ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:3: () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1642:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFunctionExpressionAccess().getFunctionExpressionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleFunctionExpression3330); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionExpressionAccess().getPrKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFunctionExpression3342); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionExpressionAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1655:1: ( (lv_distribution_3_0= ruleDistribution ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_INT) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1656:1: (lv_distribution_3_0= ruleDistribution )
                    	    {
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1656:1: (lv_distribution_3_0= ruleDistribution )
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1657:3: lv_distribution_3_0= ruleDistribution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionExpressionAccess().getDistributionDistributionParserRuleCall_0_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDistribution_in_ruleFunctionExpression3363);
                    	    lv_distribution_3_0=ruleDistribution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"distribution",
                    	            		lv_distribution_3_0, 
                    	            		"Distribution");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFunctionExpression3376); 

                        	newLeafNode(otherlv_4, grammarAccess.getFunctionExpressionAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1678:6: ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1678:6: ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1678:7: () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1678:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1679:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFunctionExpressionAccess().getFunctionExpressionAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleFunctionExpression3405); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionExpressionAccess().getUKeyword_1_1());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleFunctionExpression3417); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionExpressionAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1692:1: ( (lv_distribution_8_0= ruleUniform ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1693:1: (lv_distribution_8_0= ruleUniform )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1693:1: (lv_distribution_8_0= ruleUniform )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1694:3: lv_distribution_8_0= ruleUniform
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionExpressionAccess().getDistributionUniformParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUniform_in_ruleFunctionExpression3438);
                    lv_distribution_8_0=ruleUniform();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"distribution",
                            		lv_distribution_8_0, 
                            		"Uniform");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleFunctionExpression3450); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionExpressionAccess().getRightParenthesisKeyword_1_4());
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFunctionExpression"


    // $ANTLR start "entryRuleDistribution"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1725:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1729:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1730:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution3497);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution3507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDistribution"


    // $ANTLR start "ruleDistribution"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1740:1: ruleDistribution returns [EObject current=null] : ( ( (lv_prob_0_0= ruleDouble ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleActionExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_prob_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1744:28: ( ( ( (lv_prob_0_0= ruleDouble ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleActionExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:1: ( ( (lv_prob_0_0= ruleDouble ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleActionExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:1: ( ( (lv_prob_0_0= ruleDouble ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleActionExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:2: ( (lv_prob_0_0= ruleDouble ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleActionExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:2: ( (lv_prob_0_0= ruleDouble ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1746:1: (lv_prob_0_0= ruleDouble )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1746:1: (lv_prob_0_0= ruleDouble )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1747:3: lv_prob_0_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getProbDoubleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleDistribution3557);
            lv_prob_0_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	        }
                   		set(
                   			current, 
                   			"prob",
                    		lv_prob_0_0, 
                    		"Double");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDistribution3569); 

                	newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getColonKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1767:1: ( (lv_expression_2_0= ruleActionExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1768:1: (lv_expression_2_0= ruleActionExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1768:1: (lv_expression_2_0= ruleActionExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1769:3: lv_expression_2_0= ruleActionExpression
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getExpressionActionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleActionExpression_in_ruleDistribution3590);
            lv_expression_2_0=ruleActionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"ActionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDistribution3602); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleUniform"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1800:1: entryRuleUniform returns [EObject current=null] : iv_ruleUniform= ruleUniform EOF ;
    public final EObject entryRuleUniform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniform = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1804:2: (iv_ruleUniform= ruleUniform EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1805:2: iv_ruleUniform= ruleUniform EOF
            {
             newCompositeNode(grammarAccess.getUniformRule()); 
            pushFollow(FOLLOW_ruleUniform_in_entryRuleUniform3648);
            iv_ruleUniform=ruleUniform();

            state._fsp--;

             current =iv_ruleUniform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniform3658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUniform"


    // $ANTLR start "ruleUniform"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1815:1: ruleUniform returns [EObject current=null] : ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleUniform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1819:28: ( ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1820:1: ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1820:1: ( ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1820:2: ( (lv_expression_0_0= ruleActionExpression ) ) otherlv_1= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1820:2: ( (lv_expression_0_0= ruleActionExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1821:1: (lv_expression_0_0= ruleActionExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1821:1: (lv_expression_0_0= ruleActionExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1822:3: lv_expression_0_0= ruleActionExpression
            {
             
            	        newCompositeNode(grammarAccess.getUniformAccess().getExpressionActionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleActionExpression_in_ruleUniform3708);
            lv_expression_0_0=ruleActionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniformRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ActionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleUniform3720); 

                	newLeafNode(otherlv_1, grammarAccess.getUniformAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUniform"


    // $ANTLR start "entryRuleActionExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1853:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1857:2: (iv_ruleActionExpression= ruleActionExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1858:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression3766);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression3776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionExpression"


    // $ANTLR start "ruleActionExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1868:1: ruleActionExpression returns [EObject current=null] : this_ActionOr_0= ruleActionOr ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ActionOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1872:28: (this_ActionOr_0= ruleActionOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1874:5: this_ActionOr_0= ruleActionOr
            {
             
                    newCompositeNode(grammarAccess.getActionExpressionAccess().getActionOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleActionOr_in_ruleActionExpression3826);
            this_ActionOr_0=ruleActionOr();

            state._fsp--;

             
                    current = this_ActionOr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionExpression"


    // $ANTLR start "entryRuleActionOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1893:1: entryRuleActionOr returns [EObject current=null] : iv_ruleActionOr= ruleActionOr EOF ;
    public final EObject entryRuleActionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1897:2: (iv_ruleActionOr= ruleActionOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1898:2: iv_ruleActionOr= ruleActionOr EOF
            {
             newCompositeNode(grammarAccess.getActionOrRule()); 
            pushFollow(FOLLOW_ruleActionOr_in_entryRuleActionOr3870);
            iv_ruleActionOr=ruleActionOr();

            state._fsp--;

             current =iv_ruleActionOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOr3880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionOr"


    // $ANTLR start "ruleActionOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:1: ruleActionOr returns [EObject current=null] : (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* ) ;
    public final EObject ruleActionOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1912:28: ( (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1913:1: (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1913:1: (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1914:5: this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionOrAccess().getActionAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionAnd_in_ruleActionOr3931);
            this_ActionAnd_0=ruleActionAnd();

            state._fsp--;

             
                    current = this_ActionAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:2: () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1923:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleActionOr3952); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1932:1: ( (lv_right_3_0= ruleActionAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1933:1: (lv_right_3_0= ruleActionAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1933:1: (lv_right_3_0= ruleActionAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1934:3: lv_right_3_0= ruleActionAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionOrAccess().getRightActionAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionAnd_in_ruleActionOr3973);
            	    lv_right_3_0=ruleActionAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionOr"


    // $ANTLR start "entryRuleActionAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1961:1: entryRuleActionAnd returns [EObject current=null] : iv_ruleActionAnd= ruleActionAnd EOF ;
    public final EObject entryRuleActionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1965:2: (iv_ruleActionAnd= ruleActionAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1966:2: iv_ruleActionAnd= ruleActionAnd EOF
            {
             newCompositeNode(grammarAccess.getActionAndRule()); 
            pushFollow(FOLLOW_ruleActionAnd_in_entryRuleActionAnd4021);
            iv_ruleActionAnd=ruleActionAnd();

            state._fsp--;

             current =iv_ruleActionAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionAnd4031); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionAnd"


    // $ANTLR start "ruleActionAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1976:1: ruleActionAnd returns [EObject current=null] : (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* ) ;
    public final EObject ruleActionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1980:28: ( (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1981:1: (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1981:1: (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1982:5: this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionAndAccess().getActionEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionEquality_in_ruleActionAnd4082);
            this_ActionEquality_0=ruleActionEquality();

            state._fsp--;

             
                    current = this_ActionEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1990:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1990:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1990:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1991:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleActionAnd4103); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2000:1: ( (lv_right_3_0= ruleActionEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2001:1: (lv_right_3_0= ruleActionEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2001:1: (lv_right_3_0= ruleActionEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2002:3: lv_right_3_0= ruleActionEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAndAccess().getRightActionEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionEquality_in_ruleActionAnd4124);
            	    lv_right_3_0=ruleActionEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionEquality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionAnd"


    // $ANTLR start "entryRuleActionEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2029:1: entryRuleActionEquality returns [EObject current=null] : iv_ruleActionEquality= ruleActionEquality EOF ;
    public final EObject entryRuleActionEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2033:2: (iv_ruleActionEquality= ruleActionEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2034:2: iv_ruleActionEquality= ruleActionEquality EOF
            {
             newCompositeNode(grammarAccess.getActionEqualityRule()); 
            pushFollow(FOLLOW_ruleActionEquality_in_entryRuleActionEquality4172);
            iv_ruleActionEquality=ruleActionEquality();

            state._fsp--;

             current =iv_ruleActionEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionEquality4182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionEquality"


    // $ANTLR start "ruleActionEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2044:1: ruleActionEquality returns [EObject current=null] : (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* ) ;
    public final EObject ruleActionEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ActionComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2048:28: ( (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2049:1: (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2049:1: (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2050:5: this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionEqualityAccess().getActionComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionComparison_in_ruleActionEquality4233);
            this_ActionComparison_0=ruleActionComparison();

            state._fsp--;

             
                    current = this_ActionComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2058:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=37 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2058:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2058:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2059:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2064:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2065:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2065:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2066:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2066:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==37) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==38) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2067:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_37_in_ruleActionEquality4262); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getActionEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2079:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleActionEquality4291); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getActionEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2094:2: ( (lv_right_3_0= ruleActionComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2095:1: (lv_right_3_0= ruleActionComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2095:1: (lv_right_3_0= ruleActionComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2096:3: lv_right_3_0= ruleActionComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionEqualityAccess().getRightActionComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionComparison_in_ruleActionEquality4328);
            	    lv_right_3_0=ruleActionComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionComparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionEquality"


    // $ANTLR start "entryRuleActionComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2123:1: entryRuleActionComparison returns [EObject current=null] : iv_ruleActionComparison= ruleActionComparison EOF ;
    public final EObject entryRuleActionComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2127:2: (iv_ruleActionComparison= ruleActionComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2128:2: iv_ruleActionComparison= ruleActionComparison EOF
            {
             newCompositeNode(grammarAccess.getActionComparisonRule()); 
            pushFollow(FOLLOW_ruleActionComparison_in_entryRuleActionComparison4376);
            iv_ruleActionComparison=ruleActionComparison();

            state._fsp--;

             current =iv_ruleActionComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionComparison4386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionComparison"


    // $ANTLR start "ruleActionComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2138:1: ruleActionComparison returns [EObject current=null] : (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* ) ;
    public final EObject ruleActionComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ActionSubtraction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2142:28: ( (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2143:1: (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2143:1: (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2144:5: this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionComparisonAccess().getActionSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionSubtraction_in_ruleActionComparison4437);
            this_ActionSubtraction_0=ruleActionSubtraction();

            state._fsp--;

             
                    current = this_ActionSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2152:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=28 && LA24_0<=29)||(LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2152:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2152:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2153:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2158:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2159:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2159:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2160:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2160:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleActionComparison4466); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getActionComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2173:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_40_in_ruleActionComparison4495); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getActionComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2185:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,29,FOLLOW_29_in_ruleActionComparison4524); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getActionComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2197:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleActionComparison4553); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getActionComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2212:2: ( (lv_right_3_0= ruleActionSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2213:1: (lv_right_3_0= ruleActionSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2213:1: (lv_right_3_0= ruleActionSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2214:3: lv_right_3_0= ruleActionSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionComparisonAccess().getRightActionSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionSubtraction_in_ruleActionComparison4590);
            	    lv_right_3_0=ruleActionSubtraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionSubtraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionComparison"


    // $ANTLR start "entryRuleActionSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2241:1: entryRuleActionSubtraction returns [EObject current=null] : iv_ruleActionSubtraction= ruleActionSubtraction EOF ;
    public final EObject entryRuleActionSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2245:2: (iv_ruleActionSubtraction= ruleActionSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2246:2: iv_ruleActionSubtraction= ruleActionSubtraction EOF
            {
             newCompositeNode(grammarAccess.getActionSubtractionRule()); 
            pushFollow(FOLLOW_ruleActionSubtraction_in_entryRuleActionSubtraction4638);
            iv_ruleActionSubtraction=ruleActionSubtraction();

            state._fsp--;

             current =iv_ruleActionSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionSubtraction4648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionSubtraction"


    // $ANTLR start "ruleActionSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2256:1: ruleActionSubtraction returns [EObject current=null] : (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* ) ;
    public final EObject ruleActionSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2260:28: ( (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2261:1: (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2261:1: (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2262:5: this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionSubtractionAccess().getActionAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionAddition_in_ruleActionSubtraction4699);
            this_ActionAddition_0=ruleActionAddition();

            state._fsp--;

             
                    current = this_ActionAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2270:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2270:2: () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2270:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2271:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleActionSubtraction4720); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2280:1: ( (lv_right_3_0= ruleActionAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2281:1: (lv_right_3_0= ruleActionAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2281:1: (lv_right_3_0= ruleActionAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2282:3: lv_right_3_0= ruleActionAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionSubtractionAccess().getRightActionAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionAddition_in_ruleActionSubtraction4741);
            	    lv_right_3_0=ruleActionAddition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionSubtractionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionAddition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionSubtraction"


    // $ANTLR start "entryRuleActionAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2309:1: entryRuleActionAddition returns [EObject current=null] : iv_ruleActionAddition= ruleActionAddition EOF ;
    public final EObject entryRuleActionAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2313:2: (iv_ruleActionAddition= ruleActionAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2314:2: iv_ruleActionAddition= ruleActionAddition EOF
            {
             newCompositeNode(grammarAccess.getActionAdditionRule()); 
            pushFollow(FOLLOW_ruleActionAddition_in_entryRuleActionAddition4789);
            iv_ruleActionAddition=ruleActionAddition();

            state._fsp--;

             current =iv_ruleActionAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionAddition4799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionAddition"


    // $ANTLR start "ruleActionAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2324:1: ruleActionAddition returns [EObject current=null] : (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* ) ;
    public final EObject ruleActionAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2328:28: ( (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2329:1: (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2329:1: (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2330:5: this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionAdditionAccess().getActionMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionMultiplication_in_ruleActionAddition4850);
            this_ActionMultiplication_0=ruleActionMultiplication();

            state._fsp--;

             
                    current = this_ActionMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2338:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2338:2: () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2338:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2339:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleActionAddition4871); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2348:1: ( (lv_right_3_0= ruleActionMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2349:1: (lv_right_3_0= ruleActionMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2349:1: (lv_right_3_0= ruleActionMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2350:3: lv_right_3_0= ruleActionMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAdditionAccess().getRightActionMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionMultiplication_in_ruleActionAddition4892);
            	    lv_right_3_0=ruleActionMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionMultiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionAddition"


    // $ANTLR start "entryRuleActionMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2377:1: entryRuleActionMultiplication returns [EObject current=null] : iv_ruleActionMultiplication= ruleActionMultiplication EOF ;
    public final EObject entryRuleActionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2381:2: (iv_ruleActionMultiplication= ruleActionMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2382:2: iv_ruleActionMultiplication= ruleActionMultiplication EOF
            {
             newCompositeNode(grammarAccess.getActionMultiplicationRule()); 
            pushFollow(FOLLOW_ruleActionMultiplication_in_entryRuleActionMultiplication4940);
            iv_ruleActionMultiplication=ruleActionMultiplication();

            state._fsp--;

             current =iv_ruleActionMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionMultiplication4950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionMultiplication"


    // $ANTLR start "ruleActionMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2392:1: ruleActionMultiplication returns [EObject current=null] : (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* ) ;
    public final EObject ruleActionMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2396:28: ( (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2397:1: (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2397:1: (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2398:5: this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionMultiplicationAccess().getActionDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionDivision_in_ruleActionMultiplication5001);
            this_ActionDivision_0=ruleActionDivision();

            state._fsp--;

             
                    current = this_ActionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2406:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2406:2: () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2406:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2407:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleActionMultiplication5022); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2416:1: ( (lv_right_3_0= ruleActionDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2417:1: (lv_right_3_0= ruleActionDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2417:1: (lv_right_3_0= ruleActionDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2418:3: lv_right_3_0= ruleActionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionMultiplicationAccess().getRightActionDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionDivision_in_ruleActionMultiplication5043);
            	    lv_right_3_0=ruleActionDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionDivision");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionMultiplication"


    // $ANTLR start "entryRuleActionDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2445:1: entryRuleActionDivision returns [EObject current=null] : iv_ruleActionDivision= ruleActionDivision EOF ;
    public final EObject entryRuleActionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2449:2: (iv_ruleActionDivision= ruleActionDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2450:2: iv_ruleActionDivision= ruleActionDivision EOF
            {
             newCompositeNode(grammarAccess.getActionDivisionRule()); 
            pushFollow(FOLLOW_ruleActionDivision_in_entryRuleActionDivision5091);
            iv_ruleActionDivision=ruleActionDivision();

            state._fsp--;

             current =iv_ruleActionDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDivision5101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionDivision"


    // $ANTLR start "ruleActionDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2460:1: ruleActionDivision returns [EObject current=null] : (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* ) ;
    public final EObject ruleActionDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionPrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2464:28: ( (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2465:1: (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2465:1: (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2466:5: this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionDivisionAccess().getActionPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionPrimary_in_ruleActionDivision5152);
            this_ActionPrimary_0=ruleActionPrimary();

            state._fsp--;

             
                    current = this_ActionPrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2474:1: ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2474:2: () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2474:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2475:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleActionDivision5173); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2484:1: ( (lv_right_3_0= ruleActionPrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2485:1: (lv_right_3_0= ruleActionPrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2485:1: (lv_right_3_0= ruleActionPrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2486:3: lv_right_3_0= ruleActionPrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionDivisionAccess().getRightActionPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionPrimary_in_ruleActionDivision5194);
            	    lv_right_3_0=ruleActionPrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ActionPrimary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionDivision"


    // $ANTLR start "entryRuleActionPrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2513:1: entryRuleActionPrimary returns [EObject current=null] : iv_ruleActionPrimary= ruleActionPrimary EOF ;
    public final EObject entryRuleActionPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionPrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2517:2: (iv_ruleActionPrimary= ruleActionPrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2518:2: iv_ruleActionPrimary= ruleActionPrimary EOF
            {
             newCompositeNode(grammarAccess.getActionPrimaryRule()); 
            pushFollow(FOLLOW_ruleActionPrimary_in_entryRuleActionPrimary5242);
            iv_ruleActionPrimary=ruleActionPrimary();

            state._fsp--;

             current =iv_ruleActionPrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionPrimary5252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionPrimary"


    // $ANTLR start "ruleActionPrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2528:1: ruleActionPrimary returns [EObject current=null] : ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic ) ;
    public final EObject ruleActionPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ActionExpression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_ActionAtomic_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2532:28: ( ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2533:1: ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2533:1: ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt29=1;
                }
                break;
            case 43:
                {
                alt29=2;
                }
                break;
            case RULE_LOWER:
            case RULE_INT:
            case 44:
            case 45:
            case 48:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2533:2: (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2533:2: (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2533:4: otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleActionPrimary5294); 

                        	newLeafNode(otherlv_0, grammarAccess.getActionPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getActionPrimaryAccess().getActionExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleActionPrimary5316);
                    this_ActionExpression_1=ruleActionExpression();

                    state._fsp--;

                     
                            current = this_ActionExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleActionPrimary5327); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2551:6: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2551:6: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2551:7: () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2551:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2552:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionPrimaryAccess().getActionNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleActionPrimary5356); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2561:1: ( (lv_expression_5_0= ruleActionPrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2562:1: (lv_expression_5_0= ruleActionPrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2562:1: (lv_expression_5_0= ruleActionPrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2563:3: lv_expression_5_0= ruleActionPrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionPrimaryAccess().getExpressionActionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionPrimary_in_ruleActionPrimary5377);
                    lv_expression_5_0=ruleActionPrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"ActionPrimary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2581:5: this_ActionAtomic_6= ruleActionAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getActionPrimaryAccess().getActionAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionAtomic_in_ruleActionPrimary5406);
                    this_ActionAtomic_6=ruleActionAtomic();

                    state._fsp--;

                     
                            current = this_ActionAtomic_6; 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionPrimary"


    // $ANTLR start "entryRuleActionAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2600:1: entryRuleActionAtomic returns [EObject current=null] : iv_ruleActionAtomic= ruleActionAtomic EOF ;
    public final EObject entryRuleActionAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2604:2: (iv_ruleActionAtomic= ruleActionAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2605:2: iv_ruleActionAtomic= ruleActionAtomic EOF
            {
             newCompositeNode(grammarAccess.getActionAtomicRule()); 
            pushFollow(FOLLOW_ruleActionAtomic_in_entryRuleActionAtomic5451);
            iv_ruleActionAtomic=ruleActionAtomic();

            state._fsp--;

             current =iv_ruleActionAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionAtomic5461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActionAtomic"


    // $ANTLR start "ruleActionAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2615:1: ruleActionAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) ) ;
    public final EObject ruleActionAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2619:28: ( ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt31=1;
                }
                break;
            case 48:
                {
                alt31=2;
                }
                break;
            case 44:
            case 45:
                {
                alt31=3;
                }
                break;
            case RULE_LOWER:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:3: () ( (lv_value_1_0= ruleDouble ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2621:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getDoubleConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2626:2: ( (lv_value_1_0= ruleDouble ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2627:1: (lv_value_1_0= ruleDouble )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2627:1: (lv_value_1_0= ruleDouble )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2628:3: lv_value_1_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAtomicAccess().getValueDoubleParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleActionAtomic5521);
                    lv_value_1_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2645:6: ( () ( (lv_value_3_0= ruleFreeVariable ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2645:6: ( () ( (lv_value_3_0= ruleFreeVariable ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2645:7: () ( (lv_value_3_0= ruleFreeVariable ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2645:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2646:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getFreeVariableAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2651:2: ( (lv_value_3_0= ruleFreeVariable ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2652:1: (lv_value_3_0= ruleFreeVariable )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2652:1: (lv_value_3_0= ruleFreeVariable )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2653:3: lv_value_3_0= ruleFreeVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAtomicAccess().getValueFreeVariableParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFreeVariable_in_ruleActionAtomic5559);
                    lv_value_3_0=ruleFreeVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"FreeVariable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2670:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2670:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2670:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2670:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2671:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2676:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2677:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2677:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2678:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2678:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==44) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==45) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2679:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,44,FOLLOW_44_in_ruleActionAtomic5596); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getActionAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2691:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,45,FOLLOW_45_in_ruleActionAtomic5625); 

                                    newLeafNode(lv_value_5_2, grammarAccess.getActionAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2707:6: ( () ( (otherlv_7= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2707:6: ( () ( (otherlv_7= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2707:7: () ( (otherlv_7= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2707:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2708:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getReferencedStoreAction_3_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2713:2: ( (otherlv_7= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2714:1: (otherlv_7= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2714:1: (otherlv_7= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2715:3: otherlv_7= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleActionAtomic5678); 

                    		newLeafNode(otherlv_7, grammarAccess.getActionAtomicAccess().getValueStoreCrossReference_3_1_0()); 
                    	

                    }


                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActionAtomic"


    // $ANTLR start "entryRuleStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2737:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2741:2: (iv_ruleStore= ruleStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2742:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore5725);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore5735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2752:1: ruleStore returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2756:28: ( ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2757:1: ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2757:1: ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2757:2: ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2757:2: ( (lv_name_0_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2758:1: (lv_name_0_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2758:1: (lv_name_0_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2759:3: lv_name_0_0= RULE_LOWER
            {
            lv_name_0_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleStore5781); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStoreAccess().getNameLOWERTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"LOWER");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStore5798); 

                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2779:1: ( (lv_value_2_0= ruleExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2780:1: (lv_value_2_0= ruleExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2780:1: (lv_value_2_0= ruleExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2781:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getStoreAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleStore5819);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoreRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleStore5831); 

                	newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2816:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2817:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5877);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2827:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2831:28: (this_Or_0= ruleOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2833:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression5937);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2852:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2856:2: (iv_ruleOr= ruleOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2857:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr5981);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr5991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2867:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2871:28: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2872:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2872:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2873:5: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr6042);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2881:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2881:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2881:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2882:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleOr6063); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2891:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2892:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2892:1: (lv_right_3_0= ruleAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2893:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr6084);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2920:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2924:2: (iv_ruleAnd= ruleAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2925:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd6132);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd6142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2935:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2939:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2940:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2940:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2941:5: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd6193);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2949:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2949:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2949:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2950:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleAnd6214); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2959:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2960:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2960:1: (lv_right_3_0= ruleEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2961:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd6235);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Equality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2988:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2992:2: (iv_ruleEquality= ruleEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2993:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality6283);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality6293); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3003:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3007:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3008:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3008:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3009:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality6344);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3017:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=37 && LA35_0<=38)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3017:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3017:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3018:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3023:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3024:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3024:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3025:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3025:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==37) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==38) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3026:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_37_in_ruleEquality6373); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3038:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleEquality6402); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3053:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3054:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3054:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3055:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality6439);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3082:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3086:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3087:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison6487);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison6497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3097:1: ruleComparison returns [EObject current=null] : (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Subtraction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3101:28: ( (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3102:1: (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3102:1: (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3103:5: this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSubtraction_in_ruleComparison6548);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;

             
                    current = this_Subtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=28 && LA37_0<=29)||(LA37_0>=39 && LA37_0<=40)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3112:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3117:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3118:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3118:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3119:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3119:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt36=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt36=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3120:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleComparison6577); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3132:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_40_in_ruleComparison6606); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3144:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,29,FOLLOW_29_in_ruleComparison6635); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3156:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleComparison6664); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3171:2: ( (lv_right_3_0= ruleSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3172:1: (lv_right_3_0= ruleSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3172:1: (lv_right_3_0= ruleSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3173:3: lv_right_3_0= ruleSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubtraction_in_ruleComparison6701);
            	    lv_right_3_0=ruleSubtraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Subtraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3200:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3204:2: (iv_ruleSubtraction= ruleSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3205:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction6749);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction6759); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3215:1: ruleSubtraction returns [EObject current=null] : (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3219:28: ( (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3220:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3220:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3221:5: this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction6810);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3229:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==41) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3229:2: () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3229:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3230:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getSubtractionAccess().getSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSubtraction6831); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3239:1: ( (lv_right_3_0= ruleAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3240:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3240:1: (lv_right_3_0= ruleAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3241:3: lv_right_3_0= ruleAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction6852);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubtractionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Addition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3268:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3272:2: (iv_ruleAddition= ruleAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3273:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition6900);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition6910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3283:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3287:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3288:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3288:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3289:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition6961);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:2: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3298:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionAccess().getPluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAddition6982); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3307:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3308:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3308:1: (lv_right_3_0= ruleMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3309:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition7003);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3336:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3340:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3341:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication7051);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication7061); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3351:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3355:28: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3356:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3356:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3357:5: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication7112);
            this_Division_0=ruleDivision();

            state._fsp--;

             
                    current = this_Division_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3365:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==24) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3365:2: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3365:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3366:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMultiplication7133); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3375:1: ( (lv_right_3_0= ruleDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3376:1: (lv_right_3_0= ruleDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3376:1: (lv_right_3_0= ruleDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3377:3: lv_right_3_0= ruleDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication7154);
            	    lv_right_3_0=ruleDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Division");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3404:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3408:2: (iv_ruleDivision= ruleDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3409:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision7202);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision7212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3419:1: ruleDivision returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3423:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3424:1: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3424:1: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3425:5: this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleDivision7263);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==42) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:2: () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3434:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDivisionAccess().getDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleDivision7284); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3443:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3444:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3444:1: (lv_right_3_0= rulePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3445:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleDivision7305);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3472:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3476:2: (iv_rulePrimary= rulePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3477:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary7353);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary7363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3487:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt42=1;
                }
                break;
            case 43:
                {
                alt42=2;
                }
                break;
            case RULE_LOWER:
            case RULE_INT:
            case 44:
            case 45:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePrimary7405); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary7427);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePrimary7438); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3510:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3510:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3510:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3510:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3511:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_rulePrimary7467); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3520:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3521:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3521:1: (lv_expression_5_0= rulePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3522:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary7488);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3540:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary7517);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_6; 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3559:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3563:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3564:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic7562);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic7572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3574:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3578:28: ( ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt44=1;
                }
                break;
            case 44:
            case 45:
                {
                alt44=2;
                }
                break;
            case RULE_LOWER:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:3: () ( (lv_value_1_0= ruleDouble ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3580:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getDoubleConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3585:2: ( (lv_value_1_0= ruleDouble ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3586:1: (lv_value_1_0= ruleDouble )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3586:1: (lv_value_1_0= ruleDouble )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3587:3: lv_value_1_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleAtomic7632);
                    lv_value_1_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3604:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3604:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3604:7: () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3604:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3605:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3610:2: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3611:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3611:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3612:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3612:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==44) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==45) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3613:3: lv_value_3_1= 'true'
                            {
                            lv_value_3_1=(Token)match(input,44,FOLLOW_44_in_ruleAtomic7669); 

                                    newLeafNode(lv_value_3_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3625:8: lv_value_3_2= 'false'
                            {
                            lv_value_3_2=(Token)match(input,45,FOLLOW_45_in_ruleAtomic7698); 

                                    newLeafNode(lv_value_3_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_3_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3641:6: ( () ( (otherlv_5= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3641:6: ( () ( (otherlv_5= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3641:7: () ( (otherlv_5= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3641:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3642:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getReferencedStoreAction_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3647:2: ( (otherlv_5= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3648:1: (otherlv_5= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3648:1: (otherlv_5= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3649:3: otherlv_5= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAtomic7751); 

                    		newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getValueStoreCrossReference_2_1_0()); 
                    	

                    }


                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleDouble"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3671:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3672:2: (iv_ruleDouble= ruleDouble EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3673:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble7793);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble7804); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3680:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3683:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3684:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3684:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3684:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7844); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3691:1: (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3692:2: kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )?
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleDouble7863); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7878); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3704:1: (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )?
                    int alt46=3;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==46) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==47) ) {
                        alt46=2;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3705:2: kw= 'e'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleDouble7897); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3711:6: (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT )
                            {
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3711:6: (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT )
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3712:2: kw= 'E' (kw= '-' )? this_INT_6= RULE_INT
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleDouble7917); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_1_2_1_0()); 
                                
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3717:1: (kw= '-' )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==41) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3718:2: kw= '-'
                                    {
                                    kw=(Token)match(input,41,FOLLOW_41_in_ruleDouble7931); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_1_2_1_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7948); 

                            		current.merge(this_INT_6);
                                
                             
                                newLeafNode(this_INT_6, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_2_1_2()); 
                                

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleFreeVariable"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3738:1: entryRuleFreeVariable returns [String current=null] : iv_ruleFreeVariable= ruleFreeVariable EOF ;
    public final String entryRuleFreeVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFreeVariable = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3739:2: (iv_ruleFreeVariable= ruleFreeVariable EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3740:2: iv_ruleFreeVariable= ruleFreeVariable EOF
            {
             newCompositeNode(grammarAccess.getFreeVariableRule()); 
            pushFollow(FOLLOW_ruleFreeVariable_in_entryRuleFreeVariable7999);
            iv_ruleFreeVariable=ruleFreeVariable();

            state._fsp--;

             current =iv_ruleFreeVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeVariable8010); 

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
    // $ANTLR end "entryRuleFreeVariable"


    // $ANTLR start "ruleFreeVariable"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3747:1: ruleFreeVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_LOWER_1= RULE_LOWER ) ;
    public final AntlrDatatypeRuleToken ruleFreeVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LOWER_1=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3750:28: ( (kw= '$' this_LOWER_1= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3751:1: (kw= '$' this_LOWER_1= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3751:1: (kw= '$' this_LOWER_1= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3752:2: kw= '$' this_LOWER_1= RULE_LOWER
            {
            kw=(Token)match(input,48,FOLLOW_48_in_ruleFreeVariable8048); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFreeVariableAccess().getDollarSignKeyword_0()); 
                
            this_LOWER_1=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleFreeVariable8063); 

            		current.merge(this_LOWER_1);
                
             
                newLeafNode(this_LOWER_1, grammarAccess.getFreeVariableAccess().getLOWERTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleFreeVariable"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\2\5\2\36\2\5\4\uffff";
    static final String DFA16_maxS =
        "\1\37\1\5\2\36\2\60\4\uffff";
    static final String DFA16_acceptS =
        "\6\uffff\1\2\1\4\1\1\1\3";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\31\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5",
            "\2\6\6\uffff\1\6\22\uffff\2\7\11\uffff\3\6\2\uffff\1\6",
            "\2\10\6\uffff\1\10\22\uffff\2\11\11\uffff\3\10\2\uffff\1\10",
            "",
            "",
            "",
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
            return "1375:2: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) otherlv_6= ':=' ( (lv_expression_7_0= ruleActionExpression ) ) ) | ( () ( (lv_name_9_0= ruleSelfReferencedStore ) ) otherlv_10= ':=' ( (lv_expression_11_0= ruleFunctionExpression ) ) ) | ( () ( (otherlv_13= RULE_LOWER ) ) otherlv_14= ':=' ( (lv_expression_15_0= ruleFunctionExpression ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_ruleModel141 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleModel163 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleModel185 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTerm283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleTerm303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTerm315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTerm327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleTerm347 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTerm359 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTerm371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTerm383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleProcess485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcess502 = new BitSet(new long[]{0x0000000004C00030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleProcess523 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProcess535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessExpression591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleProcessExpression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel746 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParallel767 = new BitSet(new long[]{0x0000000004C00030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel788 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice897 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleChoice918 = new BitSet(new long[]{0x0000000004C00030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice939 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryProcess997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimaryProcess1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimaryProcess1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_rulePrimaryProcess1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_rulePrimaryProcess1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_rulePrimaryProcess1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateProcess1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateProcess1322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_UPPER_in_rulePredicateProcess1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_entryRuleActionProcess1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionProcess1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionProcess1457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleActionProcess1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction1590 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAction1607 = new BitSet(new long[]{0x000000001600A000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction1641 = new BitSet(new long[]{0x000000001600A000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleAction1669 = new BitSet(new long[]{0x000000001200A000L});
    public static final BitSet FOLLOW_ruleEvaluations_in_ruleAction1691 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_ruleUpdates_in_ruleAction1713 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAction1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePredicate1832 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicate1853 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePredicate1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluations_in_entryRuleEvaluations1911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluations1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEvaluations1963 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionIn_in_ruleEvaluations1993 = new BitSet(new long[]{0x0000000080020020L});
    public static final BitSet FOLLOW_17_in_ruleEvaluations2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEvaluations2026 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionOut_in_ruleEvaluations2056 = new BitSet(new long[]{0x0001000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEvaluations2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdates_in_entryRuleUpdates2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdates2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUpdates2176 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleUpdates2197 = new BitSet(new long[]{0x0000000080010020L});
    public static final BitSet FOLLOW_16_in_ruleUpdates2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression2256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_rulePredicateExpression2316 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePredicateExpression2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionIn_in_entryRuleEvaluationExpressionIn2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpressionIn2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleEvaluationExpressionIn2445 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationExpressionIn2457 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2478 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleEvaluationExpressionIn2515 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationExpressionIn2527 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2548 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationExpressionIn2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionOut_in_entryRuleEvaluationExpressionOut2608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpressionOut2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_ruleEvaluationExpressionOut2677 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationExpressionOut2689 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionOut2710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationExpressionOut2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression2768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpression2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleUpdateExpression2839 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdateExpression2851 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleUpdateExpression2872 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleUpdateExpression2909 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdateExpression2921 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleUpdateExpression2942 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleUpdateExpression2980 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdateExpression2992 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_ruleUpdateExpression3013 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleUpdateExpression3050 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdateExpression3062 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_ruleUpdateExpression3083 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUpdateExpression3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore3143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfReferencedStore3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSelfReferencedStore3203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_entryRuleFunctionExpression3269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionExpression3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFunctionExpression3330 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionExpression3342 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleFunctionExpression3363 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleFunctionExpression3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFunctionExpression3405 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionExpression3417 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleFunctionExpression3438 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionExpression3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDistribution3557 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDistribution3569 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleDistribution3590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDistribution3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniform_in_entryRuleUniform3648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniform3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleUniform3708 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUniform3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression3766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOr_in_ruleActionExpression3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOr_in_entryRuleActionOr3870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOr3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAnd_in_ruleActionOr3931 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleActionOr3952 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionAnd_in_ruleActionOr3973 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleActionAnd_in_entryRuleActionAnd4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionAnd4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionEquality_in_ruleActionAnd4082 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleActionAnd4103 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionEquality_in_ruleActionAnd4124 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleActionEquality_in_entryRuleActionEquality4172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionEquality4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionComparison_in_ruleActionEquality4233 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleActionEquality4262 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_38_in_ruleActionEquality4291 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionComparison_in_ruleActionEquality4328 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleActionComparison_in_entryRuleActionComparison4376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionComparison4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionSubtraction_in_ruleActionComparison4437 = new BitSet(new long[]{0x0000018030000002L});
    public static final BitSet FOLLOW_39_in_ruleActionComparison4466 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_40_in_ruleActionComparison4495 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_29_in_ruleActionComparison4524 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_28_in_ruleActionComparison4553 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionSubtraction_in_ruleActionComparison4590 = new BitSet(new long[]{0x0000018030000002L});
    public static final BitSet FOLLOW_ruleActionSubtraction_in_entryRuleActionSubtraction4638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionSubtraction4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAddition_in_ruleActionSubtraction4699 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleActionSubtraction4720 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionAddition_in_ruleActionSubtraction4741 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleActionAddition_in_entryRuleActionAddition4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionAddition4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionMultiplication_in_ruleActionAddition4850 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleActionAddition4871 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionMultiplication_in_ruleActionAddition4892 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleActionMultiplication_in_entryRuleActionMultiplication4940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionMultiplication4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDivision_in_ruleActionMultiplication5001 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleActionMultiplication5022 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionDivision_in_ruleActionMultiplication5043 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleActionDivision_in_entryRuleActionDivision5091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDivision5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_ruleActionDivision5152 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleActionDivision5173 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_ruleActionDivision5194 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_entryRuleActionPrimary5242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionPrimary5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleActionPrimary5294 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleActionPrimary5316 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActionPrimary5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleActionPrimary5356 = new BitSet(new long[]{0x0001380000002060L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_ruleActionPrimary5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAtomic_in_ruleActionPrimary5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAtomic_in_entryRuleActionAtomic5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionAtomic5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleActionAtomic5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_ruleActionAtomic5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleActionAtomic5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleActionAtomic5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleActionAtomic5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore5725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleStore5781 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStore5798 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStore5819 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStore5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr5981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr6042 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOr6063 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr6084 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd6132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd6193 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleAnd6214 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd6235 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality6283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality6344 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleEquality6373 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_38_in_ruleEquality6402 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality6439 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison6487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleComparison6548 = new BitSet(new long[]{0x0000018030000002L});
    public static final BitSet FOLLOW_39_in_ruleComparison6577 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_40_in_ruleComparison6606 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_29_in_ruleComparison6635 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_28_in_ruleComparison6664 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleComparison6701 = new BitSet(new long[]{0x0000018030000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction6749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction6810 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleSubtraction6831 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction6852 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition6900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition6910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition6961 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAddition6982 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition7003 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication7051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication7112 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleMultiplication7133 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication7154 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision7202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleDivision7263 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleDivision7284 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleDivision7305 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary7353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrimary7405 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary7427 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimary7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrimary7467 = new BitSet(new long[]{0x0000380000002060L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary7488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic7562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleAtomic7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAtomic7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAtomic7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAtomic7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble7793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7844 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDouble7863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7878 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleDouble7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDouble7917 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_41_in_ruleDouble7931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_entryRuleFreeVariable7999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeVariable8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFreeVariable8048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleFreeVariable8063 = new BitSet(new long[]{0x0000000000000002L});

}