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
        4,0,10,55,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,1,1,1,1,1,1,2,1,2,1,3,1,
        3,1,4,1,4,1,5,1,5,5,5,35,8,5,10,5,12,5,38,9,5,1,6,1,6,1,7,1,7,1,
        8,4,8,45,8,8,11,8,12,8,46,1,9,4,9,50,8,9,11,9,12,9,51,1,9,1,9,0,
        0,10,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,1,0,4,2,0,65,
        90,97,122,3,0,48,57,65,90,97,122,1,0,48,57,3,0,9,10,13,13,32,32,
        57,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,
        11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,1,
        21,1,0,0,0,3,23,1,0,0,0,5,26,1,0,0,0,7,28,1,0,0,0,9,30,1,0,0,0,11,
        32,1,0,0,0,13,39,1,0,0,0,15,41,1,0,0,0,17,44,1,0,0,0,19,49,1,0,0,
        0,21,22,3,3,1,0,22,2,1,0,0,0,23,24,5,105,0,0,24,25,5,102,0,0,25,
        4,1,0,0,0,26,27,3,11,5,0,27,6,1,0,0,0,28,29,3,15,7,0,29,8,1,0,0,
        0,30,31,3,17,8,0,31,10,1,0,0,0,32,36,7,0,0,0,33,35,7,1,0,0,34,33,
        1,0,0,0,35,38,1,0,0,0,36,34,1,0,0,0,36,37,1,0,0,0,37,12,1,0,0,0,
        38,36,1,0,0,0,39,40,5,61,0,0,40,14,1,0,0,0,41,42,5,62,0,0,42,16,
        1,0,0,0,43,45,7,2,0,0,44,43,1,0,0,0,45,46,1,0,0,0,46,44,1,0,0,0,
        46,47,1,0,0,0,47,18,1,0,0,0,48,50,7,3,0,0,49,48,1,0,0,0,50,51,1,
        0,0,0,51,49,1,0,0,0,51,52,1,0,0,0,52,53,1,0,0,0,53,54,6,9,0,0,54,
        20,1,0,0,0,4,0,36,46,51,1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PAL = 1
    IF = 2
    VAL = 3
    OP = 4
    VLR = 5
    ID = 6
    IGUAL = 7
    MAYOR = 8
    NUM = 9
    WS = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "'='", "'>'" ]

    symbolicNames = [ "<INVALID>",
            "PAL", "IF", "VAL", "OP", "VLR", "ID", "IGUAL", "MAYOR", "NUM", 
            "WS" ]

    ruleNames = [ "PAL", "IF", "VAL", "OP", "VLR", "ID", "IGUAL", "MAYOR", 
                  "NUM", "WS" ]

    grammarFileName = "Expr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


