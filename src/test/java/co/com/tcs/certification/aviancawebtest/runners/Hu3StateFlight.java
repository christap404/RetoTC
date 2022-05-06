package co.com.tcs.certification.aviancawebtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/hu3_state_flight.feature",
        glue = "co.com.tcs.certification.aviancawebtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "")
public class Hu3StateFlight {
}
