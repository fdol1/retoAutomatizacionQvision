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

    /**************************************pagina de listados de hoteles*********************************************/

    public static final Target CAMPO_TARIFA= Target.the("campo tarifa").
            locatedBy("//*/div[contains(@class,'night-button')]/div/p");

    public static final Target BOTON_RESERVAR =Target.the("boton reservar").
            locatedBy("//*/div[contains(@class,'current-hotels')]/div/div/div[contains(@class,'night-button')]/div[contains(@class,'book-it gray-button dx-button dx-button-normal dx-button-mode-contained dx-widget dx-button-has-text')]");

    public static final Target LBL_TOTAL_DIAS =Target.the("dias de reserva").
            locatedBy("//*/div[contains(@class,'site')]/p[contains(@xpath,'1')]");

    public static final Target LBL_CANTIDAD_HOTELES =Target.the("dias de reserva").
            locatedBy("//*/div[contains(@class,'search-info-hotels')]/div/div/div[contains(@class, 'result-serch')]/p[contains(@class, 'count')]");

    public static final Target BTN_SIGUIENTE =Target.the("Pasar a siguiente pagina").
            locatedBy("//*/div[contains(@class,'switch switch-right')]");



    /**************************************pagina detalle de hotel*********************************************/

    public static final Target TXT_PRECIO_POR_DIA =Target.the("precio por dia").
            locatedBy("//*/div[contains(@class,'total-pay')]/h4[contains(@class,'price')]");

    public static final Target TXT_PRECIO_TOTAL =Target.the("precio total").
            locatedBy("//*/div[contains(@class,'sum')]/h4[contains(@data-bind,'text')]");


}
