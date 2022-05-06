package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.userinterfaces.ReserveFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickFilterToward implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ReserveFlight.DESTINI_INPUT));
    }

    public static ClickFilterToward click() {
        return Tasks.instrumented(ClickFilterToward.class);
    }
}
