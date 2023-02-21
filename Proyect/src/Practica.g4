grammar Practica;

@members{
}

r : (IDENTIFIER | CONST_DEF_IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | MIXED_REAL | STRING_CONST | COMMENT)+;
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
COMMENT: (ONE_LINE | MULTIPLE_LINE);
ONE_LINE: '//' ~[\r\n]*;
MULTIPLE_LINE: '/*'  (~[*] | '*'+ ~[/*])*  [*]+  '/';

fragment
DIGIT: [0-9];