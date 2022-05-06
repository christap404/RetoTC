package co.com.tcs.certification.aviancawebtest.interactions;

import co.com.tcs.certification.aviancawebtest.integrations.FileTxt;
import co.com.tcs.certification.aviancawebtest.userinterfaces.FlightStatusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.util.List;
import java.util.Set;

import static co.com.tcs.certification.aviancawebtest.userinterfaces.FlightStatusOption.*;

public class EnterInformation implements Interaction {

    private List<Object> info;

    public EnterInformation(List<Object> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String flightNumber;
        String airportName;
        String hourArrival;
        WaitUntil.the(INPUT_ORIGIN, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Enter.theValue(info.get(0).toString()).into(INPUT_ORIGIN),
                Enter.keyValues(Keys.ARROW_DOWN).into(INPUT_ORIGIN),
                Enter.keyValues(Keys.ENTER).into(INPUT_ORIGIN));

        actor.attemptsTo(Enter.theValue(info.get(1).toString()).into(INPUT_DESTINY),
                Enter.keyValues(Keys.ARROW_DOWN).into(INPUT_DESTINY),
                Enter.keyValues(Keys.ENTER).into(INPUT_DESTINY),
                Click.on(INPUT_DATE_FLIGHT),
                Click.on(SELECT_DATE),
                Click.on(BUTTON_CONSULT));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Set<String> tabs = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
        for (String e : tabs) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(e);
            if (e.equals("FlightStatus")) {
                break;
            }
        }

        flightNumber = Text.of(FlightStatusPage.TXT_FLIGHT_NUMBER).viewedBy(actor).asString();
        airportName = Text.of(FlightStatusPage.TXT_AIRPORT_NAME).viewedBy(actor).asString();
        hourArrival = Text.of(FlightStatusPage.TXT_HOUR_ARRIVAL).viewedBy(actor).asString();
        FileTxt.write(flightNumber);
        FileTxt.write(airportName);
        FileTxt.write(hourArrival);

    }

    public static EnterInformation enter(List<Object> info) {
        return Tasks.instrumented(EnterInformation.class, info);
    }
}
