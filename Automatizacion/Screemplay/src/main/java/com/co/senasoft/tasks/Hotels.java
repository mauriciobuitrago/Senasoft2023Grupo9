package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HotelsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class Hotels implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue("Armenia").into(HotelsPage.TXT_DESTINATION),
                Click.on(HotelsPage.BTN_DATE_CHECKOUT),
                Click.on(HotelsPage.BTN_FILTER_SEVERAL),
                Click.on(HotelsPage.BTN_ADULT),
                DoubleClick.on(HotelsPage.BTN_CHILDREN),
                Click.on(HotelsPage.BTN_BEDROOM),
                Click.on(HotelsPage.BTN_SEARCH)
        );
    }

    public static Hotels hotels() {
        return Tasks.instrumented(Hotels.class);
    }
}
