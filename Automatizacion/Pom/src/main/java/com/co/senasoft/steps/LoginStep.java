package com.co.senasoft.steps;

import com.co.senasoft.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    @Step
    public void enterCredentials(){

        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN())
                .click();

        loginPage.getDriver().findElement(loginPage.getTXT_EMAIL())
                .sendKeys(
                        "prueassena@gmail.com"
                );
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys(
                        "Sena1234567"
                );


    }
}
