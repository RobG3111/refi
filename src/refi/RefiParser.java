// Generated from C:/Users/robg3/workspace/refi/src/refi/RefiParser.g4 by ANTLR 4.13.1

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
		ANY=14, ANYWILD=15, BACKTICK=16, BELL=17, BOL=18, CAPTURE=19, CASEINS=20, 
		CASEINSOFF=21, COMMENTS=22, CTRL=23, DIGIT=24, DOTALL=25, EITHER=26, ESCAPE=27, 
		EOL=28, FLAGS=29, FORMFEED=30, HEX=31, MULTILINE=32, NEWLINE=33, NONDIGIT=34, 
		NOT=35, OCTAL=36, OPTIONAL=37, OR=38, RANGE=39, RETURN=40, SOME=41, TAB=42, 
		UNICODECASE=43, UNIXLINES=44, WILD=45, WORDBOUNDARY=46, ZZ=47;
	public static final int
		RULE_expression = 0, RULE_backeted_matcher = 1, RULE_matcher = 2, RULE_literal_matcher = 3, 
		RULE_capture_matcher = 4, RULE_caseins = 5, RULE_caseinsoff = 6, RULE_char = 7, 
		RULE_ctrl_matcher = 8, RULE_either_matcher = 9, RULE_expr_param_matcher = 10, 
		RULE_flags = 11, RULE_hex_matcher = 12, RULE_nondigit = 13, RULE_not_matcher = 14, 
		RULE_octal_matcher = 15, RULE_or_matcher = 16, RULE_range_matcher = 17, 
		RULE_string = 18, RULE_function_matcher = 19, RULE_matcher_name = 20, 
		RULE_anywild = 21, RULE_backtick = 22, RULE_bell = 23, RULE_bol = 24, 
		RULE_digit = 25, RULE_escape = 26, RULE_eol = 27, RULE_flagname = 28, 
		RULE_formfeed = 29, RULE_newline = 30, RULE_return = 31, RULE_tab = 32, 
		RULE_unicodecase = 33, RULE_unixlines = 34, RULE_wild = 35, RULE_wordboundary = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "backeted_matcher", "matcher", "literal_matcher", "capture_matcher", 
			"caseins", "caseinsoff", "char", "ctrl_matcher", "either_matcher", "expr_param_matcher", 
			"flags", "hex_matcher", "nondigit", "not_matcher", "octal_matcher", "or_matcher", 
			"range_matcher", "string", "function_matcher", "matcher_name", "anywild", 
			"backtick", "bell", "bol", "digit", "escape", "eol", "flagname", "formfeed", 
			"newline", "return", "tab", "unicodecase", "unixlines", "wild", "wordboundary"
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
			"ANY", "ANYWILD", "BACKTICK", "BELL", "BOL", "CAPTURE", "CASEINS", "CASEINSOFF", 
			"COMMENTS", "CTRL", "DIGIT", "DOTALL", "EITHER", "ESCAPE", "EOL", "FLAGS", 
			"FORMFEED", "HEX", "MULTILINE", "NEWLINE", "NONDIGIT", "NOT", "OCTAL", 
			"OPTIONAL", "OR", "RANGE", "RETURN", "SOME", "TAB", "UNICODECASE", "UNIXLINES", 
			"WILD", "WORDBOUNDARY", "ZZ"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				matcher();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 140733155625090L) != 0) );
			setState(79);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterBacketed_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitBacketed_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitBacketed_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backeted_matcherContext backeted_matcher() throws RecognitionException {
		Backeted_matcherContext _localctx = new Backeted_matcherContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_backeted_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LEFTPAREN);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				matcher();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 140733155625090L) != 0) );
			setState(87);
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
		public Backeted_matcherContext backeted_matcher() {
			return getRuleContext(Backeted_matcherContext.class,0);
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
		public FlagsContext flags() {
			return getRuleContext(FlagsContext.class,0);
		}
		public Hex_matcherContext hex_matcher() {
			return getRuleContext(Hex_matcherContext.class,0);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Function_matcherContext function_matcher() {
			return getRuleContext(Function_matcherContext.class,0);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public UnicodecaseContext unicodecase() {
			return getRuleContext(UnicodecaseContext.class,0);
		}
		public UnixlinesContext unixlines() {
			return getRuleContext(UnixlinesContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitMatcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matcher);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				backeted_matcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				anywild();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				bell();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				bol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				backtick();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				capture_matcher();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				caseins();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				caseinsoff();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				char_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(98);
				ctrl_matcher();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(99);
				digit();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				either_matcher();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(101);
				eol();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(102);
				escape();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(103);
				expr_param_matcher();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(104);
				formfeed();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(105);
				flags();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(106);
				hex_matcher();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(107);
				newline();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(108);
				nondigit();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(109);
				not_matcher();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(110);
				octal_matcher();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(111);
				or_matcher();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(112);
				range_matcher();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(113);
				return_();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(114);
				string();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(115);
				function_matcher();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(116);
				tab();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(117);
				unicodecase();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(118);
				unixlines();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(119);
				wild();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(120);
				wordboundary();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterLiteral_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitLiteral_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitLiteral_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_matcherContext literal_matcher() throws RecognitionException {
		Literal_matcherContext _localctx = new Literal_matcherContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_matcher);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				backtick();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				backeted_matcher();
				}
				break;
			case WILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterCapture_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitCapture_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitCapture_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_matcherContext capture_matcher() throws RecognitionException {
		Capture_matcherContext _localctx = new Capture_matcherContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_capture_matcher);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CAPTURE);
			setState(129);
			match(LEFTCURLY);
			setState(132); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(130);
						matcher();
						}
						break;
					case 2:
						{
						setState(131);
						backeted_matcher();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(136);
				match(COMMA);
				setState(137);
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

			setState(140);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterCaseins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitCaseins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitCaseins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseinsContext caseins() throws RecognitionException {
		CaseinsContext _localctx = new CaseinsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterCaseinsoff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitCaseinsoff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitCaseinsoff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseinsoffContext caseinsoff() throws RecognitionException {
		CaseinsoffContext _localctx = new CaseinsoffContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caseinsoff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterCtrl_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitCtrl_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitCtrl_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctrl_matcherContext ctrl_matcher() throws RecognitionException {
		Ctrl_matcherContext _localctx = new Ctrl_matcherContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctrl_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CTRL);
			setState(149);
			match(LEFTCURLY);
			setState(150);
			match(INT);
			setState(151);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterEither_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitEither_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitEither_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Either_matcherContext either_matcher() throws RecognitionException {
		Either_matcherContext _localctx = new Either_matcherContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_either_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(EITHER);
			setState(154);
			match(LEFTCURLY);
			setState(155);
			match(CHAR);
			setState(156);
			match(COMMA);
			setState(157);
			match(CHAR);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				match(CHAR);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterExpr_param_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitExpr_param_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitExpr_param_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_param_matcherContext expr_param_matcher() throws RecognitionException {
		Expr_param_matcherContext _localctx = new Expr_param_matcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_param_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			matcher_name();
			setState(168);
			match(LEFTCURLY);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372154496L) != 0)) {
				{
				{
				setState(169);
				((Expr_param_matcherContext)_localctx).expr = literal_matcher();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
		public FlagnameContext name1;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitFlags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitFlags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagsContext flags() throws RecognitionException {
		FlagsContext _localctx = new FlagsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_flags);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(FLAGS);
			setState(178);
			match(LEFTCURLY);
			setState(179);
			((FlagsContext)_localctx).name1 = flagname();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					((FlagsContext)_localctx).flagname = flagname();
					((FlagsContext)_localctx).names.add(((FlagsContext)_localctx).flagname);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(187);
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
		public TerminalNode HEX() { return getToken(RefiParser.HEX, 0); }
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(RefiParser.HEX_NUMBER, 0); }
		public Hex_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterHex_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitHex_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitHex_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hex_matcherContext hex_matcher() throws RecognitionException {
		Hex_matcherContext _localctx = new Hex_matcherContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hex_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(HEX);
			setState(190);
			match(LEFTCURLY);
			setState(191);
			((Hex_matcherContext)_localctx).number = match(HEX_NUMBER);
			setState(192);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterNondigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitNondigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitNondigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NondigitContext nondigit() throws RecognitionException {
		NondigitContext _localctx = new NondigitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nondigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterNot_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitNot_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitNot_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_matcherContext not_matcher() throws RecognitionException {
		Not_matcherContext _localctx = new Not_matcherContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_not_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(NOT);
			setState(197);
			match(LEFTCURLY);
			setState(198);
			match(CHAR);
			setState(199);
			match(COMMA);
			setState(200);
			match(CHAR);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				match(CHAR);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterOctal_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitOctal_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitOctal_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_matcherContext octal_matcher() throws RecognitionException {
		Octal_matcherContext _localctx = new Octal_matcherContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_octal_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(OCTAL);
			setState(211);
			match(LEFTCURLY);
			setState(212);
			match(OCTAL_NUMBER);
			setState(213);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterOr_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitOr_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitOr_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_matcherContext or_matcher() throws RecognitionException {
		Or_matcherContext _localctx = new Or_matcherContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_or_matcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(OR);
			setState(216);
			match(LEFTCURLY);
			setState(218); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(217);
					matcher();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(222);
			match(VERTICAL);
			setState(224); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(223);
					matcher();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterRange_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitRange_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitRange_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_matcherContext range_matcher() throws RecognitionException {
		Range_matcherContext _localctx = new Range_matcherContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(RANGE);
			setState(231);
			match(LEFTCURLY);
			setState(232);
			match(CHAR);
			setState(233);
			match(COLON);
			setState(234);
			match(CHAR);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(235);
				match(COMMA);
				setState(236);
				match(CHAR);
				setState(237);
				match(COLON);
				setState(238);
				match(CHAR);
				}
			}

			setState(241);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		public TerminalNode LEFTCURLY() { return getToken(RefiParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(RefiParser.RIGHTCURLY, 0); }
		public TerminalNode STRING() { return getToken(RefiParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(RefiParser.CHAR, 0); }
		public Function_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterFunction_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitFunction_matcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitFunction_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_matcherContext function_matcher() throws RecognitionException {
		Function_matcherContext _localctx = new Function_matcherContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			matcher_name();
			setState(246);
			match(LEFTCURLY);
			setState(247);
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
			setState(248);
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
		public TerminalNode ANY() { return getToken(RefiParser.ANY, 0); }
		public TerminalNode OPTIONAL() { return getToken(RefiParser.OPTIONAL, 0); }
		public TerminalNode SOME() { return getToken(RefiParser.SOME, 0); }
		public Matcher_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterMatcher_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitMatcher_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitMatcher_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matcher_nameContext matcher_name() throws RecognitionException {
		Matcher_nameContext _localctx = new Matcher_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matcher_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2336462225408L) != 0)) ) {
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
	public static class AnywildContext extends ParserRuleContext {
		public TerminalNode ANYWILD() { return getToken(RefiParser.ANYWILD, 0); }
		public AnywildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anywild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterAnywild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitAnywild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitAnywild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnywildContext anywild() throws RecognitionException {
		AnywildContext _localctx = new AnywildContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_anywild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterBacktick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitBacktick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitBacktick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BacktickContext backtick() throws RecognitionException {
		BacktickContext _localctx = new BacktickContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_backtick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterBell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitBell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitBell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BellContext bell() throws RecognitionException {
		BellContext _localctx = new BellContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterBol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitBol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitBol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BolContext bol() throws RecognitionException {
		BolContext _localctx = new BolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
	public static class DigitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RefiParser.DIGIT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterEscape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitEscape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitEscape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapeContext escape() throws RecognitionException {
		EscapeContext _localctx = new EscapeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitEol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		public TerminalNode UNIXLINES() { return getToken(RefiParser.UNIXLINES, 0); }
		public FlagnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterFlagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitFlagname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitFlagname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagnameContext flagname() throws RecognitionException {
		FlagnameContext _localctx = new FlagnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flagname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 26388282212352L) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterFormfeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitFormfeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitFormfeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormfeedContext formfeed() throws RecognitionException {
		FormfeedContext _localctx = new FormfeedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formfeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RefiParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(RefiParser.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterUnicodecase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitUnicodecase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitUnicodecase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnicodecaseContext unicodecase() throws RecognitionException {
		UnicodecaseContext _localctx = new UnicodecaseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unicodecase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
	public static class UnixlinesContext extends ParserRuleContext {
		public TerminalNode UNIXLINES() { return getToken(RefiParser.UNIXLINES, 0); }
		public UnixlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unixlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterUnixlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitUnixlines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitUnixlines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnixlinesContext unixlines() throws RecognitionException {
		UnixlinesContext _localctx = new UnixlinesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unixlines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
	public static class WildContext extends ParserRuleContext {
		public TerminalNode WILD() { return getToken(RefiParser.WILD, 0); }
		public WildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterWild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitWild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitWild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildContext wild() throws RecognitionException {
		WildContext _localctx = new WildContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_wild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).enterWordboundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefiParserListener ) ((RefiParserListener)listener).exitWordboundary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RefiParserVisitor ) return ((RefiParserVisitor<? extends T>)visitor).visitWordboundary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordboundaryContext wordboundary() throws RecognitionException {
		WordboundaryContext _localctx = new WordboundaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wordboundary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		"\u0004\u0001/\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0004\u0000L\b\u0000\u000b\u0000\f"+
		"\u0000M\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001T\b"+
		"\u0001\u000b\u0001\f\u0001U\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002z\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u007f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u0085\b\u0004\u000b\u0004\f\u0004\u0086\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u008b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u00ab\b\n\n\n\f\n\u00ae\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b7\b\u000b"+
		"\n\u000b\f\u000b\u00ba\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00cc"+
		"\b\u000e\n\u000e\f\u000e\u00cf\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00db\b\u0010\u000b\u0010\f\u0010\u00dc\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u00e1\b\u0010\u000b\u0010\f\u0010\u00e2"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00f0\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0004\u0086"+
		"\u00b8\u00dc\u00e2\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0003"+
		"\u0002\u0000\u0001\u0001\u000b\u000b\u0003\u0000\u000e\u000e%%))\u0002"+
		"\u0000\u0014\u0015+,\u0124\u0000K\u0001\u0000\u0000\u0000\u0002Q\u0001"+
		"\u0000\u0000\u0000\u0004y\u0001\u0000\u0000\u0000\u0006~\u0001\u0000\u0000"+
		"\u0000\b\u0080\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000"+
		"\f\u0090\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010"+
		"\u0094\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014"+
		"\u00a7\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000\u0000\u0000\u0018"+
		"\u00bd\u0001\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000\u001c"+
		"\u00c4\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d7"+
		"\u0001\u0000\u0000\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00f3\u0001"+
		"\u0000\u0000\u0000&\u00f5\u0001\u0000\u0000\u0000(\u00fa\u0001\u0000\u0000"+
		"\u0000*\u00fc\u0001\u0000\u0000\u0000,\u00fe\u0001\u0000\u0000\u0000."+
		"\u0100\u0001\u0000\u0000\u00000\u0102\u0001\u0000\u0000\u00002\u0104\u0001"+
		"\u0000\u0000\u00004\u0106\u0001\u0000\u0000\u00006\u0108\u0001\u0000\u0000"+
		"\u00008\u010a\u0001\u0000\u0000\u0000:\u010c\u0001\u0000\u0000\u0000<"+
		"\u010e\u0001\u0000\u0000\u0000>\u0110\u0001\u0000\u0000\u0000@\u0112\u0001"+
		"\u0000\u0000\u0000B\u0114\u0001\u0000\u0000\u0000D\u0116\u0001\u0000\u0000"+
		"\u0000F\u0118\u0001\u0000\u0000\u0000H\u011a\u0001\u0000\u0000\u0000J"+
		"L\u0003\u0004\u0002\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001\u0000\u0000\u0000"+
		"QS\u0005\u0007\u0000\u0000RT\u0003\u0004\u0002\u0000SR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\n\u0000\u0000X\u0003\u0001"+
		"\u0000\u0000\u0000Yz\u0003\u0002\u0001\u0000Zz\u0003*\u0015\u0000[z\u0003"+
		".\u0017\u0000\\z\u00030\u0018\u0000]z\u0003,\u0016\u0000^z\u0003\b\u0004"+
		"\u0000_z\u0003\n\u0005\u0000`z\u0003\f\u0006\u0000az\u0003\u000e\u0007"+
		"\u0000bz\u0003\u0010\b\u0000cz\u00032\u0019\u0000dz\u0003\u0012\t\u0000"+
		"ez\u00036\u001b\u0000fz\u00034\u001a\u0000gz\u0003\u0014\n\u0000hz\u0003"+
		":\u001d\u0000iz\u0003\u0016\u000b\u0000jz\u0003\u0018\f\u0000kz\u0003"+
		"<\u001e\u0000lz\u0003\u001a\r\u0000mz\u0003\u001c\u000e\u0000nz\u0003"+
		"\u001e\u000f\u0000oz\u0003 \u0010\u0000pz\u0003\"\u0011\u0000qz\u0003"+
		">\u001f\u0000rz\u0003$\u0012\u0000sz\u0003&\u0013\u0000tz\u0003@ \u0000"+
		"uz\u0003B!\u0000vz\u0003D\"\u0000wz\u0003F#\u0000xz\u0003H$\u0000yY\u0001"+
		"\u0000\u0000\u0000yZ\u0001\u0000\u0000\u0000y[\u0001\u0000\u0000\u0000"+
		"y\\\u0001\u0000\u0000\u0000y]\u0001\u0000\u0000\u0000y^\u0001\u0000\u0000"+
		"\u0000y_\u0001\u0000\u0000\u0000y`\u0001\u0000\u0000\u0000ya\u0001\u0000"+
		"\u0000\u0000yb\u0001\u0000\u0000\u0000yc\u0001\u0000\u0000\u0000yd\u0001"+
		"\u0000\u0000\u0000ye\u0001\u0000\u0000\u0000yf\u0001\u0000\u0000\u0000"+
		"yg\u0001\u0000\u0000\u0000yh\u0001\u0000\u0000\u0000yi\u0001\u0000\u0000"+
		"\u0000yj\u0001\u0000\u0000\u0000yk\u0001\u0000\u0000\u0000yl\u0001\u0000"+
		"\u0000\u0000ym\u0001\u0000\u0000\u0000yn\u0001\u0000\u0000\u0000yo\u0001"+
		"\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000"+
		"yr\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000"+
		"\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0005\u0001\u0000\u0000\u0000"+
		"{\u007f\u0003,\u0016\u0000|\u007f\u0003\u0002\u0001\u0000}\u007f\u0003"+
		"F#\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0007\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0013"+
		"\u0000\u0000\u0081\u0084\u0005\u0006\u0000\u0000\u0082\u0085\u0003\u0004"+
		"\u0002\u0000\u0083\u0085\u0003\u0002\u0001\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0003"+
		"\u0000\u0000\u0089\u008b\u0007\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\t\u0000\u0000\u008d\t\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0014\u0000\u0000\u008f\u000b\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0015\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0001\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u0096\u0005\u0006\u0000\u0000"+
		"\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098\u0005\t\u0000\u0000\u0098"+
		"\u0011\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001a\u0000\u0000\u009a"+
		"\u009b\u0005\u0006\u0000\u0000\u009b\u009c\u0005\u0001\u0000\u0000\u009c"+
		"\u009d\u0005\u0003\u0000\u0000\u009d\u00a2\u0005\u0001\u0000\u0000\u009e"+
		"\u009f\u0005\u0003\u0000\u0000\u009f\u00a1\u0005\u0001\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\t\u0000\u0000\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0003(\u0014\u0000\u00a8\u00ac\u0005\u0006\u0000\u0000\u00a9\u00ab\u0003"+
		"\u0006\u0003\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u0015\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u001d\u0000\u0000\u00b2\u00b3\u0005\u0006"+
		"\u0000\u0000\u00b3\u00b8\u00038\u001c\u0000\u00b4\u00b5\u0005\u0003\u0000"+
		"\u0000\u00b5\u00b7\u00038\u001c\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc"+
		"\u0017\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be"+
		"\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0"+
		"\u00c1\u0005\t\u0000\u0000\u00c1\u0019\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005\"\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"#\u0000\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6\u00c7\u0005\u0001"+
		"\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u00cd\u0005\u0001"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca\u00cc\u0005\u0001"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u001d\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005$\u0000\u0000\u00d3\u00d4\u0005\u0006\u0000\u0000"+
		"\u00d4\u00d5\u0005\b\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6"+
		"\u001f\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005&\u0000\u0000\u00d8\u00da"+
		"\u0005\u0006\u0000\u0000\u00d9\u00db\u0003\u0004\u0002\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0005\f\u0000\u0000\u00df\u00e1\u0003"+
		"\u0004\u0002\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\t\u0000\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\'\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00e9\u0005\u0001\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0002\u0000\u0000\u00ea\u00ef\u0005\u0001\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\u0001\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000\u00ee\u00f0\u0005\u0001\u0000"+
		"\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\t\u0000\u0000"+
		"\u00f2#\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u000b\u0000\u0000\u00f4"+
		"%\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003(\u0014\u0000\u00f6\u00f7\u0005"+
		"\u0006\u0000\u0000\u00f7\u00f8\u0007\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\t\u0000\u0000\u00f9\'\u0001\u0000\u0000\u0000\u00fa\u00fb\u0007\u0001"+
		"\u0000\u0000\u00fb)\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u000f\u0000"+
		"\u0000\u00fd+\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0010\u0000\u0000"+
		"\u00ff-\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0011\u0000\u0000\u0101"+
		"/\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0012\u0000\u0000\u01031\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005\u0018\u0000\u0000\u01053\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005\u001b\u0000\u0000\u01075\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u001c\u0000\u0000\u01097\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0007\u0002\u0000\u0000\u010b9\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\u001e\u0000\u0000\u010d;\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0005!\u0000\u0000\u010f=\u0001\u0000\u0000\u0000\u0110\u0111\u0005("+
		"\u0000\u0000\u0111?\u0001\u0000\u0000\u0000\u0112\u0113\u0005*\u0000\u0000"+
		"\u0113A\u0001\u0000\u0000\u0000\u0114\u0115\u0005+\u0000\u0000\u0115C"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005,\u0000\u0000\u0117E\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005-\u0000\u0000\u0119G\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005.\u0000\u0000\u011bI\u0001\u0000\u0000\u0000\u000eM"+
		"Uy~\u0084\u0086\u008a\u00a2\u00ac\u00b8\u00cd\u00dc\u00e2\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}