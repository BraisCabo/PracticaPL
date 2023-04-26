grammar Practica;
@parser::header {
    import java.util.*;
}


@parser::members {

    HashMap<String, String> tablaSimbolos = new HashMap<>();
    HashMap<String, Integer> contados = new HashMap<>();
    int count = 0;

       public String addSimbolo(String bloque, String funcion, String nombre){
           if (!bloque.equals("no")){
               if (funcion.equals("")){
                   tablaSimbolos.put(nombre, bloque+":"+nombre);
                   return "<A NAME=\""+ bloque+":"+nombre + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
               }else{
                   tablaSimbolos.put(funcion+":"+nombre, bloque+":"+funcion+":"+nombre);
                   return "<A NAME=\""+ bloque+":"+funcion+":"+nombre + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
               }}
           return "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN>";
       }

    public String getSimbolo(String funcion, String nombre){
        if (tablaSimbolos.containsKey(funcion+":"+nombre)){
            return "<A HREF=\"#" + tablaSimbolos.get(funcion+":"+nombre) + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
        }else if (tablaSimbolos.containsKey(nombre)){
            return "<A HREF=\"#" + tablaSimbolos.get(nombre) + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
        }else{
            if (funcion.lastIndexOf(":") == -1){
                return "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN>";
            }
            else{
                return getSimbolo(funcion.substring(0, funcion.lastIndexOf(":")), nombre);
            }
        }
    }

    public String getCount(){
    count++;
    return Integer.toString(count);
    }


}

