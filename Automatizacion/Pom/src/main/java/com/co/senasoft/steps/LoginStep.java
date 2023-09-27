package com.co.senasoft.steps;

import com.co.senasoft.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser() {
        loginPage.open();
    }

    @Step
    public void clickClose() {
        loginPage.getDriver().findElement(loginPage.getBTN_CLOSE())
                .click();
    }

    @Step
    public void clickLogin() {
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }

    @Step
    public void enterEmail() {

        loginPage.getDriver().findElement(loginPage.getTXT_EMAIL())
                .sendKeys(
                        "prueassena@gmail.com"
                );
    }

    @Step
    public  void next(){
        loginPage.getDriver().findElement(loginPage.getBTN_NEXT()).click();
    }

    @Step
    public void enterPassword() {
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                        .sendKeys(
                        "Sena1234567"
                );
    }

    @Step
    public void aceptPasword(){
        loginPage.getDriver().findElement(loginPage.getBTN_FINAL()).click();
    }

    @Step
    public void validateLogin(){
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getVALIDATE_LOGIN())
                .isDisplayed(),Matchers.is(true));
    }
}
