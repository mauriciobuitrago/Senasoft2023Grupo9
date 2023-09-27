package com.co.senasoft.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



@DefaultUrl("https://www.booking.com/")
public class LoginPage extends PageObject {

    By BTN_CLOSE = By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    // By BTN_LOGIN = By.xpath("//a[@class='a83ed08757 c21c56c305 bf0537ecb5 ab98298258 deab83296e af7297d90d js-header-login-link']");
    By BTN_LOGIN = By.xpath("//a[@aria-label='Iniciar sesión']");

    By BTN_NEXT = By.xpath("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    By TXT_EMAIL = By.xpath("//input[@id='username']");
    By TXT_PASSWORD = By.xpath("//input[@id='password']");

    By BTN_FINAL = By.xpath("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    public By getBTN_FINAL() {
        return BTN_FINAL;
    }

    public void setBTN_FINAL(By BTN_FINAL) {
        this.BTN_FINAL = BTN_FINAL;
    }

    public By getBTN_NEXT() {
        return BTN_NEXT;
    }

    public void setBTN_NEXT(By BTN_NEXT) {
        this.BTN_NEXT = BTN_NEXT;
    }

    public By getBTN_CLOSE() {
        return BTN_CLOSE;
    }

    public void setBTN_CLOSE(By BTN_CLOSE) { this.BTN_CLOSE = BTN_CLOSE; }

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
