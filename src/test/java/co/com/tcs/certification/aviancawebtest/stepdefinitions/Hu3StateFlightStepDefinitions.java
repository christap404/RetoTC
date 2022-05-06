package co.com.tcs.certification.aviancawebtest.stepdefinitions;

import co.com.tcs.certification.aviancawebtest.interactions.TestReserveOption;
import co.com.tcs.certification.aviancawebtest.interactions.TestStateFlight;
import co.com.tcs.certification.aviancawebtest.questions.SmockTest;
import co.com.tcs.certification.aviancawebtest.questions.ValidateStateOfFlight;
import co.com.tcs.certification.aviancawebtest.tasks.*;
import co.com.tcs.certification.aviancawebtest.utils.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class Hu3StateFlightStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverWeb.hisBrowser())));
        OnStage.theActorCalled("user");
    }

    @Given("^the user are in home page$")
    public void theUserAreInHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.avianca.com/co/es/"));
    }

    @When("^enter to flight status option$")
    public void weEnterToFlightStatus() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickToFlightStatus.enter());
    }

    @When("^the flight status elements are reviewed$")
    public void theFlightStatusElementsAreReviewed() {
        OnStage.theActorInTheSpotlight().attemptsTo(TestStateFlight.test());
    }

    @When("^enter reserve flight option$")
    public void EnterReserveFlightOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickReserveFlight.click());
    }

    @When("^the reserve flight elements are reviewed$")
    public void theReserveFlightElementsAreReviewed() {
        OnStage.theActorInTheSpotlight().attemptsTo(TestReserveOption.test());
    }

    @Then("^the smock test passed$")
    public void theSmockTestPassed() {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SmockTest.pass()));
    }


    @When("^the user enter the origin, destination and date of flight$")
    public void theUserEnterTheOriginDestinationAndDateOfFlight(List<Object> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(SubmitInformationFlightTask.submit(info));
    }

    @When("^the user enter to flight status$")
    public void theUserEnterToFlightStatus() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickToFlightStatus.enter());
    }

    @Then("^the user will watch the state confirmed (.*)$")
    public void theUserWillWatchTheStateConfirmedCONFIRMADO(String state) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateStateOfFlight.confirmed(state)));
    }

    @And("^the user click on radio button flight number$")
    public void theUserClickOnRadioButtonFlightNumber() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickRadioButtonFlightNumber.click());
    }

    @When("^copy the flight number for file txt with the date (.*)$")
    public void copyTheFlightNumberForFileTxtWithTheDate(String date) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultNumberFlightTask.consult(date));
    }
}
