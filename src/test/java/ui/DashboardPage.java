package ui;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target RECRUITMENT_OPTION =  Target.the("RECRUITMENT OPTION")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]/span[1]");
    public static final Target VACANCIES_OPTIONS =  Target.the("VACANCIES OPTION")
            .locatedBy("//a[contains(text(),'Vacancies')]");
    public static final Target CANDIDATES_OPTIONS =  Target.the("CANDIDATES OPTION")
            .locatedBy("//a[contains(text(),'Candidates')]");

    public static final Target ADD_BTN =  Target.the("ADD BUTTON")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");


}
