package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.userinterfaces.FlightStatusOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickButtonConsult implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightStatusOption.BUTTON_CONSULT));
    }

    public static ClickButtonConsult click() {
        return Tasks.instrumented(ClickButtonConsult.class);
    }
}
