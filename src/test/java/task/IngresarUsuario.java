package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LogInPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarUsuario implements Task {

    private String nombreUsuario;

    public IngresarUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreUsuario).into(LogInPage.USERNAME),
                Click.on(LogInPage.BTN_RESET_PASSWORD)
        );
    }

    public static IngresarUsuario conCredenciales(String nombreUsuario) {
        return instrumented(IngresarUsuario.class, nombreUsuario);
    }

}
