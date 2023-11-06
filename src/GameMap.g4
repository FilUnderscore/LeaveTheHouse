grammar GameMap;

/** the start rule, begin parsing here **/


gamemap : room* EOF;
room: (WORD SEP OPEN (WS | NEWLINE)? ((room | monster | item | tc | wc) NEWLINE*)* NEWLINE CLOSE);

monster: 'M' WORD;
item: 'I' WORD;
tc: 'TC' WORD;
wc: 'WC' WORD;

NEWLINE: '\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WORD: ([A-Za-z0-9])+;
WS: (' ' | '\t')+ -> skip;
SEP: ':';
OPEN: '{';
CLOSE: '}';