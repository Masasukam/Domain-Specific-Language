lexer grammar HtmlLexer;

TITLE_START: 'TITLE:' -> mode(TEXT_MODE);
THEME_START: 'THEME:' -> mode(TEXT_MODE);
SECTION_START: 'SECTION:' -> mode(TEXT_MODE);
ITEM_START: 'ITEM:' -> mode(TEXT_MODE);
LOC_SEP: 'from' -> mode(PATH_MODE);
COST_SEP: 'cost' -> mode(NUM_MODE);
DECI_SEP: '.' -> mode(TEXT_MODE);
ITEM_SEP: '|' -> mode(TEXT_MODE);

NAME: 'NAME:' -> mode(TEXT_MODE);
EMAIL: 'EMAIL:' -> mode(TEXT_MODE);
AT_SEP: '@' -> mode(TEXT_MODE);

// White space is ignored during tokenization
WS : [\r\n ]+ -> channel(HIDDEN);

mode NUM_MODE;
NUM: [0-9]+ -> mode(DEFAULT_MODE);
WS_NUM : [\r\n ]+ -> channel(HIDDEN);

mode TEXT_MODE;
TEXT: [a-zA-Z0-9]+ -> mode(DEFAULT_MODE);
WS_TEXT : [\r\n ]+ -> channel(HIDDEN);

mode PATH_MODE;
PATH: [a-zA-Z0-9\\/.:~_]+ -> mode(DEFAULT_MODE);
WS_PATH : [\r\n ]+ -> channel(HIDDEN);
