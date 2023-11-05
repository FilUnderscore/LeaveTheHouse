grammar PlayerCommand;

/** the start rule, begin parsing here **/


input: command NEWLINE;
command : WORD | WORD (WS (WORD | INT))+;


NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)

WORD: ([A-Z]|[a-z])+;
INT: [0-9]+;
WS: (' ' | '\t')+ {skip();};