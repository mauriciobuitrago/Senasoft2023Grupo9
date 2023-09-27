package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.ReserverAccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class ReserverAccommodationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ReserverAccommodationPage.BTN_MODAL_HOME),
                Scroll.to(ReserverAccommodationPage.LBL_TYPE_ACCOMMODATION),
                Click.on(ReserverAccommodationPage.BTN_HOTELS),
                Click.on(ReserverAccommodationPage.BTN_LOGIN),
                Enter.theValue("Armenia").into(ReserverAccommodationPage.TXT_DESTINATION),
                Click.on(ReserverAccommodationPage.BTN_FILTER_SEVERAL),
                Click.on(ReserverAccommodationPage.LBL_ADULT),
                // Click.on(ReserverAccommodationPage.DATE),
                //  Enter.keyValues(Keys.ARROW_RIGHT).into(ReserverAccommodationPage.LBL_ADULT) ,
                Click.on(ReserverAccommodationPage.BTN_SEARCH),
                Scroll.to(ReserverAccommodationPage.LBL_CATEGORY_STAR),
                Click.on(ReserverAccommodationPage.BTN_STARS),
                Click.on(ReserverAccommodationPage.BTN_PRICE),
                Click.on(ReserverAccommodationPage.MODAL_CURRENCY),
                Click.on(ReserverAccommodationPage.BTN_PRICE),
                Click.on(ReserverAccommodationPage.BTN_PRICE_LOWEST)

        );

    }

    public static ReserverAccommodationTask reserverAccommodationTask() {
        return Tasks.instrumented(ReserverAccommodationTask.class);
    }
}
