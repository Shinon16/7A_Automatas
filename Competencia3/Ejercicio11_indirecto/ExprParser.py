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
        4,1,25,18,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,5,1,11,8,1,10,
        1,12,1,14,9,1,1,2,1,2,1,2,0,0,3,0,2,4,0,1,1,0,1,5,15,0,6,1,0,0,0,
        2,12,1,0,0,0,4,15,1,0,0,0,6,7,3,2,1,0,7,8,5,0,0,1,8,1,1,0,0,0,9,
        11,3,4,2,0,10,9,1,0,0,0,11,14,1,0,0,0,12,10,1,0,0,0,12,13,1,0,0,
        0,13,3,1,0,0,0,14,12,1,0,0,0,15,16,7,0,0,0,16,5,1,0,0,0,1,12
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'public'", "'class'", "'static'", 
                     "'void'", "'int'", "'String'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "'+'", "'.'", "';'", "'('", "')'", 
                     "'{'", "'}'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "PALABRA_RESERVADA", "VALOR", "IDENTIFICADOR", 
                      "OPERADOR", "SIMBOLO", "PUBLIC", "CLASS", "STATIC", 
                      "VOID", "INT", "STRING", "NUM", "CADENA", "ID", "IGUAL", 
                      "MAS", "PUNTO", "PUNTO_COMA", "PAR_IZQ", "PAR_DER", 
                      "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", "COR_DER", "WS" ]

    RULE_root = 0
    RULE_expr = 1
    RULE_elemento = 2

    ruleNames =  [ "root", "expr", "elemento" ]

    EOF = Token.EOF
    PALABRA_RESERVADA=1
    VALOR=2
    IDENTIFICADOR=3
    OPERADOR=4
    SIMBOLO=5
    PUBLIC=6
    CLASS=7
    STATIC=8
    VOID=9
    INT=10
    STRING=11
    NUM=12
    CADENA=13
    ID=14
    IGUAL=15
    MAS=16
    PUNTO=17
    PUNTO_COMA=18
    PAR_IZQ=19
    PAR_DER=20
    LLAVE_IZQ=21
    LLAVE_DER=22
    COR_IZQ=23
    COR_DER=24
    WS=25

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
            self.state = 6
            self.expr()
            self.state = 7
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

        def elemento(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ElementoContext)
            else:
                return self.getTypedRuleContext(ExprParser.ElementoContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 62) != 0):
                self.state = 9
                self.elemento()
                self.state = 14
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PALABRA_RESERVADA(self):
            return self.getToken(ExprParser.PALABRA_RESERVADA, 0)

        def VALOR(self):
            return self.getToken(ExprParser.VALOR, 0)

        def IDENTIFICADOR(self):
            return self.getToken(ExprParser.IDENTIFICADOR, 0)

        def OPERADOR(self):
            return self.getToken(ExprParser.OPERADOR, 0)

        def SIMBOLO(self):
            return self.getToken(ExprParser.SIMBOLO, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_elemento




    def elemento(self):

        localctx = ExprParser.ElementoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_elemento)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 62) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





