package com.co.senasoft.stepsdefinition;

import com.co.senasoft.tasks.ReserverAccommodationTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ReserverAccommodationStepDefinition {
    @Managed(driver = "chrome", options = "--maximized")
    WebDriver hisBrowser;


    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("vanessa");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("he user enter the web page")
    public void heUserEnterTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));


    }
    @When("the user consultation the reservation to carry out")
    public void theUserConsultationTheReservationToCarryOut() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        OnStage.theActorInTheSpotlight().attemptsTo(ReserverAccommodationTask.reserverAccommodationTask());


    }
    @Then("the user makes the reserve of the accommodation")
    public void theUserMakesTheReserveOfTheAccommodation() {

    }


}
