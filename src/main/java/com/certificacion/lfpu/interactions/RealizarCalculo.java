package com.certificacion.lfpu.interactions;

import com.certificacion.lfpu.constantes.Constantes;
import com.certificacion.lfpu.models.DatosBusqueda;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RealizarCalculo implements Interaction {

    private Target precioPorDia;
    private Target precioTotal;

    public RealizarCalculo(Target precioPorDia, Target precioTotal) {
        this.precioPorDia = precioPorDia;
        this.precioTotal = precioTotal;
    }

    public RealizarCalculo delTotalAPagar(Target precioPorDia, Target precioTotal){
        return new RealizarCalculo(precioPorDia,precioTotal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> lstPrecioPorDia = precioPorDia.resolveAllFor(actor);
        List<WebElementFacade> lstPrecioTotal =  precioTotal.resolveAllFor(actor);

        String precioDia = lstPrecioPorDia.get(0).getText().trim();
        String precioTotal = lstPrecioTotal.get(0).getText().trim();

        System.out.println("datos: " + precioDia + " *** " + precioTotal + "total dias: " + Constantes.TOTAL_DIAS);

    }
}
