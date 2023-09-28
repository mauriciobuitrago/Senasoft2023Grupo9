package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BTN_MODAL_HOME = Target.the("modal al ingresar a la pagina ").locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target LBL_TYPE_ACCOMMODATION = Target.the("type of accommodation ").locatedBy("//div[contains(text(),'Busca por tipo de alojamiento')]");
    public static final Target BTN_LOGIN = Target.the("button login ").locatedBy("//button[@class='bui-popover__close']");
    public static final Target BTN_HOTELS = Target.the("Hotels ").locatedBy("//div[contains(text(),'Hoteles')]");
}
