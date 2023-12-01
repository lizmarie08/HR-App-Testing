package task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;

import java.util.concurrent.Callable;

import static ui.LogInPage.MENSAJE_DE_ERROR;

public class VerificarMensajeDeError implements Task {
    private final String mensajeError;

    public VerificarMensajeDeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public static VerificarMensajeDeError conMensaje(String mensajeError) {
        return new VerificarMensajeDeError(mensajeError);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until((Callable<Boolean>) WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(Text.of(MENSAJE_DE_ERROR).asString()).isEqualTo(mensajeError)
        );
    }
}

