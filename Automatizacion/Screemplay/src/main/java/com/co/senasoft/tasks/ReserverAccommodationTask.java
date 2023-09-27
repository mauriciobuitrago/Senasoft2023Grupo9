package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.ReserverAccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoElement;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.support.ui.Select;

public class ReserverAccommodationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                        Click.on(ReserverAccommodationPage.BTN_MODAL_HOME),
                Enter.theValue("Armenia").into(ReserverAccommodationPage.TXT_DESTINATION),
                Click.on(ReserverAccommodationPage.BTN_ADULTO),


               // Click.on(ReserverAccommodationPage.DATE),
              //  Enter.theValue("3").into(ReserverAccommodationPage.BTN_ADULTO),
                Click.on(ReserverAccommodationPage.BTN_SEARCH)
        );

    }

    public static ReserverAccommodationTask reserverAccommodationTask(){
        return Tasks.instrumented(ReserverAccommodationTask.class);
    }
}
