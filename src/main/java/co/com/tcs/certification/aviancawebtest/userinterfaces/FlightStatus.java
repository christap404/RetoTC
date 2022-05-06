package co.com.tcs.certification.aviancawebtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightStatus {

    private  FlightStatus(){
     throw new IllegalStateException("Utility class");
    }

    public static final Target RADIO_BUTTON_RUTE = Target.the("radio button rute").
            located(By.id("RadioRuta"));

    public static final Target RADIO_BUTTON_FLIGHT_NUM = Target.the("radio button flight number").
            located(By.xpath("//div[@class='radiobtn vuelo ']"));

    public static final Target INPUT_ORIGIN = Target.the("input origin").
            located(By.id("origenEstadoVueloX"));

    public static final Target INPUT_DESTINY = Target.the("input destiny").
            located(By.id("destinoEstadoVueloX"));

    public static final Target BUTTON_CONSULT = Target.the("button consult").
            located(By.className("mainContent_Ir btn boton-principal boton-submit btn primary  rojo"));

    public static final Target INPUT_NUM_FLIGHT = Target.the("input number of flight").
            located(By.id("numeroVuelo"));

    public static final Target INPUT_DATE_FLIGHT = Target.the("input date of flight").
            located(By.id("fecha_numeroVuelo"));

    public static final Target BUTTON_CONSULT_W_NUM = Target.the("button consult").
            located(By.className("mainContent_Ir btn boton-principal boton-submit btn primary rojo"));

}
