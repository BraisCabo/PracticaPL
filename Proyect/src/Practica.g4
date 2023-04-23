grammar Practica;

program:
	dcllist funlist sentlist {System.out.println("<UL>\n<LI><A HREF=\"#Main\">Programa Principal</A></LI>\n"+$funlist.headers + "</UL>\n</body>\n<hr/>\n" + $funlist.bodys);
		                                    System.out.println("<H2>Programa Principal</H2>\n\n<code>\n" + $dcllist.text + "</code>\n<br/>\n");
		                                    System.out.println($sentlist.text);
		};
dcllist
	returns[String text]:
	{$text="";}
	| dcl dcllist {$text= "<DIV>" + $dcl.text  + "</DIV>\n" + $dcllist.text;};
funlist
	returns[String headers, String bodys]:
	{$headers=""; $bodys="";}
	| funcdef funlist {$headers=$funcdef.header + $funlist.headers; $bodys=$funcdef.body + $funlist.bodys;
		};
sentlist
	returns[String text]:
	mainhead LBRACE code RBRACE {$text="<A NAME=\"Main\"></A>\n<code>\n"+$mainhead.text+"\n"+ "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +"\n"+ $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>" +"\n\n<br/>\n</code>\n"+
"<A HREF=\"#Main\">Inicio del programa principal</A>\n<A HREF=\"#inicio\">Inicio del programa</A>";}
		;

dcl
	returns[String text]:
	ctelist {$text=$ctelist.text;}
	| varlist {$text=$varlist.text;};
ctelist
	returns[String text]:
	DEFINE CONST_DEF_IDENTIFIER simpvalue {$text= "<SPAN CLASS=\"palres\">" +  $DEFINE.text + "</SPAN> " + "<A NAME=\""+ $CONST_DEF_IDENTIFIER.text + "\">" + "<SPAN CLASS=\"ident\"/>" + $CONST_DEF_IDENTIFIER.text + "</SPAN></A> " + $simpvalue.text;
		};
simpvalue
	returns[String text]:
	NUMERIC_INTEGER_CONST {$text = "<SPAN CLASS=\"cte\">" + $NUMERIC_INTEGER_CONST.text + "</SPAN>";
		}
	| NUMERIC_REAL_CONST {$text = "<SPAN CLASS=\"cte\">" + $NUMERIC_REAL_CONST.text + "</SPAN>";}
	| STRING_CONST {$text = "<SPAN CLASS=\"cte\">" + $STRING_CONST.text + "</SPAN>";};
varlist
	returns[String text]:
	vardef SEMICOLON {$text= $vardef.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN>";
		};
vardef
	returns[String text]:
	tbas IDENTIFIER vardef2 {$text= "<SPAN CLASS=\"palres\">" + $tbas.type + "</SPAN> " + "<A NAME=\""+ $IDENTIFIER.text + "\">" + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN></A>" +  $vardef2.text;
		};
vardef2
	returns[String text]:
	SASIGN simpvalue {$text= "<SPAN CLASS=\"palres\"> " + $SASIGN.text  + "</SPAN> " + $simpvalue.text;
		}
	| {$text="";};
tbas
	returns[String type]:
	INTEGER {$type="integer";}
	| FLOAT {$type="float";}
	| STRING {$type="string";}
	| tvoid {$type=$tvoid.type;}
	| struct {$type=$struct.text;};
tvoid
	returns[String type]: VOID {$type="void";};
