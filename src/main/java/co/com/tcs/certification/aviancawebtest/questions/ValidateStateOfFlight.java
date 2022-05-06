package co.com.tcs.certification.aviancawebtest.questions;

import co.com.tcs.certification.aviancawebtest.userinterfaces.FlightStatusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateStateOfFlight implements Question {

    String status;

    public ValidateStateOfFlight(String status) {
        this.status = status;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FlightStatusPage.TXT_STATUS).viewedBy(actor).asString().equals(status);
    }

    public static ValidateStateOfFlight confirmed(String status) {
        return new ValidateStateOfFlight(status);
    }
}
