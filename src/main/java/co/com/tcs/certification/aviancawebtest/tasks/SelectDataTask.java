package co.com.tcs.certification.aviancawebtest.tasks;


import co.com.tcs.certification.aviancawebtest.userinterfaces.SelectDestiny;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SelectDataTask implements Task {

    String region;
    String country;
    String airport;

    public SelectDataTask(String region, String country, String airport) {
        this.region = region;
        this.country = country;
        this.airport = airport;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(SelectDestiny.SELECT_TABLE_D.of(this.region)));
        actor.attemptsTo(Click.on(SelectDestiny.SELECT_TABLE_D.of(this.country)));
        actor.attemptsTo(Click.on(SelectDestiny.SELECT_AIRPORT.of(this.airport)));
    }

    public static SelectDataTask select(String region, String country, String airport) {
        return Tasks.instrumented(SelectDataTask.class, region, country, airport);
    }
}
