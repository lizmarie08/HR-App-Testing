package ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage {

    public static final Target NOMBRE_FIELD =  Target.the("Nombre field")
            .locatedBy("//*[@id=\"SignupInputField\"]/div[2]/input[1]");
    public static final Target APELLIDO_FIELD =  Target.the("Apellido field")
            .locatedBy("//*[@id=\"SignupInputField\"]/div[2]/input[2]");
    public static final Target CORREO_ELECTRONICO_FIELD =  Target.the("Correo Electronico field")
            .locatedBy("//body/div[@id='app']/div[@id='login']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]");

    public static final Target CONTRASENA_FIELD =  Target.the("Contrasena field")
            .locatedBy("/html/body/div[1]/div/div/div[1]/div/form/div[1]/div/div[3]/div[2]/input");

    public static final Target REGISTRARSE_BTN =  Target.the("Registrarse Button")
            .locatedBy("//*[@id=\"SignupMainBtn\"]");
}
