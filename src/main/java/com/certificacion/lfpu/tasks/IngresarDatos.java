package com.certificacion.lfpu.tasks;

import com.certificacion.lfpu.models.DatosBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.certificacion.lfpu.userinterfaces.InicioDxHotelPage.*;

public class IngresarDatos implements Task {

    private List <DatosBusqueda> listaDeDatos;

    public IngresarDatos (List<DatosBusqueda> listaDeDatos){
        super();
        this.listaDeDatos = listaDeDatos;
    }

    public static IngresarDatos paraLaBusqueda(List<DatosBusqueda> locationData) {
        return Tasks.instrumented(IngresarDatos.class, locationData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember("Data", listaDeDatos);

        actor.attemptsTo(
                Click.on(LISTA_LOCACION.of(listaDeDatos.get(0).getLugarDestino())),
                WaitUntil.the(CAMPO_LOCACION.of(listaDeDatos.get(0).getLugarDestino()),
                        WebElementStateMatchers.isVisible()),
                Click.on(CAMPO_LOCACION.of(listaDeDatos.get(0).getLugarDestino())),
                Click.on(CAMPO_FECHA_INICIO),
                Enter.theValue(listaDeDatos.get(0).getDiaLlegada()).into(CAMPO_FECHA_INICIO),
                Click.on(CAMPO_FECHA_FIN),
                Hit.the(Keys.CLEAR).into(CAMPO_FECHA_FIN),
                Enter.theValue(listaDeDatos.get(0).getDiaSalida()).into(CAMPO_FECHA_FIN),
                Click.on(LISTA_NUMERO_HABITACIONES),
                WaitUntil.the(CAMPO_NUMERO_HABITACIONES.of(listaDeDatos.get(0).getNumeroDeHabitaciones()),
                        WebElementStateMatchers.isVisible()),
                Click.on(CAMPO_NUMERO_HABITACIONES.of(listaDeDatos.get(0).getNumeroDeHabitaciones())),
                Click.on(LISTA_NUMERO_ADULTOS),
                Click.on(CAMPO_NUMERO_ADULTOS.of(listaDeDatos.get(0).getNumeroDeAdultos())),
                Click.on(LISTA_NUMERO_INFANTES),
                Click.on(CAMPO_NUMERO_INFANTES.of(listaDeDatos.get(0).getNumeroDeInfantes())),
                Click.on(BOTON_BUSCAR)
        );
    }
}