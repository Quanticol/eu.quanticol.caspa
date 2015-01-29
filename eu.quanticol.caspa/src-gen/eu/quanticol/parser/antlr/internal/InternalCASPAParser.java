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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER", "RULE_UPPER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'this.'", "'*'", "'.'", "'['", "']'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'-'", "'+'", "'/'", "'('", "')'", "'!'", "','", "'()'", "'<>'", "'{'", "'}'", "'Pr'", "'U'", "':'", "'='", "';'", "'|'", "'nil'", "'kill'", "'^'", "'True'", "'False'"
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
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_UPPER=5;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:211:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:215:2: (iv_ruleReference= ruleReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:216:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference359);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference369); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:226:1: ruleReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LOWER ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:230:28: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:2: () ( (lv_name_1_0= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:231:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:237:2: ( (lv_name_1_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:238:1: (lv_name_1_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:238:1: (lv_name_1_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:239:3: lv_name_1_0= RULE_LOWER
            {
            lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleReference424); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameLOWERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"LOWER");
            	    

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleSelfReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:266:1: entryRuleSelfReference returns [EObject current=null] : iv_ruleSelfReference= ruleSelfReference EOF ;
    public final EObject entryRuleSelfReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:270:2: (iv_ruleSelfReference= ruleSelfReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:271:2: iv_ruleSelfReference= ruleSelfReference EOF
            {
             newCompositeNode(grammarAccess.getSelfReferenceRule()); 
            pushFollow(FOLLOW_ruleSelfReference_in_entryRuleSelfReference475);
            iv_ruleSelfReference=ruleSelfReference();

            state._fsp--;

             current =iv_ruleSelfReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfReference485); 

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
    // $ANTLR end "entryRuleSelfReference"


    // $ANTLR start "ruleSelfReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:281:1: ruleSelfReference returns [EObject current=null] : ( () otherlv_1= 'this.' ( (lv_name_2_0= RULE_LOWER ) ) ) ;
    public final EObject ruleSelfReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:285:28: ( ( () otherlv_1= 'this.' ( (lv_name_2_0= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:286:1: ( () otherlv_1= 'this.' ( (lv_name_2_0= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:286:1: ( () otherlv_1= 'this.' ( (lv_name_2_0= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:286:2: () otherlv_1= 'this.' ( (lv_name_2_0= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:286:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelfReferenceAccess().getSelfReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSelfReference535); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfReferenceAccess().getThisKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:296:1: ( (lv_name_2_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:297:1: (lv_name_2_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:297:1: (lv_name_2_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:298:3: lv_name_2_0= RULE_LOWER
            {
            lv_name_2_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleSelfReference552); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSelfReferenceAccess().getNameLOWERTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"LOWER");
            	    

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
    // $ANTLR end "ruleSelfReference"


    // $ANTLR start "entryRuleFreeVariable"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:325:1: entryRuleFreeVariable returns [EObject current=null] : iv_ruleFreeVariable= ruleFreeVariable EOF ;
    public final EObject entryRuleFreeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeVariable = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:329:2: (iv_ruleFreeVariable= ruleFreeVariable EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:330:2: iv_ruleFreeVariable= ruleFreeVariable EOF
            {
             newCompositeNode(grammarAccess.getFreeVariableRule()); 
            pushFollow(FOLLOW_ruleFreeVariable_in_entryRuleFreeVariable603);
            iv_ruleFreeVariable=ruleFreeVariable();

            state._fsp--;

             current =iv_ruleFreeVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeVariable613); 

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
    // $ANTLR end "entryRuleFreeVariable"


    // $ANTLR start "ruleFreeVariable"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:340:1: ruleFreeVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LOWER ) ) ) ;
    public final EObject ruleFreeVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:344:28: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:345:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:345:1: ( () ( (lv_name_1_0= RULE_LOWER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:345:2: () ( (lv_name_1_0= RULE_LOWER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:345:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFreeVariableAccess().getFreeVariableAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:351:2: ( (lv_name_1_0= RULE_LOWER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:352:1: (lv_name_1_0= RULE_LOWER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:352:1: (lv_name_1_0= RULE_LOWER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:353:3: lv_name_1_0= RULE_LOWER
            {
            lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleFreeVariable668); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFreeVariableAccess().getNameLOWERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"LOWER");
            	    

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
    // $ANTLR end "ruleFreeVariable"


    // $ANTLR start "entryRuleStoreExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:380:1: entryRuleStoreExpression returns [EObject current=null] : iv_ruleStoreExpression= ruleStoreExpression EOF ;
    public final EObject entryRuleStoreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:384:2: (iv_ruleStoreExpression= ruleStoreExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:385:2: iv_ruleStoreExpression= ruleStoreExpression EOF
            {
             newCompositeNode(grammarAccess.getStoreExpressionRule()); 
            pushFollow(FOLLOW_ruleStoreExpression_in_entryRuleStoreExpression719);
            iv_ruleStoreExpression=ruleStoreExpression();

            state._fsp--;

             current =iv_ruleStoreExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStoreExpression729); 

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
    // $ANTLR end "entryRuleStoreExpression"


    // $ANTLR start "ruleStoreExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:395:1: ruleStoreExpression returns [EObject current=null] : (this_Reference_0= ruleReference | this_SelfReference_1= ruleSelfReference ) ;
    public final EObject ruleStoreExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_SelfReference_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:399:28: ( (this_Reference_0= ruleReference | this_SelfReference_1= ruleSelfReference ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:400:1: (this_Reference_0= ruleReference | this_SelfReference_1= ruleSelfReference )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:400:1: (this_Reference_0= ruleReference | this_SelfReference_1= ruleSelfReference )
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:401:5: this_Reference_0= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getStoreExpressionAccess().getReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleStoreExpression780);
                    this_Reference_0=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:411:5: this_SelfReference_1= ruleSelfReference
                    {
                     
                            newCompositeNode(grammarAccess.getStoreExpressionAccess().getSelfReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelfReference_in_ruleStoreExpression807);
                    this_SelfReference_1=ruleSelfReference();

                    state._fsp--;

                     
                            current = this_SelfReference_1; 
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
    // $ANTLR end "ruleStoreExpression"


    // $ANTLR start "entryRuleAction"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:430:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:434:2: (iv_ruleAction= ruleAction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:435:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction852);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction862); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:445:1: ruleAction returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:449:28: ( ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:1: ( ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) ) ( (lv_predicate_5_0= rulePredicate ) ) ( (lv_arguments_6_0= ruleArguments ) ) ( (lv_updates_7_0= ruleUpdates ) )? otherlv_8= '.'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:2: ( ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' ) | ( () ( (lv_name_4_0= RULE_LOWER ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LOWER) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=2;
                }
                else if ( (LA4_1==15) ) {
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:3: ( () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:4: () ( (lv_name_1_0= RULE_LOWER ) ) otherlv_2= '*'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:450:4: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:451:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getBroadcastAction_0_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:456:2: ( (lv_name_1_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:457:1: (lv_name_1_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:457:1: (lv_name_1_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:458:3: lv_name_1_0= RULE_LOWER
                    {
                    lv_name_1_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction919); 

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

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAction936); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getAsteriskKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:479:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:479:6: ( () ( (lv_name_4_0= RULE_LOWER ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:479:7: () ( (lv_name_4_0= RULE_LOWER ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:479:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:480:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActionAccess().getUnicastAction_0_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:485:2: ( (lv_name_4_0= RULE_LOWER ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:486:1: (lv_name_4_0= RULE_LOWER )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:486:1: (lv_name_4_0= RULE_LOWER )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:487:3: lv_name_4_0= RULE_LOWER
                    {
                    lv_name_4_0=(Token)match(input,RULE_LOWER,FOLLOW_RULE_LOWER_in_ruleAction970); 

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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:503:4: ( (lv_predicate_5_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:1: (lv_predicate_5_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:504:1: (lv_predicate_5_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:505:3: lv_predicate_5_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_ruleAction998);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:521:2: ( (lv_arguments_6_0= ruleArguments ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:522:1: (lv_arguments_6_0= ruleArguments )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:522:1: (lv_arguments_6_0= ruleArguments )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:523:3: lv_arguments_6_0= ruleArguments
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArguments_in_ruleAction1019);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:539:2: ( (lv_updates_7_0= ruleUpdates ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:540:1: (lv_updates_7_0= ruleUpdates )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:540:1: (lv_updates_7_0= ruleUpdates )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:541:3: lv_updates_7_0= ruleUpdates
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getUpdatesUpdatesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdates_in_ruleAction1040);
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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleAction1053); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:572:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:576:2: (iv_rulePredicate= rulePredicate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:577:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate1099);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate1109); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:587:1: rulePredicate returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:591:28: ( ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:592:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:592:1: ( () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:592:2: () otherlv_1= '[' ( (lv_predicate_2_0= rulePredicateExpression ) ) otherlv_3= ']'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:592:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:593:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateAccess().getPredicateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePredicate1159); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:602:1: ( (lv_predicate_2_0= rulePredicateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:603:1: (lv_predicate_2_0= rulePredicateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:603:1: (lv_predicate_2_0= rulePredicateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:604:3: lv_predicate_2_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getPredicatePredicateExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicate1180);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePredicate1192); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:635:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:639:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:640:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1238);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression1248); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:650:1: rulePredicateExpression returns [EObject current=null] : this_PredicateOr_0= rulePredicateOr ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateOr_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:654:28: (this_PredicateOr_0= rulePredicateOr )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:656:5: this_PredicateOr_0= rulePredicateOr
            {
             
                    newCompositeNode(grammarAccess.getPredicateExpressionAccess().getPredicateOrParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePredicateOr_in_rulePredicateExpression1298);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:675:1: entryRulePredicateOr returns [EObject current=null] : iv_rulePredicateOr= rulePredicateOr EOF ;
    public final EObject entryRulePredicateOr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:679:2: (iv_rulePredicateOr= rulePredicateOr EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:680:2: iv_rulePredicateOr= rulePredicateOr EOF
            {
             newCompositeNode(grammarAccess.getPredicateOrRule()); 
            pushFollow(FOLLOW_rulePredicateOr_in_entryRulePredicateOr1342);
            iv_rulePredicateOr=rulePredicateOr();

            state._fsp--;

             current =iv_rulePredicateOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateOr1352); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:690:1: rulePredicateOr returns [EObject current=null] : (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) ;
    public final EObject rulePredicateOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:694:28: ( (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:695:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:695:1: (this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:696:5: this_PredicateAnd_0= rulePredicateAnd ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateOrAccess().getPredicateAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1403);
            this_PredicateAnd_0=rulePredicateAnd();

            state._fsp--;

             
                    current = this_PredicateAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:704:1: ( () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:704:2: () otherlv_2= '||' ( (lv_right_3_0= rulePredicateAnd ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:704:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:705:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateOrAccess().getPredicateOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePredicateOr1424); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:714:1: ( (lv_right_3_0= rulePredicateAnd ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:715:1: (lv_right_3_0= rulePredicateAnd )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:715:1: (lv_right_3_0= rulePredicateAnd )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:716:3: lv_right_3_0= rulePredicateAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateOrAccess().getRightPredicateAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAnd_in_rulePredicateOr1445);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:743:1: entryRulePredicateAnd returns [EObject current=null] : iv_rulePredicateAnd= rulePredicateAnd EOF ;
    public final EObject entryRulePredicateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAnd = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:747:2: (iv_rulePredicateAnd= rulePredicateAnd EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:748:2: iv_rulePredicateAnd= rulePredicateAnd EOF
            {
             newCompositeNode(grammarAccess.getPredicateAndRule()); 
            pushFollow(FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1493);
            iv_rulePredicateAnd=rulePredicateAnd();

            state._fsp--;

             current =iv_rulePredicateAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAnd1503); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:758:1: rulePredicateAnd returns [EObject current=null] : (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) ;
    public final EObject rulePredicateAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateEquality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:762:28: ( (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:763:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:763:1: (this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:764:5: this_PredicateEquality_0= rulePredicateEquality ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAndAccess().getPredicateEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1554);
            this_PredicateEquality_0=rulePredicateEquality();

            state._fsp--;

             
                    current = this_PredicateEquality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:772:1: ( () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:772:2: () otherlv_2= '&&' ( (lv_right_3_0= rulePredicateEquality ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:772:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:773:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAndAccess().getPredicateAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePredicateAnd1575); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:782:1: ( (lv_right_3_0= rulePredicateEquality ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:1: (lv_right_3_0= rulePredicateEquality )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:783:1: (lv_right_3_0= rulePredicateEquality )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:784:3: lv_right_3_0= rulePredicateEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAndAccess().getRightPredicateEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateEquality_in_rulePredicateAnd1596);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:811:1: entryRulePredicateEquality returns [EObject current=null] : iv_rulePredicateEquality= rulePredicateEquality EOF ;
    public final EObject entryRulePredicateEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateEquality = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:815:2: (iv_rulePredicateEquality= rulePredicateEquality EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:816:2: iv_rulePredicateEquality= rulePredicateEquality EOF
            {
             newCompositeNode(grammarAccess.getPredicateEqualityRule()); 
            pushFollow(FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1644);
            iv_rulePredicateEquality=rulePredicateEquality();

            state._fsp--;

             current =iv_rulePredicateEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateEquality1654); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:826:1: rulePredicateEquality returns [EObject current=null] : (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) ;
    public final EObject rulePredicateEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PredicateComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:830:28: ( (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:831:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:831:1: (this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:832:5: this_PredicateComparison_0= rulePredicateComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateEqualityAccess().getPredicateComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1705);
            this_PredicateComparison_0=rulePredicateComparison();

            state._fsp--;

             
                    current = this_PredicateComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:840:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:840:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= rulePredicateComparison ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:840:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:841:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateEqualityAccess().getPredicateEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:846:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:847:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:847:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:848:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:848:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
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
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:849:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_21_in_rulePredicateEquality1734); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:861:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_22_in_rulePredicateEquality1763); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:876:2: ( (lv_right_3_0= rulePredicateComparison ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:877:1: (lv_right_3_0= rulePredicateComparison )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:877:1: (lv_right_3_0= rulePredicateComparison )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:878:3: lv_right_3_0= rulePredicateComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateEqualityAccess().getRightPredicateComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateComparison_in_rulePredicateEquality1800);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:905:1: entryRulePredicateComparison returns [EObject current=null] : iv_rulePredicateComparison= rulePredicateComparison EOF ;
    public final EObject entryRulePredicateComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateComparison = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:909:2: (iv_rulePredicateComparison= rulePredicateComparison EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:910:2: iv_rulePredicateComparison= rulePredicateComparison EOF
            {
             newCompositeNode(grammarAccess.getPredicateComparisonRule()); 
            pushFollow(FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1848);
            iv_rulePredicateComparison=rulePredicateComparison();

            state._fsp--;

             current =iv_rulePredicateComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateComparison1858); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:920:1: rulePredicateComparison returns [EObject current=null] : (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:924:28: ( (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:925:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:925:1: (this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:926:5: this_PredicateSubtraction_0= rulePredicateSubtraction ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateComparisonAccess().getPredicateSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1909);
            this_PredicateSubtraction_0=rulePredicateSubtraction();

            state._fsp--;

             
                    current = this_PredicateSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:934:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:934:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:934:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:935:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateComparisonAccess().getPredicateComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:940:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:941:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:941:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:942:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:942:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
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
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:943:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_rulePredicateComparison1938); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:955:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_rulePredicateComparison1967); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getPredicateComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:967:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,25,FOLLOW_25_in_rulePredicateComparison1996); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getPredicateComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPredicateComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:979:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,26,FOLLOW_26_in_rulePredicateComparison2025); 

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

            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:994:2: ( (lv_right_3_0= rulePredicateSubtraction ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:995:1: (lv_right_3_0= rulePredicateSubtraction )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:995:1: (lv_right_3_0= rulePredicateSubtraction )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:996:3: lv_right_3_0= rulePredicateSubtraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateComparisonAccess().getRightPredicateSubtractionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison2062);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1023:1: entryRulePredicateSubtraction returns [EObject current=null] : iv_rulePredicateSubtraction= rulePredicateSubtraction EOF ;
    public final EObject entryRulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1027:2: (iv_rulePredicateSubtraction= rulePredicateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1028:2: iv_rulePredicateSubtraction= rulePredicateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getPredicateSubtractionRule()); 
            pushFollow(FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction2110);
            iv_rulePredicateSubtraction=rulePredicateSubtraction();

            state._fsp--;

             current =iv_rulePredicateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateSubtraction2120); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1038:1: rulePredicateSubtraction returns [EObject current=null] : (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) ;
    public final EObject rulePredicateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1042:28: ( (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1043:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1043:1: (this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1044:5: this_PredicateAddition_0= rulePredicateAddition ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getPredicateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2171);
            this_PredicateAddition_0=rulePredicateAddition();

            state._fsp--;

             
                    current = this_PredicateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1052:1: ( () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1052:2: () otherlv_2= '-' ( (lv_right_3_0= rulePredicateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1052:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1053:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateSubtractionAccess().getPredicateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePredicateSubtraction2192); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1062:1: ( (lv_right_3_0= rulePredicateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1063:1: (lv_right_3_0= rulePredicateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1063:1: (lv_right_3_0= rulePredicateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1064:3: lv_right_3_0= rulePredicateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateSubtractionAccess().getRightPredicateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2213);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1091:1: entryRulePredicateAddition returns [EObject current=null] : iv_rulePredicateAddition= rulePredicateAddition EOF ;
    public final EObject entryRulePredicateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1095:2: (iv_rulePredicateAddition= rulePredicateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1096:2: iv_rulePredicateAddition= rulePredicateAddition EOF
            {
             newCompositeNode(grammarAccess.getPredicateAdditionRule()); 
            pushFollow(FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2261);
            iv_rulePredicateAddition=rulePredicateAddition();

            state._fsp--;

             current =iv_rulePredicateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAddition2271); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1106:1: rulePredicateAddition returns [EObject current=null] : (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) ;
    public final EObject rulePredicateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1110:28: ( (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1111:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1111:1: (this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1112:5: this_PredicateMultiplication_0= rulePredicateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateAdditionAccess().getPredicateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2322);
            this_PredicateMultiplication_0=rulePredicateMultiplication();

            state._fsp--;

             
                    current = this_PredicateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1120:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1120:2: () otherlv_2= '+' ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1120:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1121:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateAdditionAccess().getPredicatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePredicateAddition2343); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1130:1: ( (lv_right_3_0= rulePredicateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1131:1: (lv_right_3_0= rulePredicateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1131:1: (lv_right_3_0= rulePredicateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1132:3: lv_right_3_0= rulePredicateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAdditionAccess().getRightPredicateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2364);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1159:1: entryRulePredicateMultiplication returns [EObject current=null] : iv_rulePredicateMultiplication= rulePredicateMultiplication EOF ;
    public final EObject entryRulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1163:2: (iv_rulePredicateMultiplication= rulePredicateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1164:2: iv_rulePredicateMultiplication= rulePredicateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getPredicateMultiplicationRule()); 
            pushFollow(FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2412);
            iv_rulePredicateMultiplication=rulePredicateMultiplication();

            state._fsp--;

             current =iv_rulePredicateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateMultiplication2422); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1174:1: rulePredicateMultiplication returns [EObject current=null] : (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) ;
    public final EObject rulePredicateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1178:28: ( (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1179:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1179:1: (this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1180:5: this_PredicateDivision_0= rulePredicateDivision ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getPredicateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2473);
            this_PredicateDivision_0=rulePredicateDivision();

            state._fsp--;

             
                    current = this_PredicateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1188:1: ( () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1188:2: () otherlv_2= '*' ( (lv_right_3_0= rulePredicateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1188:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1189:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateMultiplicationAccess().getPredicateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePredicateMultiplication2494); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1198:1: ( (lv_right_3_0= rulePredicateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1199:1: (lv_right_3_0= rulePredicateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1199:1: (lv_right_3_0= rulePredicateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1200:3: lv_right_3_0= rulePredicateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateMultiplicationAccess().getRightPredicateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2515);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1227:1: entryRulePredicateDivision returns [EObject current=null] : iv_rulePredicateDivision= rulePredicateDivision EOF ;
    public final EObject entryRulePredicateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1231:2: (iv_rulePredicateDivision= rulePredicateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1232:2: iv_rulePredicateDivision= rulePredicateDivision EOF
            {
             newCompositeNode(grammarAccess.getPredicateDivisionRule()); 
            pushFollow(FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2563);
            iv_rulePredicateDivision=rulePredicateDivision();

            state._fsp--;

             current =iv_rulePredicateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDivision2573); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1242:1: rulePredicateDivision returns [EObject current=null] : (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) ;
    public final EObject rulePredicateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PredicatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1246:28: ( (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1247:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1247:1: (this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1248:5: this_PredicatePrimary_0= rulePredicatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPredicateDivisionAccess().getPredicatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2624);
            this_PredicatePrimary_0=rulePredicatePrimary();

            state._fsp--;

             
                    current = this_PredicatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1256:1: ( () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1256:2: () otherlv_2= '/' ( (lv_right_3_0= rulePredicatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1256:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1257:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPredicateDivisionAccess().getPredicateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePredicateDivision2645); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPredicateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1266:1: ( (lv_right_3_0= rulePredicatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1267:1: (lv_right_3_0= rulePredicatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1267:1: (lv_right_3_0= rulePredicatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1268:3: lv_right_3_0= rulePredicatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateDivisionAccess().getRightPredicatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2666);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1295:1: entryRulePredicatePrimary returns [EObject current=null] : iv_rulePredicatePrimary= rulePredicatePrimary EOF ;
    public final EObject entryRulePredicatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1299:2: (iv_rulePredicatePrimary= rulePredicatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1300:2: iv_rulePredicatePrimary= rulePredicatePrimary EOF
            {
             newCompositeNode(grammarAccess.getPredicatePrimaryRule()); 
            pushFollow(FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2714);
            iv_rulePredicatePrimary=rulePredicatePrimary();

            state._fsp--;

             current =iv_rulePredicatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicatePrimary2724); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1310:1: rulePredicatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1314:28: ( ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1315:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1315:1: ( (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) ) | this_PredicateAtomic_6= rulePredicateAtomic )
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
            case 47:
            case 48:
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1315:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1315:2: (otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1315:4: otherlv_0= '(' this_PredicateExpression_1= rulePredicateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePredicatePrimary2766); 

                        	newLeafNode(otherlv_0, grammarAccess.getPredicatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2788);
                    this_PredicateExpression_1=rulePredicateExpression();

                    state._fsp--;

                     
                            current = this_PredicateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePredicatePrimary2799); 

                        	newLeafNode(otherlv_2, grammarAccess.getPredicatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1333:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1333:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1333:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePredicatePrimary ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1333:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1334:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicatePrimaryAccess().getPredicateNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulePredicatePrimary2828); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredicatePrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1343:1: ( (lv_expression_5_0= rulePredicatePrimary ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1344:1: (lv_expression_5_0= rulePredicatePrimary )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1344:1: (lv_expression_5_0= rulePredicatePrimary )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1345:3: lv_expression_5_0= rulePredicatePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getExpressionPredicatePrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2849);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1363:5: this_PredicateAtomic_6= rulePredicateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPredicatePrimaryAccess().getPredicateAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2878);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1382:1: entryRulePredicateAtomic returns [EObject current=null] : iv_rulePredicateAtomic= rulePredicateAtomic EOF ;
    public final EObject entryRulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1386:2: (iv_rulePredicateAtomic= rulePredicateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1387:2: iv_rulePredicateAtomic= rulePredicateAtomic EOF
            {
             newCompositeNode(grammarAccess.getPredicateAtomicRule()); 
            pushFollow(FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2923);
            iv_rulePredicateAtomic=rulePredicateAtomic();

            state._fsp--;

             current =iv_rulePredicateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateAtomic2933); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1397:1: rulePredicateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_PredicateStoreReference_4= rulePredicateStoreReference ) ;
    public final EObject rulePredicateAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject this_PredicateStoreReference_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1401:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_PredicateStoreReference_4= rulePredicateStoreReference ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1402:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_PredicateStoreReference_4= rulePredicateStoreReference )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1402:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | ( () ( (lv_value_3_0= ruleBool ) ) ) | this_PredicateStoreReference_4= rulePredicateStoreReference )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case 47:
            case 48:
                {
                alt17=2;
                }
                break;
            case RULE_LOWER:
            case 14:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1402:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1402:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1402:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1402:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1403:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1408:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1409:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1409:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1410:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_rulePredicateAtomic2993);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1427:6: ( () ( (lv_value_3_0= ruleBool ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1427:6: ( () ( (lv_value_3_0= ruleBool ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1427:7: () ( (lv_value_3_0= ruleBool ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1427:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1428:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAtomicAccess().getBooleanConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1433:2: ( (lv_value_3_0= ruleBool ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1434:1: (lv_value_3_0= ruleBool )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1434:1: (lv_value_3_0= ruleBool )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1435:3: lv_value_3_0= ruleBool
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAtomicAccess().getValueBoolParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBool_in_rulePredicateAtomic3031);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1453:5: this_PredicateStoreReference_4= rulePredicateStoreReference
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAtomicAccess().getPredicateStoreReferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateStoreReference_in_rulePredicateAtomic3060);
                    this_PredicateStoreReference_4=rulePredicateStoreReference();

                    state._fsp--;

                     
                            current = this_PredicateStoreReference_4; 
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


    // $ANTLR start "entryRulePredicateStoreReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1472:1: entryRulePredicateStoreReference returns [EObject current=null] : iv_rulePredicateStoreReference= rulePredicateStoreReference EOF ;
    public final EObject entryRulePredicateStoreReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateStoreReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1476:2: (iv_rulePredicateStoreReference= rulePredicateStoreReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1477:2: iv_rulePredicateStoreReference= rulePredicateStoreReference EOF
            {
             newCompositeNode(grammarAccess.getPredicateStoreReferenceRule()); 
            pushFollow(FOLLOW_rulePredicateStoreReference_in_entryRulePredicateStoreReference3105);
            iv_rulePredicateStoreReference=rulePredicateStoreReference();

            state._fsp--;

             current =iv_rulePredicateStoreReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateStoreReference3115); 

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
    // $ANTLR end "entryRulePredicateStoreReference"


    // $ANTLR start "rulePredicateStoreReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1487:1: rulePredicateStoreReference returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) ;
    public final EObject rulePredicateStoreReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1491:28: ( ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:2: () ( (lv_ref_1_0= ruleStoreExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1492:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1493:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateStoreReferenceAccess().getPredicateStoreReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1498:2: ( (lv_ref_1_0= ruleStoreExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1499:1: (lv_ref_1_0= ruleStoreExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1499:1: (lv_ref_1_0= ruleStoreExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1500:3: lv_ref_1_0= ruleStoreExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateStoreReferenceAccess().getRefStoreExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreExpression_in_rulePredicateStoreReference3174);
            lv_ref_1_0=ruleStoreExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateStoreReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_1_0, 
                    		"StoreExpression");
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
    // $ANTLR end "rulePredicateStoreReference"


    // $ANTLR start "entryRuleArguments"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1527:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1531:2: (iv_ruleArguments= ruleArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1532:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments3220);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments3230); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1542:1: ruleArguments returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | ( () otherlv_7= '()' ) | (otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>' ) | ( () otherlv_15= '<>' ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;

        EObject lv_expressions_10_0 = null;

        EObject lv_expressions_12_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1546:28: ( ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | ( () otherlv_7= '()' ) | (otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>' ) | ( () otherlv_15= '<>' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1547:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | ( () otherlv_7= '()' ) | (otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>' ) | ( () otherlv_15= '<>' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1547:1: ( (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' ) | ( () otherlv_7= '()' ) | (otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>' ) | ( () otherlv_15= '<>' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 26:
                {
                alt22=3;
                }
                break;
            case 35:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1547:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1547:2: (otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1547:4: otherlv_0= '(' () ( (lv_expressions_2_0= ruleInArguments ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )* otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleArguments3272); 

                        	newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1551:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1552:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getInAction_0_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1557:2: ( (lv_expressions_2_0= ruleInArguments ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1558:1: (lv_expressions_2_0= ruleInArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1558:1: (lv_expressions_2_0= ruleInArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1559:3: lv_expressions_2_0= ruleInArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments3302);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1575:2: (otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+ )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==33) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1575:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleInArguments ) )+
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleArguments3315); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getCommaKeyword_0_3_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1579:1: ( (lv_expressions_4_0= ruleInArguments ) )+
                    	    int cnt18=0;
                    	    loop18:
                    	    do {
                    	        int alt18=2;
                    	        int LA18_0 = input.LA(1);

                    	        if ( (LA18_0==RULE_LOWER) ) {
                    	            alt18=1;
                    	        }


                    	        switch (alt18) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1580:1: (lv_expressions_4_0= ruleInArguments )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1580:1: (lv_expressions_4_0= ruleInArguments )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1581:3: lv_expressions_4_0= ruleInArguments
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsInArgumentsParserRuleCall_0_3_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInArguments_in_ruleArguments3336);
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

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleArguments3351); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1602:6: ( () otherlv_7= '()' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1602:6: ( () otherlv_7= '()' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1602:7: () otherlv_7= '()'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1602:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1603:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getInAction_1_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleArguments3380); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentsAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1613:6: (otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1613:6: (otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1613:8: otherlv_8= '<' () ( (lv_expressions_10_0= ruleOutArguments ) ) (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )* otherlv_13= '>'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleArguments3400); 

                        	newLeafNode(otherlv_8, grammarAccess.getArgumentsAccess().getLessThanSignKeyword_2_0());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1617:1: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1618:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getOutAction_2_1(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1623:2: ( (lv_expressions_10_0= ruleOutArguments ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1624:1: (lv_expressions_10_0= ruleOutArguments )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1624:1: (lv_expressions_10_0= ruleOutArguments )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1625:3: lv_expressions_10_0= ruleOutArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3430);
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

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:2: (otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+ )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==33) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1641:4: otherlv_11= ',' ( (lv_expressions_12_0= ruleOutArguments ) )+
                    	    {
                    	    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleArguments3443); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getArgumentsAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1645:1: ( (lv_expressions_12_0= ruleOutArguments ) )+
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
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1646:1: (lv_expressions_12_0= ruleOutArguments )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1646:1: (lv_expressions_12_0= ruleOutArguments )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1647:3: lv_expressions_12_0= ruleOutArguments
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsOutArgumentsParserRuleCall_2_3_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleOutArguments_in_ruleArguments3464);
                    	    	    lv_expressions_12_0=ruleOutArguments();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"expressions",
                    	    	            		lv_expressions_12_0, 
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

                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleArguments3479); 

                        	newLeafNode(otherlv_13, grammarAccess.getArgumentsAccess().getGreaterThanSignKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:6: ( () otherlv_15= '<>' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:6: ( () otherlv_15= '<>' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:7: () otherlv_15= '<>'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1668:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1669:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getArgumentsAccess().getOutAction_3_0(),
                                current);
                        

                    }

                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleArguments3508); 

                        	newLeafNode(otherlv_15, grammarAccess.getArgumentsAccess().getLessThanSignGreaterThanSignKeyword_3_1());
                        

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1689:1: entryRuleInArguments returns [EObject current=null] : iv_ruleInArguments= ruleInArguments EOF ;
    public final EObject entryRuleInArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1693:2: (iv_ruleInArguments= ruleInArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1694:2: iv_ruleInArguments= ruleInArguments EOF
            {
             newCompositeNode(grammarAccess.getInArgumentsRule()); 
            pushFollow(FOLLOW_ruleInArguments_in_entryRuleInArguments3555);
            iv_ruleInArguments=ruleInArguments();

            state._fsp--;

             current =iv_ruleInArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInArguments3565); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1704:1: ruleInArguments returns [EObject current=null] : this_Variables_0= ruleVariables ;
    public final EObject ruleInArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Variables_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1708:28: (this_Variables_0= ruleVariables )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1710:5: this_Variables_0= ruleVariables
            {
             
                    newCompositeNode(grammarAccess.getInArgumentsAccess().getVariablesParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariables_in_ruleInArguments3615);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1729:1: entryRuleOutArguments returns [EObject current=null] : iv_ruleOutArguments= ruleOutArguments EOF ;
    public final EObject entryRuleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutArguments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1733:2: (iv_ruleOutArguments= ruleOutArguments EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1734:2: iv_ruleOutArguments= ruleOutArguments EOF
            {
             newCompositeNode(grammarAccess.getOutArgumentsRule()); 
            pushFollow(FOLLOW_ruleOutArguments_in_entryRuleOutArguments3659);
            iv_ruleOutArguments=ruleOutArguments();

            state._fsp--;

             current =iv_ruleOutArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutArguments3669); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1744:1: ruleOutArguments returns [EObject current=null] : this_Expressions_0= ruleExpressions ;
    public final EObject ruleOutArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Expressions_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1748:28: (this_Expressions_0= ruleExpressions )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1750:5: this_Expressions_0= ruleExpressions
            {
             
                    newCompositeNode(grammarAccess.getOutArgumentsAccess().getExpressionsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpressions_in_ruleOutArguments3719);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1769:1: entryRuleExpressions returns [EObject current=null] : iv_ruleExpressions= ruleExpressions EOF ;
    public final EObject entryRuleExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressions = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1773:2: (iv_ruleExpressions= ruleExpressions EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1774:2: iv_ruleExpressions= ruleExpressions EOF
            {
             newCompositeNode(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_ruleExpressions_in_entryRuleExpressions3763);
            iv_ruleExpressions=ruleExpressions();

            state._fsp--;

             current =iv_ruleExpressions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressions3773); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1784:1: ruleExpressions returns [EObject current=null] : (this_OutStoreReference_0= ruleOutStoreReference | ( () ( (lv_value_2_0= ruleNatural ) ) ) ) ;
    public final EObject ruleExpressions() throws RecognitionException {
        EObject current = null;

        EObject this_OutStoreReference_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1788:28: ( (this_OutStoreReference_0= ruleOutStoreReference | ( () ( (lv_value_2_0= ruleNatural ) ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1789:1: (this_OutStoreReference_0= ruleOutStoreReference | ( () ( (lv_value_2_0= ruleNatural ) ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1789:1: (this_OutStoreReference_0= ruleOutStoreReference | ( () ( (lv_value_2_0= ruleNatural ) ) ) )
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1790:5: this_OutStoreReference_0= ruleOutStoreReference
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionsAccess().getOutStoreReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOutStoreReference_in_ruleExpressions3824);
                    this_OutStoreReference_0=ruleOutStoreReference();

                    state._fsp--;

                     
                            current = this_OutStoreReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1799:6: ( () ( (lv_value_2_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1799:6: ( () ( (lv_value_2_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1799:7: () ( (lv_value_2_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1799:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1800:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getExpressionsAccess().getConstantAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1805:2: ( (lv_value_2_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1806:1: (lv_value_2_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1806:1: (lv_value_2_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1807:3: lv_value_2_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionsAccess().getValueNaturalParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleExpressions3860);
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


    // $ANTLR start "entryRuleOutStoreReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1834:1: entryRuleOutStoreReference returns [EObject current=null] : iv_ruleOutStoreReference= ruleOutStoreReference EOF ;
    public final EObject entryRuleOutStoreReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutStoreReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1838:2: (iv_ruleOutStoreReference= ruleOutStoreReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1839:2: iv_ruleOutStoreReference= ruleOutStoreReference EOF
            {
             newCompositeNode(grammarAccess.getOutStoreReferenceRule()); 
            pushFollow(FOLLOW_ruleOutStoreReference_in_entryRuleOutStoreReference3907);
            iv_ruleOutStoreReference=ruleOutStoreReference();

            state._fsp--;

             current =iv_ruleOutStoreReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutStoreReference3917); 

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
    // $ANTLR end "entryRuleOutStoreReference"


    // $ANTLR start "ruleOutStoreReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1849:1: ruleOutStoreReference returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) ;
    public final EObject ruleOutStoreReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1853:28: ( ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1854:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1854:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1854:2: () ( (lv_ref_1_0= ruleStoreExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1854:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1855:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutStoreReferenceAccess().getOutStoreReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1860:2: ( (lv_ref_1_0= ruleStoreExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1861:1: (lv_ref_1_0= ruleStoreExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1861:1: (lv_ref_1_0= ruleStoreExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1862:3: lv_ref_1_0= ruleStoreExpression
            {
             
            	        newCompositeNode(grammarAccess.getOutStoreReferenceAccess().getRefStoreExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreExpression_in_ruleOutStoreReference3976);
            lv_ref_1_0=ruleStoreExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutStoreReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_1_0, 
                    		"StoreExpression");
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
    // $ANTLR end "ruleOutStoreReference"


    // $ANTLR start "entryRuleVariables"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1889:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1893:2: (iv_ruleVariables= ruleVariables EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1894:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables4022);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables4032); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1904:1: ruleVariables returns [EObject current=null] : this_FreeVariable_0= ruleFreeVariable ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_FreeVariable_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1908:28: (this_FreeVariable_0= ruleFreeVariable )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1910:5: this_FreeVariable_0= ruleFreeVariable
            {
             
                    newCompositeNode(grammarAccess.getVariablesAccess().getFreeVariableParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleFreeVariable_in_ruleVariables4082);
            this_FreeVariable_0=ruleFreeVariable();

            state._fsp--;

             
                    current = this_FreeVariable_0; 
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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleUpdates"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1929:1: entryRuleUpdates returns [EObject current=null] : iv_ruleUpdates= ruleUpdates EOF ;
    public final EObject entryRuleUpdates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdates = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1933:2: (iv_ruleUpdates= ruleUpdates EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1934:2: iv_ruleUpdates= ruleUpdates EOF
            {
             newCompositeNode(grammarAccess.getUpdatesRule()); 
            pushFollow(FOLLOW_ruleUpdates_in_entryRuleUpdates4126);
            iv_ruleUpdates=ruleUpdates();

            state._fsp--;

             current =iv_ruleUpdates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdates4136); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1944:1: ruleUpdates returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1948:28: ( ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1949:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1949:1: ( () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1949:2: () otherlv_1= '{' ( (lv_updates_2_0= ruleUpdate ) ) (otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+ )* otherlv_5= '}'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1949:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1950:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdatesAccess().getUpdatesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleUpdates4186); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdatesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1959:1: ( (lv_updates_2_0= ruleUpdate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1960:1: (lv_updates_2_0= ruleUpdate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1960:1: (lv_updates_2_0= ruleUpdate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1961:3: lv_updates_2_0= ruleUpdate
            {
             
            	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates4207);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1977:2: (otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+ )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1977:4: otherlv_3= ',' ( (lv_updates_4_0= ruleUpdate ) )+
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleUpdates4220); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUpdatesAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1981:1: ( (lv_updates_4_0= ruleUpdate ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==RULE_LOWER||LA24_0==14) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1982:1: (lv_updates_4_0= ruleUpdate )
            	    	    {
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1982:1: (lv_updates_4_0= ruleUpdate )
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:1983:3: lv_updates_4_0= ruleUpdate
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getUpdatesAccess().getUpdatesUpdateParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUpdate_in_ruleUpdates4241);
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

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleUpdates4256); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2014:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2018:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2019:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate4302);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate4312); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2029:1: ruleUpdate returns [EObject current=null] : (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        EObject this_DistributedEventUpdate_0 = null;

        EObject this_SingleEventUpdate_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2033:28: ( (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2034:1: (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2034:1: (this_DistributedEventUpdate_0= ruleDistributedEventUpdate | this_SingleEventUpdate_1= ruleSingleEventUpdate )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_LOWER) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==13) ) {
                    int LA26_3 = input.LA(3);

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
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0==14) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_LOWER) ) {
                    int LA26_4 = input.LA(3);

                    if ( (LA26_4==13) ) {
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
                            new NoViableAltException("", 26, 4, input);

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
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2035:5: this_DistributedEventUpdate_0= ruleDistributedEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getDistributedEventUpdateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate4363);
                    this_DistributedEventUpdate_0=ruleDistributedEventUpdate();

                    state._fsp--;

                     
                            current = this_DistributedEventUpdate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2045:5: this_SingleEventUpdate_1= ruleSingleEventUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAccess().getSingleEventUpdateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSingleEventUpdate_in_ruleUpdate4390);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2064:1: entryRuleSingleEventUpdate returns [EObject current=null] : iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF ;
    public final EObject entryRuleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2068:2: (iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2069:2: iv_ruleSingleEventUpdate= ruleSingleEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getSingleEventUpdateRule()); 
            pushFollow(FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate4435);
            iv_ruleSingleEventUpdate=ruleSingleEventUpdate();

            state._fsp--;

             current =iv_ruleSingleEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleEventUpdate4445); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2079:1: ruleSingleEventUpdate returns [EObject current=null] : ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' ( (lv_assigner_3_0= ruleUpdateExpression ) ) ) ;
    public final EObject ruleSingleEventUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_assignee_1_0 = null;

        EObject lv_assigner_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2083:28: ( ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' ( (lv_assigner_3_0= ruleUpdateExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2084:1: ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' ( (lv_assigner_3_0= ruleUpdateExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2084:1: ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' ( (lv_assigner_3_0= ruleUpdateExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2084:2: () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' ( (lv_assigner_3_0= ruleUpdateExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2084:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2085:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleEventUpdateAccess().getLocalSingleEventUpdateAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2090:2: ( (lv_assignee_1_0= ruleUpdateReference ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2091:1: (lv_assignee_1_0= ruleUpdateReference )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2091:1: (lv_assignee_1_0= ruleUpdateReference )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2092:3: lv_assignee_1_0= ruleUpdateReference
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getAssigneeUpdateReferenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateReference_in_ruleSingleEventUpdate4504);
            lv_assignee_1_0=ruleUpdateReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleEventUpdateRule());
            	        }
                   		set(
                   			current, 
                   			"assignee",
                    		lv_assignee_1_0, 
                    		"UpdateReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSingleEventUpdate4516); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleEventUpdateAccess().getColonEqualsSignKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2112:1: ( (lv_assigner_3_0= ruleUpdateExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2113:1: (lv_assigner_3_0= ruleUpdateExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2113:1: (lv_assigner_3_0= ruleUpdateExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2114:3: lv_assigner_3_0= ruleUpdateExpression
            {
             
            	        newCompositeNode(grammarAccess.getSingleEventUpdateAccess().getAssignerUpdateExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4537);
            lv_assigner_3_0=ruleUpdateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleEventUpdateRule());
            	        }
                   		set(
                   			current, 
                   			"assigner",
                    		lv_assigner_3_0, 
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2141:1: entryRuleDistributedEventUpdate returns [EObject current=null] : iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF ;
    public final EObject entryRuleDistributedEventUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributedEventUpdate = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2145:2: (iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2146:2: iv_ruleDistributedEventUpdate= ruleDistributedEventUpdate EOF
            {
             newCompositeNode(grammarAccess.getDistributedEventUpdateRule()); 
            pushFollow(FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4583);
            iv_ruleDistributedEventUpdate=ruleDistributedEventUpdate();

            state._fsp--;

             current =iv_ruleDistributedEventUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributedEventUpdate4593); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2156:1: ruleDistributedEventUpdate returns [EObject current=null] : ( ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) ) ;
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
        EObject lv_assignee_1_0 = null;

        EObject lv_assigner_5_0 = null;

        EObject lv_distribution_7_0 = null;

        EObject lv_assignee_10_0 = null;

        EObject lv_assigner_14_0 = null;

        EObject lv_distribution_16_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2160:28: ( ( ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:1: ( ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:1: ( ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' ) | ( () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LOWER) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==13) ) {
                    int LA31_3 = input.LA(3);

                    if ( (LA31_3==39) ) {
                        alt31=2;
                    }
                    else if ( (LA31_3==38) ) {
                        alt31=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA31_0==14) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==RULE_LOWER) ) {
                    int LA31_4 = input.LA(3);

                    if ( (LA31_4==13) ) {
                        int LA31_3 = input.LA(4);

                        if ( (LA31_3==39) ) {
                            alt31=2;
                        }
                        else if ( (LA31_3==38) ) {
                            alt31=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 4, input);

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
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:2: ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:2: ( () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:3: () ( (lv_assignee_1_0= ruleUpdateReference ) ) otherlv_2= ':=' otherlv_3= 'Pr' otherlv_4= '(' ( (lv_assigner_5_0= ruleDistribution ) ) (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )* otherlv_8= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2161:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2162:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateProbabilityAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2167:2: ( (lv_assignee_1_0= ruleUpdateReference ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2168:1: (lv_assignee_1_0= ruleUpdateReference )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2168:1: (lv_assignee_1_0= ruleUpdateReference )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2169:3: lv_assignee_1_0= ruleUpdateReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getAssigneeUpdateReferenceParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdateReference_in_ruleDistributedEventUpdate4653);
                    lv_assignee_1_0=ruleUpdateReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"assignee",
                            		lv_assignee_1_0, 
                            		"UpdateReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDistributedEventUpdate4665); 

                        	newLeafNode(otherlv_2, grammarAccess.getDistributedEventUpdateAccess().getColonEqualsSignKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleDistributedEventUpdate4677); 

                        	newLeafNode(otherlv_3, grammarAccess.getDistributedEventUpdateAccess().getPrKeyword_0_3());
                        
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleDistributedEventUpdate4689); 

                        	newLeafNode(otherlv_4, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2197:1: ( (lv_assigner_5_0= ruleDistribution ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2198:1: (lv_assigner_5_0= ruleDistribution )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2198:1: (lv_assigner_5_0= ruleDistribution )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2199:3: lv_assigner_5_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getAssignerDistributionParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4710);
                    lv_assigner_5_0=ruleDistribution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		add(
                           			current, 
                           			"assigner",
                            		lv_assigner_5_0, 
                            		"Distribution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2215:2: (otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+ )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==33) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2215:4: otherlv_6= ',' ( (lv_distribution_7_0= ruleDistribution ) )+
                    	    {
                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4723); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_0_6_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2219:1: ( (lv_distribution_7_0= ruleDistribution ) )+
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
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:1: (lv_distribution_7_0= ruleDistribution )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2220:1: (lv_distribution_7_0= ruleDistribution )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2221:3: lv_distribution_7_0= ruleDistribution
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionDistributionParserRuleCall_0_6_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4744);
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

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleDistributedEventUpdate4759); 

                        	newLeafNode(otherlv_8, grammarAccess.getDistributedEventUpdateAccess().getRightParenthesisKeyword_0_7());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2242:6: ( () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2242:6: ( () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2242:7: () ( (lv_assignee_10_0= ruleUpdateReference ) ) otherlv_11= ':=' otherlv_12= 'U' otherlv_13= '(' ( (lv_assigner_14_0= ruleUniform ) ) (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )* otherlv_17= ')'
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2242:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2243:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributedEventUpdateAccess().getDistributedEventUpdateUniformAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2248:2: ( (lv_assignee_10_0= ruleUpdateReference ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2249:1: (lv_assignee_10_0= ruleUpdateReference )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2249:1: (lv_assignee_10_0= ruleUpdateReference )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2250:3: lv_assignee_10_0= ruleUpdateReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getAssigneeUpdateReferenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUpdateReference_in_ruleDistributedEventUpdate4797);
                    lv_assignee_10_0=ruleUpdateReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"assignee",
                            		lv_assignee_10_0, 
                            		"UpdateReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleDistributedEventUpdate4809); 

                        	newLeafNode(otherlv_11, grammarAccess.getDistributedEventUpdateAccess().getColonEqualsSignKeyword_1_2());
                        
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleDistributedEventUpdate4821); 

                        	newLeafNode(otherlv_12, grammarAccess.getDistributedEventUpdateAccess().getUKeyword_1_3());
                        
                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleDistributedEventUpdate4833); 

                        	newLeafNode(otherlv_13, grammarAccess.getDistributedEventUpdateAccess().getLeftParenthesisKeyword_1_4());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2278:1: ( (lv_assigner_14_0= ruleUniform ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2279:1: (lv_assigner_14_0= ruleUniform )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2279:1: (lv_assigner_14_0= ruleUniform )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2280:3: lv_assigner_14_0= ruleUniform
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getAssignerUniformParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4854);
                    lv_assigner_14_0=ruleUniform();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDistributedEventUpdateRule());
                    	        }
                           		add(
                           			current, 
                           			"assigner",
                            		lv_assigner_14_0, 
                            		"Uniform");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2296:2: (otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+ )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==33) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2296:4: otherlv_15= ',' ( (lv_distribution_16_0= ruleUniform ) )+
                    	    {
                    	    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleDistributedEventUpdate4867); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getDistributedEventUpdateAccess().getCommaKeyword_1_6_0());
                    	        
                    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2300:1: ( (lv_distribution_16_0= ruleUniform ) )+
                    	    int cnt29=0;
                    	    loop29:
                    	    do {
                    	        int alt29=2;
                    	        int LA29_0 = input.LA(1);

                    	        if ( (LA29_0==RULE_LOWER||LA29_0==RULE_INT||LA29_0==14) ) {
                    	            alt29=1;
                    	        }


                    	        switch (alt29) {
                    	    	case 1 :
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2301:1: (lv_distribution_16_0= ruleUniform )
                    	    	    {
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2301:1: (lv_distribution_16_0= ruleUniform )
                    	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2302:3: lv_distribution_16_0= ruleUniform
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getDistributedEventUpdateAccess().getDistributionUniformParserRuleCall_1_6_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4888);
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

                    otherlv_17=(Token)match(input,31,FOLLOW_31_in_ruleDistributedEventUpdate4903); 

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


    // $ANTLR start "entryRuleUpdateReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2333:1: entryRuleUpdateReference returns [EObject current=null] : iv_ruleUpdateReference= ruleUpdateReference EOF ;
    public final EObject entryRuleUpdateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2337:2: (iv_ruleUpdateReference= ruleUpdateReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2338:2: iv_ruleUpdateReference= ruleUpdateReference EOF
            {
             newCompositeNode(grammarAccess.getUpdateReferenceRule()); 
            pushFollow(FOLLOW_ruleUpdateReference_in_entryRuleUpdateReference4950);
            iv_ruleUpdateReference=ruleUpdateReference();

            state._fsp--;

             current =iv_ruleUpdateReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateReference4960); 

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
    // $ANTLR end "entryRuleUpdateReference"


    // $ANTLR start "ruleUpdateReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2348:1: ruleUpdateReference returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) ;
    public final EObject ruleUpdateReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2352:28: ( ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2353:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2353:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2353:2: () ( (lv_ref_1_0= ruleStoreExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2353:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdateReferenceAccess().getUpdateStoreReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2359:2: ( (lv_ref_1_0= ruleStoreExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2360:1: (lv_ref_1_0= ruleStoreExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2360:1: (lv_ref_1_0= ruleStoreExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2361:3: lv_ref_1_0= ruleStoreExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateReferenceAccess().getRefStoreExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreExpression_in_ruleUpdateReference5019);
            lv_ref_1_0=ruleStoreExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_1_0, 
                    		"StoreExpression");
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
    // $ANTLR end "ruleUpdateReference"


    // $ANTLR start "entryRuleDistribution"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2388:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2392:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2393:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution5065);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution5075); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2403:1: ruleDistribution returns [EObject current=null] : ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) | this_DistributionReference_4= ruleDistributionReference ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prob_1_0 = null;

        AntlrDatatypeRuleToken lv_expression_3_0 = null;

        EObject this_DistributionReference_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2407:28: ( ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) | this_DistributionReference_4= ruleDistributionReference ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2408:1: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) | this_DistributionReference_4= ruleDistributionReference )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2408:1: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) | this_DistributionReference_4= ruleDistributionReference )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2408:2: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2408:2: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2408:3: () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2408:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2409:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDistributionAccess().getDistributionNaturalAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2414:2: ( (lv_prob_1_0= ruleDouble ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2415:1: (lv_prob_1_0= ruleDouble )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2415:1: (lv_prob_1_0= ruleDouble )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2416:3: lv_prob_1_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributionAccess().getProbDoubleParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleDistribution5135);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleDistribution5147); 

                        	newLeafNode(otherlv_2, grammarAccess.getDistributionAccess().getColonKeyword_0_2());
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2436:1: ( (lv_expression_3_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2437:1: (lv_expression_3_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2437:1: (lv_expression_3_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2438:3: lv_expression_3_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getDistributionAccess().getExpressionNaturalParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleDistribution5168);
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
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2456:5: this_DistributionReference_4= ruleDistributionReference
                    {
                     
                            newCompositeNode(grammarAccess.getDistributionAccess().getDistributionReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDistributionReference_in_ruleDistribution5197);
                    this_DistributionReference_4=ruleDistributionReference();

                    state._fsp--;

                     
                            current = this_DistributionReference_4; 
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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleDistributionReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2475:1: entryRuleDistributionReference returns [EObject current=null] : iv_ruleDistributionReference= ruleDistributionReference EOF ;
    public final EObject entryRuleDistributionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributionReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2479:2: (iv_ruleDistributionReference= ruleDistributionReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2480:2: iv_ruleDistributionReference= ruleDistributionReference EOF
            {
             newCompositeNode(grammarAccess.getDistributionReferenceRule()); 
            pushFollow(FOLLOW_ruleDistributionReference_in_entryRuleDistributionReference5242);
            iv_ruleDistributionReference=ruleDistributionReference();

            state._fsp--;

             current =iv_ruleDistributionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributionReference5252); 

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
    // $ANTLR end "entryRuleDistributionReference"


    // $ANTLR start "ruleDistributionReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2490:1: ruleDistributionReference returns [EObject current=null] : ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_ref_3_0= ruleStoreExpression ) ) ) ;
    public final EObject ruleDistributionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prob_1_0 = null;

        EObject lv_ref_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2494:28: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_ref_3_0= ruleStoreExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2495:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_ref_3_0= ruleStoreExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2495:1: ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_ref_3_0= ruleStoreExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2495:2: () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_ref_3_0= ruleStoreExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2495:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDistributionReferenceAccess().getDistributionReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2501:2: ( (lv_prob_1_0= ruleDouble ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2502:1: (lv_prob_1_0= ruleDouble )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2502:1: (lv_prob_1_0= ruleDouble )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2503:3: lv_prob_1_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getDistributionReferenceAccess().getProbDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleDistributionReference5311);
            lv_prob_1_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"prob",
                    		lv_prob_1_0, 
                    		"Double");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleDistributionReference5323); 

                	newLeafNode(otherlv_2, grammarAccess.getDistributionReferenceAccess().getColonKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2523:1: ( (lv_ref_3_0= ruleStoreExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2524:1: (lv_ref_3_0= ruleStoreExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2524:1: (lv_ref_3_0= ruleStoreExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2525:3: lv_ref_3_0= ruleStoreExpression
            {
             
            	        newCompositeNode(grammarAccess.getDistributionReferenceAccess().getRefStoreExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreExpression_in_ruleDistributionReference5344);
            lv_ref_3_0=ruleStoreExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_3_0, 
                    		"StoreExpression");
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
    // $ANTLR end "ruleDistributionReference"


    // $ANTLR start "entryRuleUniform"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2552:1: entryRuleUniform returns [EObject current=null] : iv_ruleUniform= ruleUniform EOF ;
    public final EObject entryRuleUniform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniform = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2556:2: (iv_ruleUniform= ruleUniform EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2557:2: iv_ruleUniform= ruleUniform EOF
            {
             newCompositeNode(grammarAccess.getUniformRule()); 
            pushFollow(FOLLOW_ruleUniform_in_entryRuleUniform5390);
            iv_ruleUniform=ruleUniform();

            state._fsp--;

             current =iv_ruleUniform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniform5400); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2567:1: ruleUniform returns [EObject current=null] : ( ( () ( (lv_expression_1_0= ruleNatural ) ) ) | this_UniformReference_2= ruleUniformReference ) ;
    public final EObject ruleUniform() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;

        EObject this_UniformReference_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2571:28: ( ( ( () ( (lv_expression_1_0= ruleNatural ) ) ) | this_UniformReference_2= ruleUniformReference ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2572:1: ( ( () ( (lv_expression_1_0= ruleNatural ) ) ) | this_UniformReference_2= ruleUniformReference )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2572:1: ( ( () ( (lv_expression_1_0= ruleNatural ) ) ) | this_UniformReference_2= ruleUniformReference )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_LOWER||LA33_0==14) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2572:2: ( () ( (lv_expression_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2572:2: ( () ( (lv_expression_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2572:3: () ( (lv_expression_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2572:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2573:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUniformAccess().getUniformNaturalAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2578:2: ( (lv_expression_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2579:1: (lv_expression_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2579:1: (lv_expression_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2580:3: lv_expression_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getUniformAccess().getExpressionNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleUniform5460);
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
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2598:5: this_UniformReference_2= ruleUniformReference
                    {
                     
                            newCompositeNode(grammarAccess.getUniformAccess().getUniformReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUniformReference_in_ruleUniform5489);
                    this_UniformReference_2=ruleUniformReference();

                    state._fsp--;

                     
                            current = this_UniformReference_2; 
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
    // $ANTLR end "ruleUniform"


    // $ANTLR start "entryRuleUniformReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2617:1: entryRuleUniformReference returns [EObject current=null] : iv_ruleUniformReference= ruleUniformReference EOF ;
    public final EObject entryRuleUniformReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniformReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2621:2: (iv_ruleUniformReference= ruleUniformReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2622:2: iv_ruleUniformReference= ruleUniformReference EOF
            {
             newCompositeNode(grammarAccess.getUniformReferenceRule()); 
            pushFollow(FOLLOW_ruleUniformReference_in_entryRuleUniformReference5534);
            iv_ruleUniformReference=ruleUniformReference();

            state._fsp--;

             current =iv_ruleUniformReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniformReference5544); 

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
    // $ANTLR end "entryRuleUniformReference"


    // $ANTLR start "ruleUniformReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2632:1: ruleUniformReference returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) ;
    public final EObject ruleUniformReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2636:28: ( ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2637:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2637:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2637:2: () ( (lv_ref_1_0= ruleStoreExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2637:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2638:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniformReferenceAccess().getUniformReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2643:2: ( (lv_ref_1_0= ruleStoreExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2644:1: (lv_ref_1_0= ruleStoreExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2644:1: (lv_ref_1_0= ruleStoreExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2645:3: lv_ref_1_0= ruleStoreExpression
            {
             
            	        newCompositeNode(grammarAccess.getUniformReferenceAccess().getRefStoreExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreExpression_in_ruleUniformReference5603);
            lv_ref_1_0=ruleStoreExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniformReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_1_0, 
                    		"StoreExpression");
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
    // $ANTLR end "ruleUniformReference"


    // $ANTLR start "entryRuleUpdateExpression"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2672:1: entryRuleUpdateExpression returns [EObject current=null] : iv_ruleUpdateExpression= ruleUpdateExpression EOF ;
    public final EObject entryRuleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2676:2: (iv_ruleUpdateExpression= ruleUpdateExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2677:2: iv_ruleUpdateExpression= ruleUpdateExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression5649);
            iv_ruleUpdateExpression=ruleUpdateExpression();

            state._fsp--;

             current =iv_ruleUpdateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpression5659); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2687:1: ruleUpdateExpression returns [EObject current=null] : this_UpdateSubtraction_0= ruleUpdateSubtraction ;
    public final EObject ruleUpdateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateSubtraction_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2691:28: (this_UpdateSubtraction_0= ruleUpdateSubtraction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2693:5: this_UpdateSubtraction_0= ruleUpdateSubtraction
            {
             
                    newCompositeNode(grammarAccess.getUpdateExpressionAccess().getUpdateSubtractionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_ruleUpdateExpression5709);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2712:1: entryRuleUpdateSubtraction returns [EObject current=null] : iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF ;
    public final EObject entryRuleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateSubtraction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2716:2: (iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2717:2: iv_ruleUpdateSubtraction= ruleUpdateSubtraction EOF
            {
             newCompositeNode(grammarAccess.getUpdateSubtractionRule()); 
            pushFollow(FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction5753);
            iv_ruleUpdateSubtraction=ruleUpdateSubtraction();

            state._fsp--;

             current =iv_ruleUpdateSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateSubtraction5763); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2727:1: ruleUpdateSubtraction returns [EObject current=null] : (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) ;
    public final EObject ruleUpdateSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateAddition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2731:28: ( (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2732:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2732:1: (this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2733:5: this_UpdateAddition_0= ruleUpdateAddition ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getUpdateAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5814);
            this_UpdateAddition_0=ruleUpdateAddition();

            state._fsp--;

             
                    current = this_UpdateAddition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2741:1: ( () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2741:2: () otherlv_2= '-' ( (lv_right_3_0= ruleUpdateAddition ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2741:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2742:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateSubtractionAccess().getUpdateSubLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleUpdateSubtraction5835); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateSubtractionAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2751:1: ( (lv_right_3_0= ruleUpdateAddition ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2752:1: (lv_right_3_0= ruleUpdateAddition )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2752:1: (lv_right_3_0= ruleUpdateAddition )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2753:3: lv_right_3_0= ruleUpdateAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateSubtractionAccess().getRightUpdateAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5856);
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
    // $ANTLR end "ruleUpdateSubtraction"


    // $ANTLR start "entryRuleUpdateAddition"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2780:1: entryRuleUpdateAddition returns [EObject current=null] : iv_ruleUpdateAddition= ruleUpdateAddition EOF ;
    public final EObject entryRuleUpdateAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAddition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2784:2: (iv_ruleUpdateAddition= ruleUpdateAddition EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2785:2: iv_ruleUpdateAddition= ruleUpdateAddition EOF
            {
             newCompositeNode(grammarAccess.getUpdateAdditionRule()); 
            pushFollow(FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5904);
            iv_ruleUpdateAddition=ruleUpdateAddition();

            state._fsp--;

             current =iv_ruleUpdateAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAddition5914); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2795:1: ruleUpdateAddition returns [EObject current=null] : (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) ;
    public final EObject ruleUpdateAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2799:28: ( (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2800:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2800:1: (this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2801:5: this_UpdateMultiplication_0= ruleUpdateMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateAdditionAccess().getUpdateMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5965);
            this_UpdateMultiplication_0=ruleUpdateMultiplication();

            state._fsp--;

             
                    current = this_UpdateMultiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2809:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2809:2: () otherlv_2= '+' ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2809:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2810:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateAdditionAccess().getUpdatePluLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleUpdateAddition5986); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2819:1: ( (lv_right_3_0= ruleUpdateMultiplication ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2820:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2820:1: (lv_right_3_0= ruleUpdateMultiplication )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2821:3: lv_right_3_0= ruleUpdateMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAdditionAccess().getRightUpdateMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition6007);
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
    // $ANTLR end "ruleUpdateAddition"


    // $ANTLR start "entryRuleUpdateMultiplication"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2848:1: entryRuleUpdateMultiplication returns [EObject current=null] : iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF ;
    public final EObject entryRuleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMultiplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2852:2: (iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2853:2: iv_ruleUpdateMultiplication= ruleUpdateMultiplication EOF
            {
             newCompositeNode(grammarAccess.getUpdateMultiplicationRule()); 
            pushFollow(FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication6055);
            iv_ruleUpdateMultiplication=ruleUpdateMultiplication();

            state._fsp--;

             current =iv_ruleUpdateMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateMultiplication6065); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2863:1: ruleUpdateMultiplication returns [EObject current=null] : (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) ;
    public final EObject ruleUpdateMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdateDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2867:28: ( (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2868:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2868:1: (this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2869:5: this_UpdateDivision_0= ruleUpdateDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getUpdateDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication6116);
            this_UpdateDivision_0=ruleUpdateDivision();

            state._fsp--;

             
                    current = this_UpdateDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2877:1: ( () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2877:2: () otherlv_2= '*' ( (lv_right_3_0= ruleUpdateDivision ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2877:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2878:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateMultiplicationAccess().getUpdateMulLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUpdateMultiplication6137); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2887:1: ( (lv_right_3_0= ruleUpdateDivision ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2888:1: (lv_right_3_0= ruleUpdateDivision )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2888:1: (lv_right_3_0= ruleUpdateDivision )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2889:3: lv_right_3_0= ruleUpdateDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateMultiplicationAccess().getRightUpdateDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication6158);
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
    // $ANTLR end "ruleUpdateMultiplication"


    // $ANTLR start "entryRuleUpdateDivision"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2916:1: entryRuleUpdateDivision returns [EObject current=null] : iv_ruleUpdateDivision= ruleUpdateDivision EOF ;
    public final EObject entryRuleUpdateDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateDivision = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2920:2: (iv_ruleUpdateDivision= ruleUpdateDivision EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2921:2: iv_ruleUpdateDivision= ruleUpdateDivision EOF
            {
             newCompositeNode(grammarAccess.getUpdateDivisionRule()); 
            pushFollow(FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision6206);
            iv_ruleUpdateDivision=ruleUpdateDivision();

            state._fsp--;

             current =iv_ruleUpdateDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateDivision6216); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2931:1: ruleUpdateDivision returns [EObject current=null] : (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) ;
    public final EObject ruleUpdateDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UpdatePrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2935:28: ( (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2936:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2936:1: (this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2937:5: this_UpdatePrimary_0= ruleUpdatePrimary ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpdateDivisionAccess().getUpdatePrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6267);
            this_UpdatePrimary_0=ruleUpdatePrimary();

            state._fsp--;

             
                    current = this_UpdatePrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2945:1: ( () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2945:2: () otherlv_2= '/' ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2945:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2946:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpdateDivisionAccess().getUpdateDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleUpdateDivision6288); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2955:1: ( (lv_right_3_0= ruleUpdatePrimary ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2956:1: (lv_right_3_0= ruleUpdatePrimary )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2956:1: (lv_right_3_0= ruleUpdatePrimary )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2957:3: lv_right_3_0= ruleUpdatePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateDivisionAccess().getRightUpdatePrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6309);
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
    // $ANTLR end "ruleUpdateDivision"


    // $ANTLR start "entryRuleUpdatePrimary"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2984:1: entryRuleUpdatePrimary returns [EObject current=null] : iv_ruleUpdatePrimary= ruleUpdatePrimary EOF ;
    public final EObject entryRuleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2988:2: (iv_ruleUpdatePrimary= ruleUpdatePrimary EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2989:2: iv_ruleUpdatePrimary= ruleUpdatePrimary EOF
            {
             newCompositeNode(grammarAccess.getUpdatePrimaryRule()); 
            pushFollow(FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary6357);
            iv_ruleUpdatePrimary=ruleUpdatePrimary();

            state._fsp--;

             current =iv_ruleUpdatePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdatePrimary6367); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:2999:1: ruleUpdatePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic ) ;
    public final EObject ruleUpdatePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_UpdateExpression_1 = null;

        EObject this_UpdateAtomic_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3003:28: ( ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3004:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3004:1: ( (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' ) | this_UpdateAtomic_3= ruleUpdateAtomic )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_LOWER||LA38_0==RULE_INT||LA38_0==14) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3004:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3004:2: (otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3004:4: otherlv_0= '(' this_UpdateExpression_1= ruleUpdateExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleUpdatePrimary6409); 

                        	newLeafNode(otherlv_0, grammarAccess.getUpdatePrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary6431);
                    this_UpdateExpression_1=ruleUpdateExpression();

                    state._fsp--;

                     
                            current = this_UpdateExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleUpdatePrimary6442); 

                        	newLeafNode(otherlv_2, grammarAccess.getUpdatePrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3023:5: this_UpdateAtomic_3= ruleUpdateAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getUpdatePrimaryAccess().getUpdateAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary6471);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3042:1: entryRuleUpdateAtomic returns [EObject current=null] : iv_ruleUpdateAtomic= ruleUpdateAtomic EOF ;
    public final EObject entryRuleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAtomic = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3046:2: (iv_ruleUpdateAtomic= ruleUpdateAtomic EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3047:2: iv_ruleUpdateAtomic= ruleUpdateAtomic EOF
            {
             newCompositeNode(grammarAccess.getUpdateAtomicRule()); 
            pushFollow(FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic6516);
            iv_ruleUpdateAtomic=ruleUpdateAtomic();

            state._fsp--;

             current =iv_ruleUpdateAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateAtomic6526); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3057:1: ruleUpdateAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_UpdateExpressionStoreReference_2= ruleUpdateExpressionStoreReference ) ;
    public final EObject ruleUpdateAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_UpdateExpressionStoreReference_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3061:28: ( ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_UpdateExpressionStoreReference_2= ruleUpdateExpressionStoreReference ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_UpdateExpressionStoreReference_2= ruleUpdateExpressionStoreReference )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:1: ( ( () ( (lv_value_1_0= ruleNatural ) ) ) | this_UpdateExpressionStoreReference_2= ruleUpdateExpressionStoreReference )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_LOWER||LA39_0==14) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:2: ( () ( (lv_value_1_0= ruleNatural ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:3: () ( (lv_value_1_0= ruleNatural ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3062:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3063:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAtomicAccess().getConstantAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3068:2: ( (lv_value_1_0= ruleNatural ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3069:1: (lv_value_1_0= ruleNatural )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3069:1: (lv_value_1_0= ruleNatural )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3070:3: lv_value_1_0= ruleNatural
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateAtomicAccess().getValueNaturalParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNatural_in_ruleUpdateAtomic6586);
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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3088:5: this_UpdateExpressionStoreReference_2= ruleUpdateExpressionStoreReference
                    {
                     
                            newCompositeNode(grammarAccess.getUpdateAtomicAccess().getUpdateExpressionStoreReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateExpressionStoreReference_in_ruleUpdateAtomic6615);
                    this_UpdateExpressionStoreReference_2=ruleUpdateExpressionStoreReference();

                    state._fsp--;

                     
                            current = this_UpdateExpressionStoreReference_2; 
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


    // $ANTLR start "entryRuleUpdateExpressionStoreReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3107:1: entryRuleUpdateExpressionStoreReference returns [EObject current=null] : iv_ruleUpdateExpressionStoreReference= ruleUpdateExpressionStoreReference EOF ;
    public final EObject entryRuleUpdateExpressionStoreReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateExpressionStoreReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3111:2: (iv_ruleUpdateExpressionStoreReference= ruleUpdateExpressionStoreReference EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3112:2: iv_ruleUpdateExpressionStoreReference= ruleUpdateExpressionStoreReference EOF
            {
             newCompositeNode(grammarAccess.getUpdateExpressionStoreReferenceRule()); 
            pushFollow(FOLLOW_ruleUpdateExpressionStoreReference_in_entryRuleUpdateExpressionStoreReference6660);
            iv_ruleUpdateExpressionStoreReference=ruleUpdateExpressionStoreReference();

            state._fsp--;

             current =iv_ruleUpdateExpressionStoreReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateExpressionStoreReference6670); 

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
    // $ANTLR end "entryRuleUpdateExpressionStoreReference"


    // $ANTLR start "ruleUpdateExpressionStoreReference"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3122:1: ruleUpdateExpressionStoreReference returns [EObject current=null] : ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) ;
    public final EObject ruleUpdateExpressionStoreReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3126:28: ( ( () ( (lv_ref_1_0= ruleStoreExpression ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3127:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3127:1: ( () ( (lv_ref_1_0= ruleStoreExpression ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3127:2: () ( (lv_ref_1_0= ruleStoreExpression ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3127:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3128:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdateExpressionStoreReferenceAccess().getUpdateExpressionStoreReferenceAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3133:2: ( (lv_ref_1_0= ruleStoreExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3134:1: (lv_ref_1_0= ruleStoreExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3134:1: (lv_ref_1_0= ruleStoreExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3135:3: lv_ref_1_0= ruleStoreExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateExpressionStoreReferenceAccess().getRefStoreExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStoreExpression_in_ruleUpdateExpressionStoreReference6729);
            lv_ref_1_0=ruleStoreExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateExpressionStoreReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_1_0, 
                    		"StoreExpression");
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
    // $ANTLR end "ruleUpdateExpressionStoreReference"


    // $ANTLR start "entryRuleProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3162:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3166:2: (iv_ruleProcess= ruleProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3167:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess6775);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess6785); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3177:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3181:28: ( ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3182:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3182:1: ( ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3182:2: ( (lv_name_0_0= RULE_UPPER ) ) otherlv_1= '=' ( (lv_value_2_0= ruleProcessExpression ) ) otherlv_3= ';'
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3182:2: ( (lv_name_0_0= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3183:1: (lv_name_0_0= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3183:1: (lv_name_0_0= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3184:3: lv_name_0_0= RULE_UPPER
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleProcess6831); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleProcess6848); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getEqualsSignKeyword_1());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3204:1: ( (lv_value_2_0= ruleProcessExpression ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3205:1: (lv_value_2_0= ruleProcessExpression )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3205:1: (lv_value_2_0= ruleProcessExpression )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3206:3: lv_value_2_0= ruleProcessExpression
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getValueProcessExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessExpression_in_ruleProcess6869);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleProcess6881); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3237:1: entryRuleProcessExpression returns [EObject current=null] : iv_ruleProcessExpression= ruleProcessExpression EOF ;
    public final EObject entryRuleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3241:2: (iv_ruleProcessExpression= ruleProcessExpression EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3242:2: iv_ruleProcessExpression= ruleProcessExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessExpressionRule()); 
            pushFollow(FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression6927);
            iv_ruleProcessExpression=ruleProcessExpression();

            state._fsp--;

             current =iv_ruleProcessExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessExpression6937); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3252:1: ruleProcessExpression returns [EObject current=null] : this_Parallel_0= ruleParallel ;
    public final EObject ruleProcessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Parallel_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3256:28: (this_Parallel_0= ruleParallel )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3258:5: this_Parallel_0= ruleParallel
            {
             
                    newCompositeNode(grammarAccess.getProcessExpressionAccess().getParallelParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleParallel_in_ruleProcessExpression6987);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3277:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3281:2: (iv_ruleParallel= ruleParallel EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3282:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel7031);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel7041); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3292:1: ruleParallel returns [EObject current=null] : (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Choice_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3296:28: ( (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3297:1: (this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3298:5: this_Choice_0= ruleChoice ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getParallelAccess().getChoiceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleChoice_in_ruleParallel7092);
            this_Choice_0=ruleChoice();

            state._fsp--;

             
                    current = this_Choice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3306:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==43) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3306:2: () otherlv_2= '|' ( (lv_right_3_0= ruleChoice ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3306:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3307:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getParallelAccess().getParallelLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleParallel7113); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3316:1: ( (lv_right_3_0= ruleChoice ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:1: (lv_right_3_0= ruleChoice )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3317:1: (lv_right_3_0= ruleChoice )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3318:3: lv_right_3_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getRightChoiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleParallel7134);
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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleChoice"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3345:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3349:2: (iv_ruleChoice= ruleChoice EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3350:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice7182);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice7192); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3360:1: ruleChoice returns [EObject current=null] : (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryProcess_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3364:28: ( (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3365:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3365:1: (this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )* )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3366:5: this_PrimaryProcess_0= rulePrimaryProcess ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getChoiceAccess().getPrimaryProcessParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice7243);
            this_PrimaryProcess_0=rulePrimaryProcess();

            state._fsp--;

             
                    current = this_PrimaryProcess_0; 
                    afterParserOrEnumRuleCall();
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3374:1: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3374:2: () otherlv_2= '+' ( (lv_right_3_0= rulePrimaryProcess ) )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3374:2: ()
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3375:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getChoiceAccess().getChoiceLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleChoice7264); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3384:1: ( (lv_right_3_0= rulePrimaryProcess ) )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3385:1: (lv_right_3_0= rulePrimaryProcess )
            	    {
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3385:1: (lv_right_3_0= rulePrimaryProcess )
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3386:3: lv_right_3_0= rulePrimaryProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getRightPrimaryProcessParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryProcess_in_ruleChoice7285);
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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRulePrimaryProcess"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3413:1: entryRulePrimaryProcess returns [EObject current=null] : iv_rulePrimaryProcess= rulePrimaryProcess EOF ;
    public final EObject entryRulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3417:2: (iv_rulePrimaryProcess= rulePrimaryProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3418:2: iv_rulePrimaryProcess= rulePrimaryProcess EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProcessRule()); 
            pushFollow(FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess7333);
            iv_rulePrimaryProcess=rulePrimaryProcess();

            state._fsp--;

             current =iv_rulePrimaryProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryProcess7343); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3428:1: rulePrimaryProcess returns [EObject current=null] : ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess ) ;
    public final EObject rulePrimaryProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ProcessExpression_1 = null;

        EObject this_AtomicProcess_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3432:28: ( ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:1: ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:1: ( (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' ) | this_AtomicProcess_3= ruleAtomicProcess )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=RULE_LOWER && LA42_0<=RULE_UPPER)||LA42_0==17||(LA42_0>=44 && LA42_0<=45)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:2: (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:2: (otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3433:4: otherlv_0= '(' this_ProcessExpression_1= ruleProcessExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePrimaryProcess7385); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryProcessAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getProcessExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleProcessExpression_in_rulePrimaryProcess7407);
                    this_ProcessExpression_1=ruleProcessExpression();

                    state._fsp--;

                     
                            current = this_ProcessExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePrimaryProcess7418); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryProcessAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3452:5: this_AtomicProcess_3= ruleAtomicProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryProcessAccess().getAtomicProcessParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomicProcess_in_rulePrimaryProcess7447);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3471:1: entryRuleAtomicProcess returns [EObject current=null] : iv_ruleAtomicProcess= ruleAtomicProcess EOF ;
    public final EObject entryRuleAtomicProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3475:2: (iv_ruleAtomicProcess= ruleAtomicProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3476:2: iv_ruleAtomicProcess= ruleAtomicProcess EOF
            {
             newCompositeNode(grammarAccess.getAtomicProcessRule()); 
            pushFollow(FOLLOW_ruleAtomicProcess_in_entryRuleAtomicProcess7492);
            iv_ruleAtomicProcess=ruleAtomicProcess();

            state._fsp--;

             current =iv_ruleAtomicProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicProcess7502); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3486:1: ruleAtomicProcess returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess ) ;
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
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3490:28: ( ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:1: ( ( () ( (lv_value_1_0= 'nil' ) ) ) | ( () ( (lv_value_3_0= 'kill' ) ) ) | this_PredicateProcess_4= rulePredicateProcess | this_ActionProcess_5= ruleActionProcess | this_ReferencedProcess_6= ruleReferencedProcess )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt43=1;
                }
                break;
            case 45:
                {
                alt43=2;
                }
                break;
            case 17:
                {
                alt43=3;
                }
                break;
            case RULE_LOWER:
                {
                alt43=4;
                }
                break;
            case RULE_UPPER:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:2: ( () ( (lv_value_1_0= 'nil' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:3: () ( (lv_value_1_0= 'nil' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3491:3: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3492:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicProcessAccess().getLeafAction_0_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3497:2: ( (lv_value_1_0= 'nil' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3498:1: (lv_value_1_0= 'nil' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3498:1: (lv_value_1_0= 'nil' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3499:3: lv_value_1_0= 'nil'
                    {
                    lv_value_1_0=(Token)match(input,44,FOLLOW_44_in_ruleAtomicProcess7559); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3513:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3513:6: ( () ( (lv_value_3_0= 'kill' ) ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3513:7: () ( (lv_value_3_0= 'kill' ) )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3513:7: ()
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3514:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicProcessAccess().getLeafAction_1_0(),
                                current);
                        

                    }

                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3519:2: ( (lv_value_3_0= 'kill' ) )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3520:1: (lv_value_3_0= 'kill' )
                    {
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3520:1: (lv_value_3_0= 'kill' )
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3521:3: lv_value_3_0= 'kill'
                    {
                    lv_value_3_0=(Token)match(input,45,FOLLOW_45_in_ruleAtomicProcess7607); 

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
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3536:5: this_PredicateProcess_4= rulePredicateProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getPredicateProcessParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateProcess_in_ruleAtomicProcess7649);
                    this_PredicateProcess_4=rulePredicateProcess();

                    state._fsp--;

                     
                            current = this_PredicateProcess_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3546:5: this_ActionProcess_5= ruleActionProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getActionProcessParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActionProcess_in_ruleAtomicProcess7676);
                    this_ActionProcess_5=ruleActionProcess();

                    state._fsp--;

                     
                            current = this_ActionProcess_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3556:5: this_ReferencedProcess_6= ruleReferencedProcess
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicProcessAccess().getReferencedProcessParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReferencedProcess_in_ruleAtomicProcess7703);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3575:1: entryRulePredicateProcess returns [EObject current=null] : iv_rulePredicateProcess= rulePredicateProcess EOF ;
    public final EObject entryRulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3579:2: (iv_rulePredicateProcess= rulePredicateProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3580:2: iv_rulePredicateProcess= rulePredicateProcess EOF
            {
             newCompositeNode(grammarAccess.getPredicateProcessRule()); 
            pushFollow(FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess7748);
            iv_rulePredicateProcess=rulePredicateProcess();

            state._fsp--;

             current =iv_rulePredicateProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateProcess7758); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3590:1: rulePredicateProcess returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) ;
    public final EObject rulePredicateProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_1_0 = null;

        EObject lv_ref_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3594:28: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3595:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3595:1: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3595:2: () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_ref_2_0= rulePrimaryProcess ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3595:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3596:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateProcessAccess().getPredicateProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3601:2: ( (lv_predicate_1_0= rulePredicate ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3602:1: (lv_predicate_1_0= rulePredicate )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3602:1: (lv_predicate_1_0= rulePredicate )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3603:3: lv_predicate_1_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getPredicatePredicateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_rulePredicateProcess7817);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3619:2: ( (lv_ref_2_0= rulePrimaryProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3620:1: (lv_ref_2_0= rulePrimaryProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3620:1: (lv_ref_2_0= rulePrimaryProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3621:3: lv_ref_2_0= rulePrimaryProcess
            {
             
            	        newCompositeNode(grammarAccess.getPredicateProcessAccess().getRefPrimaryProcessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryProcess_in_rulePredicateProcess7838);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3648:1: entryRuleActionProcess returns [EObject current=null] : iv_ruleActionProcess= ruleActionProcess EOF ;
    public final EObject entryRuleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3652:2: (iv_ruleActionProcess= ruleActionProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3653:2: iv_ruleActionProcess= ruleActionProcess EOF
            {
             newCompositeNode(grammarAccess.getActionProcessRule()); 
            pushFollow(FOLLOW_ruleActionProcess_in_entryRuleActionProcess7884);
            iv_ruleActionProcess=ruleActionProcess();

            state._fsp--;

             current =iv_ruleActionProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionProcess7894); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3663:1: ruleActionProcess returns [EObject current=null] : ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) ;
    public final EObject ruleActionProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_action_1_0 = null;

        EObject lv_ref_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3667:28: ( ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3668:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3668:1: ( () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3668:2: () ( (lv_action_1_0= ruleAction ) ) ( (lv_ref_2_0= rulePrimaryProcess ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3668:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3669:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionProcessAccess().getActionProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3674:2: ( (lv_action_1_0= ruleAction ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3675:1: (lv_action_1_0= ruleAction )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3675:1: (lv_action_1_0= ruleAction )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3676:3: lv_action_1_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getActionActionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleActionProcess7953);
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

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3692:2: ( (lv_ref_2_0= rulePrimaryProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3693:1: (lv_ref_2_0= rulePrimaryProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3693:1: (lv_ref_2_0= rulePrimaryProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3694:3: lv_ref_2_0= rulePrimaryProcess
            {
             
            	        newCompositeNode(grammarAccess.getActionProcessAccess().getRefPrimaryProcessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryProcess_in_ruleActionProcess7974);
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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3721:1: entryRuleReferencedProcess returns [EObject current=null] : iv_ruleReferencedProcess= ruleReferencedProcess EOF ;
    public final EObject entryRuleReferencedProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedProcess = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3725:2: (iv_ruleReferencedProcess= ruleReferencedProcess EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3726:2: iv_ruleReferencedProcess= ruleReferencedProcess EOF
            {
             newCompositeNode(grammarAccess.getReferencedProcessRule()); 
            pushFollow(FOLLOW_ruleReferencedProcess_in_entryRuleReferencedProcess8020);
            iv_ruleReferencedProcess=ruleReferencedProcess();

            state._fsp--;

             current =iv_ruleReferencedProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedProcess8030); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3736:1: ruleReferencedProcess returns [EObject current=null] : ( () ( (otherlv_1= RULE_UPPER ) ) ) ;
    public final EObject ruleReferencedProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3740:28: ( ( () ( (otherlv_1= RULE_UPPER ) ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3741:1: ( () ( (otherlv_1= RULE_UPPER ) ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3741:1: ( () ( (otherlv_1= RULE_UPPER ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3741:2: () ( (otherlv_1= RULE_UPPER ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3741:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3742:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferencedProcessAccess().getReferencedProcessAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3747:2: ( (otherlv_1= RULE_UPPER ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3748:1: (otherlv_1= RULE_UPPER )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3748:1: (otherlv_1= RULE_UPPER )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3749:3: otherlv_1= RULE_UPPER
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedProcessRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_UPPER,FOLLOW_RULE_UPPER_in_ruleReferencedProcess8088); 

            		newLeafNode(otherlv_1, grammarAccess.getReferencedProcessAccess().getRefProcessCrossReference_1_0()); 
            	

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3771:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3775:2: (iv_ruleTerm= ruleTerm EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3776:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm8134);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm8144); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3786:1: ruleTerm returns [EObject current=null] : (otherlv_0= '(' ( (lv_ref_1_0= ruleReferencedProcess ) ) otherlv_2= ',' ( (lv_stores_3_0= ruleStores ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_ref_1_0 = null;

        EObject lv_stores_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3790:28: ( (otherlv_0= '(' ( (lv_ref_1_0= ruleReferencedProcess ) ) otherlv_2= ',' ( (lv_stores_3_0= ruleStores ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3791:1: (otherlv_0= '(' ( (lv_ref_1_0= ruleReferencedProcess ) ) otherlv_2= ',' ( (lv_stores_3_0= ruleStores ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3791:1: (otherlv_0= '(' ( (lv_ref_1_0= ruleReferencedProcess ) ) otherlv_2= ',' ( (lv_stores_3_0= ruleStores ) ) otherlv_4= ')' otherlv_5= ';' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3791:3: otherlv_0= '(' ( (lv_ref_1_0= ruleReferencedProcess ) ) otherlv_2= ',' ( (lv_stores_3_0= ruleStores ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTerm8185); 

                	newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3795:1: ( (lv_ref_1_0= ruleReferencedProcess ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3796:1: (lv_ref_1_0= ruleReferencedProcess )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3796:1: (lv_ref_1_0= ruleReferencedProcess )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3797:3: lv_ref_1_0= ruleReferencedProcess
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getRefReferencedProcessParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReferencedProcess_in_ruleTerm8206);
            lv_ref_1_0=ruleReferencedProcess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_1_0, 
                    		"ReferencedProcess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTerm8218); 

                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getCommaKeyword_2());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3817:1: ( (lv_stores_3_0= ruleStores ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3818:1: (lv_stores_3_0= ruleStores )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3818:1: (lv_stores_3_0= ruleStores )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3819:3: lv_stores_3_0= ruleStores
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getStoresStoresParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStores_in_ruleTerm8239);
            lv_stores_3_0=ruleStores();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRule());
            	        }
                   		set(
                   			current, 
                   			"stores",
                    		lv_stores_3_0, 
                    		"Stores");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleTerm8251); 

                	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleTerm8263); 

                	newLeafNode(otherlv_5, grammarAccess.getTermAccess().getSemicolonKeyword_5());
                

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


    // $ANTLR start "entryRuleStores"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3854:1: entryRuleStores returns [EObject current=null] : iv_ruleStores= ruleStores EOF ;
    public final EObject entryRuleStores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStores = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3858:2: (iv_ruleStores= ruleStores EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3859:2: iv_ruleStores= ruleStores EOF
            {
             newCompositeNode(grammarAccess.getStoresRule()); 
            pushFollow(FOLLOW_ruleStores_in_entryRuleStores8309);
            iv_ruleStores=ruleStores();

            state._fsp--;

             current =iv_ruleStores; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStores8319); 

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
    // $ANTLR end "entryRuleStores"


    // $ANTLR start "ruleStores"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3869:1: ruleStores returns [EObject current=null] : (otherlv_0= '{' ( (lv_stores_1_0= ruleStore ) ) (otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+ )* otherlv_4= '}' ) ;
    public final EObject ruleStores() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_stores_1_0 = null;

        EObject lv_stores_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3873:28: ( (otherlv_0= '{' ( (lv_stores_1_0= ruleStore ) ) (otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+ )* otherlv_4= '}' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3874:1: (otherlv_0= '{' ( (lv_stores_1_0= ruleStore ) ) (otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+ )* otherlv_4= '}' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3874:1: (otherlv_0= '{' ( (lv_stores_1_0= ruleStore ) ) (otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+ )* otherlv_4= '}' )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3874:3: otherlv_0= '{' ( (lv_stores_1_0= ruleStore ) ) (otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+ )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStores8360); 

                	newLeafNode(otherlv_0, grammarAccess.getStoresAccess().getLeftCurlyBracketKeyword_0());
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3878:1: ( (lv_stores_1_0= ruleStore ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3879:1: (lv_stores_1_0= ruleStore )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3879:1: (lv_stores_1_0= ruleStore )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3880:3: lv_stores_1_0= ruleStore
            {
             
            	        newCompositeNode(grammarAccess.getStoresAccess().getStoresStoreParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStore_in_ruleStores8381);
            lv_stores_1_0=ruleStore();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoresRule());
            	        }
                   		add(
                   			current, 
                   			"stores",
                    		lv_stores_1_0, 
                    		"Store");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3896:2: (otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+ )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3896:4: otherlv_2= ',' ( (lv_stores_3_0= ruleStore ) )+
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleStores8394); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStoresAccess().getCommaKeyword_2_0());
            	        
            	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3900:1: ( (lv_stores_3_0= ruleStore ) )+
            	    int cnt44=0;
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==RULE_LOWER) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3901:1: (lv_stores_3_0= ruleStore )
            	    	    {
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3901:1: (lv_stores_3_0= ruleStore )
            	    	    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3902:3: lv_stores_3_0= ruleStore
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getStoresAccess().getStoresStoreParserRuleCall_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleStore_in_ruleStores8415);
            	    	    lv_stores_3_0=ruleStore();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getStoresRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"stores",
            	    	            		lv_stores_3_0, 
            	    	            		"Store");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt44 >= 1 ) break loop44;
            	                EarlyExitException eee =
            	                    new EarlyExitException(44, input);
            	                throw eee;
            	        }
            	        cnt44++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleStores8430); 

                	newLeafNode(otherlv_4, grammarAccess.getStoresAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleStores"


    // $ANTLR start "entryRuleDouble"
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3933:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3934:2: (iv_ruleDouble= ruleDouble EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3935:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble8471);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble8482); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3942:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3945:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3946:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3946:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )? )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3946:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble8522); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3953:1: (kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3954:2: kw= '.' this_INT_2= RULE_INT (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )?
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleDouble8541); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble8556); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3966:1: (kw= '^' (kw= '-' )? this_INT_5= RULE_INT )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==46) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3967:2: kw= '^' (kw= '-' )? this_INT_5= RULE_INT
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleDouble8575); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDoubleAccess().getCircumflexAccentKeyword_1_2_0()); 
                                
                            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3972:1: (kw= '-' )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==27) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3973:2: kw= '-'
                                    {
                                    kw=(Token)match(input,27,FOLLOW_27_in_ruleDouble8589); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_1_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble8606); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3993:1: entryRuleNatural returns [String current=null] : iv_ruleNatural= ruleNatural EOF ;
    public final String entryRuleNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNatural = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3994:2: (iv_ruleNatural= ruleNatural EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:3995:2: iv_ruleNatural= ruleNatural EOF
            {
             newCompositeNode(grammarAccess.getNaturalRule()); 
            pushFollow(FOLLOW_ruleNatural_in_entryRuleNatural8656);
            iv_ruleNatural=ruleNatural();

            state._fsp--;

             current =iv_ruleNatural.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNatural8667); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4002:1: ruleNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4005:28: (this_INT_0= RULE_INT )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4006:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNatural8706); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4021:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4022:2: (iv_ruleBool= ruleBool EOF )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4023:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool8750);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool8760); 

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
    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4030:1: ruleBool returns [EObject current=null] : ( () (otherlv_1= 'True' | otherlv_2= 'False' ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4033:28: ( ( () (otherlv_1= 'True' | otherlv_2= 'False' ) ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4034:1: ( () (otherlv_1= 'True' | otherlv_2= 'False' ) )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4034:1: ( () (otherlv_1= 'True' | otherlv_2= 'False' ) )
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4034:2: () (otherlv_1= 'True' | otherlv_2= 'False' )
            {
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4034:2: ()
            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4035:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolAccess().getBooleanConstantAction_0(),
                        current);
                

            }

            // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4040:2: (otherlv_1= 'True' | otherlv_2= 'False' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            else if ( (LA49_0==48) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4040:4: otherlv_1= 'True'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleBool8807); 

                        	newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getTrueKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../eu.quanticol.caspa/src-gen/eu/quanticol/parser/antlr/internal/InternalCASPA.g:4045:7: otherlv_2= 'False'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleBool8825); 

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


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\12\uffff";
    static final String DFA32_eofS =
        "\12\uffff";
    static final String DFA32_minS =
        "\1\6\1\20\1\6\1\4\1\50\2\uffff\2\6\1\50";
    static final String DFA32_maxS =
        "\1\6\1\50\1\6\1\16\1\56\2\uffff\1\33\1\6\1\50";
    static final String DFA32_acceptS =
        "\5\uffff\1\2\1\1\3\uffff";
    static final String DFA32_specialS =
        "\12\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\2\27\uffff\1\3",
            "\1\4",
            "\1\5\1\uffff\1\6\7\uffff\1\5",
            "\1\3\5\uffff\1\7",
            "",
            "",
            "\1\11\24\uffff\1\10",
            "\1\11",
            "\1\3"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2408:1: ( ( () ( (lv_prob_1_0= ruleDouble ) ) otherlv_2= ':' ( (lv_expression_3_0= ruleNatural ) ) ) | this_DistributionReference_4= ruleDistributionReference )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleModel141 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleModel163 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleStore275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStore292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleStore313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleReference424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReference_in_entryRuleSelfReference475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfReference485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSelfReference535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleSelfReference552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_entryRuleFreeVariable603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeVariable613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleFreeVariable668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_entryRuleStoreExpression719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStoreExpression729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStoreExpression780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfReference_in_ruleStoreExpression807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction919 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAction936 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LOWER_in_ruleAction970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleAction998 = new BitSet(new long[]{0x0000000C44000000L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleAction1019 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_ruleUpdates_in_ruleAction1040 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAction1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePredicate1159 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicate1180 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePredicate1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_rulePredicateExpression1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateOr_in_entryRulePredicateOr1342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateOr1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1403 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePredicateOr1424 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_rulePredicateOr1445 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePredicateAnd_in_entryRulePredicateAnd1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAnd1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1554 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePredicateAnd1575 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_rulePredicateAnd1596 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePredicateEquality_in_entryRulePredicateEquality1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateEquality1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1705 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_rulePredicateEquality1734 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_22_in_rulePredicateEquality1763 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_rulePredicateEquality1800 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rulePredicateComparison_in_entryRulePredicateComparison1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateComparison1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison1909 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_23_in_rulePredicateComparison1938 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_24_in_rulePredicateComparison1967 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_25_in_rulePredicateComparison1996 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_26_in_rulePredicateComparison2025 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_rulePredicateComparison2062 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_rulePredicateSubtraction_in_entryRulePredicateSubtraction2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateSubtraction2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2171 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePredicateSubtraction2192 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_rulePredicateSubtraction2213 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePredicateAddition_in_entryRulePredicateAddition2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAddition2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2322 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rulePredicateAddition2343 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_rulePredicateAddition2364 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePredicateMultiplication_in_entryRulePredicateMultiplication2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateMultiplication2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2473 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePredicateMultiplication2494 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_rulePredicateMultiplication2515 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePredicateDivision_in_entryRulePredicateDivision2563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDivision2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2624 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePredicateDivision2645 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicateDivision2666 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_entryRulePredicatePrimary2714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicatePrimary2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePredicatePrimary2766 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicatePrimary2788 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePredicatePrimary2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePredicatePrimary2828 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_rulePredicatePrimary_in_rulePredicatePrimary2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_rulePredicatePrimary2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateAtomic_in_entryRulePredicateAtomic2923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateAtomic2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_rulePredicateAtomic2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rulePredicateAtomic3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateStoreReference_in_rulePredicateAtomic3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateStoreReference_in_entryRulePredicateStoreReference3105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateStoreReference3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_rulePredicateStoreReference3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleArguments3272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments3302 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleArguments3315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInArguments_in_ruleArguments3336 = new BitSet(new long[]{0x0000000280000010L});
    public static final BitSet FOLLOW_31_in_ruleArguments3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleArguments3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleArguments3400 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3430 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_ruleArguments3443 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleOutArguments_in_ruleArguments3464 = new BitSet(new long[]{0x0001800342004050L});
    public static final BitSet FOLLOW_25_in_ruleArguments3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleArguments3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInArguments_in_entryRuleInArguments3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInArguments3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleInArguments3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutArguments_in_entryRuleOutArguments3659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutArguments3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_ruleOutArguments3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressions_in_entryRuleExpressions3763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressions3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutStoreReference_in_ruleExpressions3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleExpressions3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutStoreReference_in_entryRuleOutStoreReference3907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutStoreReference3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_ruleOutStoreReference3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeVariable_in_ruleVariables4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdates_in_entryRuleUpdates4126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdates4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUpdates4186 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates4207 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_33_in_ruleUpdates4220 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleUpdates4241 = new BitSet(new long[]{0x0001802340004050L});
    public static final BitSet FOLLOW_37_in_ruleUpdates4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate4302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_ruleUpdate4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_ruleUpdate4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleEventUpdate_in_entryRuleSingleEventUpdate4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleEventUpdate4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateReference_in_ruleSingleEventUpdate4504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleEventUpdate4516 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleSingleEventUpdate4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributedEventUpdate_in_entryRuleDistributedEventUpdate4583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributedEventUpdate4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateReference_in_ruleDistributedEventUpdate4653 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDistributedEventUpdate4665 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDistributedEventUpdate4677 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDistributedEventUpdate4689 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4710 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4723 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleDistributedEventUpdate4744 = new BitSet(new long[]{0x0000000280000040L});
    public static final BitSet FOLLOW_31_in_ruleDistributedEventUpdate4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateReference_in_ruleDistributedEventUpdate4797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDistributedEventUpdate4809 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDistributedEventUpdate4821 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDistributedEventUpdate4833 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4854 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributedEventUpdate4867 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUniform_in_ruleDistributedEventUpdate4888 = new BitSet(new long[]{0x00018003C0004050L});
    public static final BitSet FOLLOW_31_in_ruleDistributedEventUpdate4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateReference_in_entryRuleUpdateReference4950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateReference4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_ruleUpdateReference5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDistribution5135 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDistribution5147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleDistribution5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributionReference_in_ruleDistribution5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributionReference_in_entryRuleDistributionReference5242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributionReference5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDistributionReference5311 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDistributionReference5323 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_ruleDistributionReference5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniform_in_entryRuleUniform5390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniform5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUniform5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniformReference_in_ruleUniform5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniformReference_in_entryRuleUniformReference5534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniformReference5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_ruleUniformReference5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_entryRuleUpdateExpression5649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpression5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_ruleUpdateExpression5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateSubtraction_in_entryRuleUpdateSubtraction5753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateSubtraction5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5814 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleUpdateSubtraction5835 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_ruleUpdateSubtraction5856 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleUpdateAddition_in_entryRuleUpdateAddition5904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAddition5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition5965 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleUpdateAddition5986 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_ruleUpdateAddition6007 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleUpdateMultiplication_in_entryRuleUpdateMultiplication6055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateMultiplication6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication6116 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleUpdateMultiplication6137 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_ruleUpdateMultiplication6158 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleUpdateDivision_in_entryRuleUpdateDivision6206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateDivision6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6267 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleUpdateDivision6288 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_ruleUpdateDivision6309 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleUpdatePrimary_in_entryRuleUpdatePrimary6357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdatePrimary6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUpdatePrimary6409 = new BitSet(new long[]{0x0001800140004050L});
    public static final BitSet FOLLOW_ruleUpdateExpression_in_ruleUpdatePrimary6431 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleUpdatePrimary6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_ruleUpdatePrimary6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateAtomic_in_entryRuleUpdateAtomic6516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateAtomic6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_ruleUpdateAtomic6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpressionStoreReference_in_ruleUpdateAtomic6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateExpressionStoreReference_in_entryRuleUpdateExpressionStoreReference6660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateExpressionStoreReference6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStoreExpression_in_ruleUpdateExpressionStoreReference6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess6775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleProcess6831 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleProcess6848 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_ruleProcess6869 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleProcess6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_entryRuleProcessExpression6927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessExpression6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleProcessExpression6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel7031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel7092 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleParallel7113 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleParallel7134 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice7182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice7243 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleChoice7264 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleChoice7285 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_entryRulePrimaryProcess7333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryProcess7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimaryProcess7385 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_ruleProcessExpression_in_rulePrimaryProcess7407 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePrimaryProcess7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicProcess_in_rulePrimaryProcess7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicProcess_in_entryRuleAtomicProcess7492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicProcess7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAtomicProcess7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAtomicProcess7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_ruleAtomicProcess7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_ruleAtomicProcess7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_ruleAtomicProcess7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateProcess_in_entryRulePredicateProcess7748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateProcess7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateProcess7817 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_rulePredicateProcess7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionProcess_in_entryRuleActionProcess7884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionProcess7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionProcess7953 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_rulePrimaryProcess_in_ruleActionProcess7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_entryRuleReferencedProcess8020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedProcess8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UPPER_in_ruleReferencedProcess8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm8134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTerm8185 = new BitSet(new long[]{0x0000300040020030L});
    public static final BitSet FOLLOW_ruleReferencedProcess_in_ruleTerm8206 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerm8218 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleStores_in_ruleTerm8239 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTerm8251 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTerm8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStores_in_entryRuleStores8309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStores8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStores8360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStore_in_ruleStores8381 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_33_in_ruleStores8394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStore_in_ruleStores8415 = new BitSet(new long[]{0x0000002200000010L});
    public static final BitSet FOLLOW_37_in_ruleStores8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble8471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble8522 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleDouble8541 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble8556 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleDouble8575 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_27_in_ruleDouble8589 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNatural_in_entryRuleNatural8656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNatural8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNatural8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool8750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBool8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBool8825 = new BitSet(new long[]{0x0000000000000002L});

}