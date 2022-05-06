package co.com.tcs.certification.aviancawebtest.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;


public class SelectData implements Interaction {

    List<Object> list;

    public SelectData(List<Object> list) {
        this.list = list;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo();
    }

    public static SelectData select(List<Object> info) {
        return Tasks.instrumented(SelectData.class, info);
    }
}
