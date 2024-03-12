// Generated from c:/Users/robg3/workspace/refi/src/refi/RefiParser.g4 by ANTLR 4.13.1

package refi;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RefiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR=1, COLON=2, COMMA=3, HEX_NUMBER=4, INT=5, LEFTCURLY=6, LEFTPAREN=7, 
		OCTAL_NUMBER=8, RIGHTCURLY=9, RIGHTPAREN=10, STRING=11, VERTICAL=12, WS=13, 
		ALPHABETIC=14, ATLEAST=15, ANY=16, ANYWILD=17, ASCII=18, BACKTICK=19, 
		BELL=20, BETWEEN=21, BOL=22, CAPTURE=23, CASEINS=24, CASEINSOFF=25, COMMENTS=26, 
		CTRL=27, CURRENCY=28, DIGIT=29, DOTALL=30, EITHER=31, ESCAPE=32, EOL=33, 
		EXACTLY=34, FLAGGED=35, FLAGS=36, FORMFEED=37, GREEK=38, HEX=39, LATIN=40, 
		LOWER=41, MULTILINE=42, NEWLINE=43, NONDIGIT=44, NOT=45, OCTAL=46, OPTIONAL=47, 
		OR=48, POSSES=49, RANGE=50, RELUCT=51, RETURN=52, SOME=53, SOMESPACE=54, 
		TAB=55, UNICODECASE=56, UNICODECASEOFF=57, UNION=58, UNIXLINES=59, UNIXLINESOFF=60, 
		UPPER=61, WILD=62, WORDBOUNDARY=63, ZZ=64;
	public static final int
		RULE_expression = 0, RULE_backeted_matcher = 1, RULE_matcher = 2, RULE_literal_matcher = 3, 
		RULE_atleast = 4, RULE_between = 5, RULE_capture_matcher = 6, RULE_caseins = 7, 
		RULE_caseinsoff = 8, RULE_char = 9, RULE_ctrl_matcher = 10, RULE_either_matcher = 11, 
		RULE_expr_param_matcher = 12, RULE_exactly = 13, RULE_flagged = 14, RULE_flags = 15, 
		RULE_greek = 16, RULE_hex_matcher = 17, RULE_nondigit = 18, RULE_not_matcher = 19, 
		RULE_octal_matcher = 20, RULE_or_matcher = 21, RULE_range_matcher = 22, 
		RULE_union = 23, RULE_string = 24, RULE_matcher_name = 25, RULE_match_type = 26, 
		RULE_alphabetic = 27, RULE_anywild = 28, RULE_backtick = 29, RULE_bell = 30, 
		RULE_bol = 31, RULE_currency = 32, RULE_digit = 33, RULE_escape = 34, 
		RULE_eol = 35, RULE_flagname = 36, RULE_formfeed = 37, RULE_latin = 38, 
		RULE_lower = 39, RULE_newline = 40, RULE_return = 41, RULE_somespace = 42, 
		RULE_tab = 43, RULE_unicodecase = 44, RULE_unicodecaseoff = 45, RULE_unixlines = 46, 
		RULE_unixlinesoff = 47, RULE_upper = 48, RULE_wild = 49, RULE_wordboundary = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "backeted_matcher", "matcher", "literal_matcher", "atleast", 
			"between", "capture_matcher", "caseins", "caseinsoff", "char", "ctrl_matcher", 
			"either_matcher", "expr_param_matcher", "exactly", "flagged", "flags", 
			"greek", "hex_matcher", "nondigit", "not_matcher", "octal_matcher", "or_matcher", 
			"range_matcher", "union", "string", "matcher_name", "match_type", "alphabetic", 
			"anywild", "backtick", "bell", "bol", "currency", "digit", "escape", 
			"eol", "flagname", "formfeed", "latin", "lower", "newline", "return", 
			"somespace", "tab", "unicodecase", "unicodecaseoff", "unixlines", "unixlinesoff", 
			"upper", "wild", "wordboundary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR", "COLON", "COMMA", "HEX_NUMBER", "INT", "LEFTCURLY", "LEFTPAREN", 
			"OCTAL_NUMBER", "RIGHTCURLY", "RIGHTPAREN", "STRING", "VERTICAL", "WS", 
			"ALPHABETIC", "ATLEAST", "ANY", "ANYWILD", "ASCII", "BACKTICK", "BELL", 
			"BETWEEN", "BOL", "CAPTURE", "CASEINS", "CASEINSOFF", "COMMENTS", "CTRL", 
			"CURRENCY", "DIGIT", "DOTALL", "EITHER", "ESCAPE", "EOL", "EXACTLY", 
			"FLAGGED", "FLAGS", "FORMFEED", "GREEK", "HEX", "LATIN", "LOWER", "MULTILINE", 
			"NEWLINE", "NONDIGIT", "NOT", "OCTAL", "OPTIONAL", "OR", "POSSES", "RANGE", 
			"RELUCT", "RETURN", "SOME", "SOMESPACE", "TAB", "UNICODECASE", "UNICODECASEOFF", 
			"UNION", "UNIXLINES", "UNIXLINESOFF", "UPPER", "WILD", "WORDBOUNDARY", 
			"ZZ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RefiParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RefiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RefiParser.EOF, 0); }
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				matcher();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2819148954744702L) != 0) );
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Backeted_matcherContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(RefiParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(RefiParser.RIGHTPAREN, 0); }
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public Backeted_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backeted_matcher; }
	}

	public final Backeted_matcherContext backeted_matcher() throws RecognitionException {
		Backeted_matcherContext _localctx = new Backeted_matcherContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_backeted_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LEFTPAREN);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				matcher();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2819148954744702L) != 0) );
			setState(115);
			match(RIGHTPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatcherContext extends ParserRuleContext {
		public AtleastContext atleast() {
			return getRuleContext(AtleastContext.class,0);
		}
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
		}
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public AlphabeticContext alphabetic() {
			return getRuleContext(AlphabeticContext.class,0);
		}
		public AnywildContext anywild() {
			return getRuleContext(AnywildContext.class,0);
		}
		public BellContext bell() {
			return getRuleContext(BellContext.class,0);
		}
		public BolContext bol() {
			return getRuleContext(BolContext.class,0);
		}
		public BacktickContext backtick() {
			return getRuleContext(BacktickContext.class,0);
		}
		public Capture_matcherContext capture_matcher() {
			return getRuleContext(Capture_matcherContext.class,0);
		}
		public CaseinsContext caseins() {
			return getRuleContext(CaseinsContext.class,0);
		}
		public CaseinsoffContext caseinsoff() {
			return getRuleContext(CaseinsoffContext.class,0);
		}
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public Ctrl_matcherContext ctrl_matcher() {
			return getRuleContext(Ctrl_matcherContext.class,0);
		}
		public CurrencyContext currency() {
			return getRuleContext(CurrencyContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Either_matcherContext either_matcher() {
			return getRuleContext(Either_matcherContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public EscapeContext escape() {
			return getRuleContext(EscapeContext.class,0);
		}
		public ExactlyContext exactly() {
			return getRuleContext(ExactlyContext.class,0);
		}
		public Expr_param_matcherContext expr_param_matcher() {
			return getRuleContext(Expr_param_matcherContext.class,0);
		}
		public FormfeedContext formfeed() {
			return getRuleContext(FormfeedContext.class,0);
		}
		public FlaggedContext flagged() {
			return getRuleContext(FlaggedContext.class,0);
		}
		public FlagsContext flags() {
			return getRuleContext(FlagsContext.class,0);
		}
		public GreekContext greek() {
			return getRuleContext(GreekContext.class,0);
		}
		public Hex_matcherContext hex_matcher() {
			return getRuleContext(Hex_matcherContext.class,0);
		}
		public LatinContext latin() {
			return getRuleContext(LatinContext.class,0);
		}
		public LowerContext lower() {
			return getRuleContext(LowerContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public NondigitContext nondigit() {
			return getRuleContext(NondigitContext.class,0);
		}
		public Not_matcherContext not_matcher() {
			return getRuleContext(Not_matcherContext.class,0);
		}
		public Octal_matcherContext octal_matcher() {
			return getRuleContext(Octal_matcherContext.class,0);
		}
		public Or_matcherContext or_matcher() {
			return getRuleContext(Or_matcherContext.class,0);
		}
		public Range_matcherContext range_matcher() {
			return getRuleContext(Range_matcherContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public SomespaceContext somespace() {
			return getRuleContext(SomespaceContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public UnicodecaseContext unicodecase() {
			return getRuleContext(UnicodecaseContext.class,0);
		}
		public UnicodecaseoffContext unicodecaseoff() {
			return getRuleContext(UnicodecaseoffContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public UnixlinesContext unixlines() {
			return getRuleContext(UnixlinesContext.class,0);
		}
		public UnixlinesoffContext unixlinesoff() {
			return getRuleContext(UnixlinesoffContext.class,0);
		}
		public UpperContext upper() {
			return getRuleContext(UpperContext.class,0);
		}
		public WildContext wild() {
			return getRuleContext(WildContext.class,0);
		}
		public WordboundaryContext wordboundary() {
			return getRuleContext(WordboundaryContext.class,0);
		}
		public MatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher; }
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matcher);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATLEAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				atleast();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				backeted_matcher();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				between();
				}
				break;
			case ALPHABETIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				alphabetic();
				}
				break;
			case ANYWILD:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				anywild();
				}
				break;
			case BELL:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				bell();
				}
				break;
			case BOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				bol();
				}
				break;
			case BACKTICK:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				backtick();
				}
				break;
			case CAPTURE:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				capture_matcher();
				}
				break;
			case CASEINS:
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				caseins();
				}
				break;
			case CASEINSOFF:
				enterOuterAlt(_localctx, 11);
				{
				setState(127);
				caseinsoff();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				char_();
				}
				break;
			case CTRL:
				enterOuterAlt(_localctx, 13);
				{
				setState(129);
				ctrl_matcher();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 14);
				{
				setState(130);
				currency();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 15);
				{
				setState(131);
				digit();
				}
				break;
			case EITHER:
				enterOuterAlt(_localctx, 16);
				{
				setState(132);
				either_matcher();
				}
				break;
			case EOL:
				enterOuterAlt(_localctx, 17);
				{
				setState(133);
				eol();
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 18);
				{
				setState(134);
				escape();
				}
				break;
			case EXACTLY:
				enterOuterAlt(_localctx, 19);
				{
				setState(135);
				exactly();
				}
				break;
			case ANY:
			case OPTIONAL:
			case SOME:
				enterOuterAlt(_localctx, 20);
				{
				setState(136);
				expr_param_matcher();
				}
				break;
			case FORMFEED:
				enterOuterAlt(_localctx, 21);
				{
				setState(137);
				formfeed();
				}
				break;
			case FLAGGED:
				enterOuterAlt(_localctx, 22);
				{
				setState(138);
				flagged();
				}
				break;
			case FLAGS:
				enterOuterAlt(_localctx, 23);
				{
				setState(139);
				flags();
				}
				break;
			case GREEK:
				enterOuterAlt(_localctx, 24);
				{
				setState(140);
				greek();
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 25);
				{
				setState(141);
				hex_matcher();
				}
				break;
			case LATIN:
				enterOuterAlt(_localctx, 26);
				{
				setState(142);
				latin();
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 27);
				{
				setState(143);
				lower();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 28);
				{
				setState(144);
				newline();
				}
				break;
			case NONDIGIT:
				enterOuterAlt(_localctx, 29);
				{
				setState(145);
				nondigit();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 30);
				{
				setState(146);
				not_matcher();
				}
				break;
			case OCTAL:
				enterOuterAlt(_localctx, 31);
				{
				setState(147);
				octal_matcher();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 32);
				{
				setState(148);
				or_matcher();
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 33);
				{
				setState(149);
				range_matcher();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 34);
				{
				setState(150);
				return_();
				}
				break;
			case SOMESPACE:
				enterOuterAlt(_localctx, 35);
				{
				setState(151);
				somespace();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 36);
				{
				setState(152);
				string();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 37);
				{
				setState(153);
				tab();
				}
				break;
			case UNICODECASE:
				enterOuterAlt(_localctx, 38);
				{
				setState(154);
				unicodecase();
				}
				break;
			case UNICODECASEOFF:
				enterOuterAlt(_localctx, 39);
				{
				setState(155);
				unicodecaseoff();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 40);
				{
				setState(156);
				union();
				}
				break;
			case UNIXLINES:
				enterOuterAlt(_localctx, 41);
				{
				setState(157);
				unixlines();
				}
				break;
			case UNIXLINESOFF:
				enterOuterAlt(_localctx, 42);
				{
				setState(158);
				unixlinesoff();
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 43);
				{
				setState(159);
				upper();
				}
				break;
			case WILD:
				enterOuterAlt(_localctx, 44);
				{
				setState(160);
				wild();
				}
				break;
			case WORDBOUNDARY:
				enterOuterAlt(_localctx, 45);
				{
				setState(161);
				wordboundary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_matcherContext extends ParserRuleContext {
		public BacktickContext backtick() {
			return getRuleContext(BacktickContext.class,0);
		}
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
		}
		public WildContext wild() {
			return getRuleContext(WildContext.class,0);
		}
		public Literal_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_matcher; }
	}

	public final Literal_matcherContext literal_matcher() throws RecognitionException {
		Literal_matcherContext _localctx = new Literal_matcherContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_matcher);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				backtick();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				backeted_matcher();
				}
				break;
			case WILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				wild();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtleastContext extends ParserRuleContext {
		public Token count;
		public TerminalNode ATLEAST() { return getToken(RefiParser.ATLEAST, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(RefiParser.COMMA, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode INT() { return getToken(RefiParser.INT, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
		}
		public AtleastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atleast; }
	}

	public final AtleastContext atleast() throws RecognitionException {
		AtleastContext _localctx = new AtleastContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atleast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ATLEAST);
			setState(170);
			match(LEFTCURLY);
			setState(171);
			((AtleastContext)_localctx).count = match(INT);
			setState(172);
			match(COMMA);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(173);
				matcher();
				}
				break;
			case 2:
				{
				setState(174);
				backeted_matcher();
				}
				break;
			}
			setState(177);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BetweenContext extends ParserRuleContext {
		public Token from;
		public Token to;
		public TerminalNode BETWEEN() { return getToken(RefiParser.BETWEEN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RefiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RefiParser.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public List<TerminalNode> INT() { return getTokens(RefiParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RefiParser.INT, i);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
		}
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(BETWEEN);
			setState(180);
			match(LEFTCURLY);
			setState(181);
			((BetweenContext)_localctx).from = match(INT);
			setState(182);
			match(COMMA);
			setState(183);
			((BetweenContext)_localctx).to = match(INT);
			setState(184);
			match(COMMA);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(185);
				matcher();
				}
				break;
			case 2:
				{
				setState(186);
				backeted_matcher();
				}
				break;
			}
			setState(189);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Capture_matcherContext extends ParserRuleContext {
		public Token name;
		public TerminalNode CAPTURE() { return getToken(RefiParser.CAPTURE, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public List<Backeted_matcherContext> backeted_matcher() {
			return getRuleContexts(Backeted_matcherContext.class);
		}
		public Backeted_matcherContext backeted_matcher(int i) {
			return getRuleContext(Backeted_matcherContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RefiParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(RefiParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(RefiParser.CHAR, 0); }
		public Capture_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_matcher; }
	}

	public final Capture_matcherContext capture_matcher() throws RecognitionException {
		Capture_matcherContext _localctx = new Capture_matcherContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_capture_matcher);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(CAPTURE);
			setState(192);
			match(LEFTCURLY);
			setState(195); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(193);
						matcher();
						}
						break;
					case 2:
						{
						setState(194);
						backeted_matcher();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(199);
				match(COMMA);
				setState(200);
				((Capture_matcherContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==STRING) ) {
					((Capture_matcherContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(203);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseinsContext extends ParserRuleContext {
		public TerminalNode CASEINS() { return getToken(RefiParser.CASEINS, 0); }
		public CaseinsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseins; }
	}

	public final CaseinsContext caseins() throws RecognitionException {
		CaseinsContext _localctx = new CaseinsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_caseins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CASEINS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseinsoffContext extends ParserRuleContext {
		public TerminalNode CASEINSOFF() { return getToken(RefiParser.CASEINSOFF, 0); }
		public CaseinsoffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseinsoff; }
	}

	public final CaseinsoffContext caseinsoff() throws RecognitionException {
		CaseinsoffContext _localctx = new CaseinsoffContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caseinsoff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(CASEINSOFF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(RefiParser.CHAR, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ctrl_matcherContext extends ParserRuleContext {
		public TerminalNode CTRL() { return getToken(RefiParser.CTRL, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode INT() { return getToken(RefiParser.INT, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public Ctrl_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrl_matcher; }
	}

	public final Ctrl_matcherContext ctrl_matcher() throws RecognitionException {
		Ctrl_matcherContext _localctx = new Ctrl_matcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ctrl_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CTRL);
			setState(212);
			match(LEFTCURLY);
			setState(213);
			match(INT);
			setState(214);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Either_matcherContext extends ParserRuleContext {
		public TerminalNode EITHER() { return getToken(RefiParser.EITHER, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(RefiParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RefiParser.CHAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RefiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RefiParser.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public Either_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either_matcher; }
	}

	public final Either_matcherContext either_matcher() throws RecognitionException {
		Either_matcherContext _localctx = new Either_matcherContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_either_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(EITHER);
			setState(217);
			match(LEFTCURLY);
			setState(218);
			match(CHAR);
			setState(219);
			match(COMMA);
			setState(220);
			match(CHAR);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				match(CHAR);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_param_matcherContext extends ParserRuleContext {
		public Match_typeContext matchType;
		public Matcher_nameContext matcher_name() {
			return getRuleContext(Matcher_nameContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(RefiParser.COMMA, 0); }
		public Match_typeContext match_type() {
			return getRuleContext(Match_typeContext.class,0);
		}
		public Expr_param_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_param_matcher; }
	}

	public final Expr_param_matcherContext expr_param_matcher() throws RecognitionException {
		Expr_param_matcherContext _localctx = new Expr_param_matcherContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_param_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			matcher_name();
			setState(231);
			match(LEFTCURLY);
			setState(232);
			matcher();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(233);
				match(COMMA);
				setState(234);
				((Expr_param_matcherContext)_localctx).matchType = match_type();
				}
			}

			setState(237);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExactlyContext extends ParserRuleContext {
		public Token count;
		public TerminalNode EXACTLY() { return getToken(RefiParser.EXACTLY, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(RefiParser.COMMA, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode INT() { return getToken(RefiParser.INT, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
		}
		public ExactlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exactly; }
	}

	public final ExactlyContext exactly() throws RecognitionException {
		ExactlyContext _localctx = new ExactlyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(EXACTLY);
			setState(240);
			match(LEFTCURLY);
			setState(241);
			((ExactlyContext)_localctx).count = match(INT);
			setState(242);
			match(COMMA);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(243);
				matcher();
				}
				break;
			case 2:
				{
				setState(244);
				backeted_matcher();
				}
				break;
			}
			setState(247);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlaggedContext extends ParserRuleContext {
		public FlagnameContext flagname;
		public List<FlagnameContext> names = new ArrayList<FlagnameContext>();
		public TerminalNode FLAGGED() { return getToken(RefiParser.FLAGGED, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RefiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RefiParser.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public List<FlagnameContext> flagname() {
			return getRuleContexts(FlagnameContext.class);
		}
		public FlagnameContext flagname(int i) {
			return getRuleContext(FlagnameContext.class,i);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
		}
		public FlaggedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagged; }
	}

	public final FlaggedContext flagged() throws RecognitionException {
		FlaggedContext _localctx = new FlaggedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_flagged);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(FLAGGED);
			setState(250);
			match(LEFTCURLY);
			setState(251);
			((FlaggedContext)_localctx).flagname = flagname();
			((FlaggedContext)_localctx).names.add(((FlaggedContext)_localctx).flagname);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					((FlaggedContext)_localctx).flagname = flagname();
					((FlaggedContext)_localctx).names.add(((FlaggedContext)_localctx).flagname);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(259);
			match(COMMA);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(260);
				matcher();
				}
				break;
			case 2:
				{
				setState(261);
				backeted_matcher();
				}
				break;
			}
			setState(264);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlagsContext extends ParserRuleContext {
		public FlagnameContext flagname;
		public List<FlagnameContext> names = new ArrayList<FlagnameContext>();
		public TerminalNode FLAGS() { return getToken(RefiParser.FLAGS, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public List<FlagnameContext> flagname() {
			return getRuleContexts(FlagnameContext.class);
		}
		public FlagnameContext flagname(int i) {
			return getRuleContext(FlagnameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RefiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RefiParser.COMMA, i);
		}
		public FlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flags; }
	}

	public final FlagsContext flags() throws RecognitionException {
		FlagsContext _localctx = new FlagsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_flags);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(FLAGS);
			setState(267);
			match(LEFTCURLY);
			setState(268);
			((FlagsContext)_localctx).flagname = flagname();
			((FlagsContext)_localctx).names.add(((FlagsContext)_localctx).flagname);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(269);
					match(COMMA);
					setState(270);
					((FlagsContext)_localctx).flagname = flagname();
					((FlagsContext)_localctx).names.add(((FlagsContext)_localctx).flagname);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(276);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreekContext extends ParserRuleContext {
		public TerminalNode GREEK() { return getToken(RefiParser.GREEK, 0); }
		public GreekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greek; }
	}

	public final GreekContext greek() throws RecognitionException {
		GreekContext _localctx = new GreekContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_greek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(GREEK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hex_matcherContext extends ParserRuleContext {
		public Token number;
		public TerminalNode HEX() { return getToken(RefiParser.HEX, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(RefiParser.HEX_NUMBER, 0); }
		public Hex_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_matcher; }
	}

	public final Hex_matcherContext hex_matcher() throws RecognitionException {
		Hex_matcherContext _localctx = new Hex_matcherContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hex_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(HEX);
			setState(281);
			match(LEFTCURLY);
			setState(282);
			((Hex_matcherContext)_localctx).number = match(HEX_NUMBER);
			setState(283);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NondigitContext extends ParserRuleContext {
		public TerminalNode NONDIGIT() { return getToken(RefiParser.NONDIGIT, 0); }
		public NondigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nondigit; }
	}

	public final NondigitContext nondigit() throws RecognitionException {
		NondigitContext _localctx = new NondigitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nondigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(NONDIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Not_matcherContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RefiParser.NOT, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(RefiParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RefiParser.CHAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RefiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RefiParser.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public Not_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_matcher; }
	}

	public final Not_matcherContext not_matcher() throws RecognitionException {
		Not_matcherContext _localctx = new Not_matcherContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_not_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(NOT);
			setState(288);
			match(LEFTCURLY);
			setState(289);
			match(CHAR);
			setState(290);
			match(COMMA);
			setState(291);
			match(CHAR);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				match(CHAR);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Octal_matcherContext extends ParserRuleContext {
		public TerminalNode OCTAL() { return getToken(RefiParser.OCTAL, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode OCTAL_NUMBER() { return getToken(RefiParser.OCTAL_NUMBER, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public Octal_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_matcher; }
	}

	public final Octal_matcherContext octal_matcher() throws RecognitionException {
		Octal_matcherContext _localctx = new Octal_matcherContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_octal_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(OCTAL);
			setState(302);
			match(LEFTCURLY);
			setState(303);
			match(OCTAL_NUMBER);
			setState(304);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Or_matcherContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(RefiParser.OR, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode VERTICAL() { return getToken(RefiParser.VERTICAL, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public Or_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_matcher; }
	}

	public final Or_matcherContext or_matcher() throws RecognitionException {
		Or_matcherContext _localctx = new Or_matcherContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_or_matcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OR);
			setState(307);
			match(LEFTCURLY);
			setState(309); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(308);
					matcher();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(313);
			match(VERTICAL);
			setState(315); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(314);
					matcher();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(319);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_matcherContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(RefiParser.RANGE, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(RefiParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RefiParser.CHAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(RefiParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RefiParser.COLON, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(RefiParser.COMMA, 0); }
		public Range_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_matcher; }
	}

	public final Range_matcherContext range_matcher() throws RecognitionException {
		Range_matcherContext _localctx = new Range_matcherContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_range_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(RANGE);
			setState(322);
			match(LEFTCURLY);
			setState(323);
			match(CHAR);
			setState(324);
			match(COLON);
			setState(325);
			match(CHAR);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(326);
				match(COMMA);
				setState(327);
				match(CHAR);
				setState(328);
				match(COLON);
				setState(329);
				match(CHAR);
				}
			}

			setState(332);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(RefiParser.UNION, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(RefiParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RefiParser.CHAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(RefiParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RefiParser.COLON, i);
		}
		public TerminalNode COMMA() { return getToken(RefiParser.COMMA, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(UNION);
			setState(335);
			match(LEFTCURLY);
			setState(336);
			match(CHAR);
			setState(337);
			match(COLON);
			setState(338);
			match(CHAR);
			setState(339);
			match(COMMA);
			setState(340);
			match(CHAR);
			setState(341);
			match(COLON);
			setState(342);
			match(CHAR);
			setState(343);
			match(RIGHTCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RefiParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Matcher_nameContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(RefiParser.ANY, 0); }
		public TerminalNode OPTIONAL() { return getToken(RefiParser.OPTIONAL, 0); }
		public TerminalNode SOME() { return getToken(RefiParser.SOME, 0); }
		public Matcher_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher_name; }
	}

	public final Matcher_nameContext matcher_name() throws RecognitionException {
		Matcher_nameContext _localctx = new Matcher_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_matcher_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9147936743161856L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_typeContext extends ParserRuleContext {
		public TerminalNode POSSES() { return getToken(RefiParser.POSSES, 0); }
		public TerminalNode RELUCT() { return getToken(RefiParser.RELUCT, 0); }
		public Match_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_type; }
	}

	public final Match_typeContext match_type() throws RecognitionException {
		Match_typeContext _localctx = new Match_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_match_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==POSSES || _la==RELUCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlphabeticContext extends ParserRuleContext {
		public TerminalNode ALPHABETIC() { return getToken(RefiParser.ALPHABETIC, 0); }
		public AlphabeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabetic; }
	}

	public final AlphabeticContext alphabetic() throws RecognitionException {
		AlphabeticContext _localctx = new AlphabeticContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alphabetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ALPHABETIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnywildContext extends ParserRuleContext {
		public TerminalNode ANYWILD() { return getToken(RefiParser.ANYWILD, 0); }
		public AnywildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anywild; }
	}

	public final AnywildContext anywild() throws RecognitionException {
		AnywildContext _localctx = new AnywildContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_anywild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ANYWILD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BacktickContext extends ParserRuleContext {
		public TerminalNode BACKTICK() { return getToken(RefiParser.BACKTICK, 0); }
		public BacktickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtick; }
	}

	public final BacktickContext backtick() throws RecognitionException {
		BacktickContext _localctx = new BacktickContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_backtick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BellContext extends ParserRuleContext {
		public TerminalNode BELL() { return getToken(RefiParser.BELL, 0); }
		public BellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bell; }
	}

	public final BellContext bell() throws RecognitionException {
		BellContext _localctx = new BellContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(BELL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BolContext extends ParserRuleContext {
		public TerminalNode BOL() { return getToken(RefiParser.BOL, 0); }
		public BolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bol; }
	}

	public final BolContext bol() throws RecognitionException {
		BolContext _localctx = new BolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(BOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CurrencyContext extends ParserRuleContext {
		public TerminalNode CURRENCY() { return getToken(RefiParser.CURRENCY, 0); }
		public CurrencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency; }
	}

	public final CurrencyContext currency() throws RecognitionException {
		CurrencyContext _localctx = new CurrencyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_currency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CURRENCY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RefiParser.DIGIT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscapeContext extends ParserRuleContext {
		public TerminalNode ESCAPE() { return getToken(RefiParser.ESCAPE, 0); }
		public EscapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape; }
	}

	public final EscapeContext escape() throws RecognitionException {
		EscapeContext _localctx = new EscapeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ESCAPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(RefiParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlagnameContext extends ParserRuleContext {
		public TerminalNode CASEINS() { return getToken(RefiParser.CASEINS, 0); }
		public TerminalNode CASEINSOFF() { return getToken(RefiParser.CASEINSOFF, 0); }
		public TerminalNode UNICODECASE() { return getToken(RefiParser.UNICODECASE, 0); }
		public TerminalNode UNICODECASEOFF() { return getToken(RefiParser.UNICODECASEOFF, 0); }
		public TerminalNode UNIXLINES() { return getToken(RefiParser.UNIXLINES, 0); }
		public TerminalNode UNIXLINESOFF() { return getToken(RefiParser.UNIXLINESOFF, 0); }
		public FlagnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagname; }
	}

	public final FlagnameContext flagname() throws RecognitionException {
		FlagnameContext _localctx = new FlagnameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_flagname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1945555039074385920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormfeedContext extends ParserRuleContext {
		public TerminalNode FORMFEED() { return getToken(RefiParser.FORMFEED, 0); }
		public FormfeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formfeed; }
	}

	public final FormfeedContext formfeed() throws RecognitionException {
		FormfeedContext _localctx = new FormfeedContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_formfeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(FORMFEED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LatinContext extends ParserRuleContext {
		public TerminalNode LATIN() { return getToken(RefiParser.LATIN, 0); }
		public LatinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latin; }
	}

	public final LatinContext latin() throws RecognitionException {
		LatinContext _localctx = new LatinContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_latin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(LATIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LowerContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(RefiParser.LOWER, 0); }
		public LowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower; }
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(LOWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RefiParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RefiParser.RETURN, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomespaceContext extends ParserRuleContext {
		public TerminalNode SOMESPACE() { return getToken(RefiParser.SOMESPACE, 0); }
		public SomespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_somespace; }
	}

	public final SomespaceContext somespace() throws RecognitionException {
		SomespaceContext _localctx = new SomespaceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_somespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(SOMESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(RefiParser.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(TAB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnicodecaseContext extends ParserRuleContext {
		public TerminalNode UNICODECASE() { return getToken(RefiParser.UNICODECASE, 0); }
		public UnicodecaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodecase; }
	}

	public final UnicodecaseContext unicodecase() throws RecognitionException {
		UnicodecaseContext _localctx = new UnicodecaseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unicodecase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(UNICODECASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnicodecaseoffContext extends ParserRuleContext {
		public TerminalNode UNICODECASEOFF() { return getToken(RefiParser.UNICODECASEOFF, 0); }
		public UnicodecaseoffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodecaseoff; }
	}

	public final UnicodecaseoffContext unicodecaseoff() throws RecognitionException {
		UnicodecaseoffContext _localctx = new UnicodecaseoffContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unicodecaseoff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(UNICODECASEOFF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnixlinesContext extends ParserRuleContext {
		public TerminalNode UNIXLINES() { return getToken(RefiParser.UNIXLINES, 0); }
		public UnixlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unixlines; }
	}

	public final UnixlinesContext unixlines() throws RecognitionException {
		UnixlinesContext _localctx = new UnixlinesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unixlines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(UNIXLINES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnixlinesoffContext extends ParserRuleContext {
		public TerminalNode UNIXLINESOFF() { return getToken(RefiParser.UNIXLINESOFF, 0); }
		public UnixlinesoffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unixlinesoff; }
	}

	public final UnixlinesoffContext unixlinesoff() throws RecognitionException {
		UnixlinesoffContext _localctx = new UnixlinesoffContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unixlinesoff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(UNIXLINESOFF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpperContext extends ParserRuleContext {
		public TerminalNode UPPER() { return getToken(RefiParser.UPPER, 0); }
		public UpperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper; }
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(UPPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WildContext extends ParserRuleContext {
		public TerminalNode WILD() { return getToken(RefiParser.WILD, 0); }
		public WildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wild; }
	}

	public final WildContext wild() throws RecognitionException {
		WildContext _localctx = new WildContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_wild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(WILD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WordboundaryContext extends ParserRuleContext {
		public TerminalNode WORDBOUNDARY() { return getToken(RefiParser.WORDBOUNDARY, 0); }
		public WordboundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordboundary; }
	}

	public final WordboundaryContext wordboundary() throws RecognitionException {
		WordboundaryContext _localctx = new WordboundaryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_wordboundary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(WORDBOUNDARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u0190\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0004\u0000h\b\u0000\u000b\u0000\f\u0000i\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001p\b\u0001\u000b\u0001"+
		"\f\u0001q\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00a3\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00a8\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00b0\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00bc\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00c4\b\u0006\u000b\u0006"+
		"\f\u0006\u00c5\u0001\u0006\u0001\u0006\u0003\u0006\u00ca\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e0"+
		"\b\u000b\n\u000b\f\u000b\u00e3\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ec\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f6\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00ff\b\u000e\n\u000e\f\u000e\u0102\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0107\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0110\b\u000f\n"+
		"\u000f\f\u000f\u0113\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0127\b\u0013\n\u0013\f\u0013"+
		"\u012a\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u0136\b\u0015\u000b\u0015\f\u0015\u0137\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u013c\b\u0015\u000b\u0015\f\u0015\u013d\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u014b\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"0\u00010\u00011\u00011\u00012\u00012\u00012\u0005\u00c5\u0100\u0111\u0137"+
		"\u013d\u00003\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0004"+
		"\u0002\u0000\u0001\u0001\u000b\u000b\u0003\u0000\u0010\u0010//55\u0002"+
		"\u00001133\u0003\u0000\u0018\u001989;<\u019b\u0000g\u0001\u0000\u0000"+
		"\u0000\u0002m\u0001\u0000\u0000\u0000\u0004\u00a2\u0001\u0000\u0000\u0000"+
		"\u0006\u00a7\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000\u0000\n"+
		"\u00b3\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000\u0000\u0000\u000e\u00cd"+
		"\u0001\u0000\u0000\u0000\u0010\u00cf\u0001\u0000\u0000\u0000\u0012\u00d1"+
		"\u0001\u0000\u0000\u0000\u0014\u00d3\u0001\u0000\u0000\u0000\u0016\u00d8"+
		"\u0001\u0000\u0000\u0000\u0018\u00e6\u0001\u0000\u0000\u0000\u001a\u00ef"+
		"\u0001\u0000\u0000\u0000\u001c\u00f9\u0001\u0000\u0000\u0000\u001e\u010a"+
		"\u0001\u0000\u0000\u0000 \u0116\u0001\u0000\u0000\u0000\"\u0118\u0001"+
		"\u0000\u0000\u0000$\u011d\u0001\u0000\u0000\u0000&\u011f\u0001\u0000\u0000"+
		"\u0000(\u012d\u0001\u0000\u0000\u0000*\u0132\u0001\u0000\u0000\u0000,"+
		"\u0141\u0001\u0000\u0000\u0000.\u014e\u0001\u0000\u0000\u00000\u0159\u0001"+
		"\u0000\u0000\u00002\u015b\u0001\u0000\u0000\u00004\u015d\u0001\u0000\u0000"+
		"\u00006\u015f\u0001\u0000\u0000\u00008\u0161\u0001\u0000\u0000\u0000:"+
		"\u0163\u0001\u0000\u0000\u0000<\u0165\u0001\u0000\u0000\u0000>\u0167\u0001"+
		"\u0000\u0000\u0000@\u0169\u0001\u0000\u0000\u0000B\u016b\u0001\u0000\u0000"+
		"\u0000D\u016d\u0001\u0000\u0000\u0000F\u016f\u0001\u0000\u0000\u0000H"+
		"\u0171\u0001\u0000\u0000\u0000J\u0173\u0001\u0000\u0000\u0000L\u0175\u0001"+
		"\u0000\u0000\u0000N\u0177\u0001\u0000\u0000\u0000P\u0179\u0001\u0000\u0000"+
		"\u0000R\u017b\u0001\u0000\u0000\u0000T\u017d\u0001\u0000\u0000\u0000V"+
		"\u017f\u0001\u0000\u0000\u0000X\u0181\u0001\u0000\u0000\u0000Z\u0183\u0001"+
		"\u0000\u0000\u0000\\\u0185\u0001\u0000\u0000\u0000^\u0187\u0001\u0000"+
		"\u0000\u0000`\u0189\u0001\u0000\u0000\u0000b\u018b\u0001\u0000\u0000\u0000"+
		"d\u018d\u0001\u0000\u0000\u0000fh\u0003\u0004\u0002\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\u0000\u0000\u0001"+
		"l\u0001\u0001\u0000\u0000\u0000mo\u0005\u0007\u0000\u0000np\u0003\u0004"+
		"\u0002\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0005\n\u0000\u0000t\u0003\u0001\u0000\u0000\u0000u\u00a3\u0003\b\u0004"+
		"\u0000v\u00a3\u0003\u0002\u0001\u0000w\u00a3\u0003\n\u0005\u0000x\u00a3"+
		"\u00036\u001b\u0000y\u00a3\u00038\u001c\u0000z\u00a3\u0003<\u001e\u0000"+
		"{\u00a3\u0003>\u001f\u0000|\u00a3\u0003:\u001d\u0000}\u00a3\u0003\f\u0006"+
		"\u0000~\u00a3\u0003\u000e\u0007\u0000\u007f\u00a3\u0003\u0010\b\u0000"+
		"\u0080\u00a3\u0003\u0012\t\u0000\u0081\u00a3\u0003\u0014\n\u0000\u0082"+
		"\u00a3\u0003@ \u0000\u0083\u00a3\u0003B!\u0000\u0084\u00a3\u0003\u0016"+
		"\u000b\u0000\u0085\u00a3\u0003F#\u0000\u0086\u00a3\u0003D\"\u0000\u0087"+
		"\u00a3\u0003\u001a\r\u0000\u0088\u00a3\u0003\u0018\f\u0000\u0089\u00a3"+
		"\u0003J%\u0000\u008a\u00a3\u0003\u001c\u000e\u0000\u008b\u00a3\u0003\u001e"+
		"\u000f\u0000\u008c\u00a3\u0003 \u0010\u0000\u008d\u00a3\u0003\"\u0011"+
		"\u0000\u008e\u00a3\u0003L&\u0000\u008f\u00a3\u0003N\'\u0000\u0090\u00a3"+
		"\u0003P(\u0000\u0091\u00a3\u0003$\u0012\u0000\u0092\u00a3\u0003&\u0013"+
		"\u0000\u0093\u00a3\u0003(\u0014\u0000\u0094\u00a3\u0003*\u0015\u0000\u0095"+
		"\u00a3\u0003,\u0016\u0000\u0096\u00a3\u0003R)\u0000\u0097\u00a3\u0003"+
		"T*\u0000\u0098\u00a3\u00030\u0018\u0000\u0099\u00a3\u0003V+\u0000\u009a"+
		"\u00a3\u0003X,\u0000\u009b\u00a3\u0003Z-\u0000\u009c\u00a3\u0003.\u0017"+
		"\u0000\u009d\u00a3\u0003\\.\u0000\u009e\u00a3\u0003^/\u0000\u009f\u00a3"+
		"\u0003`0\u0000\u00a0\u00a3\u0003b1\u0000\u00a1\u00a3\u0003d2\u0000\u00a2"+
		"u\u0001\u0000\u0000\u0000\u00a2v\u0001\u0000\u0000\u0000\u00a2w\u0001"+
		"\u0000\u0000\u0000\u00a2x\u0001\u0000\u0000\u0000\u00a2y\u0001\u0000\u0000"+
		"\u0000\u00a2z\u0001\u0000\u0000\u0000\u00a2{\u0001\u0000\u0000\u0000\u00a2"+
		"|\u0001\u0000\u0000\u0000\u00a2}\u0001\u0000\u0000\u0000\u00a2~\u0001"+
		"\u0000\u0000\u0000\u00a2\u007f\u0001\u0000\u0000\u0000\u00a2\u0080\u0001"+
		"\u0000\u0000\u0000\u00a2\u0081\u0001\u0000\u0000\u0000\u00a2\u0082\u0001"+
		"\u0000\u0000\u0000\u00a2\u0083\u0001\u0000\u0000\u0000\u00a2\u0084\u0001"+
		"\u0000\u0000\u0000\u00a2\u0085\u0001\u0000\u0000\u0000\u00a2\u0086\u0001"+
		"\u0000\u0000\u0000\u00a2\u0087\u0001\u0000\u0000\u0000\u00a2\u0088\u0001"+
		"\u0000\u0000\u0000\u00a2\u0089\u0001\u0000\u0000\u0000\u00a2\u008a\u0001"+
		"\u0000\u0000\u0000\u00a2\u008b\u0001\u0000\u0000\u0000\u00a2\u008c\u0001"+
		"\u0000\u0000\u0000\u00a2\u008d\u0001\u0000\u0000\u0000\u00a2\u008e\u0001"+
		"\u0000\u0000\u0000\u00a2\u008f\u0001\u0000\u0000\u0000\u00a2\u0090\u0001"+
		"\u0000\u0000\u0000\u00a2\u0091\u0001\u0000\u0000\u0000\u00a2\u0092\u0001"+
		"\u0000\u0000\u0000\u00a2\u0093\u0001\u0000\u0000\u0000\u00a2\u0094\u0001"+
		"\u0000\u0000\u0000\u00a2\u0095\u0001\u0000\u0000\u0000\u00a2\u0096\u0001"+
		"\u0000\u0000\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u0098\u0001"+
		"\u0000\u0000\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009a\u0001"+
		"\u0000\u0000\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u009c\u0001"+
		"\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u009e\u0001"+
		"\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0005\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a8\u0003:\u001d\u0000\u00a5\u00a8\u0003\u0002"+
		"\u0001\u0000\u00a6\u00a8\u0003b1\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u000f\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000"+
		"\u00ac\u00af\u0005\u0003\u0000\u0000\u00ad\u00b0\u0003\u0004\u0002\u0000"+
		"\u00ae\u00b0\u0003\u0002\u0001\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0005\t\u0000\u0000\u00b2\t\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0015\u0000\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5"+
		"\u00b6\u0005\u0005\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0005\u0000\u0000\u00b8\u00bb\u0005\u0003\u0000\u0000\u00b9"+
		"\u00bc\u0003\u0004\u0002\u0000\u00ba\u00bc\u0003\u0002\u0001\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\t\u0000\u0000\u00be\u000b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0017\u0000\u0000\u00c0\u00c3"+
		"\u0005\u0006\u0000\u0000\u00c1\u00c4\u0003\u0004\u0002\u0000\u00c2\u00c4"+
		"\u0003\u0002\u0001\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u00ca"+
		"\u0007\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\t\u0000\u0000\u00cc\r\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0018\u0000\u0000\u00ce\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0019\u0000\u0000\u00d0\u0011\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0001\u0000\u0000\u00d2\u0013\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u001b\u0000\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0005\u0000\u0000\u00d6\u00d7\u0005\t\u0000\u0000\u00d7\u0015\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005\u001f\u0000\u0000\u00d9\u00da\u0005\u0006"+
		"\u0000\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0005\u0003"+
		"\u0000\u0000\u00dc\u00e1\u0005\u0001\u0000\u0000\u00dd\u00de\u0005\u0003"+
		"\u0000\u0000\u00de\u00e0\u0005\u0001\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\t\u0000"+
		"\u0000\u00e5\u0017\u0001\u0000\u0000\u0000\u00e6\u00e7\u00032\u0019\u0000"+
		"\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00eb\u0003\u0004\u0002\u0000"+
		"\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00ec\u00034\u001a\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\t\u0000\u0000\u00ee\u0019"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\"\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0006\u0000\u0000\u00f1\u00f2\u0005\u0005\u0000\u0000\u00f2\u00f5\u0005"+
		"\u0003\u0000\u0000\u00f3\u00f6\u0003\u0004\u0002\u0000\u00f4\u00f6\u0003"+
		"\u0002\u0001\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\t\u0000\u0000\u00f8\u001b\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005#"+
		"\u0000\u0000\u00fa\u00fb\u0005\u0006\u0000\u0000\u00fb\u0100\u0003H$\u0000"+
		"\u00fc\u00fd\u0005\u0003\u0000\u0000\u00fd\u00ff\u0003H$\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0005\u0003\u0000\u0000\u0104\u0107\u0003\u0004\u0002\u0000\u0105\u0107"+
		"\u0003\u0002\u0001\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\t\u0000\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"$\u0000\u0000\u010b\u010c\u0005\u0006\u0000\u0000\u010c\u0111\u0003H$"+
		"\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e\u0110\u0003H$\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005\t\u0000\u0000\u0115\u001f\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005&\u0000\u0000\u0117!\u0001\u0000\u0000\u0000\u0118\u0119\u0005\'"+
		"\u0000\u0000\u0119\u011a\u0005\u0006\u0000\u0000\u011a\u011b\u0005\u0004"+
		"\u0000\u0000\u011b\u011c\u0005\t\u0000\u0000\u011c#\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005,\u0000\u0000\u011e%\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005-\u0000\u0000\u0120\u0121\u0005\u0006\u0000\u0000\u0121\u0122"+
		"\u0005\u0001\u0000\u0000\u0122\u0123\u0005\u0003\u0000\u0000\u0123\u0128"+
		"\u0005\u0001\u0000\u0000\u0124\u0125\u0005\u0003\u0000\u0000\u0125\u0127"+
		"\u0005\u0001\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012a"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0005\t\u0000\u0000\u012c\'\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005.\u0000\u0000\u012e\u012f\u0005\u0006"+
		"\u0000\u0000\u012f\u0130\u0005\b\u0000\u0000\u0130\u0131\u0005\t\u0000"+
		"\u0000\u0131)\u0001\u0000\u0000\u0000\u0132\u0133\u00050\u0000\u0000\u0133"+
		"\u0135\u0005\u0006\u0000\u0000\u0134\u0136\u0003\u0004\u0002\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0005\f\u0000\u0000\u013a\u013c"+
		"\u0003\u0004\u0002\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\t\u0000\u0000\u0140+\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"2\u0000\u0000\u0142\u0143\u0005\u0006\u0000\u0000\u0143\u0144\u0005\u0001"+
		"\u0000\u0000\u0144\u0145\u0005\u0002\u0000\u0000\u0145\u014a\u0005\u0001"+
		"\u0000\u0000\u0146\u0147\u0005\u0003\u0000\u0000\u0147\u0148\u0005\u0001"+
		"\u0000\u0000\u0148\u0149\u0005\u0002\u0000\u0000\u0149\u014b\u0005\u0001"+
		"\u0000\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0005\t\u0000"+
		"\u0000\u014d-\u0001\u0000\u0000\u0000\u014e\u014f\u0005:\u0000\u0000\u014f"+
		"\u0150\u0005\u0006\u0000\u0000\u0150\u0151\u0005\u0001\u0000\u0000\u0151"+
		"\u0152\u0005\u0002\u0000\u0000\u0152\u0153\u0005\u0001\u0000\u0000\u0153"+
		"\u0154\u0005\u0003\u0000\u0000\u0154\u0155\u0005\u0001\u0000\u0000\u0155"+
		"\u0156\u0005\u0002\u0000\u0000\u0156\u0157\u0005\u0001\u0000\u0000\u0157"+
		"\u0158\u0005\t\u0000\u0000\u0158/\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0005\u000b\u0000\u0000\u015a1\u0001\u0000\u0000\u0000\u015b\u015c\u0007"+
		"\u0001\u0000\u0000\u015c3\u0001\u0000\u0000\u0000\u015d\u015e\u0007\u0002"+
		"\u0000\u0000\u015e5\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u000e\u0000"+
		"\u0000\u01607\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0011\u0000\u0000"+
		"\u01629\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0013\u0000\u0000\u0164"+
		";\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0014\u0000\u0000\u0166=\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0005\u0016\u0000\u0000\u0168?\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0005\u001c\u0000\u0000\u016aA\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0005\u001d\u0000\u0000\u016cC\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0005 \u0000\u0000\u016eE\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0005!\u0000\u0000\u0170G\u0001\u0000\u0000\u0000\u0171\u0172\u0007\u0003"+
		"\u0000\u0000\u0172I\u0001\u0000\u0000\u0000\u0173\u0174\u0005%\u0000\u0000"+
		"\u0174K\u0001\u0000\u0000\u0000\u0175\u0176\u0005(\u0000\u0000\u0176M"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005)\u0000\u0000\u0178O\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0005+\u0000\u0000\u017aQ\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u00054\u0000\u0000\u017cS\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u00056\u0000\u0000\u017eU\u0001\u0000\u0000\u0000\u017f\u0180\u00057"+
		"\u0000\u0000\u0180W\u0001\u0000\u0000\u0000\u0181\u0182\u00058\u0000\u0000"+
		"\u0182Y\u0001\u0000\u0000\u0000\u0183\u0184\u00059\u0000\u0000\u0184["+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0005;\u0000\u0000\u0186]\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0005<\u0000\u0000\u0188_\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005=\u0000\u0000\u018aa\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005>\u0000\u0000\u018cc\u0001\u0000\u0000\u0000\u018d\u018e\u0005?"+
		"\u0000\u0000\u018ee\u0001\u0000\u0000\u0000\u0013iq\u00a2\u00a7\u00af"+
		"\u00bb\u00c3\u00c5\u00c9\u00e1\u00eb\u00f5\u0100\u0106\u0111\u0128\u0137"+
		"\u013d\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}