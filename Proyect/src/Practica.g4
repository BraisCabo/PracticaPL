grammar Practica;

		program: dcllist funlist sentlist {System.out.println("<UL>\n<LI><A HREF=\"Principal\">Programa Principal</A></LI>\n"+$funlist.headers + "</UL>\n</body>\n<hr/>\n" + $funlist.bodys);
		                                    System.out.println("<H2>Programa Principal</H2>\n\n<code>\n" + $dcllist.text + "</code>\n<br/>\n");}; //
		dcllist returns [String text]: {$text="";} | dcl dcllist {$text= "<DIV>" + $dcl.text  + "</DIV>\n" + $dcllist.text;};
		funlist returns [String headers, String bodys] : {$headers=""; $bodys="";}  | funcdef funlist {$headers=$funcdef.header + $funlist.headers; $bodys=$funcdef.body + $funlist.bodys;};
		sentlist: mainhead LBRACE code RBRACE;

		dcl returns [String text]: ctelist {$text=$ctelist.text;} | varlist {$text=$varlist.text;};
		ctelist returns [String text]: DEFINE CONST_DEF_IDENTIFIER simpvalue {$text= "<SPAN CLASS=\"palres\">" +  $DEFINE.text + "</SPAN> " + "<A NAME=\""+ $CONST_DEF_IDENTIFIER.text + "\">" + "<SPAN CLASS=\"ident\">" + $CONST_DEF_IDENTIFIER.text + "</SPAN> " +"<SPAN CLASS=\"cte\">"+ $simpvalue.text + "</SPAN>";};
		simpvalue returns [String text]:
		NUMERIC_INTEGER_CONST {$text=$NUMERIC_INTEGER_CONST.text;}
		| NUMERIC_REAL_CONST {$text=$NUMERIC_REAL_CONST.text;}
		| STRING_CONST {$text=$STRING_CONST.text;};
		varlist returns [String text]: vardef SEMICOLON {$text= $vardef.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN>";};
		vardef returns [String text]: tbas IDENTIFIER vardef2 {$text= "<SPAN CLASS=\"palres\">" + $tbas.type + "</SPAN> " + "<A NAME=\""+ $IDENTIFIER.text + "\">" + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" +  $vardef2.text;};
		vardef2 returns [String text]: SASIGN simpvalue {$text= "<SPAN CLASS=\"palres\"> " + $SASIGN.text  + "</SPAN> " + "<SPAN CLASS=\"cte\">"+ $simpvalue.text + "</SPAN>";} | {$text="";};
		tbas
		returns[String type]:
		INTEGER {$type="integer";}
		| FLOAT {$type="float";}
		| STRING {$type="string";}
		| tvoid {$type="void";}
		| struct {$type="struct";};
		tvoid: VOID;
		struct: STRUCT LBRACE varlist varlist2 RBRACE;
		varlist2: varlist varlist2 |;

		funcdef returns[String body, String header]: funchead LBRACE code RBRACE {$body = "<A NAME=\""+ $funchead.name + "\">\n"
		+ "<code>\n" + $funchead.text + "\n{\n" + "}\n" + "<br/>\n</code>\n"
		+ "<A HREF=\"#" + $funchead.name + "\">Inicio de la función</A>\n"
		+ "<A HREF=\"#inicio\">Inicio del programa</A>\n"+
		"<hr/>\n\n";
		$header= "<LI><A HREF=\"#" + $funchead.name + "\">"+ $funchead.header+"</A></LI>\n";};
		funchead
		returns[String name, String text, String header]:
		tbas IDENTIFIER LPARENTHESIS typedef1 RPARENTHESIS {$name = $IDENTIFIER.text; $text = "<SPAN CLASS=\"palres\">" + $tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" +  "(" + $typedef1.text + ")";
		$header= $tbas.type + " " + $IDENTIFIER.text +  "(" + $typedef1.header + ")";};
		typedef1
		returns[String text, String header]:
		{$text="";
		$header="";}
		| tbas IDENTIFIER typedef2_tail {$text="<SPAN CLASS=\"palres\">" + $tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" + $typedef2_tail.text;
		$header= $tbas.type + " " + $IDENTIFIER.text  + $typedef2_tail.header;};
		typedef2_tail
		returns[String text, String header]:
		COMMA tbas IDENTIFIER typedef2_tail {$text=", " + "<SPAN CLASS=\"palres\">" + $tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" + $typedef2_tail.text;
		$header=", " + $tbas.type + " " + $IDENTIFIER.text + $typedef2_tail.header;}

		| {$text="";
          		$header="";};

		mainhead: tvoid MAIN LPARENTHESIS typedef1 RPARENTHESIS;
		code returns [String text]: {$text="";}  | sent code {$text= $sent.text + $code.text;};
		sent returns [String text]:
		asig SEMICOLON {$text="";}
		| funccall SEMICOLON {$text="";}
		| vardef SEMICOLON {$text="";}
		| if {$text="";}
		| while {$text="";}
		| for {$text="";}
		| dowhile {$text="";};
		asig returns [String text]: IDENTIFIER SASIGN exp; //
		exp: factor exp1;
		exp1: op factor exp1 |;
		op: PLUS | LESS | TIMES | DIV | MOD;
		factor: simpvalue | LPARENTHESIS exp RPARENTHESIS | funccall;
		funccall:
		IDENTIFIER subpparamlist
		| CONST_DEF_IDENTIFIER subpparamlist;
		subpparamlist: LPARENTHESIS explist RPARENTHESIS |;
		explist: exp explist1;
		explist1: COMMA explist |;

		if: IF expcond LBRACE code RBRACE else;
		else: ELSE else1 |;
		else1: LBRACE code RBRACE | IF expcond LBRACE code RBRACE else;
		while:
		WHILE LPARENTHESIS expcond RPARENTHESIS LBRACE code RBRACE;
		dowhile:
		DO LBRACE code RBRACE WHILE LPARENTHESIS expcond RPARENTHESIS SEMICOLON;
		for: FOR LPARENTHESIS for1;
		for1:
		vardef SEMICOLON expcond SEMICOLON asig RPARENTHESIS LBRACE code RBRACE
		| asig SEMICOLON expcond SEMICOLON asig RPARENTHESIS LBRACE code RBRACE;

		expcond: factorcond expcond_tail;
		expcond_tail: oplog factorcond expcond_tail |;
		oplog: OR | AND;
		factorcond:
		exp opcomp exp
		| LPARENTHESIS expcond RPARENTHESIS
		| NOT factorcond;
		opcomp: SMORE | SLESS | SMOREE | SLESSE | SEQUAL;

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
		NUMERIC_REAL_CONST:
		[+-]? (
		FIXED_POINT
		| INITIAL_POINT
		| EXPONENTIAL
		| MIXED_REAL
		);
		MIXED_REAL: (FIXED_POINT | INITIAL_POINT) [eE] [+-]? DIGIT+;
		FIXED_POINT: DIGIT+ '.' DIGIT+;
		INITIAL_POINT: '.' DIGIT+;
		EXPONENTIAL: DIGIT+ [eE] [+-]? DIGIT+;
		STRING_CONST: (SIMPLE | DOUBLE);
		DOUBLE: '"' (~["] | '\\"')* '"';
		SIMPLE: '\'' (~['] | '\\\'')* '\'';
		COMMENT: (ONE_LINE | MULTIPLE_LINE) -> skip;
		ONE_LINE: '//' ~[\r\n]*;
		IGNORE: [ \r\t\n] -> skip;
		MULTIPLE_LINE: '/*' (~[*] | '*'+ ~[/*])* [*]+ '/';
fragment DIGIT: [0-9];