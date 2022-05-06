package co.com.tcs.certification.aviancawebtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReserveFlight {

    private  ReserveFlight(){
        throw new IllegalStateException("Utility class");
    }

    public static final Target DESTINI_INPUT = Target.the("input destint").
            located(By.xpath("(//div[@class='row-input right'])[8]"));

    public static final Target TOWARD = Target.the("toward").
            located(By.xpath("//div[@class='ciudades destino']/div[contains(text(),'Dortmund')]"));

}
