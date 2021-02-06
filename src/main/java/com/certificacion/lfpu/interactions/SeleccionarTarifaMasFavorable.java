
package com.certificacion.lfpu.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeleccionarTarifaMasFavorable implements Interaction {

    private Target lstTarifa;
    private Target lstNombrehotel;

    public SeleccionarTarifaMasFavorable(Target lstTarifa, Target lstNombreHotel) {
        this.lstTarifa = lstTarifa;
        this.lstNombrehotel = lstNombreHotel;
    }

    public static SeleccionarTarifaMasFavorable enPrecio(Target lstTarifa, Target lstNombreHotel) {
        return new SeleccionarTarifaMasFavorable(lstTarifa,lstNombreHotel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> precios = new ArrayList<>();
        List<WebElementFacade> lstTarifa = this.lstTarifa.resolveAllFor(actor);
        List<WebElementFacade> lstNombreHotel =  lstNombrehotel.resolveAllFor(actor);

        for (int i = 0; i < lstTarifa.size(); i++) {
            String tarifa = lstTarifa.get(i).getText().trim();
            String[] datosValor= tarifa.split("\\$");
            precios.add(datosValor[1]);
        }

        int precioMenor = Integer.parseInt(precios.get(0));

        for (int i = 1; i < precios.size(); i++) {
            if(precioMenor > Integer.parseInt(precios.get(i)))
            {
                precioMenor=Integer.parseInt(precios.get(i));
                lstNombreHotel.get(i).click();
            }
        }
    }
}