grammar GameMap;

/** the start rule, begin parsing here **/


gamemap : ((door | monster | item | tc | wc) (WS | NEWLINE))* NEWLINE?;
door: 'D' WS WORDINT;
monster: 'M' WS WORD;
item: 'I' WS WORD;
tc: 'TC' WS WORD;
wc: 'WC' WS WORD;

NEWLINE: '\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WORD: ([A-Za-z])+;
INT: [0-9]+;
WORDINT: WORD INT;
WS: (' ' | '\t')+ {skip();};