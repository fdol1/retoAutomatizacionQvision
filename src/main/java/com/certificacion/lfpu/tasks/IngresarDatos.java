package com.certificacion.lfpu.tasks;

import com.certificacion.lfpu.models.DatosBusqueda;
import com.certificacion.lfpu.utils.AccionesObjetos;
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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarDatos implements Task {

    private final List <DatosBusqueda> listaDeDatos;

    public IngresarDatos (List<DatosBusqueda> listaDeDatos){
        this.listaDeDatos = listaDeDatos;
    }

    public static IngresarDatos paraLaBusqueda(List<DatosBusqueda> locationData) {
        return Tasks.instrumented(IngresarDatos.class, locationData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember("Data", listaDeDatos);

        actor.attemptsTo(
                WaitUntil.the(LISTA_LOCACION,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LISTA_LOCACION),
                WaitUntil.the(CAMPO_LOCACION.of(listaDeDatos.get(0).getLugarDestino().trim()),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CAMPO_LOCACION.of(listaDeDatos.get(0).getLugarDestino().trim())),

                Click.on(CAMPO_FECHA_INICIO),
                Enter.theValue(listaDeDatos.get(0).getDiaLlegada()).into(CAMPO_FECHA_INICIO),

                Click.on(CAMPO_FECHA_FIN),
                Hit.the(Keys.CLEAR).into(CAMPO_FECHA_FIN),
                Enter.theValue(listaDeDatos.get(0).getDiaSalida()).into(CAMPO_FECHA_FIN),

                Click.on(LISTA_NUMERO_HABITACIONES),
                WaitUntil.the(CAMPO_NUMERO_HABITACIONES.of(listaDeDatos.get(0).getNumeroDeHabitaciones()),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CAMPO_NUMERO_HABITACIONES.of(listaDeDatos.get(0).getNumeroDeHabitaciones())),


                Click.on(LISTA_NUMERO_ADULTOS)
        );

        AccionesObjetos.falsaEspera(300);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_ADULTOS.of(listaDeDatos.get(0).getNumeroDeAdultos().trim()),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CAMPO_NUMERO_ADULTOS.of(listaDeDatos.get(0).getNumeroDeAdultos().trim())),

                Click.on(LISTA_NUMERO_INFANTES)
        );

        AccionesObjetos.falsaEspera(300);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_INFANTES.of(listaDeDatos.get(0).getNumeroDeInfantes().trim()),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CAMPO_NUMERO_INFANTES.of(listaDeDatos.get(0).getNumeroDeInfantes().trim())),

                Click.on(BOTON_BUSCAR)
        );
    }
}