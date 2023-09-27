package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReserverAccommodationPage {
    public static final Target BTN_MODAL_HOME = Target.the("modal al ingresar a la pagina ").locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target LBL_TYPE_ACCOMMODATION = Target.the("type of accommodation ").locatedBy("//div[contains(text(),'Busca por tipo de alojamiento')]");
    public static final Target BTN_LOGIN = Target.the("button login ").locatedBy("//button[@class='bui-popover__close']");
    public static final Target BTN_HOTELS = Target.the("Hotels ").locatedBy("//div[contains(text(),'Hoteles')]");

    public static final Target TXT_DESTINATION = Target.the("lugar destino").locatedBy("//input[@name='ss']");
    public static final Target BTN_FILTER_SEVERAL = Target.the("filtro personas").locatedBy("//label[@id ='xp__guests__toggle']");
   // public static final Target DATE = Target.the("fecha").locatedBy("//div[@class='b91c144835']");
     public static final Target LBL_ADULT = Target.the("personas").locatedBy("//label[contains(text(),'Adultos')]");
     public static final Target BTN_PEOPLE = Target.the("personas").locatedBy("//input[@id='group_adults']");
    public static final Target BTN_SEARCH = Target.the("boton de buscar").locatedBy("//span[contains(text(),'Buscar')]");
    public static final Target BTN_STARS = Target.the("estrellas").locatedBy("//div[contains(text(),'3 estrellas')]");
    public static final Target LBL_CATEGORY_STAR = Target.the("estrellas").locatedBy("//h3[contains(text(),'Categoría del alojamiento')]");
    public static final Target BTN_PRICE = Target.the("price").locatedBy("//button[@aria-label='Precios en Peso colombiano']");
    public static final Target MODAL_CURRENCY = Target.the("modal currency").locatedBy("//button[@aria-label='Cerrar la selección de moneda']");

    public static final Target BTN_PRICE_LOWEST = Target.the("lowest price ").locatedBy("//span[contains(text(),'Categoría del alojamiento (más baja primero)')]");
    }
