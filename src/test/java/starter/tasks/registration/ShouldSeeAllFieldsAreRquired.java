package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.CoreMatchers;
import starter.ui.registration.RegisterForm;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShouldSeeAllFieldsAreRquired implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().should(
                seeThat(Text.of(RegisterForm.ALERT_ALL_REQUIRED_FIELDS)
                        , CoreMatchers.containsStringIgnoringCase("Por favor diligencie todos los campos"))
        );
    }
}
