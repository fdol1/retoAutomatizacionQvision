package com.certificacion.lfpu.navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarEn {

    public static Performable DxHotel() {
        return Task.where("{0} Se abre pagina inicial del portal de viajes",
                Open.browserOn().the(InicioDxPage.class)
        );
    }
}
