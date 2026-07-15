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
        4,1,20,14,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,5,1,9,8,1,10,1,12,1,12,
        9,1,1,1,0,0,2,0,2,0,1,1,0,1,19,12,0,4,1,0,0,0,2,10,1,0,0,0,4,5,3,
        2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,9,7,0,0,0,8,7,1,0,0,0,9,12,1,0,0,
        0,10,8,1,0,0,0,10,11,1,0,0,0,11,3,1,0,0,0,12,10,1,0,0,0,1,10
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'class'", "'static'", "'void'", 
                     "'int'", "'String'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'='", "'+'", "'.'", "';'", "'('", "')'", "'{'", "'}'", 
                     "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "PUBLIC", "CLASS", "STATIC", "VOID", 
                      "INT", "STRING", "NUM", "CADENA", "ID", "IGUAL", "MAS", 
                      "PUNTO", "PUNTO_COMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
                      "LLAVE_DER", "COR_IZQ", "COR_DER", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PUBLIC=1
    CLASS=2
    STATIC=3
    VOID=4
    INT=5
    STRING=6
    NUM=7
    CADENA=8
    ID=9
    IGUAL=10
    MAS=11
    PUNTO=12
    PUNTO_COMA=13
    PAR_IZQ=14
    PAR_DER=15
    LLAVE_IZQ=16
    LLAVE_DER=17
    COR_IZQ=18
    COR_DER=19
    WS=20

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

        def PUBLIC(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUBLIC)
            else:
                return self.getToken(ExprParser.PUBLIC, i)

        def CLASS(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.CLASS)
            else:
                return self.getToken(ExprParser.CLASS, i)

        def STATIC(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.STATIC)
            else:
                return self.getToken(ExprParser.STATIC, i)

        def VOID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.VOID)
            else:
                return self.getToken(ExprParser.VOID, i)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INT)
            else:
                return self.getToken(ExprParser.INT, i)

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.STRING)
            else:
                return self.getToken(ExprParser.STRING, i)

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

        def IGUAL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IGUAL)
            else:
                return self.getToken(ExprParser.IGUAL, i)

        def MAS(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.MAS)
            else:
                return self.getToken(ExprParser.MAS, i)

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

        def LLAVE_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.LLAVE_IZQ)
            else:
                return self.getToken(ExprParser.LLAVE_IZQ, i)

        def LLAVE_DER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.LLAVE_DER)
            else:
                return self.getToken(ExprParser.LLAVE_DER, i)

        def COR_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COR_IZQ)
            else:
                return self.getToken(ExprParser.COR_IZQ, i)

        def COR_DER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COR_DER)
            else:
                return self.getToken(ExprParser.COR_DER, i)

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
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1048574) != 0):
                self.state = 7
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1048574) != 0)):
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





