package co.com.tcs.certification.aviancawebtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightStatusPage {

    private  FlightStatusPage(){
        throw new IllegalStateException("Utility class");
    }

    public static final Target TXT_STATUS = Target.the("text status").
            located(By.xpath("(//*[contains(text(),'CONFIRMADO')])[1]"));

    public static final Target TXT_FLIGHT_NUMBER = Target.the("text flight number").
            located(By.xpath("(//div[@id='cardFlightNumber']/div[@class='card-fligth-number-data']/label)[1]"));

    public static final Target TXT_AIRPORT_NAME = Target.the("text airport name").
            located(By.xpath("(//label[@class='fligth-label-airport'])[2]"));

    public static final Target TXT_HOUR_ARRIVAL = Target.the("text hour arrival").
            located(By.xpath("(//label[@class='fligth-confirmed'])[2]"));
}
