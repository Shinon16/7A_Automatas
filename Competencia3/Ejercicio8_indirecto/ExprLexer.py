# Generated from ./Expr.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,7,41,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,1,0,1,0,1,1,4,1,19,8,1,11,1,12,1,20,1,2,1,2,1,3,4,3,26,8,3,
        11,3,12,3,27,1,4,1,4,1,5,1,5,1,5,1,6,4,6,36,8,6,11,6,12,6,37,1,6,
        1,6,0,0,7,1,1,3,2,5,3,7,4,9,5,11,6,13,7,1,0,3,2,0,65,90,97,122,1,
        0,48,57,3,0,9,10,13,13,32,32,43,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,
        0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,1,15,1,0,0,
        0,3,18,1,0,0,0,5,22,1,0,0,0,7,25,1,0,0,0,9,29,1,0,0,0,11,31,1,0,
        0,0,13,35,1,0,0,0,15,16,3,3,1,0,16,2,1,0,0,0,17,19,7,0,0,0,18,17,
        1,0,0,0,19,20,1,0,0,0,20,18,1,0,0,0,20,21,1,0,0,0,21,4,1,0,0,0,22,
        23,3,7,3,0,23,6,1,0,0,0,24,26,7,1,0,0,25,24,1,0,0,0,26,27,1,0,0,
        0,27,25,1,0,0,0,27,28,1,0,0,0,28,8,1,0,0,0,29,30,3,11,5,0,30,10,
        1,0,0,0,31,32,5,62,0,0,32,33,5,61,0,0,33,12,1,0,0,0,34,36,7,2,0,
        0,35,34,1,0,0,0,36,37,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,39,
        1,0,0,0,39,40,6,6,0,0,40,14,1,0,0,0,4,0,20,27,37,1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    VAL = 1
    ID = 2
    VAR = 3
    NUM = 4
    OP = 5
    MAYOR_IGUAL = 6
    WS = 7

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'>='" ]

    symbolicNames = [ "<INVALID>",
            "VAL", "ID", "VAR", "NUM", "OP", "MAYOR_IGUAL", "WS" ]

    ruleNames = [ "VAL", "ID", "VAR", "NUM", "OP", "MAYOR_IGUAL", "WS" ]

    grammarFileName = "Expr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


