// Generated from cs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, ID=35, NUMBER=36, STRING=37, BOOL=38, WS=39, 
		LINE_COMMENT=40, BLOCK_COMMENT=41;
	public static final int
		RULE_programa = 0, RULE_classe = 1, RULE_membroClasse = 2, RULE_metodo = 3, 
		RULE_parametroLista = 4, RULE_parametro = 5, RULE_variavel = 6, RULE_bloco = 7, 
		RULE_instrucao = 8, RULE_atribuicao = 9, RULE_ifInstrucao = 10, RULE_whileInstrucao = 11, 
		RULE_forInstrucao = 12, RULE_forInit = 13, RULE_forUpdate = 14, RULE_retorno = 15, 
		RULE_chamadaMetodo = 16, RULE_argumentoLista = 17, RULE_expressao = 18, 
		RULE_logicoOu = 19, RULE_logicoE = 20, RULE_igualdade = 21, RULE_comparacao = 22, 
		RULE_soma = 23, RULE_termo = 24, RULE_fator = 25, RULE_primario = 26, 
		RULE_acesso = 27, RULE_thisRef = 28, RULE_tipo = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "classe", "membroClasse", "metodo", "parametroLista", "parametro", 
			"variavel", "bloco", "instrucao", "atribuicao", "ifInstrucao", "whileInstrucao", 
			"forInstrucao", "forInit", "forUpdate", "retorno", "chamadaMetodo", "argumentoLista", 
			"expressao", "logicoOu", "logicoE", "igualdade", "comparacao", "soma", 
			"termo", "fator", "primario", "acesso", "thisRef", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "','", "'='", "';'", "'if'", 
			"'else'", "'while'", "'for'", "'return'", "'||'", "'&&'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
			"'.'", "'this'", "'int'", "'float'", "'bool'", "'string'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUMBER", "STRING", "BOOL", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "cs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csParser.EOF, 0); }
		public List<ClasseContext> classe() {
			return getRuleContexts(ClasseContext.class);
		}
		public ClasseContext classe(int i) {
			return getRuleContext(ClasseContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(60);
				classe();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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

	public static class ClasseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public List<MembroClasseContext> membroClasse() {
			return getRuleContexts(MembroClasseContext.class);
		}
		public MembroClasseContext membroClasse(int i) {
			return getRuleContext(MembroClasseContext.class,i);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(ID);
			setState(70);
			match(T__1);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				{
				setState(71);
				membroClasse();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__2);
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

	public static class MembroClasseContext extends ParserRuleContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MembroClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membroClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterMembroClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitMembroClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitMembroClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembroClasseContext membroClasse() throws RecognitionException {
		MembroClasseContext _localctx = new MembroClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_membroClasse);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				metodo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				variavel();
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

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			tipo();
			setState(84);
			match(ID);
			setState(85);
			match(T__3);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				setState(86);
				parametroLista();
				}
			}

			setState(89);
			match(T__4);
			setState(90);
			bloco();
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

	public static class ParametroListaContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametroListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterParametroLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitParametroLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitParametroLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			parametro();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(93);
				match(T__5);
				setState(94);
				parametro();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			tipo();
			setState(101);
			match(ID);
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

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			tipo();
			setState(104);
			match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(105);
				match(T__6);
				setState(106);
				expressao();
				}
			}

			setState(109);
			match(T__7);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__1);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				{
				setState(112);
				instrucao();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__2);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public IfInstrucaoContext ifInstrucao() {
			return getRuleContext(IfInstrucaoContext.class,0);
		}
		public WhileInstrucaoContext whileInstrucao() {
			return getRuleContext(WhileInstrucaoContext.class,0);
		}
		public ForInstrucaoContext forInstrucao() {
			return getRuleContext(ForInstrucaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucao);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				atribuicao();
				setState(122);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				chamadaMetodo();
				setState(125);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				retorno();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				ifInstrucao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				whileInstrucao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				forInstrucao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				bloco();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AcessoContext acesso() {
			return getRuleContext(AcessoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			acesso();
			setState(135);
			match(T__6);
			setState(136);
			expressao();
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

	public static class IfInstrucaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public IfInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterIfInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitIfInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitIfInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInstrucaoContext ifInstrucao() throws RecognitionException {
		IfInstrucaoContext _localctx = new IfInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifInstrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__8);
			setState(139);
			match(T__3);
			setState(140);
			expressao();
			setState(141);
			match(T__4);
			setState(142);
			instrucao();
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(143);
				match(T__9);
				setState(144);
				instrucao();
				}
				break;
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

	public static class WhileInstrucaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public WhileInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterWhileInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitWhileInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitWhileInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileInstrucaoContext whileInstrucao() throws RecognitionException {
		WhileInstrucaoContext _localctx = new WhileInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileInstrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__10);
			setState(148);
			match(T__3);
			setState(149);
			expressao();
			setState(150);
			match(T__4);
			setState(151);
			instrucao();
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

	public static class ForInstrucaoContext extends ParserRuleContext {
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInstrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterForInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitForInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitForInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInstrucaoContext forInstrucao() throws RecognitionException {
		ForInstrucaoContext _localctx = new ForInstrucaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forInstrucao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__11);
			setState(154);
			match(T__3);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				setState(155);
				forInit();
				}
			}

			setState(158);
			match(T__7);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << ID) | (1L << NUMBER) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(159);
				expressao();
				}
			}

			setState(162);
			match(T__7);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==ID) {
				{
				setState(163);
				forUpdate();
				}
			}

			setState(166);
			match(T__4);
			setState(167);
			instrucao();
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

	public static class ForInitContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forInit);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				atribuicao();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			atribuicao();
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

	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__12);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << ID) | (1L << NUMBER) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(176);
				expressao();
				}
			}

			setState(179);
			match(T__7);
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

	public static class ChamadaMetodoContext extends ParserRuleContext {
		public AcessoContext acesso() {
			return getRuleContext(AcessoContext.class,0);
		}
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public ChamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterChamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitChamadaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitChamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			acesso();
			setState(182);
			match(T__3);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << ID) | (1L << NUMBER) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(183);
				argumentoLista();
				}
			}

			setState(186);
			match(T__4);
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

	public static class ArgumentoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterArgumentoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitArgumentoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitArgumentoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoListaContext argumentoLista() throws RecognitionException {
		ArgumentoListaContext _localctx = new ArgumentoListaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expressao();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(189);
				match(T__5);
				setState(190);
				expressao();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public LogicoOuContext logicoOu() {
			return getRuleContext(LogicoOuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			logicoOu();
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

	public static class LogicoOuContext extends ParserRuleContext {
		public List<LogicoEContext> logicoE() {
			return getRuleContexts(LogicoEContext.class);
		}
		public LogicoEContext logicoE(int i) {
			return getRuleContext(LogicoEContext.class,i);
		}
		public LogicoOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterLogicoOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitLogicoOu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitLogicoOu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoOuContext logicoOu() throws RecognitionException {
		LogicoOuContext _localctx = new LogicoOuContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicoOu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			logicoE();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(199);
				match(T__13);
				setState(200);
				logicoE();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LogicoEContext extends ParserRuleContext {
		public List<IgualdadeContext> igualdade() {
			return getRuleContexts(IgualdadeContext.class);
		}
		public IgualdadeContext igualdade(int i) {
			return getRuleContext(IgualdadeContext.class,i);
		}
		public LogicoEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterLogicoE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitLogicoE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitLogicoE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoEContext logicoE() throws RecognitionException {
		LogicoEContext _localctx = new LogicoEContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicoE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			igualdade();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(207);
				match(T__14);
				setState(208);
				igualdade();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IgualdadeContext extends ParserRuleContext {
		public List<ComparacaoContext> comparacao() {
			return getRuleContexts(ComparacaoContext.class);
		}
		public ComparacaoContext comparacao(int i) {
			return getRuleContext(ComparacaoContext.class,i);
		}
		public IgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadeContext igualdade() throws RecognitionException {
		IgualdadeContext _localctx = new IgualdadeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			comparacao();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__16) {
				{
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				comparacao();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ComparacaoContext extends ParserRuleContext {
		public List<SomaContext> soma() {
			return getRuleContexts(SomaContext.class);
		}
		public SomaContext soma(int i) {
			return getRuleContext(SomaContext.class,i);
		}
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitComparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitComparacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			soma();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(223);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				soma();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SomaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			termo();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				termo();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			fator();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(239);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				fator();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FatorContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fator);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				fator();
				}
				break;
			case T__3:
			case T__28:
			case ID:
			case NUMBER:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				primario();
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

	public static class PrimarioContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(csParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(csParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(csParser.STRING, 0); }
		public AcessoContext acesso() {
			return getRuleContext(AcessoContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primario);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				acesso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				chamadaMetodo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(T__3);
				setState(257);
				expressao();
				setState(258);
				match(T__4);
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

	public static class AcessoContext extends ParserRuleContext {
		public ThisRefContext thisRef() {
			return getRuleContext(ThisRefContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(csParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(csParser.ID, i);
		}
		public AcessoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acesso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterAcesso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitAcesso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitAcesso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcessoContext acesso() throws RecognitionException {
		AcessoContext _localctx = new AcessoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_acesso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			thisRef();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(263);
				match(T__27);
				setState(264);
				match(ID);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ThisRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public ThisRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterThisRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitThisRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitThisRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisRefContext thisRef() throws RecognitionException {
		ThisRefContext _localctx = new ThisRefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_thisRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==ID) ) {
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csVisitor ) return ((csVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3"+
		"\3\3\3\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\7\6b\n\6\f\6\16\6e\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\3"+
		"\b\3\t\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0087\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16"+
		"\u009f\n\16\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\5\16\u00a7\n\16\3\16\3"+
		"\16\3\16\3\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\21\3\21\5\21\u00b4\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00bb\n\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u00c2\n\23\f\23\16\23\u00c5\13\23\3\24\3\24\3\25\3\25\3\25\7\25\u00cc"+
		"\n\25\f\25\16\25\u00cf\13\25\3\26\3\26\3\26\7\26\u00d4\n\26\f\26\16\26"+
		"\u00d7\13\26\3\27\3\27\3\27\7\27\u00dc\n\27\f\27\16\27\u00df\13\27\3\30"+
		"\3\30\3\30\7\30\u00e4\n\30\f\30\16\30\u00e7\13\30\3\31\3\31\3\31\7\31"+
		"\u00ec\n\31\f\31\16\31\u00ef\13\31\3\32\3\32\3\32\7\32\u00f4\n\32\f\32"+
		"\16\32\u00f7\13\32\3\33\3\33\3\33\5\33\u00fc\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0107\n\34\3\35\3\35\3\35\7\35\u010c\n"+
		"\35\f\35\16\35\u010f\13\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\3\2\22\23\3\2\24"+
		"\27\3\2\30\31\3\2\32\34\4\2\30\31\35\35\4\2\37\37%%\3\2 %\2\u0119\2A\3"+
		"\2\2\2\4F\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16i\3\2"+
		"\2\2\20q\3\2\2\2\22\u0086\3\2\2\2\24\u0088\3\2\2\2\26\u008c\3\2\2\2\30"+
		"\u0095\3\2\2\2\32\u009b\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2 \u00b1"+
		"\3\2\2\2\"\u00b7\3\2\2\2$\u00be\3\2\2\2&\u00c6\3\2\2\2(\u00c8\3\2\2\2"+
		"*\u00d0\3\2\2\2,\u00d8\3\2\2\2.\u00e0\3\2\2\2\60\u00e8\3\2\2\2\62\u00f0"+
		"\3\2\2\2\64\u00fb\3\2\2\2\66\u0106\3\2\2\28\u0108\3\2\2\2:\u0110\3\2\2"+
		"\2<\u0112\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD"+
		"\3\2\2\2CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FG\7\3\2\2GH\7%\2\2HL\7\4\2\2I"+
		"K\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2"+
		"OP\7\5\2\2P\5\3\2\2\2QT\5\b\5\2RT\5\16\b\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2"+
		"\2\2UV\5<\37\2VW\7%\2\2WY\7\6\2\2XZ\5\n\6\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2"+
		"\2\2[\\\7\7\2\2\\]\5\20\t\2]\t\3\2\2\2^c\5\f\7\2_`\7\b\2\2`b\5\f\7\2a"+
		"_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2fg\5<\37"+
		"\2gh\7%\2\2h\r\3\2\2\2ij\5<\37\2jm\7%\2\2kl\7\t\2\2ln\5&\24\2mk\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2op\7\n\2\2p\17\3\2\2\2qu\7\4\2\2rt\5\22\n\2sr\3"+
		"\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\5\2\2y\21"+
		"\3\2\2\2z\u0087\5\16\b\2{|\5\24\13\2|}\7\n\2\2}\u0087\3\2\2\2~\177\5\""+
		"\22\2\177\u0080\7\n\2\2\u0080\u0087\3\2\2\2\u0081\u0087\5 \21\2\u0082"+
		"\u0087\5\26\f\2\u0083\u0087\5\30\r\2\u0084\u0087\5\32\16\2\u0085\u0087"+
		"\5\20\t\2\u0086z\3\2\2\2\u0086{\3\2\2\2\u0086~\3\2\2\2\u0086\u0081\3\2"+
		"\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\23\3\2\2\2\u0088\u0089\58\35\2\u0089\u008a\7\t\2"+
		"\2\u008a\u008b\5&\24\2\u008b\25\3\2\2\2\u008c\u008d\7\13\2\2\u008d\u008e"+
		"\7\6\2\2\u008e\u008f\5&\24\2\u008f\u0090\7\7\2\2\u0090\u0093\5\22\n\2"+
		"\u0091\u0092\7\f\2\2\u0092\u0094\5\22\n\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u0097\7\6\2\2\u0097"+
		"\u0098\5&\24\2\u0098\u0099\7\7\2\2\u0099\u009a\5\22\n\2\u009a\31\3\2\2"+
		"\2\u009b\u009c\7\16\2\2\u009c\u009e\7\6\2\2\u009d\u009f\5\34\17\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\n"+
		"\2\2\u00a1\u00a3\5&\24\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\7\n\2\2\u00a5\u00a7\5\36\20\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9"+
		"\u00aa\5\22\n\2\u00aa\33\3\2\2\2\u00ab\u00ae\5\16\b\2\u00ac\u00ae\5\24"+
		"\13\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0"+
		"\5\24\13\2\u00b0\37\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b4\5&\24\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\n"+
		"\2\2\u00b6!\3\2\2\2\u00b7\u00b8\58\35\2\u00b8\u00ba\7\6\2\2\u00b9\u00bb"+
		"\5$\23\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\7\7\2\2\u00bd#\3\2\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0\7\b\2\2"+
		"\u00c0\u00c2\5&\24\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\5(\25\2\u00c7\'\3\2\2\2\u00c8\u00cd\5*\26\2\u00c9\u00ca\7\20\2"+
		"\2\u00ca\u00cc\5*\26\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d5\5,\27\2\u00d1\u00d2\7\21\2\2\u00d2\u00d4\5,\27\2\u00d3\u00d1\3"+
		"\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"+\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dd\5.\30\2\u00d9\u00da\t\2\2\2"+
		"\u00da\u00dc\5.\30\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de-\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e5\5\60\31\2\u00e1\u00e2\t\3\2\2\u00e2\u00e4\5\60\31\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"/\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ed\5\62\32\2\u00e9\u00ea\t\4\2"+
		"\2\u00ea\u00ec\5\62\32\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\61\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00f0\u00f5\5\64\33\2\u00f1\u00f2\t\5\2\2\u00f2\u00f4\5\64\33\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\63\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\t\6\2\2\u00f9\u00fc"+
		"\5\64\33\2\u00fa\u00fc\5\66\34\2\u00fb\u00f8\3\2\2\2\u00fb\u00fa\3\2\2"+
		"\2\u00fc\65\3\2\2\2\u00fd\u0107\7&\2\2\u00fe\u0107\7(\2\2\u00ff\u0107"+
		"\7\'\2\2\u0100\u0107\58\35\2\u0101\u0107\5\"\22\2\u0102\u0103\7\6\2\2"+
		"\u0103\u0104\5&\24\2\u0104\u0105\7\7\2\2\u0105\u0107\3\2\2\2\u0106\u00fd"+
		"\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0100\3\2\2\2\u0106"+
		"\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0107\67\3\2\2\2\u0108\u010d\5:\36"+
		"\2\u0109\u010a\7\36\2\2\u010a\u010c\7%\2\2\u010b\u0109\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e9\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\t\7\2\2\u0111;\3\2\2\2\u0112\u0113\t\b\2\2"+
		"\u0113=\3\2\2\2\33ALSYcmu\u0086\u0093\u009e\u00a2\u00a6\u00ad\u00b3\u00ba"+
		"\u00c3\u00cd\u00d5\u00dd\u00e5\u00ed\u00f5\u00fb\u0106\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}