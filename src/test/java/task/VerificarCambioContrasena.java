package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.LogInPage.RESETSUCCESFULLY;

public class VerificarCambioContrasena implements Question<Boolean> {

    public static VerificarCambioContrasena enLaPagina() {
        return new VerificarCambioContrasena();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RESETSUCCESFULLY.resolveFor(actor).isVisible();
    }

}
