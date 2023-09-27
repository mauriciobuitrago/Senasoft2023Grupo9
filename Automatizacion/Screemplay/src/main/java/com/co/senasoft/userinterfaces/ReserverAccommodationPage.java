package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReserverAccommodationPage {
    public static final Target BTN_MODAL_HOME = Target.the("modal al ingresar a la pagina ").locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");

    public static final Target TXT_DESTINATION = Target.the("lugar destino").locatedBy("//input[@name='ss']");
    public static final Target BTN_ADULTO = Target.the("lugar destino").locatedBy("//button[@class='d47738b911 b7d08821c3']");
   // public static final Target DATE = Target.the("fecha").locatedBy("//div[@class='b91c144835']");
    // public static final Target BTN_PEOPLE = Target.the("personas").locatedBy("//input[@id=group_adults or value={}]");__
    public static final Target BTN_SEARCH = Target.the("boton de buscar").locatedBy("//span[contains(text(),'Buscar')]");
    }
