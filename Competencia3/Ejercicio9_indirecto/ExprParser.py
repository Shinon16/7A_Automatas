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
        4,1,11,15,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,0,0,2,0,2,0,0,12,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,
        0,0,1,6,1,1,0,0,0,7,8,5,1,0,0,8,9,5,3,0,0,9,10,5,5,0,0,10,11,5,7,
        0,0,11,12,5,9,0,0,12,13,5,4,0,0,13,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'if'", "'('", "')'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'>'" ]

    symbolicNames = [ "<INVALID>", "PAL", "IF", "PAR_IZ", "PAR_DER", "VAL", 
                      "IDT", "OP", "MAY", "VAR", "NUM", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PAL=1
    IF=2
    PAR_IZ=3
    PAR_DER=4
    VAL=5
    IDT=6
    OP=7
    MAY=8
    VAR=9
    NUM=10
    WS=11

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

        def PAL(self):
            return self.getToken(ExprParser.PAL, 0)

        def PAR_IZ(self):
            return self.getToken(ExprParser.PAR_IZ, 0)

        def VAL(self):
            return self.getToken(ExprParser.VAL, 0)

        def OP(self):
            return self.getToken(ExprParser.OP, 0)

        def VAR(self):
            return self.getToken(ExprParser.VAR, 0)

        def PAR_DER(self):
            return self.getToken(ExprParser.PAR_DER, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.PAL)
            self.state = 8
            self.match(ExprParser.PAR_IZ)
            self.state = 9
            self.match(ExprParser.VAL)
            self.state = 10
            self.match(ExprParser.OP)
            self.state = 11
            self.match(ExprParser.VAR)
            self.state = 12
            self.match(ExprParser.PAR_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