struct returns [String text]: STRUCT LBRACE varlist varlist2 RBRACE {$text = "<SPAN CLASS=\"palres\">" + $STRUCT.text + "</SPAN> " + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +  "\n<DIV style=\"padding-left: 0.5cm\">" + $varlist.text + "</DIV>\n" + $varlist2.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>";};
varlist2 returns [String text]: varlist varlist2 {$text = "\n<DIV style=\"padding-left: 0.5cm\">" + $varlist.text + "</DIV>\n" + $varlist2.text;} | {$text = "";};

funcdef
	returns[String body, String header]:
	funchead LBRACE code RBRACE {$body = "<A NAME=\""+ $funchead.name + "\"></A>\n"
		+ "<code>\n" + $funchead.text + "\n" + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" + "\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>" + "\n" + "<br/>\n</code>\n"
		+ "<A HREF=\"#" + $funchead.name + "\">Inicio de la función</A>\n"
		+ "<A HREF=\"#inicio\">Inicio del programa</A>\n"+
		"<hr/>\n\n";
		$header= "<LI><A HREF=\"#" + $funchead.name + "\">"+ $funchead.header+"</A></LI>\n";};
funchead
	returns[String name, String text, String header]:
	tbas IDENTIFIER LPARENTHESIS typedef1 RPARENTHESIS {$name = $IDENTIFIER.text; $text = "<SPAN CLASS=\"palres\">" + $tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" +  "<SPAN CLASS=\"palres\">" + $LPARENTHESIS.text + "</SPAN>" + $typedef1.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>";
		$header= $tbas.type + " " + $IDENTIFIER.text +  $LPARENTHESIS.text + $typedef1.header +  $RPARENTHESIS.text ;};
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

mainhead
	returns[String text]:
	tvoid MAIN LPARENTHESIS typedef1 RPARENTHESIS {$text = "<SPAN CLASS=\"palres\">" + $tvoid.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + $MAIN.text + "</SPAN>" +  "<SPAN CLASS=\"palres\">" + $LPARENTHESIS.text + "</SPAN>" + $typedef1.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>";
                                                                                                                                      		
		};

code
	returns[String text]:
	{$text="";}
	| sent code {$text= "<DIV style=\"padding-left: .5cm\">" + $sent.text + "</DIV>\n" + $code.text;}
		;
sent
	returns[String text]:
	asig SEMICOLON {$text = $asig.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN> ";}
	| funccall SEMICOLON {$text = $funccall.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN> ";
		}
	| vardef SEMICOLON {$text= $vardef.text + $SEMICOLON.text;}
	| miif {$text= $miif.text;}
	| miwhile {$text=$miwhile.text;}
	| mifor {$text=$mifor.text;}
	| midowhile {$text=$midowhile.text;};

asig
	returns[String text]:
	IDENTIFIER SASIGN exp {$text = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" + " <SPAN CLASS=\"palres\">" + $SASIGN.text + "</SPAN> " + $exp.text;
		}; //
exp
	returns[String text]:
	factor exp1 {$text = $factor.text + $exp1.text;};
exp1
	returns[String text]:
	op factor exp1 {$text=$op.text + $factor.text + $exp1.text;}
	| {$text = "";};
op
	returns[String text]:
	PLUS {$text = " <SPAN CLASS=\"palres\">" + $PLUS.text + "</SPAN> ";}
	| LESS {$text = " <SPAN CLASS=\"palres\">" + $LESS.text + "</SPAN> ";}
	| TIMES {$text = " <SPAN CLASS=\"palres\">" + $TIMES.text + "</SPAN> ";}
	| DIV {$text = " <SPAN CLASS=\"palres\">" + $DIV.text + "</SPAN> ";}
	| MOD {$text = " <SPAN CLASS=\"palres\">" + $MOD.text + "</SPAN> ";};
factor
	returns[String text]:
	simpvalue {$text = $simpvalue.text;}
	| LPARENTHESIS exp RPARENTHESIS {$text = "<SPAN CLASS=\"palres\">" + $LPARENTHESIS.text + "</SPAN>" + $exp.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>";
		}
	| funccall {$text = $funccall.text;};
funccall
	returns[String text]:
	IDENTIFIER subpparamlist {$text= "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text + "</SPAN>" + $subpparamlist.text;
		}
	| CONST_DEF_IDENTIFIER subpparamlist {$text= "<SPAN CLASS=\"ident\">" + $CONST_DEF_IDENTIFIER.text + "</SPAN>" + $subpparamlist.text;
		};
subpparamlist
	returns[String text]:
	LPARENTHESIS explist RPARENTHESIS {$text = "<SPAN CLASS=\"palres\">" + $LPARENTHESIS.text + "</SPAN>" + $explist.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>";
		}
	| {$text="";};
explist
	returns[String text]:
	exp explist1 {$text = $exp.text + $explist1.text;};
explist1
	returns[String text]:
	COMMA explist {$text =  "<SPAN CLASS=\"palres\">" + $COMMA.text + "</SPAN> " + $explist.text;}
	| {$text="";};

miif
	returns[String text]:
	IF expcond LBRACE code RBRACE mielse {$text ="<SPAN CLASS=\"palres\">" + $IF.text + "</SPAN> " + $expcond.text +
"\n" + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +  "\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>" + "\n" + "<br/>\n"  + "\n" + $mielse.text;};
mielse
	returns[String text]:
	ELSE else1 {$text=  "<SPAN CLASS=\"palres\">" + $ELSE.text + "</SPAN> " + $else1.text + "\n";}
	| {$text = "";};
else1
	returns[String text]:
	LBRACE code RBRACE {$text = "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" + "\n<DIV style=\"padding-left: 0.5cm\">\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>" + "\n" + "<br/>\n"  + "</DIV>\n";
		}
	| miif {$text = $miif.text ;};
miwhile
	returns[String text]:
	WHILE expcond LBRACE code RBRACE {$text ="<SPAN CLASS=\"palres\">" + $WHILE.text + "</SPAN> " + $expcond.text +
                                     "\n" + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +  "\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>" + "\n" + "<br/>\n"  + "\n";};
midowhile
	returns[String text]:
	DO LBRACE code RBRACE WHILE expcond SEMICOLON {$text = $text ="<SPAN CLASS=\"palres\">" + $DO.text + "</SPAN>" + "\n" + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +  "\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>" + "\n" + "<SPAN CLASS=\"palres\">" + $WHILE.text + "</SPAN> " + $expcond.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN>";};
mifor
	returns[String text]: FOR LPARENTHESIS for1 {$text = $text ="<SPAN CLASS=\"palres\">" + $FOR.text + "</SPAN>" + "<SPAN CLASS=\"palres\">" + $LPARENTHESIS.text + "</SPAN>" + $for1.text;};
for1
	returns[String text]:
	vardef SEMICOLON expcond SEMICOLON asig RPARENTHESIS LBRACE code RBRACE {$text = $vardef.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN> " + $expcond.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN> " + $asig.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>" + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +  "\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>";}
	| asig SEMICOLON expcond SEMICOLON asig RPARENTHESIS LBRACE code RBRACE {$text = $asig.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN> " + $expcond.text + "<SPAN CLASS=\"palres\">" + $SEMICOLON.text + "</SPAN> " + $asig.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>" + "<SPAN CLASS=\"palres\">" + $LBRACE.text + "</SPAN>" +  "\n" + $code.text + "<SPAN CLASS=\"palres\">" + $RBRACE.text + "</SPAN>";};
expcond
	returns[String text]:
	factorcond expcond_tail {$text= $factorcond.text + $expcond_tail.text;};
expcond_tail
	returns[String text]:
	oplog factorcond expcond_tail {$text = $oplog.text + $factorcond.text + $expcond_tail.text;}
	| {$text = "";};
oplog
	returns[String text]:
	OR {$text = " <SPAN CLASS=\"palres\">" + $OR.text + "</SPAN> ";}
	| AND {$text = " <SPAN CLASS=\"palres\">" + $AND.text + "</SPAN> ";};
factorcond
	returns[String text]:
	e1 = exp opcomp e2 = exp {$text = $e1.text + $opcomp.text + $e2.text;}
	| LPARENTHESIS expcond RPARENTHESIS {$text = "<SPAN CLASS=\"palres\">" + $LPARENTHESIS.text + "</SPAN>" + $expcond.text + "<SPAN CLASS=\"palres\">" + $RPARENTHESIS.text + "</SPAN>";
		}
	| NOT factorcond {$text = "<SPAN CLASS=\"palres\">" + $NOT.text + "</SPAN>" + $factorcond.text;}
		;
opcomp
	returns[String text]:
	SMORE {$text = " <SPAN CLASS=\"palres\">" + $SMORE.text + "</SPAN> ";}
	| SLESS {$text = " <SPAN CLASS=\"palres\">" + $SLESS.text + "</SPAN> ";}
	| SMOREE {$text = " <SPAN CLASS=\"palres\">" + $SMOREE.text + "</SPAN> ";}
	| SLESSE {$text = " <SPAN CLASS=\"palres\">" + $SLESSE.text + "</SPAN> ";}
	| SEQUAL {$text = " <SPAN CLASS=\"palres\">" + $SEQUAL.text + "</SPAN> ";};

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