package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.DashboardPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrReclutamientoDeCandidatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.RECRUITMENT_OPTION),
                Click.on(DashboardPage.CANDIDATES_OPTIONS),
                Click.on(DashboardPage.ADD_BTN),
                WaitUntil.the(Target.the("Apllication").locatedBy("//*[@name=\"firstName\"]"), isVisible())
        );
    }

    public static IrReclutamientoDeCandidatos deCandidatos() {
        return instrumented(IrReclutamientoDeCandidatos.class);
    }
}

