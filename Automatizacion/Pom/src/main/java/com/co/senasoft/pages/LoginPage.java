package com.co.senasoft.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



@DefaultUrl("https://www.booking.com/")
public class LoginPage extends PageObject {
    By BTN_LOGIN = By.xpath("//span[contains(text(),'Inicia sesión')]");
    By TXT_EMAIL = By.xpath("//input[@id='username']");
    By TXT_PASSWORD = By.xpath("////input[@id='password']']");

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }
}
