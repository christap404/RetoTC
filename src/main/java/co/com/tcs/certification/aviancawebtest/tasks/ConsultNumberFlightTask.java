package co.com.tcs.certification.aviancawebtest.tasks;

import co.com.tcs.certification.aviancawebtest.interactions.ConsultWithNumberflight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsultNumberFlightTask implements Task {

    String date;

    public ConsultNumberFlightTask(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsultWithNumberflight.consult(date));
    }

    public static ConsultNumberFlightTask consult(String date) {
        return Tasks.instrumented(ConsultNumberFlightTask.class, date);
    }
}
