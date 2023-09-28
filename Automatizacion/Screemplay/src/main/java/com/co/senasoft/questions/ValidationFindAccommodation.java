package com.co.senasoft.questions;

import com.co.senasoft.userinterfaces.FindAccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationFindAccommodation implements Question {



    public static ValidationFindAccommodation validationFindAccommodation(){
        return new ValidationFindAccommodation();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FindAccommodationPage.LBL_ACCOMMODATION).viewedBy(actor).asString();
    }
}
