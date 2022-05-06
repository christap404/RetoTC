package co.com.tcs.certification.aviancawebtest.stepdefinitions;

import co.com.tcs.certification.aviancawebtest.questions.ValidateExploreDestiny;
import co.com.tcs.certification.aviancawebtest.questions.ValidateSearchFlightOption;
import co.com.tcs.certification.aviancawebtest.questions.ValidateToward;
import co.com.tcs.certification.aviancawebtest.tasks.EnterExploreDestinyTask;
import co.com.tcs.certification.aviancawebtest.tasks.ClickReserveFlight;
import co.com.tcs.certification.aviancawebtest.tasks.SelectDataTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class Hu4ExploreDestinationsStepDefinitios {

    @Given("^the user are in the home page$")
    public void theUserAreInTheHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.avianca.com/co/es/"));
    }


    @When("^the user are in the option reserve destiny$")
    public void theUserAreInTheOptionReserveDestiny() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickReserveFlight.click());
    }

    @When("^the user use the filter toward$")
    public void theUserUseTheFilter() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterExploreDestinyTask.enter());
    }

    @Then("^the user will watch the option explore destiny enabled$")
    public void theUserWillWatchTheOptionExploreDestinyEnabled() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateExploreDestiny.validate()));
    }

    @When("^the user enter into explorer destiny option$")
    public void theUserEnterIntoExplorerDestinyOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterExploreDestinyTask.enter());
    }



    @Then("^the user can use the options fot search$")
    public void theUserCanUseTheOptionsFotSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSearchFlightOption.validate()));

    }

    @And("^the user can select the data (.*) (.*) (.*)$")
    public void theUserCanSelectTheData(String region, String country, String airport) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectDataTask.select(region, country, airport));
    }

    @Then("^will watch in the field toward the name of airport (.*)$")
    public void willWatchInTheFieldTowardTheNameOfAirportDortmundDTM(String airport) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateToward.validate(airport)));
    }
}
