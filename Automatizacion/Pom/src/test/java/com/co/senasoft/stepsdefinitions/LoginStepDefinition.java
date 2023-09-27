package com.co.senasoft.stepsdefinitions;

import com.co.senasoft.steps.LoginStep;
import groovy.cli.Option;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;



public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;


    @Given("he user is on the web page")
    public void heUserIsOnTheWebPage() {
        loginStep.openBrowser();
    }
    @When("he user enter the data for the login")
    public void heUserEnterTheDataForTheLogin() {
        loginStep.clickClose();
        loginStep.clickLogin();
        loginStep.enterEmail();
        loginStep.next();
        loginStep.enterPassword();


    }
    @Then("he could see login")
    public void heCouldSeeLogin() {
        loginStep.aceptPasword();
        loginStep.validateLogin();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
