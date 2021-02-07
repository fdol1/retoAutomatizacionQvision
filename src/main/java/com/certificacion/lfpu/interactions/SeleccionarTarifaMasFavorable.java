
package com.certificacion.lfpu.interactions;

import com.certificacion.lfpu.utils.Constantes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

import static com.certificacion.lfpu.userinterfaces.ListoDeBusquedaPage.LBL_TOTAL_DIAS;

public class SeleccionarTarifaMasFavorable implements Interaction {

    private Target lstTarifa;
    private Target lstBotonReserva;

    public SeleccionarTarifaMasFavorable(Target lstTarifa, Target lstBotonReserva) {
        this.lstTarifa = lstTarifa;
        this.lstBotonReserva = lstBotonReserva;
    }

    public static SeleccionarTarifaMasFavorable enPrecio(Target lstTarifa, Target lstBotonReserva) {
        return new SeleccionarTarifaMasFavorable(lstTarifa,lstBotonReserva);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<String> precios = new ArrayList<>();
        List<WebElementFacade> lstTarifa = this.lstTarifa.resolveAllFor(actor);
        List<WebElementFacade> lblBotonReserva =  lstBotonReserva.resolveAllFor(actor);
        int precioMenor;

        Constantes.TOTAL_DIAS = Integer.parseInt(
                String.valueOf(
                        Text.of(LBL_TOTAL_DIAS).viewedBy(actor).asString().charAt(0)
                ));

        for (WebElementFacade webElementFacade : lstTarifa) {
            String tarifa = webElementFacade.getText().trim();
            String[] datosValor = tarifa.split("\\$");
            precios.add(datosValor[1]);
        }

        precioMenor = Integer.parseInt(precios.get(0));

        for (int i = 1; i < precios.size(); i++) {
            if(precioMenor > Integer.parseInt(precios.get(i))) {
                precioMenor=Integer.parseInt(precios.get(i));
                lblBotonReserva.get(i).click();
            }
        }
    }
}