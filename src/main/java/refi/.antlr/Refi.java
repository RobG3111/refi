// Generated from c:/Users/robg3/workspace/refi/src/refi/Refi.g4 by ANTLR 4.13.1

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
public class Refi extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR=1, COLON=2, COMMA=3, HEX_NUMBER=4, INT=5, LEFTCURLY=6, LEFTPAREN=7, 
		OCTAL_NUMBER=8, RIGHTCURLY=9, RIGHTPAREN=10, STRING=11, WS=12, ANY=13, 
		ANYWILD=14, BACKTICK=15, BELL=16, BOL=17, CAPTURE=18, CTRL=19, DIGIT=20, 
		EITHER=21, ESCAPE=22, EOL=23, FORMFEED=24, HEX=25, NEWLINE=26, NOT=27, 
		OCTAL=28, OPTIONAL=29, ONEOF=30, RANGE=31, RETURN=32, SOME=33, TAB=34, 
		WILD=35;
	public static final int
		RULE_expression = 0, RULE_matcher = 1, RULE_literal_matcher = 2, RULE_capture_matcher = 3, 
		RULE_char = 4, RULE_ctrl_matcher = 5, RULE_either_matcher = 6, RULE_expr_param_matcher = 7, 
		RULE_hex_matcher = 8, RULE_not_matcher = 9, RULE_octal_matcher = 10, RULE_oneof_matcher = 11, 
		RULE_range_matcher = 12, RULE_string = 13, RULE_function_matcher = 14, 
		RULE_matcher_name = 15, RULE_any = 16, RULE_anywild = 17, RULE_backtick = 18, 
		RULE_bell = 19, RULE_bol = 20, RULE_capture = 21, RULE_ctrl = 22, RULE_digit = 23, 
		RULE_either = 24, RULE_escape = 25, RULE_eol = 26, RULE_formfeed = 27, 
		RULE_hex = 28, RULE_newline = 29, RULE_not = 30, RULE_octal = 31, RULE_optional = 32, 
		RULE_oneof = 33, RULE_range = 34, RULE_return = 35, RULE_some = 36, RULE_tab = 37, 
		RULE_wild = 38, RULE_unexpected = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "matcher", "literal_matcher", "capture_matcher", "char", 
			"ctrl_matcher", "either_matcher", "expr_param_matcher", "hex_matcher", 
			"not_matcher", "octal_matcher", "oneof_matcher", "range_matcher", "string", 
			"function_matcher", "matcher_name", "any", "anywild", "backtick", "bell", 
			"bol", "capture", "ctrl", "digit", "either", "escape", "eol", "formfeed", 
			"hex", "newline", "not", "octal", "optional", "oneof", "range", "return", 
			"some", "tab", "wild", "unexpected"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'", "','", null, null, "'{'", "'('", null, "'}'", "')'", 
			null, null, "'any'", "'anywild'", "'backtick'", "'bell'", "'bol'", "'capture'", 
			"'ctrl'", "'digit'", "'either'", "'escape'", "'eol'", "'formfeed'", "'hex'", 
			"'newline'", "'not'", "'octal'", "'optional'", "'oneof'", "'range'", 
			"'return'", "'some'", "'tab'", "'wild'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR", "COLON", "COMMA", "HEX_NUMBER", "INT", "LEFTCURLY", "LEFTPAREN", 
			"OCTAL_NUMBER", "RIGHTCURLY", "RIGHTPAREN", "STRING", "WS", "ANY", "ANYWILD", 
			"BACKTICK", "BELL", "BOL", "CAPTURE", "CTRL", "DIGIT", "EITHER", "ESCAPE", 
			"EOL", "FORMFEED", "HEX", "NEWLINE", "NOT", "OCTAL", "OPTIONAL", "ONEOF", 
			"RANGE", "RETURN", "SOME", "TAB", "WILD"
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
	public String getGrammarFileName() { return "Refi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Refi(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Refi.EOF, 0); }
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719476734L) != 0)) {
				{
				{
				setState(80);
				matcher();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
	public static class MatcherContext extends ParserRuleContext {
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
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public Ctrl_matcherContext ctrl_matcher() {
			return getRuleContext(Ctrl_matcherContext.class,0);
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
		public Expr_param_matcherContext expr_param_matcher() {
			return getRuleContext(Expr_param_matcherContext.class,0);
		}
		public FormfeedContext formfeed() {
			return getRuleContext(FormfeedContext.class,0);
		}
		public Hex_matcherContext hex_matcher() {
			return getRuleContext(Hex_matcherContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Not_matcherContext not_matcher() {
			return getRuleContext(Not_matcherContext.class,0);
		}
		public Octal_matcherContext octal_matcher() {
			return getRuleContext(Octal_matcherContext.class,0);
		}
		public Oneof_matcherContext oneof_matcher() {
			return getRuleContext(Oneof_matcherContext.class,0);
		}
		public Range_matcherContext range_matcher() {
			return getRuleContext(Range_matcherContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Function_matcherContext function_matcher() {
			return getRuleContext(Function_matcherContext.class,0);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public WildContext wild() {
			return getRuleContext(WildContext.class,0);
		}
		public UnexpectedContext unexpected() {
			return getRuleContext(UnexpectedContext.class,0);
		}
		public MatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher; }
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_matcher);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				anywild();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				bell();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				bol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				backtick();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				capture_matcher();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				char_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				ctrl_matcher();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				digit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				either_matcher();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				eol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(98);
				escape();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(99);
				expr_param_matcher();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(100);
				formfeed();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(101);
				hex_matcher();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(102);
				newline();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(103);
				not_matcher();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(104);
				octal_matcher();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(105);
				oneof_matcher();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(106);
				range_matcher();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(107);
				return_();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(108);
				string();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(109);
				function_matcher();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(110);
				tab();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(111);
				wild();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(112);
				unexpected();
				}
				break;
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
		enterRule(_localctx, 4, RULE_literal_matcher);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				backtick();
				}
				break;
			case WILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
	public static class Capture_matcherContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public Capture_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_matcher; }
	}

	public final Capture_matcherContext capture_matcher() throws RecognitionException {
		Capture_matcherContext _localctx = new Capture_matcherContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_capture_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			capture();
			setState(120);
			match(LEFTCURLY);
			setState(121);
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
	public static class CharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(Refi.CHAR, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		public CtrlContext ctrl() {
			return getRuleContext(CtrlContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode INT() { return getToken(Refi.INT, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public Ctrl_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrl_matcher; }
	}

	public final Ctrl_matcherContext ctrl_matcher() throws RecognitionException {
		Ctrl_matcherContext _localctx = new Ctrl_matcherContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctrl_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			ctrl();
			setState(126);
			match(LEFTCURLY);
			setState(127);
			match(INT);
			setState(128);
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
		public EitherContext either() {
			return getRuleContext(EitherContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(Refi.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(Refi.CHAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Refi.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Refi.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public Either_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either_matcher; }
	}

	public final Either_matcherContext either_matcher() throws RecognitionException {
		Either_matcherContext _localctx = new Either_matcherContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_either_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			either();
			setState(131);
			match(LEFTCURLY);
			setState(132);
			match(CHAR);
			setState(133);
			match(COMMA);
			setState(134);
			match(CHAR);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(CHAR);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
		public Literal_matcherContext expr;
		public Matcher_nameContext matcher_name() {
			return getRuleContext(Matcher_nameContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public List<Literal_matcherContext> literal_matcher() {
			return getRuleContexts(Literal_matcherContext.class);
		}
		public Literal_matcherContext literal_matcher(int i) {
			return getRuleContext(Literal_matcherContext.class,i);
		}
		public Expr_param_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_param_matcher; }
	}

	public final Expr_param_matcherContext expr_param_matcher() throws RecognitionException {
		Expr_param_matcherContext _localctx = new Expr_param_matcherContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_param_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			matcher_name();
			setState(145);
			match(LEFTCURLY);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKTICK || _la==WILD) {
				{
				{
				setState(146);
				((Expr_param_matcherContext)_localctx).expr = literal_matcher();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
	public static class Hex_matcherContext extends ParserRuleContext {
		public Token number;
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(Refi.HEX_NUMBER, 0); }
		public Hex_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_matcher; }
	}

	public final Hex_matcherContext hex_matcher() throws RecognitionException {
		Hex_matcherContext _localctx = new Hex_matcherContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hex_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			hex();
			setState(155);
			match(LEFTCURLY);
			setState(156);
			((Hex_matcherContext)_localctx).number = match(HEX_NUMBER);
			setState(157);
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
	public static class Not_matcherContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(Refi.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(Refi.CHAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Refi.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Refi.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public Not_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_matcher; }
	}

	public final Not_matcherContext not_matcher() throws RecognitionException {
		Not_matcherContext _localctx = new Not_matcherContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_not_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			not();
			setState(160);
			match(LEFTCURLY);
			setState(161);
			match(CHAR);
			setState(162);
			match(COMMA);
			setState(163);
			match(CHAR);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				match(CHAR);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
		public OctalContext octal() {
			return getRuleContext(OctalContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode OCTAL_NUMBER() { return getToken(Refi.OCTAL_NUMBER, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public Octal_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_matcher; }
	}

	public final Octal_matcherContext octal_matcher() throws RecognitionException {
		Octal_matcherContext _localctx = new Octal_matcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_octal_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			octal();
			setState(174);
			match(LEFTCURLY);
			setState(175);
			match(OCTAL_NUMBER);
			setState(176);
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
	public static class Oneof_matcherContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public OneofContext oneof() {
			return getRuleContext(OneofContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(Refi.COMMA, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public List<TerminalNode> STRING() { return getTokens(Refi.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Refi.STRING, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(Refi.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(Refi.CHAR, i);
		}
		public Oneof_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneof_matcher; }
	}

	public final Oneof_matcherContext oneof_matcher() throws RecognitionException {
		Oneof_matcherContext _localctx = new Oneof_matcherContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oneof_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			oneof();
			setState(179);
			match(LEFTCURLY);
			setState(180);
			((Oneof_matcherContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==STRING) ) {
				((Oneof_matcherContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			match(COMMA);
			setState(182);
			((Oneof_matcherContext)_localctx).right = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==STRING) ) {
				((Oneof_matcherContext)_localctx).right = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
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
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(Refi.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(Refi.CHAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Refi.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Refi.COLON, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(Refi.COMMA, 0); }
		public Range_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_matcher; }
	}

	public final Range_matcherContext range_matcher() throws RecognitionException {
		Range_matcherContext _localctx = new Range_matcherContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_range_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			range();
			setState(186);
			match(LEFTCURLY);
			setState(187);
			match(CHAR);
			setState(188);
			match(COLON);
			setState(189);
			match(CHAR);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(190);
				match(COMMA);
				setState(191);
				match(CHAR);
				setState(192);
				match(COLON);
				setState(193);
				match(CHAR);
				}
			}

			setState(196);
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
		public TerminalNode STRING() { return getToken(Refi.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
	public static class Function_matcherContext extends ParserRuleContext {
		public Token str;
		public Matcher_nameContext matcher_name() {
			return getRuleContext(Matcher_nameContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(Refi.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(Refi.RIGHTCURLY, 0); }
		public TerminalNode STRING() { return getToken(Refi.STRING, 0); }
		public TerminalNode CHAR() { return getToken(Refi.CHAR, 0); }
		public Function_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_matcher; }
	}

	public final Function_matcherContext function_matcher() throws RecognitionException {
		Function_matcherContext _localctx = new Function_matcherContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			matcher_name();
			setState(201);
			match(LEFTCURLY);
			setState(202);
			((Function_matcherContext)_localctx).str = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==STRING) ) {
				((Function_matcherContext)_localctx).str = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Matcher_nameContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
		}
		public SomeContext some() {
			return getRuleContext(SomeContext.class,0);
		}
		public Matcher_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher_name; }
	}

	public final Matcher_nameContext matcher_name() throws RecognitionException {
		Matcher_nameContext _localctx = new Matcher_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_matcher_name);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				any();
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				optional();
				}
				break;
			case SOME:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				some();
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
	public static class AnyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(Refi.ANY, 0); }
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ANY);
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
		public TerminalNode ANYWILD() { return getToken(Refi.ANYWILD, 0); }
		public AnywildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anywild; }
	}

	public final AnywildContext anywild() throws RecognitionException {
		AnywildContext _localctx = new AnywildContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_anywild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		public TerminalNode BACKTICK() { return getToken(Refi.BACKTICK, 0); }
		public BacktickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtick; }
	}

	public final BacktickContext backtick() throws RecognitionException {
		BacktickContext _localctx = new BacktickContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_backtick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public TerminalNode BELL() { return getToken(Refi.BELL, 0); }
		public BellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bell; }
	}

	public final BellContext bell() throws RecognitionException {
		BellContext _localctx = new BellContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		public TerminalNode BOL() { return getToken(Refi.BOL, 0); }
		public BolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bol; }
	}

	public final BolContext bol() throws RecognitionException {
		BolContext _localctx = new BolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
	public static class CaptureContext extends ParserRuleContext {
		public TerminalNode CAPTURE() { return getToken(Refi.CAPTURE, 0); }
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(CAPTURE);
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
	public static class CtrlContext extends ParserRuleContext {
		public TerminalNode CTRL() { return getToken(Refi.CTRL, 0); }
		public CtrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrl; }
	}

	public final CtrlContext ctrl() throws RecognitionException {
		CtrlContext _localctx = new CtrlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ctrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CTRL);
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
		public TerminalNode DIGIT() { return getToken(Refi.DIGIT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
	public static class EitherContext extends ParserRuleContext {
		public TerminalNode EITHER() { return getToken(Refi.EITHER, 0); }
		public EitherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either; }
	}

	public final EitherContext either() throws RecognitionException {
		EitherContext _localctx = new EitherContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_either);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(EITHER);
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
		public TerminalNode ESCAPE() { return getToken(Refi.ESCAPE, 0); }
		public EscapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape; }
	}

	public final EscapeContext escape() throws RecognitionException {
		EscapeContext _localctx = new EscapeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		public TerminalNode EOL() { return getToken(Refi.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
	public static class FormfeedContext extends ParserRuleContext {
		public TerminalNode FORMFEED() { return getToken(Refi.FORMFEED, 0); }
		public FormfeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formfeed; }
	}

	public final FormfeedContext formfeed() throws RecognitionException {
		FormfeedContext _localctx = new FormfeedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_formfeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
	public static class HexContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(Refi.HEX, 0); }
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(HEX);
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
		public TerminalNode NEWLINE() { return getToken(Refi.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Refi.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(NOT);
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
	public static class OctalContext extends ParserRuleContext {
		public TerminalNode OCTAL() { return getToken(Refi.OCTAL, 0); }
		public OctalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal; }
	}

	public final OctalContext octal() throws RecognitionException {
		OctalContext _localctx = new OctalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_octal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OCTAL);
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
	public static class OptionalContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(Refi.OPTIONAL, 0); }
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(OPTIONAL);
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
	public static class OneofContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(Refi.ONEOF, 0); }
		public OneofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneof; }
	}

	public final OneofContext oneof() throws RecognitionException {
		OneofContext _localctx = new OneofContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oneof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ONEOF);
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
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(Refi.RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(RANGE);
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
		public TerminalNode RETURN() { return getToken(Refi.RETURN, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
	public static class SomeContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(Refi.SOME, 0); }
		public SomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some; }
	}

	public final SomeContext some() throws RecognitionException {
		SomeContext _localctx = new SomeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_some);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SOME);
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
		public TerminalNode TAB() { return getToken(Refi.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
	public static class WildContext extends ParserRuleContext {
		public TerminalNode WILD() { return getToken(Refi.WILD, 0); }
		public WildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wild; }
	}

	public final WildContext wild() throws RecognitionException {
		WildContext _localctx = new WildContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_wild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
	public static class UnexpectedContext extends ParserRuleContext {
		public UnexpectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unexpected; }
	}

	public final UnexpectedContext unexpected() throws RecognitionException {
		UnexpectedContext _localctx = new UnexpectedContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unexpected);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			matchWildcard();
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
		"\u0004\u0001#\u0103\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002v\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u008a\b\u0006\n\u0006\f\u0006\u008d\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0094\b\u0007\n\u0007\f\u0007\u0097\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00a7\b\t\n\t\f\t\u00aa\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c3"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00d1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000"+
		"\u0001\u0002\u0000\u0001\u0001\u000b\u000b\u00fa\u0000S\u0001\u0000\u0000"+
		"\u0000\u0002q\u0001\u0000\u0000\u0000\u0004u\u0001\u0000\u0000\u0000\u0006"+
		"w\u0001\u0000\u0000\u0000\b{\u0001\u0000\u0000\u0000\n}\u0001\u0000\u0000"+
		"\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u0090\u0001\u0000\u0000\u0000"+
		"\u0010\u009a\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000"+
		"\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00b2\u0001\u0000\u0000\u0000"+
		"\u0018\u00b9\u0001\u0000\u0000\u0000\u001a\u00c6\u0001\u0000\u0000\u0000"+
		"\u001c\u00c8\u0001\u0000\u0000\u0000\u001e\u00d0\u0001\u0000\u0000\u0000"+
		" \u00d2\u0001\u0000\u0000\u0000\"\u00d4\u0001\u0000\u0000\u0000$\u00d6"+
		"\u0001\u0000\u0000\u0000&\u00d8\u0001\u0000\u0000\u0000(\u00da\u0001\u0000"+
		"\u0000\u0000*\u00dc\u0001\u0000\u0000\u0000,\u00de\u0001\u0000\u0000\u0000"+
		".\u00e0\u0001\u0000\u0000\u00000\u00e2\u0001\u0000\u0000\u00002\u00e4"+
		"\u0001\u0000\u0000\u00004\u00e6\u0001\u0000\u0000\u00006\u00e8\u0001\u0000"+
		"\u0000\u00008\u00ea\u0001\u0000\u0000\u0000:\u00ec\u0001\u0000\u0000\u0000"+
		"<\u00ee\u0001\u0000\u0000\u0000>\u00f0\u0001\u0000\u0000\u0000@\u00f2"+
		"\u0001\u0000\u0000\u0000B\u00f4\u0001\u0000\u0000\u0000D\u00f6\u0001\u0000"+
		"\u0000\u0000F\u00f8\u0001\u0000\u0000\u0000H\u00fa\u0001\u0000\u0000\u0000"+
		"J\u00fc\u0001\u0000\u0000\u0000L\u00fe\u0001\u0000\u0000\u0000N\u0100"+
		"\u0001\u0000\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0000\u0000\u0001W\u0001\u0001\u0000\u0000\u0000Xr\u0003\"\u0011\u0000"+
		"Yr\u0003&\u0013\u0000Zr\u0003(\u0014\u0000[r\u0003$\u0012\u0000\\r\u0003"+
		"\u0006\u0003\u0000]r\u0003\b\u0004\u0000^r\u0003\n\u0005\u0000_r\u0003"+
		".\u0017\u0000`r\u0003\f\u0006\u0000ar\u00034\u001a\u0000br\u00032\u0019"+
		"\u0000cr\u0003\u000e\u0007\u0000dr\u00036\u001b\u0000er\u0003\u0010\b"+
		"\u0000fr\u0003:\u001d\u0000gr\u0003\u0012\t\u0000hr\u0003\u0014\n\u0000"+
		"ir\u0003\u0016\u000b\u0000jr\u0003\u0018\f\u0000kr\u0003F#\u0000lr\u0003"+
		"\u001a\r\u0000mr\u0003\u001c\u000e\u0000nr\u0003J%\u0000or\u0003L&\u0000"+
		"pr\u0003N\'\u0000qX\u0001\u0000\u0000\u0000qY\u0001\u0000\u0000\u0000"+
		"qZ\u0001\u0000\u0000\u0000q[\u0001\u0000\u0000\u0000q\\\u0001\u0000\u0000"+
		"\u0000q]\u0001\u0000\u0000\u0000q^\u0001\u0000\u0000\u0000q_\u0001\u0000"+
		"\u0000\u0000q`\u0001\u0000\u0000\u0000qa\u0001\u0000\u0000\u0000qb\u0001"+
		"\u0000\u0000\u0000qc\u0001\u0000\u0000\u0000qd\u0001\u0000\u0000\u0000"+
		"qe\u0001\u0000\u0000\u0000qf\u0001\u0000\u0000\u0000qg\u0001\u0000\u0000"+
		"\u0000qh\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000\u0000qj\u0001\u0000"+
		"\u0000\u0000qk\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000qm\u0001"+
		"\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000r\u0003\u0001\u0000\u0000\u0000sv\u0003$\u0012"+
		"\u0000tv\u0003L&\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"v\u0005\u0001\u0000\u0000\u0000wx\u0003*\u0015\u0000xy\u0005\u0006\u0000"+
		"\u0000yz\u0005\t\u0000\u0000z\u0007\u0001\u0000\u0000\u0000{|\u0005\u0001"+
		"\u0000\u0000|\t\u0001\u0000\u0000\u0000}~\u0003,\u0016\u0000~\u007f\u0005"+
		"\u0006\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u0081\u0005"+
		"\t\u0000\u0000\u0081\u000b\u0001\u0000\u0000\u0000\u0082\u0083\u00030"+
		"\u0018\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085\u0005\u0001"+
		"\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u008b\u0005\u0001"+
		"\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u008a\u0005\u0001"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\r\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003\u001e\u000f\u0000\u0091\u0095\u0005\u0006\u0000"+
		"\u0000\u0092\u0094\u0003\u0004\u0002\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\t\u0000\u0000"+
		"\u0099\u000f\u0001\u0000\u0000\u0000\u009a\u009b\u00038\u001c\u0000\u009b"+
		"\u009c\u0005\u0006\u0000\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d"+
		"\u009e\u0005\t\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0003<\u001e\u0000\u00a0\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0001\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a8\u0005"+
		"\u0001\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a7\u0005"+
		"\u0001\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u0013\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0003>\u001f\u0000\u00ae\u00af\u0005\u0006\u0000"+
		"\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0005\t\u0000\u0000"+
		"\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003B!\u0000\u00b3\u00b4"+
		"\u0005\u0006\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0003\u0000\u0000\u00b6\u00b7\u0007\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\t\u0000\u0000\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003"+
		"D\"\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0005\u0001"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00c2\u0005\u0001"+
		"\u0000\u0000\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c0\u0005\u0001"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0002\u0000\u0000\u00c1\u00c3\u0005\u0001"+
		"\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\t\u0000"+
		"\u0000\u00c5\u0019\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u000b\u0000"+
		"\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u001e\u000f"+
		"\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cb\u0007\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005\t\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d1\u0003 \u0010\u0000\u00ce\u00d1\u0003@ \u0000\u00cf\u00d1"+
		"\u0003H$\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u001f\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\r\u0000\u0000\u00d3!\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u000e\u0000\u0000\u00d5#\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7%\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005\u0010\u0000\u0000\u00d9\'\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\u0011\u0000\u0000\u00db)\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0012\u0000\u0000\u00dd+\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0013"+
		"\u0000\u0000\u00df-\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0014\u0000"+
		"\u0000\u00e1/\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0015\u0000\u0000"+
		"\u00e31\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0016\u0000\u0000\u00e5"+
		"3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0017\u0000\u0000\u00e75\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u0018\u0000\u0000\u00e97\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0019\u0000\u0000\u00eb9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\u001a\u0000\u0000\u00ed;\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0005\u001b\u0000\u0000\u00ef=\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u001c\u0000\u0000\u00f1?\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005\u001d\u0000\u0000\u00f3A\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\u001e\u0000\u0000\u00f5C\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u001f"+
		"\u0000\u0000\u00f7E\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005 \u0000\u0000"+
		"\u00f9G\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005!\u0000\u0000\u00fbI"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\"\u0000\u0000\u00fdK\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005#\u0000\u0000\u00ffM\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\t\u0000\u0000\u0000\u0101O\u0001\u0000\u0000\u0000"+
		"\bSqu\u008b\u0095\u00a8\u00c2\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}