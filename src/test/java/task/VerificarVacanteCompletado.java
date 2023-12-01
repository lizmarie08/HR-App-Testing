package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.CandidatePage.CANDIDATOSUCCESSFULLY;
import static ui.VacanciesPage.VANCANCIESUCCESSFULLY;

public class VerificarVacanteCompletado implements Question<Boolean> {

    public static VerificarVacanteCompletado enLaPagina() {
        return new VerificarVacanteCompletado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VANCANCIESUCCESSFULLY.resolveFor(actor).isVisible();
    }
}

