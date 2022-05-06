package co.com.tcs.certification.aviancawebtest.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateToward implements Question {

    String airport;

    public ValidateToward(String airport) {
        this.airport = airport;
    }

    @Override
    public Object answeredBy(Actor actor) {

        return true;
    }

    public static ValidateToward validate(String airport){
        return new ValidateToward(airport);
    }

}
