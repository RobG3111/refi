package refi;

import java.util.*;
import java.util.regex.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import refi.RefiParser.*;

public class Refi implements RefiParserListener
{
    private StringBuilder builder = new StringBuilder();
    
    private static ThrowingErrorListener throwingErrorListener = new ThrowingErrorListener(); 
    
    private int flags = 0;

    private boolean emitClosingBracket;

    private int bracketCount;
    
    
    public static void main(String[] args)
    {
        Refi refi = new Refi();
        Pattern pattern = Pattern.compile(refi.toRegEx("capture{`a`, `zzz`}"));
        String text = "a";
        Matcher matcher = pattern.matcher(text); 
        System.out.println("Matches " + text + " " + matcher.matches());
    }

    
    public Refi()
    {
        
    }
    
    public String toRegEx(String refiExpression)
    {
        builder.setLength(0);
        RefiLexer refiLexer = new RefiLexer(CharStreams.fromString(refiExpression));
        refiLexer.removeErrorListeners();
        refiLexer.addErrorListener(throwingErrorListener);
        RefiParser refiParser = new RefiParser(new CommonTokenStream(refiLexer));
        refiParser.removeErrorListeners();
        refiParser.addErrorListener(throwingErrorListener);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, refiParser.expression());
        return builder.toString();
    }
    
    public Pattern toPattern(String refiExpression)
    {
        return Pattern.compile(toRegEx(refiExpression), flags);
    }
    
    public int getFlags()
    {
        return flags;
    }
    
    
    private void emit(String s)
    {
        builder.append(s);
    }

    
    @Override
    public void exitBacktick(BacktickContext context)
    {
        emit("`");
    }
    
    @Override
    public void exitBol(BolContext context)
    {
        emit("^");
    }
    
    
    @Override
    public void exitEol(EolContext context)
    {
        emit("$");
    }
    
    @Override
    public void exitMatcher_name(Matcher_nameContext context)
    {

    }

    @Override
    public void enterEveryRule(ParserRuleContext arg0)
    {
    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0)
    {
    }

    @Override
    public void visitErrorNode(ErrorNode arg0)
    {
    }

    @Override
    public void visitTerminal(TerminalNode arg0)
    {
        String terminal = arg0.getText();
        switch (terminal)
        {
            case "|":
                emit("|");
                break;
                
            case "(":
                if (emitClosingBracket)
                    ++bracketCount;
                break;
                
            case ")":
                if (emitClosingBracket)
                {
                    --bracketCount;
                    if (bracketCount == 0)
                        emit(")");
                }
        }
    }

    @Override
    public void enterExpression(ExpressionContext context)
    {
    }

    @Override
    public void exitExpression(ExpressionContext context)
    {
    }

    @Override
    public void enterMatcher(MatcherContext context)
    {
    }

    @Override
    public void exitMatcher(MatcherContext context)
    {
    }

    
    private String fixString(String from)
    {
        return from.replace("`", "").replace("\\", "\\\\");
    }



    @Override
    public void enterMatcher_name(Matcher_nameContext context)
    {
        
    }

    @Override
    public void enterBacktick(BacktickContext context)
    {
    }

    @Override
    public void enterBol(BolContext context)
    {
    }

    @Override
    public void enterEol(EolContext context)
    {
    }

    @Override
    public void enterWild(WildContext context)
    {
    }

    @Override
    public void exitWild(WildContext context)
    {
        emit(".");
    }
    

    @Override
    public void enterExpr_param_matcher(Expr_param_matcherContext context)
    {
    }

    @Override
    public void exitExpr_param_matcher(Expr_param_matcherContext context)
    {
        ParseTree child = context.getChild(0);
        String name = child.getText().toLowerCase();

        switch (name)
        {
            case "any":
                emit("*");
                break;  
                
            case "optional":
                emit("?");
                break;
                    
            case "some":
                emit("+");
                break;
        
            default:
                throw new IllegalArgumentException("Unexpected matcher name: " + name);
        }

        if (context.matchType != null)
        {
            switch(context.matchType.getText())
            {
                case "reluct":
                    emit("?");
                    break;
                    
                case "posses":
                    emit("+");
                    break;
            }
        }
    }

    @Override
    public void enterLiteral_matcher(Literal_matcherContext context)
    {
    }


    @Override
    public void exitLiteral_matcher(Literal_matcherContext context)
    {
    }


    @Override
    public void enterAnywild(AnywildContext context)
    {
    }


    @Override
    public void exitAnywild(AnywildContext context)
    {
        emit(".*");
    }


    @Override
    public void enterRange_matcher(Range_matcherContext context)
    {
    }


    @Override
    public void exitRange_matcher(Range_matcherContext context)
    {
        emit("[");
        boolean first = true;
        for (TerminalNode terminalNode : context.CHAR())
        {
            emit(fixString(terminalNode.getText()));
            if (first)
            {
                emit("-");
            }
            first = ! first;
        }
        emit("]");
    }

    @Override
    public void enterDigit(DigitContext context)
    {
    }


    @Override
    public void exitDigit(DigitContext context)
    {
        emit("\\d");
    }


    @Override
    public void enterTab(TabContext context)
    {
    }


    @Override
    public void exitTab(TabContext context)
    {
        emit("\\t");
    }


    @Override
    public void enterOctal_matcher(Octal_matcherContext context)
    {
    }


    @Override
    public void exitOctal_matcher(Octal_matcherContext context)
    {
        emit("\\\\O");
        emit(context.getChild(2).getText());
    }

    @Override
    public void enterNewline(NewlineContext context)
    {
    }


    @Override
    public void exitNewline(NewlineContext context)
    {
        emit("\\n");
    }


    @Override
    public void enterFormfeed(FormfeedContext context)
    {
    }


    @Override
    public void exitFormfeed(FormfeedContext context)
    {
        emit("\\f");
    }


    @Override
    public void enterReturn(ReturnContext context)
    {
    }


    @Override
    public void exitReturn(ReturnContext context)
    {
        emit("\\r");
    }


    @Override
    public void enterBell(BellContext context)
    {
    }


    @Override
    public void exitBell(BellContext context)
    {
        emit("\\a");
    }


    @Override
    public void enterEscape(EscapeContext context)
    {
    }


    @Override
    public void exitEscape(EscapeContext context)
    {
        emit("\\e");
    }


    @Override
    public void enterCtrl_matcher(Ctrl_matcherContext context)
    {
    }


    @Override
    public void exitCtrl_matcher(Ctrl_matcherContext context)
    {
        emit("\\c");
        emit(context.getChild(2).getText());
        
    }


    @Override
    public void enterEither_matcher(Either_matcherContext context)
    {
    }


    @Override
    public void exitEither_matcher(Either_matcherContext context)
    {
        emit("[");
        for (TerminalNode terminalNode : context.CHAR())
            emit(fixString(terminalNode.getText()));
        
        emit("]");      
    }

    @Override
    public void enterChar(CharContext context)
    {
    }


    @Override
    public void exitChar(CharContext context)
    {
        emit(fixString(context.getText()));
    }


    @Override
    public void enterString(StringContext context)
    {
    }


    @Override
    public void exitString(StringContext context)
    {
        emit(fixString(context.getText()));
    }


    @Override
    public void enterNot_matcher(Not_matcherContext context)
    {
    }


    @Override
    public void exitNot_matcher(Not_matcherContext context)
    {
        emit("[^");
        for (TerminalNode terminalNode : context.CHAR())
            emit(fixString(terminalNode.getText()));
        
        emit("]");          }


    @Override
    public void enterHex_matcher(Hex_matcherContext context)
    {
    }


    @Override
    public void exitHex_matcher(Hex_matcherContext context)
    {
        emit("\\x");
        String hexNumber = context.number.getText().substring(2);
        if (hexNumber.length() == 1)
            emit("0");
        
        emit(hexNumber);
    }


    @Override
    public void enterOr_matcher(Or_matcherContext context)
    {
       //emit("(");    
    }


    @Override
    public void exitOr_matcher(Or_matcherContext context)
    {

        //emit(")");
    }

    public void enterCapture_matcher(Capture_matcherContext context)
    {
        
        emit("(");
        if (context.name != null)
        {
            String name = context.name.getText();
            if (name.length() > 0)
            {
                emit("?<");
                emit(fixString(name));
                emit(">");
            }
        }
        
    }
    

    public void exitCapture_matcher(Capture_matcherContext context)
    {
        emit(")");
    }
    
    @Override
    public void enterBacketed_matcher(Backeted_matcherContext context)
    {
        emit("(");
    }


    @Override
    public void exitBacketed_matcher(Backeted_matcherContext context)
    {
        emit(")");
    }


    @Override
    public void enterNondigit(NondigitContext context)
    {
    }


    @Override
    public void exitNondigit(NondigitContext context)
    {
        emit("\\D");
    }


    @Override
    public void enterWordboundary(WordboundaryContext context)
    {
    }


    @Override
    public void exitWordboundary(WordboundaryContext context)
    {
        emit("\\b");
    }


    @Override
    public void enterCaseins(CaseinsContext context)
    {
    }


    @Override
    public void exitCaseins(CaseinsContext context)
    {
        emit("(?i)");
    }


    @Override
    public void enterUnicodecase(UnicodecaseContext context)
    {
    }


    @Override
    public void exitUnicodecase(UnicodecaseContext context)
    {
    }


    @Override
    public void enterUnixlines(UnixlinesContext context)
    {
    }


    @Override
    public void exitUnixlines(UnixlinesContext context)
    {
        flagNameToRegExFlag("unixlines",true);
    }


    @Override
    public void enterFlags(FlagsContext context)
    {
    }


    @Override
    public void exitFlags(FlagsContext context)
    {
        List<String> offRules = new ArrayList<>();
        emit("(?");
        for (FlagnameContext flagnameContext : context.names)
        {
            String flagName = flagnameContext.getText().toLowerCase();
            if (flagName.toLowerCase().endsWith("off"))
                offRules.add(flagName);
            else
                flagNameToRegExFlag(flagName, true);
        }
        
        if ( ! offRules.isEmpty())
        {
            emit("-");
            for (String flagName : offRules)
                flagNameToRegExFlag(flagName.replace("off", ""), false);
        }
        emit(")");
    }
    
    private void flagNameToRegExFlag(String flagName, boolean on)
    {
        switch(flagName)
        {
            case "caseins":
                emit("i");
                break;

            case "unicodecase":
                changeFlag(Pattern.UNICODE_CASE, on);
                break;
                
            case "unixlines":
                changeFlag(Pattern.UNIX_LINES, on);
                break;
        }
    }
    
    private void changeFlag(int flag, boolean on)
    {
        if (on)
            flags |= flag;
        else
            flags = flags & ( ~ flag);
    }


    @Override
    public void enterFlagname(FlagnameContext context)
    {
    }


    @Override
    public void exitFlagname(FlagnameContext context)
    {
    }


    @Override
    public void enterCaseinsoff(CaseinsoffContext context)
    {
    }


    @Override
    public void exitCaseinsoff(CaseinsoffContext context)
    {
    }


    @Override
    public void enterUnicodecaseoff(UnicodecaseoffContext context)
    {
    }


    @Override
    public void exitUnicodecaseoff(UnicodecaseoffContext context)
    {
    }


    @Override
    public void enterUnixlinesoff(UnixlinesoffContext context)
    {
    }


    @Override
    public void exitUnixlinesoff(UnixlinesoffContext context)
    {
    }


    @Override
    public void enterGreek(GreekContext ctx)
    {
    }


    @Override
    public void exitGreek(GreekContext ctx)
    {
        emit("\\p{InGreek}");
    }


    @Override
    public void enterLatin(LatinContext ctx)
    {
    }


    @Override
    public void exitLatin(LatinContext ctx)
    {
        emit("\\p{IsLatin}");
    }


    @Override
    public void enterAlphabetic(AlphabeticContext ctx)
    {
    }


    @Override
    public void exitAlphabetic(AlphabeticContext ctx)
    {
        emit("\\p{IsAlphabetic}");
    }


    @Override
    public void enterCurrency(CurrencyContext ctx)
    {
    }


    @Override
    public void exitCurrency(CurrencyContext ctx)
    {
        emit("\\p{Sc}");
    }


    @Override
    public void enterUpper(UpperContext ctx)
    {
    }


    @Override
    public void exitUpper(UpperContext ctx)
    {
        emit("\\p{Upper}");
    }


    @Override
    public void enterMatch_type(Match_typeContext ctx)
    {
    }


    @Override
    public void exitMatch_type(Match_typeContext ctx)
    {
    }


    @Override
    public void enterExactly(ExactlyContext ctx)
    {
    }


    @Override
    public void exitExactly(ExactlyContext ctx)
    {
        emit("{");
        emit(ctx.count.getText());
        emit("}");    
    }


    @Override
    public void enterAtleast(AtleastContext ctx)
    {
    }


    @Override
    public void exitAtleast(AtleastContext ctx)
    {
        emit("{");
        emit(ctx.count.getText());
        emit(",}");    
    }


    @Override
    public void enterBetween(BetweenContext ctx)
    {
    }


    @Override
    public void exitBetween(BetweenContext ctx)
    {
        emit("{");
        emit(ctx.from.getText());
        emit(",");
        emit(ctx.to.getText());
        emit("}");         
    }


    @Override
    public void enterFlagged(FlaggedContext context)
    {
        List<String> offRules = new ArrayList<>();
        emit("(?");
        for (FlagnameContext flagnameContext : context.names)
        {
            String flagName = flagnameContext.getText().toLowerCase();
            if (flagName.toLowerCase().endsWith("off"))
                offRules.add(flagName);
            else
                flagNameToRegExFlag(flagName, true);
        }
        
        if ( ! offRules.isEmpty())
        {
            emit("-");
            for (String flagName : offRules)
                flagNameToRegExFlag(flagName.replace("off", ""), false);
        }
        emit(":");    
        emitClosingBracket = true;
        bracketCount = 1;
    }


    @Override
    public void exitFlagged(FlaggedContext context)
    {
        if (bracketCount == 1)
            emit(")");
        emitClosingBracket = false;
    }


    @Override
    public void enterSomespace(SomespaceContext ctx)
    {
    }


    @Override
    public void exitSomespace(SomespaceContext ctx)
    {
        emit("\\p{Space}+");
    }


    @Override
    public void enterUnion(UnionContext ctx)
    {
    }


    @Override
    public void exitUnion(UnionContext context)
    {
        emit("[");
        boolean first = true;
        int count = 0;
        for (TerminalNode terminalNode : context.CHAR())
        {
            emit(fixString(terminalNode.getText()));
            if (first)
            {
                emit("-");
            }
            first = ! first;
            ++count;
            if (count == 2)
                emit("[");
            else
                if (count == 4)
                    emit("]");
        }
        emit("]");
    }


    @Override
    public void enterLower(LowerContext ctx)
    {
    }


    @Override
    public void exitLower(LowerContext ctx)
    {
        emit("\\p{Lower}");
    }
}
