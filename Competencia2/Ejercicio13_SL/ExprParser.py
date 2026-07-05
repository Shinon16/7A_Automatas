# Generated from ./Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,36,14,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,5,1,9,8,1,10,1,12,1,12,
        9,1,1,1,0,0,2,0,2,0,1,3,0,1,24,27,30,35,35,12,0,4,1,0,0,0,2,10,1,
        0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,9,7,0,0,0,8,7,1,0,0,
        0,9,12,1,0,0,0,10,8,1,0,0,0,10,11,1,0,0,0,11,3,1,0,0,0,12,10,1,0,
        0,0,1,10
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CREATE'", "'TABLE'", "'SERIAL'", "'PRIMARY'", 
                     "'KEY'", "'VARCHAR'", "'NOT'", "'NULL'", "'INTEGER'", 
                     "'DATE'", "'INSERT'", "'INTO'", "'VALUES'", "'SELECT'", 
                     "'FROM'", "'INNER'", "'JOIN'", "'ON'", "'WHERE'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'='", "','", "'+'", "'>='", 
                     "'.'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
                     "'*'" ]

    symbolicNames = [ "<INVALID>", "CREATE", "TABLE", "SERIAL", "PRIMARY", 
                      "KEY", "VARCHAR", "NOT", "NULL", "INTEGER", "DATE", 
                      "INSERT", "INTO", "VALUES", "SELECT", "FROM", "INNER", 
                      "JOIN", "ON", "WHERE", "NUM", "CADENA", "ID", "ASIG", 
                      "COMA", "MAS", "MAYOR_IGUAL", "PUNTO", "PUNTO_COMA", 
                      "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", 
                      "COR_DER", "ASTERISCO", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    CREATE=1
    TABLE=2
    SERIAL=3
    PRIMARY=4
    KEY=5
    VARCHAR=6
    NOT=7
    NULL=8
    INTEGER=9
    DATE=10
    INSERT=11
    INTO=12
    VALUES=13
    SELECT=14
    FROM=15
    INNER=16
    JOIN=17
    ON=18
    WHERE=19
    NUM=20
    CADENA=21
    ID=22
    ASIG=23
    COMA=24
    MAS=25
    MAYOR_IGUAL=26
    PUNTO=27
    PUNTO_COMA=28
    PAR_IZQ=29
    PAR_DER=30
    LLAVE_IZQ=31
    LLAVE_DER=32
    COR_IZQ=33
    COR_DER=34
    ASTERISCO=35
    WS=36

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CREATE(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.CREATE)
            else:
                return self.getToken(ExprParser.CREATE, i)

        def TABLE(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.TABLE)
            else:
                return self.getToken(ExprParser.TABLE, i)

        def SERIAL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.SERIAL)
            else:
                return self.getToken(ExprParser.SERIAL, i)

        def PRIMARY(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PRIMARY)
            else:
                return self.getToken(ExprParser.PRIMARY, i)

        def KEY(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.KEY)
            else:
                return self.getToken(ExprParser.KEY, i)

        def VARCHAR(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.VARCHAR)
            else:
                return self.getToken(ExprParser.VARCHAR, i)

        def NOT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NOT)
            else:
                return self.getToken(ExprParser.NOT, i)

        def NULL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NULL)
            else:
                return self.getToken(ExprParser.NULL, i)

        def INTEGER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INTEGER)
            else:
                return self.getToken(ExprParser.INTEGER, i)

        def DATE(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.DATE)
            else:
                return self.getToken(ExprParser.DATE, i)

        def INSERT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INSERT)
            else:
                return self.getToken(ExprParser.INSERT, i)

        def INTO(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INTO)
            else:
                return self.getToken(ExprParser.INTO, i)

        def VALUES(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.VALUES)
            else:
                return self.getToken(ExprParser.VALUES, i)

        def SELECT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.SELECT)
            else:
                return self.getToken(ExprParser.SELECT, i)

        def FROM(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.FROM)
            else:
                return self.getToken(ExprParser.FROM, i)

        def INNER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INNER)
            else:
                return self.getToken(ExprParser.INNER, i)

        def JOIN(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.JOIN)
            else:
                return self.getToken(ExprParser.JOIN, i)

        def ON(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ON)
            else:
                return self.getToken(ExprParser.ON, i)

        def WHERE(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.WHERE)
            else:
                return self.getToken(ExprParser.WHERE, i)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NUM)
            else:
                return self.getToken(ExprParser.NUM, i)

        def CADENA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.CADENA)
            else:
                return self.getToken(ExprParser.CADENA, i)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def ASIG(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ASIG)
            else:
                return self.getToken(ExprParser.ASIG, i)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def PUNTO(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUNTO)
            else:
                return self.getToken(ExprParser.PUNTO, i)

        def PUNTO_COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUNTO_COMA)
            else:
                return self.getToken(ExprParser.PUNTO_COMA, i)

        def PAR_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PAR_IZQ)
            else:
                return self.getToken(ExprParser.PAR_IZQ, i)

        def PAR_DER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PAR_DER)
            else:
                return self.getToken(ExprParser.PAR_DER, i)

        def ASTERISCO(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ASTERISCO)
            else:
                return self.getToken(ExprParser.ASTERISCO, i)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 10
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 36406558718) != 0):
                self.state = 7
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 36406558718) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 12
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





