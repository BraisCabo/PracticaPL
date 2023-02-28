grammar Practica;

@members{
}
program : dcllist funlist sentlist;
dcllist :auxdcllist | ;
funlist : funlist funcdef | ;//
sentlist: mainhead '{' code '}';

auxdcllist: dcl auxdcllist |;

dcl : ctelist | varlist ;
ctelist : '#define' CONST_DEF_IDENTIFIER simpvalue '\n' | ctelist '#define' CONST_DEF_IDENTIFIER simpvalue '\n';//
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST ;
varlist : vardef ';'| varlist vardef ';';//
vardef: tbas IDENTIFIER ';' | tbas IDENTIFIER '=' simpvalue ';';
tbas : 'integer' | 'float' | 'string' | tvoid ;
tvoid : 'void';

funcdef: funchead '{' code '}';
funchead: tbas IDENTIFIER '(' typedef ')';
typedef : typedef tbas IDENTIFIER | ;//

mainhead : tvoid 'Main' '(' typedef ')';
code : code sent | ;//
sent : asig ';' | funccall ';' ;
asig : IDENTIFIER '=' exp ;
exp : exp op exp | factor ;//
op : '+' | '-' | '*' | 'DIV' | 'MOD' ;
factor : simpvalue | '(' exp ')' | funccall ;
funccall : IDENTIFIER subpparamlist ;
subpparamlist : '(' explist ')' | ;
explist : exp | exp ',' explist ;

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