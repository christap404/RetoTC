package co.com.tcs.certification.aviancawebtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    private  HomePage(){
        throw new IllegalStateException("Utility class");
    }

    public static final Target STATE_FLIGHT_ONPION = Target.the("options state flight").
            located(By.id("estadovuelo"));

    public static final Target RESERVE_FLIGHT_OPTION = Target.the("serrve flight option").
            located(By.id("reservatuvuelo"));
}
