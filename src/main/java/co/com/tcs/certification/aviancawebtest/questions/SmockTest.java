package co.com.tcs.certification.aviancawebtest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SmockTest implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return true;
    }

    public static SmockTest pass() {
        return new SmockTest();
    }
}
