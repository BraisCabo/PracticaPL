grammar Practica;

program: dcllist funlist sentlist;//
dcllist: | dcl dcllist;
funlist: | funcdef funlist;
sentlist: mainhead LBRACE code RBRACE;

dcl: ctelist | varlist;
ctelist: DEFINE CONST_DEF_IDENTIFIER simpvalue ctelist1;
ctelist1: DEFINE CONST_DEF_IDENTIFIER simpvalue ctelist1 | ;
simpvalue: NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
varlist: vardef SEMICOLON varlis1;
varlis1: vardef SEMICOLON varlis1 | ;
vardef: tbas IDENTIFIER | tbas IDENTIFIER SASIGN simpvalue;
tbas: INTEGER | FLOAT | STRING | tvoid | struct ;
tvoid: VOID;
struct : STRUCT LBRACE varlist RBRACE;

funcdef: funchead LBRACE code RBRACE;
funchead: tbas IDENTIFIER LPARENTHESIS typedef1 RPARENTHESIS;
typedef1 : | typedef2;
typedef2 : tbas IDENTIFIER typedef2_tail;
typedef2_tail : COMMA tbas IDENTIFIER typedef2_tail | ;

mainhead: tvoid MAIN LPARENTHESIS typedef1 RPARENTHESIS;
code: | sent code;
sent: asig SEMICOLON | funccall SEMICOLON | vardef SEMICOLON | if | while | for | dowhile;
asig: IDENTIFIER SASIGN exp;//
exp: factor exp1;
exp1: op factor exp1 | ;
op: PLUS | LESS | TIMES | DIV | MOD;
factor: simpvalue | LPARENTHESIS exp RPARENTHESIS | funccall;
funccall : IDENTIFIER subpparamlist | CONST_DEF_IDENTIFIER subpparamlist;
subpparamlist: LPARENTHESIS explist RPARENTHESIS | ;
explist : exp explist1;
explist1: COMMA explist | ;

if  : IF expcond LBRACE code RBRACE else;
else: ELSE else1 | ;
else1: LBRACE code RBRACE | IF expcond LBRACE code RBRACE else;
while : WHILE LPARENTHESIS expcond RPARENTHESIS LBRACE code RBRACE;
dowhile : DO LBRACE code RBRACE WHILE LPARENTHESIS expcond RPARENTHESIS SEMICOLON;
for : FOR  LPARENTHESIS for1;
for1:  vardef SEMICOLON expcond SEMICOLON asig RPARENTHESIS LBRACE code RBRACE
    |  asig SEMICOLON expcond SEMICOLON asig RPARENTHESIS LBRACE code RBRACE;

expcond : factorcond expcond_tail;
expcond_tail : oplog factorcond expcond_tail| ;
oplog : OR | AND;
factorcond : exp opcomp exp | LPARENTHESIS expcond RPARENTHESIS | NOT factorcond;
opcomp : SMORE | SLESS | SMOREE | SLESSE | SEQUAL;

//palabras reservadas
LBRACE: '{';
RBRACE: '}';
DEFINE: '#define';
SEMICOLON: ';';
INTEGER: 'integer';
FLOAT: 'float';
STRING: 'string';
VOID: 'void';
STRUCT: 'struct';
COMMA: ',';
MAIN: 'Main';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
AND: '&';
OR: '||';
NOT: '!';
SMORE: '>';
SLESS: '<';
SMOREE: '>=';
SLESSE: '<=';
SEQUAL: '==';
SASIGN: '=';
PLUS: '+';
LESS: '-';
TIMES: '*';
DIV: 'DIV';
MOD: 'MOD';

//reglas léxicas
CONST_DEF_IDENTIFIER: '_'* [A-Z] [A-Z0-9_]*;
IDENTIFIER: ('_'+ [a-z0-9] | [a-z]) [a-z0-9_]*;
NUMERIC_INTEGER_CONST: [+-]? DIGIT+;
NUMERIC_REAL_CONST: [+-]? (FIXED_POINT | INITIAL_POINT | EXPONENTIAL | MIXED_REAL);
MIXED_REAL: (FIXED_POINT | INITIAL_POINT) [eE] [+-]? DIGIT+;
FIXED_POINT: DIGIT+ '.' DIGIT+;
INITIAL_POINT: '.' DIGIT+;
EXPONENTIAL: DIGIT+ [eE] [+-]? DIGIT+;
STRING_CONST: (SIMPLE | DOUBLE);
DOUBLE: '"'  (~["] | '\\"')*  '"';
SIMPLE: '\'' (~['] | '\\\'')* '\'';
COMMENT: (ONE_LINE | MULTIPLE_LINE) -> skip;
ONE_LINE: '//' ~[\r\n]*;
IGNORE: [ \r\t\n] ->skip;
MULTIPLE_LINE: '/*'  (~[*] | '*'+ ~[/*])*  [*]+  '/';
fragment
DIGIT: [0-9];