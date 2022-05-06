package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.interactions.EnterExploreDestiny;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterExploreDestinyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterExploreDestiny.enter());
    }

    public static EnterExploreDestinyTask enter() {
        return Tasks.instrumented(EnterExploreDestinyTask.class);
    }
}
