package co.com.tcs.certification.aviancawebtest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.tcs.certification.aviancawebtest.userinterfaces.FlightStatusOption.*;

public class TestStateFlight implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RADIO_BUTTON_FLIGHT_NUM));
        Visibility.of(INPUT_NUM_FLIGHT).viewedBy(actor).resolve();
    }

    public static TestStateFlight test() {
        return Tasks.instrumented(TestStateFlight.class);
    }
}
