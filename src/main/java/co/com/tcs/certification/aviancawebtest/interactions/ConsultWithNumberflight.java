package co.com.tcs.certification.aviancawebtest.interactions;

import co.com.tcs.certification.aviancawebtest.integrations.FileTxt;
import co.com.tcs.certification.aviancawebtest.userinterfaces.FlightStatusOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Set;

public class ConsultWithNumberflight implements Interaction {

    String date;

    public ConsultWithNumberflight(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        StringBuilder numberFlight = new StringBuilder();
        String numberFlight2 = FileTxt.read();
        char[] numberFlightChar = numberFlight2.toCharArray();gi

        for (int i = 0; i < numberFlightChar.length; i++) {
            if (Character.isDigit(numberFlightChar[i])) {
                numberFlight.append(numberFlightChar[i]);
            }
        }

        actor.attemptsTo(Enter.theValue(numberFlight).into(FlightStatusOption.INPUT_NUM_FLIGHT));
        actor.attemptsTo(Click.on(FlightStatusOption.INPUT_DATE_LIST));
        actor.attemptsTo(Click.on(FlightStatusOption.BUTTON_CONSULT_W_NUM));



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

    }

    public static ConsultWithNumberflight consult(String date) {
        return Tasks.instrumented(ConsultWithNumberflight.class, date);
    }
}