program:
	dcllist funlist sentlist {System.out.println("<UL>\n<LI><A HREF=\"#Programa Principal\">Programa Principal</A></LI>\n"+$funlist.headers + "</UL>\n</body>\n<hr/>\n" + $funlist.bodys);
		                                    System.out.println("<A NAME=\"Programa Principal\"><H2>Programa Principal</H2></A>\n\n<code>\n" + $dcllist.text + "</code>\n<br/>\n");
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
	mainhead LBRACE code["Programa principal", "Main"] RBRACE {$text="<A NAME=\"Main\"></A>\n<code>\n"+$mainhead.text+"\n"+  "<br/>" + $LBRACE.text +"\n"+ $code.text + $RBRACE.text +"\n\n<br/>\n</code>\n"+
"<A HREF=\"#Programa Principal\">Inicio del programa principal</A>\n<A HREF=\"#inicio\">Inicio del programa</A><hr/>";
		};

dcl
	returns[String text]:
	ctelist["Programa principal", ""] {$text=$ctelist.text;}
	| varlist["Programa principal", ""] {$text=$varlist.text;};
ctelist[String bloque, String funcion]
	returns[String text]:
	DEFINE CONST_DEF_IDENTIFIER simpvalue {$text= "<SPAN CLASS=\"palres\">" +  $DEFINE.text + "</SPAN> " + addSimbolo($bloque, $funcion, $CONST_DEF_IDENTIFIER.text) + " " + $simpvalue.text;
		};
simpvalue
	returns[String text]:
	NUMERIC_INTEGER_CONST {$text = "<SPAN CLASS=\"cte\">" + $NUMERIC_INTEGER_CONST.text + "</SPAN>";
		}
	| NUMERIC_REAL_CONST {$text = "<SPAN CLASS=\"cte\">" + $NUMERIC_REAL_CONST.text + "</SPAN>";}
	| STRING_CONST {$text = "<SPAN CLASS=\"cte\">" + $STRING_CONST.text + "</SPAN>";};
varlist[String bloque, String funcion]
	returns[String text]:
	vardef[$bloque, $funcion] SEMICOLON {$text= $vardef.text + $SEMICOLON.text;
		};
vardef[String bloque, String funcion]
	returns[String text]:
	tbas IDENTIFIER vardef2 {$text= $tbas.text + addSimbolo($bloque, $funcion, $IDENTIFIER.text) +  $vardef2.text;
		};
vardef2
	returns[String text]:
	SASIGN simpvalue {$text= " " + $SASIGN.text  + " " + $simpvalue.text;
		}
	| {$text="";};
tbas
	returns[String type, String text]:
	INTEGER {$type="integer"; $text = "<SPAN CLASS=\"palres\">integer</SPAN> " ;}
	| FLOAT {$type="float"; $text = "<SPAN CLASS=\"palres\">float</SPAN> " ;}
	| STRING {$type="string"; $text = "<SPAN CLASS=\"palres\">string</SPAN> " ;}
	| tvoid {$type=$tvoid.type; $text= $tvoid.text;}
	| struct {$type=$struct.type; $text= $struct.text;};
tvoid
	returns[String type, String text]:
	VOID {$type="void"; $text= "<SPAN CLASS=\"palres\">" + $VOID.text + "</SPAN> ";};
struct
	returns[String type, String text]:
	STRUCT LBRACE varlist["no",""] varlist2 RBRACE {$text = "<SPAN CLASS=\"palres\">" + $STRUCT.text + "</SPAN> " + "<br/>" + $LBRACE.text +  "\n<DIV style=\"padding-left: 0.5cm\">" + $varlist.text + "</DIV>\n" + $varlist2.text + $RBRACE.text + " ";
$type = $STRUCT.text + " " + "<br/>" + $LBRACE.text  + "\n<DIV style=\"padding-left: 0.5cm\">" + $varlist.text + "</DIV>\n" + $varlist2.text  + $RBRACE.text;
};
varlist2
	returns[String text]:
	varlist["no",""] varlist2 {$text = "\n<DIV style=\"padding-left: 0.5cm\">" + $varlist.text + "</DIV>\n" + $varlist2.text;
		}
	| {$text = "";};

funcdef
	returns[String body, String header]:
	funchead["Funciones"] LBRACE code["Funciones", $funchead.name] RBRACE {$body ="<code>\n" + $funchead.text + "\n" + "<br/>" + $LBRACE.text + "\n" + $code.text + $RBRACE.text + "\n" + "<br/>\n</code>\n"
		+ "<A HREF=\"#Funciones:" + $funchead.name + "\">Inicio de la función</A>\n"
		+ "<A HREF=\"#inicio\">Inicio del programa</A>\n"+
		"<hr/>\n\n";
		$header= "<LI><A HREF=\"#Funciones:" + $funchead.name + "\">"+ $funchead.header+"</A></LI>\n";};
funchead[String bloque]
	returns[String name, String text, String header]:
	tbas IDENTIFIER LPARENTHESIS typedef1[$bloque, $IDENTIFIER.text] RPARENTHESIS {$name = $IDENTIFIER.text; $text = $tbas.text + addSimbolo("Funciones", "", $IDENTIFIER.text) +  $LPARENTHESIS.text + $typedef1.text + $RPARENTHESIS.text;
		$header= $tbas.type + " " + $IDENTIFIER.text +  $LPARENTHESIS.text + $typedef1.header +  $RPARENTHESIS.text;
		};
typedef1[String bloque, String funcion]
	returns[String text, String header]:
	{$text="";
		$header="";}
	| tbas IDENTIFIER typedef2_tail[$bloque, $funcion] {$text=$tbas.text + addSimbolo($bloque, $funcion, $IDENTIFIER.text) + $typedef2_tail.text;
		$header= $tbas.type + " " + $IDENTIFIER.text  + $typedef2_tail.header;
		};
typedef2_tail[String bloque, String funcion]
	returns[String text, String header]:
	COMMA tbas IDENTIFIER typedef2_tail[$bloque, $funcion] {$text=$COMMA.text + $tbas.text + addSimbolo($bloque, $funcion, $IDENTIFIER.text) + $typedef2_tail.text;
		$header=", " + $tbas.type + " " + $IDENTIFIER.text + $typedef2_tail.header;
		}
	| {$text="";
      $header="";};

mainhead
	returns[String text]:
	tvoid MAIN LPARENTHESIS typedef1["Programa principal", "Main"] RPARENTHESIS {$text = "<SPAN CLASS=\"palres\">" + $tvoid.type + "</SPAN> " + addSimbolo("Programa principal", "", "Main") +  $LPARENTHESIS.text + $typedef1.text + $RPARENTHESIS.text;
		};

code[String bloque, String funcion]
	returns[String text]:
	{$text="";}
	| sent[$bloque, $funcion] code[$bloque, $funcion] {$text= "<DIV style=\"padding-left: .5cm\">" + $sent.text + "</DIV>\n" + $code.text;
		};
sent[String bloque, String funcion]
	returns[String text]:
	IDENTIFIER aux[$funcion] SEMICOLON {$text = getSimbolo($funcion, $IDENTIFIER.text) + $aux.text + $SEMICOLON.text;}
	| CONST_DEF_IDENTIFIER subpparamlist[$funcion] SEMICOLON {$text= getSimbolo($funcion, $CONST_DEF_IDENTIFIER.text) + $subpparamlist.text;}
	| vardef[$bloque, $funcion] SEMICOLON {$text= $vardef.text + $SEMICOLON.text;}
	| miif[$bloque, $funcion, getCount()] {$text= $miif.text;}
	| miwhile[$bloque, $funcion, getCount()] {$text=$miwhile.text;}
	| mifor[$bloque, $funcion, getCount()] {$text=$mifor.text;}
	| midowhile[$bloque, $funcion, getCount()] {$text=$midowhile.text;}
	| mireturn[$funcion] SEMICOLON {$text= $mireturn.text + $SEMICOLON.text;};

aux[String funcion]
	returns[String text]:
	SASIGN exp[$funcion] {$text=" " + $SASIGN.text + " " + $exp.text;}
	| subpparamlist[$funcion] {$text= $subpparamlist.text;};

asig[String funcion]
	returns[String text]:
	IDENTIFIER SASIGN exp[$funcion] {$text =  getSimbolo($funcion, $IDENTIFIER.text) + " " + $SASIGN.text + " " + $exp.text;
		}; //
mireturn[String funcion]
	returns[String text]:
	RETURN exp[$funcion] {$text= "<SPAN CLASS=\"palres\">" + $RETURN.text + "</SPAN> " + $exp.text;}
		;
exp[String funcion]
	returns[String text]:
	factor[$funcion] exp1[$funcion] {$text = $factor.text + $exp1.text;};
exp1[String funcion]
	returns[String text]:
	op factor[$funcion] exp1[$funcion] {$text=$op.text + $factor.text + $exp1.text;}
	| {$text = "";};
op
	returns[String text]:
	PLUS {$text = " " + $PLUS.text + " ";}
	| LESS {$text = " " + $LESS.text + " ";}
	| TIMES {$text = " " + $TIMES.text + " ";}
	| DIV {$text = " " + $DIV.text + " ";}
	| MOD {$text = " " + $MOD.text + " ";};
factor[String funcion]
	returns[String text]:
	simpvalue {$text = $simpvalue.text;}
	| LPARENTHESIS exp[$funcion] RPARENTHESIS {$text = $LPARENTHESIS.text + $exp.text + $RPARENTHESIS.text;
		}
	| funccall[$funcion] {$text = $funccall.text;};
funccall[String funcion]
	returns[String text]:
	IDENTIFIER subpparamlist[$funcion] {$text=  getSimbolo($funcion, $IDENTIFIER.text) + $subpparamlist.text;
		}
	| CONST_DEF_IDENTIFIER subpparamlist[$funcion] {$text= getSimbolo($funcion, $CONST_DEF_IDENTIFIER.text) + $subpparamlist.text;
		};
subpparamlist[String funcion]
	returns[String text]:
	LPARENTHESIS explist[$funcion] RPARENTHESIS {$text = $LPARENTHESIS.text + $explist.text + $RPARENTHESIS.text;
		}
	| {$text="";};
explist[String funcion]
	returns[String text]:
	exp[$funcion] explist1[$funcion] {$text = $exp.text + $explist1.text;};
explist1[String funcion]
	returns[String text]:
	COMMA explist[$funcion] {$text = $COMMA.text + " " + $explist.text;}
	| {$text="";};

miif[String bloque, String funcion, String cont]
	returns[String text]:
	IF expcond[$funcion] LBRACE code[$bloque, $funcion+":if"+cont] RBRACE mielse[$bloque, $funcion, getCount()] {$text ="<A NAME=\""+ $bloque+ ":" + $funcion +":if" + cont + "\"><SPAN CLASS=\"palres\">" + $IF.text + "</SPAN></A> " + $expcond.text +
"\n" + "<br/>" + $LBRACE.text +  "\n" + $code.text + $RBRACE.text + "\n" + "<br/>\n"  + "\n" + $mielse.text;
		};
mielse[String bloque, String funcion, String cont]
	returns[String text]:
	ELSE else1[$bloque, $funcion, cont] {$text=  "<SPAN CLASS=\"palres\">" + $ELSE.text + "</SPAN> " + $else1.text + "\n";
		}
	| {$text = "";};
else1[String bloque, String funcion, String cont]
	returns[String text]:
	LBRACE code[$bloque, $funcion+":else"+cont] RBRACE {$text ="<A NAME=\""+ $bloque+ ":" + $funcion +":else" + cont + "\"></A><br/>" + $LBRACE.text + $code.text + $RBRACE.text + "\n" + "<br/>\n"  + "\n";
		}
	| miif[$bloque, $funcion, cont] {$text = $miif.text ;};
miwhile[String bloque, String funcion, String cont]
	returns[String text]:
	WHILE expcond[$funcion] LBRACE code[$bloque, $funcion+":while"+cont] RBRACE {$text ="<A NAME=\""+ $bloque+ ":" + $funcion +":while" + cont + "\"><SPAN CLASS=\"palres\">" + $WHILE.text + "</SPAN></A>" + $expcond.text +
                                     "\n" + "<br/>" + $LBRACE.text +  "\n" + $code.text + $RBRACE.text + "\n" + "<br/>\n"  + "\n";
		};
midowhile[String bloque, String funcion, String cont]
	returns[String text]:
	DO LBRACE code[$bloque, $funcion+":dowhile"+cont] RBRACE WHILE expcond[$funcion] SEMICOLON {$text = $text ="<A NAME=\""+ $bloque+ ":" + $funcion +":dowhile" + cont + "\"><SPAN CLASS=\"palres\">" + $DO.text + "</SPAN></A>" + "\n" + "<br/>" + $LBRACE.text +  "\n" + $code.text + $RBRACE.text + "\n" + "<SPAN CLASS=\"palres\">" + $WHILE.text + "</SPAN>" + $expcond.text + $SEMICOLON.text;
		};
mifor[String bloque, String funcion, String cont]
	returns[String text]:
	FOR LPARENTHESIS for1[$bloque, $funcion+":for"+cont] {$text = $text ="<A NAME=\""+ $bloque+ ":" + $funcion +":for" + cont + "\"><SPAN CLASS=\"palres\">" + $FOR.text + "</SPAN></A>" + $LPARENTHESIS.text + $for1.text;
		};
for1[String bloque, String funcion]
	returns[String text]:
	vardef[$bloque, $funcion] SEMICOLON expcond[$funcion] SEMICOLON asig[$funcion] RPARENTHESIS
		LBRACE code[$bloque, $funcion] RBRACE {$text = $vardef.text + $SEMICOLON.text + " " + $expcond.text + $SEMICOLON.text + " " + $asig.text + $RPARENTHESIS.text + "<br/>" + $LBRACE.text +  "\n" + $code.text + $RBRACE.text;
		}
	| asig[$funcion] SEMICOLON expcond[$funcion] SEMICOLON asig[$funcion] RPARENTHESIS LBRACE code[$bloque, $funcion]
		RBRACE {$text = $asig.text + $SEMICOLON.text + " " + $expcond.text + $SEMICOLON.text + " " + $asig.text + $RPARENTHESIS.text + "<br/>" + $LBRACE.text +  "\n" + $code.text + $RBRACE.text;
		};
expcond[String funcion]
	returns[String text]:
	factorcond[$funcion] expcond_tail[$funcion] {$text= $factorcond.text + $expcond_tail.text;};
expcond_tail[String funcion]
	returns[String text]:
	oplog factorcond[$funcion] expcond_tail[$funcion] {$text = $oplog.text + $factorcond.text + $expcond_tail.text;
		}
	| {$text = "";};
oplog
	returns[String text]:
	OR {$text = " " + $OR.text + " ";}
	| AND {$text = " " + $AND.text + " ";};
factorcond[String funcion]
	returns[String text]:
	e1 = exp[$funcion] opcomp e2 = exp[$funcion] {$text = $e1.text + $opcomp.text + $e2.text;}
	| LPARENTHESIS expcond[$funcion] RPARENTHESIS {$text = $LPARENTHESIS.text + $expcond.text + $RPARENTHESIS.text;
		}
	| NOT factorcond[$funcion] {$text = "<SPAN CLASS=\"palres\">" + $NOT.text + "</SPAN>" + $factorcond.text;
		};
opcomp
	returns[String text]:
	SMORE {$text = " " + $SMORE.text + " ";}
	| SLESS {$text = " " + $SLESS.text + " ";}
	| SMOREE {$text = " " + $SMOREE.text + " ";}
	| SLESSE {$text = " " + $SLESSE.text + " ";}
	| SEQUAL {$text = " " + $SEQUAL.text + " ";};

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
RETURN: 'return';

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