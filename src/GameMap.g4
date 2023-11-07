grammar GameMap;

/** the start rule, begin parsing here **/


gamemap : room* EOF;

room: ('ROOM' WORD BLOCK_OPEN ((door | monster | item | tc | wc) NEWLINE*)* BLOCK_CLOSE);

door: ('DOOR' WORD);
monster: ('MONSTER' WORD BLOCK_OPEN ((hp | dmg) NEWLINE*)* BLOCK_CLOSE);

hp: 'hp' INT;
dmg: 'dmg' INT;
dmg_hilo: 'dmg' INT INT;

item: ('ITEM' WORD BLOCK_OPEN ((dmg_hilo) NEWLINE*)* BLOCK_CLOSE);
tc: ('TC' BLOCK_OPEN BLOCK_CLOSE);
wc: ('WC' BLOCK_OPEN BLOCK_CLOSE);

NEWLINE: '\r'? '\n' -> skip;     // return newlines to parser (is end-statement signal)
INT: ([0-9])+;
WORD: ([A-Za-z0-9])+;
WS: (' ' | '\t')+ -> skip;
OPEN: '{';
CLOSE: '}';
BLOCK_OPEN: (WS | NEWLINE)? OPEN (WS | NEWLINE)?;
BLOCK_CLOSE: (WS | NEWLINE)? CLOSE;