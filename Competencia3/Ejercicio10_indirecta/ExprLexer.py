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
        4,0,9,53,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,
        3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,5,7,40,8,7,10,7,12,7,43,9,
        7,1,7,1,7,1,8,4,8,48,8,8,11,8,12,8,49,1,8,1,8,0,0,9,1,1,3,2,5,3,
        7,4,9,5,11,6,13,7,15,8,17,9,1,0,2,3,0,10,10,13,13,34,34,3,0,9,10,
        13,13,32,32,54,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,
        9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,1,
        19,1,0,0,0,3,21,1,0,0,0,5,27,1,0,0,0,7,29,1,0,0,0,9,31,1,0,0,0,11,
        33,1,0,0,0,13,35,1,0,0,0,15,37,1,0,0,0,17,47,1,0,0,0,19,20,3,3,1,
        0,20,2,1,0,0,0,21,22,5,112,0,0,22,23,5,114,0,0,23,24,5,105,0,0,24,
        25,5,110,0,0,25,26,5,116,0,0,26,4,1,0,0,0,27,28,3,15,7,0,28,6,1,
        0,0,0,29,30,5,40,0,0,30,8,1,0,0,0,31,32,5,41,0,0,32,10,1,0,0,0,33,
        34,3,13,6,0,34,12,1,0,0,0,35,36,5,59,0,0,36,14,1,0,0,0,37,41,5,34,
        0,0,38,40,8,0,0,0,39,38,1,0,0,0,40,43,1,0,0,0,41,39,1,0,0,0,41,42,
        1,0,0,0,42,44,1,0,0,0,43,41,1,0,0,0,44,45,5,34,0,0,45,16,1,0,0,0,
        46,48,7,1,0,0,47,46,1,0,0,0,48,49,1,0,0,0,49,47,1,0,0,0,49,50,1,
        0,0,0,50,51,1,0,0,0,51,52,6,8,0,0,52,18,1,0,0,0,3,0,41,49,1,6,0,
        0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PAL = 1
    PRINT = 2
    ESP = 3
    PARI = 4
    PARF = 5
    CMA = 6
    PTO_COMA = 7
    CAD = 8
    WS = 9

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'print'", "'('", "')'", "';'" ]

    symbolicNames = [ "<INVALID>",
            "PAL", "PRINT", "ESP", "PARI", "PARF", "CMA", "PTO_COMA", "CAD", 
            "WS" ]

    ruleNames = [ "PAL", "PRINT", "ESP", "PARI", "PARF", "CMA", "PTO_COMA", 
                  "CAD", "WS" ]

    grammarFileName = "Expr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


