package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickToFlightStatus implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.STATE_FLIGHT_ONPION));
    }

    public static ClickToFlightStatus enter() {
        return Tasks.instrumented(ClickToFlightStatus.class);
    }
}
