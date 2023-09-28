package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelsPage {
    public static final Target TXT_DESTINATION = Target.the("destination place").locatedBy("//input[@name='ss']");
    public static final Target BTN_DATE_CHECKOUT = Target.the("button date checkout").locatedBy("//li[@data-index='4' and @data-index='4']");
    public static final Target BTN_FILTER_SEVERAL = Target.the("filter person").locatedBy("//label[@id ='xp__guests__toggle']");
    // public static final Target DATE = Target.the("fecha").locatedBy("//div[@class='b91c144835']");
    public static final Target BTN_ADULT = Target.the("Button quanty adults").locatedBy("(//button[@aria-hidden='true'])[2]");
    public static final Target BTN_CHILDREN = Target.the("Button quanty children").locatedBy("(//button[@aria-hidden='true'])[4]");
    public static final Target BTN_BEDROOM = Target.the("Button bedroom").locatedBy("(//button[@aria-hidden='true'])[6]");
    public static final Target BTN_SEARCH = Target.the(" button of search").locatedBy("//span[contains(text(),'Buscar')]");
}
