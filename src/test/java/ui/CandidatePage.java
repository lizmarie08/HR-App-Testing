package ui;

import net.serenitybdd.screenplay.targets.Target;

public class CandidatePage {
    public static final Target PRIMERNOMBRE_FIELD =  Target.the("PrimerNombre")
            .locatedBy("//*[@name=\"firstName\"]");
    public static final Target SEGUNDONOMBRE_FIELD =  Target.the("Segundo Nombre")
            .locatedBy("//*[@name=\"middleName\"]");

    public static final Target APELLIDO_FIELD =  Target.the("APELLIDO")
            .locatedBy("//*[@name=\"lastName\"]");

    public static final Target EMAIL_FIELD =  Target.the("EMAIL")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public static final Target NUMBER_FIELD =  Target.the("NUMBERO DE CONTACTO")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]");

    public static final Target CURRICULUM_FIELD =  Target.the("curriculum")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public static final Target DATE_FIELD =  Target.the("FECHA")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");

    public static final Target NOTE_FIELD =  Target.the("NOTA")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/textarea[1]");

    public static final Target checkbox = Target.the("Checkbox").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span");
    public static final Target botonGuardar = Target.the("Botón Guardar").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/button[2]");

    public static final Target CANDIDATOSUCCESSFULLY = Target.the("CANDIDATO SUCCESSFULLY")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/h6[1]");

}
