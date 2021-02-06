package com.certificacion.lfpu.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioDxHotelPage {

    public static By CBX_LOCACION = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static By TXT_FECHA_INICIO = By.xpath("//input[@id='dx_dx-41c17ce4-6436-c1c2-b562-42bfca3f6f28_checkIn']");
    public static By TXT_FECHA_FIN = By.xpath("//input[@id='dx_dx-55b027cf-a78d-ed6b-0e30-8b3eac8c7e67_checkOut']");
    public static By CBC_HABITACIONES = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static By CBC_NUMERO_ADULTOS = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static By CBC_NUMERO_INFANTES = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
    public static By BTN_BUSCAR = By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]");

    public static final Target LISTA_LOCACION =
            Target.the("lista campo location")
                    .locatedBy("//span[text()='Location']//..//..//..//div[contains(@class, 'dx-selectbox dx-textbox')]");

    public static final Target CAMPO_LOCACION= Target.the("campo location").
            locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'{0}')]");

    public static final Target CAMPO_FECHA_INICIO = Target.the("campo checkin").
            locatedBy("//input[contains(@id, 'checkIn')]");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo checkout").
            locatedBy("//input[contains(@id, 'checkOut')]");

    public static final Target LISTA_NUMERO_HABITACIONES = Target.the("lista campo rooms").
            locatedBy("//input[contains(@id, 'rooms')]");

    public static final Target CAMPO_NUMERO_HABITACIONES = Target.the("campo rooms").
            locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'{0}')]");

    public static final Target LISTA_NUMERO_ADULTOS = Target.the("lista campo adults").
            locatedBy("//input[contains(@id, 'adults')]");

    public static final Target CAMPO_NUMERO_ADULTOS = Target.the("campo adults").
            locatedBy("//div[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']/div/div/div/div/div/div/div[contains(@class,'dx-scrollview-content')]/div/div[contains(text(),'{0}')]");

    public static final Target LISTA_NUMERO_INFANTES = Target.the("lista campo children").
            locatedBy("//input[contains(@id, 'children')]");

    public static final Target CAMPO_NUMERO_INFANTES = Target.the("campo children").
            locatedBy("//div[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']/div/div/div/div/div/div/div[contains(@class,'dx-scrollview-content')]/div/div[contains(text(),'{0}')]");

    public static final Target BOTON_BUSCAR = Target.the("boton search").
            locatedBy("//*/span[contains(text(),'SEARCH')]");

    public static final Target CAMPO_TARIFA= Target.the("campo tarifa").
            locatedBy("//*/div[contains(@class,'night-button')]/div/p");

    public static final Target VERIFICAR_RESULTADO= Target.the("resultado busqueda de hoteles").
            locatedBy("//div[@class='dx-content dx-content-content dx-transition-inner-wrapper dx-active-view']//p[@class='text-result'][contains(text(),'RESULTS')]");

    public static final Target SELECCIONAR_HOTEL=Target.the("seleccionar hoteles").
            locatedBy("//*/div[contains(@class,'current-hotels')]/div/div/div/div/span[contains(@class,'name-hotel')]");

}
