import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

public class MiSintaxisListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
            System.err.println(msg);
    }
    }