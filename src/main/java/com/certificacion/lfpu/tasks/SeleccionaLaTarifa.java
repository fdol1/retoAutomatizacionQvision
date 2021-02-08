package com.certificacion.lfpu.tasks;

import com.certificacion.lfpu.interactions.SeleccionarTarifaMasFavorable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.certificacion.lfpu.userinterfaces.ListoDeBusquedaPage.CAMPO_TARIFA;
import static com.certificacion.lfpu.userinterfaces.ListoDeBusquedaPage.BOTON_RESERVAR;

public class SeleccionaLaTarifa implements Task {

    @Override
    public <T extends Actor> void performAs (T actor) {
    	actor.attemptsTo(SeleccionarTarifaMasFavorable.enPrecio(CAMPO_TARIFA, BOTON_RESERVAR));
    }

    public static SeleccionaLaTarifa masFavorable() {
    	return Tasks.instrumented(SeleccionaLaTarifa.class);
    } 
}