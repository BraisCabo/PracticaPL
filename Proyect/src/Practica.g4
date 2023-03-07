grammar Practica;

@members{
}

program: dcllist funlist sentlist;//
dcllist: | dcl dcllist;
funlist: | funcdef funlist;
sentlist: mainhead '{' code '}';

dcl: ctelist | varlist;
ctelist: '#define' CONST_DEF_IDENTIFIER simpvalue | ctelist '#define' CONST_DEF_IDENTIFIER simpvalue;
simpvalue: NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
//Si nos dicen que se puede identificador: simpvalue: NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST | IDENTIFIER;
varlist: vardef ';' | vardef ';' varlist;
vardef: tbas IDENTIFIER | tbas IDENTIFIER '=' simpvalue;
tbas: 'integer' | 'float' | 'string' | tvoid;
tvoid: 'void';

funcdef: funchead '{' code '}';
funchead: tbas IDENTIFIER '(' typedef ')';
typedef: | tbas IDENTIFIER typedef1;
typedef1: ',' tbas IDENTIFIER typedef1 | ;

mainhead: tvoid 'Main' '(' typedef ')';
code: | sent code;
sent: asig ';' | funccall ';' | vardef ';';//
asig: IDENTIFIER '=' exp;//
exp: factor exp1;
exp1: op factor exp1 | ;
op: '+' | '-' | '*' | 'DIV' | 'MOD';
factor: simpvalue | '(' exp ')' | funccall;
funccall: IDENTIFIER subpparamlist;
subpparamlist: '(' explist ')' | '(' ')';
explist : exp | exp ',' explist;

CONST_DEF_IDENTIFIER: '_'* [A-Z] [A-Z0-9_]* {System.out.println("<CONST_DEF_IDENTIFIER, " + getText() + ">");};
IDENTIFIER: ('_'+ [a-z0-9] | [a-z]) [a-z0-9_]* {System.out.println("<IDENTIFIER, " + getText() + ">");};
NUMERIC_INTEGER_CONST: [+-]? DIGIT+ {System.out.println("<NUMERIC_INTEGER_CONST, " + getText() + ">");};
NUMERIC_REAL_CONST: [+-]? (FIXED_POINT | INITIAL_POINT | EXPONENTIAL | MIXED_REAL) {System.out.println("<NUMERIC_REAL_CONST, " + getText() + ">");};
MIXED_REAL: (FIXED_POINT | INITIAL_POINT) [eE] [+-]? DIGIT+;
FIXED_POINT: DIGIT+ '.' DIGIT+;
INITIAL_POINT: '.' DIGIT+;
EXPONENTIAL: DIGIT+ [eE] [+-]? DIGIT+;
STRING_CONST: (SIMPLE | DOUBLE);
DOUBLE: '"'  (~["] | '\\"')*  '"';
SIMPLE: '\'' (~['] | '\\\'')* '\'';
COMMENT: (ONE_LINE | MULTIPLE_LINE) -> skip;
ONE_LINE: '//' ~[\r\n]*;
IGNORE: [ \r\t\n]? ->skip;
MULTIPLE_LINE: '/*'  (~[*] | '*'+ ~[/*])*  [*]+  '/';
fragment
DIGIT: [0-9];