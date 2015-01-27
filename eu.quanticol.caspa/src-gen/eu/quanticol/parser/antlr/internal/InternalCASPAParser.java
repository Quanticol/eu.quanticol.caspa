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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER", "RULE_UPPER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'this.'", "'*'", "'.'", "'['", "']'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'-'", "'+'", "'/'", "'('", "')'", "'!'", "','", "'{'", "';'", "'}'", "':='", "'Pr'", "'U'", "':'", "'|'", "'nil'", "'kill'", "'^'", "'True'", "'False'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_LOWER=4;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_UPPER=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:82:1: ruleModel returns [EObject current=null] : ( ( (lv_terms_0_0= ruleTerm ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;

        EObject lv_processes_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:86:28: ( ( ( (lv_terms_0_0= ruleTerm ) )+ ( (lv_processes_1_0= ruleProcess ) )+ ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:1: ( ( (lv_terms_0_0= ruleTerm ) )+ ( (lv_processes_1_0= ruleProcess ) )+ )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:1: ( ( (lv_terms_0_0= ruleTerm ) )+ ( (lv_processes_1_0= ruleProcess ) )+ )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:2: ( (lv_terms_0_0= ruleTerm ) )+ ( (lv_processes_1_0= ruleProcess ) )+
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:87:2: ( (lv_terms_0_0= ruleTerm ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:88:1: (lv_terms_0_0= ruleTerm )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:88:1: (lv_terms_0_0= ruleTerm )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:89:3: lv_terms_0_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTermsTermParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleModel141);
            	    lv_terms_0_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_0_0, 
            	            		"Term");
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:134:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:138:2: (iv_ruleStore= ruleStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:139:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore210);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore220); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:149:1: ruleStore returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '=' ( (lv_value_3_0= ruleNatural ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:153:28: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '=' ( (lv_value_3_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '=' ( (lv_value_3_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '=' ( (lv_value_3_0= ruleNatural ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:2: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '=' ( (lv_value_3_0= ruleNatural ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:155:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStoreAccess().getStoreAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:160:2: ( (lv_name_1_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:161:1: (lv_name_1_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:161:1: (lv_name_1_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:162:3: lv_name_1_0= RULE_LOWER
            {
            lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleStore275); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStoreAccess().getNameLOWERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"LOWER");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStore292); 

                	newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:182:1: ( (lv_value_3_0= ruleNatural ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:183:1: (lv_value_3_0= ruleNatural )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:183:1: (lv_value_3_0= ruleNatural )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:184:3: lv_value_3_0= ruleNatural
            {
             
            	        newCompositeNode(grammarAccess.getStoreAccess().getValueNaturalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNatural_in_ruleStore313);
            lv_value_3_0=ruleNatural();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoreRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Natural");
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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleReferencedStore"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:211:1: entryRuleReferencedStore returns [EObject current=null] : iv_ruleReferencedStore= ruleReferencedStore EOF ;
    public final EObject entryRuleReferencedStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:215:2: (iv_ruleReferencedStore= ruleReferencedStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:216:2: iv_ruleReferencedStore= ruleReferencedStore EOF
            {
             newCompositeNode(grammarAccess.getReferencedStoreRule()); 
            pushFollow(FOLLOW_ruleReferencedStore_in_entryRuleReferencedStore359);
            iv_ruleReferencedStore=ruleReferencedStore();

            state._fsp--;

             current =iv_ruleReferencedStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedStore369); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:226:1: ruleReferencedStore returns [EObject current=null] : ( () ( (otherlv_1= RULE_LOWER ) ) ) ;
    public final EObject ruleReferencedStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:230:28: ( ( () ( (otherlv_1= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:1: ( () ( (otherlv_1= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:1: ( () ( (otherlv_1= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:2: () ( (otherlv_1= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferencedStoreAccess().getReferencedStoreAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:237:2: ( (otherlv_1= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:238:1: (otherlv_1= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:238:1: (otherlv_1= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:239:3: otherlv_1= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedStoreRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleReferencedStore427); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:261:1: entryRuleSelfReferencedStore returns [EObject current=null] : iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF ;
    public final EObject entryRuleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReferencedStore = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:265:2: (iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:266:2: iv_ruleSelfReferencedStore= ruleSelfReferencedStore EOF
            {
             newCompositeNode(grammarAccess.getSelfReferencedStoreRule()); 
            pushFollow(FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore473);
            iv_ruleSelfReferencedStore=ruleSelfReferencedStore();

            state._fsp--;

             current =iv_ruleSelfReferencedStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfReferencedStore483); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:276:1: ruleSelfReferencedStore returns [EObject current=null] : ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) ;
    public final EObject ruleSelfReferencedStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:280:28: ( ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:281:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:281:1: ( () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:281:2: () otherlv_1= 'this.' ( (otherlv_2= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:281:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:282:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelfReferencedStoreAccess().getSelfReferencedStoreAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSelfReferencedStore533); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfReferencedStoreAccess().getThisKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:291:1: ( (otherlv_2= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:292:1: (otherlv_2= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:292:1: (otherlv_2= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:293:3: otherlv_2= RULE_LOWER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfReferencedStoreRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore553); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:315:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:319:2: (iv_ruleAction= ruleAction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:320:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction599);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction609); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:330:1: ruleAction returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:334:28: ( ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LOWER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:4: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:336:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getBroadcastAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:341:2: ( (lv_name_1_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:342:1: (lv_name_1_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:342:1: (lv_name_1_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:343:3: lv_name_1_0= RULE_LOWER
                    {
                    lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction666); 

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

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAction683); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getAsteriskKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:364:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:364:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:364:7: () ( (lv_name_4_0= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:364:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:365:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getUnicastAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:370:2: ( (lv_name_4_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:371:1: (lv_name_4_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:371:1: (lv_name_4_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:372:3: lv_name_4_0= RULE_LOWER
                    {
                    lv_name_4_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction717); 

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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:388:4: ( (lv_predicate_5_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:389:1: (lv_predicate_5_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:389:1: (lv_predicate_5_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:390:3: lv_predicate_5_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_ruleAction745);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:406:2: ( (lv_arguments_6_0= ruleArguments ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:407:1: (lv_arguments_6_0= ruleArguments )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:407:1: (lv_arguments_6_0= ruleArguments )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:408:3: lv_arguments_6_0= ruleArguments
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArguments_in_ruleAction766);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:424:2: ( (lv_updates_7_0= ruleUpdates ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:425:1: (lv_updates_7_0= ruleUpdates )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:425:1: (lv_updates_7_0= ruleUpdates )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:426:3: lv_updates_7_0= ruleUpdates
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getUpdatesUpdatesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdates_in_ruleAction787);
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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleAction800); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:457:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:461:2: (iv_rulePredicate= rulePredicate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:462:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate846);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate856); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:472:1: rulePredicate returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:476:28: ( ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:477:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:477:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:477:2: () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:477:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:478:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateAccess().getPredicateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePredicate906); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:487:1: ( (lv_predicate_2_0= rulePredicateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:488:1: (lv_predicate_2_0= rulePredicateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:488:1: (lv_predicate_2_0= rulePredicateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:489:3: lv_predicate_2_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicate927);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePredicate939); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:520:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:524:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:525:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression985);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression995); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:535:1: rulePredicateExpression returns [EObject current=null] : this_PredicateOr_0= rulePredicateOr ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:539:28: (this_PredicateOr_0= rulePredicateOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:541:5: this_PredicateOr_0= rulePredicateOr
            {
             
                    newCompositeNode(grammarAccess.getPredicateExpressionAccess().getPredicateOrParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePredicateOr_in_rulePredicateExpression1045);
            this_PredicateOr_0=rulePredicateOr();

            state._fsp--;

             
                    current = this_PredicateOr_0; 
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
    // $ANTLR end "rulePredicateExpression"


    // $ANTLR start "entryRulePredicateOr"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:560:1: entryRulePredicateOr returns [EObject current=null] : iv_rulePredicateOr= rulePredicateOr EOF ;
    public final EObject entryRulePredicateOr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:564:2: (iv_rulePredicateOr= rulePredicateOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:565:2: iv_rulePredicateOr= rulePredicateOr EOF
            {
             newCompositeNode(grammarAccess.getPredicateOrRule()); 
            pushFollow(FOLLOW_rulePredicateOr_in_entryRulePredicateOr1089);
            iv_rulePredicateOr=rulePredicateOr();

            state._fsp--;

             current =iv_rulePredicateOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateOr1099); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:575:1: rulePredicateOr returns [EObject current=null] : (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) ;
    public final EObject rulePredicateOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:579:28: ( (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:580:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:580:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:581:5: this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateOrAccess().getPredicateAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1150);
            this_PredicateAnd_0=rulePredicateAnd();

            state._fsp--;

             
                    current = this_PredicateAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:589:1: ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:589:2: () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:589:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:590:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePredicateOr1171); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:599:1: ( (lv_right_3_0= rulePredicateAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:600:1: (lv_right_3_0= rulePredicateAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:600:1: (lv_right_3_0= rulePredicateAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:601:3: lv_right_3_0= rulePredicateAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateOrAccess().getRightPredicateAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1192);
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
    // $ANTLR end "rulePredicateOr"


    // $ANTLR start "entryRulePredicateAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:628:1: entryRulePredicateAnd returns [EObject current=null] : iv_rulePredicateAnd= rulePredicateAnd EOF ;
    public final EObject entryRulePredicateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:632:2: (iv_rulePredicateAnd= rulePredicateAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:633:2: iv_rulePredicateAnd= rulePredicateAnd EOF
            {
             newCompositeNode(grammarAccess.getPredicateAndRule()); 
            pushFollow(FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1240);
            iv_rulePredicateAnd=rulePredicateAnd();

            state._fsp--;

             current =iv_rulePredicateAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAnd1250); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:643:1: rulePredicateAnd returns [EObject current=null] : (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) ;
    public final EObject rulePredicateAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:647:28: ( (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:648:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:648:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:649:5: this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAndAccess().getPredicateEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1301);
            this_PredicateEquality_0=rulePredicateEquality();

            state._fsp--;

             
                    current = this_PredicateEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:657:1: ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:657:2: () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:657:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:658:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePredicateAnd1322); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:667:1: ( (lv_right_3_0= rulePredicateEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:668:1: (lv_right_3_0= rulePredicateEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:668:1: (lv_right_3_0= rulePredicateEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:669:3: lv_right_3_0= rulePredicateEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAndAccess().getRightPredicateEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1343);
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
            	    break loop6;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:696:1: entryRulePredicateEquality returns [EObject current=null] : iv_rulePredicateEquality= rulePredicateEquality EOF ;
    public final EObject entryRulePredicateEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:700:2: (iv_rulePredicateEquality= rulePredicateEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:701:2: iv_rulePredicateEquality= rulePredicateEquality EOF
            {
             newCompositeNode(grammarAccess.getPredicateEqualityRule()); 
            pushFollow(FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1391);
            iv_rulePredicateEquality=rulePredicateEquality();

            state._fsp--;

             current =iv_rulePredicateEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateEquality1401); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:711:1: rulePredicateEquality returns [EObject current=null] : (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) ;
    public final EObject rulePredicateEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PredicateComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:715:28: ( (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:716:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:716:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:717:5: this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateEqualityAccess().getPredicateComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1452);
            this_PredicateComparison_0=rulePredicateComparison();

            state._fsp--;

             
                    current = this_PredicateComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:725:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:725:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:725:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:726:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:731:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:732:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:732:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:733:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:733:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==22) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:734:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_21_in_rulePredicateEquality1481); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:746:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_22_in_rulePredicateEquality1510); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:761:2: ( (lv_right_3_0= rulePredicateComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:762:1: (lv_right_3_0= rulePredicateComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:762:1: (lv_right_3_0= rulePredicateComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:763:3: lv_right_3_0= rulePredicateComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateEqualityAccess().getRightPredicateComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1547);
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
    // $ANTLR end "rulePredicateEquality"


    // $ANTLR start "entryRulePredicateComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:790:1: entryRulePredicateComparison returns [EObject current=null] : iv_rulePredicateComparison= rulePredicateComparison EOF ;
    public final EObject entryRulePredicateComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:794:2: (iv_rulePredicateComparison= rulePredicateComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:795:2: iv_rulePredicateComparison= rulePredicateComparison EOF
            {
             newCompositeNode(grammarAccess.getPredicateComparisonRule()); 
            pushFollow(FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1595);
            iv_rulePredicateComparison=rulePredicateComparison();

            state._fsp--;

             current =iv_rulePredicateComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateComparison1605); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:805:1: rulePredicateComparison returns [EObject current=null] : (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:809:28: ( (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:810:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:810:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:811:5: this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateComparisonAccess().getPredicateSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1656);
            this_PredicateSubtraction_0=rulePredicateSubtraction();

            state._fsp--;

             
                    current = this_PredicateSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:819:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:819:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:819:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:820:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:825:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:826:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:826:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:827:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:827:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt9=4;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:828:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_rulePredicateComparison1685); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:840:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_rulePredicateComparison1714); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getPredicateComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:852:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,25,FOLLOW_25_in_rulePredicateComparison1743); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:864:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,26,FOLLOW_26_in_rulePredicateComparison1772); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:879:2: ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:880:1: (lv_right_3_0= rulePredicateSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:880:1: (lv_right_3_0= rulePredicateSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:881:3: lv_right_3_0= rulePredicateSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateComparisonAccess().getRightPredicateSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1809);
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
            	    break loop10;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:908:1: entryRulePredicateSubtraction returns [EObject current=null] : iv_rulePredicateSubtraction= rulePredicateSubtraction EOF ;
    public final EObject entryRulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:912:2: (iv_rulePredicateSubtraction= rulePredicateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:913:2: iv_rulePredicateSubtraction= rulePredicateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getPredicateSubtractionRule()); 
            pushFollow(FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction1857);
            iv_rulePredicateSubtraction=rulePredicateSubtraction();

            state._fsp--;

             current =iv_rulePredicateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateSubtraction1867); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:923:1: rulePredicateSubtraction returns [EObject current=null] : (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) ;
    public final EObject rulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:927:28: ( (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:928:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:928:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:929:5: this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getPredicateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction1918);
            this_PredicateAddition_0=rulePredicateAddition();

            state._fsp--;

             
                    current = this_PredicateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:937:1: ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:937:2: () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:937:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:938:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePredicateSubtraction1939); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:947:1: ( (lv_right_3_0= rulePredicateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:948:1: (lv_right_3_0= rulePredicateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:948:1: (lv_right_3_0= rulePredicateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:949:3: lv_right_3_0= rulePredicateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getRightPredicateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction1960);
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
    // $ANTLR end "rulePredicateSubtraction"


    // $ANTLR start "entryRulePredicateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:976:1: entryRulePredicateAddition returns [EObject current=null] : iv_rulePredicateAddition= rulePredicateAddition EOF ;
    public final EObject entryRulePredicateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:980:2: (iv_rulePredicateAddition= rulePredicateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:981:2: iv_rulePredicateAddition= rulePredicateAddition EOF
            {
             newCompositeNode(grammarAccess.getPredicateAdditionRule()); 
            pushFollow(FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2008);
            iv_rulePredicateAddition=rulePredicateAddition();

            state._fsp--;

             current =iv_rulePredicateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAddition2018); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:991:1: rulePredicateAddition returns [EObject current=null] : (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) ;
    public final EObject rulePredicateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:995:28: ( (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:996:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:996:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:997:5: this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAdditionAccess().getPredicateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2069);
            this_PredicateMultiplication_0=rulePredicateMultiplication();

            state._fsp--;

             
                    current = this_PredicateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1005:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1005:2: () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1005:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1006:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePredicateAddition2090); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1015:1: ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1016:1: (lv_right_3_0= rulePredicateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1016:1: (lv_right_3_0= rulePredicateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1017:3: lv_right_3_0= rulePredicateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAdditionAccess().getRightPredicateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2111);
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
            	    break loop12;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1044:1: entryRulePredicateMultiplication returns [EObject current=null] : iv_rulePredicateMultiplication= rulePredicateMultiplication EOF ;
    public final EObject entryRulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1048:2: (iv_rulePredicateMultiplication= rulePredicateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1049:2: iv_rulePredicateMultiplication= rulePredicateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getPredicateMultiplicationRule()); 
            pushFollow(FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2159);
            iv_rulePredicateMultiplication=rulePredicateMultiplication();

            state._fsp--;

             current =iv_rulePredicateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateMultiplication2169); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1059:1: rulePredicateMultiplication returns [EObject current=null] : (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) ;
    public final EObject rulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1063:28: ( (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1064:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1064:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1065:5: this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getPredicateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2220);
            this_PredicateDivision_0=rulePredicateDivision();

            state._fsp--;

             
                    current = this_PredicateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1073:1: ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1073:2: () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1073:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1074:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePredicateMultiplication2241); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1083:1: ( (lv_right_3_0= rulePredicateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1084:1: (lv_right_3_0= rulePredicateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1084:1: (lv_right_3_0= rulePredicateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1085:3: lv_right_3_0= rulePredicateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getRightPredicateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2262);
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
    // $ANTLR end "rulePredicateMultiplication"


    // $ANTLR start "entryRulePredicateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1112:1: entryRulePredicateDivision returns [EObject current=null] : iv_rulePredicateDivision= rulePredicateDivision EOF ;
    public final EObject entryRulePredicateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1116:2: (iv_rulePredicateDivision= rulePredicateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1117:2: iv_rulePredicateDivision= rulePredicateDivision EOF
            {
             newCompositeNode(grammarAccess.getPredicateDivisionRule()); 
            pushFollow(FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2310);
            iv_rulePredicateDivision=rulePredicateDivision();

            state._fsp--;

             current =iv_rulePredicateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDivision2320); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1127:1: rulePredicateDivision returns [EObject current=null] : (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) ;
    public final EObject rulePredicateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1131:28: ( (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1132:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1132:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1133:5: this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateDivisionAccess().getPredicatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2371);
            this_PredicatePrimary_0=rulePredicatePrimary();

            state._fsp--;

             
                    current = this_PredicatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1141:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1141:2: () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1141:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1142:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePredicateDivision2392); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1151:1: ( (lv_right_3_0= rulePredicatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1152:1: (lv_right_3_0= rulePredicatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1152:1: (lv_right_3_0= rulePredicatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1153:3: lv_right_3_0= rulePredicatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateDivisionAccess().getRightPredicatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2413);
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
    // $ANTLR end "rulePredicateDivision"


    // $ANTLR start "entryRulePredicatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1180:1: entryRulePredicatePrimary returns [EObject current=null] : iv_rulePredicatePrimary= rulePredicatePrimary EOF ;
    public final EObject entryRulePredicatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1184:2: (iv_rulePredicatePrimary= rulePredicatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1185:2: iv_rulePredicatePrimary= rulePredicatePrimary EOF
            {
             newCompositeNode(grammarAccess.getPredicatePrimaryRule()); 
            pushFollow(FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2461);
            iv_rulePredicatePrimary=rulePredicatePrimary();

            state._fsp--;

             current =iv_rulePredicatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicatePrimary2471); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1195:1: rulePredicatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1199:28: ( ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case RULE_LOWER:
            case RULE_INT:
            case 14:
            case 45:
            case 46:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:4: otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePredicatePrimary2513); 

                        	newLeafNode(otherlv_0, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2535);
                    this_PredicateExpression_1=rulePredicateExpression();

                    state._fsp--;

                     
                            current = this_PredicateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePredicatePrimary2546); 

                        	newLeafNode(otherlv_2, grammarAccess.getPredicatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1218:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1219:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicatePrimaryAccess().getPredicateNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulePredicatePrimary2575); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredicatePrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1228:1: ( (lv_expression_5_0= rulePredicatePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1229:1: (lv_expression_5_0= rulePredicatePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1229:1: (lv_expression_5_0= rulePredicatePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1230:3: lv_expression_5_0= rulePredicatePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getExpressionPredicatePrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2596);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1248:5: this_PredicateAtomic_6= rulePredicateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2625);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1267:1: entryRulePredicateAtomic returns [EObject current=null] : iv_rulePredicateAtomic= rulePredicateAtomic EOF ;
    public final EObject entryRulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1271:2: (iv_rulePredicateAtomic= rulePredicateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1272:2: iv_rulePredicateAtomic= rulePredicateAtomic EOF
            {
             newCompositeNode(grammarAccess.getPredicateAtomicRule()); 
            pushFollow(FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2670);
            iv_rulePredicateAtomic=rulePredicateAtomic();

            state._fsp--;

             current =iv_rulePredicateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtomic2680); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1282:1: rulePredicateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) ;
    public final EObject rulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject this_ReferencedStore_4 = null;

        EObject this_SelfReferencedStore_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1286:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case 45:
            case 46:
                {
                alt16=2;
                }
                break;
            case RULE_LOWER:
                {
                alt16=3;
                }
                break;
            case 14:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1287:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1288:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1293:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1294:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1294:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1295:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_rulePredicateAtomic2740);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1312:6: ( () ( (lv_value_3_0= ruleBool ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1312:6: ( () ( (lv_value_3_0= ruleBool ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1312:7: () ( (lv_value_3_0= ruleBool ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1312:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1313:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getBooleanConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1318:2: ( (lv_value_3_0= ruleBool ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1319:1: (lv_value_3_0= ruleBool )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1319:1: (lv_value_3_0= ruleBool )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1320:3: lv_value_3_0= ruleBool
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueBoolParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBool_in_rulePredicateAtomic2778);
                    lv_value_3_0=ruleBool();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredicateAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Bool");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1338:5: this_ReferencedStore_4= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getReferencedStoreParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_rulePredicateAtomic2807);
                    this_ReferencedStore_4=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1348:5: this_SelfReferencedStore_5= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getSelfReferencedStoreParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_rulePredicateAtomic2834);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1367:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1371:2: (iv_ruleArguments= ruleArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1372:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments2879);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments2889); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1382:1: ruleArguments returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;

        EObject lv_expressions_8_0 = null;

        EObject lv_expressions_10_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1386:28: ( ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:4: otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleArguments2931); 

                        	newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1391:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1392:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getInAction_0_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1397:2: ( (lv_expressions_2_0= ruleInArguments ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1398:1: (lv_expressions_2_0= ruleInArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1398:1: (lv_expressions_2_0= ruleInArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1399:3: lv_expressions_2_0= ruleInArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments2961);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1415:2: (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==33) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1415:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleArguments2974); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getCommaKeyword_0_3_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1419:1: ( (lv_expressions_4_0= ruleInArguments ) )+
                    	    int cnt17=0;
                    	    loop17:
                    	    do {
                    	        int alt17=2;
                    	        int LA17_0 = input.LA(1);

                    	        if ( (LA17_0==RULE_LOWER||LA17_0==RULE_INT||LA17_0==14) ) {
                    	            alt17=1;
                    	        }


                    	        switch (alt17) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1420:1: (lv_expressions_4_0= ruleInArguments )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1420:1: (lv_expressions_4_0= ruleInArguments )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1421:3: lv_expressions_4_0= ruleInArguments
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_3_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments2995);
                    	    	    lv_expressions_4_0=ruleInArguments();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"expressions",
                    	    	            		lv_expressions_4_0, 
                    	    	            		"InArguments");
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


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleArguments3010); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1442:6: (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1442:6: (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1442:8: otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleArguments3030); 

                        	newLeafNode(otherlv_6, grammarAccess.getArgumentsAccess().getLessThanSignKeyword_1_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1446:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1447:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getOutAction_1_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1452:2: ( (lv_expressions_8_0= ruleOutArguments ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1453:1: (lv_expressions_8_0= ruleOutArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1453:1: (lv_expressions_8_0= ruleOutArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1454:3: lv_expressions_8_0= ruleOutArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3060);
                    lv_expressions_8_0=ruleOutArguments();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_8_0, 
                            		"OutArguments");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1470:2: (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==33) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1470:4: otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+
                    	    {
                    	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleArguments3073); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getArgumentsAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1474:1: ( (lv_expressions_10_0= ruleOutArguments ) )+
                    	    int cnt19=0;
                    	    loop19:
                    	    do {
                    	        int alt19=2;
                    	        int LA19_0 = input.LA(1);

                    	        if ( (LA19_0==RULE_LOWER||LA19_0==RULE_INT||LA19_0==14) ) {
                    	            alt19=1;
                    	        }


                    	        switch (alt19) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1475:1: (lv_expressions_10_0= ruleOutArguments )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1475:1: (lv_expressions_10_0= ruleOutArguments )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1476:3: lv_expressions_10_0= ruleOutArguments
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_1_3_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3094);
                    	    	    lv_expressions_10_0=ruleOutArguments();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"expressions",
                    	    	            		lv_expressions_10_0, 
                    	    	            		"OutArguments");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt19 >= 1 ) break loop19;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(19, input);
                    	                throw eee;
                    	        }
                    	        cnt19++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleArguments3109); 

                        	newLeafNode(otherlv_11, grammarAccess.getArgumentsAccess().getGreaterThanSignKeyword_1_4());
                        

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1507:1: entryRuleInArguments returns [EObject current=null] : iv_ruleInArguments= ruleInArguments EOF ;
    public final EObject entryRuleInArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1511:2: (iv_ruleInArguments= ruleInArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1512:2: iv_ruleInArguments= ruleInArguments EOF
            {
             newCompositeNode(grammarAccess.getInArgumentsRule()); 
            pushFollow(FOLLOW_ruleInArguments_in_entryRuleInArguments3156);
            iv_ruleInArguments=ruleInArguments();

            state._fsp--;

             current =iv_ruleInArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInArguments3166); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1522:1: ruleInArguments returns [EObject current=null] : this_Variables_0= ruleVariables ;
    public final EObject ruleInArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Variables_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1526:28: (this_Variables_0= ruleVariables )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1528:5: this_Variables_0= ruleVariables
            {
             
                    newCompositeNode(grammarAccess.getInArgumentsAccess().getVariablesParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariables_in_ruleInArguments3216);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1547:1: entryRuleOutArguments returns [EObject current=null] : iv_ruleOutArguments= ruleOutArguments EOF ;
    public final EObject entryRuleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1551:2: (iv_ruleOutArguments= ruleOutArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1552:2: iv_ruleOutArguments= ruleOutArguments EOF
            {
             newCompositeNode(grammarAccess.getOutArgumentsRule()); 
            pushFollow(FOLLOW_ruleOutArguments_in_entryRuleOutArguments3260);
            iv_ruleOutArguments=ruleOutArguments();

            state._fsp--;

             current =iv_ruleOutArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutArguments3270); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1562:1: ruleOutArguments returns [EObject current=null] : this_Expressions_0= ruleExpressions ;
    public final EObject ruleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Expressions_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1566:28: (this_Expressions_0= ruleExpressions )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1568:5: this_Expressions_0= ruleExpressions
            {
             
                    newCompositeNode(grammarAccess.getOutArgumentsAccess().getExpressionsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpressions_in_ruleOutArguments3320);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1587:1: entryRuleExpressions returns [EObject current=null] : iv_ruleExpressions= ruleExpressions EOF ;
    public final EObject entryRuleExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressions = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1591:2: (iv_ruleExpressions= ruleExpressions EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1592:2: iv_ruleExpressions= ruleExpressions EOF
            {
             newCompositeNode(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_ruleExpressions_in_entryRuleExpressions3364);
            iv_ruleExpressions=ruleExpressions();

            state._fsp--;

             current =iv_ruleExpressions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressions3374); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1602:1: ruleExpressions returns [EObject current=null] : (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) ) ;
    public final EObject ruleExpressions() throws RecognitionException {
        EObject current = null;

        EObject this_SelfReferencedStore_0 = null;

        EObject this_ReferencedStore_1 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1606:28: ( (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1607:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1607:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt22=1;
                }
                break;
            case RULE_LOWER:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1608:5: this_SelfReferencedStore_0= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionsAccess().getSelfReferencedStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleExpressions3425);
                    this_SelfReferencedStore_0=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1618:5: this_ReferencedStore_1= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionsAccess().getReferencedStoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleExpressions3452);
                    this_ReferencedStore_1=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1627:6: ( () ( (lv_value_3_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1627:6: ( () ( (lv_value_3_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1627:7: () ( (lv_value_3_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1627:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1628:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpressionsAccess().getConstantAction_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1633:2: ( (lv_value_3_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1634:1: (lv_value_3_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1634:1: (lv_value_3_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1635:3: lv_value_3_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionsAccess().getValueNaturalParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleExpressions3488);
                    lv_value_3_0=ruleNatural();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionsRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Natural");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleExpressions"


    // $ANTLR start "entryRuleVariables"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1662:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1666:2: (iv_ruleVariables= ruleVariables EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1667:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables3535);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables3545); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1677:1: ruleVariables returns [EObject current=null] : (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_SelfReferencedStore_0 = null;

        EObject this_ReferencedStore_1 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1681:28: ( (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1682:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1682:1: (this_SelfReferencedStore_0= ruleSelfReferencedStore | this_ReferencedStore_1= ruleReferencedStore | ( () ( (lv_value_3_0= ruleNatural ) ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt23=1;
                }
                break;
            case RULE_LOWER:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1683:5: this_SelfReferencedStore_0= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getSelfReferencedStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleVariables3596);
                    this_SelfReferencedStore_0=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1693:5: this_ReferencedStore_1= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getReferencedStoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleVariables3623);
                    this_ReferencedStore_1=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1702:6: ( () ( (lv_value_3_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1702:6: ( () ( (lv_value_3_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1702:7: () ( (lv_value_3_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1702:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1703:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesAccess().getConstantAction_2_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1708:2: ( (lv_value_3_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1709:1: (lv_value_3_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1709:1: (lv_value_3_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1710:3: lv_value_3_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesAccess().getValueNaturalParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleVariables3659);
                    lv_value_3_0=ruleNatural();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Natural");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleUpdates"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1737:1: entryRuleUpdates returns [EObject current=null] : iv_ruleUpdates= ruleUpdates EOF ;
    public final EObject entryRuleUpdates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdates = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1741:2: (iv_ruleUpdates= ruleUpdates EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1742:2: iv_ruleUpdates= ruleUpdates EOF
            {
             newCompositeNode(grammarAccess.getUpdatesRule()); 
            pushFollow(FOLLOW_ruleUpdates_in_entryRuleUpdates3706);
            iv_ruleUpdates=ruleUpdates();

            state._fsp--;

             current =iv_ruleUpdates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdates3716); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1752:1: ruleUpdates returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' ) ;
    public final EObject ruleUpdates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_updates_2_0 = null;

        EObject lv_updates_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1756:28: ( ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1757:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1757:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1757:2: () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1757:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1758:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdatesAccess().getUpdatesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleUpdates3766); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdatesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1767:1: ( (lv_updates_2_0= ruleUpdate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1768:1: (lv_updates_2_0= ruleUpdate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1768:1: (lv_updates_2_0= ruleUpdate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1769:3: lv_updates_2_0= ruleUpdate
            {
             
            	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates3787);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1785:2: (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1785:4: otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleUpdates3800); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUpdatesAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1789:1: ( (lv_updates_4_0= ruleUpdate ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==14) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1790:1: (lv_updates_4_0= ruleUpdate )
            	    	    {
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1790:1: (lv_updates_4_0= ruleUpdate )
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1791:3: lv_updates_4_0= ruleUpdate
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates3821);
            	    	    lv_updates_4_0=ruleUpdate();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getUpdatesRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"updates",
            	    	            		lv_updates_4_0, 
            	    	            		"Update");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleUpdates3836); 

                	newLeafNode(otherlv_5, grammarAccess.getUpdatesAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1822:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1826:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1827:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate3882);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate3892); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1837:1: ruleUpdate returns [EObject current=null] : (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        EObject this_DistributedEventUpdate_0 = null;

        EObject this_SingleEventUpdate_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1841:28: ( (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1842:1: (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1842:1: (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_LOWER) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==37) ) {
                        int LA26_3 = input.LA(4);

                        if ( ((LA26_3>=38 && LA26_3<=39)) ) {
                            alt26=1;
                        }
                        else if ( (LA26_3==RULE_LOWER||LA26_3==RULE_INT||LA26_3==14||LA26_3==30) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1843:5: this_DistributedEventUpdate_0= ruleDistributedEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getDistributedEventUpdateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate3943);
                    this_DistributedEventUpdate_0=ruleDistributedEventUpdate();

                    state._fsp--;

                     
                            current = this_DistributedEventUpdate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1853:5: this_SingleEventUpdate_1= ruleSingleEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getSingleEventUpdateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSingleEventUpdate_in_ruleUpdate3970);
                    this_SingleEventUpdate_1=ruleSingleEventUpdate();

                    state._fsp--;

                     
                            current = this_SingleEventUpdate_1; 
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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleSingleEventUpdate"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1872:1: entryRuleSingleEventUpdate returns [EObject current=null] : iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF ;
    public final EObject entryRuleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1876:2: (iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1877:2: iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getSingleEventUpdateRule()); 
            pushFollow(FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate4015);
            iv_ruleSingleEventUpdate=ruleSingleEventUpdate();

            state._fsp--;

             current =iv_ruleSingleEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEventUpdate4025); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1887:1: ruleSingleEventUpdate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) ) ;
    public final EObject ruleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1891:28: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1892:1: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1892:1: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1892:2: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1892:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleEventUpdateAccess().getLocalSingleEventUpdateAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1898:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1899:1: (lv_name_1_0= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1899:1: (lv_name_1_0= ruleSelfReferencedStore )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1900:3: lv_name_1_0= ruleSelfReferencedStore
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getNameSelfReferencedStoreParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleSingleEventUpdate4084);
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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleSingleEventUpdate4096); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleEventUpdateAccess().getColonEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1920:1: ( (lv_expression_3_0= ruleUpdateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1921:1: (lv_expression_3_0= ruleUpdateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1921:1: (lv_expression_3_0= ruleUpdateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:3: lv_expression_3_0= ruleUpdateExpression
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getExpressionUpdateExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4117);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1949:1: entryRuleDistributedEventUpdate returns [EObject current=null] : iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF ;
    public final EObject entryRuleDistributedEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributedEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1953:2: (iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1954:2: iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getDistributedEventUpdateRule()); 
            pushFollow(FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4163);
            iv_ruleDistributedEventUpdate=ruleDistributedEventUpdate();

            state._fsp--;

             current =iv_ruleDistributedEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributedEventUpdate4173); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1964:1: ruleDistributedEventUpdate returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) ) ;
    public final EObject ruleDistributedEventUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_name_1_0 = null;

        EObject lv_distribution_5_0 = null;

        EObject lv_distribution_7_0 = null;

        EObject lv_name_10_0 = null;

        EObject lv_distribution_14_0 = null;

        EObject lv_distribution_16_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1968:28: ( ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:1: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:1: ( ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_LOWER) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==37) ) {
                        int LA31_3 = input.LA(4);

                        if ( (LA31_3==38) ) {
                            alt31=1;
                        }
                        else if ( (LA31_3==39) ) {
                            alt31=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:2: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:2: ( () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:3: () ( (lv_name_1_0= ruleSelfReferencedStore ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1969:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1970:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateProbabilityAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1975:2: ( (lv_name_1_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1976:1: (lv_name_1_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1976:1: (lv_name_1_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1977:3: lv_name_1_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getNameSelfReferencedStoreParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleDistributedEventUpdate4233);
                    lv_name_1_0=ruleSelfReferencedStore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"SelfReferencedStore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleDistributedEventUpdate4245); 

                        	newLeafNode(otherlv_2, grammarAccess.getDistributedEventUpdateAccess().getColonEqualsSignKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleDistributedEventUpdate4257); 

                        	newLeafNode(otherlv_3, grammarAccess.getDistributedEventUpdateAccess().getPrKeyword_0_3());
                        
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleDistributedEventUpdate4269); 

                        	newLeafNode(otherlv_4, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2005:1: ( (lv_distribution_5_0= ruleDistribution ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2006:1: (lv_distribution_5_0= ruleDistribution )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2006:1: (lv_distribution_5_0= ruleDistribution )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2007:3: lv_distribution_5_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionDistributionParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4290);
                    lv_distribution_5_0=ruleDistribution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		add(
                           			current, 
                           			"distribution",
                            		lv_distribution_5_0, 
                            		"Distribution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2023:2: (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==33) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2023:4: otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+
                    	    {
                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4303); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_0_6_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2027:1: ( (lv_distribution_7_0= ruleDistribution ) )+
                    	    int cnt27=0;
                    	    loop27:
                    	    do {
                    	        int alt27=2;
                    	        int LA27_0 = input.LA(1);

                    	        if ( (LA27_0==RULE_INT) ) {
                    	            alt27=1;
                    	        }


                    	        switch (alt27) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2028:1: (lv_distribution_7_0= ruleDistribution )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2028:1: (lv_distribution_7_0= ruleDistribution )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2029:3: lv_distribution_7_0= ruleDistribution
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionDistributionParserRuleCall_0_6_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4324);
                    	    	    lv_distribution_7_0=ruleDistribution();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"distribution",
                    	    	            		lv_distribution_7_0, 
                    	    	            		"Distribution");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt27 >= 1 ) break loop27;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(27, input);
                    	                throw eee;
                    	        }
                    	        cnt27++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleDistributedEventUpdate4339); 

                        	newLeafNode(otherlv_8, grammarAccess.getDistributedEventUpdateAccess().getRightParenthesisKeyword_0_7());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2050:6: ( () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2050:6: ( () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2050:7: () ( (lv_name_10_0= ruleSelfReferencedStore ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2050:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2051:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateUniformAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2056:2: ( (lv_name_10_0= ruleSelfReferencedStore ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2057:1: (lv_name_10_0= ruleSelfReferencedStore )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2057:1: (lv_name_10_0= ruleSelfReferencedStore )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2058:3: lv_name_10_0= ruleSelfReferencedStore
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getNameSelfReferencedStoreParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleDistributedEventUpdate4377);
                    lv_name_10_0=ruleSelfReferencedStore();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_10_0, 
                            		"SelfReferencedStore");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleDistributedEventUpdate4389); 

                        	newLeafNode(otherlv_11, grammarAccess.getDistributedEventUpdateAccess().getColonEqualsSignKeyword_1_2());
                        
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleDistributedEventUpdate4401); 

                        	newLeafNode(otherlv_12, grammarAccess.getDistributedEventUpdateAccess().getUKeyword_1_3());
                        
                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleDistributedEventUpdate4413); 

                        	newLeafNode(otherlv_13, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_1_4());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2086:1: ( (lv_distribution_14_0= ruleUniform ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2087:1: (lv_distribution_14_0= ruleUniform )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2087:1: (lv_distribution_14_0= ruleUniform )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2088:3: lv_distribution_14_0= ruleUniform
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionUniformParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4434);
                    lv_distribution_14_0=ruleUniform();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		add(
                           			current, 
                           			"distribution",
                            		lv_distribution_14_0, 
                            		"Uniform");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2104:2: (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==33) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2104:4: otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+
                    	    {
                    	    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4447); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_1_6_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2108:1: ( (lv_distribution_16_0= ruleUniform ) )+
                    	    int cnt29=0;
                    	    loop29:
                    	    do {
                    	        int alt29=2;
                    	        int LA29_0 = input.LA(1);

                    	        if ( (LA29_0==RULE_INT) ) {
                    	            alt29=1;
                    	        }


                    	        switch (alt29) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2109:1: (lv_distribution_16_0= ruleUniform )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2109:1: (lv_distribution_16_0= ruleUniform )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2110:3: lv_distribution_16_0= ruleUniform
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionUniformParserRuleCall_1_6_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4468);
                    	    	    lv_distribution_16_0=ruleUniform();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"distribution",
                    	    	            		lv_distribution_16_0, 
                    	    	            		"Uniform");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt29 >= 1 ) break loop29;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(29, input);
                    	                throw eee;
                    	        }
                    	        cnt29++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,31,FOLLOW_31_in_ruleDistributedEventUpdate4483); 

                        	newLeafNode(otherlv_17, grammarAccess.getDistributedEventUpdateAccess().getRightParenthesisKeyword_1_7());
                        

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2141:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2145:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2146:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution4530);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution4540); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2156:1: ruleDistribution returns [EObject current=null] : ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prob_1_0 = null;

        AntlrDatatypeRuleToken lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2160:28: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:2: () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2162:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDistributionAccess().getDistributionAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2167:2: ( (lv_prob_1_0= ruleDouble ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2168:1: (lv_prob_1_0= ruleDouble )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2168:1: (lv_prob_1_0= ruleDouble )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2169:3: lv_prob_1_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getProbDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleDistribution4599);
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

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleDistribution4611); 

                	newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getColonKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2189:1: ( (lv_expression_3_0= ruleNatural ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2190:1: (lv_expression_3_0= ruleNatural )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2190:1: (lv_expression_3_0= ruleNatural )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2191:3: lv_expression_3_0= ruleNatural
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getExpressionNaturalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNatural_in_ruleDistribution4632);
            lv_expression_3_0=ruleNatural();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"Natural");
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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleUniform"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2218:1: entryRuleUniform returns [EObject current=null] : iv_ruleUniform= ruleUniform EOF ;
    public final EObject entryRuleUniform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniform = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2222:2: (iv_ruleUniform= ruleUniform EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2223:2: iv_ruleUniform= ruleUniform EOF
            {
             newCompositeNode(grammarAccess.getUniformRule()); 
            pushFollow(FOLLOW_ruleUniform_in_entryRuleUniform4678);
            iv_ruleUniform=ruleUniform();

            state._fsp--;

             current =iv_ruleUniform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniform4688); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2233:1: ruleUniform returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleNatural ) ) ) ;
    public final EObject ruleUniform() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2237:28: ( ( () ( (lv_expression_1_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:1: ( () ( (lv_expression_1_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:1: ( () ( (lv_expression_1_0= ruleNatural ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:2: () ( (lv_expression_1_0= ruleNatural ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2238:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniformAccess().getUniformAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2244:2: ( (lv_expression_1_0= ruleNatural ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2245:1: (lv_expression_1_0= ruleNatural )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2245:1: (lv_expression_1_0= ruleNatural )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2246:3: lv_expression_1_0= ruleNatural
            {
             
            	        newCompositeNode(grammarAccess.getUniformAccess().getExpressionNaturalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNatural_in_ruleUniform4747);
            lv_expression_1_0=ruleNatural();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniformRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Natural");
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
    // $ANTLR end "ruleUniform"


    // $ANTLR start "entryRuleUpdateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2273:1: entryRuleUpdateExpression returns [EObject current=null] : iv_ruleUpdateExpression= ruleUpdateExpression EOF ;
    public final EObject entryRuleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2277:2: (iv_ruleUpdateExpression= ruleUpdateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2278:2: iv_ruleUpdateExpression= ruleUpdateExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression4793);
            iv_ruleUpdateExpression=ruleUpdateExpression();

            state._fsp--;

             current =iv_ruleUpdateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpression4803); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2288:1: ruleUpdateExpression returns [EObject current=null] : this_UpdateSubtraction_0= ruleUpdateSubtraction ;
    public final EObject ruleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateSubtraction_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2292:28: (this_UpdateSubtraction_0= ruleUpdateSubtraction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2294:5: this_UpdateSubtraction_0= ruleUpdateSubtraction
            {
             
                    newCompositeNode(grammarAccess.getUpdateExpressionAccess().getUpdateSubtractionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_ruleUpdateExpression4853);
            this_UpdateSubtraction_0=ruleUpdateSubtraction();

            state._fsp--;

             
                    current = this_UpdateSubtraction_0; 
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


    // $ANTLR start "entryRuleUpdateSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2313:1: entryRuleUpdateSubtraction returns [EObject current=null] : iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF ;
    public final EObject entryRuleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2317:2: (iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2318:2: iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getUpdateSubtractionRule()); 
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction4897);
            iv_ruleUpdateSubtraction=ruleUpdateSubtraction();

            state._fsp--;

             current =iv_ruleUpdateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateSubtraction4907); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2328:1: ruleUpdateSubtraction returns [EObject current=null] : (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) ;
    public final EObject ruleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2332:28: ( (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2333:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2333:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2334:5: this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getUpdateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction4958);
            this_UpdateAddition_0=ruleUpdateAddition();

            state._fsp--;

             
                    current = this_UpdateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2342:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2342:2: () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2342:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2343:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleUpdateSubtraction4979); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2352:1: ( (lv_right_3_0= ruleUpdateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2353:1: (lv_right_3_0= ruleUpdateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2353:1: (lv_right_3_0= ruleUpdateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2354:3: lv_right_3_0= ruleUpdateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getRightUpdateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5000);
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
    // $ANTLR end "ruleUpdateSubtraction"


    // $ANTLR start "entryRuleUpdateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2381:1: entryRuleUpdateAddition returns [EObject current=null] : iv_ruleUpdateAddition= ruleUpdateAddition EOF ;
    public final EObject entryRuleUpdateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2385:2: (iv_ruleUpdateAddition= ruleUpdateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2386:2: iv_ruleUpdateAddition= ruleUpdateAddition EOF
            {
             newCompositeNode(grammarAccess.getUpdateAdditionRule()); 
            pushFollow(FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5048);
            iv_ruleUpdateAddition=ruleUpdateAddition();

            state._fsp--;

             current =iv_ruleUpdateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAddition5058); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2396:1: ruleUpdateAddition returns [EObject current=null] : (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) ;
    public final EObject ruleUpdateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2400:28: ( (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2401:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2401:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2402:5: this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateAdditionAccess().getUpdateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5109);
            this_UpdateMultiplication_0=ruleUpdateMultiplication();

            state._fsp--;

             
                    current = this_UpdateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2410:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2410:2: () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2410:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2411:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleUpdateAddition5130); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2420:1: ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2421:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2421:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2422:3: lv_right_3_0= ruleUpdateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAdditionAccess().getRightUpdateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5151);
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
    // $ANTLR end "ruleUpdateAddition"


    // $ANTLR start "entryRuleUpdateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2449:1: entryRuleUpdateMultiplication returns [EObject current=null] : iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF ;
    public final EObject entryRuleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2453:2: (iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2454:2: iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getUpdateMultiplicationRule()); 
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication5199);
            iv_ruleUpdateMultiplication=ruleUpdateMultiplication();

            state._fsp--;

             current =iv_ruleUpdateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateMultiplication5209); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2464:1: ruleUpdateMultiplication returns [EObject current=null] : (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) ;
    public final EObject ruleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2468:28: ( (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2469:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2469:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2470:5: this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getUpdateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5260);
            this_UpdateDivision_0=ruleUpdateDivision();

            state._fsp--;

             
                    current = this_UpdateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2478:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2478:2: () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2478:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2479:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUpdateMultiplication5281); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2488:1: ( (lv_right_3_0= ruleUpdateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2489:1: (lv_right_3_0= ruleUpdateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2489:1: (lv_right_3_0= ruleUpdateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2490:3: lv_right_3_0= ruleUpdateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getRightUpdateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5302);
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
            	    break loop34;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2517:1: entryRuleUpdateDivision returns [EObject current=null] : iv_ruleUpdateDivision= ruleUpdateDivision EOF ;
    public final EObject entryRuleUpdateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2521:2: (iv_ruleUpdateDivision= ruleUpdateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2522:2: iv_ruleUpdateDivision= ruleUpdateDivision EOF
            {
             newCompositeNode(grammarAccess.getUpdateDivisionRule()); 
            pushFollow(FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision5350);
            iv_ruleUpdateDivision=ruleUpdateDivision();

            state._fsp--;

             current =iv_ruleUpdateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateDivision5360); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2532:1: ruleUpdateDivision returns [EObject current=null] : (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) ;
    public final EObject ruleUpdateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2536:28: ( (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2537:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2537:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2538:5: this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateDivisionAccess().getUpdatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5411);
            this_UpdatePrimary_0=ruleUpdatePrimary();

            state._fsp--;

             
                    current = this_UpdatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2546:1: ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==29) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2546:2: () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2546:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2547:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleUpdateDivision5432); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2556:1: ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2557:1: (lv_right_3_0= ruleUpdatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2557:1: (lv_right_3_0= ruleUpdatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2558:3: lv_right_3_0= ruleUpdatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateDivisionAccess().getRightUpdatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5453);
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
    // $ANTLR end "ruleUpdateDivision"


    // $ANTLR start "entryRuleUpdatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2585:1: entryRuleUpdatePrimary returns [EObject current=null] : iv_ruleUpdatePrimary= ruleUpdatePrimary EOF ;
    public final EObject entryRuleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2589:2: (iv_ruleUpdatePrimary= ruleUpdatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2590:2: iv_ruleUpdatePrimary= ruleUpdatePrimary EOF
            {
             newCompositeNode(grammarAccess.getUpdatePrimaryRule()); 
            pushFollow(FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary5501);
            iv_ruleUpdatePrimary=ruleUpdatePrimary();

            state._fsp--;

             current =iv_ruleUpdatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdatePrimary5511); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2600:1: ruleUpdatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic ) ;
    public final EObject ruleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_UpdateExpression_1 = null;

        EObject this_UpdateAtomic_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2604:28: ( ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2605:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2605:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_LOWER||LA36_0==RULE_INT||LA36_0==14) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2605:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2605:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2605:4: otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleUpdatePrimary5553); 

                        	newLeafNode(otherlv_0, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary5575);
                    this_UpdateExpression_1=ruleUpdateExpression();

                    state._fsp--;

                     
                            current = this_UpdateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleUpdatePrimary5586); 

                        	newLeafNode(otherlv_2, grammarAccess.getUpdatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2624:5: this_UpdateAtomic_3= ruleUpdateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary5615);
                    this_UpdateAtomic_3=ruleUpdateAtomic();

                    state._fsp--;

                     
                            current = this_UpdateAtomic_3; 
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2643:1: entryRuleUpdateAtomic returns [EObject current=null] : iv_ruleUpdateAtomic= ruleUpdateAtomic EOF ;
    public final EObject entryRuleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2647:2: (iv_ruleUpdateAtomic= ruleUpdateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2648:2: iv_ruleUpdateAtomic= ruleUpdateAtomic EOF
            {
             newCompositeNode(grammarAccess.getUpdateAtomicRule()); 
            pushFollow(FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic5660);
            iv_ruleUpdateAtomic=ruleUpdateAtomic();

            state._fsp--;

             current =iv_ruleUpdateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAtomic5670); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2658:1: ruleUpdateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_ReferencedStore_2= ruleReferencedStore | this_SelfReferencedStore_3= ruleSelfReferencedStore ) ;
    public final EObject ruleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_ReferencedStore_2 = null;

        EObject this_SelfReferencedStore_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2662:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_ReferencedStore_2= ruleReferencedStore | this_SelfReferencedStore_3= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2663:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_ReferencedStore_2= ruleReferencedStore | this_SelfReferencedStore_3= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2663:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_ReferencedStore_2= ruleReferencedStore | this_SelfReferencedStore_3= ruleSelfReferencedStore )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case RULE_LOWER:
                {
                alt37=2;
                }
                break;
            case 14:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2663:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2663:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2663:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2663:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2664:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2669:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2670:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2670:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2671:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleUpdateAtomic5730);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2689:5: this_ReferencedStore_2= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAtomicAccess().getReferencedStoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleUpdateAtomic5759);
                    this_ReferencedStore_2=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2699:5: this_SelfReferencedStore_3= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAtomicAccess().getSelfReferencedStoreParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleUpdateAtomic5786);
                    this_SelfReferencedStore_3=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_3; 
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2718:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2722:2: (iv_ruleProcess= ruleProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2723:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess5831);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess5841); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2733:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2737:28: ( ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2738:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2738:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2738:2: ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2738:2: ( (lv_name_0_0= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2739:1: (lv_name_0_0= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2739:1: (lv_name_0_0= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2740:3: lv_name_0_0= RULE_UPPER
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleProcess5887); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProcess5904); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2760:1: ( (lv_value_2_0= ruleProcessExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2761:1: (lv_value_2_0= ruleProcessExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2761:1: (lv_value_2_0= ruleProcessExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2762:3: lv_value_2_0= ruleProcessExpression
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessExpression_in_ruleProcess5925);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleProcess5937); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2793:1: entryRuleProcessExpression returns [EObject current=null] : iv_ruleProcessExpression= ruleProcessExpression EOF ;
    public final EObject entryRuleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2797:2: (iv_ruleProcessExpression= ruleProcessExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2798:2: iv_ruleProcessExpression= ruleProcessExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessExpressionRule()); 
            pushFollow(FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression5983);
            iv_ruleProcessExpression=ruleProcessExpression();

            state._fsp--;

             current =iv_ruleProcessExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessExpression5993); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2808:1: ruleProcessExpression returns [EObject current=null] : this_Parallel_0= ruleParallel ;
    public final EObject ruleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Parallel_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2812:28: (this_Parallel_0= ruleParallel )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2814:5: this_Parallel_0= ruleParallel
            {
             
                    newCompositeNode(grammarAccess.getProcessExpressionAccess().getParallelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleParallel_in_ruleProcessExpression6043);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2833:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2837:2: (iv_ruleParallel= ruleParallel EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2838:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel6087);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel6097); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2848:1: ruleParallel returns [EObject current=null] : (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Choice_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2852:28: ( (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2853:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2853:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2854:5: this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getParallelAccess().getChoiceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleChoice_in_ruleParallel6148);
            this_Choice_0=ruleChoice();

            state._fsp--;

             
                    current = this_Choice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2862:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==41) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2862:2: () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2862:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2863:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getParallelAccess().getParallelLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleParallel6169); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2872:1: ( (lv_right_3_0= ruleChoice ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2873:1: (lv_right_3_0= ruleChoice )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2873:1: (lv_right_3_0= ruleChoice )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2874:3: lv_right_3_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleParallel6190);
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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleChoice"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2901:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2905:2: (iv_ruleChoice= ruleChoice EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2906:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice6238);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice6248); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2916:1: ruleChoice returns [EObject current=null] : (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryProcess_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2920:28: ( (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2921:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2921:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2922:5: this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getChoiceAccess().getPrimaryProcessParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice6299);
            this_PrimaryProcess_0=rulePrimaryProcess();

            state._fsp--;

             
                    current = this_PrimaryProcess_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2930:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==28) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2930:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2930:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2931:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleChoice6320); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2940:1: ( (lv_right_3_0= rulePrimaryProcess ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2941:1: (lv_right_3_0= rulePrimaryProcess )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2941:1: (lv_right_3_0= rulePrimaryProcess )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2942:3: lv_right_3_0= rulePrimaryProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice6341);
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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRulePrimaryProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2969:1: entryRulePrimaryProcess returns [EObject current=null] : iv_rulePrimaryProcess= rulePrimaryProcess EOF ;
    public final EObject entryRulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2973:2: (iv_rulePrimaryProcess= rulePrimaryProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2974:2: iv_rulePrimaryProcess= rulePrimaryProcess EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProcessRule()); 
            pushFollow(FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess6389);
            iv_rulePrimaryProcess=rulePrimaryProcess();

            state._fsp--;

             current =iv_rulePrimaryProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryProcess6399); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2984:1: rulePrimaryProcess returns [EObject current=null] : ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess ) ;
    public final EObject rulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ProcessExpression_1 = null;

        EObject this_AtomicProcess_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2988:28: ( ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:1: ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:1: ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_LOWER && LA40_0<=RULE_UPPER)||LA40_0==17||(LA40_0>=42 && LA40_0<=43)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:2: (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:2: (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:4: otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePrimaryProcess6441); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryProcessAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getProcessExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleProcessExpression_in_rulePrimaryProcess6463);
                    this_ProcessExpression_1=ruleProcessExpression();

                    state._fsp--;

                     
                            current = this_ProcessExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePrimaryProcess6474); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryProcessAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3008:5: this_AtomicProcess_3= ruleAtomicProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getAtomicProcessParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomicProcess_in_rulePrimaryProcess6503);
                    this_AtomicProcess_3=ruleAtomicProcess();

                    state._fsp--;

                     
                            current = this_AtomicProcess_3; 
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
    // $ANTLR end "rulePrimaryProcess"


    // $ANTLR start "entryRuleAtomicProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3027:1: entryRuleAtomicProcess returns [EObject current=null] : iv_ruleAtomicProcess= ruleAtomicProcess EOF ;
    public final EObject entryRuleAtomicProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3031:2: (iv_ruleAtomicProcess= ruleAtomicProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3032:2: iv_ruleAtomicProcess= ruleAtomicProcess EOF
            {
             newCompositeNode(grammarAccess.getAtomicProcessRule()); 
            pushFollow(FOLLOW_ruleAtomicProcess_in_entryRuleAtomicProcess6548);
            iv_ruleAtomicProcess=ruleAtomicProcess();

            state._fsp--;

             current =iv_ruleAtomicProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicProcess6558); 

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
    // $ANTLR end "entryRuleAtomicProcess"


    // $ANTLR start "ruleAtomicProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3042:1: ruleAtomicProcess returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess ) ;
    public final EObject ruleAtomicProcess() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        EObject this_PredicateProcess_4 = null;

        EObject this_ActionProcess_5 = null;

        EObject this_ReferencedProcess_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3046:28: ( ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt41=1;
                }
                break;
            case 43:
                {
                alt41=2;
                }
                break;
            case 17:
                {
                alt41=3;
                }
                break;
            case RULE_LOWER:
                {
                alt41=4;
                }
                break;
            case RULE_UPPER:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:3: () ( (lv_value_1_0= 'nil' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3048:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicProcessAccess().getLeafAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3053:2: ( (lv_value_1_0= 'nil' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3054:1: (lv_value_1_0= 'nil' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3054:1: (lv_value_1_0= 'nil' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3055:3: lv_value_1_0= 'nil'
                    {
                    lv_value_1_0=(Token)match(input,42,FOLLOW_42_in_ruleAtomicProcess6615); 

                            newLeafNode(lv_value_1_0, grammarAccess.getAtomicProcessAccess().getValueNilKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicProcessRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "nil");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3069:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3069:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3069:7: () ( (lv_value_3_0= 'kill' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3069:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3070:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicProcessAccess().getLeafAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3075:2: ( (lv_value_3_0= 'kill' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3076:1: (lv_value_3_0= 'kill' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3076:1: (lv_value_3_0= 'kill' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3077:3: lv_value_3_0= 'kill'
                    {
                    lv_value_3_0=(Token)match(input,43,FOLLOW_43_in_ruleAtomicProcess6663); 

                            newLeafNode(lv_value_3_0, grammarAccess.getAtomicProcessAccess().getValueKillKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicProcessRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "kill");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3092:5: this_PredicateProcess_4= rulePredicateProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getPredicateProcessParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateProcess_in_ruleAtomicProcess6705);
                    this_PredicateProcess_4=rulePredicateProcess();

                    state._fsp--;

                     
                            current = this_PredicateProcess_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3102:5: this_ActionProcess_5= ruleActionProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getActionProcessParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActionProcess_in_ruleAtomicProcess6732);
                    this_ActionProcess_5=ruleActionProcess();

                    state._fsp--;

                     
                            current = this_ActionProcess_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3112:5: this_ReferencedProcess_6= ruleReferencedProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getReferencedProcessParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReferencedProcess_in_ruleAtomicProcess6759);
                    this_ReferencedProcess_6=ruleReferencedProcess();

                    state._fsp--;

                     
                            current = this_ReferencedProcess_6; 
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
    // $ANTLR end "ruleAtomicProcess"


    // $ANTLR start "entryRulePredicateProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3131:1: entryRulePredicateProcess returns [EObject current=null] : iv_rulePredicateProcess= rulePredicateProcess EOF ;
    public final EObject entryRulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3135:2: (iv_rulePredicateProcess= rulePredicateProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3136:2: iv_rulePredicateProcess= rulePredicateProcess EOF
            {
             newCompositeNode(grammarAccess.getPredicateProcessRule()); 
            pushFollow(FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess6804);
            iv_rulePredicateProcess=rulePredicateProcess();

            state._fsp--;

             current =iv_rulePredicateProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateProcess6814); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3146:1: rulePredicateProcess returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) ;
    public final EObject rulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_1_0 = null;

        EObject lv_ref_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3150:28: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3151:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3151:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3151:2: () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3151:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3152:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateProcessAccess().getPredicateProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3157:2: ( (lv_predicate_1_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3158:1: (lv_predicate_1_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3158:1: (lv_predicate_1_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3159:3: lv_predicate_1_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_rulePredicateProcess6873);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3175:2: ( (lv_ref_2_0= rulePrimaryProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3176:1: (lv_ref_2_0= rulePrimaryProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3176:1: (lv_ref_2_0= rulePrimaryProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3177:3: lv_ref_2_0= rulePrimaryProcess
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getRefPrimaryProcessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryProcess_in_rulePredicateProcess6894);
            lv_ref_2_0=rulePrimaryProcess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateProcessRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"PrimaryProcess");
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
    // $ANTLR end "rulePredicateProcess"


    // $ANTLR start "entryRuleActionProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3204:1: entryRuleActionProcess returns [EObject current=null] : iv_ruleActionProcess= ruleActionProcess EOF ;
    public final EObject entryRuleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3208:2: (iv_ruleActionProcess= ruleActionProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3209:2: iv_ruleActionProcess= ruleActionProcess EOF
            {
             newCompositeNode(grammarAccess.getActionProcessRule()); 
            pushFollow(FOLLOW_ruleActionProcess_in_entryRuleActionProcess6940);
            iv_ruleActionProcess=ruleActionProcess();

            state._fsp--;

             current =iv_ruleActionProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionProcess6950); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3219:1: ruleActionProcess returns [EObject current=null] : ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) ;
    public final EObject ruleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_action_1_0 = null;

        EObject lv_ref_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3223:28: ( ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3224:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3224:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3224:2: () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3224:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionProcessAccess().getActionProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3230:2: ( (lv_action_1_0= ruleAction ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3231:1: (lv_action_1_0= ruleAction )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3231:1: (lv_action_1_0= ruleAction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3232:3: lv_action_1_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleActionProcess7009);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3248:2: ( (lv_ref_2_0= rulePrimaryProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3249:1: (lv_ref_2_0= rulePrimaryProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3249:1: (lv_ref_2_0= rulePrimaryProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3250:3: lv_ref_2_0= rulePrimaryProcess
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getRefPrimaryProcessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleActionProcess7030);
            lv_ref_2_0=rulePrimaryProcess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionProcessRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"PrimaryProcess");
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
    // $ANTLR end "ruleActionProcess"


    // $ANTLR start "entryRuleReferencedProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3277:1: entryRuleReferencedProcess returns [EObject current=null] : iv_ruleReferencedProcess= ruleReferencedProcess EOF ;
    public final EObject entryRuleReferencedProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3281:2: (iv_ruleReferencedProcess= ruleReferencedProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3282:2: iv_ruleReferencedProcess= ruleReferencedProcess EOF
            {
             newCompositeNode(grammarAccess.getReferencedProcessRule()); 
            pushFollow(FOLLOW_ruleReferencedProcess_in_entryRuleReferencedProcess7076);
            iv_ruleReferencedProcess=ruleReferencedProcess();

            state._fsp--;

             current =iv_ruleReferencedProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedProcess7086); 

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
    // $ANTLR end "entryRuleReferencedProcess"


    // $ANTLR start "ruleReferencedProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3292:1: ruleReferencedProcess returns [EObject current=null] : ( () ( (otherlv_1= RULE_UPPER ) ) ) ;
    public final EObject ruleReferencedProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3296:28: ( ( () ( (otherlv_1= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:1: ( () ( (otherlv_1= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:1: ( () ( (otherlv_1= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:2: () ( (otherlv_1= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3298:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferencedProcessAccess().getReferencedProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3303:2: ( (otherlv_1= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3304:1: (otherlv_1= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3304:1: (otherlv_1= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3305:3: otherlv_1= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedProcessRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleReferencedProcess7144); 

            		newLeafNode(otherlv_1, grammarAccess.getReferencedProcessAccess().getNameProcessCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleReferencedProcess"


    // $ANTLR start "entryRuleTerm"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3327:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3331:2: (iv_ruleTerm= ruleTerm EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3332:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm7190);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm7200); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3342:1: ruleTerm returns [EObject current=null] : (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_processes_1_0 = null;

        EObject lv_stores_4_0 = null;

        EObject lv_stores_6_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3346:28: ( (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3347:1: (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3347:1: (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3347:3: otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTerm7241); 

                	newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3351:1: ( (lv_processes_1_0= ruleReferencedProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3352:1: (lv_processes_1_0= ruleReferencedProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3352:1: (lv_processes_1_0= ruleReferencedProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3353:3: lv_processes_1_0= ruleReferencedProcess
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getProcessesReferencedProcessParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReferencedProcess_in_ruleTerm7262);
            lv_processes_1_0=ruleReferencedProcess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRule());
            	        }
                   		set(
                   			current, 
                   			"processes",
                    		lv_processes_1_0, 
                    		"ReferencedProcess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTerm7274); 

                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleTerm7286); 

                	newLeafNode(otherlv_3, grammarAccess.getTermAccess().getLeftCurlyBracketKeyword_3());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3377:1: ( (lv_stores_4_0= ruleStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3378:1: (lv_stores_4_0= ruleStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3378:1: (lv_stores_4_0= ruleStore )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3379:3: lv_stores_4_0= ruleStore
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getStoresStoreParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStore_in_ruleTerm7307);
            lv_stores_4_0=ruleStore();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRule());
            	        }
                   		add(
                   			current, 
                   			"stores",
                    		lv_stores_4_0, 
                    		"Store");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3395:2: (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==33) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3395:4: otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleTerm7320); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTermAccess().getCommaKeyword_5_0());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3399:1: ( (lv_stores_6_0= ruleStore ) )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==RULE_LOWER) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3400:1: (lv_stores_6_0= ruleStore )
            	    	    {
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3400:1: (lv_stores_6_0= ruleStore )
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3401:3: lv_stores_6_0= ruleStore
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTermAccess().getStoresStoreParserRuleCall_5_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleStore_in_ruleTerm7341);
            	    	    lv_stores_6_0=ruleStore();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"stores",
            	    	            		lv_stores_6_0, 
            	    	            		"Store");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleTerm7356); 

                	newLeafNode(otherlv_7, grammarAccess.getTermAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleTerm7368); 

                	newLeafNode(otherlv_8, grammarAccess.getTermAccess().getRightParenthesisKeyword_7());
                
            otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleTerm7380); 

                	newLeafNode(otherlv_9, grammarAccess.getTermAccess().getSemicolonKeyword_8());
                

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3440:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3441:2: (iv_ruleDouble= ruleDouble EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3442:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble7421);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble7432); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3449:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3452:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3453:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3453:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3453:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7472); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3460:1: (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==16) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3461:2: kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )?
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleDouble7491); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7506); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3473:1: (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==44) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3474:2: kw= '^' (kw= '-' )? this_INT_5= RULE_INT
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleDouble7525); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getCircumflexAccentKeyword_1_2_0()); 
                                
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3479:1: (kw= '-' )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==27) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3480:2: kw= '-'
                                    {
                                    kw=(Token)match(input,27,FOLLOW_27_in_ruleDouble7539); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_1_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7556); 

                            		current.merge(this_INT_5);
                                
                             
                                newLeafNode(this_INT_5, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_2_2()); 
                                

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3500:1: entryRuleNatural returns [String current=null] : iv_ruleNatural= ruleNatural EOF ;
    public final String entryRuleNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNatural = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3501:2: (iv_ruleNatural= ruleNatural EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3502:2: iv_ruleNatural= ruleNatural EOF
            {
             newCompositeNode(grammarAccess.getNaturalRule()); 
            pushFollow(FOLLOW_ruleNatural_in_entryRuleNatural7606);
            iv_ruleNatural=ruleNatural();

            state._fsp--;

             current =iv_ruleNatural.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNatural7617); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3509:1: ruleNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3512:28: (this_INT_0= RULE_INT )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3513:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNatural7656); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNaturalAccess().getINTTerminalRuleCall()); 
                

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


    // $ANTLR start "entryRuleBool"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3528:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3529:2: (iv_ruleBool= ruleBool EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3530:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool7700);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool7710); 

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3537:1: ruleBool returns [EObject current=null] : ( () (otherlv_1= 'True' | otherlv_2= 'False' ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3540:28: ( ( () (otherlv_1= 'True' | otherlv_2= 'False' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3541:1: ( () (otherlv_1= 'True' | otherlv_2= 'False' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3541:1: ( () (otherlv_1= 'True' | otherlv_2= 'False' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3541:2: () (otherlv_1= 'True' | otherlv_2= 'False' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3541:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3542:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolAccess().getBooleanConstantAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3547:2: (otherlv_1= 'True' | otherlv_2= 'False' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            else if ( (LA47_0==46) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3547:4: otherlv_1= 'True'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleBool7757); 

                        	newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getTrueKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3552:7: otherlv_2= 'False'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleBool7775); 

                        	newLeafNode(otherlv_2, grammarAccess.getBoolAccess().getFalseKeyword_1_1());
                        

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
    // $ANTLR end "ruleBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleModel141 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleModel163 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleStore275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStore292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleStore313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_entryRuleReferencedStore359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedStore369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleReferencedStore427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_entryRuleSelfReferencedStore473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfReferencedStore483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSelfReferencedStore533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleSelfReferencedStore553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction666 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAction683 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction717 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleAction745 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleAction766 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_ruleUpdates_in_ruleAction787 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAction800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePredicate906 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicate927 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePredicate939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_rulePredicateExpression1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_entryRulePredicateOr1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateOr1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1150 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePredicateOr1171 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1192 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAnd1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1301 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePredicateAnd1322 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1343 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateEquality1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1452 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_rulePredicateEquality1481 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_22_in_rulePredicateEquality1510 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1547 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateComparison1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1656 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_23_in_rulePredicateComparison1685 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_24_in_rulePredicateComparison1714 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_25_in_rulePredicateComparison1743 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_26_in_rulePredicateComparison1772 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1809 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateSubtraction1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction1918 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePredicateSubtraction1939 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction1960 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAddition2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2069 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rulePredicateAddition2090 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2111 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateMultiplication2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2220 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePredicateMultiplication2241 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2262 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDivision2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2371 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePredicateDivision2392 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2413 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicatePrimary2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePredicatePrimary2513 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2535 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePredicatePrimary2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePredicatePrimary2575 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtomic2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_rulePredicateAtomic2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rulePredicateAtomic2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_rulePredicateAtomic2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_rulePredicateAtomic2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments2879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleArguments2931 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments2961 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleArguments2974 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments2995 = new BitSet(new long[]{0x00006003C0004050L});
    public static final BitSet FOLLOW_31_in_ruleArguments3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArguments3030 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3060 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_ruleArguments3073 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3094 = new BitSet(new long[]{0x0000600342004050L});
    public static final BitSet FOLLOW_25_in_ruleArguments3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInArguments_in_entryRuleInArguments3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInArguments3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleInArguments3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutArguments_in_entryRuleOutArguments3260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutArguments3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_ruleOutArguments3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_entryRuleExpressions3364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressions3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleExpressions3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleExpressions3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleExpressions3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleVariables3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleVariables3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleVariables3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdates_in_entryRuleUpdates3706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdates3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleUpdates3766 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates3787 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleUpdates3800 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates3821 = new BitSet(new long[]{0x0000601940004050L});
    public static final BitSet FOLLOW_36_in_ruleUpdates3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate3882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_ruleUpdate3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate4015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEventUpdate4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleSingleEventUpdate4084 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSingleEventUpdate4096 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributedEventUpdate4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleDistributedEventUpdate4233 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDistributedEventUpdate4245 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDistributedEventUpdate4257 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDistributedEventUpdate4269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4290 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4303 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4324 = new BitSet(new long[]{0x0000000280000040L});
    public static final BitSet FOLLOW_31_in_ruleDistributedEventUpdate4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleDistributedEventUpdate4377 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDistributedEventUpdate4389 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDistributedEventUpdate4401 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDistributedEventUpdate4413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4434 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4447 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4468 = new BitSet(new long[]{0x0000000280000040L});
    public static final BitSet FOLLOW_31_in_ruleDistributedEventUpdate4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution4530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDistribution4599 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDistribution4611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleDistribution4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniform_in_entryRuleUniform4678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniform4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUniform4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression4793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpression4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_ruleUpdateExpression4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction4897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateSubtraction4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction4958 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleUpdateSubtraction4979 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5000 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAddition5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5109 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleUpdateAddition5130 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5151 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication5199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateMultiplication5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5260 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleUpdateMultiplication5281 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5302 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision5350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateDivision5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5411 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleUpdateDivision5432 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5453 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary5501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdatePrimary5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUpdatePrimary5553 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary5575 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleUpdatePrimary5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic5660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAtomic5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUpdateAtomic5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleUpdateAtomic5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleUpdateAtomic5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess5831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleProcess5887 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProcess5904 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleProcess5925 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleProcess5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression5983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessExpression5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleProcessExpression6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel6087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel6148 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleParallel6169 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel6190 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice6238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice6299 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleChoice6320 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice6341 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess6389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryProcess6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimaryProcess6441 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_rulePrimaryProcess6463 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePrimaryProcess6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicProcess_in_rulePrimaryProcess6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicProcess_in_entryRuleAtomicProcess6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicProcess6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAtomicProcess6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAtomicProcess6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_ruleAtomicProcess6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_ruleAtomicProcess6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_ruleAtomicProcess6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess6804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateProcess6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateProcess6873 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_rulePredicateProcess6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_entryRuleActionProcess6940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionProcess6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionProcess7009 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleActionProcess7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_entryRuleReferencedProcess7076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedProcess7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleReferencedProcess7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm7190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTerm7241 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_ruleTerm7262 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerm7274 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTerm7286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStore_in_ruleTerm7307 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerm7320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStore_in_ruleTerm7341 = new BitSet(new long[]{0x0000001200000010L});
    public static final BitSet FOLLOW_36_in_ruleTerm7356 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTerm7368 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTerm7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble7421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7472 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleDouble7491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7506 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleDouble7525 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_27_in_ruleDouble7539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_entryRuleNatural7606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNatural7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNatural7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool7700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBool7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBool7775 = new BitSet(new long[]{0x0000000000000002L});

}