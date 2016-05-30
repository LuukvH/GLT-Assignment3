package org.xtext.example.boundingbox.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.boundingbox.services.BoundingBoxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoundingBoxParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BoundingBoxGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWorld"
    // InternalBoundingBox.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalBoundingBox.g:54:1: ( ruleWorld EOF )
            // InternalBoundingBox.g:55:1: ruleWorld EOF
            {
             before(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            ruleWorld();

            state._fsp--;

             after(grammarAccess.getWorldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalBoundingBox.g:62:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:66:2: ( ( ( rule__World__Group__0 ) ) )
            // InternalBoundingBox.g:67:2: ( ( rule__World__Group__0 ) )
            {
            // InternalBoundingBox.g:67:2: ( ( rule__World__Group__0 ) )
            // InternalBoundingBox.g:68:3: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // InternalBoundingBox.g:69:3: ( rule__World__Group__0 )
            // InternalBoundingBox.g:69:4: rule__World__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBoundingBox.g:78:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalBoundingBox.g:79:1: ( ruleMove EOF )
            // InternalBoundingBox.g:80:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBoundingBox.g:87:1: ruleMove : ( ( rule__Move__Alternatives ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:91:2: ( ( ( rule__Move__Alternatives ) ) )
            // InternalBoundingBox.g:92:2: ( ( rule__Move__Alternatives ) )
            {
            // InternalBoundingBox.g:92:2: ( ( rule__Move__Alternatives ) )
            // InternalBoundingBox.g:93:3: ( rule__Move__Alternatives )
            {
             before(grammarAccess.getMoveAccess().getAlternatives()); 
            // InternalBoundingBox.g:94:3: ( rule__Move__Alternatives )
            // InternalBoundingBox.g:94:4: rule__Move__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Move__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalBoundingBox.g:103:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBoundingBox.g:104:1: ( ruleEInt EOF )
            // InternalBoundingBox.g:105:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBoundingBox.g:112:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:116:2: ( ( RULE_INT ) )
            // InternalBoundingBox.g:117:2: ( RULE_INT )
            {
            // InternalBoundingBox.g:117:2: ( RULE_INT )
            // InternalBoundingBox.g:118:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBoundingBox.g:128:1: entryRuleMoveLeft : ruleMoveLeft EOF ;
    public final void entryRuleMoveLeft() throws RecognitionException {
        try {
            // InternalBoundingBox.g:129:1: ( ruleMoveLeft EOF )
            // InternalBoundingBox.g:130:1: ruleMoveLeft EOF
            {
             before(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveLeft();

            state._fsp--;

             after(grammarAccess.getMoveLeftRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBoundingBox.g:137:1: ruleMoveLeft : ( ( rule__MoveLeft__Group__0 ) ) ;
    public final void ruleMoveLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:141:2: ( ( ( rule__MoveLeft__Group__0 ) ) )
            // InternalBoundingBox.g:142:2: ( ( rule__MoveLeft__Group__0 ) )
            {
            // InternalBoundingBox.g:142:2: ( ( rule__MoveLeft__Group__0 ) )
            // InternalBoundingBox.g:143:3: ( rule__MoveLeft__Group__0 )
            {
             before(grammarAccess.getMoveLeftAccess().getGroup()); 
            // InternalBoundingBox.g:144:3: ( rule__MoveLeft__Group__0 )
            // InternalBoundingBox.g:144:4: rule__MoveLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBoundingBox.g:153:1: entryRuleMoveRight : ruleMoveRight EOF ;
    public final void entryRuleMoveRight() throws RecognitionException {
        try {
            // InternalBoundingBox.g:154:1: ( ruleMoveRight EOF )
            // InternalBoundingBox.g:155:1: ruleMoveRight EOF
            {
             before(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveRight();

            state._fsp--;

             after(grammarAccess.getMoveRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBoundingBox.g:162:1: ruleMoveRight : ( ( rule__MoveRight__Group__0 ) ) ;
    public final void ruleMoveRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:166:2: ( ( ( rule__MoveRight__Group__0 ) ) )
            // InternalBoundingBox.g:167:2: ( ( rule__MoveRight__Group__0 ) )
            {
            // InternalBoundingBox.g:167:2: ( ( rule__MoveRight__Group__0 ) )
            // InternalBoundingBox.g:168:3: ( rule__MoveRight__Group__0 )
            {
             before(grammarAccess.getMoveRightAccess().getGroup()); 
            // InternalBoundingBox.g:169:3: ( rule__MoveRight__Group__0 )
            // InternalBoundingBox.g:169:4: rule__MoveRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBoundingBox.g:178:1: entryRuleMoveUp : ruleMoveUp EOF ;
    public final void entryRuleMoveUp() throws RecognitionException {
        try {
            // InternalBoundingBox.g:179:1: ( ruleMoveUp EOF )
            // InternalBoundingBox.g:180:1: ruleMoveUp EOF
            {
             before(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveUp();

            state._fsp--;

             after(grammarAccess.getMoveUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBoundingBox.g:187:1: ruleMoveUp : ( ( rule__MoveUp__Group__0 ) ) ;
    public final void ruleMoveUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:191:2: ( ( ( rule__MoveUp__Group__0 ) ) )
            // InternalBoundingBox.g:192:2: ( ( rule__MoveUp__Group__0 ) )
            {
            // InternalBoundingBox.g:192:2: ( ( rule__MoveUp__Group__0 ) )
            // InternalBoundingBox.g:193:3: ( rule__MoveUp__Group__0 )
            {
             before(grammarAccess.getMoveUpAccess().getGroup()); 
            // InternalBoundingBox.g:194:3: ( rule__MoveUp__Group__0 )
            // InternalBoundingBox.g:194:4: rule__MoveUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBoundingBox.g:203:1: entryRuleMoveDown : ruleMoveDown EOF ;
    public final void entryRuleMoveDown() throws RecognitionException {
        try {
            // InternalBoundingBox.g:204:1: ( ruleMoveDown EOF )
            // InternalBoundingBox.g:205:1: ruleMoveDown EOF
            {
             before(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveDown();

            state._fsp--;

             after(grammarAccess.getMoveDownRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBoundingBox.g:212:1: ruleMoveDown : ( ( rule__MoveDown__Group__0 ) ) ;
    public final void ruleMoveDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:216:2: ( ( ( rule__MoveDown__Group__0 ) ) )
            // InternalBoundingBox.g:217:2: ( ( rule__MoveDown__Group__0 ) )
            {
            // InternalBoundingBox.g:217:2: ( ( rule__MoveDown__Group__0 ) )
            // InternalBoundingBox.g:218:3: ( rule__MoveDown__Group__0 )
            {
             before(grammarAccess.getMoveDownAccess().getGroup()); 
            // InternalBoundingBox.g:219:3: ( rule__MoveDown__Group__0 )
            // InternalBoundingBox.g:219:4: rule__MoveDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveDown"


    // $ANTLR start "rule__Move__Alternatives"
    // InternalBoundingBox.g:227:1: rule__Move__Alternatives : ( ( ruleMoveLeft ) | ( ruleMoveRight ) | ( ruleMoveUp ) | ( ruleMoveDown ) );
    public final void rule__Move__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:231:1: ( ( ruleMoveLeft ) | ( ruleMoveRight ) | ( ruleMoveUp ) | ( ruleMoveDown ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBoundingBox.g:232:2: ( ruleMoveLeft )
                    {
                    // InternalBoundingBox.g:232:2: ( ruleMoveLeft )
                    // InternalBoundingBox.g:233:3: ruleMoveLeft
                    {
                     before(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveLeft();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:238:2: ( ruleMoveRight )
                    {
                    // InternalBoundingBox.g:238:2: ( ruleMoveRight )
                    // InternalBoundingBox.g:239:3: ruleMoveRight
                    {
                     before(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveRight();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBoundingBox.g:244:2: ( ruleMoveUp )
                    {
                    // InternalBoundingBox.g:244:2: ( ruleMoveUp )
                    // InternalBoundingBox.g:245:3: ruleMoveUp
                    {
                     before(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveUp();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBoundingBox.g:250:2: ( ruleMoveDown )
                    {
                    // InternalBoundingBox.g:250:2: ( ruleMoveDown )
                    // InternalBoundingBox.g:251:3: ruleMoveDown
                    {
                     before(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveDown();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Alternatives"


    // $ANTLR start "rule__World__Group__0"
    // InternalBoundingBox.g:260:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:264:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalBoundingBox.g:265:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__World__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__0"


    // $ANTLR start "rule__World__Group__0__Impl"
    // InternalBoundingBox.g:272:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:276:1: ( ( () ) )
            // InternalBoundingBox.g:277:1: ( () )
            {
            // InternalBoundingBox.g:277:1: ( () )
            // InternalBoundingBox.g:278:2: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // InternalBoundingBox.g:279:2: ()
            // InternalBoundingBox.g:279:3: 
            {
            }

             after(grammarAccess.getWorldAccess().getWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__0__Impl"


    // $ANTLR start "rule__World__Group__1"
    // InternalBoundingBox.g:287:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:291:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // InternalBoundingBox.g:292:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__World__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__1"


    // $ANTLR start "rule__World__Group__1__Impl"
    // InternalBoundingBox.g:299:1: rule__World__Group__1__Impl : ( 'Box' ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:303:1: ( ( 'Box' ) )
            // InternalBoundingBox.g:304:1: ( 'Box' )
            {
            // InternalBoundingBox.g:304:1: ( 'Box' )
            // InternalBoundingBox.g:305:2: 'Box'
            {
             before(grammarAccess.getWorldAccess().getBoxKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__1__Impl"


    // $ANTLR start "rule__World__Group__2"
    // InternalBoundingBox.g:314:1: rule__World__Group__2 : rule__World__Group__2__Impl rule__World__Group__3 ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:318:1: ( rule__World__Group__2__Impl rule__World__Group__3 )
            // InternalBoundingBox.g:319:2: rule__World__Group__2__Impl rule__World__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__World__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__2"


    // $ANTLR start "rule__World__Group__2__Impl"
    // InternalBoundingBox.g:326:1: rule__World__Group__2__Impl : ( ':' ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:330:1: ( ( ':' ) )
            // InternalBoundingBox.g:331:1: ( ':' )
            {
            // InternalBoundingBox.g:331:1: ( ':' )
            // InternalBoundingBox.g:332:2: ':'
            {
             before(grammarAccess.getWorldAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__2__Impl"


    // $ANTLR start "rule__World__Group__3"
    // InternalBoundingBox.g:341:1: rule__World__Group__3 : rule__World__Group__3__Impl ;
    public final void rule__World__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:345:1: ( rule__World__Group__3__Impl )
            // InternalBoundingBox.g:346:2: rule__World__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__3"


    // $ANTLR start "rule__World__Group__3__Impl"
    // InternalBoundingBox.g:352:1: rule__World__Group__3__Impl : ( ( rule__World__Group_3__0 )? ) ;
    public final void rule__World__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:356:1: ( ( ( rule__World__Group_3__0 )? ) )
            // InternalBoundingBox.g:357:1: ( ( rule__World__Group_3__0 )? )
            {
            // InternalBoundingBox.g:357:1: ( ( rule__World__Group_3__0 )? )
            // InternalBoundingBox.g:358:2: ( rule__World__Group_3__0 )?
            {
             before(grammarAccess.getWorldAccess().getGroup_3()); 
            // InternalBoundingBox.g:359:2: ( rule__World__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoundingBox.g:359:3: rule__World__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__World__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorldAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__3__Impl"


    // $ANTLR start "rule__World__Group_3__0"
    // InternalBoundingBox.g:368:1: rule__World__Group_3__0 : rule__World__Group_3__0__Impl rule__World__Group_3__1 ;
    public final void rule__World__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:372:1: ( rule__World__Group_3__0__Impl rule__World__Group_3__1 )
            // InternalBoundingBox.g:373:2: rule__World__Group_3__0__Impl rule__World__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__World__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group_3__0"


    // $ANTLR start "rule__World__Group_3__0__Impl"
    // InternalBoundingBox.g:380:1: rule__World__Group_3__0__Impl : ( ( rule__World__MoveCommandsAssignment_3_0 ) ) ;
    public final void rule__World__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:384:1: ( ( ( rule__World__MoveCommandsAssignment_3_0 ) ) )
            // InternalBoundingBox.g:385:1: ( ( rule__World__MoveCommandsAssignment_3_0 ) )
            {
            // InternalBoundingBox.g:385:1: ( ( rule__World__MoveCommandsAssignment_3_0 ) )
            // InternalBoundingBox.g:386:2: ( rule__World__MoveCommandsAssignment_3_0 )
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_3_0()); 
            // InternalBoundingBox.g:387:2: ( rule__World__MoveCommandsAssignment_3_0 )
            // InternalBoundingBox.g:387:3: rule__World__MoveCommandsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__World__MoveCommandsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group_3__0__Impl"


    // $ANTLR start "rule__World__Group_3__1"
    // InternalBoundingBox.g:395:1: rule__World__Group_3__1 : rule__World__Group_3__1__Impl ;
    public final void rule__World__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:399:1: ( rule__World__Group_3__1__Impl )
            // InternalBoundingBox.g:400:2: rule__World__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group_3__1"


    // $ANTLR start "rule__World__Group_3__1__Impl"
    // InternalBoundingBox.g:406:1: rule__World__Group_3__1__Impl : ( ( rule__World__MoveCommandsAssignment_3_1 )* ) ;
    public final void rule__World__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:410:1: ( ( ( rule__World__MoveCommandsAssignment_3_1 )* ) )
            // InternalBoundingBox.g:411:1: ( ( rule__World__MoveCommandsAssignment_3_1 )* )
            {
            // InternalBoundingBox.g:411:1: ( ( rule__World__MoveCommandsAssignment_3_1 )* )
            // InternalBoundingBox.g:412:2: ( rule__World__MoveCommandsAssignment_3_1 )*
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_3_1()); 
            // InternalBoundingBox.g:413:2: ( rule__World__MoveCommandsAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoundingBox.g:413:3: rule__World__MoveCommandsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__World__MoveCommandsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group_3__1__Impl"


    // $ANTLR start "rule__MoveLeft__Group__0"
    // InternalBoundingBox.g:422:1: rule__MoveLeft__Group__0 : rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 ;
    public final void rule__MoveLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:426:1: ( rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 )
            // InternalBoundingBox.g:427:2: rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MoveLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__0"


    // $ANTLR start "rule__MoveLeft__Group__0__Impl"
    // InternalBoundingBox.g:434:1: rule__MoveLeft__Group__0__Impl : ( 'left' ) ;
    public final void rule__MoveLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:438:1: ( ( 'left' ) )
            // InternalBoundingBox.g:439:1: ( 'left' )
            {
            // InternalBoundingBox.g:439:1: ( 'left' )
            // InternalBoundingBox.g:440:2: 'left'
            {
             before(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__0__Impl"


    // $ANTLR start "rule__MoveLeft__Group__1"
    // InternalBoundingBox.g:449:1: rule__MoveLeft__Group__1 : rule__MoveLeft__Group__1__Impl ;
    public final void rule__MoveLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:453:1: ( rule__MoveLeft__Group__1__Impl )
            // InternalBoundingBox.g:454:2: rule__MoveLeft__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__1"


    // $ANTLR start "rule__MoveLeft__Group__1__Impl"
    // InternalBoundingBox.g:460:1: rule__MoveLeft__Group__1__Impl : ( ( rule__MoveLeft__DistanceAssignment_1 ) ) ;
    public final void rule__MoveLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:464:1: ( ( ( rule__MoveLeft__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:465:1: ( ( rule__MoveLeft__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:465:1: ( ( rule__MoveLeft__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:466:2: ( rule__MoveLeft__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:467:2: ( rule__MoveLeft__DistanceAssignment_1 )
            // InternalBoundingBox.g:467:3: rule__MoveLeft__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__1__Impl"


    // $ANTLR start "rule__MoveRight__Group__0"
    // InternalBoundingBox.g:476:1: rule__MoveRight__Group__0 : rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 ;
    public final void rule__MoveRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:480:1: ( rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 )
            // InternalBoundingBox.g:481:2: rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MoveRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__0"


    // $ANTLR start "rule__MoveRight__Group__0__Impl"
    // InternalBoundingBox.g:488:1: rule__MoveRight__Group__0__Impl : ( 'right' ) ;
    public final void rule__MoveRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:492:1: ( ( 'right' ) )
            // InternalBoundingBox.g:493:1: ( 'right' )
            {
            // InternalBoundingBox.g:493:1: ( 'right' )
            // InternalBoundingBox.g:494:2: 'right'
            {
             before(grammarAccess.getMoveRightAccess().getRightKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMoveRightAccess().getRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__0__Impl"


    // $ANTLR start "rule__MoveRight__Group__1"
    // InternalBoundingBox.g:503:1: rule__MoveRight__Group__1 : rule__MoveRight__Group__1__Impl ;
    public final void rule__MoveRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:507:1: ( rule__MoveRight__Group__1__Impl )
            // InternalBoundingBox.g:508:2: rule__MoveRight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__1"


    // $ANTLR start "rule__MoveRight__Group__1__Impl"
    // InternalBoundingBox.g:514:1: rule__MoveRight__Group__1__Impl : ( ( rule__MoveRight__DistanceAssignment_1 ) ) ;
    public final void rule__MoveRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:518:1: ( ( ( rule__MoveRight__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:519:1: ( ( rule__MoveRight__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:519:1: ( ( rule__MoveRight__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:520:2: ( rule__MoveRight__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:521:2: ( rule__MoveRight__DistanceAssignment_1 )
            // InternalBoundingBox.g:521:3: rule__MoveRight__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__1__Impl"


    // $ANTLR start "rule__MoveUp__Group__0"
    // InternalBoundingBox.g:530:1: rule__MoveUp__Group__0 : rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 ;
    public final void rule__MoveUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:534:1: ( rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 )
            // InternalBoundingBox.g:535:2: rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MoveUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__0"


    // $ANTLR start "rule__MoveUp__Group__0__Impl"
    // InternalBoundingBox.g:542:1: rule__MoveUp__Group__0__Impl : ( 'up' ) ;
    public final void rule__MoveUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:546:1: ( ( 'up' ) )
            // InternalBoundingBox.g:547:1: ( 'up' )
            {
            // InternalBoundingBox.g:547:1: ( 'up' )
            // InternalBoundingBox.g:548:2: 'up'
            {
             before(grammarAccess.getMoveUpAccess().getUpKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveUpAccess().getUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__0__Impl"


    // $ANTLR start "rule__MoveUp__Group__1"
    // InternalBoundingBox.g:557:1: rule__MoveUp__Group__1 : rule__MoveUp__Group__1__Impl ;
    public final void rule__MoveUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:561:1: ( rule__MoveUp__Group__1__Impl )
            // InternalBoundingBox.g:562:2: rule__MoveUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__1"


    // $ANTLR start "rule__MoveUp__Group__1__Impl"
    // InternalBoundingBox.g:568:1: rule__MoveUp__Group__1__Impl : ( ( rule__MoveUp__DistanceAssignment_1 ) ) ;
    public final void rule__MoveUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:572:1: ( ( ( rule__MoveUp__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:573:1: ( ( rule__MoveUp__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:573:1: ( ( rule__MoveUp__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:574:2: ( rule__MoveUp__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:575:2: ( rule__MoveUp__DistanceAssignment_1 )
            // InternalBoundingBox.g:575:3: rule__MoveUp__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__1__Impl"


    // $ANTLR start "rule__MoveDown__Group__0"
    // InternalBoundingBox.g:584:1: rule__MoveDown__Group__0 : rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 ;
    public final void rule__MoveDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:588:1: ( rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 )
            // InternalBoundingBox.g:589:2: rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MoveDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__0"


    // $ANTLR start "rule__MoveDown__Group__0__Impl"
    // InternalBoundingBox.g:596:1: rule__MoveDown__Group__0__Impl : ( 'down' ) ;
    public final void rule__MoveDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:600:1: ( ( 'down' ) )
            // InternalBoundingBox.g:601:1: ( 'down' )
            {
            // InternalBoundingBox.g:601:1: ( 'down' )
            // InternalBoundingBox.g:602:2: 'down'
            {
             before(grammarAccess.getMoveDownAccess().getDownKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveDownAccess().getDownKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__0__Impl"


    // $ANTLR start "rule__MoveDown__Group__1"
    // InternalBoundingBox.g:611:1: rule__MoveDown__Group__1 : rule__MoveDown__Group__1__Impl ;
    public final void rule__MoveDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:615:1: ( rule__MoveDown__Group__1__Impl )
            // InternalBoundingBox.g:616:2: rule__MoveDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__1"


    // $ANTLR start "rule__MoveDown__Group__1__Impl"
    // InternalBoundingBox.g:622:1: rule__MoveDown__Group__1__Impl : ( ( rule__MoveDown__DistanceAssignment_1 ) ) ;
    public final void rule__MoveDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:626:1: ( ( ( rule__MoveDown__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:627:1: ( ( rule__MoveDown__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:627:1: ( ( rule__MoveDown__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:628:2: ( rule__MoveDown__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:629:2: ( rule__MoveDown__DistanceAssignment_1 )
            // InternalBoundingBox.g:629:3: rule__MoveDown__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__1__Impl"


    // $ANTLR start "rule__World__MoveCommandsAssignment_3_0"
    // InternalBoundingBox.g:638:1: rule__World__MoveCommandsAssignment_3_0 : ( ruleMove ) ;
    public final void rule__World__MoveCommandsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:642:1: ( ( ruleMove ) )
            // InternalBoundingBox.g:643:2: ( ruleMove )
            {
            // InternalBoundingBox.g:643:2: ( ruleMove )
            // InternalBoundingBox.g:644:3: ruleMove
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__MoveCommandsAssignment_3_0"


    // $ANTLR start "rule__World__MoveCommandsAssignment_3_1"
    // InternalBoundingBox.g:653:1: rule__World__MoveCommandsAssignment_3_1 : ( ruleMove ) ;
    public final void rule__World__MoveCommandsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:657:1: ( ( ruleMove ) )
            // InternalBoundingBox.g:658:2: ( ruleMove )
            {
            // InternalBoundingBox.g:658:2: ( ruleMove )
            // InternalBoundingBox.g:659:3: ruleMove
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__MoveCommandsAssignment_3_1"


    // $ANTLR start "rule__MoveLeft__DistanceAssignment_1"
    // InternalBoundingBox.g:668:1: rule__MoveLeft__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveLeft__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:672:1: ( ( ruleEInt ) )
            // InternalBoundingBox.g:673:2: ( ruleEInt )
            {
            // InternalBoundingBox.g:673:2: ( ruleEInt )
            // InternalBoundingBox.g:674:3: ruleEInt
            {
             before(grammarAccess.getMoveLeftAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveLeftAccess().getDistanceEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__DistanceAssignment_1"


    // $ANTLR start "rule__MoveRight__DistanceAssignment_1"
    // InternalBoundingBox.g:683:1: rule__MoveRight__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveRight__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:687:1: ( ( ruleEInt ) )
            // InternalBoundingBox.g:688:2: ( ruleEInt )
            {
            // InternalBoundingBox.g:688:2: ( ruleEInt )
            // InternalBoundingBox.g:689:3: ruleEInt
            {
             before(grammarAccess.getMoveRightAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveRightAccess().getDistanceEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__DistanceAssignment_1"


    // $ANTLR start "rule__MoveUp__DistanceAssignment_1"
    // InternalBoundingBox.g:698:1: rule__MoveUp__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveUp__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:702:1: ( ( ruleEInt ) )
            // InternalBoundingBox.g:703:2: ( ruleEInt )
            {
            // InternalBoundingBox.g:703:2: ( ruleEInt )
            // InternalBoundingBox.g:704:3: ruleEInt
            {
             before(grammarAccess.getMoveUpAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveUpAccess().getDistanceEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__DistanceAssignment_1"


    // $ANTLR start "rule__MoveDown__DistanceAssignment_1"
    // InternalBoundingBox.g:713:1: rule__MoveDown__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveDown__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:717:1: ( ( ruleEInt ) )
            // InternalBoundingBox.g:718:2: ( ruleEInt )
            {
            // InternalBoundingBox.g:718:2: ( ruleEInt )
            // InternalBoundingBox.g:719:3: ruleEInt
            {
             before(grammarAccess.getMoveDownAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveDownAccess().getDistanceEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__DistanceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});

}