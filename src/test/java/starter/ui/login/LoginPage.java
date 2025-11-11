package starter.ui.login;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {
    public static Target INPUT_USERNAME = Target.the("username input").located(By.id("username"));
    public static Target INPUT_PASSWORD = Target.the("password input").located(By.id("password"));
    public static Target BUTTON_LOG_IN = Target.the("button login").locatedBy("//button[contains(.,'Iniciar sesión')]");
}
