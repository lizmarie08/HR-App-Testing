package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.CandidatePage;
import ui.VacanciesPage;

import java.nio.file.Path;
import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarVacante implements Task {

    private final String vacancyName;
    private final String jobTitle;
    private final String description;
    private final String hiringManager;
    private final String Number;

    public CompletarVacante(String vacancyName, String jobTitle, String description,
                            String hiringManager, String Number) {
        this.vacancyName = vacancyName;
        this.jobTitle = jobTitle;
        this.description = description;
        this.hiringManager = hiringManager;
        this.Number = Number;
    }

    public static CompletarVacante conInformacion(String vacancyName, String jobTitle, String description,
                                                  String hiringManager, String Number) {
        return Tasks.instrumented(CompletarVacante.class, vacancyName, jobTitle, description,
                hiringManager, Number);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Target.the("Apllication").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]"), isVisible()),
                Enter.theValue(vacancyName).into(VacanciesPage.VACANCIENAME_FIELD),
                Click.on(VacanciesPage.JOBTITLE_FIELD),
                Click.on(VacanciesPage.JOBTITLE_OPTION),
                Enter.theValue(description).into(VacanciesPage.DESCRIPCION_FIELD),
                // Puedes adaptar esto según tu interfaz de usuario
                //SelectFromOptions.byVisibleText("Christelle").from(Target.the("Lista de Vacantes").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div")),
                Enter.theValue(hiringManager).into(VacanciesPage.HIRINGMANAGER_FIELD),
                WaitUntil.the(Target.the("Apllication").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div[2]"), isVisible()),
                EsperarCargaPagina.porSegundos(5),
                Click.on(VacanciesPage.HIRINGMANAGER_OPTION),
                Enter.theValue(Number).into(VacanciesPage.NUMBERPOS_FIELD),
                Click.on(VacanciesPage.ACTIVE_CHECK),
                Click.on(VacanciesPage.PUBLISH_CHECK),
                Click.on(VacanciesPage.botonGuardar)
                //WaitUntil.the(Target.the("Apllication").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]"), isVisible())
        );
    }
}

