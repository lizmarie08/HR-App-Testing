package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;
import ui.LogInPage;

public class SeleccionarOlvideContrasena implements Task {
    @Override
    @Step("{0} clicks on the 'Forgot Password' link")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ui.LogInPage.FORGOT_PASSWORD_LINK));
    }

    public static SeleccionarOlvideContrasena link() {
        return new SeleccionarOlvideContrasena();
    }
}
