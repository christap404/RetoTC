package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.interactions.EnterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class SubmitInformationFlightTask implements Task {

    private List<Object> info;

    public SubmitInformationFlightTask(List<Object> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterInformation.enter(info));
    }
    public static SubmitInformationFlightTask submit(List<Object> list){
        return Tasks.instrumented(SubmitInformationFlightTask.class,list);
    }
}
