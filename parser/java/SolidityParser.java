// Generated from Solidity.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, LicenseIdentifier=101, 
		Int=102, Uint=103, Byte=104, Fixed=105, Ufixed=106, VersionLiteral=107, 
		BooleanLiteral=108, DecimalNumber=109, HexNumber=110, NumberUnit=111, 
		HexLiteral=112, ReservedKeyword=113, AnonymousKeyword=114, BreakKeyword=115, 
		ConstantKeyword=116, OverrideKeyword=117, ImmutableKeyword=118, VirtualKeyword=119, 
		ContinueKeyword=120, ExternalKeyword=121, IndexedKeyword=122, InternalKeyword=123, 
		PayableKeyword=124, PrivateKeyword=125, PublicKeyword=126, PureKeyword=127, 
		TypeKeyword=128, ViewKeyword=129, Identifier=130, StringLiteral=131, WS=132, 
		NatSpecSingleLine=133, NatSpecMultiLine=134, LINE_COMMENT=135, COMMENT=136;
	public static final int
		RULE_sourceUnit = 0, RULE_spdxLicenseIdentifier = 1, RULE_pragmaDirective = 2, 
		RULE_pragmaName = 3, RULE_pragmaValue = 4, RULE_version = 5, RULE_versionOperator = 6, 
		RULE_versionConstraint = 7, RULE_importDeclaration = 8, RULE_importDirective = 9, 
		RULE_natSpec = 10, RULE_contractDefinition = 11, RULE_inheritanceSpecifier = 12, 
		RULE_callArgumentList = 13, RULE_contractPart = 14, RULE_stateVariableDeclaration = 15, 
		RULE_usingForDeclaration = 16, RULE_structDefinition = 17, RULE_constructorDefinition = 18, 
		RULE_modifierDefinition = 19, RULE_modifierInvocation = 20, RULE_functionDefinition = 21, 
		RULE_returnParameters = 22, RULE_overrideParameters = 23, RULE_modifierList = 24, 
		RULE_eventDefinition = 25, RULE_enumValue = 26, RULE_enumDefinition = 27, 
		RULE_parameterList = 28, RULE_objectList = 29, RULE_parameter = 30, RULE_eventParameterList = 31, 
		RULE_eventParameter = 32, RULE_functionTypeParameterList = 33, RULE_functionTypeParameter = 34, 
		RULE_variableDeclaration = 35, RULE_typeName = 36, RULE_userDefinedTypeName = 37, 
		RULE_mapping = 38, RULE_functionTypeName = 39, RULE_visibility = 40, RULE_storageLocation = 41, 
		RULE_stateMutability = 42, RULE_block = 43, RULE_uncheckedBlock = 44, 
		RULE_statement = 45, RULE_tryStatement = 46, RULE_catchClause = 47, RULE_expressionStatement = 48, 
		RULE_ifStatement = 49, RULE_ifCondition = 50, RULE_ifRight = 51, RULE_ifWrong = 52, 
		RULE_whileStatement = 53, RULE_simpleStatement = 54, RULE_forStatement = 55, 
		RULE_inlineAssemblyStatement = 56, RULE_doWhileStatement = 57, RULE_continueStatement = 58, 
		RULE_breakStatement = 59, RULE_returnStatement = 60, RULE_throwStatement = 61, 
		RULE_emitStatement = 62, RULE_variableDeclarationStatement = 63, RULE_constantVariableDeclaration = 64, 
		RULE_variableDeclarationList = 65, RULE_identifierList = 66, RULE_elementaryTypeName = 67, 
		RULE_expression = 68, RULE_primaryExpression = 69, RULE_expressionList = 70, 
		RULE_nameValueList = 71, RULE_nameValue = 72, RULE_functionCallArguments = 73, 
		RULE_functionCall = 74, RULE_assemblyBlock = 75, RULE_assemblyItem = 76, 
		RULE_assemblyExpression = 77, RULE_assemblyCall = 78, RULE_assemblyLocalDefinition = 79, 
		RULE_assemblyAssignment = 80, RULE_assemblyIdentifierOrList = 81, RULE_assemblyIdentifierList = 82, 
		RULE_assemblyStackAssignment = 83, RULE_labelDefinition = 84, RULE_assemblySwitch = 85, 
		RULE_assemblyCase = 86, RULE_assemblyFunctionDefinition = 87, RULE_assemblyFunctionReturns = 88, 
		RULE_assemblyFor = 89, RULE_assemblyIf = 90, RULE_assemblyLiteral = 91, 
		RULE_subAssembly = 92, RULE_tupleExpression = 93, RULE_typeNameExpression = 94, 
		RULE_numberLiteral = 95, RULE_identifier = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "spdxLicenseIdentifier", "pragmaDirective", "pragmaName", 
			"pragmaValue", "version", "versionOperator", "versionConstraint", "importDeclaration", 
			"importDirective", "natSpec", "contractDefinition", "inheritanceSpecifier", 
			"callArgumentList", "contractPart", "stateVariableDeclaration", "usingForDeclaration", 
			"structDefinition", "constructorDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "returnParameters", "overrideParameters", "modifierList", 
			"eventDefinition", "enumValue", "enumDefinition", "parameterList", "objectList", 
			"parameter", "eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mapping", "functionTypeName", "visibility", "storageLocation", "stateMutability", 
			"block", "uncheckedBlock", "statement", "tryStatement", "catchClause", 
			"expressionStatement", "ifStatement", "ifCondition", "ifRight", "ifWrong", 
			"whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "variableDeclarationStatement", "constantVariableDeclaration", 
			"variableDeclarationList", "identifierList", "elementaryTypeName", "expression", 
			"primaryExpression", "expressionList", "nameValueList", "nameValue", 
			"functionCallArguments", "functionCall", "assemblyBlock", "assemblyItem", 
			"assemblyExpression", "assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", 
			"assemblyIdentifierOrList", "assemblyIdentifierList", "assemblyStackAssignment", 
			"labelDefinition", "assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", 
			"assemblyFunctionReturns", "assemblyFor", "assemblyIf", "assemblyLiteral", 
			"subAssembly", "tupleExpression", "typeNameExpression", "numberLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", 
			"'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'abstract'", 
			"'contract'", "'interface'", "'library'", "'is'", "'('", "')'", "'({'", 
			"':'", "'})'", "'using'", "'for'", "'struct'", "'constructor'", "'modifier'", 
			"'function'", "'receive'", "'fallback'", "'returns'", "'event'", "'enum'", 
			"'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", "'memory'", "'storage'", 
			"'calldata'", "'unchecked'", "'try'", "'catch'", "'if'", "'else'", "'while'", 
			"'assembly'", "'do'", "'return'", "'throw'", "'emit'", "'var'", "'bool'", 
			"'string'", "'byte'", "'++'", "'--'", "'!'", "'delete'", "'-'", "'new'", 
			"'+'", "'after'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'&'", 
			"'|'", "'=='", "'!='", "'&&'", "'||'", "'?'", "'|='", "'^='", "'&='", 
			"'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'let'", 
			"':='", "'=:'", "'switch'", "'case'", "'default'", "'->'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'anonymous'", 
			"'break'", "'constant'", "'override'", "'immutable'", "'virtual'", "'continue'", 
			"'external'", "'indexed'", "'internal'", "'payable'", "'private'", "'public'", 
			"'pure'", "'type'", "'view'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LicenseIdentifier", "Int", "Uint", "Byte", 
			"Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", 
			"HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", "AnonymousKeyword", 
			"BreakKeyword", "ConstantKeyword", "OverrideKeyword", "ImmutableKeyword", 
			"VirtualKeyword", "ContinueKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"PureKeyword", "TypeKeyword", "ViewKeyword", "Identifier", "StringLiteral", 
			"WS", "NatSpecSingleLine", "NatSpecMultiLine", "LINE_COMMENT", "COMMENT"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public SpdxLicenseIdentifierContext spdxLicenseIdentifier() {
			return getRuleContext(SpdxLicenseIdentifierContext.class,0);
		}
		public List<NatSpecContext> natSpec() {
			return getRuleContexts(NatSpecContext.class);
		}
		public NatSpecContext natSpec(int i) {
			return getRuleContext(NatSpecContext.class,i);
		}
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<ConstantVariableDeclarationContext> constantVariableDeclaration() {
			return getRuleContexts(ConstantVariableDeclarationContext.class);
		}
		public ConstantVariableDeclarationContext constantVariableDeclaration(int i) {
			return getRuleContext(ConstantVariableDeclarationContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LicenseIdentifier) {
				{
				setState(194);
				spdxLicenseIdentifier();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)) | (1L << (NatSpecSingleLine - 102)) | (1L << (NatSpecMultiLine - 102)))) != 0)) {
				{
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(197);
					natSpec();
					}
					break;
				case 2:
					{
					setState(198);
					pragmaDirective();
					}
					break;
				case 3:
					{
					setState(199);
					importDirective();
					}
					break;
				case 4:
					{
					setState(200);
					contractDefinition();
					}
					break;
				case 5:
					{
					setState(201);
					functionDefinition();
					}
					break;
				case 6:
					{
					setState(202);
					constantVariableDeclaration();
					}
					break;
				case 7:
					{
					setState(203);
					structDefinition();
					}
					break;
				case 8:
					{
					setState(204);
					enumDefinition();
					}
					break;
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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

	public static class SpdxLicenseIdentifierContext extends ParserRuleContext {
		public TerminalNode LicenseIdentifier() { return getToken(SolidityParser.LicenseIdentifier, 0); }
		public SpdxLicenseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spdxLicenseIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSpdxLicenseIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSpdxLicenseIdentifier(this);
		}
	}

	public final SpdxLicenseIdentifierContext spdxLicenseIdentifier() throws RecognitionException {
		SpdxLicenseIdentifierContext _localctx = new SpdxLicenseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_spdxLicenseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LicenseIdentifier);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__0);
			setState(215);
			pragmaName();
			setState(216);
			pragmaValue();
			setState(217);
			match(T__1);
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

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			identifier();
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

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaValue(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pragmaValue);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				expression(0);
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

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			versionConstraint();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(226);
				versionConstraint();
				}
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

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(231);
				versionOperator();
				}
			}

			setState(234);
			match(VersionLiteral);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			identifier();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(237);
				match(T__9);
				setState(238);
				identifier();
				}
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importDirective);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__10);
				setState(242);
				match(StringLiteral);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(243);
					match(T__9);
					setState(244);
					identifier();
					}
				}

				setState(247);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__10);
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(249);
					match(T__11);
					}
					break;
				case T__12:
				case T__45:
				case Identifier:
					{
					setState(250);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(253);
					match(T__9);
					setState(254);
					identifier();
					}
				}

				setState(257);
				match(T__12);
				setState(258);
				match(StringLiteral);
				setState(259);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(T__10);
				setState(261);
				match(T__13);
				setState(262);
				importDeclaration();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(263);
					match(T__14);
					setState(264);
					importDeclaration();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(T__15);
				setState(271);
				match(T__12);
				setState(272);
				match(StringLiteral);
				setState(273);
				match(T__1);
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

	public static class NatSpecContext extends ParserRuleContext {
		public List<TerminalNode> NatSpecSingleLine() { return getTokens(SolidityParser.NatSpecSingleLine); }
		public TerminalNode NatSpecSingleLine(int i) {
			return getToken(SolidityParser.NatSpecSingleLine, i);
		}
		public TerminalNode NatSpecMultiLine() { return getToken(SolidityParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNatSpec(this);
		}
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_natSpec);
		try {
			int _alt;
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NatSpecSingleLine:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(277);
						match(NatSpecSingleLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(280); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NatSpecMultiLine:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(NatSpecMultiLine);
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(285);
				natSpec();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(288);
				match(T__16);
				}
			}

			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			identifier();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(293);
				match(T__20);
				setState(294);
				inheritanceSpecifier();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(295);
					match(T__14);
					setState(296);
					inheritanceSpecifier();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(304);
			match(T__13);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)) | (1L << (NatSpecSingleLine - 102)) | (1L << (NatSpecMultiLine - 102)))) != 0)) {
				{
				{
				setState(305);
				contractPart();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__15);
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

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			userDefinedTypeName();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__23) {
				{
				setState(314);
				callArgumentList();
				}
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

	public static class CallArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCallArgumentList(this);
		}
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callArgumentList);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__21);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(318);
					expression(0);
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(321);
					match(T__14);
					setState(322);
					expression(0);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__23);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12 || _la==T__45 || _la==Identifier) {
					{
					{
					setState(330);
					identifier();
					setState(331);
					match(T__24);
					setState(332);
					expression(0);
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(333);
						match(T__14);
						setState(334);
						identifier();
						setState(335);
						match(T__24);
						setState(336);
						expression(0);
						}
						}
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(T__25);
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

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contractPart);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(358);
				enumDefinition();
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> OverrideKeyword() { return getTokens(SolidityParser.OverrideKeyword); }
		public TerminalNode OverrideKeyword(int i) {
			return getToken(SolidityParser.OverrideKeyword, i);
		}
		public List<TerminalNode> ImmutableKeyword() { return getTokens(SolidityParser.ImmutableKeyword); }
		public TerminalNode ImmutableKeyword(int i) {
			return getToken(SolidityParser.ImmutableKeyword, i);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			typeName(0);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (OverrideKeyword - 116)) | (1L << (ImmutableKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)))) != 0)) {
				{
				{
				setState(362);
				_la = _input.LA(1);
				if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (OverrideKeyword - 116)) | (1L << (ImmutableKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			identifier();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(369);
				match(T__8);
				setState(370);
				expression(0);
				}
			}

			setState(373);
			match(T__1);
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

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__26);
			setState(376);
			identifier();
			setState(377);
			match(T__27);
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(378);
				match(T__11);
				}
				break;
			case T__12:
			case T__31:
			case T__39:
			case T__41:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(379);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(382);
			match(T__1);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__28);
			setState(385);
			identifier();
			setState(386);
			match(T__13);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(387);
				variableDeclaration();
				setState(388);
				match(T__1);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
					{
					{
					setState(389);
					variableDeclaration();
					setState(390);
					match(T__1);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(399);
			match(T__15);
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

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstructorDefinition(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__29);
			setState(402);
			parameterList();
			setState(403);
			modifierList();
			setState(404);
			block();
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

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__30);
			setState(407);
			identifier();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(408);
				parameterList();
				}
			}

			setState(411);
			block();
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

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			identifier();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(414);
				match(T__21);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(415);
					expressionList();
					}
				}

				setState(418);
				match(T__22);
				}
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(421);
				natSpec();
				}
			}

			setState(424);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(425);
				identifier();
				}
			}

			setState(428);
			parameterList();
			setState(429);
			modifierList();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(430);
				returnParameters();
				}
			}

			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(433);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(434);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__34);
			setState(438);
			parameterList();
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

	public static class OverrideParametersContext extends ParserRuleContext {
		public TerminalNode OverrideKeyword() { return getToken(SolidityParser.OverrideKeyword, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public OverrideParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOverrideParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOverrideParameters(this);
		}
	}

	public final OverrideParametersContext overrideParameters() throws RecognitionException {
		OverrideParametersContext _localctx = new OverrideParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_overrideParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(OverrideKeyword);
			setState(441);
			parameterList();
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> OverrideKeyword() { return getTokens(SolidityParser.OverrideKeyword); }
		public TerminalNode OverrideKeyword(int i) {
			return getToken(SolidityParser.OverrideKeyword, i);
		}
		public List<OverrideParametersContext> overrideParameters() {
			return getRuleContexts(OverrideParametersContext.class);
		}
		public OverrideParametersContext overrideParameters(int i) {
			return getRuleContext(OverrideParametersContext.class,i);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__45 || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (OverrideKeyword - 116)) | (1L << (VirtualKeyword - 116)) | (1L << (ExternalKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PayableKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)) | (1L << (PureKeyword - 116)) | (1L << (ViewKeyword - 116)) | (1L << (Identifier - 116)))) != 0)) {
				{
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(443);
					modifierInvocation();
					}
					break;
				case 2:
					{
					setState(444);
					stateMutability();
					}
					break;
				case 3:
					{
					setState(445);
					match(ExternalKeyword);
					}
					break;
				case 4:
					{
					setState(446);
					match(PublicKeyword);
					}
					break;
				case 5:
					{
					setState(447);
					match(InternalKeyword);
					}
					break;
				case 6:
					{
					setState(448);
					match(PrivateKeyword);
					}
					break;
				case 7:
					{
					setState(449);
					match(OverrideKeyword);
					}
					break;
				case 8:
					{
					setState(450);
					overrideParameters();
					}
					break;
				case 9:
					{
					setState(451);
					match(VirtualKeyword);
					}
					break;
				}
				}
				setState(456);
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

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(457);
				natSpec();
				}
			}

			setState(460);
			match(T__35);
			setState(461);
			identifier();
			setState(462);
			eventParameterList();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(463);
				match(AnonymousKeyword);
				}
			}

			setState(466);
			match(T__1);
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

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			identifier();
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__36);
			setState(471);
			identifier();
			setState(472);
			match(T__13);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(473);
				enumValue();
				}
			}

			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(476);
				match(T__14);
				setState(477);
				enumValue();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			match(T__15);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__21);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(486);
				parameter();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(487);
					match(T__14);
					setState(488);
					parameter();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(496);
			match(T__22);
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

	public static class ObjectListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitObjectList(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__21);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(499);
				parameter();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(500);
					match(T__14);
					setState(501);
					parameter();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(509);
			match(T__22);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			typeName(0);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(512);
				storageLocation();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(515);
				identifier();
				}
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

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__21);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(519);
				eventParameter();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(520);
					match(T__14);
					setState(521);
					eventParameter();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(529);
			match(T__22);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			typeName(0);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(532);
				match(IndexedKeyword);
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(535);
				identifier();
				}
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

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T__21);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(539);
				functionTypeParameter();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(540);
					match(T__14);
					setState(541);
					functionTypeParameter();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(549);
			match(T__22);
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

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			typeName(0);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
				{
				setState(552);
				storageLocation();
				}
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			typeName(0);
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(556);
				storageLocation();
				}
				break;
			}
			setState(559);
			identifier();
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

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(562);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(563);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(564);
				mapping();
				}
				break;
			case 4:
				{
				setState(565);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(566);
				match(T__39);
				setState(567);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(570);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(571);
					match(T__37);
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
						{
						setState(572);
						expression(0);
						}
					}

					setState(575);
					match(T__38);
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			identifier();
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582);
					match(T__40);
					setState(583);
					identifier();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class MappingContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__41);
			setState(590);
			match(T__21);
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(591);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__45:
			case Identifier:
				{
				setState(592);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(595);
			match(T__42);
			setState(596);
			typeName(0);
			setState(597);
			match(T__22);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionTypeName);
		int _la;
		try {
			int _alt;
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(T__31);
				setState(600);
				functionTypeParameterList();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(604);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case InternalKeyword:
							{
							setState(601);
							match(InternalKeyword);
							}
							break;
						case ExternalKeyword:
							{
							setState(602);
							match(ExternalKeyword);
							}
							break;
						case ConstantKeyword:
						case PayableKeyword:
						case PureKeyword:
						case ViewKeyword:
							{
							setState(603);
							stateMutability();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(609);
					match(T__34);
					setState(610);
					functionTypeParameterList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(T__31);
				setState(614);
				match(T__21);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(615);
					parameterList();
					}
				}

				setState(618);
				match(T__22);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (ExternalKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PayableKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)) | (1L << (PureKeyword - 116)) | (1L << (ViewKeyword - 116)))) != 0)) {
					{
					setState(621);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ExternalKeyword:
					case InternalKeyword:
					case PrivateKeyword:
					case PublicKeyword:
						{
						setState(619);
						visibility();
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(620);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(T__34);
				setState(627);
				match(T__21);
				setState(628);
				parameterList();
				setState(629);
				match(T__22);
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode InternalKeyword() { return getToken(SolidityParser.InternalKeyword, 0); }
		public TerminalNode ExternalKeyword() { return getToken(SolidityParser.ExternalKeyword, 0); }
		public TerminalNode PrivateKeyword() { return getToken(SolidityParser.PrivateKeyword, 0); }
		public TerminalNode PublicKeyword() { return getToken(SolidityParser.PublicKeyword, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (ExternalKeyword - 121)) | (1L << (InternalKeyword - 121)) | (1L << (PrivateKeyword - 121)) | (1L << (PublicKeyword - 121)))) != 0)) ) {
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

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (PayableKeyword - 116)) | (1L << (PureKeyword - 116)) | (1L << (ViewKeyword - 116)))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UncheckedBlockContext> uncheckedBlock() {
			return getRuleContexts(UncheckedBlockContext.class);
		}
		public UncheckedBlockContext uncheckedBlock(int i) {
			return getRuleContext(UncheckedBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(T__13);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__21) | (1L << T__27) | (1L << T__31) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (PayableKeyword - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TypeKeyword - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (LINE_COMMENT - 128)) | (1L << (COMMENT - 128)))) != 0)) {
				{
				setState(642);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__12:
				case T__13:
				case T__21:
				case T__27:
				case T__31:
				case T__37:
				case T__39:
				case T__41:
				case T__45:
				case T__47:
				case T__48:
				case T__49:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case Int:
				case Uint:
				case Byte:
				case Fixed:
				case Ufixed:
				case BooleanLiteral:
				case DecimalNumber:
				case HexNumber:
				case HexLiteral:
				case BreakKeyword:
				case ContinueKeyword:
				case PayableKeyword:
				case TypeKeyword:
				case Identifier:
				case StringLiteral:
				case LINE_COMMENT:
				case COMMENT:
					{
					setState(640);
					statement();
					}
					break;
				case T__46:
					{
					setState(641);
					uncheckedBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			match(T__15);
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

	public static class UncheckedBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUncheckedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUncheckedBlock(this);
		}
	}

	public final UncheckedBlockContext uncheckedBlock() throws RecognitionException {
		UncheckedBlockContext _localctx = new UncheckedBlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_uncheckedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(T__46);
			setState(650);
			block();
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(SolidityParser.LINE_COMMENT, 0); }
		public TerminalNode COMMENT() { return getToken(SolidityParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				ifStatement();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				whileStatement();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				block();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				inlineAssemblyStatement();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				breakStatement();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 9);
				{
				setState(660);
				returnStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 10);
				{
				setState(661);
				throwStatement();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 11);
				{
				setState(662);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__21:
			case T__31:
			case T__37:
			case T__39:
			case T__41:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 12);
				{
				setState(663);
				simpleStatement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 13);
				{
				setState(664);
				tryStatement();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 14);
				{
				setState(665);
				catchClause();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 15);
				{
				setState(666);
				match(LINE_COMMENT);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 16);
				{
				setState(667);
				match(COMMENT);
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

	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T__47);
			setState(671);
			expression(0);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(672);
				match(T__34);
				setState(673);
				match(T__21);
				setState(674);
				parameterList();
				setState(675);
				match(T__22);
				}
			}

			setState(679);
			block();
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					catchClause();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_catchClause);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(T__48);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__21) | (1L << T__45))) != 0) || _la==Identifier) {
					{
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__45 || _la==Identifier) {
						{
						setState(687);
						identifier();
						}
					}

					setState(690);
					match(T__21);
					setState(691);
					parameterList();
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
						{
						setState(692);
						natSpec();
						}
					}

					setState(695);
					match(T__22);
					}
				}

				setState(699);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(T__48);
				setState(701);
				block();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			expression(0);
			setState(705);
			match(T__1);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public IfRightContext ifRight() {
			return getRuleContext(IfRightContext.class,0);
		}
		public IfWrongContext ifWrong() {
			return getRuleContext(IfWrongContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__49);
			setState(708);
			match(T__21);
			setState(709);
			ifCondition();
			setState(710);
			match(T__22);
			setState(711);
			ifRight();
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(712);
				match(T__50);
				setState(713);
				ifWrong();
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

	public static class IfConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			expression(0);
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

	public static class IfRightContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfRight(this);
		}
	}

	public final IfRightContext ifRight() throws RecognitionException {
		IfRightContext _localctx = new IfRightContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ifRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			statement();
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

	public static class IfWrongContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfWrongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifWrong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfWrong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfWrong(this);
		}
	}

	public final IfWrongContext ifWrong() throws RecognitionException {
		IfWrongContext _localctx = new IfWrongContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifWrong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(T__51);
			setState(723);
			match(T__21);
			setState(724);
			expression(0);
			setState(725);
			match(T__22);
			setState(726);
			statement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(728);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(729);
				expressionStatement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__27);
			setState(733);
			match(T__21);
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__21:
			case T__31:
			case T__37:
			case T__39:
			case T__41:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(734);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(735);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__21:
			case T__37:
			case T__39:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(738);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(739);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
				{
				setState(742);
				expression(0);
				}
			}

			setState(745);
			match(T__22);
			setState(746);
			statement();
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

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(T__52);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(749);
				match(StringLiteral);
				}
			}

			setState(752);
			assemblyBlock();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__53);
			setState(755);
			statement();
			setState(756);
			match(T__51);
			setState(757);
			match(T__21);
			setState(758);
			expression(0);
			setState(759);
			match(T__22);
			setState(760);
			match(T__1);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(ContinueKeyword);
			setState(763);
			match(T__1);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(BreakKeyword);
			setState(766);
			match(T__1);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__54);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
				{
				setState(769);
				expression(0);
				}
			}

			setState(772);
			match(T__1);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(T__55);
			setState(775);
			match(T__1);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__56);
			setState(778);
			functionCall();
			setState(779);
			match(T__1);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(781);
				match(T__57);
				setState(782);
				identifierList();
				}
				break;
			case 2:
				{
				setState(783);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(784);
				match(T__21);
				setState(785);
				variableDeclarationList();
				setState(786);
				match(T__22);
				}
				break;
			}
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(790);
				match(T__8);
				setState(791);
				expression(0);
				}
			}

			setState(794);
			match(T__1);
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

	public static class ConstantVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstantVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstantVariableDeclaration(this);
		}
	}

	public final ConstantVariableDeclarationContext constantVariableDeclaration() throws RecognitionException {
		ConstantVariableDeclarationContext _localctx = new ConstantVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constantVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			typeName(0);
			setState(797);
			match(ConstantKeyword);
			setState(798);
			identifier();
			setState(799);
			match(T__8);
			setState(800);
			expression(0);
			setState(801);
			match(T__1);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(803);
				variableDeclaration();
				}
			}

			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(806);
				match(T__14);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__45) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
					{
					setState(807);
					variableDeclaration();
					}
				}

				}
				}
				setState(814);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(T__21);
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__45 || _la==Identifier) {
						{
						setState(816);
						identifier();
						}
					}

					setState(819);
					match(T__14);
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(825);
				identifier();
				}
			}

			setState(828);
			match(T__22);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(833);
				match(T__37);
				setState(834);
				expression(0);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(835);
					match(T__14);
					setState(836);
					expression(0);
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(842);
				match(T__38);
				}
				break;
			case 2:
				{
				setState(844);
				match(PayableKeyword);
				setState(845);
				callArgumentList();
				}
				break;
			case 3:
				{
				setState(846);
				match(TypeKeyword);
				setState(847);
				match(T__21);
				setState(848);
				typeName(0);
				setState(849);
				match(T__22);
				}
				break;
			case 4:
				{
				setState(851);
				_la = _input.LA(1);
				if ( !(((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(852);
				expression(23);
				}
				break;
			case 5:
				{
				setState(853);
				match(T__66);
				setState(854);
				typeName(0);
				}
				break;
			case 6:
				{
				setState(855);
				match(T__21);
				setState(856);
				expression(0);
				setState(857);
				match(T__22);
				}
				break;
			case 7:
				{
				setState(859);
				_la = _input.LA(1);
				if ( !(_la==T__65 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(860);
				expression(18);
				}
				break;
			case 8:
				{
				setState(861);
				_la = _input.LA(1);
				if ( !(_la==T__64 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(862);
				expression(17);
				}
				break;
			case 9:
				{
				setState(863);
				match(T__63);
				setState(864);
				expression(16);
				}
				break;
			case 10:
				{
				setState(865);
				match(T__3);
				setState(866);
				expression(15);
				}
				break;
			case 11:
				{
				setState(867);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(870);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(871);
						match(T__69);
						setState(872);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(873);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(874);
						_la = _input.LA(1);
						if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__70 - 12)) | (1L << (T__71 - 12)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(875);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(876);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(877);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__67) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(878);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(879);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(880);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(881);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(882);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(883);
						match(T__75);
						setState(884);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(885);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(886);
						match(T__2);
						setState(887);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(888);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(889);
						match(T__76);
						setState(890);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(891);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(892);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(893);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(894);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(895);
						_la = _input.LA(1);
						if ( !(_la==T__77 || _la==T__78) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(896);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(897);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(898);
						match(T__79);
						setState(899);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(901);
						match(T__80);
						setState(902);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(904);
						match(T__81);
						setState(905);
						expression(0);
						setState(906);
						match(T__24);
						setState(907);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(910);
						_la = _input.LA(1);
						if ( !(_la==T__8 || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)) | (1L << (T__85 - 83)) | (1L << (T__86 - 83)) | (1L << (T__87 - 83)) | (1L << (T__88 - 83)) | (1L << (T__89 - 83)) | (1L << (T__90 - 83)) | (1L << (T__91 - 83)) | (1L << (T__92 - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(911);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(912);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(913);
						match(T__37);
						setState(915);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(914);
							expression(0);
							}
						}

						setState(917);
						match(T__38);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(918);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(919);
						match(T__37);
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(920);
							expression(0);
							}
						}

						setState(923);
						match(T__24);
						setState(925);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(924);
							expression(0);
							}
						}

						setState(927);
						match(T__38);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(928);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(929);
						match(T__40);
						setState(932);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__12:
						case T__45:
						case Identifier:
							{
							setState(930);
							identifier();
							}
							break;
						case T__39:
							{
							setState(931);
							match(T__39);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(934);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(935);
						match(T__13);
						setState(949);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__12 || _la==T__45 || _la==Identifier) {
							{
							setState(936);
							identifier();
							setState(937);
							match(T__24);
							setState(938);
							expression(0);
							setState(946);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(939);
								match(T__14);
								setState(940);
								identifier();
								setState(941);
								match(T__24);
								setState(942);
								expression(0);
								}
								}
								setState(948);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(951);
						match(T__15);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(952);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(953);
						_la = _input.LA(1);
						if ( !(_la==T__61 || _la==T__62) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(954);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(955);
						match(T__21);
						setState(956);
						functionCallArguments();
						setState(957);
						match(T__22);
						}
						break;
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_primaryExpression);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				identifier();
				setState(971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(969);
					match(T__37);
					setState(970);
					match(T__38);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(973);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(974);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(975);
				typeNameExpression();
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(976);
					match(T__37);
					setState(977);
					match(T__38);
					}
					break;
				}
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			expression(0);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(983);
				match(T__14);
				setState(984);
				expression(0);
				}
				}
				setState(989);
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

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			nameValue();
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(991);
					match(T__14);
					setState(992);
					nameValue();
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(998);
				match(T__14);
				}
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

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			identifier();
			setState(1002);
			match(T__24);
			setState(1003);
			expression(0);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionCallArguments);
		int _la;
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(T__13);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__45 || _la==Identifier) {
					{
					setState(1006);
					nameValueList();
					}
				}

				setState(1009);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__21:
			case T__22:
			case T__37:
			case T__39:
			case T__45:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(1010);
					expressionList();
					}
				}

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

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			expression(0);
			setState(1016);
			match(T__21);
			setState(1017);
			functionCallArguments();
			setState(1018);
			match(T__22);
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

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(T__13);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__21) | (1L << T__27) | (1L << T__31) | (1L << T__39) | (1L << T__45) | (1L << T__49) | (1L << T__52) | (1L << T__54) | (1L << T__60))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (T__93 - 94)) | (1L << (T__95 - 94)) | (1L << (T__96 - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (BreakKeyword - 94)) | (1L << (ContinueKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
				{
				{
				setState(1021);
				assemblyItem();
				}
				}
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1027);
			match(T__15);
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

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyItem);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1033);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1034);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1035);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1036);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1037);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1038);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1039);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1040);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1041);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1042);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1043);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1044);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1045);
				match(HexLiteral);
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

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyExpression);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__39:
			case T__45:
			case T__54:
			case T__60:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				assemblyLiteral();
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

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				{
				setState(1052);
				match(T__54);
				}
				break;
			case T__39:
				{
				setState(1053);
				match(T__39);
				}
				break;
			case T__60:
				{
				setState(1054);
				match(T__60);
				}
				break;
			case T__12:
			case T__45:
			case Identifier:
				{
				setState(1055);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1058);
				match(T__21);
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__45) | (1L << T__54) | (1L << T__60))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (DecimalNumber - 109)) | (1L << (HexNumber - 109)) | (1L << (HexLiteral - 109)) | (1L << (Identifier - 109)) | (1L << (StringLiteral - 109)))) != 0)) {
					{
					setState(1059);
					assemblyExpression();
					}
				}

				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1062);
					match(T__14);
					setState(1063);
					assemblyExpression();
					}
					}
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1069);
				match(T__22);
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

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(T__93);
			setState(1073);
			assemblyIdentifierOrList();
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(1074);
				match(T__94);
				setState(1075);
				assemblyExpression();
				}
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

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			assemblyIdentifierOrList();
			setState(1079);
			match(T__94);
			setState(1080);
			assemblyExpression();
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

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyIdentifierOrList);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__45:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				identifier();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				match(T__21);
				setState(1084);
				assemblyIdentifierList();
				setState(1085);
				match(T__22);
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

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			identifier();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1090);
				match(T__14);
				setState(1091);
				identifier();
				}
				}
				setState(1096);
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

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(T__95);
			setState(1098);
			identifier();
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			identifier();
			setState(1101);
			match(T__24);
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

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(T__96);
			setState(1104);
			assemblyExpression();
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__97 || _la==T__98) {
				{
				{
				setState(1105);
				assemblyCase();
				}
				}
				setState(1110);
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

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assemblyCase);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				match(T__97);
				setState(1112);
				assemblyLiteral();
				setState(1113);
				assemblyBlock();
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(T__98);
				setState(1116);
				assemblyBlock();
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

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(T__31);
			setState(1120);
			identifier();
			setState(1121);
			match(T__21);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__45 || _la==Identifier) {
				{
				setState(1122);
				assemblyIdentifierList();
				}
			}

			setState(1125);
			match(T__22);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(1126);
				assemblyFunctionReturns();
				}
			}

			setState(1129);
			assemblyBlock();
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

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1131);
			match(T__99);
			setState(1132);
			assemblyIdentifierList();
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

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(T__27);
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(1135);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__39:
			case T__45:
			case T__54:
			case T__60:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1136);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1139);
			assemblyExpression();
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(1140);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__39:
			case T__45:
			case T__54:
			case T__60:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1141);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1144);
			assemblyBlock();
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

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(T__49);
			setState(1147);
			assemblyExpression();
			setState(1148);
			assemblyBlock();
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

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (DecimalNumber - 109)) | (1L << (HexNumber - 109)) | (1L << (HexLiteral - 109)) | (1L << (StringLiteral - 109)))) != 0)) ) {
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

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(T__52);
			setState(1153);
			identifier();
			setState(1154);
			assemblyBlock();
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tupleExpression);
		int _la;
		try {
			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(T__21);
				{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(1157);
					expression(0);
					}
				}

				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1160);
					match(T__14);
					setState(1162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
						{
						setState(1161);
						expression(0);
						}
					}

					}
					}
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1169);
				match(T__22);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				match(T__37);
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__21 - 4)) | (1L << (T__37 - 4)) | (1L << (T__39 - 4)) | (1L << (T__45 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)) | (1L << (T__65 - 4)) | (1L << (T__66 - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (Int - 68)) | (1L << (Uint - 68)) | (1L << (Byte - 68)) | (1L << (Fixed - 68)) | (1L << (Ufixed - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (HexLiteral - 68)) | (1L << (PayableKeyword - 68)) | (1L << (TypeKeyword - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(1171);
					expression(0);
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(1172);
						match(T__14);
						setState(1173);
						expression(0);
						}
						}
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1181);
				match(T__38);
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

	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeNameExpression(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typeNameExpression);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__45:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				userDefinedTypeName();
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1189);
				match(NumberUnit);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		int _la;
		try {
			int _alt;
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__45 || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				match(Identifier);
				setState(1198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1194);
						match(T__12);
						setState(1195);
						match(Identifier);
						}
						} 
					}
					setState(1200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 68:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 30);
		case 15:
			return precpred(_ctx, 28);
		case 16:
			return precpred(_ctx, 27);
		case 17:
			return precpred(_ctx, 26);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008a\u04b6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\5\2\u00c6\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\u00d0\n\2\f\2\16\2\u00d3\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\5\6\u00e2\n\6\3\7\3\7\5\7\u00e6\n\7\3\b\3\b\3\t\5\t\u00eb"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13\3\13\3\13\5\13\u00f8"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u00fe\n\13\3\13\3\13\5\13\u0102\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u010c\n\13\f\13\16\13\u010f"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u0116\n\13\3\f\6\f\u0119\n\f\r\f"+
		"\16\f\u011a\3\f\5\f\u011e\n\f\3\r\5\r\u0121\n\r\3\r\5\r\u0124\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u012c\n\r\f\r\16\r\u012f\13\r\5\r\u0131\n\r\3"+
		"\r\3\r\7\r\u0135\n\r\f\r\16\r\u0138\13\r\3\r\3\r\3\16\3\16\5\16\u013e"+
		"\n\16\3\17\3\17\5\17\u0142\n\17\3\17\3\17\7\17\u0146\n\17\f\17\16\17\u0149"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0155\n"+
		"\17\f\17\16\17\u0158\13\17\7\17\u015a\n\17\f\17\16\17\u015d\13\17\3\17"+
		"\5\17\u0160\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u016a\n"+
		"\20\3\21\3\21\7\21\u016e\n\21\f\21\16\21\u0171\13\21\3\21\3\21\3\21\5"+
		"\21\u0176\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u017f\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u018b\n\23\f\23\16"+
		"\23\u018e\13\23\5\23\u0190\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u019c\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u01a3\n\26\3"+
		"\26\5\26\u01a6\n\26\3\27\5\27\u01a9\n\27\3\27\3\27\5\27\u01ad\n\27\3\27"+
		"\3\27\3\27\5\27\u01b2\n\27\3\27\3\27\5\27\u01b6\n\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01c7"+
		"\n\32\f\32\16\32\u01ca\13\32\3\33\5\33\u01cd\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01d3\n\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u01dd\n"+
		"\35\3\35\3\35\7\35\u01e1\n\35\f\35\16\35\u01e4\13\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\7\36\u01ec\n\36\f\36\16\36\u01ef\13\36\5\36\u01f1\n\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\7\37\u01f9\n\37\f\37\16\37\u01fc\13\37\5"+
		"\37\u01fe\n\37\3\37\3\37\3 \3 \5 \u0204\n \3 \5 \u0207\n \3!\3!\3!\3!"+
		"\7!\u020d\n!\f!\16!\u0210\13!\5!\u0212\n!\3!\3!\3\"\3\"\5\"\u0218\n\""+
		"\3\"\5\"\u021b\n\"\3#\3#\3#\3#\7#\u0221\n#\f#\16#\u0224\13#\5#\u0226\n"+
		"#\3#\3#\3$\3$\5$\u022c\n$\3%\3%\5%\u0230\n%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\5&\u023b\n&\3&\3&\3&\5&\u0240\n&\3&\7&\u0243\n&\f&\16&\u0246\13&\3\'"+
		"\3\'\3\'\7\'\u024b\n\'\f\'\16\'\u024e\13\'\3(\3(\3(\3(\5(\u0254\n(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\7)\u025f\n)\f)\16)\u0262\13)\3)\3)\5)\u0266\n"+
		")\3)\3)\3)\5)\u026b\n)\3)\3)\3)\7)\u0270\n)\f)\16)\u0273\13)\3)\3)\3)"+
		"\3)\3)\5)\u027a\n)\3*\3*\3+\3+\3,\3,\3-\3-\3-\7-\u0285\n-\f-\16-\u0288"+
		"\13-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5"+
		"/\u029f\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02a8\n\60\3\60\3\60"+
		"\7\60\u02ac\n\60\f\60\16\60\u02af\13\60\3\61\3\61\5\61\u02b3\n\61\3\61"+
		"\3\61\3\61\5\61\u02b8\n\61\3\61\3\61\5\61\u02bc\n\61\3\61\3\61\3\61\5"+
		"\61\u02c1\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u02cd\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\58\u02dd\n8\39\39\39\39\59\u02e3\n9\39\39\59\u02e7\n9\39\59\u02ea"+
		"\n9\39\39\39\3:\3:\5:\u02f1\n:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3=\3=\3=\3>\3>\5>\u0305\n>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A"+
		"\3A\3A\5A\u0317\nA\3A\3A\5A\u031b\nA\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\5C"+
		"\u0327\nC\3C\3C\5C\u032b\nC\7C\u032d\nC\fC\16C\u0330\13C\3D\3D\5D\u0334"+
		"\nD\3D\7D\u0337\nD\fD\16D\u033a\13D\3D\5D\u033d\nD\3D\3D\3E\3E\3F\3F\3"+
		"F\3F\3F\7F\u0348\nF\fF\16F\u034b\13F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0367\nF\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0396\nF\3F"+
		"\3F\3F\3F\5F\u039c\nF\3F\3F\5F\u03a0\nF\3F\3F\3F\3F\3F\5F\u03a7\nF\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u03b3\nF\fF\16F\u03b6\13F\5F\u03b8\nF\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\7F\u03c2\nF\fF\16F\u03c5\13F\3G\3G\3G\3G\3G\3G"+
		"\3G\5G\u03ce\nG\3G\3G\3G\3G\3G\5G\u03d5\nG\5G\u03d7\nG\3H\3H\3H\7H\u03dc"+
		"\nH\fH\16H\u03df\13H\3I\3I\3I\7I\u03e4\nI\fI\16I\u03e7\13I\3I\5I\u03ea"+
		"\nI\3J\3J\3J\3J\3K\3K\5K\u03f2\nK\3K\3K\5K\u03f6\nK\5K\u03f8\nK\3L\3L"+
		"\3L\3L\3L\3M\3M\7M\u0401\nM\fM\16M\u0404\13M\3M\3M\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0419\nN\3O\3O\5O\u041d\nO\3P\3P\3"+
		"P\3P\5P\u0423\nP\3P\3P\5P\u0427\nP\3P\3P\7P\u042b\nP\fP\16P\u042e\13P"+
		"\3P\5P\u0431\nP\3Q\3Q\3Q\3Q\5Q\u0437\nQ\3R\3R\3R\3R\3S\3S\3S\3S\3S\5S"+
		"\u0442\nS\3T\3T\3T\7T\u0447\nT\fT\16T\u044a\13T\3U\3U\3U\3V\3V\3V\3W\3"+
		"W\3W\7W\u0455\nW\fW\16W\u0458\13W\3X\3X\3X\3X\3X\3X\5X\u0460\nX\3Y\3Y"+
		"\3Y\3Y\5Y\u0466\nY\3Y\3Y\5Y\u046a\nY\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u0474"+
		"\n[\3[\3[\3[\5[\u0479\n[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3^\3^\3^\3^\3_\3"+
		"_\5_\u0489\n_\3_\3_\5_\u048d\n_\7_\u048f\n_\f_\16_\u0492\13_\3_\3_\3_"+
		"\3_\3_\7_\u0499\n_\f_\16_\u049c\13_\5_\u049e\n_\3_\5_\u04a1\n_\3`\3`\5"+
		"`\u04a5\n`\3a\3a\5a\u04a9\na\3b\3b\3b\3b\7b\u04af\nb\fb\16b\u04b2\13b"+
		"\5b\u04b4\nb\3b\2\4J\u008ac\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\26\3\2\5\13\3\2\24\26\5\2"+
		"vx}}\177\u0080\3\2\"$\5\2{{}}\177\u0080\3\2.\60\6\2vv~~\u0081\u0081\u0083"+
		"\u0083\5\2**<?hl\4\2\6\6@D\4\2DDFF\4\2CCGG\4\2\16\16IJ\3\2KM\3\2\7\n\3"+
		"\2PQ\4\2\13\13U_\3\2@A\5\2oprr\u0085\u0085\3\2op\5\2\17\17\60\60\u0084"+
		"\u0084\2\u0537\2\u00c5\3\2\2\2\4\u00d6\3\2\2\2\6\u00d8\3\2\2\2\b\u00dd"+
		"\3\2\2\2\n\u00e1\3\2\2\2\f\u00e3\3\2\2\2\16\u00e7\3\2\2\2\20\u00ea\3\2"+
		"\2\2\22\u00ee\3\2\2\2\24\u0115\3\2\2\2\26\u011d\3\2\2\2\30\u0120\3\2\2"+
		"\2\32\u013b\3\2\2\2\34\u015f\3\2\2\2\36\u0169\3\2\2\2 \u016b\3\2\2\2\""+
		"\u0179\3\2\2\2$\u0182\3\2\2\2&\u0193\3\2\2\2(\u0198\3\2\2\2*\u019f\3\2"+
		"\2\2,\u01a8\3\2\2\2.\u01b7\3\2\2\2\60\u01ba\3\2\2\2\62\u01c8\3\2\2\2\64"+
		"\u01cc\3\2\2\2\66\u01d6\3\2\2\28\u01d8\3\2\2\2:\u01e7\3\2\2\2<\u01f4\3"+
		"\2\2\2>\u0201\3\2\2\2@\u0208\3\2\2\2B\u0215\3\2\2\2D\u021c\3\2\2\2F\u0229"+
		"\3\2\2\2H\u022d\3\2\2\2J\u023a\3\2\2\2L\u0247\3\2\2\2N\u024f\3\2\2\2P"+
		"\u0279\3\2\2\2R\u027b\3\2\2\2T\u027d\3\2\2\2V\u027f\3\2\2\2X\u0281\3\2"+
		"\2\2Z\u028b\3\2\2\2\\\u029e\3\2\2\2^\u02a0\3\2\2\2`\u02c0\3\2\2\2b\u02c2"+
		"\3\2\2\2d\u02c5\3\2\2\2f\u02ce\3\2\2\2h\u02d0\3\2\2\2j\u02d2\3\2\2\2l"+
		"\u02d4\3\2\2\2n\u02dc\3\2\2\2p\u02de\3\2\2\2r\u02ee\3\2\2\2t\u02f4\3\2"+
		"\2\2v\u02fc\3\2\2\2x\u02ff\3\2\2\2z\u0302\3\2\2\2|\u0308\3\2\2\2~\u030b"+
		"\3\2\2\2\u0080\u0316\3\2\2\2\u0082\u031e\3\2\2\2\u0084\u0326\3\2\2\2\u0086"+
		"\u0331\3\2\2\2\u0088\u0340\3\2\2\2\u008a\u0366\3\2\2\2\u008c\u03d6\3\2"+
		"\2\2\u008e\u03d8\3\2\2\2\u0090\u03e0\3\2\2\2\u0092\u03eb\3\2\2\2\u0094"+
		"\u03f7\3\2\2\2\u0096\u03f9\3\2\2\2\u0098\u03fe\3\2\2\2\u009a\u0418\3\2"+
		"\2\2\u009c\u041c\3\2\2\2\u009e\u0422\3\2\2\2\u00a0\u0432\3\2\2\2\u00a2"+
		"\u0438\3\2\2\2\u00a4\u0441\3\2\2\2\u00a6\u0443\3\2\2\2\u00a8\u044b\3\2"+
		"\2\2\u00aa\u044e\3\2\2\2\u00ac\u0451\3\2\2\2\u00ae\u045f\3\2\2\2\u00b0"+
		"\u0461\3\2\2\2\u00b2\u046d\3\2\2\2\u00b4\u0470\3\2\2\2\u00b6\u047c\3\2"+
		"\2\2\u00b8\u0480\3\2\2\2\u00ba\u0482\3\2\2\2\u00bc\u04a0\3\2\2\2\u00be"+
		"\u04a4\3\2\2\2\u00c0\u04a6\3\2\2\2\u00c2\u04b3\3\2\2\2\u00c4\u00c6\5\4"+
		"\3\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00d1\3\2\2\2\u00c7"+
		"\u00d0\5\26\f\2\u00c8\u00d0\5\6\4\2\u00c9\u00d0\5\24\13\2\u00ca\u00d0"+
		"\5\30\r\2\u00cb\u00d0\5,\27\2\u00cc\u00d0\5\u0082B\2\u00cd\u00d0\5$\23"+
		"\2\u00ce\u00d0\58\35\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9"+
		"\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7\2\2\3\u00d5\3\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\5\3\2\2\2\u00d8"+
		"\u00d9\7\3\2\2\u00d9\u00da\5\b\5\2\u00da\u00db\5\n\6\2\u00db\u00dc\7\4"+
		"\2\2\u00dc\7\3\2\2\2\u00dd\u00de\5\u00c2b\2\u00de\t\3\2\2\2\u00df\u00e2"+
		"\5\f\7\2\u00e0\u00e2\5\u008aF\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2"+
		"\2\u00e2\13\3\2\2\2\u00e3\u00e5\5\20\t\2\u00e4\u00e6\5\20\t\2\u00e5\u00e4"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\r\3\2\2\2\u00e7\u00e8\t\2\2\2\u00e8"+
		"\17\3\2\2\2\u00e9\u00eb\5\16\b\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7m\2\2\u00ed\21\3\2\2\2\u00ee\u00f1"+
		"\5\u00c2b\2\u00ef\u00f0\7\f\2\2\u00f0\u00f2\5\u00c2b\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\7\r\2\2\u00f4\u00f7"+
		"\7\u0085\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f8\5\u00c2b\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0116\7\4\2\2\u00fa"+
		"\u00fd\7\r\2\2\u00fb\u00fe\7\16\2\2\u00fc\u00fe\5\u00c2b\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\7\f\2\2\u0100"+
		"\u0102\5\u00c2b\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\7\17\2\2\u0104\u0105\7\u0085\2\2\u0105\u0116\7\4"+
		"\2\2\u0106\u0107\7\r\2\2\u0107\u0108\7\20\2\2\u0108\u010d\5\22\n\2\u0109"+
		"\u010a\7\21\2\2\u010a\u010c\5\22\n\2\u010b\u0109\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\22\2\2\u0111\u0112\7\17\2\2\u0112\u0113\7"+
		"\u0085\2\2\u0113\u0114\7\4\2\2\u0114\u0116\3\2\2\2\u0115\u00f3\3\2\2\2"+
		"\u0115\u00fa\3\2\2\2\u0115\u0106\3\2\2\2\u0116\25\3\2\2\2\u0117\u0119"+
		"\7\u0087\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2"+
		"\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011e\7\u0088\2\2\u011d"+
		"\u0118\3\2\2\2\u011d\u011c\3\2\2\2\u011e\27\3\2\2\2\u011f\u0121\5\26\f"+
		"\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0124"+
		"\7\23\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0126\t\3\2\2\u0126\u0130\5\u00c2b\2\u0127\u0128\7\27\2\2\u0128"+
		"\u012d\5\32\16\2\u0129\u012a\7\21\2\2\u012a\u012c\5\32\16\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0136\7\20\2\2\u0133\u0135\5\36\20\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\22\2\2\u013a"+
		"\31\3\2\2\2\u013b\u013d\5L\'\2\u013c\u013e\5\34\17\2\u013d\u013c\3\2\2"+
		"\2\u013d\u013e\3\2\2\2\u013e\33\3\2\2\2\u013f\u0141\7\30\2\2\u0140\u0142"+
		"\5\u008aF\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0147\3\2\2"+
		"\2\u0143\u0144\7\21\2\2\u0144\u0146\5\u008aF\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u0160\7\31\2\2\u014b\u015b\7\32\2\2\u014c"+
		"\u014d\5\u00c2b\2\u014d\u014e\7\33\2\2\u014e\u0156\5\u008aF\2\u014f\u0150"+
		"\7\21\2\2\u0150\u0151\5\u00c2b\2\u0151\u0152\7\33\2\2\u0152\u0153\5\u008a"+
		"F\2\u0153\u0155\3\2\2\2\u0154\u014f\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u014c\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\7\34"+
		"\2\2\u015f\u013f\3\2\2\2\u015f\u014b\3\2\2\2\u0160\35\3\2\2\2\u0161\u016a"+
		"\5 \21\2\u0162\u016a\5\"\22\2\u0163\u016a\5$\23\2\u0164\u016a\5&\24\2"+
		"\u0165\u016a\5(\25\2\u0166\u016a\5,\27\2\u0167\u016a\5\64\33\2\u0168\u016a"+
		"\58\35\2\u0169\u0161\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0163\3\2\2\2\u0169"+
		"\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u0168\3\2\2\2\u016a\37\3\2\2\2\u016b\u016f\5J&\2\u016c\u016e"+
		"\t\4\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0175\5\u00c2"+
		"b\2\u0173\u0174\7\13\2\2\u0174\u0176\5\u008aF\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\4\2\2\u0178!\3\2\2\2"+
		"\u0179\u017a\7\35\2\2\u017a\u017b\5\u00c2b\2\u017b\u017e\7\36\2\2\u017c"+
		"\u017f\7\16\2\2\u017d\u017f\5J&\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\4\2\2\u0181#\3\2\2\2\u0182\u0183"+
		"\7\37\2\2\u0183\u0184\5\u00c2b\2\u0184\u018f\7\20\2\2\u0185\u0186\5H%"+
		"\2\u0186\u018c\7\4\2\2\u0187\u0188\5H%\2\u0188\u0189\7\4\2\2\u0189\u018b"+
		"\3\2\2\2\u018a\u0187\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0185\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\22\2\2\u0192"+
		"%\3\2\2\2\u0193\u0194\7 \2\2\u0194\u0195\5:\36\2\u0195\u0196\5\62\32\2"+
		"\u0196\u0197\5X-\2\u0197\'\3\2\2\2\u0198\u0199\7!\2\2\u0199\u019b\5\u00c2"+
		"b\2\u019a\u019c\5:\36\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\5X-\2\u019e)\3\2\2\2\u019f\u01a5\5\u00c2b\2"+
		"\u01a0\u01a2\7\30\2\2\u01a1\u01a3\5\u008eH\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\7\31\2\2\u01a5\u01a0\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6+\3\2\2\2\u01a7\u01a9\5\26\f\2\u01a8\u01a7"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\t\5\2\2\u01ab"+
		"\u01ad\5\u00c2b\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\5:\36\2\u01af\u01b1\5\62\32\2\u01b0\u01b2\5.\30\2"+
		"\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b6"+
		"\7\4\2\2\u01b4\u01b6\5X-\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"-\3\2\2\2\u01b7\u01b8\7%\2\2\u01b8\u01b9\5:\36\2\u01b9/\3\2\2\2\u01ba"+
		"\u01bb\7w\2\2\u01bb\u01bc\5:\36\2\u01bc\61\3\2\2\2\u01bd\u01c7\5*\26\2"+
		"\u01be\u01c7\5V,\2\u01bf\u01c7\7{\2\2\u01c0\u01c7\7\u0080\2\2\u01c1\u01c7"+
		"\7}\2\2\u01c2\u01c7\7\177\2\2\u01c3\u01c7\7w\2\2\u01c4\u01c7\5\60\31\2"+
		"\u01c5\u01c7\7y\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01bf"+
		"\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\63\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cb\u01cd\5\26\f\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2"+
		"\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7&\2\2\u01cf\u01d0\5\u00c2b\2\u01d0\u01d2"+
		"\5@!\2\u01d1\u01d3\7t\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\7\4\2\2\u01d5\65\3\2\2\2\u01d6\u01d7\5\u00c2"+
		"b\2\u01d7\67\3\2\2\2\u01d8\u01d9\7\'\2\2\u01d9\u01da\5\u00c2b\2\u01da"+
		"\u01dc\7\20\2\2\u01db\u01dd\5\66\34\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01e2\3\2\2\2\u01de\u01df\7\21\2\2\u01df\u01e1\5\66\34"+
		"\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7\22\2\2"+
		"\u01e69\3\2\2\2\u01e7\u01f0\7\30\2\2\u01e8\u01ed\5> \2\u01e9\u01ea\7\21"+
		"\2\2\u01ea\u01ec\5> \2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01e8\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7\31"+
		"\2\2\u01f3;\3\2\2\2\u01f4\u01fd\7\30\2\2\u01f5\u01fa\5> \2\u01f6\u01f7"+
		"\7\21\2\2\u01f7\u01f9\5> \2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01f5\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\7\31\2\2\u0200=\3\2\2\2\u0201\u0203\5J&\2\u0202\u0204\5T+\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0207\5\u00c2"+
		"b\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207?\3\2\2\2\u0208\u0211"+
		"\7\30\2\2\u0209\u020e\5B\"\2\u020a\u020b\7\21\2\2\u020b\u020d\5B\"\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0209\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7\31\2\2\u0214A\3\2\2\2"+
		"\u0215\u0217\5J&\2\u0216\u0218\7|\2\2\u0217\u0216\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u00c2b\2\u021a\u0219\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021bC\3\2\2\2\u021c\u0225\7\30\2\2\u021d\u0222"+
		"\5F$\2\u021e\u021f\7\21\2\2\u021f\u0221\5F$\2\u0220\u021e\3\2\2\2\u0221"+
		"\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0225\u021d\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0228\7\31\2\2\u0228E\3\2\2\2\u0229\u022b\5J&\2\u022a"+
		"\u022c\5T+\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022cG\3\2\2\2\u022d"+
		"\u022f\5J&\2\u022e\u0230\5T+\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2"+
		"\u0230\u0231\3\2\2\2\u0231\u0232\5\u00c2b\2\u0232I\3\2\2\2\u0233\u0234"+
		"\b&\1\2\u0234\u023b\5\u0088E\2\u0235\u023b\5L\'\2\u0236\u023b\5N(\2\u0237"+
		"\u023b\5P)\2\u0238\u0239\7*\2\2\u0239\u023b\7~\2\2\u023a\u0233\3\2\2\2"+
		"\u023a\u0235\3\2\2\2\u023a\u0236\3\2\2\2\u023a\u0237\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023b\u0244\3\2\2\2\u023c\u023d\f\5\2\2\u023d\u023f\7(\2\2\u023e"+
		"\u0240\5\u008aF\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0243\7)\2\2\u0242\u023c\3\2\2\2\u0243\u0246\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245K\3\2\2\2\u0246\u0244\3\2\2\2"+
		"\u0247\u024c\5\u00c2b\2\u0248\u0249\7+\2\2\u0249\u024b\5\u00c2b\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024dM\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7,\2\2\u0250\u0253"+
		"\7\30\2\2\u0251\u0254\5\u0088E\2\u0252\u0254\5L\'\2\u0253\u0251\3\2\2"+
		"\2\u0253\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7-\2\2\u0256\u0257"+
		"\5J&\2\u0257\u0258\7\31\2\2\u0258O\3\2\2\2\u0259\u025a\7\"\2\2\u025a\u0260"+
		"\5D#\2\u025b\u025f\7}\2\2\u025c\u025f\7{\2\2\u025d\u025f\5V,\2\u025e\u025b"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0265\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0263\u0264\7%\2\2\u0264\u0266\5D#\2\u0265\u0263\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u027a\3\2\2\2\u0267\u0268\7\"\2\2\u0268\u026a\7\30\2\2"+
		"\u0269\u026b\5:\36\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u0271\7\31\2\2\u026d\u0270\5R*\2\u026e\u0270\5V,\2\u026f"+
		"\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274"+
		"\u0275\7%\2\2\u0275\u0276\7\30\2\2\u0276\u0277\5:\36\2\u0277\u0278\7\31"+
		"\2\2\u0278\u027a\3\2\2\2\u0279\u0259\3\2\2\2\u0279\u0267\3\2\2\2\u027a"+
		"Q\3\2\2\2\u027b\u027c\t\6\2\2\u027cS\3\2\2\2\u027d\u027e\t\7\2\2\u027e"+
		"U\3\2\2\2\u027f\u0280\t\b\2\2\u0280W\3\2\2\2\u0281\u0286\7\20\2\2\u0282"+
		"\u0285\5\\/\2\u0283\u0285\5Z.\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2"+
		"\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289"+
		"\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\7\22\2\2\u028aY\3\2\2\2\u028b"+
		"\u028c\7\61\2\2\u028c\u028d\5X-\2\u028d[\3\2\2\2\u028e\u029f\5d\63\2\u028f"+
		"\u029f\5l\67\2\u0290\u029f\5p9\2\u0291\u029f\5X-\2\u0292\u029f\5r:\2\u0293"+
		"\u029f\5t;\2\u0294\u029f\5v<\2\u0295\u029f\5x=\2\u0296\u029f\5z>\2\u0297"+
		"\u029f\5|?\2\u0298\u029f\5~@\2\u0299\u029f\5n8\2\u029a\u029f\5^\60\2\u029b"+
		"\u029f\5`\61\2\u029c\u029f\7\u0089\2\2\u029d\u029f\7\u008a\2\2\u029e\u028e"+
		"\3\2\2\2\u029e\u028f\3\2\2\2\u029e\u0290\3\2\2\2\u029e\u0291\3\2\2\2\u029e"+
		"\u0292\3\2\2\2\u029e\u0293\3\2\2\2\u029e\u0294\3\2\2\2\u029e\u0295\3\2"+
		"\2\2\u029e\u0296\3\2\2\2\u029e\u0297\3\2\2\2\u029e\u0298\3\2\2\2\u029e"+
		"\u0299\3\2\2\2\u029e\u029a\3\2\2\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029e\u029d\3\2\2\2\u029f]\3\2\2\2\u02a0\u02a1\7\62\2\2\u02a1\u02a7"+
		"\5\u008aF\2\u02a2\u02a3\7%\2\2\u02a3\u02a4\7\30\2\2\u02a4\u02a5\5:\36"+
		"\2\u02a5\u02a6\7\31\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a2\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ad\5X-\2\u02aa\u02ac\5`\61"+
		"\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae_\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02bb\7\63\2\2\u02b1"+
		"\u02b3\5\u00c2b\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b5\7\30\2\2\u02b5\u02b7\5:\36\2\u02b6\u02b8\5\26\f\2"+
		"\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba"+
		"\7\31\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b2\3\2\2\2\u02bb\u02bc\3\2\2\2"+
		"\u02bc\u02bd\3\2\2\2\u02bd\u02c1\5X-\2\u02be\u02bf\7\63\2\2\u02bf\u02c1"+
		"\5X-\2\u02c0\u02b0\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1a\3\2\2\2\u02c2\u02c3"+
		"\5\u008aF\2\u02c3\u02c4\7\4\2\2\u02c4c\3\2\2\2\u02c5\u02c6\7\64\2\2\u02c6"+
		"\u02c7\7\30\2\2\u02c7\u02c8\5f\64\2\u02c8\u02c9\7\31\2\2\u02c9\u02cc\5"+
		"h\65\2\u02ca\u02cb\7\65\2\2\u02cb\u02cd\5j\66\2\u02cc\u02ca\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cde\3\2\2\2\u02ce\u02cf\5\u008aF\2\u02cfg\3\2\2\2\u02d0"+
		"\u02d1\5\\/\2\u02d1i\3\2\2\2\u02d2\u02d3\5\\/\2\u02d3k\3\2\2\2\u02d4\u02d5"+
		"\7\66\2\2\u02d5\u02d6\7\30\2\2\u02d6\u02d7\5\u008aF\2\u02d7\u02d8\7\31"+
		"\2\2\u02d8\u02d9\5\\/\2\u02d9m\3\2\2\2\u02da\u02dd\5\u0080A\2\u02db\u02dd"+
		"\5b\62\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02ddo\3\2\2\2\u02de"+
		"\u02df\7\36\2\2\u02df\u02e2\7\30\2\2\u02e0\u02e3\5n8\2\u02e1\u02e3\7\4"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4"+
		"\u02e7\5b\62\2\u02e5\u02e7\7\4\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2"+
		"\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02ea\5\u008aF\2\u02e9\u02e8\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7\31\2\2\u02ec\u02ed\5"+
		"\\/\2\u02edq\3\2\2\2\u02ee\u02f0\7\67\2\2\u02ef\u02f1\7\u0085\2\2\u02f0"+
		"\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\5\u0098"+
		"M\2\u02f3s\3\2\2\2\u02f4\u02f5\78\2\2\u02f5\u02f6\5\\/\2\u02f6\u02f7\7"+
		"\66\2\2\u02f7\u02f8\7\30\2\2\u02f8\u02f9\5\u008aF\2\u02f9\u02fa\7\31\2"+
		"\2\u02fa\u02fb\7\4\2\2\u02fbu\3\2\2\2\u02fc\u02fd\7z\2\2\u02fd\u02fe\7"+
		"\4\2\2\u02few\3\2\2\2\u02ff\u0300\7u\2\2\u0300\u0301\7\4\2\2\u0301y\3"+
		"\2\2\2\u0302\u0304\79\2\2\u0303\u0305\5\u008aF\2\u0304\u0303\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\7\4\2\2\u0307{\3\2\2\2"+
		"\u0308\u0309\7:\2\2\u0309\u030a\7\4\2\2\u030a}\3\2\2\2\u030b\u030c\7;"+
		"\2\2\u030c\u030d\5\u0096L\2\u030d\u030e\7\4\2\2\u030e\177\3\2\2\2\u030f"+
		"\u0310\7<\2\2\u0310\u0317\5\u0086D\2\u0311\u0317\5H%\2\u0312\u0313\7\30"+
		"\2\2\u0313\u0314\5\u0084C\2\u0314\u0315\7\31\2\2\u0315\u0317\3\2\2\2\u0316"+
		"\u030f\3\2\2\2\u0316\u0311\3\2\2\2\u0316\u0312\3\2\2\2\u0317\u031a\3\2"+
		"\2\2\u0318\u0319\7\13\2\2\u0319\u031b\5\u008aF\2\u031a\u0318\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\7\4\2\2\u031d\u0081\3\2"+
		"\2\2\u031e\u031f\5J&\2\u031f\u0320\7v\2\2\u0320\u0321\5\u00c2b\2\u0321"+
		"\u0322\7\13\2\2\u0322\u0323\5\u008aF\2\u0323\u0324\7\4\2\2\u0324\u0083"+
		"\3\2\2\2\u0325\u0327\5H%\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u032e\3\2\2\2\u0328\u032a\7\21\2\2\u0329\u032b\5H%\2\u032a\u0329\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u0328\3\2\2\2\u032d"+
		"\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0085\3\2"+
		"\2\2\u0330\u032e\3\2\2\2\u0331\u0338\7\30\2\2\u0332\u0334\5\u00c2b\2\u0333"+
		"\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\7\21"+
		"\2\2\u0336\u0333\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033d\5\u00c2"+
		"b\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u033f\7\31\2\2\u033f\u0087\3\2\2\2\u0340\u0341\t\t\2\2\u0341\u0089\3"+
		"\2\2\2\u0342\u0343\bF\1\2\u0343\u0344\7(\2\2\u0344\u0349\5\u008aF\2\u0345"+
		"\u0346\7\21\2\2\u0346\u0348\5\u008aF\2\u0347\u0345\3\2\2\2\u0348\u034b"+
		"\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b"+
		"\u0349\3\2\2\2\u034c\u034d\7)\2\2\u034d\u0367\3\2\2\2\u034e\u034f\7~\2"+
		"\2\u034f\u0367\5\34\17\2\u0350\u0351\7\u0082\2\2\u0351\u0352\7\30\2\2"+
		"\u0352\u0353\5J&\2\u0353\u0354\7\31\2\2\u0354\u0367\3\2\2\2\u0355\u0356"+
		"\t\n\2\2\u0356\u0367\5\u008aF\31\u0357\u0358\7E\2\2\u0358\u0367\5J&\2"+
		"\u0359\u035a\7\30\2\2\u035a\u035b\5\u008aF\2\u035b\u035c\7\31\2\2\u035c"+
		"\u0367\3\2\2\2\u035d\u035e\t\13\2\2\u035e\u0367\5\u008aF\24\u035f\u0360"+
		"\t\f\2\2\u0360\u0367\5\u008aF\23\u0361\u0362\7B\2\2\u0362\u0367\5\u008a"+
		"F\22\u0363\u0364\7\6\2\2\u0364\u0367\5\u008aF\21\u0365\u0367\5\u008cG"+
		"\2\u0366\u0342\3\2\2\2\u0366\u034e\3\2\2\2\u0366\u0350\3\2\2\2\u0366\u0355"+
		"\3\2\2\2\u0366\u0357\3\2\2\2\u0366\u0359\3\2\2\2\u0366\u035d\3\2\2\2\u0366"+
		"\u035f\3\2\2\2\u0366\u0361\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0365\3\2"+
		"\2\2\u0367\u03c3\3\2\2\2\u0368\u0369\f\20\2\2\u0369\u036a\7H\2\2\u036a"+
		"\u03c2\5\u008aF\21\u036b\u036c\f\17\2\2\u036c\u036d\t\r\2\2\u036d\u03c2"+
		"\5\u008aF\20\u036e\u036f\f\16\2\2\u036f\u0370\t\13\2\2\u0370\u03c2\5\u008a"+
		"F\17\u0371\u0372\f\r\2\2\u0372\u0373\t\16\2\2\u0373\u03c2\5\u008aF\16"+
		"\u0374\u0375\f\f\2\2\u0375\u0376\7N\2\2\u0376\u03c2\5\u008aF\r\u0377\u0378"+
		"\f\13\2\2\u0378\u0379\7\5\2\2\u0379\u03c2\5\u008aF\f\u037a\u037b\f\n\2"+
		"\2\u037b\u037c\7O\2\2\u037c\u03c2\5\u008aF\13\u037d\u037e\f\t\2\2\u037e"+
		"\u037f\t\17\2\2\u037f\u03c2\5\u008aF\n\u0380\u0381\f\b\2\2\u0381\u0382"+
		"\t\20\2\2\u0382\u03c2\5\u008aF\t\u0383\u0384\f\7\2\2\u0384\u0385\7R\2"+
		"\2\u0385\u03c2\5\u008aF\b\u0386\u0387\f\6\2\2\u0387\u0388\7S\2\2\u0388"+
		"\u03c2\5\u008aF\7\u0389\u038a\f\5\2\2\u038a\u038b\7T\2\2\u038b\u038c\5"+
		"\u008aF\2\u038c\u038d\7\33\2\2\u038d\u038e\5\u008aF\6\u038e\u03c2\3\2"+
		"\2\2\u038f\u0390\f\4\2\2\u0390\u0391\t\21\2\2\u0391\u03c2\5\u008aF\5\u0392"+
		"\u0393\f \2\2\u0393\u0395\7(\2\2\u0394\u0396\5\u008aF\2\u0395\u0394\3"+
		"\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u03c2\7)\2\2\u0398"+
		"\u0399\f\36\2\2\u0399\u039b\7(\2\2\u039a\u039c\5\u008aF\2\u039b\u039a"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\7\33\2\2"+
		"\u039e\u03a0\5\u008aF\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03c2\7)\2\2\u03a2\u03a3\f\35\2\2\u03a3\u03a6\7+"+
		"\2\2\u03a4\u03a7\5\u00c2b\2\u03a5\u03a7\7*\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a5\3\2\2\2\u03a7\u03c2\3\2\2\2\u03a8\u03a9\f\34\2\2\u03a9\u03b7\7"+
		"\20\2\2\u03aa\u03ab\5\u00c2b\2\u03ab\u03ac\7\33\2\2\u03ac\u03b4\5\u008a"+
		"F\2\u03ad\u03ae\7\21\2\2\u03ae\u03af\5\u00c2b\2\u03af\u03b0\7\33\2\2\u03b0"+
		"\u03b1\5\u008aF\2\u03b1\u03b3\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b3\u03b6"+
		"\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03aa\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03c2\7\22\2\2\u03ba\u03bb\f\30\2\2\u03bb\u03c2\t\22\2\2\u03bc"+
		"\u03bd\f\26\2\2\u03bd\u03be\7\30\2\2\u03be\u03bf\5\u0094K\2\u03bf\u03c0"+
		"\7\31\2\2\u03c0\u03c2\3\2\2\2\u03c1\u0368\3\2\2\2\u03c1\u036b\3\2\2\2"+
		"\u03c1\u036e\3\2\2\2\u03c1\u0371\3\2\2\2\u03c1\u0374\3\2\2\2\u03c1\u0377"+
		"\3\2\2\2\u03c1\u037a\3\2\2\2\u03c1\u037d\3\2\2\2\u03c1\u0380\3\2\2\2\u03c1"+
		"\u0383\3\2\2\2\u03c1\u0386\3\2\2\2\u03c1\u0389\3\2\2\2\u03c1\u038f\3\2"+
		"\2\2\u03c1\u0392\3\2\2\2\u03c1\u0398\3\2\2\2\u03c1\u03a2\3\2\2\2\u03c1"+
		"\u03a8\3\2\2\2\u03c1\u03ba\3\2\2\2\u03c1\u03bc\3\2\2\2\u03c2\u03c5\3\2"+
		"\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u008b\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03d7\7n\2\2\u03c7\u03d7\5\u00c0a\2\u03c8\u03d7\7"+
		"r\2\2\u03c9\u03d7\7\u0085\2\2\u03ca\u03cd\5\u00c2b\2\u03cb\u03cc\7(\2"+
		"\2\u03cc\u03ce\7)\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d7"+
		"\3\2\2\2\u03cf\u03d7\7\u0082\2\2\u03d0\u03d7\5\u00bc_\2\u03d1\u03d4\5"+
		"\u00be`\2\u03d2\u03d3\7(\2\2\u03d3\u03d5\7)\2\2\u03d4\u03d2\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03c6\3\2\2\2\u03d6\u03c7\3\2"+
		"\2\2\u03d6\u03c8\3\2\2\2\u03d6\u03c9\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d6"+
		"\u03cf\3\2\2\2\u03d6\u03d0\3\2\2\2\u03d6\u03d1\3\2\2\2\u03d7\u008d\3\2"+
		"\2\2\u03d8\u03dd\5\u008aF\2\u03d9\u03da\7\21\2\2\u03da\u03dc\5\u008aF"+
		"\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de"+
		"\3\2\2\2\u03de\u008f\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e5\5\u0092J"+
		"\2\u03e1\u03e2\7\21\2\2\u03e2\u03e4\5\u0092J\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\3\2"+
		"\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03ea\7\21\2\2\u03e9\u03e8\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u0091\3\2\2\2\u03eb\u03ec\5\u00c2b\2\u03ec\u03ed"+
		"\7\33\2\2\u03ed\u03ee\5\u008aF\2\u03ee\u0093\3\2\2\2\u03ef\u03f1\7\20"+
		"\2\2\u03f0\u03f2\5\u0090I\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u03f8\7\22\2\2\u03f4\u03f6\5\u008eH\2\u03f5\u03f4"+
		"\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03ef\3\2\2\2\u03f7"+
		"\u03f5\3\2\2\2\u03f8\u0095\3\2\2\2\u03f9\u03fa\5\u008aF\2\u03fa\u03fb"+
		"\7\30\2\2\u03fb\u03fc\5\u0094K\2\u03fc\u03fd\7\31\2\2\u03fd\u0097\3\2"+
		"\2\2\u03fe\u0402\7\20\2\2\u03ff\u0401\5\u009aN\2\u0400\u03ff\3\2\2\2\u0401"+
		"\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2"+
		"\2\2\u0404\u0402\3\2\2\2\u0405\u0406\7\22\2\2\u0406\u0099\3\2\2\2\u0407"+
		"\u0419\5\u00c2b\2\u0408\u0419\5\u0098M\2\u0409\u0419\5\u009cO\2\u040a"+
		"\u0419\5\u00a0Q\2\u040b\u0419\5\u00a2R\2\u040c\u0419\5\u00a8U\2\u040d"+
		"\u0419\5\u00aaV\2\u040e\u0419\5\u00acW\2\u040f\u0419\5\u00b0Y\2\u0410"+
		"\u0419\5\u00b4[\2\u0411\u0419\5\u00b6\\\2\u0412\u0419\7u\2\2\u0413\u0419"+
		"\7z\2\2\u0414\u0419\5\u00ba^\2\u0415\u0419\5\u00c0a\2\u0416\u0419\7\u0085"+
		"\2\2\u0417\u0419\7r\2\2\u0418\u0407\3\2\2\2\u0418\u0408\3\2\2\2\u0418"+
		"\u0409\3\2\2\2\u0418\u040a\3\2\2\2\u0418\u040b\3\2\2\2\u0418\u040c\3\2"+
		"\2\2\u0418\u040d\3\2\2\2\u0418\u040e\3\2\2\2\u0418\u040f\3\2\2\2\u0418"+
		"\u0410\3\2\2\2\u0418\u0411\3\2\2\2\u0418\u0412\3\2\2\2\u0418\u0413\3\2"+
		"\2\2\u0418\u0414\3\2\2\2\u0418\u0415\3\2\2\2\u0418\u0416\3\2\2\2\u0418"+
		"\u0417\3\2\2\2\u0419\u009b\3\2\2\2\u041a\u041d\5\u009eP\2\u041b\u041d"+
		"\5\u00b8]\2\u041c\u041a\3\2\2\2\u041c\u041b\3\2\2\2\u041d\u009d\3\2\2"+
		"\2\u041e\u0423\79\2\2\u041f\u0423\7*\2\2\u0420\u0423\7?\2\2\u0421\u0423"+
		"\5\u00c2b\2\u0422\u041e\3\2\2\2\u0422\u041f\3\2\2\2\u0422\u0420\3\2\2"+
		"\2\u0422\u0421\3\2\2\2\u0423\u0430\3\2\2\2\u0424\u0426\7\30\2\2\u0425"+
		"\u0427\5\u009cO\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u042c"+
		"\3\2\2\2\u0428\u0429\7\21\2\2\u0429\u042b\5\u009cO\2\u042a\u0428\3\2\2"+
		"\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f"+
		"\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0431\7\31\2\2\u0430\u0424\3\2\2\2"+
		"\u0430\u0431\3\2\2\2\u0431\u009f\3\2\2\2\u0432\u0433\7`\2\2\u0433\u0436"+
		"\5\u00a4S\2\u0434\u0435\7a\2\2\u0435\u0437\5\u009cO\2\u0436\u0434\3\2"+
		"\2\2\u0436\u0437\3\2\2\2\u0437\u00a1\3\2\2\2\u0438\u0439\5\u00a4S\2\u0439"+
		"\u043a\7a\2\2\u043a\u043b\5\u009cO\2\u043b\u00a3\3\2\2\2\u043c\u0442\5"+
		"\u00c2b\2\u043d\u043e\7\30\2\2\u043e\u043f\5\u00a6T\2\u043f\u0440\7\31"+
		"\2\2\u0440\u0442\3\2\2\2\u0441\u043c\3\2\2\2\u0441\u043d\3\2\2\2\u0442"+
		"\u00a5\3\2\2\2\u0443\u0448\5\u00c2b\2\u0444\u0445\7\21\2\2\u0445\u0447"+
		"\5\u00c2b\2\u0446\u0444\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2"+
		"\2\u0448\u0449\3\2\2\2\u0449\u00a7\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c"+
		"\7b\2\2\u044c\u044d\5\u00c2b\2\u044d\u00a9\3\2\2\2\u044e\u044f\5\u00c2"+
		"b\2\u044f\u0450\7\33\2\2\u0450\u00ab\3\2\2\2\u0451\u0452\7c\2\2\u0452"+
		"\u0456\5\u009cO\2\u0453\u0455\5\u00aeX\2\u0454\u0453\3\2\2\2\u0455\u0458"+
		"\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u00ad\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0459\u045a\7d\2\2\u045a\u045b\5\u00b8]\2\u045b\u045c\5"+
		"\u0098M\2\u045c\u0460\3\2\2\2\u045d\u045e\7e\2\2\u045e\u0460\5\u0098M"+
		"\2\u045f\u0459\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u00af\3\2\2\2\u0461\u0462"+
		"\7\"\2\2\u0462\u0463\5\u00c2b\2\u0463\u0465\7\30\2\2\u0464\u0466\5\u00a6"+
		"T\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0469\7\31\2\2\u0468\u046a\5\u00b2Z\2\u0469\u0468\3\2\2\2\u0469\u046a"+
		"\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\5\u0098M\2\u046c\u00b1\3\2\2"+
		"\2\u046d\u046e\7f\2\2\u046e\u046f\5\u00a6T\2\u046f\u00b3\3\2\2\2\u0470"+
		"\u0473\7\36\2\2\u0471\u0474\5\u0098M\2\u0472\u0474\5\u009cO\2\u0473\u0471"+
		"\3\2\2\2\u0473\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0478\5\u009cO"+
		"\2\u0476\u0479\5\u0098M\2\u0477\u0479\5\u009cO\2\u0478\u0476\3\2\2\2\u0478"+
		"\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\5\u0098M\2\u047b\u00b5"+
		"\3\2\2\2\u047c\u047d\7\64\2\2\u047d\u047e\5\u009cO\2\u047e\u047f\5\u0098"+
		"M\2\u047f\u00b7\3\2\2\2\u0480\u0481\t\23\2\2\u0481\u00b9\3\2\2\2\u0482"+
		"\u0483\7\67\2\2\u0483\u0484\5\u00c2b\2\u0484\u0485\5\u0098M\2\u0485\u00bb"+
		"\3\2\2\2\u0486\u0488\7\30\2\2\u0487\u0489\5\u008aF\2\u0488\u0487\3\2\2"+
		"\2\u0488\u0489\3\2\2\2\u0489\u0490\3\2\2\2\u048a\u048c\7\21\2\2\u048b"+
		"\u048d\5\u008aF\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f"+
		"\3\2\2\2\u048e\u048a\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u04a1\7\31"+
		"\2\2\u0494\u049d\7(\2\2\u0495\u049a\5\u008aF\2\u0496\u0497\7\21\2\2\u0497"+
		"\u0499\5\u008aF\2\u0498\u0496\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049d"+
		"\u0495\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a1\7)"+
		"\2\2\u04a0\u0486\3\2\2\2\u04a0\u0494\3\2\2\2\u04a1\u00bd\3\2\2\2\u04a2"+
		"\u04a5\5\u0088E\2\u04a3\u04a5\5L\'\2\u04a4\u04a2\3\2\2\2\u04a4\u04a3\3"+
		"\2\2\2\u04a5\u00bf\3\2\2\2\u04a6\u04a8\t\24\2\2\u04a7\u04a9\7q\2\2\u04a8"+
		"\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00c1\3\2\2\2\u04aa\u04b4\t\25"+
		"\2\2\u04ab\u04b0\7\u0084\2\2\u04ac\u04ad\7\17\2\2\u04ad\u04af\7\u0084"+
		"\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04aa\3\2"+
		"\2\2\u04b3\u04ab\3\2\2\2\u04b4\u00c3\3\2\2\2\u008d\u00c5\u00cf\u00d1\u00e1"+
		"\u00e5\u00ea\u00f1\u00f7\u00fd\u0101\u010d\u0115\u011a\u011d\u0120\u0123"+
		"\u012d\u0130\u0136\u013d\u0141\u0147\u0156\u015b\u015f\u0169\u016f\u0175"+
		"\u017e\u018c\u018f\u019b\u01a2\u01a5\u01a8\u01ac\u01b1\u01b5\u01c6\u01c8"+
		"\u01cc\u01d2\u01dc\u01e2\u01ed\u01f0\u01fa\u01fd\u0203\u0206\u020e\u0211"+
		"\u0217\u021a\u0222\u0225\u022b\u022f\u023a\u023f\u0244\u024c\u0253\u025e"+
		"\u0260\u0265\u026a\u026f\u0271\u0279\u0284\u0286\u029e\u02a7\u02ad\u02b2"+
		"\u02b7\u02bb\u02c0\u02cc\u02dc\u02e2\u02e6\u02e9\u02f0\u0304\u0316\u031a"+
		"\u0326\u032a\u032e\u0333\u0338\u033c\u0349\u0366\u0395\u039b\u039f\u03a6"+
		"\u03b4\u03b7\u03c1\u03c3\u03cd\u03d4\u03d6\u03dd\u03e5\u03e9\u03f1\u03f5"+
		"\u03f7\u0402\u0418\u041c\u0422\u0426\u042c\u0430\u0436\u0441\u0448\u0456"+
		"\u045f\u0465\u0469\u0473\u0478\u0488\u048c\u0490\u049a\u049d\u04a0\u04a4"+
		"\u04a8\u04b0\u04b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}