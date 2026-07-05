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
        4,1,33,14,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,5,1,9,8,1,10,1,12,1,12,
        9,1,1,1,0,0,2,0,2,0,1,1,0,1,19,12,0,4,1,0,0,0,2,10,1,0,0,0,4,5,3,
        2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,9,7,0,0,0,8,7,1,0,0,0,9,12,1,0,0,
        0,10,8,1,0,0,0,10,11,1,0,0,0,11,3,1,0,0,0,12,10,1,0,0,0,1,10
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'nmap'", "'ss'", "'sudo'", "'tcpdump'", 
                     "'curl'", "'dig'", "'journalctl'", "'grep'", "'ufw'", 
                     "'deny'", "'from'", "'MX'", "'today'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "','", "'+'", "'>='", "'.'", "';'", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'", "'*'" ]

    symbolicNames = [ "<INVALID>", "NMAP", "SS", "SUDO", "TCPDUMP", "CURL", 
                      "DIG", "JOURNALCTL", "GREP", "UFW", "DENY", "FROM", 
                      "MX", "TODAY", "OP", "IP", "NUM", "CADENA", "RUTA", 
                      "ID", "ASIG", "COMA", "MAS", "MAYOR_IGUAL", "PUNTO", 
                      "PUNTO_COMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", 
                      "COR_IZQ", "COR_DER", "ASTERISCO", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    NMAP=1
    SS=2
    SUDO=3
    TCPDUMP=4
    CURL=5
    DIG=6
    JOURNALCTL=7
    GREP=8
    UFW=9
    DENY=10
    FROM=11
    MX=12
    TODAY=13
    OP=14
    IP=15
    NUM=16
    CADENA=17
    RUTA=18
    ID=19
    ASIG=20
    COMA=21
    MAS=22
    MAYOR_IGUAL=23
    PUNTO=24
    PUNTO_COMA=25
    PAR_IZQ=26
    PAR_DER=27
    LLAVE_IZQ=28
    LLAVE_DER=29
    COR_IZQ=30
    COR_DER=31
    ASTERISCO=32
    WS=33

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

        def NMAP(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NMAP)
            else:
                return self.getToken(ExprParser.NMAP, i)

        def SS(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.SS)
            else:
                return self.getToken(ExprParser.SS, i)

        def SUDO(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.SUDO)
            else:
                return self.getToken(ExprParser.SUDO, i)

        def TCPDUMP(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.TCPDUMP)
            else:
                return self.getToken(ExprParser.TCPDUMP, i)

        def CURL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.CURL)
            else:
                return self.getToken(ExprParser.CURL, i)

        def DIG(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.DIG)
            else:
                return self.getToken(ExprParser.DIG, i)

        def JOURNALCTL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.JOURNALCTL)
            else:
                return self.getToken(ExprParser.JOURNALCTL, i)

        def GREP(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.GREP)
            else:
                return self.getToken(ExprParser.GREP, i)

        def UFW(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.UFW)
            else:
                return self.getToken(ExprParser.UFW, i)

        def DENY(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.DENY)
            else:
                return self.getToken(ExprParser.DENY, i)

        def FROM(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.FROM)
            else:
                return self.getToken(ExprParser.FROM, i)

        def MX(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.MX)
            else:
                return self.getToken(ExprParser.MX, i)

        def TODAY(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.TODAY)
            else:
                return self.getToken(ExprParser.TODAY, i)

        def OP(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.OP)
            else:
                return self.getToken(ExprParser.OP, i)

        def IP(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IP)
            else:
                return self.getToken(ExprParser.IP, i)

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

        def RUTA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.RUTA)
            else:
                return self.getToken(ExprParser.RUTA, i)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

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





