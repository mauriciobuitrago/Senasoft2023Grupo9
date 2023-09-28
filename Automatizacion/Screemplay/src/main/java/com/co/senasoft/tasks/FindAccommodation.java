package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.FindAccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;

public class FindAccommodation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Scroll.to(FindAccommodationPage.LBL_CATEGORY_STAR),
                Click.on(FindAccommodationPage.BTN_STARS),
                Click.on(FindAccommodationPage.BTN_PRICE),
                Click.on(FindAccommodationPage.BTN_PRICE_LOWEST),
                Click.on(FindAccommodationPage.BTN_RESERVE)
        );

    }

    public static FindAccommodation reserverAccommodationTask() {
        return Tasks.instrumented(FindAccommodation.class);
    }
}
