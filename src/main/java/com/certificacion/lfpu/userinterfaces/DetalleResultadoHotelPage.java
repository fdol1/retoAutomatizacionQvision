package com.certificacion.lfpu.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleResultadoHotelPage {

    public static final Target TXT_PRECIO_POR_DIA =
            Target.the("precio por dia")
                    .locatedBy("//*/div[contains(@class,'total-pay')]/h4[contains(@class,'price')]");

    public static final Target TXT_PRECIO_TOTAL =
            Target.the("precio total")
                    .locatedBy("//*/div[contains(@class,'sum')]/h4[contains(@data-bind,'text')]");
}