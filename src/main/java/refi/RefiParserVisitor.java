// Generated from C:/Users/robg3/workspace/refi/src/refi/RefiParser.g4 by ANTLR 4.13.1

package refi;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RefiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RefiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RefiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RefiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#backeted_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacketed_matcher(RefiParser.Backeted_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatcher(RefiParser.MatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#literal_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_matcher(RefiParser.Literal_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#atleast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtleast(RefiParser.AtleastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(RefiParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#capture_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_matcher(RefiParser.Capture_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#caseins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseins(RefiParser.CaseinsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#caseinsoff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseinsoff(RefiParser.CaseinsoffContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(RefiParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#ctrl_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrl_matcher(RefiParser.Ctrl_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#either_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither_matcher(RefiParser.Either_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#expr_param_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_param_matcher(RefiParser.Expr_param_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#exactly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactly(RefiParser.ExactlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#flagged}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagged(RefiParser.FlaggedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlags(RefiParser.FlagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#greek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreek(RefiParser.GreekContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#hex_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_matcher(RefiParser.Hex_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#nondigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNondigit(RefiParser.NondigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#not_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_matcher(RefiParser.Not_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#octal_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_matcher(RefiParser.Octal_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#or_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_matcher(RefiParser.Or_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#range_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_matcher(RefiParser.Range_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(RefiParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(RefiParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#matcher_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatcher_name(RefiParser.Matcher_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#match_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_type(RefiParser.Match_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#alphabetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetic(RefiParser.AlphabeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#anywild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnywild(RefiParser.AnywildContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#backtick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktick(RefiParser.BacktickContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#bell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBell(RefiParser.BellContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#bol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBol(RefiParser.BolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#currency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrency(RefiParser.CurrencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(RefiParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(RefiParser.EscapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(RefiParser.EolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#flagname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagname(RefiParser.FlagnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#formfeed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormfeed(RefiParser.FormfeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#latin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatin(RefiParser.LatinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#lower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower(RefiParser.LowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(RefiParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(RefiParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#somespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomespace(RefiParser.SomespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#tab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(RefiParser.TabContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#unicodecase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodecase(RefiParser.UnicodecaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#unicodecaseoff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodecaseoff(RefiParser.UnicodecaseoffContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#unixlines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnixlines(RefiParser.UnixlinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#unixlinesoff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnixlinesoff(RefiParser.UnixlinesoffContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#upper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper(RefiParser.UpperContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#wild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWild(RefiParser.WildContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefiParser#wordboundary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordboundary(RefiParser.WordboundaryContext ctx);
}