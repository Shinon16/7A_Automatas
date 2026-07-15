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
        4,0,6,39,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,
        0,1,0,1,0,1,1,1,1,5,1,19,8,1,10,1,12,1,22,9,1,1,2,1,2,1,3,1,3,1,
        4,4,4,29,8,4,11,4,12,4,30,1,5,4,5,34,8,5,11,5,12,5,35,1,5,1,5,0,
        0,6,1,1,3,2,5,3,7,4,9,5,11,6,1,0,4,2,0,65,90,97,122,3,0,48,57,65,
        90,97,122,1,0,48,57,3,0,9,10,13,13,32,32,41,0,1,1,0,0,0,0,3,1,0,
        0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,1,13,1,0,0,
        0,3,16,1,0,0,0,5,23,1,0,0,0,7,25,1,0,0,0,9,28,1,0,0,0,11,33,1,0,
        0,0,13,14,5,105,0,0,14,15,5,102,0,0,15,2,1,0,0,0,16,20,7,0,0,0,17,
        19,7,1,0,0,18,17,1,0,0,0,19,22,1,0,0,0,20,18,1,0,0,0,20,21,1,0,0,
        0,21,4,1,0,0,0,22,20,1,0,0,0,23,24,5,61,0,0,24,6,1,0,0,0,25,26,5,
        62,0,0,26,8,1,0,0,0,27,29,7,2,0,0,28,27,1,0,0,0,29,30,1,0,0,0,30,
        28,1,0,0,0,30,31,1,0,0,0,31,10,1,0,0,0,32,34,7,3,0,0,33,32,1,0,0,
        0,34,35,1,0,0,0,35,33,1,0,0,0,35,36,1,0,0,0,36,37,1,0,0,0,37,38,
        6,5,0,0,38,12,1,0,0,0,4,0,20,30,35,1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    IF = 1
    ID = 2
    IGUAL = 3
    MAYOR = 4
    NUM = 5
    WS = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "'='", "'>'" ]

    symbolicNames = [ "<INVALID>",
            "IF", "ID", "IGUAL", "MAYOR", "NUM", "WS" ]

    ruleNames = [ "IF", "ID", "IGUAL", "MAYOR", "NUM", "WS" ]

    grammarFileName = "Expr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


