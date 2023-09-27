package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegisterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(RegisterPage.BTN_MODAL_HOME),
                Click.on(RegisterPage.BTN_REGISTER),
                Enter.theValue("prueasena2@gmail.com").into(RegisterPage.LBL_USERNAME),
                Click.on(RegisterPage.BTN_NEXT),
                Enter.theValue("Sena1234567").into((RegisterPage.LBL_NEWPASSWORD)),
                Enter.theValue("Sena1234567").into((RegisterPage.LBL_CONFIRMPASSWORD)),
                Click.on(RegisterPage.BTN_FINAL)
        );

    }
    public static RegisterTask registertask(){
        return Tasks.instrumented(RegisterTask.class);
    }
}
