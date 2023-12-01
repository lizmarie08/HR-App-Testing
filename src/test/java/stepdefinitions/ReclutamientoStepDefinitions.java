package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import task.*;
import ui.LogInPage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ReclutamientoStepDefinitions {

        @Before
        public void setUp(){
                OnStage.setTheStage(new OnlineCast());
                OnStage.theActorCalled("actor");
        }

        @Y("ingreso a la opcion de reclutamiento de vacante")
        public void ingresoaLaOpcionDeReclutamientoDeVacantes() {
                theActorInTheSpotlight().attemptsTo(
                        EsperarCargaPagina.porSegundos(5)
                );
                theActorInTheSpotlight().should(
                        seeThat(VerificarPanelControl.enLaPagina())
                );
                theActorInTheSpotlight().attemptsTo(
                        IrReclutamientoDeVacantes.deVacantes()
                );
        }

        @Y("ingreso a la opcion de reclutamiento de candidatos")
        public void ingresoaLaOpcionDeReclutamientoDeCandidatos() {
                theActorInTheSpotlight().attemptsTo(
                        EsperarCargaPagina.porSegundos(5)
                );
                theActorInTheSpotlight().should(
                        seeThat(VerificarPanelControl.enLaPagina())
                );
                theActorInTheSpotlight().attemptsTo(
                        IrReclutamientoDeCandidatos.deCandidatos()
                );
        }

        @Y("ingreso los datos del nuevo candidato")
        public void ingresoLosDatosDelNuevoCandidatos(List<Map<String, String>> datosCandidato) {
                theActorInTheSpotlight().attemptsTo(
                        CompletarCandidato.conInformacion(
                                datosCandidato.get(0).get("Primer Nombre"),
                                datosCandidato.get(0).get("Segundo Nombre"),
                                datosCandidato.get(0).get("Apellido"),
                                datosCandidato.get(0).get("Email"),
                                datosCandidato.get(0).get("Número de Contacto"),
                                datosCandidato.get(0).get("Curriculum"),
                                datosCandidato.get(0).get("Fecha de Nacimiento"),
                                datosCandidato.get(0).get("Nota de Prueba")
                        )
                );
        }

        @Entonces("se debe mostrar los datos del candidato completados correctamente")
        public void seDebeMostrarLosDatosDelCandidatoCompletadosCorrectamente() {
                theActorInTheSpotlight().attemptsTo(
                        EsperarCargaPagina.porSegundos(5)
                );
                theActorInTheSpotlight().should(
                        seeThat(VerificarCandidatoCompletado.enLaPagina())
                );
        }

        @Y("ingreso los datos del nuevo vacante")
        public void ingresoLosDatosDelNuevoVacantes(List<Map<String, String>> datosVancnte) {
                theActorInTheSpotlight().attemptsTo(
                        CompletarVacante.conInformacion(
                                datosVancnte.get(0).get("Vacancy Name"),
                                datosVancnte.get(0).get("Job Title"),
                                datosVancnte.get(0).get("Description"),
                                datosVancnte.get(0).get("Hiring Manager"),
                                datosVancnte.get(0).get("Number")
                        )
                );
        }

        @Entonces("se debe mostrar los datos completados de la vacante correctamente")
        public void seDebeMostrarLosDatosCompletadosDeLaVacanteCorrectamente() {
                theActorInTheSpotlight().attemptsTo(
                        EsperarCargaPagina.porSegundos(5)
                );
                theActorInTheSpotlight().should(
                        seeThat(VerificarVacanteCompletado.enLaPagina())
                );
        }
}



