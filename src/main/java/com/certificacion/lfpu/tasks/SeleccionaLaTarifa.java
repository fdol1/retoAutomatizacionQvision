package com.certificacion.lfpu.tasks;

import com.certificacion.lfpu.interactions.SeleccionarTarifaMasFavorable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.certificacion.lfpu.userinterfaces.InicioDxHotelPage.CAMPO_TARIFA;
import static com.certificacion.lfpu.userinterfaces.InicioDxHotelPage.SELECCIONAR_HOTEL;

public class SeleccionaLaTarifa implements Task {
	
	private SeleccionarTarifaMasFavorable tarifaMenor;
    
    @Override
    public <T extends Actor> void performAs (T actor) {
    	actor.attemptsTo(tarifaMenor.enPrecio(CAMPO_TARIFA, SELECCIONAR_HOTEL));
    }

    public static SeleccionaLaTarifa masFavorable() {
    	return Tasks.instrumented(SeleccionaLaTarifa.class);
    } 
}
