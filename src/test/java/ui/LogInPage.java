package ui;

import net.serenitybdd.screenplay.targets.Target;

public class LogInPage {

    public static final Target USERNAME =  Target.the("USERNAME field")
            .locatedBy("//input[@name='username']");

    public static final Target PASSWORD =  Target.the("PASSWORD field")
            .locatedBy("//input[@name='password']");

    public static final Target LOGINBTN = Target.the("Login Button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    public static final Target HOMEPAGE = Target.the("HomePage User Name")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]");


    public static final Target MENSAJE_DE_ERROR = Target.the("MENSAJE DE ERROR DE EMAIL")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]");


    public static final Target SIGNUP_BTN = Target.the("BOTON DE CREAR CUENTA")
            .locatedBy("//*[@id=\"SignupBtn\"]");

    public static final Target FORGOT_PASSWORD_LINK = Target.the("ENLACE OLVIDE MI CONTRASENA")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]");

    public static final Target BTN_RESET_PASSWORD = Target.the("BOTON RESET PASSWORD")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]");

    public static final Target RESETSUCCESFULLY = Target.the("RESET MESSAGE")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/p[3]/p[2]");

}
