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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER", "RULE_UPPER", "RULE_INT", "RULE_NAT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'this.'", "'*'", "'.'", "'['", "']'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'-'", "'+'", "'/'", "'('", "')'", "'!'", "'true'", "'false'", "'{'", "'}'", "':='", "'Pr'", "'U'", "':'", "'|'", "'nil'", "'kill'", "','", "'e'", "'E'"
    };
    public static final int RULE_NAT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_LOWER=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_UPPER=5;
    public static final int RULE_ANY_OTHER=13;
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

                if ( (LA3_0==32) ) {
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


    // $ANTLR start "entryRuleStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:152:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:156:2: (iv_ruleStore= ruleStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:157:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore232);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore242); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:167:1: ruleStore returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleNatural ) ) otherlv_3= ';' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:171:28: ( ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleNatural ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:1: ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleNatural ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:1: ( ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleNatural ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:2: ( (lv_name_0_0= RULE_LOWER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleNatural ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:172:2: ( (lv_name_0_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:173:1: (lv_name_0_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:173:1: (lv_name_0_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:174:3: lv_name_0_0= RULE_LOWER
            {
            lv_name_0_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleStore288); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStore305); 

                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:194:1: ( (lv_value_2_0= ruleNatural ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:195:1: (lv_value_2_0= ruleNatural )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:195:1: (lv_value_2_0= ruleNatural )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:196:3: lv_value_2_0= ruleNatural
            {
             
            	        newCompositeNode(grammarAccess.getStoreAccess().getValueNaturalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNatural_in_ruleStore326);
            lv_value_2_0=ruleNatural();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoreRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Natural");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStore338); 

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


    // $ANTLR start "entryRuleReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:227:1: entryRuleReferencedStore returns [EObject current=null] : iv_ruleReferencedStore= ruleReferencedStore EOF ;
    public final EObject entryRuleReferencedStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:2: (iv_ruleReferencedStore= ruleReferencedStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:232:2: iv_ruleReferencedStore= ruleReferencedStore EOF
            {
             newCompositeNode(grammarAccess.getReferencedStoreRule()); 
            pushFollow(FOLLOW_ruleReferencedStore_in_entryRuleReferencedStore384);
            iv_ruleReferencedStore=ruleReferencedStore();

            state._fsp--;

             current =iv_ruleReferencedStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedStore394); 

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
    // $ANTLR end "entryRuleReferencedStore"


    // $ANTLR start "ruleReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:242:1: ruleReferencedStore returns [EObject current=null] : ( () ( (otherlv_1= RULE_LOWER ) ) ) ;
    public final EObject ruleReferencedStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:246:28: ( ( () ( (otherlv_1= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:247:1: ( () ( (otherlv_1= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:247:1: ( () ( (otherlv_1= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:247:2: () ( (otherlv_1= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:247:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:248:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferencedStoreAccess().getReferencedStoreAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:253:2: ( (otherlv_1= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:254:1: (otherlv_1= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:254:1: (otherlv_1= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:255:3: otherlv_1= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedStoreRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleReferencedStore452); 

            		newLeafNode(otherlv_1, grammarAccess.getReferencedStoreAccess().getNameStoreCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleReferencedStore"


    // $ANTLR start "entryRuleSelfReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:277:1: entryRuleSelfReferencedStore returns [EObject current=null] : iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF ;
    public final EObject entryRuleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferencedStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:281:2: (iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:282:2: iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF
            {
             newCompositeNode(grammarAccess.getSelfReferencedStoreRule()); 
            pushFollow(FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore498);
            iv_ruleSelfReferencedStore=ruleSelfReferencedStore();

            state._fsp--;

             current =iv_ruleSelfReferencedStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfReferencedStore508); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:292:1: ruleSelfReferencedStore returns [EObject current=null] : ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) ;
    public final EObject ruleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:296:28: ( ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:297:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:297:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:297:2: () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:297:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:298:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelfReferencedStoreAccess().getSelfReferencedStoreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSelfReferencedStore558); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfReferencedStoreAccess().getThisKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:307:1: ( (otherlv_2= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:308:1: (otherlv_2= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:308:1: (otherlv_2= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:309:3: otherlv_2= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfReferencedStoreRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore578); 

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


    // $ANTLR start "entryRuleAction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:331:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:2: (iv_ruleAction= ruleAction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:336:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction624);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction634); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:346:1: ruleAction returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_arguments_6_0= ruleArguments ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_8=null;
        EObject lv_predicate_5_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_updates_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:350:28: ( ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_arguments_6_0= ruleArguments ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_arguments_6_0= ruleArguments ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_arguments_6_0= ruleArguments ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) )? ( (lv_arguments_6_0= ruleArguments ) )? ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LOWER) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=18 && LA4_1<=19)||LA4_1==28||LA4_1==32||LA4_1==37) ) {
                    alt4=2;
                }
                else if ( (LA4_1==17) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:4: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:352:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getBroadcastAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:357:2: ( (lv_name_1_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:358:1: (lv_name_1_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:358:1: (lv_name_1_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:359:3: lv_name_1_0= RULE_LOWER
                    {
                    lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction691); 

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

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAction708); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getAsteriskKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:380:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:380:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:380:7: () ( (lv_name_4_0= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:380:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:381:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getUnicastAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:386:2: ( (lv_name_4_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:387:1: (lv_name_4_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:387:1: (lv_name_4_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:388:3: lv_name_4_0= RULE_LOWER
                    {
                    lv_name_4_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction742); 

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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:404:4: ( (lv_predicate_5_0= rulePredicate ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:405:1: (lv_predicate_5_0= rulePredicate )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:405:1: (lv_predicate_5_0= rulePredicate )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:406:3: lv_predicate_5_0= rulePredicate
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getPredicatePredicateParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicate_in_ruleAction770);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:422:3: ( (lv_arguments_6_0= ruleArguments ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28||LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:423:1: (lv_arguments_6_0= ruleArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:423:1: (lv_arguments_6_0= ruleArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:424:3: lv_arguments_6_0= ruleArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArguments_in_ruleAction792);
                    lv_arguments_6_0=ruleArguments();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"arguments",
                            		lv_arguments_6_0, 
                            		"Arguments");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:440:3: ( (lv_updates_7_0= ruleUpdates ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:441:1: (lv_updates_7_0= ruleUpdates )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:441:1: (lv_updates_7_0= ruleUpdates )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:442:3: lv_updates_7_0= ruleUpdates
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getUpdatesUpdatesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdates_in_ruleAction814);
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

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleAction827); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:473:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:477:2: (iv_rulePredicate= rulePredicate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:478:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate873);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate883); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:488:1: rulePredicate returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:492:28: ( ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:493:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:493:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:493:2: () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:493:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:494:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateAccess().getPredicateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePredicate933); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:503:1: ( (lv_predicate_2_0= rulePredicateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:1: (lv_predicate_2_0= rulePredicateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:1: (lv_predicate_2_0= rulePredicateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:505:3: lv_predicate_2_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicate954);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePredicate966); 

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


    // $ANTLR start "entryRulePredicateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:536:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:540:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:541:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1012);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression1022); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:551:1: rulePredicateExpression returns [EObject current=null] : (this_PredicateOr_0= rulePredicateOr otherlv_1= ';' ) ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PredicateOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:555:28: ( (this_PredicateOr_0= rulePredicateOr otherlv_1= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:556:1: (this_PredicateOr_0= rulePredicateOr otherlv_1= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:556:1: (this_PredicateOr_0= rulePredicateOr otherlv_1= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:557:5: this_PredicateOr_0= rulePredicateOr otherlv_1= ';'
            {
             
                    newCompositeNode(grammarAccess.getPredicateExpressionAccess().getPredicateOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateOr_in_rulePredicateExpression1073);
            this_PredicateOr_0=rulePredicateOr();

            state._fsp--;

             
                    current = this_PredicateOr_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePredicateExpression1084); 

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


    // $ANTLR start "entryRulePredicateOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:580:1: entryRulePredicateOr returns [EObject current=null] : iv_rulePredicateOr= rulePredicateOr EOF ;
    public final EObject entryRulePredicateOr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:584:2: (iv_rulePredicateOr= rulePredicateOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:585:2: iv_rulePredicateOr= rulePredicateOr EOF
            {
             newCompositeNode(grammarAccess.getPredicateOrRule()); 
            pushFollow(FOLLOW_rulePredicateOr_in_entryRulePredicateOr1130);
            iv_rulePredicateOr=rulePredicateOr();

            state._fsp--;

             current =iv_rulePredicateOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateOr1140); 

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
    // $ANTLR end "entryRulePredicateOr"


    // $ANTLR start "rulePredicateOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:595:1: rulePredicateOr returns [EObject current=null] : (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) ;
    public final EObject rulePredicateOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:599:28: ( (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:600:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:600:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:601:5: this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateOrAccess().getPredicateAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1191);
            this_PredicateAnd_0=rulePredicateAnd();

            state._fsp--;

             
                    current = this_PredicateAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:609:1: ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:609:2: () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:609:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:610:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePredicateOr1212); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:619:1: ( (lv_right_3_0= rulePredicateAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:620:1: (lv_right_3_0= rulePredicateAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:620:1: (lv_right_3_0= rulePredicateAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:621:3: lv_right_3_0= rulePredicateAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateOrAccess().getRightPredicateAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1233);
            	    lv_right_3_0=rulePredicateAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "rulePredicateOr"


    // $ANTLR start "entryRulePredicateAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:648:1: entryRulePredicateAnd returns [EObject current=null] : iv_rulePredicateAnd= rulePredicateAnd EOF ;
    public final EObject entryRulePredicateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:652:2: (iv_rulePredicateAnd= rulePredicateAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:653:2: iv_rulePredicateAnd= rulePredicateAnd EOF
            {
             newCompositeNode(grammarAccess.getPredicateAndRule()); 
            pushFollow(FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1281);
            iv_rulePredicateAnd=rulePredicateAnd();

            state._fsp--;

             current =iv_rulePredicateAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAnd1291); 

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
    // $ANTLR end "entryRulePredicateAnd"


    // $ANTLR start "rulePredicateAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:663:1: rulePredicateAnd returns [EObject current=null] : (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) ;
    public final EObject rulePredicateAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:667:28: ( (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:668:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:668:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:669:5: this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAndAccess().getPredicateEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1342);
            this_PredicateEquality_0=rulePredicateEquality();

            state._fsp--;

             
                    current = this_PredicateEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:677:1: ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:677:2: () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:677:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:678:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePredicateAnd1363); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:687:1: ( (lv_right_3_0= rulePredicateEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:688:1: (lv_right_3_0= rulePredicateEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:688:1: (lv_right_3_0= rulePredicateEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:689:3: lv_right_3_0= rulePredicateEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAndAccess().getRightPredicateEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1384);
            	    lv_right_3_0=rulePredicateEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateEquality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rulePredicateAnd"


    // $ANTLR start "entryRulePredicateEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:716:1: entryRulePredicateEquality returns [EObject current=null] : iv_rulePredicateEquality= rulePredicateEquality EOF ;
    public final EObject entryRulePredicateEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:720:2: (iv_rulePredicateEquality= rulePredicateEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:721:2: iv_rulePredicateEquality= rulePredicateEquality EOF
            {
             newCompositeNode(grammarAccess.getPredicateEqualityRule()); 
            pushFollow(FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1432);
            iv_rulePredicateEquality=rulePredicateEquality();

            state._fsp--;

             current =iv_rulePredicateEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateEquality1442); 

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
    // $ANTLR end "entryRulePredicateEquality"


    // $ANTLR start "rulePredicateEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:731:1: rulePredicateEquality returns [EObject current=null] : (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) ;
    public final EObject rulePredicateEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PredicateComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:735:28: ( (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:736:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:736:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:737:5: this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateEqualityAccess().getPredicateComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1493);
            this_PredicateComparison_0=rulePredicateComparison();

            state._fsp--;

             
                    current = this_PredicateComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:745:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:745:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:745:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:746:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:751:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:752:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:752:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:753:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:753:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==23) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==24) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:754:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_rulePredicateEquality1522); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:766:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_rulePredicateEquality1551); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getPredicateEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:781:2: ( (lv_right_3_0= rulePredicateComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:782:1: (lv_right_3_0= rulePredicateComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:782:1: (lv_right_3_0= rulePredicateComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:3: lv_right_3_0= rulePredicateComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateEqualityAccess().getRightPredicateComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1588);
            	    lv_right_3_0=rulePredicateComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateComparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "rulePredicateEquality"


    // $ANTLR start "entryRulePredicateComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:810:1: entryRulePredicateComparison returns [EObject current=null] : iv_rulePredicateComparison= rulePredicateComparison EOF ;
    public final EObject entryRulePredicateComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:814:2: (iv_rulePredicateComparison= rulePredicateComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:815:2: iv_rulePredicateComparison= rulePredicateComparison EOF
            {
             newCompositeNode(grammarAccess.getPredicateComparisonRule()); 
            pushFollow(FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1636);
            iv_rulePredicateComparison=rulePredicateComparison();

            state._fsp--;

             current =iv_rulePredicateComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateComparison1646); 

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
    // $ANTLR end "entryRulePredicateComparison"


    // $ANTLR start "rulePredicateComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:825:1: rulePredicateComparison returns [EObject current=null] : (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) ;
    public final EObject rulePredicateComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PredicateSubtraction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:829:28: ( (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:830:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:830:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:831:5: this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateComparisonAccess().getPredicateSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1697);
            this_PredicateSubtraction_0=rulePredicateSubtraction();

            state._fsp--;

             
                    current = this_PredicateSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:839:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=25 && LA13_0<=28)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:839:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:839:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:840:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:845:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:846:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:846:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:847:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:847:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:848:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_rulePredicateComparison1726); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:860:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_rulePredicateComparison1755); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getPredicateComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:872:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_rulePredicateComparison1784); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:884:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_rulePredicateComparison1813); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getPredicateComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:899:2: ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:900:1: (lv_right_3_0= rulePredicateSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:900:1: (lv_right_3_0= rulePredicateSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:901:3: lv_right_3_0= rulePredicateSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateComparisonAccess().getRightPredicateSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1850);
            	    lv_right_3_0=rulePredicateSubtraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateSubtraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "rulePredicateComparison"


    // $ANTLR start "entryRulePredicateSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:928:1: entryRulePredicateSubtraction returns [EObject current=null] : iv_rulePredicateSubtraction= rulePredicateSubtraction EOF ;
    public final EObject entryRulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:932:2: (iv_rulePredicateSubtraction= rulePredicateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:933:2: iv_rulePredicateSubtraction= rulePredicateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getPredicateSubtractionRule()); 
            pushFollow(FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction1898);
            iv_rulePredicateSubtraction=rulePredicateSubtraction();

            state._fsp--;

             current =iv_rulePredicateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateSubtraction1908); 

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
    // $ANTLR end "entryRulePredicateSubtraction"


    // $ANTLR start "rulePredicateSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:943:1: rulePredicateSubtraction returns [EObject current=null] : (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) ;
    public final EObject rulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:947:28: ( (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:948:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:948:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:949:5: this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getPredicateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction1959);
            this_PredicateAddition_0=rulePredicateAddition();

            state._fsp--;

             
                    current = this_PredicateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:957:1: ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:957:2: () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:957:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:958:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePredicateSubtraction1980); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:967:1: ( (lv_right_3_0= rulePredicateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:968:1: (lv_right_3_0= rulePredicateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:968:1: (lv_right_3_0= rulePredicateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:969:3: lv_right_3_0= rulePredicateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getRightPredicateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2001);
            	    lv_right_3_0=rulePredicateAddition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateSubtractionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateAddition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "rulePredicateSubtraction"


    // $ANTLR start "entryRulePredicateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:996:1: entryRulePredicateAddition returns [EObject current=null] : iv_rulePredicateAddition= rulePredicateAddition EOF ;
    public final EObject entryRulePredicateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1000:2: (iv_rulePredicateAddition= rulePredicateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1001:2: iv_rulePredicateAddition= rulePredicateAddition EOF
            {
             newCompositeNode(grammarAccess.getPredicateAdditionRule()); 
            pushFollow(FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2049);
            iv_rulePredicateAddition=rulePredicateAddition();

            state._fsp--;

             current =iv_rulePredicateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAddition2059); 

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
    // $ANTLR end "entryRulePredicateAddition"


    // $ANTLR start "rulePredicateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1011:1: rulePredicateAddition returns [EObject current=null] : (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) ;
    public final EObject rulePredicateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1015:28: ( (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1016:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1016:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1017:5: this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAdditionAccess().getPredicateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2110);
            this_PredicateMultiplication_0=rulePredicateMultiplication();

            state._fsp--;

             
                    current = this_PredicateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1025:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1025:2: () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1025:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1026:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePredicateAddition2131); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1035:1: ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1036:1: (lv_right_3_0= rulePredicateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1036:1: (lv_right_3_0= rulePredicateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1037:3: lv_right_3_0= rulePredicateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAdditionAccess().getRightPredicateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2152);
            	    lv_right_3_0=rulePredicateMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateMultiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "rulePredicateAddition"


    // $ANTLR start "entryRulePredicateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1064:1: entryRulePredicateMultiplication returns [EObject current=null] : iv_rulePredicateMultiplication= rulePredicateMultiplication EOF ;
    public final EObject entryRulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1068:2: (iv_rulePredicateMultiplication= rulePredicateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1069:2: iv_rulePredicateMultiplication= rulePredicateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getPredicateMultiplicationRule()); 
            pushFollow(FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2200);
            iv_rulePredicateMultiplication=rulePredicateMultiplication();

            state._fsp--;

             current =iv_rulePredicateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateMultiplication2210); 

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
    // $ANTLR end "entryRulePredicateMultiplication"


    // $ANTLR start "rulePredicateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1079:1: rulePredicateMultiplication returns [EObject current=null] : (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) ;
    public final EObject rulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1083:28: ( (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1084:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1084:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1085:5: this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getPredicateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2261);
            this_PredicateDivision_0=rulePredicateDivision();

            state._fsp--;

             
                    current = this_PredicateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1093:1: ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1093:2: () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1093:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1094:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePredicateMultiplication2282); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1103:1: ( (lv_right_3_0= rulePredicateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1104:1: (lv_right_3_0= rulePredicateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1104:1: (lv_right_3_0= rulePredicateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1105:3: lv_right_3_0= rulePredicateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getRightPredicateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2303);
            	    lv_right_3_0=rulePredicateDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicateDivision");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "rulePredicateMultiplication"


    // $ANTLR start "entryRulePredicateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1132:1: entryRulePredicateDivision returns [EObject current=null] : iv_rulePredicateDivision= rulePredicateDivision EOF ;
    public final EObject entryRulePredicateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1136:2: (iv_rulePredicateDivision= rulePredicateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1137:2: iv_rulePredicateDivision= rulePredicateDivision EOF
            {
             newCompositeNode(grammarAccess.getPredicateDivisionRule()); 
            pushFollow(FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2351);
            iv_rulePredicateDivision=rulePredicateDivision();

            state._fsp--;

             current =iv_rulePredicateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDivision2361); 

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
    // $ANTLR end "entryRulePredicateDivision"


    // $ANTLR start "rulePredicateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1147:1: rulePredicateDivision returns [EObject current=null] : (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) ;
    public final EObject rulePredicateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1151:28: ( (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1152:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1152:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1153:5: this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateDivisionAccess().getPredicatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2412);
            this_PredicatePrimary_0=rulePredicatePrimary();

            state._fsp--;

             
                    current = this_PredicatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1161:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1161:2: () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1161:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1162:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePredicateDivision2433); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1171:1: ( (lv_right_3_0= rulePredicatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1172:1: (lv_right_3_0= rulePredicatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1172:1: (lv_right_3_0= rulePredicatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1173:3: lv_right_3_0= rulePredicatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateDivisionAccess().getRightPredicatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2454);
            	    lv_right_3_0=rulePredicatePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PredicatePrimary");
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
    // $ANTLR end "rulePredicateDivision"


    // $ANTLR start "entryRulePredicatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: entryRulePredicatePrimary returns [EObject current=null] : iv_rulePredicatePrimary= rulePredicatePrimary EOF ;
    public final EObject entryRulePredicatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1204:2: (iv_rulePredicatePrimary= rulePredicatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1205:2: iv_rulePredicatePrimary= rulePredicatePrimary EOF
            {
             newCompositeNode(grammarAccess.getPredicatePrimaryRule()); 
            pushFollow(FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2502);
            iv_rulePredicatePrimary=rulePredicatePrimary();

            state._fsp--;

             current =iv_rulePredicatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicatePrimary2512); 

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
    // $ANTLR end "entryRulePredicatePrimary"


    // $ANTLR start "rulePredicatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1215:1: rulePredicatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) ;
    public final EObject rulePredicatePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PredicateExpression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_PredicateAtomic_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1219:28: ( ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1220:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1220:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case RULE_LOWER:
            case RULE_NAT:
            case 16:
            case 35:
            case 36:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1220:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1220:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1220:4: otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePredicatePrimary2554); 

                        	newLeafNode(otherlv_0, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2576);
                    this_PredicateExpression_1=rulePredicateExpression();

                    state._fsp--;

                     
                            current = this_PredicateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePredicatePrimary2587); 

                        	newLeafNode(otherlv_2, grammarAccess.getPredicatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1238:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1238:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1238:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1238:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1239:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicatePrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePredicatePrimary2616); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredicatePrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1248:1: ( (lv_expression_5_0= rulePredicatePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1249:1: (lv_expression_5_0= rulePredicatePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1249:1: (lv_expression_5_0= rulePredicatePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1250:3: lv_expression_5_0= rulePredicatePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getExpressionPredicatePrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2637);
                    lv_expression_5_0=rulePredicatePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredicatePrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"PredicatePrimary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1268:5: this_PredicateAtomic_6= rulePredicateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2666);
                    this_PredicateAtomic_6=rulePredicateAtomic();

                    state._fsp--;

                     
                            current = this_PredicateAtomic_6; 
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
    // $ANTLR end "rulePredicatePrimary"


    // $ANTLR start "entryRulePredicateAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:1: entryRulePredicateAtomic returns [EObject current=null] : iv_rulePredicateAtomic= rulePredicateAtomic EOF ;
    public final EObject entryRulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1291:2: (iv_rulePredicateAtomic= rulePredicateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1292:2: iv_rulePredicateAtomic= rulePredicateAtomic EOF
            {
             newCompositeNode(grammarAccess.getPredicateAtomicRule()); 
            pushFollow(FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2711);
            iv_rulePredicateAtomic=rulePredicateAtomic();

            state._fsp--;

             current =iv_rulePredicateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtomic2721); 

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
    // $ANTLR end "entryRulePredicateAtomic"


    // $ANTLR start "rulePredicateAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1302:1: rulePredicateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) ;
    public final EObject rulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_ReferencedStore_4 = null;

        EObject this_SelfReferencedStore_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1306:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1307:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1307:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_NAT:
                {
                alt20=1;
                }
                break;
            case 35:
            case 36:
                {
                alt20=2;
                }
                break;
            case RULE_LOWER:
                {
                alt20=3;
                }
                break;
            case 16:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1307:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1307:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1307:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1307:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1308:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1313:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1314:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1314:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1315:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_rulePredicateAtomic2781);
                    lv_value_1_0=ruleNatural();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredicateAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Natural");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1332:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1332:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1332:7: () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1332:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1333:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getBoolConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1338:2: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1339:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1339:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1340:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1340:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==35) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==36) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1341:3: lv_value_3_1= 'true'
                            {
                            lv_value_3_1=(Token)match(input,35,FOLLOW_35_in_rulePredicateAtomic2818); 

                                    newLeafNode(lv_value_3_1, grammarAccess.getPredicateAtomicAccess().getValueTrueKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPredicateAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1353:8: lv_value_3_2= 'false'
                            {
                            lv_value_3_2=(Token)match(input,36,FOLLOW_36_in_rulePredicateAtomic2847); 

                                    newLeafNode(lv_value_3_2, grammarAccess.getPredicateAtomicAccess().getValueFalseKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPredicateAtomicRule());
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1370:5: this_ReferencedStore_4= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getReferencedStoreParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_rulePredicateAtomic2892);
                    this_ReferencedStore_4=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1380:5: this_SelfReferencedStore_5= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getSelfReferencedStoreParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_rulePredicateAtomic2919);
                    this_SelfReferencedStore_5=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_5; 
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
    // $ANTLR end "rulePredicateAtomic"


    // $ANTLR start "entryRuleArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1399:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1403:2: (iv_ruleArguments= ruleArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1404:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments2964);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments2974); 

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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1414:1: ruleArguments returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>' ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1418:28: ( ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1419:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1419:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')' ) | (otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            else if ( (LA23_0==28) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1419:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1419:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1419:4: otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) )+ otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleArguments3016); 

                        	newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1423:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1424:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getInAction_0_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1429:2: ( (lv_expressions_2_0= ruleInArguments ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_LOWER||LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:1: (lv_expressions_2_0= ruleInArguments )
                    	    {
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1430:1: (lv_expressions_2_0= ruleInArguments )
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1431:3: lv_expressions_2_0= ruleInArguments
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments3046);
                    	    lv_expressions_2_0=ruleInArguments();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_2_0, 
                    	            		"InArguments");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleArguments3059); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1452:6: (otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1452:6: (otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1452:8: otherlv_4= '<' () ( (lv_expressions_6_0= ruleOutArguments ) )+ otherlv_7= '>'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleArguments3079); 

                        	newLeafNode(otherlv_4, grammarAccess.getArgumentsAccess().getLessThanSignKeyword_1_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1456:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1457:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getOutAction_1_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1462:2: ( (lv_expressions_6_0= ruleOutArguments ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_LOWER||LA22_0==RULE_NAT||LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1463:1: (lv_expressions_6_0= ruleOutArguments )
                    	    {
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1463:1: (lv_expressions_6_0= ruleOutArguments )
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1464:3: lv_expressions_6_0= ruleOutArguments
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3109);
                    	    lv_expressions_6_0=ruleOutArguments();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_6_0, 
                    	            		"OutArguments");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleArguments3122); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentsAccess().getGreaterThanSignKeyword_1_3());
                        

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleInArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1495:1: entryRuleInArguments returns [EObject current=null] : iv_ruleInArguments= ruleInArguments EOF ;
    public final EObject entryRuleInArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1499:2: (iv_ruleInArguments= ruleInArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1500:2: iv_ruleInArguments= ruleInArguments EOF
            {
             newCompositeNode(grammarAccess.getInArgumentsRule()); 
            pushFollow(FOLLOW_ruleInArguments_in_entryRuleInArguments3169);
            iv_ruleInArguments=ruleInArguments();

            state._fsp--;

             current =iv_ruleInArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInArguments3179); 

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
    // $ANTLR end "entryRuleInArguments"


    // $ANTLR start "ruleInArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1510:1: ruleInArguments returns [EObject current=null] : this_Variables_0= ruleVariables ;
    public final EObject ruleInArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Variables_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1514:28: (this_Variables_0= ruleVariables )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1516:5: this_Variables_0= ruleVariables
            {
             
                    newCompositeNode(grammarAccess.getInArgumentsAccess().getVariablesParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariables_in_ruleInArguments3229);
            this_Variables_0=ruleVariables();

            state._fsp--;

             
                    current = this_Variables_0; 
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
    // $ANTLR end "ruleInArguments"


    // $ANTLR start "entryRuleOutArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1535:1: entryRuleOutArguments returns [EObject current=null] : iv_ruleOutArguments= ruleOutArguments EOF ;
    public final EObject entryRuleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1539:2: (iv_ruleOutArguments= ruleOutArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1540:2: iv_ruleOutArguments= ruleOutArguments EOF
            {
             newCompositeNode(grammarAccess.getOutArgumentsRule()); 
            pushFollow(FOLLOW_ruleOutArguments_in_entryRuleOutArguments3273);
            iv_ruleOutArguments=ruleOutArguments();

            state._fsp--;

             current =iv_ruleOutArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutArguments3283); 

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
    // $ANTLR end "entryRuleOutArguments"


    // $ANTLR start "ruleOutArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1550:1: ruleOutArguments returns [EObject current=null] : this_Expressions_0= ruleExpressions ;
    public final EObject ruleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Expressions_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1554:28: (this_Expressions_0= ruleExpressions )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1556:5: this_Expressions_0= ruleExpressions
            {
             
                    newCompositeNode(grammarAccess.getOutArgumentsAccess().getExpressionsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpressions_in_ruleOutArguments3333);
            this_Expressions_0=ruleExpressions();

            state._fsp--;

             
                    current = this_Expressions_0; 
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
    // $ANTLR end "ruleOutArguments"


    // $ANTLR start "entryRuleExpressions"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1575:1: entryRuleExpressions returns [EObject current=null] : iv_ruleExpressions= ruleExpressions EOF ;
    public final EObject entryRuleExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressions = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1579:2: (iv_ruleExpressions= ruleExpressions EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1580:2: iv_ruleExpressions= ruleExpressions EOF
            {
             newCompositeNode(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_ruleExpressions_in_entryRuleExpressions3377);
            iv_ruleExpressions=ruleExpressions();

            state._fsp--;

             current =iv_ruleExpressions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressions3387); 

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
    // $ANTLR end "entryRuleExpressions"


    // $ANTLR start "ruleExpressions"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1590:1: ruleExpressions returns [EObject current=null] : (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( (lv_value_2_0= ruleNatural ) ) ) ;
    public final EObject ruleExpressions() throws RecognitionException {
        EObject current = null;

        EObject this_SelfReferencedStore_0 = null;

        EObject this_ReferencedStore_1 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1594:28: ( (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( (lv_value_2_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1595:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( (lv_value_2_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1595:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( (lv_value_2_0= ruleNatural ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt24=1;
                }
                break;
            case RULE_LOWER:
                {
                alt24=2;
                }
                break;
            case RULE_NAT:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1596:5: this_SelfReferencedStore_0= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionsAccess().getSelfReferencedStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleExpressions3438);
                    this_SelfReferencedStore_0=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1606:5: this_ReferencedStore_1= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionsAccess().getReferencedStoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleExpressions3465);
                    this_ReferencedStore_1=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1615:6: ( (lv_value_2_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1615:6: ( (lv_value_2_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1616:1: (lv_value_2_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1616:1: (lv_value_2_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1617:3: lv_value_2_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionsAccess().getValueNaturalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleExpressions3491);
                    lv_value_2_0=ruleNatural();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionsRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Natural");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleExpressions"


    // $ANTLR start "entryRuleVariables"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1644:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1648:2: (iv_ruleVariables= ruleVariables EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1649:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables3537);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables3547); 

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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1659:1: ruleVariables returns [EObject current=null] : (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_SelfReferencedStore_0 = null;

        EObject this_ReferencedStore_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1663:28: ( (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1664:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1664:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_LOWER) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1665:5: this_SelfReferencedStore_0= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getSelfReferencedStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleVariables3598);
                    this_SelfReferencedStore_0=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1675:5: this_ReferencedStore_1= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getReferencedStoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleVariables3625);
                    this_ReferencedStore_1=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_1; 
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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleUpdates"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1694:1: entryRuleUpdates returns [EObject current=null] : iv_ruleUpdates= ruleUpdates EOF ;
    public final EObject entryRuleUpdates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdates = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1698:2: (iv_ruleUpdates= ruleUpdates EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1699:2: iv_ruleUpdates= ruleUpdates EOF
            {
             newCompositeNode(grammarAccess.getUpdatesRule()); 
            pushFollow(FOLLOW_ruleUpdates_in_entryRuleUpdates3670);
            iv_ruleUpdates=ruleUpdates();

            state._fsp--;

             current =iv_ruleUpdates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdates3680); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1709:1: ruleUpdates returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) )+ otherlv_3= '}' ) ;
    public final EObject ruleUpdates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_updates_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1713:28: ( ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) )+ otherlv_3= '}' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1714:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) )+ otherlv_3= '}' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1714:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) )+ otherlv_3= '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1714:2: () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) )+ otherlv_3= '}'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1714:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1715:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdatesAccess().getUpdatesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleUpdates3730); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdatesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1724:1: ( (lv_updates_2_0= ruleUpdate ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16||(LA26_0>=40 && LA26_0<=41)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1725:1: (lv_updates_2_0= ruleUpdate )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1725:1: (lv_updates_2_0= ruleUpdate )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1726:3: lv_updates_2_0= ruleUpdate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates3751);
            	    lv_updates_2_0=ruleUpdate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdatesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"updates",
            	            		lv_updates_2_0, 
            	            		"Update");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleUpdates3764); 

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


    // $ANTLR start "entryRuleUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1757:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1761:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1762:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate3810);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate3820); 

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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1772:1: ruleUpdate returns [EObject current=null] : ( (this_SingleEventUpdate_0= ruleSingleEventUpdate | this_DistributedEventUpdate_1= ruleDistributedEventUpdate ) otherlv_2= ';' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SingleEventUpdate_0 = null;

        EObject this_DistributedEventUpdate_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1776:28: ( ( (this_SingleEventUpdate_0= ruleSingleEventUpdate | this_DistributedEventUpdate_1= ruleDistributedEventUpdate ) otherlv_2= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1777:1: ( (this_SingleEventUpdate_0= ruleSingleEventUpdate | this_DistributedEventUpdate_1= ruleDistributedEventUpdate ) otherlv_2= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1777:1: ( (this_SingleEventUpdate_0= ruleSingleEventUpdate | this_DistributedEventUpdate_1= ruleDistributedEventUpdate ) otherlv_2= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1777:2: (this_SingleEventUpdate_0= ruleSingleEventUpdate | this_DistributedEventUpdate_1= ruleDistributedEventUpdate ) otherlv_2= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1777:2: (this_SingleEventUpdate_0= ruleSingleEventUpdate | this_DistributedEventUpdate_1= ruleDistributedEventUpdate )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=40 && LA27_0<=41)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1778:5: this_SingleEventUpdate_0= ruleSingleEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getSingleEventUpdateParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleEventUpdate_in_ruleUpdate3872);
                    this_SingleEventUpdate_0=ruleSingleEventUpdate();

                    state._fsp--;

                     
                            current = this_SingleEventUpdate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1788:5: this_DistributedEventUpdate_1= ruleDistributedEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getDistributedEventUpdateParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate3899);
                    this_DistributedEventUpdate_1=ruleDistributedEventUpdate();

                    state._fsp--;

                     
                            current = this_DistributedEventUpdate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUpdate3911); 

                	newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleSingleEventUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1811:1: entryRuleSingleEventUpdate returns [EObject current=null] : iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF ;
    public final EObject entryRuleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1815:2: (iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1816:2: iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getSingleEventUpdateRule()); 
            pushFollow(FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate3957);
            iv_ruleSingleEventUpdate=ruleSingleEventUpdate();

            state._fsp--;

             current =iv_ruleSingleEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEventUpdate3967); 

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
    // $ANTLR end "entryRuleSingleEventUpdate"


    // $ANTLR start "ruleSingleEventUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1826:1: ruleSingleEventUpdate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) ) ;
    public final EObject ruleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1830:28: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1831:1: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1831:1: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1831:2: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1831:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1832:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleEventUpdateAccess().getLocalSingleEventUpdateAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1837:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1838:1: (lv_name_1_0= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1838:1: (lv_name_1_0= ruleSelfReferencedStore )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1839:3: lv_name_1_0= ruleSelfReferencedStore
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getNameSelfReferencedStoreParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleSingleEventUpdate4026);
            lv_name_1_0=ruleSelfReferencedStore();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleEventUpdateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SelfReferencedStore");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleSingleEventUpdate4038); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleEventUpdateAccess().getColonEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1859:1: ( (lv_expression_3_0= ruleUpdateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1860:1: (lv_expression_3_0= ruleUpdateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1860:1: (lv_expression_3_0= ruleUpdateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1861:3: lv_expression_3_0= ruleUpdateExpression
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getExpressionUpdateExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4059);
            lv_expression_3_0=ruleUpdateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleEventUpdateRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"UpdateExpression");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSingleEventUpdate"


    // $ANTLR start "entryRuleDistributedEventUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1888:1: entryRuleDistributedEventUpdate returns [EObject current=null] : iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF ;
    public final EObject entryRuleDistributedEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributedEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1892:2: (iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1893:2: iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getDistributedEventUpdateRule()); 
            pushFollow(FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4105);
            iv_ruleDistributedEventUpdate=ruleDistributedEventUpdate();

            state._fsp--;

             current =iv_ruleDistributedEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributedEventUpdate4115); 

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
    // $ANTLR end "entryRuleDistributedEventUpdate"


    // $ANTLR start "ruleDistributedEventUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1903:1: ruleDistributedEventUpdate returns [EObject current=null] : ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleDistributedEventUpdate() throws RecognitionException {
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1907:28: ( ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:1: ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:1: ( ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' ) | ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            else if ( (LA29_0==41) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:2: ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:2: ( () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:3: () otherlv_1= 'Pr' otherlv_2= '(' ( (lv_distribution_3_0= ruleDistribution ) )+ otherlv_4= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1909:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateProbabilityAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleDistributedEventUpdate4166); 

                        	newLeafNode(otherlv_1, grammarAccess.getDistributedEventUpdateAccess().getPrKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleDistributedEventUpdate4178); 

                        	newLeafNode(otherlv_2, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:1: ( (lv_distribution_3_0= ruleDistribution ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_INT) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1923:1: (lv_distribution_3_0= ruleDistribution )
                    	    {
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1923:1: (lv_distribution_3_0= ruleDistribution )
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1924:3: lv_distribution_3_0= ruleDistribution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionDistributionParserRuleCall_0_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4199);
                    	    lv_distribution_3_0=ruleDistribution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
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
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4212); 

                        	newLeafNode(otherlv_4, grammarAccess.getDistributedEventUpdateAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1945:6: ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1945:6: ( () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1945:7: () otherlv_6= 'U' otherlv_7= '(' ( (lv_distribution_8_0= ruleUniform ) ) otherlv_9= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1945:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1946:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateUniformAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleDistributedEventUpdate4241); 

                        	newLeafNode(otherlv_6, grammarAccess.getDistributedEventUpdateAccess().getUKeyword_1_1());
                        
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleDistributedEventUpdate4253); 

                        	newLeafNode(otherlv_7, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1959:1: ( (lv_distribution_8_0= ruleUniform ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1960:1: (lv_distribution_8_0= ruleUniform )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1960:1: (lv_distribution_8_0= ruleUniform )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1961:3: lv_distribution_8_0= ruleUniform
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionUniformParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4274);
                    lv_distribution_8_0=ruleUniform();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		add(
                           			current, 
                           			"distribution",
                            		lv_distribution_8_0, 
                            		"Uniform");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4286); 

                        	newLeafNode(otherlv_9, grammarAccess.getDistributedEventUpdateAccess().getRightParenthesisKeyword_1_4());
                        

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
    // $ANTLR end "ruleDistributedEventUpdate"


    // $ANTLR start "entryRuleDistribution"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1992:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1996:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1997:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution4333);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution4343); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2007:1: ruleDistribution returns [EObject current=null] : ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleUpdateExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_prob_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2011:28: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleUpdateExpression ) ) otherlv_4= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2012:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleUpdateExpression ) ) otherlv_4= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2012:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleUpdateExpression ) ) otherlv_4= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2012:2: () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleUpdateExpression ) ) otherlv_4= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2012:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2013:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDistributionAccess().getDistributionAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2018:2: ( (lv_prob_1_0= ruleDouble ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2019:1: (lv_prob_1_0= ruleDouble )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2019:1: (lv_prob_1_0= ruleDouble )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2020:3: lv_prob_1_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getProbDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleDistribution4402);
            lv_prob_1_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	        }
                   		set(
                   			current, 
                   			"prob",
                    		lv_prob_1_0, 
                    		"Double");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleDistribution4414); 

                	newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getColonKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2040:1: ( (lv_expression_3_0= ruleUpdateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2041:1: (lv_expression_3_0= ruleUpdateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2041:1: (lv_expression_3_0= ruleUpdateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2042:3: lv_expression_3_0= ruleUpdateExpression
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getExpressionUpdateExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateExpression_in_ruleDistribution4435);
            lv_expression_3_0=ruleUpdateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"UpdateExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDistribution4447); 

                	newLeafNode(otherlv_4, grammarAccess.getDistributionAccess().getSemicolonKeyword_4());
                

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2073:1: entryRuleUniform returns [EObject current=null] : iv_ruleUniform= ruleUniform EOF ;
    public final EObject entryRuleUniform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniform = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2077:2: (iv_ruleUniform= ruleUniform EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2078:2: iv_ruleUniform= ruleUniform EOF
            {
             newCompositeNode(grammarAccess.getUniformRule()); 
            pushFollow(FOLLOW_ruleUniform_in_entryRuleUniform4493);
            iv_ruleUniform=ruleUniform();

            state._fsp--;

             current =iv_ruleUniform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniform4503); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2088:1: ruleUniform returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleUpdateExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleUniform() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2092:28: ( ( () ( (lv_expression_1_0= ruleUpdateExpression ) ) otherlv_2= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:1: ( () ( (lv_expression_1_0= ruleUpdateExpression ) ) otherlv_2= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:1: ( () ( (lv_expression_1_0= ruleUpdateExpression ) ) otherlv_2= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:2: () ( (lv_expression_1_0= ruleUpdateExpression ) ) otherlv_2= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2093:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniformAccess().getUniformAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2099:2: ( (lv_expression_1_0= ruleUpdateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2100:1: (lv_expression_1_0= ruleUpdateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2100:1: (lv_expression_1_0= ruleUpdateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2101:3: lv_expression_1_0= ruleUpdateExpression
            {
             
            	        newCompositeNode(grammarAccess.getUniformAccess().getExpressionUpdateExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateExpression_in_ruleUniform4562);
            lv_expression_1_0=ruleUpdateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniformRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"UpdateExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUniform4574); 

                	newLeafNode(otherlv_2, grammarAccess.getUniformAccess().getSemicolonKeyword_2());
                

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


    // $ANTLR start "entryRuleUpdateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2132:1: entryRuleUpdateExpression returns [EObject current=null] : iv_ruleUpdateExpression= ruleUpdateExpression EOF ;
    public final EObject entryRuleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2136:2: (iv_ruleUpdateExpression= ruleUpdateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2137:2: iv_ruleUpdateExpression= ruleUpdateExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression4620);
            iv_ruleUpdateExpression=ruleUpdateExpression();

            state._fsp--;

             current =iv_ruleUpdateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpression4630); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2147:1: ruleUpdateExpression returns [EObject current=null] : this_UpdateOr_0= ruleUpdateOr ;
    public final EObject ruleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2151:28: (this_UpdateOr_0= ruleUpdateOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2153:5: this_UpdateOr_0= ruleUpdateOr
            {
             
                    newCompositeNode(grammarAccess.getUpdateExpressionAccess().getUpdateOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUpdateOr_in_ruleUpdateExpression4680);
            this_UpdateOr_0=ruleUpdateOr();

            state._fsp--;

             
                    current = this_UpdateOr_0; 
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
    // $ANTLR end "ruleUpdateExpression"


    // $ANTLR start "entryRuleUpdateOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2172:1: entryRuleUpdateOr returns [EObject current=null] : iv_ruleUpdateOr= ruleUpdateOr EOF ;
    public final EObject entryRuleUpdateOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2176:2: (iv_ruleUpdateOr= ruleUpdateOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2177:2: iv_ruleUpdateOr= ruleUpdateOr EOF
            {
             newCompositeNode(grammarAccess.getUpdateOrRule()); 
            pushFollow(FOLLOW_ruleUpdateOr_in_entryRuleUpdateOr4724);
            iv_ruleUpdateOr=ruleUpdateOr();

            state._fsp--;

             current =iv_ruleUpdateOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateOr4734); 

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
    // $ANTLR end "entryRuleUpdateOr"


    // $ANTLR start "ruleUpdateOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2187:1: ruleUpdateOr returns [EObject current=null] : (this_UpdateAnd_0= ruleUpdateAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) ) )* ) ;
    public final EObject ruleUpdateOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2191:28: ( (this_UpdateAnd_0= ruleUpdateAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2192:1: (this_UpdateAnd_0= ruleUpdateAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2192:1: (this_UpdateAnd_0= ruleUpdateAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2193:5: this_UpdateAnd_0= ruleUpdateAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateOrAccess().getUpdateAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateAnd_in_ruleUpdateOr4785);
            this_UpdateAnd_0=ruleUpdateAnd();

            state._fsp--;

             
                    current = this_UpdateAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2201:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2201:2: () otherlv_2= '||' ( (lv_right_3_0= ruleUpdateAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2201:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2202:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateOrAccess().getUpdateOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleUpdateOr4806); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2211:1: ( (lv_right_3_0= ruleUpdateAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2212:1: (lv_right_3_0= ruleUpdateAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2212:1: (lv_right_3_0= ruleUpdateAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2213:3: lv_right_3_0= ruleUpdateAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateOrAccess().getRightUpdateAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateAnd_in_ruleUpdateOr4827);
            	    lv_right_3_0=ruleUpdateAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateAnd");
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
    // $ANTLR end "ruleUpdateOr"


    // $ANTLR start "entryRuleUpdateAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2240:1: entryRuleUpdateAnd returns [EObject current=null] : iv_ruleUpdateAnd= ruleUpdateAnd EOF ;
    public final EObject entryRuleUpdateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2244:2: (iv_ruleUpdateAnd= ruleUpdateAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2245:2: iv_ruleUpdateAnd= ruleUpdateAnd EOF
            {
             newCompositeNode(grammarAccess.getUpdateAndRule()); 
            pushFollow(FOLLOW_ruleUpdateAnd_in_entryRuleUpdateAnd4875);
            iv_ruleUpdateAnd=ruleUpdateAnd();

            state._fsp--;

             current =iv_ruleUpdateAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAnd4885); 

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
    // $ANTLR end "entryRuleUpdateAnd"


    // $ANTLR start "ruleUpdateAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2255:1: ruleUpdateAnd returns [EObject current=null] : (this_UpdateEquality_0= ruleUpdateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) ) )* ) ;
    public final EObject ruleUpdateAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2259:28: ( (this_UpdateEquality_0= ruleUpdateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2260:1: (this_UpdateEquality_0= ruleUpdateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2260:1: (this_UpdateEquality_0= ruleUpdateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2261:5: this_UpdateEquality_0= ruleUpdateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateAndAccess().getUpdateEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateEquality_in_ruleUpdateAnd4936);
            this_UpdateEquality_0=ruleUpdateEquality();

            state._fsp--;

             
                    current = this_UpdateEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2269:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2269:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleUpdateEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2269:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2270:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateAndAccess().getUpdateAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleUpdateAnd4957); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2279:1: ( (lv_right_3_0= ruleUpdateEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2280:1: (lv_right_3_0= ruleUpdateEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2280:1: (lv_right_3_0= ruleUpdateEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2281:3: lv_right_3_0= ruleUpdateEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAndAccess().getRightUpdateEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateEquality_in_ruleUpdateAnd4978);
            	    lv_right_3_0=ruleUpdateEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateEquality");
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
    // $ANTLR end "ruleUpdateAnd"


    // $ANTLR start "entryRuleUpdateEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2308:1: entryRuleUpdateEquality returns [EObject current=null] : iv_ruleUpdateEquality= ruleUpdateEquality EOF ;
    public final EObject entryRuleUpdateEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2312:2: (iv_ruleUpdateEquality= ruleUpdateEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2313:2: iv_ruleUpdateEquality= ruleUpdateEquality EOF
            {
             newCompositeNode(grammarAccess.getUpdateEqualityRule()); 
            pushFollow(FOLLOW_ruleUpdateEquality_in_entryRuleUpdateEquality5026);
            iv_ruleUpdateEquality=ruleUpdateEquality();

            state._fsp--;

             current =iv_ruleUpdateEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateEquality5036); 

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
    // $ANTLR end "entryRuleUpdateEquality"


    // $ANTLR start "ruleUpdateEquality"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2323:1: ruleUpdateEquality returns [EObject current=null] : (this_UpdateComparison_0= ruleUpdateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) ) )* ) ;
    public final EObject ruleUpdateEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_UpdateComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2327:28: ( (this_UpdateComparison_0= ruleUpdateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2328:1: (this_UpdateComparison_0= ruleUpdateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2328:1: (this_UpdateComparison_0= ruleUpdateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2329:5: this_UpdateComparison_0= ruleUpdateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateEqualityAccess().getUpdateComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateComparison_in_ruleUpdateEquality5087);
            this_UpdateComparison_0=ruleUpdateComparison();

            state._fsp--;

             
                    current = this_UpdateComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2337:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=23 && LA33_0<=24)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2337:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleUpdateComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2337:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2338:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateEqualityAccess().getUpdateEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2343:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2344:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2344:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2345:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2345:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==23) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==24) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2346:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleUpdateEquality5116); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getUpdateEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUpdateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2358:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleUpdateEquality5145); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getUpdateEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUpdateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2373:2: ( (lv_right_3_0= ruleUpdateComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2374:1: (lv_right_3_0= ruleUpdateComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2374:1: (lv_right_3_0= ruleUpdateComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2375:3: lv_right_3_0= ruleUpdateComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateEqualityAccess().getRightUpdateComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateComparison_in_ruleUpdateEquality5182);
            	    lv_right_3_0=ruleUpdateComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateComparison");
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
    // $ANTLR end "ruleUpdateEquality"


    // $ANTLR start "entryRuleUpdateComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2402:1: entryRuleUpdateComparison returns [EObject current=null] : iv_ruleUpdateComparison= ruleUpdateComparison EOF ;
    public final EObject entryRuleUpdateComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2406:2: (iv_ruleUpdateComparison= ruleUpdateComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2407:2: iv_ruleUpdateComparison= ruleUpdateComparison EOF
            {
             newCompositeNode(grammarAccess.getUpdateComparisonRule()); 
            pushFollow(FOLLOW_ruleUpdateComparison_in_entryRuleUpdateComparison5230);
            iv_ruleUpdateComparison=ruleUpdateComparison();

            state._fsp--;

             current =iv_ruleUpdateComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateComparison5240); 

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
    // $ANTLR end "entryRuleUpdateComparison"


    // $ANTLR start "ruleUpdateComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2417:1: ruleUpdateComparison returns [EObject current=null] : (this_UpdateSubtraction_0= ruleUpdateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) ) )* ) ;
    public final EObject ruleUpdateComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_UpdateSubtraction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2421:28: ( (this_UpdateSubtraction_0= ruleUpdateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2422:1: (this_UpdateSubtraction_0= ruleUpdateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2422:1: (this_UpdateSubtraction_0= ruleUpdateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2423:5: this_UpdateSubtraction_0= ruleUpdateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateComparisonAccess().getUpdateSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_ruleUpdateComparison5291);
            this_UpdateSubtraction_0=ruleUpdateSubtraction();

            state._fsp--;

             
                    current = this_UpdateSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2431:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=25 && LA35_0<=28)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2431:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleUpdateSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2431:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2432:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateComparisonAccess().getUpdateComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2437:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2438:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2438:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2439:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2439:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 27:
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
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2440:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleUpdateComparison5320); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getUpdateComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUpdateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2452:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleUpdateComparison5349); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getUpdateComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUpdateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2464:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_ruleUpdateComparison5378); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getUpdateComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUpdateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2476:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,28,FOLLOW_28_in_ruleUpdateComparison5407); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getUpdateComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUpdateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2491:2: ( (lv_right_3_0= ruleUpdateSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2492:1: (lv_right_3_0= ruleUpdateSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2492:1: (lv_right_3_0= ruleUpdateSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2493:3: lv_right_3_0= ruleUpdateSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateComparisonAccess().getRightUpdateSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateSubtraction_in_ruleUpdateComparison5444);
            	    lv_right_3_0=ruleUpdateSubtraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateSubtraction");
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
    // $ANTLR end "ruleUpdateComparison"


    // $ANTLR start "entryRuleUpdateSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2520:1: entryRuleUpdateSubtraction returns [EObject current=null] : iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF ;
    public final EObject entryRuleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2524:2: (iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2525:2: iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getUpdateSubtractionRule()); 
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction5492);
            iv_ruleUpdateSubtraction=ruleUpdateSubtraction();

            state._fsp--;

             current =iv_ruleUpdateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateSubtraction5502); 

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
    // $ANTLR end "entryRuleUpdateSubtraction"


    // $ANTLR start "ruleUpdateSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2535:1: ruleUpdateSubtraction returns [EObject current=null] : (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) ;
    public final EObject ruleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2539:28: ( (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2540:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2540:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2541:5: this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getUpdateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5553);
            this_UpdateAddition_0=ruleUpdateAddition();

            state._fsp--;

             
                    current = this_UpdateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2549:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2549:2: () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2549:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2550:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleUpdateSubtraction5574); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2559:1: ( (lv_right_3_0= ruleUpdateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2560:1: (lv_right_3_0= ruleUpdateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2560:1: (lv_right_3_0= ruleUpdateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2561:3: lv_right_3_0= ruleUpdateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getRightUpdateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5595);
            	    lv_right_3_0=ruleUpdateAddition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateSubtractionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateAddition");
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
    // $ANTLR end "ruleUpdateSubtraction"


    // $ANTLR start "entryRuleUpdateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2588:1: entryRuleUpdateAddition returns [EObject current=null] : iv_ruleUpdateAddition= ruleUpdateAddition EOF ;
    public final EObject entryRuleUpdateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2592:2: (iv_ruleUpdateAddition= ruleUpdateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2593:2: iv_ruleUpdateAddition= ruleUpdateAddition EOF
            {
             newCompositeNode(grammarAccess.getUpdateAdditionRule()); 
            pushFollow(FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5643);
            iv_ruleUpdateAddition=ruleUpdateAddition();

            state._fsp--;

             current =iv_ruleUpdateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAddition5653); 

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
    // $ANTLR end "entryRuleUpdateAddition"


    // $ANTLR start "ruleUpdateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2603:1: ruleUpdateAddition returns [EObject current=null] : (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) ;
    public final EObject ruleUpdateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2607:28: ( (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2608:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2608:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2609:5: this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateAdditionAccess().getUpdateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5704);
            this_UpdateMultiplication_0=ruleUpdateMultiplication();

            state._fsp--;

             
                    current = this_UpdateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2617:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==30) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2617:2: () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2617:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2618:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleUpdateAddition5725); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2627:1: ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2628:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2628:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2629:3: lv_right_3_0= ruleUpdateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAdditionAccess().getRightUpdateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5746);
            	    lv_right_3_0=ruleUpdateMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateMultiplication");
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
    // $ANTLR end "ruleUpdateAddition"


    // $ANTLR start "entryRuleUpdateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2656:1: entryRuleUpdateMultiplication returns [EObject current=null] : iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF ;
    public final EObject entryRuleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2660:2: (iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2661:2: iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getUpdateMultiplicationRule()); 
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication5794);
            iv_ruleUpdateMultiplication=ruleUpdateMultiplication();

            state._fsp--;

             current =iv_ruleUpdateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateMultiplication5804); 

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
    // $ANTLR end "entryRuleUpdateMultiplication"


    // $ANTLR start "ruleUpdateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2671:1: ruleUpdateMultiplication returns [EObject current=null] : (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) ;
    public final EObject ruleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2675:28: ( (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2676:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2676:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2677:5: this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getUpdateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5855);
            this_UpdateDivision_0=ruleUpdateDivision();

            state._fsp--;

             
                    current = this_UpdateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2685:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2685:2: () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2685:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2686:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleUpdateMultiplication5876); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2695:1: ( (lv_right_3_0= ruleUpdateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2696:1: (lv_right_3_0= ruleUpdateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2696:1: (lv_right_3_0= ruleUpdateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2697:3: lv_right_3_0= ruleUpdateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getRightUpdateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5897);
            	    lv_right_3_0=ruleUpdateDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdateDivision");
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
    // $ANTLR end "ruleUpdateMultiplication"


    // $ANTLR start "entryRuleUpdateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2724:1: entryRuleUpdateDivision returns [EObject current=null] : iv_ruleUpdateDivision= ruleUpdateDivision EOF ;
    public final EObject entryRuleUpdateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2728:2: (iv_ruleUpdateDivision= ruleUpdateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2729:2: iv_ruleUpdateDivision= ruleUpdateDivision EOF
            {
             newCompositeNode(grammarAccess.getUpdateDivisionRule()); 
            pushFollow(FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision5945);
            iv_ruleUpdateDivision=ruleUpdateDivision();

            state._fsp--;

             current =iv_ruleUpdateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateDivision5955); 

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
    // $ANTLR end "entryRuleUpdateDivision"


    // $ANTLR start "ruleUpdateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2739:1: ruleUpdateDivision returns [EObject current=null] : (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) ;
    public final EObject ruleUpdateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2743:28: ( (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2744:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2744:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2745:5: this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateDivisionAccess().getUpdatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6006);
            this_UpdatePrimary_0=ruleUpdatePrimary();

            state._fsp--;

             
                    current = this_UpdatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2753:1: ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==31) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2753:2: () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2753:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2754:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleUpdateDivision6027); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2763:1: ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2764:1: (lv_right_3_0= ruleUpdatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2764:1: (lv_right_3_0= ruleUpdatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2765:3: lv_right_3_0= ruleUpdatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateDivisionAccess().getRightUpdatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6048);
            	    lv_right_3_0=ruleUpdatePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UpdatePrimary");
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
    // $ANTLR end "ruleUpdateDivision"


    // $ANTLR start "entryRuleUpdatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2792:1: entryRuleUpdatePrimary returns [EObject current=null] : iv_ruleUpdatePrimary= ruleUpdatePrimary EOF ;
    public final EObject entryRuleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2796:2: (iv_ruleUpdatePrimary= ruleUpdatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2797:2: iv_ruleUpdatePrimary= ruleUpdatePrimary EOF
            {
             newCompositeNode(grammarAccess.getUpdatePrimaryRule()); 
            pushFollow(FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary6096);
            iv_ruleUpdatePrimary=ruleUpdatePrimary();

            state._fsp--;

             current =iv_ruleUpdatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdatePrimary6106); 

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
    // $ANTLR end "entryRuleUpdatePrimary"


    // $ANTLR start "ruleUpdatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2807:1: ruleUpdatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) ) ) | this_UpdateAtomic_6= ruleUpdateAtomic ) ;
    public final EObject ruleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UpdateExpression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_UpdateAtomic_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2811:28: ( ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) ) ) | this_UpdateAtomic_6= ruleUpdateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) ) ) | this_UpdateAtomic_6= ruleUpdateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) ) ) | this_UpdateAtomic_6= ruleUpdateAtomic )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt40=1;
                }
                break;
            case 34:
                {
                alt40=2;
                }
                break;
            case RULE_LOWER:
            case RULE_NAT:
            case 16:
            case 35:
            case 36:
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:4: otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleUpdatePrimary6148); 

                        	newLeafNode(otherlv_0, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary6170);
                    this_UpdateExpression_1=ruleUpdateExpression();

                    state._fsp--;

                     
                            current = this_UpdateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleUpdatePrimary6181); 

                        	newLeafNode(otherlv_2, grammarAccess.getUpdatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2830:6: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2830:6: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2830:7: () otherlv_4= '!' ( (lv_expression_5_0= ruleUpdatePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2830:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2831:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdatePrimaryAccess().getUpdateNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleUpdatePrimary6210); 

                        	newLeafNode(otherlv_4, grammarAccess.getUpdatePrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2840:1: ( (lv_expression_5_0= ruleUpdatePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2841:1: (lv_expression_5_0= ruleUpdatePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2841:1: (lv_expression_5_0= ruleUpdatePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2842:3: lv_expression_5_0= ruleUpdatePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getExpressionUpdatePrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdatePrimary6231);
                    lv_expression_5_0=ruleUpdatePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdatePrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"UpdatePrimary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2860:5: this_UpdateAtomic_6= ruleUpdateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary6260);
                    this_UpdateAtomic_6=ruleUpdateAtomic();

                    state._fsp--;

                     
                            current = this_UpdateAtomic_6; 
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
    // $ANTLR end "ruleUpdatePrimary"


    // $ANTLR start "entryRuleUpdateAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2879:1: entryRuleUpdateAtomic returns [EObject current=null] : iv_ruleUpdateAtomic= ruleUpdateAtomic EOF ;
    public final EObject entryRuleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2883:2: (iv_ruleUpdateAtomic= ruleUpdateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2884:2: iv_ruleUpdateAtomic= ruleUpdateAtomic EOF
            {
             newCompositeNode(grammarAccess.getUpdateAtomicRule()); 
            pushFollow(FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic6305);
            iv_ruleUpdateAtomic=ruleUpdateAtomic();

            state._fsp--;

             current =iv_ruleUpdateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAtomic6315); 

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
    // $ANTLR end "entryRuleUpdateAtomic"


    // $ANTLR start "ruleUpdateAtomic"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2894:1: ruleUpdateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) ;
    public final EObject ruleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_ReferencedStore_4 = null;

        EObject this_SelfReferencedStore_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2898:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2899:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2899:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            int alt42=4;
            switch ( input.LA(1) ) {
            case RULE_NAT:
                {
                alt42=1;
                }
                break;
            case 35:
            case 36:
                {
                alt42=2;
                }
                break;
            case RULE_LOWER:
                {
                alt42=3;
                }
                break;
            case 16:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2899:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2899:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2899:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2899:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2900:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2905:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2906:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2906:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2907:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleUpdateAtomic6375);
                    lv_value_1_0=ruleNatural();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Natural");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2924:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2924:6: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2924:7: () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2924:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2925:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAtomicAccess().getBoolConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2930:2: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2931:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2931:1: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2932:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2932:1: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==35) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==36) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2933:3: lv_value_3_1= 'true'
                            {
                            lv_value_3_1=(Token)match(input,35,FOLLOW_35_in_ruleUpdateAtomic6412); 

                                    newLeafNode(lv_value_3_1, grammarAccess.getUpdateAtomicAccess().getValueTrueKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUpdateAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2945:8: lv_value_3_2= 'false'
                            {
                            lv_value_3_2=(Token)match(input,36,FOLLOW_36_in_ruleUpdateAtomic6441); 

                                    newLeafNode(lv_value_3_2, grammarAccess.getUpdateAtomicAccess().getValueFalseKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUpdateAtomicRule());
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2962:5: this_ReferencedStore_4= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAtomicAccess().getReferencedStoreParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleUpdateAtomic6486);
                    this_ReferencedStore_4=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2972:5: this_SelfReferencedStore_5= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAtomicAccess().getSelfReferencedStoreParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleUpdateAtomic6513);
                    this_SelfReferencedStore_5=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_5; 
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
    // $ANTLR end "ruleUpdateAtomic"


    // $ANTLR start "entryRuleProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2991:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2995:2: (iv_ruleProcess= ruleProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2996:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess6558);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess6568); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3006:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3010:28: ( ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3011:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3011:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3011:2: ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3011:2: ( (lv_name_0_0= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3012:1: (lv_name_0_0= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3012:1: (lv_name_0_0= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3013:3: lv_name_0_0= RULE_UPPER
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleProcess6614); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProcess6631); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3033:1: ( (lv_value_2_0= ruleProcessExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3034:1: (lv_value_2_0= ruleProcessExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3034:1: (lv_value_2_0= ruleProcessExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3035:3: lv_value_2_0= ruleProcessExpression
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessExpression_in_ruleProcess6652);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProcess6664); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3066:1: entryRuleProcessExpression returns [EObject current=null] : iv_ruleProcessExpression= ruleProcessExpression EOF ;
    public final EObject entryRuleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3070:2: (iv_ruleProcessExpression= ruleProcessExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3071:2: iv_ruleProcessExpression= ruleProcessExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessExpressionRule()); 
            pushFollow(FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression6710);
            iv_ruleProcessExpression=ruleProcessExpression();

            state._fsp--;

             current =iv_ruleProcessExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessExpression6720); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3081:1: ruleProcessExpression returns [EObject current=null] : this_Parallel_0= ruleParallel ;
    public final EObject ruleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Parallel_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3085:28: (this_Parallel_0= ruleParallel )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3087:5: this_Parallel_0= ruleParallel
            {
             
                    newCompositeNode(grammarAccess.getProcessExpressionAccess().getParallelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleParallel_in_ruleProcessExpression6770);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3106:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3110:2: (iv_ruleParallel= ruleParallel EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel6814);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel6824); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3121:1: ruleParallel returns [EObject current=null] : (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Choice_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3125:28: ( (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3126:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3126:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3127:5: this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getParallelAccess().getChoiceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleChoice_in_ruleParallel6875);
            this_Choice_0=ruleChoice();

            state._fsp--;

             
                    current = this_Choice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3135:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==43) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3135:2: () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3135:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3136:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getParallelAccess().getParallelLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleParallel6896); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3145:1: ( (lv_right_3_0= ruleChoice ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3146:1: (lv_right_3_0= ruleChoice )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3146:1: (lv_right_3_0= ruleChoice )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3147:3: lv_right_3_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleParallel6917);
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
            	    break loop43;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3174:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3178:2: (iv_ruleChoice= ruleChoice EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice6965);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice6975); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3189:1: ruleChoice returns [EObject current=null] : (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryProcess_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3193:28: ( (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3194:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3194:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3195:5: this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getChoiceAccess().getPrimaryProcessParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice7026);
            this_PrimaryProcess_0=rulePrimaryProcess();

            state._fsp--;

             
                    current = this_PrimaryProcess_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3203:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==30) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3203:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3203:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3204:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleChoice7047); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3213:1: ( (lv_right_3_0= rulePrimaryProcess ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3214:1: (lv_right_3_0= rulePrimaryProcess )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3214:1: (lv_right_3_0= rulePrimaryProcess )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3215:3: lv_right_3_0= rulePrimaryProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice7068);
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
            	    break loop44;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3242:1: entryRulePrimaryProcess returns [EObject current=null] : iv_rulePrimaryProcess= rulePrimaryProcess EOF ;
    public final EObject entryRulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3246:2: (iv_rulePrimaryProcess= rulePrimaryProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3247:2: iv_rulePrimaryProcess= rulePrimaryProcess EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProcessRule()); 
            pushFollow(FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess7116);
            iv_rulePrimaryProcess=rulePrimaryProcess();

            state._fsp--;

             current =iv_rulePrimaryProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryProcess7126); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3257:1: rulePrimaryProcess returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3261:28: ( ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3262:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3262:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | ( () ( (otherlv_7= RULE_UPPER ) ) ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt45=1;
                }
                break;
            case 45:
                {
                alt45=2;
                }
                break;
            case 19:
                {
                alt45=3;
                }
                break;
            case RULE_LOWER:
                {
                alt45=4;
                }
                break;
            case RULE_UPPER:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3262:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3262:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3262:3: () ( (lv_value_1_0= 'nil' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3262:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3263:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryProcessAccess().getLeafAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3268:2: ( (lv_value_1_0= 'nil' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3269:1: (lv_value_1_0= 'nil' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3269:1: (lv_value_1_0= 'nil' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3270:3: lv_value_1_0= 'nil'
                    {
                    lv_value_1_0=(Token)match(input,44,FOLLOW_44_in_rulePrimaryProcess7183); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3284:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3284:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3284:7: () ( (lv_value_3_0= 'kill' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3284:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3285:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryProcessAccess().getLeafAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3290:2: ( (lv_value_3_0= 'kill' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3291:1: (lv_value_3_0= 'kill' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3291:1: (lv_value_3_0= 'kill' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3292:3: lv_value_3_0= 'kill'
                    {
                    lv_value_3_0=(Token)match(input,45,FOLLOW_45_in_rulePrimaryProcess7231); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3307:5: this_PredicateProcess_4= rulePredicateProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getPredicateProcessParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateProcess_in_rulePrimaryProcess7273);
                    this_PredicateProcess_4=rulePredicateProcess();

                    state._fsp--;

                     
                            current = this_PredicateProcess_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:5: this_ActionProcess_5= ruleActionProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getActionProcessParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActionProcess_in_rulePrimaryProcess7300);
                    this_ActionProcess_5=ruleActionProcess();

                    state._fsp--;

                     
                            current = this_ActionProcess_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3326:6: ( () ( (otherlv_7= RULE_UPPER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3326:6: ( () ( (otherlv_7= RULE_UPPER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3326:7: () ( (otherlv_7= RULE_UPPER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3326:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3327:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryProcessAccess().getProcessReferenceAction_4_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3332:2: ( (otherlv_7= RULE_UPPER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3333:1: (otherlv_7= RULE_UPPER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3333:1: (otherlv_7= RULE_UPPER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3334:3: otherlv_7= RULE_UPPER
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryProcessRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_rulePrimaryProcess7335); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3356:1: entryRulePredicateProcess returns [EObject current=null] : iv_rulePredicateProcess= rulePredicateProcess EOF ;
    public final EObject entryRulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3360:2: (iv_rulePredicateProcess= rulePredicateProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3361:2: iv_rulePredicateProcess= rulePredicateProcess EOF
            {
             newCompositeNode(grammarAccess.getPredicateProcessRule()); 
            pushFollow(FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess7382);
            iv_rulePredicateProcess=rulePredicateProcess();

            state._fsp--;

             current =iv_rulePredicateProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateProcess7392); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3371:1: rulePredicateProcess returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) ) ;
    public final EObject rulePredicateProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_predicate_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3375:28: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3376:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3376:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3376:2: () ( (lv_predicate_1_0= rulePredicate ) ) ( (otherlv_2= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3376:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3377:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateProcessAccess().getPredicateProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3382:2: ( (lv_predicate_1_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3383:1: (lv_predicate_1_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3383:1: (lv_predicate_1_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3384:3: lv_predicate_1_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_rulePredicateProcess7451);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3400:2: ( (otherlv_2= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3401:1: (otherlv_2= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3401:1: (otherlv_2= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3402:3: otherlv_2= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicateProcessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_rulePredicateProcess7471); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3424:1: entryRuleActionProcess returns [EObject current=null] : iv_ruleActionProcess= ruleActionProcess EOF ;
    public final EObject entryRuleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3428:2: (iv_ruleActionProcess= ruleActionProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3429:2: iv_ruleActionProcess= ruleActionProcess EOF
            {
             newCompositeNode(grammarAccess.getActionProcessRule()); 
            pushFollow(FOLLOW_ruleActionProcess_in_entryRuleActionProcess7517);
            iv_ruleActionProcess=ruleActionProcess();

            state._fsp--;

             current =iv_ruleActionProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionProcess7527); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3439:1: ruleActionProcess returns [EObject current=null] : ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) ) ;
    public final EObject ruleActionProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_action_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3443:28: ( ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3444:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3444:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3444:2: () ( (lv_action_1_0= ruleAction ) ) ( (otherlv_2= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3444:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3445:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionProcessAccess().getActionProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3450:2: ( (lv_action_1_0= ruleAction ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3451:1: (lv_action_1_0= ruleAction )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3451:1: (lv_action_1_0= ruleAction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3452:3: lv_action_1_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleActionProcess7586);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3468:2: ( (otherlv_2= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3469:1: (otherlv_2= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3469:1: (otherlv_2= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3470:3: otherlv_2= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionProcessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleActionProcess7606); 

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


    // $ANTLR start "entryRuleTerm"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3496:2: (iv_ruleTerm= ruleTerm EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3497:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm7652);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm7662); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3507:1: ruleTerm returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3511:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3512:1: (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3512:1: (otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3512:3: otherlv_0= '(' ( (otherlv_1= RULE_UPPER ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_LOWER ) ) otherlv_5= '}' otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTerm7703); 

                	newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3516:1: ( (otherlv_1= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3517:1: (otherlv_1= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3517:1: (otherlv_1= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3518:3: otherlv_1= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTermRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleTerm7723); 

            		newLeafNode(otherlv_1, grammarAccess.getTermAccess().getNameProcessCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleTerm7735); 

                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleTerm7747); 

                	newLeafNode(otherlv_3, grammarAccess.getTermAccess().getLeftCurlyBracketKeyword_3());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3537:1: ( (otherlv_4= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3538:1: (otherlv_4= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3538:1: (otherlv_4= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3539:3: otherlv_4= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTermRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleTerm7767); 

            		newLeafNode(otherlv_4, grammarAccess.getTermAccess().getStoresStoreCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleTerm7779); 

                	newLeafNode(otherlv_5, grammarAccess.getTermAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleTerm7791); 

                	newLeafNode(otherlv_6, grammarAccess.getTermAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleTerm7803); 

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


    // $ANTLR start "entryRuleDouble"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3573:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3574:2: (iv_ruleDouble= ruleDouble EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3575:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble7844);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble7855); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3582:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3585:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3586:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3586:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3586:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7895); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3593:1: (kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==18) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3594:2: kw= '.' this_INT_2= RULE_INT (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )?
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleDouble7914); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7929); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3606:1: (kw= 'e' | (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT ) )?
                    int alt47=3;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==47) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==48) ) {
                        alt47=2;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3607:2: kw= 'e'
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleDouble7948); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3613:6: (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT )
                            {
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3613:6: (kw= 'E' (kw= '-' )? this_INT_6= RULE_INT )
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3614:2: kw= 'E' (kw= '-' )? this_INT_6= RULE_INT
                            {
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleDouble7968); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_1_2_1_0()); 
                                
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3619:1: (kw= '-' )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==29) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3620:2: kw= '-'
                                    {
                                    kw=(Token)match(input,29,FOLLOW_29_in_ruleDouble7982); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_1_2_1_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7999); 

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


    // $ANTLR start "entryRuleNatural"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3640:1: entryRuleNatural returns [String current=null] : iv_ruleNatural= ruleNatural EOF ;
    public final String entryRuleNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNatural = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3641:2: (iv_ruleNatural= ruleNatural EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3642:2: iv_ruleNatural= ruleNatural EOF
            {
             newCompositeNode(grammarAccess.getNaturalRule()); 
            pushFollow(FOLLOW_ruleNatural_in_entryRuleNatural8050);
            iv_ruleNatural=ruleNatural();

            state._fsp--;

             current =iv_ruleNatural.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNatural8061); 

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
    // $ANTLR end "entryRuleNatural"


    // $ANTLR start "ruleNatural"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3649:1: ruleNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAT_0= RULE_NAT ;
    public final AntlrDatatypeRuleToken ruleNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAT_0=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3652:28: (this_NAT_0= RULE_NAT )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3653:5: this_NAT_0= RULE_NAT
            {
            this_NAT_0=(Token)match(input,RULE_NAT,FOLLOW_RULE_NAT_in_ruleNatural8100); 

            		current.merge(this_NAT_0);
                
             
                newLeafNode(this_NAT_0, grammarAccess.getNaturalAccess().getNATTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNatural"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_ruleModel141 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleModel163 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleModel185 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleStore288 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStore305 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleStore326 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStore338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_entryRuleReferencedStore384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedStore394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleReferencedStore452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfReferencedStore508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSelfReferencedStore558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction691 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAction708 = new BitSet(new long[]{0x00000021100C0000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction742 = new BitSet(new long[]{0x00000021100C0000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleAction770 = new BitSet(new long[]{0x0000002110040000L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleAction792 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_ruleUpdates_in_ruleAction814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAction827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePredicate933 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicate954 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePredicate966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_rulePredicateExpression1073 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePredicateExpression1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_entryRulePredicateOr1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateOr1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1191 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulePredicateOr1212 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1233 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAnd1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1342 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePredicateAnd1363 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1384 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateEquality1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1493 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_rulePredicateEquality1522 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_24_in_rulePredicateEquality1551 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1588 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateComparison1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1697 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_rulePredicateComparison1726 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_26_in_rulePredicateComparison1755 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_27_in_rulePredicateComparison1784 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_28_in_rulePredicateComparison1813 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1850 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateSubtraction1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction1959 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePredicateSubtraction1980 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2001 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAddition2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2110 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulePredicateAddition2131 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2152 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateMultiplication2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2261 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_rulePredicateMultiplication2282 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2303 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDivision2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2412 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rulePredicateDivision2433 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2454 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicatePrimary2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePredicatePrimary2554 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2576 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePredicatePrimary2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePredicatePrimary2616 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtomic2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_rulePredicateAtomic2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePredicateAtomic2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePredicateAtomic2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_rulePredicateAtomic2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_rulePredicateAtomic2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArguments3016 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments3046 = new BitSet(new long[]{0x0000001F00010090L});
    public static final BitSet FOLLOW_33_in_ruleArguments3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleArguments3079 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3109 = new BitSet(new long[]{0x0000001D08010090L});
    public static final BitSet FOLLOW_27_in_ruleArguments3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInArguments_in_entryRuleInArguments3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInArguments3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleInArguments3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutArguments_in_entryRuleOutArguments3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutArguments3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_ruleOutArguments3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_entryRuleExpressions3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressions3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleExpressions3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleExpressions3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleExpressions3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleVariables3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleVariables3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdates_in_entryRuleUpdates3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdates3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUpdates3730 = new BitSet(new long[]{0x0000031D00010090L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates3751 = new BitSet(new long[]{0x0000035D00010090L});
    public static final BitSet FOLLOW_38_in_ruleUpdates3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate3810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_ruleUpdate3872 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate3899 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUpdate3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate3957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEventUpdate3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleSingleEventUpdate4026 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSingleEventUpdate4038 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributedEventUpdate4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDistributedEventUpdate4166 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDistributedEventUpdate4178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4199 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDistributedEventUpdate4241 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDistributedEventUpdate4253 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4274 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDistribution4402 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDistribution4414 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleDistribution4435 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDistribution4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniform_in_entryRuleUniform4493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniform4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleUniform4562 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUniform4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression4620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpression4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateOr_in_ruleUpdateExpression4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateOr_in_entryRuleUpdateOr4724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateOr4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAnd_in_ruleUpdateOr4785 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleUpdateOr4806 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateAnd_in_ruleUpdateOr4827 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleUpdateAnd_in_entryRuleUpdateAnd4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAnd4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateEquality_in_ruleUpdateAnd4936 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleUpdateAnd4957 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateEquality_in_ruleUpdateAnd4978 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleUpdateEquality_in_entryRuleUpdateEquality5026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateEquality5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateComparison_in_ruleUpdateEquality5087 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleUpdateEquality5116 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_24_in_ruleUpdateEquality5145 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateComparison_in_ruleUpdateEquality5182 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleUpdateComparison_in_entryRuleUpdateComparison5230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateComparison5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_ruleUpdateComparison5291 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_ruleUpdateComparison5320 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_26_in_ruleUpdateComparison5349 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_27_in_ruleUpdateComparison5378 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_28_in_ruleUpdateComparison5407 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_ruleUpdateComparison5444 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction5492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateSubtraction5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5553 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleUpdateSubtraction5574 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5595 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAddition5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5704 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleUpdateAddition5725 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5746 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication5794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateMultiplication5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5855 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleUpdateMultiplication5876 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5897 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision5945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateDivision5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6006 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleUpdateDivision6027 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6048 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary6096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdatePrimary6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUpdatePrimary6148 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary6170 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleUpdatePrimary6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleUpdatePrimary6210 = new BitSet(new long[]{0x0000001D00010090L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdatePrimary6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic6305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAtomic6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUpdateAtomic6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUpdateAtomic6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUpdateAtomic6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleUpdateAtomic6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleUpdateAtomic6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess6558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleProcess6614 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcess6631 = new BitSet(new long[]{0x0000300000080030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleProcess6652 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcess6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression6710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessExpression6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleProcessExpression6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel6814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel6875 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleParallel6896 = new BitSet(new long[]{0x0000300000080030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel6917 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice6965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice7026 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleChoice7047 = new BitSet(new long[]{0x0000300000080030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice7068 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess7116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryProcess7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrimaryProcess7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrimaryProcess7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_rulePrimaryProcess7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_rulePrimaryProcess7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_rulePrimaryProcess7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess7382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateProcess7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateProcess7451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_UPPER_in_rulePredicateProcess7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_entryRuleActionProcess7517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionProcess7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionProcess7586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleActionProcess7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm7652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTerm7703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleTerm7723 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTerm7735 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTerm7747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleTerm7767 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTerm7779 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerm7791 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTerm7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble7844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7895 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDouble7914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7929 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_ruleDouble7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDouble7968 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDouble7982 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_entryRuleNatural8050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNatural8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAT_in_ruleNatural8100 = new BitSet(new long[]{0x0000000000000002L});

}