package com.certificacion.lfpu.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioDxHotelPage {

    public static final Target LISTA_LOCACION =
            Target.the("lista campo location")
                    .locatedBy("//span[text()='Location']//..//..//..//div[contains(@class, 'dx-selectbox dx-textbox')]");

    public static final Target CAMPO_LOCACION=
            Target.the("campo location")
                    .locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'{0}')]");

    public static final Target CAMPO_FECHA_INICIO =
            Target.the("campo checkin")
                    .locatedBy("//input[contains(@id, 'checkIn')]");

    public static final Target CAMPO_FECHA_FIN =
            Target.the("campo checkout")
                    .locatedBy("//input[contains(@id, 'checkOut')]");

    public static final Target LISTA_NUMERO_HABITACIONES =
            Target.the("lista campo rooms")
                    .locatedBy("//input[contains(@id, 'rooms')]");

    public static final Target CAMPO_NUMERO_HABITACIONES =
            Target.the("campo rooms")
                    .locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'{0}')]");

    public static final Target LISTA_NUMERO_ADULTOS =
            Target.the("lista campo adults")
                    .locatedBy("//input[contains(@id, 'adults')]");

    public static final Target CAMPO_NUMERO_ADULTOS =
            Target.the("campo adults")
                    .locatedBy("//div[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']/div/div/div/div/div/div/div[contains(@class,'dx-scrollview-content')]/div/div[contains(text(),'{0}')]");

    public static final Target LISTA_NUMERO_INFANTES =
            Target.the("lista campo children")
                    .locatedBy("//input[contains(@id, 'children')]");

    public static final Target CAMPO_NUMERO_INFANTES =
            Target.the("campo children")
                    .locatedBy("//div[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']/div/div/div/div/div/div/div[contains(@class,'dx-scrollview-content')]/div/div[contains(text(),'{0}')]");

    public static final Target BOTON_BUSCAR =
            Target.the("boton search")
                    .locatedBy("//*/span[contains(text(),'SEARCH')]");
}