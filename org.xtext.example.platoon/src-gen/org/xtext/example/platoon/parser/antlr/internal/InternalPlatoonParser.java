package org.xtext.example.platoon.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.platoon.services.PlatoonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlatoonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'platoon:'", "'route'", "':'", "'constraints:'", "'<='", "'headway'", "'LV'", "'FV'", "'front'", "'runner'", "'forward'", "'('", "')'", "'turn'", "'Left'", "'Right'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPlatoonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlatoonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlatoonParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlatoon.g"; }



     	private PlatoonGrammarAccess grammarAccess;

        public InternalPlatoonParser(TokenStream input, PlatoonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected PlatoonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalPlatoon.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalPlatoon.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalPlatoon.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalPlatoon.g:71:1: ruleRoot returns [EObject current=null] : ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_route_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_platoon_0_0 = null;

        EObject lv_route_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:77:2: ( ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_route_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) ) )
            // InternalPlatoon.g:78:2: ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_route_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) )
            {
            // InternalPlatoon.g:78:2: ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_route_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) )
            // InternalPlatoon.g:79:3: ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_route_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) )
            {
            // InternalPlatoon.g:79:3: ( (lv_platoon_0_0= rulePlatoon ) )
            // InternalPlatoon.g:80:4: (lv_platoon_0_0= rulePlatoon )
            {
            // InternalPlatoon.g:80:4: (lv_platoon_0_0= rulePlatoon )
            // InternalPlatoon.g:81:5: lv_platoon_0_0= rulePlatoon
            {

            					newCompositeNode(grammarAccess.getRootAccess().getPlatoonPlatoonParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_platoon_0_0=rulePlatoon();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"platoon",
            						lv_platoon_0_0,
            						"org.xtext.example.platoon.Platoon.Platoon");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:98:3: ( (lv_route_1_0= ruleRoute ) )
            // InternalPlatoon.g:99:4: (lv_route_1_0= ruleRoute )
            {
            // InternalPlatoon.g:99:4: (lv_route_1_0= ruleRoute )
            // InternalPlatoon.g:100:5: lv_route_1_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getRootAccess().getRouteRouteParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_route_1_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_1_0,
            						"org.xtext.example.platoon.Platoon.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:117:3: ( (lv_constraints_2_0= ruleConstraints ) )
            // InternalPlatoon.g:118:4: (lv_constraints_2_0= ruleConstraints )
            {
            // InternalPlatoon.g:118:4: (lv_constraints_2_0= ruleConstraints )
            // InternalPlatoon.g:119:5: lv_constraints_2_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getRootAccess().getConstraintsConstraintsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constraints_2_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_2_0,
            						"org.xtext.example.platoon.Platoon.Constraints");
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
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRulerouteCommand"
    // InternalPlatoon.g:140:1: entryRulerouteCommand returns [EObject current=null] : iv_rulerouteCommand= rulerouteCommand EOF ;
    public final EObject entryRulerouteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerouteCommand = null;


        try {
            // InternalPlatoon.g:140:53: (iv_rulerouteCommand= rulerouteCommand EOF )
            // InternalPlatoon.g:141:2: iv_rulerouteCommand= rulerouteCommand EOF
            {
             newCompositeNode(grammarAccess.getRouteCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerouteCommand=rulerouteCommand();

            state._fsp--;

             current =iv_rulerouteCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerouteCommand"


    // $ANTLR start "rulerouteCommand"
    // InternalPlatoon.g:147:1: rulerouteCommand returns [EObject current=null] : (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) ;
    public final EObject rulerouteCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Forward_0 = null;

        EObject this_TurnLeft_1 = null;

        EObject this_TurnRight_2 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:153:2: ( (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) )
            // InternalPlatoon.g:154:2: (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight )
            {
            // InternalPlatoon.g:154:2: (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==26) ) {
                    alt1=3;
                }
                else if ( (LA1_2==25) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPlatoon.g:155:3: this_Forward_0= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getRouteCommandAccess().getForwardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_0=ruleForward();

                    state._fsp--;


                    			current = this_Forward_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:164:3: this_TurnLeft_1= ruleTurnLeft
                    {

                    			newCompositeNode(grammarAccess.getRouteCommandAccess().getTurnLeftParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeft_1=ruleTurnLeft();

                    state._fsp--;


                    			current = this_TurnLeft_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPlatoon.g:173:3: this_TurnRight_2= ruleTurnRight
                    {

                    			newCompositeNode(grammarAccess.getRouteCommandAccess().getTurnRightParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnRight_2=ruleTurnRight();

                    state._fsp--;


                    			current = this_TurnRight_2;
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
        }
        return current;
    }
    // $ANTLR end "rulerouteCommand"


    // $ANTLR start "entryRulePlatoon"
    // InternalPlatoon.g:185:1: entryRulePlatoon returns [EObject current=null] : iv_rulePlatoon= rulePlatoon EOF ;
    public final EObject entryRulePlatoon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatoon = null;


        try {
            // InternalPlatoon.g:185:48: (iv_rulePlatoon= rulePlatoon EOF )
            // InternalPlatoon.g:186:2: iv_rulePlatoon= rulePlatoon EOF
            {
             newCompositeNode(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatoon=rulePlatoon();

            state._fsp--;

             current =iv_rulePlatoon; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPlatoon.g:192:1: rulePlatoon returns [EObject current=null] : (otherlv_0= 'platoon:' ( (lv_leaderVehicle_1_0= ruleLeaderVehicle ) ) ( ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )* )? ) ;
    public final EObject rulePlatoon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_leaderVehicle_1_0 = null;

        EObject lv_followingVehicle_2_0 = null;

        EObject lv_followingVehicle_3_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:198:2: ( (otherlv_0= 'platoon:' ( (lv_leaderVehicle_1_0= ruleLeaderVehicle ) ) ( ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )* )? ) )
            // InternalPlatoon.g:199:2: (otherlv_0= 'platoon:' ( (lv_leaderVehicle_1_0= ruleLeaderVehicle ) ) ( ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )* )? )
            {
            // InternalPlatoon.g:199:2: (otherlv_0= 'platoon:' ( (lv_leaderVehicle_1_0= ruleLeaderVehicle ) ) ( ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )* )? )
            // InternalPlatoon.g:200:3: otherlv_0= 'platoon:' ( (lv_leaderVehicle_1_0= ruleLeaderVehicle ) ) ( ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatoonAccess().getPlatoonKeyword_0());
            		
            // InternalPlatoon.g:204:3: ( (lv_leaderVehicle_1_0= ruleLeaderVehicle ) )
            // InternalPlatoon.g:205:4: (lv_leaderVehicle_1_0= ruleLeaderVehicle )
            {
            // InternalPlatoon.g:205:4: (lv_leaderVehicle_1_0= ruleLeaderVehicle )
            // InternalPlatoon.g:206:5: lv_leaderVehicle_1_0= ruleLeaderVehicle
            {

            					newCompositeNode(grammarAccess.getPlatoonAccess().getLeaderVehicleLeaderVehicleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_leaderVehicle_1_0=ruleLeaderVehicle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatoonRule());
            					}
            					set(
            						current,
            						"leaderVehicle",
            						lv_leaderVehicle_1_0,
            						"org.xtext.example.platoon.Platoon.LeaderVehicle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:223:3: ( ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPlatoon.g:224:4: ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) ) ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )*
                    {
                    // InternalPlatoon.g:224:4: ( (lv_followingVehicle_2_0= ruleFollowingVehicle ) )
                    // InternalPlatoon.g:225:5: (lv_followingVehicle_2_0= ruleFollowingVehicle )
                    {
                    // InternalPlatoon.g:225:5: (lv_followingVehicle_2_0= ruleFollowingVehicle )
                    // InternalPlatoon.g:226:6: lv_followingVehicle_2_0= ruleFollowingVehicle
                    {

                    						newCompositeNode(grammarAccess.getPlatoonAccess().getFollowingVehicleFollowingVehicleParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_followingVehicle_2_0=ruleFollowingVehicle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatoonRule());
                    						}
                    						add(
                    							current,
                    							"followingVehicle",
                    							lv_followingVehicle_2_0,
                    							"org.xtext.example.platoon.Platoon.FollowingVehicle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPlatoon.g:243:4: ( (lv_followingVehicle_3_0= ruleFollowingVehicle ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPlatoon.g:244:5: (lv_followingVehicle_3_0= ruleFollowingVehicle )
                    	    {
                    	    // InternalPlatoon.g:244:5: (lv_followingVehicle_3_0= ruleFollowingVehicle )
                    	    // InternalPlatoon.g:245:6: lv_followingVehicle_3_0= ruleFollowingVehicle
                    	    {

                    	    						newCompositeNode(grammarAccess.getPlatoonAccess().getFollowingVehicleFollowingVehicleParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_followingVehicle_3_0=ruleFollowingVehicle();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPlatoonRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"followingVehicle",
                    	    							lv_followingVehicle_3_0,
                    	    							"org.xtext.example.platoon.Platoon.FollowingVehicle");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleRoute"
    // InternalPlatoon.g:267:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalPlatoon.g:267:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalPlatoon.g:268:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPlatoon.g:274:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_routeCommands_3_0= rulerouteCommand ) ) ( (lv_routeCommands_4_0= rulerouteCommand ) )* ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_routeCommands_3_0 = null;

        EObject lv_routeCommands_4_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:280:2: ( (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_routeCommands_3_0= rulerouteCommand ) ) ( (lv_routeCommands_4_0= rulerouteCommand ) )* ) )
            // InternalPlatoon.g:281:2: (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_routeCommands_3_0= rulerouteCommand ) ) ( (lv_routeCommands_4_0= rulerouteCommand ) )* )
            {
            // InternalPlatoon.g:281:2: (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_routeCommands_3_0= rulerouteCommand ) ) ( (lv_routeCommands_4_0= rulerouteCommand ) )* )
            // InternalPlatoon.g:282:3: otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_routeCommands_3_0= rulerouteCommand ) ) ( (lv_routeCommands_4_0= rulerouteCommand ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            // InternalPlatoon.g:286:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlatoon.g:287:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlatoon.g:287:4: (lv_name_1_0= ruleEString )
            // InternalPlatoon.g:288:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.platoon.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getColonKeyword_2());
            		
            // InternalPlatoon.g:309:3: ( (lv_routeCommands_3_0= rulerouteCommand ) )
            // InternalPlatoon.g:310:4: (lv_routeCommands_3_0= rulerouteCommand )
            {
            // InternalPlatoon.g:310:4: (lv_routeCommands_3_0= rulerouteCommand )
            // InternalPlatoon.g:311:5: lv_routeCommands_3_0= rulerouteCommand
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getRouteCommandsRouteCommandParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_routeCommands_3_0=rulerouteCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"routeCommands",
            						lv_routeCommands_3_0,
            						"org.xtext.example.platoon.Platoon.routeCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:328:3: ( (lv_routeCommands_4_0= rulerouteCommand ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlatoon.g:329:4: (lv_routeCommands_4_0= rulerouteCommand )
            	    {
            	    // InternalPlatoon.g:329:4: (lv_routeCommands_4_0= rulerouteCommand )
            	    // InternalPlatoon.g:330:5: lv_routeCommands_4_0= rulerouteCommand
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getRouteCommandsRouteCommandParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_routeCommands_4_0=rulerouteCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"routeCommands",
            	    						lv_routeCommands_4_0,
            	    						"org.xtext.example.platoon.Platoon.routeCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

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
        }
        return current;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleConstraints"
    // InternalPlatoon.g:351:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalPlatoon.g:351:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalPlatoon.g:352:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPlatoon.g:358:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'constraints:' ( (lv_lbound_1_0= ruleEInt ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_ubound_5_0= ruleEInt ) ) ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lbound_1_0 = null;

        AntlrDatatypeRuleToken lv_ubound_5_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:364:2: ( (otherlv_0= 'constraints:' ( (lv_lbound_1_0= ruleEInt ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_ubound_5_0= ruleEInt ) ) ) )
            // InternalPlatoon.g:365:2: (otherlv_0= 'constraints:' ( (lv_lbound_1_0= ruleEInt ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_ubound_5_0= ruleEInt ) ) )
            {
            // InternalPlatoon.g:365:2: (otherlv_0= 'constraints:' ( (lv_lbound_1_0= ruleEInt ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_ubound_5_0= ruleEInt ) ) )
            // InternalPlatoon.g:366:3: otherlv_0= 'constraints:' ( (lv_lbound_1_0= ruleEInt ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_ubound_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
            		
            // InternalPlatoon.g:370:3: ( (lv_lbound_1_0= ruleEInt ) )
            // InternalPlatoon.g:371:4: (lv_lbound_1_0= ruleEInt )
            {
            // InternalPlatoon.g:371:4: (lv_lbound_1_0= ruleEInt )
            // InternalPlatoon.g:372:5: lv_lbound_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getLboundEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_lbound_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"lbound",
            						lv_lbound_1_0,
            						"org.xtext.example.platoon.Platoon.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getHeadwayKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_4());
            		
            // InternalPlatoon.g:401:3: ( (lv_ubound_5_0= ruleEInt ) )
            // InternalPlatoon.g:402:4: (lv_ubound_5_0= ruleEInt )
            {
            // InternalPlatoon.g:402:4: (lv_ubound_5_0= ruleEInt )
            // InternalPlatoon.g:403:5: lv_ubound_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getUboundEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_ubound_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"ubound",
            						lv_ubound_5_0,
            						"org.xtext.example.platoon.Platoon.EInt");
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
        }
        return current;
    }
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleLeaderVehicle"
    // InternalPlatoon.g:424:1: entryRuleLeaderVehicle returns [EObject current=null] : iv_ruleLeaderVehicle= ruleLeaderVehicle EOF ;
    public final EObject entryRuleLeaderVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaderVehicle = null;


        try {
            // InternalPlatoon.g:424:54: (iv_ruleLeaderVehicle= ruleLeaderVehicle EOF )
            // InternalPlatoon.g:425:2: iv_ruleLeaderVehicle= ruleLeaderVehicle EOF
            {
             newCompositeNode(grammarAccess.getLeaderVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeaderVehicle=ruleLeaderVehicle();

            state._fsp--;

             current =iv_ruleLeaderVehicle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLeaderVehicle"


    // $ANTLR start "ruleLeaderVehicle"
    // InternalPlatoon.g:431:1: ruleLeaderVehicle returns [EObject current=null] : (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) ) ;
    public final EObject ruleLeaderVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:437:2: ( (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:438:2: (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:438:2: (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) )
            // InternalPlatoon.g:439:3: otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLeaderVehicleAccess().getLVKeyword_0());
            		
            // InternalPlatoon.g:443:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlatoon.g:444:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlatoon.g:444:4: (lv_name_1_0= ruleEString )
            // InternalPlatoon.g:445:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeaderVehicleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeaderVehicleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.platoon.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLeaderVehicleAccess().getRouteKeyword_2());
            		
            // InternalPlatoon.g:466:3: ( ( ruleEString ) )
            // InternalPlatoon.g:467:4: ( ruleEString )
            {
            // InternalPlatoon.g:467:4: ( ruleEString )
            // InternalPlatoon.g:468:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeaderVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLeaderVehicleAccess().getRouteRouteCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
        }
        return current;
    }
    // $ANTLR end "ruleLeaderVehicle"


    // $ANTLR start "entryRuleFollowingVehicle"
    // InternalPlatoon.g:486:1: entryRuleFollowingVehicle returns [EObject current=null] : iv_ruleFollowingVehicle= ruleFollowingVehicle EOF ;
    public final EObject entryRuleFollowingVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowingVehicle = null;


        try {
            // InternalPlatoon.g:486:57: (iv_ruleFollowingVehicle= ruleFollowingVehicle EOF )
            // InternalPlatoon.g:487:2: iv_ruleFollowingVehicle= ruleFollowingVehicle EOF
            {
             newCompositeNode(grammarAccess.getFollowingVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFollowingVehicle=ruleFollowingVehicle();

            state._fsp--;

             current =iv_ruleFollowingVehicle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFollowingVehicle"


    // $ANTLR start "ruleFollowingVehicle"
    // InternalPlatoon.g:493:1: ruleFollowingVehicle returns [EObject current=null] : (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) ) ;
    public final EObject ruleFollowingVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:499:2: ( (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:500:2: (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:500:2: (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) )
            // InternalPlatoon.g:501:3: otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowingVehicleAccess().getFVKeyword_0());
            		
            // InternalPlatoon.g:505:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlatoon.g:506:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlatoon.g:506:4: (lv_name_1_0= ruleEString )
            // InternalPlatoon.g:507:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFollowingVehicleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFollowingVehicleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.platoon.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getFollowingVehicleAccess().getFrontKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFollowingVehicleAccess().getRunnerKeyword_3());
            		
            // InternalPlatoon.g:532:3: ( ( ruleEString ) )
            // InternalPlatoon.g:533:4: ( ruleEString )
            {
            // InternalPlatoon.g:533:4: ( ruleEString )
            // InternalPlatoon.g:534:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowingVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFollowingVehicleAccess().getFollowingVehicleCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
        }
        return current;
    }
    // $ANTLR end "ruleFollowingVehicle"


    // $ANTLR start "entryRuleEString"
    // InternalPlatoon.g:552:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlatoon.g:552:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlatoon.g:553:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPlatoon.g:559:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:565:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlatoon.g:566:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlatoon.g:566:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPlatoon.g:567:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:575:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleForward"
    // InternalPlatoon.g:586:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalPlatoon.g:586:48: (iv_ruleForward= ruleForward EOF )
            // InternalPlatoon.g:587:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalPlatoon.g:593:1: ruleForward returns [EObject current=null] : (otherlv_0= 'forward' otherlv_1= '(' ( (lv_distance_2_0= ruleEInt ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:599:2: ( (otherlv_0= 'forward' otherlv_1= '(' ( (lv_distance_2_0= ruleEInt ) ) otherlv_3= ')' ) )
            // InternalPlatoon.g:600:2: (otherlv_0= 'forward' otherlv_1= '(' ( (lv_distance_2_0= ruleEInt ) ) otherlv_3= ')' )
            {
            // InternalPlatoon.g:600:2: (otherlv_0= 'forward' otherlv_1= '(' ( (lv_distance_2_0= ruleEInt ) ) otherlv_3= ')' )
            // InternalPlatoon.g:601:3: otherlv_0= 'forward' otherlv_1= '(' ( (lv_distance_2_0= ruleEInt ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPlatoon.g:609:3: ( (lv_distance_2_0= ruleEInt ) )
            // InternalPlatoon.g:610:4: (lv_distance_2_0= ruleEInt )
            {
            // InternalPlatoon.g:610:4: (lv_distance_2_0= ruleEInt )
            // InternalPlatoon.g:611:5: lv_distance_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getForwardAccess().getDistanceEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_distance_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.xtext.example.platoon.Platoon.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalPlatoon.g:636:1: entryRuleTurnLeft returns [EObject current=null] : iv_ruleTurnLeft= ruleTurnLeft EOF ;
    public final EObject entryRuleTurnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeft = null;


        try {
            // InternalPlatoon.g:636:49: (iv_ruleTurnLeft= ruleTurnLeft EOF )
            // InternalPlatoon.g:637:2: iv_ruleTurnLeft= ruleTurnLeft EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeft=ruleTurnLeft();

            state._fsp--;

             current =iv_ruleTurnLeft; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalPlatoon.g:643:1: ruleTurnLeft returns [EObject current=null] : ( () otherlv_1= 'turn' otherlv_2= 'Left' ) ;
    public final EObject ruleTurnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPlatoon.g:649:2: ( ( () otherlv_1= 'turn' otherlv_2= 'Left' ) )
            // InternalPlatoon.g:650:2: ( () otherlv_1= 'turn' otherlv_2= 'Left' )
            {
            // InternalPlatoon.g:650:2: ( () otherlv_1= 'turn' otherlv_2= 'Left' )
            // InternalPlatoon.g:651:3: () otherlv_1= 'turn' otherlv_2= 'Left'
            {
            // InternalPlatoon.g:651:3: ()
            // InternalPlatoon.g:652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnLeftAccess().getTurnLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnLeftAccess().getTurnKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnLeftAccess().getLeftKeyword_2());
            		

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
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalPlatoon.g:670:1: entryRuleTurnRight returns [EObject current=null] : iv_ruleTurnRight= ruleTurnRight EOF ;
    public final EObject entryRuleTurnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRight = null;


        try {
            // InternalPlatoon.g:670:50: (iv_ruleTurnRight= ruleTurnRight EOF )
            // InternalPlatoon.g:671:2: iv_ruleTurnRight= ruleTurnRight EOF
            {
             newCompositeNode(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnRight=ruleTurnRight();

            state._fsp--;

             current =iv_ruleTurnRight; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalPlatoon.g:677:1: ruleTurnRight returns [EObject current=null] : ( () otherlv_1= 'turn' otherlv_2= 'Right' ) ;
    public final EObject ruleTurnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPlatoon.g:683:2: ( ( () otherlv_1= 'turn' otherlv_2= 'Right' ) )
            // InternalPlatoon.g:684:2: ( () otherlv_1= 'turn' otherlv_2= 'Right' )
            {
            // InternalPlatoon.g:684:2: ( () otherlv_1= 'turn' otherlv_2= 'Right' )
            // InternalPlatoon.g:685:3: () otherlv_1= 'turn' otherlv_2= 'Right'
            {
            // InternalPlatoon.g:685:3: ()
            // InternalPlatoon.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnRightAccess().getTurnRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnRightAccess().getTurnKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnRightAccess().getRightKeyword_2());
            		

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
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleEInt"
    // InternalPlatoon.g:704:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPlatoon.g:704:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPlatoon.g:705:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPlatoon.g:711:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPlatoon.g:717:2: (this_INT_0= RULE_INT )
            // InternalPlatoon.g:718:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}