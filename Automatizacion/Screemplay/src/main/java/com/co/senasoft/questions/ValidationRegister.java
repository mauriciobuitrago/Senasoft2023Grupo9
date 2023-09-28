package com.co.senasoft.questions;

import com.co.senasoft.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationRegister implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RegisterPage.LBL_CONFRIM).viewedBy(actor).asString();
    }

    public static ValidationRegister compare(){
        return new ValidationRegister();
    }
}
