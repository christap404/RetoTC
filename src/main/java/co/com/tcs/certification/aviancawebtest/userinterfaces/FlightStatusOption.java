package co.com.tcs.certification.aviancawebtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightStatusOption {

    private  FlightStatusOption(){
        throw new IllegalStateException("Utility class");
    }

    public static final Target RADIO_BUTTON_FLIGHT_NUM = Target.the("radio button flight number").
            located(By.xpath("//div[@class='radiobtn vuelo ']"));

    public static final Target INPUT_ORIGIN = Target.the("input origin").
            located(By.id("origenEstadoVueloX"));

    public static final Target INPUT_DESTINY = Target.the("input destiny").
            located(By.id("destinoEstadoVueloX"));

    public static final Target BUTTON_CONSULT = Target.the("button consult").
            located(By.xpath("(//input[@type='submit'])[5]"));

    public static final Target INPUT_NUM_FLIGHT = Target.the("input number of flight").
            located(By.id("numeroVuelo"));

    public static final Target INPUT_DATE_FLIGHT = Target.the("input date of flight").
            located(By.id("fecha_ruta"));

    public static final Target BUTTON_CONSULT_W_NUM = Target.the("button consult").
            located(By.xpath("(//input[@type='submit'])[6]"));

    public static final Target SELECT_DATE = Target.the("select date").
            located(By.xpath("//ul[@id='fechas-ruta']/li[contains(text(),'14')]"));

    public static final Target INPUT_DATE_FLIGHT_NUM = Target.the("input date flight").
            located(By.xpath("(//li[contains(text(),'13')])[2]"));

    public static final Target INPUT_DATE_LIST = Target.the("input date list").
            located(By.id("fecha_numeroVuelo"));
}
