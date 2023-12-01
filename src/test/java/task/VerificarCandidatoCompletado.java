package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.CandidatePage.CANDIDATOSUCCESSFULLY;

public class VerificarCandidatoCompletado implements Question<Boolean> {

    public static VerificarCandidatoCompletado enLaPagina() {
        return new VerificarCandidatoCompletado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CANDIDATOSUCCESSFULLY.resolveFor(actor).isVisible();
    }
}

