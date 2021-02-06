package com.certificacion.lfpu.tasks;

import com.certificacion.lfpu.interactions.RealizarCalculo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static com.certificacion.lfpu.userinterfaces.InicioDxHotelPage.TXT_PRECIO_POR_DIA;
import static com.certificacion.lfpu.userinterfaces.InicioDxHotelPage.TXT_PRECIO_TOTAL;

public class ObtenerDatos implements Task {

    private RealizarCalculo realizarCalculo;

    public static ObtenerDatos paraCalculo() {
        return Tasks.instrumented(ObtenerDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstPrecioPorDia = TXT_PRECIO_POR_DIA.resolveAllFor(actor);
        List<WebElementFacade> lstPrecioTotal = TXT_PRECIO_TOTAL.resolveAllFor(actor);

        String precioDia = lstPrecioPorDia.get(0).getText().trim();
        String precioTotal = lstPrecioTotal.get(0).getText().trim();


        System.out.println("datos: " + precioDia + " ** " + precioTotal );
    }


}
