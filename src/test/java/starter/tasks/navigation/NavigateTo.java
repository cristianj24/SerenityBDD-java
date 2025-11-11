package starter.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.ui.registration.RegisterPage;

public class NavigateTo {
    public static Performable loginPage(){
        return Task.where("{0} navigates to login page",
                Open.browserOn(new RegisterPage())
                );
    }
}
