package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FindAccommodationPage {

    public static final Target BTN_STARS = Target.the("estrellas").locatedBy("//div[contains(text(),'3 estrellas')]");
    public static final Target LBL_CATEGORY_STAR = Target.the("estrellas").locatedBy("//h3[contains(text(),'Categoría del alojamiento')]");

    public static final Target BTN_PRICE = Target.the("price").locatedBy("//button[@data-testid='sorters-dropdown-trigger']");

    public static final Target BTN_PRICE_LOWEST = Target.the("lowest price ").locatedBy("//span[contains(text(),'Categoría del alojamiento (más baja primero)')]");
    public static final Target LBL_ACCOMMODATION = Target.the(" button of reserve").locatedBy("(//*[contains(text(),'alojamientos encontrados')])[1]");

}
