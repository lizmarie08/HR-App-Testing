package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarCargaPagina implements Task {
    private final int segundos;

    public EsperarCargaPagina(int segundos) {
        this.segundos = segundos;
    }

    public static EsperarCargaPagina porSegundos(int segundos) {
        return instrumented(EsperarCargaPagina.class, segundos);
    }

    @Override
    @Step("{0} espera durante #segundos segundos para que la página cargue")
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000L); // Convierte segundos a milisegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

