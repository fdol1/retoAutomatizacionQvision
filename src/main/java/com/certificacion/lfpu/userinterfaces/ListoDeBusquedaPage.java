package com.certificacion.lfpu.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ListoDeBusquedaPage {

    public static final Target CAMPO_TARIFA=
            Target.the("campo tarifa")
                    .locatedBy("//*/div[contains(@class,'night-button')]/div/p");

    public static final Target BOTON_RESERVAR =
            Target.the("boton reservar")
                    .locatedBy("//*/div[contains(@class,'current-hotels')]/div/div/div[contains(@class,'night-button')]/div[contains(@class,'book-it gray-button dx-button dx-button-normal dx-button-mode-contained dx-widget dx-button-has-text')]");

    public static final Target LBL_TOTAL_DIAS =
            Target.the("dias de reserva")
                    .locatedBy("//*/div[contains(@class,'site')]/p[contains(@data-bind,'text: resultAdults')]");

    public static final Target LBL_CANTIDAD_HOTELES =
            Target.the("dias de reserva")
                    .locatedBy("//*/div[contains(@class,'search-info-hotels')]/div/div/div[contains(@class, 'result-serch')]/p[contains(@class, 'count')]");

    public static final Target BTN_SIGUIENTE =
            Target.the("Pasar a siguiente pagina")
                    .locatedBy("//*/div[contains(@class,'switch switch-right')]");
}