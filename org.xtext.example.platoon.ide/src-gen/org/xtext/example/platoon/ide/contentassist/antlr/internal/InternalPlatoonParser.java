package org.xtext.example.platoon.ide.contentassist.antlr.internal;

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
import org.xtext.example.platoon.services.PlatoonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlatoonParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'platoon:'", "'route'", "':'", "'constraints:'", "'<='", "'headway'", "'LV'", "'FV'", "'front'", "'runner'", "'forward'", "'('", "')'", "'turn'", "'Left'", "'Right'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(PlatoonGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoot"
    // InternalPlatoon.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalPlatoon.g:54:1: ( ruleRoot EOF )
            // InternalPlatoon.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalPlatoon.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalPlatoon.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalPlatoon.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalPlatoon.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalPlatoon.g:69:3: ( rule__Root__Group__0 )
            // InternalPlatoon.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRulerouteCommand"
    // InternalPlatoon.g:78:1: entryRulerouteCommand : rulerouteCommand EOF ;
    public final void entryRulerouteCommand() throws RecognitionException {
        try {
            // InternalPlatoon.g:79:1: ( rulerouteCommand EOF )
            // InternalPlatoon.g:80:1: rulerouteCommand EOF
            {
             before(grammarAccess.getRouteCommandRule()); 
            pushFollow(FOLLOW_1);
            rulerouteCommand();

            state._fsp--;

             after(grammarAccess.getRouteCommandRule()); 
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
    // $ANTLR end "entryRulerouteCommand"


    // $ANTLR start "rulerouteCommand"
    // InternalPlatoon.g:87:1: rulerouteCommand : ( ( rule__RouteCommand__Alternatives ) ) ;
    public final void rulerouteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:91:2: ( ( ( rule__RouteCommand__Alternatives ) ) )
            // InternalPlatoon.g:92:2: ( ( rule__RouteCommand__Alternatives ) )
            {
            // InternalPlatoon.g:92:2: ( ( rule__RouteCommand__Alternatives ) )
            // InternalPlatoon.g:93:3: ( rule__RouteCommand__Alternatives )
            {
             before(grammarAccess.getRouteCommandAccess().getAlternatives()); 
            // InternalPlatoon.g:94:3: ( rule__RouteCommand__Alternatives )
            // InternalPlatoon.g:94:4: rule__RouteCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RouteCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRouteCommandAccess().getAlternatives()); 

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
    // $ANTLR end "rulerouteCommand"


    // $ANTLR start "entryRulePlatoon"
    // InternalPlatoon.g:103:1: entryRulePlatoon : rulePlatoon EOF ;
    public final void entryRulePlatoon() throws RecognitionException {
        try {
            // InternalPlatoon.g:104:1: ( rulePlatoon EOF )
            // InternalPlatoon.g:105:1: rulePlatoon EOF
            {
             before(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            rulePlatoon();

            state._fsp--;

             after(grammarAccess.getPlatoonRule()); 
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
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPlatoon.g:112:1: rulePlatoon : ( ( rule__Platoon__Group__0 ) ) ;
    public final void rulePlatoon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:116:2: ( ( ( rule__Platoon__Group__0 ) ) )
            // InternalPlatoon.g:117:2: ( ( rule__Platoon__Group__0 ) )
            {
            // InternalPlatoon.g:117:2: ( ( rule__Platoon__Group__0 ) )
            // InternalPlatoon.g:118:3: ( rule__Platoon__Group__0 )
            {
             before(grammarAccess.getPlatoonAccess().getGroup()); 
            // InternalPlatoon.g:119:3: ( rule__Platoon__Group__0 )
            // InternalPlatoon.g:119:4: rule__Platoon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getGroup()); 

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
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleRoute"
    // InternalPlatoon.g:128:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalPlatoon.g:129:1: ( ruleRoute EOF )
            // InternalPlatoon.g:130:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPlatoon.g:137:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:141:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalPlatoon.g:142:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalPlatoon.g:142:2: ( ( rule__Route__Group__0 ) )
            // InternalPlatoon.g:143:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalPlatoon.g:144:3: ( rule__Route__Group__0 )
            // InternalPlatoon.g:144:4: rule__Route__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleConstraints"
    // InternalPlatoon.g:153:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // InternalPlatoon.g:154:1: ( ruleConstraints EOF )
            // InternalPlatoon.g:155:1: ruleConstraints EOF
            {
             before(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstraintsRule()); 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPlatoon.g:162:1: ruleConstraints : ( ( rule__Constraints__Group__0 ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:166:2: ( ( ( rule__Constraints__Group__0 ) ) )
            // InternalPlatoon.g:167:2: ( ( rule__Constraints__Group__0 ) )
            {
            // InternalPlatoon.g:167:2: ( ( rule__Constraints__Group__0 ) )
            // InternalPlatoon.g:168:3: ( rule__Constraints__Group__0 )
            {
             before(grammarAccess.getConstraintsAccess().getGroup()); 
            // InternalPlatoon.g:169:3: ( rule__Constraints__Group__0 )
            // InternalPlatoon.g:169:4: rule__Constraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleLeaderVehicle"
    // InternalPlatoon.g:178:1: entryRuleLeaderVehicle : ruleLeaderVehicle EOF ;
    public final void entryRuleLeaderVehicle() throws RecognitionException {
        try {
            // InternalPlatoon.g:179:1: ( ruleLeaderVehicle EOF )
            // InternalPlatoon.g:180:1: ruleLeaderVehicle EOF
            {
             before(grammarAccess.getLeaderVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleLeaderVehicle();

            state._fsp--;

             after(grammarAccess.getLeaderVehicleRule()); 
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
    // $ANTLR end "entryRuleLeaderVehicle"


    // $ANTLR start "ruleLeaderVehicle"
    // InternalPlatoon.g:187:1: ruleLeaderVehicle : ( ( rule__LeaderVehicle__Group__0 ) ) ;
    public final void ruleLeaderVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:191:2: ( ( ( rule__LeaderVehicle__Group__0 ) ) )
            // InternalPlatoon.g:192:2: ( ( rule__LeaderVehicle__Group__0 ) )
            {
            // InternalPlatoon.g:192:2: ( ( rule__LeaderVehicle__Group__0 ) )
            // InternalPlatoon.g:193:3: ( rule__LeaderVehicle__Group__0 )
            {
             before(grammarAccess.getLeaderVehicleAccess().getGroup()); 
            // InternalPlatoon.g:194:3: ( rule__LeaderVehicle__Group__0 )
            // InternalPlatoon.g:194:4: rule__LeaderVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeaderVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleLeaderVehicle"


    // $ANTLR start "entryRuleFollowingVehicle"
    // InternalPlatoon.g:203:1: entryRuleFollowingVehicle : ruleFollowingVehicle EOF ;
    public final void entryRuleFollowingVehicle() throws RecognitionException {
        try {
            // InternalPlatoon.g:204:1: ( ruleFollowingVehicle EOF )
            // InternalPlatoon.g:205:1: ruleFollowingVehicle EOF
            {
             before(grammarAccess.getFollowingVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleFollowingVehicle();

            state._fsp--;

             after(grammarAccess.getFollowingVehicleRule()); 
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
    // $ANTLR end "entryRuleFollowingVehicle"


    // $ANTLR start "ruleFollowingVehicle"
    // InternalPlatoon.g:212:1: ruleFollowingVehicle : ( ( rule__FollowingVehicle__Group__0 ) ) ;
    public final void ruleFollowingVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:216:2: ( ( ( rule__FollowingVehicle__Group__0 ) ) )
            // InternalPlatoon.g:217:2: ( ( rule__FollowingVehicle__Group__0 ) )
            {
            // InternalPlatoon.g:217:2: ( ( rule__FollowingVehicle__Group__0 ) )
            // InternalPlatoon.g:218:3: ( rule__FollowingVehicle__Group__0 )
            {
             before(grammarAccess.getFollowingVehicleAccess().getGroup()); 
            // InternalPlatoon.g:219:3: ( rule__FollowingVehicle__Group__0 )
            // InternalPlatoon.g:219:4: rule__FollowingVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowingVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleFollowingVehicle"


    // $ANTLR start "entryRuleEString"
    // InternalPlatoon.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPlatoon.g:229:1: ( ruleEString EOF )
            // InternalPlatoon.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPlatoon.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPlatoon.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPlatoon.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalPlatoon.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPlatoon.g:244:3: ( rule__EString__Alternatives )
            // InternalPlatoon.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleForward"
    // InternalPlatoon.g:253:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalPlatoon.g:254:1: ( ruleForward EOF )
            // InternalPlatoon.g:255:1: ruleForward EOF
            {
             before(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleForward();

            state._fsp--;

             after(grammarAccess.getForwardRule()); 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalPlatoon.g:262:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:266:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalPlatoon.g:267:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalPlatoon.g:267:2: ( ( rule__Forward__Group__0 ) )
            // InternalPlatoon.g:268:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalPlatoon.g:269:3: ( rule__Forward__Group__0 )
            // InternalPlatoon.g:269:4: rule__Forward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getGroup()); 

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalPlatoon.g:278:1: entryRuleTurnLeft : ruleTurnLeft EOF ;
    public final void entryRuleTurnLeft() throws RecognitionException {
        try {
            // InternalPlatoon.g:279:1: ( ruleTurnLeft EOF )
            // InternalPlatoon.g:280:1: ruleTurnLeft EOF
            {
             before(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnLeft();

            state._fsp--;

             after(grammarAccess.getTurnLeftRule()); 
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
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalPlatoon.g:287:1: ruleTurnLeft : ( ( rule__TurnLeft__Group__0 ) ) ;
    public final void ruleTurnLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:291:2: ( ( ( rule__TurnLeft__Group__0 ) ) )
            // InternalPlatoon.g:292:2: ( ( rule__TurnLeft__Group__0 ) )
            {
            // InternalPlatoon.g:292:2: ( ( rule__TurnLeft__Group__0 ) )
            // InternalPlatoon.g:293:3: ( rule__TurnLeft__Group__0 )
            {
             before(grammarAccess.getTurnLeftAccess().getGroup()); 
            // InternalPlatoon.g:294:3: ( rule__TurnLeft__Group__0 )
            // InternalPlatoon.g:294:4: rule__TurnLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalPlatoon.g:303:1: entryRuleTurnRight : ruleTurnRight EOF ;
    public final void entryRuleTurnRight() throws RecognitionException {
        try {
            // InternalPlatoon.g:304:1: ( ruleTurnRight EOF )
            // InternalPlatoon.g:305:1: ruleTurnRight EOF
            {
             before(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnRight();

            state._fsp--;

             after(grammarAccess.getTurnRightRule()); 
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
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalPlatoon.g:312:1: ruleTurnRight : ( ( rule__TurnRight__Group__0 ) ) ;
    public final void ruleTurnRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:316:2: ( ( ( rule__TurnRight__Group__0 ) ) )
            // InternalPlatoon.g:317:2: ( ( rule__TurnRight__Group__0 ) )
            {
            // InternalPlatoon.g:317:2: ( ( rule__TurnRight__Group__0 ) )
            // InternalPlatoon.g:318:3: ( rule__TurnRight__Group__0 )
            {
             before(grammarAccess.getTurnRightAccess().getGroup()); 
            // InternalPlatoon.g:319:3: ( rule__TurnRight__Group__0 )
            // InternalPlatoon.g:319:4: rule__TurnRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnRightAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleEInt"
    // InternalPlatoon.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPlatoon.g:329:1: ( ruleEInt EOF )
            // InternalPlatoon.g:330:1: ruleEInt EOF
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
    // InternalPlatoon.g:337:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:341:2: ( ( RULE_INT ) )
            // InternalPlatoon.g:342:2: ( RULE_INT )
            {
            // InternalPlatoon.g:342:2: ( RULE_INT )
            // InternalPlatoon.g:343:3: RULE_INT
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


    // $ANTLR start "rule__RouteCommand__Alternatives"
    // InternalPlatoon.g:352:1: rule__RouteCommand__Alternatives : ( ( ruleForward ) | ( ruleTurnLeft ) | ( ruleTurnRight ) );
    public final void rule__RouteCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:356:1: ( ( ruleForward ) | ( ruleTurnLeft ) | ( ruleTurnRight ) )
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
                    // InternalPlatoon.g:357:2: ( ruleForward )
                    {
                    // InternalPlatoon.g:357:2: ( ruleForward )
                    // InternalPlatoon.g:358:3: ruleForward
                    {
                     before(grammarAccess.getRouteCommandAccess().getForwardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getRouteCommandAccess().getForwardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:363:2: ( ruleTurnLeft )
                    {
                    // InternalPlatoon.g:363:2: ( ruleTurnLeft )
                    // InternalPlatoon.g:364:3: ruleTurnLeft
                    {
                     before(grammarAccess.getRouteCommandAccess().getTurnLeftParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnLeft();

                    state._fsp--;

                     after(grammarAccess.getRouteCommandAccess().getTurnLeftParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPlatoon.g:369:2: ( ruleTurnRight )
                    {
                    // InternalPlatoon.g:369:2: ( ruleTurnRight )
                    // InternalPlatoon.g:370:3: ruleTurnRight
                    {
                     before(grammarAccess.getRouteCommandAccess().getTurnRightParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnRight();

                    state._fsp--;

                     after(grammarAccess.getRouteCommandAccess().getTurnRightParserRuleCall_2()); 

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
    // $ANTLR end "rule__RouteCommand__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPlatoon.g:379:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:383:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlatoon.g:384:2: ( RULE_STRING )
                    {
                    // InternalPlatoon.g:384:2: ( RULE_STRING )
                    // InternalPlatoon.g:385:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:390:2: ( RULE_ID )
                    {
                    // InternalPlatoon.g:390:2: ( RULE_ID )
                    // InternalPlatoon.g:391:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalPlatoon.g:400:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:404:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalPlatoon.g:405:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalPlatoon.g:412:1: rule__Root__Group__0__Impl : ( ( rule__Root__PlatoonAssignment_0 ) ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:416:1: ( ( ( rule__Root__PlatoonAssignment_0 ) ) )
            // InternalPlatoon.g:417:1: ( ( rule__Root__PlatoonAssignment_0 ) )
            {
            // InternalPlatoon.g:417:1: ( ( rule__Root__PlatoonAssignment_0 ) )
            // InternalPlatoon.g:418:2: ( rule__Root__PlatoonAssignment_0 )
            {
             before(grammarAccess.getRootAccess().getPlatoonAssignment_0()); 
            // InternalPlatoon.g:419:2: ( rule__Root__PlatoonAssignment_0 )
            // InternalPlatoon.g:419:3: rule__Root__PlatoonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Root__PlatoonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getPlatoonAssignment_0()); 

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
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalPlatoon.g:427:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:431:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalPlatoon.g:432:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalPlatoon.g:439:1: rule__Root__Group__1__Impl : ( ( rule__Root__RouteAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:443:1: ( ( ( rule__Root__RouteAssignment_1 ) ) )
            // InternalPlatoon.g:444:1: ( ( rule__Root__RouteAssignment_1 ) )
            {
            // InternalPlatoon.g:444:1: ( ( rule__Root__RouteAssignment_1 ) )
            // InternalPlatoon.g:445:2: ( rule__Root__RouteAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getRouteAssignment_1()); 
            // InternalPlatoon.g:446:2: ( rule__Root__RouteAssignment_1 )
            // InternalPlatoon.g:446:3: rule__Root__RouteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__RouteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getRouteAssignment_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalPlatoon.g:454:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:458:1: ( rule__Root__Group__2__Impl )
            // InternalPlatoon.g:459:2: rule__Root__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__2__Impl();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalPlatoon.g:465:1: rule__Root__Group__2__Impl : ( ( rule__Root__ConstraintsAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:469:1: ( ( ( rule__Root__ConstraintsAssignment_2 ) ) )
            // InternalPlatoon.g:470:1: ( ( rule__Root__ConstraintsAssignment_2 ) )
            {
            // InternalPlatoon.g:470:1: ( ( rule__Root__ConstraintsAssignment_2 ) )
            // InternalPlatoon.g:471:2: ( rule__Root__ConstraintsAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getConstraintsAssignment_2()); 
            // InternalPlatoon.g:472:2: ( rule__Root__ConstraintsAssignment_2 )
            // InternalPlatoon.g:472:3: rule__Root__ConstraintsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__ConstraintsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getConstraintsAssignment_2()); 

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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Platoon__Group__0"
    // InternalPlatoon.g:481:1: rule__Platoon__Group__0 : rule__Platoon__Group__0__Impl rule__Platoon__Group__1 ;
    public final void rule__Platoon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:485:1: ( rule__Platoon__Group__0__Impl rule__Platoon__Group__1 )
            // InternalPlatoon.g:486:2: rule__Platoon__Group__0__Impl rule__Platoon__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Platoon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__1();

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
    // $ANTLR end "rule__Platoon__Group__0"


    // $ANTLR start "rule__Platoon__Group__0__Impl"
    // InternalPlatoon.g:493:1: rule__Platoon__Group__0__Impl : ( 'platoon:' ) ;
    public final void rule__Platoon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:497:1: ( ( 'platoon:' ) )
            // InternalPlatoon.g:498:1: ( 'platoon:' )
            {
            // InternalPlatoon.g:498:1: ( 'platoon:' )
            // InternalPlatoon.g:499:2: 'platoon:'
            {
             before(grammarAccess.getPlatoonAccess().getPlatoonKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPlatoonAccess().getPlatoonKeyword_0()); 

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
    // $ANTLR end "rule__Platoon__Group__0__Impl"


    // $ANTLR start "rule__Platoon__Group__1"
    // InternalPlatoon.g:508:1: rule__Platoon__Group__1 : rule__Platoon__Group__1__Impl rule__Platoon__Group__2 ;
    public final void rule__Platoon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:512:1: ( rule__Platoon__Group__1__Impl rule__Platoon__Group__2 )
            // InternalPlatoon.g:513:2: rule__Platoon__Group__1__Impl rule__Platoon__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Platoon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__2();

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
    // $ANTLR end "rule__Platoon__Group__1"


    // $ANTLR start "rule__Platoon__Group__1__Impl"
    // InternalPlatoon.g:520:1: rule__Platoon__Group__1__Impl : ( ( rule__Platoon__LeaderVehicleAssignment_1 ) ) ;
    public final void rule__Platoon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:524:1: ( ( ( rule__Platoon__LeaderVehicleAssignment_1 ) ) )
            // InternalPlatoon.g:525:1: ( ( rule__Platoon__LeaderVehicleAssignment_1 ) )
            {
            // InternalPlatoon.g:525:1: ( ( rule__Platoon__LeaderVehicleAssignment_1 ) )
            // InternalPlatoon.g:526:2: ( rule__Platoon__LeaderVehicleAssignment_1 )
            {
             before(grammarAccess.getPlatoonAccess().getLeaderVehicleAssignment_1()); 
            // InternalPlatoon.g:527:2: ( rule__Platoon__LeaderVehicleAssignment_1 )
            // InternalPlatoon.g:527:3: rule__Platoon__LeaderVehicleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__LeaderVehicleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getLeaderVehicleAssignment_1()); 

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
    // $ANTLR end "rule__Platoon__Group__1__Impl"


    // $ANTLR start "rule__Platoon__Group__2"
    // InternalPlatoon.g:535:1: rule__Platoon__Group__2 : rule__Platoon__Group__2__Impl ;
    public final void rule__Platoon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:539:1: ( rule__Platoon__Group__2__Impl )
            // InternalPlatoon.g:540:2: rule__Platoon__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group__2__Impl();

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
    // $ANTLR end "rule__Platoon__Group__2"


    // $ANTLR start "rule__Platoon__Group__2__Impl"
    // InternalPlatoon.g:546:1: rule__Platoon__Group__2__Impl : ( ( rule__Platoon__Group_2__0 )? ) ;
    public final void rule__Platoon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:550:1: ( ( ( rule__Platoon__Group_2__0 )? ) )
            // InternalPlatoon.g:551:1: ( ( rule__Platoon__Group_2__0 )? )
            {
            // InternalPlatoon.g:551:1: ( ( rule__Platoon__Group_2__0 )? )
            // InternalPlatoon.g:552:2: ( rule__Platoon__Group_2__0 )?
            {
             before(grammarAccess.getPlatoonAccess().getGroup_2()); 
            // InternalPlatoon.g:553:2: ( rule__Platoon__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPlatoon.g:553:3: rule__Platoon__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platoon__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatoonAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Platoon__Group__2__Impl"


    // $ANTLR start "rule__Platoon__Group_2__0"
    // InternalPlatoon.g:562:1: rule__Platoon__Group_2__0 : rule__Platoon__Group_2__0__Impl rule__Platoon__Group_2__1 ;
    public final void rule__Platoon__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:566:1: ( rule__Platoon__Group_2__0__Impl rule__Platoon__Group_2__1 )
            // InternalPlatoon.g:567:2: rule__Platoon__Group_2__0__Impl rule__Platoon__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Platoon__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group_2__1();

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
    // $ANTLR end "rule__Platoon__Group_2__0"


    // $ANTLR start "rule__Platoon__Group_2__0__Impl"
    // InternalPlatoon.g:574:1: rule__Platoon__Group_2__0__Impl : ( ( rule__Platoon__FollowingVehicleAssignment_2_0 ) ) ;
    public final void rule__Platoon__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:578:1: ( ( ( rule__Platoon__FollowingVehicleAssignment_2_0 ) ) )
            // InternalPlatoon.g:579:1: ( ( rule__Platoon__FollowingVehicleAssignment_2_0 ) )
            {
            // InternalPlatoon.g:579:1: ( ( rule__Platoon__FollowingVehicleAssignment_2_0 ) )
            // InternalPlatoon.g:580:2: ( rule__Platoon__FollowingVehicleAssignment_2_0 )
            {
             before(grammarAccess.getPlatoonAccess().getFollowingVehicleAssignment_2_0()); 
            // InternalPlatoon.g:581:2: ( rule__Platoon__FollowingVehicleAssignment_2_0 )
            // InternalPlatoon.g:581:3: rule__Platoon__FollowingVehicleAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__FollowingVehicleAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getFollowingVehicleAssignment_2_0()); 

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
    // $ANTLR end "rule__Platoon__Group_2__0__Impl"


    // $ANTLR start "rule__Platoon__Group_2__1"
    // InternalPlatoon.g:589:1: rule__Platoon__Group_2__1 : rule__Platoon__Group_2__1__Impl ;
    public final void rule__Platoon__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:593:1: ( rule__Platoon__Group_2__1__Impl )
            // InternalPlatoon.g:594:2: rule__Platoon__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group_2__1__Impl();

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
    // $ANTLR end "rule__Platoon__Group_2__1"


    // $ANTLR start "rule__Platoon__Group_2__1__Impl"
    // InternalPlatoon.g:600:1: rule__Platoon__Group_2__1__Impl : ( ( rule__Platoon__FollowingVehicleAssignment_2_1 )* ) ;
    public final void rule__Platoon__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:604:1: ( ( ( rule__Platoon__FollowingVehicleAssignment_2_1 )* ) )
            // InternalPlatoon.g:605:1: ( ( rule__Platoon__FollowingVehicleAssignment_2_1 )* )
            {
            // InternalPlatoon.g:605:1: ( ( rule__Platoon__FollowingVehicleAssignment_2_1 )* )
            // InternalPlatoon.g:606:2: ( rule__Platoon__FollowingVehicleAssignment_2_1 )*
            {
             before(grammarAccess.getPlatoonAccess().getFollowingVehicleAssignment_2_1()); 
            // InternalPlatoon.g:607:2: ( rule__Platoon__FollowingVehicleAssignment_2_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlatoon.g:607:3: rule__Platoon__FollowingVehicleAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Platoon__FollowingVehicleAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPlatoonAccess().getFollowingVehicleAssignment_2_1()); 

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
    // $ANTLR end "rule__Platoon__Group_2__1__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalPlatoon.g:616:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:620:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalPlatoon.g:621:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__1();

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
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // InternalPlatoon.g:628:1: rule__Route__Group__0__Impl : ( 'route' ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:632:1: ( ( 'route' ) )
            // InternalPlatoon.g:633:1: ( 'route' )
            {
            // InternalPlatoon.g:633:1: ( 'route' )
            // InternalPlatoon.g:634:2: 'route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getRouteKeyword_0()); 

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
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // InternalPlatoon.g:643:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:647:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalPlatoon.g:648:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Route__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__2();

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
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // InternalPlatoon.g:655:1: rule__Route__Group__1__Impl : ( ( rule__Route__NameAssignment_1 ) ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:659:1: ( ( ( rule__Route__NameAssignment_1 ) ) )
            // InternalPlatoon.g:660:1: ( ( rule__Route__NameAssignment_1 ) )
            {
            // InternalPlatoon.g:660:1: ( ( rule__Route__NameAssignment_1 ) )
            // InternalPlatoon.g:661:2: ( rule__Route__NameAssignment_1 )
            {
             before(grammarAccess.getRouteAccess().getNameAssignment_1()); 
            // InternalPlatoon.g:662:2: ( rule__Route__NameAssignment_1 )
            // InternalPlatoon.g:662:3: rule__Route__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Route__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__2"
    // InternalPlatoon.g:670:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:674:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalPlatoon.g:675:2: rule__Route__Group__2__Impl rule__Route__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Route__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__3();

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
    // $ANTLR end "rule__Route__Group__2"


    // $ANTLR start "rule__Route__Group__2__Impl"
    // InternalPlatoon.g:682:1: rule__Route__Group__2__Impl : ( ':' ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:686:1: ( ( ':' ) )
            // InternalPlatoon.g:687:1: ( ':' )
            {
            // InternalPlatoon.g:687:1: ( ':' )
            // InternalPlatoon.g:688:2: ':'
            {
             before(grammarAccess.getRouteAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Route__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__3"
    // InternalPlatoon.g:697:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:701:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalPlatoon.g:702:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Route__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__4();

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
    // $ANTLR end "rule__Route__Group__3"


    // $ANTLR start "rule__Route__Group__3__Impl"
    // InternalPlatoon.g:709:1: rule__Route__Group__3__Impl : ( ( rule__Route__RouteCommandsAssignment_3 ) ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:713:1: ( ( ( rule__Route__RouteCommandsAssignment_3 ) ) )
            // InternalPlatoon.g:714:1: ( ( rule__Route__RouteCommandsAssignment_3 ) )
            {
            // InternalPlatoon.g:714:1: ( ( rule__Route__RouteCommandsAssignment_3 ) )
            // InternalPlatoon.g:715:2: ( rule__Route__RouteCommandsAssignment_3 )
            {
             before(grammarAccess.getRouteAccess().getRouteCommandsAssignment_3()); 
            // InternalPlatoon.g:716:2: ( rule__Route__RouteCommandsAssignment_3 )
            // InternalPlatoon.g:716:3: rule__Route__RouteCommandsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Route__RouteCommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getRouteCommandsAssignment_3()); 

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
    // $ANTLR end "rule__Route__Group__3__Impl"


    // $ANTLR start "rule__Route__Group__4"
    // InternalPlatoon.g:724:1: rule__Route__Group__4 : rule__Route__Group__4__Impl ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:728:1: ( rule__Route__Group__4__Impl )
            // InternalPlatoon.g:729:2: rule__Route__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__4__Impl();

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
    // $ANTLR end "rule__Route__Group__4"


    // $ANTLR start "rule__Route__Group__4__Impl"
    // InternalPlatoon.g:735:1: rule__Route__Group__4__Impl : ( ( rule__Route__RouteCommandsAssignment_4 )* ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:739:1: ( ( ( rule__Route__RouteCommandsAssignment_4 )* ) )
            // InternalPlatoon.g:740:1: ( ( rule__Route__RouteCommandsAssignment_4 )* )
            {
            // InternalPlatoon.g:740:1: ( ( rule__Route__RouteCommandsAssignment_4 )* )
            // InternalPlatoon.g:741:2: ( rule__Route__RouteCommandsAssignment_4 )*
            {
             before(grammarAccess.getRouteAccess().getRouteCommandsAssignment_4()); 
            // InternalPlatoon.g:742:2: ( rule__Route__RouteCommandsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPlatoon.g:742:3: rule__Route__RouteCommandsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Route__RouteCommandsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRouteAccess().getRouteCommandsAssignment_4()); 

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
    // $ANTLR end "rule__Route__Group__4__Impl"


    // $ANTLR start "rule__Constraints__Group__0"
    // InternalPlatoon.g:751:1: rule__Constraints__Group__0 : rule__Constraints__Group__0__Impl rule__Constraints__Group__1 ;
    public final void rule__Constraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:755:1: ( rule__Constraints__Group__0__Impl rule__Constraints__Group__1 )
            // InternalPlatoon.g:756:2: rule__Constraints__Group__0__Impl rule__Constraints__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Constraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__1();

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
    // $ANTLR end "rule__Constraints__Group__0"


    // $ANTLR start "rule__Constraints__Group__0__Impl"
    // InternalPlatoon.g:763:1: rule__Constraints__Group__0__Impl : ( 'constraints:' ) ;
    public final void rule__Constraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:767:1: ( ( 'constraints:' ) )
            // InternalPlatoon.g:768:1: ( 'constraints:' )
            {
            // InternalPlatoon.g:768:1: ( 'constraints:' )
            // InternalPlatoon.g:769:2: 'constraints:'
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 

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
    // $ANTLR end "rule__Constraints__Group__0__Impl"


    // $ANTLR start "rule__Constraints__Group__1"
    // InternalPlatoon.g:778:1: rule__Constraints__Group__1 : rule__Constraints__Group__1__Impl rule__Constraints__Group__2 ;
    public final void rule__Constraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:782:1: ( rule__Constraints__Group__1__Impl rule__Constraints__Group__2 )
            // InternalPlatoon.g:783:2: rule__Constraints__Group__1__Impl rule__Constraints__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Constraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__2();

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
    // $ANTLR end "rule__Constraints__Group__1"


    // $ANTLR start "rule__Constraints__Group__1__Impl"
    // InternalPlatoon.g:790:1: rule__Constraints__Group__1__Impl : ( ( rule__Constraints__LboundAssignment_1 ) ) ;
    public final void rule__Constraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:794:1: ( ( ( rule__Constraints__LboundAssignment_1 ) ) )
            // InternalPlatoon.g:795:1: ( ( rule__Constraints__LboundAssignment_1 ) )
            {
            // InternalPlatoon.g:795:1: ( ( rule__Constraints__LboundAssignment_1 ) )
            // InternalPlatoon.g:796:2: ( rule__Constraints__LboundAssignment_1 )
            {
             before(grammarAccess.getConstraintsAccess().getLboundAssignment_1()); 
            // InternalPlatoon.g:797:2: ( rule__Constraints__LboundAssignment_1 )
            // InternalPlatoon.g:797:3: rule__Constraints__LboundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__LboundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getLboundAssignment_1()); 

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
    // $ANTLR end "rule__Constraints__Group__1__Impl"


    // $ANTLR start "rule__Constraints__Group__2"
    // InternalPlatoon.g:805:1: rule__Constraints__Group__2 : rule__Constraints__Group__2__Impl rule__Constraints__Group__3 ;
    public final void rule__Constraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:809:1: ( rule__Constraints__Group__2__Impl rule__Constraints__Group__3 )
            // InternalPlatoon.g:810:2: rule__Constraints__Group__2__Impl rule__Constraints__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Constraints__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__3();

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
    // $ANTLR end "rule__Constraints__Group__2"


    // $ANTLR start "rule__Constraints__Group__2__Impl"
    // InternalPlatoon.g:817:1: rule__Constraints__Group__2__Impl : ( '<=' ) ;
    public final void rule__Constraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:821:1: ( ( '<=' ) )
            // InternalPlatoon.g:822:1: ( '<=' )
            {
            // InternalPlatoon.g:822:1: ( '<=' )
            // InternalPlatoon.g:823:2: '<='
            {
             before(grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Constraints__Group__2__Impl"


    // $ANTLR start "rule__Constraints__Group__3"
    // InternalPlatoon.g:832:1: rule__Constraints__Group__3 : rule__Constraints__Group__3__Impl rule__Constraints__Group__4 ;
    public final void rule__Constraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:836:1: ( rule__Constraints__Group__3__Impl rule__Constraints__Group__4 )
            // InternalPlatoon.g:837:2: rule__Constraints__Group__3__Impl rule__Constraints__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Constraints__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__4();

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
    // $ANTLR end "rule__Constraints__Group__3"


    // $ANTLR start "rule__Constraints__Group__3__Impl"
    // InternalPlatoon.g:844:1: rule__Constraints__Group__3__Impl : ( 'headway' ) ;
    public final void rule__Constraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:848:1: ( ( 'headway' ) )
            // InternalPlatoon.g:849:1: ( 'headway' )
            {
            // InternalPlatoon.g:849:1: ( 'headway' )
            // InternalPlatoon.g:850:2: 'headway'
            {
             before(grammarAccess.getConstraintsAccess().getHeadwayKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getHeadwayKeyword_3()); 

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
    // $ANTLR end "rule__Constraints__Group__3__Impl"


    // $ANTLR start "rule__Constraints__Group__4"
    // InternalPlatoon.g:859:1: rule__Constraints__Group__4 : rule__Constraints__Group__4__Impl rule__Constraints__Group__5 ;
    public final void rule__Constraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:863:1: ( rule__Constraints__Group__4__Impl rule__Constraints__Group__5 )
            // InternalPlatoon.g:864:2: rule__Constraints__Group__4__Impl rule__Constraints__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Constraints__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__5();

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
    // $ANTLR end "rule__Constraints__Group__4"


    // $ANTLR start "rule__Constraints__Group__4__Impl"
    // InternalPlatoon.g:871:1: rule__Constraints__Group__4__Impl : ( '<=' ) ;
    public final void rule__Constraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:875:1: ( ( '<=' ) )
            // InternalPlatoon.g:876:1: ( '<=' )
            {
            // InternalPlatoon.g:876:1: ( '<=' )
            // InternalPlatoon.g:877:2: '<='
            {
             before(grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Constraints__Group__4__Impl"


    // $ANTLR start "rule__Constraints__Group__5"
    // InternalPlatoon.g:886:1: rule__Constraints__Group__5 : rule__Constraints__Group__5__Impl ;
    public final void rule__Constraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:890:1: ( rule__Constraints__Group__5__Impl )
            // InternalPlatoon.g:891:2: rule__Constraints__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__5__Impl();

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
    // $ANTLR end "rule__Constraints__Group__5"


    // $ANTLR start "rule__Constraints__Group__5__Impl"
    // InternalPlatoon.g:897:1: rule__Constraints__Group__5__Impl : ( ( rule__Constraints__UboundAssignment_5 ) ) ;
    public final void rule__Constraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:901:1: ( ( ( rule__Constraints__UboundAssignment_5 ) ) )
            // InternalPlatoon.g:902:1: ( ( rule__Constraints__UboundAssignment_5 ) )
            {
            // InternalPlatoon.g:902:1: ( ( rule__Constraints__UboundAssignment_5 ) )
            // InternalPlatoon.g:903:2: ( rule__Constraints__UboundAssignment_5 )
            {
             before(grammarAccess.getConstraintsAccess().getUboundAssignment_5()); 
            // InternalPlatoon.g:904:2: ( rule__Constraints__UboundAssignment_5 )
            // InternalPlatoon.g:904:3: rule__Constraints__UboundAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__UboundAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getUboundAssignment_5()); 

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
    // $ANTLR end "rule__Constraints__Group__5__Impl"


    // $ANTLR start "rule__LeaderVehicle__Group__0"
    // InternalPlatoon.g:913:1: rule__LeaderVehicle__Group__0 : rule__LeaderVehicle__Group__0__Impl rule__LeaderVehicle__Group__1 ;
    public final void rule__LeaderVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:917:1: ( rule__LeaderVehicle__Group__0__Impl rule__LeaderVehicle__Group__1 )
            // InternalPlatoon.g:918:2: rule__LeaderVehicle__Group__0__Impl rule__LeaderVehicle__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LeaderVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__Group__1();

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
    // $ANTLR end "rule__LeaderVehicle__Group__0"


    // $ANTLR start "rule__LeaderVehicle__Group__0__Impl"
    // InternalPlatoon.g:925:1: rule__LeaderVehicle__Group__0__Impl : ( 'LV' ) ;
    public final void rule__LeaderVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:929:1: ( ( 'LV' ) )
            // InternalPlatoon.g:930:1: ( 'LV' )
            {
            // InternalPlatoon.g:930:1: ( 'LV' )
            // InternalPlatoon.g:931:2: 'LV'
            {
             before(grammarAccess.getLeaderVehicleAccess().getLVKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLeaderVehicleAccess().getLVKeyword_0()); 

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
    // $ANTLR end "rule__LeaderVehicle__Group__0__Impl"


    // $ANTLR start "rule__LeaderVehicle__Group__1"
    // InternalPlatoon.g:940:1: rule__LeaderVehicle__Group__1 : rule__LeaderVehicle__Group__1__Impl rule__LeaderVehicle__Group__2 ;
    public final void rule__LeaderVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:944:1: ( rule__LeaderVehicle__Group__1__Impl rule__LeaderVehicle__Group__2 )
            // InternalPlatoon.g:945:2: rule__LeaderVehicle__Group__1__Impl rule__LeaderVehicle__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LeaderVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__Group__2();

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
    // $ANTLR end "rule__LeaderVehicle__Group__1"


    // $ANTLR start "rule__LeaderVehicle__Group__1__Impl"
    // InternalPlatoon.g:952:1: rule__LeaderVehicle__Group__1__Impl : ( ( rule__LeaderVehicle__NameAssignment_1 ) ) ;
    public final void rule__LeaderVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:956:1: ( ( ( rule__LeaderVehicle__NameAssignment_1 ) ) )
            // InternalPlatoon.g:957:1: ( ( rule__LeaderVehicle__NameAssignment_1 ) )
            {
            // InternalPlatoon.g:957:1: ( ( rule__LeaderVehicle__NameAssignment_1 ) )
            // InternalPlatoon.g:958:2: ( rule__LeaderVehicle__NameAssignment_1 )
            {
             before(grammarAccess.getLeaderVehicleAccess().getNameAssignment_1()); 
            // InternalPlatoon.g:959:2: ( rule__LeaderVehicle__NameAssignment_1 )
            // InternalPlatoon.g:959:3: rule__LeaderVehicle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeaderVehicleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LeaderVehicle__Group__1__Impl"


    // $ANTLR start "rule__LeaderVehicle__Group__2"
    // InternalPlatoon.g:967:1: rule__LeaderVehicle__Group__2 : rule__LeaderVehicle__Group__2__Impl rule__LeaderVehicle__Group__3 ;
    public final void rule__LeaderVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:971:1: ( rule__LeaderVehicle__Group__2__Impl rule__LeaderVehicle__Group__3 )
            // InternalPlatoon.g:972:2: rule__LeaderVehicle__Group__2__Impl rule__LeaderVehicle__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LeaderVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__Group__3();

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
    // $ANTLR end "rule__LeaderVehicle__Group__2"


    // $ANTLR start "rule__LeaderVehicle__Group__2__Impl"
    // InternalPlatoon.g:979:1: rule__LeaderVehicle__Group__2__Impl : ( 'route' ) ;
    public final void rule__LeaderVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:983:1: ( ( 'route' ) )
            // InternalPlatoon.g:984:1: ( 'route' )
            {
            // InternalPlatoon.g:984:1: ( 'route' )
            // InternalPlatoon.g:985:2: 'route'
            {
             before(grammarAccess.getLeaderVehicleAccess().getRouteKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLeaderVehicleAccess().getRouteKeyword_2()); 

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
    // $ANTLR end "rule__LeaderVehicle__Group__2__Impl"


    // $ANTLR start "rule__LeaderVehicle__Group__3"
    // InternalPlatoon.g:994:1: rule__LeaderVehicle__Group__3 : rule__LeaderVehicle__Group__3__Impl ;
    public final void rule__LeaderVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:998:1: ( rule__LeaderVehicle__Group__3__Impl )
            // InternalPlatoon.g:999:2: rule__LeaderVehicle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__Group__3__Impl();

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
    // $ANTLR end "rule__LeaderVehicle__Group__3"


    // $ANTLR start "rule__LeaderVehicle__Group__3__Impl"
    // InternalPlatoon.g:1005:1: rule__LeaderVehicle__Group__3__Impl : ( ( rule__LeaderVehicle__RouteAssignment_3 ) ) ;
    public final void rule__LeaderVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1009:1: ( ( ( rule__LeaderVehicle__RouteAssignment_3 ) ) )
            // InternalPlatoon.g:1010:1: ( ( rule__LeaderVehicle__RouteAssignment_3 ) )
            {
            // InternalPlatoon.g:1010:1: ( ( rule__LeaderVehicle__RouteAssignment_3 ) )
            // InternalPlatoon.g:1011:2: ( rule__LeaderVehicle__RouteAssignment_3 )
            {
             before(grammarAccess.getLeaderVehicleAccess().getRouteAssignment_3()); 
            // InternalPlatoon.g:1012:2: ( rule__LeaderVehicle__RouteAssignment_3 )
            // InternalPlatoon.g:1012:3: rule__LeaderVehicle__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LeaderVehicle__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLeaderVehicleAccess().getRouteAssignment_3()); 

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
    // $ANTLR end "rule__LeaderVehicle__Group__3__Impl"


    // $ANTLR start "rule__FollowingVehicle__Group__0"
    // InternalPlatoon.g:1021:1: rule__FollowingVehicle__Group__0 : rule__FollowingVehicle__Group__0__Impl rule__FollowingVehicle__Group__1 ;
    public final void rule__FollowingVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1025:1: ( rule__FollowingVehicle__Group__0__Impl rule__FollowingVehicle__Group__1 )
            // InternalPlatoon.g:1026:2: rule__FollowingVehicle__Group__0__Impl rule__FollowingVehicle__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FollowingVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__Group__1();

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
    // $ANTLR end "rule__FollowingVehicle__Group__0"


    // $ANTLR start "rule__FollowingVehicle__Group__0__Impl"
    // InternalPlatoon.g:1033:1: rule__FollowingVehicle__Group__0__Impl : ( 'FV' ) ;
    public final void rule__FollowingVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1037:1: ( ( 'FV' ) )
            // InternalPlatoon.g:1038:1: ( 'FV' )
            {
            // InternalPlatoon.g:1038:1: ( 'FV' )
            // InternalPlatoon.g:1039:2: 'FV'
            {
             before(grammarAccess.getFollowingVehicleAccess().getFVKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFollowingVehicleAccess().getFVKeyword_0()); 

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
    // $ANTLR end "rule__FollowingVehicle__Group__0__Impl"


    // $ANTLR start "rule__FollowingVehicle__Group__1"
    // InternalPlatoon.g:1048:1: rule__FollowingVehicle__Group__1 : rule__FollowingVehicle__Group__1__Impl rule__FollowingVehicle__Group__2 ;
    public final void rule__FollowingVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1052:1: ( rule__FollowingVehicle__Group__1__Impl rule__FollowingVehicle__Group__2 )
            // InternalPlatoon.g:1053:2: rule__FollowingVehicle__Group__1__Impl rule__FollowingVehicle__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FollowingVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__Group__2();

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
    // $ANTLR end "rule__FollowingVehicle__Group__1"


    // $ANTLR start "rule__FollowingVehicle__Group__1__Impl"
    // InternalPlatoon.g:1060:1: rule__FollowingVehicle__Group__1__Impl : ( ( rule__FollowingVehicle__NameAssignment_1 ) ) ;
    public final void rule__FollowingVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1064:1: ( ( ( rule__FollowingVehicle__NameAssignment_1 ) ) )
            // InternalPlatoon.g:1065:1: ( ( rule__FollowingVehicle__NameAssignment_1 ) )
            {
            // InternalPlatoon.g:1065:1: ( ( rule__FollowingVehicle__NameAssignment_1 ) )
            // InternalPlatoon.g:1066:2: ( rule__FollowingVehicle__NameAssignment_1 )
            {
             before(grammarAccess.getFollowingVehicleAccess().getNameAssignment_1()); 
            // InternalPlatoon.g:1067:2: ( rule__FollowingVehicle__NameAssignment_1 )
            // InternalPlatoon.g:1067:3: rule__FollowingVehicle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowingVehicleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FollowingVehicle__Group__1__Impl"


    // $ANTLR start "rule__FollowingVehicle__Group__2"
    // InternalPlatoon.g:1075:1: rule__FollowingVehicle__Group__2 : rule__FollowingVehicle__Group__2__Impl rule__FollowingVehicle__Group__3 ;
    public final void rule__FollowingVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1079:1: ( rule__FollowingVehicle__Group__2__Impl rule__FollowingVehicle__Group__3 )
            // InternalPlatoon.g:1080:2: rule__FollowingVehicle__Group__2__Impl rule__FollowingVehicle__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FollowingVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__Group__3();

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
    // $ANTLR end "rule__FollowingVehicle__Group__2"


    // $ANTLR start "rule__FollowingVehicle__Group__2__Impl"
    // InternalPlatoon.g:1087:1: rule__FollowingVehicle__Group__2__Impl : ( 'front' ) ;
    public final void rule__FollowingVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1091:1: ( ( 'front' ) )
            // InternalPlatoon.g:1092:1: ( 'front' )
            {
            // InternalPlatoon.g:1092:1: ( 'front' )
            // InternalPlatoon.g:1093:2: 'front'
            {
             before(grammarAccess.getFollowingVehicleAccess().getFrontKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFollowingVehicleAccess().getFrontKeyword_2()); 

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
    // $ANTLR end "rule__FollowingVehicle__Group__2__Impl"


    // $ANTLR start "rule__FollowingVehicle__Group__3"
    // InternalPlatoon.g:1102:1: rule__FollowingVehicle__Group__3 : rule__FollowingVehicle__Group__3__Impl rule__FollowingVehicle__Group__4 ;
    public final void rule__FollowingVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1106:1: ( rule__FollowingVehicle__Group__3__Impl rule__FollowingVehicle__Group__4 )
            // InternalPlatoon.g:1107:2: rule__FollowingVehicle__Group__3__Impl rule__FollowingVehicle__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__FollowingVehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__Group__4();

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
    // $ANTLR end "rule__FollowingVehicle__Group__3"


    // $ANTLR start "rule__FollowingVehicle__Group__3__Impl"
    // InternalPlatoon.g:1114:1: rule__FollowingVehicle__Group__3__Impl : ( 'runner' ) ;
    public final void rule__FollowingVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1118:1: ( ( 'runner' ) )
            // InternalPlatoon.g:1119:1: ( 'runner' )
            {
            // InternalPlatoon.g:1119:1: ( 'runner' )
            // InternalPlatoon.g:1120:2: 'runner'
            {
             before(grammarAccess.getFollowingVehicleAccess().getRunnerKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFollowingVehicleAccess().getRunnerKeyword_3()); 

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
    // $ANTLR end "rule__FollowingVehicle__Group__3__Impl"


    // $ANTLR start "rule__FollowingVehicle__Group__4"
    // InternalPlatoon.g:1129:1: rule__FollowingVehicle__Group__4 : rule__FollowingVehicle__Group__4__Impl ;
    public final void rule__FollowingVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1133:1: ( rule__FollowingVehicle__Group__4__Impl )
            // InternalPlatoon.g:1134:2: rule__FollowingVehicle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__Group__4__Impl();

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
    // $ANTLR end "rule__FollowingVehicle__Group__4"


    // $ANTLR start "rule__FollowingVehicle__Group__4__Impl"
    // InternalPlatoon.g:1140:1: rule__FollowingVehicle__Group__4__Impl : ( ( rule__FollowingVehicle__FollowingAssignment_4 ) ) ;
    public final void rule__FollowingVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1144:1: ( ( ( rule__FollowingVehicle__FollowingAssignment_4 ) ) )
            // InternalPlatoon.g:1145:1: ( ( rule__FollowingVehicle__FollowingAssignment_4 ) )
            {
            // InternalPlatoon.g:1145:1: ( ( rule__FollowingVehicle__FollowingAssignment_4 ) )
            // InternalPlatoon.g:1146:2: ( rule__FollowingVehicle__FollowingAssignment_4 )
            {
             before(grammarAccess.getFollowingVehicleAccess().getFollowingAssignment_4()); 
            // InternalPlatoon.g:1147:2: ( rule__FollowingVehicle__FollowingAssignment_4 )
            // InternalPlatoon.g:1147:3: rule__FollowingVehicle__FollowingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FollowingVehicle__FollowingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFollowingVehicleAccess().getFollowingAssignment_4()); 

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
    // $ANTLR end "rule__FollowingVehicle__Group__4__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // InternalPlatoon.g:1156:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1160:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalPlatoon.g:1161:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Forward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__1();

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
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // InternalPlatoon.g:1168:1: rule__Forward__Group__0__Impl : ( 'forward' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1172:1: ( ( 'forward' ) )
            // InternalPlatoon.g:1173:1: ( 'forward' )
            {
            // InternalPlatoon.g:1173:1: ( 'forward' )
            // InternalPlatoon.g:1174:2: 'forward'
            {
             before(grammarAccess.getForwardAccess().getForwardKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getForwardKeyword_0()); 

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
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // InternalPlatoon.g:1183:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1187:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalPlatoon.g:1188:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Forward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__2();

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
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // InternalPlatoon.g:1195:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1199:1: ( ( '(' ) )
            // InternalPlatoon.g:1200:1: ( '(' )
            {
            // InternalPlatoon.g:1200:1: ( '(' )
            // InternalPlatoon.g:1201:2: '('
            {
             before(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__2"
    // InternalPlatoon.g:1210:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1214:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalPlatoon.g:1215:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Forward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__3();

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
    // $ANTLR end "rule__Forward__Group__2"


    // $ANTLR start "rule__Forward__Group__2__Impl"
    // InternalPlatoon.g:1222:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1226:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalPlatoon.g:1227:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalPlatoon.g:1227:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalPlatoon.g:1228:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalPlatoon.g:1229:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalPlatoon.g:1229:3: rule__Forward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Forward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Forward__Group__2__Impl"


    // $ANTLR start "rule__Forward__Group__3"
    // InternalPlatoon.g:1237:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1241:1: ( rule__Forward__Group__3__Impl )
            // InternalPlatoon.g:1242:2: rule__Forward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__3__Impl();

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
    // $ANTLR end "rule__Forward__Group__3"


    // $ANTLR start "rule__Forward__Group__3__Impl"
    // InternalPlatoon.g:1248:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1252:1: ( ( ')' ) )
            // InternalPlatoon.g:1253:1: ( ')' )
            {
            // InternalPlatoon.g:1253:1: ( ')' )
            // InternalPlatoon.g:1254:2: ')'
            {
             before(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Forward__Group__3__Impl"


    // $ANTLR start "rule__TurnLeft__Group__0"
    // InternalPlatoon.g:1264:1: rule__TurnLeft__Group__0 : rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 ;
    public final void rule__TurnLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1268:1: ( rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 )
            // InternalPlatoon.g:1269:2: rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TurnLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__1();

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
    // $ANTLR end "rule__TurnLeft__Group__0"


    // $ANTLR start "rule__TurnLeft__Group__0__Impl"
    // InternalPlatoon.g:1276:1: rule__TurnLeft__Group__0__Impl : ( () ) ;
    public final void rule__TurnLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1280:1: ( ( () ) )
            // InternalPlatoon.g:1281:1: ( () )
            {
            // InternalPlatoon.g:1281:1: ( () )
            // InternalPlatoon.g:1282:2: ()
            {
             before(grammarAccess.getTurnLeftAccess().getTurnLeftAction_0()); 
            // InternalPlatoon.g:1283:2: ()
            // InternalPlatoon.g:1283:3: 
            {
            }

             after(grammarAccess.getTurnLeftAccess().getTurnLeftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__0__Impl"


    // $ANTLR start "rule__TurnLeft__Group__1"
    // InternalPlatoon.g:1291:1: rule__TurnLeft__Group__1 : rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 ;
    public final void rule__TurnLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1295:1: ( rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 )
            // InternalPlatoon.g:1296:2: rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__TurnLeft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2();

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
    // $ANTLR end "rule__TurnLeft__Group__1"


    // $ANTLR start "rule__TurnLeft__Group__1__Impl"
    // InternalPlatoon.g:1303:1: rule__TurnLeft__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1307:1: ( ( 'turn' ) )
            // InternalPlatoon.g:1308:1: ( 'turn' )
            {
            // InternalPlatoon.g:1308:1: ( 'turn' )
            // InternalPlatoon.g:1309:2: 'turn'
            {
             before(grammarAccess.getTurnLeftAccess().getTurnKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnLeft__Group__1__Impl"


    // $ANTLR start "rule__TurnLeft__Group__2"
    // InternalPlatoon.g:1318:1: rule__TurnLeft__Group__2 : rule__TurnLeft__Group__2__Impl ;
    public final void rule__TurnLeft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1322:1: ( rule__TurnLeft__Group__2__Impl )
            // InternalPlatoon.g:1323:2: rule__TurnLeft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2__Impl();

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
    // $ANTLR end "rule__TurnLeft__Group__2"


    // $ANTLR start "rule__TurnLeft__Group__2__Impl"
    // InternalPlatoon.g:1329:1: rule__TurnLeft__Group__2__Impl : ( 'Left' ) ;
    public final void rule__TurnLeft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1333:1: ( ( 'Left' ) )
            // InternalPlatoon.g:1334:1: ( 'Left' )
            {
            // InternalPlatoon.g:1334:1: ( 'Left' )
            // InternalPlatoon.g:1335:2: 'Left'
            {
             before(grammarAccess.getTurnLeftAccess().getLeftKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getLeftKeyword_2()); 

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
    // $ANTLR end "rule__TurnLeft__Group__2__Impl"


    // $ANTLR start "rule__TurnRight__Group__0"
    // InternalPlatoon.g:1345:1: rule__TurnRight__Group__0 : rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 ;
    public final void rule__TurnRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1349:1: ( rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 )
            // InternalPlatoon.g:1350:2: rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TurnRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__1();

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
    // $ANTLR end "rule__TurnRight__Group__0"


    // $ANTLR start "rule__TurnRight__Group__0__Impl"
    // InternalPlatoon.g:1357:1: rule__TurnRight__Group__0__Impl : ( () ) ;
    public final void rule__TurnRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1361:1: ( ( () ) )
            // InternalPlatoon.g:1362:1: ( () )
            {
            // InternalPlatoon.g:1362:1: ( () )
            // InternalPlatoon.g:1363:2: ()
            {
             before(grammarAccess.getTurnRightAccess().getTurnRightAction_0()); 
            // InternalPlatoon.g:1364:2: ()
            // InternalPlatoon.g:1364:3: 
            {
            }

             after(grammarAccess.getTurnRightAccess().getTurnRightAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__0__Impl"


    // $ANTLR start "rule__TurnRight__Group__1"
    // InternalPlatoon.g:1372:1: rule__TurnRight__Group__1 : rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 ;
    public final void rule__TurnRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1376:1: ( rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 )
            // InternalPlatoon.g:1377:2: rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TurnRight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2();

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
    // $ANTLR end "rule__TurnRight__Group__1"


    // $ANTLR start "rule__TurnRight__Group__1__Impl"
    // InternalPlatoon.g:1384:1: rule__TurnRight__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1388:1: ( ( 'turn' ) )
            // InternalPlatoon.g:1389:1: ( 'turn' )
            {
            // InternalPlatoon.g:1389:1: ( 'turn' )
            // InternalPlatoon.g:1390:2: 'turn'
            {
             before(grammarAccess.getTurnRightAccess().getTurnKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnRight__Group__1__Impl"


    // $ANTLR start "rule__TurnRight__Group__2"
    // InternalPlatoon.g:1399:1: rule__TurnRight__Group__2 : rule__TurnRight__Group__2__Impl ;
    public final void rule__TurnRight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1403:1: ( rule__TurnRight__Group__2__Impl )
            // InternalPlatoon.g:1404:2: rule__TurnRight__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2__Impl();

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
    // $ANTLR end "rule__TurnRight__Group__2"


    // $ANTLR start "rule__TurnRight__Group__2__Impl"
    // InternalPlatoon.g:1410:1: rule__TurnRight__Group__2__Impl : ( 'Right' ) ;
    public final void rule__TurnRight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1414:1: ( ( 'Right' ) )
            // InternalPlatoon.g:1415:1: ( 'Right' )
            {
            // InternalPlatoon.g:1415:1: ( 'Right' )
            // InternalPlatoon.g:1416:2: 'Right'
            {
             before(grammarAccess.getTurnRightAccess().getRightKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getRightKeyword_2()); 

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
    // $ANTLR end "rule__TurnRight__Group__2__Impl"


    // $ANTLR start "rule__Root__PlatoonAssignment_0"
    // InternalPlatoon.g:1426:1: rule__Root__PlatoonAssignment_0 : ( rulePlatoon ) ;
    public final void rule__Root__PlatoonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1430:1: ( ( rulePlatoon ) )
            // InternalPlatoon.g:1431:2: ( rulePlatoon )
            {
            // InternalPlatoon.g:1431:2: ( rulePlatoon )
            // InternalPlatoon.g:1432:3: rulePlatoon
            {
             before(grammarAccess.getRootAccess().getPlatoonPlatoonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlatoon();

            state._fsp--;

             after(grammarAccess.getRootAccess().getPlatoonPlatoonParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Root__PlatoonAssignment_0"


    // $ANTLR start "rule__Root__RouteAssignment_1"
    // InternalPlatoon.g:1441:1: rule__Root__RouteAssignment_1 : ( ruleRoute ) ;
    public final void rule__Root__RouteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1445:1: ( ( ruleRoute ) )
            // InternalPlatoon.g:1446:2: ( ruleRoute )
            {
            // InternalPlatoon.g:1446:2: ( ruleRoute )
            // InternalPlatoon.g:1447:3: ruleRoute
            {
             before(grammarAccess.getRootAccess().getRouteRouteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRootAccess().getRouteRouteParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__RouteAssignment_1"


    // $ANTLR start "rule__Root__ConstraintsAssignment_2"
    // InternalPlatoon.g:1456:1: rule__Root__ConstraintsAssignment_2 : ( ruleConstraints ) ;
    public final void rule__Root__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1460:1: ( ( ruleConstraints ) )
            // InternalPlatoon.g:1461:2: ( ruleConstraints )
            {
            // InternalPlatoon.g:1461:2: ( ruleConstraints )
            // InternalPlatoon.g:1462:3: ruleConstraints
            {
             before(grammarAccess.getRootAccess().getConstraintsConstraintsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getRootAccess().getConstraintsConstraintsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__ConstraintsAssignment_2"


    // $ANTLR start "rule__Platoon__LeaderVehicleAssignment_1"
    // InternalPlatoon.g:1471:1: rule__Platoon__LeaderVehicleAssignment_1 : ( ruleLeaderVehicle ) ;
    public final void rule__Platoon__LeaderVehicleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1475:1: ( ( ruleLeaderVehicle ) )
            // InternalPlatoon.g:1476:2: ( ruleLeaderVehicle )
            {
            // InternalPlatoon.g:1476:2: ( ruleLeaderVehicle )
            // InternalPlatoon.g:1477:3: ruleLeaderVehicle
            {
             before(grammarAccess.getPlatoonAccess().getLeaderVehicleLeaderVehicleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeaderVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getLeaderVehicleLeaderVehicleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Platoon__LeaderVehicleAssignment_1"


    // $ANTLR start "rule__Platoon__FollowingVehicleAssignment_2_0"
    // InternalPlatoon.g:1486:1: rule__Platoon__FollowingVehicleAssignment_2_0 : ( ruleFollowingVehicle ) ;
    public final void rule__Platoon__FollowingVehicleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1490:1: ( ( ruleFollowingVehicle ) )
            // InternalPlatoon.g:1491:2: ( ruleFollowingVehicle )
            {
            // InternalPlatoon.g:1491:2: ( ruleFollowingVehicle )
            // InternalPlatoon.g:1492:3: ruleFollowingVehicle
            {
             before(grammarAccess.getPlatoonAccess().getFollowingVehicleFollowingVehicleParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFollowingVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getFollowingVehicleFollowingVehicleParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Platoon__FollowingVehicleAssignment_2_0"


    // $ANTLR start "rule__Platoon__FollowingVehicleAssignment_2_1"
    // InternalPlatoon.g:1501:1: rule__Platoon__FollowingVehicleAssignment_2_1 : ( ruleFollowingVehicle ) ;
    public final void rule__Platoon__FollowingVehicleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1505:1: ( ( ruleFollowingVehicle ) )
            // InternalPlatoon.g:1506:2: ( ruleFollowingVehicle )
            {
            // InternalPlatoon.g:1506:2: ( ruleFollowingVehicle )
            // InternalPlatoon.g:1507:3: ruleFollowingVehicle
            {
             before(grammarAccess.getPlatoonAccess().getFollowingVehicleFollowingVehicleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFollowingVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getFollowingVehicleFollowingVehicleParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Platoon__FollowingVehicleAssignment_2_1"


    // $ANTLR start "rule__Route__NameAssignment_1"
    // InternalPlatoon.g:1516:1: rule__Route__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Route__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1520:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1521:2: ( ruleEString )
            {
            // InternalPlatoon.g:1521:2: ( ruleEString )
            // InternalPlatoon.g:1522:3: ruleEString
            {
             before(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Route__NameAssignment_1"


    // $ANTLR start "rule__Route__RouteCommandsAssignment_3"
    // InternalPlatoon.g:1531:1: rule__Route__RouteCommandsAssignment_3 : ( rulerouteCommand ) ;
    public final void rule__Route__RouteCommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1535:1: ( ( rulerouteCommand ) )
            // InternalPlatoon.g:1536:2: ( rulerouteCommand )
            {
            // InternalPlatoon.g:1536:2: ( rulerouteCommand )
            // InternalPlatoon.g:1537:3: rulerouteCommand
            {
             before(grammarAccess.getRouteAccess().getRouteCommandsRouteCommandParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulerouteCommand();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getRouteCommandsRouteCommandParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Route__RouteCommandsAssignment_3"


    // $ANTLR start "rule__Route__RouteCommandsAssignment_4"
    // InternalPlatoon.g:1546:1: rule__Route__RouteCommandsAssignment_4 : ( rulerouteCommand ) ;
    public final void rule__Route__RouteCommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1550:1: ( ( rulerouteCommand ) )
            // InternalPlatoon.g:1551:2: ( rulerouteCommand )
            {
            // InternalPlatoon.g:1551:2: ( rulerouteCommand )
            // InternalPlatoon.g:1552:3: rulerouteCommand
            {
             before(grammarAccess.getRouteAccess().getRouteCommandsRouteCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulerouteCommand();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getRouteCommandsRouteCommandParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Route__RouteCommandsAssignment_4"


    // $ANTLR start "rule__Constraints__LboundAssignment_1"
    // InternalPlatoon.g:1561:1: rule__Constraints__LboundAssignment_1 : ( ruleEInt ) ;
    public final void rule__Constraints__LboundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1565:1: ( ( ruleEInt ) )
            // InternalPlatoon.g:1566:2: ( ruleEInt )
            {
            // InternalPlatoon.g:1566:2: ( ruleEInt )
            // InternalPlatoon.g:1567:3: ruleEInt
            {
             before(grammarAccess.getConstraintsAccess().getLboundEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getLboundEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraints__LboundAssignment_1"


    // $ANTLR start "rule__Constraints__UboundAssignment_5"
    // InternalPlatoon.g:1576:1: rule__Constraints__UboundAssignment_5 : ( ruleEInt ) ;
    public final void rule__Constraints__UboundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1580:1: ( ( ruleEInt ) )
            // InternalPlatoon.g:1581:2: ( ruleEInt )
            {
            // InternalPlatoon.g:1581:2: ( ruleEInt )
            // InternalPlatoon.g:1582:3: ruleEInt
            {
             before(grammarAccess.getConstraintsAccess().getUboundEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getUboundEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Constraints__UboundAssignment_5"


    // $ANTLR start "rule__LeaderVehicle__NameAssignment_1"
    // InternalPlatoon.g:1591:1: rule__LeaderVehicle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LeaderVehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1595:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1596:2: ( ruleEString )
            {
            // InternalPlatoon.g:1596:2: ( ruleEString )
            // InternalPlatoon.g:1597:3: ruleEString
            {
             before(grammarAccess.getLeaderVehicleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeaderVehicleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LeaderVehicle__NameAssignment_1"


    // $ANTLR start "rule__LeaderVehicle__RouteAssignment_3"
    // InternalPlatoon.g:1606:1: rule__LeaderVehicle__RouteAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__LeaderVehicle__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1610:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1611:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1611:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1612:3: ( ruleEString )
            {
             before(grammarAccess.getLeaderVehicleAccess().getRouteRouteCrossReference_3_0()); 
            // InternalPlatoon.g:1613:3: ( ruleEString )
            // InternalPlatoon.g:1614:4: ruleEString
            {
             before(grammarAccess.getLeaderVehicleAccess().getRouteRouteEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeaderVehicleAccess().getRouteRouteEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLeaderVehicleAccess().getRouteRouteCrossReference_3_0()); 

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
    // $ANTLR end "rule__LeaderVehicle__RouteAssignment_3"


    // $ANTLR start "rule__FollowingVehicle__NameAssignment_1"
    // InternalPlatoon.g:1625:1: rule__FollowingVehicle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FollowingVehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1629:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1630:2: ( ruleEString )
            {
            // InternalPlatoon.g:1630:2: ( ruleEString )
            // InternalPlatoon.g:1631:3: ruleEString
            {
             before(grammarAccess.getFollowingVehicleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowingVehicleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FollowingVehicle__NameAssignment_1"


    // $ANTLR start "rule__FollowingVehicle__FollowingAssignment_4"
    // InternalPlatoon.g:1640:1: rule__FollowingVehicle__FollowingAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__FollowingVehicle__FollowingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1644:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1645:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1645:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1646:3: ( ruleEString )
            {
             before(grammarAccess.getFollowingVehicleAccess().getFollowingVehicleCrossReference_4_0()); 
            // InternalPlatoon.g:1647:3: ( ruleEString )
            // InternalPlatoon.g:1648:4: ruleEString
            {
             before(grammarAccess.getFollowingVehicleAccess().getFollowingVehicleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowingVehicleAccess().getFollowingVehicleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFollowingVehicleAccess().getFollowingVehicleCrossReference_4_0()); 

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
    // $ANTLR end "rule__FollowingVehicle__FollowingAssignment_4"


    // $ANTLR start "rule__Forward__DistanceAssignment_2"
    // InternalPlatoon.g:1659:1: rule__Forward__DistanceAssignment_2 : ( ruleEInt ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1663:1: ( ( ruleEInt ) )
            // InternalPlatoon.g:1664:2: ( ruleEInt )
            {
            // InternalPlatoon.g:1664:2: ( ruleEInt )
            // InternalPlatoon.g:1665:3: ruleEInt
            {
             before(grammarAccess.getForwardAccess().getDistanceEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForwardAccess().getDistanceEIntParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Forward__DistanceAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}