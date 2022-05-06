package co.com.tcs.certification.aviancawebtest.interactions;

import co.com.tcs.certification.aviancawebtest.userinterfaces.SelectDestiny;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchFlightOptions implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectDestiny.SELECT_TABLE),
                Click.on(SelectDestiny.SELECT_TABLE),
                Click.on(SelectDestiny.SELECT_TABLE));
    }

    public static SearchFlightOptions validate() {
        return Tasks.instrumented(SearchFlightOptions.class);
    }
}
