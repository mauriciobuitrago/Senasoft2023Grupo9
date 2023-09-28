package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target BTN_MODAL_HOME = Target.the("modal when we are in the page").locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target BTN_REGISTER = Target.the("button to register").locatedBy("//a[@aria-label='Crear una cuenta']");
    public static final Target LBL_USERNAME = Target.the("email's input").locatedBy("//input[@id='username']");
    public static final Target BTN_NEXT = Target.the("button to confirm email").locatedBy("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    public static final Target LBL_NEWPASSWORD = Target.the("password's input").locatedBy("//input[@name='new_password']");
    public static final Target LBL_CONFIRMPASSWORD = Target.the("password's input").locatedBy("//input[@name='confirmed_password']");
    public static final Target BTN_FINAL = Target.the("button to finish all").locatedBy("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    public static final Target LBL_CONFRIM = Target.the("confirm").locatedBy("//h1[@id='4be87327-57c4-4cff-98aa-4b3bd947b1b1']");
    public static final Target LBL_ACEPT = Target.the("confirm").locatedBy("//p[@id='IiHUYnEPOFKlNyA']");

}
