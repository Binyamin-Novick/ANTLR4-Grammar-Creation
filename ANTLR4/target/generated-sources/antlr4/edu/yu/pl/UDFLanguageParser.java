// Generated from java-escape by ANTLR 4.11.1
package edu.yu.pl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UDFLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DASH=8, ND=9, 
		AND=10, OR=11, IF=12, JION=13, TRUE_CONSTANT=14, False_CONSTANT=15, STR=16, 
		FIELD_NAME=17, NUMBER_CONSTANT=18, STRING_CONSTANT=19, GT=20, GE=21, LT=22, 
		LE=23, NOT=24, COMMENT=25, WHITE_SPACE=26;
	public static final int
		RULE_userField = 0, RULE_booExpr = 1, RULE_numExpr = 2, RULE_strExpr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"userField", "booExpr", "numExpr", "strExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'ABS'", "','", "'-'", "'\\'", 
			"'AND'", "'OR'", "'IF('", "'JION('", null, null, "'STR('", null, null, 
			null, "'>'", "'>='", "'<'", "'<='", "'NOT('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DASH", "ND", "AND", 
			"OR", "IF", "JION", "TRUE_CONSTANT", "False_CONSTANT", "STR", "FIELD_NAME", 
			"NUMBER_CONSTANT", "STRING_CONSTANT", "GT", "GE", "LT", "LE", "NOT", 
			"COMMENT", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UDFLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserFieldContext extends ParserRuleContext {
		public UserFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userField; }
	 
		public UserFieldContext() { }
		public void copyFrom(UserFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndOfInputContext extends UserFieldContext {
		public TerminalNode EOF() { return getToken(UDFLanguageParser.EOF, 0); }
		public EndOfInputContext(UserFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterEndOfInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitEndOfInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitEndOfInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumExpressionContext extends UserFieldContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public NumExpressionContext(UserFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterNumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitNumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitNumExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InContext extends UserFieldContext {
		public UserFieldContext t;
		public UserFieldContext userField() {
			return getRuleContext(UserFieldContext.class,0);
		}
		public InContext(UserFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrExpressionContext extends UserFieldContext {
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public StrExpressionContext(UserFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterStrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitStrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitStrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooExpressionContext extends UserFieldContext {
		public BooExprContext booExpr() {
			return getRuleContext(BooExprContext.class,0);
		}
		public BooExpressionContext(UserFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterBooExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitBooExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitBooExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserFieldContext userField() throws RecognitionException {
		UserFieldContext _localctx = new UserFieldContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_userField);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new InContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(T__0);
				setState(9);
				((InContext)_localctx).t = userField();
				setState(10);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				numExpr(0);
				}
				break;
			case 3:
				_localctx = new BooExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				booExpr(0);
				}
				break;
			case 4:
				_localctx = new StrExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(14);
				strExpr(0);
				}
				break;
			case 5:
				_localctx = new EndOfInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(EOF);
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
	public static class BooExprContext extends ParserRuleContext {
		public BooExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booExpr; }
	 
		public BooExprContext() { }
		public void copyFrom(BooExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends BooExprContext {
		public TerminalNode NOT() { return getToken(UDFLanguageParser.NOT, 0); }
		public BooExprContext booExpr() {
			return getRuleContext(BooExprContext.class,0);
		}
		public NotContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends BooExprContext {
		public NumExprContext left;
		public NumExprContext right;
		public TerminalNode LT() { return getToken(UDFLanguageParser.LT, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public LessThanContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BooExprContext {
		public BooExprContext left;
		public BooExprContext right;
		public TerminalNode OR() { return getToken(UDFLanguageParser.OR, 0); }
		public List<BooExprContext> booExpr() {
			return getRuleContexts(BooExprContext.class);
		}
		public BooExprContext booExpr(int i) {
			return getRuleContext(BooExprContext.class,i);
		}
		public OrContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanContext extends BooExprContext {
		public NumExprContext left;
		public NumExprContext right;
		public TerminalNode GT() { return getToken(UDFLanguageParser.GT, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public GreaterThanContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueConstantContext extends BooExprContext {
		public TerminalNode TRUE_CONSTANT() { return getToken(UDFLanguageParser.TRUE_CONSTANT, 0); }
		public TrueConstantContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterTrueConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitTrueConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitTrueConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BooExprContext {
		public BooExprContext left;
		public BooExprContext right;
		public TerminalNode AND() { return getToken(UDFLanguageParser.AND, 0); }
		public List<BooExprContext> booExpr() {
			return getRuleContexts(BooExprContext.class);
		}
		public BooExprContext booExpr(int i) {
			return getRuleContext(BooExprContext.class,i);
		}
		public AndContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterOrEqualsContext extends BooExprContext {
		public NumExprContext left;
		public NumExprContext right;
		public TerminalNode GE() { return getToken(UDFLanguageParser.GE, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public GreaterOrEqualsContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterGreaterOrEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitGreaterOrEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitGreaterOrEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessOrEqualsContext extends BooExprContext {
		public NumExprContext left;
		public NumExprContext right;
		public TerminalNode LE() { return getToken(UDFLanguageParser.LE, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public LessOrEqualsContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterLessOrEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitLessOrEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitLessOrEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseConstantContext extends BooExprContext {
		public TerminalNode False_CONSTANT() { return getToken(UDFLanguageParser.False_CONSTANT, 0); }
		public FalseConstantContext(BooExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterFalseConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitFalseConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitFalseConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooExprContext booExpr() throws RecognitionException {
		return booExpr(0);
	}

	private BooExprContext booExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooExprContext _localctx = new BooExprContext(_ctx, _parentState);
		BooExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_booExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(NOT);
				setState(20);
				booExpr(0);
				setState(21);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new GreaterThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				((GreaterThanContext)_localctx).left = numExpr(0);
				setState(24);
				match(GT);
				setState(25);
				((GreaterThanContext)_localctx).right = numExpr(0);
				}
				break;
			case 3:
				{
				_localctx = new GreaterOrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				((GreaterOrEqualsContext)_localctx).left = numExpr(0);
				setState(28);
				match(GE);
				setState(29);
				((GreaterOrEqualsContext)_localctx).right = numExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new LessThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				((LessThanContext)_localctx).left = numExpr(0);
				setState(32);
				match(LT);
				setState(33);
				((LessThanContext)_localctx).right = numExpr(0);
				}
				break;
			case 5:
				{
				_localctx = new LessOrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				((LessOrEqualsContext)_localctx).left = numExpr(0);
				setState(36);
				match(LE);
				setState(37);
				((LessOrEqualsContext)_localctx).right = numExpr(0);
				}
				break;
			case 6:
				{
				_localctx = new TrueConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(TRUE_CONSTANT);
				}
				break;
			case 7:
				{
				_localctx = new FalseConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(False_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BooExprContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booExpr);
						setState(43);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(44);
						match(AND);
						setState(45);
						((AndContext)_localctx).right = booExpr(9);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BooExprContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booExpr);
						setState(46);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(47);
						match(OR);
						setState(48);
						((OrContext)_localctx).right = booExpr(8);
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumExprContext extends ParserRuleContext {
		public NumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpr; }
	 
		public NumExprContext() { }
		public void copyFrom(NumExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensNumExprContext extends NumExprContext {
		public NumExprContext k;
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ParensNumExprContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterParensNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitParensNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitParensNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumFieldContext extends NumExprContext {
		public TerminalNode FIELD_NAME() { return getToken(UDFLanguageParser.FIELD_NAME, 0); }
		public NumFieldContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterNumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitNumField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitNumField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends NumExprContext {
		public NumExprContext left;
		public Token op;
		public NumExprContext right;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public MulDivContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends NumExprContext {
		public NumExprContext left;
		public Token op;
		public NumExprContext right;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode DASH() { return getToken(UDFLanguageParser.DASH, 0); }
		public AddSubContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AbsValueContext extends NumExprContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public AbsValueContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterAbsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitAbsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitAbsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegNumExprContext extends NumExprContext {
		public NumExprContext n;
		public TerminalNode DASH() { return getToken(UDFLanguageParser.DASH, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public NegNumExprContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterNegNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitNegNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitNegNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumConstantContext extends NumExprContext {
		public TerminalNode NUMBER_CONSTANT() { return getToken(UDFLanguageParser.NUMBER_CONSTANT, 0); }
		public NumConstantContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterNumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitNumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitNumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExprContext numExpr() throws RecognitionException {
		return numExpr(0);
	}

	private NumExprContext numExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExprContext _localctx = new NumExprContext(_ctx, _parentState);
		NumExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_numExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParensNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				match(T__0);
				setState(56);
				((ParensNumExprContext)_localctx).k = numExpr(0);
				setState(57);
				match(T__1);
				}
				break;
			case DASH:
				{
				_localctx = new NegNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(DASH);
				setState(60);
				((NegNumExprContext)_localctx).n = numExpr(6);
				}
				break;
			case T__5:
				{
				_localctx = new AbsValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__5);
				setState(62);
				match(T__0);
				setState(63);
				numExpr(0);
				setState(64);
				match(T__1);
				}
				break;
			case NUMBER_CONSTANT:
				{
				_localctx = new NumConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(NUMBER_CONSTANT);
				}
				break;
			case FIELD_NAME:
				{
				_localctx = new NumFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(FIELD_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(70);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(71);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(72);
						((MulDivContext)_localctx).right = numExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(73);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(74);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==DASH) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						((AddSubContext)_localctx).right = numExpr(5);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrExprContext extends ParserRuleContext {
		public StrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExpr; }
	 
		public StrExprContext() { }
		public void copyFrom(StrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends StrExprContext {
		public StrExprContext left;
		public StrExprContext right;
		public List<StrExprContext> strExpr() {
			return getRuleContexts(StrExprContext.class);
		}
		public StrExprContext strExpr(int i) {
			return getRuleContext(StrExprContext.class,i);
		}
		public ConcatContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrFieldContext extends StrExprContext {
		public Token t;
		public TerminalNode FIELD_NAME() { return getToken(UDFLanguageParser.FIELD_NAME, 0); }
		public StrFieldContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterStrField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitStrField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitStrField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToStringContext extends StrExprContext {
		public TerminalNode STR() { return getToken(UDFLanguageParser.STR, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ToStringContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitToString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JionContext extends StrExprContext {
		public Token bnt;
		public StrExprContext st;
		public TerminalNode JION() { return getToken(UDFLanguageParser.JION, 0); }
		public TerminalNode ND() { return getToken(UDFLanguageParser.ND, 0); }
		public TerminalNode DASH() { return getToken(UDFLanguageParser.DASH, 0); }
		public List<StrExprContext> strExpr() {
			return getRuleContexts(StrExprContext.class);
		}
		public StrExprContext strExpr(int i) {
			return getRuleContext(StrExprContext.class,i);
		}
		public JionContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterJion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitJion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitJion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StrExprContext {
		public BooExprContext co;
		public StrExprContext op1;
		public StrExprContext op2;
		public TerminalNode IF() { return getToken(UDFLanguageParser.IF, 0); }
		public BooExprContext booExpr() {
			return getRuleContext(BooExprContext.class,0);
		}
		public List<StrExprContext> strExpr() {
			return getRuleContexts(StrExprContext.class);
		}
		public StrExprContext strExpr(int i) {
			return getRuleContext(StrExprContext.class,i);
		}
		public IfContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensStrExprContext extends StrExprContext {
		public StrExprContext meet;
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public ParensStrExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterParensStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitParensStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitParensStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrConstantContext extends StrExprContext {
		public Token v;
		public TerminalNode STRING_CONSTANT() { return getToken(UDFLanguageParser.STRING_CONSTANT, 0); }
		public StrConstantContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).enterStrConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDFLanguageListener ) ((UDFLanguageListener)listener).exitStrConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UDFLanguageVisitor ) return ((UDFLanguageVisitor<? extends T>)visitor).visitStrConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrExprContext strExpr() throws RecognitionException {
		return strExpr(0);
	}

	private StrExprContext strExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StrExprContext _localctx = new StrExprContext(_ctx, _parentState);
		StrExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_strExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JION:
				{
				_localctx = new JionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(JION);
				setState(83);
				((JionContext)_localctx).bnt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==ND) ) {
					((JionContext)_localctx).bnt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(84);
					match(T__6);
					setState(85);
					((JionContext)_localctx).st = strExpr(0);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__1);
				}
				break;
			case IF:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(IF);
				setState(93);
				((IfContext)_localctx).co = booExpr(0);
				setState(94);
				match(T__6);
				setState(95);
				((IfContext)_localctx).op1 = strExpr(0);
				setState(96);
				match(T__6);
				setState(97);
				((IfContext)_localctx).op2 = strExpr(0);
				setState(98);
				match(T__1);
				}
				break;
			case T__0:
				{
				_localctx = new ParensStrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(T__0);
				setState(101);
				((ParensStrExprContext)_localctx).meet = strExpr(0);
				setState(102);
				match(T__1);
				}
				break;
			case STR:
				{
				_localctx = new ToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(STR);
				setState(105);
				numExpr(0);
				setState(106);
				match(T__1);
				}
				break;
			case STRING_CONSTANT:
				{
				_localctx = new StrConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((StrConstantContext)_localctx).v = match(STRING_CONSTANT);
				}
				break;
			case FIELD_NAME:
				{
				_localctx = new StrFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				((StrFieldContext)_localctx).t = match(FIELD_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new StrExprContext(_parentctx, _parentState));
					((ConcatContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_strExpr);
					setState(112);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(113);
					match(T__4);
					setState(114);
					((ConcatContext)_localctx).right = strExpr(6);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return booExpr_sempred((BooExprContext)_localctx, predIndex);
		case 2:
			return numExpr_sempred((NumExprContext)_localctx, predIndex);
		case 3:
			return strExpr_sempred((StrExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booExpr_sempred(BooExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean strExpr_sempred(StrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ay\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00012\b\u0001\n\u0001\f\u00015\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002M\b"+
		"\u0002\n\u0002\f\u0002P\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003t\b\u0003\n\u0003\f\u0003w\t\u0003\u0001\u0003\u0000\u0003\u0002"+
		"\u0004\u0006\u0004\u0000\u0002\u0004\u0006\u0000\u0003\u0001\u0000\u0003"+
		"\u0004\u0002\u0000\u0005\u0005\b\b\u0001\u0000\b\t\u008d\u0000\u0010\u0001"+
		"\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000"+
		"\u0000\u0006n\u0001\u0000\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t\n"+
		"\u0003\u0000\u0000\u0000\n\u000b\u0005\u0002\u0000\u0000\u000b\u0011\u0001"+
		"\u0000\u0000\u0000\f\u0011\u0003\u0004\u0002\u0000\r\u0011\u0003\u0002"+
		"\u0001\u0000\u000e\u0011\u0003\u0006\u0003\u0000\u000f\u0011\u0005\u0000"+
		"\u0000\u0001\u0010\b\u0001\u0000\u0000\u0000\u0010\f\u0001\u0000\u0000"+
		"\u0000\u0010\r\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0006\u0001\uffff\uffff\u0000\u0013\u0014\u0005\u0018\u0000"+
		"\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\u0002\u0000"+
		"\u0000\u0016*\u0001\u0000\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000"+
		"\u0018\u0019\u0005\u0014\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000"+
		"\u001a*\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c"+
		"\u001d\u0005\u0015\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e"+
		"*\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !\u0005\u0016"+
		"\u0000\u0000!\"\u0003\u0004\u0002\u0000\"*\u0001\u0000\u0000\u0000#$\u0003"+
		"\u0004\u0002\u0000$%\u0005\u0017\u0000\u0000%&\u0003\u0004\u0002\u0000"+
		"&*\u0001\u0000\u0000\u0000\'*\u0005\u000e\u0000\u0000(*\u0005\u000f\u0000"+
		"\u0000)\u0012\u0001\u0000\u0000\u0000)\u0017\u0001\u0000\u0000\u0000)"+
		"\u001b\u0001\u0000\u0000\u0000)\u001f\u0001\u0000\u0000\u0000)#\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*3\u0001\u0000\u0000\u0000+,\n\b\u0000\u0000,-\u0005\n\u0000\u0000-2\u0003"+
		"\u0002\u0001\t./\n\u0007\u0000\u0000/0\u0005\u000b\u0000\u000002\u0003"+
		"\u0002\u0001\b1+\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"4\u0003\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0006\u0002"+
		"\uffff\uffff\u000078\u0005\u0001\u0000\u000089\u0003\u0004\u0002\u0000"+
		"9:\u0005\u0002\u0000\u0000:E\u0001\u0000\u0000\u0000;<\u0005\b\u0000\u0000"+
		"<E\u0003\u0004\u0002\u0006=>\u0005\u0006\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u0002\u0000\u0000AE\u0001\u0000"+
		"\u0000\u0000BE\u0005\u0012\u0000\u0000CE\u0005\u0011\u0000\u0000D6\u0001"+
		"\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EN\u0001\u0000\u0000"+
		"\u0000FG\n\u0005\u0000\u0000GH\u0007\u0000\u0000\u0000HM\u0003\u0004\u0002"+
		"\u0006IJ\n\u0004\u0000\u0000JK\u0007\u0001\u0000\u0000KM\u0003\u0004\u0002"+
		"\u0005LF\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0005"+
		"\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0006\u0003\uffff"+
		"\uffff\u0000RS\u0005\r\u0000\u0000SX\u0007\u0002\u0000\u0000TU\u0005\u0007"+
		"\u0000\u0000UW\u0003\u0006\u0003\u0000VT\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[o\u0005\u0002\u0000"+
		"\u0000\\]\u0005\f\u0000\u0000]^\u0003\u0002\u0001\u0000^_\u0005\u0007"+
		"\u0000\u0000_`\u0003\u0006\u0003\u0000`a\u0005\u0007\u0000\u0000ab\u0003"+
		"\u0006\u0003\u0000bc\u0005\u0002\u0000\u0000co\u0001\u0000\u0000\u0000"+
		"de\u0005\u0001\u0000\u0000ef\u0003\u0006\u0003\u0000fg\u0005\u0002\u0000"+
		"\u0000go\u0001\u0000\u0000\u0000hi\u0005\u0010\u0000\u0000ij\u0003\u0004"+
		"\u0002\u0000jk\u0005\u0002\u0000\u0000ko\u0001\u0000\u0000\u0000lo\u0005"+
		"\u0013\u0000\u0000mo\u0005\u0011\u0000\u0000nQ\u0001\u0000\u0000\u0000"+
		"n\\\u0001\u0000\u0000\u0000nd\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000ou\u0001\u0000"+
		"\u0000\u0000pq\n\u0005\u0000\u0000qr\u0005\u0005\u0000\u0000rt\u0003\u0006"+
		"\u0003\u0006sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0007\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000\n\u0010)13DLNXnu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}