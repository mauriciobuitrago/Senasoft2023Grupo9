package com.co.senasoft.stepsdefinition;

import com.co.senasoft.tasks.RegisterTask;
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

public class RegisterStepDefinition {
    @Managed(driver = "chrome", options = "--maximized")
    WebDriver hisBrowser;


    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Mauro");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("he user enter the page web")
    public void heUserEnterThePageWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }
    @When("he user select register")
    public void heUserSelectRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.registertask());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("he user regiter in the page web")
    public void heUserRegiterInThePageWeb() {
    }


}
