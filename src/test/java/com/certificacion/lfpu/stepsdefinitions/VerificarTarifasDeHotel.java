package com.certificacion.lfpu.stepsdefinitions;

import com.certificacion.lfpu.navegacion.NavegarEn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class VerificarTarifasDeHotel {

    @Before
    public void AsignarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario ingresa a la pagina de busqueda$")
    public void elUsuarioIngresaALaPaginaDeBusqueda() {
        theActorCalled("usuario").attemptsTo(NavegarEn.DxHotel());
    }

    @Given("^El usuario selecciona su \"([^\"]*)\"$")
    public void elUsuarioSeleccionaSu(String arg1) {
    }

    @Given("^Ingresa el \"([^\"]*)\" y el \"([^\"]*)\"$")
    public void ingresaElYEl(String arg1, String arg2) {
    }

    @Then("^Puede ingresar la de \"([^\"]*)\"$")
    public void puedeIngresarLaDe(String arg1) {
    }

    @Then("^Seleccionar el \"([^\"]*)\" y el \"([^\"]*)\"$")
    public void seleccionarElYEl(String arg1, String arg2) {
    }

    @Then("^Podra verificar las tarifas listadas de la busqueda$")
    public void podraVerificarLasTarifasListadasDeLaBusqueda() {
    }

}
