package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.LogInPage.*;

public class VerificarPanelControl implements Question<Boolean> {

    public static VerificarPanelControl enLaPagina() {
        return new VerificarPanelControl();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOMEPAGE.resolveFor(actor).isVisible();
    }
}

