package co.com.tcs.certification.aviancawebtest.interactions;

import co.com.tcs.certification.aviancawebtest.tasks.EnterExploreDestinyTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tcs.certification.aviancawebtest.userinterfaces.ReserveFlight.*;
import static co.com.tcs.certification.aviancawebtest.userinterfaces.SelectDestiny.*;

public class TestReserveOption implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Visibility.of(DESTINI_INPUT).viewedBy(actor).resolve();
        OnStage.theActorInTheSpotlight().attemptsTo(EnterExploreDestinyTask.enter());
        WaitUntil.the(BUTTON_COUNTRY, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds();
    }

    public static TestReserveOption test() {

        return Tasks.instrumented(TestReserveOption.class);
    }
}
