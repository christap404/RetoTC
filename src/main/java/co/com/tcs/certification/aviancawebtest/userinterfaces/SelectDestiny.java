package co.com.tcs.certification.aviancawebtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectDestiny {

    private  SelectDestiny(){
        throw new IllegalStateException("Utility class");
    }

    public static final Target TXT_SELECT_DESTINY = Target.the("text select destiny").
            located(By.xpath("(//div[@class='col-xs-12 col-sm-offset-1 col-sm-10']/h3[contains(text(),'Selecciona')])"));

    public static final Target BUTTON_COUNTRY = Target.the("option explore destiny").
            located(By.xpath("(//button[@id='expl_pais967203881'])"));

    public static final Target SELECT_TABLE = Target.the("select table").
            located(By.xpath("(//div[@class='scroll']/div)[1]"));

    public static final Target SELECT_TABLE_D = Target.the("selec table").
            locatedBy("//div[@class='scroll']/div[contains(text(),'{0}')]");

    public static final Target SELECT_AIRPORT = Target.the("select airport").
            locatedBy("//div[@class='airport-item-explorer']/div[contains(text(),'{0}')]");

}
