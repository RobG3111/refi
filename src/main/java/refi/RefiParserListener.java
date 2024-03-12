// Generated from C:/Users/robg3/workspace/refi/src/refi/RefiParser.g4 by ANTLR 4.13.1

package refi;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RefiParser}.
 */
public interface RefiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RefiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RefiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RefiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#backeted_matcher}.
	 * @param ctx the parse tree
	 */
	void enterBacketed_matcher(RefiParser.Backeted_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#backeted_matcher}.
	 * @param ctx the parse tree
	 */
	void exitBacketed_matcher(RefiParser.Backeted_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#matcher}.
	 * @param ctx the parse tree
	 */
	void enterMatcher(RefiParser.MatcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#matcher}.
	 * @param ctx the parse tree
	 */
	void exitMatcher(RefiParser.MatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#literal_matcher}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_matcher(RefiParser.Literal_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#literal_matcher}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_matcher(RefiParser.Literal_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#atleast}.
	 * @param ctx the parse tree
	 */
	void enterAtleast(RefiParser.AtleastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#atleast}.
	 * @param ctx the parse tree
	 */
	void exitAtleast(RefiParser.AtleastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(RefiParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(RefiParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#capture_matcher}.
	 * @param ctx the parse tree
	 */
	void enterCapture_matcher(RefiParser.Capture_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#capture_matcher}.
	 * @param ctx the parse tree
	 */
	void exitCapture_matcher(RefiParser.Capture_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#caseins}.
	 * @param ctx the parse tree
	 */
	void enterCaseins(RefiParser.CaseinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#caseins}.
	 * @param ctx the parse tree
	 */
	void exitCaseins(RefiParser.CaseinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#caseinsoff}.
	 * @param ctx the parse tree
	 */
	void enterCaseinsoff(RefiParser.CaseinsoffContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#caseinsoff}.
	 * @param ctx the parse tree
	 */
	void exitCaseinsoff(RefiParser.CaseinsoffContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#char}.
	 * @param ctx the parse tree
	 */
	void enterChar(RefiParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#char}.
	 * @param ctx the parse tree
	 */
	void exitChar(RefiParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#ctrl_matcher}.
	 * @param ctx the parse tree
	 */
	void enterCtrl_matcher(RefiParser.Ctrl_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#ctrl_matcher}.
	 * @param ctx the parse tree
	 */
	void exitCtrl_matcher(RefiParser.Ctrl_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#either_matcher}.
	 * @param ctx the parse tree
	 */
	void enterEither_matcher(RefiParser.Either_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#either_matcher}.
	 * @param ctx the parse tree
	 */
	void exitEither_matcher(RefiParser.Either_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#expr_param_matcher}.
	 * @param ctx the parse tree
	 */
	void enterExpr_param_matcher(RefiParser.Expr_param_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#expr_param_matcher}.
	 * @param ctx the parse tree
	 */
	void exitExpr_param_matcher(RefiParser.Expr_param_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#exactly}.
	 * @param ctx the parse tree
	 */
	void enterExactly(RefiParser.ExactlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#exactly}.
	 * @param ctx the parse tree
	 */
	void exitExactly(RefiParser.ExactlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#flagged}.
	 * @param ctx the parse tree
	 */
	void enterFlagged(RefiParser.FlaggedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#flagged}.
	 * @param ctx the parse tree
	 */
	void exitFlagged(RefiParser.FlaggedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#flags}.
	 * @param ctx the parse tree
	 */
	void enterFlags(RefiParser.FlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#flags}.
	 * @param ctx the parse tree
	 */
	void exitFlags(RefiParser.FlagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#greek}.
	 * @param ctx the parse tree
	 */
	void enterGreek(RefiParser.GreekContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#greek}.
	 * @param ctx the parse tree
	 */
	void exitGreek(RefiParser.GreekContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#hex_matcher}.
	 * @param ctx the parse tree
	 */
	void enterHex_matcher(RefiParser.Hex_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#hex_matcher}.
	 * @param ctx the parse tree
	 */
	void exitHex_matcher(RefiParser.Hex_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#nondigit}.
	 * @param ctx the parse tree
	 */
	void enterNondigit(RefiParser.NondigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#nondigit}.
	 * @param ctx the parse tree
	 */
	void exitNondigit(RefiParser.NondigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#not_matcher}.
	 * @param ctx the parse tree
	 */
	void enterNot_matcher(RefiParser.Not_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#not_matcher}.
	 * @param ctx the parse tree
	 */
	void exitNot_matcher(RefiParser.Not_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#octal_matcher}.
	 * @param ctx the parse tree
	 */
	void enterOctal_matcher(RefiParser.Octal_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#octal_matcher}.
	 * @param ctx the parse tree
	 */
	void exitOctal_matcher(RefiParser.Octal_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#or_matcher}.
	 * @param ctx the parse tree
	 */
	void enterOr_matcher(RefiParser.Or_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#or_matcher}.
	 * @param ctx the parse tree
	 */
	void exitOr_matcher(RefiParser.Or_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#range_matcher}.
	 * @param ctx the parse tree
	 */
	void enterRange_matcher(RefiParser.Range_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#range_matcher}.
	 * @param ctx the parse tree
	 */
	void exitRange_matcher(RefiParser.Range_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(RefiParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(RefiParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(RefiParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(RefiParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#matcher_name}.
	 * @param ctx the parse tree
	 */
	void enterMatcher_name(RefiParser.Matcher_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#matcher_name}.
	 * @param ctx the parse tree
	 */
	void exitMatcher_name(RefiParser.Matcher_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#match_type}.
	 * @param ctx the parse tree
	 */
	void enterMatch_type(RefiParser.Match_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#match_type}.
	 * @param ctx the parse tree
	 */
	void exitMatch_type(RefiParser.Match_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#alphabetic}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetic(RefiParser.AlphabeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#alphabetic}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetic(RefiParser.AlphabeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#anywild}.
	 * @param ctx the parse tree
	 */
	void enterAnywild(RefiParser.AnywildContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#anywild}.
	 * @param ctx the parse tree
	 */
	void exitAnywild(RefiParser.AnywildContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#backtick}.
	 * @param ctx the parse tree
	 */
	void enterBacktick(RefiParser.BacktickContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#backtick}.
	 * @param ctx the parse tree
	 */
	void exitBacktick(RefiParser.BacktickContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#bell}.
	 * @param ctx the parse tree
	 */
	void enterBell(RefiParser.BellContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#bell}.
	 * @param ctx the parse tree
	 */
	void exitBell(RefiParser.BellContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#bol}.
	 * @param ctx the parse tree
	 */
	void enterBol(RefiParser.BolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#bol}.
	 * @param ctx the parse tree
	 */
	void exitBol(RefiParser.BolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#currency}.
	 * @param ctx the parse tree
	 */
	void enterCurrency(RefiParser.CurrencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#currency}.
	 * @param ctx the parse tree
	 */
	void exitCurrency(RefiParser.CurrencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(RefiParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(RefiParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#escape}.
	 * @param ctx the parse tree
	 */
	void enterEscape(RefiParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#escape}.
	 * @param ctx the parse tree
	 */
	void exitEscape(RefiParser.EscapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(RefiParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(RefiParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#flagname}.
	 * @param ctx the parse tree
	 */
	void enterFlagname(RefiParser.FlagnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#flagname}.
	 * @param ctx the parse tree
	 */
	void exitFlagname(RefiParser.FlagnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#formfeed}.
	 * @param ctx the parse tree
	 */
	void enterFormfeed(RefiParser.FormfeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#formfeed}.
	 * @param ctx the parse tree
	 */
	void exitFormfeed(RefiParser.FormfeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#latin}.
	 * @param ctx the parse tree
	 */
	void enterLatin(RefiParser.LatinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#latin}.
	 * @param ctx the parse tree
	 */
	void exitLatin(RefiParser.LatinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#lower}.
	 * @param ctx the parse tree
	 */
	void enterLower(RefiParser.LowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#lower}.
	 * @param ctx the parse tree
	 */
	void exitLower(RefiParser.LowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(RefiParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(RefiParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(RefiParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(RefiParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#somespace}.
	 * @param ctx the parse tree
	 */
	void enterSomespace(RefiParser.SomespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#somespace}.
	 * @param ctx the parse tree
	 */
	void exitSomespace(RefiParser.SomespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(RefiParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(RefiParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#unicodecase}.
	 * @param ctx the parse tree
	 */
	void enterUnicodecase(RefiParser.UnicodecaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#unicodecase}.
	 * @param ctx the parse tree
	 */
	void exitUnicodecase(RefiParser.UnicodecaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#unicodecaseoff}.
	 * @param ctx the parse tree
	 */
	void enterUnicodecaseoff(RefiParser.UnicodecaseoffContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#unicodecaseoff}.
	 * @param ctx the parse tree
	 */
	void exitUnicodecaseoff(RefiParser.UnicodecaseoffContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#unixlines}.
	 * @param ctx the parse tree
	 */
	void enterUnixlines(RefiParser.UnixlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#unixlines}.
	 * @param ctx the parse tree
	 */
	void exitUnixlines(RefiParser.UnixlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#unixlinesoff}.
	 * @param ctx the parse tree
	 */
	void enterUnixlinesoff(RefiParser.UnixlinesoffContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#unixlinesoff}.
	 * @param ctx the parse tree
	 */
	void exitUnixlinesoff(RefiParser.UnixlinesoffContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#upper}.
	 * @param ctx the parse tree
	 */
	void enterUpper(RefiParser.UpperContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#upper}.
	 * @param ctx the parse tree
	 */
	void exitUpper(RefiParser.UpperContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#wild}.
	 * @param ctx the parse tree
	 */
	void enterWild(RefiParser.WildContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#wild}.
	 * @param ctx the parse tree
	 */
	void exitWild(RefiParser.WildContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefiParser#wordboundary}.
	 * @param ctx the parse tree
	 */
	void enterWordboundary(RefiParser.WordboundaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefiParser#wordboundary}.
	 * @param ctx the parse tree
	 */
	void exitWordboundary(RefiParser.WordboundaryContext ctx);
}