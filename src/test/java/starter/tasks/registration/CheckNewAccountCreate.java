package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.CoreMatchers;
import starter.ui.registration.SummaryPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckNewAccountCreate implements Task {
    private final String expectedName;
    private final String expectedLastName;

    public CheckNewAccountCreate(String expectedName,String expectedLastName) {
        this.expectedName=expectedName;
        this.expectedLastName=expectedLastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toWindowTitled("Summary")
        );
        theActorInTheSpotlight().should(
                seeThat(Text.of(SummaryPage.LABEL_NAME),
                        CoreMatchers.containsStringIgnoringCase(expectedName)
                ),
                seeThat(Text.of(SummaryPage.LABEL_LAST_NAME),
                        CoreMatchers.containsStringIgnoringCase(expectedLastName)
                )
        );
    }
}
