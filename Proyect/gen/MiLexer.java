import org.antlr.v4.runtime.CharStream;

public class MiLexer extends PracticaLexer{
    public MiLexer(CharStream input) {
        super(input);
        MiLexicoListener lexerErrorListener = new MiLexicoListener();
        removeErrorListeners();
        addErrorListener(lexerErrorListener);
    }
}
