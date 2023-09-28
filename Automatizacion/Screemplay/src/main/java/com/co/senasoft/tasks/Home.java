package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;

public class Home implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.BTN_MODAL_HOME),
                Scroll.to(HomePage.LBL_TYPE_ACCOMMODATION),
                Click.on(HomePage.BTN_HOTELS),
                Click.on(HomePage.BTN_LOGIN)
        );
    }
    public static Home home(){
        return Tasks.instrumented(Home.class);
    }
}
