package org.xtext.example.boundingbox.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.boundingbox.services.BoundingBoxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoundingBoxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box'", "':'", "'left'", "'right'", "'up'", "'down'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBoundingBoxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoundingBoxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoundingBoxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoundingBox.g"; }



     	private BoundingBoxGrammarAccess grammarAccess;

        public InternalBoundingBoxParser(TokenStream input, BoundingBoxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected BoundingBoxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalBoundingBox.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalBoundingBox.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalBoundingBox.g:65:2: iv_ruleWorld= ruleWorld EOF
            {
             newCompositeNode(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorld=ruleWorld();

            state._fsp--;

             current =iv_ruleWorld; 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalBoundingBox.g:71:1: ruleWorld returns [EObject current=null] : ( () otherlv_1= 'Box' otherlv_2= ':' ( ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_moveCommands_3_0 = null;

        EObject lv_moveCommands_4_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:77:2: ( ( () otherlv_1= 'Box' otherlv_2= ':' ( ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? ) )
            // InternalBoundingBox.g:78:2: ( () otherlv_1= 'Box' otherlv_2= ':' ( ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? )
            {
            // InternalBoundingBox.g:78:2: ( () otherlv_1= 'Box' otherlv_2= ':' ( ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? )
            // InternalBoundingBox.g:79:3: () otherlv_1= 'Box' otherlv_2= ':' ( ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )?
            {
            // InternalBoundingBox.g:79:3: ()
            // InternalBoundingBox.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorldAccess().getWorldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorldAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getWorldAccess().getColonKeyword_2());
            		
            // InternalBoundingBox.g:94:3: ( ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoundingBox.g:95:4: ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )*
                    {
                    // InternalBoundingBox.g:95:4: ( (lv_moveCommands_3_0= ruleMove ) )
                    // InternalBoundingBox.g:96:5: (lv_moveCommands_3_0= ruleMove )
                    {
                    // InternalBoundingBox.g:96:5: (lv_moveCommands_3_0= ruleMove )
                    // InternalBoundingBox.g:97:6: lv_moveCommands_3_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_moveCommands_3_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorldRule());
                    						}
                    						add(
                    							current,
                    							"moveCommands",
                    							lv_moveCommands_3_0,
                    							"org.xtext.example.boundingbox.BoundingBox.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBoundingBox.g:114:4: ( (lv_moveCommands_4_0= ruleMove ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBoundingBox.g:115:5: (lv_moveCommands_4_0= ruleMove )
                    	    {
                    	    // InternalBoundingBox.g:115:5: (lv_moveCommands_4_0= ruleMove )
                    	    // InternalBoundingBox.g:116:6: lv_moveCommands_4_0= ruleMove
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_moveCommands_4_0=ruleMove();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"moveCommands",
                    	    							lv_moveCommands_4_0,
                    	    							"org.xtext.example.boundingbox.BoundingBox.Move");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBoundingBox.g:138:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalBoundingBox.g:138:45: (iv_ruleMove= ruleMove EOF )
            // InternalBoundingBox.g:139:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBoundingBox.g:145:1: ruleMove returns [EObject current=null] : (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveUp_2= ruleMoveUp | this_MoveDown_3= ruleMoveDown ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_MoveLeft_0 = null;

        EObject this_MoveRight_1 = null;

        EObject this_MoveUp_2 = null;

        EObject this_MoveDown_3 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:151:2: ( (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveUp_2= ruleMoveUp | this_MoveDown_3= ruleMoveDown ) )
            // InternalBoundingBox.g:152:2: (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveUp_2= ruleMoveUp | this_MoveDown_3= ruleMoveDown )
            {
            // InternalBoundingBox.g:152:2: (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveUp_2= ruleMoveUp | this_MoveDown_3= ruleMoveDown )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBoundingBox.g:153:3: this_MoveLeft_0= ruleMoveLeft
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveLeft_0=ruleMoveLeft();

                    state._fsp--;


                    			current = this_MoveLeft_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:162:3: this_MoveRight_1= ruleMoveRight
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveRight_1=ruleMoveRight();

                    state._fsp--;


                    			current = this_MoveRight_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBoundingBox.g:171:3: this_MoveUp_2= ruleMoveUp
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveUp_2=ruleMoveUp();

                    state._fsp--;


                    			current = this_MoveUp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBoundingBox.g:180:3: this_MoveDown_3= ruleMoveDown
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveDown_3=ruleMoveDown();

                    state._fsp--;


                    			current = this_MoveDown_3;
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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalBoundingBox.g:192:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoundingBox.g:192:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoundingBox.g:193:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoundingBox.g:199:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:205:2: (this_INT_0= RULE_INT )
            // InternalBoundingBox.g:206:2: this_INT_0= RULE_INT
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


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBoundingBox.g:216:1: entryRuleMoveLeft returns [EObject current=null] : iv_ruleMoveLeft= ruleMoveLeft EOF ;
    public final EObject entryRuleMoveLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveLeft = null;


        try {
            // InternalBoundingBox.g:216:49: (iv_ruleMoveLeft= ruleMoveLeft EOF )
            // InternalBoundingBox.g:217:2: iv_ruleMoveLeft= ruleMoveLeft EOF
            {
             newCompositeNode(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveLeft=ruleMoveLeft();

            state._fsp--;

             current =iv_ruleMoveLeft; 
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
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBoundingBox.g:223:1: ruleMoveLeft returns [EObject current=null] : (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:229:2: ( (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBoundingBox.g:230:2: (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBoundingBox.g:230:2: (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBoundingBox.g:231:3: otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveLeftAccess().getLeftKeyword_0());
            		
            // InternalBoundingBox.g:235:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBoundingBox.g:236:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBoundingBox.g:236:4: (lv_distance_1_0= ruleEInt )
            // InternalBoundingBox.g:237:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveLeftAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveLeftRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.xtext.example.boundingbox.BoundingBox.EInt");
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
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBoundingBox.g:258:1: entryRuleMoveRight returns [EObject current=null] : iv_ruleMoveRight= ruleMoveRight EOF ;
    public final EObject entryRuleMoveRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveRight = null;


        try {
            // InternalBoundingBox.g:258:50: (iv_ruleMoveRight= ruleMoveRight EOF )
            // InternalBoundingBox.g:259:2: iv_ruleMoveRight= ruleMoveRight EOF
            {
             newCompositeNode(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveRight=ruleMoveRight();

            state._fsp--;

             current =iv_ruleMoveRight; 
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
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBoundingBox.g:265:1: ruleMoveRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:271:2: ( (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBoundingBox.g:272:2: (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBoundingBox.g:272:2: (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBoundingBox.g:273:3: otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveRightAccess().getRightKeyword_0());
            		
            // InternalBoundingBox.g:277:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBoundingBox.g:278:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBoundingBox.g:278:4: (lv_distance_1_0= ruleEInt )
            // InternalBoundingBox.g:279:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveRightAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRightRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.xtext.example.boundingbox.BoundingBox.EInt");
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
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBoundingBox.g:300:1: entryRuleMoveUp returns [EObject current=null] : iv_ruleMoveUp= ruleMoveUp EOF ;
    public final EObject entryRuleMoveUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveUp = null;


        try {
            // InternalBoundingBox.g:300:47: (iv_ruleMoveUp= ruleMoveUp EOF )
            // InternalBoundingBox.g:301:2: iv_ruleMoveUp= ruleMoveUp EOF
            {
             newCompositeNode(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveUp=ruleMoveUp();

            state._fsp--;

             current =iv_ruleMoveUp; 
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
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBoundingBox.g:307:1: ruleMoveUp returns [EObject current=null] : (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:313:2: ( (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBoundingBox.g:314:2: (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBoundingBox.g:314:2: (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBoundingBox.g:315:3: otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveUpAccess().getUpKeyword_0());
            		
            // InternalBoundingBox.g:319:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBoundingBox.g:320:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBoundingBox.g:320:4: (lv_distance_1_0= ruleEInt )
            // InternalBoundingBox.g:321:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveUpAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveUpRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.xtext.example.boundingbox.BoundingBox.EInt");
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
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBoundingBox.g:342:1: entryRuleMoveDown returns [EObject current=null] : iv_ruleMoveDown= ruleMoveDown EOF ;
    public final EObject entryRuleMoveDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDown = null;


        try {
            // InternalBoundingBox.g:342:49: (iv_ruleMoveDown= ruleMoveDown EOF )
            // InternalBoundingBox.g:343:2: iv_ruleMoveDown= ruleMoveDown EOF
            {
             newCompositeNode(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveDown=ruleMoveDown();

            state._fsp--;

             current =iv_ruleMoveDown; 
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
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBoundingBox.g:349:1: ruleMoveDown returns [EObject current=null] : (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:355:2: ( (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBoundingBox.g:356:2: (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBoundingBox.g:356:2: (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBoundingBox.g:357:3: otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveDownAccess().getDownKeyword_0());
            		
            // InternalBoundingBox.g:361:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBoundingBox.g:362:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBoundingBox.g:362:4: (lv_distance_1_0= ruleEInt )
            // InternalBoundingBox.g:363:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveDownAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveDownRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.xtext.example.boundingbox.BoundingBox.EInt");
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
    // $ANTLR end "ruleMoveDown"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}