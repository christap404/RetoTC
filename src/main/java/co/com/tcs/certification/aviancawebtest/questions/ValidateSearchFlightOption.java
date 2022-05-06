package co.com.tcs.certification.aviancawebtest.questions;

import co.com.tcs.certification.aviancawebtest.interactions.SearchFlightOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateSearchFlightOption implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(SearchFlightOptions.validate());
        return true;
    }

    public static ValidateSearchFlightOption validate() {
        return new ValidateSearchFlightOption();
    }
}
