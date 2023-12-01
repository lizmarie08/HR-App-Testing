package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.CandidatePage;

import java.nio.file.Path;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarCandidato implements Task {

    private final String primerNombre;
    private final String segundoNombre;
    private final String apellido;
    private final String email;
    private final String numeroContacto;
    private final String rutaCurriculum;
    private final String fechaNacimiento;
    private final String notaPrueba;

    public CompletarCandidato(String primerNombre, String segundoNombre, String apellido,
                               String email, String numeroContacto, String rutaCurriculum,
                               String fechaNacimiento, String notaPrueba) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroContacto = numeroContacto;
        this.rutaCurriculum = rutaCurriculum;
        this.fechaNacimiento = fechaNacimiento;
        this.notaPrueba = notaPrueba;
    }

    public static CompletarCandidato conInformacion(String primerNombre, String segundoNombre, String apellido,
                                                     String email, String numeroContacto, String rutaCurriculum,
                                                     String fechaNacimiento, String notaPrueba) {
        return Tasks.instrumented(CompletarCandidato.class, primerNombre, segundoNombre, apellido,
                email, numeroContacto, rutaCurriculum, fechaNacimiento, notaPrueba);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Target.the("Apllication").locatedBy("//*[@name=\"firstName\"]"), isVisible()),
                Enter.theValue(primerNombre).into(CandidatePage.PRIMERNOMBRE_FIELD),
                Enter.theValue(segundoNombre).into(CandidatePage.SEGUNDONOMBRE_FIELD),
                Enter.theValue(apellido).into(CandidatePage.APELLIDO_FIELD),
                // Puedes adaptar esto según tu interfaz de usuario
                //SelectFromOptions.byVisibleText("Christelle").from(Target.the("Lista de Vacantes").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div")),
                Enter.theValue(email).into(CandidatePage.EMAIL_FIELD),
                Enter.theValue(numeroContacto).into(CandidatePage.NUMBER_FIELD),
                Upload.theFile(Path.of(rutaCurriculum)).to(CandidatePage.CURRICULUM_FIELD),
                // Puedes adaptar esto según tu interfaz de usuario
                //DatePicker.selectDate(fechaNacimiento).from(Target.the("Fecha de Nacimiento").locatedBy("//input[@id='fechaNacimiento']")),
                Enter.theValue(notaPrueba).into(CandidatePage.NOTE_FIELD),
                Click.on(CandidatePage.checkbox),
                Click.on(CandidatePage.botonGuardar)
                //WaitUntil.the(Target.the("Apllication").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]"), isVisible())
        );
    }
}

