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
        4,0,11,57,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,1,0,1,1,1,1,1,1,1,2,
        1,2,1,3,1,3,1,4,1,4,1,5,4,5,36,8,5,11,5,12,5,37,1,6,1,6,1,7,1,7,
        1,8,1,8,1,9,4,9,47,8,9,11,9,12,9,48,1,10,4,10,52,8,10,11,10,12,10,
        53,1,10,1,10,0,0,11,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,
        21,11,1,0,3,2,0,65,90,97,122,1,0,48,57,3,0,9,10,13,13,32,32,59,0,
        1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,
        0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,
        0,0,0,1,23,1,0,0,0,3,25,1,0,0,0,5,28,1,0,0,0,7,30,1,0,0,0,9,32,1,
        0,0,0,11,35,1,0,0,0,13,39,1,0,0,0,15,41,1,0,0,0,17,43,1,0,0,0,19,
        46,1,0,0,0,21,51,1,0,0,0,23,24,3,3,1,0,24,2,1,0,0,0,25,26,5,105,
        0,0,26,27,5,102,0,0,27,4,1,0,0,0,28,29,5,40,0,0,29,6,1,0,0,0,30,
        31,5,41,0,0,31,8,1,0,0,0,32,33,3,11,5,0,33,10,1,0,0,0,34,36,7,0,
        0,0,35,34,1,0,0,0,36,37,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,12,
        1,0,0,0,39,40,3,15,7,0,40,14,1,0,0,0,41,42,5,62,0,0,42,16,1,0,0,
        0,43,44,3,19,9,0,44,18,1,0,0,0,45,47,7,1,0,0,46,45,1,0,0,0,47,48,
        1,0,0,0,48,46,1,0,0,0,48,49,1,0,0,0,49,20,1,0,0,0,50,52,7,2,0,0,
        51,50,1,0,0,0,52,53,1,0,0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,55,1,
        0,0,0,55,56,6,10,0,0,56,22,1,0,0,0,4,0,37,48,53,1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PAL = 1
    IF = 2
    PAR_IZ = 3
    PAR_DER = 4
    VAL = 5
    IDT = 6
    OP = 7
    MAY = 8
    VAR = 9
    NUM = 10
    WS = 11

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "'('", "')'", "'>'" ]

    symbolicNames = [ "<INVALID>",
            "PAL", "IF", "PAR_IZ", "PAR_DER", "VAL", "IDT", "OP", "MAY", 
            "VAR", "NUM", "WS" ]

    ruleNames = [ "PAL", "IF", "PAR_IZ", "PAR_DER", "VAL", "IDT", "OP", 
                  "MAY", "VAR", "NUM", "WS" ]

    grammarFileName = "Expr.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


