import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class MiErrorSintaxis extends DefaultErrorStrategy {
    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        Token token = e.getOffendingToken();
        String mensaje;
        if (token.getType() == Parser.EOF) {
            mensaje = String.format("Error de sintaxis en línea %d, columna %d: se esperaba un token pero se encontró el final del archivo.",
                    token.getLine(), token.getCharPositionInLine());
        } else {
            mensaje = String.format("Error de sintaxis en línea %d, columna %d: se esperaba %s pero se encontró %s.",
                    token.getLine(), token.getCharPositionInLine(), e.getExpectedTokens().toString(recognizer.getVocabulary()), token.getText());
        }
        recognizer.notifyErrorListeners(token, mensaje, e);
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        Token currentToken = recognizer.getCurrentToken();
        IntervalSet expectedTokens = getExpectedTokens(recognizer);
        String expectedTokenString = expectedTokens.toString(recognizer.getVocabulary());

        String mensaje = String.format("Error de sintaxis en línea %d, columna %d: se esperaba: %s pero no se encontró nada.",
                currentToken.getLine(), currentToken.getCharPositionInLine(), expectedTokenString);

        recognizer.notifyErrorListeners(currentToken, mensaje, null);
    }


    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) throws RecognitionException {
        Token token = e.getOffendingToken();
        String mensaje = String.format("Error de sintaxis en línea %d, columna %d: se encontró %s pero se esperaba %s",
                token.getLine(), token.getCharPositionInLine(), token.getText(), e.getExpectedTokens().toString(recognizer.getVocabulary()));
        recognizer.notifyErrorListeners(token, mensaje, e);

    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        Token token = recognizer.getCurrentToken();
        String mensaje = String.format("Error de sintaxis en línea %d, columna %d: token no esperado %s.",
                token.getLine(), token.getCharPositionInLine(), token.getText());
        recognizer.notifyErrorListeners(token, mensaje, null);
    }




}