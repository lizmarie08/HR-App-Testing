package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.DashboardPage;
import ui.LogInPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrReclutamientoDeVacantes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.RECRUITMENT_OPTION),
                Click.on(DashboardPage.VACANCIES_OPTIONS),
                Click.on(DashboardPage.ADD_BTN)
        );
    }

    public static IrReclutamientoDeVacantes deVacantes() {
        return instrumented(IrReclutamientoDeVacantes.class);
    }
}

