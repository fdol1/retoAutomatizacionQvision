package com.certificacion.lfpu.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarLugarDestino  implements Task {

    private final String lugarDestino;

    public IngresarLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public static Performable SeleccionaElDestino (String lugarDestino){
        return instrumented(IngresarLugarDestino.class, lugarDestino);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
