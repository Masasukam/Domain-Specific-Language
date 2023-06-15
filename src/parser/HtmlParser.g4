parser grammar HtmlParser;
options { tokenVocab=HtmlLexer; }

program : title theme? section+ name;
title: TITLE_START TEXT;
theme: THEME_START TEXT;
section: SECTION_START TEXT row+;
row: ITEM_START item;
item: TEXT LOC_SEP path COST_SEP cost (DECI_SEP decimal)?;
path: PATH;
cost: NUM;
decimal: TEXT;
name: NAME TEXT EMAIL email;
email: TEXT AT_SEP TEXT DECI_SEP TEXT;

