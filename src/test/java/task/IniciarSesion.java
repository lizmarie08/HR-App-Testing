package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LogInPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private String nombreUsuario;
    private String contrasena;

    public IniciarSesion(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreUsuario).into(LogInPage.USERNAME),
                Enter.theValue(contrasena).into(LogInPage.PASSWORD),
                Click.on(LogInPage.LOGINBTN)
        );
    }

    public static IniciarSesion conCredenciales(String nombreUsuario, String contrasena) {
        return instrumented(IniciarSesion.class, nombreUsuario, contrasena);
    }
}

