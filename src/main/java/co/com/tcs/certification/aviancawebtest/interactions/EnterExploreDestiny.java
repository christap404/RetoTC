package co.com.tcs.certification.aviancawebtest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.tcs.certification.aviancawebtest.userinterfaces.ReserveFlight.DESTINI_INPUT;

public class EnterExploreDestiny implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(DESTINI_INPUT, WebElementStateMatchers.isEnabled()).forNoMoreThan(15).seconds();
        actor.attemptsTo(Click.on(DESTINI_INPUT));
        actor.attemptsTo(Enter.theValue(Keys.ARROW_DOWN).into(DESTINI_INPUT));
        actor.attemptsTo(Enter.theValue(Keys.ENTER).into(DESTINI_INPUT));
    }

    public static EnterExploreDestiny enter() {
        return Tasks.instrumented(EnterExploreDestiny.class);
    }
}
