package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickReserveFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.RESERVE_FLIGHT_OPTION));
    }

    public static ClickReserveFlight click() {
        return Tasks.instrumented(ClickReserveFlight.class);
    }
}
