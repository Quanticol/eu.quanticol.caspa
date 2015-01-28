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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER", "RULE_UPPER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'this.'", "'*'", "'.'", "'['", "']'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'-'", "'+'", "'/'", "'('", "')'", "'!'", "','", "'{'", "';'", "'}'", "'Pr'", "'U'", "':'", "'='", "'|'", "'nil'", "'kill'", "'^'", "'True'", "'False'"
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:149:1: ruleStore returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleNatural ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:153:28: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleNatural ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:154:2: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleNatural ) )
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

                	newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getColonEqualsSignKeyword_2());
                
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


    // $ANTLR start "entryRuleStoreRef"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:315:1: entryRuleStoreRef returns [EObject current=null] : iv_ruleStoreRef= ruleStoreRef EOF ;
    public final EObject entryRuleStoreRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreRef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:319:2: (iv_ruleStoreRef= ruleStoreRef EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:320:2: iv_ruleStoreRef= ruleStoreRef EOF
            {
             newCompositeNode(grammarAccess.getStoreRefRule()); 
            pushFollow(FOLLOW_ruleStoreRef_in_entryRuleStoreRef599);
            iv_ruleStoreRef=ruleStoreRef();

            state._fsp--;

             current =iv_ruleStoreRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStoreRef609); 

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
    // $ANTLR end "entryRuleStoreRef"


    // $ANTLR start "ruleStoreRef"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:330:1: ruleStoreRef returns [EObject current=null] : (this_ReferencedStore_0= ruleReferencedStore | this_SelfReferencedStore_1= ruleSelfReferencedStore ) ;
    public final EObject ruleStoreRef() throws RecognitionException {
        EObject current = null;

        EObject this_ReferencedStore_0 = null;

        EObject this_SelfReferencedStore_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:334:28: ( (this_ReferencedStore_0= ruleReferencedStore | this_SelfReferencedStore_1= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:1: (this_ReferencedStore_0= ruleReferencedStore | this_SelfReferencedStore_1= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:335:1: (this_ReferencedStore_0= ruleReferencedStore | this_SelfReferencedStore_1= ruleSelfReferencedStore )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LOWER) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:336:5: this_ReferencedStore_0= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getStoreRefAccess().getReferencedStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_ruleStoreRef660);
                    this_ReferencedStore_0=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:346:5: this_SelfReferencedStore_1= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getStoreRefAccess().getSelfReferencedStoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_ruleStoreRef687);
                    this_SelfReferencedStore_1=ruleSelfReferencedStore();

                    state._fsp--;

                     
                            current = this_SelfReferencedStore_1; 
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
    // $ANTLR end "ruleStoreRef"


    // $ANTLR start "entryRuleAction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:365:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:369:2: (iv_ruleAction= ruleAction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:370:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction732);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction742); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:380:1: ruleAction returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:384:28: ( ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LOWER) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    alt4=1;
                }
                else if ( (LA4_1==17) ) {
                    alt4=2;
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:4: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:386:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getBroadcastAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:391:2: ( (lv_name_1_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:392:1: (lv_name_1_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:392:1: (lv_name_1_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:393:3: lv_name_1_0= RULE_LOWER
                    {
                    lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction799); 

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

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAction816); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getAsteriskKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:414:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:414:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:414:7: () ( (lv_name_4_0= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:414:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:415:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getUnicastAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:420:2: ( (lv_name_4_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:421:1: (lv_name_4_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:421:1: (lv_name_4_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:422:3: lv_name_4_0= RULE_LOWER
                    {
                    lv_name_4_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction850); 

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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:438:4: ( (lv_predicate_5_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:439:1: (lv_predicate_5_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:439:1: (lv_predicate_5_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:440:3: lv_predicate_5_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_ruleAction878);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:456:2: ( (lv_arguments_6_0= ruleArguments ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:457:1: (lv_arguments_6_0= ruleArguments )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:457:1: (lv_arguments_6_0= ruleArguments )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:458:3: lv_arguments_6_0= ruleArguments
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArguments_in_ruleAction899);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:474:2: ( (lv_updates_7_0= ruleUpdates ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:475:1: (lv_updates_7_0= ruleUpdates )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:475:1: (lv_updates_7_0= ruleUpdates )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:476:3: lv_updates_7_0= ruleUpdates
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getUpdatesUpdatesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdates_in_ruleAction920);
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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleAction933); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:507:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:511:2: (iv_rulePredicate= rulePredicate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:512:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate979);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate989); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:522:1: rulePredicate returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:526:28: ( ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:527:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:527:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:527:2: () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:527:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:528:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateAccess().getPredicateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePredicate1039); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:537:1: ( (lv_predicate_2_0= rulePredicateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:538:1: (lv_predicate_2_0= rulePredicateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:538:1: (lv_predicate_2_0= rulePredicateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:539:3: lv_predicate_2_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicate1060);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePredicate1072); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:570:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:574:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:575:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1118);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression1128); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:585:1: rulePredicateExpression returns [EObject current=null] : this_PredicateOr_0= rulePredicateOr ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:589:28: (this_PredicateOr_0= rulePredicateOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:591:5: this_PredicateOr_0= rulePredicateOr
            {
             
                    newCompositeNode(grammarAccess.getPredicateExpressionAccess().getPredicateOrParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePredicateOr_in_rulePredicateExpression1178);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:610:1: entryRulePredicateOr returns [EObject current=null] : iv_rulePredicateOr= rulePredicateOr EOF ;
    public final EObject entryRulePredicateOr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:614:2: (iv_rulePredicateOr= rulePredicateOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:615:2: iv_rulePredicateOr= rulePredicateOr EOF
            {
             newCompositeNode(grammarAccess.getPredicateOrRule()); 
            pushFollow(FOLLOW_rulePredicateOr_in_entryRulePredicateOr1222);
            iv_rulePredicateOr=rulePredicateOr();

            state._fsp--;

             current =iv_rulePredicateOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateOr1232); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:625:1: rulePredicateOr returns [EObject current=null] : (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) ;
    public final EObject rulePredicateOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:629:28: ( (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:630:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:630:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:631:5: this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateOrAccess().getPredicateAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1283);
            this_PredicateAnd_0=rulePredicateAnd();

            state._fsp--;

             
                    current = this_PredicateAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:639:1: ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:639:2: () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:639:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:640:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePredicateOr1304); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:649:1: ( (lv_right_3_0= rulePredicateAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:650:1: (lv_right_3_0= rulePredicateAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:650:1: (lv_right_3_0= rulePredicateAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:651:3: lv_right_3_0= rulePredicateAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateOrAccess().getRightPredicateAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1325);
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
    // $ANTLR end "rulePredicateOr"


    // $ANTLR start "entryRulePredicateAnd"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:678:1: entryRulePredicateAnd returns [EObject current=null] : iv_rulePredicateAnd= rulePredicateAnd EOF ;
    public final EObject entryRulePredicateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:682:2: (iv_rulePredicateAnd= rulePredicateAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:683:2: iv_rulePredicateAnd= rulePredicateAnd EOF
            {
             newCompositeNode(grammarAccess.getPredicateAndRule()); 
            pushFollow(FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1373);
            iv_rulePredicateAnd=rulePredicateAnd();

            state._fsp--;

             current =iv_rulePredicateAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAnd1383); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:693:1: rulePredicateAnd returns [EObject current=null] : (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) ;
    public final EObject rulePredicateAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:697:28: ( (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:698:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:698:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:699:5: this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAndAccess().getPredicateEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1434);
            this_PredicateEquality_0=rulePredicateEquality();

            state._fsp--;

             
                    current = this_PredicateEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:707:1: ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:707:2: () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:707:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:708:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePredicateAnd1455); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:717:1: ( (lv_right_3_0= rulePredicateEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:718:1: (lv_right_3_0= rulePredicateEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:718:1: (lv_right_3_0= rulePredicateEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:719:3: lv_right_3_0= rulePredicateEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAndAccess().getRightPredicateEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1476);
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
            	    break loop7;
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:746:1: entryRulePredicateEquality returns [EObject current=null] : iv_rulePredicateEquality= rulePredicateEquality EOF ;
    public final EObject entryRulePredicateEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:750:2: (iv_rulePredicateEquality= rulePredicateEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:751:2: iv_rulePredicateEquality= rulePredicateEquality EOF
            {
             newCompositeNode(grammarAccess.getPredicateEqualityRule()); 
            pushFollow(FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1524);
            iv_rulePredicateEquality=rulePredicateEquality();

            state._fsp--;

             current =iv_rulePredicateEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateEquality1534); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:761:1: rulePredicateEquality returns [EObject current=null] : (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) ;
    public final EObject rulePredicateEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PredicateComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:765:28: ( (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:766:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:766:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:767:5: this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateEqualityAccess().getPredicateComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1585);
            this_PredicateComparison_0=rulePredicateComparison();

            state._fsp--;

             
                    current = this_PredicateComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:775:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:775:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:775:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:776:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:781:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:782:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:782:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==21) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==22) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:784:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_21_in_rulePredicateEquality1614); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:796:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_22_in_rulePredicateEquality1643); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:811:2: ( (lv_right_3_0= rulePredicateComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:812:1: (lv_right_3_0= rulePredicateComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:812:1: (lv_right_3_0= rulePredicateComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:813:3: lv_right_3_0= rulePredicateComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateEqualityAccess().getRightPredicateComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1680);
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
    // $ANTLR end "rulePredicateEquality"


    // $ANTLR start "entryRulePredicateComparison"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:840:1: entryRulePredicateComparison returns [EObject current=null] : iv_rulePredicateComparison= rulePredicateComparison EOF ;
    public final EObject entryRulePredicateComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:844:2: (iv_rulePredicateComparison= rulePredicateComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:845:2: iv_rulePredicateComparison= rulePredicateComparison EOF
            {
             newCompositeNode(grammarAccess.getPredicateComparisonRule()); 
            pushFollow(FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1728);
            iv_rulePredicateComparison=rulePredicateComparison();

            state._fsp--;

             current =iv_rulePredicateComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateComparison1738); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:855:1: rulePredicateComparison returns [EObject current=null] : (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:859:28: ( (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:860:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:860:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:861:5: this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateComparisonAccess().getPredicateSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1789);
            this_PredicateSubtraction_0=rulePredicateSubtraction();

            state._fsp--;

             
                    current = this_PredicateSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:869:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:869:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:869:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:870:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:875:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:876:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:876:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:877:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:877:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:878:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_rulePredicateComparison1818); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:890:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_rulePredicateComparison1847); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getPredicateComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:902:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,25,FOLLOW_25_in_rulePredicateComparison1876); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:914:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,26,FOLLOW_26_in_rulePredicateComparison1905); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:929:2: ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:930:1: (lv_right_3_0= rulePredicateSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:930:1: (lv_right_3_0= rulePredicateSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:931:3: lv_right_3_0= rulePredicateSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateComparisonAccess().getRightPredicateSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1942);
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
    // $ANTLR end "rulePredicateComparison"


    // $ANTLR start "entryRulePredicateSubtraction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:958:1: entryRulePredicateSubtraction returns [EObject current=null] : iv_rulePredicateSubtraction= rulePredicateSubtraction EOF ;
    public final EObject entryRulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:962:2: (iv_rulePredicateSubtraction= rulePredicateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:963:2: iv_rulePredicateSubtraction= rulePredicateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getPredicateSubtractionRule()); 
            pushFollow(FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction1990);
            iv_rulePredicateSubtraction=rulePredicateSubtraction();

            state._fsp--;

             current =iv_rulePredicateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateSubtraction2000); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:973:1: rulePredicateSubtraction returns [EObject current=null] : (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) ;
    public final EObject rulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:977:28: ( (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:978:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:978:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:979:5: this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getPredicateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2051);
            this_PredicateAddition_0=rulePredicateAddition();

            state._fsp--;

             
                    current = this_PredicateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:987:1: ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:987:2: () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:987:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:988:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePredicateSubtraction2072); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:997:1: ( (lv_right_3_0= rulePredicateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:998:1: (lv_right_3_0= rulePredicateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:998:1: (lv_right_3_0= rulePredicateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:999:3: lv_right_3_0= rulePredicateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getRightPredicateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2093);
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
    // $ANTLR end "rulePredicateSubtraction"


    // $ANTLR start "entryRulePredicateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1026:1: entryRulePredicateAddition returns [EObject current=null] : iv_rulePredicateAddition= rulePredicateAddition EOF ;
    public final EObject entryRulePredicateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1030:2: (iv_rulePredicateAddition= rulePredicateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1031:2: iv_rulePredicateAddition= rulePredicateAddition EOF
            {
             newCompositeNode(grammarAccess.getPredicateAdditionRule()); 
            pushFollow(FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2141);
            iv_rulePredicateAddition=rulePredicateAddition();

            state._fsp--;

             current =iv_rulePredicateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAddition2151); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1041:1: rulePredicateAddition returns [EObject current=null] : (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) ;
    public final EObject rulePredicateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1045:28: ( (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1046:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1046:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1047:5: this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAdditionAccess().getPredicateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2202);
            this_PredicateMultiplication_0=rulePredicateMultiplication();

            state._fsp--;

             
                    current = this_PredicateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:2: () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1055:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1056:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePredicateAddition2223); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1065:1: ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1066:1: (lv_right_3_0= rulePredicateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1066:1: (lv_right_3_0= rulePredicateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1067:3: lv_right_3_0= rulePredicateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAdditionAccess().getRightPredicateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2244);
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
    // $ANTLR end "rulePredicateAddition"


    // $ANTLR start "entryRulePredicateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1094:1: entryRulePredicateMultiplication returns [EObject current=null] : iv_rulePredicateMultiplication= rulePredicateMultiplication EOF ;
    public final EObject entryRulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1098:2: (iv_rulePredicateMultiplication= rulePredicateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1099:2: iv_rulePredicateMultiplication= rulePredicateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getPredicateMultiplicationRule()); 
            pushFollow(FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2292);
            iv_rulePredicateMultiplication=rulePredicateMultiplication();

            state._fsp--;

             current =iv_rulePredicateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateMultiplication2302); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1109:1: rulePredicateMultiplication returns [EObject current=null] : (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) ;
    public final EObject rulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1113:28: ( (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1114:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1114:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1115:5: this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getPredicateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2353);
            this_PredicateDivision_0=rulePredicateDivision();

            state._fsp--;

             
                    current = this_PredicateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1123:1: ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1123:2: () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1123:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1124:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePredicateMultiplication2374); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1133:1: ( (lv_right_3_0= rulePredicateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1134:1: (lv_right_3_0= rulePredicateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1134:1: (lv_right_3_0= rulePredicateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1135:3: lv_right_3_0= rulePredicateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getRightPredicateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2395);
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
    // $ANTLR end "rulePredicateMultiplication"


    // $ANTLR start "entryRulePredicateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1162:1: entryRulePredicateDivision returns [EObject current=null] : iv_rulePredicateDivision= rulePredicateDivision EOF ;
    public final EObject entryRulePredicateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1166:2: (iv_rulePredicateDivision= rulePredicateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1167:2: iv_rulePredicateDivision= rulePredicateDivision EOF
            {
             newCompositeNode(grammarAccess.getPredicateDivisionRule()); 
            pushFollow(FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2443);
            iv_rulePredicateDivision=rulePredicateDivision();

            state._fsp--;

             current =iv_rulePredicateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDivision2453); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1177:1: rulePredicateDivision returns [EObject current=null] : (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) ;
    public final EObject rulePredicateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1181:28: ( (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1182:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1182:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1183:5: this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateDivisionAccess().getPredicatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2504);
            this_PredicatePrimary_0=rulePredicatePrimary();

            state._fsp--;

             
                    current = this_PredicatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1191:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1191:2: () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1191:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1192:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePredicateDivision2525); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1201:1: ( (lv_right_3_0= rulePredicatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1202:1: (lv_right_3_0= rulePredicatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1202:1: (lv_right_3_0= rulePredicatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1203:3: lv_right_3_0= rulePredicatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateDivisionAccess().getRightPredicatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2546);
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
    // $ANTLR end "rulePredicateDivision"


    // $ANTLR start "entryRulePredicatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1230:1: entryRulePredicatePrimary returns [EObject current=null] : iv_rulePredicatePrimary= rulePredicatePrimary EOF ;
    public final EObject entryRulePredicatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1234:2: (iv_rulePredicatePrimary= rulePredicatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1235:2: iv_rulePredicatePrimary= rulePredicatePrimary EOF
            {
             newCompositeNode(grammarAccess.getPredicatePrimaryRule()); 
            pushFollow(FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2594);
            iv_rulePredicatePrimary=rulePredicatePrimary();

            state._fsp--;

             current =iv_rulePredicatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicatePrimary2604); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1245:1: rulePredicatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1249:28: ( ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1250:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1250:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case RULE_LOWER:
            case RULE_INT:
            case 14:
            case 45:
            case 46:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1250:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1250:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1250:4: otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePredicatePrimary2646); 

                        	newLeafNode(otherlv_0, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2668);
                    this_PredicateExpression_1=rulePredicateExpression();

                    state._fsp--;

                     
                            current = this_PredicateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePredicatePrimary2679); 

                        	newLeafNode(otherlv_2, grammarAccess.getPredicatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1268:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1268:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1268:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1268:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1269:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicatePrimaryAccess().getPredicateNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulePredicatePrimary2708); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredicatePrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1278:1: ( (lv_expression_5_0= rulePredicatePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1279:1: (lv_expression_5_0= rulePredicatePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1279:1: (lv_expression_5_0= rulePredicatePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1280:3: lv_expression_5_0= rulePredicatePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getExpressionPredicatePrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2729);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1298:5: this_PredicateAtomic_6= rulePredicateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2758);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1317:1: entryRulePredicateAtomic returns [EObject current=null] : iv_rulePredicateAtomic= rulePredicateAtomic EOF ;
    public final EObject entryRulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1321:2: (iv_rulePredicateAtomic= rulePredicateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1322:2: iv_rulePredicateAtomic= rulePredicateAtomic EOF
            {
             newCompositeNode(grammarAccess.getPredicateAtomicRule()); 
            pushFollow(FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2803);
            iv_rulePredicateAtomic=rulePredicateAtomic();

            state._fsp--;

             current =iv_rulePredicateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtomic2813); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1332:1: rulePredicateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) ;
    public final EObject rulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject this_ReferencedStore_4 = null;

        EObject this_SelfReferencedStore_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1336:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1337:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1337:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_ReferencedStore_4= ruleReferencedStore | this_SelfReferencedStore_5= ruleSelfReferencedStore )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case 45:
            case 46:
                {
                alt17=2;
                }
                break;
            case RULE_LOWER:
                {
                alt17=3;
                }
                break;
            case 14:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1337:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1337:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1337:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1337:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1338:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1343:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1344:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1344:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1345:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_rulePredicateAtomic2873);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1362:6: ( () ( (lv_value_3_0= ruleBool ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1362:6: ( () ( (lv_value_3_0= ruleBool ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1362:7: () ( (lv_value_3_0= ruleBool ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1362:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1363:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getBooleanConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1368:2: ( (lv_value_3_0= ruleBool ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1369:1: (lv_value_3_0= ruleBool )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1369:1: (lv_value_3_0= ruleBool )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1370:3: lv_value_3_0= ruleBool
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueBoolParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBool_in_rulePredicateAtomic2911);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1388:5: this_ReferencedStore_4= ruleReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getReferencedStoreParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReferencedStore_in_rulePredicateAtomic2940);
                    this_ReferencedStore_4=ruleReferencedStore();

                    state._fsp--;

                     
                            current = this_ReferencedStore_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1398:5: this_SelfReferencedStore_5= ruleSelfReferencedStore
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getSelfReferencedStoreParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSelfReferencedStore_in_rulePredicateAtomic2967);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1417:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1421:2: (iv_ruleArguments= ruleArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1422:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments3012);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments3022); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1432:1: ruleArguments returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1436:28: ( ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            else if ( (LA22_0==26) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1437:4: otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleArguments3064); 

                        	newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1441:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1442:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getInAction_0_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1447:2: ( (lv_expressions_2_0= ruleInArguments ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1448:1: (lv_expressions_2_0= ruleInArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1448:1: (lv_expressions_2_0= ruleInArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1449:3: lv_expressions_2_0= ruleInArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments3094);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1465:2: (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==33) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1465:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleArguments3107); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getCommaKeyword_0_3_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1469:1: ( (lv_expressions_4_0= ruleInArguments ) )+
                    	    int cnt18=0;
                    	    loop18:
                    	    do {
                    	        int alt18=2;
                    	        int LA18_0 = input.LA(1);

                    	        if ( (LA18_0==RULE_LOWER||LA18_0==RULE_INT||LA18_0==14) ) {
                    	            alt18=1;
                    	        }


                    	        switch (alt18) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1470:1: (lv_expressions_4_0= ruleInArguments )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1470:1: (lv_expressions_4_0= ruleInArguments )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1471:3: lv_expressions_4_0= ruleInArguments
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_3_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments3128);
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
                    	    	    if ( cnt18 >= 1 ) break loop18;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(18, input);
                    	                throw eee;
                    	        }
                    	        cnt18++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleArguments3143); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:6: (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:6: (otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:8: otherlv_6= '<' () ( (lv_expressions_8_0= ruleOutArguments ) ) (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )* otherlv_11= '>'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleArguments3163); 

                        	newLeafNode(otherlv_6, grammarAccess.getArgumentsAccess().getLessThanSignKeyword_1_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1496:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1497:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getOutAction_1_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1502:2: ( (lv_expressions_8_0= ruleOutArguments ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1503:1: (lv_expressions_8_0= ruleOutArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1503:1: (lv_expressions_8_0= ruleOutArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1504:3: lv_expressions_8_0= ruleOutArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3193);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1520:2: (otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+ )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==33) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1520:4: otherlv_9= ',' ( (lv_expressions_10_0= ruleOutArguments ) )+
                    	    {
                    	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleArguments3206); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getArgumentsAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1524:1: ( (lv_expressions_10_0= ruleOutArguments ) )+
                    	    int cnt20=0;
                    	    loop20:
                    	    do {
                    	        int alt20=2;
                    	        int LA20_0 = input.LA(1);

                    	        if ( (LA20_0==RULE_LOWER||LA20_0==RULE_INT||LA20_0==14) ) {
                    	            alt20=1;
                    	        }


                    	        switch (alt20) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1525:1: (lv_expressions_10_0= ruleOutArguments )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1525:1: (lv_expressions_10_0= ruleOutArguments )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1526:3: lv_expressions_10_0= ruleOutArguments
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_1_3_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3227);
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
                    	    	    if ( cnt20 >= 1 ) break loop20;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(20, input);
                    	                throw eee;
                    	        }
                    	        cnt20++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleArguments3242); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1557:1: entryRuleInArguments returns [EObject current=null] : iv_ruleInArguments= ruleInArguments EOF ;
    public final EObject entryRuleInArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1561:2: (iv_ruleInArguments= ruleInArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1562:2: iv_ruleInArguments= ruleInArguments EOF
            {
             newCompositeNode(grammarAccess.getInArgumentsRule()); 
            pushFollow(FOLLOW_ruleInArguments_in_entryRuleInArguments3289);
            iv_ruleInArguments=ruleInArguments();

            state._fsp--;

             current =iv_ruleInArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInArguments3299); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1572:1: ruleInArguments returns [EObject current=null] : this_Variables_0= ruleVariables ;
    public final EObject ruleInArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Variables_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1576:28: (this_Variables_0= ruleVariables )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1578:5: this_Variables_0= ruleVariables
            {
             
                    newCompositeNode(grammarAccess.getInArgumentsAccess().getVariablesParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariables_in_ruleInArguments3349);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1597:1: entryRuleOutArguments returns [EObject current=null] : iv_ruleOutArguments= ruleOutArguments EOF ;
    public final EObject entryRuleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1601:2: (iv_ruleOutArguments= ruleOutArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1602:2: iv_ruleOutArguments= ruleOutArguments EOF
            {
             newCompositeNode(grammarAccess.getOutArgumentsRule()); 
            pushFollow(FOLLOW_ruleOutArguments_in_entryRuleOutArguments3393);
            iv_ruleOutArguments=ruleOutArguments();

            state._fsp--;

             current =iv_ruleOutArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutArguments3403); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1612:1: ruleOutArguments returns [EObject current=null] : this_Expressions_0= ruleExpressions ;
    public final EObject ruleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Expressions_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1616:28: (this_Expressions_0= ruleExpressions )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1618:5: this_Expressions_0= ruleExpressions
            {
             
                    newCompositeNode(grammarAccess.getOutArgumentsAccess().getExpressionsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpressions_in_ruleOutArguments3453);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1637:1: entryRuleExpressions returns [EObject current=null] : iv_ruleExpressions= ruleExpressions EOF ;
    public final EObject entryRuleExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressions = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:2: (iv_ruleExpressions= ruleExpressions EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1642:2: iv_ruleExpressions= ruleExpressions EOF
            {
             newCompositeNode(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_ruleExpressions_in_entryRuleExpressions3497);
            iv_ruleExpressions=ruleExpressions();

            state._fsp--;

             current =iv_ruleExpressions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressions3507); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1652:1: ruleExpressions returns [EObject current=null] : (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) ) ;
    public final EObject ruleExpressions() throws RecognitionException {
        EObject current = null;

        EObject this_StoreRef_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1656:28: ( (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1657:1: (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1657:1: (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LOWER||LA23_0==14) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1658:5: this_StoreRef_0= ruleStoreRef
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionsAccess().getStoreRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStoreRef_in_ruleExpressions3558);
                    this_StoreRef_0=ruleStoreRef();

                    state._fsp--;

                     
                            current = this_StoreRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1667:6: ( () ( (lv_value_2_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1667:6: ( () ( (lv_value_2_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1667:7: () ( (lv_value_2_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1667:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpressionsAccess().getConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1673:2: ( (lv_value_2_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1674:1: (lv_value_2_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1674:1: (lv_value_2_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1675:3: lv_value_2_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionsAccess().getValueNaturalParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleExpressions3594);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1702:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1706:2: (iv_ruleVariables= ruleVariables EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1707:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables3641);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables3651); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1717:1: ruleVariables returns [EObject current=null] : (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_StoreRef_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1721:28: ( (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1722:1: (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1722:1: (this_StoreRef_0= ruleStoreRef | ( () ( (lv_value_2_0= ruleNatural ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LOWER||LA24_0==14) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_INT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1723:5: this_StoreRef_0= ruleStoreRef
                    {
                     
                            newCompositeNode(grammarAccess.getVariablesAccess().getStoreRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStoreRef_in_ruleVariables3702);
                    this_StoreRef_0=ruleStoreRef();

                    state._fsp--;

                     
                            current = this_StoreRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1732:6: ( () ( (lv_value_2_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1732:6: ( () ( (lv_value_2_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1732:7: () ( (lv_value_2_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1732:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1733:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesAccess().getConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1738:2: ( (lv_value_2_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1739:1: (lv_value_2_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1739:1: (lv_value_2_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1740:3: lv_value_2_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesAccess().getValueNaturalParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleVariables3738);
                    lv_value_2_0=ruleNatural();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesRule());
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1767:1: entryRuleUpdates returns [EObject current=null] : iv_ruleUpdates= ruleUpdates EOF ;
    public final EObject entryRuleUpdates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdates = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1771:2: (iv_ruleUpdates= ruleUpdates EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1772:2: iv_ruleUpdates= ruleUpdates EOF
            {
             newCompositeNode(grammarAccess.getUpdatesRule()); 
            pushFollow(FOLLOW_ruleUpdates_in_entryRuleUpdates3785);
            iv_ruleUpdates=ruleUpdates();

            state._fsp--;

             current =iv_ruleUpdates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdates3795); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1782:1: ruleUpdates returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1786:28: ( ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1787:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1787:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1787:2: () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1787:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdatesAccess().getUpdatesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleUpdates3845); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdatesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1797:1: ( (lv_updates_2_0= ruleUpdate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1798:1: (lv_updates_2_0= ruleUpdate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1798:1: (lv_updates_2_0= ruleUpdate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1799:3: lv_updates_2_0= ruleUpdate
            {
             
            	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates3866);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1815:2: (otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+ )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1815:4: otherlv_3= ';' ( (lv_updates_4_0= ruleUpdate ) )+
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleUpdates3879); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUpdatesAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1819:1: ( (lv_updates_4_0= ruleUpdate ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==RULE_LOWER||LA25_0==14) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1820:1: (lv_updates_4_0= ruleUpdate )
            	    	    {
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1820:1: (lv_updates_4_0= ruleUpdate )
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1821:3: lv_updates_4_0= ruleUpdate
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates3900);
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
            	    	    if ( cnt25 >= 1 ) break loop25;
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleUpdates3915); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1852:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1856:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1857:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate3961);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate3971); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1867:1: ruleUpdate returns [EObject current=null] : (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        EObject this_DistributedEventUpdate_0 = null;

        EObject this_SingleEventUpdate_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1871:28: ( (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1872:1: (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1872:1: (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_LOWER) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==13) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==RULE_LOWER||LA27_3==RULE_INT||LA27_3==14||LA27_3==30) ) {
                        alt27=2;
                    }
                    else if ( ((LA27_3>=37 && LA27_3<=38)) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==14) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_LOWER) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==13) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==RULE_LOWER||LA27_3==RULE_INT||LA27_3==14||LA27_3==30) ) {
                            alt27=2;
                        }
                        else if ( ((LA27_3>=37 && LA27_3<=38)) ) {
                            alt27=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1873:5: this_DistributedEventUpdate_0= ruleDistributedEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getDistributedEventUpdateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate4022);
                    this_DistributedEventUpdate_0=ruleDistributedEventUpdate();

                    state._fsp--;

                     
                            current = this_DistributedEventUpdate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1883:5: this_SingleEventUpdate_1= ruleSingleEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getSingleEventUpdateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSingleEventUpdate_in_ruleUpdate4049);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1902:1: entryRuleSingleEventUpdate returns [EObject current=null] : iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF ;
    public final EObject entryRuleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1906:2: (iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1907:2: iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getSingleEventUpdateRule()); 
            pushFollow(FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate4094);
            iv_ruleSingleEventUpdate=ruleSingleEventUpdate();

            state._fsp--;

             current =iv_ruleSingleEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEventUpdate4104); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1917:1: ruleSingleEventUpdate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) ) ;
    public final EObject ruleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1921:28: ( ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:1: ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:1: ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:2: () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleUpdateExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1922:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1923:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleEventUpdateAccess().getLocalSingleEventUpdateAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1928:2: ( (lv_name_1_0= ruleStoreRef ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1929:1: (lv_name_1_0= ruleStoreRef )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1929:1: (lv_name_1_0= ruleStoreRef )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1930:3: lv_name_1_0= ruleStoreRef
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getNameStoreRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreRef_in_ruleSingleEventUpdate4163);
            lv_name_1_0=ruleStoreRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleEventUpdateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"StoreRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSingleEventUpdate4175); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleEventUpdateAccess().getColonEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1950:1: ( (lv_expression_3_0= ruleUpdateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1951:1: (lv_expression_3_0= ruleUpdateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1951:1: (lv_expression_3_0= ruleUpdateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1952:3: lv_expression_3_0= ruleUpdateExpression
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getExpressionUpdateExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4196);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1979:1: entryRuleDistributedEventUpdate returns [EObject current=null] : iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF ;
    public final EObject entryRuleDistributedEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributedEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1983:2: (iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1984:2: iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getDistributedEventUpdateRule()); 
            pushFollow(FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4242);
            iv_ruleDistributedEventUpdate=ruleDistributedEventUpdate();

            state._fsp--;

             current =iv_ruleDistributedEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributedEventUpdate4252); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1994:1: ruleDistributedEventUpdate returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1998:28: ( ( ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1999:1: ( ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1999:1: ( ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LOWER) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==13) ) {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==37) ) {
                        alt32=1;
                    }
                    else if ( (LA32_3==38) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA32_0==14) ) {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==RULE_LOWER) ) {
                    int LA32_4 = input.LA(3);

                    if ( (LA32_4==13) ) {
                        int LA32_3 = input.LA(4);

                        if ( (LA32_3==37) ) {
                            alt32=1;
                        }
                        else if ( (LA32_3==38) ) {
                            alt32=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1999:2: ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1999:2: ( () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1999:3: () ( (lv_name_1_0= ruleStoreRef ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_distribution_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1999:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2000:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateProbabilityAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2005:2: ( (lv_name_1_0= ruleStoreRef ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2006:1: (lv_name_1_0= ruleStoreRef )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2006:1: (lv_name_1_0= ruleStoreRef )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2007:3: lv_name_1_0= ruleStoreRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getNameStoreRefParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStoreRef_in_ruleDistributedEventUpdate4312);
                    lv_name_1_0=ruleStoreRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"StoreRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDistributedEventUpdate4324); 

                        	newLeafNode(otherlv_2, grammarAccess.getDistributedEventUpdateAccess().getColonEqualsSignKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleDistributedEventUpdate4336); 

                        	newLeafNode(otherlv_3, grammarAccess.getDistributedEventUpdateAccess().getPrKeyword_0_3());
                        
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleDistributedEventUpdate4348); 

                        	newLeafNode(otherlv_4, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2035:1: ( (lv_distribution_5_0= ruleDistribution ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2036:1: (lv_distribution_5_0= ruleDistribution )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2036:1: (lv_distribution_5_0= ruleDistribution )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2037:3: lv_distribution_5_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionDistributionParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4369);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2053:2: (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==33) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2053:4: otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+
                    	    {
                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4382); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_0_6_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2057:1: ( (lv_distribution_7_0= ruleDistribution ) )+
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
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2058:1: (lv_distribution_7_0= ruleDistribution )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2058:1: (lv_distribution_7_0= ruleDistribution )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2059:3: lv_distribution_7_0= ruleDistribution
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionDistributionParserRuleCall_0_6_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4403);
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
                    	    	    if ( cnt28 >= 1 ) break loop28;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(28, input);
                    	                throw eee;
                    	        }
                    	        cnt28++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleDistributedEventUpdate4418); 

                        	newLeafNode(otherlv_8, grammarAccess.getDistributedEventUpdateAccess().getRightParenthesisKeyword_0_7());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2080:6: ( () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2080:6: ( () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2080:7: () ( (lv_name_10_0= ruleStoreRef ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_distribution_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2080:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2081:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateUniformAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2086:2: ( (lv_name_10_0= ruleStoreRef ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2087:1: (lv_name_10_0= ruleStoreRef )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2087:1: (lv_name_10_0= ruleStoreRef )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2088:3: lv_name_10_0= ruleStoreRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getNameStoreRefParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStoreRef_in_ruleDistributedEventUpdate4456);
                    lv_name_10_0=ruleStoreRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_10_0, 
                            		"StoreRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleDistributedEventUpdate4468); 

                        	newLeafNode(otherlv_11, grammarAccess.getDistributedEventUpdateAccess().getColonEqualsSignKeyword_1_2());
                        
                    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleDistributedEventUpdate4480); 

                        	newLeafNode(otherlv_12, grammarAccess.getDistributedEventUpdateAccess().getUKeyword_1_3());
                        
                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleDistributedEventUpdate4492); 

                        	newLeafNode(otherlv_13, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_1_4());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2116:1: ( (lv_distribution_14_0= ruleUniform ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2117:1: (lv_distribution_14_0= ruleUniform )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2117:1: (lv_distribution_14_0= ruleUniform )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2118:3: lv_distribution_14_0= ruleUniform
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionUniformParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4513);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2134:2: (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==33) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2134:4: otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+
                    	    {
                    	    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4526); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_1_6_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2138:1: ( (lv_distribution_16_0= ruleUniform ) )+
                    	    int cnt30=0;
                    	    loop30:
                    	    do {
                    	        int alt30=2;
                    	        int LA30_0 = input.LA(1);

                    	        if ( (LA30_0==RULE_INT) ) {
                    	            alt30=1;
                    	        }


                    	        switch (alt30) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2139:1: (lv_distribution_16_0= ruleUniform )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2139:1: (lv_distribution_16_0= ruleUniform )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2140:3: lv_distribution_16_0= ruleUniform
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionUniformParserRuleCall_1_6_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4547);
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
                    	    	    if ( cnt30 >= 1 ) break loop30;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(30, input);
                    	                throw eee;
                    	        }
                    	        cnt30++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,31,FOLLOW_31_in_ruleDistributedEventUpdate4562); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2171:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2175:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2176:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution4609);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution4619); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2186:1: ruleDistribution returns [EObject current=null] : ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prob_1_0 = null;

        AntlrDatatypeRuleToken lv_expression_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2190:28: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2191:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2191:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2191:2: () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2191:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2192:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDistributionAccess().getDistributionAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2197:2: ( (lv_prob_1_0= ruleDouble ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2198:1: (lv_prob_1_0= ruleDouble )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2198:1: (lv_prob_1_0= ruleDouble )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2199:3: lv_prob_1_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getProbDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleDistribution4678);
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

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleDistribution4690); 

                	newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getColonKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2219:1: ( (lv_expression_3_0= ruleNatural ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:1: (lv_expression_3_0= ruleNatural )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:1: (lv_expression_3_0= ruleNatural )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2221:3: lv_expression_3_0= ruleNatural
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getExpressionNaturalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNatural_in_ruleDistribution4711);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2248:1: entryRuleUniform returns [EObject current=null] : iv_ruleUniform= ruleUniform EOF ;
    public final EObject entryRuleUniform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniform = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2252:2: (iv_ruleUniform= ruleUniform EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2253:2: iv_ruleUniform= ruleUniform EOF
            {
             newCompositeNode(grammarAccess.getUniformRule()); 
            pushFollow(FOLLOW_ruleUniform_in_entryRuleUniform4757);
            iv_ruleUniform=ruleUniform();

            state._fsp--;

             current =iv_ruleUniform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniform4767); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2263:1: ruleUniform returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleNatural ) ) ) ;
    public final EObject ruleUniform() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2267:28: ( ( () ( (lv_expression_1_0= ruleNatural ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2268:1: ( () ( (lv_expression_1_0= ruleNatural ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2268:1: ( () ( (lv_expression_1_0= ruleNatural ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2268:2: () ( (lv_expression_1_0= ruleNatural ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2268:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2269:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniformAccess().getUniformAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2274:2: ( (lv_expression_1_0= ruleNatural ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2275:1: (lv_expression_1_0= ruleNatural )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2275:1: (lv_expression_1_0= ruleNatural )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2276:3: lv_expression_1_0= ruleNatural
            {
             
            	        newCompositeNode(grammarAccess.getUniformAccess().getExpressionNaturalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNatural_in_ruleUniform4826);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2303:1: entryRuleUpdateExpression returns [EObject current=null] : iv_ruleUpdateExpression= ruleUpdateExpression EOF ;
    public final EObject entryRuleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2307:2: (iv_ruleUpdateExpression= ruleUpdateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2308:2: iv_ruleUpdateExpression= ruleUpdateExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression4872);
            iv_ruleUpdateExpression=ruleUpdateExpression();

            state._fsp--;

             current =iv_ruleUpdateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpression4882); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2318:1: ruleUpdateExpression returns [EObject current=null] : this_UpdateSubtraction_0= ruleUpdateSubtraction ;
    public final EObject ruleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateSubtraction_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2322:28: (this_UpdateSubtraction_0= ruleUpdateSubtraction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2324:5: this_UpdateSubtraction_0= ruleUpdateSubtraction
            {
             
                    newCompositeNode(grammarAccess.getUpdateExpressionAccess().getUpdateSubtractionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_ruleUpdateExpression4932);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2343:1: entryRuleUpdateSubtraction returns [EObject current=null] : iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF ;
    public final EObject entryRuleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2347:2: (iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2348:2: iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getUpdateSubtractionRule()); 
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction4976);
            iv_ruleUpdateSubtraction=ruleUpdateSubtraction();

            state._fsp--;

             current =iv_ruleUpdateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateSubtraction4986); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2358:1: ruleUpdateSubtraction returns [EObject current=null] : (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) ;
    public final EObject ruleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2362:28: ( (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2363:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2363:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2364:5: this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getUpdateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5037);
            this_UpdateAddition_0=ruleUpdateAddition();

            state._fsp--;

             
                    current = this_UpdateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2372:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2372:2: () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2372:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2373:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleUpdateSubtraction5058); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2382:1: ( (lv_right_3_0= ruleUpdateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2383:1: (lv_right_3_0= ruleUpdateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2383:1: (lv_right_3_0= ruleUpdateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2384:3: lv_right_3_0= ruleUpdateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getRightUpdateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5079);
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
    // $ANTLR end "ruleUpdateSubtraction"


    // $ANTLR start "entryRuleUpdateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2411:1: entryRuleUpdateAddition returns [EObject current=null] : iv_ruleUpdateAddition= ruleUpdateAddition EOF ;
    public final EObject entryRuleUpdateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2415:2: (iv_ruleUpdateAddition= ruleUpdateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2416:2: iv_ruleUpdateAddition= ruleUpdateAddition EOF
            {
             newCompositeNode(grammarAccess.getUpdateAdditionRule()); 
            pushFollow(FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5127);
            iv_ruleUpdateAddition=ruleUpdateAddition();

            state._fsp--;

             current =iv_ruleUpdateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAddition5137); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2426:1: ruleUpdateAddition returns [EObject current=null] : (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) ;
    public final EObject ruleUpdateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2430:28: ( (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2431:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2431:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2432:5: this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateAdditionAccess().getUpdateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5188);
            this_UpdateMultiplication_0=ruleUpdateMultiplication();

            state._fsp--;

             
                    current = this_UpdateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2440:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2440:2: () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2440:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2441:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleUpdateAddition5209); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2450:1: ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2451:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2451:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2452:3: lv_right_3_0= ruleUpdateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAdditionAccess().getRightUpdateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5230);
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
    // $ANTLR end "ruleUpdateAddition"


    // $ANTLR start "entryRuleUpdateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2479:1: entryRuleUpdateMultiplication returns [EObject current=null] : iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF ;
    public final EObject entryRuleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2483:2: (iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2484:2: iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getUpdateMultiplicationRule()); 
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication5278);
            iv_ruleUpdateMultiplication=ruleUpdateMultiplication();

            state._fsp--;

             current =iv_ruleUpdateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateMultiplication5288); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2494:1: ruleUpdateMultiplication returns [EObject current=null] : (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) ;
    public final EObject ruleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2498:28: ( (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2499:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2499:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2500:5: this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getUpdateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5339);
            this_UpdateDivision_0=ruleUpdateDivision();

            state._fsp--;

             
                    current = this_UpdateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2508:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==15) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2508:2: () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2508:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2509:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUpdateMultiplication5360); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2518:1: ( (lv_right_3_0= ruleUpdateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2519:1: (lv_right_3_0= ruleUpdateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2519:1: (lv_right_3_0= ruleUpdateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2520:3: lv_right_3_0= ruleUpdateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getRightUpdateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5381);
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
    // $ANTLR end "ruleUpdateMultiplication"


    // $ANTLR start "entryRuleUpdateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2547:1: entryRuleUpdateDivision returns [EObject current=null] : iv_ruleUpdateDivision= ruleUpdateDivision EOF ;
    public final EObject entryRuleUpdateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2551:2: (iv_ruleUpdateDivision= ruleUpdateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2552:2: iv_ruleUpdateDivision= ruleUpdateDivision EOF
            {
             newCompositeNode(grammarAccess.getUpdateDivisionRule()); 
            pushFollow(FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision5429);
            iv_ruleUpdateDivision=ruleUpdateDivision();

            state._fsp--;

             current =iv_ruleUpdateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateDivision5439); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2562:1: ruleUpdateDivision returns [EObject current=null] : (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) ;
    public final EObject ruleUpdateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2566:28: ( (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2567:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2567:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2568:5: this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateDivisionAccess().getUpdatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5490);
            this_UpdatePrimary_0=ruleUpdatePrimary();

            state._fsp--;

             
                    current = this_UpdatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2576:1: ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2576:2: () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2576:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2577:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleUpdateDivision5511); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2586:1: ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2587:1: (lv_right_3_0= ruleUpdatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2587:1: (lv_right_3_0= ruleUpdatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2588:3: lv_right_3_0= ruleUpdatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateDivisionAccess().getRightUpdatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5532);
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
    // $ANTLR end "ruleUpdateDivision"


    // $ANTLR start "entryRuleUpdatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2615:1: entryRuleUpdatePrimary returns [EObject current=null] : iv_ruleUpdatePrimary= ruleUpdatePrimary EOF ;
    public final EObject entryRuleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2619:2: (iv_ruleUpdatePrimary= ruleUpdatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2620:2: iv_ruleUpdatePrimary= ruleUpdatePrimary EOF
            {
             newCompositeNode(grammarAccess.getUpdatePrimaryRule()); 
            pushFollow(FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary5580);
            iv_ruleUpdatePrimary=ruleUpdatePrimary();

            state._fsp--;

             current =iv_ruleUpdatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdatePrimary5590); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2630:1: ruleUpdatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic ) ;
    public final EObject ruleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_UpdateExpression_1 = null;

        EObject this_UpdateAtomic_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2634:28: ( ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2635:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2635:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_LOWER||LA37_0==RULE_INT||LA37_0==14) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2635:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2635:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2635:4: otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleUpdatePrimary5632); 

                        	newLeafNode(otherlv_0, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary5654);
                    this_UpdateExpression_1=ruleUpdateExpression();

                    state._fsp--;

                     
                            current = this_UpdateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleUpdatePrimary5665); 

                        	newLeafNode(otherlv_2, grammarAccess.getUpdatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2654:5: this_UpdateAtomic_3= ruleUpdateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary5694);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2673:1: entryRuleUpdateAtomic returns [EObject current=null] : iv_ruleUpdateAtomic= ruleUpdateAtomic EOF ;
    public final EObject entryRuleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2677:2: (iv_ruleUpdateAtomic= ruleUpdateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2678:2: iv_ruleUpdateAtomic= ruleUpdateAtomic EOF
            {
             newCompositeNode(grammarAccess.getUpdateAtomicRule()); 
            pushFollow(FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic5739);
            iv_ruleUpdateAtomic=ruleUpdateAtomic();

            state._fsp--;

             current =iv_ruleUpdateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAtomic5749); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2688:1: ruleUpdateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_StoreRef_2= ruleStoreRef ) ;
    public final EObject ruleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_StoreRef_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2692:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_StoreRef_2= ruleStoreRef ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_StoreRef_2= ruleStoreRef )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_StoreRef_2= ruleStoreRef )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_LOWER||LA38_0==14) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2694:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2699:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2700:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2700:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2701:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleUpdateAtomic5809);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2719:5: this_StoreRef_2= ruleStoreRef
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAtomicAccess().getStoreRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStoreRef_in_ruleUpdateAtomic5838);
                    this_StoreRef_2=ruleStoreRef();

                    state._fsp--;

                     
                            current = this_StoreRef_2; 
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2738:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2742:2: (iv_ruleProcess= ruleProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2743:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess5883);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess5893); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2753:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2757:28: ( ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2758:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2758:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2758:2: ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2758:2: ( (lv_name_0_0= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2759:1: (lv_name_0_0= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2759:1: (lv_name_0_0= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2760:3: lv_name_0_0= RULE_UPPER
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleProcess5939); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleProcess5956); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2780:1: ( (lv_value_2_0= ruleProcessExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2781:1: (lv_value_2_0= ruleProcessExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2781:1: (lv_value_2_0= ruleProcessExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2782:3: lv_value_2_0= ruleProcessExpression
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessExpression_in_ruleProcess5977);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleProcess5989); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2813:1: entryRuleProcessExpression returns [EObject current=null] : iv_ruleProcessExpression= ruleProcessExpression EOF ;
    public final EObject entryRuleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2817:2: (iv_ruleProcessExpression= ruleProcessExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2818:2: iv_ruleProcessExpression= ruleProcessExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessExpressionRule()); 
            pushFollow(FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression6035);
            iv_ruleProcessExpression=ruleProcessExpression();

            state._fsp--;

             current =iv_ruleProcessExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessExpression6045); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2828:1: ruleProcessExpression returns [EObject current=null] : this_Parallel_0= ruleParallel ;
    public final EObject ruleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Parallel_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2832:28: (this_Parallel_0= ruleParallel )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2834:5: this_Parallel_0= ruleParallel
            {
             
                    newCompositeNode(grammarAccess.getProcessExpressionAccess().getParallelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleParallel_in_ruleProcessExpression6095);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2853:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2857:2: (iv_ruleParallel= ruleParallel EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2858:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel6139);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel6149); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2868:1: ruleParallel returns [EObject current=null] : (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Choice_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2872:28: ( (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2873:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2873:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2874:5: this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getParallelAccess().getChoiceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleChoice_in_ruleParallel6200);
            this_Choice_0=ruleChoice();

            state._fsp--;

             
                    current = this_Choice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2882:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==41) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2882:2: () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2882:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2883:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getParallelAccess().getParallelLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleParallel6221); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2892:1: ( (lv_right_3_0= ruleChoice ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2893:1: (lv_right_3_0= ruleChoice )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2893:1: (lv_right_3_0= ruleChoice )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2894:3: lv_right_3_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleParallel6242);
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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleChoice"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2921:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2925:2: (iv_ruleChoice= ruleChoice EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2926:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice6290);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice6300); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2936:1: ruleChoice returns [EObject current=null] : (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryProcess_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2940:28: ( (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2941:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2941:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2942:5: this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getChoiceAccess().getPrimaryProcessParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice6351);
            this_PrimaryProcess_0=rulePrimaryProcess();

            state._fsp--;

             
                    current = this_PrimaryProcess_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2950:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==28) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2950:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2950:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2951:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleChoice6372); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2960:1: ( (lv_right_3_0= rulePrimaryProcess ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2961:1: (lv_right_3_0= rulePrimaryProcess )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2961:1: (lv_right_3_0= rulePrimaryProcess )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2962:3: lv_right_3_0= rulePrimaryProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice6393);
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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRulePrimaryProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:1: entryRulePrimaryProcess returns [EObject current=null] : iv_rulePrimaryProcess= rulePrimaryProcess EOF ;
    public final EObject entryRulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2993:2: (iv_rulePrimaryProcess= rulePrimaryProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2994:2: iv_rulePrimaryProcess= rulePrimaryProcess EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProcessRule()); 
            pushFollow(FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess6441);
            iv_rulePrimaryProcess=rulePrimaryProcess();

            state._fsp--;

             current =iv_rulePrimaryProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryProcess6451); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3004:1: rulePrimaryProcess returns [EObject current=null] : ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess ) ;
    public final EObject rulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ProcessExpression_1 = null;

        EObject this_AtomicProcess_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3008:28: ( ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3009:1: ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3009:1: ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_LOWER && LA41_0<=RULE_UPPER)||LA41_0==17||(LA41_0>=42 && LA41_0<=43)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3009:2: (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3009:2: (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3009:4: otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePrimaryProcess6493); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryProcessAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getProcessExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleProcessExpression_in_rulePrimaryProcess6515);
                    this_ProcessExpression_1=ruleProcessExpression();

                    state._fsp--;

                     
                            current = this_ProcessExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePrimaryProcess6526); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryProcessAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3028:5: this_AtomicProcess_3= ruleAtomicProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getAtomicProcessParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomicProcess_in_rulePrimaryProcess6555);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:1: entryRuleAtomicProcess returns [EObject current=null] : iv_ruleAtomicProcess= ruleAtomicProcess EOF ;
    public final EObject entryRuleAtomicProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3051:2: (iv_ruleAtomicProcess= ruleAtomicProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3052:2: iv_ruleAtomicProcess= ruleAtomicProcess EOF
            {
             newCompositeNode(grammarAccess.getAtomicProcessRule()); 
            pushFollow(FOLLOW_ruleAtomicProcess_in_entryRuleAtomicProcess6600);
            iv_ruleAtomicProcess=ruleAtomicProcess();

            state._fsp--;

             current =iv_ruleAtomicProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicProcess6610); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:1: ruleAtomicProcess returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3066:28: ( ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3067:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3067:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt42=1;
                }
                break;
            case 43:
                {
                alt42=2;
                }
                break;
            case 17:
                {
                alt42=3;
                }
                break;
            case RULE_LOWER:
                {
                alt42=4;
                }
                break;
            case RULE_UPPER:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3067:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3067:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3067:3: () ( (lv_value_1_0= 'nil' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3067:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3068:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicProcessAccess().getLeafAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3073:2: ( (lv_value_1_0= 'nil' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3074:1: (lv_value_1_0= 'nil' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3074:1: (lv_value_1_0= 'nil' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3075:3: lv_value_1_0= 'nil'
                    {
                    lv_value_1_0=(Token)match(input,42,FOLLOW_42_in_ruleAtomicProcess6667); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3089:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3089:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3089:7: () ( (lv_value_3_0= 'kill' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3089:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3090:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicProcessAccess().getLeafAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3095:2: ( (lv_value_3_0= 'kill' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3096:1: (lv_value_3_0= 'kill' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3096:1: (lv_value_3_0= 'kill' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3097:3: lv_value_3_0= 'kill'
                    {
                    lv_value_3_0=(Token)match(input,43,FOLLOW_43_in_ruleAtomicProcess6715); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3112:5: this_PredicateProcess_4= rulePredicateProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getPredicateProcessParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateProcess_in_ruleAtomicProcess6757);
                    this_PredicateProcess_4=rulePredicateProcess();

                    state._fsp--;

                     
                            current = this_PredicateProcess_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3122:5: this_ActionProcess_5= ruleActionProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getActionProcessParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActionProcess_in_ruleAtomicProcess6784);
                    this_ActionProcess_5=ruleActionProcess();

                    state._fsp--;

                     
                            current = this_ActionProcess_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3132:5: this_ReferencedProcess_6= ruleReferencedProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getReferencedProcessParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReferencedProcess_in_ruleAtomicProcess6811);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3151:1: entryRulePredicateProcess returns [EObject current=null] : iv_rulePredicateProcess= rulePredicateProcess EOF ;
    public final EObject entryRulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3155:2: (iv_rulePredicateProcess= rulePredicateProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3156:2: iv_rulePredicateProcess= rulePredicateProcess EOF
            {
             newCompositeNode(grammarAccess.getPredicateProcessRule()); 
            pushFollow(FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess6856);
            iv_rulePredicateProcess=rulePredicateProcess();

            state._fsp--;

             current =iv_rulePredicateProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateProcess6866); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3166:1: rulePredicateProcess returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) ;
    public final EObject rulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_1_0 = null;

        EObject lv_ref_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3170:28: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3171:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3171:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3171:2: () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3171:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3172:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateProcessAccess().getPredicateProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3177:2: ( (lv_predicate_1_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3178:1: (lv_predicate_1_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3178:1: (lv_predicate_1_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3179:3: lv_predicate_1_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_rulePredicateProcess6925);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3195:2: ( (lv_ref_2_0= rulePrimaryProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3196:1: (lv_ref_2_0= rulePrimaryProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3196:1: (lv_ref_2_0= rulePrimaryProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3197:3: lv_ref_2_0= rulePrimaryProcess
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getRefPrimaryProcessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryProcess_in_rulePredicateProcess6946);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3224:1: entryRuleActionProcess returns [EObject current=null] : iv_ruleActionProcess= ruleActionProcess EOF ;
    public final EObject entryRuleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3228:2: (iv_ruleActionProcess= ruleActionProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3229:2: iv_ruleActionProcess= ruleActionProcess EOF
            {
             newCompositeNode(grammarAccess.getActionProcessRule()); 
            pushFollow(FOLLOW_ruleActionProcess_in_entryRuleActionProcess6992);
            iv_ruleActionProcess=ruleActionProcess();

            state._fsp--;

             current =iv_ruleActionProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionProcess7002); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3239:1: ruleActionProcess returns [EObject current=null] : ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) ;
    public final EObject ruleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_action_1_0 = null;

        EObject lv_ref_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3243:28: ( ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3244:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3244:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3244:2: () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3244:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3245:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionProcessAccess().getActionProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3250:2: ( (lv_action_1_0= ruleAction ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3251:1: (lv_action_1_0= ruleAction )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3251:1: (lv_action_1_0= ruleAction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3252:3: lv_action_1_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleActionProcess7061);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3268:2: ( (lv_ref_2_0= rulePrimaryProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3269:1: (lv_ref_2_0= rulePrimaryProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3269:1: (lv_ref_2_0= rulePrimaryProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3270:3: lv_ref_2_0= rulePrimaryProcess
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getRefPrimaryProcessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleActionProcess7082);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:1: entryRuleReferencedProcess returns [EObject current=null] : iv_ruleReferencedProcess= ruleReferencedProcess EOF ;
    public final EObject entryRuleReferencedProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3301:2: (iv_ruleReferencedProcess= ruleReferencedProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3302:2: iv_ruleReferencedProcess= ruleReferencedProcess EOF
            {
             newCompositeNode(grammarAccess.getReferencedProcessRule()); 
            pushFollow(FOLLOW_ruleReferencedProcess_in_entryRuleReferencedProcess7128);
            iv_ruleReferencedProcess=ruleReferencedProcess();

            state._fsp--;

             current =iv_ruleReferencedProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedProcess7138); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3312:1: ruleReferencedProcess returns [EObject current=null] : ( () ( (otherlv_1= RULE_UPPER ) ) ) ;
    public final EObject ruleReferencedProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3316:28: ( ( () ( (otherlv_1= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:1: ( () ( (otherlv_1= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:1: ( () ( (otherlv_1= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:2: () ( (otherlv_1= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3318:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferencedProcessAccess().getReferencedProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3323:2: ( (otherlv_1= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3324:1: (otherlv_1= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3324:1: (otherlv_1= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3325:3: otherlv_1= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedProcessRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleReferencedProcess7196); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3347:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3351:2: (iv_ruleTerm= ruleTerm EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3352:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm7242);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm7252); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3362:1: ruleTerm returns [EObject current=null] : (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3366:28: ( (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3367:1: (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3367:1: (otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3367:3: otherlv_0= '(' ( (lv_processes_1_0= ruleReferencedProcess ) ) otherlv_2= ',' otherlv_3= '{' ( (lv_stores_4_0= ruleStore ) ) (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )* otherlv_7= '}' otherlv_8= ')' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTerm7293); 

                	newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3371:1: ( (lv_processes_1_0= ruleReferencedProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3372:1: (lv_processes_1_0= ruleReferencedProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3372:1: (lv_processes_1_0= ruleReferencedProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3373:3: lv_processes_1_0= ruleReferencedProcess
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getProcessesReferencedProcessParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReferencedProcess_in_ruleTerm7314);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTerm7326); 

                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleTerm7338); 

                	newLeafNode(otherlv_3, grammarAccess.getTermAccess().getLeftCurlyBracketKeyword_3());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3397:1: ( (lv_stores_4_0= ruleStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3398:1: (lv_stores_4_0= ruleStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3398:1: (lv_stores_4_0= ruleStore )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3399:3: lv_stores_4_0= ruleStore
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getStoresStoreParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStore_in_ruleTerm7359);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3415:2: (otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+ )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==33) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3415:4: otherlv_5= ',' ( (lv_stores_6_0= ruleStore ) )+
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleTerm7372); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTermAccess().getCommaKeyword_5_0());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3419:1: ( (lv_stores_6_0= ruleStore ) )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==RULE_LOWER) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3420:1: (lv_stores_6_0= ruleStore )
            	    	    {
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3420:1: (lv_stores_6_0= ruleStore )
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3421:3: lv_stores_6_0= ruleStore
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTermAccess().getStoresStoreParserRuleCall_5_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleStore_in_ruleTerm7393);
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
            	    	    if ( cnt43 >= 1 ) break loop43;
            	                EarlyExitException eee =
            	                    new EarlyExitException(43, input);
            	                throw eee;
            	        }
            	        cnt43++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleTerm7408); 

                	newLeafNode(otherlv_7, grammarAccess.getTermAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleTerm7420); 

                	newLeafNode(otherlv_8, grammarAccess.getTermAccess().getRightParenthesisKeyword_7());
                
            otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleTerm7432); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3460:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3461:2: (iv_ruleDouble= ruleDouble EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3462:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble7473);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble7484); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3469:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3472:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3473:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3473:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3473:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7524); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3480:1: (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3481:2: kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )?
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleDouble7543); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7558); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3493:1: (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==44) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3494:2: kw= '^' (kw= '-' )? this_INT_5= RULE_INT
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleDouble7577); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getCircumflexAccentKeyword_1_2_0()); 
                                
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3499:1: (kw= '-' )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==27) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3500:2: kw= '-'
                                    {
                                    kw=(Token)match(input,27,FOLLOW_27_in_ruleDouble7591); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_1_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble7608); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3520:1: entryRuleNatural returns [String current=null] : iv_ruleNatural= ruleNatural EOF ;
    public final String entryRuleNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNatural = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3521:2: (iv_ruleNatural= ruleNatural EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3522:2: iv_ruleNatural= ruleNatural EOF
            {
             newCompositeNode(grammarAccess.getNaturalRule()); 
            pushFollow(FOLLOW_ruleNatural_in_entryRuleNatural7658);
            iv_ruleNatural=ruleNatural();

            state._fsp--;

             current =iv_ruleNatural.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNatural7669); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3529:1: ruleNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3532:28: (this_INT_0= RULE_INT )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3533:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNatural7708); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3548:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3549:2: (iv_ruleBool= ruleBool EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3550:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool7752);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool7762); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3557:1: ruleBool returns [EObject current=null] : ( () (otherlv_1= 'True' | otherlv_2= 'False' ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3560:28: ( ( () (otherlv_1= 'True' | otherlv_2= 'False' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3561:1: ( () (otherlv_1= 'True' | otherlv_2= 'False' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3561:1: ( () (otherlv_1= 'True' | otherlv_2= 'False' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3561:2: () (otherlv_1= 'True' | otherlv_2= 'False' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3561:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3562:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolAccess().getBooleanConstantAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3567:2: (otherlv_1= 'True' | otherlv_2= 'False' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            else if ( (LA48_0==46) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3567:4: otherlv_1= 'True'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleBool7809); 

                        	newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getTrueKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3572:7: otherlv_2= 'False'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleBool7827); 

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
    public static final BitSet FOLLOW_ruleStoreRef_in_entryRuleStoreRef599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStoreRef609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_ruleStoreRef660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_ruleStoreRef687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction799 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAction816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction850 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleAction878 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleAction899 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_ruleUpdates_in_ruleAction920 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAction933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePredicate1039 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicate1060 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePredicate1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_rulePredicateExpression1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_entryRulePredicateOr1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateOr1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1283 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePredicateOr1304 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1325 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAnd1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1434 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePredicateAnd1455 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1476 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateEquality1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1585 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_rulePredicateEquality1614 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_22_in_rulePredicateEquality1643 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1680 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateComparison1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1789 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_23_in_rulePredicateComparison1818 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_24_in_rulePredicateComparison1847 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_25_in_rulePredicateComparison1876 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_26_in_rulePredicateComparison1905 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1942 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateSubtraction2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2051 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePredicateSubtraction2072 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2093 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAddition2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2202 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rulePredicateAddition2223 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2244 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateMultiplication2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2353 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePredicateMultiplication2374 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2395 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDivision2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2504 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePredicateDivision2525 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2546 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicatePrimary2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePredicatePrimary2646 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2668 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePredicatePrimary2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePredicatePrimary2708 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtomic2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_rulePredicateAtomic2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rulePredicateAtomic2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedStore_in_rulePredicateAtomic2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReferencedStore_in_rulePredicateAtomic2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments3012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleArguments3064 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments3094 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleArguments3107 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments3128 = new BitSet(new long[]{0x00006003C0004050L});
    public static final BitSet FOLLOW_31_in_ruleArguments3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArguments3163 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3193 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_ruleArguments3206 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3227 = new BitSet(new long[]{0x0000600342004050L});
    public static final BitSet FOLLOW_25_in_ruleArguments3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInArguments_in_entryRuleInArguments3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInArguments3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleInArguments3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutArguments_in_entryRuleOutArguments3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutArguments3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_ruleOutArguments3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_entryRuleExpressions3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressions3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreRef_in_ruleExpressions3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleExpressions3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables3641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreRef_in_ruleVariables3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleVariables3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdates_in_entryRuleUpdates3785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdates3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleUpdates3845 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates3866 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleUpdates3879 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates3900 = new BitSet(new long[]{0x0000601940004050L});
    public static final BitSet FOLLOW_36_in_ruleUpdates3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_ruleUpdate4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEventUpdate4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreRef_in_ruleSingleEventUpdate4163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleEventUpdate4175 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributedEventUpdate4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreRef_in_ruleDistributedEventUpdate4312 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDistributedEventUpdate4324 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDistributedEventUpdate4336 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDistributedEventUpdate4348 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4369 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4403 = new BitSet(new long[]{0x0000000280000040L});
    public static final BitSet FOLLOW_31_in_ruleDistributedEventUpdate4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreRef_in_ruleDistributedEventUpdate4456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDistributedEventUpdate4468 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDistributedEventUpdate4480 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDistributedEventUpdate4492 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4513 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4547 = new BitSet(new long[]{0x0000000280000040L});
    public static final BitSet FOLLOW_31_in_ruleDistributedEventUpdate4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution4609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDistribution4678 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDistribution4690 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleDistribution4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniform_in_entryRuleUniform4757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniform4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUniform4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpression4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_ruleUpdateExpression4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction4976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateSubtraction4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5037 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleUpdateSubtraction5058 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5079 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAddition5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5188 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleUpdateAddition5209 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5230 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication5278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateMultiplication5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5339 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleUpdateMultiplication5360 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication5381 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateDivision5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5490 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleUpdateDivision5511 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision5532 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary5580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdatePrimary5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUpdatePrimary5632 = new BitSet(new long[]{0x0000600140004050L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary5654 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleUpdatePrimary5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic5739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAtomic5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUpdateAtomic5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreRef_in_ruleUpdateAtomic5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess5883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleProcess5939 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleProcess5956 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleProcess5977 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleProcess5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression6035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessExpression6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleProcessExpression6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel6139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel6200 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleParallel6221 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel6242 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice6290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice6351 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleChoice6372 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice6393 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess6441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryProcess6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimaryProcess6493 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_rulePrimaryProcess6515 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePrimaryProcess6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicProcess_in_rulePrimaryProcess6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicProcess_in_entryRuleAtomicProcess6600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicProcess6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAtomicProcess6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAtomicProcess6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_ruleAtomicProcess6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_ruleAtomicProcess6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_ruleAtomicProcess6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess6856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateProcess6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateProcess6925 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_rulePredicateProcess6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_entryRuleActionProcess6992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionProcess7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionProcess7061 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleActionProcess7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_entryRuleReferencedProcess7128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedProcess7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleReferencedProcess7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm7242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTerm7293 = new BitSet(new long[]{0x00000C0040020030L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_ruleTerm7314 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerm7326 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTerm7338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStore_in_ruleTerm7359 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerm7372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStore_in_ruleTerm7393 = new BitSet(new long[]{0x0000001200000010L});
    public static final BitSet FOLLOW_36_in_ruleTerm7408 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTerm7420 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTerm7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble7473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7524 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleDouble7543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7558 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleDouble7577 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_27_in_ruleDouble7591 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_entryRuleNatural7658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNatural7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNatural7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool7752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBool7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBool7827 = new BitSet(new long[]{0x0000000000000002L});

}