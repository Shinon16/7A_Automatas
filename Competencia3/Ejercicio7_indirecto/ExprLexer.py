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
        4,0,9,50,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,1,0,1,0,1,1,1,1,1,1,1,1,1,2,1,2,1,3,1,3,1,
        4,4,4,31,8,4,11,4,12,4,32,1,5,1,5,1,6,1,6,1,7,4,7,40,8,7,11,7,12,
        7,41,1,8,4,8,45,8,8,11,8,12,8,46,1,8,1,8,0,0,9,1,1,3,2,5,3,7,4,9,
        5,11,6,13,7,15,8,17,9,1,0,3,2,0,65,90,97,122,1,0,48,57,3,0,9,10,
        13,13,32,32,52,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,
        9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,1,
        19,1,0,0,0,3,21,1,0,0,0,5,25,1,0,0,0,7,27,1,0,0,0,9,30,1,0,0,0,11,
        34,1,0,0,0,13,36,1,0,0,0,15,39,1,0,0,0,17,44,1,0,0,0,19,20,3,3,1,
        0,20,2,1,0,0,0,21,22,5,105,0,0,22,23,5,110,0,0,23,24,5,116,0,0,24,
        4,1,0,0,0,25,26,3,15,7,0,26,6,1,0,0,0,27,28,3,9,4,0,28,8,1,0,0,0,
        29,31,7,0,0,0,30,29,1,0,0,0,31,32,1,0,0,0,32,30,1,0,0,0,32,33,1,
        0,0,0,33,10,1,0,0,0,34,35,3,13,6,0,35,12,1,0,0,0,36,37,5,61,0,0,
        37,14,1,0,0,0,38,40,7,1,0,0,39,38,1,0,0,0,40,41,1,0,0,0,41,39,1,
        0,0,0,41,42,1,0,0,0,42,16,1,0,0,0,43,45,7,2,0,0,44,43,1,0,0,0,45,
        46,1,0,0,0,46,44,1,0,0,0,46,47,1,0,0,0,47,48,1,0,0,0,48,49,6,8,0,
        0,49,18,1,0,0,0,4,0,32,41,46,1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PAL = 1
    INT = 2
    VAR = 3
    VAL = 4
    IDT = 5
    ASIG = 6
    IGUAL = 7
    NUM = 8
    WS = 9

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'int'", "'='" ]

    symbolicNames = [ "<INVALID>",
            "PAL", "INT", "VAR", "VAL", "IDT", "ASIG", "IGUAL", "NUM", "WS" ]

    ruleNames = [ "PAL", "INT", "VAR", "VAL", "IDT", "ASIG", "IGUAL", "NUM", 
                  "WS" ]

    grammarFileName = "Expr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


