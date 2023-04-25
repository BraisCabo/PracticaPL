import java.io.*;
import org.antlr.v4.runtime.*;
/*
El nombre ClasePrincipal es arbitrario, escoge el que prefieras.
Sustituye Practica por el nombre del fichero que contiene la especificación de la gramática ANTLR
(extensión .g4)
*/
public class ClasePrincipal {
    public static void main(String[] args) {
        try{
            String programName = args[0].substring(args[0].lastIndexOf("\\") + 1, args[0].lastIndexOf("."));
            String fileName = programName + ".html";
            try {
                PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(fileName,true)),true);
                System.setOut(ps);
            } catch (FileNotFoundException ex) {
                System.err.println("Se ha producido una excepción FileNotFoundException");
            }
            System.setOut(new PrintStream(new FileOutputStream(fileName)));
            System.out.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<TITLE>"+ args[0].substring(args[0].lastIndexOf("\\") + 1) + "</TITLE>\n"+
                    "<style>\n" +
                    ".cte {color:rgb(19,189,72);}\n" +
                    ".ident {color:rgb(55,40,244);}\n" +
                    ".palres {color:rgb(0,0,0);font-weight:bold;}\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n"+
                    "<A NAME=\"inicio\">\n" +
                    "<H1>" + args[0].substring(args[0].lastIndexOf("\\") + 1) + "</H1>\n" +
                    "<A NAME=\"Funciones\">\n" +
                    "<H2>Funciones</H2></A>\n");
// Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
// Crear el objeto correspondiente al analizador léxico con el fichero de
// entrada
            MiLexer analex = new MiLexer(input);
// Identificar al analizador léxico como fuente de tokens para el
// sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
// Crear el objeto correspondiente al analizador sintáctico
            PracticaParser anasint = new PracticaParser(tokens);
/*
Si se quiere pasar al analizador algún objeto externo con el que trabajar,
este deberá ser de una clase del mismo paquete
Aquí se le llama "sintesis", pero puede ser cualquier nombre.
PracticaParser anasint = new PracticaParser(tokens, new sintesis());
*/
/*
Comenzar el análisis llamando al axioma de la gramática
Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu
gramática
*/
            MiErrorSintaxis errorStrategy = new MiErrorSintaxis();
            anasint.removeErrorListeners();
            anasint.addErrorListener(new MiSintaxisListener());
            anasint.setErrorHandler(errorStrategy);
            anasint.program();
            System.out.println("</html>");

        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}