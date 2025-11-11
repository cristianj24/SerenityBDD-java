package starter.tasks.addtransaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import starter.questions.GetTransactionInfo;
import starter.ui.addTransaction.AddTransactionPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckNewTransactionWasAdded implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().should(
                seeThat(GetTransactionInfo.getDescription(),
                        CoreMatchers.containsStringIgnoringCase("500"))
        );

    }
}
