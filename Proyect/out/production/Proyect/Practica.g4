grammar Practica;

program: dcllist funlist sentlist;//
dcllist: | dcl dcllist;
funlist: | funcdef funlist;
sentlist: mainhead '{' code '}';

dcl: ctelist | varlist;
ctelist: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1;
ctelist1: '#define' CONST_DEF_IDENTIFIER simpvalue ctelist1 | ;
simpvalue: NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
//Si nos dicen que se puede identificador: simpvalue: NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST | IDENTIFIER;
varlist: vardef ';' varlis1;
varlis1: vardef ';' varlis1 | ;
vardef: tbas IDENTIFIER | tbas IDENTIFIER '=' simpvalue;
tbas: 'integer' | 'float' | 'string' | tvoid | struct ;
tvoid: 'void';
struct : 'struct' '{' varlist '}';

funcdef: funchead '{' code '}';
funchead: tbas IDENTIFIER '(' typedef1 ')';
typedef1 : | typedef2;
typedef2 : tbas IDENTIFIER typedef2_tail;
typedef2_tail : ',' tbas IDENTIFIER typedef2_tail | ;

mainhead: tvoid 'Main' '(' typedef1 ')';
code: | sent code;
sent: asig ';' | funccall ';' | vardef ';' | if | while | for | dowhile;
asig: IDENTIFIER '=' exp;//
exp: factor exp1;
exp1: op factor exp1 | ;
op: '+' | '-' | '*' | 'DIV' | 'MOD';
factor: simpvalue | '(' exp ')' | funccall;
funccall : IDENTIFIER subpparamlist | CONST_DEF_IDENTIFIER subpparamlist;
subpparamlist: '(' explist ')' | ;
explist : exp explist1;
explist1: ',' explist | ;

if  : 'if' expcond '{' code '}' else;
else: 'else' else1 | ;
else1: '{' code '}' | 'if' expcond '{' code '}' else;
while : 'while' '(' expcond ')' '{' code '}';
dowhile : 'do' '{' code '}' 'while' '(' expcond ')' ';';
for : 'for'  '(' for1;
for1:  vardef ';' expcond ';' asig ')' '{' code '}'
    |  asig ';' expcond ';' asig ')' '{' code '}';

expcond : factorcond expcond_tail;
expcond_tail : oplog factorcond expcond_tail| ;
oplog : '||' | '&';
factorcond : exp opcomp exp | '(' expcond ')' | '!' factorcond;
opcomp : '<' | '>' | '<=' | '>=' | '==';

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