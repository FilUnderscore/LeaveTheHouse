grammar PlayerCommand;

/** the start rule, begin parsing here **/


input: command NEWLINE;
command: (door | pickup | exit | describe | admire | eat | stats | wield | open | combine | repair | attack | help);

// Explore-mode commands
door: 'door' WORD;
pickup: 'pickup' WORD;
exit: 'exit';
describe: 'describe';
admire: 'admire' WORD;
eat: 'eat' WORD;
stats: 'stats';
wield: 'wield' WORD;
open: 'open' WORD;
combine: 'combine' WORD WORD;
repair: 'repair';

// Battle-mode commands
attack: 'attack';

help: 'help';

NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)

WORD: ([A-Za-z0-9])+;
WS: (' ' | '\t')+ -> skip;