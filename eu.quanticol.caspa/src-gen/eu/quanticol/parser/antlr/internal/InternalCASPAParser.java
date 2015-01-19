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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UPPER", "RULE_LOWER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "'{'", "'}'", "')'", "';'", "'='", "'|'", "'+'", "'nil'", "'kill'", "'*'", "'.'", "'['", "']'", "'<'", "'>'", "':='", "'this.'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'-'", "'/'", "'!'", "'true'", "'false'", "'e'", "'E'", "'$'"
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
    public static final int T__44=44;
    public static final int T__45=45;
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

                        if ( (LA12_0==45) ) {
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1166:1: ruleEvaluationExpressionIn returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleEvaluationExpressionIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_8_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1170:28: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:1: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:1: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) )
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:2: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:2: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:3: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1172:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEvaluationExpressionInAccess().getLocalEvaluationExpressionAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1177:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1178:1: (lv_name_1_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1178:1: (lv_name_1_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1179:3: lv_name_1_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationExpressionInAccess().getNameSelfReferencedStoreParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleEvaluationExpressionIn2444);
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

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationExpressionIn2456); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationExpressionInAccess().getColonEqualsSignKeyword_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1199:1: ( (lv_expression_3_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: (lv_expression_3_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: (lv_expression_3_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1201:3: lv_expression_3_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationExpressionInAccess().getExpressionActionExpressionParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2477);
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

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationExpressionIn2489); 

                        	newLeafNode(otherlv_4, grammarAccess.getEvaluationExpressionInAccess().getSemicolonKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1222:6: ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1222:6: ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1222:7: () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1222:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1223:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEvaluationExpressionInAccess().getGlobalEvaluationExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1228:2: ( (otherlv_6= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1229:1: (otherlv_6= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1229:1: (otherlv_6= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1230:3: otherlv_6= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationExpressionInRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleEvaluationExpressionIn2526); 

                    		newLeafNode(otherlv_6, grammarAccess.getEvaluationExpressionInAccess().getNameStoreCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationExpressionIn2538); 

                        	newLeafNode(otherlv_7, grammarAccess.getEvaluationExpressionInAccess().getColonEqualsSignKeyword_1_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1245:1: ( (lv_expression_8_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1246:1: (lv_expression_8_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1246:1: (lv_expression_8_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1247:3: lv_expression_8_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationExpressionInAccess().getExpressionActionExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2559);
                    lv_expression_8_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvaluationExpressionInRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_8_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationExpressionIn2571); 

                        	newLeafNode(otherlv_9, grammarAccess.getEvaluationExpressionInAccess().getSemicolonKeyword_1_4());
                        

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
    // $ANTLR end "ruleEvaluationExpressionIn"


    // $ANTLR start "entryRuleEvaluationExpressionOut"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1278:1: entryRuleEvaluationExpressionOut returns [EObject current=null] : iv_ruleEvaluationExpressionOut= ruleEvaluationExpressionOut EOF ;
    public final EObject entryRuleEvaluationExpressionOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationExpressionOut = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1282:2: (iv_ruleEvaluationExpressionOut= ruleEvaluationExpressionOut EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1283:2: iv_ruleEvaluationExpressionOut= ruleEvaluationExpressionOut EOF
            {
             newCompositeNode(grammarAccess.getEvaluationExpressionOutRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpressionOut_in_entryRuleEvaluationExpressionOut2618);
            iv_ruleEvaluationExpressionOut=ruleEvaluationExpressionOut();

            state._fsp--;

             current =iv_ruleEvaluationExpressionOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpressionOut2628); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1293:1: ruleEvaluationExpressionOut returns [EObject current=null] : ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleEvaluationExpressionOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1297:28: ( ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1298:1: ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1298:1: ( () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1298:2: () ( (lv_name_1_0= ruleFreeVariable ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1298:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1299:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvaluationExpressionOutAccess().getFreeEvaluationExpressionAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1304:2: ( (lv_name_1_0= ruleFreeVariable ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1305:1: (lv_name_1_0= ruleFreeVariable )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1305:1: (lv_name_1_0= ruleFreeVariable )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1306:3: lv_name_1_0= ruleFreeVariable
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationExpressionOutAccess().getNameFreeVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFreeVariable_in_ruleEvaluationExpressionOut2687);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationExpressionOut2699); 

                	newLeafNode(otherlv_2, grammarAccess.getEvaluationExpressionOutAccess().getColonEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1326:1: ( (lv_expression_3_0= ruleActionExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1327:1: (lv_expression_3_0= ruleActionExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1327:1: (lv_expression_3_0= ruleActionExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1328:3: lv_expression_3_0= ruleActionExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationExpressionOutAccess().getExpressionActionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionOut2720);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationExpressionOut2732); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1359:1: entryRuleUpdateExpression returns [EObject current=null] : iv_ruleUpdateExpression= ruleUpdateExpression EOF ;
    public final EObject entryRuleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1363:2: (iv_ruleUpdateExpression= ruleUpdateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1364:2: iv_ruleUpdateExpression= ruleUpdateExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression2778);
            iv_ruleUpdateExpression=ruleUpdateExpression();

            state._fsp--;

             current =iv_ruleUpdateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpression2788); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1374:1: ruleUpdateExpression returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleUpdateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_8_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1378:28: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1379:1: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1379:1: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' ) | ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_LOWER) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1379:2: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1379:2: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1379:3: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleActionExpression ) ) otherlv_4= ';'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1379:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1380:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateExpressionAccess().getLocalUpdateExpressionAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1385:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1386:1: (lv_name_1_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1386:1: (lv_name_1_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:3: lv_name_1_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getNameSelfReferencedStoreParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleUpdateExpression2848);
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

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleUpdateExpression2860); 

                        	newLeafNode(otherlv_2, grammarAccess.getUpdateExpressionAccess().getColonEqualsSignKeyword_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1407:1: ( (lv_expression_3_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1408:1: (lv_expression_3_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1408:1: (lv_expression_3_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1409:3: lv_expression_3_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getExpressionActionExpressionParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleUpdateExpression2881);
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

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleUpdateExpression2893); 

                        	newLeafNode(otherlv_4, grammarAccess.getUpdateExpressionAccess().getSemicolonKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:6: ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:6: ( () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:7: () ( (otherlv_6= RULE_LOWER ) ) otherlv_7= ':=' ( (lv_expression_8_0= ruleActionExpression ) ) otherlv_9= ';'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1431:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateExpressionAccess().getGlobalUpdateExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1436:2: ( (otherlv_6= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:1: (otherlv_6= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:1: (otherlv_6= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1438:3: otherlv_6= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateExpressionRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleUpdateExpression2930); 

                    		newLeafNode(otherlv_6, grammarAccess.getUpdateExpressionAccess().getNameStoreCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleUpdateExpression2942); 

                        	newLeafNode(otherlv_7, grammarAccess.getUpdateExpressionAccess().getColonEqualsSignKeyword_1_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1453:1: ( (lv_expression_8_0= ruleActionExpression ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1454:1: (lv_expression_8_0= ruleActionExpression )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1454:1: (lv_expression_8_0= ruleActionExpression )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1455:3: lv_expression_8_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateExpressionAccess().getExpressionActionExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleUpdateExpression2963);
                    lv_expression_8_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_8_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleUpdateExpression2975); 

                        	newLeafNode(otherlv_9, grammarAccess.getUpdateExpressionAccess().getSemicolonKeyword_1_4());
                        

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
    // $ANTLR end "ruleUpdateExpression"


    // $ANTLR start "entryRuleSelfReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1486:1: entryRuleSelfReferencedStore returns [EObject current=null] : iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF ;
    public final EObject entryRuleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferencedStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1490:2: (iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1491:2: iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF
            {
             newCompositeNode(grammarAccess.getSelfReferencedStoreRule()); 
            pushFollow(FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore3022);
            iv_ruleSelfReferencedStore=ruleSelfReferencedStore();

            state._fsp--;

             current =iv_ruleSelfReferencedStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfReferencedStore3032); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1501:1: ruleSelfReferencedStore returns [EObject current=null] : ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) ;
    public final EObject ruleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1505:28: ( ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1506:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1506:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1506:2: () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1506:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1507:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelfReferencedStoreAccess().getSelfReferencedStoreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSelfReferencedStore3082); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfReferencedStoreAccess().getThisKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1516:1: ( (otherlv_2= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1517:1: (otherlv_2= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1517:1: (otherlv_2= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1518:3: otherlv_2= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfReferencedStoreRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore3102); 

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


    // $ANTLR start "entryRuleActionExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1540:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1544:2: (iv_ruleActionExpression= ruleActionExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1545:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression3148);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression3158); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1555:1: ruleActionExpression returns [EObject current=null] : this_ActionOr_0= ruleActionOr ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ActionOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1559:28: (this_ActionOr_0= ruleActionOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1561:5: this_ActionOr_0= ruleActionOr
            {
             
                    newCompositeNode(grammarAccess.getActionExpressionAccess().getActionOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleActionOr_in_ruleActionExpression3208);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1580:1: entryRuleActionOr returns [EObject current=null] : iv_ruleActionOr= ruleActionOr EOF ;
    public final EObject entryRuleActionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1584:2: (iv_ruleActionOr= ruleActionOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1585:2: iv_ruleActionOr= ruleActionOr EOF
            {
             newCompositeNode(grammarAccess.getActionOrRule()); 
            pushFollow(FOLLOW_ruleActionOr_in_entryRuleActionOr3252);
            iv_ruleActionOr=ruleActionOr();

            state._fsp--;

             current =iv_ruleActionOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOr3262); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1595:1: ruleActionOr returns [EObject current=null] : (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* ) ;
    public final EObject ruleActionOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1599:28: ( (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1600:1: (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1600:1: (this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1601:5: this_ActionAnd_0= ruleActionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionOrAccess().getActionAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionAnd_in_ruleActionOr3313);
            this_ActionAnd_0=ruleActionAnd();

            state._fsp--;

             
                    current = this_ActionAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1609:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1609:2: () otherlv_2= '||' ( (lv_right_3_0= ruleActionAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1609:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1610:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionOrAccess().getActionOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleActionOr3334); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1619:1: ( (lv_right_3_0= ruleActionAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1620:1: (lv_right_3_0= ruleActionAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1620:1: (lv_right_3_0= ruleActionAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1621:3: lv_right_3_0= ruleActionAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionOrAccess().getRightActionAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionAnd_in_ruleActionOr3355);
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
            	    break loop17;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1648:1: entryRuleActionAnd returns [EObject current=null] : iv_ruleActionAnd= ruleActionAnd EOF ;
    public final EObject entryRuleActionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1652:2: (iv_ruleActionAnd= ruleActionAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1653:2: iv_ruleActionAnd= ruleActionAnd EOF
            {
             newCompositeNode(grammarAccess.getActionAndRule()); 
            pushFollow(FOLLOW_ruleActionAnd_in_entryRuleActionAnd3403);
            iv_ruleActionAnd=ruleActionAnd();

            state._fsp--;

             current =iv_ruleActionAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionAnd3413); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1663:1: ruleActionAnd returns [EObject current=null] : (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* ) ;
    public final EObject ruleActionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1667:28: ( (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:1: (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:1: (this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1669:5: this_ActionEquality_0= ruleActionEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionAndAccess().getActionEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionEquality_in_ruleActionAnd3464);
            this_ActionEquality_0=ruleActionEquality();

            state._fsp--;

             
                    current = this_ActionEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1677:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1677:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleActionEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1677:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1678:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionAndAccess().getActionAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleActionAnd3485); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1687:1: ( (lv_right_3_0= ruleActionEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1688:1: (lv_right_3_0= ruleActionEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1688:1: (lv_right_3_0= ruleActionEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1689:3: lv_right_3_0= ruleActionEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAndAccess().getRightActionEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionEquality_in_ruleActionAnd3506);
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
            	    break loop18;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1716:1: entryRuleActionEquality returns [EObject current=null] : iv_ruleActionEquality= ruleActionEquality EOF ;
    public final EObject entryRuleActionEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1720:2: (iv_ruleActionEquality= ruleActionEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1721:2: iv_ruleActionEquality= ruleActionEquality EOF
            {
             newCompositeNode(grammarAccess.getActionEqualityRule()); 
            pushFollow(FOLLOW_ruleActionEquality_in_entryRuleActionEquality3554);
            iv_ruleActionEquality=ruleActionEquality();

            state._fsp--;

             current =iv_ruleActionEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionEquality3564); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1731:1: ruleActionEquality returns [EObject current=null] : (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* ) ;
    public final EObject ruleActionEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ActionComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1735:28: ( (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1736:1: (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1736:1: (this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1737:5: this_ActionComparison_0= ruleActionComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionEqualityAccess().getActionComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionComparison_in_ruleActionEquality3615);
            this_ActionComparison_0=ruleActionComparison();

            state._fsp--;

             
                    current = this_ActionComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleActionComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1745:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1746:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionEqualityAccess().getActionEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1751:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1752:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1752:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1753:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1753:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==34) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==35) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1754:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleActionEquality3644); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getActionEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1766:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleActionEquality3673); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1781:2: ( (lv_right_3_0= ruleActionComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1782:1: (lv_right_3_0= ruleActionComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1782:1: (lv_right_3_0= ruleActionComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1783:3: lv_right_3_0= ruleActionComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionEqualityAccess().getRightActionComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionComparison_in_ruleActionEquality3710);
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
    // $ANTLR end "ruleActionEquality"


    // $ANTLR start "entryRuleActionComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1810:1: entryRuleActionComparison returns [EObject current=null] : iv_ruleActionComparison= ruleActionComparison EOF ;
    public final EObject entryRuleActionComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1814:2: (iv_ruleActionComparison= ruleActionComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1815:2: iv_ruleActionComparison= ruleActionComparison EOF
            {
             newCompositeNode(grammarAccess.getActionComparisonRule()); 
            pushFollow(FOLLOW_ruleActionComparison_in_entryRuleActionComparison3758);
            iv_ruleActionComparison=ruleActionComparison();

            state._fsp--;

             current =iv_ruleActionComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionComparison3768); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1825:1: ruleActionComparison returns [EObject current=null] : (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1829:28: ( (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1830:1: (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1830:1: (this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1831:5: this_ActionSubtraction_0= ruleActionSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionComparisonAccess().getActionSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionSubtraction_in_ruleActionComparison3819);
            this_ActionSubtraction_0=ruleActionSubtraction();

            state._fsp--;

             
                    current = this_ActionSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1839:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=28 && LA22_0<=29)||(LA22_0>=36 && LA22_0<=37)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1839:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleActionSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1839:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1840:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionComparisonAccess().getActionComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1845:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1846:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1846:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1847:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1847:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1848:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_36_in_ruleActionComparison3848); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getActionComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1860:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_37_in_ruleActionComparison3877); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getActionComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1872:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,29,FOLLOW_29_in_ruleActionComparison3906); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getActionComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActionComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1884:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleActionComparison3935); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1899:2: ( (lv_right_3_0= ruleActionSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1900:1: (lv_right_3_0= ruleActionSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1900:1: (lv_right_3_0= ruleActionSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1901:3: lv_right_3_0= ruleActionSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionComparisonAccess().getRightActionSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionSubtraction_in_ruleActionComparison3972);
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
    // $ANTLR end "ruleActionComparison"


    // $ANTLR start "entryRuleActionSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1928:1: entryRuleActionSubtraction returns [EObject current=null] : iv_ruleActionSubtraction= ruleActionSubtraction EOF ;
    public final EObject entryRuleActionSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1932:2: (iv_ruleActionSubtraction= ruleActionSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1933:2: iv_ruleActionSubtraction= ruleActionSubtraction EOF
            {
             newCompositeNode(grammarAccess.getActionSubtractionRule()); 
            pushFollow(FOLLOW_ruleActionSubtraction_in_entryRuleActionSubtraction4020);
            iv_ruleActionSubtraction=ruleActionSubtraction();

            state._fsp--;

             current =iv_ruleActionSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionSubtraction4030); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1943:1: ruleActionSubtraction returns [EObject current=null] : (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* ) ;
    public final EObject ruleActionSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1947:28: ( (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1948:1: (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1948:1: (this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1949:5: this_ActionAddition_0= ruleActionAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionSubtractionAccess().getActionAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionAddition_in_ruleActionSubtraction4081);
            this_ActionAddition_0=ruleActionAddition();

            state._fsp--;

             
                    current = this_ActionAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1957:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1957:2: () otherlv_2= '-' ( (lv_right_3_0= ruleActionAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1957:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1958:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionSubtractionAccess().getActionSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleActionSubtraction4102); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1967:1: ( (lv_right_3_0= ruleActionAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1968:1: (lv_right_3_0= ruleActionAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1968:1: (lv_right_3_0= ruleActionAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:3: lv_right_3_0= ruleActionAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionSubtractionAccess().getRightActionAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionAddition_in_ruleActionSubtraction4123);
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
            	    break loop23;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1996:1: entryRuleActionAddition returns [EObject current=null] : iv_ruleActionAddition= ruleActionAddition EOF ;
    public final EObject entryRuleActionAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2000:2: (iv_ruleActionAddition= ruleActionAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2001:2: iv_ruleActionAddition= ruleActionAddition EOF
            {
             newCompositeNode(grammarAccess.getActionAdditionRule()); 
            pushFollow(FOLLOW_ruleActionAddition_in_entryRuleActionAddition4171);
            iv_ruleActionAddition=ruleActionAddition();

            state._fsp--;

             current =iv_ruleActionAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionAddition4181); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2011:1: ruleActionAddition returns [EObject current=null] : (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* ) ;
    public final EObject ruleActionAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2015:28: ( (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2016:1: (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2016:1: (this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2017:5: this_ActionMultiplication_0= ruleActionMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionAdditionAccess().getActionMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionMultiplication_in_ruleActionAddition4232);
            this_ActionMultiplication_0=ruleActionMultiplication();

            state._fsp--;

             
                    current = this_ActionMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2025:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2025:2: () otherlv_2= '+' ( (lv_right_3_0= ruleActionMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2025:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2026:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionAdditionAccess().getActionPluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleActionAddition4253); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2035:1: ( (lv_right_3_0= ruleActionMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2036:1: (lv_right_3_0= ruleActionMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2036:1: (lv_right_3_0= ruleActionMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2037:3: lv_right_3_0= ruleActionMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAdditionAccess().getRightActionMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionMultiplication_in_ruleActionAddition4274);
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
    // $ANTLR end "ruleActionAddition"


    // $ANTLR start "entryRuleActionMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2064:1: entryRuleActionMultiplication returns [EObject current=null] : iv_ruleActionMultiplication= ruleActionMultiplication EOF ;
    public final EObject entryRuleActionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2068:2: (iv_ruleActionMultiplication= ruleActionMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2069:2: iv_ruleActionMultiplication= ruleActionMultiplication EOF
            {
             newCompositeNode(grammarAccess.getActionMultiplicationRule()); 
            pushFollow(FOLLOW_ruleActionMultiplication_in_entryRuleActionMultiplication4322);
            iv_ruleActionMultiplication=ruleActionMultiplication();

            state._fsp--;

             current =iv_ruleActionMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionMultiplication4332); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2079:1: ruleActionMultiplication returns [EObject current=null] : (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* ) ;
    public final EObject ruleActionMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2083:28: ( (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2084:1: (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2084:1: (this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2085:5: this_ActionDivision_0= ruleActionDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionMultiplicationAccess().getActionDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionDivision_in_ruleActionMultiplication4383);
            this_ActionDivision_0=ruleActionDivision();

            state._fsp--;

             
                    current = this_ActionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:2: () otherlv_2= '*' ( (lv_right_3_0= ruleActionDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2094:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionMultiplicationAccess().getActionMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleActionMultiplication4404); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2103:1: ( (lv_right_3_0= ruleActionDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2104:1: (lv_right_3_0= ruleActionDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2104:1: (lv_right_3_0= ruleActionDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2105:3: lv_right_3_0= ruleActionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionMultiplicationAccess().getRightActionDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionDivision_in_ruleActionMultiplication4425);
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
    // $ANTLR end "ruleActionMultiplication"


    // $ANTLR start "entryRuleActionDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2132:1: entryRuleActionDivision returns [EObject current=null] : iv_ruleActionDivision= ruleActionDivision EOF ;
    public final EObject entryRuleActionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2136:2: (iv_ruleActionDivision= ruleActionDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2137:2: iv_ruleActionDivision= ruleActionDivision EOF
            {
             newCompositeNode(grammarAccess.getActionDivisionRule()); 
            pushFollow(FOLLOW_ruleActionDivision_in_entryRuleActionDivision4473);
            iv_ruleActionDivision=ruleActionDivision();

            state._fsp--;

             current =iv_ruleActionDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDivision4483); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2147:1: ruleActionDivision returns [EObject current=null] : (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* ) ;
    public final EObject ruleActionDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActionPrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2151:28: ( (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2152:1: (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2152:1: (this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2153:5: this_ActionPrimary_0= ruleActionPrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getActionDivisionAccess().getActionPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleActionPrimary_in_ruleActionDivision4534);
            this_ActionPrimary_0=ruleActionPrimary();

            state._fsp--;

             
                    current = this_ActionPrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:1: ( () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:2: () otherlv_2= '/' ( (lv_right_3_0= ruleActionPrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2162:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getActionDivisionAccess().getActionDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleActionDivision4555); 

            	        	newLeafNode(otherlv_2, grammarAccess.getActionDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2171:1: ( (lv_right_3_0= ruleActionPrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2172:1: (lv_right_3_0= ruleActionPrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2172:1: (lv_right_3_0= ruleActionPrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2173:3: lv_right_3_0= ruleActionPrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionDivisionAccess().getRightActionPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActionPrimary_in_ruleActionDivision4576);
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
    // $ANTLR end "ruleActionDivision"


    // $ANTLR start "entryRuleActionPrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2200:1: entryRuleActionPrimary returns [EObject current=null] : iv_ruleActionPrimary= ruleActionPrimary EOF ;
    public final EObject entryRuleActionPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionPrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2204:2: (iv_ruleActionPrimary= ruleActionPrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2205:2: iv_ruleActionPrimary= ruleActionPrimary EOF
            {
             newCompositeNode(grammarAccess.getActionPrimaryRule()); 
            pushFollow(FOLLOW_ruleActionPrimary_in_entryRuleActionPrimary4624);
            iv_ruleActionPrimary=ruleActionPrimary();

            state._fsp--;

             current =iv_ruleActionPrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionPrimary4634); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2215:1: ruleActionPrimary returns [EObject current=null] : ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2219:28: ( ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:1: ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:1: ( (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) ) | this_ActionAtomic_6= ruleActionAtomic )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt27=1;
                }
                break;
            case 40:
                {
                alt27=2;
                }
                break;
            case RULE_LOWER:
            case RULE_INT:
            case 41:
            case 42:
            case 45:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:2: (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:2: (otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:4: otherlv_0= '(' this_ActionExpression_1= ruleActionExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleActionPrimary4676); 

                        	newLeafNode(otherlv_0, grammarAccess.getActionPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getActionPrimaryAccess().getActionExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleActionPrimary4698);
                    this_ActionExpression_1=ruleActionExpression();

                    state._fsp--;

                     
                            current = this_ActionExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleActionPrimary4709); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:6: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:6: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:7: () otherlv_4= '!' ( (lv_expression_5_0= ruleActionPrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2239:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionPrimaryAccess().getActionNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleActionPrimary4738); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2248:1: ( (lv_expression_5_0= ruleActionPrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2249:1: (lv_expression_5_0= ruleActionPrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2249:1: (lv_expression_5_0= ruleActionPrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2250:3: lv_expression_5_0= ruleActionPrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionPrimaryAccess().getExpressionActionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionPrimary_in_ruleActionPrimary4759);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2268:5: this_ActionAtomic_6= ruleActionAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getActionPrimaryAccess().getActionAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionAtomic_in_ruleActionPrimary4788);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2287:1: entryRuleActionAtomic returns [EObject current=null] : iv_ruleActionAtomic= ruleActionAtomic EOF ;
    public final EObject entryRuleActionAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2291:2: (iv_ruleActionAtomic= ruleActionAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2292:2: iv_ruleActionAtomic= ruleActionAtomic EOF
            {
             newCompositeNode(grammarAccess.getActionAtomicRule()); 
            pushFollow(FOLLOW_ruleActionAtomic_in_entryRuleActionAtomic4833);
            iv_ruleActionAtomic=ruleActionAtomic();

            state._fsp--;

             current =iv_ruleActionAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionAtomic4843); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2302:1: ruleActionAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2306:28: ( ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( (lv_value_3_0= ruleFreeVariable ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_LOWER ) ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 41:
            case 42:
                {
                alt29=3;
                }
                break;
            case RULE_LOWER:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:3: () ( (lv_value_1_0= ruleDouble ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2308:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getDoubleConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2313:2: ( (lv_value_1_0= ruleDouble ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2314:1: (lv_value_1_0= ruleDouble )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2314:1: (lv_value_1_0= ruleDouble )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2315:3: lv_value_1_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAtomicAccess().getValueDoubleParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleActionAtomic4903);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2332:6: ( () ( (lv_value_3_0= ruleFreeVariable ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2332:6: ( () ( (lv_value_3_0= ruleFreeVariable ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2332:7: () ( (lv_value_3_0= ruleFreeVariable ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2332:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2333:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getFreeVariableAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2338:2: ( (lv_value_3_0= ruleFreeVariable ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2339:1: (lv_value_3_0= ruleFreeVariable )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2339:1: (lv_value_3_0= ruleFreeVariable )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2340:3: lv_value_3_0= ruleFreeVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAtomicAccess().getValueFreeVariableParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFreeVariable_in_ruleActionAtomic4941);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2357:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2357:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2357:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2357:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2358:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2363:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2364:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2364:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2365:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2365:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==41) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==42) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2366:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,41,FOLLOW_41_in_ruleActionAtomic4978); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getActionAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2378:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,42,FOLLOW_42_in_ruleActionAtomic5007); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2394:6: ( () ( (otherlv_7= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2394:6: ( () ( (otherlv_7= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2394:7: () ( (otherlv_7= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2394:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2395:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAtomicAccess().getReferencedStoreAction_3_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2400:2: ( (otherlv_7= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2401:1: (otherlv_7= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2401:1: (otherlv_7= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2402:3: otherlv_7= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleActionAtomic5060); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2424:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2428:2: (iv_ruleStore= ruleStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2429:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore5107);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore5117); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2439:1: ruleStore returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2443:28: ( ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2444:1: ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2444:1: ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2444:2: ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2444:2: ( (lv_name_0_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2445:1: (lv_name_0_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2445:1: (lv_name_0_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2446:3: lv_name_0_0= RULE_LOWER
            {
            lv_name_0_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleStore5163); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStore5180); 

                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2466:1: ( (lv_value_2_0= ruleExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2467:1: (lv_value_2_0= ruleExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2467:1: (lv_value_2_0= ruleExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2468:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getStoreAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleStore5201);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleStore5213); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2499:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2503:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2504:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5259);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5269); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2514:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2518:28: (this_Or_0= ruleOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2520:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression5319);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2539:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2543:2: (iv_ruleOr= ruleOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2544:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr5363);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr5373); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2554:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2558:28: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2559:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2559:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2560:5: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr5424);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2568:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2568:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2568:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2569:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleOr5445); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2578:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2579:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2579:1: (lv_right_3_0= ruleAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2580:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr5466);
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
            	    break loop30;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2607:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2611:2: (iv_ruleAnd= ruleAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2612:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd5514);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd5524); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2622:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2626:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2627:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2627:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2628:5: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd5575);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2636:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2636:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2636:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2637:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAnd5596); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2646:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2647:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2647:1: (lv_right_3_0= ruleEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2648:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd5617);
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
            	    break loop31;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2675:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2679:2: (iv_ruleEquality= ruleEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2680:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality5665);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality5675); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2690:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2694:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2695:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2695:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2696:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality5726);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2704:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=34 && LA33_0<=35)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2704:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2704:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2705:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2710:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2711:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2711:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2712:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2712:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==34) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==35) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2713:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleEquality5755); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2725:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleEquality5784); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2740:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2741:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2741:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2742:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality5821);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2769:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2773:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2774:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison5869);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison5879); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2784:1: ruleComparison returns [EObject current=null] : (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2788:28: ( (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2789:1: (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2789:1: (this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2790:5: this_Subtraction_0= ruleSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSubtraction_in_ruleComparison5930);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;

             
                    current = this_Subtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2798:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=28 && LA35_0<=29)||(LA35_0>=36 && LA35_0<=37)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2798:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2798:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2799:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2804:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2805:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2805:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2806:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2806:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2807:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_36_in_ruleComparison5959); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2819:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_37_in_ruleComparison5988); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2831:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,29,FOLLOW_29_in_ruleComparison6017); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2843:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleComparison6046); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2858:2: ( (lv_right_3_0= ruleSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2859:1: (lv_right_3_0= ruleSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2859:1: (lv_right_3_0= ruleSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2860:3: lv_right_3_0= ruleSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubtraction_in_ruleComparison6083);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2887:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2891:2: (iv_ruleSubtraction= ruleSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2892:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_ruleSubtraction_in_entryRuleSubtraction6131);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtraction6141); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2902:1: ruleSubtraction returns [EObject current=null] : (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2906:28: ( (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2907:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2907:1: (this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2908:5: this_Addition_0= ruleAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSubtractionAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction6192);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2916:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2916:2: () otherlv_2= '-' ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2916:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2917:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getSubtractionAccess().getSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSubtraction6213); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2926:1: ( (lv_right_3_0= ruleAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2927:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2927:1: (lv_right_3_0= ruleAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2928:3: lv_right_3_0= ruleAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddition_in_ruleSubtraction6234);
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
            	    break loop36;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2955:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2959:2: (iv_ruleAddition= ruleAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2960:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition6282);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition6292); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2970:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2974:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2975:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2975:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2976:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition6343);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2984:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2984:2: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2984:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2985:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionAccess().getPluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAddition6364); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2994:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2995:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2995:1: (lv_right_3_0= ruleMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2996:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition6385);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3023:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3027:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3028:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication6433);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication6443); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3038:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3042:28: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3043:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3043:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3044:5: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication6494);
            this_Division_0=ruleDivision();

            state._fsp--;

             
                    current = this_Division_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3052:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==24) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3052:2: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3052:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3053:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMultiplication6515); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:1: ( (lv_right_3_0= ruleDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3063:1: (lv_right_3_0= ruleDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3063:1: (lv_right_3_0= ruleDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3064:3: lv_right_3_0= ruleDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication6536);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3091:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3095:2: (iv_ruleDivision= ruleDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3096:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision6584);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision6594); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3106:1: ruleDivision returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3110:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:1: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:1: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3112:5: this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleDivision6645);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3120:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3120:2: () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3120:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3121:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDivisionAccess().getDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleDivision6666); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3130:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3131:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3131:1: (lv_right_3_0= rulePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3132:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleDivision6687);
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3159:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3163:2: (iv_rulePrimary= rulePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3164:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary6735);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary6745); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3174:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3178:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt40=1;
                }
                break;
            case 40:
                {
                alt40=2;
                }
                break;
            case RULE_LOWER:
            case RULE_INT:
            case 41:
            case 42:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePrimary6787); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary6809);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePrimary6820); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3197:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3197:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3197:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3197:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3198:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulePrimary6849); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3207:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3208:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3208:1: (lv_expression_5_0= rulePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3209:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary6870);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3227:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary6899);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3246:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3250:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3251:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic6944);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic6954); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3261:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3265:28: ( ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3266:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3266:1: ( ( () ( (lv_value_1_0= ruleDouble ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | ( () ( (otherlv_5= RULE_LOWER ) ) ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt42=1;
                }
                break;
            case 41:
            case 42:
                {
                alt42=2;
                }
                break;
            case RULE_LOWER:
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3266:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3266:2: ( () ( (lv_value_1_0= ruleDouble ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3266:3: () ( (lv_value_1_0= ruleDouble ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3266:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3267:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getDoubleConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3272:2: ( (lv_value_1_0= ruleDouble ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3273:1: (lv_value_1_0= ruleDouble )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3273:1: (lv_value_1_0= ruleDouble )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3274:3: lv_value_1_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleAtomic7014);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3291:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3291:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3291:7: () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3291:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3292:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:2: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3298:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3298:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3299:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3299:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==41) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==42) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3300:3: lv_value_3_1= 'true'
                            {
                            lv_value_3_1=(Token)match(input,41,FOLLOW_41_in_ruleAtomic7051); 

                                    newLeafNode(lv_value_3_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3312:8: lv_value_3_2= 'false'
                            {
                            lv_value_3_2=(Token)match(input,42,FOLLOW_42_in_ruleAtomic7080); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3328:6: ( () ( (otherlv_5= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3328:6: ( () ( (otherlv_5= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3328:7: () ( (otherlv_5= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3328:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3329:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getReferencedStoreAction_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3334:2: ( (otherlv_5= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3335:1: (otherlv_5= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3335:1: (otherlv_5= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3336:3: otherlv_5= RULE_LOWER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAtomic7133); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3358:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3359:2: (iv_ruleDouble= ruleDouble EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3360:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble7175);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble7186); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3367:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3370:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3371:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3371:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3371:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7226); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3378:1: (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3379:2: kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )?
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleDouble7245); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7260); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3391:1: (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )?
                    int alt44=3;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==43) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==44) ) {
                        alt44=2;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3392:2: kw= 'e'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleDouble7279); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3398:6: (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT )
                            {
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3398:6: (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT )
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3399:2: kw= 'E' (kw= '-' )? this_INT_6= RULE_INT
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleDouble7299); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_1_2_1_0()); 
                                
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3404:1: (kw= '-' )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==38) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3405:2: kw= '-'
                                    {
                                    kw=(Token)match(input,38,FOLLOW_38_in_ruleDouble7313); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_1_2_1_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7330); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3425:1: entryRuleFreeVariable returns [String current=null] : iv_ruleFreeVariable= ruleFreeVariable EOF ;
    public final String entryRuleFreeVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFreeVariable = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3426:2: (iv_ruleFreeVariable= ruleFreeVariable EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3427:2: iv_ruleFreeVariable= ruleFreeVariable EOF
            {
             newCompositeNode(grammarAccess.getFreeVariableRule()); 
            pushFollow(FOLLOW_ruleFreeVariable_in_entryRuleFreeVariable7381);
            iv_ruleFreeVariable=ruleFreeVariable();

            state._fsp--;

             current =iv_ruleFreeVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeVariable7392); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3434:1: ruleFreeVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_LOWER_1= RULE_LOWER ) ;
    public final AntlrDatatypeRuleToken ruleFreeVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LOWER_1=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3437:28: ( (kw= '$' this_LOWER_1= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3438:1: (kw= '$' this_LOWER_1= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3438:1: (kw= '$' this_LOWER_1= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3439:2: kw= '$' this_LOWER_1= RULE_LOWER
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleFreeVariable7430); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFreeVariableAccess().getDollarSignKeyword_0()); 
                
            this_LOWER_1=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleFreeVariable7445); 

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
    public static final BitSet FOLLOW_26_in_rulePredicate1832 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicate1853 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePredicate1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluations_in_entryRuleEvaluations1911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluations1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEvaluations1963 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionIn_in_ruleEvaluations1993 = new BitSet(new long[]{0x0000000080020020L});
    public static final BitSet FOLLOW_17_in_ruleEvaluations2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEvaluations2026 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionOut_in_ruleEvaluations2056 = new BitSet(new long[]{0x0000200020000000L});
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
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleEvaluationExpressionIn2444 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationExpressionIn2456 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2477 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationExpressionIn2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleEvaluationExpressionIn2526 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationExpressionIn2538 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionIn2559 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationExpressionIn2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpressionOut_in_entryRuleEvaluationExpressionOut2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpressionOut2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_ruleEvaluationExpressionOut2687 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationExpressionOut2699 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleEvaluationExpressionOut2720 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationExpressionOut2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression2778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpression2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleUpdateExpression2848 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdateExpression2860 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleUpdateExpression2881 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUpdateExpression2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleUpdateExpression2930 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdateExpression2942 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleUpdateExpression2963 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUpdateExpression2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore3022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfReferencedStore3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSelfReferencedStore3082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOr_in_ruleActionExpression3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOr_in_entryRuleActionOr3252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOr3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAnd_in_ruleActionOr3313 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleActionOr3334 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionAnd_in_ruleActionOr3355 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleActionAnd_in_entryRuleActionAnd3403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionAnd3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionEquality_in_ruleActionAnd3464 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleActionAnd3485 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionEquality_in_ruleActionAnd3506 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleActionEquality_in_entryRuleActionEquality3554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionEquality3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionComparison_in_ruleActionEquality3615 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleActionEquality3644 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_35_in_ruleActionEquality3673 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionComparison_in_ruleActionEquality3710 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleActionComparison_in_entryRuleActionComparison3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionComparison3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionSubtraction_in_ruleActionComparison3819 = new BitSet(new long[]{0x0000003030000002L});
    public static final BitSet FOLLOW_36_in_ruleActionComparison3848 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_37_in_ruleActionComparison3877 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_29_in_ruleActionComparison3906 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_28_in_ruleActionComparison3935 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionSubtraction_in_ruleActionComparison3972 = new BitSet(new long[]{0x0000003030000002L});
    public static final BitSet FOLLOW_ruleActionSubtraction_in_entryRuleActionSubtraction4020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionSubtraction4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAddition_in_ruleActionSubtraction4081 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleActionSubtraction4102 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionAddition_in_ruleActionSubtraction4123 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleActionAddition_in_entryRuleActionAddition4171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionAddition4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionMultiplication_in_ruleActionAddition4232 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleActionAddition4253 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionMultiplication_in_ruleActionAddition4274 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleActionMultiplication_in_entryRuleActionMultiplication4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionMultiplication4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDivision_in_ruleActionMultiplication4383 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleActionMultiplication4404 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionDivision_in_ruleActionMultiplication4425 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleActionDivision_in_entryRuleActionDivision4473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDivision4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_ruleActionDivision4534 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleActionDivision4555 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_ruleActionDivision4576 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_entryRuleActionPrimary4624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionPrimary4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleActionPrimary4676 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleActionPrimary4698 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActionPrimary4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleActionPrimary4738 = new BitSet(new long[]{0x0000270000002060L});
    public static final BitSet FOLLOW_ruleActionPrimary_in_ruleActionPrimary4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAtomic_in_ruleActionPrimary4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionAtomic_in_entryRuleActionAtomic4833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionAtomic4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleActionAtomic4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_ruleActionAtomic4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleActionAtomic4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleActionAtomic5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleActionAtomic5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore5107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleStore5163 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStore5180 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStore5201 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStore5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr5363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr5424 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleOr5445 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr5466 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd5514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd5575 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAnd5596 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd5617 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality5665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality5726 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleEquality5755 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_35_in_ruleEquality5784 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality5821 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison5869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleComparison5930 = new BitSet(new long[]{0x0000003030000002L});
    public static final BitSet FOLLOW_36_in_ruleComparison5959 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_37_in_ruleComparison5988 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_29_in_ruleComparison6017 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_28_in_ruleComparison6046 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleSubtraction_in_ruleComparison6083 = new BitSet(new long[]{0x0000003030000002L});
    public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction6131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction6192 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleSubtraction6213 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleSubtraction6234 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition6282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition6343 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAddition6364 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition6385 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication6433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication6494 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleMultiplication6515 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication6536 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision6584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleDivision6645 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleDivision6666 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleDivision6687 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary6735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrimary6787 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary6809 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimary6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimary6849 = new BitSet(new long[]{0x0000070000002060L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic6944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleAtomic7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAtomic7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAtomic7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAtomic7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble7175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7226 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDouble7245 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7260 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleDouble7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDouble7299 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_38_in_ruleDouble7313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_entryRuleFreeVariable7381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeVariable7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleFreeVariable7430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleFreeVariable7445 = new BitSet(new long[]{0x0000000000000002L});

}