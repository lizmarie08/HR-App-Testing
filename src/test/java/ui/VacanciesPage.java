package ui;

import net.serenitybdd.screenplay.targets.Target;

public class VacanciesPage {
    public static final Target VACANCIENAME_FIELD =  Target.the("VACANCIENAME_FIELD")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public static final Target JOBTITLE_FIELD =  Target.the("JOBTITLE_FIELD")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div");

    public static final Target JOBTITLE_OPTION =  Target.the("JOBTITLE_OPTION")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div[2]");

    public static final Target DESCRIPCION_FIELD =  Target.the("DESCRIPCION")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea");

    public static final Target HIRINGMANAGER_FIELD =  Target.the("HIRINGMANAGER_FIELD")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input");

    public static final Target HIRINGMANAGER_OPTION =  Target.the("HIRINGMANAGER_FIELD")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div[2]");



    public static final Target NUMBERPOS_FIELD =  Target.the("NUMBERO DE CONTACTO")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public static final Target ACTIVE_CHECK =  Target.the("ACTIVE")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/label/span");

    public static final Target PUBLISH_CHECK =  Target.the("PUBLISH IN RSS")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div/label/span");

    public static final Target botonGuardar = Target.the("Botón Guardar")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[7]/button[2]");

    public static final Target VANCANCIESUCCESSFULLY = Target.the("VACANTE SUCCESSFULLY")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]");

}
