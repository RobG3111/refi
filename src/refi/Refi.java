package refi;

import java.util.*;
import java.util.regex.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import refi.RefiParser.*;

public class Refi implements RefiParserListener
{
    private StringBuilder builder = new StringBuilder();
    private String suffix;
    
    private static ThrowingErrorListener throwingErrorListener = new ThrowingErrorListener(); 
    
    
    public static void main(String[] args)
    {
        Refi refi = new Refi();
        Pattern pattern = Pattern.compile(refi.translate("capture{`a`, `zzz`}"));
        String text = "a";
        Matcher matcher = pattern.matcher(text); 
        System.out.println("Matches " + text + " " + matcher.matches());
    }

    
    public Refi()
    {
        
    }
    
    public String translate(String input)
    {
        builder.setLength(0);
        System.out.println(input);
        RefiLexer refiLexer = new RefiLexer(CharStreams.fromString(input));
        refiLexer.removeErrorListeners();
        refiLexer.addErrorListener(throwingErrorListener);
        RefiParser refiParser = new RefiParser(new CommonTokenStream(refiLexer));
        refiParser.removeErrorListeners();
        refiParser.addErrorListener(throwingErrorListener);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, refiParser.expression());
        System.out.println(builder);
        return builder.toString();
    }
    
    
    private void emit(String s)
    {
        builder.append(s);
    }

    
    @Override
    public void exitBacktick(BacktickContext ctx)
    {
        emit("`");
    }
    
    @Override
    public void exitBol(BolContext ctx)
    {
        emit("^");
    }
    
    
    @Override
    public void exitEol(EolContext ctx)
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
        if (arg0.getText().equals("|"))
            emit("|");
    }

    @Override
    public void enterExpression(ExpressionContext ctx)
    {
    }

    @Override
    public void exitExpression(ExpressionContext ctx)
    {
    }

    @Override
    public void enterMatcher(MatcherContext ctx)
    {
    }

    @Override
    public void exitMatcher(MatcherContext ctx)
    {
    }

    @Override
    public void enterFunction_matcher(Function_matcherContext ctx)
    {
    }
    
    private String fixString(String from)
    {
        return from.replace("`", "").replace("\\", "\\\\");
    }

    @Override
    public void exitFunction_matcher(Function_matcherContext context)
    {
        ParseTree child = context.getChild(0);
        suffix = "";
        String name = child.getText().toLowerCase();
        String str = fixString(context.str.getText());
        switch (name)
        {
            case "any":
                suffix = "*";
                break;  
                
            case "optional":
                suffix = "?";
                break;
                    
            case "some":
                suffix = "+";
                break;
        
            default:
                throw new IllegalArgumentException("Unexpected matcher name: " + name);
        }

        if (str.length() > 1)
        {
            emit("(");
            emit(str);
            emit(")");
            
        }
        else
            emit(str);
            
        
        emit(suffix);
    }

    @Override
    public void enterMatcher_name(Matcher_nameContext ctx)
    {
        
    }

    @Override
    public void enterBacktick(BacktickContext ctx)
    {
    }

    @Override
    public void enterBol(BolContext ctx)
    {
    }

    @Override
    public void enterEol(EolContext ctx)
    {
    }

    @Override
    public void enterWild(WildContext ctx)
    {
    }

    @Override
    public void exitWild(WildContext ctx)
    {
        emit(".");
    }
    

    @Override
    public void enterExpr_param_matcher(Expr_param_matcherContext ctx)
    {
    }

    @Override
    public void exitExpr_param_matcher(Expr_param_matcherContext context)
    {
        ParseTree child = context.getChild(0);
        suffix = "";
        String name = child.getText().toLowerCase();
        switch (name)
        {
            case "any":
                suffix = "*";
                break;  
                
            case "optional":
                suffix = "?";
                break;
                    
            case "some":
                suffix = "+";
                break;
        
            default:
                throw new IllegalArgumentException("Unexpected matcher name: " + name);
        }

        emit(suffix);
    }

    @Override
    public void enterLiteral_matcher(Literal_matcherContext ctx)
    {
    }


    @Override
    public void exitLiteral_matcher(Literal_matcherContext ctx)
    {
    }


    @Override
    public void enterAnywild(AnywildContext ctx)
    {
    }


    @Override
    public void exitAnywild(AnywildContext ctx)
    {
        emit(".*");
    }


    @Override
    public void enterRange_matcher(Range_matcherContext ctx)
    {
    }


    @Override
    public void exitRange_matcher(Range_matcherContext ctx)
    {
        emit("[");
        boolean first = true;
        for (TerminalNode terminalNode : ctx.CHAR())
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
    public void enterDigit(DigitContext ctx)
    {
    }


    @Override
    public void exitDigit(DigitContext ctx)
    {
        emit("\\d");
    }


    @Override
    public void enterTab(TabContext ctx)
    {
    }


    @Override
    public void exitTab(TabContext ctx)
    {
        emit("\\t");
    }


    @Override
    public void enterOctal_matcher(Octal_matcherContext ctx)
    {
    }


    @Override
    public void exitOctal_matcher(Octal_matcherContext ctx)
    {
        emit("\\\\O");
        emit(ctx.getChild(2).getText());
    }

    @Override
    public void enterNewline(NewlineContext ctx)
    {
    }


    @Override
    public void exitNewline(NewlineContext ctx)
    {
        emit("\\n");
    }


    @Override
    public void enterFormfeed(FormfeedContext ctx)
    {
    }


    @Override
    public void exitFormfeed(FormfeedContext ctx)
    {
        emit("\\f");
    }


    @Override
    public void enterReturn(ReturnContext ctx)
    {
    }


    @Override
    public void exitReturn(ReturnContext ctx)
    {
        emit("\\r");
    }


    @Override
    public void enterBell(BellContext ctx)
    {
    }


    @Override
    public void exitBell(BellContext ctx)
    {
        emit("\\a");
    }


    @Override
    public void enterEscape(EscapeContext ctx)
    {
    }


    @Override
    public void exitEscape(EscapeContext ctx)
    {
        emit("\\e");
    }


    @Override
    public void enterCtrl_matcher(Ctrl_matcherContext ctx)
    {
    }


    @Override
    public void exitCtrl_matcher(Ctrl_matcherContext ctx)
    {
        emit("\\c");
        emit(ctx.getChild(2).getText());
        
    }


    @Override
    public void enterEither_matcher(Either_matcherContext ctx)
    {
    }


    @Override
    public void exitEither_matcher(Either_matcherContext ctx)
    {
        emit("[");
        for (TerminalNode terminalNode : ctx.CHAR())
            emit(fixString(terminalNode.getText()));
        
        emit("]");      
    }

    @Override
    public void enterChar(CharContext ctx)
    {
    }


    @Override
    public void exitChar(CharContext ctx)
    {
        emit(fixString(ctx.getText()));
    }


    @Override
    public void enterString(StringContext ctx)
    {
    }


    @Override
    public void exitString(StringContext ctx)
    {
        emit(fixString(ctx.getText()));
    }


    @Override
    public void enterNot_matcher(Not_matcherContext ctx)
    {
    }


    @Override
    public void exitNot_matcher(Not_matcherContext ctx)
    {
        emit("[^");
        for (TerminalNode terminalNode : ctx.CHAR())
            emit(fixString(terminalNode.getText()));
        
        emit("]");          }


    @Override
    public void enterHex_matcher(Hex_matcherContext ctx)
    {
    }


    @Override
    public void exitHex_matcher(Hex_matcherContext ctx)
    {
        emit("\\x");
        String hexNumber = ctx.number.getText().substring(2);
        if (hexNumber.length() == 1)
            emit("0");
        
        emit(hexNumber);
    }


    @Override
    public void enterOr_matcher(Or_matcherContext ctx)
    {
       //emit("(");    
    }


    @Override
    public void exitOr_matcher(Or_matcherContext ctx)
    {

        //emit(")");
    }

    public void enterCapture_matcher(Capture_matcherContext ctx)
    {
        
        emit("(");
        if (ctx.name != null)
        {
            String name = ctx.name.getText();
            if (name.length() > 0)
            {
                emit("?<");
                emit(fixString(name));
                emit(">");
            }
        }
        
    }
    

    public void exitCapture_matcher(Capture_matcherContext ctx)
    {
        emit(")");
    }
    
    @Override
    public void enterBacketed_matcher(Backeted_matcherContext ctx)
    {
        emit("(");
    }


    @Override
    public void exitBacketed_matcher(Backeted_matcherContext ctx)
    {
        emit(")");
    }


    @Override
    public void enterNondigit(NondigitContext ctx)
    {
    }


    @Override
    public void exitNondigit(NondigitContext ctx)
    {
        emit("\\D");
    }


    @Override
    public void enterWordboundary(WordboundaryContext ctx)
    {
    }


    @Override
    public void exitWordboundary(WordboundaryContext ctx)
    {
        emit("\\b");
    }


    @Override
    public void enterCaseins(CaseinsContext ctx)
    {
    }


    @Override
    public void exitCaseins(CaseinsContext ctx)
    {
        emit("(?i)");
    }


    @Override
    public void enterUnicodecase(UnicodecaseContext ctx)
    {
    }


    @Override
    public void exitUnicodecase(UnicodecaseContext ctx)
    {
    }


    @Override
    public void enterUnixlines(UnixlinesContext ctx)
    {
    }


    @Override
    public void exitUnixlines(UnixlinesContext ctx)
    {
    }


    @Override
    public void enterFlags(FlagsContext ctx)
    {
    }


    @Override
    public void exitFlags(FlagsContext ctx)
    {
        List<String> offRules = new ArrayList<>();
        emit("(?");
        List<FlagnameContext> allNames = new ArrayList<>(ctx.names);
        allNames.add(0, ctx.name1);
        for (FlagnameContext flagnameContext : allNames)
        {
            String flagName = flagnameContext.getText().toLowerCase();
            if (flagName.toLowerCase().endsWith("off"))
                offRules.add(flagName);
            else
                flagNameToRegExFlag(flagName);
        }
        
        if ( ! offRules.isEmpty())
        {
            emit("-");
            for (String flagName : offRules)
                flagNameToRegExFlag(flagName.replace("off", ""));
        }
        emit(")");
    }
    
    private void flagNameToRegExFlag(String flagName)
    {
        switch(flagName)
        {
            case "caseins":
                emit("i");
                break;
                
        }
    }


    @Override
    public void enterFlagname(FlagnameContext ctx)
    {
    }


    @Override
    public void exitFlagname(FlagnameContext ctx)
    {
    }


    @Override
    public void enterCaseinsoff(CaseinsoffContext ctx)
    {
    }


    @Override
    public void exitCaseinsoff(CaseinsoffContext ctx)
    {
    }

}
