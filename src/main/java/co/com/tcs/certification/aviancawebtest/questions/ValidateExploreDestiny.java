package co.com.tcs.certification.aviancawebtest.questions;

import co.com.tcs.certification.aviancawebtest.userinterfaces.SelectDestiny;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateExploreDestiny implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(SelectDestiny.TXT_SELECT_DESTINY).viewedBy(actor).resolve();
    }

    public static ValidateExploreDestiny validate() {
        return new ValidateExploreDestiny();
    }
}
