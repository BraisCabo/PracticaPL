import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;


public class MiLexicoListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (e instanceof LexerNoViableAltException) {
            LexerNoViableAltException lexEx = (LexerNoViableAltException) e;
            CharStream input = lexEx.getInputStream();
            int start = lexEx.getStartIndex();
            int end = input.index();
            String text = input.getText(new Interval(start, end));
            System.err.println("Error léxico en la línea " + line + ", columna: " + charPositionInLine + ". Carácter '" + text + "' no reconocido.");
        } else {
            System.err.println(e.getClass());
        }
    }
}