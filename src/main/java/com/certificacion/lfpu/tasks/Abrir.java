package com.certificacion.lfpu.tasks;

import com.certificacion.lfpu.userinterfaces.InicioDxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

    private InicioDxPage inicioDxPage;

    public static Abrir elPortalDxHotels(){
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioDxPage));
    }
}